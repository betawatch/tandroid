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
import android.os.Bundle;
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
import i2.r;
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
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.eo;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
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
    private jf.a audioInfo;
    private AudioRecord audioRecorder;
    private boolean audioRecorderPaused;
    private float audioVolume;
    private ValueAnimator audioVolumeAnimator;
    private Activity baseActivity;
    private boolean callInProgress;
    private int countLess;
    private org.telegram.ui.m4 currentAspectRatioFrameLayout;
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
    private org.telegram.ui.ActionBar.p2 flagSecureFragment;
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
    private eo raiseChat;
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
    private t71 videoPlayer;
    private ArrayList<MessageObject> voiceMessagesPlaylist;
    private SparseArray<MessageObject> voiceMessagesPlaylistMap;
    private boolean voiceMessagesPlaylistUnread;
    public int writtenFrame;
    AudioManager.OnAudioFocusChangeListener audioRecordFocusChangedListener = new AudioManager.OnAudioFocusChangeListener() { // from class: org.telegram.messenger.n6
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i10) {
            MediaController.this.lambda$new$0(i10);
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
    private t71 audioPlayer = null;
    private t71 emojiSoundPlayer = null;
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

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class 2 implements Runnable {
        public 2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(ByteBuffer byteBuffer) {
            MediaController.this.recordBuffers.add(byteBuffer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1(ByteBuffer byteBuffer, boolean z10) {
            int i10;
            while (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() > MediaController.this.fileBuffer.remaining()) {
                    i10 = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + MediaController.this.fileBuffer.remaining());
                } else {
                    i10 = -1;
                }
                MediaController.this.fileBuffer.put(byteBuffer);
                if (MediaController.this.fileBuffer.position() == MediaController.this.fileBuffer.limit() || z10) {
                    MediaController mediaController = MediaController.this;
                    if (mediaController.writeFrame(mediaController.fileBuffer, !z10 ? MediaController.this.fileBuffer.limit() : byteBuffer.position()) != 0) {
                        MediaController.this.fileBuffer.rewind();
                        MediaController mediaController2 = MediaController.this;
                        long j3 = mediaController2.recordTimeCount;
                        int limit = mediaController2.fileBuffer.limit() / 2;
                        MediaController mediaController3 = MediaController.this;
                        mediaController2.recordTimeCount = j3 + (limit / (mediaController3.sampleRate / MediaDataController.MAX_STYLE_RUNS_COUNT));
                        mediaController3.writtenFrame++;
                    } else {
                        FileLog.e("writing frame failed");
                    }
                }
                if (i10 != -1) {
                    byteBuffer.limit(i10);
                }
            }
            MediaController.this.recordQueue.postRunnable(new i3(5, this, byteBuffer));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$2(double d) {
            NotificationCenter.getInstance(MediaController.this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordProgressChanged, Integer.valueOf(MediaController.this.recordingGuid), Double.valueOf(d));
        }

        @Override // java.lang.Runnable
        public void run() {
            ByteBuffer allocateDirect;
            if (MediaController.this.audioRecorder != null) {
                if (MediaController.this.recordBuffers.isEmpty()) {
                    allocateDirect = ByteBuffer.allocateDirect(MediaController.this.recordBufferSize);
                    allocateDirect.order(ByteOrder.nativeOrder());
                } else {
                    allocateDirect = (ByteBuffer) MediaController.this.recordBuffers.get(0);
                    MediaController.this.recordBuffers.remove(0);
                }
                ByteBuffer byteBuffer = allocateDirect;
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
                    long j3 = mediaController2.samplesCount;
                    long j10 = (read / 2) + j3;
                    int length = (int) ((j3 / j10) * r0.length);
                    int length2 = mediaController2.recordSamples.length - length;
                    float f7 = 0.0f;
                    if (length != 0) {
                        float length3 = r0.length / length;
                        float f10 = 0.0f;
                        for (int i10 = 0; i10 < length; i10++) {
                            short[] sArr = MediaController.this.recordSamples;
                            sArr[i10] = sArr[(int) f10];
                            f10 += length3;
                        }
                    }
                    float f11 = (read / 2.0f) / length2;
                    for (int i11 = 0; i11 < read / 2; i11++) {
                        short s10 = byteBuffer.getShort();
                        d += s10 * s10;
                        if (i11 == ((int) f7)) {
                            short[] sArr2 = MediaController.this.recordSamples;
                            if (length < sArr2.length) {
                                sArr2[length] = s10;
                                f7 += f11;
                                length++;
                            }
                        }
                    }
                    MediaController.this.samplesCount = j10;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                byteBuffer.position(0);
                final double sqrt = Math.sqrt((d / read) / 2.0d);
                MediaController.this.fileEncodingQueue.postRunnable(new s6(this, byteBuffer, read != byteBuffer.capacity(), 0));
                MediaController.this.recordQueue.postRunnable(MediaController.this.recordRunnable);
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.t6
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaController.2.this.lambda$run$2(sqrt);
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class 4 extends PhoneStateListener {
        public 4() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onCallStateChanged$0(int i10) {
            o91 o91Var;
            o91 o91Var2;
            if (i10 != 1) {
                if (i10 == 0) {
                    MediaController.this.callInProgress = false;
                    return;
                }
                if (i10 == 2) {
                    zu zuVar = zu.S;
                    if (zuVar != null && (o91Var = zuVar.c) != null && o91Var.w) {
                        o91Var.a.B();
                        o91Var.n();
                        o91Var.f0.d(true, true);
                    }
                    MediaController.this.callInProgress = true;
                    return;
                }
                return;
            }
            MediaController mediaController = MediaController.this;
            if (mediaController.isPlayingMessage(mediaController.playingMessageObject) && !MediaController.this.isMessagePaused()) {
                MediaController mediaController2 = MediaController.this;
                mediaController2.lambda$startAudioAgain$7(mediaController2.playingMessageObject);
            } else if (MediaController.this.recordStartRunnable != null || MediaController.this.recordingAudio != null) {
                MediaController.this.stopRecording(2, false, 0, false, 0L);
            }
            zu zuVar2 = zu.S;
            if (zuVar2 != null && (o91Var2 = zuVar2.c) != null && o91Var2.w) {
                o91Var2.a.B();
                o91Var2.n();
                o91Var2.f0.d(true, true);
            }
            MediaController.this.callInProgress = true;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i10, String str) {
            AndroidUtilities.runOnUIThread(new u6(this, i10, 0));
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class 5 extends TimerTask {
        final /* synthetic */ MessageObject val$currentPlayingMessageObject;

        public 5(MessageObject messageObject) {
            this.val$currentPlayingMessageObject = messageObject;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$run$0(String str, float f7) {
            ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat(str, f7).commit();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1(MessageObject messageObject) {
            long p5;
            long n10;
            final float f7;
            float f10;
            if ((MediaController.this.audioPlayer == null && MediaController.this.videoPlayer == null) || MediaController.this.isPaused) {
                return;
            }
            try {
                if (MediaController.this.videoPlayer != null) {
                    p5 = MediaController.this.videoPlayer.p();
                    n10 = MediaController.this.videoPlayer.n();
                    if (n10 >= 0 && p5 > 0) {
                        float f11 = p5;
                        f10 = MediaController.this.videoPlayer.j() / f11;
                        f7 = n10 / f11;
                        if (f7 >= MediaController.VOLUME_NORMAL) {
                            return;
                        }
                    }
                    return;
                }
                p5 = MediaController.this.audioPlayer.p();
                n10 = MediaController.this.audioPlayer.n();
                float f12 = p5 >= 0 ? n10 / p5 : 0.0f;
                float j3 = MediaController.this.audioPlayer.j() / p5;
                if (p5 != -9223372036854775807L && n10 >= 0 && MediaController.this.seekToProgressPending == 0.0f) {
                    f7 = f12;
                    f10 = j3;
                }
                return;
                MediaController.this.lastProgress = n10;
                messageObject.audioPlayerDuration = (int) (p5 / 1000);
                messageObject.audioProgress = f7;
                messageObject.audioProgressSec = (int) (MediaController.this.lastProgress / 1000);
                messageObject.bufferedProgress = f10;
                if (f7 >= 0.0f && MediaController.this.shouldSavePositionForCurrentAudio != null && SystemClock.elapsedRealtime() - MediaController.this.lastSaveTime >= 1000) {
                    final String str = MediaController.this.shouldSavePositionForCurrentAudio;
                    MediaController.this.lastSaveTime = SystemClock.elapsedRealtime();
                    Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.v6
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaController.5.lambda$run$0(str, f7);
                        }
                    });
                }
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(messageObject.getId()), Float.valueOf(f7));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (MediaController.this.sync) {
                AndroidUtilities.runOnUIThread(new i3(6, this, this.val$currentPlayingMessageObject));
            }
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class 7 implements q71 {
        final /* synthetic */ boolean val$destroyAtEnd;
        final /* synthetic */ MessageObject val$messageObject;
        final /* synthetic */ int[] val$playCount;
        final /* synthetic */ int val$tag;

        public 7(int i10, MessageObject messageObject, int[] iArr, boolean z10) {
            this.val$tag = i10;
            this.val$messageObject = messageObject;
            this.val$playCount = iArr;
            this.val$destroyAtEnd = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfaceDestroyed$0() {
            MediaController.this.cleanupPlayer(true, true);
        }

        @Override // org.telegram.ui.Components.q71
        public void onError(t71 t71Var, Exception exc) {
            FileLog.e(exc);
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
        }

        @Override // org.telegram.ui.Components.q71
        public void onStateChanged(boolean z10, int i10) {
            if (this.val$tag != MediaController.this.playerNum) {
                return;
            }
            MediaController.this.updateVideoState(this.val$messageObject, this.val$playCount, this.val$destroyAtEnd, z10, i10);
        }

        @Override // org.telegram.ui.Components.q71
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            if (MediaController.this.videoPlayer != null) {
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
                        MediaController.this.videoPlayer.V(MediaController.this.currentTextureView);
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                }
                if (MediaController.this.pipSwitchingState == 1) {
                    if (MediaController.this.baseActivity != null) {
                        if (MediaController.this.pipRoundVideoView == null) {
                            try {
                                MediaController.this.pipRoundVideoView = new PipRoundVideoView();
                                MediaController.this.pipRoundVideoView.d(MediaController.this.baseActivity, new g1(this, 5));
                            } catch (Exception unused) {
                                MediaController.this.pipRoundVideoView = null;
                            }
                        }
                        if (MediaController.this.pipRoundVideoView != null) {
                            if (MediaController.this.pipRoundVideoView.c.getSurfaceTexture() != surfaceTexture) {
                                MediaController.this.pipRoundVideoView.c.setSurfaceTexture(surfaceTexture);
                            }
                            MediaController.this.videoPlayer.V(MediaController.this.pipRoundVideoView.c);
                        }
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                }
                if (PhotoViewer.C1() && PhotoViewer.t1().S2 != null) {
                    PhotoViewer.t1().T2 = surfaceTexture;
                    return true;
                }
            }
            return false;
        }

        @Override // org.telegram.ui.Components.q71
        public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
            MediaController.this.currentAspectRatioFrameLayoutRotation = i12;
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            MediaController.this.currentAspectRatioFrameLayoutRatio = i10 == 0 ? MediaController.VOLUME_NORMAL : (i11 * f7) / i10;
            if (MediaController.this.currentAspectRatioFrameLayout != null) {
                MediaController.this.currentAspectRatioFrameLayout.a(MediaController.this.currentAspectRatioFrameLayoutRatio, MediaController.this.currentAspectRatioFrameLayoutRotation);
            }
        }

        @Override // org.telegram.ui.Components.q71
        public void onRenderedFirstFrame() {
            if (MediaController.this.currentAspectRatioFrameLayout == null || MediaController.this.currentAspectRatioFrameLayout.d) {
                return;
            }
            MediaController.this.isDrawingWasReady = true;
            MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
            MediaController.this.currentTextureViewContainer.setTag(1);
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onSeekFinished(j2.a aVar) {
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onSeekStarted(j2.a aVar) {
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class 8 implements q71 {
        final /* synthetic */ int val$tag;

        public 8(int i10) {
            this.val$tag = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStateChanged$0(int i10, int i11) {
            if (i10 == MediaController.this.emojiSoundPlayerNum && i11 == 4 && MediaController.this.emojiSoundPlayer != null) {
                try {
                    MediaController.this.emojiSoundPlayer.H();
                    MediaController.this.emojiSoundPlayer = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        @Override // org.telegram.ui.Components.q71
        public void onRenderedFirstFrame() {
        }

        @Override // org.telegram.ui.Components.q71
        public void onStateChanged(boolean z10, int i10) {
            AndroidUtilities.runOnUIThread(new w6(this, this.val$tag, i10, 0));
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onSeekFinished(j2.a aVar) {
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onSeekStarted(j2.a aVar) {
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // org.telegram.ui.Components.q71
        public void onError(t71 t71Var, Exception exc) {
        }

        @Override // org.telegram.ui.Components.q71
        public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class 9 implements q71 {
        final /* synthetic */ boolean val$destroyAtEnd;
        final /* synthetic */ MessageObject val$messageObject;
        final /* synthetic */ int[] val$playCount;
        final /* synthetic */ int val$tag;

        public 9(int i10, MessageObject messageObject, int[] iArr, boolean z10) {
            this.val$tag = i10;
            this.val$messageObject = messageObject;
            this.val$playCount = iArr;
            this.val$destroyAtEnd = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfaceDestroyed$0() {
            MediaController.this.cleanupPlayer(true, true);
        }

        @Override // org.telegram.ui.Components.q71
        public void onError(t71 t71Var, Exception exc) {
            FileLog.e(exc);
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
        }

        @Override // org.telegram.ui.Components.q71
        public void onStateChanged(boolean z10, int i10) {
            if (this.val$tag != MediaController.this.playerNum) {
                return;
            }
            MediaController.this.updateVideoState(this.val$messageObject, this.val$playCount, this.val$destroyAtEnd, z10, i10);
        }

        @Override // org.telegram.ui.Components.q71
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            if (MediaController.this.videoPlayer != null) {
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
                        MediaController.this.videoPlayer.V(MediaController.this.currentTextureView);
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                }
                if (MediaController.this.pipSwitchingState == 1) {
                    if (MediaController.this.baseActivity != null) {
                        if (MediaController.this.pipRoundVideoView == null) {
                            try {
                                MediaController.this.pipRoundVideoView = new PipRoundVideoView();
                                MediaController.this.pipRoundVideoView.d(MediaController.this.baseActivity, new g1(this, 6));
                            } catch (Exception unused) {
                                MediaController.this.pipRoundVideoView = null;
                            }
                        }
                        if (MediaController.this.pipRoundVideoView != null) {
                            if (MediaController.this.pipRoundVideoView.c.getSurfaceTexture() != surfaceTexture) {
                                MediaController.this.pipRoundVideoView.c.setSurfaceTexture(surfaceTexture);
                            }
                            MediaController.this.videoPlayer.V(MediaController.this.pipRoundVideoView.c);
                        }
                    }
                    MediaController.this.pipSwitchingState = 0;
                    return true;
                }
                if (PhotoViewer.C1() && PhotoViewer.t1().S2 != null) {
                    PhotoViewer.t1().T2 = surfaceTexture;
                    return true;
                }
            }
            return false;
        }

        @Override // org.telegram.ui.Components.q71
        public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
            MediaController.this.currentAspectRatioFrameLayoutRotation = i12;
            if (i12 != 90 && i12 != 270) {
                i11 = i10;
                i10 = i11;
            }
            MediaController.this.currentAspectRatioFrameLayoutRatio = i10 == 0 ? MediaController.VOLUME_NORMAL : (i11 * f7) / i10;
            if (MediaController.this.currentAspectRatioFrameLayout != null) {
                MediaController.this.currentAspectRatioFrameLayout.a(MediaController.this.currentAspectRatioFrameLayoutRatio, MediaController.this.currentAspectRatioFrameLayoutRotation);
            }
        }

        @Override // org.telegram.ui.Components.q71
        public void onRenderedFirstFrame() {
            if (MediaController.this.currentAspectRatioFrameLayout != null && !MediaController.this.currentAspectRatioFrameLayout.d) {
                MediaController.this.isDrawingWasReady = true;
                MediaController.this.currentAspectRatioFrameLayout.setDrawingReady(true);
                MediaController.this.currentTextureViewContainer.setTag(1);
            }
            if (MediaController.this.videoPlayer == null || !b5.d.u()) {
                return;
            }
            MediaController.this.videoPlayer.O(true);
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onSeekFinished(j2.a aVar) {
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onSeekStarted(j2.a aVar) {
        }

        @Override // org.telegram.ui.Components.q71
        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class AlbumEntry {
        public int bucketId;
        public String bucketName;
        public PhotoEntry coverPhoto;
        public ArrayList<PhotoEntry> photos = new ArrayList<>();
        public SparseArray<PhotoEntry> photosByIds = new SparseArray<>();
        public boolean videoOnly;

        public AlbumEntry(int i10, String str, PhotoEntry photoEntry) {
            this.bucketId = i10;
            this.bucketName = str;
            this.coverPhoto = photoEntry;
        }

        public void addPhoto(PhotoEntry photoEntry) {
            this.photos.add(photoEntry);
            this.photosByIds.put(photoEntry.imageId, photoEntry);
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class AudioBuffer {
        ByteBuffer buffer;
        byte[] bufferBytes;
        int finished;
        long pcmOffset;
        int size;

        public AudioBuffer(int i10) {
            this.buffer = ByteBuffer.allocateDirect(i10);
            this.bufferBytes = new byte[i10];
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class AudioEntry {
        public String author;
        public int duration;
        public String genre;
        public long id;
        public MessageObject messageObject;
        public String path;
        public String title;
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

        public boolean isEmpty() {
            Matrix matrix = this.matrix;
            if (matrix != null && !matrix.isIdentity()) {
                return false;
            }
            Matrix matrix2 = this.useMatrix;
            return (matrix2 == null || matrix2.isIdentity()) && this.cropPw == MediaController.VOLUME_NORMAL && this.cropPh == MediaController.VOLUME_NORMAL && this.cropScale == MediaController.VOLUME_NORMAL && this.cropRotate == 0.0f && this.transformWidth == 0 && this.transformHeight == 0 && this.transformRotation == 0 && !this.mirrored && this.stateScale == 0.0f && this.scale == 0.0f && this.width == 0 && this.height == 0 && !this.freeform && this.lockedAspectRatio == 0.0f;
        }

        @Override // org.telegram.tgnet.TLObject
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.cropPx = inputSerializedData.readFloat(z10);
            this.cropPy = inputSerializedData.readFloat(z10);
            this.cropScale = inputSerializedData.readFloat(z10);
            this.cropRotate = inputSerializedData.readFloat(z10);
            this.cropPw = inputSerializedData.readFloat(z10);
            this.cropPh = inputSerializedData.readFloat(z10);
            this.transformWidth = inputSerializedData.readInt32(z10);
            this.transformHeight = inputSerializedData.readInt32(z10);
            this.transformRotation = inputSerializedData.readInt32(z10);
            this.mirrored = inputSerializedData.readBool(z10);
            this.stateScale = inputSerializedData.readFloat(z10);
            this.scale = inputSerializedData.readFloat(z10);
            float[] fArr = new float[9];
            for (int i10 = 0; i10 < 9; i10++) {
                fArr[i10] = inputSerializedData.readFloat(z10);
            }
            Matrix matrix = new Matrix();
            this.matrix = matrix;
            matrix.setValues(fArr);
            this.width = inputSerializedData.readInt32(z10);
            this.height = inputSerializedData.readInt32(z10);
            this.freeform = inputSerializedData.readBool(z10);
            this.lockedAspectRatio = inputSerializedData.readFloat(z10);
            if (inputSerializedData.readInt32(z10) == 178403937) {
                for (int i11 = 0; i11 < 9; i11++) {
                    fArr[i11] = inputSerializedData.readFloat(z10);
                }
                Matrix matrix2 = new Matrix();
                this.useMatrix = matrix2;
                matrix2.setValues(fArr);
            }
            this.initied = inputSerializedData.readBool(z10);
            this.orientation = inputSerializedData.readInt32(z10);
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
                for (int i10 = 0; i10 < 9; i10++) {
                    fArr[i10] = 0.0f;
                }
            }
            for (int i11 = 0; i11 < 9; i11++) {
                outputSerializedData.writeFloat(fArr[i11]);
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
                for (int i12 = 0; i12 < 9; i12++) {
                    outputSerializedData.writeFloat(fArr[i12]);
                }
            }
            outputSerializedData.writeBool(this.initied);
            outputSerializedData.writeInt32(this.orientation);
        }

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
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class ExternalObserver extends ContentObserver {
        public ExternalObserver() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            MediaController.this.processMediaObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class GalleryObserverExternal extends ContentObserver {
        public GalleryObserverExternal() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onChange$0() {
            Runnable unused = MediaController.refreshGalleryRunnable = null;
            MediaController.loadGalleryPhotosAlbums(0);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            if (MediaController.refreshGalleryRunnable != null) {
                AndroidUtilities.cancelRunOnUIThread(MediaController.refreshGalleryRunnable);
            }
            AndroidUtilities.runOnUIThread(MediaController.refreshGalleryRunnable = new y1(1), 2000L);
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class GalleryObserverInternal extends ContentObserver {
        public GalleryObserverInternal() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$scheduleReloadRunnable$0() {
            if (PhotoViewer.t1().Q1()) {
                scheduleReloadRunnable();
            } else {
                Runnable unused = MediaController.refreshGalleryRunnable = null;
                MediaController.loadGalleryPhotosAlbums(0);
            }
        }

        private void scheduleReloadRunnable() {
            AndroidUtilities.runOnUIThread(MediaController.refreshGalleryRunnable = new g1(this, 7), 2000L);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            if (MediaController.refreshGalleryRunnable != null) {
                AndroidUtilities.cancelRunOnUIThread(MediaController.refreshGalleryRunnable);
            }
            scheduleReloadRunnable();
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public class InternalObserver extends ContentObserver {
        public InternalObserver() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            super.onChange(z10);
            MediaController.this.processMediaObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

        public String getPath() {
            return null;
        }

        public boolean isHighQuality() {
            Boolean bool = this.highQuality;
            return bool == null ? SharedConfig.photoHighQualityDefault : bool.booleanValue();
        }

        public boolean isLivePhoto() {
            return (this instanceof PhotoEntry) && ((PhotoEntry) this).isLivePhoto();
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
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class MediaLoader implements NotificationCenter.NotificationCenterDelegate {
        private boolean cancelled;
        private int copiedFiles;
        private AccountInstance currentAccount;
        private boolean finished;
        private float finishedProgress;
        private boolean isMusic;
        private HashMap<String, MessageObject> loadingMessageObjects = new HashMap<>();
        private ArrayList<MessageObject> messageObjects;
        private MessagesStorage.IntCallback onFinishRunnable;
        private org.telegram.ui.ActionBar.d2 progressDialog;
        private CountDownLatch waitingForFile;

        public MediaLoader(Context context, AccountInstance accountInstance, ArrayList<MessageObject> arrayList, MessagesStorage.IntCallback intCallback) {
            this.currentAccount = accountInstance;
            this.messageObjects = arrayList;
            this.onFinishRunnable = intCallback;
            this.isMusic = arrayList.get(0).isMusic();
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoadProgressChanged);
            this.currentAccount.getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 2, PhotoViewer.t1().Q1() ? new zh.b() : null);
            this.progressDialog = d2Var;
            d2Var.m(LocaleController.getString(R.string.Loading));
            this.progressDialog.setCancelable(true);
            org.telegram.ui.ActionBar.d2 d2Var2 = this.progressDialog;
            d2Var2.H = true;
            d2Var2.setOnCancelListener(new c6(this, 3));
        }

        private void addMessageToLoad(MessageObject messageObject) {
            AndroidUtilities.runOnUIThread(new i3(7, this, messageObject));
        }

        private void checkIfFinished() {
            if (this.loadingMessageObjects.isEmpty()) {
                AndroidUtilities.runOnUIThread(new y6(this, 4));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:? A[Catch: all -> 0x0164, SYNTHETIC, TRY_LEAVE, TryCatch #1 {all -> 0x0164, blocks: (B:57:0x0191, B:56:0x018e, B:96:0x015b, B:115:0x016c, B:52:0x0189), top: B:7:0x0015, inners: #4 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean copyFile(File file, File file2, String str) {
            File file3;
            boolean z10;
            FileInputStream fileInputStream;
            Throwable th2;
            FileChannel channel;
            Throwable th3;
            FileChannel channel2;
            String str2;
            if (AndroidUtilities.isInternalUri(Uri.fromFile(file))) {
                return false;
            }
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        try {
                            channel = fileInputStream2.getChannel();
                            try {
                                file3 = file2;
                            } catch (Throwable th4) {
                                th = th4;
                                file3 = file2;
                            }
                            try {
                                try {
                                    channel2 = new FileOutputStream(file3).getChannel();
                                    try {
                                        long size = channel.size();
                                        try {
                                            if (AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream2.getFD(), null)).intValue())) {
                                                if (this.progressDialog != null) {
                                                    AndroidUtilities.runOnUIThread(new y6(this, 2));
                                                }
                                                if (channel2 != null) {
                                                    try {
                                                        channel2.close();
                                                    } catch (Throwable th5) {
                                                        th3 = th5;
                                                        fileInputStream = fileInputStream2;
                                                        z10 = false;
                                                        if (channel == null) {
                                                        }
                                                    }
                                                }
                                                try {
                                                    channel.close();
                                                    try {
                                                        fileInputStream2.close();
                                                        return false;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        z10 = false;
                                                        FileLog.e(e);
                                                        file3.delete();
                                                        return z10;
                                                    }
                                                } catch (Throwable th6) {
                                                    th2 = th6;
                                                    fileInputStream = fileInputStream2;
                                                    z10 = false;
                                                    try {
                                                        fileInputStream.close();
                                                        throw th2;
                                                    } catch (Throwable th7) {
                                                        th2.addSuppressed(th7);
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            FileLog.e(th8);
                                        }
                                        long j3 = 0;
                                        long j10 = 0;
                                        while (j3 < size && !this.cancelled) {
                                            fileInputStream = fileInputStream2;
                                            z10 = false;
                                            try {
                                                channel2.transferFrom(channel, j3, Math.min(4096L, size - j3));
                                                long j11 = 4096 + j3;
                                                if (j11 < size && j10 > SystemClock.elapsedRealtime() - 500) {
                                                    j3 = j11;
                                                    fileInputStream2 = fileInputStream;
                                                }
                                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                                AndroidUtilities.runOnUIThread(new x6(this, (int) ((((100.0f / this.messageObjects.size()) * j3) / size) + this.finishedProgress), 1));
                                                j10 = elapsedRealtime;
                                                j3 = j11;
                                                fileInputStream2 = fileInputStream;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                Throwable th10 = th;
                                                if (channel2 == null) {
                                                    throw th10;
                                                }
                                                try {
                                                    channel2.close();
                                                    throw th10;
                                                } catch (Throwable th11) {
                                                    th10.addSuppressed(th11);
                                                    throw th10;
                                                }
                                            }
                                        }
                                        fileInputStream = fileInputStream2;
                                        z10 = false;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        fileInputStream = fileInputStream2;
                                        z10 = false;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    th3 = th;
                                    if (channel == null) {
                                        throw th3;
                                    }
                                    try {
                                        channel.close();
                                        throw th3;
                                    } catch (Throwable th14) {
                                        th3.addSuppressed(th14);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                fileInputStream = fileInputStream2;
                                z10 = false;
                                th3 = th;
                                if (channel == null) {
                                }
                            }
                        } catch (Throwable th16) {
                            th = th16;
                            th2 = th;
                            fileInputStream.close();
                            throw th2;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        file3 = file2;
                        fileInputStream = fileInputStream2;
                        z10 = false;
                        th2 = th;
                        fileInputStream.close();
                        throw th2;
                    }
                } catch (Exception e7) {
                    e = e7;
                    FileLog.e(e);
                    file3.delete();
                    return z10;
                }
            } catch (Exception e10) {
                e = e10;
                file3 = file2;
            }
            if (this.cancelled) {
                if (channel2 != null) {
                    channel2.close();
                }
                channel.close();
                fileInputStream.close();
                file3.delete();
                return z10;
            }
            if (this.isMusic) {
                AndroidUtilities.addMediaToGallery(file3);
            } else {
                DownloadManager downloadManager = (DownloadManager) ApplicationLoader.applicationContext.getSystemService("download");
                if (TextUtils.isEmpty(str)) {
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    String name = file3.getName();
                    int lastIndexOf = name.lastIndexOf(46);
                    if (lastIndexOf != -1) {
                        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(name.substring(lastIndexOf + 1).toLowerCase());
                        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                            mimeTypeFromExtension = "text/plain";
                        }
                        str2 = mimeTypeFromExtension;
                    } else {
                        str2 = "text/plain";
                    }
                } else {
                    str2 = str;
                }
                downloadManager.addCompletedDownload(file3.getName(), file3.getName(), false, str2, file3.getAbsolutePath(), file3.length(), true);
            }
            float size2 = (100.0f / this.messageObjects.size()) + this.finishedProgress;
            this.finishedProgress = size2;
            AndroidUtilities.runOnUIThread(new x6(this, (int) size2, 2));
            if (channel2 != null) {
                channel2.close();
            }
            channel.close();
            fileInputStream.close();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addMessageToLoad$7(MessageObject messageObject) {
            TLRPC.Document document = messageObject.getDocument();
            TLRPC.Document document2 = messageObject.qualityToSave;
            if (document2 != null) {
                document = document2;
            }
            if (document == null) {
                return;
            }
            this.loadingMessageObjects.put(FileLoader.getAttachFileName(document), messageObject);
            this.currentAccount.getFileLoader().loadFile(document, messageObject, 3, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$checkIfFinished$3() {
            this.onFinishRunnable.run(this.copiedFiles);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$checkIfFinished$4() {
            try {
                if (this.progressDialog.isShowing()) {
                    this.progressDialog.dismiss();
                } else {
                    this.finished = true;
                }
                if (this.onFinishRunnable != null) {
                    AndroidUtilities.runOnUIThread(new y6(this, 3));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.currentAccount.getNotificationCenter().removeObserver(this, NotificationCenter.fileLoaded);
            this.currentAccount.getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadProgressChanged);
            this.currentAccount.getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadFailed);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$copyFile$10(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$copyFile$8() {
            try {
                this.progressDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$copyFile$9(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$didReceivedNotification$11(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(DialogInterface dialogInterface) {
            this.cancelled = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processLivePhotoMessage$5(boolean z10, TLRPC.PhotoSize photoSize, MessageObject messageObject, TLRPC.Photo photo, boolean z11, TLRPC.Document document) {
            MessageObject messageObject2;
            if (z10) {
                this.loadingMessageObjects.put(FileLoader.getAttachFileName(photoSize), messageObject);
                messageObject2 = messageObject;
                this.currentAccount.getFileLoader().loadFile(ImageLocation.getForPhoto(photoSize, photo), messageObject2, "jpg", 3, 0);
            } else {
                messageObject2 = messageObject;
            }
            if (z11) {
                this.loadingMessageObjects.put(FileLoader.getAttachFileName(document), messageObject2);
                this.currentAccount.getFileLoader().loadFile(document, messageObject2, 3, 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$processLivePhotoMessage$6(int i10) {
            try {
                this.progressDialog.n(i10);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$start$1() {
            if (this.finished) {
                return;
            }
            this.progressDialog.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$start$2() {
            File file;
            File file2;
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    int size = this.messageObjects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        MessageObject messageObject = this.messageObjects.get(i10);
                        if (!processLivePhotoMessage(messageObject)) {
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
                                FileLoader fileLoader = FileLoader.getInstance(this.currentAccount.getCurrentAccount());
                                TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
                                TLRPC.Document document3 = messageObject.qualityToSave;
                                if (document3 != null) {
                                    file2 = fileLoader.getPathToAttach(document3, null, false, true);
                                } else {
                                    File pathToMessage = fileLoader.getPathToMessage(messageObject.messageOwner, true);
                                    if (media instanceof TLRPC.TL_messageMediaDocument) {
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) media;
                                        if (!tL_messageMediaDocument.alt_documents.isEmpty()) {
                                            file2 = fileLoader.getPathToAttach(tL_messageMediaDocument.alt_documents.get(0), null, false, true);
                                        }
                                    }
                                    file2 = pathToMessage;
                                }
                                str = file2.toString();
                            }
                            File file3 = new File(str);
                            if (!file3.exists()) {
                                this.waitingForFile = new CountDownLatch(1);
                                addMessageToLoad(messageObject);
                                this.waitingForFile.await();
                            }
                            if (this.cancelled) {
                                break;
                            }
                            if (!file3.exists()) {
                                file3 = FileLoader.getInstance(this.currentAccount.getCurrentAccount()).getPathToAttach(messageObject.messageOwner, true);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("saving file: correcting path from ");
                                sb2.append(str);
                                sb2.append(" to ");
                                sb2.append(file3 == null ? null : file3.getAbsolutePath());
                                FileLog.d(sb2.toString());
                            }
                            if (file3 != null && file3.exists()) {
                                MediaController.saveFileInternal(this.isMusic ? 3 : 2, file3, documentFileName);
                                this.copiedFiles++;
                            }
                        }
                    }
                } else {
                    File externalStoragePublicDirectory = this.isMusic ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    externalStoragePublicDirectory.mkdir();
                    int size2 = this.messageObjects.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        MessageObject messageObject2 = this.messageObjects.get(i11);
                        if (!processLivePhotoMessage(messageObject2)) {
                            TLRPC.Document document4 = messageObject2.getDocument();
                            TLRPC.Document document5 = messageObject2.qualityToSave;
                            if (document5 != null) {
                                document4 = document5;
                            }
                            String documentFileName2 = FileLoader.getDocumentFileName(document4);
                            File file4 = new File(externalStoragePublicDirectory, documentFileName2);
                            if (file4.exists()) {
                                int lastIndexOf = documentFileName2.lastIndexOf(46);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= 10) {
                                        break;
                                    }
                                    File file5 = new File(externalStoragePublicDirectory, lastIndexOf != -1 ? documentFileName2.substring(0, lastIndexOf) + "(" + (i12 + 1) + ")" + documentFileName2.substring(lastIndexOf) : documentFileName2 + "(" + (i12 + 1) + ")");
                                    if (!file5.exists()) {
                                        file4 = file5;
                                        break;
                                    } else {
                                        i12++;
                                        file4 = file5;
                                    }
                                }
                            }
                            if (!file4.exists()) {
                                file4.createNewFile();
                            }
                            String str2 = messageObject2.messageOwner.attachPath;
                            if (messageObject2.qualityToSave != null) {
                                str2 = null;
                            }
                            if (str2 != null && str2.length() > 0 && !new File(str2).exists()) {
                                str2 = null;
                            }
                            if (messageObject2.qualityToSave != null) {
                                file = FileLoader.getInstance(this.currentAccount.getCurrentAccount()).getPathToAttach(messageObject2.qualityToSave, null, false, true);
                            } else {
                                if (str2 == null || str2.length() == 0) {
                                    str2 = FileLoader.getInstance(this.currentAccount.getCurrentAccount()).getPathToMessage(messageObject2.messageOwner).toString();
                                }
                                file = new File(str2);
                            }
                            if (!file.exists()) {
                                this.waitingForFile = new CountDownLatch(1);
                                addMessageToLoad(messageObject2);
                                this.waitingForFile.await();
                            }
                            if (file.exists()) {
                                copyFile(file, file4, messageObject2.getMimeType());
                                this.copiedFiles++;
                            }
                        }
                    }
                }
                checkIfFinished();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v5 */
        private boolean processLivePhotoMessage(MessageObject messageObject) {
            TLRPC.MessageMedia media;
            TLRPC.Photo photo;
            TLRPC.PhotoSize closestPhotoSizeWithSize;
            boolean z10 = false;
            if (!messageObject.isLivePhoto() || (media = MessageObject.getMedia(messageObject.messageOwner)) == null || (photo = media.photo) == null || media.document == null || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(true), false, null, true)) == null) {
                return false;
            }
            FileLoader fileLoader = FileLoader.getInstance(this.currentAccount.getCurrentAccount());
            File pathToAttach = fileLoader.getPathToAttach(closestPhotoSizeWithSize, null, false, true);
            File pathToAttach2 = fileLoader.getPathToAttach(media.document, null, false, true);
            ?? r22 = (pathToAttach == null || !pathToAttach.exists()) ? 1 : 0;
            ?? r62 = (pathToAttach2 == null || !pathToAttach2.exists()) ? 1 : 0;
            int i10 = r22 + r62;
            if (i10 > 0) {
                this.waitingForFile = new CountDownLatch(i10);
                AndroidUtilities.runOnUIThread(new z6(this, (boolean) r22, closestPhotoSizeWithSize, messageObject, media.photo, (boolean) r62, media.document));
                this.waitingForFile.await();
            }
            if (!this.cancelled) {
                if (pathToAttach == null || !pathToAttach.exists()) {
                    pathToAttach = fileLoader.getPathToAttach(closestPhotoSizeWithSize, null, true, true);
                }
                if (pathToAttach2 == null || !pathToAttach2.exists()) {
                    pathToAttach2 = fileLoader.getPathToAttach(media.document, null, true, true);
                }
                if (pathToAttach != null && pathToAttach.exists() && pathToAttach2 != null && pathToAttach2.exists()) {
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
                        Uri contentUri = MediaStore.Downloads.getContentUri("external_primary");
                        contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                        contentValues.put("_display_name", generateFileName);
                        contentValues.put("mime_type", mimeTypeFromExtension);
                        Uri insert = ApplicationLoader.applicationContext.getContentResolver().insert(contentUri, contentValues);
                        if (insert != null) {
                            OutputStream openOutputStream = ApplicationLoader.applicationContext.getContentResolver().openOutputStream(insert);
                            if (openOutputStream != null) {
                                try {
                                    MediaController.writeMotionPhoto(pathToAttach, pathToAttach2, openOutputStream, null);
                                    z10 = !this.cancelled;
                                } finally {
                                }
                            }
                            if (openOutputStream != null) {
                                openOutputStream.close();
                            }
                            if (z10) {
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
                    float size = (100.0f / this.messageObjects.size()) + this.finishedProgress;
                    this.finishedProgress = size;
                    AndroidUtilities.runOnUIThread(new x6(this, (int) size, 3));
                    return true;
                }
            }
            return true;
        }

        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
        public void didReceivedNotification(int i10, int i11, Object... objArr) {
            if (i10 == NotificationCenter.fileLoaded || i10 == NotificationCenter.fileLoadFailed) {
                if (this.loadingMessageObjects.remove((String) objArr[0]) != null) {
                    this.waitingForFile.countDown();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.fileLoadProgressChanged) {
                if (this.loadingMessageObjects.containsKey((String) objArr[0])) {
                    AndroidUtilities.runOnUIThread(new x6(this, (int) a4.a.e(((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue(), this.messageObjects.size(), 100.0f, this.finishedProgress), 0));
                }
            }
        }

        public void start() {
            AndroidUtilities.runOnUIThread(new y6(this, 0), 250L);
            new Thread(new y6(this, 1)).start();
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class MusicListenReporter {
        private TLRPC.InputDocument audio;
        public final int currentAccount;
        private long rangeStart = -9223372036854775807L;
        private final ArrayList<Pair<Long, Long>> ranges = new ArrayList<>();
        private final Runnable reportRunnable = new g1(this, 8);

        public MusicListenReporter(int i10) {
            this.currentAccount = i10;
        }

        private long getTotalListened() {
            ArrayList<Pair<Long, Long>> arrayList = this.ranges;
            int size = arrayList.size();
            long j3 = 0;
            int i10 = 0;
            while (i10 < size) {
                Pair<Long, Long> pair = arrayList.get(i10);
                i10++;
                Pair<Long, Long> pair2 = pair;
                j3 += ((Long) pair2.second).longValue() - ((Long) pair2.first).longValue();
            }
            return j3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void listenedRange(long j3, long j10) {
            int i10 = 0;
            while (i10 < this.ranges.size() && ((Long) this.ranges.get(i10).first).longValue() <= j3) {
                i10++;
            }
            this.ranges.add(i10, new Pair<>(Long.valueOf(j3), Long.valueOf(j10)));
            int max = Math.max(0, i10 - 1);
            while (max < this.ranges.size() - 1) {
                Pair<Long, Long> pair = this.ranges.get(max);
                int i11 = max + 1;
                Pair<Long, Long> pair2 = this.ranges.get(i11);
                if (((Long) pair.second).longValue() >= ((Long) pair2.first).longValue()) {
                    this.ranges.set(max, new Pair<>((Long) pair.first, Long.valueOf(Math.max(((Long) pair.second).longValue(), ((Long) pair2.second).longValue()))));
                    this.ranges.remove(i11);
                } else {
                    max = i11;
                }
            }
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

        public b2.z0 getPlayerListener(final r rVar) {
            return new b2.z0() { // from class: org.telegram.messenger.MediaController.MusicListenReporter.1
                private void closeRange() {
                    long J0 = ((i2.e0) rVar).J0();
                    if (MusicListenReporter.this.rangeStart != -9223372036854775807L && J0 > MusicListenReporter.this.rangeStart) {
                        MusicListenReporter musicListenReporter = MusicListenReporter.this;
                        musicListenReporter.listenedRange(musicListenReporter.rangeStart, J0);
                    }
                    MusicListenReporter.this.rangeStart = -9223372036854775807L;
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onCues(d2.c cVar) {
                }

                @Override // b2.z0
                public void onIsPlayingChanged(boolean z10) {
                    if (z10) {
                        MusicListenReporter.this.rangeStart = ((i2.e0) rVar).J0();
                    } else {
                        closeRange();
                    }
                    AndroidUtilities.cancelRunOnUIThread(MusicListenReporter.this.reportRunnable);
                    if (z10) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(MusicListenReporter.this.reportRunnable, 60000L);
                }

                @Override // b2.z0
                @Deprecated
                public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i10) {
                }

                @Override // b2.z0
                @Deprecated
                public /* bridge */ /* synthetic */ void onCues(List list) {
                }

                @Override // b2.z0
                public void onPositionDiscontinuity(b2.a1 a1Var, b2.a1 a1Var2, int i10) {
                    if (i10 == 1) {
                        if (MusicListenReporter.this.rangeStart != -9223372036854775807L) {
                            MusicListenReporter musicListenReporter = MusicListenReporter.this;
                            musicListenReporter.listenedRange(musicListenReporter.rangeStart, a1Var.f);
                        }
                        MusicListenReporter.this.rangeStart = ((b2.g) rVar).i0() ? a1Var2.f : -9223372036854775807L;
                        AndroidUtilities.cancelRunOnUIThread(MusicListenReporter.this.reportRunnable);
                    }
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onAudioAttributesChanged(b2.e eVar) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i10) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(b2.x0 x0Var) {
                }

                public /* bridge */ /* synthetic */ void onDeviceInfoChanged(b2.l lVar) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z10) {
                }

                @Override // b2.z0
                @Deprecated
                public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z10) {
                }

                public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j3) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onMediaMetadataChanged(b2.n0 n0Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onMetadata(b2.p0 p0Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(b2.v0 v0Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onPlaybackStateChanged(int i10) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onPlayerError(b2.u0 u0Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onPlayerErrorChanged(b2.u0 u0Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(b2.n0 n0Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i10) {
                }

                public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j3) {
                }

                public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j3) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(b2.q1 q1Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onTracksChanged(b2.s1 s1Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onVideoSizeChanged(b2.x1 x1Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onVolumeChanged(float f7) {
                }

                public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onEvents(b2.b1 b1Var, b2.y0 y0Var) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onMediaItemTransition(b2.k0 k0Var, int i10) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
                }

                @Override // b2.z0
                @Deprecated
                public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
                }

                @Override // b2.z0
                public /* bridge */ /* synthetic */ void onTimelineChanged(b2.k1 k1Var, int i10) {
                }
            };
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
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

        public PhotoEntry(int i10, int i11, long j3, String str, int i12, boolean z10, int i13, int i14, long j10) {
            this.bucketId = i10;
            this.imageId = i11;
            this.dateTaken = j3;
            this.path = str;
            this.width = i13;
            this.height = i14;
            this.size = j10;
            if (z10) {
                this.duration = i12;
            } else {
                this.orientation = i12;
            }
            this.isVideo = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Bitmap lambda$rebuildPhoto$0(BitmapFactory.Options options) {
            String str = this.filterPath;
            if (str == null) {
                str = this.path;
            }
            return BitmapFactory.decodeFile(str, options);
        }

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public void copyFrom(MediaEditState mediaEditState) {
            super.copyFrom(mediaEditState);
            boolean z10 = mediaEditState instanceof PhotoEntry;
            boolean z11 = false;
            this.hasSpoiler = z10 && ((PhotoEntry) mediaEditState).hasSpoiler;
            this.starsAmount = z10 ? ((PhotoEntry) mediaEditState).starsAmount : 0L;
            this.parsedXmp = z10 && ((PhotoEntry) mediaEditState).parsedXmp;
            if (z10 && ((PhotoEntry) mediaEditState).isLivePhoto) {
                z11 = true;
            }
            this.isLivePhoto = z11;
            this.livePhotoVideoOffset = z10 ? ((PhotoEntry) mediaEditState).livePhotoVideoOffset : 0L;
            this.livePhotoTimestampUs = z10 ? ((PhotoEntry) mediaEditState).livePhotoTimestampUs : 0L;
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

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public String getPath() {
            return this.path;
        }

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public boolean isLivePhoto() {
            e6.n nVar;
            if (this.isVideo || this.parsedXmp) {
                return this.isLivePhoto;
            }
            this.parsedXmp = true;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                String b10 = new r1.g(new File(this.path)).b("Xmp");
                if (b10 != null) {
                    k3.c cVar = null;
                    try {
                        nVar = k3.e.a(b10);
                    } catch (b2.s0 | NumberFormatException | XmlPullParserException unused) {
                        e2.a.n("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        nVar = null;
                    }
                    if (nVar != null) {
                        e9.a1 a1Var = (e9.a1) nVar.c;
                        k3.c cVar2 = null;
                        for (int i10 = 0; i10 < a1Var.d; i10++) {
                            k3.c cVar3 = (k3.c) a1Var.get(i10);
                            String str = cVar3.b;
                            if ("Primary".equalsIgnoreCase(str)) {
                                cVar = cVar3;
                            } else if ("MotionPhoto".equalsIgnoreCase(str)) {
                                cVar2 = cVar3;
                            }
                        }
                        if (cVar != null && cVar2 != null) {
                            long j3 = cVar2.c;
                            if (j3 > 0) {
                                try {
                                    long length = new File(this.path).length() - j3;
                                    this.isVideo = true;
                                    this.isLivePhoto = true;
                                    this.livePhotoVideoOffset = length;
                                    this.livePhotoTimestampUs = nVar.b;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                this.isLivePhoto = false;
            }
            StringBuilder sb2 = new StringBuilder("parsed isLivePhoto()=");
            sb2.append(this.isLivePhoto);
            sb2.append(" in ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            hc.b.v("ms", sb2);
            return this.isLivePhoto;
        }

        public boolean isUnalivePhoto() {
            Boolean bool = this.discardLivePhoto;
            return bool == null ? !SharedConfig.photoLiveDefault : bool.booleanValue();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00db  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void rebuildPhoto(boolean z10) {
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
            Bitmap q6 = bi.r9.q(new c0(this, 7), AndroidUtilities.getPhotoSize(z10), AndroidUtilities.getPhotoSize(z10), 0, true);
            if (this.imagePath != null) {
                new File(this.imagePath).delete();
                this.imagePath = null;
            }
            CropState cropState = this.cropState;
            if (cropState != null) {
                createBitmap = PhotoViewer.I0(q6, cropState, new int[]{((Integer) imageOrientation.first).intValue(), ((Integer) imageOrientation.second).intValue()}, true);
                q6.recycle();
            } else {
                if (((Integer) imageOrientation.first).intValue() == 0) {
                    bitmap = q6;
                    str = this.fullPaintPath;
                    if (str != null) {
                        this.imagePath = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap, compressFormat, AndroidUtilities.getPhotoSize(z10), AndroidUtilities.getPhotoSize(z10), z10 ? 99 : 87, false, 101, 101), true).toString();
                    } else {
                        if (this.cropState != null) {
                            Bitmap decodeFile2 = BitmapFactory.decodeFile(str);
                            decodeFile = PhotoViewer.I0(decodeFile2, this.cropState, null, false);
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
                            this.imagePath = PhotoViewer.y1();
                            createBitmap2.compress(compressFormat, z10 ? 99 : 87, new FileOutputStream(this.imagePath));
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
                Matrix matrix = new Matrix();
                matrix.postRotate(((Integer) imageOrientation.first).intValue());
                if (((Integer) imageOrientation.second).intValue() == 1) {
                    matrix.postScale(-1.0f, MediaController.VOLUME_NORMAL);
                } else if (((Integer) imageOrientation.second).intValue() == 2) {
                    matrix.postScale(MediaController.VOLUME_NORMAL, -1.0f);
                }
                createBitmap = Bitmaps.createBitmap(q6, 0, 0, q6.getWidth(), q6.getHeight(), matrix, true);
                q6.recycle();
            }
            bitmap = createBitmap;
            str = this.fullPaintPath;
            if (str != null) {
            }
            if (bitmap == null) {
            }
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

        public PhotoEntry setOrientation(Pair<Integer, Integer> pair) {
            this.orientation = ((Integer) pair.first).intValue();
            this.invert = ((Integer) pair.second).intValue();
            return this;
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

        public PhotoEntry setOrientation(int i10, int i11) {
            this.orientation = i10;
            this.invert = i11;
            return this;
        }

        public PhotoEntry(int i10, int i11, long j3, String str, int i12, int i13, boolean z10, int i14, int i15, long j10) {
            this.bucketId = i10;
            this.imageId = i11;
            this.dateTaken = j3;
            this.path = str;
            this.width = i14;
            this.height = i15;
            this.size = j10;
            this.duration = i13;
            this.orientation = i12;
            this.isVideo = z10;
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class PlaylistGlobalSearchParams {
        final long dialogId;
        public boolean endReached;
        final fg.q0 filter;
        public int folderId;
        final long maxDate;
        final long minDate;
        public int nextSearchRate;
        final String query;
        public yg.p0 reaction;
        public long topicId;
        public int totalCount;

        public PlaylistGlobalSearchParams(String str, long j3, long j10, long j11, fg.q0 q0Var) {
            this.filter = q0Var;
            this.query = str;
            this.dialogId = j3;
            this.minDate = j10;
            this.maxDate = j11;
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class SavedFilterState {
        public float blurAngle;
        public float blurExcludeBlurSize;
        public PointF blurExcludePoint;
        public float blurExcludeSize;
        public int blurType;
        public float contrastValue;
        public of0 curvesToolValue = new of0();
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

        public boolean isEmpty() {
            return Math.abs(this.enhanceValue) < 0.1f && Math.abs(this.softenSkinValue) < 0.1f && Math.abs(this.exposureValue) < 0.1f && Math.abs(this.contrastValue) < 0.1f && Math.abs(this.warmthValue) < 0.1f && Math.abs(this.saturationValue) < 0.1f && Math.abs(this.fadeValue) < 0.1f && this.tintShadowsColor == 0 && this.tintHighlightsColor == 0 && Math.abs(this.highlightsValue) < 0.1f && Math.abs(this.shadowsValue) < 0.1f && Math.abs(this.vignetteValue) < 0.1f && Math.abs(this.grainValue) < 0.1f && this.blurType == 0 && Math.abs(this.sharpenValue) < 0.1f;
        }

        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.enhanceValue = inputSerializedData.readFloat(z10);
            this.softenSkinValue = inputSerializedData.readFloat(z10);
            this.exposureValue = inputSerializedData.readFloat(z10);
            this.contrastValue = inputSerializedData.readFloat(z10);
            this.warmthValue = inputSerializedData.readFloat(z10);
            this.saturationValue = inputSerializedData.readFloat(z10);
            this.fadeValue = inputSerializedData.readFloat(z10);
            this.tintShadowsColor = inputSerializedData.readInt32(z10);
            this.tintHighlightsColor = inputSerializedData.readInt32(z10);
            this.highlightsValue = inputSerializedData.readFloat(z10);
            this.shadowsValue = inputSerializedData.readFloat(z10);
            this.vignetteValue = inputSerializedData.readFloat(z10);
            this.grainValue = inputSerializedData.readFloat(z10);
            this.blurType = inputSerializedData.readInt32(z10);
            this.sharpenValue = inputSerializedData.readFloat(z10);
            of0 of0Var = this.curvesToolValue;
            of0Var.a.c(inputSerializedData, z10);
            of0Var.b.c(inputSerializedData, z10);
            of0Var.c.c(inputSerializedData, z10);
            of0Var.d.c(inputSerializedData, z10);
            this.blurExcludeSize = inputSerializedData.readFloat(z10);
            if (inputSerializedData.readInt32(z10) == 1450380236) {
                this.blurExcludePoint = null;
            } else {
                if (this.blurExcludePoint == null) {
                    this.blurExcludePoint = new PointF();
                }
                this.blurExcludePoint.x = inputSerializedData.readFloat(z10);
                this.blurExcludePoint.y = inputSerializedData.readFloat(z10);
            }
            this.blurExcludeBlurSize = inputSerializedData.readFloat(z10);
            this.blurAngle = inputSerializedData.readFloat(z10);
        }

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
            of0 of0Var = this.curvesToolValue;
            of0Var.a.d(outputSerializedData);
            of0Var.b.d(outputSerializedData);
            of0Var.c.d(outputSerializedData);
            of0Var.d.d(outputSerializedData);
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
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class SavedMusicPlaylistState {
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

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public String getPath() {
            return this.photoSize != null ? FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.photoSize, true).getAbsolutePath() : this.document != null ? FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.document, true).getAbsolutePath() : ImageLoader.getHttpFilePath(this.imageUrl, "jpg").getAbsolutePath();
        }

        public String getPathToAttach() {
            return this.photoSize != null ? FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.photoSize, true).getAbsolutePath() : this.document != null ? FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(this.document, true).getAbsolutePath() : this.imageUrl;
        }

        @Override // org.telegram.messenger.MediaController.MediaEditState
        public void reset() {
            super.reset();
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

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public final class StopMediaObserverRunnable implements Runnable {
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class VideoConvertMessage {
        public int currentAccount;
        public boolean foreground;
        public boolean foregroundConversion;
        public MessageObject messageObject;
        public VideoEditedInfo videoEditedInfo;

        public VideoConvertMessage(MessageObject messageObject, VideoEditedInfo videoEditedInfo, boolean z10, boolean z11) {
            this.messageObject = messageObject;
            this.currentAccount = messageObject.currentAccount;
            this.videoEditedInfo = videoEditedInfo;
            this.foreground = z10;
            this.foregroundConversion = z11;
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public static class VideoConvertRunnable implements Runnable {
        private VideoConvertMessage convertMessage;

        private VideoConvertRunnable(VideoConvertMessage videoConvertMessage) {
            this.convertMessage = videoConvertMessage;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$runConversion$0(VideoConvertMessage videoConvertMessage) {
            try {
                Thread thread = new Thread(new VideoConvertRunnable(videoConvertMessage), "VideoConvertRunnable");
                thread.start();
                thread.join();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static void runConversion(VideoConvertMessage videoConvertMessage) {
            new Thread(new g1(videoConvertMessage, 9)).start();
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaController.getInstance().convertVideo(this.convertMessage);
        }
    }

    /* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
    public interface VideoConvertorListener {
        boolean checkConversionCanceled();

        void didWriteData(long j3, float f7);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        projectionPhotos = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i10 > 28 ? "date_modified" : "datetaken", "orientation", "width", "height", "_size"};
        projectionVideo = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i10 > 28 ? "date_modified" : "datetaken", "duration", "width", "height", "_size"};
        cachedEncoderBitrates = new ConcurrentHashMap<>();
        allMediaAlbums = new ArrayList<>();
        allPhotoAlbums = new ArrayList<>();
    }

    public MediaController() {
        DispatchQueue dispatchQueue = new DispatchQueue("recordQueue");
        this.recordQueue = dispatchQueue;
        dispatchQueue.setPriority(10);
        DispatchQueue dispatchQueue2 = new DispatchQueue("fileEncodingQueue");
        this.fileEncodingQueue = dispatchQueue2;
        dispatchQueue2.setPriority(10);
        this.recordQueue.postRunnable(new b6(this, 6));
        Utilities.globalQueue.postRunnable(new b6(this, 7));
        this.fileBuffer = ByteBuffer.allocateDirect(1920);
        AndroidUtilities.runOnUIThread(new b6(this, 8));
        this.mediaProjections = new String[]{"_data", "_display_name", "bucket_display_name", Build.VERSION.SDK_INT > 28 ? "date_modified" : "datetaken", "title", "width", "height"};
        ContentResolver contentResolver = ApplicationLoader.applicationContext.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new GalleryObserverExternal());
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new GalleryObserverInternal());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new GalleryObserverExternal());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new GalleryObserverInternal());
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    private static void broadcastNewPhotos(int i10, ArrayList<AlbumEntry> arrayList, ArrayList<AlbumEntry> arrayList2, Integer num, AlbumEntry albumEntry, AlbumEntry albumEntry2, AlbumEntry albumEntry3, int i11) {
        Runnable runnable = broadcastPhotosRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        fg.f1 f1Var = new fg.f1(i10, arrayList, arrayList2, num, albumEntry, albumEntry2, albumEntry3);
        broadcastPhotosRunnable = f1Var;
        AndroidUtilities.runOnUIThread(f1Var, i11);
    }

    private static String buildMotionPhotoXmp(long j3) {
        return org.telegram.ui.Cells.r6.h(j3, "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
    }

    private void buildShuffledPlayList() {
        MessageObject messageObject;
        if (this.playlist.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.playlist);
        this.shuffledPlaylist.clear();
        int i10 = this.currentPlaylistNum;
        if (i10 < 0 || i10 >= this.playlist.size()) {
            messageObject = null;
        } else {
            messageObject = this.playlist.get(this.currentPlaylistNum);
            arrayList.remove(this.currentPlaylistNum);
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            int nextInt = Utilities.random.nextInt(arrayList.size());
            this.shuffledPlaylist.add((MessageObject) arrayList.get(nextInt));
            arrayList.remove(nextInt);
        }
        if (messageObject != null) {
            this.shuffledPlaylist.add(messageObject);
            this.currentPlaylistNum = this.shuffledPlaylist.size() - 1;
        }
    }

    private boolean canStartMusicPlayerService() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            return ((!messageObject.isMusic() && !this.playingMessageObject.isVoice() && !this.playingMessageObject.isRoundVideo()) || this.playingMessageObject.isVoiceOnce() || this.playingMessageObject.isRoundOnce()) ? false : true;
        }
        return false;
    }

    private void checkAudioFocus(MessageObject messageObject) {
        int requestAudioFocus;
        int i10 = (messageObject.isVoice() || messageObject.isRoundVideo()) ? this.useFrontSpeaker ? 3 : 2 : 1;
        if (this.hasAudioFocus != i10) {
            this.hasAudioFocus = i10;
            if (i10 == 3) {
                requestAudioFocus = NotificationsController.audioManager.requestAudioFocus(this, 0, 1);
            } else {
                requestAudioFocus = NotificationsController.audioManager.requestAudioFocus(this, 3, (i10 != 2 || SharedConfig.pauseMusicOnMedia) ? 1 : 3);
            }
            if (requestAudioFocus == 1) {
                this.audioFocus = 2;
            }
        }
    }

    private void checkForegroundConvertMessage(boolean z10) {
        if (this.foregroundConvertingMessages.isEmpty()) {
            this.currentForegroundConvertingVideo = null;
        } else {
            this.currentForegroundConvertingVideo = this.foregroundConvertingMessages.get(0);
        }
        if (this.currentForegroundConvertingVideo != null || z10) {
            VideoEncodingService.start(z10);
        }
    }

    public static void checkGallery() {
        AlbumEntry albumEntry;
        if (Build.VERSION.SDK_INT < 24 || (albumEntry = allPhotosAlbumEntry) == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new di.u2(albumEntry.photos.size(), 2), 2000L);
    }

    private void checkIsNextMusicFileDownloaded(int i10) {
        int i11;
        if (DownloadController.getInstance(i10).canDownloadNextTrack()) {
            ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
            if (arrayList != null) {
                if (arrayList.size() < 2) {
                    return;
                }
                if (SharedConfig.playOrderReversed) {
                    i11 = this.currentPlaylistNum + 1;
                    if (i11 >= arrayList.size()) {
                        i11 = 0;
                    }
                } else {
                    i11 = this.currentPlaylistNum - 1;
                    if (i11 < 0) {
                        i11 = arrayList.size() - 1;
                    }
                }
                if (i11 < 0 || i11 >= arrayList.size()) {
                    return;
                }
                MessageObject messageObject = arrayList.get(i11);
                File file = null;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    File file2 = new File(messageObject.messageOwner.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                File pathToMessage = file != null ? file : FileLoader.getInstance(i10).getPathToMessage(messageObject.messageOwner);
                pathToMessage.exists();
                if (pathToMessage == file || pathToMessage.exists() || !messageObject.isMusic()) {
                    return;
                }
                FileLoader.getInstance(i10).loadFile(messageObject.getDocument(), messageObject, 0, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
            }
        }
    }

    private void checkIsNextVoiceFileDownloaded(int i10) {
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
            File pathToMessage = file != null ? file : FileLoader.getInstance(i10).getPathToMessage(messageObject.messageOwner);
            pathToMessage.exists();
            if (pathToMessage == file || pathToMessage.exists()) {
                return;
            }
            FileLoader.getInstance(i10).loadFile(messageObject.getDocument(), messageObject, 0, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
        }
    }

    private void checkScreenshots(ArrayList<Long> arrayList) {
        if (arrayList == null || arrayList.isEmpty() || this.lastChatEnterTime == 0) {
            return;
        }
        if (this.lastUser != null || (this.lastSecretChat instanceof TLRPC.TL_encryptedChat)) {
            boolean z10 = false;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l4 = arrayList.get(i10);
                if ((this.lastMediaCheckTime == 0 || l4.longValue() > this.lastMediaCheckTime) && l4.longValue() >= this.lastChatEnterTime && (this.lastChatLeaveTime == 0 || l4.longValue() <= this.lastChatLeaveTime + 2000)) {
                    this.lastMediaCheckTime = Math.max(this.lastMediaCheckTime, l4.longValue());
                    z10 = true;
                }
            }
            if (z10) {
                if (this.lastSecretChat != null) {
                    SecretChatHelper.getInstance(this.lastChatAccount).sendScreenshotMessage(this.lastSecretChat, this.lastChatVisibleMessages, null);
                } else {
                    SendMessagesHelper.getInstance(this.lastChatAccount).sendScreenshotMessage(this.lastUser, this.lastMessageId, null);
                }
            }
        }
    }

    private void clearMusicPlaylistState() {
        this.savedMusicPlaylistState = null;
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

    /* JADX INFO: Access modifiers changed from: private */
    public boolean convertVideo(final VideoConvertMessage videoConvertMessage) {
        File file;
        int i10;
        long j3;
        long j10;
        long j11;
        boolean z10;
        long j12;
        int i11;
        File file2;
        boolean z11;
        MessageObject messageObject = videoConvertMessage.messageObject;
        final VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        if (messageObject == null || videoEditedInfo == null) {
            return false;
        }
        String str = videoEditedInfo.originalPath;
        long j13 = videoEditedInfo.videoOffset;
        long j14 = videoEditedInfo.startTime;
        long j15 = videoEditedInfo.avatarStartTime;
        long j16 = videoEditedInfo.endTime;
        int i12 = videoEditedInfo.resultWidth;
        int i13 = videoEditedInfo.resultHeight;
        int i14 = videoEditedInfo.rotationValue;
        int i15 = videoEditedInfo.originalWidth;
        int i16 = videoEditedInfo.originalHeight;
        int i17 = videoEditedInfo.framerate;
        int i18 = videoEditedInfo.bitrate;
        int i19 = videoEditedInfo.originalBitrate;
        boolean z12 = DialogObject.isEncryptedDialog(messageObject.getDialogId()) || videoEditedInfo.forceFragmenting;
        File file3 = new File(messageObject.messageOwner.attachPath);
        if (file3.exists()) {
            file3.delete();
        }
        if (BuildVars.LOGS_ENABLED) {
            file = file3;
            StringBuilder sb2 = new StringBuilder("begin convert ");
            sb2.append(str);
            sb2.append(" startTime = ");
            sb2.append(j14);
            sb2.append(" avatarStartTime = ");
            sb2.append(j15);
            sb2.append(" endTime ");
            sb2.append(j16);
            sb2.append(" rWidth = ");
            sb2.append(i12);
            sb2.append(" rHeight = ");
            sb2.append(i13);
            sb2.append(" rotation = ");
            sb2.append(i14);
            sb2.append(" oWidth = ");
            sb2.append(i15);
            sb2.append(" oHeight = ");
            sb2.append(i16);
            sb2.append(" framerate = ");
            sb2.append(i17);
            sb2.append(" bitrate = ");
            sb2.append(i18);
            sb2.append(" originalBitrate = ");
            i10 = i19;
            sb2.append(i10);
            FileLog.d(sb2.toString());
        } else {
            file = file3;
            i10 = i19;
        }
        if (str == null) {
            str = "";
        }
        if (j14 > 0 && j16 > 0) {
            j3 = j14;
            j10 = j16 - j14;
        } else if (j16 > 0) {
            j3 = j14;
            j10 = j16;
        } else if (j14 > 0) {
            j3 = j14;
            j10 = videoEditedInfo.originalDuration - j3;
        } else {
            j3 = j14;
            j10 = videoEditedInfo.originalDuration;
        }
        if (i17 == 0) {
            i17 = 25;
        } else if (i17 > 59) {
            i17 = 59;
        }
        if (i14 == 90 || i14 == 270) {
            j11 = j10;
            z10 = z12;
            j12 = j15;
            i11 = i13;
        } else {
            j11 = j10;
            z10 = z12;
            j12 = j15;
            i11 = i12;
            i12 = i13;
        }
        long j17 = j3;
        long j18 = j11;
        if (!videoEditedInfo.shouldLimitFps && i17 > 40 && Math.min(i12, i11) <= 480) {
            i17 = 30;
        }
        if (j12 == -1 && videoEditedInfo.cropState == null && videoEditedInfo.mediaEntities == null && videoEditedInfo.paintPath == null && videoEditedInfo.filterState == null && i11 == i15 && i12 == i16 && i14 == 0 && !videoEditedInfo.roundVideo && j17 == -1 && videoEditedInfo.mixedSoundInfos.isEmpty()) {
            file2 = file;
            z11 = false;
        } else {
            file2 = file;
            z11 = true;
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
            public void didWriteData(long j19, float f7) {
                if (videoEditedInfo.canceled) {
                    return;
                }
                if (j19 < 0) {
                    j19 = file4.length();
                }
                long j20 = j19;
                if (videoEditedInfo.needUpdateProgress || this.lastAvailableSize != j20) {
                    this.lastAvailableSize = j20;
                    MediaController.this.didWriteData(videoConvertMessage, file4, false, 0L, j20, false, f7);
                }
            }
        };
        videoEditedInfo.videoConvertFirstWrite = true;
        MediaCodecVideoConvertor mediaCodecVideoConvertor = new MediaCodecVideoConvertor();
        MediaCodecVideoConvertor.ConvertVideoParams of2 = MediaCodecVideoConvertor.ConvertVideoParams.of(str, file4, j13, i14, z10, i15, i16, i11, i12, i17, i18, i10, j17, j16, j12, z11, j18, videoConvertorListener, videoEditedInfo);
        of2.soundInfos.addAll(videoEditedInfo.mixedSoundInfos);
        boolean convertVideo = mediaCodecVideoConvertor.convertVideo(of2);
        boolean z13 = videoEditedInfo.canceled;
        if (!z13) {
            synchronized (this.videoConvertSync) {
                z13 = videoEditedInfo.canceled;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("time=" + (System.currentTimeMillis() - currentTimeMillis) + " canceled=" + z13);
        }
        sharedPreferences.edit().putBoolean("isPreviousOk", true).apply();
        didWriteData(videoConvertMessage, file4, true, mediaCodecVideoConvertor.getLastFrameTimestamp(), file4.length(), convertVideo || z13, VOLUME_NORMAL);
        return true;
    }

    public static String copyFileToCache(Uri uri, String str) {
        return copyFileToCache(uri, str, -1L);
    }

    public static File createFileInCache(String str, String str2) {
        File file;
        try {
            File sharingDirectory = AndroidUtilities.getSharingDirectory();
            sharingDirectory.mkdirs();
            if (AndroidUtilities.isInternalUri(Uri.fromFile(sharingDirectory))) {
                return null;
            }
            int i10 = 0;
            do {
                File sharingDirectory2 = AndroidUtilities.getSharingDirectory();
                if (i10 == 0) {
                    file = new File(sharingDirectory2, str);
                } else {
                    int lastIndexOf = str.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        file = new File(sharingDirectory2, str.substring(0, lastIndexOf) + " (" + i10 + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(sharingDirectory2, str + " (" + i10 + ")");
                    }
                }
                i10++;
            } while (file.exists());
            return file;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static native boolean cropOpusFile(String str, String str2, long j3, long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public void didWriteData(final VideoConvertMessage videoConvertMessage, final File file, final boolean z10, final long j3, final long j10, final boolean z11, final float f7) {
        VideoEditedInfo videoEditedInfo = videoConvertMessage.videoEditedInfo;
        final boolean z12 = videoEditedInfo.videoConvertFirstWrite;
        if (z12) {
            videoEditedInfo.videoConvertFirstWrite = false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.m6
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.this.lambda$didWriteData$59(z11, z10, videoConvertMessage, file, f7, j3, z12, j10);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int extractRealEncoderBitrate(int i10, int i11, int i12, boolean z10) {
        MediaCodec createEncoderByType;
        String str = i10 + "" + i11 + "" + i12;
        Integer num = cachedEncoderBitrates.get(str);
        if (num != null) {
            return num.intValue();
        }
        if (z10) {
            try {
                createEncoderByType = MediaCodec.createEncoderByType("video/hevc");
            } catch (Exception unused) {
            }
            if (createEncoderByType == null) {
                try {
                    createEncoderByType = MediaCodec.createEncoderByType(VIDEO_MIME_TYPE);
                } catch (Exception unused2) {
                    return i12;
                }
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, i10, i11);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("max-bitrate", i12);
            createVideoFormat.setInteger("bitrate", i12);
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
        MediaFormat createVideoFormat2 = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, i10, i11);
        createVideoFormat2.setInteger("color-format", 2130708361);
        createVideoFormat2.setInteger("max-bitrate", i12);
        createVideoFormat2.setInteger("bitrate", i12);
        createVideoFormat2.setInteger("frame-rate", 30);
        createVideoFormat2.setInteger("i-frame-interval", 1);
        createEncoderByType.configure(createVideoFormat2, (Surface) null, (MediaCrypto) null, 1);
        int integer2 = createEncoderByType.getOutputFormat().getInteger("bitrate");
        cachedEncoderBitrates.put(str, Integer.valueOf(integer2));
        createEncoderByType.release();
        return integer2;
    }

    public static int findTrack(MediaExtractor mediaExtractor, boolean z10) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (z10) {
                if (string.startsWith("audio/")) {
                    return i10;
                }
            } else {
                if (string.startsWith("video/")) {
                    return i10;
                }
            }
        }
        return -5;
    }

    private boolean forbidRaiseToListen() {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return NotificationsController.audioManager.isWiredHeadsetOn() || NotificationsController.audioManager.isBluetoothA2dpOn() || NotificationsController.audioManager.isBluetoothScoOn();
            }
            for (AudioDeviceInfo audioDeviceInfo : NotificationsController.audioManager.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
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
                } catch (Exception e7) {
                    e = e7;
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
        } catch (Exception e10) {
            FileLog.e(e10);
            return "";
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaController;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c2, code lost:
    
        if (r2 == null) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        } catch (Throwable th2) {
            th = th2;
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
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                throw th;
            }
        }
        byte[] bArr = new byte[12];
        if (inputStream.read(bArr, 0, 12) == 12) {
            byte b10 = bArr[0];
            if (b10 == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
                try {
                    inputStream.close();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                return "png";
            }
            if (b10 == 31 && bArr[1] == -117) {
                try {
                    inputStream.close();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                return "tgs";
            }
            String lowerCase = new String(bArr).toLowerCase();
            if (lowerCase.startsWith("riff")) {
                if (lowerCase.endsWith("webp")) {
                    try {
                        inputStream.close();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    return "webp";
                }
            }
        }
        try {
            inputStream.close();
        } catch (Exception e13) {
            FileLog.e(e13);
        }
        return null;
    }

    public static int getVideoBitrate(String str) {
        int i10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e) {
            FileLog.e(e);
            i10 = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        return i10;
    }

    private static int getVideoBitrateWithFactor(float f7) {
        return (int) com.google.android.gms.internal.vision.e2.C(f7, 2000.0f, 1000.0f, 1.13f);
    }

    public static native byte[] getWaveform(String str);

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r1 == null) goto L24;
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            try {
                inputStream.close();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            return false;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            throw th2;
        }
    }

    public static boolean isH264Video(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        boolean z10 = false;
        try {
            mediaExtractor.setDataSource(str);
            int findTrack = findTrack(mediaExtractor, false);
            if (findTrack >= 0) {
                if (mediaExtractor.getTrackFormat(findTrack).getString("mime").equals(VIDEO_MIME_TYPE)) {
                    z10 = true;
                }
            }
            return z10;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        } finally {
            mediaExtractor.release();
        }
    }

    private boolean isNearToSensor(float f7) {
        return f7 < 5.0f && f7 != this.proximitySensor.getMaximumRange();
    }

    public static native int isOpusFile(String str);

    private static boolean isRecognizedFormat(int i10) {
        if (i10 == 39 || i10 == 2130706688) {
            return true;
        }
        switch (i10) {
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r1 == null) goto L26;
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            try {
                inputStream.close();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            return false;
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            throw th2;
        }
    }

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    private File joinRecord() {
        return joinRecord(this.recordingPrevAudioFile, this.recordingAudioFile, this.recordingAudio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$broadcastNewPhotos$58(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, AlbumEntry albumEntry, AlbumEntry albumEntry2, AlbumEntry albumEntry3) {
        if (PhotoViewer.t1().Q1() && !forceBroadcastNewPhotos) {
            broadcastNewPhotos(i10, arrayList, arrayList2, num, albumEntry, albumEntry2, albumEntry3, MediaDataController.MAX_STYLE_RUNS_COUNT);
            return;
        }
        allMediaAlbums = arrayList;
        allPhotoAlbums = arrayList2;
        broadcastPhotosRunnable = null;
        allPhotosAlbumEntry = albumEntry2;
        allMediaAlbumEntry = albumEntry;
        allVideosAlbumEntry = albumEntry3;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.albumsDidLoad, Integer.valueOf(i10), arrayList, arrayList2, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (r17 == r9) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        r0 = org.telegram.messenger.MediaController.refreshGalleryRunnable;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
    
        org.telegram.messenger.AndroidUtilities.cancelRunOnUIThread(r0);
        org.telegram.messenger.MediaController.refreshGalleryRunnable = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        loadGalleryPhotosAlbums(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b1, code lost:
    
        if (r10 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[Catch: all -> 0x007f, TryCatch #4 {all -> 0x007f, blocks: (B:19:0x0066, B:21:0x006c, B:23:0x0072, B:25:0x0078, B:28:0x0087, B:30:0x009b, B:32:0x00a1, B:46:0x0081), top: B:18:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$checkGallery$1(int i10) {
        Cursor cursor;
        Cursor cursor2;
        int i11;
        Context context;
        int i12;
        try {
            context = ApplicationLoader.applicationContext;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                if (context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0 && context.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                }
                cursor = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                if (cursor != null) {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            FileLog.e(th);
                            cursor2 = cursor;
                            i11 = 0;
                            Context context2 = ApplicationLoader.applicationContext;
                            if (Build.VERSION.SDK_INT >= 33) {
                            }
                        } finally {
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    }
                    if (cursor.moveToNext()) {
                        i12 = cursor.getInt(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                        cursor2 = cursor;
                        i11 = i12;
                        Context context22 = ApplicationLoader.applicationContext;
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (context22.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context22.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0 && context22.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                            }
                            cursor2 = MediaStore.Images.Media.query(context22.getContentResolver(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
                            if (cursor2 != null && cursor2.moveToNext()) {
                                i11 += cursor2.getInt(0);
                            }
                        }
                    }
                }
                i12 = 0;
                if (cursor != null) {
                }
                cursor2 = cursor;
                i11 = i12;
                Context context222 = ApplicationLoader.applicationContext;
                if (Build.VERSION.SDK_INT >= 33) {
                }
            }
            if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                cursor = null;
                i12 = 0;
                if (cursor != null) {
                }
                cursor2 = cursor;
                i11 = i12;
                Context context2222 = ApplicationLoader.applicationContext;
                if (Build.VERSION.SDK_INT >= 33) {
                }
            }
            Context context22222 = ApplicationLoader.applicationContext;
            if (Build.VERSION.SDK_INT >= 33) {
            }
        } catch (Throwable th4) {
            try {
                FileLog.e(th4);
            } finally {
                if (cursor2 != null) {
                    cursor2.close();
                }
            }
        }
        cursor = MediaStore.Images.Media.query(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"COUNT(_id)"}, null, null, null);
        if (cursor != null) {
        }
        i12 = 0;
        if (cursor != null) {
        }
        cursor2 = cursor;
        i11 = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cleanupPlayer$10(t71 t71Var, ValueAnimator valueAnimator) {
        t71Var.W(((Float) valueAnimator.getAnimatedValue()).floatValue() * (this.audioFocus != 1 ? VOLUME_NORMAL : VOLUME_DUCK));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$didWriteData$59(boolean z10, boolean z11, VideoConvertMessage videoConvertMessage, File file, float f7, long j3, boolean z12, long j10) {
        if (z10 || z11) {
            boolean z13 = videoConvertMessage.videoEditedInfo.canceled;
            synchronized (this.videoConvertSync) {
                videoConvertMessage.videoEditedInfo.canceled = false;
            }
            this.videoConvertQueue.remove(videoConvertMessage);
            this.foregroundConvertingMessages.remove(videoConvertMessage);
            checkForegroundConvertMessage(z13 || z10);
            startVideoConvertFromQueue();
        }
        if (z10) {
            NotificationCenter.getInstance(videoConvertMessage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.filePreparingFailed, videoConvertMessage.messageObject, file.toString(), Float.valueOf(f7), Long.valueOf(j3));
            return;
        }
        if (z12) {
            NotificationCenter.getInstance(videoConvertMessage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.filePreparingStarted, videoConvertMessage.messageObject, file.toString(), Float.valueOf(f7), Long.valueOf(j3));
        }
        NotificationCenter.getInstance(videoConvertMessage.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileNewChunkAvailable, videoConvertMessage.messageObject, file.toString(), Long.valueOf(j10), Long.valueOf(z11 ? file.length() : 0L), Float.valueOf(f7), Long.valueOf(j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateWaveform$38(String str, byte[] bArr, MessageObject messageObject) {
        MessageObject remove = this.generatingWaveform.remove(str);
        if (remove == null || bArr == null || remove.getDocument() == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= remove.getDocument().attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = remove.getDocument().attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                documentAttribute.waveform = bArr;
                documentAttribute.flags |= 4;
                break;
            }
            i10++;
        }
        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
        tL_messages_messages.messages.add(remove.messageOwner);
        MessagesStorage.getInstance(remove.currentAccount).putMessages((TLRPC.messages_Messages) tL_messages_messages, remove.getDialogId(), -1, 0, false, messageObject.scheduled ? 1 : 0, 0L);
        NotificationCenter.getInstance(remove.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.replaceMessagesObjects, Long.valueOf(remove.getDialogId()), a2.l(remove));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateWaveform$39(String str, String str2, MessageObject messageObject) {
        try {
            AndroidUtilities.runOnUIThread(new yk(this, str2, getWaveform(str), messageObject, 13));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$loadGalleryPhotosAlbums$56(PhotoEntry photoEntry, PhotoEntry photoEntry2) {
        long j3 = photoEntry.dateTaken;
        long j10 = photoEntry2.dateTaken;
        if (j3 < j10) {
            return 1;
        }
        return j3 > j10 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x053d, code lost:
    
        if (r15 == null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0354, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0358, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0359, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0352, code lost:
    
        if (r15 != null) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
    
        if (r0.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0396, code lost:
    
        if (r15 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0529, code lost:
    
        if (r15 == null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x052b, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x052f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0530, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$loadGalleryPhotosAlbums$57(int i10) {
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
        AlbumEntry albumEntry3;
        ArrayList arrayList3;
        int i11;
        int i12;
        AlbumEntry albumEntry4;
        int i13;
        AlbumEntry albumEntry5;
        Context context;
        int i14;
        ArrayList arrayList4;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int columnIndex7;
        int columnIndex8;
        int i15;
        int i16;
        int i17;
        AlbumEntry albumEntry6;
        AlbumEntry albumEntry7;
        int i18;
        int i19;
        AlbumEntry albumEntry8;
        AlbumEntry albumEntry9;
        Cursor cursor2;
        StringBuilder sb2;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = arrayList5;
        SparseArray sparseArray3 = new SparseArray();
        SparseArray sparseArray4 = new SparseArray();
        AlbumEntry albumEntry10 = null;
        try {
            sb2 = new StringBuilder();
            sparseArray = sparseArray4;
        } catch (Exception e) {
            e = e;
            sparseArray = sparseArray4;
        }
        try {
            sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
            sb2.append("/Camera/");
            str = sb2.toString();
        } catch (Exception e7) {
            e = e7;
            FileLog.e(e);
            str = null;
            context = ApplicationLoader.applicationContext;
            i14 = Build.VERSION.SDK_INT;
            arrayList4 = arrayList6;
            if (i14 >= 23) {
            }
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] strArr = projectionPhotos;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14 <= 28 ? "date_modified" : "datetaken");
            sb3.append(" DESC");
            cursor = MediaStore.Images.Media.query(contentResolver, uri, strArr, null, null, sb3.toString());
            if (cursor == null) {
            }
        }
        try {
            context = ApplicationLoader.applicationContext;
            i14 = Build.VERSION.SDK_INT;
            arrayList4 = arrayList6;
            if (i14 >= 23) {
                if (i14 < 33) {
                    try {
                        if (context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
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
                if (i14 >= 33) {
                    if (context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 && context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
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
        } catch (Throwable th3) {
            th = th3;
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
            ContentResolver contentResolver2 = context.getContentResolver();
            Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = projectionPhotos;
            StringBuilder sb32 = new StringBuilder();
            sb32.append(i14 <= 28 ? "date_modified" : "datetaken");
            sb32.append(" DESC");
            cursor = MediaStore.Images.Media.query(contentResolver2, uri2, strArr2, null, null, sb32.toString());
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
                                    columnIndex5 = cursor.getColumnIndex(i14 > 28 ? "date_modified" : "datetaken");
                                    columnIndex6 = cursor.getColumnIndex("orientation");
                                    str4 = "orientation";
                                    try {
                                        columnIndex7 = cursor.getColumnIndex("width");
                                        str3 = "width";
                                        try {
                                            columnIndex8 = cursor.getColumnIndex("height");
                                            str2 = "height";
                                        } catch (Throwable th4) {
                                            th = th4;
                                            str2 = "height";
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        str2 = "height";
                                        str3 = "width";
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    str2 = "height";
                                    str3 = "width";
                                    str4 = "orientation";
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                str2 = "height";
                                str3 = "width";
                                str4 = "orientation";
                                str5 = "_data";
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str2 = "height";
                            str3 = "width";
                            str4 = "orientation";
                            str5 = "_data";
                            str6 = "bucket_display_name";
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        str2 = "height";
                        str3 = "width";
                        str4 = "orientation";
                        str5 = "_data";
                        str6 = "bucket_display_name";
                        str7 = "bucket_id";
                    }
                } catch (Throwable th10) {
                    th = th10;
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
                                int i20 = cursor.getInt(columnIndex);
                                int i21 = cursor.getInt(columnIndex2);
                                int i22 = columnIndex;
                                String string2 = cursor.getString(columnIndex3);
                                PhotoEntry photoEntry = new PhotoEntry(i21, i20, cursor.getLong(columnIndex5), string, cursor.getInt(columnIndex6), 0, false, cursor.getInt(columnIndex7), cursor.getInt(columnIndex8), cursor.getLong(columnIndex9));
                                int i23 = columnIndex8;
                                int i24 = columnIndex7;
                                int i25 = columnIndex9;
                                if (albumEntry == null) {
                                    i15 = columnIndex5;
                                    try {
                                        i16 = columnIndex4;
                                        i17 = columnIndex3;
                                        albumEntry6 = new AlbumEntry(0, LocaleController.getString(R.string.AllPhotos), photoEntry);
                                        arrayList = arrayList4;
                                        try {
                                            arrayList.add(0, albumEntry6);
                                        } catch (Throwable th11) {
                                            th = th11;
                                            albumEntry = albumEntry6;
                                            arrayList2 = arrayList7;
                                            sparseArray2 = sparseArray3;
                                            str9 = str;
                                            FileLog.e(th);
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        arrayList = arrayList4;
                                    }
                                } else {
                                    i15 = columnIndex5;
                                    i16 = columnIndex4;
                                    i17 = columnIndex3;
                                    arrayList = arrayList4;
                                    albumEntry6 = albumEntry;
                                }
                                if (albumEntry2 == null) {
                                    try {
                                        i18 = columnIndex2;
                                        i19 = columnIndex6;
                                        albumEntry7 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry);
                                        arrayList2 = arrayList7;
                                        try {
                                            arrayList2.add(0, albumEntry7);
                                        } catch (Throwable th13) {
                                            th = th13;
                                            albumEntry = albumEntry6;
                                            albumEntry2 = albumEntry7;
                                            sparseArray2 = sparseArray3;
                                            str9 = str;
                                            FileLog.e(th);
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        arrayList2 = arrayList7;
                                        albumEntry = albumEntry6;
                                    }
                                } else {
                                    i18 = columnIndex2;
                                    i19 = columnIndex6;
                                    arrayList2 = arrayList7;
                                    albumEntry7 = albumEntry2;
                                }
                                try {
                                    cursor2 = cursor;
                                    if (albumEntry6.photos.size() < 15) {
                                        try {
                                            photoEntry.isLivePhoto();
                                        } catch (Throwable th15) {
                                            th = th15;
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
                                    } catch (Throwable th16) {
                                        th = th16;
                                        sparseArray2 = sparseArray3;
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    sparseArray2 = sparseArray3;
                                    albumEntry8 = albumEntry6;
                                    str9 = str;
                                    albumEntry9 = albumEntry7;
                                }
                                try {
                                    AlbumEntry albumEntry11 = (AlbumEntry) sparseArray2.get(i21);
                                    if (albumEntry11 == null) {
                                        albumEntry11 = new AlbumEntry(i21, string2, photoEntry);
                                        sparseArray2.put(i21, albumEntry11);
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
                                                        obj = Integer.valueOf(i21);
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        cursor = cursor2;
                                                        albumEntry = albumEntry8;
                                                        albumEntry2 = albumEntry9;
                                                        FileLog.e(th);
                                                    }
                                                }
                                            } catch (Throwable th19) {
                                                th = th19;
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
                                    AlbumEntry albumEntry12 = (AlbumEntry) sparseArray5.get(i21);
                                    if (albumEntry12 == null) {
                                        albumEntry12 = new AlbumEntry(i21, string2, photoEntry);
                                        sparseArray5.put(i21, albumEntry12);
                                        if (num != null || str9 == null || string == null || !string.startsWith(str9)) {
                                            arrayList.add(albumEntry12);
                                        } else {
                                            arrayList.add(0, albumEntry12);
                                            num = Integer.valueOf(i21);
                                        }
                                    }
                                    albumEntry12.addPhoto(photoEntry);
                                    sparseArray = sparseArray5;
                                    cursor = cursor2;
                                    albumEntry = albumEntry8;
                                    albumEntry2 = albumEntry9;
                                    columnIndex = i22;
                                    columnIndex8 = i23;
                                    columnIndex7 = i24;
                                    columnIndex9 = i25;
                                    columnIndex3 = i17;
                                    str = str9;
                                    arrayList7 = arrayList2;
                                    sparseArray3 = sparseArray2;
                                    columnIndex6 = i19;
                                    columnIndex5 = i15;
                                    columnIndex2 = i18;
                                    arrayList4 = arrayList;
                                    columnIndex4 = i16;
                                } catch (Throwable th20) {
                                    th = th20;
                                    albumEntry8 = albumEntry6;
                                    str9 = str;
                                    albumEntry9 = albumEntry7;
                                    cursor = cursor2;
                                    albumEntry = albumEntry8;
                                    albumEntry2 = albumEntry9;
                                    FileLog.e(th);
                                }
                            }
                        } catch (Throwable th21) {
                            th = th21;
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
                } catch (Throwable th22) {
                    th = th22;
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
        } catch (Throwable th23) {
            th = th23;
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
        AlbumEntry albumEntry13 = albumEntry10;
        AlbumEntry albumEntry14 = albumEntry2;
        Integer num2 = obj;
        for (int i26 = 0; i26 < arrayList2.size(); i26++) {
            Collections.sort(((AlbumEntry) arrayList2.get(i26)).photos, new p(6));
        }
        broadcastNewPhotos(i10, arrayList2, arrayList3, num2, albumEntry14, albumEntry3, albumEntry13, 0);
        return;
        albumEntry3 = albumEntry;
        try {
            Context context2 = ApplicationLoader.applicationContext;
            int i27 = Build.VERSION.SDK_INT;
            if (i27 >= 23) {
                if (i27 < 33) {
                    if (context2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    }
                }
                if (i27 >= 33) {
                    if (context2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        if (context2.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                            if (context2.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                            }
                        }
                    }
                }
                arrayList3 = arrayList;
            }
            ContentResolver contentResolver3 = ApplicationLoader.applicationContext.getContentResolver();
            Uri uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            String[] strArr3 = projectionVideo;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i27 > 28 ? "date_modified" : "datetaken");
            sb4.append(" DESC");
            cursor = MediaStore.Images.Media.query(contentResolver3, uri3, strArr3, null, null, sb4.toString());
            if (cursor != null) {
                int columnIndex10 = cursor.getColumnIndex(str8);
                int columnIndex11 = cursor.getColumnIndex(str7);
                int columnIndex12 = cursor.getColumnIndex(str6);
                int columnIndex13 = cursor.getColumnIndex(str5);
                int columnIndex14 = cursor.getColumnIndex(i27 > 28 ? "date_modified" : "datetaken");
                int columnIndex15 = cursor.getColumnIndex("duration");
                int columnIndex16 = cursor.getColumnIndex(str3);
                int columnIndex17 = cursor.getColumnIndex(str2);
                int columnIndex18 = cursor.getColumnIndex("_size");
                cursor.getColumnIndex(str4);
                while (cursor.moveToNext()) {
                    String string3 = cursor.getString(columnIndex13);
                    if (!TextUtils.isEmpty(string3)) {
                        int i28 = cursor.getInt(columnIndex10);
                        int i29 = cursor.getInt(columnIndex11);
                        String string4 = cursor.getString(columnIndex12);
                        int i30 = columnIndex10;
                        int i31 = columnIndex18;
                        PhotoEntry photoEntry2 = new PhotoEntry(i29, i28, cursor.getLong(columnIndex14), string3, 0, (int) (cursor.getLong(columnIndex15) / 1000), true, cursor.getInt(columnIndex16), cursor.getInt(columnIndex17), cursor.getLong(columnIndex18));
                        int i32 = columnIndex14;
                        if (albumEntry10 == null) {
                            i11 = columnIndex11;
                            i12 = columnIndex12;
                            arrayList3 = arrayList;
                            try {
                                albumEntry4 = new AlbumEntry(0, LocaleController.getString(R.string.AllVideos), photoEntry2);
                                int i33 = 1;
                                try {
                                    albumEntry4.videoOnly = true;
                                    if (albumEntry2 == null) {
                                        i33 = 0;
                                    }
                                    if (albumEntry3 != null) {
                                        i33++;
                                    }
                                    arrayList2.add(i33, albumEntry4);
                                } catch (Throwable th24) {
                                    th = th24;
                                    albumEntry10 = albumEntry4;
                                    try {
                                        FileLog.e(th);
                                    } finally {
                                    }
                                }
                            } catch (Throwable th25) {
                                th = th25;
                            }
                        } else {
                            i11 = columnIndex11;
                            i12 = columnIndex12;
                            arrayList3 = arrayList;
                            albumEntry4 = albumEntry10;
                        }
                        if (albumEntry2 == null) {
                            i13 = columnIndex13;
                            albumEntry5 = new AlbumEntry(0, LocaleController.getString(R.string.AllMedia), photoEntry2);
                            try {
                                arrayList2.add(0, albumEntry5);
                            } catch (Throwable th26) {
                                th = th26;
                                albumEntry10 = albumEntry4;
                                albumEntry2 = albumEntry5;
                                FileLog.e(th);
                            }
                        } else {
                            i13 = columnIndex13;
                            albumEntry5 = albumEntry2;
                        }
                        try {
                            albumEntry4.addPhoto(photoEntry2);
                            albumEntry5.addPhoto(photoEntry2);
                            AlbumEntry albumEntry15 = (AlbumEntry) sparseArray2.get(i29);
                            if (albumEntry15 == null) {
                                albumEntry15 = new AlbumEntry(i29, string4, photoEntry2);
                                sparseArray2.put(i29, albumEntry15);
                                if (obj != null || str9 == null || string3 == null || !string3.startsWith(str9)) {
                                    arrayList2.add(albumEntry15);
                                } else {
                                    try {
                                        arrayList2.add(0, albumEntry15);
                                        obj = Integer.valueOf(i29);
                                    } catch (Throwable th27) {
                                        th = th27;
                                        albumEntry10 = albumEntry4;
                                        albumEntry2 = albumEntry5;
                                        FileLog.e(th);
                                    }
                                }
                            }
                            albumEntry15.addPhoto(photoEntry2);
                            albumEntry10 = albumEntry4;
                            albumEntry2 = albumEntry5;
                            columnIndex10 = i30;
                            columnIndex14 = i32;
                            columnIndex11 = i11;
                            columnIndex13 = i13;
                            columnIndex12 = i12;
                            columnIndex18 = i31;
                            arrayList = arrayList3;
                        } catch (Throwable th28) {
                            th = th28;
                        }
                    }
                }
            }
            arrayList3 = arrayList;
        } catch (Throwable th29) {
            th = th29;
            arrayList3 = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMoreMusic$11(int i10, TLRPC.TL_error tL_error, TLObject tLObject, int i11) {
        PlaylistGlobalSearchParams playlistGlobalSearchParams;
        if (this.playlistClassGuid != i10 || (playlistGlobalSearchParams = this.playlistGlobalSearchParams) == null || this.playingMessageObject == null || tL_error != null) {
            return;
        }
        this.loadingPlaylist = false;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        playlistGlobalSearchParams.nextSearchRate = messages_messages.next_rate;
        MessagesStorage.getInstance(i11).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        MessagesController.getInstance(i11).putUsers(messages_messages.users, false);
        MessagesController.getInstance(i11).putChats(messages_messages.chats, false);
        int size = messages_messages.messages.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            MessageObject messageObject = new MessageObject(i11, messages_messages.messages.get(i13), false, true);
            if (!messageObject.isVoiceOnce() && !this.playlistMap.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.playlist.add(0, messageObject);
                this.playlistMap.put(Integer.valueOf(messageObject.getId()), messageObject);
                i12++;
            }
        }
        sortPlaylist();
        this.loadingPlaylist = false;
        this.playlistGlobalSearchParams.endReached = this.playlist.size() == this.playlistGlobalSearchParams.totalCount;
        if (SharedConfig.shuffleMusic) {
            buildShuffledPlayList();
        }
        if (i12 != 0) {
            NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.moreMusicDidLoad, Integer.valueOf(i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMoreMusic$12(int i10, int i11, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new di.b5(i10, i11, this, tLObject, tL_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(int i10) {
        if (i10 != 1) {
            this.hasRecordAudioFocus = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        try {
            this.sampleRate = 48000;
            int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
            if (minBufferSize <= 0) {
                minBufferSize = 1280;
            }
            this.recordBufferSize = minBufferSize;
            for (int i10 = 0; i10 < 5; i10++) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.recordBufferSize);
                allocateDirect.order(ByteOrder.nativeOrder());
                this.recordBuffers.add(allocateDirect);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        try {
            this.currentPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("playbackSpeed", VOLUME_NORMAL);
            this.currentMusicPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("musicPlaybackSpeed", VOLUME_NORMAL);
            this.fastPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("fastPlaybackSpeed", 1.8f);
            this.fastMusicPlaybackSpeed = MessagesController.getGlobalMainSettings().getFloat("fastMusicPlaybackSpeed", 1.8f);
            SensorManager sensorManager = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
            this.sensorManager = sensorManager;
            this.linearSensor = sensorManager.getDefaultSensor(10);
            Sensor defaultSensor = this.sensorManager.getDefaultSensor(9);
            this.gravitySensor = defaultSensor;
            if (this.linearSensor == null || defaultSensor == null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("gravity or linear sensor not found");
                }
                this.accelerometerSensor = this.sensorManager.getDefaultSensor(1);
                this.linearSensor = null;
                this.gravitySensor = null;
            }
            this.proximitySensor = this.sensorManager.getDefaultSensor(8);
            this.proximityWakeLock = ((PowerManager) ApplicationLoader.applicationContext.getSystemService("power")).newWakeLock(32, "telegram:proximity_lock");
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            4 r12 = new 4();
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (telephonyManager != null) {
                telephonyManager.listen(r12, 32);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4() {
        for (int i10 = 0; i10 < 4; i10++) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.httpFileDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didReceiveNewMessages);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.messagesDeleted);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.removeAllMessagesFromDialog);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.musicDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.mediaDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.musicListLoaded);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAudioFocusChange$5(int i10) {
        if (i10 == -1) {
            if (isPlayingMessage(getPlayingMessageObject()) && !isMessagePaused()) {
                lambda$startAudioAgain$7(this.playingMessageObject);
            }
            this.hasAudioFocus = 0;
            this.audioFocus = 0;
        } else if (i10 == 1) {
            this.audioFocus = 2;
            if (this.resumeAudioOnFocusGain) {
                this.resumeAudioOnFocusGain = false;
                if (isPlayingMessage(getPlayingMessageObject()) && isMessagePaused()) {
                    playMessage(getPlayingMessageObject());
                }
            }
        } else if (i10 == -3) {
            this.audioFocus = 1;
        } else if (i10 == -2) {
            this.audioFocus = 0;
            if (isPlayingMessage(getPlayingMessageObject()) && !isMessagePaused()) {
                lambda$startAudioAgain$7(this.playingMessageObject);
                this.resumeAudioOnFocusGain = true;
            }
        }
        setPlayerVolume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$playEmojiSound$17(File file) {
        try {
            int i10 = this.emojiSoundPlayerNum + 1;
            this.emojiSoundPlayerNum = i10;
            t71 t71Var = this.emojiSoundPlayer;
            if (t71Var != null) {
                t71Var.H();
            }
            t71 t71Var2 = new t71(false, false);
            this.emojiSoundPlayer = t71Var2;
            t71Var2.J = new 8(i10);
            this.emojiSoundPlayer.D(Uri.fromFile(file), "other");
            this.emojiSoundPlayer.S(3);
            this.emojiSoundPlayer.C();
        } catch (Exception e) {
            FileLog.e(e);
            t71 t71Var3 = this.emojiSoundPlayer;
            if (t71Var3 != null) {
                t71Var3.H();
                this.emojiSoundPlayer = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$playEmojiSound$18(AccountInstance accountInstance, TLRPC.Document document) {
        accountInstance.getFileLoader().loadFile(document, null, 1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playEmojiSound$19(MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        tL_document.access_hash = emojiSound.accessHash;
        tL_document.id = emojiSound.id;
        tL_document.mime_type = "sound/ogg";
        tL_document.file_reference = emojiSound.fileReference;
        tL_document.dc_id = accountInstance.getConnectionsManager().getCurrentDatacenterId();
        File pathToAttach = FileLoader.getInstance(accountInstance.getCurrentAccount()).getPathToAttach(tL_document, true);
        if (!pathToAttach.exists()) {
            AndroidUtilities.runOnUIThread(new f2(15, accountInstance, tL_document));
        } else {
            if (z10) {
                return;
            }
            AndroidUtilities.runOnUIThread(new f2(14, this, pathToAttach));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playMessage$20() {
        cleanupPlayer(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$playMessage$21(MessageObject messageObject, File file) {
        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, FileLoader.getAttachFileName(messageObject.getDocument()), file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$playMessage$22(MessageObject messageObject, File file) {
        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.fileLoaded, FileLoader.getAttachFileName(messageObject.getDocument()), file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareResumedRecording$23(int i10, long j3) {
        MediaDataController.getInstance(i10).pushDraftVoiceMessage(j3, this.recordTopicId, null);
        this.recordStartRunnable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareResumedRecording$24(File file, TLRPC.TL_document tL_document, MediaDataController.DraftVoice draftVoice) {
        if (!file.exists() && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame));
        }
        tL_document.date = ConnectionsManager.getInstance(this.recordingCurrentAccount).getCurrentTime();
        tL_document.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        short[] sArr = this.recordSamples;
        byte[] waveform2 = getWaveform2(sArr, sArr.length);
        tL_documentAttributeAudio.waveform = waveform2;
        if (waveform2 != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = this.recordTimeCount / 1000.0d;
        tL_document.attributes.clear();
        tL_document.attributes.add(tL_documentAttributeAudio);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordPaused, new Object[0]);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(this.recordingGuid), tL_document, file.getAbsolutePath(), Boolean.TRUE, Float.valueOf(draftVoice.left), Float.valueOf(draftVoice.right));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareResumedRecording$25(int i10, MediaDataController.DraftVoice draftVoice, int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        setBluetoothScoOn(true);
        this.sendAfterDone = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.recordingAudio = tL_document;
        this.recordingGuid = i10;
        tL_document.dc_id = TLObject.FLAG_31;
        tL_document.id = draftVoice.id;
        tL_document.user_id = UserConfig.getInstance(i11).getClientUserId();
        TLRPC.TL_document tL_document2 = this.recordingAudio;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        SharedConfig.saveConfig();
        this.recordingAudioFile = new File(draftVoice.path) { // from class: org.telegram.messenger.MediaController.13
            @Override // java.io.File
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file");
                }
                return super.delete();
            }
        };
        FileLoader.getDirectory(4).mkdirs();
        AutoDeleteMediaTask.lockFile(this.recordingAudioFile);
        try {
            this.audioRecorderPaused = true;
            this.recordTimeCount = draftVoice.recordTimeCount;
            this.writtenFrame = draftVoice.writedFrame;
            this.samplesCount = draftVoice.samplesCount;
            this.recordSamples = draftVoice.recordSamples;
            this.recordDialogId = j3;
            this.recordMonoForumPeerId = j10;
            this.recordMonoForumSuggestionParams = messageSuggestionParams;
            this.recordTopicId = messageObject == null ? 0L : MessageObject.getTopicId(this.recordingCurrentAccount, messageObject.messageOwner, false);
            this.recordingCurrentAccount = i11;
            this.recordReplyingMsg = messageObject2;
            this.recordReplyingTopMsg = messageObject;
            this.recordReplyingStory = storyItem;
            this.recordSendMessageChatArguments = this.recordSendMessageChatArguments;
            AndroidUtilities.runOnUIThread(new yk(this, this.recordingAudioFile, this.recordingAudio, draftVoice, 12));
        } catch (Exception e) {
            FileLog.e(e);
            this.recordingAudio = null;
            AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
            this.recordingAudioFile.delete();
            this.recordingAudioFile = null;
            try {
                this.audioRecorder.release();
                this.audioRecorder = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            setBluetoothScoOn(false);
            AndroidUtilities.runOnUIThread(new t5(this, i11, j3, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processMediaObserver$6(ArrayList arrayList) {
        NotificationCenter.getInstance(this.lastChatAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.screenshotTook, new Object[0]);
        checkScreenshots(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveFile$44(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveFile$45(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var) {
        if (zArr[0]) {
            return;
        }
        d2Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveFile$46(org.telegram.ui.ActionBar.d2 d2Var) {
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveFile$47(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        try {
            d2Var.n(i10);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveFile$49(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr) {
        try {
            if (d2Var.isShowing()) {
                d2Var.dismiss();
            } else {
                zArr[0] = true;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9 A[Catch: Exception -> 0x001e, TryCatch #8 {Exception -> 0x001e, blocks: (B:3:0x000a, B:5:0x0013, B:10:0x0238, B:19:0x0026, B:20:0x00e1, B:22:0x00e7, B:23:0x00ea, B:53:0x01f1, B:54:0x01f5, B:56:0x01f9, B:60:0x0204, B:61:0x0228, B:62:0x022f, B:143:0x0045, B:145:0x0064, B:146:0x0071, B:148:0x0084, B:154:0x0096, B:155:0x00d0, B:157:0x00dd, B:160:0x00b9, B:162:0x006b), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[Catch: all -> 0x01be, SYNTHETIC, TRY_LEAVE, TryCatch #15 {all -> 0x01be, blocks: (B:86:0x01dc, B:85:0x01d9, B:120:0x01b4, B:81:0x01d4), top: B:28:0x00f6, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$saveFile$50(int i10, File file, String str, org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, String str2, Utilities.Callback callback, boolean[] zArr2) {
        ?? file2;
        String str3;
        char c10;
        ?? r25;
        boolean z10;
        boolean z11;
        Uri fromFile;
        FileInputStream fileInputStream;
        Throwable th2;
        Throwable th3;
        FileChannel channel;
        long j3;
        try {
            boolean z12 = true;
            if (Build.VERSION.SDK_INT >= 29) {
                fromFile = saveFileInternal(i10, file, null);
                if (fromFile == null) {
                    z12 = false;
                }
            } else {
                if (i10 == 0) {
                    File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Telegram");
                    file3.mkdirs();
                    file2 = new File(file3, AndroidUtilities.generateFileName(0, FileLoader.getFileExtension(file)));
                } else if (i10 == 1) {
                    File file4 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "Telegram");
                    file4.mkdirs();
                    file2 = new File(file4, AndroidUtilities.generateFileName(1, FileLoader.getFileExtension(file)));
                } else {
                    File file5 = new File(i10 == 2 ? Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) : Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC), "Telegram");
                    file5.mkdirs();
                    file2 = new File(file5, str);
                    if (file2.exists()) {
                        int lastIndexOf = str.lastIndexOf(46);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 10) {
                                break;
                            }
                            if (lastIndexOf != -1) {
                                str3 = str.substring(0, lastIndexOf) + "(" + (i11 + 1) + ")" + str.substring(lastIndexOf);
                            } else {
                                str3 = str + "(" + (i11 + 1) + ")";
                            }
                            File file6 = new File(file5, str3);
                            if (!file6.exists()) {
                                file2 = file6;
                                break;
                            } else {
                                i11++;
                                file2 = file6;
                            }
                        }
                    }
                }
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                long currentTimeMillis = System.currentTimeMillis() - 500;
                try {
                    try {
                        fileInputStream = new FileInputStream(file);
                    } catch (Exception e) {
                        e = e;
                        str = file2;
                        c10 = 0;
                    }
                } catch (Exception e7) {
                    e = e7;
                    FileLog.e(e);
                    z10 = false;
                    r25 = str;
                    if (zArr[c10]) {
                    }
                    if (z11) {
                    }
                    fromFile = Uri.fromFile(r25);
                    z12 = z11;
                    if (z12) {
                    }
                    if (d2Var != null) {
                    }
                }
                try {
                    try {
                        FileChannel channel2 = fileInputStream.getChannel();
                        try {
                            channel = new FileOutputStream((File) file2).getChannel();
                            c10 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            str = file2;
                            c10 = 0;
                        }
                        try {
                            try {
                                long size = channel2.size();
                                try {
                                    if (AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(fileInputStream.getFD(), null)).intValue())) {
                                        if (d2Var != null) {
                                            AndroidUtilities.runOnUIThread(new g1(d2Var, 24));
                                        }
                                        if (channel != null) {
                                            try {
                                                channel.close();
                                            } catch (Throwable th5) {
                                                th3 = th5;
                                                str = file2;
                                                if (channel2 != null) {
                                                }
                                            }
                                        }
                                        try {
                                            channel2.close();
                                            try {
                                                fileInputStream.close();
                                                return;
                                            } catch (Exception e10) {
                                                e = e10;
                                                str = file2;
                                                FileLog.e(e);
                                                z10 = false;
                                                r25 = str;
                                                if (zArr[c10]) {
                                                }
                                                if (z11) {
                                                }
                                                fromFile = Uri.fromFile(r25);
                                                z12 = z11;
                                                if (z12) {
                                                    AndroidUtilities.runOnUIThread(new l6(callback, fromFile, 0));
                                                }
                                                if (d2Var != null) {
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                            str = file2;
                                            try {
                                                fileInputStream.close();
                                                throw th2;
                                            } catch (Throwable th7) {
                                                th2.addSuppressed(th7);
                                                throw th2;
                                            }
                                        }
                                    }
                                } catch (Throwable th8) {
                                    FileLog.e(th8);
                                }
                                long j10 = 0;
                                while (j10 < size) {
                                    if (zArr[0]) {
                                        break;
                                    }
                                    str = file2;
                                    try {
                                        channel.transferFrom(channel2, j10, Math.min(4096L, size - j10));
                                        long j11 = j10;
                                        if (d2Var == null || currentTimeMillis > System.currentTimeMillis() - 500) {
                                            j3 = 4096;
                                        } else {
                                            currentTimeMillis = System.currentTimeMillis();
                                            j3 = 4096;
                                            AndroidUtilities.runOnUIThread(new u6(d2Var, (int) ((j11 / size) * 100.0f), 7));
                                        }
                                        j10 = j11 + j3;
                                        file2 = str;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        Throwable th10 = th;
                                        if (channel == null) {
                                            throw th10;
                                        }
                                        try {
                                            channel.close();
                                            throw th10;
                                        } catch (Throwable th11) {
                                            th10.addSuppressed(th11);
                                            throw th10;
                                        }
                                    }
                                }
                                r25 = file2;
                                if (channel != null) {
                                    channel.close();
                                }
                                channel2.close();
                                fileInputStream.close();
                                z10 = true;
                                if (zArr[c10]) {
                                    r25.delete();
                                    z11 = false;
                                } else {
                                    z11 = z10;
                                }
                                if (z11) {
                                    if (i10 == 2) {
                                        ((DownloadManager) ApplicationLoader.applicationContext.getSystemService("download")).addCompletedDownload(r25.getName(), r25.getName(), false, str2, r25.getAbsolutePath(), r25.length(), true);
                                    } else {
                                        AndroidUtilities.addMediaToGallery(r25.getAbsoluteFile());
                                    }
                                }
                                fromFile = Uri.fromFile(r25);
                                z12 = z11;
                            } catch (Throwable th12) {
                                th = th12;
                                str = file2;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            th3 = th;
                            str = str;
                            if (channel2 != null) {
                                throw th3;
                            }
                            try {
                                channel2.close();
                                throw th3;
                            } catch (Throwable th14) {
                                th3.addSuppressed(th14);
                                throw th3;
                            }
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        str = file2;
                        c10 = 0;
                        th2 = th;
                        str = str;
                        fileInputStream.close();
                        throw th2;
                    }
                } catch (Throwable th16) {
                    th = th16;
                    th2 = th;
                    str = str;
                    fileInputStream.close();
                    throw th2;
                }
            }
            if (z12 && callback != null) {
                AndroidUtilities.runOnUIThread(new l6(callback, fromFile, 0));
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        if (d2Var != null) {
            AndroidUtilities.runOnUIThread(new d6(d2Var, zArr2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveFile$51(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveFile$52(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var) {
        if (zArr[0]) {
            return;
        }
        d2Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$saveFile$54(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr) {
        try {
            if (d2Var.isShowing()) {
                d2Var.dismiss();
            } else {
                zArr[0] = true;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void lambda$saveFile$55(File file, File file2, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr2) {
        Uri uri = null;
        boolean z10 = false;
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
                        z10 = !zArr[0];
                    } finally {
                    }
                }
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                if (z10) {
                    uri = insert;
                } else {
                    try {
                        ApplicationLoader.applicationContext.getContentResolver().delete(insert, null, null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (z10 && callback != null) {
                AndroidUtilities.runOnUIThread(new l6(callback, uri, 1));
            }
            if (d2Var == null) {
                AndroidUtilities.runOnUIThread(new d6(d2Var, zArr2, 3));
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
                z10 = true;
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new l6(callback, uri, 1));
            }
            if (d2Var == null) {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCurrentVideoVisible$14() {
        cleanupPlayer(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPlaybackSpeed$16(MessageObject messageObject, float f7) {
        if (this.audioPlayer == null || this.playingMessageObject == null || this.isPaused) {
            return;
        }
        if (isSamePlayingMessage(messageObject)) {
            seekToProgress(this.playingMessageObject, f7);
        }
        this.audioPlayer.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTextureView$15() {
        cleanupPlayer(true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortPlaylist$13(MessageObject messageObject, MessageObject messageObject2) {
        int compare;
        int id2 = messageObject.getId();
        int id3 = messageObject2.getId();
        long j3 = messageObject.messageOwner.grouped_id;
        long j10 = messageObject2.messageOwner.grouped_id;
        if (id2 >= 0 || id3 >= 0) {
            if (j3 == 0 || j3 != j10) {
                return Integer.compare(id2, id3);
            }
            compare = Integer.compare(id3, id2);
        } else {
            if (j3 == 0 || j3 != j10) {
                return Integer.compare(id3, id2);
            }
            compare = Integer.compare(id2, id3);
        }
        return -compare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRaiseToEarSensors$8() {
        Sensor sensor = this.gravitySensor;
        if (sensor != null) {
            this.sensorManager.registerListener(this, sensor, 30000);
        }
        Sensor sensor2 = this.linearSensor;
        if (sensor2 != null) {
            this.sensorManager.registerListener(this, sensor2, 30000);
        }
        Sensor sensor3 = this.accelerometerSensor;
        if (sensor3 != null) {
            this.sensorManager.registerListener(this, sensor3, 30000);
        }
        this.sensorManager.registerListener(this, this.proximitySensor, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$33(int i10, int i11) {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$34(int i10, int i11) {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$35(int i10, int i11) {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$36(int i10, int i11) {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(i11), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$37(final int i10, final int i11, long j3, long j10, MessageSuggestionParams messageSuggestionParams, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, SendMessageChatArguments sendMessageChatArguments) {
        if (this.audioRecorder != null) {
            final int i12 = 0;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.p6
                public final /* synthetic */ MediaController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.b.lambda$startRecording$33(i10, i11);
                            break;
                        case 1:
                            this.b.lambda$startRecording$34(i10, i11);
                            break;
                        case 2:
                            this.b.lambda$startRecording$35(i10, i11);
                            break;
                        default:
                            this.b.lambda$startRecording$36(i10, i11);
                            break;
                    }
                }
            });
            return;
        }
        setBluetoothScoOn(true);
        this.sendAfterDone = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.recordingAudio = tL_document;
        this.recordingGuid = i11;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = TLObject.FLAG_31;
        tL_document.id = SharedConfig.getLastLocalId();
        this.recordingAudio.user_id = UserConfig.getInstance(i10).getClientUserId();
        TLRPC.TL_document tL_document2 = this.recordingAudio;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        SharedConfig.saveConfig();
        this.recordingAudioFile = new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) { // from class: org.telegram.messenger.MediaController.17
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
            FileLog.d("start recording internal " + this.recordingAudioFile.getPath() + " " + this.recordingAudioFile.exists());
        }
        AutoDeleteMediaTask.lockFile(this.recordingAudioFile);
        try {
            if (startRecord(this.recordingAudioFile.getPath(), this.sampleRate) == 0) {
                final int i13 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.p6
                    public final /* synthetic */ MediaController b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                this.b.lambda$startRecording$33(i10, i11);
                                break;
                            case 1:
                                this.b.lambda$startRecording$34(i10, i11);
                                break;
                            case 2:
                                this.b.lambda$startRecording$35(i10, i11);
                                break;
                            default:
                                this.b.lambda$startRecording$36(i10, i11);
                                break;
                        }
                    }
                });
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("cant init encoder");
                    return;
                }
                return;
            }
            this.audioRecorderPaused = false;
            this.audioRecorder = new AudioRecord(0, this.sampleRate, 16, 2, this.recordBufferSize);
            this.recordStartTime = System.currentTimeMillis();
            long j11 = 0;
            this.recordTimeCount = 0L;
            this.writtenFrame = 0;
            this.samplesCount = 0L;
            this.recordDialogId = j3;
            this.recordMonoForumPeerId = j10;
            this.recordMonoForumSuggestionParams = messageSuggestionParams;
            if (messageObject != null) {
                j11 = MessageObject.getTopicId(this.recordingCurrentAccount, messageObject.messageOwner, false);
            }
            this.recordTopicId = j11;
            this.recordingCurrentAccount = i10;
            this.recordReplyingMsg = messageObject2;
            this.recordReplyingTopMsg = messageObject;
            this.recordReplyingStory = storyItem;
            this.recordSendMessageChatArguments = sendMessageChatArguments;
            this.fileBuffer.rewind();
            this.audioRecorder.startRecording();
            this.recordQueue.postRunnable(this.recordRunnable);
            final int i14 = 3;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.p6
                public final /* synthetic */ MediaController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i14) {
                        case 0:
                            this.b.lambda$startRecording$33(i10, i11);
                            break;
                        case 1:
                            this.b.lambda$startRecording$34(i10, i11);
                            break;
                        case 2:
                            this.b.lambda$startRecording$35(i10, i11);
                            break;
                        default:
                            this.b.lambda$startRecording$36(i10, i11);
                            break;
                    }
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
            this.recordingAudio = null;
            stopRecord();
            AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
            this.recordingAudioFile.delete();
            this.recordingAudioFile = null;
            File file = this.recordingPrevAudioFile;
            if (file != null) {
                file.delete();
                this.recordingPrevAudioFile = null;
            }
            try {
                this.audioRecorder.release();
                this.audioRecorder = null;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            setBluetoothScoOn(false);
            final int i15 = 2;
            AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.messenger.p6
                public final /* synthetic */ MediaController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            this.b.lambda$startRecording$33(i10, i11);
                            break;
                        case 1:
                            this.b.lambda$startRecording$34(i10, i11);
                            break;
                        case 2:
                            this.b.lambda$startRecording$35(i10, i11);
                            break;
                        default:
                            this.b.lambda$startRecording$36(i10, i11);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRaiseToEarSensors$9() {
        Sensor sensor = this.linearSensor;
        if (sensor != null) {
            this.sensorManager.unregisterListener(this, sensor);
        }
        Sensor sensor2 = this.gravitySensor;
        if (sensor2 != null) {
            this.sensorManager.unregisterListener(this, sensor2);
        }
        Sensor sensor3 = this.accelerometerSensor;
        if (sensor3 != null) {
            this.sensorManager.unregisterListener(this, sensor3);
        }
        this.sensorManager.unregisterListener(this, this.proximitySensor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRecording$42(int i10) {
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStopped, Integer.valueOf(this.recordingGuid), Integer.valueOf(i10 == 2 ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRecording$43(int i10, boolean z10, int i11, boolean z11, long j3) {
        if (this.sendAfterDone == 3) {
            this.sendAfterDone = 0;
            stopRecordingInternal(i10, z10, i11, z11, j3);
            return;
        }
        AudioRecord audioRecord = this.audioRecorder;
        if (audioRecord == null) {
            this.recordingAudio = null;
            this.manualRecording = false;
            this.raiseToEarRecord = false;
            this.ignoreOnPause = false;
            return;
        }
        try {
            this.sendAfterDone = i10;
            this.sendAfterDoneNotify = z10;
            this.sendAfterDoneScheduleDate = i11;
            this.sendAfterDoneOnce = z11;
            this.sendAfterDonePayStars = j3;
            audioRecord.stop();
            setBluetoothScoOn(false);
        } catch (Exception e) {
            FileLog.e(e);
            if (this.recordingAudioFile != null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file");
                }
                this.recordingAudioFile.delete();
            }
        }
        if (i10 == 0) {
            stopRecordingInternal(0, false, 0, false, 0L);
        }
        try {
            this.feedbackView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.runOnUIThread(new f6(this, i10, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRecordingInternal$40(File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        boolean z12;
        char c10;
        String str;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("stop recording internal ");
            if (file == null) {
                str = BuildConfig.BETA_URL;
            } else {
                str = file.exists() + " " + file.length() + "  recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame;
            }
            hc.b.v(str, sb2);
        }
        if ((file == null || !file.exists()) && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame));
        }
        MediaDataController.getInstance(this.recordingCurrentAccount).pushDraftVoiceMessage(this.recordDialogId, this.recordTopicId, null);
        tL_document.date = ConnectionsManager.getInstance(this.recordingCurrentAccount).getCurrentTime();
        tL_document.size = file == null ? 0L : (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        byte[] waveform = getWaveform(file.getAbsolutePath());
        tL_documentAttributeAudio.waveform = waveform;
        if (waveform != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        long j10 = this.recordTimeCount;
        tL_documentAttributeAudio.duration = j10 / 1000.0d;
        tL_document.attributes.clear();
        tL_document.attributes.add(tL_documentAttributeAudio);
        if (j10 > 700) {
            if (i10 == 1) {
                c10 = 1;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, file.getAbsolutePath(), this.recordDialogId, this.recordReplyingMsg, this.recordReplyingTopMsg, null, null, null, null, z10, i11, 0, z11 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, null, null, false);
                of2.monoForumPeer = this.recordMonoForumPeerId;
                of2.suggestionParams = this.recordMonoForumSuggestionParams;
                of2.replyToStoryItem = this.recordReplyingStory;
                of2.sendMessageChatArguments = this.recordSendMessageChatArguments;
                of2.payStars = j3;
                SendMessagesHelper.getInstance(this.recordingCurrentAccount).sendMessage(of2);
            } else {
                c10 = 1;
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.recordingCurrentAccount);
            int i12 = NotificationCenter.audioDidSent;
            Integer valueOf = Integer.valueOf(this.recordingGuid);
            TLRPC.TL_document tL_document2 = i10 == 2 ? tL_document : null;
            String absolutePath = i10 == 2 ? file.getAbsolutePath() : null;
            Object[] objArr = new Object[3];
            z12 = false;
            objArr[0] = valueOf;
            objArr[c10] = tL_document2;
            objArr[2] = absolutePath;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, objArr);
        } else {
            z12 = false;
            NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRecordTooShort, Integer.valueOf(this.recordingGuid), Boolean.FALSE, Integer.valueOf((int) j10));
            AutoDeleteMediaTask.unlockFile(file);
            file.delete();
        }
        requestRecordAudioFocus(z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRecordingInternal$41(File file, File file2, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        stopRecord();
        File joinRecord = joinRecord(file, file2, tL_document);
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
        AndroidUtilities.runOnUIThread(new q6(this, joinRecord, tL_document, i10, z10, i11, z11, j3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleRecordingPause$27(File file, boolean z10, TLRPC.TL_document tL_document) {
        boolean exists = file.exists();
        if (!exists && BuildVars.DEBUG_VERSION) {
            FileLog.e(new RuntimeException("file not found :( recordTimeCount " + this.recordTimeCount + " writedFrames" + this.writtenFrame));
        }
        if (exists) {
            MediaDataController.getInstance(this.recordingCurrentAccount).pushDraftVoiceMessage(this.recordDialogId, this.recordTopicId, MediaDataController.DraftVoice.of(this, file.getAbsolutePath(), z10, 0.0f, VOLUME_NORMAL));
        }
        tL_document.date = ConnectionsManager.getInstance(this.recordingCurrentAccount).getCurrentTime();
        tL_document.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        byte[] waveform = getWaveform(file.getAbsolutePath());
        tL_documentAttributeAudio.waveform = waveform;
        if (waveform != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = this.recordTimeCount / 1000.0d;
        tL_document.attributes.clear();
        tL_document.attributes.add(tL_documentAttributeAudio);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordPaused, new Object[0]);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(this.recordingGuid), tL_document, file.getAbsolutePath());
        requestRecordAudioFocus(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleRecordingPause$28(boolean z10) {
        stopRecord();
        TLRPC.TL_document tL_document = this.recordingAudio;
        File joinRecord = joinRecord(this.recordingPrevAudioFile, this.recordingAudioFile, tL_document);
        if (tL_document == null || joinRecord == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new dk(this, joinRecord, z10, tL_document, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleRecordingPause$29() {
        this.recordStartRunnable = null;
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(this.recordingGuid));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleRecordingPause$30() {
        requestRecordAudioFocus(true);
        this.audioRecorder = new AudioRecord(0, this.sampleRate, 16, 2, this.recordBufferSize);
        this.recordStartTime = System.currentTimeMillis();
        this.writtenFrame = 0;
        this.samplesCount = 0L;
        this.fileBuffer.rewind();
        this.audioRecorder.startRecording();
        this.recordQueue.postRunnable(this.recordRunnable);
        NotificationCenter.getInstance(this.recordingCurrentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleRecordingPause$31() {
        this.recordingPrevAudioFile = this.recordingAudioFile;
        File file = new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) { // from class: org.telegram.messenger.MediaController.16
            @Override // java.io.File
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file (from resume)");
                }
                return super.delete();
            }
        };
        this.recordingAudioFile = file;
        if (startRecord(file.getPath(), this.sampleRate) != 0) {
            AndroidUtilities.runOnUIThread(new b6(this, 4));
            return;
        }
        AndroidUtilities.runOnUIThread(new b6(this, 3));
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("cant resume audio encoder");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toggleRecordingPause$32(boolean z10) {
        if (this.recordingAudio == null || this.recordingAudioFile == null) {
            return;
        }
        boolean z11 = this.audioRecorderPaused;
        this.audioRecorderPaused = !z11;
        if (z11) {
            this.recordQueue.cancelRunnable(this.recordRunnable);
            this.recordQueue.postRunnable(new b6(this, 9));
            return;
        }
        AudioRecord audioRecord = this.audioRecorder;
        if (audioRecord == null) {
            return;
        }
        this.sendAfterDone = 4;
        audioRecord.stop();
        this.audioRecorder.release();
        this.audioRecorder = null;
        this.recordQueue.postRunnable(new r6(this, z10, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$trimCurrentRecording$26(File file, long j3, long j10, Runnable runnable) {
        if (cropOpusFile(this.recordingAudioFile.getAbsolutePath(), file.getAbsolutePath(), j3, j10)) {
            File file2 = this.recordingAudioFile;
            if (file2 != null) {
                file2.delete();
            }
            this.recordingAudioFile = file;
            this.recordTimeCount = j10 - j3;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }
    }

    public static void loadGalleryPhotosAlbums(int i10) {
        Thread thread = new Thread(new di.u2(i10, 1));
        thread.setPriority(1);
        thread.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int makeVideoBitrate(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        float f7;
        int min = Math.min(i13, i14);
        float f10 = VOLUME_NORMAL;
        if (min >= 1080) {
            i15 = VIDEO_BITRATE_1080;
        } else {
            if (Math.min(i13, i14) < 720) {
                if (Math.min(i13, i14) >= 480) {
                    i15 = VIDEO_BITRATE_480;
                    f10 = 0.75f;
                    f7 = 0.9f;
                } else {
                    i15 = VIDEO_BITRATE_360;
                    f10 = 0.6f;
                    f7 = 0.7f;
                }
                int min2 = (int) (((int) (i12 / Math.min(i10 / i13, i11 / i14))) * f10);
                int videoBitrateWithFactor = (int) (getVideoBitrateWithFactor(f7) / (921600.0f / (i14 * i13)));
                return i12 >= videoBitrateWithFactor ? min2 : min2 > i15 ? i15 : Math.max(min2, videoBitrateWithFactor);
            }
            i15 = 2600000;
        }
        f7 = VOLUME_NORMAL;
        int min22 = (int) (((int) (i12 / Math.min(i10 / i13, i11 / i14))) * f10);
        int videoBitrateWithFactor2 = (int) (getVideoBitrateWithFactor(f7) / (921600.0f / (i14 * i13)));
        if (i12 >= videoBitrateWithFactor2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playNextMessageWithoutOrder(boolean z10) {
        int i10;
        ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
        if (z10 && (((i10 = SharedConfig.repeatMode) == 2 || (i10 == 1 && arrayList.size() == 1)) && !this.forceLoopCurrentPlaylist)) {
            cleanupPlayer(false, false);
            int i11 = this.currentPlaylistNum;
            if (i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject = arrayList.get(this.currentPlaylistNum);
            messageObject.audioProgress = 0.0f;
            messageObject.audioProgressSec = 0;
            playMessage(messageObject);
            return;
        }
        if (!traversePlaylist(arrayList, SharedConfig.playOrderReversed ? 1 : -1) || !z10 || SharedConfig.repeatMode != 0 || this.forceLoopCurrentPlaylist) {
            int i12 = this.currentPlaylistNum;
            if (i12 < 0 || i12 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject2 = this.playingMessageObject;
            if (messageObject2 != null) {
                messageObject2.resetPlayingProgress();
            }
            this.playMusicAgain = true;
            playMessage(arrayList.get(this.currentPlaylistNum));
            return;
        }
        t71 t71Var = this.audioPlayer;
        if (t71Var == null && this.videoPlayer == null) {
            return;
        }
        if (t71Var != null) {
            MusicListenReporter musicListenReporter = this.reporter;
            if (musicListenReporter != null) {
                musicListenReporter.destroy();
                this.reporter = null;
            }
            try {
                this.audioPlayer.H();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.audioPlayer = null;
            org.telegram.ui.ActionBar.j6.G1(this.playingMessageObject);
        } else {
            this.currentAspectRatioFrameLayout = null;
            this.currentTextureViewContainer = null;
            this.currentAspectRatioFrameLayoutReady = false;
            this.currentTextureView = null;
            this.videoPlayer.H();
            this.videoPlayer = null;
            try {
                this.baseActivity.getWindow().clearFlags(128);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
            FileLoader.getInstance(this.playingMessageObject.currentAccount).removeLoadingVideo(this.playingMessageObject.getDocument(), true, false);
        }
        stopProgressTimer();
        this.lastProgress = 0L;
        this.isPaused = true;
        MessageObject messageObject3 = this.playingMessageObject;
        messageObject3.audioProgress = 0.0f;
        messageObject3.audioProgressSec = 0;
        NotificationCenter.getInstance(messageObject3.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
        NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0068, code lost:
    
        if (r4.toLowerCase().contains("screenshot") != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processMediaObserver(Uri uri) {
        int i10;
        Cursor cursor = null;
        try {
            try {
                Point realScreenSize = AndroidUtilities.getRealScreenSize();
                cursor = ApplicationLoader.applicationContext.getContentResolver().query(uri, this.mediaProjections, null, null, "date_added DESC LIMIT 1");
                ArrayList arrayList = new ArrayList();
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        long j3 = cursor.getLong(3);
                        String string4 = cursor.getString(4);
                        int i11 = cursor.getInt(5);
                        int i12 = cursor.getInt(6);
                        if (string != null && string.toLowerCase().contains("screenshot")) {
                            if (i11 != 0 || i12 == 0) {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(string, options);
                                i11 = options.outWidth;
                                i12 = options.outHeight;
                            }
                            if (i11 <= 0 && i12 > 0) {
                                try {
                                    i10 = realScreenSize.x;
                                    if (i11 != i10) {
                                        if (i12 != realScreenSize.y) {
                                        }
                                    }
                                    if (i12 != i10 && i11 == realScreenSize.y) {
                                    }
                                } catch (Exception unused) {
                                    arrayList.add(Long.valueOf(j3));
                                }
                            }
                            arrayList.add(Long.valueOf(j3));
                        }
                        if (string3 != null) {
                            if (string3.toLowerCase().contains("screenshot")) {
                                if (i11 != 0) {
                                }
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(string, options2);
                                i11 = options2.outWidth;
                                i12 = options2.outHeight;
                                if (i11 <= 0) {
                                    i10 = realScreenSize.x;
                                    if (i11 != i10 || i12 != realScreenSize.y) {
                                        if (i12 != i10) {
                                        }
                                    }
                                }
                                arrayList.add(Long.valueOf(j3));
                            }
                        }
                        if (string4 != null && string4.toLowerCase().contains("screenshot")) {
                            if (i11 != 0) {
                            }
                            BitmapFactory.Options options22 = new BitmapFactory.Options();
                            options22.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(string, options22);
                            i11 = options22.outWidth;
                            i12 = options22.outHeight;
                            if (i11 <= 0) {
                            }
                            arrayList.add(Long.valueOf(j3));
                        }
                    }
                    cursor.close();
                }
                if (!arrayList.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new f2(16, this, arrayList));
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

    private void raiseToSpeakUpdated(boolean z10) {
        if (this.recordingAudio != null) {
            toggleRecordingPause(false);
            return;
        }
        if (!z10) {
            stopRecording(2, false, 0, false, 0L);
            return;
        }
        int currentAccount = this.raiseChat.getCurrentAccount();
        long a2 = this.raiseChat.a();
        eo eoVar = this.raiseChat;
        MessageObject messageObject = eoVar.X3;
        int classGuid = eoVar.getClassGuid();
        eo eoVar2 = this.raiseChat;
        SendMessageChatArguments C8 = eoVar2 != null ? eoVar2.C8() : null;
        eo eoVar3 = this.raiseChat;
        long N8 = eoVar3 != null ? eoVar3.N8() : 0L;
        eo eoVar4 = this.raiseChat;
        startRecording(currentAccount, a2, null, messageObject, null, classGuid, false, C8, N8, eoVar4 != null ? eoVar4.g5 : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean restoreMusicPlaylistState() {
        int i10;
        MessageObject messageObject;
        SavedMusicPlaylistState savedMusicPlaylistState = this.savedMusicPlaylistState;
        if (savedMusicPlaylistState == null) {
            return false;
        }
        this.savedMusicPlaylistState = null;
        ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
        if (arrayList == null || (i10 = this.currentPlaylistNum) < 0 || i10 >= arrayList.size() || (messageObject = arrayList.get(this.currentPlaylistNum)) == null || messageObject.getDialogId() != savedMusicPlaylistState.playingMessage.getDialogId() || messageObject.getId() != savedMusicPlaylistState.playingMessage.getId()) {
            return false;
        }
        this.playMusicAgain = false;
        float f7 = savedMusicPlaylistState.progress;
        messageObject.forceSeekTo = f7;
        messageObject.audioProgress = f7;
        messageObject.audioProgressMs = savedMusicPlaylistState.progressMs;
        messageObject.audioProgressSec = savedMusicPlaylistState.progressSec;
        playMessage(messageObject);
        pauseMessage(messageObject, false);
        return true;
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
                if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                    this.audioVolume = VOLUME_NORMAL;
                    setPlayerVolume();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.audioVolume, VOLUME_NORMAL);
                    this.audioVolumeAnimator = ofFloat;
                    ofFloat.addUpdateListener(this.audioVolumeUpdateListener);
                    this.audioVolumeAnimator.setDuration(300L);
                    this.audioVolumeAnimator.start();
                }
                t71 t71Var = this.audioPlayer;
                if (t71Var != null) {
                    t71Var.C();
                } else {
                    t71 t71Var2 = this.videoPlayer;
                    if (t71Var2 != null) {
                        t71Var2.C();
                    }
                }
                checkAudioFocus(messageObject);
                this.isPaused = false;
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                try {
                    b5.d.b(1);
                    if (!this.ignorePlayerUpdate) {
                        b5.d.x(true);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                return true;
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        return false;
    }

    public static void saveFile(String str, Context context, int i10, String str2, String str3) {
        saveFile(str, context, i10, str2, str3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Uri saveFileInternal(int i10, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String fileExtension = FileLoader.getFileExtension(file);
            String mimeTypeFromExtension = fileExtension != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension) : null;
            if ((i10 == 0 || i10 == 1) && mimeTypeFromExtension != null) {
                if (mimeTypeFromExtension.startsWith("image")) {
                    i10 = 0;
                }
                if (mimeTypeFromExtension.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    i10 = 1;
                }
            }
            if (i10 == 0) {
                if (str == null) {
                    str = AndroidUtilities.generateFileName(0, fileExtension);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i10 == 1) {
                if (str == null) {
                    str = AndroidUtilities.generateFileName(1, fileExtension);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i10 == 2) {
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

    public static void saveFilesFromMessages(Context context, AccountInstance accountInstance, ArrayList<MessageObject> arrayList, MessagesStorage.IntCallback intCallback) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        new MediaLoader(context, accountInstance, arrayList, intCallback).start();
    }

    private boolean saveMusicPlaylistStateIfNeeded() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null || !messageObject.isMusic() || this.playlist.isEmpty()) {
            return this.savedMusicPlaylistState != null;
        }
        this.savedMusicPlaylistState = new SavedMusicPlaylistState(this.playingMessageObject);
        return true;
    }

    public static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        MediaCodecInfo mediaCodecInfo = null;
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
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
        int i10;
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i11 >= iArr.length) {
                return i12;
            }
            i10 = iArr[i11];
            if (isRecognizedFormat(i10)) {
                if (!mediaCodecInfo.getName().equals("OMX.SEC.AVC.Encoder") || i10 != 19) {
                    break;
                }
                i12 = i10;
            }
            i11++;
        }
        return i10;
    }

    private void setBluetoothScoOn(boolean z10) {
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (SharedConfig.recordViaSco && !me0.f("android.permission.BLUETOOTH_CONNECT")) {
            SharedConfig.recordViaSco = false;
            SharedConfig.saveConfig();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && SharedConfig.recordViaSco) && z10) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                }
                if (!z10 && !audioManager.isBluetoothScoOn()) {
                    audioManager.startBluetoothSco();
                    return;
                } else if (z10 && audioManager.isBluetoothScoOn()) {
                    audioManager.stopBluetoothSco();
                    return;
                }
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th2) {
                FileLog.e(th2);
                return;
            }
        }
        if (z10) {
            return;
        }
        if (!z10) {
        }
        if (z10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerVolume() {
        try {
            float f7 = 0.0f;
            float f10 = this.isSilent ? 0.0f : this.audioFocus != 1 ? VOLUME_NORMAL : VOLUME_DUCK;
            t71 t71Var = this.audioPlayer;
            if (t71Var != null) {
                if (!b5.d.u()) {
                    f7 = this.audioVolume * f10;
                }
                t71Var.W(f7);
            } else {
                t71 t71Var2 = this.videoPlayer;
                if (t71Var2 != null) {
                    if (!b5.d.u()) {
                        f7 = f10;
                    }
                    t71Var2.W(f7);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void setUseFrontSpeaker(boolean z10) {
        this.useFrontSpeaker = z10;
        AudioManager audioManager = NotificationsController.audioManager;
        if (!z10) {
            audioManager.setSpeakerphoneOn(true);
        } else {
            audioManager.setBluetoothScoOn(false);
            audioManager.setSpeakerphoneOn(false);
        }
    }

    private void sortPlaylist() {
        Collections.sort(this.playlist, new p(7));
    }

    private void startAudioAgain(boolean z10) {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null) {
            return;
        }
        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioRouteChanged, Boolean.valueOf(this.useFrontSpeaker));
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            t71Var.S(this.useFrontSpeaker ? 0 : 3);
            if (z10) {
                lambda$startAudioAgain$7(this.playingMessageObject);
                return;
            }
            if (this.videoPlayer.n() < 1000) {
                this.videoPlayer.K(0L);
            }
            this.videoPlayer.C();
            return;
        }
        t71 t71Var2 = this.audioPlayer;
        boolean z11 = t71Var2 != null;
        MessageObject messageObject2 = this.playingMessageObject;
        float f7 = messageObject2.audioProgress;
        int i10 = messageObject2.audioPlayerDuration;
        if (z10 || t71Var2 == null || !t71Var2.y() || i10 * f7 > VOLUME_NORMAL) {
            messageObject2.audioProgress = f7;
        } else {
            messageObject2.audioProgress = 0.0f;
        }
        cleanupPlayer(false, true);
        playMessage(messageObject2);
        if (z10) {
            if (z11) {
                AndroidUtilities.runOnUIThread(new f2(17, this, messageObject2), 100L);
            } else {
                lambda$startAudioAgain$7(messageObject2);
            }
        }
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

    private native int startRecord(String str, int i10);

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
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        VideoConvertRunnable.runConversion(videoConvertMessage);
        return true;
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

    private native void stopRecord();

    /* JADX INFO: Access modifiers changed from: private */
    public void stopRecordingInternal(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        final File file;
        if (i10 == 0 || (file = this.recordingAudioFile) == null) {
            AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
            File file2 = this.recordingAudioFile;
            if (file2 != null) {
                file2.delete();
            }
            requestRecordAudioFocus(false);
        } else {
            final TLRPC.TL_document tL_document = this.recordingAudio;
            final File file3 = this.recordingPrevAudioFile;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("stop recording internal filename " + this.recordingAudioFile.getPath());
            }
            this.fileEncodingQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.j6
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController.this.lambda$stopRecordingInternal$41(file3, file, tL_document, i10, z10, i11, z11, j3);
                }
            });
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

    private boolean traversePlaylist(ArrayList<MessageObject> arrayList, int i10) {
        MessageObject messageObject;
        int i11;
        MessageObject messageObject2;
        int i12 = this.currentPlaylistNum;
        boolean z10 = ConnectionsManager.getInstance(UserConfig.selectedAccount).getConnectionState() == 2;
        this.currentPlaylistNum += i10;
        if (z10) {
            while (this.currentPlaylistNum < arrayList.size() && (i11 = this.currentPlaylistNum) >= 0 && ((messageObject2 = arrayList.get(i11)) == null || !messageObject2.mediaExists)) {
                this.currentPlaylistNum += i10;
            }
        }
        if (this.currentPlaylistNum < arrayList.size() && this.currentPlaylistNum >= 0) {
            return false;
        }
        this.currentPlaylistNum = this.currentPlaylistNum >= arrayList.size() ? 0 : arrayList.size() - 1;
        if (z10) {
            while (true) {
                int i13 = this.currentPlaylistNum;
                if (i13 < 0 || i13 >= arrayList.size()) {
                    break;
                }
                int i14 = this.currentPlaylistNum;
                if (i10 > 0) {
                    if (i14 > i12) {
                        break;
                    }
                    messageObject = arrayList.get(this.currentPlaylistNum);
                    if (messageObject == null && messageObject.mediaExists) {
                        break;
                    }
                    this.currentPlaylistNum += i10;
                } else {
                    if (i14 < i12) {
                        break;
                    }
                    messageObject = arrayList.get(this.currentPlaylistNum);
                    if (messageObject == null) {
                    }
                    this.currentPlaylistNum += i10;
                }
            }
            if (this.currentPlaylistNum >= arrayList.size() || this.currentPlaylistNum < 0) {
                this.currentPlaylistNum = this.currentPlaylistNum < arrayList.size() ? arrayList.size() - 1 : 0;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVideoState(MessageObject messageObject, int[] iArr, boolean z10, boolean z11, int i10) {
        MessageObject messageObject2;
        if (this.videoPlayer == null) {
            return;
        }
        if (i10 == 4 || i10 == 1) {
            try {
                this.baseActivity.getWindow().clearFlags(128);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                this.baseActivity.getWindow().addFlags(128);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (i10 == 3) {
            this.playerWasReady = true;
            MessageObject messageObject3 = this.playingMessageObject;
            if (messageObject3 != null && (messageObject3.isVideo() || this.playingMessageObject.isRoundVideo())) {
                AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
                FileLoader.getInstance(messageObject.currentAccount).removeLoadingVideo(this.playingMessageObject.getDocument(), true, false);
            }
            this.currentAspectRatioFrameLayoutReady = true;
            return;
        }
        if (i10 == 2) {
            if (!z11 || (messageObject2 = this.playingMessageObject) == null) {
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
        if (this.videoPlayer.y() && i10 == 4) {
            MessageObject messageObject4 = this.playingMessageObject;
            if (messageObject4 == null || !messageObject4.isVideo() || z10 || (iArr != null && iArr[0] >= 4)) {
                if (restoreMusicPlaylistState()) {
                    return;
                }
                cleanupPlayer(true, hasNoNextVoiceOrRoundVideoMessage(), true, false);
            } else {
                this.videoPlayer.K(0L);
                if (iArr != null) {
                    iArr[0] = iArr[0] + 1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int writeFrame(ByteBuffer byteBuffer, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeMotionPhoto(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String buildMotionPhotoXmp = buildMotionPhotoXmp(file2.length());
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = buildMotionPhotoXmp.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length > 65535) {
            throw new IOException(hc.b.j(length, "XMP segment too large: "));
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read();
            int read2 = fileInputStream.read();
            if (read != 255 || read2 != 216) {
                throw new IOException("Not a JPEG: " + file);
            }
            outputStream.write(255);
            outputStream.write(216);
            outputStream.write(255);
            outputStream.write(225);
            outputStream.write((length >> 8) & 255);
            outputStream.write(length & 255);
            outputStream.write(bytes);
            outputStream.write(bytes2);
            byte[] bArr = new byte[65536];
            while (true) {
                int read3 = fileInputStream.read(bArr);
                if (read3 <= 0) {
                    fileInputStream.close();
                    fileInputStream = new FileInputStream(file2);
                    try {
                        byte[] bArr2 = new byte[65536];
                        while (true) {
                            int read4 = fileInputStream.read(bArr2);
                            if (read4 <= 0) {
                                fileInputStream.close();
                                return;
                            } else {
                                if (zArr != null && zArr[0]) {
                                    fileInputStream.close();
                                    return;
                                }
                                outputStream.write(bArr2, 0, read4);
                            }
                        }
                    } finally {
                    }
                } else {
                    if (zArr != null && zArr[0]) {
                        fileInputStream.close();
                        return;
                    }
                    outputStream.write(bArr, 0, read3);
                }
            }
        } finally {
        }
    }

    public void cancelVideoConvert(MessageObject messageObject) {
        if (messageObject == null || this.videoConvertQueue.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.videoConvertQueue.size(); i10++) {
            VideoConvertMessage videoConvertMessage = this.videoConvertQueue.get(i10);
            MessageObject messageObject2 = videoConvertMessage.messageObject;
            if (messageObject2.equals(messageObject) && messageObject2.currentAccount == messageObject.currentAccount) {
                if (i10 == 0) {
                    synchronized (this.videoConvertSync) {
                        videoConvertMessage.videoEditedInfo.canceled = true;
                    }
                    return;
                } else {
                    this.foregroundConvertingMessages.remove(this.videoConvertQueue.remove(i10));
                    checkForegroundConvertMessage(true);
                    return;
                }
            }
        }
    }

    public void checkIsNextMediaFileDownloaded() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null || !messageObject.isMusic()) {
            return;
        }
        checkIsNextMusicFileDownloaded(this.playingMessageObject.currentAccount);
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
            int i10 = this.useFrontSpeaker ? 0 : 3;
            int streamVolume = audioManager.getStreamVolume(i10);
            if (streamVolume == 0) {
                audioManager.adjustStreamVolume(i10, streamVolume, 1);
                volumeBarLastTimeShown = currentTimeMillis;
            }
        } catch (Exception unused) {
        }
    }

    public void cleanRecording(boolean z10) {
        File file;
        File file2;
        this.recordingAudio = null;
        AutoDeleteMediaTask.unlockFile(this.recordingAudioFile);
        if (z10 && (file2 = this.recordingAudioFile) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.recordingAudioFile = null;
        if (z10 && (file = this.recordingPrevAudioFile) != null) {
            file.delete();
        }
        this.recordingPrevAudioFile = null;
        this.manualRecording = false;
        this.raiseToEarRecord = false;
        this.ignoreOnPause = false;
    }

    public void cleanup() {
        cleanupPlayer(true, true);
        this.audioInfo = null;
        this.playMusicAgain = false;
        for (int i10 = 0; i10 < 4; i10++) {
            DownloadController.getInstance(i10).cleanup();
        }
        this.videoConvertQueue.clear();
        this.generatingWaveform.clear();
        this.savedMusicPlaylistState = null;
        this.voiceMessagesPlaylist = null;
        this.voiceMessagesPlaylistMap = null;
        clearPlaylist();
        cancelVideoConvert(null);
    }

    public void cleanupPlayer(boolean z10, boolean z11) {
        cleanupPlayer(z10, z11, false, false);
    }

    public boolean currentPlaylistIsGlobalSearch() {
        return this.playlistGlobalSearchParams != null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.SavedMusicList savedMusicList;
        MessageObject messageObject;
        ArrayList<MessageObject> arrayList;
        int indexOf;
        int i12 = 0;
        if (i10 == NotificationCenter.fileLoaded || i10 == NotificationCenter.httpFileDidLoad) {
            String str = (String) objArr[0];
            MessageObject messageObject2 = this.playingMessageObject;
            if (messageObject2 != null && messageObject2.currentAccount == i11 && FileLoader.getAttachFileName(messageObject2.getDocument()).equals(str)) {
                if (this.downloadingCurrentMessage) {
                    this.playMusicAgain = true;
                    playMessage(this.playingMessageObject);
                    return;
                } else {
                    if (this.audioInfo == null) {
                        try {
                            this.audioInfo = jf.a.a(FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.playingMessageObject.messageOwner));
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
        if (i10 == NotificationCenter.messagesDeleted) {
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
            while (i12 < arrayList2.size()) {
                Integer num = (Integer) arrayList2.get(i12);
                MessageObject messageObject4 = this.voiceMessagesPlaylistMap.get(num.intValue());
                this.voiceMessagesPlaylistMap.remove(num.intValue());
                if (messageObject4 != null) {
                    this.voiceMessagesPlaylist.remove(messageObject4);
                }
                i12++;
            }
            return;
        }
        if (i10 == NotificationCenter.removeAllMessagesFromDialog) {
            long longValue2 = ((Long) objArr[0]).longValue();
            MessageObject messageObject5 = this.playingMessageObject;
            if (messageObject5 == null || messageObject5.getDialogId() != longValue2) {
                return;
            }
            cleanupPlayer(false, true);
            return;
        }
        if (i10 == NotificationCenter.musicDidLoad) {
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
            for (int i13 = 0; i13 < size; i13++) {
                MessageObject messageObject7 = this.playlist.get(i13);
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
        if (i10 == NotificationCenter.mediaDidLoad) {
            if (((Integer) objArr[3]).intValue() != this.playlistClassGuid || this.playingMessageObject == null) {
                return;
            }
            long longValue4 = ((Long) objArr[0]).longValue();
            ((Integer) objArr[4]).getClass();
            ArrayList arrayList6 = (ArrayList) objArr[2];
            DialogObject.isEncryptedDialog(longValue4);
            char c10 = longValue4 == this.playlistMergeDialogId ? (char) 1 : (char) 0;
            if (!arrayList6.isEmpty()) {
                this.playlistEndReached[c10] = ((Boolean) objArr[5]).booleanValue();
            }
            int i14 = 0;
            for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                MessageObject messageObject9 = (MessageObject) arrayList6.get(i15);
                if (!messageObject9.isVoiceOnce() && !this.playlistMap.containsKey(Integer.valueOf(messageObject9.getId()))) {
                    i14++;
                    this.playlist.add(0, messageObject9);
                    this.playlistMap.put(Integer.valueOf(messageObject9.getId()), messageObject9);
                    int[] iArr2 = this.playlistMaxId;
                    iArr2[c10] = Math.min(iArr2[c10], messageObject9.getId());
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
            if (i14 != 0) {
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.moreMusicDidLoad, Integer.valueOf(i14));
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue() || (arrayList = this.voiceMessagesPlaylist) == null || arrayList.isEmpty() || ((Long) objArr[0]).longValue() != this.voiceMessagesPlaylist.get(0).getDialogId()) {
                return;
            }
            ArrayList arrayList7 = (ArrayList) objArr[1];
            while (i12 < arrayList7.size()) {
                MessageObject messageObject10 = (MessageObject) arrayList7.get(i12);
                if ((messageObject10.isVoice() || messageObject10.isRoundVideo()) && !messageObject10.isVoiceOnce() && !messageObject10.isRoundOnce() && (!this.voiceMessagesPlaylistUnread || (messageObject10.isContentUnread() && !messageObject10.isOut()))) {
                    this.voiceMessagesPlaylist.add(messageObject10);
                    this.voiceMessagesPlaylistMap.put(messageObject10.getId(), messageObject10);
                }
                i12++;
            }
            return;
        }
        if (i10 == NotificationCenter.playerDidStartPlaying) {
            if (isCurrentPlayer((t71) objArr[0])) {
                return;
            }
            MessageObject playingMessageObject = getPlayingMessageObject();
            if (playingMessageObject != null && isPlayingMessage(playingMessageObject) && !isMessagePaused() && (playingMessageObject.isMusic() || playingMessageObject.isVoice())) {
                this.wasPlayingAudioBeforePause = true;
            }
            lambda$startAudioAgain$7(playingMessageObject);
            return;
        }
        if (i10 == NotificationCenter.musicListLoaded && (savedMusicList = this.currentSavedMusicList) != null && objArr[0] == savedMusicList) {
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
                        int i16 = this.currentPlaylistNum;
                        if (i16 < 0 || i16 >= this.playlist.size()) {
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
            NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.moreMusicDidLoad, Integer.valueOf(size2));
        }
    }

    public boolean findMessageInPlaylistAndPlay(MessageObject messageObject) {
        int indexOf = this.playlist.indexOf(messageObject);
        if (indexOf == -1) {
            return playMessage(messageObject);
        }
        playMessageAtIndex(indexOf);
        return true;
    }

    public void generateWaveform(MessageObject messageObject) {
        String str = messageObject.getId() + "_" + messageObject.getDialogId();
        String absolutePath = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner).getAbsolutePath();
        if (this.generatingWaveform.containsKey(str)) {
            return;
        }
        this.generatingWaveform.put(str, messageObject);
        Utilities.globalQueue.postRunnable(new yk(this, absolutePath, str, messageObject, 11));
    }

    public jf.a getAudioInfo() {
        return this.audioInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public of.g getCurrentChromecastMedia() {
        FileOutputStream fileOutputStream;
        m.e3 e3Var;
        of.d dVar;
        MessageObject messageObject = this.playingMessageObject;
        FileOutputStream fileOutputStream2 = null;
        String str = null;
        if (messageObject != null) {
            String musicTitle = messageObject.getMusicTitle();
            String musicAuthor = this.playingMessageObject.getMusicAuthor();
            TLRPC.Document document = this.playingMessageObject.getDocument();
            if (this.playingMessageObject.isRoundVideo() || this.playingMessageObject.isVideo() || this.playingMessageObject.isMusic()) {
                MessageObject messageObject2 = this.playingMessageObject;
                File file = (!messageObject2.attachPathExists || messageObject2.messageOwner == null) ? null : new File(this.playingMessageObject.messageOwner.attachPath);
                if (file == null || !file.exists()) {
                    file = FileLoader.getInstance(this.playingMessageObject.currentAccount).getPathToMessage(this.playingMessageObject.messageOwner);
                }
                if (file != null && file.exists()) {
                    String mimeType = this.playingMessageObject.getMimeType();
                    Uri parse = Uri.parse("file://" + file.getAbsolutePath());
                    c6.l lVar = new c6.l(0);
                    jf.a aVar = this.audioInfo;
                    if (aVar != null) {
                        if (!TextUtils.isEmpty(aVar.c)) {
                            lVar.b("com.google.android.gms.cast.metadata.TITLE", this.audioInfo.c);
                        }
                        if (!TextUtils.isEmpty(this.audioInfo.d)) {
                            lVar.b("com.google.android.gms.cast.metadata.ARTIST", this.audioInfo.d);
                        }
                        if (!TextUtils.isEmpty(this.audioInfo.f)) {
                            lVar.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", this.audioInfo.f);
                        }
                        if (!TextUtils.isEmpty(this.audioInfo.e)) {
                            lVar.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", this.audioInfo.e);
                        }
                        if (!TextUtils.isEmpty(this.audioInfo.m)) {
                            lVar.b("com.google.android.gms.cast.metadata.COMPOSER", this.audioInfo.m);
                        }
                        short s10 = this.audioInfo.k;
                        Bundle bundle = lVar.b;
                        if (s10 != 0) {
                            c6.l.c(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", s10);
                        }
                        short s11 = this.audioInfo.j;
                        if (s11 != 0) {
                            c6.l.c(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", s11);
                        }
                        jf.a aVar2 = this.audioInfo;
                        if (aVar2.o != null) {
                            File file2 = aVar2.q;
                            if (file2 == null || !file2.exists()) {
                                file2 = bi.r9.w(UserConfig.selectedAccount, "jpg");
                                try {
                                    Bitmap bitmap = this.audioInfo.o;
                                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                    fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        try {
                                            bitmap.compress(compressFormat, 80, fileOutputStream);
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                            FileLog.e(e);
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e10) {
                                                    FileLog.e(e10);
                                                }
                                            }
                                            file2 = null;
                                            this.audioInfo.q = file2;
                                            if (file2 != null) {
                                                e3Var = (m.e3) of.b.d0().b;
                                                dVar = (of.d) e3Var.b;
                                                if (dVar != null) {
                                                }
                                                str = "/file" + Utilities.fastRandom.nextLong();
                                                if (((of.d) e3Var.b) == null) {
                                                }
                                                ((of.d) e3Var.b).l(file2, str);
                                                lVar.a.add(new m6.a(Uri.parse(of.d.j(of.d.i(), str)), 0, 0));
                                            }
                                            of.e eVar = new of.e(parse, mimeType, "/player_" + this.playingMessageObject.getId());
                                            eVar.e = musicTitle;
                                            eVar.f = musicAuthor;
                                            eVar.h = lVar;
                                            return new of.g(new of.f(eVar));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream2 = fileOutputStream;
                                        if (fileOutputStream2 != null) {
                                            try {
                                                fileOutputStream2.close();
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    fileOutputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (fileOutputStream2 != null) {
                                    }
                                    throw th;
                                }
                                this.audioInfo.q = file2;
                            }
                            if (file2 != null && file2.exists()) {
                                e3Var = (m.e3) of.b.d0().b;
                                dVar = (of.d) e3Var.b;
                                if (dVar != null) {
                                    Pair pair = dVar.i;
                                    if ((pair == null ? null : (File) pair.second) != null) {
                                        if (TextUtils.equals((pair == null ? null : (File) pair.second).getAbsolutePath(), file2.getAbsolutePath())) {
                                            Pair pair2 = ((of.d) e3Var.b).i;
                                            if (pair2 != null) {
                                                str = (String) pair2.first;
                                            }
                                            lVar.a.add(new m6.a(Uri.parse(of.d.j(of.d.i(), str)), 0, 0));
                                        }
                                    }
                                }
                                str = "/file" + Utilities.fastRandom.nextLong();
                                if (((of.d) e3Var.b) == null) {
                                    e3Var.b = new of.d();
                                }
                                ((of.d) e3Var.b).l(file2, str);
                                lVar.a.add(new m6.a(Uri.parse(of.d.j(of.d.i(), str)), 0, 0));
                            }
                        }
                    }
                    of.e eVar2 = new of.e(parse, mimeType, "/player_" + this.playingMessageObject.getId());
                    eVar2.e = musicTitle;
                    eVar2.f = musicAuthor;
                    eVar2.h = lVar;
                    return new of.g(new of.f(eVar2));
                }
            }
            t71 t71Var = this.videoPlayer;
            if (t71Var != null) {
                return t71Var.l(a4.a.r(new StringBuilder(), document != null ? document.id : this.playingMessageObject.getId(), ""), musicTitle, musicAuthor);
            }
            t71 t71Var2 = this.audioPlayer;
            if (t71Var2 != null) {
                return t71Var2.l(a4.a.r(new StringBuilder(), document != null ? document.id : this.playingMessageObject.getId(), ""), musicTitle, musicAuthor);
            }
        }
        return null;
    }

    public VideoConvertMessage getCurrentForegroundConverMessage() {
        return this.currentForegroundConvertingVideo;
    }

    public long getCurrentPosition() {
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject == null) {
            return -1L;
        }
        return getProgressMs(messageObject);
    }

    public long getDuration() {
        t71 t71Var = this.audioPlayer;
        if (t71Var == null) {
            return 0L;
        }
        return t71Var.p();
    }

    public float getFastPlaybackSpeed(boolean z10) {
        return z10 ? this.fastMusicPlaybackSpeed : this.fastPlaybackSpeed;
    }

    public MessagesController.SavedMusicList getMusicList() {
        return this.currentSavedMusicList;
    }

    public float getPlaybackSpeed(boolean z10) {
        return z10 ? this.currentMusicPlaybackSpeed : this.currentPlaybackSpeed;
    }

    public MessageObject getPlayingMessageObject() {
        return this.playingMessageObject;
    }

    public int getPlayingMessageObjectNum() {
        return this.currentPlaylistNum;
    }

    public ArrayList<MessageObject> getPlaylist() {
        return this.playlist;
    }

    public long getProgressMs(MessageObject messageObject) {
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                t71 t71Var = this.audioPlayer;
                if (t71Var != null) {
                    return t71Var.n();
                }
                t71 t71Var2 = this.videoPlayer;
                if (t71Var2 != null) {
                    return t71Var2.n();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public t71 getVideoPlayer() {
        return this.videoPlayer;
    }

    public native byte[] getWaveform2(short[] sArr, int i10);

    public boolean hasNoNextVoiceOrRoundVideoMessage() {
        ArrayList<MessageObject> arrayList;
        MessageObject messageObject = this.playingMessageObject;
        return messageObject == null || !(messageObject.isVoice() || this.playingMessageObject.isRoundVideo()) || (arrayList = this.voiceMessagesPlaylist) == null || arrayList.size() <= 1 || !this.voiceMessagesPlaylist.contains(this.playingMessageObject) || this.voiceMessagesPlaylist.indexOf(this.playingMessageObject) >= this.voiceMessagesPlaylist.size() - 1;
    }

    public void injectVideoPlayer(t71 t71Var, MessageObject messageObject) {
        if (t71Var == null || messageObject == null) {
            return;
        }
        FileLoader.getInstance(messageObject.currentAccount).setLoadingVideoForPlayer(messageObject.getDocument(), true);
        this.playerWasReady = false;
        clearPlaylist();
        this.videoPlayer = t71Var;
        this.playingMessageObject = messageObject;
        int i10 = this.playerNum + 1;
        this.playerNum = i10;
        t71Var.J = new 7(i10, messageObject, null, true);
        this.currentAspectRatioFrameLayoutReady = false;
        TextureView textureView = this.currentTextureView;
        if (textureView != null) {
            this.videoPlayer.V(textureView);
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
        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidStart, messageObject, messageObject2);
    }

    public boolean isBuffering() {
        t71 t71Var = this.audioPlayer;
        return (t71Var == null || t71Var.d == null || t71Var.L != 2) ? false : true;
    }

    public boolean isCurrentPlayer(t71 t71Var) {
        return this.videoPlayer == t71Var || this.audioPlayer == t71Var;
    }

    public boolean isDownloadingCurrentMessage() {
        return this.downloadingCurrentMessage;
    }

    public boolean isGoingToShowMessageObject(MessageObject messageObject) {
        return this.goingToShowMessageObject == messageObject;
    }

    public boolean isMessagePaused() {
        return this.isPaused || this.downloadingCurrentMessage;
    }

    public boolean isPiPShown() {
        return this.pipRoundVideoView != null;
    }

    public boolean isPlayingMessage(MessageObject messageObject) {
        MessageObject messageObject2;
        boolean z10;
        if (messageObject != null && messageObject.isRepostPreview) {
            return false;
        }
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && (messageObject2 = this.playingMessageObject) != null) {
            long j3 = messageObject2.eventId;
            if (j3 != 0 && j3 == messageObject.eventId) {
                z10 = this.downloadingCurrentMessage;
            } else if (isSamePlayingMessage(messageObject)) {
                z10 = this.downloadingCurrentMessage;
            }
            return !z10;
        }
        return false;
    }

    public boolean isPlayingMessageAndReadyToDraw(MessageObject messageObject) {
        return this.isDrawingWasReady && isPlayingMessage(messageObject);
    }

    public boolean isRecordingAudio() {
        return (this.recordStartRunnable == null && this.recordingAudio == null) ? false : true;
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

    public boolean isRecordingPaused() {
        return this.audioRecorderPaused;
    }

    public boolean isStreamingCurrentAudio() {
        return this.isStreamingCurrentAudio;
    }

    public boolean isVideoDrawingReady() {
        org.telegram.ui.m4 m4Var = this.currentAspectRatioFrameLayout;
        return m4Var != null && m4Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadMoreMusic() {
        MessageObject messageObject;
        int i10;
        long j3;
        long j10;
        long j11;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
        MessagesController.SavedMusicList savedMusicList = this.currentSavedMusicList;
        if (savedMusicList != null) {
            savedMusicList.load();
            return;
        }
        if (this.loadingPlaylist || (messageObject = this.playingMessageObject) == null || messageObject.scheduled || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || (i10 = this.playlistClassGuid) == 0) {
            return;
        }
        PlaylistGlobalSearchParams playlistGlobalSearchParams = this.playlistGlobalSearchParams;
        if (playlistGlobalSearchParams == null) {
            boolean[] zArr = this.playlistEndReached;
            if (!zArr[0]) {
                this.loadingPlaylist = true;
                AccountInstance.getInstance(this.playingMessageObject.currentAccount).getMediaDataController().loadMedia(this.playingMessageObject.getDialogId(), 50, this.playlistMaxId[0], 0, 4, 0L, 1, this.playlistClassGuid, 0, null, null);
                return;
            } else {
                if (this.playlistMergeDialogId == 0 || zArr[1]) {
                    return;
                }
                this.loadingPlaylist = true;
                AccountInstance.getInstance(this.playingMessageObject.currentAccount).getMediaDataController().loadMedia(this.playlistMergeDialogId, 50, this.playlistMaxId[0], 0, 4, 0L, 1, this.playlistClassGuid, 0, null, null);
                return;
            }
        }
        if (playlistGlobalSearchParams.endReached || this.playlist.isEmpty()) {
            return;
        }
        int i11 = this.playlist.get(0).currentAccount;
        if (this.playlistGlobalSearchParams.dialogId != 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            PlaylistGlobalSearchParams playlistGlobalSearchParams2 = this.playlistGlobalSearchParams;
            tL_messages_search.q = playlistGlobalSearchParams2.query;
            tL_messages_search.limit = 20;
            fg.q0 q0Var = playlistGlobalSearchParams2.filter;
            tL_messages_search.filter = q0Var == null ? new TLRPC.TL_inputMessagesFilterEmpty() : q0Var.e;
            tL_messages_search.peer = AccountInstance.getInstance(i11).getMessagesController().getInputPeer(this.playlistGlobalSearchParams.dialogId);
            tL_messages_search.offset_id = ((MessageObject) hc.b.i(1, this.playlist)).getId();
            PlaylistGlobalSearchParams playlistGlobalSearchParams3 = this.playlistGlobalSearchParams;
            long j12 = playlistGlobalSearchParams3.minDate;
            if (j12 > 0) {
                tL_messages_search.min_date = (int) (j12 / 1000);
            }
            long j13 = playlistGlobalSearchParams3.maxDate;
            tL_messages_searchGlobal = tL_messages_search;
            if (j13 > 0) {
                tL_messages_search.min_date = (int) (j13 / 1000);
                tL_messages_searchGlobal = tL_messages_search;
            }
        } else {
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal2.limit = 20;
            PlaylistGlobalSearchParams playlistGlobalSearchParams4 = this.playlistGlobalSearchParams;
            tL_messages_searchGlobal2.q = playlistGlobalSearchParams4.query;
            tL_messages_searchGlobal2.filter = playlistGlobalSearchParams4.filter.e;
            MessageObject messageObject2 = (MessageObject) hc.b.i(1, this.playlist);
            tL_messages_searchGlobal2.offset_id = messageObject2.getId();
            PlaylistGlobalSearchParams playlistGlobalSearchParams5 = this.playlistGlobalSearchParams;
            tL_messages_searchGlobal2.offset_rate = playlistGlobalSearchParams5.nextSearchRate;
            tL_messages_searchGlobal2.flags |= 1;
            tL_messages_searchGlobal2.folder_id = playlistGlobalSearchParams5.folderId;
            TLRPC.Peer peer = messageObject2.messageOwner.peer_id;
            long j14 = peer.channel_id;
            if (j14 == 0) {
                j14 = peer.chat_id;
                if (j14 == 0) {
                    j3 = peer.user_id;
                    tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i11).getInputPeer(j3);
                    PlaylistGlobalSearchParams playlistGlobalSearchParams6 = this.playlistGlobalSearchParams;
                    j10 = playlistGlobalSearchParams6.minDate;
                    if (j10 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j10 / 1000);
                    }
                    j11 = playlistGlobalSearchParams6.maxDate;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    if (j11 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j11 / 1000);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
            }
            j3 = -j14;
            tL_messages_searchGlobal2.offset_peer = MessagesController.getInstance(i11).getInputPeer(j3);
            PlaylistGlobalSearchParams playlistGlobalSearchParams62 = this.playlistGlobalSearchParams;
            j10 = playlistGlobalSearchParams62.minDate;
            if (j10 > 0) {
            }
            j11 = playlistGlobalSearchParams62.maxDate;
            tL_messages_searchGlobal = tL_messages_searchGlobal2;
            if (j11 > 0) {
            }
        }
        this.loadingPlaylist = true;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new i6(this, i10, i11, 0));
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new f6(this, i10, 0));
    }

    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j3;
        char c10;
        ?? r18;
        boolean z10;
        int i10;
        MessageObject messageObject;
        if (this.sensorsStarted && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f7 = this.lastProximityValue;
                float f10 = sensorEvent.values[0];
                if (f7 != f10) {
                    this.proximityHasDifferentValues = true;
                }
                this.lastProximityValue = f10;
                if (this.proximityHasDifferentValues) {
                    this.proximityTouched = isNearToSensor(f10);
                }
                j3 = 0;
                c10 = 2;
                r18 = 1;
            } else {
                Sensor sensor = sensorEvent.sensor;
                if (sensor == this.accelerometerSensor) {
                    double d = this.lastTimestamp == 0 ? 0.9800000190734863d : 1.0d / (((sensorEvent.timestamp - r2) / 1.0E9d) + 1.0d);
                    this.lastTimestamp = sensorEvent.timestamp;
                    float[] fArr = this.gravity;
                    double d10 = 1.0d - d;
                    float[] fArr2 = sensorEvent.values;
                    j3 = 0;
                    float f11 = (float) ((fArr2[0] * d10) + (fArr[0] * d));
                    fArr[0] = f11;
                    c10 = 2;
                    r18 = 1;
                    float f12 = (float) ((fArr2[1] * d10) + (fArr[1] * d));
                    fArr[1] = f12;
                    float f13 = (float) ((d10 * fArr2[2]) + (d * fArr[2]));
                    fArr[2] = f13;
                    float[] fArr3 = this.gravityFast;
                    fArr3[0] = (fArr2[0] * 0.19999999f) + (f11 * 0.8f);
                    fArr3[1] = (fArr2[1] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[2] = (fArr2[2] * 0.19999999f) + (f13 * 0.8f);
                    float[] fArr4 = this.linearAcceleration;
                    fArr4[0] = fArr2[0] - fArr[0];
                    fArr4[1] = fArr2[1] - fArr[1];
                    fArr4[2] = fArr2[2] - fArr[2];
                } else {
                    j3 = 0;
                    c10 = 2;
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
                        float f14 = fArr9[0];
                        fArr8[0] = f14;
                        fArr7[0] = f14;
                        float f15 = fArr9[1];
                        fArr8[1] = f15;
                        fArr7[1] = f15;
                        float f16 = fArr9[2];
                        fArr8[2] = f16;
                        fArr7[2] = f16;
                    }
                }
            }
            Sensor sensor2 = sensorEvent.sensor;
            if (sensor2 == this.linearSensor || sensor2 == this.gravitySensor || sensor2 == this.accelerometerSensor) {
                float[] fArr10 = this.gravity;
                float f17 = fArr10[0];
                float[] fArr11 = this.linearAcceleration;
                float f18 = (fArr10[c10] * fArr11[c10]) + (fArr10[r18] * fArr11[r18]) + (f17 * fArr11[0]);
                int i11 = this.raisedToBack;
                if (i11 != 6 && ((f18 > 0.0f && this.previousAccValue > 0.0f) || (f18 < 0.0f && this.previousAccValue < 0.0f))) {
                    if (f18 > 0.0f) {
                        z10 = f18 > 15.0f;
                        i10 = 1;
                    } else {
                        z10 = f18 < -15.0f;
                        i10 = 2;
                    }
                    int i12 = this.raisedToTopSign;
                    if (i12 != 0 && i12 != i10) {
                        int i13 = this.raisedToTop;
                        if (i13 != 6 || !z10) {
                            if (!z10) {
                                this.countLess++;
                            }
                            if (this.countLess == 10 || i13 != 6 || i11 != 0) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.raisedToBack = 0;
                                this.countLess = 0;
                            }
                        } else if (i11 < 6) {
                            int i14 = i11 + 1;
                            this.raisedToBack = i14;
                            if (i14 == 6) {
                                this.raisedToTop = 0;
                                this.raisedToTopSign = 0;
                                this.countLess = 0;
                                this.timeSinceRaise = System.currentTimeMillis();
                                if (BuildVars.LOGS_ENABLED && BuildVars.DEBUG_PRIVATE_VERSION) {
                                    FileLog.d("motion detected");
                                }
                            }
                        }
                    } else if (z10 && i11 == 0 && (i12 == 0 || i12 == i10)) {
                        int i15 = this.raisedToTop;
                        if (i15 < 6 && !this.proximityTouched) {
                            this.raisedToTopSign = i10;
                            int i16 = i15 + 1;
                            this.raisedToTop = i16;
                            if (i16 == 6) {
                                this.countLess = 0;
                            }
                        }
                    } else {
                        if (!z10) {
                            this.countLess++;
                        }
                        if (i12 != i10 || this.countLess == 10 || this.raisedToTop != 6 || i11 != 0) {
                            this.raisedToBack = 0;
                            this.raisedToTop = 0;
                            this.raisedToTopSign = 0;
                            this.countLess = 0;
                        }
                    }
                }
                this.previousAccValue = f18;
                float[] fArr12 = this.gravityFast;
                this.accelerometerVertical = fArr12[r18] > 2.5f && Math.abs(fArr12[c10]) < 4.0f && Math.abs(this.gravityFast[0]) > 1.5f;
            }
            if (this.raisedToBack == 6 || this.accelerometerVertical) {
                this.lastAccelerometerDetected = System.currentTimeMillis();
            }
            boolean z11 = !this.manualRecording && this.playingMessageObject == null && SharedConfig.enabledRaiseTo(r18) && ApplicationLoader.isScreenOn && !this.inputFieldHasText && this.allowStartRecord && this.raiseChat != null && !this.callInProgress;
            boolean z12 = SharedConfig.enabledRaiseTo(false) && (messageObject = this.playingMessageObject) != null && (messageObject.isVoice() || this.playingMessageObject.isRoundVideo());
            boolean z13 = this.proximityTouched;
            boolean z14 = this.raisedToBack == 6 || this.accelerometerVertical || System.currentTimeMillis() - this.lastAccelerometerDetected < 60;
            boolean z15 = this.useFrontSpeaker || this.raiseToEarRecord;
            boolean z16 = (z14 || z15) && !forbidRaiseToListen() && !VoIPService.isAnyKindOfCallActive() && (z11 || z12) && !PhotoViewer.t1().Q1();
            PowerManager.WakeLock wakeLock = this.proximityWakeLock;
            if (wakeLock != null) {
                boolean isHeld = wakeLock.isHeld();
                if (isHeld && !z16) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock releasing (proximityDetected=" + z13 + ", accelerometerDetected=" + z14 + ", alreadyPlaying=" + z15 + ")");
                    }
                    this.proximityWakeLock.release();
                } else if (!isHeld && z16) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("wake lock acquiring (proximityDetected=" + z13 + ", accelerometerDetected=" + z14 + ", alreadyPlaying=" + z15 + ")");
                    }
                    this.proximityWakeLock.acquire();
                }
            }
            boolean z17 = this.proximityTouched;
            if (z17 && z16) {
                if (z11 && this.recordStartRunnable == null) {
                    if (!this.raiseToEarRecord) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("start record");
                        }
                        this.useFrontSpeaker = true;
                        if (this.recordingAudio != null || !this.raiseChat.sa()) {
                            this.raiseToEarRecord = true;
                            this.useFrontSpeaker = false;
                            raiseToSpeakUpdated(true);
                        }
                        if (this.useFrontSpeaker) {
                            setUseFrontSpeaker(true);
                        }
                    }
                } else if (z12 && !this.useFrontSpeaker) {
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
            } else if (z17 && ((this.accelerometerSensor == null || this.linearSensor == null) && this.gravitySensor == null && !VoIPService.isAnyKindOfCallActive())) {
                if (this.playingMessageObject != null && !ApplicationLoader.mainInterfacePaused && z12 && !this.useFrontSpeaker && !this.manualRecording && !forbidRaiseToListen()) {
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
            if (this.timeSinceRaise == j3 || this.raisedToBack != 6 || Math.abs(System.currentTimeMillis() - this.timeSinceRaise) <= 1000) {
                return;
            }
            this.raisedToBack = 0;
            this.raisedToTop = 0;
            this.raisedToTopSign = 0;
            this.countLess = 0;
            this.timeSinceRaise = j3;
        }
    }

    public void pauseByRewind() {
        t71 t71Var = this.audioPlayer;
        if (t71Var != null) {
            t71Var.B();
        }
    }

    /* renamed from: pauseMessage, reason: merged with bridge method [inline-methods] */
    public boolean lambda$startAudioAgain$7(MessageObject messageObject) {
        return pauseMessage(messageObject, true);
    }

    public void playEmojiSound(AccountInstance accountInstance, String str, MessagesController.EmojiSound emojiSound, boolean z10) {
        if (emojiSound == null) {
            return;
        }
        Utilities.stageQueue.postRunnable(new dk(this, emojiSound, accountInstance, z10));
    }

    public boolean playMessage(MessageObject messageObject) {
        return playMessage(messageObject, false);
    }

    public void playMessageAtIndex(int i10) {
        int i11 = this.currentPlaylistNum;
        if (i11 < 0 || i11 >= this.playlist.size()) {
            return;
        }
        this.currentPlaylistNum = i10;
        this.playMusicAgain = true;
        MessageObject messageObject = this.playlist.get(i10);
        if (this.playingMessageObject != null && !isSamePlayingMessage(messageObject)) {
            this.playingMessageObject.resetPlayingProgress();
        }
        playMessage(messageObject);
    }

    public void playNextMessage() {
        playNextMessageWithoutOrder(false);
    }

    public void playPreviousMessage() {
        int i10;
        ArrayList<MessageObject> arrayList = SharedConfig.shuffleMusic ? this.shuffledPlaylist : this.playlist;
        if (arrayList.isEmpty() || (i10 = this.currentPlaylistNum) < 0 || i10 >= arrayList.size()) {
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

    public void prepareResumedRecording(int i10, MediaDataController.DraftVoice draftVoice, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, int i11, SendMessageChatArguments sendMessageChatArguments, long j10, MessageSuggestionParams messageSuggestionParams) {
        this.manualRecording = false;
        requestRecordAudioFocus(true);
        this.recordQueue.cancelRunnable(this.recordStartRunnable);
        this.recordQueue.postRunnable(new o6(this, i11, draftVoice, i10, j3, j10, messageSuggestionParams, messageObject2, messageObject, storyItem));
    }

    public void requestRecordAudioFocus(boolean z10) {
        if (!z10) {
            if (this.hasRecordAudioFocus) {
                NotificationsController.audioManager.abandonAudioFocus(this.audioRecordFocusChangedListener);
                this.hasRecordAudioFocus = false;
                return;
            }
            return;
        }
        if (!this.hasRecordAudioFocus && SharedConfig.pauseMusicOnRecord && NotificationsController.audioManager.requestAudioFocus(this.audioRecordFocusChangedListener, 3, 2) == 1) {
            this.hasRecordAudioFocus = true;
        }
    }

    public void resetGoingToShowMessageObject() {
        this.goingToShowMessageObject = null;
    }

    public void resumeByRewind() {
        MessageObject messageObject;
        t71 t71Var = this.audioPlayer;
        if (t71Var == null || (messageObject = this.playingMessageObject) == null || this.isPaused) {
            return;
        }
        if (t71Var.d == null || t71Var.L != 2) {
            t71Var.C();
        } else {
            cleanupPlayer(false, false);
            playMessage(messageObject);
        }
    }

    public void scheduleVideoConvert(MessageObject messageObject) {
        scheduleVideoConvert(messageObject, false, true, false);
    }

    public boolean seekToProgress(MessageObject messageObject, float f7) {
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                t71 t71Var = this.audioPlayer;
                if (t71Var != null) {
                    long p5 = t71Var.p();
                    if (p5 == -9223372036854775807L) {
                        this.seekToProgressPending = f7;
                    } else {
                        messageObject2.audioProgress = f7;
                        long j3 = (int) (p5 * f7);
                        this.audioPlayer.K(j3);
                        this.lastProgress = j3;
                        if (!this.ignorePlayerUpdate) {
                            b5.d.v(j3);
                        }
                    }
                } else {
                    t71 t71Var2 = this.videoPlayer;
                    if (t71Var2 != null) {
                        t71Var2.K((long) (t71Var2.p() * f7));
                        if (!this.ignorePlayerUpdate) {
                            b5.d.v((long) (this.videoPlayer.p() * f7));
                        }
                    }
                }
                NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidSeek, Integer.valueOf(messageObject2.getId()), Float.valueOf(f7));
                return true;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    public boolean seekToProgressMs(MessageObject messageObject, long j3) {
        long j10;
        MessageObject messageObject2 = this.playingMessageObject;
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && messageObject2 != null && isSamePlayingMessage(messageObject)) {
            try {
                t71 t71Var = this.audioPlayer;
                if (t71Var != null) {
                    j10 = t71Var.p();
                    if (j10 != -9223372036854775807L) {
                        messageObject2.audioProgress = Utilities.clamp01(j3 / j10);
                    }
                    this.audioPlayer.K(j3);
                    this.lastProgress = j3;
                    if (!this.ignorePlayerUpdate) {
                        b5.d.v(j3);
                    }
                } else {
                    t71 t71Var2 = this.videoPlayer;
                    if (t71Var2 != null) {
                        j10 = t71Var2.p();
                        this.videoPlayer.K(j3);
                        if (!this.ignorePlayerUpdate) {
                            b5.d.v(j3);
                        }
                    } else {
                        j10 = 1;
                    }
                }
                if (j10 != 0) {
                    NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidSeek, Integer.valueOf(messageObject2.getId()), Float.valueOf(Utilities.clamp01(j3 / j10)));
                }
                return true;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    public void setAllowStartRecord(boolean z10) {
        this.allowStartRecord = z10;
    }

    public void setBaseActivity(Activity activity, boolean z10) {
        if (z10) {
            this.baseActivity = activity;
        } else if (this.baseActivity == activity) {
            this.baseActivity = null;
        }
    }

    public void setCurrentVideoVisible(boolean z10) {
        org.telegram.ui.m4 m4Var = this.currentAspectRatioFrameLayout;
        if (m4Var == null) {
            return;
        }
        if (z10) {
            PipRoundVideoView pipRoundVideoView = this.pipRoundVideoView;
            if (pipRoundVideoView != null) {
                this.pipSwitchingState = 2;
                pipRoundVideoView.a(true);
                this.pipRoundVideoView = null;
                return;
            } else {
                if (m4Var.getParent() == null) {
                    this.currentTextureViewContainer.addView(this.currentAspectRatioFrameLayout);
                }
                this.videoPlayer.V(this.currentTextureView);
                return;
            }
        }
        if (m4Var.getParent() != null) {
            this.pipSwitchingState = 1;
            this.currentTextureViewContainer.removeView(this.currentAspectRatioFrameLayout);
            return;
        }
        if (this.pipRoundVideoView == null) {
            try {
                PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                this.pipRoundVideoView = pipRoundVideoView2;
                pipRoundVideoView2.d(this.baseActivity, new b6(this, 10));
            } catch (Exception unused) {
                this.pipRoundVideoView = null;
            }
        }
        PipRoundVideoView pipRoundVideoView3 = this.pipRoundVideoView;
        if (pipRoundVideoView3 != null) {
            this.videoPlayer.V(pipRoundVideoView3.c);
        }
    }

    public void setFeedbackView(View view, boolean z10) {
        if (z10) {
            this.feedbackView = view;
        } else if (this.feedbackView == view) {
            this.feedbackView = null;
        }
    }

    public void setInputFieldHasText(boolean z10) {
        this.inputFieldHasText = z10;
    }

    public void setLastVisibleMessageIds(int i10, long j3, long j10, TLRPC.User user, TLRPC.EncryptedChat encryptedChat, ArrayList<Long> arrayList, int i11) {
        this.lastChatEnterTime = j3;
        this.lastChatLeaveTime = j10;
        this.lastChatAccount = i10;
        this.lastSecretChat = encryptedChat;
        this.lastUser = user;
        this.lastMessageId = i11;
        this.lastChatVisibleMessages = arrayList;
    }

    public void setPlaybackOrderType(int i10) {
        boolean z10 = SharedConfig.shuffleMusic;
        SharedConfig.setPlaybackOrderType(i10);
        boolean z11 = SharedConfig.shuffleMusic;
        if (z10 != z11) {
            if (z11) {
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

    public void setPlaybackSpeed(boolean z10, float f7) {
        if (z10) {
            if (this.currentMusicPlaybackSpeed >= 6.0f && f7 == VOLUME_NORMAL && this.playingMessageObject != null) {
                this.audioPlayer.B();
                MessageObject messageObject = this.playingMessageObject;
                AndroidUtilities.runOnUIThread(new g6(this, messageObject, messageObject.audioProgress, 0), 50L);
            }
            this.currentMusicPlaybackSpeed = f7;
            if (Math.abs(f7 - VOLUME_NORMAL) > 0.001f) {
                this.fastMusicPlaybackSpeed = f7;
            }
        } else {
            this.currentPlaybackSpeed = f7;
            if (Math.abs(f7 - VOLUME_NORMAL) > 0.001f) {
                this.fastPlaybackSpeed = f7;
            }
        }
        t71 t71Var = this.audioPlayer;
        if (t71Var != null) {
            t71Var.Q(Math.round(f7 * 10.0f) / 10.0f);
        } else {
            t71 t71Var2 = this.videoPlayer;
            if (t71Var2 != null) {
                t71Var2.Q(Math.round(f7 * 10.0f) / 10.0f);
            }
        }
        MessagesController.getGlobalMainSettings().edit().putFloat(z10 ? "musicPlaybackSpeed" : "playbackSpeed", f7).putFloat(z10 ? "fastMusicPlaybackSpeed" : "fastPlaybackSpeed", z10 ? this.fastMusicPlaybackSpeed : this.fastPlaybackSpeed).commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingSpeedChanged, new Object[0]);
        if (this.ignorePlayerUpdate) {
            return;
        }
        b5.d.z(f7);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j3, PlaylistGlobalSearchParams playlistGlobalSearchParams) {
        return setPlaylist(arrayList, messageObject, j3, true, playlistGlobalSearchParams);
    }

    public void setReplyingMessage(MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem) {
        this.recordReplyingMsg = messageObject;
        this.recordReplyingTopMsg = messageObject2;
        this.recordReplyingStory = storyItem;
    }

    public void setTextureView(TextureView textureView, org.telegram.ui.m4 m4Var, FrameLayout frameLayout, boolean z10) {
        setTextureView(textureView, m4Var, frameLayout, z10, null);
    }

    public void setVoiceMessagesPlaylist(ArrayList<MessageObject> arrayList, boolean z10) {
        ArrayList<MessageObject> arrayList2 = arrayList != null ? new ArrayList<>(arrayList) : null;
        this.voiceMessagesPlaylist = arrayList2;
        if (arrayList2 != null) {
            this.voiceMessagesPlaylistUnread = z10;
            this.voiceMessagesPlaylistMap = new SparseArray<>();
            for (int i10 = 0; i10 < this.voiceMessagesPlaylist.size(); i10++) {
                MessageObject messageObject = this.voiceMessagesPlaylist.get(i10);
                this.voiceMessagesPlaylistMap.put(messageObject.getId(), messageObject);
            }
        }
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public void startRaiseToEarSensors(eo eoVar) {
        if (eoVar != null) {
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
            this.raiseChat = eoVar;
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
            Utilities.globalQueue.postRunnable(new b6(this, 0));
            this.sensorsStarted = true;
        }
    }

    public void startRecording(int i10, long j3, MessageObject messageObject, MessageObject messageObject2, TL_stories.StoryItem storyItem, int i11, boolean z10, SendMessageChatArguments sendMessageChatArguments, long j10, MessageSuggestionParams messageSuggestionParams) {
        MessageObject messageObject3 = this.playingMessageObject;
        boolean z11 = (messageObject3 == null || !isPlayingMessage(messageObject3) || isMessagePaused()) ? false : true;
        this.manualRecording = z10;
        requestRecordAudioFocus(true);
        try {
            this.feedbackView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        DispatchQueue dispatchQueue = this.recordQueue;
        o6 o6Var = new o6(this, i10, i11, j3, j10, messageSuggestionParams, messageObject2, messageObject, storyItem, sendMessageChatArguments);
        this.recordStartRunnable = o6Var;
        dispatchQueue.postRunnable(o6Var, z11 ? 500L : 50L);
    }

    public void startRecordingIfFromSpeaker() {
        if (this.useFrontSpeaker && this.raiseChat != null && this.allowStartRecord && SharedConfig.enabledRaiseTo(true)) {
            this.raiseToEarRecord = true;
            int currentAccount = this.raiseChat.getCurrentAccount();
            long a2 = this.raiseChat.a();
            eo eoVar = this.raiseChat;
            MessageObject messageObject = eoVar.X3;
            int classGuid = eoVar.getClassGuid();
            eo eoVar2 = this.raiseChat;
            SendMessageChatArguments C8 = eoVar2 != null ? eoVar2.C8() : null;
            eo eoVar3 = this.raiseChat;
            long N8 = eoVar3 != null ? eoVar3.N8() : 0L;
            eo eoVar4 = this.raiseChat;
            startRecording(currentAccount, a2, null, messageObject, null, classGuid, false, C8, N8, eoVar4 != null ? eoVar4.g5 : null);
            this.ignoreOnPause = true;
        }
    }

    public void stopMediaObserver() {
        if (this.stopMediaObserverRunnable == null) {
            this.stopMediaObserverRunnable = new StopMediaObserverRunnable();
        }
        this.stopMediaObserverRunnable.currentObserverToken = this.startObserverToken;
        ApplicationLoader.applicationHandler.postDelayed(this.stopMediaObserverRunnable, 5000L);
    }

    public void stopRaiseToEarSensors(eo eoVar, boolean z10, boolean z11) {
        MediaController mediaController;
        if (this.ignoreOnPause) {
            this.ignoreOnPause = false;
            return;
        }
        if (z11) {
            if (this.recordingAudio == null || isRecordingPaused()) {
                mediaController = this;
                mediaController.stopRecording(z10 ? 2 : 0, false, 0, false, 0L);
                if (mediaController.sensorsStarted || mediaController.ignoreOnPause) {
                }
                if ((mediaController.accelerometerSensor == null && (mediaController.gravitySensor == null || mediaController.linearAcceleration == null)) || mediaController.proximitySensor == null || mediaController.raiseChat != eoVar) {
                    return;
                }
                mediaController.raiseChat = null;
                mediaController.sensorsStarted = false;
                mediaController.accelerometerVertical = false;
                mediaController.proximityTouched = false;
                mediaController.raiseToEarRecord = false;
                mediaController.useFrontSpeaker = false;
                Utilities.globalQueue.postRunnable(new b6(this, 5));
                PowerManager.WakeLock wakeLock = mediaController.proximityWakeLock;
                if (wakeLock == null || !wakeLock.isHeld()) {
                    return;
                }
                mediaController.proximityWakeLock.release();
                return;
            }
            toggleRecordingPause(false);
        }
        mediaController = this;
        if (mediaController.sensorsStarted) {
        }
    }

    public void stopRecording(final int i10, final boolean z10, final int i11, final boolean z11, final long j3) {
        Runnable runnable = this.recordStartRunnable;
        if (runnable != null) {
            this.recordQueue.cancelRunnable(runnable);
            this.recordStartRunnable = null;
        }
        this.recordQueue.postRunnable(new Runnable() { // from class: org.telegram.messenger.k6
            @Override // java.lang.Runnable
            public final void run() {
                MediaController.this.lambda$stopRecording$43(i10, z10, i11, z11, j3);
            }
        });
    }

    public void syncCastedPlayer() {
        AtomicInteger atomicInteger;
        c6.q e;
        if (this.playingMessageObject == null) {
            return;
        }
        this.ignorePlayerUpdate = true;
        if (b5.d.u() && ((atomicInteger = b5.d.b) == null || atomicInteger.get() <= 0)) {
            e6.h e7 = b5.d.e();
            long a2 = e7 == null ? -1L : e7.a();
            long progressMs = getProgressMs(this.playingMessageObject);
            if (progressMs >= 0 && a2 >= 0 && Math.abs(progressMs - a2) > 1000) {
                seekToProgressMs(this.playingMessageObject, a2);
            }
            e6.h e10 = b5.d.e();
            if (e10 == null ? false : b5.d.a == 0 ? !e10.l() : e10.m()) {
                playMessage(this.playingMessageObject);
            } else {
                lambda$startAudioAgain$7(this.playingMessageObject);
            }
            e6.h e11 = b5.d.e();
            float f7 = VOLUME_NORMAL;
            if (e11 != null && (e = e11.e()) != null) {
                f7 = (float) e.d;
            }
            setPlaybackSpeed(true, f7);
        }
        setPlayerVolume();
        this.ignorePlayerUpdate = false;
    }

    public void toggleRecordingPause(boolean z10) {
        this.recordQueue.postRunnable(new r6(this, z10, 1));
    }

    public void trimCurrentRecording(long j3, long j10, Runnable runnable) {
        if (this.recordingAudioFile == null) {
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        this.recordQueue.postRunnable(new x2(this, new File(FileLoader.getDirectory(1), System.currentTimeMillis() + "_" + FileLoader.getAttachFileName(this.recordingAudio)) { // from class: org.telegram.messenger.MediaController.15
            @Override // java.io.File
            public boolean delete() {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("delete voice file (trimmed)");
                }
                return super.delete();
            }
        }, j3, j10, runnable, 2));
    }

    public void tryResumePausedAudio() {
        MessageObject playingMessageObject = getPlayingMessageObject();
        if (playingMessageObject != null && isMessagePaused() && this.wasPlayingAudioBeforePause && (playingMessageObject.isVoice() || playingMessageObject.isMusic())) {
            playMessage(playingMessageObject);
        }
        this.wasPlayingAudioBeforePause = false;
    }

    public void updateSilent(boolean z10) {
        this.isSilent = z10;
        t71 t71Var = this.videoPlayer;
        if (t71Var != null) {
            t71Var.N(z10);
        }
        setPlayerVolume();
        checkVolumeBarUI();
        MessageObject messageObject = this.playingMessageObject;
        if (messageObject != null) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
            int i10 = NotificationCenter.messagePlayingPlayStateChanged;
            MessageObject messageObject2 = this.playingMessageObject;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, Integer.valueOf(messageObject2 != null ? messageObject2.getId() : 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x015e, code lost:
    
        r3 = r14.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0166, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0167, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String copyFileToCache(Uri uri, String str, long j3) {
        Throwable th2;
        File file;
        FileOutputStream fileOutputStream;
        Exception exc;
        InputStream inputStream;
        File file2;
        int i10;
        File file3;
        String absolutePath;
        InputStream inputStream2 = null;
        int i11 = 0;
        try {
            String fixFileName = FileLoader.fixFileName(getFileName(uri));
            if (fixFileName == null) {
                int lastLocalId = SharedConfig.getLastLocalId();
                SharedConfig.saveConfig();
                Locale locale = Locale.US;
                fixFileName = lastLocalId + "." + str;
            }
            file = AndroidUtilities.getSharingDirectory();
            try {
                file.mkdirs();
                if (AndroidUtilities.isInternalUri(Uri.fromFile(file))) {
                    if (j3 > 0 && 0 > j3) {
                        file.delete();
                    }
                    return null;
                }
                int i12 = 0;
                do {
                    File sharingDirectory = AndroidUtilities.getSharingDirectory();
                    if (i12 == 0) {
                        file3 = new File(sharingDirectory, fixFileName);
                    } else {
                        int lastIndexOf = fixFileName.lastIndexOf(".");
                        if (lastIndexOf > 0) {
                            file = new File(sharingDirectory, fixFileName.substring(0, lastIndexOf) + " (" + i12 + ")" + fixFileName.substring(lastIndexOf));
                            i12++;
                        } else {
                            file3 = new File(sharingDirectory, fixFileName + " (" + i12 + ")");
                        }
                    }
                    file = file3;
                    i12++;
                } while (file.exists());
                InputStream openInputStream = ApplicationLoader.applicationContext.getContentResolver().openInputStream(uri);
                try {
                    if (openInputStream instanceof FileInputStream) {
                        try {
                            if (AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(((FileInputStream) openInputStream).getFD(), null)).intValue())) {
                                try {
                                    openInputStream.close();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                if (j3 > 0 && 0 > j3) {
                                    file.delete();
                                }
                                return null;
                            }
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[20480];
                        i10 = 0;
                        while (true) {
                            try {
                                int read = openInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                i10 += read;
                                if (j3 > 0) {
                                    long j10 = i10;
                                    if (j10 > j3) {
                                        try {
                                            openInputStream.close();
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        if (j3 > 0 && j10 > j3) {
                                            file.delete();
                                        }
                                        return null;
                                    }
                                }
                            } catch (Exception e11) {
                                e = e11;
                                file2 = file;
                                inputStream = openInputStream;
                                exc = e;
                                try {
                                    FileLog.e(exc);
                                    if (inputStream != null) {
                                    }
                                    if (fileOutputStream != null) {
                                    }
                                    if (j3 > 0) {
                                    }
                                    return null;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    inputStream2 = inputStream;
                                    file = file2;
                                    i11 = i10;
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Exception e12) {
                                            FileLog.e(e12);
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Exception e13) {
                                            FileLog.e(e13);
                                        }
                                    }
                                    if (j3 <= 0) {
                                        throw th2;
                                    }
                                    if (i11 <= j3) {
                                        throw th2;
                                    }
                                    file.delete();
                                    throw th2;
                                }
                            } catch (Throwable th5) {
                                inputStream2 = openInputStream;
                                th2 = th5;
                                i11 = i10;
                                if (inputStream2 != null) {
                                }
                                if (fileOutputStream != null) {
                                }
                                if (j3 <= 0) {
                                }
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        file2 = file;
                        i10 = 0;
                        inputStream = openInputStream;
                        exc = e;
                        FileLog.e(exc);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e15) {
                                FileLog.e(e15);
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e16) {
                                FileLog.e(e16);
                            }
                        }
                        if (j3 > 0 && i10 > j3) {
                            file2.delete();
                        }
                        return null;
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream2 = openInputStream;
                        th2 = th;
                        if (inputStream2 != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        if (j3 <= 0) {
                        }
                    }
                } catch (Exception e17) {
                    e = e17;
                    file2 = file;
                    fileOutputStream = null;
                } catch (Throwable th7) {
                    th = th7;
                    fileOutputStream = null;
                }
                try {
                    fileOutputStream.close();
                } catch (Exception e18) {
                    FileLog.e(e18);
                }
                if (j3 > 0 && i10 > j3) {
                    file.delete();
                }
                return absolutePath;
                if (j3 > 0) {
                    file.delete();
                }
                return absolutePath;
            } catch (Exception e19) {
                exc = e19;
                file2 = file;
                inputStream = null;
                fileOutputStream = null;
                i10 = 0;
                FileLog.e(exc);
                if (inputStream != null) {
                }
                if (fileOutputStream != null) {
                }
                if (j3 > 0) {
                    file2.delete();
                }
                return null;
            } catch (Throwable th8) {
                th2 = th8;
                fileOutputStream = null;
            }
        } catch (Exception e20) {
            exc = e20;
            inputStream = null;
            file2 = null;
            fileOutputStream = null;
        } catch (Throwable th9) {
            th2 = th9;
            file = null;
            fileOutputStream = null;
        }
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

    public static void saveFile(String str, Context context, int i10, String str2, String str3, Utilities.Callback<Uri> callback) {
        saveFile(str, context, i10, str2, str3, callback, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void cleanupPlayer(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        PipRoundVideoView pipRoundVideoView;
        MessageObject messageObject;
        if (z11 && restoreMusicPlaylistState()) {
            return;
        }
        int i10 = 2;
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
            if (b5.d.u() || !this.audioPlayer.y() || (messageObject = this.playingMessageObject) == null || messageObject.isVoice()) {
                try {
                    this.audioPlayer.H();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                final t71 t71Var = this.audioPlayer;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.audioVolume, 0.0f);
                ofFloat.addUpdateListener(new ei(i10, this, t71Var));
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.messenger.MediaController.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        try {
                            t71Var.H();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                });
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
            this.audioPlayer = null;
            org.telegram.ui.ActionBar.j6.G1(this.playingMessageObject);
        } else {
            t71 t71Var2 = this.videoPlayer;
            if (t71Var2 != null) {
                this.currentAspectRatioFrameLayout = null;
                this.currentTextureViewContainer = null;
                this.currentAspectRatioFrameLayoutReady = false;
                this.isDrawingWasReady = false;
                this.currentTextureView = null;
                this.goingToShowMessageObject = null;
                if (z13) {
                    PhotoViewer.t1().S2 = this.videoPlayer;
                    MessageObject messageObject2 = this.playingMessageObject;
                    this.goingToShowMessageObject = messageObject2;
                    NotificationCenter.getInstance(messageObject2.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingGoingToStop, this.playingMessageObject, Boolean.TRUE);
                } else {
                    long n10 = t71Var2.n();
                    MessageObject messageObject3 = this.playingMessageObject;
                    if (messageObject3 != null && messageObject3.isVideo() && n10 > 0) {
                        MessageObject messageObject4 = this.playingMessageObject;
                        messageObject4.audioProgressMs = (int) n10;
                        NotificationCenter.getInstance(messageObject4.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingGoingToStop, this.playingMessageObject, Boolean.FALSE);
                    }
                    this.videoPlayer.H();
                    this.videoPlayer = null;
                }
                try {
                    this.baseActivity.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (this.playingMessageObject != null && !z13) {
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
            if (z10) {
                messageObject6.resetPlayingProgress();
                NotificationCenter.getInstance(messageObject6.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
            }
            this.playingMessageObject = null;
            this.downloadingCurrentMessage = false;
            if (z10) {
                NotificationsController.audioManager.abandonAudioFocus(this);
                this.hasAudioFocus = 0;
                ArrayList<MessageObject> arrayList = this.voiceMessagesPlaylist;
                int i11 = -1;
                if (arrayList != null) {
                    if (!z12 || (i11 = arrayList.indexOf(messageObject6)) < 0) {
                        this.voiceMessagesPlaylist = null;
                        this.voiceMessagesPlaylistMap = null;
                    } else {
                        this.voiceMessagesPlaylist.remove(i11);
                        this.voiceMessagesPlaylistMap.remove(messageObject6.getId());
                        if (this.voiceMessagesPlaylist.isEmpty()) {
                            this.voiceMessagesPlaylist = null;
                            this.voiceMessagesPlaylistMap = null;
                        }
                    }
                }
                ArrayList<MessageObject> arrayList2 = this.voiceMessagesPlaylist;
                if (arrayList2 == null || i11 >= arrayList2.size()) {
                    if ((messageObject6.isVoice() || messageObject6.isRoundVideo()) && messageObject6.getId() != 0) {
                        startRecordingIfFromSpeaker();
                    }
                    NotificationCenter.getInstance(messageObject6.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingDidReset, Integer.valueOf(messageObject6.getId()), Boolean.valueOf(z11));
                    this.pipSwitchingState = 0;
                    PipRoundVideoView pipRoundVideoView2 = this.pipRoundVideoView;
                    if (pipRoundVideoView2 != null) {
                        pipRoundVideoView2.a(true);
                        this.pipRoundVideoView = null;
                    }
                } else {
                    MessageObject messageObject7 = this.voiceMessagesPlaylist.get(i11);
                    playMessage(messageObject7);
                    if (!messageObject7.isRoundVideo() && (pipRoundVideoView = this.pipRoundVideoView) != null) {
                        pipRoundVideoView.a(true);
                        this.pipRoundVideoView = null;
                    }
                    z14 = true;
                    if (z11) {
                        ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
                    }
                }
            }
            z14 = false;
            if (z11) {
            }
        } else {
            z14 = false;
        }
        if (!z14 && z12 && !SharedConfig.enabledRaiseTo(true)) {
            eo eoVar = this.raiseChat;
            stopRaiseToEarSensors(eoVar, false, false);
            this.raiseChat = eoVar;
        }
        if (!z11 || b5.d.f() == null) {
            return;
        }
        try {
            d6.a c10 = d6.a.c(b5.d.f());
            if (c10 == null) {
                return;
            }
            c10.b().b(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public boolean pauseMessage(MessageObject messageObject, boolean z10) {
        if ((this.audioPlayer != null || this.videoPlayer != null) && messageObject != null && this.playingMessageObject != null && isSamePlayingMessage(messageObject)) {
            stopProgressTimer();
            try {
                if (this.audioPlayer == null) {
                    t71 t71Var = this.videoPlayer;
                    if (t71Var != null) {
                        t71Var.B();
                    }
                } else if (!z10 || b5.d.u() || this.playingMessageObject.isVoice() || this.playingMessageObject.getDuration() * (VOLUME_NORMAL - this.playingMessageObject.audioProgress) <= 1.0d || !LaunchActivity.E1) {
                    this.audioPlayer.B();
                } else {
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
                                MediaController.this.audioPlayer.B();
                            }
                        }
                    });
                    this.audioVolumeAnimator.start();
                }
                this.isPaused = true;
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                try {
                    b5.d.b(1);
                    if (!this.ignorePlayerUpdate) {
                        if (of.b.d0().i0()) {
                            of.b.d0().o0(getCurrentChromecastMedia());
                        }
                        b5.d.x(false);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                return true;
            } catch (Exception e7) {
                FileLog.e(e7);
                this.isPaused = false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:269:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x057e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x053f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [org.telegram.messenger.MessageObject, org.telegram.ui.Components.t71] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean playMessage(final MessageObject messageObject, boolean z10) {
        boolean z11;
        File file;
        boolean z12;
        float f7;
        final File pathToMessage;
        String str;
        String str2;
        boolean z13;
        PipRoundVideoView pipRoundVideoView;
        char c10;
        PowerManager.WakeLock wakeLock;
        ?? r52;
        File file2;
        MusicListenReporter musicListenReporter;
        if (messageObject != null) {
            this.isSilent = z10;
            checkVolumeBarUI();
            if (!(this.audioPlayer == null && this.videoPlayer == null) && isSamePlayingMessage(messageObject)) {
                if (this.isPaused) {
                    resumeAudio(messageObject);
                }
                if (SharedConfig.enabledRaiseTo(true)) {
                    return true;
                }
                startRaiseToEarSensors(this.raiseChat);
                return true;
            }
            if (!messageObject.isOut() && messageObject.isContentUnread()) {
                MessagesController.getInstance(messageObject.currentAccount).markMessageContentAsRead(messageObject);
            }
            boolean z14 = !this.playMusicAgain;
            MessageObject messageObject2 = this.playingMessageObject;
            if (messageObject2 != null) {
                boolean saveMusicPlaylistStateIfNeeded = ((messageObject2.isMusic() && messageObject.isVoice()) || messageObject.isRoundVideo() || messageObject.isVideo()) ? saveMusicPlaylistStateIfNeeded() : false;
                if (!this.playMusicAgain) {
                    this.playingMessageObject.resetPlayingProgress();
                    NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
                }
                z11 = saveMusicPlaylistStateIfNeeded;
                z14 = false;
            } else {
                z11 = false;
            }
            cleanupPlayer(z14, false);
            this.shouldSavePositionForCurrentAudio = null;
            this.lastSaveTime = 0L;
            this.playMusicAgain = false;
            this.seekToProgressPending = 0.0f;
            String str3 = messageObject.messageOwner.attachPath;
            if (str3 == null || str3.length() <= 0) {
                file = null;
                z12 = false;
            } else {
                File file3 = new File(messageObject.messageOwner.attachPath);
                z12 = file3.exists();
                file = !z12 ? null : file3;
            }
            if (file != null) {
                pathToMessage = file;
                f7 = 0.0f;
            } else {
                f7 = 0.0f;
                pathToMessage = FileLoader.getInstance(messageObject.currentAccount).getPathToMessage(messageObject.messageOwner);
            }
            boolean z15 = SharedConfig.streamMedia && !((!messageObject.isMusic() && !messageObject.isRoundVideo() && (!messageObject.isVideo() || !messageObject.canStreamVideo())) || messageObject.shouldEncryptPhotoOrVideo() || DialogObject.isEncryptedDialog(messageObject.getDialogId()));
            if (pathToMessage != file && !(z12 = pathToMessage.exists()) && !z15) {
                FileLoader.getInstance(messageObject.currentAccount).loadFile(messageObject.getDocument(), messageObject, 0, messageObject.shouldEncryptPhotoOrVideo() ? 2 : 0);
                this.downloadingCurrentMessage = true;
                this.isPaused = false;
                this.lastProgress = 0L;
                this.audioInfo = null;
                this.playingMessageObject = messageObject;
                if (canStartMusicPlayerService()) {
                    try {
                        ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                } else {
                    ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
                }
                NotificationCenter.getInstance(this.playingMessageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingPlayStateChanged, Integer.valueOf(this.playingMessageObject.getId()));
                return true;
            }
            boolean z16 = z12;
            this.downloadingCurrentMessage = false;
            if (messageObject.isMusic()) {
                checkIsNextMusicFileDownloaded(messageObject.currentAccount);
            } else {
                checkIsNextVoiceFileDownloaded(messageObject.currentAccount);
            }
            org.telegram.ui.m4 m4Var = this.currentAspectRatioFrameLayout;
            if (m4Var != null) {
                this.isDrawingWasReady = false;
                m4Var.setDrawingReady(false);
            }
            boolean isVideo = messageObject.isVideo();
            boolean z17 = z11;
            if (messageObject.isRoundVideo() || isVideo) {
                final File file4 = pathToMessage;
                FileLoader.getInstance(messageObject.currentAccount).setLoadingVideoForPlayer(messageObject.getDocument(), true);
                this.playerWasReady = false;
                if (isVideo) {
                    str = "other";
                    str2 = "&reference=";
                    if (messageObject.messageOwner.peer_id.channel_id != 0 || messageObject.audioProgress > 0.1f) {
                        z13 = false;
                        int[] iArr = (isVideo || messageObject.getDuration() > 30.0d) ? null : new int[]{1};
                        if (!z17) {
                            clearPlaylist();
                        }
                        t71 t71Var = new t71();
                        this.videoPlayer = t71Var;
                        String str4 = str2;
                        t71Var.N(z10);
                        int i10 = this.playerNum + 1;
                        this.playerNum = i10;
                        String str5 = str;
                        this.videoPlayer.J = new 9(i10, messageObject, iArr, z13);
                        this.currentAspectRatioFrameLayoutReady = false;
                        if (this.pipRoundVideoView == null || !MessagesController.getInstance(messageObject.currentAccount).isDialogVisible(messageObject.getDialogId(), messageObject.scheduled)) {
                            if (this.pipRoundVideoView == null) {
                                try {
                                    PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                                    this.pipRoundVideoView = pipRoundVideoView2;
                                    pipRoundVideoView2.d(this.baseActivity, new b6(this, 1));
                                } catch (Exception unused) {
                                    this.pipRoundVideoView = null;
                                }
                            }
                            pipRoundVideoView = this.pipRoundVideoView;
                            if (pipRoundVideoView != null) {
                                this.videoPlayer.V(pipRoundVideoView.c);
                            }
                        } else {
                            TextureView textureView = this.currentTextureView;
                            if (textureView != null) {
                                this.videoPlayer.V(textureView);
                            }
                        }
                        if (z16) {
                            try {
                                int fileReference = FileLoader.getInstance(messageObject.currentAccount).getFileReference(messageObject);
                                TLRPC.Document document = messageObject.getDocument();
                                StringBuilder sb2 = new StringBuilder("?account=");
                                sb2.append(messageObject.currentAccount);
                                sb2.append("&id=");
                                sb2.append(document.id);
                                sb2.append("&hash=");
                                sb2.append(document.access_hash);
                                sb2.append("&dc=");
                                sb2.append(document.dc_id);
                                sb2.append("&size=");
                                sb2.append(document.size);
                                sb2.append("&mime=");
                                sb2.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                                sb2.append("&rid=");
                                sb2.append(fileReference);
                                sb2.append("&name=");
                                sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
                                sb2.append(str4);
                                byte[] bArr = document.file_reference;
                                if (bArr == null) {
                                    bArr = new byte[0];
                                }
                                sb2.append(Utilities.bytesToHex(bArr));
                                this.videoPlayer.D(Uri.parse("tg://" + messageObject.getFileName() + sb2.toString()), str5);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else {
                            if (!messageObject.mediaExists && file4 != file) {
                                final int i11 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.h6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                MediaController.lambda$playMessage$21(messageObject, file4);
                                                break;
                                            default:
                                                MediaController.lambda$playMessage$22(messageObject, file4);
                                                break;
                                        }
                                    }
                                });
                            }
                            this.videoPlayer.D(Uri.fromFile(file4), str5);
                        }
                        if (messageObject.isRoundVideo()) {
                            this.videoPlayer.S(3);
                        } else {
                            this.videoPlayer.S(this.useFrontSpeaker ? 0 : 3);
                            if (Math.abs(this.currentPlaybackSpeed - VOLUME_NORMAL) > 0.001f) {
                                this.videoPlayer.Q(Math.round(this.currentPlaybackSpeed * 10.0f) / 10.0f);
                            }
                            float f10 = messageObject.forceSeekTo;
                            if (f10 >= f7) {
                                this.seekToProgressPending = f10;
                                messageObject.audioProgress = f10;
                                messageObject.forceSeekTo = -1.0f;
                            }
                        }
                    }
                } else {
                    str = "other";
                    str2 = "&reference=";
                }
                z13 = true;
                if (isVideo) {
                }
                if (!z17) {
                }
                t71 t71Var2 = new t71();
                this.videoPlayer = t71Var2;
                String str42 = str2;
                t71Var2.N(z10);
                int i102 = this.playerNum + 1;
                this.playerNum = i102;
                String str52 = str;
                this.videoPlayer.J = new 9(i102, messageObject, iArr, z13);
                this.currentAspectRatioFrameLayoutReady = false;
                if (this.pipRoundVideoView == null) {
                }
                if (this.pipRoundVideoView == null) {
                }
                pipRoundVideoView = this.pipRoundVideoView;
                if (pipRoundVideoView != null) {
                }
                if (z16) {
                }
                if (messageObject.isRoundVideo()) {
                }
            } else {
                PipRoundVideoView pipRoundVideoView3 = this.pipRoundVideoView;
                if (pipRoundVideoView3 != null) {
                    pipRoundVideoView3.a(true);
                    this.pipRoundVideoView = null;
                }
                try {
                    t71 t71Var3 = new t71();
                    this.audioPlayer = t71Var3;
                    final int i12 = this.playerNum + 1;
                    this.playerNum = i12;
                    t71Var3.J = new q71() { // from class: org.telegram.messenger.MediaController.10
                        @Override // org.telegram.ui.Components.q71
                        public void onRenderedFirstFrame() {
                        }

                        @Override // org.telegram.ui.Components.q71
                        public void onStateChanged(boolean z18, int i13) {
                            if (i12 != MediaController.this.playerNum) {
                                return;
                            }
                            if (i13 == 4 || ((i13 == 1 || i13 == 2) && z18 && messageObject.audioProgress >= 0.999f)) {
                                MessageObject messageObject3 = messageObject;
                                messageObject3.audioProgress = MediaController.VOLUME_NORMAL;
                                NotificationCenter.getInstance(messageObject3.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(messageObject.getId()), 0);
                                if (!MediaController.this.restoreMusicPlaylistState()) {
                                    if (MediaController.this.playlist.isEmpty() || (MediaController.this.playlist.size() <= 1 && messageObject.isVoice())) {
                                        MediaController mediaController = MediaController.this;
                                        mediaController.cleanupPlayer(true, mediaController.hasNoNextVoiceOrRoundVideoMessage(), messageObject.isVoice(), false);
                                    } else {
                                        MediaController.this.playNextMessageWithoutOrder(true);
                                    }
                                }
                            } else if (MediaController.this.audioPlayer != null && MediaController.this.seekToProgressPending != 0.0f && (i13 == 3 || i13 == 1)) {
                                long p5 = (int) (MediaController.this.seekToProgressPending * MediaController.this.audioPlayer.p());
                                MediaController.this.audioPlayer.K(p5);
                                MediaController.this.lastProgress = p5;
                                MediaController.this.seekToProgressPending = 0.0f;
                            }
                            if (MediaController.this.audioPlayer == null || !b5.d.u()) {
                                return;
                            }
                            MediaController.this.audioPlayer.O(true);
                        }

                        @Override // org.telegram.ui.Components.q71
                        public /* bridge */ /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
                            return false;
                        }

                        @Override // org.telegram.ui.Components.q71
                        public /* bridge */ /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
                        }

                        @Override // org.telegram.ui.Components.q71
                        public /* bridge */ /* synthetic */ void onSeekFinished(j2.a aVar) {
                        }

                        @Override // org.telegram.ui.Components.q71
                        public /* bridge */ /* synthetic */ void onSeekStarted(j2.a aVar) {
                        }

                        @Override // org.telegram.ui.Components.q71
                        public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                        }

                        @Override // org.telegram.ui.Components.q71
                        public void onError(t71 t71Var4, Exception exc) {
                        }

                        @Override // org.telegram.ui.Components.q71
                        public void onVideoSizeChanged(int i13, int i14, int i15, float f11) {
                        }
                    };
                    this.audioPlayer.K = new m71() { // from class: org.telegram.messenger.MediaController.11
                        @Override // org.telegram.ui.Components.m71
                        public boolean needUpdate() {
                            return org.telegram.ui.ActionBar.j6.x0().i != null;
                        }

                        @Override // org.telegram.ui.Components.m71
                        public void onVisualizerUpdate(boolean z18, boolean z19, float[] fArr) {
                            org.telegram.ui.ActionBar.j6.x0().e(z18, z19, fArr);
                        }
                    };
                    if (z16) {
                        if (!messageObject.mediaExists && pathToMessage != file) {
                            final int i13 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.messenger.h6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            MediaController.lambda$playMessage$21(messageObject, pathToMessage);
                                            break;
                                        default:
                                            MediaController.lambda$playMessage$22(messageObject, pathToMessage);
                                            break;
                                    }
                                }
                            });
                        }
                        this.audioPlayer.D(Uri.fromFile(pathToMessage), "other");
                        this.isStreamingCurrentAudio = false;
                        file2 = pathToMessage;
                    } else {
                        int fileReference2 = FileLoader.getInstance(messageObject.currentAccount).getFileReference(messageObject);
                        TLRPC.Document document2 = messageObject.getDocument();
                        StringBuilder sb3 = new StringBuilder("?account=");
                        sb3.append(messageObject.currentAccount);
                        sb3.append("&id=");
                        file2 = pathToMessage;
                        sb3.append(document2.id);
                        sb3.append("&hash=");
                        sb3.append(document2.access_hash);
                        sb3.append("&dc=");
                        sb3.append(document2.dc_id);
                        sb3.append("&size=");
                        sb3.append(document2.size);
                        sb3.append("&mime=");
                        sb3.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                        sb3.append("&rid=");
                        sb3.append(fileReference2);
                        sb3.append("&name=");
                        sb3.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                        sb3.append("&reference=");
                        byte[] bArr2 = document2.file_reference;
                        if (bArr2 == null) {
                            bArr2 = new byte[0];
                        }
                        sb3.append(Utilities.bytesToHex(bArr2));
                        this.audioPlayer.D(Uri.parse("tg://" + messageObject.getFileName() + sb3.toString()), "other");
                        this.isStreamingCurrentAudio = true;
                    }
                    if (messageObject.isVoice()) {
                        String fileName = messageObject.getFileName();
                        if (fileName != null && messageObject.getDuration() >= 300.0d) {
                            float f11 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileName, -1.0f);
                            if (f11 > f7 && f11 < 0.99f) {
                                this.seekToProgressPending = f11;
                                messageObject.audioProgress = f11;
                            }
                            this.shouldSavePositionForCurrentAudio = fileName;
                        }
                        if (Math.abs(this.currentPlaybackSpeed - VOLUME_NORMAL) > 0.001f) {
                            this.audioPlayer.Q(Math.round(this.currentPlaybackSpeed * 10.0f) / 10.0f);
                        }
                        this.audioInfo = null;
                        if (!z17) {
                            clearPlaylist();
                        }
                    } else {
                        try {
                            this.audioInfo = jf.a.a(file2);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        String fileName2 = messageObject.getFileName();
                        if (!TextUtils.isEmpty(fileName2) && messageObject.getDuration() >= 600.0d) {
                            float f12 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileName2, -1.0f);
                            if (f12 > f7 && f12 < 0.999f) {
                                this.seekToProgressPending = f12;
                                messageObject.audioProgress = f12;
                            }
                            this.shouldSavePositionForCurrentAudio = fileName2;
                            if (Math.abs(this.currentMusicPlaybackSpeed - VOLUME_NORMAL) > 0.001f) {
                                this.audioPlayer.Q(Math.round(this.currentMusicPlaybackSpeed * 10.0f) / 10.0f);
                            }
                        }
                    }
                    float f13 = messageObject.forceSeekTo;
                    if (f13 >= f7) {
                        this.seekToProgressPending = f13;
                        messageObject.audioProgress = f13;
                        messageObject.forceSeekTo = -1.0f;
                    }
                    if (!messageObject.isMusic() || messageObject.getDocument() == null || DialogObject.isEncryptedDialog(messageObject.getDialogId())) {
                        MusicListenReporter musicListenReporter2 = this.reporter;
                        if (musicListenReporter2 != null) {
                            musicListenReporter2.destroy();
                            this.reporter = null;
                        }
                    } else {
                        MusicListenReporter musicListenReporter3 = this.reporter;
                        if (musicListenReporter3 == null || musicListenReporter3.currentAccount != messageObject.currentAccount) {
                            if (musicListenReporter3 != null) {
                                musicListenReporter3.destroy();
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
                    }
                    i2.e0 e0Var = this.audioPlayer.d;
                    if (e0Var != null && (musicListenReporter = this.reporter) != null) {
                        e0Var.n0(musicListenReporter.getPlayerListener(e0Var));
                    }
                    this.audioPlayer.S(this.useFrontSpeaker ? 0 : 3);
                    this.audioPlayer.C();
                    if (messageObject.isVoice()) {
                        this.audioVolume = VOLUME_NORMAL;
                        setPlayerVolume();
                    } else {
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
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
                    int i14 = NotificationCenter.messagePlayingPlayStateChanged;
                    MessageObject messageObject3 = this.playingMessageObject;
                    notificationCenter.lambda$postNotificationNameOnUIThread$1(i14, Integer.valueOf(messageObject3 != null ? messageObject3.getId() : 0));
                    if (this.audioPlayer != null) {
                        MusicListenReporter musicListenReporter4 = this.reporter;
                        if (musicListenReporter4 != null) {
                            musicListenReporter4.destroy();
                            r52 = 0;
                            this.reporter = null;
                        } else {
                            r52 = 0;
                        }
                        this.audioPlayer.H();
                        this.audioPlayer = r52;
                        org.telegram.ui.ActionBar.j6.G1(this.playingMessageObject);
                        this.isPaused = false;
                        this.playingMessageObject = r52;
                        this.downloadingCurrentMessage = false;
                        return false;
                    }
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
                c10 = 0;
            } else {
                c10 = 0;
                SharedConfig.enabledRaiseTo(false);
            }
            startProgressTimer(this.playingMessageObject);
            NotificationCenter notificationCenter2 = NotificationCenter.getInstance(messageObject.currentAccount);
            int i15 = NotificationCenter.messagePlayingDidStart;
            Object[] objArr = new Object[2];
            objArr[c10] = messageObject;
            objArr[1] = messageObject2;
            notificationCenter2.lambda$postNotificationNameOnUIThread$1(i15, objArr);
            t71 t71Var4 = this.videoPlayer;
            if (t71Var4 != null) {
                try {
                    if (this.playingMessageObject.audioProgress != f7) {
                        long p5 = t71Var4.p();
                        if (p5 == -9223372036854775807L) {
                            p5 = ((long) this.playingMessageObject.getDuration()) * 1000;
                        }
                        MessageObject messageObject4 = this.playingMessageObject;
                        int i16 = (int) (p5 * messageObject4.audioProgress);
                        int i17 = messageObject4.audioProgressMs;
                        if (i17 != 0) {
                            messageObject4.audioProgressMs = 0;
                            i16 = i17;
                        }
                        this.videoPlayer.K(i16);
                    }
                } catch (Exception e11) {
                    MessageObject messageObject5 = this.playingMessageObject;
                    messageObject5.audioProgress = 0.0f;
                    messageObject5.audioProgressSec = 0;
                    NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
                    FileLog.e(e11);
                }
                this.videoPlayer.C();
            } else {
                t71 t71Var5 = this.audioPlayer;
                if (t71Var5 != null) {
                    try {
                        if (this.playingMessageObject.audioProgress != 0.0f) {
                            long p10 = t71Var5.p();
                            if (p10 == -9223372036854775807L) {
                                p10 = ((long) this.playingMessageObject.getDuration()) * 1000;
                            }
                            long j3 = (int) (p10 * this.playingMessageObject.audioProgress);
                            this.audioPlayer.K(j3);
                            if (!this.ignorePlayerUpdate) {
                                b5.d.v(j3);
                            }
                        }
                    } catch (Exception e12) {
                        this.playingMessageObject.resetPlayingProgress();
                        NotificationCenter.getInstance(messageObject.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagePlayingProgressDidChanged, Integer.valueOf(this.playingMessageObject.getId()), 0);
                        FileLog.e(e12);
                    }
                }
            }
            if (canStartMusicPlayerService()) {
                try {
                    ApplicationLoader.applicationContext.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
                } catch (Throwable th3) {
                    FileLog.e(th3);
                }
            } else {
                ApplicationLoader.applicationContext.stopService(new Intent(ApplicationLoader.applicationContext, (Class<?>) MusicPlayerService.class));
            }
            try {
                b5.d.b(1);
                if (this.ignorePlayerUpdate) {
                    return true;
                }
                if (of.b.d0().i0()) {
                    of.b.d0().o0(getCurrentChromecastMedia());
                }
                b5.d.x(true);
                return true;
            } catch (Exception e13) {
                FileLog.e(e13);
                return true;
            }
        }
        return false;
    }

    public void scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo) {
        scheduleVideoConvert(messageObject, videoEditedInfo, false, true, false);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j3) {
        return setPlaylist(arrayList, messageObject, j3, true, null);
    }

    public void setTextureView(TextureView textureView, org.telegram.ui.m4 m4Var, FrameLayout frameLayout, boolean z10, Runnable runnable) {
        if (textureView == null) {
            return;
        }
        if (!z10 && this.currentTextureView == textureView) {
            this.pipSwitchingState = 1;
            this.currentTextureView = null;
            this.currentAspectRatioFrameLayout = null;
            this.currentTextureViewContainer = null;
            return;
        }
        if (this.videoPlayer == null || textureView == this.currentTextureView) {
            return;
        }
        this.isDrawingWasReady = m4Var != null && m4Var.d;
        this.currentTextureView = textureView;
        if (runnable != null && this.pipRoundVideoView == null) {
            try {
                PipRoundVideoView pipRoundVideoView = new PipRoundVideoView();
                this.pipRoundVideoView = pipRoundVideoView;
                pipRoundVideoView.d(this.baseActivity, new b6(this, 2));
            } catch (Exception unused) {
                this.pipRoundVideoView = null;
            }
        }
        PipRoundVideoView pipRoundVideoView2 = this.pipRoundVideoView;
        if (pipRoundVideoView2 != null) {
            this.videoPlayer.V(pipRoundVideoView2.c);
        } else {
            this.videoPlayer.V(this.currentTextureView);
        }
        this.currentAspectRatioFrameLayout = m4Var;
        this.currentTextureViewContainer = frameLayout;
        if (!this.currentAspectRatioFrameLayoutReady || m4Var == null) {
            return;
        }
        m4Var.a(this.currentAspectRatioFrameLayoutRatio, this.currentAspectRatioFrameLayoutRotation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void saveFile(String str, Context context, int i10, String str2, String str3, Utilities.Callback<Uri> callback, boolean z10) {
        File file;
        org.telegram.ui.ActionBar.d2 d2Var;
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
                int i11 = 0;
                boolean[] zArr = {false};
                if (file.exists()) {
                    boolean[] zArr2 = new boolean[1];
                    if (i10 != 0) {
                        try {
                            org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(context, 2, null);
                            d2Var2.m(LocaleController.getString(R.string.Loading));
                            d2Var2.setCanceledOnTouchOutside(false);
                            d2Var2.setCancelable(true);
                            d2Var2.setOnCancelListener(new c6(zArr, i11));
                            AndroidUtilities.runOnUIThread(new d6(zArr2, d2Var2, i11), 250L);
                            d2Var = d2Var2;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        new Thread(new e6(i10, file, str2, d2Var, zArr, str3, callback, zArr2)).start();
                        return;
                    }
                    d2Var = null;
                    new Thread(new e6(i10, file, str2, d2Var, zArr, str3, callback, zArr2)).start();
                    return;
                }
                return;
            }
        }
        file = null;
        if (file != null) {
        }
    }

    public boolean scheduleVideoConvert(MessageObject messageObject, boolean z10, boolean z11, boolean z12) {
        return scheduleVideoConvert(messageObject, messageObject != null ? messageObject.videoEditedInfo : null, z10, z11, z12);
    }

    public boolean setPlaylist(ArrayList<MessageObject> arrayList, MessageObject messageObject, long j3, boolean z10, PlaylistGlobalSearchParams playlistGlobalSearchParams) {
        if (this.playingMessageObject == messageObject) {
            int indexOf = this.playlist.indexOf(messageObject);
            if (indexOf >= 0) {
                this.currentPlaylistNum = indexOf;
            }
            return playMessage(messageObject);
        }
        this.forceLoopCurrentPlaylist = !z10;
        this.playlistMergeDialogId = j3;
        this.playMusicAgain = !this.playlist.isEmpty();
        clearPlaylist();
        this.playlistGlobalSearchParams = playlistGlobalSearchParams;
        boolean z11 = false;
        if (!arrayList.isEmpty() && DialogObject.isEncryptedDialog(arrayList.get(0).getDialogId())) {
            z11 = true;
        }
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = TLObject.FLAG_31;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            MessageObject messageObject2 = arrayList.get(size);
            if (messageObject2.isMusic()) {
                int id2 = messageObject2.getId();
                if (id2 > 0 || z11) {
                    i10 = Math.min(i10, id2);
                    i11 = Math.max(i11, id2);
                }
                this.playlist.add(messageObject2);
                this.playlistMap.put(Integer.valueOf(id2), messageObject2);
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
            if (z10) {
                if (this.playlistGlobalSearchParams == null) {
                    MediaDataController.getInstance(messageObject.currentAccount).loadMusic(messageObject.getDialogId(), i10, i11);
                } else {
                    this.playlistClassGuid = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return playMessage(messageObject);
    }

    public boolean scheduleVideoConvert(MessageObject messageObject, VideoEditedInfo videoEditedInfo, boolean z10, boolean z11, boolean z12) {
        if (messageObject == null || videoEditedInfo == null) {
            return false;
        }
        if (z10 && !this.videoConvertQueue.isEmpty()) {
            return false;
        }
        if (z10) {
            new File(messageObject.messageOwner.attachPath).delete();
        }
        VideoConvertMessage videoConvertMessage = new VideoConvertMessage(messageObject, videoEditedInfo, z11, z12);
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

    public static void saveFile(String str, String str2, Context context, Utilities.Callback<Uri> callback) {
        org.telegram.ui.ActionBar.d2 d2Var;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (file.exists() && file2.exists()) {
            if (AndroidUtilities.isInternalUri(Uri.fromFile(file)) || AndroidUtilities.isInternalUri(Uri.fromFile(file2))) {
                return;
            }
            int i10 = 1;
            boolean[] zArr = {false};
            boolean[] zArr2 = new boolean[1];
            try {
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(context, 2, null);
                d2Var2.m(LocaleController.getString(R.string.Loading));
                d2Var2.setCanceledOnTouchOutside(false);
                d2Var2.setCancelable(true);
                d2Var2.setOnCancelListener(new c6(zArr, i10));
                AndroidUtilities.runOnUIThread(new d6(zArr2, d2Var2, 2), 250L);
                d2Var = d2Var2;
            } catch (Exception e) {
                FileLog.e(e);
                d2Var = null;
            }
            new Thread(new a0(file, file2, zArr, callback, d2Var, zArr2, 2)).start();
            return;
        }
        saveFile(str, context, 0, null, null, callback);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
