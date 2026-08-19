package org.telegram.messenger;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DownloadManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription;
import com.google.android.exoplayer2.extractor.jpeg.XmpMotionPhotoDescriptionParser;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.messenger.chromecast.ChromecastController;
import org.telegram.messenger.chromecast.ChromecastFileServer;
import org.telegram.messenger.chromecast.ChromecastMedia;
import org.telegram.messenger.chromecast.ChromecastMediaVariations;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.CastSync;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes3.dex */
public class MediaController implements AudioManager.OnAudioFocusChangeListener, NotificationCenter.NotificationCenterDelegate, SensorEventListener {
    private static final int AUDIO_FOCUSED = 2;
    public static final String AUDIO_MIME_TYPE = "audio/mp4a-latm";
    private static final int AUDIO_NO_FOCUS_CAN_DUCK = 1;
    private static final int AUDIO_NO_FOCUS_NO_DUCK = 0;
    private static volatile MediaController Instance = null;
    public static final int VIDEO_BITRATE_1080 = 6800000;
    public static final int VIDEO_BITRATE_360 = 750000;
    public static final int VIDEO_BITRATE_480 = 1000000;
    public static final int VIDEO_BITRATE_720 = 2621440;
    public static final String VIDEO_MIME_TYPE = "video/avc";
    private static final float VOLUME_DUCK = 0.2f;
    private static final float VOLUME_NORMAL = 1.0f;
    public static AlbumEntry allMediaAlbumEntry;
    public static ArrayList<AlbumEntry> allMediaAlbums;
    public static ArrayList<AlbumEntry> allPhotoAlbums;
    public static AlbumEntry allPhotosAlbumEntry;
    public static AlbumEntry allVideosAlbumEntry;
    private static Runnable broadcastPhotosRunnable;
    private static final ConcurrentHashMap<String, Integer> cachedEncoderBitrates;
    public static boolean forceBroadcastNewPhotos;
    private static final String[] projectionPhotos;
    private static final String[] projectionVideo;
    private static Runnable refreshGalleryRunnable;
    private static long volumeBarLastTimeShown;
    private Sensor accelerometerSensor;
    private boolean accelerometerVertical;
    private boolean allowStartRecord;
    private AudioInfo audioInfo;
    private AudioRecord audioRecorder;
    private boolean audioRecorderPaused;
    private float audioVolume;
    private ValueAnimator audioVolumeAnimator;
    private Activity baseActivity;
    private boolean callInProgress;
    private int countLess;
    private AspectRatioFrameLayout currentAspectRatioFrameLayout;
    private float currentAspectRatioFrameLayoutRatio;
    private boolean currentAspectRatioFrameLayoutReady;
    private int currentAspectRatioFrameLayoutRotation;
    private VideoConvertMessage currentForegroundConvertingVideo;
    private int currentPlaylistNum;
    public MessagesController.SavedMusicList currentSavedMusicList;
    private TextureView currentTextureView;
    private FrameLayout currentTextureViewContainer;
    private boolean downloadingCurrentMessage;
    private ExternalObserver externalObserver;
    private View feedbackView;
    private ByteBuffer fileBuffer;
    private DispatchQueue fileEncodingQueue;
    private BaseFragment flagSecureFragment;
    private boolean forceLoopCurrentPlaylist;
    private MessageObject goingToShowMessageObject;
    private Sensor gravitySensor;
    private int hasAudioFocus;
    private boolean hasRecordAudioFocus;
    private boolean ignoreOnPause;
    private boolean ignorePlayerUpdate;
    private boolean ignoreProximity;
    private boolean inputFieldHasText;
    private InternalObserver internalObserver;
    private boolean isDrawingWasReady;
    private boolean isStreamingCurrentAudio;
    private long lastAccelerometerDetected;
    private int lastChatAccount;
    private long lastChatEnterTime;
    private long lastChatLeaveTime;
    private ArrayList<Long> lastChatVisibleMessages;
    private long lastMediaCheckTime;
    private int lastMessageId;
    private long lastSaveTime;
    private TLRPC.EncryptedChat lastSecretChat;
    private TLRPC.User lastUser;
    private Sensor linearSensor;
    private boolean loadingPlaylist;
    private boolean manualRecording;
    private String[] mediaProjections;
    private PipRoundVideoView pipRoundVideoView;
    private int pipSwitchingState;
    private boolean playMusicAgain;
    private int playerNum;
    private boolean playerWasReady;
    private MessageObject playingMessageObject;
    private int playlistClassGuid;
    private PlaylistGlobalSearchParams playlistGlobalSearchParams;
    private long playlistMergeDialogId;
    private float previousAccValue;
    private boolean proximityHasDifferentValues;
    private Sensor proximitySensor;
    private boolean proximityTouched;
    private PowerManager.WakeLock proximityWakeLock;
    private ChatActivity raiseChat;
    private boolean raiseToEarRecord;
    private int raisedToBack;
    private int raisedToTop;
    private int raisedToTopSign;
    private long recordDialogId;
    private long recordMonoForumPeerId;
    private MessageSuggestionParams recordMonoForumSuggestionParams;
    private DispatchQueue recordQueue;
    private MessageObject recordReplyingMsg;
    private TL_stories.StoryItem recordReplyingStory;
    private MessageObject recordReplyingTopMsg;
    private SendMessageChatArguments recordSendMessageChatArguments;
    private Runnable recordStartRunnable;
    private long recordStartTime;
    public long recordTimeCount;
    private long recordTopicId;
    public TLRPC.TL_document recordingAudio;
    private File recordingAudioFile;
    private int recordingCurrentAccount;
    private File recordingPrevAudioFile;
    private MusicListenReporter reporter;
    private boolean resumeAudioOnFocusGain;
    public long samplesCount;
    private SavedMusicPlaylistState savedMusicPlaylistState;
    private float seekToProgressPending;
    private int sendAfterDone;
    private boolean sendAfterDoneNotify;
    private boolean sendAfterDoneOnce;
    private long sendAfterDonePayStars;
    private int sendAfterDoneScheduleDate;
    private SensorManager sensorManager;
    private boolean sensorsStarted;
    private String shouldSavePositionForCurrentAudio;
    private int startObserverToken;
    private StopMediaObserverRunnable stopMediaObserverRunnable;
    private long timeSinceRaise;
    private boolean useFrontSpeaker;
    private VideoPlayer videoPlayer;
    private ArrayList<MessageObject> voiceMessagesPlaylist;
    private SparseArray<MessageObject> voiceMessagesPlaylistMap;
    private boolean voiceMessagesPlaylistUnread;
    public int writtenFrame;
    AudioManager.OnAudioFocusChangeListener audioRecordFocusChangedListener = new AudioManager.OnAudioFocusChangeListener() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda47
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            MediaController.$r8$lambda$tc6LykL6--OubR-hwPO6e0fp3o4(MediaController.this, i);
        }
    };
    private final Object videoConvertSync = new Object();
    private long lastTimestamp = 0;
    private float lastProximityValue = -100.0f;
    private float[] gravity = new float[3];
    private float[] gravityFast = new float[3];
    private float[] linearAcceleration = new float[3];
    private int audioFocus = 0;
    private ArrayList<VideoConvertMessage> foregroundConvertingMessages = new ArrayList<>();
    private ArrayList<VideoConvertMessage> videoConvertQueue = new ArrayList<>();
    private final Object videoQueueSync = new Object();
    private HashMap<String, MessageObject> generatingWaveform = new HashMap<>();
    public boolean isSilent = false;
    private boolean isPaused = false;
    private boolean wasPlayingAudioBeforePause = false;
    private VideoPlayer audioPlayer = null;
    private VideoPlayer emojiSoundPlayer = null;
    private int emojiSoundPlayerNum = 0;
    private float currentPlaybackSpeed = VOLUME_NORMAL;
    private float currentMusicPlaybackSpeed = VOLUME_NORMAL;
    private float fastPlaybackSpeed = VOLUME_NORMAL;
    private float fastMusicPlaybackSpeed = VOLUME_NORMAL;
    private long lastProgress = 0;
    private java.util.Timer progressTimer = null;
    private final Object progressTimerSync = new Object();
    private ArrayList<MessageObject> playlist = new ArrayList<>();
    private HashMap<Integer, MessageObject> playlistMap = new HashMap<>();
    private ArrayList<MessageObject> shuffledPlaylist = new ArrayList<>();
    private boolean[] playlistEndReached = {false, false};
    private int[] playlistMaxId = {ConnectionsManager.DEFAULT_DATACENTER_ID, ConnectionsManager.DEFAULT_DATACENTER_ID};
    private Runnable setLoadingRunnable = new Runnable() { // from class: org.telegram.messenger.MediaController.1
        @Override // java.lang.Runnable
        public void run() {
            if (MediaController.this.playingMessageObject == null) {
                return;
            }
            FileLoader.getInstance(MediaController.this.playingMessageObject.currentAccount).setLoadingVideo(MediaController.this.playingMessageObject.getDocument(), true, false);
        }
    };
    private int recordingGuid = -1;
    public short[] recordSamples = new short[1024];
    private final Object sync = new Object();
    private ArrayList<ByteBuffer> recordBuffers = new ArrayList<>();
    public int recordBufferSize = 1280;
    public int sampleRate = 48000;
    private Runnable recordRunnable = new 2();
    private final ValueAnimator.AnimatorUpdateListener audioVolumeUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.messenger.MediaController.3
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            MediaController.this.audioVolume = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MediaController.this.setPlayerVolume();
        }
    };

    public static class AudioEntry {
        public String author;
        public int duration;
        public String genre;
        public long id;
        public MessageObject messageObject;
        public String path;
        public String title;
    }

    public interface VideoConvertorListener {
        boolean checkConversionCanceled();

        void didWriteData(long j, float f);
    }

    public static native boolean cropOpusFile(String str, String str2, long j, long j2);

    private static int getVideoBitrateWithFactor(float f) {
        return (int) (f * 2000.0f * 1000.0f * 1.13f);
    }

    public static native byte[] getWaveform(String str);

    public static native int isOpusFile(String str);

    private static boolean isRecognizedFormat(int i) {
        if (i == 39 || i == 2130706688) {
            return true;
        }
        switch (i) {
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
    }

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    private native int startRecord(String str, int i);

    private native void stopRecord();

    /* JADX INFO: Access modifiers changed from: private */
    public native int writeFrame(ByteBuffer byteBuffer, int i);

    public native byte[] getWaveform2(short[] sArr, int i);

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public boolean isBuffering() {
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer != null) {
            return videoPlayer.isBuffering();
        }
        return false;
    }

    public VideoConvertMessage getCurrentForegroundConverMessage() {
        return this.currentForegroundConvertingVideo;
    }

    private static class AudioBuffer {
        ByteBuffer buffer;
        byte[] bufferBytes;
        int finished;
        long pcmOffset;
        int size;

        public AudioBuffer(int i) {
            this.buffer = ByteBuffer.allocateDirect(i);
            this.bufferBytes = new byte[i];
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        projectionPhotos = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i > 28 ? "date_modified" : "datetaken", "orientation", "width", "height", "_size"};
        projectionVideo = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i > 28 ? "date_modified" : "datetaken", "duration", "width", "height", "_size"};
        cachedEncoderBitrates = new ConcurrentHashMap<>();
        allMediaAlbums = new ArrayList<>();
        allPhotoAlbums = new ArrayList<>();
    }

    public static class AlbumEntry {
        public int bucketId;
        public String bucketName;
        public PhotoEntry coverPhoto;
        public ArrayList<PhotoEntry> photos = new ArrayList<>();
        public SparseArray<PhotoEntry> photosByIds = new SparseArray<>();
        public boolean videoOnly;

        public AlbumEntry(int i, String str, PhotoEntry photoEntry) {
            this.bucketId = i;
            this.bucketName = str;
            this.coverPhoto = photoEntry;
        }

        public void addPhoto(PhotoEntry photoEntry) {
            this.photos.add(photoEntry);
            this.photosByIds.put(photoEntry.imageId, photoEntry);
        }
    }

    public static class SavedFilterState {
        public float blurAngle;
        public float blurExcludeBlurSize;
        public PointF blurExcludePoint;
        public float blurExcludeSize;
        public int blurType;
        public float contrastValue;
        public PhotoFilterView.CurvesToolValue curvesToolValue = new PhotoFilterView.CurvesToolValue();
        public float enhanceValue;
        public float exposureValue;
        public float fadeValue;
        public float grainValue;
        public float highlightsValue;
        public float saturationValue;
        public float shadowsValue;
        public float sharpenValue;
        public float softenSkinValue;
        public int tintHighlightsColor;
        public int tintShadowsColor;
        public float vignetteValue;
        public float warmthValue;

        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeFloat(this.enhanceValue);
            outputSerializedData.writeFloat(this.softenSkinValue);
            outputSerializedData.writeFloat(this.exposureValue);
            outputSerializedData.writeFloat(this.contrastValue);
            outputSerializedData.writeFloat(this.warmthValue);
            outputSerializedData.writeFloat(this.saturationValue);
            outputSerializedData.writeFloat(this.fadeValue);
            outputSerializedData.writeInt32(this.tintShadowsColor);
            outputSerializedData.writeInt32(this.tintHighlightsColor);
            outputSerializedData.writeFloat(this.highlightsValue);
            outputSerializedData.writeFloat(this.shadowsValue);
            outputSerializedData.writeFloat(this.vignetteValue);
            outputSerializedData.writeFloat(this.grainValue);
            outputSerializedData.writeInt32(this.blurType);
            outputSerializedData.writeFloat(this.sharpenValue);
            this.curvesToolValue.serializeToStream(outputSerializedData);
            outputSerializedData.writeFloat(this.blurExcludeSize);
            if (this.blurExcludePoint == null) {
                outputSerializedData.writeInt32(TLRPC.TL_null.constructor);
            } else {
                outputSerializedData.writeInt32(-559038737);
                outputSerializedData.writeFloat(this.blurExcludePoint.x);
                outputSerializedData.writeFloat(this.blurExcludePoint.y);
            }
            outputSerializedData.writeFloat(this.blurExcludeBlurSize);
            outputSerializedData.writeFloat(this.blurAngle);
        }

        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.enhanceValue = inputSerializedData.readFloat(z);
            this.softenSkinValue = inputSerializedData.readFloat(z);
            this.exposureValue = inputSerializedData.readFloat(z);
            this.contrastValue = inputSerializedData.readFloat(z);
            this.warmthValue = inputSerializedData.readFloat(z);
            this.saturationValue = inputSerializedData.readFloat(z);
            this.fadeValue = inputSerializedData.readFloat(z);
            this.tintShadowsColor = inputSerializedData.readInt32(z);
            this.tintHighlightsColor = inputSerializedData.readInt32(z);
            this.highlightsValue = inputSerializedData.readFloat(z);
            this.shadowsValue = inputSerializedData.readFloat(z);
            this.vignetteValue = inputSerializedData.readFloat(z);
            this.grainValue = inputSerializedData.readFloat(z);
            this.blurType = inputSerializedData.readInt32(z);
            this.sharpenValue = inputSerializedData.readFloat(z);
            this.curvesToolValue.readParams(inputSerializedData, z);
            this.blurExcludeSize = inputSerializedData.readFloat(z);
            if (inputSerializedData.readInt32(z) == 1450380236) {
                this.blurExcludePoint = null;
            } else {
                if (this.blurExcludePoint == null) {
                    this.blurExcludePoint = new PointF();
                }
                this.blurExcludePoint.x = inputSerializedData.readFloat(z);
                this.blurExcludePoint.y = inputSerializedData.readFloat(z);
            }
            this.blurExcludeBlurSize = inputSerializedData.readFloat(z);
            this.blurAngle = inputSerializedData.readFloat(z);
        }

        public boolean isEmpty() {
            return Math.abs(this.enhanceValue) < 0.1f && Math.abs(this.softenSkinValue) < 0.1f && Math.abs(this.exposureValue) < 0.1f && Math.abs(this.contrastValue) < 0.1f && Math.abs(this.warmthValue) < 0.1f && Math.abs(this.saturationValue) < 0.1f && Math.abs(this.fadeValue) < 0.1f && this.tintShadowsColor == 0 && this.tintHighlightsColor == 0 && Math.abs(this.highlightsValue) < 0.1f && Math.abs(this.shadowsValue) < 0.1f && Math.abs(this.vignetteValue) < 0.1f && Math.abs(this.grainValue) < 0.1f && this.blurType == 0 && Math.abs(this.sharpenValue) < 0.1f;
        }
    }

    public static class CropState extends TLObject {
        public static final int constructor = 1151577037;
        public float cropPx;
        public float cropPy;
        public float cropRotate;
        public boolean freeform;
        public int height;
        public boolean initied;
        public float lockedAspectRatio;
        public Matrix matrix;
        public boolean mirrored;
        public int orientation;
        public float scale;
        public float stateScale;
        public int transformHeight;
        public int transformRotation;
        public int transformWidth;
        public Matrix useMatrix;
        public int width;
        public float cropScale = MediaController.VOLUME_NORMAL;
        public float cropPw = MediaController.VOLUME_NORMAL;
        public float cropPh = MediaController.VOLUME_NORMAL;

        public CropState clone() {
            CropState cropState = new CropState();
            cropState.cropPx = this.cropPx;
            cropState.cropPy = this.cropPy;
            cropState.cropScale = this.cropScale;
            cropState.cropRotate = this.cropRotate;
            cropState.cropPw = this.cropPw;
            cropState.cropPh = this.cropPh;
            cropState.transformWidth = this.transformWidth;
            cropState.transformHeight = this.transformHeight;
            cropState.transformRotation = this.transformRotation;
            cropState.mirrored = this.mirrored;
            cropState.stateScale = this.stateScale;
            cropState.scale = this.scale;
            cropState.matrix = this.matrix;
            cropState.width = this.width;
            cropState.height = this.height;
            cropState.freeform = this.freeform;
            cropState.lockedAspectRatio = this.lockedAspectRatio;
            cropState.orientation = this.orientation;
            cropState.initied = this.initied;
            cropState.useMatrix = this.useMatrix;
            return cropState;
        }

        public boolean isEmpty() {
            Matrix matrix = this.matrix;
            if (matrix != null && !matrix.isIdentity()) {
                return false;
            }
            Matrix matrix2 = this.useMatrix;
            return (matrix2 == null || matrix2.isIdentity()) && this.cropPw == MediaController.VOLUME_NORMAL && this.cropPh == MediaController.VOLUME_NORMAL && this.cropScale == MediaController.VOLUME_NORMAL && this.cropRotate == 0.0f && this.transformWidth == 0 && this.transformHeight == 0 && this.transformRotation == 0 && !this.mirrored && this.stateScale == 0.0f && this.scale == 0.0f && this.width == 0 && this.height == 0 && !this.freeform && this.lockedAspectRatio == 0.0f;
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.cropPx = inputSerializedData.readFloat(z);
            this.cropPy = inputSerializedData.readFloat(z);
            this.cropScale = inputSerializedData.readFloat(z);
            this.cropRotate = inputSerializedData.readFloat(z);
            this.cropPw = inputSerializedData.readFloat(z);
            this.cropPh = inputSerializedData.readFloat(z);
            this.transformWidth = inputSerializedData.readInt32(z);
            this.transformHeight = inputSerializedData.readInt32(z);
            this.transformRotation = inputSerializedData.readInt32(z);
            this.mirrored = inputSerializedData.readBool(z);
            this.stateScale = inputSerializedData.readFloat(z);
            this.scale = inputSerializedData.readFloat(z);
            float[] fArr = new float[9];
            for (int i = 0; i < 9; i++) {
                fArr[i] = inputSerializedData.readFloat(z);
            }
            Matrix matrix = new Matrix();
            this.matrix = matrix;
            matrix.setValues(fArr);
            this.width = inputSerializedData.readInt32(z);
            this.height = inputSerializedData.readInt32(z);
            this.freeform = inputSerializedData.readBool(z);
            this.lockedAspectRatio = inputSerializedData.readFloat(z);
            if (inputSerializedData.readInt32(z) == 178403937) {
                for (int i2 = 0; i2 < 9; i2++) {
                    fArr[i2] = inputSerializedData.readFloat(z);
                }
                Matrix matrix2 = new Matrix();
                this.useMatrix = matrix2;
                matrix2.setValues(fArr);
            }
            this.initied = inputSerializedData.readBool(z);
            this.orientation = inputSerializedData.readInt32(z);
        }

        @Override // org.telegram.tgnet.TLObject
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeFloat(this.cropPx);
            outputSerializedData.writeFloat(this.cropPy);
            outputSerializedData.writeFloat(this.cropScale);
            outputSerializedData.writeFloat(this.cropRotate);
            outputSerializedData.writeFloat(this.cropPw);
            outputSerializedData.writeFloat(this.cropPh);
            outputSerializedData.writeInt32(this.transformWidth);
            outputSerializedData.writeInt32(this.transformHeight);
            outputSerializedData.writeInt32(this.transformRotation);
            outputSerializedData.writeBool(this.mirrored);
            outputSerializedData.writeFloat(this.stateScale);
            outputSerializedData.writeFloat(this.scale);
            float[] fArr = new float[9];
            Matrix matrix = this.matrix;
            if (matrix != null) {
                matrix.getValues(fArr);
            } else {
                for (int i = 0; i < 9; i++) {
                    fArr[i] = 0.0f;
                }
            }
            for (int i2 = 0; i2 < 9; i2++) {
                outputSerializedData.writeFloat(fArr[i2]);
            }
            outputSerializedData.writeInt32(this.width);
            outputSerializedData.writeInt32(this.height);
            outputSerializedData.writeBool(this.freeform);
            outputSerializedData.writeFloat(this.lockedAspectRatio);
            if (this.useMatrix == null) {
                outputSerializedData.writeInt32(TLRPC.TL_null.constructor);
            } else {
                outputSerializedData.writeInt32(178403937);
                this.useMatrix.getValues(fArr);
                for (int i3 = 0; i3 < 9; i3++) {
                    outputSerializedData.writeFloat(fArr[i3]);
                }
            }
            outputSerializedData.writeBool(this.initied);
            outputSerializedData.writeInt32(this.orientation);
        }
    }

    public static class MediaEditState {
        public long averageDuration;
        public CharSequence caption;
        public String coverPath;
        public TLRPC.Photo coverPhoto;
        public Object coverPhotoParentObject;
        public long coverSavedPosition;
        public CropState cropState;
        public ArrayList<VideoEditedInfo.MediaEntity> croppedMediaEntities;
        public String croppedPaintPath;
        public VideoEditedInfo editedInfo;
        public long effectId;
        public ArrayList<TLRPC.MessageEntity> entities;
        public String filterPath;
        public String fullPaintPath;
        public Boolean highQuality;
        public String imagePath;
        public boolean isCropped;
        public boolean isFiltered;
        public boolean isPainted;
        public boolean isVideo;
        public long livePhotoVideoOffset;
        public ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
        public String paintPath;
        public SavedFilterState savedFilterState;
        public ArrayList<TLRPC.InputDocument> stickers;
        public String thumbPath;
        public int ttl;

        public String getPath() {
            return null;
        }

        public boolean isLivePhoto() {
            return (this instanceof PhotoEntry) && ((PhotoEntry) this).isLivePhoto();
        }

        public boolean isHighQuality() {
            Boolean bool = this.highQuality;
            if (bool == null) {
                return SharedConfig.photoHighQualityDefault;
            }
            return bool.booleanValue();
        }

        public void reset() {
            this.caption = null;
            this.coverPath = null;
            this.coverPhoto = null;
            this.coverPhotoParentObject = null;
            this.thumbPath = null;
            this.filterPath = null;
            this.imagePath = null;
            this.paintPath = null;
            this.fullPaintPath = null;
            this.croppedPaintPath = null;
            this.isFiltered = false;
            this.isPainted = false;
            this.isCropped = false;
            this.ttl = 0;
            this.mediaEntities = null;
            this.editedInfo = null;
            this.entities = null;
            this.savedFilterState = null;
            this.stickers = null;
            this.cropState = null;
            this.highQuality = null;
        }

        public void copyFrom(MediaEditState mediaEditState) {
            this.caption = mediaEditState.caption;
            this.thumbPath = mediaEditState.thumbPath;
            this.imagePath = mediaEditState.imagePath;
            this.filterPath = mediaEditState.filterPath;
            this.paintPath = mediaEditState.paintPath;
            this.croppedPaintPath = mediaEditState.croppedPaintPath;
            this.fullPaintPath = mediaEditState.fullPaintPath;
            this.entities = mediaEditState.entities;
            this.savedFilterState = mediaEditState.savedFilterState;
            this.mediaEntities = mediaEditState.mediaEntities;
            this.croppedMediaEntities = mediaEditState.croppedMediaEntities;
            this.stickers = mediaEditState.stickers;
            this.editedInfo = mediaEditState.editedInfo;
            this.averageDuration = mediaEditState.averageDuration;
            this.isFiltered = mediaEditState.isFiltered;
            this.isPainted = mediaEditState.isPainted;
            this.isCropped = mediaEditState.isCropped;
            this.livePhotoVideoOffset = mediaEditState.livePhotoVideoOffset;
            this.ttl = mediaEditState.ttl;
            this.cropState = mediaEditState.cropState;
            this.coverPath = mediaEditState.coverPath;
            this.highQuality = mediaEditState.highQuality;
        }
    }

    public static class PhotoEntry extends MediaEditState {
        public int bucketId;
        public boolean canDeleteAfter;
        public long dateTaken;
        public Boolean discardLivePhoto;
        public int duration;
        public String emoji;
        public TLRPC.VideoSize emojiMarkup;
        public int gradientBottomColor;
        public int gradientTopColor;
        public boolean hasSpoiler;
        public int height;
        public int imageId;
        public int invert;
        public boolean isAttachSpoilerRevealed;
        public boolean isChatPreviewSpoilerRevealed;
        public boolean isLivePhoto;
        public boolean isMuted;
        public long livePhotoTimestampUs;
        public int orientation;
        private boolean parsedXmp;
        public String path;
        public long size;
        public long starsAmount;
        public BitmapDrawable thumb;
        public int videoOrientation = -1;
        public int width;

        public boolean isUnalivePhoto() {
            Boolean bool = this.discardLivePhoto;
            if (bool == null) {
                return !SharedConfig.photoLiveDefault;
            }
            return bool.booleanValue();
        }

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public boolean isLivePhoto() {
            MotionPhotoDescription parse;
            if (this.isVideo || this.parsedXmp) {
                return this.isLivePhoto;
            }
            this.parsedXmp = true;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                String attribute = new ExifInterface(new File(this.path)).getAttribute("Xmp");
                if (attribute != null && (parse = XmpMotionPhotoDescriptionParser.parse(attribute)) != null) {
                    MotionPhotoDescription.ContainerItem containerItem = null;
                    MotionPhotoDescription.ContainerItem containerItem2 = null;
                    for (int i = 0; i < parse.items.size(); i++) {
                        MotionPhotoDescription.ContainerItem containerItem3 = (MotionPhotoDescription.ContainerItem) parse.items.get(i);
                        if ("Primary".equalsIgnoreCase(containerItem3.semantic)) {
                            containerItem = containerItem3;
                        } else if ("MotionPhoto".equalsIgnoreCase(containerItem3.semantic)) {
                            containerItem2 = containerItem3;
                        }
                    }
                    if (containerItem != null && containerItem2 != null && containerItem2.length > 0) {
                        try {
                            long length = new File(this.path).length() - containerItem2.length;
                            this.isVideo = true;
                            this.isLivePhoto = true;
                            this.livePhotoVideoOffset = length;
                            this.livePhotoTimestampUs = parse.photoPresentationTimestampUs;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
                this.isLivePhoto = false;
            }
            FileLog.d("parsed isLivePhoto()=" + this.isLivePhoto + " in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
            return this.isLivePhoto;
        }

        public PhotoEntry(int i, int i2, long j, String str, int i3, boolean z, int i4, int i5, long j2) {
            this.bucketId = i;
            this.imageId = i2;
            this.dateTaken = j;
            this.path = str;
            this.width = i4;
            this.height = i5;
            this.size = j2;
            if (z) {
                this.duration = i3;
            } else {
                this.orientation = i3;
            }
            this.isVideo = z;
        }

        public PhotoEntry(int i, int i2, long j, String str, int i3, int i4, boolean z, int i5, int i6, long j2) {
            this.bucketId = i;
            this.imageId = i2;
            this.dateTaken = j;
            this.path = str;
            this.width = i5;
            this.height = i6;
            this.size = j2;
            this.duration = i4;
            this.orientation = i3;
            this.isVideo = z;
        }

        public PhotoEntry setOrientation(Pair<Integer, Integer> pair) {
            this.orientation = ((Integer) pair.first).intValue();
            this.invert = ((Integer) pair.second).intValue();
            return this;
        }

        public PhotoEntry setOrientation(int i, int i2) {
            this.orientation = i;
            this.invert = i2;
            return this;
        }

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public void copyFrom(MediaEditState mediaEditState) {
            super.copyFrom(mediaEditState);
            boolean z = mediaEditState instanceof PhotoEntry;
            boolean z2 = false;
            this.hasSpoiler = z && ((PhotoEntry) mediaEditState).hasSpoiler;
            this.starsAmount = z ? ((PhotoEntry) mediaEditState).starsAmount : 0L;
            this.parsedXmp = z && ((PhotoEntry) mediaEditState).parsedXmp;
            if (z && ((PhotoEntry) mediaEditState).isLivePhoto) {
                z2 = true;
            }
            this.isLivePhoto = z2;
            this.livePhotoVideoOffset = z ? ((PhotoEntry) mediaEditState).livePhotoVideoOffset : 0L;
            this.livePhotoTimestampUs = z ? ((PhotoEntry) mediaEditState).livePhotoTimestampUs : 0L;
        }

        public PhotoEntry clone() {
            PhotoEntry photoEntry = new PhotoEntry(this.bucketId, this.imageId, this.dateTaken, this.path, this.orientation, this.duration, this.isVideo, this.width, this.height, this.size);
            photoEntry.invert = this.invert;
            photoEntry.isMuted = this.isMuted;
            photoEntry.canDeleteAfter = this.canDeleteAfter;
            photoEntry.hasSpoiler = this.hasSpoiler;
            photoEntry.starsAmount = this.starsAmount;
            photoEntry.isChatPreviewSpoilerRevealed = this.isChatPreviewSpoilerRevealed;
            photoEntry.isAttachSpoilerRevealed = this.isAttachSpoilerRevealed;
            photoEntry.emojiMarkup = this.emojiMarkup;
            photoEntry.gradientTopColor = this.gradientTopColor;
            photoEntry.gradientBottomColor = this.gradientBottomColor;
            photoEntry.discardLivePhoto = this.discardLivePhoto;
            photoEntry.copyFrom(this);
            return photoEntry;
        }

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public String getPath() {
            return this.path;
        }

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public void reset() {
            if (this.isVideo && this.filterPath != null) {
                new File(this.filterPath).delete();
                this.filterPath = null;
            }
            this.hasSpoiler = false;
            this.starsAmount = 0L;
            super.reset();
        }

        public void deleteAll() {
            if (this.path != null) {
                try {
                    new File(this.path).delete();
                } catch (Exception unused) {
                }
            }
            if (this.fullPaintPath != null) {
                try {
                    new File(this.fullPaintPath).delete();
                } catch (Exception unused2) {
                }
            }
            if (this.paintPath != null) {
                try {
                    new File(this.paintPath).delete();
                } catch (Exception unused3) {
                }
            }
            if (this.imagePath != null) {
                try {
                    new File(this.imagePath).delete();
                } catch (Exception unused4) {
                }
            }
            if (this.filterPath != null) {
                try {
                    new File(this.filterPath).delete();
                } catch (Exception unused5) {
                }
            }
            if (this.croppedPaintPath != null) {
                try {
                    new File(this.croppedPaintPath).delete();
                } catch (Exception unused6) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void rebuildPhoto(boolean z) {
            Bitmap bitmap;
            Bitmap createBitmap;
            String str;
            Bitmap decodeFile;
            String str2 = this.filterPath;
            if (str2 == null) {
                str2 = this.path;
            }
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str2);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            Bitmap scaledBitmap = StoryEntry.getScaledBitmap(new StoryEntry.DecodeBitmap() { // from class: org.telegram.messenger.MediaController$PhotoEntry$$ExternalSyntheticLambda0
                @Override // org.telegram.ui.Stories.recorder.StoryEntry.DecodeBitmap
                public final Bitmap decode(BitmapFactory.Options options) {
                    return MediaController.PhotoEntry.$r8$lambda$fB__XH-z1WJDu6VlbVsX7GHJr2Y(MediaController.PhotoEntry.this, options);
                }
            }, AndroidUtilities.getPhotoSize(z), AndroidUtilities.getPhotoSize(z), false, true);
            if (this.imagePath != null) {
                new File(this.imagePath).delete();
                this.imagePath = null;
            }
            CropState cropState = this.cropState;
            if (cropState != null) {
                createBitmap = PhotoViewer.createCroppedBitmap(scaledBitmap, cropState, new int[]{((Integer) imageOrientation.first).intValue(), ((Integer) imageOrientation.second).intValue()}, true);
                scaledBitmap.recycle();
            } else if (((Integer) imageOrientation.first).intValue() != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(((Integer) imageOrientation.first).intValue());
                if (((Integer) imageOrientation.second).intValue() == 1) {
                    matrix.postScale(-1.0f, MediaController.VOLUME_NORMAL);
                } else if (((Integer) imageOrientation.second).intValue() == 2) {
                    matrix.postScale(MediaController.VOLUME_NORMAL, -1.0f);
                }
                createBitmap = Bitmaps.createBitmap(scaledBitmap, 0, 0, scaledBitmap.getWidth(), scaledBitmap.getHeight(), matrix, true);
                scaledBitmap.recycle();
            } else {
                bitmap = scaledBitmap;
                str = this.fullPaintPath;
                if (str != null) {
                    this.imagePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap, compressFormat, AndroidUtilities.getPhotoSize(z), AndroidUtilities.getPhotoSize(z), z ? 99 : 87, false, 101, 101), true).toString();
                } else {
                    if (this.cropState != null) {
                        Bitmap decodeFile2 = BitmapFactory.decodeFile(str);
                        decodeFile = PhotoViewer.createCroppedBitmap(decodeFile2, this.cropState, null, false);
                        decodeFile2.recycle();
                    } else {
                        decodeFile = BitmapFactory.decodeFile(str);
                    }
                    try {
                        Paint paint = new Paint(3);
                        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap2);
                        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                        canvas.scale(bitmap.getWidth() / decodeFile.getWidth(), bitmap.getHeight() / decodeFile.getHeight());
                        canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                        this.imagePath = PhotoViewer.getTempFileAbsolutePath();
                        createBitmap2.compress(compressFormat, z ? 99 : 87, new FileOutputStream(this.imagePath));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (decodeFile != null) {
                        decodeFile.recycle();
                    }
                }
                if (bitmap == null) {
                    bitmap.recycle();
                    return;
                }
                return;
            }
            bitmap = createBitmap;
            str = this.fullPaintPath;
            if (str != null) {
            }
            if (bitmap == null) {
            }
        }

        public static /* synthetic */ Bitmap $r8$lambda$fB__XH-z1WJDu6VlbVsX7GHJr2Y(PhotoEntry photoEntry, BitmapFactory.Options options) {
            String str = photoEntry.filterPath;
            if (str == null) {
                str = photoEntry.path;
            }
            return BitmapFactory.decodeFile(str, options);
        }
    }

    public static class SearchImage extends MediaEditState {
        public CharSequence caption;
        public int date;
        public TLRPC.Document document;
        public int height;
        public String id;
        public String imageUrl;
        public TLRPC.BotInlineResult inlineResult;
        public HashMap<String, String> params;
        public TLRPC.Photo photo;
        public TLRPC.PhotoSize photoSize;
        public int size;
        public TLRPC.PhotoSize thumbPhotoSize;
        public String thumbUrl;
        public int type;
        public int width;

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public String getPath() {
            if (this.photoSize != null) {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.photoSize, true).getAbsolutePath();
            }
            if (this.document != null) {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.document, true).getAbsolutePath();
            }
            return ImageLoader.getHttpFilePath(this.imageUrl, "jpg").getAbsolutePath();
        }

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public void reset() {
            super.reset();
        }

        public String getAttachName() {
            TLRPC.PhotoSize photoSize = this.photoSize;
            if (photoSize != null) {
                return FileLoader.getAttachFileName(photoSize);
            }
            TLRPC.Document document = this.document;
            if (document != null) {
                return FileLoader.getAttachFileName(document);
            }
            return Utilities.MD5(this.imageUrl) + "." + ImageLoader.getHttpUrlExtension(this.imageUrl, "jpg");
        }

        public String getPathToAttach() {
            if (this.photoSize != null) {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.photoSize, true).getAbsolutePath();
            }
            if (this.document != null) {
                return FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.document, true).getAbsolutePath();
            }
            return this.imageUrl;
        }

        public SearchImage clone() {
            SearchImage searchImage = new SearchImage();
            searchImage.id = this.id;
            searchImage.imageUrl = this.imageUrl;
            searchImage.thumbUrl = this.thumbUrl;
            searchImage.width = this.width;
            searchImage.height = this.height;
            searchImage.size = this.size;
            searchImage.type = this.type;
            searchImage.date = this.date;
            searchImage.caption = this.caption;
            searchImage.document = this.document;
            searchImage.photo = this.photo;
            searchImage.photoSize = this.photoSize;
            searchImage.thumbPhotoSize = this.thumbPhotoSize;
            searchImage.inlineResult = this.inlineResult;
            searchImage.params = this.params;
            return searchImage;
        }
    }

    public static /* synthetic */ void $r8$lambda$tc6LykL6--OubR-hwPO6e0fp3o4(MediaController mediaController, int i) {
        if (i != 1) {
            mediaController.hasRecordAudioFocus = false;
        } else {
            mediaController.getClass();
        }
    }

    public static class VideoConvertMessage {
        public int currentAccount;
        public boolean foreground;
        public boolean foregroundConversion;
        public MessageObject messageObject;
        public VideoEditedInfo videoEditedInfo;

        public VideoConvertMessage(MessageObject messageObject, VideoEditedInfo videoEditedInfo, boolean z, boolean z2) {
            this.messageObject = messageObject;
            this.currentAccount = messageObject.currentAccount;
            this.videoEditedInfo = videoEditedInfo;
            this.foreground = z;
            this.foregroundConversion = z2;
        }
    }

    class 2 implements Runnable {
        2() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ByteBuffer allocateDirect;
            if (MediaController.this.audioRecorder != null) {
                if (!MediaController.this.recordBuffers.isEmpty()) {
                    allocateDirect = (ByteBuffer) MediaController.this.recordBuffers.get(0);
                    MediaController.this.recordBuffers.remove(0);
                } else {
                    allocateDirect = ByteBuffer.allocateDirect(MediaController.this.recordBufferSize);
                    allocateDirect.order(ByteOrder.nativeOrder());
                }
                final ByteBuffer byteBuffer = allocateDirect;
                byteBuffer.rewind();
                int read = MediaController.this.audioRecorder.read(byteBuffer, byteBuffer.capacity());
                if (read <= 0) {
                    MediaController.this.recordBuffers.add(byteBuffer);
                    if (MediaController.this.sendAfterDone == 3 || MediaController.this.sendAfterDone == 4) {
                        return;
                    }
                    MediaController mediaController = MediaController.this;
                    mediaController.stopRecordingInternal(mediaController.sendAfterDone, MediaController.this.sendAfterDoneNotify, MediaController.this.sendAfterDoneScheduleDate, MediaController.this.sendAfterDoneOnce, MediaController.this.sendAfterDonePayStars);
                    return;
                }
                byteBuffer.limit(read);
                double d = 0.0d;
                try {
                    MediaController mediaController2 = MediaController.this;
                    long j = mediaController2.samplesCount;
                    long j2 = (read / 2) + j;
                    int length = (int) ((j / j2) * r0.length);
                    int length2 = mediaController2.recordSamples.length - length;
                    float f = 0.0f;
                    if (length != 0) {
                        float length3 = r0.length / length;
                        float f2 = 0.0f;
                        for (int i = 0; i < length; i++) {
                            short[] sArr = MediaController.this.recordSamples;
                            sArr[i] = sArr[(int) f2];
                            f2 += length3;
                        }
                    }
                    float f3 = (read / 2.0f) / length2;
                    for (int i2 = 0; i2 < read / 2; i2++) {
                        short s = byteBuffer.getShort();
                        d += s * s;
                        if (i2 == ((int) f)) {
                            short[] sArr2 = MediaController.this.recordSamples;
                            if (length < sArr2.length) {
                                sArr2[length] = s;
                                f += f3;
                                length++;
                            }
                        }
                    }
                    MediaController.this.samplesCount = j2;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                byteBuffer.position(0);
                final double sqrt = Math.sqrt((d / read) / 2.0d);
                final boolean z = read != byteBuffer.capacity();
                MediaController.this.fileEncodingQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.2.$r8$lambda$Rs_3uFeeDM_ZcjVSL6e2WOYfmd4(MediaController.2.this, byteBuffer, z);
                    }
                });
                MediaController.this.recordQueue.postRunnable(MediaController.this.recordRunnable);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$2$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        NotificationCenter.getInstance(MediaController.this.recordingCurrentAccount).postNotificationName(NotificationCenter.recordProgressChanged, Integer.valueOf(MediaController.this.recordingGuid), Double.valueOf(sqrt));
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$Rs_3uFeeDM_ZcjVSL6e2WOYfmd4(final 2 r9, final ByteBuffer byteBuffer, boolean z) {
            int i;
            r9.getClass();
            while (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() > MediaController.this.fileBuffer.remaining()) {
                    i = byteBuffer.limit();
                    byteBuffer.limit(MediaController.this.fileBuffer.remaining() + byteBuffer.position());
                } else {
                    i = -1;
                }
                MediaController.this.fileBuffer.put(byteBuffer);
                if (MediaController.this.fileBuffer.position() == MediaController.this.fileBuffer.limit() || z) {
                    MediaController mediaController = MediaController.this;
                    if (mediaController.writeFrame(mediaController.fileBuffer, !z ? MediaController.this.fileBuffer.limit() : byteBuffer.position()) != 0) {
                        MediaController.this.fileBuffer.rewind();
                        MediaController mediaController2 = MediaController.this;
                        long j = mediaController2.recordTimeCount;
                        int limit = mediaController2.fileBuffer.limit() / 2;
                        MediaController mediaController3 = MediaController.this;
                        mediaController2.recordTimeCount = j + (limit / (mediaController3.sampleRate / MediaDataController.MAX_STYLE_RUNS_COUNT));
                        mediaController3.writtenFrame++;
                    } else {
                        FileLog.e("writing frame failed");
                    }
                }
                if (i != -1) {
                    byteBuffer.limit(i);
                }
            }
            MediaController.this.recordQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.this.recordBuffers.add(byteBuffer);
                }
            });
        }
    }

    private class InternalObserver extends ContentObserver {
        public InternalObserver() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            MediaController.this.processMediaObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        }
    }

    private class ExternalObserver extends ContentObserver {
        public ExternalObserver() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            MediaController.this.processMediaObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class GalleryObserverInternal extends ContentObserver {
        public GalleryObserverInternal() {
            super(null);
        }

        private void scheduleReloadRunnable() {
            AndroidUtilities.runOnUIThread(MediaController.refreshGalleryRunnable = new Runnable() { // from class: org.telegram.messenger.MediaController$GalleryObserverInternal$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.GalleryObserverInternal.$r8$lambda$fuJFHLSkATZGJU2p_cnqJR4WT-I(MediaController.GalleryObserverInternal.this);
                }
            }, 2000L);
        }

        public static /* synthetic */ void $r8$lambda$fuJFHLSkATZGJU2p_cnqJR4WT-I(GalleryObserverInternal galleryObserverInternal) {
            galleryObserverInternal.getClass();
            if (!PhotoViewer.getInstance().isVisible()) {
                Runnable unused = MediaController.refreshGalleryRunnable = null;
                MediaController.loadGalleryPhotosAlbums(0);
            } else {
                galleryObserverInternal.scheduleReloadRunnable();
            }
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            if (MediaController.refreshGalleryRunnable != null) {
                AndroidUtilities.cancelRunOnUIThread(MediaController.refreshGalleryRunnable);
            }
            scheduleReloadRunnable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class GalleryObserverExternal extends ContentObserver {
        public GalleryObserverExternal() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            if (MediaController.refreshGalleryRunnable != null) {
                AndroidUtilities.cancelRunOnUIThread(MediaController.refreshGalleryRunnable);
            }
            AndroidUtilities.runOnUIThread(MediaController.refreshGalleryRunnable = new Runnable() { // from class: org.telegram.messenger.MediaController$GalleryObserverExternal$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.GalleryObserverExternal.$r8$lambda$RXdudxX90yFWybAMOEn80RyiCv0();
                }
            }, 2000L);
        }

        public static /* synthetic */ void $r8$lambda$RXdudxX90yFWybAMOEn80RyiCv0() {
            Runnable unused = MediaController.refreshGalleryRunnable = null;
            MediaController.loadGalleryPhotosAlbums(0);
        }
    }

    public static void checkGallery() {
        AlbumEntry albumEntry;
        if (Build.VERSION.SDK_INT < 24 || (albumEntry = allPhotosAlbumEntry) == null) {
            return;
        }
        final int size = albumEntry.photos.size();
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$I5n5O3fhxSGp8aHEIaMfpeoOmaI(size);
            }
        }, 2000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r9 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r10 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        if (r17 == r9) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        r0 = org.telegram.messenger.MediaController.refreshGalleryRunnable;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        org.telegram.messenger.AndroidUtilities.cancelRunOnUIThread(r0);
        org.telegram.messenger.MediaController.refreshGalleryRunnable = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c0, code lost:
    
        loadGalleryPhotosAlbums(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0085, code lost:
    
        if (r2 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        if (r10 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[Catch: all -> 0x007f, TryCatch #4 {all -> 0x007f, blocks: (B:18:0x0066, B:20:0x006c, B:22:0x0072, B:24:0x0078, B:27:0x0087, B:29:0x009b, B:31:0x00a1, B:45:0x0081), top: B:17:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$I5n5O3fhxSGp8aHEIaMfpeoOmaI(int i) {
        Cursor cursor;
        Cursor cursor2;
        int i2;
        int i3;
        int checkSelfPermission;
        int checkSelfPermission2;
        int checkSelfPermission3;
        int checkSelfPermission4;
        int checkSelfPermission5;
        int checkSelfPermission6;
        int checkSelfPermission7;
        int checkSelfPermission8;
        try {
            Context context = ApplicationLoader.applicationContext;
            if (Build.VERSION.SDK_INT >= 33) {
                checkSelfPermission6 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES");
                if (checkSelfPermission6 != 0) {
                    checkSelfPermission7 = context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO");
                    if (checkSelfPermission7 != 0) {
                        checkSelfPermission8 = context.checkSelfPermission("android.permission.READ_MEDIA_AUDIO");
                        if (checkSelfPermission8 != 0) {
                        }
                    }
                }
                cursor = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                if (cursor != null) {
                    try {
                        i3 = cursor.moveToNext() ? cursor.getInt(0) : 0;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            FileLog.e(th);
                            if (cursor2 != null) {
                                i3 = 0;
                                cursor.close();
                                cursor2 = cursor;
                                i2 = i3;
                                try {
                                    Context context2 = ApplicationLoader.applicationContext;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        checkSelfPermission2 = context2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES");
                                        if (checkSelfPermission2 != 0) {
                                            checkSelfPermission3 = context2.checkSelfPermission("android.permission.READ_MEDIA_VIDEO");
                                            if (checkSelfPermission3 != 0) {
                                                checkSelfPermission4 = context2.checkSelfPermission("android.permission.READ_MEDIA_AUDIO");
                                                if (checkSelfPermission4 != 0) {
                                                }
                                            }
                                        }
                                        cursor2 = MediaStore.Images.Media.query(context2.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                                        if (cursor2 != null && cursor2.moveToNext()) {
                                            i2 += cursor2.getInt(0);
                                        }
                                    }
                                    checkSelfPermission = context2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                                } catch (Throwable th2) {
                                    try {
                                        FileLog.e(th2);
                                    } finally {
                                    }
                                }
                            } else {
                                cursor2 = cursor2;
                                i2 = 0;
                                Context context22 = ApplicationLoader.applicationContext;
                                if (Build.VERSION.SDK_INT >= 33) {
                                }
                                checkSelfPermission = context22.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                            }
                        } finally {
                        }
                    }
                }
            }
            checkSelfPermission5 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
            if (checkSelfPermission5 != 0) {
                cursor = null;
            }
            cursor = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
            if (cursor != null) {
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    private final class StopMediaObserverRunnable implements Runnable {
        public int currentObserverToken;

        private StopMediaObserverRunnable() {
            this.currentObserverToken = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.currentObserverToken == MediaController.this.startObserverToken) {
                try {
                    if (MediaController.this.internalObserver != null) {
                        ApplicationLoader.applicationContext.getContentResolver().unregisterContentObserver(MediaController.this.internalObserver);
                        MediaController.this.internalObserver = null;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                try {
                    if (MediaController.this.externalObserver != null) {
                        ApplicationLoader.applicationContext.getContentResolver().unregisterContentObserver(MediaController.this.externalObserver);
                        MediaController.this.externalObserver = null;
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
        }
    }

    public static MediaController getInstance() {
        MediaController mediaController;
        MediaController mediaController2 = Instance;
        if (mediaController2 != null) {
            return mediaController2;
        }
        synchronized (MediaController.class) {
            try {
                mediaController = Instance;
                if (mediaController == null) {
                    mediaController = new MediaController();
                    Instance = mediaController;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaController;
    }

    public MediaController() {
        DispatchQueue dispatchQueue = new DispatchQueue("recordQueue");
        this.recordQueue = dispatchQueue;
        dispatchQueue.setPriority(10);
        DispatchQueue dispatchQueue2 = new DispatchQueue("fileEncodingQueue");
        this.fileEncodingQueue = dispatchQueue2;
        dispatchQueue2.setPriority(10);
        this.recordQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$020W5VBCjIZwka4zlHIYkq8eJNw(MediaController.this);
            }
        });
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda49
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$lf-N0iuSzb1bb9fObGe6CMOtupk(MediaController.this);
            }
        });
        this.fileBuffer = ByteBuffer.allocateDirect(1920);
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda50
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$M2bVpiJjoeuYZh1b6JJV7avKbPg(MediaController.this);
            }
        });
        this.mediaProjections = new String[]{"_data", "_display_name", "bucket_display_name", Build.VERSION.SDK_INT > 28 ? "date_modified" : "datetaken", "title", "width", "height"};
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new GalleryObserverExternal());
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new GalleryObserverInternal());
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new GalleryObserverExternal());
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new GalleryObserverInternal());
        } catch (Exception e4) {
            FileLog.e(e4);
        }
    }

    public static /* synthetic */ void $r8$lambda$020W5VBCjIZwka4zlHIYkq8eJNw(MediaController mediaController) {
        mediaController.getClass();
        try {
            mediaController.sampleRate = 48000;
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 1280;
            }
            mediaController.recordBufferSize = minBufferSize;
            for (int i = 0; i < 5; i++) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaController.recordBufferSize);
                allocateDirect.order(ByteOrder.nativeOrder());
                mediaController.recordBuffers.add(allocateDirect);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$lf-N0iuSzb1bb9fObGe6CMOtupk(MediaController mediaController) {
        mediaController.getClass();
        try {
            mediaController.currentPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("playbackSpeed", VOLUME_NORMAL);
            mediaController.currentMusicPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("musicPlaybackSpeed", VOLUME_NORMAL);
            mediaController.fastPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("fastPlaybackSpeed", 1.8f);
            mediaController.fastMusicPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("fastMusicPlaybackSpeed", 1.8f);
            SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
            mediaController.sensorManager = sensorManager;
            mediaController.linearSensor = sensorManager.getDefaultSensor(10);
            Sensor defaultSensor = mediaController.sensorManager.getDefaultSensor(9);
            mediaController.gravitySensor = defaultSensor;
            if (mediaController.linearSensor == null || defaultSensor == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("gravity or linear sensor not found");
                }
                mediaController.accelerometerSensor = mediaController.sensorManager.getDefaultSensor(1);
                mediaController.linearSensor = null;
                mediaController.gravitySensor = null;
            }
            mediaController.proximitySensor = mediaController.sensorManager.getDefaultSensor(8);
            mediaController.proximityWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            4 r1 = mediaController.new 4();
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                telephonyManager.listen(r1, 32);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    class 4 extends PhoneStateListener {
        4() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(final int i, String str) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.4.$r8$lambda$AJJFfW87Hu4nQCgXduYc7M4rCaE(MediaController.4.this, i);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$AJJFfW87Hu4nQCgXduYc7M4rCaE(4 r8, int i) {
            if (i != 1) {
                if (i == 0) {
                    MediaController.this.callInProgress = false;
                    return;
                }
                r8.getClass();
                if (i == 2) {
                    EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.getInstance();
                    if (embedBottomSheet != null) {
                        embedBottomSheet.pause();
                    }
                    MediaController.this.callInProgress = true;
                    return;
                }
                return;
            }
            MediaController mediaController = MediaController.this;
            if (mediaController.isPlayingMessage(mediaController.playingMessageObject) && !MediaController.this.isMessagePaused()) {
                MediaController mediaController2 = MediaController.this;
                mediaController2.pauseMessage(mediaController2.playingMessageObject);
            } else if (MediaController.this.recordStartRunnable != null || MediaController.this.recordingAudio != null) {
                MediaController.this.stopRecording(2, false, 0, false, 0L);
            }
            EmbedBottomSheet embedBottomSheet2 = EmbedBottomSheet.getInstance();
            if (embedBottomSheet2 != null) {
                embedBottomSheet2.pause();
            }
            MediaController.this.callInProgress = true;
        }
    }

    public static /* synthetic */ void $r8$lambda$M2bVpiJjoeuYZh1b6JJV7avKbPg(MediaController mediaController) {
        mediaController.getClass();
        for (int i = 0; i < 4; i++) {
            NotificationCenter.getInstance(i).addObserver(mediaController, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i).addObserver(mediaController, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i).addObserver(mediaController, NotificationCenter.didReceiveNewMessages);
            NotificationCenter.getInstance(i).addObserver(mediaController, NotificationCenter.messagesDeleted);
            NotificationCenter.getInstance(i).addObserver(mediaController, NotificationCenter.removeAllMessagesFromDialog);
            NotificationCenter.getInstance(i).addObserver(mediaController, NotificationCenter.musicDidLoad);
            NotificationCenter.getInstance(i).addObserver(mediaController, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(i).addObserver(mediaController, NotificationCenter.musicListLoaded);
            NotificationCenter.getGlobalInstance().addObserver(mediaController, NotificationCenter.playerDidStartPlaying);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$EH5iCib7CC57QOw1UCyXqN6KezM(MediaController.this, i);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$EH5iCib7CC57QOw1UCyXqN6KezM(MediaController mediaController, int i) {
        if (i == -1) {
            if (mediaController.isPlayingMessage(mediaController.getPlayingMessageObject()) && !mediaController.isMessagePaused()) {
                mediaController.pauseMessage(mediaController.playingMessageObject);
            }
            mediaController.hasAudioFocus = 0;
            mediaController.audioFocus = 0;
        } else if (i == 1) {
            mediaController.audioFocus = 2;
            if (mediaController.resumeAudioOnFocusGain) {
                mediaController.resumeAudioOnFocusGain = false;
                if (mediaController.isPlayingMessage(mediaController.getPlayingMessageObject()) && mediaController.isMessagePaused()) {
                    mediaController.playMessage(mediaController.getPlayingMessageObject());
                }
            }
        } else if (i == -3) {
            mediaController.audioFocus = 1;
        } else if (i == -2) {
            mediaController.audioFocus = 0;
            if (mediaController.isPlayingMessage(mediaController.getPlayingMessageObject()) && !mediaController.isMessagePaused()) {
                mediaController.pauseMessage(mediaController.playingMessageObject);
                mediaController.resumeAudioOnFocusGain = true;
            }
        }
        mediaController.setPlayerVolume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerVolume() {
        float f;
        try {
            float f2 = 0.0f;
            if (this.isSilent) {
                f = 0.0f;
            } else {
                f = this.audioFocus != 1 ? VOLUME_NORMAL : VOLUME_DUCK;
            }
            VideoPlayer videoPlayer = this.audioPlayer;
            if (videoPlayer != null) {
                if (!CastSync.isActive()) {
                    f2 = this.audioVolume * f;
                }
                videoPlayer.setVolume(f2);
            } else {
                VideoPlayer videoPlayer2 = this.videoPlayer;
                if (videoPlayer2 != null) {
                    if (!CastSync.isActive()) {
                        f2 = f;
                    }
                    videoPlayer2.setVolume(f2);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public VideoPlayer getVideoPlayer() {
        return this.videoPlayer;
    }

    private void startProgressTimer(MessageObject messageObject) {
        synchronized (this.progressTimerSync) {
            java.util.Timer timer = this.progressTimer;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.progressTimer = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            messageObject.getFileName();
            java.util.Timer timer2 = new java.util.Timer();
            this.progressTimer = timer2;
            timer2.schedule(new 5(messageObject), 0L, 17L);
        }
    }

    class 5 extends TimerTask {
        final /* synthetic */ MessageObject val$currentPlayingMessageObject;

        5(MessageObject messageObject) {
            this.val$currentPlayingMessageObject = messageObject;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (MediaController.this.sync) {
                final MessageObject messageObject = this.val$currentPlayingMessageObject;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$5$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.5.$r8$lambda$VQ9geI_-7-YXobCzzh9bpZOpfmk(MediaController.5.this, messageObject);
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$VQ9geI_-7-YXobCzzh9bpZOpfmk(5 r12, MessageObject messageObject) {
            long duration;
            long currentPosition;
            final float f;
            float f2;
            if ((MediaController.this.audioPlayer == null && MediaController.this.videoPlayer == null) || MediaController.this.isPaused) {
                return;
            }
            try {
                if (MediaController.this.videoPlayer != null) {
                    duration = MediaController.this.videoPlayer.getDuration();
                    currentPosition = MediaController.this.videoPlayer.getCurrentPosition();
                    if (currentPosition >= 0 && duration > 0) {
                        float f3 = duration;
                        f2 = MediaController.this.videoPlayer.getBufferedPosition() / f3;
                        f = currentPosition / f3;
                        if (f >= MediaController.VOLUME_NORMAL) {
                            return;
                        }
                    }
                    return;
                }
                duration = MediaController.this.audioPlayer.getDuration();
                currentPosition = MediaController.this.audioPlayer.getCurrentPosition();
                float f4 = duration >= 0 ? currentPosition / duration : 0.0f;
                float bufferedPosition = MediaController.this.audioPlayer.getBufferedPosition() / duration;
                if (duration != -9223372036854775807L && currentPosition >= 0 && MediaController.this.seekToProgressPending == 0.0f) {
                    f = f4;
                    f2 = bufferedPosition;
                }
                return;
                MediaController.this.lastProgress = currentPosition;
                messageObject.audioPlayerDuration = (int) (duration / 1000);
                messageObject.audioProgress = f;
                messageObject.audioProgressSec = (int) (MediaController.this.lastProgress / 1000);
                messageObject.bufferedProgress = f2;
                if (f >= 0.0f && MediaController.this.shouldSavePositionForCurrentAudio != null && SystemClock.elapsedRealtime() - MediaController.this.lastSaveTime >= 1000) {
                    final String str = MediaController.this.shouldSavePositionForCurrentAudio;
                    MediaController.this.lastSaveTime = SystemClock.elapsedRealtime();
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$5$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat(str, f).commit();
                        }
                    });
                }
                NotificationCenter.getInstance(messageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(messageObject.getId()), Float.valueOf(f));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private void stopProgressTimer() {
        synchronized (this.progressTimerSync) {
            java.util.Timer timer = this.progressTimer;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.progressTimer = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public void cleanup() {
        cleanupPlayer(true, true);
        this.audioInfo = null;
        this.playMusicAgain = false;
        for (int i = 0; i < 4; i++) {
            DownloadController.getInstance(i).cleanup();
        }
        this.videoConvertQueue.clear();
        this.generatingWaveform.clear();
        this.savedMusicPlaylistState = null;
        this.voiceMessagesPlaylist = null;
        this.voiceMessagesPlaylistMap = null;
        clearPlaylist();
        cancelVideoConvert(null);
    }

    private void clearPlaylist() {
        this.currentSavedMusicList = null;
        this.playlist.clear();
        this.playlistMap.clear();
        this.shuffledPlaylist.clear();
        this.playlistClassGuid = 0;
        boolean[] zArr = this.playlistEndReached;
        zArr[1] = false;
        zArr[0] = false;
        this.playlistMergeDialogId = 0L;
        int[] iArr = this.playlistMaxId;
        iArr[1] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        this.loadingPlaylist = false;
        this.playlistGlobalSearchParams = null;
        this.savedMusicPlaylistState = null;
    }

    public void startMediaObserver() {
        ApplicationLoader.applicationHandler.removeCallbacks(this.stopMediaObserverRunnable);
        this.startObserverToken++;
        try {
            if (this.internalObserver == null) {
                ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                ExternalObserver externalObserver = new ExternalObserver();
                this.externalObserver = externalObserver;
                contentResolver.registerContentObserver(uri, false, externalObserver);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            if (this.externalObserver == null) {
                ContentResolver contentResolver2 = ApplicationLoader.applicationContext.getContentResolver();
                Uri uri2 = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
                InternalObserver internalObserver = new InternalObserver();
                this.internalObserver = internalObserver;
                contentResolver2.registerContentObserver(uri2, false, internalObserver);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void stopMediaObserver() {
        if (this.stopMediaObserverRunnable == null) {
            this.stopMediaObserverRunnable = new StopMediaObserverRunnable();
        }
        this.stopMediaObserverRunnable.currentObserverToken = this.startObserverToken;
        ApplicationLoader.applicationHandler.postDelayed(this.stopMediaObserverRunnable, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0068, code lost:
    
        if (r4.toLowerCase().contains("screenshot") != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processMediaObserver(Uri uri) {
        int i;
        Cursor cursor = null;
        try {
            try {
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                cursor = ApplicationLoader.applicationContext.getContentResolver().query(uri, this.mediaProjections, null, null, "date_added DESC LIMIT 1");
                final ArrayList arrayList = new ArrayList();
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        long j = cursor.getLong(3);
                        String string4 = cursor.getString(4);
                        int i2 = cursor.getInt(5);
                        int i3 = cursor.getInt(6);
                        if (string != null && string.toLowerCase().contains("screenshot")) {
                            if (i2 != 0 || i3 == 0) {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(string, options);
                                i2 = options.outWidth;
                                i3 = options.outHeight;
                            }
                            if (i2 <= 0 && i3 > 0) {
                                try {
                                    i = realScreenSize.x;
                                    if (i2 != i) {
                                        if (i3 != realScreenSize.y) {
                                        }
                                    }
                                    if (i3 != i && i2 == realScreenSize.y) {
                                    }
                                } catch (Exception unused) {
                                    arrayList.add(Long.valueOf(j));
                                }
                            }
                            arrayList.add(Long.valueOf(j));
                        }
                        if (string3 != null) {
                            if (string3.toLowerCase().contains("screenshot")) {
                                if (i2 != 0) {
                                }
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(string, options2);
                                i2 = options2.outWidth;
                                i3 = options2.outHeight;
                                if (i2 <= 0) {
                                    i = realScreenSize.x;
                                    if (i2 != i || i3 != realScreenSize.y) {
                                        if (i3 != i) {
                                        }
                                    }
                                }
                                arrayList.add(Long.valueOf(j));
                            }
                        }
                        if (string4 != null && string4.toLowerCase().contains("screenshot")) {
                            if (i2 != 0) {
                            }
                            BitmapFactory.Options options22 = new BitmapFactory.Options();
                            options22.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(string, options22);
                            i2 = options22.outWidth;
                            i3 = options22.outHeight;
                            if (i2 <= 0) {
                            }
                            arrayList.add(Long.valueOf(j));
                        }
                    }
                    cursor.close();
                }
                if (!arrayList.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda32
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaController.$r8$lambda$3d7E2-_MOCCaJHhGmiRFLS8djcc(MediaController.this, arrayList);
                        }
                    });
                }
                if (cursor == null) {
                    return;
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (cursor == null) {
                    return;
                }
            }
            try {
                cursor.close();
            } catch (Exception unused2) {
            }
        } finally {
        }
    }

    public static /* synthetic */ void $r8$lambda$3d7E2-_MOCCaJHhGmiRFLS8djcc(MediaController mediaController, ArrayList arrayList) {
        NotificationCenter.getInstance(mediaController.lastChatAccount).postNotificationName(NotificationCenter.screenshotTook, new Object[0]);
        mediaController.checkScreenshots(arrayList);
    }

    private void checkScreenshots(ArrayList<Long> arrayList) {
        if (arrayList == null || arrayList.isEmpty() || this.lastChatEnterTime == 0) {
            return;
        }
        if (this.lastUser != null || (this.lastSecretChat instanceof TLRPC.TL_encryptedChat)) {
            boolean z = false;
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = arrayList.get(i);
                if ((this.lastMediaCheckTime == 0 || l.longValue() > this.lastMediaCheckTime) && l.longValue() >= this.lastChatEnterTime && (this.lastChatLeaveTime == 0 || l.longValue() <= this.lastChatLeaveTime + 2000)) {
                    this.lastMediaCheckTime = Math.max(this.lastMediaCheckTime, l.longValue());
                    z = true;
                }
            }
            if (z) {
                if (this.lastSecretChat != null) {
                    SecretChatHelper.getInstance(this.lastChatAccount).sendScreenshotMessage(this.lastSecretChat, this.lastChatVisibleMessages, null);
                } else {
                    SendMessagesHelper.getInstance(this.lastChatAccount).sendScreenshotMessage(this.lastUser, this.lastMessageId, null);
                }
            }
        }
    }

    public void setLastVisibleMessageIds(int i, long j, long j2, TLRPC.User user, TLRPC.EncryptedChat encryptedChat, ArrayList<Long> arrayList, int i2) {
        this.lastChatEnterTime = j;
        this.lastChatLeaveTime = j2;
        this.lastChatAccount = i;
        this.lastSecretChat = encryptedChat;
        this.lastUser = user;
        this.lastMessageId = i2;
        this.lastChatVisibleMessages = arrayList;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        MessagesController.SavedMusicList savedMusicList;
        MessageObject messageObject;
        ArrayList<MessageObject> arrayList;
        int indexOf;
        int i3 = 0;
        if (i == NotificationCenter.fileLoaded || i == NotificationCenter.httpFileDidLoad) {
            String str = (String) objArr[0];
            MessageObject messageObject2 = this.playingMessageObject;
            if (messageObject2 != null && messageObject2.currentAccount == i2 && FileLoader.getAttachFileName(messageObject2.getDocument()).equals(str)) {
                if (this.downloadingCurrentMessage) {
                    this.playMusicAgain = true;
                    playMessage(this.playingMessageObject);
                    return;
                } else {
                    if (this.audioInfo == null) {
                        try {
                            this.audioInfo = AudioInfo.getAudioInfo(FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.playingMessageObject.messageOwner));
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            ArrayList arrayList2 = (ArrayList) objArr[0];
            MessageObject messageObject3 = this.playingMessageObject;
            if (messageObject3 != null && longValue == messageObject3.messageOwner.peer_id.channel_id && arrayList2.contains(Integer.valueOf(messageObject3.getId()))) {
                cleanupPlayer(true, true);
            }
            ArrayList<MessageObject> arrayList3 = this.voiceMessagesPlaylist;
            if (arrayList3 == null || arrayList3.isEmpty() || longValue != this.voiceMessagesPlaylist.get(0).messageOwner.peer_id.channel_id) {
                return;
            }
            while (i3 < arrayList2.size()) {
                Integer num = (Integer) arrayList2.get(i3);
                MessageObject messageObject4 = this.voiceMessagesPlaylistMap.get(num.intValue());
                this.voiceMessagesPlaylistMap.remove(num.intValue());
                if (messageObject4 != null) {
                    this.voiceMessagesPlaylist.remove(messageObject4);
                }
                i3++;
            }
            return;
        }
        if (i == NotificationCenter.removeAllMessagesFromDialog) {
            long longValue2 = ((Long) objArr[0]).longValue();
            MessageObject messageObject5 = this.playingMessageObject;
            if (messageObject5 == null || messageObject5.getDialogId() != longValue2) {
                return;
            }
            cleanupPlayer(false, true);
            return;
        }
        if (i == NotificationCenter.musicDidLoad) {
            long longValue3 = ((Long) objArr[0]).longValue();
            MessageObject messageObject6 = this.playingMessageObject;
            if (messageObject6 == null || !messageObject6.isMusic() || this.playingMessageObject.getDialogId() != longValue3 || this.playingMessageObject.scheduled) {
                return;
            }
            ArrayList arrayList4 = (ArrayList) objArr[1];
            ArrayList arrayList5 = (ArrayList) objArr[2];
            this.playlist.addAll(0, arrayList4);
            this.playlist.addAll(arrayList5);
            int size = this.playlist.size();
            for (int i4 = 0; i4 < size; i4++) {
                MessageObject messageObject7 = this.playlist.get(i4);
                this.playlistMap.put(Integer.valueOf(messageObject7.getId()), messageObject7);
                int[] iArr = this.playlistMaxId;
                iArr[0] = Math.min(iArr[0], messageObject7.getId());
            }
            sortPlaylist();
            if (SharedConfig.shuffleMusic) {
                buildShuffledPlayList();
            } else {
                MessageObject messageObject8 = this.playingMessageObject;
                if (messageObject8 != null && (indexOf = this.playlist.indexOf(messageObject8)) >= 0) {
                    this.currentPlaylistNum = indexOf;
                }
            }
            this.playlistClassGuid = ConnectionsManager.generateClassGuid();
            return;
        }
        if (i == NotificationCenter.mediaDidLoad) {
            if (((Integer) objArr[3]).intValue() != this.playlistClassGuid || this.playingMessageObject == null) {
                return;
            }
            long longValue4 = ((Long) objArr[0]).longValue();
            ((Integer) objArr[4]).getClass();
            ArrayList arrayList6 = (ArrayList) objArr[2];
            DialogObject.isEncryptedDialog(longValue4);
            char c = longValue4 == this.playlistMergeDialogId ? (char) 1 : (char) 0;
            if (!arrayList6.isEmpty()) {
                this.playlistEndReached[c] = ((Boolean) objArr[5]).booleanValue();
            }
            int i5 = 0;
            for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                MessageObject messageObject9 = (MessageObject) arrayList6.get(i6);
                if (!messageObject9.isVoiceOnce() && !this.playlistMap.containsKey(Integer.valueOf(messageObject9.getId()))) {
                    i5++;
                    this.playlist.add(0, messageObject9);
                    this.playlistMap.put(Integer.valueOf(messageObject9.getId()), messageObject9);
                    int[] iArr2 = this.playlistMaxId;
                    iArr2[c] = Math.min(iArr2[c], messageObject9.getId());
                }
            }
            sortPlaylist();
            int indexOf2 = this.playlist.indexOf(this.playingMessageObject);
            if (indexOf2 >= 0) {
                this.currentPlaylistNum = indexOf2;
            }
            this.loadingPlaylist = false;
            if (SharedConfig.shuffleMusic) {
                buildShuffledPlayList();
            }
            if (i5 != 0) {
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).postNotificationName(NotificationCenter.moreMusicDidLoad, Integer.valueOf(i5));
                return;
            }
            return;
        }
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || (arrayList = this.voiceMessagesPlaylist) == null || arrayList.isEmpty() || ((Long) objArr[0]).longValue() != this.voiceMessagesPlaylist.get(0).getDialogId()) {
                return;
            }
            ArrayList arrayList7 = (ArrayList) objArr[1];
            while (i3 < arrayList7.size()) {
                MessageObject messageObject10 = (MessageObject) arrayList7.get(i3);
                if ((messageObject10.isVoice() || messageObject10.isRoundVideo()) && !messageObject10.isVoiceOnce() && !messageObject10.isRoundOnce() && (!this.voiceMessagesPlaylistUnread || (messageObject10.isContentUnread() && !messageObject10.isOut()))) {
                    this.voiceMessagesPlaylist.add(messageObject10);
                    this.voiceMessagesPlaylistMap.put(messageObject10.getId(), messageObject10);
                }
                i3++;
            }
            return;
        }
        if (i == NotificationCenter.playerDidStartPlaying) {
            if (isCurrentPlayer((VideoPlayer) objArr[0])) {
                return;
            }
            MessageObject playingMessageObject = getPlayingMessageObject();
            if (playingMessageObject != null && isPlayingMessage(playingMessageObject) && !isMessagePaused() && (playingMessageObject.isMusic() || playingMessageObject.isVoice())) {
                this.wasPlayingAudioBeforePause = true;
            }
            pauseMessage(playingMessageObject);
            return;
        }
        if (i == NotificationCenter.musicListLoaded && (savedMusicList = this.currentSavedMusicList) != null && objArr[0] == savedMusicList) {
            int size2 = savedMusicList.list.size() - this.playlist.size();
            this.playlist.clear();
            this.playlist.addAll(this.currentSavedMusicList.list);
            sortPlaylist();
            if (SharedConfig.shuffleMusic) {
                buildShuffledPlayList();
            } else {
                MessageObject messageObject11 = this.playingMessageObject;
                if (messageObject11 != null) {
                    int indexOf3 = this.playlist.indexOf(messageObject11);
                    if (indexOf3 >= 0) {
                        this.currentPlaylistNum = indexOf3;
                    } else {
                        int i7 = this.currentPlaylistNum;
                        if (i7 < 0 || i7 >= this.playlist.size()) {
                            this.currentPlaylistNum = 0;
                        }
                        if (this.playlist.size() == 0) {
                            cleanup();
                        } else {
                            playMessage(this.playlist.get(0));
                        }
                    }
                }
            }
            if (size2 == 0 || (messageObject = this.playingMessageObject) == null) {
                return;
            }
            NotificationCenter.getInstance(messageObject.currentAccount).postNotificationName(NotificationCenter.moreMusicDidLoad, Integer.valueOf(size2));
        }
    }

    protected boolean isRecordingAudio() {
        return (this.recordStartRunnable == null && this.recordingAudio == null) ? false : true;
    }

    private boolean isNearToSensor(float f) {
        return f < 5.0f && f != this.proximitySensor.getMaximumRange();
    }

    public boolean isRecordingOrListeningByProximity() {
        if (!this.proximityTouched) {
            return false;
        }
        if (isRecordingAudio()) {
            return true;
        }
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            return messageObject.isVoice() || this.playingMessageObject.isRoundVideo();
        }
        return false;
    }

    private boolean forbidRaiseToListen() {
        AudioDeviceInfo[] devices;
        int type;
        boolean isSink;
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return NotificationsController.audioManager.isWiredHeadsetOn() || NotificationsController.audioManager.isBluetoothA2dpOn() || NotificationsController.audioManager.isBluetoothScoOn();
            }
            devices = NotificationsController.audioManager.getDevices(2);
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                type = audioDeviceInfo.getType();
                if (type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) {
                    isSink = audioDeviceInfo.isSink();
                    if (isSink) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j;
        char c;
        ?? r18;
        boolean z;
        int i;
        MessageObject messageObject;
        if (this.sensorsStarted && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f = this.lastProximityValue;
                float f2 = sensorEvent.values[0];
                if (f != f2) {
                    this.proximityHasDifferentValues = true;
                }
                this.lastProximityValue = f2;
                if (this.proximityHasDifferentValues) {
                    this.proximityTouched = isNearToSensor(f2);
                }
                j = 0;
                c = 2;
                r18 = 1;
            } else {
                Sensor sensor = sensorEvent.sensor;
                if (sensor == this.accelerometerSensor) {
                    double d = this.lastTimestamp == 0 ? 0.9800000190734863d : 1.0d / (((sensorEvent.timestamp - r2) / 1.0E9d) + 1.0d);
                    this.lastTimestamp = sensorEvent.timestamp;
                    float[] fArr = this.gravity;
                    double d2 = 1.0d - d;
                    float[] fArr2 = sensorEvent.values;
                    j = 0;
                    float f3 = (float) ((fArr[0] * d) + (fArr2[0] * d2));
                    fArr[0] = f3;
                    c = 2;
                    r18 = 1;
                    float f4 = (float) ((fArr[1] * d) + (fArr2[1] * d2));
                    fArr[1] = f4;
                    float f5 = (float) ((d * fArr[2]) + (d2 * fArr2[2]));
                    fArr[2] = f5;
                    float[] fArr3 = this.gravityFast;
                    fArr3[0] = (f3 * 0.8f) + (fArr2[0] * 0.19999999f);
                    fArr3[1] = (f4 * 0.8f) + (fArr2[1] * 0.19999999f);
                    fArr3[2] = (f5 * 0.8f) + (fArr2[2] * 0.19999999f);
                    float[] fArr4 = this.linearAcceleration;
                    fArr4[0] = fArr2[0] - fArr[0];
                    fArr4[1] = fArr2[1] - fArr[1];
                    fArr4[2] = fArr2[2] - fArr[2];
                } else {
                    j = 0;
                    c = 2;
                    r18 = 1;
                    r18 = 1;
                    r18 = 1;
                    if (sensor == this.linearSensor) {
                        float[] fArr5 = this.linearAcceleration;
                        float[] fArr6 = sensorEvent.values;
                        fArr5[0] = fArr6[0];
                        fArr5[1] = fArr6[1];
                        fArr5[2] = fArr6[2];
                    } else if (sensor == this.gravitySensor) {
                        float[] fArr7 = this.gravityFast;
                        float[] fArr8 = this.gravity;
                        float[] fArr9 = sensorEvent.values;
                        float f6 = fArr9[0];
                        fArr8[0] = f6;
                        fArr7[0] = f6;
                        float f7 = fArr9[1];
                        fArr8[1] = f7;
                        fArr7[1] = f7;
                        float f8 = fArr9[2];
                        fArr8[2] = f8;
                        fArr7[2] = f8;
                    }
                }
            }
            Sensor sensor2 = sensorEvent.sensor;
            if (sensor2 == this.linearSensor || sensor2 == this.gravitySensor || sensor2 == this.accelerometerSensor) {
                float[] fArr10 = this.gravity;
                float f9 = fArr10[0];
                float[] fArr11 = this.linearAcceleration;
                float f10 = (f9 * fArr11[0]) + (fArr10[r18] * fArr11[r18]) + (fArr10[c] * fArr11[c]);
                int i2 = this.raisedToBack;
                if (i2 != 6 && ((f10 > 0.0f && this.previousAccValue > 0.0f) || (f10 < 0.0f && this.previousAccValue < 0.0f))) {
                    if (f10 > 0.0f) {
                        z = f10 > 15.0f;
                        i = 1;
                    } else {
                        z = f10 < -15.0f;
                        i = 2;
                    }
                    int i3 = this.raisedToTopSign;
                    if (i3 != 0 && i3 != i) {
                        int i4 = this.raisedToTop;
                        if (i4 != 6 || !z) {
                            if (!z) {
                                this.countLess++;
                            }
                            if (this.countLess == 10 || i4 != 6 || i2 != 0) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.raisedToBack = 0;
                                this.countLess = 0;
                            }
                        } else if (i2 < 6) {
                            int i5 = i2 + 1;
                            this.raisedToBack = i5;
                            if (i5 == 6) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.countLess = 0;
                                this.timeSinceRaise = System.currentTimeMillis();
                                if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                    FileLog.d("motion detected");
                                }
                            }
                        }
                    } else if (z && i2 == 0 && (i3 == 0 || i3 == i)) {
                        int i6 = this.raisedToTop;
                        if (i6 < 6 && !this.proximityTouched) {
                            this.raisedToTopSign = i;
                            int i7 = i6 + 1;
                            this.raisedToTop = i7;
                            if (i7 == 6) {
                                this.countLess = 0;
                            }
                        }
                    } else {
                        if (!z) {
                            this.countLess++;
                        }
                        if (i3 != i || this.countLess == 10 || this.raisedToTop != 6 || i2 != 0) {
                            this.raisedToBack = 0;
                            this.raisedToTop = 0;
                            this.raisedToTopSign = 0;
                            this.countLess = 0;
                        }
                    }
                }
                this.previousAccValue = f10;
                float[] fArr12 = this.gravityFast;
                this.accelerometerVertical = fArr12[r18] > 2.5f && Math.abs(fArr12[c]) < 4.0f && Math.abs(this.gravityFast[0]) > 1.5f;
            }
            if (this.raisedToBack == 6 || this.accelerometerVertical) {
                this.lastAccelerometerDetected = System.currentTimeMillis();
            }
            boolean z2 = !this.manualRecording && this.playingMessageObject == null && SharedConfig.enabledRaiseTo(r18) && ApplicationLoader.isScreenOn && !this.inputFieldHasText && this.allowStartRecord && this.raiseChat != null && !this.callInProgress;
            boolean z3 = SharedConfig.enabledRaiseTo(false) && (messageObject = this.playingMessageObject) != null && (messageObject.isVoice() || this.playingMessageObject.isRoundVideo());
            boolean z4 = this.proximityTouched;
            boolean z5 = this.raisedToBack == 6 || this.accelerometerVertical || System.currentTimeMillis() - this.lastAccelerometerDetected < 60;
            boolean z6 = this.useFrontSpeaker || this.raiseToEarRecord;
            boolean z7 = (z5 || z6) && !forbidRaiseToListen() && !VoIPService.isAnyKindOfCallActive() && (z2 || z3) && !PhotoViewer.getInstance().isVisible();
            PowerManager.WakeLock wakeLock = this.proximityWakeLock;
            if (wakeLock != null) {
                boolean isHeld = wakeLock.isHeld();
                if (isHeld && !z7) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock releasing (proximityDetected=" + z4 + ", accelerometerDetected=" + z5 + ", alreadyPlaying=" + z6 + ")");
                    }
                    this.proximityWakeLock.release();
                } else if (!isHeld && z7) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock acquiring (proximityDetected=" + z4 + ", accelerometerDetected=" + z5 + ", alreadyPlaying=" + z6 + ")");
                    }
                    this.proximityWakeLock.acquire();
                }
            }
            boolean z8 = this.proximityTouched;
            if (z8 && z7) {
                if (z2 && this.recordStartRunnable == null) {
                    if (!this.raiseToEarRecord) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("start record");
                        }
                        this.useFrontSpeaker = true;
                        if (this.recordingAudio != null || !this.raiseChat.playFirstUnreadVoiceMessage()) {
                            this.raiseToEarRecord = true;
                            this.useFrontSpeaker = false;
                            raiseToSpeakUpdated(true);
                        }
                        if (this.useFrontSpeaker) {
                            setUseFrontSpeaker(true);
                        }
                    }
                } else if (z3 && !this.useFrontSpeaker) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("start listen");
                    }
                    setUseFrontSpeaker(true);
                    startAudioAgain(false);
                }
                this.raisedToBack = 0;
                this.raisedToTop = 0;
                this.raisedToTopSign = 0;
                this.countLess = 0;
            } else if (z8 && ((this.accelerometerSensor == null || this.linearSensor == null) && this.gravitySensor == null && !VoIPService.isAnyKindOfCallActive())) {
                if (this.playingMessageObject != null && !ApplicationLoader.mainInterfacePaused && z3 && !this.useFrontSpeaker && !this.manualRecording && !forbidRaiseToListen()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("start listen by proximity only");
                    }
                    setUseFrontSpeaker(true);
                    startAudioAgain(false);
                }
            } else if (!this.proximityTouched && !this.manualRecording) {
                if (this.raiseToEarRecord) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("stop record");
                    }
                    raiseToSpeakUpdated(false);
                    this.raiseToEarRecord = false;
                    this.ignoreOnPause = false;
                } else if (this.useFrontSpeaker) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("stop listen");
                    }
                    this.useFrontSpeaker = false;
                    startAudioAgain(true);
                    this.ignoreOnPause = false;
                }
            }
            if (this.timeSinceRaise == j || this.raisedToBack != 6 || Math.abs(System.currentTimeMillis() - this.timeSinceRaise) <= 1000) {
                return;
            }
            this.raisedToBack = 0;
            this.raisedToTop = 0;
            this.raisedToTopSign = 0;
            this.countLess = 0;
            this.timeSinceRaise = j;
        }
    }

    private void raiseToSpeakUpdated(boolean z) {
        if (this.recordingAudio != null) {
            toggleRecordingPause(false);
            return;
        }
        if (z) {
            int currentAccount = this.raiseChat.getCurrentAccount();
            long dialogId = this.raiseChat.getDialogId();
            MessageObject threadMessage = this.raiseChat.getThreadMessage();
            int classGuid = this.raiseChat.getClassGuid();
            ChatActivity chatActivity = this.raiseChat;
            SendMessageChatArguments messageChatSendParams = chatActivity != null ? chatActivity.getMessageChatSendParams() : null;
            ChatActivity chatActivity2 = this.raiseChat;
            long sendMonoForumPeerId = chatActivity2 != null ? chatActivity2.getSendMonoForumPeerId() : 0L;
            ChatActivity chatActivity3 = this.raiseChat;
            startRecording(currentAccount, dialogId, null, threadMessage, null, classGuid, false, messageChatSendParams, sendMonoForumPeerId, chatActivity3 != null ? chatActivity3.getSendMessageSuggestionParams() : null);
            return;
        }
        stopRecording(2, false, 0, false, 0L);
    }

    private void setUseFrontSpeaker(boolean z) {
        this.useFrontSpeaker = z;
        AudioManager audioManager = NotificationsController.audioManager;
        if (z) {
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
        } else {
            audioManager.setSpeakerphoneOn(true);
        }
    }

    public void startRecordingIfFromSpeaker() {
        if (this.useFrontSpeaker && this.raiseChat != null && this.allowStartRecord && SharedConfig.enabledRaiseTo(true)) {
            this.raiseToEarRecord = true;
            int currentAccount = this.raiseChat.getCurrentAccount();
            long dialogId = this.raiseChat.getDialogId();
            MessageObject threadMessage = this.raiseChat.getThreadMessage();
            int classGuid = this.raiseChat.getClassGuid();
            ChatActivity chatActivity = this.raiseChat;
            SendMessageChatArguments messageChatSendParams = chatActivity != null ? chatActivity.getMessageChatSendParams() : null;
            ChatActivity chatActivity2 = this.raiseChat;
            long sendMonoForumPeerId = chatActivity2 != null ? chatActivity2.getSendMonoForumPeerId() : 0L;
            ChatActivity chatActivity3 = this.raiseChat;
            startRecording(currentAccount, dialogId, null, threadMessage, null, classGuid, false, messageChatSendParams, sendMonoForumPeerId, chatActivity3 != null ? chatActivity3.getSendMessageSuggestionParams() : null);
            this.ignoreOnPause = true;
        }
    }

    private void startAudioAgain(boolean z) {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null) {
            return;
        }
        NotificationCenter.getInstance(messageObject.currentAccount).postNotificationName(NotificationCenter.audioRouteChanged, Boolean.valueOf(this.useFrontSpeaker));
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setStreamType(this.useFrontSpeaker ? 0 : 3);
            if (!z) {
                if (this.videoPlayer.getCurrentPosition() < 1000) {
                    this.videoPlayer.seekTo(0L);
                }
                this.videoPlayer.play();
                return;
            }
            pauseMessage(this.playingMessageObject);
            return;
        }
        VideoPlayer videoPlayer2 = this.audioPlayer;
        boolean z2 = videoPlayer2 != null;
        final MessageObject messageObject2 = this.playingMessageObject;
        float f = messageObject2.audioProgress;
        int i = messageObject2.audioPlayerDuration;
        if (z || videoPlayer2 == null || !videoPlayer2.isPlaying() || i * f > VOLUME_NORMAL) {
            messageObject2.audioProgress = f;
        } else {
            messageObject2.audioProgress = 0.0f;
        }
        cleanupPlayer(false, true);
        playMessage(messageObject2);
        if (z) {
            if (z2) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda45
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.this.pauseMessage(messageObject2);
                    }
                }, 100L);
            } else {
                pauseMessage(messageObject2);
            }
        }
    }

    public void setInputFieldHasText(boolean z) {
        this.inputFieldHasText = z;
    }

    public void setAllowStartRecord(boolean z) {
        this.allowStartRecord = z;
    }

    public void startRaiseToEarSensors(ChatActivity chatActivity) {
        if (chatActivity != null) {
            if ((this.accelerometerSensor == null && (this.gravitySensor == null || this.linearAcceleration == null)) || this.proximitySensor == null) {
                return;
            }
            if (!SharedConfig.enabledRaiseTo(false)) {
                MessageObject messageObject = this.playingMessageObject;
                if (messageObject == null) {
                    return;
                }
                if (!messageObject.isVoice() && !this.playingMessageObject.isRoundVideo()) {
                    return;
                }
            }
            this.raiseChat = chatActivity;
            if (this.sensorsStarted) {
                return;
            }
            float[] fArr = this.gravity;
            fArr[2] = 0.0f;
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            float[] fArr2 = this.linearAcceleration;
            fArr2[2] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[0] = 0.0f;
            float[] fArr3 = this.gravityFast;
            fArr3[2] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[0] = 0.0f;
            this.lastTimestamp = 0L;
            this.previousAccValue = 0.0f;
            this.raisedToTop = 0;
            this.raisedToTopSign = 0;
            this.countLess = 0;
            this.raisedToBack = 0;
            Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$V3yoS8OTp9wRkiTtZzpt2Dg0JWE(MediaController.this);
                }
            });
            this.sensorsStarted = true;
        }
    }

    public static /* synthetic */ void $r8$lambda$V3yoS8OTp9wRkiTtZzpt2Dg0JWE(MediaController mediaController) {
        Sensor sensor = mediaController.gravitySensor;
        if (sensor != null) {
            mediaController.sensorManager.registerListener(mediaController, sensor, 30000);
        }
        Sensor sensor2 = mediaController.linearSensor;
        if (sensor2 != null) {
            mediaController.sensorManager.registerListener(mediaController, sensor2, 30000);
        }
        Sensor sensor3 = mediaController.accelerometerSensor;
        if (sensor3 != null) {
            mediaController.sensorManager.registerListener(mediaController, sensor3, 30000);
        }
        mediaController.sensorManager.registerListener(mediaController, mediaController.proximitySensor, 3);
    }

    public void stopRaiseToEarSensors(ChatActivity chatActivity, boolean z, boolean z2) {
        MediaController mediaController;
        if (this.ignoreOnPause) {
            this.ignoreOnPause = false;
            return;
        }
        if (z2) {
            if (this.recordingAudio != null && !isRecordingPaused()) {
                toggleRecordingPause(false);
            } else {
                mediaController = this;
                mediaController.stopRecording(z ? 2 : 0, false, 0, false, 0L);
                if (mediaController.sensorsStarted || mediaController.ignoreOnPause) {
                }
                if ((mediaController.accelerometerSensor == null && (mediaController.gravitySensor == null || mediaController.linearAcceleration == null)) || mediaController.proximitySensor == null || mediaController.raiseChat != chatActivity) {
                    return;
                }
                mediaController.raiseChat = null;
                mediaController.sensorsStarted = false;
                mediaController.accelerometerVertical = false;
                mediaController.proximityTouched = false;
                mediaController.raiseToEarRecord = false;
                mediaController.useFrontSpeaker = false;
                Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda43
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.$r8$lambda$mx6-YVq4SoDbh5fiDCPo4uvgEss(MediaController.this);
                    }
                });
                PowerManager.WakeLock wakeLock = mediaController.proximityWakeLock;
                if (wakeLock == null || !wakeLock.isHeld()) {
                    return;
                }
                mediaController.proximityWakeLock.release();
                return;
            }
        }
        mediaController = this;
        if (mediaController.sensorsStarted) {
        }
    }

    public static /* synthetic */ void $r8$lambda$mx6-YVq4SoDbh5fiDCPo4uvgEss(MediaController mediaController) {
        Sensor sensor = mediaController.linearSensor;
        if (sensor != null) {
            mediaController.sensorManager.unregisterListener(mediaController, sensor);
        }
        Sensor sensor2 = mediaController.gravitySensor;
        if (sensor2 != null) {
            mediaController.sensorManager.unregisterListener(mediaController, sensor2);
        }
        Sensor sensor3 = mediaController.accelerometerSensor;
        if (sensor3 != null) {
            mediaController.sensorManager.unregisterListener(mediaController, sensor3);
        }
        mediaController.sensorManager.unregisterListener(mediaController, mediaController.proximitySensor);
    }

    public void cleanupPlayer(boolean z, boolean z2) {
        cleanupPlayer(z, z2, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void cleanupPlayer(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        PipRoundVideoView pipRoundVideoView;
        MessageObject messageObject;
        if (z2 && restoreMusicPlaylistState()) {
            return;
        }
        if (this.audioPlayer != null) {
            MusicListenReporter musicListenReporter = this.reporter;
            if (musicListenReporter != null) {
                musicListenReporter.destroy();
                this.reporter = null;
            }
            ValueAnimator valueAnimator = this.audioVolumeAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.audioVolumeAnimator.cancel();
            }
            if (!CastSync.isActive() && this.audioPlayer.isPlaying() && (messageObject = this.playingMessageObject) != null && !messageObject.isVoice()) {
                final VideoPlayer videoPlayer = this.audioPlayer;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.audioVolume, 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda18
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        MediaController mediaController = MediaController.this;
                        videoPlayer.setVolume((r1.audioFocus != 1 ? MediaController.VOLUME_NORMAL : MediaController.VOLUME_DUCK) * ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.MediaController.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        try {
                            videoPlayer.releasePlayer(true);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                });
                ofFloat.setDuration(300L);
                ofFloat.start();
            } else {
                try {
                    this.audioPlayer.releasePlayer(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            this.audioPlayer = null;
            Theme.unrefAudioVisualizeDrawable(this.playingMessageObject);
        } else {
            VideoPlayer videoPlayer2 = this.videoPlayer;
            if (videoPlayer2 != null) {
                this.currentAspectRatioFrameLayout = null;
                this.currentTextureViewContainer = null;
                this.currentAspectRatioFrameLayoutReady = false;
                this.isDrawingWasReady = false;
                this.currentTextureView = null;
                this.goingToShowMessageObject = null;
                if (z4) {
                    PhotoViewer.getInstance().injectVideoPlayer(this.videoPlayer);
                    MessageObject messageObject2 = this.playingMessageObject;
                    this.goingToShowMessageObject = messageObject2;
                    NotificationCenter.getInstance(messageObject2.currentAccount).postNotificationName(NotificationCenter.messagePlayingGoingToStop, this.playingMessageObject, Boolean.TRUE);
                } else {
                    long currentPosition = videoPlayer2.getCurrentPosition();
                    MessageObject messageObject3 = this.playingMessageObject;
                    if (messageObject3 != null && messageObject3.isVideo() && currentPosition > 0) {
                        MessageObject messageObject4 = this.playingMessageObject;
                        messageObject4.audioProgressMs = (int) currentPosition;
                        NotificationCenter.getInstance(messageObject4.currentAccount).postNotificationName(NotificationCenter.messagePlayingGoingToStop, this.playingMessageObject, Boolean.FALSE);
                    }
                    this.videoPlayer.releasePlayer(true);
                    this.videoPlayer = null;
                }
                try {
                    this.baseActivity.getWindow().clearFlags(128);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                if (this.playingMessageObject != null && !z4) {
                    AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
                    FileLoader.getInstance(this.playingMessageObject.currentAccount).removeLoadingVideo(this.playingMessageObject.getDocument(), true, false);
                }
            }
        }
        stopProgressTimer();
        this.lastProgress = 0L;
        this.isPaused = false;
        MessageObject messageObject5 = this.playingMessageObject;
        if (messageObject5 != null) {
            if (this.downloadingCurrentMessage) {
                FileLoader.getInstance(messageObject5.currentAccount).cancelLoadFile(this.playingMessageObject.getDocument());
            }
            MessageObject messageObject6 = this.playingMessageObject;
            if (z) {
                messageObject6.resetPlayingProgress();
                NotificationCenter.getInstance(messageObject6.currentAccount).postNotificationName(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
            }
            this.playingMessageObject = null;
            this.downloadingCurrentMessage = false;
            if (z) {
                NotificationsController.audioManager.abandonAudioFocus(this);
                this.hasAudioFocus = 0;
                ArrayList<MessageObject> arrayList = this.voiceMessagesPlaylist;
                int i = -1;
                if (arrayList != null) {
                    if (z3 && (i = arrayList.indexOf(messageObject6)) >= 0) {
                        this.voiceMessagesPlaylist.remove(i);
                        this.voiceMessagesPlaylistMap.remove(messageObject6.getId());
                        if (this.voiceMessagesPlaylist.isEmpty()) {
                            this.voiceMessagesPlaylist = null;
                            this.voiceMessagesPlaylistMap = null;
                        }
                    } else {
                        this.voiceMessagesPlaylist = null;
                        this.voiceMessagesPlaylistMap = null;
                    }
                }
                ArrayList<MessageObject> arrayList2 = this.voiceMessagesPlaylist;
                if (arrayList2 != null && i < arrayList2.size()) {
                    MessageObject messageObject7 = this.voiceMessagesPlaylist.get(i);
                    playMessage(messageObject7);
                    if (!messageObject7.isRoundVideo() && (pipRoundVideoView = this.pipRoundVideoView) != null) {
                        pipRoundVideoView.close(true);
                        this.pipRoundVideoView = null;
                    }
                    z5 = true;
                    if (z2) {
                        ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
                    }
                } else {
                    if ((messageObject6.isVoice() || messageObject6.isRoundVideo()) && messageObject6.getId() != 0) {
                        startRecordingIfFromSpeaker();
                    }
                    NotificationCenter.getInstance(messageObject6.currentAccount).postNotificationName(NotificationCenter.messagePlayingDidReset, Integer.valueOf(messageObject6.getId()), Boolean.valueOf(z2));
                    this.pipSwitchingState = 0;
                    PipRoundVideoView pipRoundVideoView2 = this.pipRoundVideoView;
                    if (pipRoundVideoView2 != null) {
                        pipRoundVideoView2.close(true);
                        this.pipRoundVideoView = null;
                    }
                }
            }
            z5 = false;
            if (z2) {
            }
        } else {
            z5 = false;
        }
        if (!z5 && z3 && !SharedConfig.enabledRaiseTo(true)) {
            ChatActivity chatActivity = this.raiseChat;
            stopRaiseToEarSensors(chatActivity, false, false);
            this.raiseChat = chatActivity;
        }
        if (z2) {
            CastSync.stop();
        }
    }

    public boolean isGoingToShowMessageObject(MessageObject messageObject) {
        return this.goingToShowMessageObject == messageObject;
    }

    public void resetGoingToShowMessageObject() {
        this.goingToShowMessageObject = null;
    }

    private boolean isSamePlayingMessage(MessageObject messageObject) {
        MessageObject messageObject2 = this.playingMessageObject;
        if (messageObject2 != null && messageObject2.getDialogId() == messageObject.getDialogId() && this.playingMessageObject.getId() == messageObject.getId()) {
            if ((this.playingMessageObject.eventId == 0) == (messageObject.eventId == 0)) {
                return true;
            }
        }
        return false;
    }

    public boolean seekToProgress(MessageObject messageObject, float f) {
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                VideoPlayer videoPlayer = this.audioPlayer;
                if (videoPlayer != null) {
                    long duration = videoPlayer.getDuration();
                    if (duration == -9223372036854775807L) {
                        this.seekToProgressPending = f;
                    } else {
                        messageObject2.audioProgress = f;
                        long j = (int) (duration * f);
                        this.audioPlayer.seekTo(j);
                        this.lastProgress = j;
                        if (!this.ignorePlayerUpdate) {
                            CastSync.seekTo(j);
                        }
                    }
                } else {
                    VideoPlayer videoPlayer2 = this.videoPlayer;
                    if (videoPlayer2 != null) {
                        videoPlayer2.seekTo((long) (videoPlayer2.getDuration() * f));
                        if (!this.ignorePlayerUpdate) {
                            CastSync.seekTo((long) (this.videoPlayer.getDuration() * f));
                        }
                    }
                }
                NotificationCenter.getInstance(messageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingDidSeek, Integer.valueOf(messageObject2.getId()), Float.valueOf(f));
                return true;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    public boolean seekToProgressMs(MessageObject messageObject, long j) {
        long j2;
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                VideoPlayer videoPlayer = this.audioPlayer;
                if (videoPlayer != null) {
                    j2 = videoPlayer.getDuration();
                    if (j2 != -9223372036854775807L) {
                        messageObject2.audioProgress = Utilities.clamp01(j / j2);
                    }
                    this.audioPlayer.seekTo(j);
                    this.lastProgress = j;
                    if (!this.ignorePlayerUpdate) {
                        CastSync.seekTo(j);
                    }
                } else {
                    VideoPlayer videoPlayer2 = this.videoPlayer;
                    if (videoPlayer2 != null) {
                        j2 = videoPlayer2.getDuration();
                        this.videoPlayer.seekTo(j);
                        if (!this.ignorePlayerUpdate) {
                            CastSync.seekTo(j);
                        }
                    } else {
                        j2 = 1;
                    }
                }
                if (j2 != 0) {
                    NotificationCenter.getInstance(messageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingDidSeek, Integer.valueOf(messageObject2.getId()), Float.valueOf(Utilities.clamp01(j / j2)));
                }
                return true;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    public long getProgressMs(MessageObject messageObject) {
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                VideoPlayer videoPlayer = this.audioPlayer;
                if (videoPlayer != null) {
                    return videoPlayer.getCurrentPosition();
                }
                VideoPlayer videoPlayer2 = this.videoPlayer;
                if (videoPlayer2 != null) {
                    return videoPlayer2.getCurrentPosition();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public long getDuration() {
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getDuration();
    }

    public MessageObject getPlayingMessageObject() {
        return this.playingMessageObject;
    }

    public int getPlayingMessageObjectNum() {
        return this.currentPlaylistNum;
    }

    private void buildShuffledPlayList() {
        MessageObject messageObject;
        if (this.playlist.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.playlist);
        this.shuffledPlaylist.clear();
        int i = this.currentPlaylistNum;
        if (i < 0 || i >= this.playlist.size()) {
            messageObject = null;
        } else {
            messageObject = this.playlist.get(this.currentPlaylistNum);
            arrayList.remove(this.currentPlaylistNum);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            int nextInt = Utilities.random.nextInt(arrayList.size());
            this.shuffledPlaylist.add((MessageObject) arrayList.get(nextInt));
            arrayList.remove(nextInt);
        }
        if (messageObject != null) {
            this.shuffledPlaylist.add(messageObject);
            this.currentPlaylistNum = this.shuffledPlaylist.size() - 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadMoreMusic() {
        MessageObject messageObject;
        final int i;
        long j;
        long j2;
        long j3;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
        MessagesController.SavedMusicList savedMusicList = this.currentSavedMusicList;
        if (savedMusicList != null) {
            savedMusicList.load();
            return;
        }
        if (this.loadingPlaylist || (messageObject = this.playingMessageObject) == null || messageObject.scheduled || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || (i = this.playlistClassGuid) == 0) {
            return;
        }
        PlaylistGlobalSearchParams playlistGlobalSearchParams = this.playlistGlobalSearchParams;
        if (playlistGlobalSearchParams != null) {
            if (playlistGlobalSearchParams.endReached || this.playlist.isEmpty()) {
                return;
            }
            final int i2 = this.playlist.get(0).currentAccount;
            if (this.playlistGlobalSearchParams.dialogId != 0) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                PlaylistGlobalSearchParams playlistGlobalSearchParams2 = this.playlistGlobalSearchParams;
                tL_messages_search.q = playlistGlobalSearchParams2.query;
                tL_messages_search.limit = 20;
                FiltersView.MediaFilterData mediaFilterData = playlistGlobalSearchParams2.filter;
                tL_messages_search.filter = mediaFilterData == null ? new TLRPC.TL_inputMessagesFilterEmpty() : mediaFilterData.filter;
                tL_messages_search.peer = AccountInstance.getInstance(i2).getMessagesController().getInputPeer(this.playlistGlobalSearchParams.dialogId);
                ArrayList<MessageObject> arrayList = this.playlist;
                tL_messages_search.offset_id = arrayList.get(arrayList.size() - 1).getId();
                PlaylistGlobalSearchParams playlistGlobalSearchParams3 = this.playlistGlobalSearchParams;
                long j4 = playlistGlobalSearchParams3.minDate;
                if (j4 > 0) {
                    tL_messages_search.min_date = (int) (j4 / 1000);
                }
                long j5 = playlistGlobalSearchParams3.maxDate;
                tL_messages_searchGlobal = tL_messages_search;
                if (j5 > 0) {
                    tL_messages_search.min_date = (int) (j5 / 1000);
                    tL_messages_searchGlobal = tL_messages_search;
                }
            } else {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal2.limit = 20;
                PlaylistGlobalSearchParams playlistGlobalSearchParams4 = this.playlistGlobalSearchParams;
                tL_messages_searchGlobal2.q = playlistGlobalSearchParams4.query;
                tL_messages_searchGlobal2.filter = playlistGlobalSearchParams4.filter.filter;
                ArrayList<MessageObject> arrayList2 = this.playlist;
                MessageObject messageObject2 = arrayList2.get(arrayList2.size() - 1);
                tL_messages_searchGlobal2.offset_id = messageObject2.getId();
                PlaylistGlobalSearchParams playlistGlobalSearchParams5 = this.playlistGlobalSearchParams;
                tL_messages_searchGlobal2.offset_rate = playlistGlobalSearchParams5.nextSearchRate;
                tL_messages_searchGlobal2.flags |= 1;
                tL_messages_searchGlobal2.folder_id = playlistGlobalSearchParams5.folderId;
                TLRPC.Peer peer = messageObject2.messageOwner.peer_id;
                long j6 = peer.channel_id;
                if (j6 == 0) {
                    j6 = peer.chat_id;
                    if (j6 == 0) {
                        j = peer.user_id;
                        tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i2).getInputPeer(j);
                        PlaylistGlobalSearchParams playlistGlobalSearchParams6 = this.playlistGlobalSearchParams;
                        j2 = playlistGlobalSearchParams6.minDate;
                        if (j2 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j2 / 1000);
                        }
                        j3 = playlistGlobalSearchParams6.maxDate;
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                        if (j3 > 0) {
                            tL_messages_searchGlobal2.min_date = (int) (j3 / 1000);
                            tL_messages_searchGlobal = tL_messages_searchGlobal2;
                        }
                    }
                }
                j = -j6;
                tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i2).getInputPeer(j);
                PlaylistGlobalSearchParams playlistGlobalSearchParams62 = this.playlistGlobalSearchParams;
                j2 = playlistGlobalSearchParams62.minDate;
                if (j2 > 0) {
                }
                j3 = playlistGlobalSearchParams62.maxDate;
                tL_messages_searchGlobal = tL_messages_searchGlobal2;
                if (j3 > 0) {
                }
            }
            this.loadingPlaylist = true;
            ConnectionsManager.getInstance(i2).sendRequest(tL_messages_searchGlobal, new RequestDelegate() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda25
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    MediaController.$r8$lambda$MqBiUe76wGE8LE2cGPEXBxz-7-Q(MediaController.this, i, i2, tLObject, tL_error);
                }
            });
            return;
        }
        boolean[] zArr = this.playlistEndReached;
        if (!zArr[0]) {
            this.loadingPlaylist = true;
            AccountInstance.getInstance(this.playingMessageObject.currentAccount).getMediaDataController().loadMedia(this.playingMessageObject.getDialogId(), 50, this.playlistMaxId[0], 0, 4, 0L, 1, this.playlistClassGuid, 0, null, null);
        } else {
            if (this.playlistMergeDialogId == 0 || zArr[1]) {
                return;
            }
            this.loadingPlaylist = true;
            AccountInstance.getInstance(this.playingMessageObject.currentAccount).getMediaDataController().loadMedia(this.playlistMergeDialogId, 50, this.playlistMaxId[0], 0, 4, 0L, 1, this.playlistClassGuid, 0, null, null);
        }
    }

    public static /* synthetic */ void $r8$lambda$MqBiUe76wGE8LE2cGPEXBxz-7-Q(final MediaController mediaController, final int i, final int i2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        mediaController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda63
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$l4LxanS4uWapW068F9t3B6sh-T0(MediaController.this, i, tL_error, tLObject, i2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$l4LxanS4uWapW068F9t3B6sh-T0(MediaController mediaController, int i, TLRPC.TL_error tL_error, TLObject tLObject, int i2) {
        PlaylistGlobalSearchParams playlistGlobalSearchParams;
        if (mediaController.playlistClassGuid != i || (playlistGlobalSearchParams = mediaController.playlistGlobalSearchParams) == null || mediaController.playingMessageObject == null || tL_error != null) {
            return;
        }
        mediaController.loadingPlaylist = false;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        playlistGlobalSearchParams.nextSearchRate = messages_messages.next_rate;
        MessagesStorage.getInstance(i2).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        MessagesController.getInstance(i2).putUsers(messages_messages.users, false);
        MessagesController.getInstance(i2).putChats(messages_messages.chats, false);
        int size = messages_messages.messages.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            MessageObject messageObject = new MessageObject(i2, messages_messages.messages.get(i4), false, true);
            if (!messageObject.isVoiceOnce() && !mediaController.playlistMap.containsKey(Integer.valueOf(messageObject.getId()))) {
                mediaController.playlist.add(0, messageObject);
                mediaController.playlistMap.put(Integer.valueOf(messageObject.getId()), messageObject);
                i3++;
            }
        }
        mediaController.sortPlaylist();
        mediaController.loadingPlaylist = false;
        mediaController.playlistGlobalSearchParams.endReached = mediaController.playlist.size() == mediaController.playlistGlobalSearchParams.totalCount;
        if (SharedConfig.shuffleMusic) {
            mediaController.buildShuffledPlayList();
        }
        if (i3 != 0) {
            NotificationCenter.getInstance(mediaController.playingMessageObject.currentAccount).postNotificationName(NotificationCenter.moreMusicDidLoad, Integer.valueOf(i3));
        }
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j, PlaylistGlobalSearchParams playlistGlobalSearchParams) {
        return setPlaylist(arrayList, messageObject, j, true, playlistGlobalSearchParams);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j) {
        return setPlaylist(arrayList, messageObject, j, true, null);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j, boolean z, PlaylistGlobalSearchParams playlistGlobalSearchParams) {
        if (this.playingMessageObject == messageObject) {
            int indexOf = this.playlist.indexOf(messageObject);
            if (indexOf >= 0) {
                this.currentPlaylistNum = indexOf;
            }
            return playMessage(messageObject);
        }
        this.forceLoopCurrentPlaylist = !z;
        this.playlistMergeDialogId = j;
        this.playMusicAgain = !this.playlist.isEmpty();
        clearPlaylist();
        this.playlistGlobalSearchParams = playlistGlobalSearchParams;
        boolean z2 = false;
        if (!arrayList.isEmpty() && DialogObject.isEncryptedDialog(arrayList.get(0).getDialogId())) {
            z2 = true;
        }
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = TLObject.FLAG_31;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            MessageObject messageObject2 = arrayList.get(size);
            if (messageObject2.isMusic()) {
                int id = messageObject2.getId();
                if (id > 0 || z2) {
                    i = Math.min(i, id);
                    i2 = Math.max(i2, id);
                }
                this.playlist.add(messageObject2);
                this.playlistMap.put(Integer.valueOf(id), messageObject2);
            }
        }
        sortPlaylist();
        int indexOf2 = this.playlist.indexOf(messageObject);
        this.currentPlaylistNum = indexOf2;
        if (indexOf2 == -1) {
            clearPlaylist();
            this.currentPlaylistNum = this.playlist.size();
            this.playlist.add(messageObject);
            this.playlistMap.put(Integer.valueOf(messageObject.getId()), messageObject);
        }
        if (messageObject.isMusic() && !messageObject.scheduled) {
            if (SharedConfig.shuffleMusic) {
                buildShuffledPlayList();
            }
            if (z) {
                if (this.playlistGlobalSearchParams == null) {
                    MediaDataController.getInstance(messageObject.currentAccount).loadMusic(messageObject.getDialogId(), i, i2);
                } else {
                    this.playlistClassGuid = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return playMessage(messageObject);
    }

    private void sortPlaylist() {
        Collections.sort(this.playlist, new Comparator() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda44
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaController.$r8$lambda$Z0Erp2L8slKvvC3qPEU0fm69vKk((MessageObject) obj, (MessageObject) obj2);
            }
        });
    }

    public static /* synthetic */ int $r8$lambda$Z0Erp2L8slKvvC3qPEU0fm69vKk(MessageObject messageObject, MessageObject messageObject2) {
        int compare;
        int id = messageObject.getId();
        int id2 = messageObject2.getId();
        long j = messageObject.messageOwner.grouped_id;
        long j2 = messageObject2.messageOwner.grouped_id;
        if (id >= 0 || id2 >= 0) {
            if (j != 0 && j == j2) {
                compare = Integer.compare(id2, id);
            } else {
                return Integer.compare(id, id2);
            }
        } else if (j != 0 && j == j2) {
            compare = Integer.compare(id, id2);
        } else {
            return Integer.compare(id2, id);
        }
        return -compare;
    }

    public boolean hasNoNextVoiceOrRoundVideoMessage() {
        ArrayList<MessageObject> arrayList;
        MessageObject messageObject = this.playingMessageObject;
        return messageObject == null || !(messageObject.isVoice() || this.playingMessageObject.isRoundVideo()) || (arrayList = this.voiceMessagesPlaylist) == null || arrayList.size() <= 1 || !this.voiceMessagesPlaylist.contains(this.playingMessageObject) || this.voiceMessagesPlaylist.indexOf(this.playingMessageObject) >= this.voiceMessagesPlaylist.size() - 1;
    }

    public void playNextMessage() {
        playNextMessageWithoutOrder(false);
    }

    public boolean findMessageInPlaylistAndPlay(MessageObject messageObject) {
        int indexOf = this.playlist.indexOf(messageObject);
        if (indexOf == -1) {
            return playMessage(messageObject);
        }
        playMessageAtIndex(indexOf);
        return true;
    }

    public void playMessageAtIndex(int i) {
        int i2 = this.currentPlaylistNum;
        if (i2 < 0 || i2 >= this.playlist.size()) {
            return;
        }
        this.currentPlaylistNum = i;
        this.playMusicAgain = true;
        MessageObject messageObject = this.playlist.get(i);
        if (this.playingMessageObject != null && !isSamePlayingMessage(messageObject)) {
            this.playingMessageObject.resetPlayingProgress();
        }
        playMessage(messageObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playNextMessageWithoutOrder(boolean z) {
        int i;
        ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
        if (z && (((i = SharedConfig.repeatMode) == 2 || (i == 1 && arrayList.size() == 1)) && !this.forceLoopCurrentPlaylist)) {
            cleanupPlayer(false, false);
            int i2 = this.currentPlaylistNum;
            if (i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject = arrayList.get(this.currentPlaylistNum);
            messageObject.audioProgress = 0.0f;
            messageObject.audioProgressSec = 0;
            playMessage(messageObject);
            return;
        }
        if (traversePlaylist(arrayList, SharedConfig.playOrderReversed ? 1 : -1) && z && SharedConfig.repeatMode == 0 && !this.forceLoopCurrentPlaylist) {
            VideoPlayer videoPlayer = this.audioPlayer;
            if (videoPlayer == null && this.videoPlayer == null) {
                return;
            }
            if (videoPlayer != null) {
                MusicListenReporter musicListenReporter = this.reporter;
                if (musicListenReporter != null) {
                    musicListenReporter.destroy();
                    this.reporter = null;
                }
                try {
                    this.audioPlayer.releasePlayer(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.audioPlayer = null;
                Theme.unrefAudioVisualizeDrawable(this.playingMessageObject);
            } else {
                this.currentAspectRatioFrameLayout = null;
                this.currentTextureViewContainer = null;
                this.currentAspectRatioFrameLayoutReady = false;
                this.currentTextureView = null;
                this.videoPlayer.releasePlayer(true);
                this.videoPlayer = null;
                try {
                    this.baseActivity.getWindow().clearFlags(128);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
                FileLoader.getInstance(this.playingMessageObject.currentAccount).removeLoadingVideo(this.playingMessageObject.getDocument(), true, false);
            }
            stopProgressTimer();
            this.lastProgress = 0L;
            this.isPaused = true;
            MessageObject messageObject2 = this.playingMessageObject;
            messageObject2.audioProgress = 0.0f;
            messageObject2.audioProgressSec = 0;
            NotificationCenter.getInstance(messageObject2.currentAccount).postNotificationName(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
            NotificationCenter.getInstance(this.playingMessageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
            return;
        }
        int i3 = this.currentPlaylistNum;
        if (i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        MessageObject messageObject3 = this.playingMessageObject;
        if (messageObject3 != null) {
            messageObject3.resetPlayingProgress();
        }
        this.playMusicAgain = true;
        playMessage(arrayList.get(this.currentPlaylistNum));
    }

    public void playPreviousMessage() {
        int i;
        ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
        if (arrayList.isEmpty() || (i = this.currentPlaylistNum) < 0 || i >= arrayList.size()) {
            return;
        }
        MessageObject messageObject = arrayList.get(this.currentPlaylistNum);
        if (messageObject.audioProgressSec > 10) {
            seekToProgress(messageObject, 0.0f);
            return;
        }
        traversePlaylist(arrayList, SharedConfig.playOrderReversed ? -1 : 1);
        if (this.currentPlaylistNum >= arrayList.size()) {
            return;
        }
        this.playMusicAgain = true;
        playMessage(arrayList.get(this.currentPlaylistNum));
    }

    private boolean traversePlaylist(ArrayList<MessageObject> arrayList, int i) {
        MessageObject messageObject;
        int i2;
        MessageObject messageObject2;
        int i3 = this.currentPlaylistNum;
        boolean z = ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() == 2;
        this.currentPlaylistNum += i;
        if (z) {
            while (this.currentPlaylistNum < arrayList.size() && (i2 = this.currentPlaylistNum) >= 0 && ((messageObject2 = arrayList.get(i2)) == null || !messageObject2.mediaExists)) {
                this.currentPlaylistNum += i;
            }
        }
        if (this.currentPlaylistNum < arrayList.size() && this.currentPlaylistNum >= 0) {
            return false;
        }
        this.currentPlaylistNum = this.currentPlaylistNum >= arrayList.size() ? 0 : arrayList.size() - 1;
        if (z) {
            while (true) {
                int i4 = this.currentPlaylistNum;
                if (i4 < 0 || i4 >= arrayList.size()) {
                    break;
                }
                int i5 = this.currentPlaylistNum;
                if (i > 0) {
                    if (i5 > i3) {
                        break;
                    }
                    messageObject = arrayList.get(this.currentPlaylistNum);
                    if (messageObject == null && messageObject.mediaExists) {
                        break;
                    }
                    this.currentPlaylistNum += i;
                } else {
                    if (i5 < i3) {
                        break;
                    }
                    messageObject = arrayList.get(this.currentPlaylistNum);
                    if (messageObject == null) {
                    }
                    this.currentPlaylistNum += i;
                }
            }
            if (this.currentPlaylistNum >= arrayList.size() || this.currentPlaylistNum < 0) {
                this.currentPlaylistNum = this.currentPlaylistNum < arrayList.size() ? arrayList.size() - 1 : 0;
            }
        }
        return true;
    }

    protected void checkIsNextMediaFileDownloaded() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null || !messageObject.isMusic()) {
            return;
        }
        checkIsNextMusicFileDownloaded(this.playingMessageObject.currentAccount);
    }

    private void checkIsNextVoiceFileDownloaded(int i) {
        ArrayList<MessageObject> arrayList = this.voiceMessagesPlaylist;
        if (arrayList != null) {
            if (arrayList.size() < 2) {
                return;
            }
            MessageObject messageObject = this.voiceMessagesPlaylist.get(1);
            String str = messageObject.messageOwner.attachPath;
            File file = null;
            if (str != null && str.length() > 0) {
                File file2 = new File(messageObject.messageOwner.attachPath);
                if (file2.exists()) {
                    file = file2;
                }
            }
            File pathToMessage = file != null ? file : FileLoader.getInstance(i).getPathToMessage(messageObject.messageOwner);
            pathToMessage.exists();
            if (pathToMessage == file || pathToMessage.exists()) {
                return;
            }
            FileLoader.getInstance(i).loadFile(messageObject.getDocument(), messageObject, 0, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
        }
    }

    private void checkIsNextMusicFileDownloaded(int i) {
        int i2;
        if (DownloadController.getInstance(i).canDownloadNextTrack()) {
            ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
            if (arrayList != null) {
                if (arrayList.size() < 2) {
                    return;
                }
                if (SharedConfig.playOrderReversed) {
                    i2 = this.currentPlaylistNum + 1;
                    if (i2 >= arrayList.size()) {
                        i2 = 0;
                    }
                } else {
                    i2 = this.currentPlaylistNum - 1;
                    if (i2 < 0) {
                        i2 = arrayList.size() - 1;
                    }
                }
                if (i2 < 0 || i2 >= arrayList.size()) {
                    return;
                }
                MessageObject messageObject = arrayList.get(i2);
                File file = null;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    File file2 = new File(messageObject.messageOwner.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                File pathToMessage = file != null ? file : FileLoader.getInstance(i).getPathToMessage(messageObject.messageOwner);
                pathToMessage.exists();
                if (pathToMessage == file || pathToMessage.exists() || !messageObject.isMusic()) {
                    return;
                }
                FileLoader.getInstance(i).loadFile(messageObject.getDocument(), messageObject, 0, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
            }
        }
    }

    public void setVoiceMessagesPlaylist(ArrayList<MessageObject> arrayList, boolean z) {
        ArrayList<MessageObject> arrayList2 = arrayList != null ? new ArrayList<>(arrayList) : null;
        this.voiceMessagesPlaylist = arrayList2;
        if (arrayList2 != null) {
            this.voiceMessagesPlaylistUnread = z;
            this.voiceMessagesPlaylistMap = new SparseArray<>();
            for (int i = 0; i < this.voiceMessagesPlaylist.size(); i++) {
                MessageObject messageObject = this.voiceMessagesPlaylist.get(i);
                this.voiceMessagesPlaylistMap.put(messageObject.getId(), messageObject);
            }
        }
    }

    private void checkAudioFocus(MessageObject messageObject) {
        int i;
        int requestAudioFocus;
        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            i = this.useFrontSpeaker ? 3 : 2;
        } else {
            i = 1;
        }
        if (this.hasAudioFocus != i) {
            this.hasAudioFocus = i;
            if (i == 3) {
                requestAudioFocus = NotificationsController.audioManager.requestAudioFocus(this, 0, 1);
            } else {
                requestAudioFocus = NotificationsController.audioManager.requestAudioFocus(this, 3, (i != 2 || SharedConfig.pauseMusicOnMedia) ? 1 : 3);
            }
            if (requestAudioFocus == 1) {
                this.audioFocus = 2;
            }
        }
    }

    public boolean isPiPShown() {
        return this.pipRoundVideoView != null;
    }

    public void setCurrentVideoVisible(boolean z) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.currentAspectRatioFrameLayout;
        if (aspectRatioFrameLayout == null) {
            return;
        }
        if (z) {
            PipRoundVideoView pipRoundVideoView = this.pipRoundVideoView;
            if (pipRoundVideoView != null) {
                this.pipSwitchingState = 2;
                pipRoundVideoView.close(true);
                this.pipRoundVideoView = null;
                return;
            } else {
                if (aspectRatioFrameLayout.getParent() == null) {
                    this.currentTextureViewContainer.addView(this.currentAspectRatioFrameLayout);
                }
                this.videoPlayer.setTextureView(this.currentTextureView);
                return;
            }
        }
        if (aspectRatioFrameLayout.getParent() != null) {
            this.pipSwitchingState = 1;
            this.currentTextureViewContainer.removeView(this.currentAspectRatioFrameLayout);
            return;
        }
        if (this.pipRoundVideoView == null) {
            try {
                PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                this.pipRoundVideoView = pipRoundVideoView2;
                pipRoundVideoView2.show(this.baseActivity, new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.this.cleanupPlayer(true, true);
                    }
                });
            } catch (Exception unused) {
                this.pipRoundVideoView = null;
            }
        }
        PipRoundVideoView pipRoundVideoView3 = this.pipRoundVideoView;
        if (pipRoundVideoView3 != null) {
            this.videoPlayer.setTextureView(pipRoundVideoView3.getTextureView());
        }
    }

    public void setTextureView(TextureView textureView, AspectRatioFrameLayout aspectRatioFrameLayout, FrameLayout frameLayout, boolean z) {
        setTextureView(textureView, aspectRatioFrameLayout, frameLayout, z, null);
    }

    public void setTextureView(TextureView textureView, AspectRatioFrameLayout aspectRatioFrameLayout, FrameLayout frameLayout, boolean z, Runnable runnable) {
        if (textureView == null) {
            return;
        }
        if (!z && this.currentTextureView == textureView) {
            this.pipSwitchingState = 1;
            this.currentTextureView = null;
            this.currentAspectRatioFrameLayout = null;
            this.currentTextureViewContainer = null;
            return;
        }
        if (this.videoPlayer == null || textureView == this.currentTextureView) {
            return;
        }
        this.isDrawingWasReady = aspectRatioFrameLayout != null && aspectRatioFrameLayout.isDrawingReady();
        this.currentTextureView = textureView;
        if (runnable != null && this.pipRoundVideoView == null) {
            try {
                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                this.pipRoundVideoView = pipRoundVideoView;
                pipRoundVideoView.show(this.baseActivity, new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda57
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.this.cleanupPlayer(true, true);
                    }
                });
            } catch (Exception unused) {
                this.pipRoundVideoView = null;
            }
        }
        PipRoundVideoView pipRoundVideoView2 = this.pipRoundVideoView;
        if (pipRoundVideoView2 != null) {
            this.videoPlayer.setTextureView(pipRoundVideoView2.getTextureView());
        } else {
            this.videoPlayer.setTextureView(this.currentTextureView);
        }
        this.currentAspectRatioFrameLayout = aspectRatioFrameLayout;
        this.currentTextureViewContainer = frameLayout;
        if (!this.currentAspectRatioFrameLayoutReady || aspectRatioFrameLayout == null) {
            return;
        }
        aspectRatioFrameLayout.setAspectRatio(this.currentAspectRatioFrameLayoutRatio, this.currentAspectRatioFrameLayoutRotation);
    }

    public void setBaseActivity(Activity activity, boolean z) {
        if (z) {
            this.baseActivity = activity;
        } else if (this.baseActivity == activity) {
            this.baseActivity = null;
        }
    }

    public void setFeedbackView(View view, boolean z) {
        if (z) {
            this.feedbackView = view;
        } else if (this.feedbackView == view) {
            this.feedbackView = null;
        }
    }

    public void setPlaybackSpeed(boolean z, float f) {
        if (z) {
            if (this.currentMusicPlaybackSpeed >= 6.0f && f == VOLUME_NORMAL && this.playingMessageObject != null) {
                this.audioPlayer.pause();
                final MessageObject messageObject = this.playingMessageObject;
                final float f2 = messageObject.audioProgress;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda20
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.$r8$lambda$zczXvu9JUBk6u4gSaWuhyECCgKk(MediaController.this, messageObject, f2);
                    }
                }, 50L);
            }
            this.currentMusicPlaybackSpeed = f;
            if (Math.abs(f - VOLUME_NORMAL) > 0.001f) {
                this.fastMusicPlaybackSpeed = f;
            }
        } else {
            this.currentPlaybackSpeed = f;
            if (Math.abs(f - VOLUME_NORMAL) > 0.001f) {
                this.fastPlaybackSpeed = f;
            }
        }
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer != null) {
            videoPlayer.setPlaybackSpeed(Math.round(f * 10.0f) / 10.0f);
        } else {
            VideoPlayer videoPlayer2 = this.videoPlayer;
            if (videoPlayer2 != null) {
                videoPlayer2.setPlaybackSpeed(Math.round(f * 10.0f) / 10.0f);
            }
        }
        MessagesController.getGlobalMainSettings().edit().putFloat(z ? "musicPlaybackSpeed" : "playbackSpeed", f).putFloat(z ? "fastMusicPlaybackSpeed" : "fastPlaybackSpeed", z ? this.fastMusicPlaybackSpeed : this.fastPlaybackSpeed).commit();
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.messagePlayingSpeedChanged, new Object[0]);
        if (this.ignorePlayerUpdate) {
            return;
        }
        CastSync.setSpeed(f);
    }

    public static /* synthetic */ void $r8$lambda$zczXvu9JUBk6u4gSaWuhyECCgKk(MediaController mediaController, MessageObject messageObject, float f) {
        if (mediaController.audioPlayer == null || mediaController.playingMessageObject == null || mediaController.isPaused) {
            return;
        }
        if (mediaController.isSamePlayingMessage(messageObject)) {
            mediaController.seekToProgress(mediaController.playingMessageObject, f);
        }
        mediaController.audioPlayer.play();
    }

    public float getPlaybackSpeed(boolean z) {
        return z ? this.currentMusicPlaybackSpeed : this.currentPlaybackSpeed;
    }

    public float getFastPlaybackSpeed(boolean z) {
        return z ? this.fastMusicPlaybackSpeed : this.fastPlaybackSpeed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVideoState(MessageObject messageObject, int[] iArr, boolean z, boolean z2, int i) {
        MessageObject messageObject2;
        if (this.videoPlayer == null) {
            return;
        }
        if (i != 4 && i != 1) {
            try {
                this.baseActivity.getWindow().addFlags(128);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                this.baseActivity.getWindow().clearFlags(128);
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        if (i == 3) {
            this.playerWasReady = true;
            MessageObject messageObject3 = this.playingMessageObject;
            if (messageObject3 != null && (messageObject3.isVideo() || this.playingMessageObject.isRoundVideo())) {
                AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
                FileLoader.getInstance(messageObject.currentAccount).removeLoadingVideo(this.playingMessageObject.getDocument(), true, false);
            }
            this.currentAspectRatioFrameLayoutReady = true;
            return;
        }
        if (i == 2) {
            if (!z2 || (messageObject2 = this.playingMessageObject) == null) {
                return;
            }
            if (messageObject2.isVideo() || this.playingMessageObject.isRoundVideo()) {
                if (this.playerWasReady) {
                    this.setLoadingRunnable.run();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(this.setLoadingRunnable, 1000L);
                    return;
                }
            }
            return;
        }
        if (this.videoPlayer.isPlaying() && i == 4) {
            MessageObject messageObject4 = this.playingMessageObject;
            if (messageObject4 != null && messageObject4.isVideo() && !z && (iArr == null || iArr[0] < 4)) {
                this.videoPlayer.seekTo(0L);
                if (iArr != null) {
                    iArr[0] = iArr[0] + 1;
                    return;
                }
                return;
            }
            if (restoreMusicPlaylistState()) {
                return;
            }
            cleanupPlayer(true, hasNoNextVoiceOrRoundVideoMessage(), true, false);
        }
    }

    public void injectVideoPlayer(VideoPlayer videoPlayer, MessageObject messageObject) {
        if (videoPlayer == null || messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideoForPlayer(messageObject.getDocument(), true);
        this.playerWasReady = false;
        clearPlaylist();
        this.videoPlayer = videoPlayer;
        this.playingMessageObject = messageObject;
        int i = this.playerNum + 1;
        this.playerNum = i;
        videoPlayer.setDelegate(new 7(i, messageObject, null, true));
        this.currentAspectRatioFrameLayoutReady = false;
        TextureView textureView = this.currentTextureView;
        if (textureView != null) {
            this.videoPlayer.setTextureView(textureView);
        }
        checkAudioFocus(messageObject);
        setPlayerVolume();
        this.isPaused = false;
        this.lastProgress = 0L;
        MessageObject messageObject2 = this.playingMessageObject;
        this.playingMessageObject = messageObject;
        if (!SharedConfig.enabledRaiseTo(true)) {
            startRaiseToEarSensors(this.raiseChat);
        }
        startProgressTimer(this.playingMessageObject);
        NotificationCenter.getInstance(messageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingDidStart, messageObject, messageObject2);
    }

    class 7 implements VideoPlayer.VideoPlayerDelegate {
        final /* synthetic */ boolean val$destroyAtEnd;
        final /* synthetic */ MessageObject val$messageObject;
        final /* synthetic */ int[] val$playCount;
        final /* synthetic */ int val$tag;

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onRenderedFirstFrame(this, eventTime);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onSeekFinished(this, eventTime);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onSeekStarted(this, eventTime);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onSurfaceTextureUpdated(this, surfaceTexture);
        }

        7(int i, MessageObject messageObject, int[] iArr, boolean z) {
            this.val$tag = i;
            this.val$messageObject = messageObject;
            this.val$playCount = iArr;
            this.val$destroyAtEnd = z;
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onStateChanged(boolean z, int i) {
            if (this.val$tag != MediaController.this.playerNum) {
                return;
            }
            MediaController.this.updateVideoState(this.val$messageObject, this.val$playCount, this.val$destroyAtEnd, z, i);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onError(VideoPlayer videoPlayer, Exception exc) {
            FileLog.e(exc);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            MediaController.this.currentAspectRatioFrameLayoutRotation = i3;
            if (i3 != 90 && i3 != 270) {
                i2 = i;
                i = i2;
            }
            MediaController.this.currentAspectRatioFrameLayoutRatio = i == 0 ? MediaController.VOLUME_NORMAL : (i2 * f) / i;
            if (MediaController.this.currentAspectRatioFrameLayout != null) {
                MediaController.this.currentAspectRatioFrameLayout.setAspectRatio(MediaController.this.currentAspectRatioFrameLayoutRatio, MediaController.this.currentAspectRatioFrameLayoutRotation);
            }
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onRenderedFirstFrame() {
            if (MediaController.this.currentAspectRatioFrameLayout == null || MediaController.this.currentAspectRatioFrameLayout.isDrawingReady()) {
                return;
            }
            MediaController.this.isDrawingWasReady = true;
            MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
            MediaController.this.currentTextureViewContainer.setTag(1);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            if (MediaController.this.videoPlayer == null) {
                return false;
            }
            if (MediaController.this.pipSwitchingState == 2) {
                if (MediaController.this.currentAspectRatioFrameLayout != null) {
                    if (MediaController.this.isDrawingWasReady) {
                        MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
                    }
                    if (MediaController.this.currentAspectRatioFrameLayout.getParent() == null) {
                        MediaController.this.currentTextureViewContainer.addView(MediaController.this.currentAspectRatioFrameLayout);
                    }
                    if (MediaController.this.currentTextureView.getSurfaceTexture() != surfaceTexture) {
                        MediaController.this.currentTextureView.setSurfaceTexture(surfaceTexture);
                    }
                    MediaController.this.videoPlayer.setTextureView(MediaController.this.currentTextureView);
                }
                MediaController.this.pipSwitchingState = 0;
                return true;
            }
            if (MediaController.this.pipSwitchingState == 1) {
                if (MediaController.this.baseActivity != null) {
                    if (MediaController.this.pipRoundVideoView == null) {
                        try {
                            MediaController.this.pipRoundVideoView = new PipRoundVideoView();
                            MediaController.this.pipRoundVideoView.show(MediaController.this.baseActivity, new Runnable() { // from class: org.telegram.messenger.MediaController$7$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaController.this.cleanupPlayer(true, true);
                                }
                            });
                        } catch (Exception unused) {
                            MediaController.this.pipRoundVideoView = null;
                        }
                    }
                    if (MediaController.this.pipRoundVideoView != null) {
                        if (MediaController.this.pipRoundVideoView.getTextureView().getSurfaceTexture() != surfaceTexture) {
                            MediaController.this.pipRoundVideoView.getTextureView().setSurfaceTexture(surfaceTexture);
                        }
                        MediaController.this.videoPlayer.setTextureView(MediaController.this.pipRoundVideoView.getTextureView());
                    }
                }
                MediaController.this.pipSwitchingState = 0;
                return true;
            }
            if (!PhotoViewer.hasInstance() || !PhotoViewer.getInstance().isInjectingVideoPlayer()) {
                return false;
            }
            PhotoViewer.getInstance().injectVideoPlayerSurface(surfaceTexture);
            return true;
        }
    }

    public void playEmojiSound(final AccountInstance accountInstance, String str, final MessagesController.EmojiSound emojiSound, final boolean z) {
        if (emojiSound == null) {
            return;
        }
        Utilities.stageQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$1bH-_rYWkt8O_x70byciWe3w5KY(MediaController.this, emojiSound, accountInstance, z);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$1bH-_rYWkt8O_x70byciWe3w5KY(final MediaController mediaController, MessagesController.EmojiSound emojiSound, final AccountInstance accountInstance, boolean z) {
        mediaController.getClass();
        final TLRPC.TL_document tL_document = new TLRPC.TL_document();
        tL_document.access_hash = emojiSound.accessHash;
        tL_document.id = emojiSound.id;
        tL_document.mime_type = "sound/ogg";
        tL_document.file_reference = emojiSound.fileReference;
        tL_document.dc_id = accountInstance.getConnectionsManager().getCurrentDatacenterId();
        final File pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(tL_document, true);
        if (!pathToAttach.exists()) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    AccountInstance.this.getFileLoader().loadFile(tL_document, null, 1, 1);
                }
            });
        } else {
            if (z) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$763YunT1UFzzy39lJS99U9GzKsc(MediaController.this, pathToAttach);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$763YunT1UFzzy39lJS99U9GzKsc(MediaController mediaController, File file) {
        mediaController.getClass();
        try {
            int i = mediaController.emojiSoundPlayerNum + 1;
            mediaController.emojiSoundPlayerNum = i;
            VideoPlayer videoPlayer = mediaController.emojiSoundPlayer;
            if (videoPlayer != null) {
                videoPlayer.releasePlayer(true);
            }
            VideoPlayer videoPlayer2 = new VideoPlayer(false, false);
            mediaController.emojiSoundPlayer = videoPlayer2;
            videoPlayer2.setDelegate(mediaController.new 8(i));
            mediaController.emojiSoundPlayer.preparePlayer(Uri.fromFile(file), "other");
            mediaController.emojiSoundPlayer.setStreamType(3);
            mediaController.emojiSoundPlayer.play();
        } catch (Exception e) {
            FileLog.e(e);
            VideoPlayer videoPlayer3 = mediaController.emojiSoundPlayer;
            if (videoPlayer3 != null) {
                videoPlayer3.releasePlayer(true);
                mediaController.emojiSoundPlayer = null;
            }
        }
    }

    class 8 implements VideoPlayer.VideoPlayerDelegate {
        final /* synthetic */ int val$tag;

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onError(VideoPlayer videoPlayer, Exception exc) {
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onRenderedFirstFrame() {
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onRenderedFirstFrame(this, eventTime);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onSeekFinished(this, eventTime);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onSeekStarted(this, eventTime);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return VideoPlayer.VideoPlayerDelegate.-CC.$default$onSurfaceDestroyed(this, surfaceTexture);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onSurfaceTextureUpdated(this, surfaceTexture);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        }

        8(int i) {
            this.val$tag = i;
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onStateChanged(boolean z, final int i) {
            final int i2 = this.val$tag;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$8$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.8.$r8$lambda$Z211aiPP5kOxZvy9oaRDFqSUxVE(MediaController.8.this, i2, i);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$Z211aiPP5kOxZvy9oaRDFqSUxVE(8 r1, int i, int i2) {
            if (i == MediaController.this.emojiSoundPlayerNum && i2 == 4 && MediaController.this.emojiSoundPlayer != null) {
                try {
                    MediaController.this.emojiSoundPlayer.releasePlayer(true);
                    MediaController.this.emojiSoundPlayer = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public void checkVolumeBarUI() {
        if (this.isSilent) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - volumeBarLastTimeShown) < 5000) {
                return;
            }
            AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            int i = this.useFrontSpeaker ? 0 : 3;
            int streamVolume = audioManager.getStreamVolume(i);
            if (streamVolume == 0) {
                audioManager.adjustStreamVolume(i, streamVolume, 1);
                volumeBarLastTimeShown = currentTimeMillis;
            }
        } catch (Exception unused) {
        }
    }

    private void setBluetoothScoOn(boolean z) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (SharedConfig.recordViaSco && !PermissionRequest.hasPermission("android.permission.BLUETOOTH_CONNECT")) {
            SharedConfig.recordViaSco = false;
            SharedConfig.saveConfig();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) && z) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                }
                if (!z && !audioManager.isBluetoothScoOn()) {
                    audioManager.startBluetoothSco();
                    return;
                } else if (z && audioManager.isBluetoothScoOn()) {
                    audioManager.stopBluetoothSco();
                    return;
                }
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th) {
                FileLog.e(th);
                return;
            }
        }
        if (z) {
            return;
        }
        if (!z) {
        }
        if (z) {
        }
    }

    public boolean playMessage(MessageObject messageObject) {
        return playMessage(messageObject, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:270:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x059d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0560 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58, types: [org.telegram.messenger.MessageObject, org.telegram.ui.Components.VideoPlayer] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean playMessage(final MessageObject messageObject, boolean z) {
        long j;
        long j2;
        boolean z2;
        float f;
        File file;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        PipRoundVideoView pipRoundVideoView;
        char c;
        PowerManager.WakeLock wakeLock;
        ?? r2;
        MusicListenReporter musicListenReporter;
        if (messageObject == null) {
            return false;
        }
        this.isSilent = z;
        checkVolumeBarUI();
        if ((this.audioPlayer != null || this.videoPlayer != null) && isSamePlayingMessage(messageObject)) {
            if (this.isPaused) {
                resumeAudio(messageObject);
            }
            if (!SharedConfig.enabledRaiseTo(true)) {
                startRaiseToEarSensors(this.raiseChat);
            }
            return true;
        }
        if (!messageObject.isOut() && messageObject.isContentUnread()) {
            MessagesController.getInstance(messageObject.currentAccount).markMessageContentAsRead(messageObject);
        }
        boolean z5 = !this.playMusicAgain;
        MessageObject messageObject2 = this.playingMessageObject;
        if (messageObject2 != null) {
            boolean saveMusicPlaylistStateIfNeeded = ((messageObject2.isMusic() && messageObject.isVoice()) || messageObject.isRoundVideo() || messageObject.isVideo()) ? saveMusicPlaylistStateIfNeeded() : false;
            if (this.playMusicAgain) {
                j = 1000;
                j2 = -9223372036854775807L;
            } else {
                this.playingMessageObject.resetPlayingProgress();
                j = 1000;
                j2 = -9223372036854775807L;
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
            }
            z2 = saveMusicPlaylistStateIfNeeded;
            z5 = false;
        } else {
            j = 1000;
            j2 = -9223372036854775807L;
            z2 = false;
        }
        cleanupPlayer(z5, false);
        this.shouldSavePositionForCurrentAudio = null;
        this.lastSaveTime = 0L;
        this.playMusicAgain = false;
        this.seekToProgressPending = 0.0f;
        String str3 = messageObject.messageOwner.attachPath;
        if (str3 == null || str3.length() <= 0) {
            f = 0.0f;
            file = null;
            z3 = false;
        } else {
            f = 0.0f;
            File file2 = new File(messageObject.messageOwner.attachPath);
            boolean exists = file2.exists();
            if (exists) {
                file = file2;
                z3 = exists;
            } else {
                z3 = exists;
                file = null;
            }
        }
        final File pathToMessage = file != null ? file : FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner);
        boolean z6 = SharedConfig.streamMedia && !((!messageObject.isMusic() && !messageObject.isRoundVideo() && (!messageObject.isVideo() || !messageObject.canStreamVideo())) || messageObject.shouldEncryptPhotoOrVideo() || DialogObject.isEncryptedDialog(messageObject.getDialogId()));
        if (pathToMessage != file && !(z3 = pathToMessage.exists()) && !z6) {
            FileLoader.getInstance(messageObject.currentAccount).loadFile(messageObject.getDocument(), messageObject, 0, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
            this.downloadingCurrentMessage = true;
            this.isPaused = false;
            this.lastProgress = 0L;
            this.audioInfo = null;
            this.playingMessageObject = messageObject;
            if (canStartMusicPlayerService()) {
                try {
                    ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            } else {
                ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
            }
            NotificationCenter.getInstance(this.playingMessageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
            return true;
        }
        boolean z7 = z3;
        this.downloadingCurrentMessage = false;
        if (messageObject.isMusic()) {
            checkIsNextMusicFileDownloaded(messageObject.currentAccount);
        } else {
            checkIsNextVoiceFileDownloaded(messageObject.currentAccount);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.currentAspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            this.isDrawingWasReady = false;
            aspectRatioFrameLayout.setDrawingReady(false);
        }
        boolean isVideo = messageObject.isVideo();
        boolean z8 = z2;
        if (messageObject.isRoundVideo() || isVideo) {
            FileLoader.getInstance(messageObject.currentAccount).setLoadingVideoForPlayer(messageObject.getDocument(), true);
            this.playerWasReady = false;
            if (isVideo) {
                str = "&id=";
                str2 = "?account=";
                if (messageObject.messageOwner.peer_id.channel_id != 0 || messageObject.audioProgress > 0.1f) {
                    z4 = false;
                    int[] iArr = (isVideo || messageObject.getDuration() > 30.0d) ? null : new int[]{1};
                    if (!z8) {
                        clearPlaylist();
                    }
                    VideoPlayer videoPlayer = new VideoPlayer();
                    this.videoPlayer = videoPlayer;
                    String str4 = str2;
                    videoPlayer.setLooping(z);
                    int i = this.playerNum + 1;
                    this.playerNum = i;
                    this.videoPlayer.setDelegate(new 9(i, messageObject, iArr, z4));
                    this.currentAspectRatioFrameLayoutReady = false;
                    if (this.pipRoundVideoView == null || !MessagesController.getInstance(messageObject.currentAccount).isDialogVisible(messageObject.getDialogId(), messageObject.scheduled)) {
                        if (this.pipRoundVideoView == null) {
                            try {
                                PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                                this.pipRoundVideoView = pipRoundVideoView2;
                                pipRoundVideoView2.show(this.baseActivity, new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda22
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        MediaController.this.cleanupPlayer(true, true);
                                    }
                                });
                            } catch (Exception unused) {
                                this.pipRoundVideoView = null;
                            }
                        }
                        pipRoundVideoView = this.pipRoundVideoView;
                        if (pipRoundVideoView != null) {
                            this.videoPlayer.setTextureView(pipRoundVideoView.getTextureView());
                        }
                    } else {
                        TextureView textureView = this.currentTextureView;
                        if (textureView != null) {
                            this.videoPlayer.setTextureView(textureView);
                        }
                    }
                    if (!z7) {
                        if (!messageObject.mediaExists && pathToMessage != file) {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda23
                                @Override // java.lang.Runnable
                                public final void run() {
                                    NotificationCenter.getInstance(r0.currentAccount).postNotificationName(NotificationCenter.fileLoaded, FileLoader.getAttachFileName(MessageObject.this.getDocument()), pathToMessage);
                                }
                            });
                        }
                        this.videoPlayer.preparePlayer(Uri.fromFile(pathToMessage), "other");
                    } else {
                        try {
                            int fileReference = FileLoader.getInstance(messageObject.currentAccount).getFileReference(messageObject);
                            TLRPC.Document document = messageObject.getDocument();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str4);
                            sb.append(messageObject.currentAccount);
                            sb.append(str);
                            sb.append(document.id);
                            sb.append("&hash=");
                            sb.append(document.access_hash);
                            sb.append("&dc=");
                            sb.append(document.dc_id);
                            sb.append("&size=");
                            sb.append(document.size);
                            sb.append("&mime=");
                            sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                            sb.append("&rid=");
                            sb.append(fileReference);
                            sb.append("&name=");
                            sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
                            sb.append("&reference=");
                            byte[] bArr = document.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb.append(Utilities.bytesToHex(bArr));
                            this.videoPlayer.preparePlayer(Uri.parse("tg://" + messageObject.getFileName() + sb.toString()), "other");
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    if (!messageObject.isRoundVideo()) {
                        this.videoPlayer.setStreamType(this.useFrontSpeaker ? 0 : 3);
                        if (Math.abs(this.currentPlaybackSpeed - VOLUME_NORMAL) > 0.001f) {
                            this.videoPlayer.setPlaybackSpeed(Math.round(this.currentPlaybackSpeed * 10.0f) / 10.0f);
                        }
                        float f2 = messageObject.forceSeekTo;
                        if (f2 >= f) {
                            this.seekToProgressPending = f2;
                            messageObject.audioProgress = f2;
                            messageObject.forceSeekTo = -1.0f;
                        }
                    } else {
                        this.videoPlayer.setStreamType(3);
                    }
                }
            } else {
                str = "&id=";
                str2 = "?account=";
            }
            z4 = true;
            if (isVideo) {
            }
            if (!z8) {
            }
            VideoPlayer videoPlayer2 = new VideoPlayer();
            this.videoPlayer = videoPlayer2;
            String str42 = str2;
            videoPlayer2.setLooping(z);
            int i2 = this.playerNum + 1;
            this.playerNum = i2;
            this.videoPlayer.setDelegate(new 9(i2, messageObject, iArr, z4));
            this.currentAspectRatioFrameLayoutReady = false;
            if (this.pipRoundVideoView == null) {
            }
            if (this.pipRoundVideoView == null) {
            }
            pipRoundVideoView = this.pipRoundVideoView;
            if (pipRoundVideoView != null) {
            }
            if (!z7) {
            }
            if (!messageObject.isRoundVideo()) {
            }
        } else {
            PipRoundVideoView pipRoundVideoView3 = this.pipRoundVideoView;
            if (pipRoundVideoView3 != null) {
                pipRoundVideoView3.close(true);
                this.pipRoundVideoView = null;
            }
            try {
                VideoPlayer videoPlayer3 = new VideoPlayer();
                this.audioPlayer = videoPlayer3;
                final int i3 = this.playerNum + 1;
                this.playerNum = i3;
                videoPlayer3.setDelegate(new VideoPlayer.VideoPlayerDelegate() { // from class: org.telegram.messenger.MediaController.10
                    @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
                    public void onError(VideoPlayer videoPlayer4, Exception exc) {
                    }

                    @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
                    public void onRenderedFirstFrame() {
                    }

                    @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
                    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
                        VideoPlayer.VideoPlayerDelegate.-CC.$default$onRenderedFirstFrame(this, eventTime);
                    }

                    @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
                    public /* bridge */ /* synthetic */ void onSeekFinished(AnalyticsListener.EventTime eventTime) {
                        VideoPlayer.VideoPlayerDelegate.-CC.$default$onSeekFinished(this, eventTime);
                    }

                    @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
                    public /* bridge */ /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
                        VideoPlayer.VideoPlayerDelegate.-CC.$default$onSeekStarted(this, eventTime);
                    }

                    @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
                    public /* bridge */ /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
                        return VideoPlayer.VideoPlayerDelegate.-CC.$default$onSurfaceDestroyed(this, surfaceTexture);
                    }

                    @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
                    public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        VideoPlayer.VideoPlayerDelegate.-CC.$default$onSurfaceTextureUpdated(this, surfaceTexture);
                    }

                    @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
                    public void onVideoSizeChanged(int i4, int i5, int i6, float f3) {
                    }

                    @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
                    public void onStateChanged(boolean z9, int i4) {
                        if (i3 != MediaController.this.playerNum) {
                            return;
                        }
                        if (i4 != 4 && ((i4 != 1 && i4 != 2) || !z9 || messageObject.audioProgress < 0.999f)) {
                            if (MediaController.this.audioPlayer != null && MediaController.this.seekToProgressPending != 0.0f && (i4 == 3 || i4 == 1)) {
                                long duration = (int) (MediaController.this.audioPlayer.getDuration() * MediaController.this.seekToProgressPending);
                                MediaController.this.audioPlayer.seekTo(duration);
                                MediaController.this.lastProgress = duration;
                                MediaController.this.seekToProgressPending = 0.0f;
                            }
                        } else {
                            MessageObject messageObject3 = messageObject;
                            messageObject3.audioProgress = MediaController.VOLUME_NORMAL;
                            NotificationCenter.getInstance(messageObject3.currentAccount).postNotificationName(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(messageObject.getId()), 0);
                            if (!MediaController.this.restoreMusicPlaylistState()) {
                                if (!MediaController.this.playlist.isEmpty() && (MediaController.this.playlist.size() > 1 || !messageObject.isVoice())) {
                                    MediaController.this.playNextMessageWithoutOrder(true);
                                } else {
                                    MediaController mediaController = MediaController.this;
                                    mediaController.cleanupPlayer(true, mediaController.hasNoNextVoiceOrRoundVideoMessage(), messageObject.isVoice(), false);
                                }
                            }
                        }
                        if (MediaController.this.audioPlayer == null || !CastSync.isActive()) {
                            return;
                        }
                        MediaController.this.audioPlayer.setMute(true);
                    }
                });
                this.audioPlayer.setAudioVisualizerDelegate(new VideoPlayer.AudioVisualizerDelegate() { // from class: org.telegram.messenger.MediaController.11
                    @Override // org.telegram.ui.Components.VideoPlayer.AudioVisualizerDelegate
                    public void onVisualizerUpdate(boolean z9, boolean z10, float[] fArr) {
                        Theme.getCurrentAudiVisualizerDrawable().setWaveform(z9, z10, fArr);
                    }

                    @Override // org.telegram.ui.Components.VideoPlayer.AudioVisualizerDelegate
                    public boolean needUpdate() {
                        return Theme.getCurrentAudiVisualizerDrawable().getParentView() != null;
                    }
                });
                if (z7) {
                    if (!messageObject.mediaExists && pathToMessage != file) {
                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda21
                            @Override // java.lang.Runnable
                            public final void run() {
                                NotificationCenter.getInstance(r0.currentAccount).postNotificationName(NotificationCenter.fileLoaded, FileLoader.getAttachFileName(MessageObject.this.getDocument()), pathToMessage);
                            }
                        });
                    }
                    this.audioPlayer.preparePlayer(Uri.fromFile(pathToMessage), "other");
                    this.isStreamingCurrentAudio = false;
                } else {
                    int fileReference2 = FileLoader.getInstance(messageObject.currentAccount).getFileReference(messageObject);
                    TLRPC.Document document2 = messageObject.getDocument();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("?account=");
                    sb2.append(messageObject.currentAccount);
                    sb2.append("&id=");
                    sb2.append(document2.id);
                    sb2.append("&hash=");
                    sb2.append(document2.access_hash);
                    sb2.append("&dc=");
                    sb2.append(document2.dc_id);
                    sb2.append("&size=");
                    sb2.append(document2.size);
                    sb2.append("&mime=");
                    sb2.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                    sb2.append("&rid=");
                    sb2.append(fileReference2);
                    sb2.append("&name=");
                    sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                    sb2.append("&reference=");
                    byte[] bArr2 = document2.file_reference;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    sb2.append(Utilities.bytesToHex(bArr2));
                    this.audioPlayer.preparePlayer(Uri.parse("tg://" + messageObject.getFileName() + sb2.toString()), "other");
                    this.isStreamingCurrentAudio = true;
                }
                if (messageObject.isVoice()) {
                    String fileName = messageObject.getFileName();
                    if (fileName != null && messageObject.getDuration() >= 300.0d) {
                        float f3 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileName, -1.0f);
                        if (f3 > f && f3 < 0.99f) {
                            this.seekToProgressPending = f3;
                            messageObject.audioProgress = f3;
                        }
                        this.shouldSavePositionForCurrentAudio = fileName;
                    }
                    if (Math.abs(this.currentPlaybackSpeed - VOLUME_NORMAL) > 0.001f) {
                        this.audioPlayer.setPlaybackSpeed(Math.round(this.currentPlaybackSpeed * 10.0f) / 10.0f);
                    }
                    this.audioInfo = null;
                    if (!z8) {
                        clearPlaylist();
                    }
                } else {
                    try {
                        this.audioInfo = AudioInfo.getAudioInfo(pathToMessage);
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    String fileName2 = messageObject.getFileName();
                    if (!TextUtils.isEmpty(fileName2) && messageObject.getDuration() >= 600.0d) {
                        float f4 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileName2, -1.0f);
                        if (f4 > f && f4 < 0.999f) {
                            this.seekToProgressPending = f4;
                            messageObject.audioProgress = f4;
                        }
                        this.shouldSavePositionForCurrentAudio = fileName2;
                        if (Math.abs(this.currentMusicPlaybackSpeed - VOLUME_NORMAL) > 0.001f) {
                            this.audioPlayer.setPlaybackSpeed(Math.round(this.currentMusicPlaybackSpeed * 10.0f) / 10.0f);
                        }
                    }
                }
                float f5 = messageObject.forceSeekTo;
                if (f5 >= f) {
                    this.seekToProgressPending = f5;
                    messageObject.audioProgress = f5;
                    messageObject.forceSeekTo = -1.0f;
                }
                if (messageObject.isMusic() && messageObject.getDocument() != null && !DialogObject.isEncryptedDialog(messageObject.getDialogId())) {
                    MusicListenReporter musicListenReporter2 = this.reporter;
                    if (musicListenReporter2 == null || musicListenReporter2.currentAccount != messageObject.currentAccount) {
                        if (musicListenReporter2 != null) {
                            musicListenReporter2.destroy();
                        }
                        this.reporter = new MusicListenReporter(messageObject.currentAccount);
                    }
                    TLRPC.Document document3 = messageObject.getDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document3.id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr3 = document3.file_reference;
                    tL_inputDocument.file_reference = bArr3;
                    if (bArr3 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    this.reporter.setup(tL_inputDocument);
                } else {
                    MusicListenReporter musicListenReporter3 = this.reporter;
                    if (musicListenReporter3 != null) {
                        musicListenReporter3.destroy();
                        this.reporter = null;
                    }
                }
                ExoPlayer exoPlayer = this.audioPlayer.player;
                if (exoPlayer != null && (musicListenReporter = this.reporter) != null) {
                    exoPlayer.addListener(musicListenReporter.getPlayerListener(exoPlayer));
                }
                this.audioPlayer.setStreamType(this.useFrontSpeaker ? 0 : 3);
                this.audioPlayer.play();
                if (!messageObject.isVoice()) {
                    ValueAnimator valueAnimator = this.audioVolumeAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.audioVolumeAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.audioVolume, VOLUME_NORMAL);
                    this.audioVolumeAnimator = ofFloat;
                    ofFloat.addUpdateListener(this.audioVolumeUpdateListener);
                    this.audioVolumeAnimator.setDuration(300L);
                    this.audioVolumeAnimator.start();
                } else {
                    this.audioVolume = VOLUME_NORMAL;
                    setPlayerVolume();
                }
            } catch (Exception e3) {
                FileLog.e(e3);
                NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                int i4 = NotificationCenter.messagePlayingPlayStateChanged;
                MessageObject messageObject3 = this.playingMessageObject;
                notificationCenter.postNotificationName(i4, Integer.valueOf(messageObject3 != null ? messageObject3.getId() : 0));
                if (this.audioPlayer == null) {
                    return false;
                }
                MusicListenReporter musicListenReporter4 = this.reporter;
                if (musicListenReporter4 != null) {
                    musicListenReporter4.destroy();
                    r2 = 0;
                    this.reporter = null;
                } else {
                    r2 = 0;
                }
                this.audioPlayer.releasePlayer(true);
                this.audioPlayer = r2;
                Theme.unrefAudioVisualizeDrawable(this.playingMessageObject);
                this.isPaused = false;
                this.playingMessageObject = r2;
                this.downloadingCurrentMessage = false;
                return false;
            }
        }
        checkAudioFocus(messageObject);
        setPlayerVolume();
        this.isPaused = false;
        this.lastProgress = 0L;
        this.playingMessageObject = messageObject;
        if (!SharedConfig.enabledRaiseTo(true)) {
            startRaiseToEarSensors(this.raiseChat);
        }
        if (ApplicationLoader.mainInterfacePaused || (wakeLock = this.proximityWakeLock) == null || wakeLock.isHeld() || !(this.playingMessageObject.isVoice() || this.playingMessageObject.isRoundVideo())) {
            c = 0;
        } else {
            c = 0;
            SharedConfig.enabledRaiseTo(false);
        }
        startProgressTimer(this.playingMessageObject);
        NotificationCenter notificationCenter2 = NotificationCenter.getInstance(messageObject.currentAccount);
        int i5 = NotificationCenter.messagePlayingDidStart;
        Object[] objArr = new Object[2];
        objArr[c] = messageObject;
        objArr[1] = messageObject2;
        notificationCenter2.postNotificationName(i5, objArr);
        VideoPlayer videoPlayer4 = this.videoPlayer;
        if (videoPlayer4 != null) {
            try {
                if (this.playingMessageObject.audioProgress != f) {
                    long duration = videoPlayer4.getDuration();
                    if (duration == j2) {
                        duration = ((long) this.playingMessageObject.getDuration()) * j;
                    }
                    MessageObject messageObject4 = this.playingMessageObject;
                    int i6 = (int) (duration * messageObject4.audioProgress);
                    int i7 = messageObject4.audioProgressMs;
                    if (i7 != 0) {
                        messageObject4.audioProgressMs = 0;
                        i6 = i7;
                    }
                    this.videoPlayer.seekTo(i6);
                }
            } catch (Exception e4) {
                MessageObject messageObject5 = this.playingMessageObject;
                messageObject5.audioProgress = 0.0f;
                messageObject5.audioProgressSec = 0;
                NotificationCenter.getInstance(messageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
                FileLog.e(e4);
            }
            this.videoPlayer.play();
        } else {
            VideoPlayer videoPlayer5 = this.audioPlayer;
            if (videoPlayer5 != null) {
                try {
                    if (this.playingMessageObject.audioProgress != 0.0f) {
                        long duration2 = videoPlayer5.getDuration();
                        if (duration2 == j2) {
                            duration2 = ((long) this.playingMessageObject.getDuration()) * j;
                        }
                        long j3 = (int) (duration2 * this.playingMessageObject.audioProgress);
                        this.audioPlayer.seekTo(j3);
                        if (!this.ignorePlayerUpdate) {
                            CastSync.seekTo(j3);
                        }
                    }
                } catch (Exception e5) {
                    this.playingMessageObject.resetPlayingProgress();
                    NotificationCenter.getInstance(messageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
                    FileLog.e(e5);
                }
            }
        }
        if (canStartMusicPlayerService()) {
            try {
                ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        } else {
            ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
        }
        try {
            CastSync.check(1);
            if (this.ignorePlayerUpdate) {
                return true;
            }
            if (ChromecastController.getInstance().isCasting()) {
                ChromecastController.getInstance().setCurrentMediaAndCastIfNeeded(getCurrentChromecastMedia());
            }
            CastSync.setPlaying(true);
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
            return true;
        }
    }

    class 9 implements VideoPlayer.VideoPlayerDelegate {
        final /* synthetic */ boolean val$destroyAtEnd;
        final /* synthetic */ MessageObject val$messageObject;
        final /* synthetic */ int[] val$playCount;
        final /* synthetic */ int val$tag;

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onRenderedFirstFrame(this, eventTime);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onSeekFinished(this, eventTime);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onSeekStarted(this, eventTime);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            VideoPlayer.VideoPlayerDelegate.-CC.$default$onSurfaceTextureUpdated(this, surfaceTexture);
        }

        9(int i, MessageObject messageObject, int[] iArr, boolean z) {
            this.val$tag = i;
            this.val$messageObject = messageObject;
            this.val$playCount = iArr;
            this.val$destroyAtEnd = z;
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onStateChanged(boolean z, int i) {
            if (this.val$tag != MediaController.this.playerNum) {
                return;
            }
            MediaController.this.updateVideoState(this.val$messageObject, this.val$playCount, this.val$destroyAtEnd, z, i);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onError(VideoPlayer videoPlayer, Exception exc) {
            FileLog.e(exc);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            MediaController.this.currentAspectRatioFrameLayoutRotation = i3;
            if (i3 != 90 && i3 != 270) {
                i2 = i;
                i = i2;
            }
            MediaController.this.currentAspectRatioFrameLayoutRatio = i == 0 ? MediaController.VOLUME_NORMAL : (i2 * f) / i;
            if (MediaController.this.currentAspectRatioFrameLayout != null) {
                MediaController.this.currentAspectRatioFrameLayout.setAspectRatio(MediaController.this.currentAspectRatioFrameLayoutRatio, MediaController.this.currentAspectRatioFrameLayoutRotation);
            }
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public void onRenderedFirstFrame() {
            if (MediaController.this.currentAspectRatioFrameLayout != null && !MediaController.this.currentAspectRatioFrameLayout.isDrawingReady()) {
                MediaController.this.isDrawingWasReady = true;
                MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
                MediaController.this.currentTextureViewContainer.setTag(1);
            }
            if (MediaController.this.videoPlayer == null || !CastSync.isActive()) {
                return;
            }
            MediaController.this.videoPlayer.setMute(true);
        }

        @Override // org.telegram.ui.Components.VideoPlayer.VideoPlayerDelegate
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            if (MediaController.this.videoPlayer == null) {
                return false;
            }
            if (MediaController.this.pipSwitchingState == 2) {
                if (MediaController.this.currentAspectRatioFrameLayout != null) {
                    if (MediaController.this.isDrawingWasReady) {
                        MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
                    }
                    if (MediaController.this.currentAspectRatioFrameLayout.getParent() == null) {
                        MediaController.this.currentTextureViewContainer.addView(MediaController.this.currentAspectRatioFrameLayout);
                    }
                    if (MediaController.this.currentTextureView.getSurfaceTexture() != surfaceTexture) {
                        MediaController.this.currentTextureView.setSurfaceTexture(surfaceTexture);
                    }
                    MediaController.this.videoPlayer.setTextureView(MediaController.this.currentTextureView);
                }
                MediaController.this.pipSwitchingState = 0;
                return true;
            }
            if (MediaController.this.pipSwitchingState == 1) {
                if (MediaController.this.baseActivity != null) {
                    if (MediaController.this.pipRoundVideoView == null) {
                        try {
                            MediaController.this.pipRoundVideoView = new PipRoundVideoView();
                            MediaController.this.pipRoundVideoView.show(MediaController.this.baseActivity, new Runnable() { // from class: org.telegram.messenger.MediaController$9$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaController.this.cleanupPlayer(true, true);
                                }
                            });
                        } catch (Exception unused) {
                            MediaController.this.pipRoundVideoView = null;
                        }
                    }
                    if (MediaController.this.pipRoundVideoView != null) {
                        if (MediaController.this.pipRoundVideoView.getTextureView().getSurfaceTexture() != surfaceTexture) {
                            MediaController.this.pipRoundVideoView.getTextureView().setSurfaceTexture(surfaceTexture);
                        }
                        MediaController.this.videoPlayer.setTextureView(MediaController.this.pipRoundVideoView.getTextureView());
                    }
                }
                MediaController.this.pipSwitchingState = 0;
                return true;
            }
            if (!PhotoViewer.hasInstance() || !PhotoViewer.getInstance().isInjectingVideoPlayer()) {
                return false;
            }
            PhotoViewer.getInstance().injectVideoPlayerSurface(surfaceTexture);
            return true;
        }
    }

    public void syncCastedPlayer() {
        if (this.playingMessageObject == null) {
            return;
        }
        this.ignorePlayerUpdate = true;
        if (CastSync.isActive() && !CastSync.isUpdatePending()) {
            long position = CastSync.getPosition();
            long progressMs = getProgressMs(this.playingMessageObject);
            if (progressMs >= 0 && position >= 0 && Math.abs(progressMs - position) > 1000) {
                seekToProgressMs(this.playingMessageObject, position);
            }
            if (CastSync.isPlaying()) {
                playMessage(this.playingMessageObject);
            } else {
                pauseMessage(this.playingMessageObject);
            }
            setPlaybackSpeed(true, CastSync.getSpeed());
        }
        setPlayerVolume();
        this.ignorePlayerUpdate = false;
    }

    public long getCurrentPosition() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null) {
            return -1L;
        }
        return getProgressMs(messageObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChromecastMediaVariations getCurrentChromecastMedia() {
        ?? r9;
        Exception e;
        MessageObject messageObject = this.playingMessageObject;
        File file = null;
        if (messageObject == null) {
            return null;
        }
        String musicTitle = messageObject.getMusicTitle();
        String musicAuthor = this.playingMessageObject.getMusicAuthor();
        TLRPC.Document document = this.playingMessageObject.getDocument();
        if (this.playingMessageObject.isRoundVideo() || this.playingMessageObject.isVideo() || this.playingMessageObject.isMusic()) {
            MessageObject messageObject2 = this.playingMessageObject;
            File file2 = (!messageObject2.attachPathExists || messageObject2.messageOwner == null) ? null : new File(this.playingMessageObject.messageOwner.attachPath);
            if (file2 == null || !file2.exists()) {
                file2 = FileLoader.getInstance(this.playingMessageObject.currentAccount).getPathToMessage(this.playingMessageObject.messageOwner);
            }
            if (file2 != null && file2.exists()) {
                String mimeType = this.playingMessageObject.getMimeType();
                Uri parse = Uri.parse("file://" + file2.getAbsolutePath());
                MediaMetadata mediaMetadata = new MediaMetadata();
                AudioInfo audioInfo = this.audioInfo;
                if (audioInfo != null) {
                    if (!TextUtils.isEmpty(audioInfo.getTitle())) {
                        mediaMetadata.putString("com.google.android.gms.cast.metadata.TITLE", this.audioInfo.getTitle());
                    }
                    if (!TextUtils.isEmpty(this.audioInfo.getArtist())) {
                        mediaMetadata.putString("com.google.android.gms.cast.metadata.ARTIST", this.audioInfo.getArtist());
                    }
                    if (!TextUtils.isEmpty(this.audioInfo.getAlbum())) {
                        mediaMetadata.putString("com.google.android.gms.cast.metadata.ALBUM_TITLE", this.audioInfo.getAlbum());
                    }
                    if (!TextUtils.isEmpty(this.audioInfo.getAlbumArtist())) {
                        mediaMetadata.putString("com.google.android.gms.cast.metadata.ALBUM_ARTIST", this.audioInfo.getAlbumArtist());
                    }
                    if (!TextUtils.isEmpty(this.audioInfo.getComposer())) {
                        mediaMetadata.putString("com.google.android.gms.cast.metadata.COMPOSER", this.audioInfo.getComposer());
                    }
                    if (this.audioInfo.getDisc() != 0) {
                        mediaMetadata.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", this.audioInfo.getDisc());
                    }
                    if (this.audioInfo.getTrack() != 0) {
                        mediaMetadata.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", this.audioInfo.getTrack());
                    }
                    if (this.audioInfo.getCover() != null) {
                        File coverFile = this.audioInfo.getCoverFile();
                        if (coverFile == null || !coverFile.exists()) {
                            File makeCacheFile = StoryEntry.makeCacheFile(UserConfig.selectedAccount, "jpg");
                            try {
                                ?? cover = this.audioInfo.getCover();
                                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                r9 = new FileOutputStream(makeCacheFile);
                                try {
                                    cover.compress(compressFormat, 80, r9);
                                    try {
                                        r9.close();
                                    } catch (Exception e2) {
                                        e = e2;
                                        FileLog.e(e);
                                        file = makeCacheFile;
                                        this.audioInfo.setCoverFile(file);
                                        coverFile = file;
                                        if (coverFile != null) {
                                        }
                                        return ChromecastMediaVariations.of(ChromecastMedia.Builder.fromUri(parse, "/player_" + this.playingMessageObject.getId(), mimeType).setTitle(musicTitle).setSubtitle(musicAuthor).setMetadata(mediaMetadata).build());
                                    }
                                    file = makeCacheFile;
                                } catch (Exception e3) {
                                    e = e3;
                                    try {
                                        FileLog.e(e);
                                        if (r9 != 0) {
                                            try {
                                                r9.close();
                                            } catch (Exception e4) {
                                                makeCacheFile = null;
                                                e = e4;
                                                FileLog.e(e);
                                                file = makeCacheFile;
                                                this.audioInfo.setCoverFile(file);
                                                coverFile = file;
                                                if (coverFile != null) {
                                                    mediaMetadata.addImage(new WebImage(Uri.parse(ChromecastFileServer.getUrlToSource(ChromecastFileServer.getHost(), ChromecastController.getInstance().setCover(coverFile)))));
                                                }
                                                return ChromecastMediaVariations.of(ChromecastMedia.Builder.fromUri(parse, "/player_" + this.playingMessageObject.getId(), mimeType).setTitle(musicTitle).setSubtitle(musicAuthor).setMetadata(mediaMetadata).build());
                                            }
                                        }
                                        this.audioInfo.setCoverFile(file);
                                        coverFile = file;
                                        if (coverFile != null) {
                                        }
                                        return ChromecastMediaVariations.of(ChromecastMedia.Builder.fromUri(parse, "/player_" + this.playingMessageObject.getId(), mimeType).setTitle(musicTitle).setSubtitle(musicAuthor).setMetadata(mediaMetadata).build());
                                    } catch (Throwable th) {
                                        th = th;
                                        file = r9;
                                        r9 = file;
                                        if (r9 != 0) {
                                            try {
                                                r9.close();
                                            } catch (Exception e5) {
                                                FileLog.e(e5);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (r9 != 0) {
                                    }
                                    throw th;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                r9 = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                r9 = file;
                                if (r9 != 0) {
                                }
                                throw th;
                            }
                            this.audioInfo.setCoverFile(file);
                            coverFile = file;
                        }
                        if (coverFile != null && coverFile.exists()) {
                            mediaMetadata.addImage(new WebImage(Uri.parse(ChromecastFileServer.getUrlToSource(ChromecastFileServer.getHost(), ChromecastController.getInstance().setCover(coverFile)))));
                        }
                    }
                }
                return ChromecastMediaVariations.of(ChromecastMedia.Builder.fromUri(parse, "/player_" + this.playingMessageObject.getId(), mimeType).setTitle(musicTitle).setSubtitle(musicAuthor).setMetadata(mediaMetadata).build());
            }
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(document != null ? document.id : this.playingMessageObject.getId());
            sb.append("");
            return videoPlayer.getCurrentChromecastMedia(sb.toString(), musicTitle, musicAuthor);
        }
        VideoPlayer videoPlayer2 = this.audioPlayer;
        if (videoPlayer2 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(document != null ? document.id : this.playingMessageObject.getId());
        sb2.append("");
        return videoPlayer2.getCurrentChromecastMedia(sb2.toString(), musicTitle, musicAuthor);
    }

    private boolean canStartMusicPlayerService() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            return ((!messageObject.isMusic() && !this.playingMessageObject.isVoice() && !this.playingMessageObject.isRoundVideo()) || this.playingMessageObject.isVoiceOnce() || this.playingMessageObject.isRoundOnce()) ? false : true;
        }
        return false;
    }

    public void updateSilent(boolean z) {
        this.isSilent = z;
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setLooping(z);
        }
        setPlayerVolume();
        checkVolumeBarUI();
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
            int i = NotificationCenter.messagePlayingPlayStateChanged;
            MessageObject messageObject2 = this.playingMessageObject;
            notificationCenter.postNotificationName(i, Integer.valueOf(messageObject2 != null ? messageObject2.getId() : 0));
        }
    }

    public AudioInfo getAudioInfo() {
        return this.audioInfo;
    }

    public void setPlaybackOrderType(int i) {
        boolean z = SharedConfig.shuffleMusic;
        SharedConfig.setPlaybackOrderType(i);
        boolean z2 = SharedConfig.shuffleMusic;
        if (z != z2) {
            if (z2) {
                buildShuffledPlayList();
                return;
            }
            MessageObject messageObject = this.playingMessageObject;
            if (messageObject != null) {
                int indexOf = this.playlist.indexOf(messageObject);
                this.currentPlaylistNum = indexOf;
                if (indexOf == -1) {
                    clearPlaylist();
                    cleanupPlayer(true, true);
                }
            }
        }
    }

    public boolean isStreamingCurrentAudio() {
        return this.isStreamingCurrentAudio;
    }

    public boolean isCurrentPlayer(VideoPlayer videoPlayer) {
        return this.videoPlayer == videoPlayer || this.audioPlayer == videoPlayer;
    }

    public void tryResumePausedAudio() {
        MessageObject playingMessageObject = getPlayingMessageObject();
        if (playingMessageObject != null && isMessagePaused() && this.wasPlayingAudioBeforePause && (playingMessageObject.isVoice() || playingMessageObject.isMusic())) {
            playMessage(playingMessageObject);
        }
        this.wasPlayingAudioBeforePause = false;
    }

    public boolean pauseMessage(MessageObject messageObject) {
        return pauseMessage(messageObject, true);
    }

    public boolean pauseMessage(MessageObject messageObject, boolean z) {
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && this.playingMessageObject != null && isSamePlayingMessage(messageObject)) {
            stopProgressTimer();
            try {
                if (this.audioPlayer != null) {
                    if (z && !CastSync.isActive() && !this.playingMessageObject.isVoice() && this.playingMessageObject.getDuration() * (VOLUME_NORMAL - this.playingMessageObject.audioProgress) > 1.0d && LaunchActivity.isResumed) {
                        ValueAnimator valueAnimator = this.audioVolumeAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            this.audioVolumeAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(VOLUME_NORMAL, 0.0f);
                        this.audioVolumeAnimator = ofFloat;
                        ofFloat.addUpdateListener(this.audioVolumeUpdateListener);
                        this.audioVolumeAnimator.setDuration(300L);
                        this.audioVolumeAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.MediaController.12
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                if (MediaController.this.audioPlayer != null) {
                                    MediaController.this.audioPlayer.pause();
                                }
                            }
                        });
                        this.audioVolumeAnimator.start();
                    } else {
                        this.audioPlayer.pause();
                    }
                } else {
                    VideoPlayer videoPlayer = this.videoPlayer;
                    if (videoPlayer != null) {
                        videoPlayer.pause();
                    }
                }
                this.isPaused = true;
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                try {
                    CastSync.check(1);
                    if (!this.ignorePlayerUpdate) {
                        if (ChromecastController.getInstance().isCasting()) {
                            ChromecastController.getInstance().setCurrentMediaAndCastIfNeeded(getCurrentChromecastMedia());
                        }
                        CastSync.setPlaying(false);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                return true;
            } catch (Exception e2) {
                FileLog.e(e2);
                this.isPaused = false;
            }
        }
        return false;
    }

    private boolean resumeAudio(MessageObject messageObject) {
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && this.playingMessageObject != null && isSamePlayingMessage(messageObject)) {
            try {
                startProgressTimer(this.playingMessageObject);
                ValueAnimator valueAnimator = this.audioVolumeAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.audioVolumeAnimator.cancel();
                }
                if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.audioVolume, VOLUME_NORMAL);
                    this.audioVolumeAnimator = ofFloat;
                    ofFloat.addUpdateListener(this.audioVolumeUpdateListener);
                    this.audioVolumeAnimator.setDuration(300L);
                    this.audioVolumeAnimator.start();
                } else {
                    this.audioVolume = VOLUME_NORMAL;
                    setPlayerVolume();
                }
                VideoPlayer videoPlayer = this.audioPlayer;
                if (videoPlayer != null) {
                    videoPlayer.play();
                } else {
                    VideoPlayer videoPlayer2 = this.videoPlayer;
                    if (videoPlayer2 != null) {
                        videoPlayer2.play();
                    }
                }
                checkAudioFocus(messageObject);
                this.isPaused = false;
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).postNotificationName(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                try {
                    CastSync.check(1);
                    if (!this.ignorePlayerUpdate) {
                        CastSync.setPlaying(true);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                return true;
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return false;
    }

    public boolean isVideoDrawingReady() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.currentAspectRatioFrameLayout;
        return aspectRatioFrameLayout != null && aspectRatioFrameLayout.isDrawingReady();
    }

    public ArrayList<MessageObject> getPlaylist() {
        return this.playlist;
    }

    public MessagesController.SavedMusicList getMusicList() {
        return this.currentSavedMusicList;
    }

    public boolean isPlayingMessage(MessageObject messageObject) {
        MessageObject messageObject2;
        boolean z;
        if (messageObject != null && messageObject.isRepostPreview) {
            return false;
        }
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && (messageObject2 = this.playingMessageObject) != null) {
            long j = messageObject2.eventId;
            if (j != 0 && j == messageObject.eventId) {
                z = this.downloadingCurrentMessage;
            } else if (isSamePlayingMessage(messageObject)) {
                z = this.downloadingCurrentMessage;
            }
            return !z;
        }
        return false;
    }

    public boolean isPlayingMessageAndReadyToDraw(MessageObject messageObject) {
        return this.isDrawingWasReady && isPlayingMessage(messageObject);
    }

    public boolean isMessagePaused() {
        return this.isPaused || this.downloadingCurrentMessage;
    }

    public boolean isDownloadingCurrentMessage() {
        return this.downloadingCurrentMessage;
    }

    public void setReplyingMessage(MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.recordReplyingMsg = messageObject;
        this.recordReplyingTopMsg = messageObject2;
        this.recordReplyingStory = storyItem;
    }

    public void requestRecordAudioFocus(boolean z) {
        if (z) {
            if (!this.hasRecordAudioFocus && SharedConfig.pauseMusicOnRecord && NotificationsController.audioManager.requestAudioFocus(this.audioRecordFocusChangedListener, 3, 2) == 1) {
                this.hasRecordAudioFocus = true;
                return;
            }
            return;
        }
        if (this.hasRecordAudioFocus) {
            NotificationsController.audioManager.abandonAudioFocus(this.audioRecordFocusChangedListener);
            this.hasRecordAudioFocus = false;
        }
    }

    public void prepareResumedRecording(final int i, final MediaDataController.DraftVoice draftVoice, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final int i2, SendMessageChatArguments sendMessageChatArguments, final long j2, final MessageSuggestionParams messageSuggestionParams) {
        this.manualRecording = false;
        requestRecordAudioFocus(true);
        this.recordQueue.cancelRunnable(this.recordStartRunnable);
        this.recordQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda51
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$Cw0oL6FcNHmSSK70sDVLxkqMtvA(MediaController.this, i2, draftVoice, i, j, j2, messageSuggestionParams, messageObject2, messageObject, storyItem);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Cw0oL6FcNHmSSK70sDVLxkqMtvA(final MediaController mediaController, int i, final MediaDataController.DraftVoice draftVoice, final int i2, final long j, long j2, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        mediaController.setBluetoothScoOn(true);
        mediaController.sendAfterDone = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        mediaController.recordingAudio = tL_document;
        mediaController.recordingGuid = i;
        tL_document.dc_id = TLObject.FLAG_31;
        tL_document.id = draftVoice.id;
        tL_document.user_id = UserConfig.getInstance(i2).getClientUserId();
        TLRPC.TL_document tL_document2 = mediaController.recordingAudio;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        SharedConfig.saveConfig();
        mediaController.recordingAudioFile = new File(draftVoice.path) { // from class: org.telegram.messenger.MediaController.13
            @Override // java.io.File
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file");
                }
                return super.delete();
            }
        };
        FileLoader.getDirectory(4).mkdirs();
        AutoDeleteMediaTask.lockFile(mediaController.recordingAudioFile);
        try {
            mediaController.audioRecorderPaused = true;
            mediaController.recordTimeCount = draftVoice.recordTimeCount;
            mediaController.writtenFrame = draftVoice.writedFrame;
            mediaController.samplesCount = draftVoice.samplesCount;
            mediaController.recordSamples = draftVoice.recordSamples;
            mediaController.recordDialogId = j;
            mediaController.recordMonoForumPeerId = j2;
            mediaController.recordMonoForumSuggestionParams = messageSuggestionParams;
            mediaController.recordTopicId = messageObject == null ? 0L : MessageObject.getTopicId(mediaController.recordingCurrentAccount, messageObject.messageOwner, false);
            mediaController.recordingCurrentAccount = i2;
            mediaController.recordReplyingMsg = messageObject2;
            mediaController.recordReplyingTopMsg = messageObject;
            mediaController.recordReplyingStory = storyItem;
            mediaController.recordSendMessageChatArguments = mediaController.recordSendMessageChatArguments;
            final TLRPC.TL_document tL_document3 = mediaController.recordingAudio;
            final File file = mediaController.recordingAudioFile;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda29
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$UZesZfA8GNB4mLmhBuB2hRd4nF4(MediaController.this, file, tL_document3, draftVoice);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
            mediaController.recordingAudio = null;
            AutoDeleteMediaTask.unlockFile(mediaController.recordingAudioFile);
            mediaController.recordingAudioFile.delete();
            mediaController.recordingAudioFile = null;
            try {
                mediaController.audioRecorder.release();
                mediaController.audioRecorder = null;
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            mediaController.setBluetoothScoOn(false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda30
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$jECJZwsGgWCaVZY8C4czBmC5Jzc(MediaController.this, i2, j);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$jECJZwsGgWCaVZY8C4czBmC5Jzc(MediaController mediaController, int i, long j) {
        mediaController.getClass();
        MediaDataController.getInstance(i).pushDraftVoiceMessage(j, mediaController.recordTopicId, null);
        mediaController.recordStartRunnable = null;
    }

    public static /* synthetic */ void $r8$lambda$UZesZfA8GNB4mLmhBuB2hRd4nF4(MediaController mediaController, File file, TLRPC.TL_document tL_document, MediaDataController.DraftVoice draftVoice) {
        mediaController.getClass();
        if (!file.exists() && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + mediaController.recordTimeCount + " writedFrames" + mediaController.writtenFrame));
        }
        tL_document.date = ConnectionsManager.getInstance(mediaController.recordingCurrentAccount).getCurrentTime();
        tL_document.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        short[] sArr = mediaController.recordSamples;
        byte[] waveform2 = mediaController.getWaveform2(sArr, sArr.length);
        tL_documentAttributeAudio.waveform = waveform2;
        if (waveform2 != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = mediaController.recordTimeCount / 1000.0d;
        tL_document.attributes.clear();
        tL_document.attributes.add(tL_documentAttributeAudio);
        NotificationCenter.getInstance(mediaController.recordingCurrentAccount).postNotificationName(NotificationCenter.recordPaused, new Object[0]);
        NotificationCenter.getInstance(mediaController.recordingCurrentAccount).postNotificationName(NotificationCenter.audioDidSent, Integer.valueOf(mediaController.recordingGuid), tL_document, file.getAbsolutePath(), Boolean.TRUE, Float.valueOf(draftVoice.left), Float.valueOf(draftVoice.right));
    }

    public boolean isRecordingPaused() {
        return this.audioRecorderPaused;
    }

    private File joinRecord() {
        return joinRecord(this.recordingPrevAudioFile, this.recordingAudioFile, this.recordingAudio);
    }

    private File joinRecord(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            File file3 = new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(tL_document)) { // from class: org.telegram.messenger.MediaController.14
                @Override // java.io.File
                public boolean delete() {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("delete voice file (joined)");
                    }
                    return super.delete();
                }
            };
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), file3.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.recordingAudioFile) {
                    this.recordingAudioFile = file3;
                }
                file2 = file3;
            }
            file.delete();
            if (file == this.recordingPrevAudioFile) {
                this.recordingPrevAudioFile = null;
            }
        }
        return file2;
    }

    public void trimCurrentRecording(final long j, final long j2, final Runnable runnable) {
        if (this.recordingAudioFile == null) {
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        final File file = new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) { // from class: org.telegram.messenger.MediaController.15
            @Override // java.io.File
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file (trimmed)");
                }
                return super.delete();
            }
        };
        this.recordQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$QkOQfdXnSVnWq_yL7OOTQ1afGAQ(MediaController.this, file, j, j2, runnable);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$QkOQfdXnSVnWq_yL7OOTQ1afGAQ(MediaController mediaController, File file, long j, long j2, Runnable runnable) {
        if (cropOpusFile(mediaController.recordingAudioFile.getAbsolutePath(), file.getAbsolutePath(), j, j2)) {
            File file2 = mediaController.recordingAudioFile;
            if (file2 != null) {
                file2.delete();
            }
            mediaController.recordingAudioFile = file;
            mediaController.recordTimeCount = j2 - j;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public void toggleRecordingPause(final boolean z) {
        this.recordQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda61
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$v9BoJM4EwEuxkQ7MFNbkHX5uA9U(MediaController.this, z);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$v9BoJM4EwEuxkQ7MFNbkHX5uA9U(final MediaController mediaController, final boolean z) {
        if (mediaController.recordingAudio == null || mediaController.recordingAudioFile == null) {
            return;
        }
        boolean z2 = mediaController.audioRecorderPaused;
        mediaController.audioRecorderPaused = !z2;
        if (!z2) {
            AudioRecord audioRecord = mediaController.audioRecorder;
            if (audioRecord == null) {
                return;
            }
            mediaController.sendAfterDone = 4;
            audioRecord.stop();
            mediaController.audioRecorder.release();
            mediaController.audioRecorder = null;
            mediaController.recordQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda59
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$hiVmb8VeGHagcQhRIk4-KyNEfEs(MediaController.this, z);
                }
            });
            return;
        }
        mediaController.recordQueue.cancelRunnable(mediaController.recordRunnable);
        mediaController.recordQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda60
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$RIUClfgGOUMZiBHEtHs9UbmnkfM(MediaController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$hiVmb8VeGHagcQhRIk4-KyNEfEs(final MediaController mediaController, final boolean z) {
        mediaController.stopRecord();
        final TLRPC.TL_document tL_document = mediaController.recordingAudio;
        final File joinRecord = mediaController.joinRecord(mediaController.recordingPrevAudioFile, mediaController.recordingAudioFile, tL_document);
        if (tL_document == null || joinRecord == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$Qx8OwalCe9VfzQMPYROFgSGryB8(MediaController.this, joinRecord, z, tL_document);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Qx8OwalCe9VfzQMPYROFgSGryB8(MediaController mediaController, File file, boolean z, TLRPC.TL_document tL_document) {
        mediaController.getClass();
        boolean exists = file.exists();
        if (!exists && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + mediaController.recordTimeCount + " writedFrames" + mediaController.writtenFrame));
        }
        if (exists) {
            MediaDataController.getInstance(mediaController.recordingCurrentAccount).pushDraftVoiceMessage(mediaController.recordDialogId, mediaController.recordTopicId, MediaDataController.DraftVoice.of(mediaController, file.getAbsolutePath(), z, 0.0f, VOLUME_NORMAL));
        }
        tL_document.date = ConnectionsManager.getInstance(mediaController.recordingCurrentAccount).getCurrentTime();
        tL_document.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        byte[] waveform = getWaveform(file.getAbsolutePath());
        tL_documentAttributeAudio.waveform = waveform;
        if (waveform != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = mediaController.recordTimeCount / 1000.0d;
        tL_document.attributes.clear();
        tL_document.attributes.add(tL_documentAttributeAudio);
        NotificationCenter.getInstance(mediaController.recordingCurrentAccount).postNotificationName(NotificationCenter.recordPaused, new Object[0]);
        NotificationCenter.getInstance(mediaController.recordingCurrentAccount).postNotificationName(NotificationCenter.audioDidSent, Integer.valueOf(mediaController.recordingGuid), tL_document, file.getAbsolutePath());
        mediaController.requestRecordAudioFocus(false);
    }

    public static /* synthetic */ void $r8$lambda$RIUClfgGOUMZiBHEtHs9UbmnkfM(final MediaController mediaController) {
        mediaController.recordingPrevAudioFile = mediaController.recordingAudioFile;
        File file = new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(mediaController.recordingAudio)) { // from class: org.telegram.messenger.MediaController.16
            @Override // java.io.File
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file (from resume)");
                }
                return super.delete();
            }
        };
        mediaController.recordingAudioFile = file;
        if (mediaController.startRecord(file.getPath(), mediaController.sampleRate) == 0) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda33
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$B1dRkgu0lA5zlpwbtK46jEb6Fp8(MediaController.this);
                }
            });
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cant resume audio encoder");
                return;
            }
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$1ZV6fHc6UMDSJx0GBzxxuCHkoZY(MediaController.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$B1dRkgu0lA5zlpwbtK46jEb6Fp8(MediaController mediaController) {
        mediaController.recordStartRunnable = null;
        NotificationCenter.getInstance(mediaController.recordingCurrentAccount).postNotificationName(NotificationCenter.recordStartError, Integer.valueOf(mediaController.recordingGuid));
    }

    public static /* synthetic */ void $r8$lambda$1ZV6fHc6UMDSJx0GBzxxuCHkoZY(MediaController mediaController) {
        mediaController.requestRecordAudioFocus(true);
        mediaController.audioRecorder = new AudioRecord(0, mediaController.sampleRate, 16, 2, mediaController.recordBufferSize);
        mediaController.recordStartTime = System.currentTimeMillis();
        mediaController.writtenFrame = 0;
        mediaController.samplesCount = 0L;
        mediaController.fileBuffer.rewind();
        mediaController.audioRecorder.startRecording();
        mediaController.recordQueue.postRunnable(mediaController.recordRunnable);
        NotificationCenter.getInstance(mediaController.recordingCurrentAccount).postNotificationName(NotificationCenter.recordResumed, new Object[0]);
    }

    public void startRecording(final int i, final long j, final MessageObject messageObject, final MessageObject messageObject2, final TL_stories.StoryItem storyItem, final int i2, boolean z, final SendMessageChatArguments sendMessageChatArguments, final long j2, final MessageSuggestionParams messageSuggestionParams) {
        MessageObject messageObject3 = this.playingMessageObject;
        boolean z2 = (messageObject3 == null || !isPlayingMessage(messageObject3) || isMessagePaused()) ? false : true;
        this.manualRecording = z;
        requestRecordAudioFocus(true);
        try {
            this.feedbackView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        DispatchQueue dispatchQueue = this.recordQueue;
        Runnable runnable = new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda62
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$ctO9yf9J1MzM4KjyVrEwXkCwcxI(MediaController.this, i, i2, j, j2, messageSuggestionParams, messageObject2, messageObject, storyItem, sendMessageChatArguments);
            }
        };
        this.recordStartRunnable = runnable;
        dispatchQueue.postRunnable(runnable, z2 ? 500L : 50L);
    }

    public static /* synthetic */ void $r8$lambda$ctO9yf9J1MzM4KjyVrEwXkCwcxI(final MediaController mediaController, final int i, final int i2, long j, long j2, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        if (mediaController.audioRecorder != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda52
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$VSskyL1rZHqC4PJ_GizCbBL_rmo(MediaController.this, i, i2);
                }
            });
            return;
        }
        mediaController.setBluetoothScoOn(true);
        mediaController.sendAfterDone = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        mediaController.recordingAudio = tL_document;
        mediaController.recordingGuid = i2;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = TLObject.FLAG_31;
        tL_document.id = SharedConfig.getLastLocalId();
        mediaController.recordingAudio.user_id = UserConfig.getInstance(i).getClientUserId();
        TLRPC.TL_document tL_document2 = mediaController.recordingAudio;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        SharedConfig.saveConfig();
        mediaController.recordingAudioFile = new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(mediaController.recordingAudio)) { // from class: org.telegram.messenger.MediaController.17
            @Override // java.io.File
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file");
                }
                return super.delete();
            }
        };
        FileLoader.getDirectory(4).mkdirs();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start recording internal " + mediaController.recordingAudioFile.getPath() + " " + mediaController.recordingAudioFile.exists());
        }
        AutoDeleteMediaTask.lockFile(mediaController.recordingAudioFile);
        try {
            if (mediaController.startRecord(mediaController.recordingAudioFile.getPath(), mediaController.sampleRate) == 0) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda53
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.$r8$lambda$BXPWXd6BptespgasI2xN_RLaUMk(MediaController.this, i, i2);
                    }
                });
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("cant init encoder");
                    return;
                }
                return;
            }
            mediaController.audioRecorderPaused = false;
            mediaController.audioRecorder = new AudioRecord(0, mediaController.sampleRate, 16, 2, mediaController.recordBufferSize);
            mediaController.recordStartTime = System.currentTimeMillis();
            long j3 = 0;
            mediaController.recordTimeCount = 0L;
            mediaController.writtenFrame = 0;
            mediaController.samplesCount = 0L;
            mediaController.recordDialogId = j;
            mediaController.recordMonoForumPeerId = j2;
            mediaController.recordMonoForumSuggestionParams = messageSuggestionParams;
            if (messageObject != null) {
                j3 = MessageObject.getTopicId(mediaController.recordingCurrentAccount, messageObject.messageOwner, false);
            }
            mediaController.recordTopicId = j3;
            mediaController.recordingCurrentAccount = i;
            mediaController.recordReplyingMsg = messageObject2;
            mediaController.recordReplyingTopMsg = messageObject;
            mediaController.recordReplyingStory = storyItem;
            mediaController.recordSendMessageChatArguments = sendMessageChatArguments;
            mediaController.fileBuffer.rewind();
            mediaController.audioRecorder.startRecording();
            mediaController.recordQueue.postRunnable(mediaController.recordRunnable);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda54
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$IEogT7VImNUF211rQoHU89LBlcU(MediaController.this, i, i2);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
            mediaController.recordingAudio = null;
            mediaController.stopRecord();
            AutoDeleteMediaTask.unlockFile(mediaController.recordingAudioFile);
            mediaController.recordingAudioFile.delete();
            mediaController.recordingAudioFile = null;
            File file = mediaController.recordingPrevAudioFile;
            if (file != null) {
                file.delete();
                mediaController.recordingPrevAudioFile = null;
            }
            try {
                mediaController.audioRecorder.release();
                mediaController.audioRecorder = null;
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            mediaController.setBluetoothScoOn(false);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda55
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$yFIa9VXSvzvSVpXCimob77TRbao(MediaController.this, i, i2);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$VSskyL1rZHqC4PJ_GizCbBL_rmo(MediaController mediaController, int i, int i2) {
        mediaController.recordStartRunnable = null;
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.recordStartError, Integer.valueOf(i2));
    }

    public static /* synthetic */ void $r8$lambda$BXPWXd6BptespgasI2xN_RLaUMk(MediaController mediaController, int i, int i2) {
        mediaController.recordStartRunnable = null;
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.recordStartError, Integer.valueOf(i2));
    }

    public static /* synthetic */ void $r8$lambda$yFIa9VXSvzvSVpXCimob77TRbao(MediaController mediaController, int i, int i2) {
        mediaController.recordStartRunnable = null;
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.recordStartError, Integer.valueOf(i2));
    }

    public static /* synthetic */ void $r8$lambda$IEogT7VImNUF211rQoHU89LBlcU(MediaController mediaController, int i, int i2) {
        mediaController.recordStartRunnable = null;
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.recordStarted, Integer.valueOf(i2), Boolean.TRUE);
    }

    public void generateWaveform(final MessageObject messageObject) {
        final String str = messageObject.getId() + "_" + messageObject.getDialogId();
        final String absolutePath = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner).getAbsolutePath();
        if (this.generatingWaveform.containsKey(str)) {
            return;
        }
        this.generatingWaveform.put(str, messageObject);
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$uOqZpc27AxnS-lAurtfNfaVAfMM(MediaController.this, absolutePath, str, messageObject);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$uOqZpc27AxnS-lAurtfNfaVAfMM(final MediaController mediaController, String str, final String str2, final MessageObject messageObject) {
        mediaController.getClass();
        try {
            final byte[] waveform = getWaveform(str);
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$pRA4OPABOSA7fO8wMDbYPzNEq4Q(MediaController.this, str2, waveform, messageObject);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$pRA4OPABOSA7fO8wMDbYPzNEq4Q(MediaController mediaController, String str, byte[] bArr, MessageObject messageObject) {
        MessageObject remove = mediaController.generatingWaveform.remove(str);
        if (remove == null || bArr == null || remove.getDocument() == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= remove.getDocument().attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = remove.getDocument().attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                documentAttribute.waveform = bArr;
                documentAttribute.flags |= 4;
                break;
            }
            i++;
        }
        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
        tL_messages_messages.messages.add(remove.messageOwner);
        MessagesStorage.getInstance(remove.currentAccount).putMessages((TLRPC.messages_Messages) tL_messages_messages, remove.getDialogId(), -1, 0, false, messageObject.scheduled ? 1 : 0, 0L);
        ArrayList arrayList = new ArrayList();
        arrayList.add(remove);
        NotificationCenter.getInstance(remove.currentAccount).postNotificationName(NotificationCenter.replaceMessagesObjects, Long.valueOf(remove.getDialogId()), arrayList);
    }

    public void cleanRecording(boolean z) {
        File file;
        File file2;
        this.recordingAudio = null;
        AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
        if (z && (file2 = this.recordingAudioFile) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.recordingAudioFile = null;
        if (z && (file = this.recordingPrevAudioFile) != null) {
            file.delete();
        }
        this.recordingPrevAudioFile = null;
        this.manualRecording = false;
        this.raiseToEarRecord = false;
        this.ignoreOnPause = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRecordingInternal(final int i, final boolean z, final int i2, final boolean z2, final long j) {
        final File file;
        if (i != 0 && (file = this.recordingAudioFile) != null) {
            final TLRPC.TL_document tL_document = this.recordingAudio;
            final File file2 = this.recordingPrevAudioFile;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("stop recording internal filename " + this.recordingAudioFile.getPath());
            }
            this.fileEncodingQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$SGlusjxdCTAz-DlYMZHvPaJiPXQ(MediaController.this, file2, file, tL_document, i, z, i2, z2, j);
                }
            });
        } else {
            AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
            File file3 = this.recordingAudioFile;
            if (file3 != null) {
                file3.delete();
            }
            requestRecordAudioFocus(false);
        }
        try {
            AudioRecord audioRecord = this.audioRecorder;
            if (audioRecord != null) {
                audioRecord.release();
                this.audioRecorder = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.recordingAudio = null;
        this.recordingPrevAudioFile = null;
        this.recordingAudioFile = null;
        this.manualRecording = false;
        this.raiseToEarRecord = false;
        this.ignoreOnPause = false;
    }

    public static /* synthetic */ void $r8$lambda$SGlusjxdCTAz-DlYMZHvPaJiPXQ(final MediaController mediaController, File file, File file2, final TLRPC.TL_document tL_document, final int i, final boolean z, final int i2, final boolean z2, final long j) {
        mediaController.stopRecord();
        final File joinRecord = mediaController.joinRecord(file, file2, tL_document);
        if (joinRecord == null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("stop recording internal in queue " + joinRecord.exists() + " " + joinRecord.length());
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda58
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$7UvXG4gWXELzZhIOf-m-2BvXvu4(MediaController.this, joinRecord, tL_document, i, z, i2, z2, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$7UvXG4gWXELzZhIOf-m-2BvXvu4(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i, boolean z, int i2, boolean z2, long j) {
        boolean z3;
        char c;
        String str;
        mediaController.getClass();
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("stop recording internal ");
            if (file == null) {
                str = "null";
            } else {
                str = file.exists() + " " + file.length() + "  recordTimeCount " + mediaController.recordTimeCount + " writedFrames" + mediaController.writtenFrame;
            }
            sb.append(str);
            FileLog.d(sb.toString());
        }
        if ((file == null || !file.exists()) && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + mediaController.recordTimeCount + " writedFrames" + mediaController.writtenFrame));
        }
        MediaDataController.getInstance(mediaController.recordingCurrentAccount).pushDraftVoiceMessage(mediaController.recordDialogId, mediaController.recordTopicId, null);
        tL_document.date = ConnectionsManager.getInstance(mediaController.recordingCurrentAccount).getCurrentTime();
        tL_document.size = file == null ? 0L : (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        byte[] waveform = getWaveform(file.getAbsolutePath());
        tL_documentAttributeAudio.waveform = waveform;
        if (waveform != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        long j2 = mediaController.recordTimeCount;
        tL_documentAttributeAudio.duration = j2 / 1000.0d;
        tL_document.attributes.clear();
        tL_document.attributes.add(tL_documentAttributeAudio);
        if (j2 > 700) {
            if (i == 1) {
                c = 1;
                SendMessagesHelper.SendMessageParams of = SendMessagesHelper.SendMessageParams.of(tL_document, null, file.getAbsolutePath(), mediaController.recordDialogId, mediaController.recordReplyingMsg, mediaController.recordReplyingTopMsg, null, null, null, null, z, i2, 0, z2 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, null, null, false);
                of.monoForumPeer = mediaController.recordMonoForumPeerId;
                of.suggestionParams = mediaController.recordMonoForumSuggestionParams;
                of.replyToStoryItem = mediaController.recordReplyingStory;
                of.sendMessageChatArguments = mediaController.recordSendMessageChatArguments;
                of.payStars = j;
                SendMessagesHelper.getInstance(mediaController.recordingCurrentAccount).sendMessage(of);
            } else {
                c = 1;
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(mediaController.recordingCurrentAccount);
            int i3 = NotificationCenter.audioDidSent;
            Integer valueOf = Integer.valueOf(mediaController.recordingGuid);
            TLRPC.TL_document tL_document2 = i == 2 ? tL_document : null;
            String absolutePath = i == 2 ? file.getAbsolutePath() : null;
            Object[] objArr = new Object[3];
            z3 = false;
            objArr[0] = valueOf;
            objArr[c] = tL_document2;
            objArr[2] = absolutePath;
            notificationCenter.postNotificationName(i3, objArr);
        } else {
            z3 = false;
            NotificationCenter.getInstance(mediaController.recordingCurrentAccount).postNotificationName(NotificationCenter.audioRecordTooShort, Integer.valueOf(mediaController.recordingGuid), Boolean.FALSE, Integer.valueOf((int) j2));
            AutoDeleteMediaTask.unlockFile(file);
            file.delete();
        }
        mediaController.requestRecordAudioFocus(z3);
    }

    public void stopRecording(final int i, final boolean z, final int i2, final boolean z2, final long j) {
        Runnable runnable = this.recordStartRunnable;
        if (runnable != null) {
            this.recordQueue.cancelRunnable(runnable);
            this.recordStartRunnable = null;
        }
        this.recordQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$CHkjT-R2fDjXWcvKPPBRTC9cqKo(MediaController.this, i, z, i2, z2, j);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$CHkjT-R2fDjXWcvKPPBRTC9cqKo(final MediaController mediaController, final int i, boolean z, int i2, boolean z2, long j) {
        if (mediaController.sendAfterDone == 3) {
            mediaController.sendAfterDone = 0;
            mediaController.stopRecordingInternal(i, z, i2, z2, j);
            return;
        }
        AudioRecord audioRecord = mediaController.audioRecorder;
        if (audioRecord == null) {
            mediaController.recordingAudio = null;
            mediaController.manualRecording = false;
            mediaController.raiseToEarRecord = false;
            mediaController.ignoreOnPause = false;
            return;
        }
        try {
            mediaController.sendAfterDone = i;
            mediaController.sendAfterDoneNotify = z;
            mediaController.sendAfterDoneScheduleDate = i2;
            mediaController.sendAfterDoneOnce = z2;
            mediaController.sendAfterDonePayStars = j;
            audioRecord.stop();
            mediaController.setBluetoothScoOn(false);
        } catch (Exception e) {
            FileLog.e(e);
            if (mediaController.recordingAudioFile != null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file");
                }
                mediaController.recordingAudioFile.delete();
            }
        }
        if (i == 0) {
            mediaController.stopRecordingInternal(0, false, 0, false, 0L);
        }
        try {
            mediaController.feedbackView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda56
            @Override // java.lang.Runnable
            public final void run() {
                MediaController mediaController2 = MediaController.this;
                int i3 = i;
                NotificationCenter.getInstance(mediaController2.recordingCurrentAccount).postNotificationName(NotificationCenter.recordStopped, Integer.valueOf(mediaController2.recordingGuid), Integer.valueOf(r6 == 2 ? 1 : 0));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MediaLoader implements NotificationCenter.NotificationCenterDelegate {
        private boolean cancelled;
        private int copiedFiles;
        private AccountInstance currentAccount;
        private boolean finished;
        private float finishedProgress;
        private boolean isMusic;
        private HashMap<String, MessageObject> loadingMessageObjects = new HashMap<>();
        private ArrayList<MessageObject> messageObjects;
        private MessagesStorage.IntCallback onFinishRunnable;
        private AlertDialog progressDialog;
        private CountDownLatch waitingForFile;

        public MediaLoader(Context context, AccountInstance accountInstance, ArrayList<MessageObject> arrayList, MessagesStorage.IntCallback intCallback) {
            this.currentAccount = accountInstance;
            this.messageObjects = arrayList;
            this.onFinishRunnable = intCallback;
            this.isMusic = arrayList.get(0).isMusic();
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoadProgressChanged);
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
            AlertDialog alertDialog = new AlertDialog(context, 2, PhotoViewer.getInstance().isVisible() ? new DarkThemeResourceProvider() : null);
            this.progressDialog = alertDialog;
            alertDialog.setMessage(LocaleController.getString(R.string.Loading));
            this.progressDialog.setCancelable(true);
            this.progressDialog.setCancelDialog(true);
            this.progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda9
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    MediaController.MediaLoader.this.cancelled = true;
                }
            });
        }

        public void start() {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.MediaLoader.$r8$lambda$un9oCPy2gekYxIU01aCtOzgHQ-0(MediaController.MediaLoader.this);
                }
            }, 250L);
            new Thread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.MediaLoader.$r8$lambda$YpyD-kVMW9xW5VReb0-p_bGHuAw(MediaController.MediaLoader.this);
                }
            }).start();
        }

        public static /* synthetic */ void $r8$lambda$un9oCPy2gekYxIU01aCtOzgHQ-0(MediaLoader mediaLoader) {
            if (mediaLoader.finished) {
                return;
            }
            mediaLoader.progressDialog.show();
        }

        public static /* synthetic */ void $r8$lambda$YpyD-kVMW9xW5VReb0-p_bGHuAw(MediaLoader mediaLoader) {
            File externalStoragePublicDirectory;
            File file;
            File pathToMessage;
            File pathToAttach;
            mediaLoader.getClass();
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    int size = mediaLoader.messageObjects.size();
                    for (int i = 0; i < size; i++) {
                        MessageObject messageObject = mediaLoader.messageObjects.get(i);
                        if (!mediaLoader.processLivePhotoMessage(messageObject)) {
                            String str = messageObject.messageOwner.attachPath;
                            TLRPC.Document document = messageObject.getDocument();
                            TLRPC.Document document2 = messageObject.qualityToSave;
                            if (document2 != null) {
                                str = null;
                                document = document2;
                            }
                            String documentFileName = FileLoader.getDocumentFileName(document);
                            if (str != null && str.length() > 0 && !new File(str).exists()) {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                FileLoader fileLoader = FileLoader.getInstance(mediaLoader.currentAccount.getCurrentAccount());
                                TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
                                TLRPC.Document document3 = messageObject.qualityToSave;
                                if (document3 != null) {
                                    pathToAttach = fileLoader.getPathToAttach(document3, null, false, true);
                                } else {
                                    pathToMessage = fileLoader.getPathToMessage(messageObject.messageOwner, true);
                                    if (media instanceof TLRPC.TL_messageMediaDocument) {
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) media;
                                        if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                            pathToAttach = fileLoader.getPathToAttach(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                        }
                                    }
                                    str = pathToMessage.toString();
                                }
                                pathToMessage = pathToAttach;
                                str = pathToMessage.toString();
                            }
                            File file2 = new File(str);
                            if (!file2.exists()) {
                                mediaLoader.waitingForFile = new CountDownLatch(1);
                                mediaLoader.addMessageToLoad(messageObject);
                                mediaLoader.waitingForFile.await();
                            }
                            if (mediaLoader.cancelled) {
                                break;
                            }
                            if (!file2.exists()) {
                                file2 = FileLoader.getInstance(mediaLoader.currentAccount.getCurrentAccount()).getPathToAttach(messageObject.messageOwner, true);
                                StringBuilder sb = new StringBuilder();
                                sb.append("saving file: correcting path from ");
                                sb.append(str);
                                sb.append(" to ");
                                sb.append(file2 == null ? null : file2.getAbsolutePath());
                                FileLog.d(sb.toString());
                            }
                            if (file2 != null && file2.exists()) {
                                MediaController.saveFileInternal(mediaLoader.isMusic ? 3 : 2, file2, documentFileName);
                                mediaLoader.copiedFiles++;
                            }
                        }
                    }
                } else {
                    if (mediaLoader.isMusic) {
                        externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
                    } else {
                        externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    }
                    externalStoragePublicDirectory.mkdir();
                    int size2 = mediaLoader.messageObjects.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        MessageObject messageObject2 = mediaLoader.messageObjects.get(i2);
                        if (!mediaLoader.processLivePhotoMessage(messageObject2)) {
                            TLRPC.Document document4 = messageObject2.getDocument();
                            TLRPC.Document document5 = messageObject2.qualityToSave;
                            if (document5 != null) {
                                document4 = document5;
                            }
                            String documentFileName2 = FileLoader.getDocumentFileName(document4);
                            File file3 = new File(externalStoragePublicDirectory, documentFileName2);
                            if (file3.exists()) {
                                int lastIndexOf = documentFileName2.lastIndexOf(46);
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 10) {
                                        break;
                                    }
                                    File file4 = new File(externalStoragePublicDirectory, lastIndexOf != -1 ? documentFileName2.substring(0, lastIndexOf) + "(" + (i3 + 1) + ")" + documentFileName2.substring(lastIndexOf) : documentFileName2 + "(" + (i3 + 1) + ")");
                                    if (!file4.exists()) {
                                        file3 = file4;
                                        break;
                                    } else {
                                        i3++;
                                        file3 = file4;
                                    }
                                }
                            }
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                            String str2 = messageObject2.messageOwner.attachPath;
                            if (messageObject2.qualityToSave != null) {
                                str2 = null;
                            }
                            if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                str2 = null;
                            }
                            if (messageObject2.qualityToSave != null) {
                                file = FileLoader.getInstance(mediaLoader.currentAccount.getCurrentAccount()).getPathToAttach(messageObject2.qualityToSave, null, false, true);
                            } else {
                                if (str2 == null || str2.length() == 0) {
                                    str2 = FileLoader.getInstance(mediaLoader.currentAccount.getCurrentAccount()).getPathToMessage(messageObject2.messageOwner).toString();
                                }
                                file = new File(str2);
                            }
                            if (!file.exists()) {
                                mediaLoader.waitingForFile = new CountDownLatch(1);
                                mediaLoader.addMessageToLoad(messageObject2);
                                mediaLoader.waitingForFile.await();
                            }
                            if (file.exists()) {
                                mediaLoader.copyFile(file, file3, messageObject2.getMimeType());
                                mediaLoader.copiedFiles++;
                            }
                        }
                    }
                }
                mediaLoader.checkIfFinished();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        private void checkIfFinished() {
            if (this.loadingMessageObjects.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.MediaLoader.$r8$lambda$wO78YhmROdZDaQrZmyfA4QCOM0U(MediaController.MediaLoader.this);
                    }
                });
            }
        }

        public static /* synthetic */ void $r8$lambda$wO78YhmROdZDaQrZmyfA4QCOM0U(final MediaLoader mediaLoader) {
            mediaLoader.getClass();
            try {
                if (mediaLoader.progressDialog.isShowing()) {
                    mediaLoader.progressDialog.dismiss();
                } else {
                    mediaLoader.finished = true;
                }
                if (mediaLoader.onFinishRunnable != null) {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            r0.onFinishRunnable.run(MediaController.MediaLoader.this.copiedFiles);
                        }
                    });
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            mediaLoader.currentAccount.getNotificationCenter().removeObserver(mediaLoader, NotificationCenter.fileLoaded);
            mediaLoader.currentAccount.getNotificationCenter().removeObserver(mediaLoader, NotificationCenter.fileLoadProgressChanged);
            mediaLoader.currentAccount.getNotificationCenter().removeObserver(mediaLoader, NotificationCenter.fileLoadFailed);
        }

        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v5 */
        private boolean processLivePhotoMessage(final MessageObject messageObject) {
            TLRPC.MessageMedia media;
            TLRPC.Photo photo;
            final TLRPC.PhotoSize closestPhotoSizeWithSize;
            Uri contentUri;
            boolean z = false;
            if (!messageObject.isLivePhoto() || (media = MessageObject.getMedia(messageObject.messageOwner)) == null || (photo = media.photo) == null || media.document == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(true), false, null, true)) == null) {
                return false;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.currentAccount.getCurrentAccount());
            File pathToAttach = fileLoader.getPathToAttach(closestPhotoSizeWithSize, null, false, true);
            File pathToAttach2 = fileLoader.getPathToAttach(media.document, null, false, true);
            final ?? r2 = (pathToAttach == null || !pathToAttach.exists()) ? 1 : 0;
            final ?? r6 = (pathToAttach2 == null || !pathToAttach2.exists()) ? 1 : 0;
            int i = r2 + r6;
            if (i > 0) {
                this.waitingForFile = new CountDownLatch(i);
                final TLRPC.Photo photo2 = media.photo;
                final TLRPC.Document document = media.document;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.MediaLoader.$r8$lambda$-lgi5mmQ2tnOVTyY3xeOrXrv1ME(MediaController.MediaLoader.this, r2, closestPhotoSizeWithSize, messageObject, photo2, r6, document);
                    }
                });
                this.waitingForFile.await();
            }
            if (this.cancelled) {
                return true;
            }
            if (pathToAttach == null || !pathToAttach.exists()) {
                pathToAttach = fileLoader.getPathToAttach(closestPhotoSizeWithSize, null, true, true);
            }
            if (pathToAttach2 == null || !pathToAttach2.exists()) {
                pathToAttach2 = fileLoader.getPathToAttach(media.document, null, true, true);
            }
            if (pathToAttach == null || !pathToAttach.exists() || pathToAttach2 == null || !pathToAttach2.exists()) {
                return true;
            }
            String fileExtension = FileLoader.getFileExtension(pathToAttach);
            if (TextUtils.isEmpty(fileExtension)) {
                fileExtension = "jpg";
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension.toLowerCase());
            if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                mimeTypeFromExtension = "image/jpeg";
            }
            String generateFileName = AndroidUtilities.generateFileName(0, fileExtension);
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues = new ContentValues();
                contentUri = MediaStore.Downloads.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                contentValues.put("_display_name", generateFileName);
                contentValues.put("mime_type", mimeTypeFromExtension);
                Uri insert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
                if (insert != null) {
                    OutputStream openOutputStream = ApplicationLoader.applicationContext.getContentResolver().openOutputStream(insert);
                    if (openOutputStream != null) {
                        try {
                            MediaController.writeMotionPhoto(pathToAttach, pathToAttach2, openOutputStream, null);
                            z = !this.cancelled;
                        } finally {
                        }
                    }
                    if (openOutputStream != null) {
                        openOutputStream.close();
                    }
                    if (z) {
                        this.copiedFiles++;
                    } else {
                        try {
                            ApplicationLoader.applicationContext.getContentResolver().delete(insert, null, null);
                        } catch (Exception unused) {
                        }
                    }
                }
            } else {
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Telegram");
                file.mkdirs();
                File file2 = new File(file, generateFileName);
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    MediaController.writeMotionPhoto(pathToAttach, pathToAttach2, fileOutputStream, null);
                    fileOutputStream.close();
                    if (this.cancelled) {
                        file2.delete();
                    } else {
                        ((DownloadManager) ApplicationLoader.applicationContext.getSystemService("download")).addCompletedDownload(file2.getName(), file2.getName(), false, mimeTypeFromExtension, file2.getAbsolutePath(), file2.length(), true);
                        this.copiedFiles++;
                    }
                } finally {
                }
            }
            float size = this.finishedProgress + (100.0f / this.messageObjects.size());
            this.finishedProgress = size;
            final int i2 = (int) size;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.MediaLoader.$r8$lambda$BKowXKuoFEAGYuRDTEA4ZgS9rEE(MediaController.MediaLoader.this, i2);
                }
            });
            return true;
        }

        public static /* synthetic */ void $r8$lambda$-lgi5mmQ2tnOVTyY3xeOrXrv1ME(MediaLoader mediaLoader, boolean z, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z2, TLRPC.Document document) {
            MessageObject messageObject2;
            mediaLoader.getClass();
            if (z) {
                mediaLoader.loadingMessageObjects.put(FileLoader.getAttachFileName(photoSize), messageObject);
                messageObject2 = messageObject;
                mediaLoader.currentAccount.getFileLoader().loadFile(ImageLocation.getForPhoto(photoSize, photo), messageObject2, "jpg", 3, 0);
            } else {
                messageObject2 = messageObject;
            }
            if (z2) {
                mediaLoader.loadingMessageObjects.put(FileLoader.getAttachFileName(document), messageObject2);
                mediaLoader.currentAccount.getFileLoader().loadFile(document, messageObject2, 3, 0);
            }
        }

        public static /* synthetic */ void $r8$lambda$BKowXKuoFEAGYuRDTEA4ZgS9rEE(MediaLoader mediaLoader, int i) {
            mediaLoader.getClass();
            try {
                mediaLoader.progressDialog.setProgress(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        private void addMessageToLoad(final MessageObject messageObject) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.MediaLoader.$r8$lambda$-jZ595KhUHeddw4dGNDDq-KK8IA(MediaController.MediaLoader.this, messageObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$-jZ595KhUHeddw4dGNDDq-KK8IA(MediaLoader mediaLoader, MessageObject messageObject) {
            mediaLoader.getClass();
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.Document document2 = messageObject.qualityToSave;
            if (document2 != null) {
                document = document2;
            }
            if (document == null) {
                return;
            }
            mediaLoader.loadingMessageObjects.put(FileLoader.getAttachFileName(document), messageObject);
            mediaLoader.currentAccount.getFileLoader().loadFile(document, messageObject, 3, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:106:0x0114, code lost:
        
            if (android.text.TextUtils.isEmpty(r2) != false) goto L63;
         */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[Catch: all -> 0x015f, SYNTHETIC, TRY_LEAVE, TryCatch #15 {all -> 0x015f, blocks: (B:58:0x018c, B:57:0x0189, B:97:0x0156, B:113:0x0167, B:53:0x0184), top: B:7:0x0015, inners: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean copyFile(File file, File file2, String str) {
            File file3;
            boolean z;
            FileInputStream fileInputStream;
            FileInputStream fileInputStream2;
            Throwable th;
            Throwable th2;
            String str2;
            String str3;
            if (AndroidUtilities.isInternalUri(Uri.fromFile(file))) {
                return false;
            }
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    file3.delete();
                    return z;
                }
            } catch (Exception e2) {
                e = e2;
                file3 = file2;
            }
            try {
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    try {
                        file3 = file2;
                        try {
                            try {
                                FileChannel channel2 = new FileOutputStream(file3).getChannel();
                                try {
                                    long size = channel.size();
                                    try {
                                        if (AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                            if (this.progressDialog != null) {
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        MediaController.MediaLoader.$r8$lambda$Jrbb5kxNwXd2VdTpLu-gumpxu4E(MediaController.MediaLoader.this);
                                                    }
                                                });
                                            }
                                            if (channel2 != null) {
                                                try {
                                                    channel2.close();
                                                } catch (Throwable th3) {
                                                    th2 = th3;
                                                    fileInputStream2 = fileInputStream;
                                                    z = false;
                                                    if (channel == null) {
                                                    }
                                                }
                                            }
                                            try {
                                                channel.close();
                                                try {
                                                    fileInputStream.close();
                                                    return false;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    z = false;
                                                    FileLog.e(e);
                                                    file3.delete();
                                                    return z;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                fileInputStream2 = fileInputStream;
                                                z = false;
                                                try {
                                                    fileInputStream2.close();
                                                    throw th;
                                                } catch (Throwable th5) {
                                                    th.addSuppressed(th5);
                                                    throw th;
                                                }
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        FileLog.e(th6);
                                    }
                                    long j = 0;
                                    long j2 = 0;
                                    while (j < size && !this.cancelled) {
                                        fileInputStream2 = fileInputStream;
                                        z = false;
                                        try {
                                            channel2.transferFrom(channel, j, Math.min(4096L, size - j));
                                            long j3 = 4096 + j;
                                            if (j3 < size && j2 > SystemClock.elapsedRealtime() - 500) {
                                                j = j3;
                                                fileInputStream = fileInputStream2;
                                            }
                                            long elapsedRealtime = SystemClock.elapsedRealtime();
                                            final int size2 = (int) (this.finishedProgress + (((100.0f / this.messageObjects.size()) * j) / size));
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    MediaController.MediaLoader.$r8$lambda$fiwq_raakPCpIOnnx9UmlXy7dwA(MediaController.MediaLoader.this, size2);
                                                }
                                            });
                                            j2 = elapsedRealtime;
                                            j = j3;
                                            fileInputStream = fileInputStream2;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            Throwable th8 = th;
                                            if (channel2 == null) {
                                                throw th8;
                                            }
                                            try {
                                                channel2.close();
                                                throw th8;
                                            } catch (Throwable th9) {
                                                th8.addSuppressed(th9);
                                                throw th8;
                                            }
                                        }
                                    }
                                    fileInputStream2 = fileInputStream;
                                    z = false;
                                    if (!this.cancelled) {
                                        if (this.isMusic) {
                                            AndroidUtilities.addMediaToGallery(file3);
                                        } else {
                                            DownloadManager downloadManager = (DownloadManager) ApplicationLoader.applicationContext.getSystemService("download");
                                            if (TextUtils.isEmpty(str)) {
                                                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                                                String name = file3.getName();
                                                int lastIndexOf = name.lastIndexOf(46);
                                                if (lastIndexOf != -1) {
                                                    str3 = singleton.getMimeTypeFromExtension(name.substring(lastIndexOf + 1).toLowerCase());
                                                }
                                                str3 = "text/plain";
                                                str2 = str3;
                                            } else {
                                                str2 = str;
                                            }
                                            downloadManager.addCompletedDownload(file3.getName(), file3.getName(), false, str2, file3.getAbsolutePath(), file3.length(), true);
                                        }
                                        float size3 = this.finishedProgress + (100.0f / this.messageObjects.size());
                                        this.finishedProgress = size3;
                                        final int i = (int) size3;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda3
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                MediaController.MediaLoader.$r8$lambda$uktTbqBjw6m1O6ALic-3XnWfCkw(MediaController.MediaLoader.this, i);
                                            }
                                        });
                                        if (channel2 != null) {
                                            channel2.close();
                                        }
                                        channel.close();
                                        fileInputStream2.close();
                                        return true;
                                    }
                                    if (channel2 != null) {
                                        channel2.close();
                                    }
                                    channel.close();
                                    fileInputStream2.close();
                                    file3.delete();
                                    return z;
                                } catch (Throwable th10) {
                                    th = th10;
                                    fileInputStream2 = fileInputStream;
                                    z = false;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                th2 = th;
                                if (channel == null) {
                                    throw th2;
                                }
                                try {
                                    channel.close();
                                    throw th2;
                                } catch (Throwable th12) {
                                    th2.addSuppressed(th12);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            fileInputStream2 = fileInputStream;
                            z = false;
                            th2 = th;
                            if (channel == null) {
                            }
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        file3 = file2;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    file3 = file2;
                    fileInputStream2 = fileInputStream;
                    z = false;
                    th = th;
                    fileInputStream2.close();
                    throw th;
                }
            } catch (Throwable th16) {
                th = th16;
                th = th;
                fileInputStream2.close();
                throw th;
            }
        }

        public static /* synthetic */ void $r8$lambda$Jrbb5kxNwXd2VdTpLu-gumpxu4E(MediaLoader mediaLoader) {
            mediaLoader.getClass();
            try {
                mediaLoader.progressDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static /* synthetic */ void $r8$lambda$fiwq_raakPCpIOnnx9UmlXy7dwA(MediaLoader mediaLoader, int i) {
            mediaLoader.getClass();
            try {
                mediaLoader.progressDialog.setProgress(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static /* synthetic */ void $r8$lambda$uktTbqBjw6m1O6ALic-3XnWfCkw(MediaLoader mediaLoader, int i) {
            mediaLoader.getClass();
            try {
                mediaLoader.progressDialog.setProgress(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.fileLoaded || i == NotificationCenter.fileLoadFailed) {
                if (this.loadingMessageObjects.remove((String) objArr[0]) != null) {
                    this.waitingForFile.countDown();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.fileLoadProgressChanged) {
                if (this.loadingMessageObjects.containsKey((String) objArr[0])) {
                    final int longValue = (int) (this.finishedProgress + (((((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()) / this.messageObjects.size()) * 100.0f));
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$MediaLoader$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaController.MediaLoader.$r8$lambda$YQhBjHx53w4ACKBE4ga-sn70X6k(MediaController.MediaLoader.this, longValue);
                        }
                    });
                }
            }
        }

        public static /* synthetic */ void $r8$lambda$YQhBjHx53w4ACKBE4ga-sn70X6k(MediaLoader mediaLoader, int i) {
            mediaLoader.getClass();
            try {
                mediaLoader.progressDialog.setProgress(i);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void saveFilesFromMessages(Context context, AccountInstance accountInstance, ArrayList<MessageObject> arrayList, MessagesStorage.IntCallback intCallback) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        new MediaLoader(context, accountInstance, arrayList, intCallback).start();
    }

    public static void saveFile(String str, Context context, int i, String str2, String str3) {
        saveFile(str, context, i, str2, str3, null);
    }

    public static void saveFile(String str, Context context, int i, String str2, String str3, Utilities.Callback<Uri> callback) {
        saveFile(str, context, i, str2, str3, callback, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void saveFile(String str, Context context, final int i, final String str2, final String str3, final Utilities.Callback<Uri> callback, boolean z) {
        final File file;
        final AlertDialog alertDialog;
        if (str == null || context == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            File file2 = new File(str);
            if (file2.exists() && !AndroidUtilities.isInternalUri(Uri.fromFile(file2))) {
                file = file2;
                if (file != null) {
                    return;
                }
                final boolean[] zArr = {false};
                if (file.exists()) {
                    final boolean[] zArr2 = new boolean[1];
                    if (i != 0) {
                        try {
                            final AlertDialog alertDialog2 = new AlertDialog(context, 2);
                            alertDialog2.setMessage(LocaleController.getString(R.string.Loading));
                            alertDialog2.setCanceledOnTouchOutside(false);
                            alertDialog2.setCancelable(true);
                            alertDialog2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda14
                                @Override // android.content.DialogInterface.OnCancelListener
                                public final void onCancel(DialogInterface dialogInterface) {
                                    MediaController.$r8$lambda$OQsxk9XIl050Oj7GW5MwSMV4U0M(zArr, dialogInterface);
                                }
                            });
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda15
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaController.$r8$lambda$Iw__r2i1TFcSX1J2MWUisW-w0cI(zArr2, alertDialog2);
                                }
                            }, 250L);
                            alertDialog = alertDialog2;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        new Thread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda16
                            @Override // java.lang.Runnable
                            public final void run() {
                                MediaController.$r8$lambda$fBsru5e_YyNhMhNroeamuu0p-qA(i, file, str2, alertDialog, zArr, str3, callback, zArr2);
                            }
                        }).start();
                        return;
                    }
                    alertDialog = null;
                    new Thread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda16
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaController.$r8$lambda$fBsru5e_YyNhMhNroeamuu0p-qA(i, file, str2, alertDialog, zArr, str3, callback, zArr2);
                        }
                    }).start();
                    return;
                }
                return;
            }
        }
        file = null;
        if (file != null) {
        }
    }

    public static /* synthetic */ void $r8$lambda$OQsxk9XIl050Oj7GW5MwSMV4U0M(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public static /* synthetic */ void $r8$lambda$Iw__r2i1TFcSX1J2MWUisW-w0cI(boolean[] zArr, AlertDialog alertDialog) {
        if (zArr[0]) {
            return;
        }
        alertDialog.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e6 A[Catch: Exception -> 0x001e, TryCatch #7 {Exception -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0220, B:19:0x0026, B:20:0x00e1, B:22:0x00e7, B:23:0x00ea, B:125:0x01de, B:70:0x01e2, B:72:0x01e6, B:75:0x01ee, B:76:0x0211, B:77:0x0218, B:128:0x0045, B:130:0x0064, B:131:0x0071, B:133:0x0084, B:139:0x0096, B:140:0x00d0, B:142:0x00dd, B:145:0x00b9, B:147:0x006b), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$fBsru5e_YyNhMhNroeamuu0p-qA(int i, File file, String str, final AlertDialog alertDialog, boolean[] zArr, String str2, final Utilities.Callback callback, final boolean[] zArr2) {
        File externalStoragePublicDirectory;
        ?? file2;
        String str3;
        char c;
        ?? r25;
        final Uri fromFile;
        Throwable th;
        FileChannel channel;
        long j;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 29) {
                fromFile = saveFileInternal(i, file, null);
                if (fromFile == null) {
                    z = false;
                }
            } else {
                if (i == 0) {
                    File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                    file3.mkdirs();
                    file2 = new File(file3, AndroidUtilities.generateFileName(0, FileLoader.getFileExtension(file)));
                } else if (i == 1) {
                    File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                    file4.mkdirs();
                    file2 = new File(file4, AndroidUtilities.generateFileName(1, FileLoader.getFileExtension(file)));
                } else {
                    if (i == 2) {
                        externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    } else {
                        externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
                    }
                    File file5 = new File(externalStoragePublicDirectory, "Telegram");
                    file5.mkdirs();
                    file2 = new File(file5, str);
                    if (file2.exists()) {
                        int lastIndexOf = str.lastIndexOf(46);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= 10) {
                                break;
                            }
                            if (lastIndexOf != -1) {
                                str3 = str.substring(0, lastIndexOf) + "(" + (i2 + 1) + ")" + str.substring(lastIndexOf);
                            } else {
                                str3 = str + "(" + (i2 + 1) + ")";
                            }
                            File file6 = new File(file5, str3);
                            if (!file6.exists()) {
                                file2 = file6;
                                break;
                            } else {
                                i2++;
                                file2 = file6;
                            }
                        }
                    }
                }
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                long j2 = 500;
                long currentTimeMillis = System.currentTimeMillis() - 500;
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            try {
                                FileChannel channel2 = fileInputStream.getChannel();
                                try {
                                    channel = new FileOutputStream((File) file2).getChannel();
                                    str = file2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    str = file2;
                                    c = 0;
                                }
                                try {
                                    try {
                                        long size = channel2.size();
                                        c = 0;
                                        try {
                                            if (AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                                if (alertDialog != null) {
                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda35
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            MediaController.$r8$lambda$byEPNLpvSxIW0zdApievlt74AmU(AlertDialog.this);
                                                        }
                                                    });
                                                }
                                                if (channel != null) {
                                                    channel.close();
                                                }
                                                channel2.close();
                                                fileInputStream.close();
                                                return;
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                FileLog.e(th3);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                Throwable th5 = th;
                                                if (channel == null) {
                                                    throw th5;
                                                }
                                                try {
                                                    channel.close();
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    th5.addSuppressed(th6);
                                                    throw th5;
                                                }
                                            }
                                        }
                                        long j3 = 0;
                                        while (j3 < size) {
                                            if (zArr[0]) {
                                                break;
                                            }
                                            long j4 = j2;
                                            channel.transferFrom(channel2, j3, Math.min(4096L, size - j3));
                                            long j5 = j3;
                                            if (alertDialog == null || currentTimeMillis > System.currentTimeMillis() - j4) {
                                                j = 4096;
                                            } else {
                                                currentTimeMillis = System.currentTimeMillis();
                                                j = 4096;
                                                final int i3 = (int) ((j5 / size) * 100.0f);
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda36
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        MediaController.$r8$lambda$Q5N9slVmdEuD_WaVRbkRVosrKVc(AlertDialog.this, i3);
                                                    }
                                                });
                                            }
                                            j3 = j5 + j;
                                            j2 = j4;
                                        }
                                        if (channel != null) {
                                            channel.close();
                                        }
                                        channel2.close();
                                        fileInputStream.close();
                                        z = true;
                                        r25 = str;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c = 0;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    Throwable th9 = th;
                                    if (channel2 == null) {
                                        throw th9;
                                    }
                                    try {
                                        channel2.close();
                                        throw th9;
                                    } catch (Throwable th10) {
                                        th9.addSuppressed(th10);
                                        throw th9;
                                    }
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                th = th;
                                try {
                                    fileInputStream.close();
                                    throw th;
                                } catch (Throwable th12) {
                                    th.addSuppressed(th12);
                                    throw th;
                                }
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            str = file2;
                            c = 0;
                            th = th;
                            fileInputStream.close();
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        str = file2;
                        c = 0;
                        FileLog.e(e);
                        z = false;
                        r25 = str;
                        if (zArr[c]) {
                        }
                        if (z) {
                        }
                        fromFile = Uri.fromFile(r25);
                        if (z) {
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda37
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Utilities.Callback.this.run(fromFile);
                                }
                            });
                        }
                        if (alertDialog != null) {
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e(e);
                    z = false;
                    r25 = str;
                    if (zArr[c]) {
                    }
                    if (z) {
                    }
                    fromFile = Uri.fromFile(r25);
                    if (z) {
                    }
                    if (alertDialog != null) {
                    }
                }
                if (zArr[c]) {
                    r25.delete();
                    z = false;
                }
                if (z) {
                    if (i == 2) {
                        ((DownloadManager) ApplicationLoader.applicationContext.getSystemService("download")).addCompletedDownload(r25.getName(), r25.getName(), false, str2, r25.getAbsolutePath(), r25.length(), true);
                    } else {
                        AndroidUtilities.addMediaToGallery(r25.getAbsoluteFile());
                    }
                }
                fromFile = Uri.fromFile(r25);
            }
            if (z && callback != null) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda37
                    @Override // java.lang.Runnable
                    public final void run() {
                        Utilities.Callback.this.run(fromFile);
                    }
                });
            }
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        if (alertDialog != null) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda38
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$ZHv9PpmmBv9GE4-sgOSGeTdEU60(AlertDialog.this, zArr2);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$byEPNLpvSxIW0zdApievlt74AmU(AlertDialog alertDialog) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$Q5N9slVmdEuD_WaVRbkRVosrKVc(AlertDialog alertDialog, int i) {
        try {
            alertDialog.setProgress(i);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$ZHv9PpmmBv9GE4-sgOSGeTdEU60(AlertDialog alertDialog, boolean[] zArr) {
        try {
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            } else {
                zArr[0] = true;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void saveFile(String str, String str2, Context context, final Utilities.Callback<Uri> callback) {
        final AlertDialog alertDialog;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        final File file = new File(str);
        final File file2 = new File(str2);
        if (!file.exists() || !file2.exists()) {
            saveFile(str, context, 0, null, null, callback);
            return;
        }
        if (AndroidUtilities.isInternalUri(Uri.fromFile(file)) || AndroidUtilities.isInternalUri(Uri.fromFile(file2))) {
            return;
        }
        final boolean[] zArr = {false};
        final boolean[] zArr2 = new boolean[1];
        try {
            alertDialog = new AlertDialog(context, 2);
            alertDialog.setMessage(LocaleController.getString(R.string.Loading));
            alertDialog.setCanceledOnTouchOutside(false);
            alertDialog.setCancelable(true);
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda40
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    MediaController.$r8$lambda$CjXRLtZA08b43nTFXIRvNYi28tE(zArr, dialogInterface);
                }
            });
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda41
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.$r8$lambda$z0VjKuIoHlcFvI7UbC2tu6gmm_4(zArr2, alertDialog);
                }
            }, 250L);
        } catch (Exception e) {
            FileLog.e(e);
            alertDialog = null;
        }
        final AlertDialog alertDialog2 = alertDialog;
        new Thread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$UtsV44o-cAZ5LGQgMhKcUlhq-DU(file, file2, zArr, callback, alertDialog2, zArr2);
            }
        }).start();
    }

    public static /* synthetic */ void $r8$lambda$CjXRLtZA08b43nTFXIRvNYi28tE(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public static /* synthetic */ void $r8$lambda$z0VjKuIoHlcFvI7UbC2tu6gmm_4(boolean[] zArr, AlertDialog alertDialog) {
        if (zArr[0]) {
            return;
        }
        alertDialog.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$UtsV44o-cAZ5LGQgMhKcUlhq-DU(File file, File file2, boolean[] zArr, final Utilities.Callback callback, final AlertDialog alertDialog, final boolean[] zArr2) {
        final Uri uri = null;
        boolean z = false;
        try {
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            String generateFileName = AndroidUtilities.generateFileName(0, "jpg");
            ContentValues contentValues = new ContentValues();
            Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
            contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
            contentValues.put("_display_name", generateFileName);
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("mime_type", "image/jpeg");
            Uri insert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                OutputStream openOutputStream = ApplicationLoader.applicationContext.getContentResolver().openOutputStream(insert);
                if (openOutputStream != null) {
                    try {
                        writeMotionPhoto(file, file2, openOutputStream, zArr);
                        z = !zArr[0];
                    } finally {
                    }
                }
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                if (z) {
                    uri = insert;
                } else {
                    try {
                        ApplicationLoader.applicationContext.getContentResolver().delete(insert, null, null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (z && callback != null) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        Utilities.Callback.this.run(uri);
                    }
                });
            }
            if (alertDialog == null) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda12
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.$r8$lambda$xtrxa-7kAAADjJpoj0HDnR0g7dU(AlertDialog.this, zArr2);
                    }
                });
                return;
            }
            return;
        }
        File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
        file3.mkdirs();
        File file4 = new File(file3, AndroidUtilities.generateFileName(0, "jpg"));
        if (!file4.exists()) {
            file4.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file4);
        try {
            writeMotionPhoto(file, file2, fileOutputStream, zArr);
            fileOutputStream.close();
            if (zArr[0]) {
                file4.delete();
            } else {
                AndroidUtilities.addMediaToGallery(file4.getAbsoluteFile());
                uri = Uri.fromFile(file4);
                z = true;
            }
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        Utilities.Callback.this.run(uri);
                    }
                });
            }
            if (alertDialog == null) {
            }
        } finally {
        }
    }

    public static /* synthetic */ void $r8$lambda$xtrxa-7kAAADjJpoj0HDnR0g7dU(AlertDialog alertDialog, boolean[] zArr) {
        try {
            if (alertDialog.isShowing()) {
                alertDialog.dismiss();
            } else {
                zArr[0] = true;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeMotionPhoto(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String buildMotionPhotoXmp = buildMotionPhotoXmp(file2.length());
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = buildMotionPhotoXmp.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length > 65535) {
            throw new IOException("XMP segment too large: " + length);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read();
            int read2 = fileInputStream.read();
            if (read != 255 || read2 != 216) {
                throw new IOException("Not a JPEG: " + file);
            }
            outputStream.write(NotificationCenter.didReceiveSmsCode);
            outputStream.write(NotificationCenter.premiumFloodWaitReceived);
            outputStream.write(NotificationCenter.didReceiveSmsCode);
            outputStream.write(NotificationCenter.botStarsUpdated);
            outputStream.write((length >> 8) & NotificationCenter.didReceiveSmsCode);
            outputStream.write(length & NotificationCenter.didReceiveSmsCode);
            outputStream.write(bytes);
            outputStream.write(bytes2);
            byte[] bArr = new byte[65536];
            while (true) {
                int read3 = fileInputStream.read(bArr);
                if (read3 > 0) {
                    if (zArr == null || !zArr[0]) {
                        outputStream.write(bArr, 0, read3);
                    } else {
                        fileInputStream.close();
                        return;
                    }
                } else {
                    fileInputStream.close();
                    fileInputStream = new FileInputStream(file2);
                    try {
                        byte[] bArr2 = new byte[65536];
                        while (true) {
                            int read4 = fileInputStream.read(bArr2);
                            if (read4 > 0) {
                                if (zArr == null || !zArr[0]) {
                                    outputStream.write(bArr2, 0, read4);
                                } else {
                                    fileInputStream.close();
                                    return;
                                }
                            } else {
                                fileInputStream.close();
                                return;
                            }
                        }
                    } finally {
                    }
                }
            }
        } finally {
        }
    }

    private static String buildMotionPhotoXmp(long j) {
        return "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"" + j + "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Uri saveFileInternal(int i, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String fileExtension = FileLoader.getFileExtension(file);
            String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
            if ((i == 0 || i == 1) && mimeTypeFromExtension != null) {
                if (mimeTypeFromExtension.startsWith("image")) {
                    i = 0;
                }
                if (mimeTypeFromExtension.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    i = 1;
                }
            }
            if (i == 0) {
                if (str == null) {
                    str = AndroidUtilities.generateFileName(0, fileExtension);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i == 1) {
                if (str == null) {
                    str = AndroidUtilities.generateFileName(1, fileExtension);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i == 2) {
                if (str == null) {
                    str = file.getName();
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                contentUri = MediaStore.Downloads.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else {
                if (str == null) {
                    str = file.getName();
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MUSIC, "Telegram") + File.separator);
                contentUri = MediaStore.Audio.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            }
            contentValues.put("mime_type", mimeTypeFromExtension);
            Uri insert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                AndroidUtilities.copyFile(fileInputStream, ApplicationLoader.applicationContext.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00be, code lost:
    
        if (r2 == null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getStickerExt(Uri uri) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
        } catch (Exception unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            if (inputStream2 != null) {
            }
            throw th;
        }
        if (inputStream == null) {
            try {
                try {
                    File file = new File(uri.getPath());
                    if (file.exists()) {
                        inputStream = new FileInputStream(file);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                }
                throw th;
            }
        }
        byte[] bArr = new byte[12];
        if (inputStream.read(bArr, 0, 12) == 12) {
            byte b = bArr[0];
            if (b == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                try {
                    inputStream.close();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                return "png";
            }
            if (b == 31 && bArr[1] == -117) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
                return "tgs";
            }
            String lowerCase = new String(bArr).toLowerCase();
            if (lowerCase.startsWith("riff")) {
                if (lowerCase.endsWith("webp")) {
                    try {
                        inputStream.close();
                    } catch (Exception e5) {
                        FileLog.e(e5);
                    }
                    return "webp";
                }
            }
        }
        try {
            inputStream.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isWebp(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                byte[] bArr = new byte[12];
                if (inputStream.read(bArr, 0, 12) == 12) {
                    String lowerCase = new String(bArr).toLowerCase();
                    if (lowerCase.startsWith("riff")) {
                        if (lowerCase.endsWith("webp")) {
                            try {
                                inputStream.close();
                                return true;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            try {
                inputStream.close();
            } catch (Exception e3) {
                FileLog.e(e3);
            }
            return false;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r1 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isGif(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                byte[] bArr = new byte[3];
                if (inputStream.read(bArr, 0, 3) == 3) {
                    if (new String(bArr).equalsIgnoreCase("gif")) {
                        try {
                            inputStream.close();
                            return true;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return true;
                        }
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            try {
                inputStream.close();
            } catch (Exception e3) {
                FileLog.e(e3);
            }
            return false;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058 A[Catch: Exception -> 0x0052, TryCatch #4 {Exception -> 0x0052, blocks: (B:6:0x0007, B:11:0x0058, B:13:0x0065, B:43:0x004e), top: B:5:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getFileName(Uri uri) {
        Uri uri2;
        if (uri == null) {
            return "";
        }
        try {
            String str = null;
            if (uri.getScheme().equals("content")) {
                try {
                    uri2 = uri;
                    try {
                        Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                        try {
                            if (query.moveToFirst()) {
                                str = query.getString(query.getColumnIndex("_display_name"));
                            }
                            query.close();
                        } finally {
                        }
                    } catch (Exception e) {
                        e = e;
                        FileLog.e(e);
                        if (str == null) {
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    uri2 = uri;
                }
            } else {
                uri2 = uri;
            }
            if (str == null) {
                return str;
            }
            String path = uri2.getPath();
            int lastIndexOf = path.lastIndexOf(47);
            return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
        } catch (Exception e3) {
            FileLog.e(e3);
            return "";
        }
    }

    public static File createFileInCache(String str, String str2) {
        File file;
        try {
            File sharingDirectory = AndroidUtilities.getSharingDirectory();
            sharingDirectory.mkdirs();
            if (AndroidUtilities.isInternalUri(Uri.fromFile(sharingDirectory))) {
                return null;
            }
            int i = 0;
            do {
                File sharingDirectory2 = AndroidUtilities.getSharingDirectory();
                if (i == 0) {
                    file = new File(sharingDirectory2, str);
                } else {
                    int lastIndexOf = str.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        file = new File(sharingDirectory2, str.substring(0, lastIndexOf) + " (" + i + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(sharingDirectory2, str + " (" + i + ")");
                    }
                }
                i++;
            } while (file.exists());
            return file;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static String copyFileToCache(Uri uri, String str) {
        return copyFileToCache(uri, str, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0156, code lost:
    
        r1 = r15.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015a, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015f, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0194 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String copyFileToCache(Uri uri, String str, long j) {
        Throwable th;
        File file;
        FileOutputStream fileOutputStream;
        Exception exc;
        InputStream inputStream;
        File file2;
        Exception e;
        InputStream inputStream2;
        int i;
        Throwable th2;
        Throwable th3;
        String fixFileName;
        File file3;
        int i2;
        String absolutePath;
        int i3 = 0;
        InputStream inputStream3 = null;
        try {
            fixFileName = FileLoader.fixFileName(getFileName(uri));
            if (fixFileName == null) {
                int lastLocalId = SharedConfig.getLastLocalId();
                SharedConfig.saveConfig();
                fixFileName = String.format(Locale.US, "%d.%s", Integer.valueOf(lastLocalId), str);
            }
            file = AndroidUtilities.getSharingDirectory();
        } catch (Exception e2) {
            exc = e2;
            inputStream = null;
            file2 = null;
        } catch (Throwable th4) {
            th = th4;
            file = null;
            fileOutputStream = null;
        }
        try {
            file.mkdirs();
            if (AndroidUtilities.isInternalUri(Uri.fromFile(file))) {
                if (j > 0 && 0 > j) {
                    file.delete();
                }
                return null;
            }
            int i4 = 0;
            do {
                File sharingDirectory = AndroidUtilities.getSharingDirectory();
                if (i4 == 0) {
                    file3 = new File(sharingDirectory, fixFileName);
                } else {
                    int lastIndexOf = fixFileName.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        file = new File(sharingDirectory, fixFileName.substring(0, lastIndexOf) + " (" + i4 + ")" + fixFileName.substring(lastIndexOf));
                        i4++;
                    } else {
                        file3 = new File(sharingDirectory, fixFileName + " (" + i4 + ")");
                    }
                }
                file = file3;
                i4++;
            } while (file.exists());
            inputStream2 = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
            try {
                if (inputStream2 instanceof FileInputStream) {
                    try {
                        if (AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(((FileInputStream) inputStream2).getFD(), null)).intValue())) {
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception e3) {
                                    FileLog.e(e3);
                                }
                            }
                            if (j > 0 && 0 > j) {
                                file.delete();
                            }
                            return null;
                        }
                    } catch (Throwable th5) {
                        FileLog.e(th5);
                    }
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[20480];
                    i2 = 0;
                    while (true) {
                        try {
                            int read = inputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            i2 += read;
                            if (j > 0) {
                                long j2 = i2;
                                if (j2 > j) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception e4) {
                                        FileLog.e(e4);
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e5) {
                                        FileLog.e(e5);
                                    }
                                    if (j > 0 && j2 > j) {
                                        file.delete();
                                    }
                                    return null;
                                }
                            }
                        } catch (Exception e6) {
                            e = e6;
                            i3 = i2;
                            try {
                                FileLog.e(e);
                                if (inputStream2 != null) {
                                }
                                if (fileOutputStream != null) {
                                }
                                if (j > 0) {
                                    file.delete();
                                }
                                return null;
                            } catch (Throwable th6) {
                                th3 = th6;
                                inputStream3 = inputStream2;
                                th = th3;
                                int i5 = i3;
                                th2 = th;
                                inputStream2 = inputStream3;
                                i = i5;
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Exception e8) {
                                        FileLog.e(e8);
                                    }
                                }
                                if (j > 0) {
                                    throw th2;
                                }
                                if (i <= j) {
                                    throw th2;
                                }
                                file.delete();
                                throw th2;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            i3 = i2;
                            i = i3;
                            th2 = th;
                            if (inputStream2 != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            if (j > 0) {
                            }
                        }
                    }
                } catch (Exception e9) {
                    e = e9;
                } catch (Throwable th8) {
                    th = th8;
                }
            } catch (Exception e10) {
                File file4 = file;
                inputStream = inputStream2;
                exc = e10;
                file2 = file4;
                File file5 = file2;
                e = exc;
                inputStream2 = inputStream;
                file = file5;
                fileOutputStream = null;
                FileLog.e(e);
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                if (j > 0 && i3 > j) {
                    file.delete();
                }
                return null;
            } catch (Throwable th9) {
                th3 = th9;
                fileOutputStream = null;
                inputStream3 = inputStream2;
                th = th3;
                int i52 = i3;
                th2 = th;
                inputStream2 = inputStream3;
                i = i52;
                if (inputStream2 != null) {
                }
                if (fileOutputStream != null) {
                }
                if (j > 0) {
                }
            }
            try {
                fileOutputStream.close();
            } catch (Exception e13) {
                FileLog.e(e13);
            }
            if (j > 0 && i2 > j) {
                file.delete();
            }
            return absolutePath;
            if (j > 0) {
                file.delete();
            }
            return absolutePath;
        } catch (Exception e14) {
            exc = e14;
            file2 = file;
            inputStream = null;
        } catch (Throwable th10) {
            th = th10;
            fileOutputStream = null;
            int i522 = i3;
            th2 = th;
            inputStream2 = inputStream3;
            i = i522;
            if (inputStream2 != null) {
            }
            if (fileOutputStream != null) {
            }
            if (j > 0) {
            }
        }
    }

    public static void loadGalleryPhotosAlbums(final int i) {
        Thread thread = new Thread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$z9B-4BHdB6vIEakOD5HH5zsOx40(i);
            }
        });
        thread.setPriority(1);
        thread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0353, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0357, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0396, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0351, code lost:
    
        if (r15 != null) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (r15 == 0) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0393, code lost:
    
        if (r15 == null) goto L159;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0541 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0556 A[LOOP:0: B:49:0x0550->B:51:0x0556, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x052d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $r8$lambda$z9B-4BHdB6vIEakOD5HH5zsOx40(int i) {
        SparseArray sparseArray;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str9;
        Cursor cursor;
        AlbumEntry albumEntry;
        AlbumEntry albumEntry2;
        Object obj;
        ArrayList arrayList3;
        AlbumEntry albumEntry3;
        AlbumEntry albumEntry4;
        int i2;
        Context context;
        int i3;
        int i4;
        int i5;
        AlbumEntry albumEntry5;
        int i6;
        int checkSelfPermission;
        int checkSelfPermission2;
        int checkSelfPermission3;
        int checkSelfPermission4;
        Context context2;
        int i7;
        ArrayList arrayList4;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int columnIndex7;
        int columnIndex8;
        int i8;
        int i9;
        int i10;
        AlbumEntry albumEntry6;
        AlbumEntry albumEntry7;
        int i11;
        int i12;
        AlbumEntry albumEntry8;
        AlbumEntry albumEntry9;
        Cursor cursor2;
        int checkSelfPermission5;
        int checkSelfPermission6;
        int checkSelfPermission7;
        int checkSelfPermission8;
        StringBuilder sb;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = arrayList5;
        SparseArray sparseArray3 = new SparseArray();
        SparseArray sparseArray4 = new SparseArray();
        AlbumEntry albumEntry10 = null;
        try {
            sb = new StringBuilder();
            sparseArray = sparseArray4;
        } catch (Exception e) {
            e = e;
            sparseArray = sparseArray4;
        }
        try {
            sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
            sb.append("/Camera/");
            str = sb.toString();
        } catch (Exception e2) {
            e = e2;
            FileLog.e(e);
            str = null;
            context2 = ApplicationLoader.applicationContext;
            i7 = Build.VERSION.SDK_INT;
            arrayList4 = arrayList6;
            if (i7 >= 23) {
            }
            ContentResolver contentResolver = context2.getContentResolver();
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] strArr = projectionPhotos;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i7 <= 28 ? "date_modified" : "datetaken");
            sb2.append(" DESC");
            cursor = MediaStore.Images.Media.query(contentResolver, uri, strArr, null, null, sb2.toString());
            if (cursor == null) {
            }
        }
        try {
            context2 = ApplicationLoader.applicationContext;
            i7 = Build.VERSION.SDK_INT;
            arrayList4 = arrayList6;
            if (i7 >= 23) {
                if (i7 < 33) {
                    try {
                        checkSelfPermission5 = context2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                        if (checkSelfPermission5 != 0) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        str2 = "height";
                        str3 = "width";
                        str4 = "orientation";
                        str5 = "_data";
                        str6 = "bucket_display_name";
                        str7 = "bucket_id";
                        str8 = "_id";
                        arrayList2 = arrayList7;
                        sparseArray2 = sparseArray3;
                        cursor = null;
                        albumEntry = null;
                        albumEntry2 = null;
                        obj = null;
                        str9 = str;
                        arrayList = arrayList4;
                        try {
                            FileLog.e(th);
                        } finally {
                        }
                    }
                }
                if (i7 >= 33) {
                    checkSelfPermission6 = context2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES");
                    if (checkSelfPermission6 != 0) {
                        checkSelfPermission7 = context2.checkSelfPermission("android.permission.READ_MEDIA_VIDEO");
                        if (checkSelfPermission7 != 0) {
                            checkSelfPermission8 = context2.checkSelfPermission("android.permission.READ_MEDIA_AUDIO");
                        }
                    }
                }
                str2 = "height";
                str3 = "width";
                str4 = "orientation";
                str5 = "_data";
                str6 = "bucket_display_name";
                str7 = "bucket_id";
                str8 = "_id";
                arrayList2 = arrayList7;
                sparseArray2 = sparseArray3;
                cursor = null;
                albumEntry = null;
                albumEntry2 = null;
                obj = null;
                str9 = str;
                arrayList = arrayList4;
            }
        } catch (Throwable th2) {
            th = th2;
            str2 = "height";
            str3 = "width";
            str4 = "orientation";
            str5 = "_data";
            str6 = "bucket_display_name";
            str7 = "bucket_id";
            str8 = "_id";
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            sparseArray2 = sparseArray3;
            str9 = str;
        }
        try {
            ContentResolver contentResolver2 = context2.getContentResolver();
            Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = projectionPhotos;
            StringBuilder sb22 = new StringBuilder();
            sb22.append(i7 <= 28 ? "date_modified" : "datetaken");
            sb22.append(" DESC");
            cursor = MediaStore.Images.Media.query(contentResolver2, uri2, strArr2, null, null, sb22.toString());
            if (cursor == null) {
                try {
                    columnIndex = cursor.getColumnIndex("_id");
                    str8 = "_id";
                    try {
                        columnIndex2 = cursor.getColumnIndex("bucket_id");
                        str7 = "bucket_id";
                        try {
                            columnIndex3 = cursor.getColumnIndex("bucket_display_name");
                            str6 = "bucket_display_name";
                            try {
                                columnIndex4 = cursor.getColumnIndex("_data");
                                str5 = "_data";
                                try {
                                    columnIndex5 = cursor.getColumnIndex(i7 > 28 ? "date_modified" : "datetaken");
                                    columnIndex6 = cursor.getColumnIndex("orientation");
                                    str4 = "orientation";
                                    try {
                                        columnIndex7 = cursor.getColumnIndex("width");
                                        str3 = "width";
                                        try {
                                            columnIndex8 = cursor.getColumnIndex("height");
                                            str2 = "height";
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str2 = "height";
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str2 = "height";
                                        str3 = "width";
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    str2 = "height";
                                    str3 = "width";
                                    str4 = "orientation";
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                str2 = "height";
                                str3 = "width";
                                str4 = "orientation";
                                str5 = "_data";
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            str2 = "height";
                            str3 = "width";
                            str4 = "orientation";
                            str5 = "_data";
                            str6 = "bucket_display_name";
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        str2 = "height";
                        str3 = "width";
                        str4 = "orientation";
                        str5 = "_data";
                        str6 = "bucket_display_name";
                        str7 = "bucket_id";
                    }
                } catch (Throwable th9) {
                    th = th9;
                    str2 = "height";
                    str3 = "width";
                    str4 = "orientation";
                    str5 = "_data";
                    str6 = "bucket_display_name";
                    str7 = "bucket_id";
                    str8 = "_id";
                }
                try {
                    int columnIndex9 = cursor.getColumnIndex("_size");
                    albumEntry = null;
                    albumEntry2 = null;
                    obj = null;
                    Integer num = null;
                    while (cursor.moveToNext()) {
                        try {
                            String string = cursor.getString(columnIndex4);
                            if (!TextUtils.isEmpty(string)) {
                                int i13 = cursor.getInt(columnIndex);
                                int i14 = cursor.getInt(columnIndex2);
                                int i15 = columnIndex;
                                String string2 = cursor.getString(columnIndex3);
                                PhotoEntry photoEntry = new PhotoEntry(i14, i13, cursor.getLong(columnIndex5), string, cursor.getInt(columnIndex6), 0, false, cursor.getInt(columnIndex7), cursor.getInt(columnIndex8), cursor.getLong(columnIndex9));
                                int i16 = columnIndex8;
                                int i17 = columnIndex7;
                                int i18 = columnIndex9;
                                if (albumEntry == null) {
                                    i8 = columnIndex5;
                                    try {
                                        i9 = columnIndex4;
                                        i10 = columnIndex3;
                                        albumEntry6 = new AlbumEntry(0, LocaleController.getString(R.string.AllPhotos), photoEntry);
                                        arrayList = arrayList4;
                                        try {
                                            arrayList.add(0, albumEntry6);
                                        } catch (Throwable th10) {
                                            th = th10;
                                            albumEntry = albumEntry6;
                                            arrayList2 = arrayList7;
                                            sparseArray2 = sparseArray3;
                                            str9 = str;
                                            FileLog.e(th);
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        arrayList = arrayList4;
                                    }
                                } else {
                                    i8 = columnIndex5;
                                    i9 = columnIndex4;
                                    i10 = columnIndex3;
                                    arrayList = arrayList4;
                                    albumEntry6 = albumEntry;
                                }
                                if (albumEntry2 == null) {
                                    try {
                                        i11 = columnIndex2;
                                        i12 = columnIndex6;
                                        albumEntry7 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                        arrayList2 = arrayList7;
                                        try {
                                            arrayList2.add(0, albumEntry7);
                                        } catch (Throwable th12) {
                                            th = th12;
                                            albumEntry = albumEntry6;
                                            albumEntry2 = albumEntry7;
                                            sparseArray2 = sparseArray3;
                                            str9 = str;
                                            FileLog.e(th);
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        arrayList2 = arrayList7;
                                        albumEntry = albumEntry6;
                                    }
                                } else {
                                    i11 = columnIndex2;
                                    i12 = columnIndex6;
                                    arrayList2 = arrayList7;
                                    albumEntry7 = albumEntry2;
                                }
                                try {
                                    cursor2 = cursor;
                                    if (albumEntry6.photos.size() < 15) {
                                        try {
                                            photoEntry.isLivePhoto();
                                        } catch (Throwable th14) {
                                            th = th14;
                                            albumEntry = albumEntry6;
                                            albumEntry2 = albumEntry7;
                                            cursor = cursor2;
                                            sparseArray2 = sparseArray3;
                                            str9 = str;
                                            FileLog.e(th);
                                        }
                                    }
                                    try {
                                        albumEntry6.addPhoto(photoEntry);
                                        albumEntry7.addPhoto(photoEntry);
                                        sparseArray2 = sparseArray3;
                                    } catch (Throwable th15) {
                                        th = th15;
                                        sparseArray2 = sparseArray3;
                                    }
                                } catch (Throwable th16) {
                                    th = th16;
                                    sparseArray2 = sparseArray3;
                                    albumEntry8 = albumEntry6;
                                    str9 = str;
                                    albumEntry9 = albumEntry7;
                                }
                                try {
                                    AlbumEntry albumEntry11 = (AlbumEntry) sparseArray2.get(i14);
                                    if (albumEntry11 == null) {
                                        albumEntry11 = new AlbumEntry(i14, string2, photoEntry);
                                        sparseArray2.put(i14, albumEntry11);
                                        if (obj != null || str == null || string == null) {
                                            albumEntry8 = albumEntry6;
                                            str9 = str;
                                        } else {
                                            albumEntry8 = albumEntry6;
                                            str9 = str;
                                            try {
                                                if (string.startsWith(str9)) {
                                                    albumEntry9 = albumEntry7;
                                                    try {
                                                        arrayList2.add(0, albumEntry11);
                                                        obj = Integer.valueOf(i14);
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        cursor = cursor2;
                                                        albumEntry = albumEntry8;
                                                        albumEntry2 = albumEntry9;
                                                        FileLog.e(th);
                                                    }
                                                }
                                            } catch (Throwable th18) {
                                                th = th18;
                                                albumEntry9 = albumEntry7;
                                                cursor = cursor2;
                                                albumEntry = albumEntry8;
                                                albumEntry2 = albumEntry9;
                                                FileLog.e(th);
                                            }
                                        }
                                        albumEntry9 = albumEntry7;
                                        arrayList2.add(albumEntry11);
                                    } else {
                                        albumEntry8 = albumEntry6;
                                        str9 = str;
                                        albumEntry9 = albumEntry7;
                                    }
                                    albumEntry11.addPhoto(photoEntry);
                                    SparseArray sparseArray5 = sparseArray;
                                    AlbumEntry albumEntry12 = (AlbumEntry) sparseArray5.get(i14);
                                    if (albumEntry12 == null) {
                                        albumEntry12 = new AlbumEntry(i14, string2, photoEntry);
                                        sparseArray5.put(i14, albumEntry12);
                                        if (num == null && str9 != null && string != null && string.startsWith(str9)) {
                                            arrayList.add(0, albumEntry12);
                                            num = Integer.valueOf(i14);
                                        } else {
                                            arrayList.add(albumEntry12);
                                        }
                                    }
                                    albumEntry12.addPhoto(photoEntry);
                                    sparseArray = sparseArray5;
                                    cursor = cursor2;
                                    albumEntry = albumEntry8;
                                    albumEntry2 = albumEntry9;
                                    columnIndex = i15;
                                    columnIndex8 = i16;
                                    columnIndex7 = i17;
                                    columnIndex9 = i18;
                                    columnIndex3 = i10;
                                    str = str9;
                                    arrayList7 = arrayList2;
                                    sparseArray3 = sparseArray2;
                                    columnIndex6 = i12;
                                    columnIndex5 = i8;
                                    columnIndex2 = i11;
                                    arrayList4 = arrayList;
                                    columnIndex4 = i9;
                                } catch (Throwable th19) {
                                    th = th19;
                                    albumEntry8 = albumEntry6;
                                    str9 = str;
                                    albumEntry9 = albumEntry7;
                                    cursor = cursor2;
                                    albumEntry = albumEntry8;
                                    albumEntry2 = albumEntry9;
                                    FileLog.e(th);
                                }
                            }
                        } catch (Throwable th20) {
                            th = th20;
                            arrayList2 = arrayList7;
                            sparseArray2 = sparseArray3;
                            str9 = str;
                            arrayList = arrayList4;
                        }
                    }
                    arrayList2 = arrayList7;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList = arrayList4;
                } catch (Throwable th21) {
                    th = th21;
                    arrayList2 = arrayList7;
                    sparseArray2 = sparseArray3;
                    str9 = str;
                    arrayList = arrayList4;
                    albumEntry = null;
                    albumEntry2 = albumEntry;
                    obj = albumEntry2;
                    FileLog.e(th);
                }
            } else {
                str2 = "height";
                str3 = "width";
                str4 = "orientation";
                str5 = "_data";
                str6 = "bucket_display_name";
                str7 = "bucket_id";
                str8 = "_id";
                arrayList2 = arrayList7;
                sparseArray2 = sparseArray3;
                str9 = str;
                arrayList = arrayList4;
                albumEntry = null;
                albumEntry2 = null;
                obj = null;
            }
        } catch (Throwable th22) {
            th = th22;
            str2 = "height";
            str3 = "width";
            str4 = "orientation";
            str5 = "_data";
            str6 = "bucket_display_name";
            str7 = "bucket_id";
            str8 = "_id";
            arrayList2 = arrayList7;
            sparseArray2 = sparseArray3;
            str9 = str;
            arrayList = arrayList4;
            cursor = null;
            albumEntry = null;
            albumEntry2 = albumEntry;
            obj = albumEntry2;
            FileLog.e(th);
        }
        AlbumEntry albumEntry13 = albumEntry;
        try {
            context = ApplicationLoader.applicationContext;
            i3 = Build.VERSION.SDK_INT;
        } catch (Throwable th23) {
            th = th23;
            arrayList3 = arrayList;
        }
        if (i3 >= 23) {
            if (i3 < 33) {
                checkSelfPermission4 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                if (checkSelfPermission4 != 0) {
                }
            }
            if (i3 >= 33) {
                checkSelfPermission = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES");
                if (checkSelfPermission != 0) {
                    checkSelfPermission2 = context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO");
                    if (checkSelfPermission2 != 0) {
                        checkSelfPermission3 = context.checkSelfPermission("android.permission.READ_MEDIA_AUDIO");
                        if (checkSelfPermission3 == 0) {
                        }
                    }
                }
            }
            arrayList3 = arrayList;
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e3) {
                    e = e3;
                    FileLog.e(e);
                    albumEntry4 = albumEntry10;
                    AlbumEntry albumEntry14 = albumEntry2;
                    Integer num2 = obj;
                    while (i2 < arrayList2.size()) {
                    }
                    broadcastNewPhotos(i, arrayList2, arrayList3, num2, albumEntry14, albumEntry13, albumEntry4, 0);
                }
            }
            albumEntry4 = albumEntry10;
            AlbumEntry albumEntry142 = albumEntry2;
            Integer num22 = obj;
            while (i2 < arrayList2.size()) {
            }
            broadcastNewPhotos(i, arrayList2, arrayList3, num22, albumEntry142, albumEntry13, albumEntry4, 0);
        }
        ContentResolver contentResolver3 = ApplicationLoader.applicationContext.getContentResolver();
        Uri uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        String[] strArr3 = projectionVideo;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i3 > 28 ? "date_modified" : "datetaken");
        sb3.append(" DESC");
        cursor = MediaStore.Images.Media.query(contentResolver3, uri3, strArr3, null, null, sb3.toString());
        if (cursor != null) {
            int columnIndex10 = cursor.getColumnIndex(str8);
            int columnIndex11 = cursor.getColumnIndex(str7);
            int columnIndex12 = cursor.getColumnIndex(str6);
            int columnIndex13 = cursor.getColumnIndex(str5);
            int columnIndex14 = cursor.getColumnIndex(i3 > 28 ? "date_modified" : "datetaken");
            int columnIndex15 = cursor.getColumnIndex("duration");
            int columnIndex16 = cursor.getColumnIndex(str3);
            int columnIndex17 = cursor.getColumnIndex(str2);
            int columnIndex18 = cursor.getColumnIndex("_size");
            cursor.getColumnIndex(str4);
            while (cursor.moveToNext()) {
                String string3 = cursor.getString(columnIndex13);
                if (!TextUtils.isEmpty(string3)) {
                    int i19 = cursor.getInt(columnIndex10);
                    int i20 = cursor.getInt(columnIndex11);
                    String string4 = cursor.getString(columnIndex12);
                    int i21 = columnIndex10;
                    int i22 = columnIndex18;
                    PhotoEntry photoEntry2 = new PhotoEntry(i20, i19, cursor.getLong(columnIndex14), string3, 0, (int) (cursor.getLong(columnIndex15) / 1000), true, cursor.getInt(columnIndex16), cursor.getInt(columnIndex17), cursor.getLong(columnIndex18));
                    int i23 = columnIndex14;
                    if (albumEntry10 == null) {
                        i4 = columnIndex11;
                        i5 = columnIndex12;
                        arrayList3 = arrayList;
                        try {
                            albumEntry3 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry2);
                            int i24 = 1;
                            try {
                                albumEntry3.videoOnly = true;
                                if (albumEntry2 == null) {
                                    i24 = 0;
                                }
                                if (albumEntry13 != null) {
                                    i24++;
                                }
                                arrayList2.add(i24, albumEntry3);
                            } catch (Throwable th24) {
                                th = th24;
                                try {
                                    FileLog.e(th);
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Exception e4) {
                                            e = e4;
                                            albumEntry10 = albumEntry3;
                                            FileLog.e(e);
                                            albumEntry4 = albumEntry10;
                                            AlbumEntry albumEntry1422 = albumEntry2;
                                            Integer num222 = obj;
                                            while (i2 < arrayList2.size()) {
                                            }
                                            broadcastNewPhotos(i, arrayList2, arrayList3, num222, albumEntry1422, albumEntry13, albumEntry4, 0);
                                        }
                                    }
                                    albumEntry4 = albumEntry3;
                                    AlbumEntry albumEntry14222 = albumEntry2;
                                    Integer num2222 = obj;
                                    for (i2 = 0; i2 < arrayList2.size(); i2++) {
                                        Collections.sort(((AlbumEntry) arrayList2.get(i2)).photos, new Comparator() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda39
                                            @Override // java.util.Comparator
                                            public final int compare(Object obj2, Object obj3) {
                                                return MediaController.$r8$lambda$S1-eYA6ZVUkGUDD_YKo2_vGv2_k((MediaController.PhotoEntry) obj2, (MediaController.PhotoEntry) obj3);
                                            }
                                        });
                                    }
                                    broadcastNewPhotos(i, arrayList2, arrayList3, num2222, albumEntry14222, albumEntry13, albumEntry4, 0);
                                } finally {
                                }
                            }
                        } catch (Throwable th25) {
                            th = th25;
                            albumEntry3 = albumEntry10;
                            FileLog.e(th);
                            if (cursor != null) {
                            }
                            albumEntry4 = albumEntry3;
                            AlbumEntry albumEntry142222 = albumEntry2;
                            Integer num22222 = obj;
                            while (i2 < arrayList2.size()) {
                            }
                            broadcastNewPhotos(i, arrayList2, arrayList3, num22222, albumEntry142222, albumEntry13, albumEntry4, 0);
                        }
                    } else {
                        i4 = columnIndex11;
                        i5 = columnIndex12;
                        arrayList3 = arrayList;
                        albumEntry3 = albumEntry10;
                    }
                    if (albumEntry2 == null) {
                        try {
                            i6 = columnIndex13;
                            albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry2);
                            try {
                                arrayList2.add(0, albumEntry5);
                            } catch (Throwable th26) {
                                th = th26;
                                albumEntry2 = albumEntry5;
                                FileLog.e(th);
                                if (cursor != null) {
                                }
                                albumEntry4 = albumEntry3;
                                AlbumEntry albumEntry1422222 = albumEntry2;
                                Integer num222222 = obj;
                                while (i2 < arrayList2.size()) {
                                }
                                broadcastNewPhotos(i, arrayList2, arrayList3, num222222, albumEntry1422222, albumEntry13, albumEntry4, 0);
                            }
                        } catch (Throwable th27) {
                            th = th27;
                            albumEntry10 = albumEntry3;
                            albumEntry3 = albumEntry10;
                            FileLog.e(th);
                            if (cursor != null) {
                            }
                            albumEntry4 = albumEntry3;
                            AlbumEntry albumEntry14222222 = albumEntry2;
                            Integer num2222222 = obj;
                            while (i2 < arrayList2.size()) {
                            }
                            broadcastNewPhotos(i, arrayList2, arrayList3, num2222222, albumEntry14222222, albumEntry13, albumEntry4, 0);
                        }
                    } else {
                        i6 = columnIndex13;
                        albumEntry5 = albumEntry2;
                    }
                    try {
                        albumEntry3.addPhoto(photoEntry2);
                        albumEntry5.addPhoto(photoEntry2);
                        AlbumEntry albumEntry15 = (AlbumEntry) sparseArray2.get(i20);
                        if (albumEntry15 == null) {
                            albumEntry15 = new AlbumEntry(i20, string4, photoEntry2);
                            sparseArray2.put(i20, albumEntry15);
                            if (obj == null && str9 != null && string3 != null && string3.startsWith(str9)) {
                                try {
                                    arrayList2.add(0, albumEntry15);
                                    obj = Integer.valueOf(i20);
                                } catch (Throwable th28) {
                                    th = th28;
                                    albumEntry10 = albumEntry3;
                                    albumEntry2 = albumEntry5;
                                    albumEntry3 = albumEntry10;
                                    FileLog.e(th);
                                    if (cursor != null) {
                                    }
                                    albumEntry4 = albumEntry3;
                                    AlbumEntry albumEntry142222222 = albumEntry2;
                                    Integer num22222222 = obj;
                                    while (i2 < arrayList2.size()) {
                                    }
                                    broadcastNewPhotos(i, arrayList2, arrayList3, num22222222, albumEntry142222222, albumEntry13, albumEntry4, 0);
                                }
                            } else {
                                arrayList2.add(albumEntry15);
                            }
                        }
                        albumEntry15.addPhoto(photoEntry2);
                        albumEntry10 = albumEntry3;
                        albumEntry2 = albumEntry5;
                        columnIndex10 = i21;
                        columnIndex14 = i23;
                        columnIndex11 = i4;
                        columnIndex13 = i6;
                        columnIndex12 = i5;
                        columnIndex18 = i22;
                        arrayList = arrayList3;
                    } catch (Throwable th29) {
                        th = th29;
                    }
                }
            }
        }
        arrayList3 = arrayList;
        if (cursor != null) {
        }
        albumEntry4 = albumEntry10;
        AlbumEntry albumEntry1422222222 = albumEntry2;
        Integer num222222222 = obj;
        while (i2 < arrayList2.size()) {
        }
        broadcastNewPhotos(i, arrayList2, arrayList3, num222222222, albumEntry1422222222, albumEntry13, albumEntry4, 0);
    }

    public static /* synthetic */ int $r8$lambda$S1-eYA6ZVUkGUDD_YKo2_vGv2_k(PhotoEntry photoEntry, PhotoEntry photoEntry2) {
        long j = photoEntry.dateTaken;
        long j2 = photoEntry2.dateTaken;
        if (j < j2) {
            return 1;
        }
        return j > j2 ? -1 : 0;
    }

    private static void broadcastNewPhotos(final int i, final ArrayList<AlbumEntry> arrayList, final ArrayList<AlbumEntry> arrayList2, final Integer num, final AlbumEntry albumEntry, final AlbumEntry albumEntry2, final AlbumEntry albumEntry3, int i2) {
        Runnable runnable = broadcastPhotosRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$ZsZkcgMMK5FxVCFJRMifVFmnh7g(i, arrayList, arrayList2, num, albumEntry, albumEntry2, albumEntry3);
            }
        };
        broadcastPhotosRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, i2);
    }

    public static /* synthetic */ void $r8$lambda$ZsZkcgMMK5FxVCFJRMifVFmnh7g(int i, ArrayList arrayList, ArrayList arrayList2, Integer num, AlbumEntry albumEntry, AlbumEntry albumEntry2, AlbumEntry albumEntry3) {
        if (PhotoViewer.getInstance().isVisible() && !forceBroadcastNewPhotos) {
            broadcastNewPhotos(i, arrayList, arrayList2, num, albumEntry, albumEntry2, albumEntry3, MediaDataController.MAX_STYLE_RUNS_COUNT);
            return;
        }
        allMediaAlbums = arrayList;
        allPhotoAlbums = arrayList2;
        broadcastPhotosRunnable = null;
        allPhotosAlbumEntry = albumEntry2;
        allMediaAlbumEntry = albumEntry;
        allVideosAlbumEntry = albumEntry3;
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.albumsDidLoad, Integer.valueOf(i), arrayList, arrayList2, num);
    }

    public void scheduleVideoConvert(MessageObject messageObject) {
        scheduleVideoConvert(messageObject, false, true, false);
    }

    public void scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo) {
        scheduleVideoConvert(messageObject, videoEditedInfo, false, true, false);
    }

    public boolean scheduleVideoConvert(MessageObject messageObject, boolean z, boolean z2, boolean z3) {
        return scheduleVideoConvert(messageObject, messageObject != null ? messageObject.videoEditedInfo : null, z, z2, z3);
    }

    public boolean scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo, boolean z, boolean z2, boolean z3) {
        if (messageObject == null || videoEditedInfo == null) {
            return false;
        }
        if (z && !this.videoConvertQueue.isEmpty()) {
            return false;
        }
        if (z) {
            new File(messageObject.messageOwner.attachPath).delete();
        }
        VideoConvertMessage videoConvertMessage = new VideoConvertMessage(messageObject, videoEditedInfo, z2, z3);
        this.videoConvertQueue.add(videoConvertMessage);
        if (videoConvertMessage.foreground) {
            this.foregroundConvertingMessages.add(videoConvertMessage);
            checkForegroundConvertMessage(false);
        }
        if (this.videoConvertQueue.size() == 1) {
            startVideoConvertFromQueue();
        }
        return true;
    }

    public void cancelVideoConvert(MessageObject messageObject) {
        if (messageObject == null || this.videoConvertQueue.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.videoConvertQueue.size(); i++) {
            VideoConvertMessage videoConvertMessage = this.videoConvertQueue.get(i);
            MessageObject messageObject2 = videoConvertMessage.messageObject;
            if (messageObject2.equals(messageObject) && messageObject2.currentAccount == messageObject.currentAccount) {
                if (i == 0) {
                    synchronized (this.videoConvertSync) {
                        videoConvertMessage.videoEditedInfo.canceled = true;
                    }
                    return;
                } else {
                    this.foregroundConvertingMessages.remove(this.videoConvertQueue.remove(i));
                    checkForegroundConvertMessage(true);
                    return;
                }
            }
        }
    }

    private void checkForegroundConvertMessage(boolean z) {
        if (!this.foregroundConvertingMessages.isEmpty()) {
            this.currentForegroundConvertingVideo = this.foregroundConvertingMessages.get(0);
        } else {
            this.currentForegroundConvertingVideo = null;
        }
        if (this.currentForegroundConvertingVideo != null || z) {
            VideoEncodingService.start(z);
        }
    }

    private boolean startVideoConvertFromQueue() {
        if (this.videoConvertQueue.isEmpty()) {
            return false;
        }
        VideoConvertMessage videoConvertMessage = this.videoConvertQueue.get(0);
        VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        synchronized (this.videoConvertSync) {
            if (videoEditedInfo != null) {
                try {
                    videoEditedInfo.canceled = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        VideoConvertRunnable.runConversion(videoConvertMessage);
        return true;
    }

    public static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        MediaCodecInfo mediaCodecInfo = null;
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        String name = codecInfoAt.getName();
                        if (name != null && (!name.equals("OMX.SEC.avc.enc") || name.equals("OMX.SEC.AVC.Encoder"))) {
                            return codecInfoAt;
                        }
                        mediaCodecInfo = codecInfoAt;
                    }
                }
            }
        }
        return mediaCodecInfo;
    }

    public static int selectColorFormat(MediaCodecInfo mediaCodecInfo, String str) {
        int i;
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i2 >= iArr.length) {
                return i3;
            }
            i = iArr[i2];
            if (isRecognizedFormat(i)) {
                if (!mediaCodecInfo.getName().equals("OMX.SEC.AVC.Encoder") || i != 19) {
                    break;
                }
                i3 = i;
            }
            i2++;
        }
        return i;
    }

    public static int findTrack(MediaExtractor mediaExtractor, boolean z) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (z) {
                if (string.startsWith("audio/")) {
                    return i;
                }
            } else {
                if (string.startsWith("video/")) {
                    return i;
                }
            }
        }
        return -5;
    }

    public static boolean isH264Video(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        boolean z = false;
        try {
            mediaExtractor.setDataSource(str);
            int findTrack = findTrack(mediaExtractor, false);
            if (findTrack >= 0) {
                if (mediaExtractor.getTrackFormat(findTrack).getString("mime").equals(VIDEO_MIME_TYPE)) {
                    z = true;
                }
            }
            return z;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        } finally {
            mediaExtractor.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void didWriteData(final VideoConvertMessage videoConvertMessage, final File file, final boolean z, final long j, final long j2, final boolean z2, final float f) {
        VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        final boolean z3 = videoEditedInfo.videoConvertFirstWrite;
        if (z3) {
            videoEditedInfo.videoConvertFirstWrite = false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.MediaController$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.$r8$lambda$zCLJ6UFWjVs0BTl11PLCnEEcvT8(MediaController.this, z2, z, videoConvertMessage, file, f, j, z3, j2);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$zCLJ6UFWjVs0BTl11PLCnEEcvT8(MediaController mediaController, boolean z, boolean z2, VideoConvertMessage videoConvertMessage, File file, float f, long j, boolean z3, long j2) {
        mediaController.getClass();
        if (z || z2) {
            boolean z4 = videoConvertMessage.videoEditedInfo.canceled;
            synchronized (mediaController.videoConvertSync) {
                videoConvertMessage.videoEditedInfo.canceled = false;
            }
            mediaController.videoConvertQueue.remove(videoConvertMessage);
            mediaController.foregroundConvertingMessages.remove(videoConvertMessage);
            mediaController.checkForegroundConvertMessage(z4 || z);
            mediaController.startVideoConvertFromQueue();
        }
        if (z) {
            NotificationCenter.getInstance(videoConvertMessage.currentAccount).postNotificationName(NotificationCenter.filePreparingFailed, videoConvertMessage.messageObject, file.toString(), Float.valueOf(f), Long.valueOf(j));
            return;
        }
        if (z3) {
            NotificationCenter.getInstance(videoConvertMessage.currentAccount).postNotificationName(NotificationCenter.filePreparingStarted, videoConvertMessage.messageObject, file.toString(), Float.valueOf(f), Long.valueOf(j));
        }
        NotificationCenter.getInstance(videoConvertMessage.currentAccount).postNotificationName(NotificationCenter.fileNewChunkAvailable, videoConvertMessage.messageObject, file.toString(), Long.valueOf(j2), Long.valueOf(z2 ? file.length() : 0L), Float.valueOf(f), Long.valueOf(j));
    }

    public void pauseByRewind() {
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer != null) {
            videoPlayer.pause();
        }
    }

    public void resumeByRewind() {
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer == null || this.playingMessageObject == null || this.isPaused) {
            return;
        }
        if (videoPlayer.isBuffering()) {
            MessageObject messageObject = this.playingMessageObject;
            cleanupPlayer(false, false);
            playMessage(messageObject);
            return;
        }
        this.audioPlayer.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class VideoConvertRunnable implements Runnable {
        private VideoConvertMessage convertMessage;

        private VideoConvertRunnable(VideoConvertMessage videoConvertMessage) {
            this.convertMessage = videoConvertMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaController.getInstance().convertVideo(this.convertMessage);
        }

        public static void runConversion(final VideoConvertMessage videoConvertMessage) {
            new Thread(new Runnable() { // from class: org.telegram.messenger.MediaController$VideoConvertRunnable$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.VideoConvertRunnable.$r8$lambda$Crg9xK2aVHTQWtPt_7wiWv_ZWpY(MediaController.VideoConvertMessage.this);
                }
            }).start();
        }

        public static /* synthetic */ void $r8$lambda$Crg9xK2aVHTQWtPt_7wiWv_ZWpY(VideoConvertMessage videoConvertMessage) {
            try {
                Thread thread = new Thread(new VideoConvertRunnable(videoConvertMessage), "VideoConvertRunnable");
                thread.start();
                thread.join();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean convertVideo(final VideoConvertMessage videoConvertMessage) {
        File file;
        int i;
        long j;
        long j2;
        long j3;
        boolean z;
        long j4;
        int i2;
        File file2;
        boolean z2;
        MessageObject messageObject = videoConvertMessage.messageObject;
        final VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        if (messageObject == null || videoEditedInfo == null) {
            return false;
        }
        String str = videoEditedInfo.originalPath;
        long j5 = videoEditedInfo.videoOffset;
        long j6 = videoEditedInfo.startTime;
        long j7 = videoEditedInfo.avatarStartTime;
        long j8 = videoEditedInfo.endTime;
        int i3 = videoEditedInfo.resultWidth;
        int i4 = videoEditedInfo.resultHeight;
        int i5 = videoEditedInfo.rotationValue;
        int i6 = videoEditedInfo.originalWidth;
        int i7 = videoEditedInfo.originalHeight;
        int i8 = videoEditedInfo.framerate;
        int i9 = videoEditedInfo.bitrate;
        int i10 = videoEditedInfo.originalBitrate;
        boolean z3 = DialogObject.isEncryptedDialog(messageObject.getDialogId()) || videoEditedInfo.forceFragmenting;
        File file3 = new File(messageObject.messageOwner.attachPath);
        if (file3.exists()) {
            file3.delete();
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            file = file3;
            sb.append("begin convert ");
            sb.append(str);
            sb.append(" startTime = ");
            sb.append(j6);
            sb.append(" avatarStartTime = ");
            sb.append(j7);
            sb.append(" endTime ");
            sb.append(j8);
            sb.append(" rWidth = ");
            sb.append(i3);
            sb.append(" rHeight = ");
            sb.append(i4);
            sb.append(" rotation = ");
            sb.append(i5);
            sb.append(" oWidth = ");
            sb.append(i6);
            sb.append(" oHeight = ");
            sb.append(i7);
            sb.append(" framerate = ");
            sb.append(i8);
            sb.append(" bitrate = ");
            sb.append(i9);
            sb.append(" originalBitrate = ");
            i = i10;
            sb.append(i);
            FileLog.d(sb.toString());
        } else {
            file = file3;
            i = i10;
        }
        if (str == null) {
            str = "";
        }
        if (j6 > 0 && j8 > 0) {
            j = j6;
            j2 = j8 - j6;
        } else if (j8 > 0) {
            j = j6;
            j2 = j8;
        } else if (j6 > 0) {
            j = j6;
            j2 = videoEditedInfo.originalDuration - j;
        } else {
            j = j6;
            j2 = videoEditedInfo.originalDuration;
        }
        if (i8 == 0) {
            i8 = 25;
        } else if (i8 > 59) {
            i8 = 59;
        }
        if (i5 == 90 || i5 == 270) {
            j3 = j2;
            z = z3;
            j4 = j7;
            i2 = i4;
        } else {
            j3 = j2;
            z = z3;
            j4 = j7;
            i2 = i3;
            i3 = i4;
        }
        long j9 = j;
        long j10 = j3;
        if (!videoEditedInfo.shouldLimitFps && i8 > 40 && Math.min(i3, i2) <= 480) {
            i8 = 30;
        }
        if (j4 == -1 && videoEditedInfo.cropState == null && videoEditedInfo.mediaEntities == null && videoEditedInfo.paintPath == null && videoEditedInfo.filterState == null && i2 == i6 && i3 == i7 && i5 == 0 && !videoEditedInfo.roundVideo && j9 == -1 && videoEditedInfo.mixedSoundInfos.isEmpty()) {
            file2 = file;
            z2 = false;
        } else {
            file2 = file;
            z2 = true;
        }
        final File file4 = file2;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("videoconvert", 0);
        long currentTimeMillis = System.currentTimeMillis();
        VideoConvertorListener videoConvertorListener = new VideoConvertorListener() { // from class: org.telegram.messenger.MediaController.18
            private long lastAvailableSize = 0;

            @Override // org.telegram.messenger.MediaController.VideoConvertorListener
            public boolean checkConversionCanceled() {
                return videoEditedInfo.canceled;
            }

            @Override // org.telegram.messenger.MediaController.VideoConvertorListener
            public void didWriteData(long j11, float f) {
                if (videoEditedInfo.canceled) {
                    return;
                }
                if (j11 < 0) {
                    j11 = file4.length();
                }
                long j12 = j11;
                if (videoEditedInfo.needUpdateProgress || this.lastAvailableSize != j12) {
                    this.lastAvailableSize = j12;
                    MediaController.this.didWriteData(videoConvertMessage, file4, false, 0L, j12, false, f);
                }
            }
        };
        videoEditedInfo.videoConvertFirstWrite = true;
        MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
        MediaCodecVideoConvertor.ConvertVideoParams of = MediaCodecVideoConvertor.ConvertVideoParams.of(str, file4, j5, i5, z, i6, i7, i2, i3, i8, i9, i, j9, j8, j4, z2, j10, videoConvertorListener, videoEditedInfo);
        of.soundInfos.addAll(videoEditedInfo.mixedSoundInfos);
        boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of);
        boolean z4 = videoEditedInfo.canceled;
        if (!z4) {
            synchronized (this.videoConvertSync) {
                z4 = videoEditedInfo.canceled;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z4);
        }
        sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
        didWriteData(videoConvertMessage, file4, true, mediaCodecVideoConvertor.getLastFrameTimestamp(), file4.length(), convertVideo || z4, VOLUME_NORMAL);
        return true;
    }

    public static int getVideoBitrate(String str) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e) {
            FileLog.e(e);
            i = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            FileLog.e(th);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int makeVideoBitrate(int i, int i2, int i3, int i4, int i5) {
        int i6;
        float f;
        int min = Math.min(i4, i5);
        float f2 = VOLUME_NORMAL;
        if (min >= 1080) {
            i6 = VIDEO_BITRATE_1080;
        } else {
            if (Math.min(i4, i5) < 720) {
                if (Math.min(i4, i5) >= 480) {
                    i6 = VIDEO_BITRATE_480;
                    f = 0.75f;
                    f2 = 0.9f;
                } else {
                    i6 = VIDEO_BITRATE_360;
                    f = 0.6f;
                    f2 = 0.7f;
                }
                int min2 = (int) (((int) (i3 / Math.min(i / i4, i2 / i5))) * f);
                int videoBitrateWithFactor = (int) (getVideoBitrateWithFactor(f2) / (921600.0f / (i5 * i4)));
                return i3 >= videoBitrateWithFactor ? min2 : min2 > i6 ? i6 : Math.max(min2, videoBitrateWithFactor);
            }
            i6 = 2600000;
        }
        f = VOLUME_NORMAL;
        int min22 = (int) (((int) (i3 / Math.min(i / i4, i2 / i5))) * f);
        int videoBitrateWithFactor2 = (int) (getVideoBitrateWithFactor(f2) / (921600.0f / (i5 * i4)));
        if (i3 >= videoBitrateWithFactor2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int extractRealEncoderBitrate(int i, int i2, int i3, boolean z) {
        MediaCodec createEncoderByType;
        String str = i + "" + i2 + "" + i3;
        Integer num = cachedEncoderBitrates.get(str);
        if (num != null) {
            return num.intValue();
        }
        if (z) {
            try {
                createEncoderByType = MediaCodec.createEncoderByType("video/hevc");
            } catch (Exception unused) {
            }
            if (createEncoderByType == null) {
                try {
                    createEncoderByType = MediaCodec.createEncoderByType(VIDEO_MIME_TYPE);
                } catch (Exception unused2) {
                    return i3;
                }
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, i, i2);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("max-bitrate", i3);
            createVideoFormat.setInteger("bitrate", i3);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            int integer = createEncoderByType.getOutputFormat().getInteger("bitrate");
            cachedEncoderBitrates.put(str, Integer.valueOf(integer));
            createEncoderByType.release();
            return integer;
        }
        createEncoderByType = null;
        if (createEncoderByType == null) {
        }
        MediaFormat createVideoFormat2 = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, i, i2);
        createVideoFormat2.setInteger("color-format", 2130708361);
        createVideoFormat2.setInteger("max-bitrate", i3);
        createVideoFormat2.setInteger("bitrate", i3);
        createVideoFormat2.setInteger("frame-rate", 30);
        createVideoFormat2.setInteger("i-frame-interval", 1);
        createEncoderByType.configure(createVideoFormat2, (Surface) null, (MediaCrypto) null, 1);
        int integer2 = createEncoderByType.getOutputFormat().getInteger("bitrate");
        cachedEncoderBitrates.put(str, Integer.valueOf(integer2));
        createEncoderByType.release();
        return integer2;
    }

    public static class PlaylistGlobalSearchParams {
        final long dialogId;
        public boolean endReached;
        final FiltersView.MediaFilterData filter;
        public int folderId;
        final long maxDate;
        final long minDate;
        public int nextSearchRate;
        final String query;
        public ReactionsLayoutInBubble.VisibleReaction reaction;
        public long topicId;
        public int totalCount;

        public PlaylistGlobalSearchParams(String str, long j, long j2, long j3, FiltersView.MediaFilterData mediaFilterData) {
            this.filter = mediaFilterData;
            this.query = str;
            this.dialogId = j;
            this.minDate = j2;
            this.maxDate = j3;
        }
    }

    public boolean currentPlaylistIsGlobalSearch() {
        return this.playlistGlobalSearchParams != null;
    }

    private static class SavedMusicPlaylistState {
        public final MessageObject playingMessage;
        public final float progress;
        public final int progressMs;
        public final int progressSec;

        public SavedMusicPlaylistState(MessageObject messageObject) {
            this.playingMessage = messageObject;
            this.progress = messageObject.audioProgress;
            this.progressMs = messageObject.audioProgressMs;
            this.progressSec = messageObject.audioProgressSec;
        }
    }

    private void clearMusicPlaylistState() {
        this.savedMusicPlaylistState = null;
    }

    private boolean saveMusicPlaylistStateIfNeeded() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null || !messageObject.isMusic() || this.playlist.isEmpty()) {
            return this.savedMusicPlaylistState != null;
        }
        this.savedMusicPlaylistState = new SavedMusicPlaylistState(this.playingMessageObject);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean restoreMusicPlaylistState() {
        int i;
        MessageObject messageObject;
        SavedMusicPlaylistState savedMusicPlaylistState = this.savedMusicPlaylistState;
        if (savedMusicPlaylistState == null) {
            return false;
        }
        this.savedMusicPlaylistState = null;
        ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
        if (arrayList == null || (i = this.currentPlaylistNum) < 0 || i >= arrayList.size() || (messageObject = arrayList.get(this.currentPlaylistNum)) == null || messageObject.getDialogId() != savedMusicPlaylistState.playingMessage.getDialogId() || messageObject.getId() != savedMusicPlaylistState.playingMessage.getId()) {
            return false;
        }
        this.playMusicAgain = false;
        float f = savedMusicPlaylistState.progress;
        messageObject.forceSeekTo = f;
        messageObject.audioProgress = f;
        messageObject.audioProgressMs = savedMusicPlaylistState.progressMs;
        messageObject.audioProgressSec = savedMusicPlaylistState.progressSec;
        playMessage(messageObject);
        pauseMessage(messageObject, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class MusicListenReporter {
        private TLRPC.InputDocument audio;
        public final int currentAccount;
        private long rangeStart = -9223372036854775807L;
        private final ArrayList<Pair<Long, Long>> ranges = new ArrayList<>();
        private final Runnable reportRunnable = new Runnable() { // from class: org.telegram.messenger.MediaController$MusicListenReporter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.MusicListenReporter.this.report();
            }
        };

        public MusicListenReporter(int i) {
            this.currentAccount = i;
        }

        public void setup(TLRPC.InputDocument inputDocument) {
            AndroidUtilities.cancelRunOnUIThread(this.reportRunnable);
            if (inputDocument != null && inputDocument.id == 0) {
                inputDocument = null;
            }
            this.audio = inputDocument;
            this.rangeStart = -9223372036854775807L;
            this.ranges.clear();
        }

        public Player.Listener getPlayerListener(final ExoPlayer exoPlayer) {
            return new Player.Listener() { // from class: org.telegram.messenger.MediaController.MusicListenReporter.1
                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                    Player.Listener.-CC.$default$onAudioAttributesChanged(this, audioAttributes);
                }

                public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
                    Player.Listener.-CC.$default$onAudioSessionIdChanged(this, i);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
                    Player.Listener.-CC.$default$onAvailableCommandsChanged(this, commands);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
                    Player.Listener.-CC.$default$onCues(this, cueGroup);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                @Deprecated
                public /* bridge */ /* synthetic */ void onCues(List list) {
                    Player.Listener.-CC.$default$onCues(this, list);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                    Player.Listener.-CC.$default$onDeviceInfoChanged(this, deviceInfo);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
                    Player.Listener.-CC.$default$onDeviceVolumeChanged(this, i, z);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
                    Player.Listener.-CC.$default$onEvents(this, player, events);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
                    Player.Listener.-CC.$default$onIsLoadingChanged(this, z);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                @Deprecated
                public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
                    Player.Listener.-CC.$default$onLoadingChanged(this, z);
                }

                public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
                    Player.Listener.-CC.$default$onMaxSeekToPreviousPositionChanged(this, j);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
                    Player.Listener.-CC.$default$onMediaItemTransition(this, mediaItem, i);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
                    Player.Listener.-CC.$default$onMediaMetadataChanged(this, mediaMetadata);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
                    Player.Listener.-CC.$default$onMetadata(this, metadata);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                    Player.Listener.-CC.$default$onPlayWhenReadyChanged(this, z, i);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                    Player.Listener.-CC.$default$onPlaybackParametersChanged(this, playbackParameters);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i) {
                    Player.Listener.-CC.$default$onPlaybackStateChanged(this, i);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                    Player.Listener.-CC.$default$onPlaybackSuppressionReasonChanged(this, i);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
                    Player.Listener.-CC.$default$onPlayerError(this, playbackException);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                    Player.Listener.-CC.$default$onPlayerErrorChanged(this, playbackException);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                @Deprecated
                public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                    Player.Listener.-CC.$default$onPlayerStateChanged(this, z, i);
                }

                public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata mediaMetadata) {
                    Player.Listener.-CC.$default$onPlaylistMetadataChanged(this, mediaMetadata);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                @Deprecated
                public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
                    Player.Listener.-CC.$default$onPositionDiscontinuity(this, i);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                    Player.Listener.-CC.$default$onRenderedFirstFrame(this);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
                    Player.Listener.-CC.$default$onRepeatModeChanged(this, i);
                }

                public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
                    Player.Listener.-CC.$default$onSeekBackIncrementChanged(this, j);
                }

                public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
                    Player.Listener.-CC.$default$onSeekForwardIncrementChanged(this, j);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                @Deprecated
                public /* bridge */ /* synthetic */ void onSeekProcessed() {
                    Player.Listener.-CC.$default$onSeekProcessed(this);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                    Player.Listener.-CC.$default$onShuffleModeEnabledChanged(this, z);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                    Player.Listener.-CC.$default$onSkipSilenceEnabledChanged(this, z);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
                    Player.Listener.-CC.$default$onSurfaceSizeChanged(this, i, i2);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
                    Player.Listener.-CC.$default$onTimelineChanged(this, timeline, i);
                }

                public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
                    Player.Listener.-CC.$default$onTrackSelectionParametersChanged(this, trackSelectionParameters);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
                    Player.Listener.-CC.$default$onTracksChanged(this, tracks);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                    Player.Listener.-CC.$default$onVideoSizeChanged(this, videoSize);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
                    Player.Listener.-CC.$default$onVolumeChanged(this, f);
                }

                private void closeRange() {
                    long currentPosition = exoPlayer.getCurrentPosition();
                    if (MusicListenReporter.this.rangeStart != -9223372036854775807L && currentPosition > MusicListenReporter.this.rangeStart) {
                        MusicListenReporter musicListenReporter = MusicListenReporter.this;
                        musicListenReporter.listenedRange(musicListenReporter.rangeStart, currentPosition);
                    }
                    MusicListenReporter.this.rangeStart = -9223372036854775807L;
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public void onIsPlayingChanged(boolean z) {
                    if (z) {
                        MusicListenReporter.this.rangeStart = exoPlayer.getCurrentPosition();
                    } else {
                        closeRange();
                    }
                    AndroidUtilities.cancelRunOnUIThread(MusicListenReporter.this.reportRunnable);
                    if (z) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(MusicListenReporter.this.reportRunnable, 60000L);
                }

                @Override // com.google.android.exoplayer2.Player.Listener
                public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                    if (i == 1) {
                        if (MusicListenReporter.this.rangeStart != -9223372036854775807L) {
                            MusicListenReporter musicListenReporter = MusicListenReporter.this;
                            musicListenReporter.listenedRange(musicListenReporter.rangeStart, positionInfo.positionMs);
                        }
                        MusicListenReporter.this.rangeStart = exoPlayer.isPlaying() ? positionInfo2.positionMs : -9223372036854775807L;
                        AndroidUtilities.cancelRunOnUIThread(MusicListenReporter.this.reportRunnable);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void listenedRange(long j, long j2) {
            int i = 0;
            while (i < this.ranges.size() && ((Long) this.ranges.get(i).first).longValue() <= j) {
                i++;
            }
            this.ranges.add(i, new Pair<>(Long.valueOf(j), Long.valueOf(j2)));
            int max = Math.max(0, i - 1);
            while (max < this.ranges.size() - 1) {
                Pair<Long, Long> pair = this.ranges.get(max);
                int i2 = max + 1;
                Pair<Long, Long> pair2 = this.ranges.get(i2);
                if (((Long) pair.second).longValue() >= ((Long) pair2.first).longValue()) {
                    this.ranges.set(max, new Pair<>((Long) pair.first, Long.valueOf(Math.max(((Long) pair.second).longValue(), ((Long) pair2.second).longValue()))));
                    this.ranges.remove(i2);
                } else {
                    max = i2;
                }
            }
        }

        private long getTotalListened() {
            ArrayList<Pair<Long, Long>> arrayList = this.ranges;
            int size = arrayList.size();
            long j = 0;
            int i = 0;
            while (i < size) {
                Pair<Long, Long> pair = arrayList.get(i);
                i++;
                Pair<Long, Long> pair2 = pair;
                j += ((Long) pair2.second).longValue() - ((Long) pair2.first).longValue();
            }
            return j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void report() {
            AndroidUtilities.cancelRunOnUIThread(this.reportRunnable);
            if (this.audio != null && getTotalListened() >= 3000) {
                TLRPC.TL_messages_reportMusicListen tL_messages_reportMusicListen = new TLRPC.TL_messages_reportMusicListen();
                tL_messages_reportMusicListen.id = this.audio;
                tL_messages_reportMusicListen.listened_duration = (int) Math.round(getTotalListened() / 1000.0d);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportMusicListen, null);
                this.rangeStart = -9223372036854775807L;
                this.ranges.clear();
            }
        }

        public void destroy() {
            if (this.audio == null) {
                return;
            }
            report();
            this.audio = null;
        }
    }
}
