package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Scroller;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Stories.recorder.TimelineView;

/* loaded from: classes5.dex */
public class TimelineView extends View {
    private Runnable askExactSeek;
    private StaticLayout audioAuthor;
    private float audioAuthorLeft;
    private final TextPaint audioAuthorPaint;
    private float audioAuthorWidth;
    private final BlurringShader.StoryBlurDrawer audioBlur;
    private final RectF audioBounds;
    private final Path audioClipPath;
    private final Paint audioDotPaint;
    private long audioDuration;
    private final Drawable audioIcon;
    private float audioLeft;
    private long audioOffset;
    private String audioPath;
    private float audioRight;
    private boolean audioSelected;
    private final AnimatedFloat audioSelectedT;
    private final AnimatedFloat audioT;
    private StaticLayout audioTitle;
    private float audioTitleLeft;
    private final TextPaint audioTitlePaint;
    private float audioTitleWidth;
    private float audioVolume;
    private final BlurringShader.StoryBlurDrawer audioWaveformBlur;
    private final BlurringShader.StoryBlurDrawer backgroundBlur;
    private final BlurringShader.BlurManager blurManager;
    private final Path collageClipPath;
    private final Paint collageFramePaint;
    private Track collageMain;
    private int collageSelected;
    private final ArrayList collageTracks;
    private final ArrayList collageWaveforms;
    private final TextPaint countTextPaint;
    private long coverEnd;
    private long coverStart;
    private TimelineDelegate delegate;
    private float dragSpeed;
    private boolean dragged;
    private boolean draggingProgress;
    private final LinearGradient ellipsizeGradient;
    private final Matrix ellipsizeMatrix;
    private final Paint ellipsizePaint;
    private int h;
    private boolean hadDragChange;
    private boolean hasAudio;
    private boolean hasRound;
    private boolean isCover;
    private int lastHeight;
    private long lastTime;
    private float lastX;
    private final AnimatedFloat loopProgress;
    private long loopProgressFrom;
    private int maxCount;
    private Runnable onHeightChange;
    private final Runnable onLongPress;
    private Runnable onTimelineClick;
    public boolean open;
    private final AnimatedFloat openT;
    private int ph;
    private int pressCollageIndex;
    private int pressHandle;
    private int pressHandleCollageIndex;
    private long pressTime;
    private int pressType;
    private final View previewContainer;
    private long progress;
    private final Paint progressShadowPaint;
    private final Paint progressWhitePaint;
    private int px;
    private int py;
    private final Paint regionCutPaint;
    private final Paint regionHandlePaint;
    private final Paint regionPaint;
    private boolean resetWaveform;
    private final Theme.ResourcesProvider resourcesProvider;
    private final RectF roundBounds;
    private final Path roundClipPath;
    private long roundDuration;
    private float roundLeft;
    private long roundOffset;
    private String roundPath;
    private float roundRight;
    private boolean roundSelected;
    private final AnimatedFloat roundSelectedT;
    private final AnimatedFloat roundT;
    private VideoThumbsLoader roundThumbs;
    private float roundVolume;
    private long scroll;
    private final Scroller scroller;
    private boolean scrolling;
    private int scrollingCollage;
    private boolean scrollingVideo;
    private final Path selectedCollageClipPath;
    private final Path selectedVideoClipPath;
    final float[] selectedVideoRadii;
    private int sw;
    private final RectF timelineBounds;
    private final Path timelineClipPath;
    private final Drawable timelineIcon;
    private final Text timelineText;
    private final AnimatedFloat timelineWaveformLoaded;
    private final AnimatedFloat timelineWaveformMax;
    private final WaveformPath timelineWaveformPath;
    private VelocityTracker velocityTracker;
    private final RectF videoBounds;
    private final Path videoClipPath;
    private final Paint videoFramePaint;
    private Track videoTrack;
    private int w;
    private int wasScrollX;
    private AudioWaveformLoader waveform;
    private boolean waveformIsLoaded;
    private final AnimatedFloat waveformMax;
    private final Paint waveformPaint;
    private final WaveformPath waveformPath;

    /* JADX INFO: Access modifiers changed from: private */
    class AudioWaveformLoader {
        private final AnimatedFloat animatedLoaded;
        private final int count;
        private final short[] data;
        private long duration;
        private final MediaExtractor extractor;
        private MediaFormat inputFormat;
        private short max;
        private FfmpegAudioWaveformLoader waveformLoader;
        private int loaded = 0;
        private final Object lock = new Object();
        private boolean stop = false;

        public AudioWaveformLoader(String str, int i) {
            this.animatedLoaded = new AnimatedFloat(TimelineView.this, 0L, 600L, CubicBezierInterpolator.EASE_OUT_QUINT);
            int i2 = 0;
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.extractor = mediaExtractor;
            String str2 = null;
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                while (true) {
                    if (i2 < trackCount) {
                        MediaFormat trackFormat = this.extractor.getTrackFormat(i2);
                        str2 = trackFormat.getString("mime");
                        if (str2 != null && str2.startsWith("audio/")) {
                            this.extractor.selectTrack(i2);
                            this.inputFormat = trackFormat;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                MediaFormat mediaFormat = this.inputFormat;
                if (mediaFormat != null) {
                    this.duration = mediaFormat.getLong("durationUs") / 1000000;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            int min = Math.min(Math.round((((this.duration * 1000) / Math.min(TimelineView.this.videoTrack != null ? TimelineView.this.videoTrack.duration : !TimelineView.this.collageTracks.isEmpty() ? TimelineView.this.getBaseDuration() : TimelineView.this.hasRound ? TimelineView.this.roundDuration : this.duration * 1000, TimelineView.this.getMaxScrollDuration())) * i) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
            this.count = min;
            this.data = new short[min];
            if (this.duration <= 0 || this.inputFormat == null) {
                return;
            }
            if ("audio/mpeg".equals(str2) || "audio/mp3".equals(str2) || "audio/mp4a".equals(str2) || MediaController.AUDIO_MIME_TYPE.equals(str2)) {
                this.waveformLoader = new FfmpegAudioWaveformLoader(str, min, new Utilities.Callback2() { // from class: org.telegram.ui.Stories.recorder.TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda1
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TimelineView.AudioWaveformLoader.this.lambda$run$0((short[]) obj, ((Integer) obj2).intValue());
                    }
                });
            } else {
                Utilities.phoneBookQueue.postRunnable(new TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: receiveData, reason: merged with bridge method [inline-methods] */
        public void lambda$run$0(short[] sArr, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = this.loaded + i2;
                short[] sArr2 = this.data;
                if (i3 >= sArr2.length) {
                    break;
                }
                sArr2[i3] = sArr[i2];
                short s = this.max;
                short s2 = sArr[i2];
                if (s < s2) {
                    this.max = s2;
                }
            }
            this.loaded += i;
            TimelineView.this.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x015d, code lost:
        
            r3 = r16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            MediaCodec.BufferInfo bufferInfo;
            int i;
            int i2;
            short s;
            try {
                int round = Math.round(((this.duration * this.inputFormat.getInteger("sample-rate")) / this.count) / 5.0f);
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.inputFormat.getString("mime"));
                if (createDecoderByType == null) {
                    return;
                }
                createDecoderByType.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 0);
                createDecoderByType.start();
                ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
                ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
                final short[] sArr = new short[32];
                int i3 = -1;
                int i4 = 0;
                boolean z = false;
                int i5 = 0;
                int i6 = 0;
                short s2 = 0;
                while (true) {
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                    if (dequeueInputBuffer >= 0) {
                        int readSampleData = this.extractor.readSampleData(Build.VERSION.SDK_INT < 21 ? inputBuffers[dequeueInputBuffer] : createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                        if (readSampleData < 0) {
                            i = 21;
                            bufferInfo = bufferInfo2;
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            z = true;
                        } else {
                            bufferInfo = bufferInfo2;
                            i = 21;
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), 0);
                            this.extractor.advance();
                        }
                    } else {
                        bufferInfo = bufferInfo2;
                        i = 21;
                    }
                    if (i3 >= 0) {
                        (Build.VERSION.SDK_INT < i ? outputBuffers[i3] : createDecoderByType.getOutputBuffer(i3)).position(0);
                    }
                    MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                    long j = 2500;
                    while (true) {
                        i3 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, j);
                        if (i3 == -1 || z) {
                            break;
                        }
                        if (i3 >= 0) {
                            ByteBuffer outputBuffer = Build.VERSION.SDK_INT < i ? outputBuffers[i3] : createDecoderByType.getOutputBuffer(i3);
                            if (outputBuffer != null && bufferInfo3.size > 0) {
                                int i7 = i6;
                                while (outputBuffer.remaining() > 0) {
                                    short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                    if (i7 >= round) {
                                        sArr[i4 - i5] = s2;
                                        int i8 = i4 + 1;
                                        final int i9 = i8 - i5;
                                        if (i9 >= sArr.length || i8 >= this.count) {
                                            short[] sArr2 = new short[sArr.length];
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    TimelineView.AudioWaveformLoader.this.lambda$run$0(sArr, i9);
                                                }
                                            });
                                            sArr = sArr2;
                                            i5 = i8;
                                        }
                                        i4 = i8;
                                        if (i8 >= this.data.length) {
                                            i6 = 0;
                                            s2 = 0;
                                            break;
                                        } else {
                                            s = 0;
                                            i7 = 0;
                                        }
                                    } else {
                                        s = s2;
                                    }
                                    s2 = s < s3 ? s3 : s;
                                    i7++;
                                    if (outputBuffer.remaining() < 8) {
                                        break;
                                    } else {
                                        outputBuffer.position(outputBuffer.position() + 8);
                                    }
                                }
                                i6 = i7;
                            }
                            createDecoderByType.releaseOutputBuffer(i3, false);
                            if ((bufferInfo3.flags & 4) != 0) {
                                i2 = i4;
                                z = true;
                                break;
                            }
                        } else if (i3 == -3) {
                            outputBuffers = createDecoderByType.getOutputBuffers();
                        }
                        j = 2500;
                        i = 21;
                    }
                    synchronized (this.lock) {
                        try {
                            if (!this.stop) {
                                if (z || i2 >= this.count) {
                                    break;
                                } else {
                                    i4 = i2;
                                }
                            } else {
                                break;
                            }
                        } finally {
                        }
                    }
                }
                createDecoderByType.stop();
                createDecoderByType.release();
                this.extractor.release();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void destroy() {
            FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.waveformLoader;
            if (ffmpegAudioWaveformLoader != null) {
                ffmpegAudioWaveformLoader.destroy();
            }
            Utilities.phoneBookQueue.cancelRunnable(new TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(this));
            synchronized (this.lock) {
                this.stop = true;
            }
        }

        public short getBar(int i) {
            return this.data[i];
        }

        public int getCount() {
            return this.count;
        }

        public int getLoadedCount() {
            return this.loaded;
        }

        public short getMaxBar() {
            return this.max;
        }
    }

    public interface TimelineDelegate {

        public abstract /* synthetic */ class -CC {
            public static void $default$onAudioLeftChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onAudioOffsetChange(TimelineDelegate timelineDelegate, long j) {
            }

            public static void $default$onAudioRemove(TimelineDelegate timelineDelegate) {
            }

            public static void $default$onAudioRightChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onAudioVolumeChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onProgressChange(TimelineDelegate timelineDelegate, long j, boolean z) {
            }

            public static void $default$onProgressDragChange(TimelineDelegate timelineDelegate, boolean z) {
            }

            public static void $default$onRoundLeftChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onRoundOffsetChange(TimelineDelegate timelineDelegate, long j) {
            }

            public static void $default$onRoundRemove(TimelineDelegate timelineDelegate) {
            }

            public static void $default$onRoundRightChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onRoundSelectChange(TimelineDelegate timelineDelegate, boolean z) {
            }

            public static void $default$onRoundVolumeChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onVideoLeftChange(TimelineDelegate timelineDelegate, int i, float f) {
            }

            public static void $default$onVideoOffsetChange(TimelineDelegate timelineDelegate, int i, long j) {
            }

            public static void $default$onVideoRightChange(TimelineDelegate timelineDelegate, int i, float f) {
            }

            public static void $default$onVideoRightChange(TimelineDelegate timelineDelegate, boolean z, float f) {
            }

            public static void $default$onVideoSelected(TimelineDelegate timelineDelegate, int i) {
            }

            public static void $default$onVideoVolumeChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onVideoVolumeChange(TimelineDelegate timelineDelegate, int i, float f) {
            }
        }

        void onAudioLeftChange(float f);

        void onAudioOffsetChange(long j);

        void onAudioRemove();

        void onAudioRightChange(float f);

        void onAudioVolumeChange(float f);

        void onProgressChange(long j, boolean z);

        void onProgressDragChange(boolean z);

        void onRoundLeftChange(float f);

        void onRoundOffsetChange(long j);

        void onRoundRemove();

        void onRoundRightChange(float f);

        void onRoundSelectChange(boolean z);

        void onRoundVolumeChange(float f);

        void onVideoLeftChange(int i, float f);

        void onVideoLeftChange(boolean z, float f);

        void onVideoOffsetChange(int i, long j);

        void onVideoRightChange(int i, float f);

        void onVideoRightChange(boolean z, float f);

        void onVideoSelected(int i);

        void onVideoVolumeChange(float f);

        void onVideoVolumeChange(int i, float f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class Track {
        final RectF bounds;
        long duration;
        int index;
        boolean isRound;
        float left;
        long offset;
        String path;
        float right;
        private final AnimatedFloat selectedT;
        VideoThumbsLoader thumbs;
        float volume;

        private Track() {
            this.bounds = new RectF();
            this.selectedT = new AnimatedFloat(TimelineView.this, 360L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setupThumbs$0() {
            VideoThumbsLoader videoThumbsLoader = this.thumbs;
            if (videoThumbsLoader == null || videoThumbsLoader.getDuration() <= 0) {
                return;
            }
            this.duration = this.thumbs.getDuration();
            TimelineView.this.sortCollage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setupThumbs(boolean z) {
            if (TimelineView.this.getMeasuredWidth() > 0) {
                VideoThumbsLoader videoThumbsLoader = this.thumbs;
                if (videoThumbsLoader == null || z) {
                    if (videoThumbsLoader != null) {
                        videoThumbsLoader.destroy();
                        this.thumbs = null;
                    }
                    TimelineView timelineView = TimelineView.this;
                    boolean z2 = this.isRound;
                    String str = this.path;
                    int i = (timelineView.w - TimelineView.this.px) - TimelineView.this.px;
                    int dp = AndroidUtilities.dp(38.0f);
                    long j = this.duration;
                    this.thumbs = timelineView.new VideoThumbsLoader(z2, str, i, dp, j > 2 ? Long.valueOf(j) : null, TimelineView.this.getMaxScrollDuration(), TimelineView.this.coverStart, TimelineView.this.coverEnd, new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$Track$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            TimelineView.Track.this.lambda$setupThumbs$0();
                        }
                    });
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setupWaveform(boolean z) {
            int i = this.index;
            if (i < 0 || i >= TimelineView.this.collageWaveforms.size()) {
                return;
            }
            AudioWaveformLoader audioWaveformLoader = (AudioWaveformLoader) TimelineView.this.collageWaveforms.get(this.index);
            if (TimelineView.this.getMeasuredWidth() > 0) {
                if (audioWaveformLoader == null || z) {
                    if (audioWaveformLoader != null) {
                        audioWaveformLoader.destroy();
                    }
                    TimelineView timelineView = TimelineView.this;
                    TimelineView.this.collageWaveforms.set(this.index, timelineView.new AudioWaveformLoader(this.path, (timelineView.getMeasuredWidth() - TimelineView.this.getPaddingLeft()) - TimelineView.this.getPaddingRight()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class VideoThumbsLoader {
        private Path clipPath;
        private int count;
        private boolean destroyed;
        private long duration;
        private volatile int frameHeight;
        private volatile long frameIterator;
        private volatile int frameWidth;
        private final boolean isRound;
        private long nextFrame;
        private final ArrayList frames = new ArrayList();
        private boolean loading = false;
        private final Paint bitmapPaint = new Paint(3);
        private MediaMetadataRetriever metadataRetriever = new MediaMetadataRetriever();

        public class BitmapFrame {
            private final AnimatedFloat alpha;
            public Bitmap bitmap;

            public BitmapFrame(Bitmap bitmap) {
                this.alpha = new AnimatedFloat(0.0f, TimelineView.this, 0L, 240L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.bitmap = bitmap;
            }

            public float getAlpha() {
                return this.alpha.set(1.0f);
            }
        }

        public VideoThumbsLoader(boolean z, final String str, final int i, final int i2, final Long l, final long j, final long j2, final long j3, final Runnable runnable) {
            this.isRound = z;
            Utilities.themeQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.VideoThumbsLoader.this.lambda$new$0(str, l, j2, j3, i2, j, i, runnable);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        
            if (r0 != 270) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$new$0(String str, Long l, long j, long j2, int i, long j3, int i2, Runnable runnable) {
            int i3;
            String extractMetadata;
            long maxScrollDuration = TimelineView.this.getMaxScrollDuration();
            try {
                this.metadataRetriever.setDataSource(str);
                String extractMetadata2 = this.metadataRetriever.extractMetadata(9);
                if (extractMetadata2 != null) {
                    maxScrollDuration = Long.parseLong(extractMetadata2);
                    this.duration = maxScrollDuration;
                }
                String extractMetadata3 = this.metadataRetriever.extractMetadata(18);
                i3 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                try {
                    String extractMetadata4 = this.metadataRetriever.extractMetadata(19);
                    r7 = extractMetadata4 != null ? Integer.parseInt(extractMetadata4) : 0;
                    extractMetadata = this.metadataRetriever.extractMetadata(24);
                } catch (Exception e) {
                    e = e;
                    this.metadataRetriever = null;
                    FileLog.e(e);
                    int i4 = i3;
                    i3 = r7;
                    r7 = i4;
                    if (l != null) {
                    }
                    if (j != -1) {
                    }
                    float clamp = Utilities.clamp((r7 != 0 || i3 == 0) ? 1.0f : r7 / i3, 1.3333334f, 0.5625f);
                    this.frameHeight = Math.max(1, i);
                    this.frameWidth = Math.max(1, (int) Math.ceil(i * clamp));
                    int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j3) / j3) * i2) / this.frameWidth);
                    this.count = ceil;
                    this.frameIterator = (long) (maxScrollDuration / ceil);
                    this.nextFrame = -this.frameIterator;
                    if (j != -1) {
                    }
                    load();
                    if (runnable != null) {
                    }
                }
            } catch (Exception e2) {
                e = e2;
                i3 = 0;
            }
            if (extractMetadata != null) {
                int parseInt = Integer.parseInt(extractMetadata);
                if (parseInt != 90) {
                }
                if (l != null) {
                    maxScrollDuration = l.longValue();
                    this.duration = maxScrollDuration;
                }
                if (j != -1 && j2 != -1) {
                    maxScrollDuration = j2 - j;
                }
                float clamp2 = Utilities.clamp((r7 != 0 || i3 == 0) ? 1.0f : r7 / i3, 1.3333334f, 0.5625f);
                this.frameHeight = Math.max(1, i);
                this.frameWidth = Math.max(1, (int) Math.ceil(i * clamp2));
                int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j3) / j3) * i2) / this.frameWidth);
                this.count = ceil2;
                this.frameIterator = (long) (maxScrollDuration / ceil2);
                this.nextFrame = -this.frameIterator;
                if (j != -1) {
                    this.nextFrame = j - this.frameIterator;
                }
                load();
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            }
            int i42 = i3;
            i3 = r7;
            r7 = i42;
            if (l != null) {
            }
            if (j != -1) {
                maxScrollDuration = j2 - j;
            }
            float clamp22 = Utilities.clamp((r7 != 0 || i3 == 0) ? 1.0f : r7 / i3, 1.3333334f, 0.5625f);
            this.frameHeight = Math.max(1, i);
            this.frameWidth = Math.max(1, (int) Math.ceil(i * clamp22));
            int ceil22 = (int) Math.ceil(((Math.max(maxScrollDuration, j3) / j3) * i2) / this.frameWidth);
            this.count = ceil22;
            this.frameIterator = (long) (maxScrollDuration / ceil22);
            this.nextFrame = -this.frameIterator;
            if (j != -1) {
            }
            load();
            if (runnable != null) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: receiveFrame, reason: merged with bridge method [inline-methods] */
        public void lambda$retrieveFrame$1(Bitmap bitmap) {
            if (!this.loading || this.destroyed) {
                return;
            }
            this.frames.add(new BitmapFrame(bitmap));
            this.loading = false;
            TimelineView.this.invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void retrieveFrame() {
            MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetriever;
            if (mediaMetadataRetriever == null) {
                return;
            }
            final Bitmap bitmap = null;
            try {
                bitmap = mediaMetadataRetriever.getFrameAtTime(this.nextFrame * 1000, 2);
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(this.frameWidth, this.frameHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float max = Math.max(this.frameWidth / bitmap.getWidth(), this.frameHeight / bitmap.getHeight());
                    Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                    Rect rect2 = new Rect((int) ((createBitmap.getWidth() - (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() - (bitmap.getHeight() * max)) / 2.0f), (int) ((createBitmap.getWidth() + (bitmap.getWidth() * max)) / 2.0f), (int) ((createBitmap.getHeight() + (bitmap.getHeight() * max)) / 2.0f));
                    if (this.isRound) {
                        if (this.clipPath == null) {
                            this.clipPath = new Path();
                        }
                        this.clipPath.rewind();
                        this.clipPath.addCircle(this.frameWidth / 2.0f, this.frameHeight / 2.0f, Math.min(this.frameWidth, this.frameHeight) / 2.0f, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                    }
                    canvas.drawBitmap(bitmap, rect, rect2, this.bitmapPaint);
                    bitmap.recycle();
                    bitmap = createBitmap;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.VideoThumbsLoader.this.lambda$retrieveFrame$1(bitmap);
                }
            });
        }

        public void destroy() {
            this.destroyed = true;
            Utilities.themeQueue.cancelRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
            Iterator it = this.frames.iterator();
            while (it.hasNext()) {
                Bitmap bitmap = ((BitmapFrame) it.next()).bitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.frames.clear();
            MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetriever;
            if (mediaMetadataRetriever != null) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e) {
                    this.metadataRetriever = null;
                    FileLog.e(e);
                }
            }
        }

        public long getDuration() {
            return this.duration;
        }

        public int getFrameWidth() {
            return this.frameWidth;
        }

        public void load() {
            if (this.loading || this.metadataRetriever == null || this.frames.size() >= this.count) {
                return;
            }
            this.loading = true;
            this.nextFrame += this.frameIterator;
            Utilities.themeQueue.cancelRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
            Utilities.themeQueue.postRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
        }
    }

    static class WaveformPath extends Path {
        private float lastAudioHeight;
        private float lastAudioSelected;
        private float lastBottom;
        private float lastLeft;
        private float lastMaxBar;
        private float lastRight;
        private long lastScrollDuration;
        private float lastStart;
        private ArrayList lastWaveformCounts;
        private ArrayList lastWaveformLoaded;
        private final int ph = AndroidUtilities.dp(10.0f);
        private final float[] waveformRadii;

        WaveformPath() {
            this.waveformRadii = new float[]{r1, r1, r1, r1, 0.0f, 0.0f, 0.0f, 0.0f};
            float dp = AndroidUtilities.dp(2.0f);
        }

        private boolean eqCount(ArrayList arrayList, ArrayList arrayList2) {
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (((Integer) arrayList.get(i)).intValue() != (arrayList2.get(i) == null ? 0 : ((AudioWaveformLoader) arrayList2.get(i)).getCount())) {
                    return false;
                }
            }
            return true;
        }

        private boolean eqLoadedCounts(ArrayList arrayList, ArrayList arrayList2) {
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (((Float) arrayList.get(i)).floatValue() != (arrayList2.get(i) == null ? 0.0f : ((AudioWaveformLoader) arrayList2.get(i)).animatedLoaded.set(((AudioWaveformLoader) arrayList2.get(i)).getLoadedCount()))) {
                    return false;
                }
            }
            return true;
        }

        public static int getMaxBar(ArrayList arrayList) {
            if (arrayList == null) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (arrayList.get(i2) != null) {
                    i += ((AudioWaveformLoader) arrayList.get(i2)).getMaxBar();
                }
            }
            return i;
        }

        private void layout(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, AudioWaveformLoader audioWaveformLoader) {
            rewind();
            float round = Math.round(AndroidUtilities.dpf2(3.3333f));
            int count = audioWaveformLoader.getCount();
            int min = Math.min(count - 1, (int) Math.ceil(((f3 + this.ph) - f) / round));
            for (int max = Math.max(0, (int) (((f2 - this.ph) - f) / round)); max <= min; max++) {
                float f9 = max;
                float dp = (f9 * round) + f + AndroidUtilities.dp(2.0f);
                float bar = f5 <= 0.0f ? 0.0f : (audioWaveformLoader.getBar(max) / f5) * f6 * 0.6f;
                if (f9 < f8 && max + 1 > f8) {
                    bar *= f8 - f9;
                } else if (f9 > f8) {
                    bar = 0.0f;
                }
                if (dp < f2 || dp > f3) {
                    bar *= f4;
                    if (bar <= 0.0f) {
                    }
                }
                float max2 = Math.max(bar, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(dp, AndroidUtilities.lerp(f7 - max2, f7 - ((f6 + max2) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f7, f7 - ((f6 - max2) / 2.0f), f4));
                addRoundRect(rectF, this.waveformRadii, Path.Direction.CW);
            }
        }

        private void layout(float f, float f2, float f3, float f4, float f5, float f6, float f7, ArrayList arrayList, ArrayList arrayList2) {
            rewind();
            float round = Math.round(AndroidUtilities.dpf2(3.3333f));
            int i = 0;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (arrayList2.get(i2) != null) {
                    i = Math.max(i, ((AudioWaveformLoader) arrayList2.get(i2)).getCount());
                }
            }
            int max = Math.max(0, (int) (((f2 - this.ph) - f) / round));
            int min = Math.min(i - 1, (int) Math.ceil(((f3 + this.ph) - f) / round));
            while (max <= min) {
                float f8 = max;
                float dp = f + (f8 * round) + AndroidUtilities.dp(2.0f);
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    short bar = (arrayList2.get(i4) == null || max >= ((AudioWaveformLoader) arrayList2.get(i4)).getCount()) ? (short) 0 : ((AudioWaveformLoader) arrayList2.get(i4)).getBar(max);
                    if (f8 < ((Float) arrayList.get(i4)).floatValue() && max + 1 > ((Float) arrayList.get(i4)).floatValue()) {
                        bar = (short) (bar * (((Float) arrayList.get(i4)).floatValue() - f8));
                    } else if (f8 > ((Float) arrayList.get(i4)).floatValue()) {
                        bar = 0;
                    }
                    i3 += bar;
                }
                float f9 = f5 <= 0.0f ? 0.0f : (i3 / f5) * f6 * 0.6f;
                if (dp < f2 || dp > f3) {
                    f9 *= f4;
                    if (f9 <= 0.0f) {
                        max++;
                    }
                }
                float max2 = Math.max(f9, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(dp, AndroidUtilities.lerp(f7 - max2, f7 - ((f6 + max2) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f7, f7 - ((f6 - max2) / 2.0f), f4));
                addRoundRect(rectF, this.waveformRadii, Path.Direction.CW);
                max++;
            }
        }

        public void check(float f, float f2, float f3, float f4, float f5, float f6, float f7, ArrayList arrayList) {
            if (arrayList == null || arrayList.isEmpty()) {
                rewind();
                return;
            }
            if (Math.abs(this.lastAudioHeight - f5) > 1.0f || Math.abs(this.lastMaxBar - f6) > 0.01f || Math.abs(this.lastAudioSelected - f4) > 0.1f || Math.abs(this.lastBottom - f7) > 1.0f || Math.abs(this.lastStart - f) > 1.0f || Math.abs(this.lastLeft - f2) > 1.0f || Math.abs(this.lastRight - f3) > 1.0f || eqCount(this.lastWaveformCounts, arrayList) || eqLoadedCounts(this.lastWaveformLoaded, arrayList)) {
                ArrayList arrayList2 = this.lastWaveformCounts;
                if (arrayList2 == null) {
                    this.lastWaveformCounts = new ArrayList();
                } else {
                    arrayList2.clear();
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    this.lastWaveformCounts.add(Integer.valueOf(arrayList.get(i) == null ? 0 : ((AudioWaveformLoader) arrayList.get(i)).getCount()));
                }
                ArrayList arrayList3 = this.lastWaveformLoaded;
                if (arrayList3 == null) {
                    this.lastWaveformLoaded = new ArrayList();
                } else {
                    arrayList3.clear();
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    this.lastWaveformLoaded.add(Float.valueOf(arrayList.get(i2) == null ? 0.0f : ((AudioWaveformLoader) arrayList.get(i2)).animatedLoaded.set(((AudioWaveformLoader) arrayList.get(i2)).getLoadedCount())));
                }
                this.lastStart = f;
                this.lastLeft = f2;
                this.lastRight = f3;
                this.lastAudioSelected = f4;
                this.lastMaxBar = f6;
                this.lastAudioHeight = f5;
                this.lastBottom = f7;
                layout(f, f2, f3, f4, f6, f5, f7, this.lastWaveformLoaded, arrayList);
            }
        }

        public void check(float f, float f2, float f3, float f4, long j, float f5, float f6, float f7, AudioWaveformLoader audioWaveformLoader) {
            ArrayList arrayList;
            if (audioWaveformLoader == null) {
                rewind();
                return;
            }
            float f8 = audioWaveformLoader.animatedLoaded.set(audioWaveformLoader.getLoadedCount());
            if (this.lastScrollDuration == j && Math.abs(this.lastAudioHeight - f5) <= 1.0f && Math.abs(this.lastMaxBar - f6) <= 0.01f && Math.abs(this.lastAudioSelected - f4) <= 0.1f && Math.abs(this.lastBottom - f7) <= 1.0f && Math.abs(this.lastStart - f) <= 1.0f && Math.abs(this.lastLeft - f2) <= 1.0f && Math.abs(this.lastRight - f3) <= 1.0f && (arrayList = this.lastWaveformCounts) != null && arrayList.size() == 1) {
                ArrayList arrayList2 = this.lastWaveformLoaded;
                if (Math.abs(((arrayList2 == null || arrayList2.isEmpty()) ? 0.0f : ((Float) this.lastWaveformLoaded.get(0)).floatValue()) - f8) <= 0.01f) {
                    return;
                }
            }
            ArrayList arrayList3 = this.lastWaveformCounts;
            if (arrayList3 == null) {
                this.lastWaveformCounts = new ArrayList();
            } else {
                arrayList3.clear();
            }
            this.lastWaveformCounts.add(Integer.valueOf(audioWaveformLoader.getCount()));
            ArrayList arrayList4 = this.lastWaveformLoaded;
            if (arrayList4 == null) {
                this.lastWaveformLoaded = new ArrayList();
            } else {
                arrayList4.clear();
            }
            this.lastWaveformLoaded.add(Float.valueOf(f8));
            this.lastStart = f;
            this.lastLeft = f2;
            this.lastRight = f3;
            this.lastAudioSelected = f4;
            this.lastMaxBar = f6;
            this.lastAudioHeight = f5;
            this.lastBottom = f7;
            layout(f, f2, f3, f4, f6, f5, f7, audioWaveformLoader.animatedLoaded.set(audioWaveformLoader.getLoadedCount()), audioWaveformLoader);
        }
    }

    public TimelineView(Context context, final ViewGroup viewGroup, final View view, final Theme.ResourcesProvider resourcesProvider, final BlurringShader.BlurManager blurManager) {
        super(context);
        this.collageSelected = 0;
        this.collageWaveforms = new ArrayList();
        this.collageTracks = new ArrayList();
        this.collageFramePaint = new Paint(3);
        this.collageClipPath = new Path();
        this.selectedCollageClipPath = new Path();
        this.maxCount = 1;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.roundT = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.roundSelectedT = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.audioT = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.audioSelectedT = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.waveformMax = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.timelineWaveformLoaded = new AnimatedFloat(this, 0L, 600L, cubicBezierInterpolator);
        this.timelineWaveformMax = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.openT = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.open = true;
        this.timelineBounds = new RectF();
        this.timelineClipPath = new Path();
        this.timelineWaveformPath = new WaveformPath();
        this.videoBounds = new RectF();
        this.videoFramePaint = new Paint(3);
        this.videoClipPath = new Path();
        this.selectedVideoClipPath = new Path();
        this.roundBounds = new RectF();
        this.roundClipPath = new Path();
        Paint paint = new Paint(1);
        this.regionPaint = paint;
        Paint paint2 = new Paint(1);
        this.regionCutPaint = paint2;
        Paint paint3 = new Paint(1);
        this.regionHandlePaint = paint3;
        Paint paint4 = new Paint(1);
        this.progressShadowPaint = paint4;
        Paint paint5 = new Paint(1);
        this.progressWhitePaint = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.countTextPaint = textPaint;
        this.audioBounds = new RectF();
        this.audioClipPath = new Path();
        Paint paint6 = new Paint(1);
        this.waveformPaint = paint6;
        this.waveformPath = new WaveformPath();
        Paint paint7 = new Paint(1);
        this.audioDotPaint = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.audioAuthorPaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.audioTitlePaint = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.ellipsizeGradient = linearGradient;
        this.ellipsizeMatrix = new Matrix();
        Paint paint8 = new Paint(1);
        this.ellipsizePaint = paint8;
        this.scroller = new Scroller(getContext());
        this.coverStart = -1L;
        this.coverEnd = -1L;
        this.loopProgress = new AnimatedFloat(0.0f, this, 0L, 340L, cubicBezierInterpolator);
        this.loopProgressFrom = -1L;
        this.pressHandle = -1;
        this.pressHandleCollageIndex = -1;
        this.pressType = -1;
        this.pressCollageIndex = -1;
        this.dragSpeed = 1.0f;
        this.scrollingVideo = true;
        this.scrollingCollage = -1;
        this.scrolling = false;
        this.selectedVideoRadii = new float[8];
        this.previewContainer = view;
        this.resourcesProvider = resourcesProvider;
        paint7.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(1.0f), 436207616);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(2.0f), TLRPC.FLAG_30);
        textPaint.setTypeface(AndroidUtilities.bold());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.timelineText = new Text(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.timelineIcon = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.audioIcon = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.blurManager = blurManager;
        this.backgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 0);
        this.audioBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 3);
        this.audioWaveformBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 4);
        this.onLongPress = new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.lambda$new$6(viewGroup, resourcesProvider, blurManager, view);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0143 A[LOOP:0: B:38:0x0143->B:42:0x01ff, LOOP_START, PHI: r6
      0x0143: PHI (r6v37 int) = (r6v11 int), (r6v38 int) binds: [B:37:0x0141, B:42:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int detectHandle(MotionEvent motionEvent) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(this.progress, getBaseDuration(), 0L);
        Track track = this.collageMain;
        float f5 = min;
        float f6 = this.px + this.ph + (this.sw * (((clamp + (track != null ? track.offset + (track.left * track.duration) : this.videoTrack == null ? this.audioOffset : 0L)) - this.scroll) / f5));
        if (!this.isCover && x >= f6 - AndroidUtilities.dp(12.0f) && x <= f6 + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z2 = this.videoTrack != null && y > (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        boolean z3 = !this.collageTracks.isEmpty() && y > ((((((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(4.0f))) - getCollageHeight()) - ((float) AndroidUtilities.dp(4.0f))) - ((float) AndroidUtilities.dp(2.0f)) && y < (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (this.hasRound) {
            if (y > (((((((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getCollageHeight()) - AndroidUtilities.dp(this.collageTracks.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f)) {
                if (y < ((((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) - getCollageHeight()) - AndroidUtilities.dp(this.collageTracks.isEmpty() ? 0.0f : 4.0f)) {
                    z = true;
                    if (!z3) {
                        for (int i = 0; i < this.collageTracks.size(); i++) {
                            Track track2 = (Track) this.collageTracks.get(i);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(track2.bounds);
                            rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                            if (rectF.contains(x, y)) {
                                float f7 = this.px + this.ph;
                                float f8 = track2.offset;
                                float f9 = this.sw;
                                float f10 = ((f8 / f5) * f9) + f7;
                                float f11 = track2.left;
                                float f12 = track2.duration;
                                float f13 = ((((f11 * f12) + f8) / f5) * f9) + f7;
                                float f14 = (((f8 + (track2.right * f12)) / f5) * f9) + f7;
                                float f15 = f7 + (((r4 + r11) / f5) * f9);
                                this.pressHandleCollageIndex = i;
                                if (x >= f13 - AndroidUtilities.dp(15.0f)) {
                                    f4 = 5.0f;
                                    if (x <= AndroidUtilities.dp(5.0f) + f13) {
                                        return 13;
                                    }
                                } else {
                                    f4 = 5.0f;
                                }
                                if (x >= f14 - AndroidUtilities.dp(f4) && x <= AndroidUtilities.dp(15.0f) + f14) {
                                    return 14;
                                }
                                if (x < f13 || x > f14 || (track2.left <= 0.01f && track2.right >= 0.99f)) {
                                    return (x < f10 || x > f15) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                    } else if (z2) {
                        float f16 = this.px + this.ph;
                        Track track3 = this.videoTrack;
                        float f17 = track3.left;
                        float f18 = track3.duration;
                        float f19 = this.scroll;
                        float f20 = this.sw;
                        float f21 = ((((f17 * f18) - f19) / f5) * f20) + f16;
                        float f22 = f16 + ((((track3.right * f18) - f19) / f5) * f20);
                        if (this.isCover) {
                            return (getBaseDuration() < getMaxScrollDuration() || (x >= f21 - ((float) AndroidUtilities.dp(15.0f)) && x <= f22 + ((float) AndroidUtilities.dp(15.0f)))) ? 4 : 1;
                        }
                        if (x >= f21 - AndroidUtilities.dp(15.0f)) {
                            f3 = 5.0f;
                            if (x <= AndroidUtilities.dp(5.0f) + f21) {
                                return 2;
                            }
                        } else {
                            f3 = 5.0f;
                        }
                        if (x >= f22 - AndroidUtilities.dp(f3) && x <= AndroidUtilities.dp(15.0f) + f22) {
                            return 3;
                        }
                        if (x >= f21 && x <= f22) {
                            Track track4 = this.videoTrack;
                            if (track4.left > 0.01f || track4.right < 0.99f) {
                                return 4;
                            }
                        }
                    } else if (z) {
                        float f23 = this.px + this.ph;
                        float f24 = this.roundOffset;
                        float f25 = this.roundLeft;
                        float f26 = this.roundDuration;
                        float f27 = this.scroll;
                        float f28 = this.sw;
                        float f29 = (((((f25 * f26) + f24) - f27) / f5) * f28) + f23;
                        float f30 = f23 + ((((f24 + (this.roundRight * f26)) - f27) / f5) * f28);
                        if (this.roundSelected || this.videoTrack == null) {
                            if (x >= f29 - AndroidUtilities.dp(15.0f)) {
                                f2 = 5.0f;
                                if (x <= AndroidUtilities.dp(5.0f) + f29) {
                                    return 10;
                                }
                            } else {
                                f2 = 5.0f;
                            }
                            if (x >= f30 - AndroidUtilities.dp(f2) && x <= AndroidUtilities.dp(15.0f) + f30) {
                                return 11;
                            }
                            if (x >= f29 && x <= f30) {
                                return this.videoTrack == null ? 12 : 9;
                            }
                            float f31 = this.px + this.ph;
                            long j = this.roundOffset;
                            long j2 = this.scroll;
                            float f32 = this.sw;
                            float f33 = (((j - j2) / f5) * f32) + f31;
                            f30 = f31 + ((((j + this.roundDuration) - j2) / f5) * f32);
                            f29 = f33;
                        }
                        if (x >= f29 && x <= f30) {
                            return 9;
                        }
                    } else if (this.hasAudio) {
                        float f34 = this.px + this.ph;
                        float f35 = this.audioOffset;
                        float f36 = this.audioLeft;
                        float f37 = this.audioDuration;
                        float f38 = this.scroll;
                        float f39 = this.sw;
                        float f40 = (((((f36 * f37) + f35) - f38) / f5) * f39) + f34;
                        float f41 = f34 + ((((f35 + (this.audioRight * f37)) - f38) / f5) * f39);
                        if (this.audioSelected || (this.videoTrack == null && !this.hasRound)) {
                            if (x >= f40 - AndroidUtilities.dp(15.0f)) {
                                f = 5.0f;
                                if (x <= AndroidUtilities.dp(5.0f) + f40) {
                                    return 6;
                                }
                            } else {
                                f = 5.0f;
                            }
                            if (x >= f41 - AndroidUtilities.dp(f) && x <= AndroidUtilities.dp(15.0f) + f41) {
                                return 7;
                            }
                            if (x >= f40 && x <= f41) {
                                return this.videoTrack == null ? 8 : 5;
                            }
                            float f42 = this.px + this.ph;
                            long j3 = this.audioOffset;
                            long j4 = this.scroll;
                            float f43 = this.sw;
                            float f44 = (((j3 - j4) / f5) * f43) + f42;
                            f41 = f42 + ((((j3 + this.audioDuration) - j4) / f5) * f43);
                            f40 = f44;
                        }
                        if (x >= f40 && x <= f41) {
                            return 5;
                        }
                    }
                    Track track5 = this.videoTrack;
                    return track5 != null ? -1 : -1;
                }
            }
        }
        z = false;
        if (!z3) {
        }
        Track track52 = this.videoTrack;
        return track52 != null ? -1 : -1;
    }

    private void drawProgress(Canvas canvas, float f, float f2, long j, float f3) {
        float f4;
        if (this.isCover) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(j, getBaseDuration(), 0L);
        Track track = this.collageMain;
        if (track != null) {
            f4 = track.offset + (track.left * track.duration);
        } else {
            f4 = this.videoTrack == null ? this.audioOffset : 0L;
        }
        float f5 = this.px + this.ph + (this.sw * (((clamp + f4) - this.scroll) / min));
        float f6 = (((f2 - f) / 2.0f) / 2.0f) * (1.0f - f3);
        float f7 = f + f6;
        float f8 = f2 - f6;
        this.progressShadowPaint.setAlpha((int) (38.0f * f3));
        this.progressWhitePaint.setAlpha((int) (f3 * 255.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f5 - AndroidUtilities.dpf2(1.5f), f7, AndroidUtilities.dpf2(1.5f) + f5, f8);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.progressShadowPaint);
        rectF.set(f5 - AndroidUtilities.dpf2(1.5f), f7, f5 + AndroidUtilities.dpf2(1.5f), f8);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.progressWhitePaint);
    }

    private void drawRegion(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        if (f5 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f3 - AndroidUtilities.dp(10.0f), f, f4 + AndroidUtilities.dp(10.0f), f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, NotificationCenter.suggestedLangpack, 31);
        int i = (int) (255.0f * f5);
        this.regionPaint.setAlpha(i);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.regionPaint);
        rectF.inset(AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f), AndroidUtilities.dp(2.0f));
        if (this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.regionCutPaint);
        } else {
            canvas.drawRect(rectF, this.regionCutPaint);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint2 = paint != null ? paint : this.regionHandlePaint;
        this.regionHandlePaint.setAlpha(NotificationCenter.suggestedLangpack);
        paint2.setAlpha(i);
        float f6 = f + f2;
        float f7 = (f6 - dp2) / 2.0f;
        float f8 = (f6 + dp2) / 2.0f;
        rectF.set(f3 - ((AndroidUtilities.dp(this.isCover ? 2.0f : 10.0f) - dp) / 2.0f), f7, f3 - ((AndroidUtilities.dp(this.isCover ? 2.0f : 10.0f) + dp) / 2.0f), f8);
        if (!this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null && !this.isCover) {
                this.regionHandlePaint.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.regionHandlePaint);
            }
        }
        rectF.set(f4 + ((AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f) - dp) / 2.0f), f7, f4 + ((AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f) + dp) / 2.0f), f8);
        if (!this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null) {
                this.regionHandlePaint.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.regionHandlePaint);
            }
        }
        canvas.restore();
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.audioSelectedT.set(this.audioSelected));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        Track track = this.videoTrack;
        return Math.max(1L, (track == null && (track = this.collageMain) == null) ? this.hasRound ? this.roundDuration : this.audioDuration : track.duration);
    }

    private float getCollageHeight() {
        if (this.collageTracks.isEmpty()) {
            return 0.0f;
        }
        float f = 0.0f;
        for (int i = 0; i < this.collageTracks.size(); i++) {
            if (f > 0.0f) {
                f += AndroidUtilities.dp(4.0f);
            }
            f += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((Track) this.collageTracks.get(i)).selectedT.get());
        }
        return f;
    }

    private float getRoundHeight() {
        if (!this.hasRound) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.roundSelectedT.set(this.roundSelected));
    }

    private float getVideoHeight() {
        if (this.videoTrack == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), r0.selectedT.get());
    }

    public static int heightDp() {
        return 388;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Float f) {
        this.audioVolume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioVolumeChange(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioRemove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Float f) {
        this.roundVolume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundVolumeChange(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundRemove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$4(Float f) {
        this.videoTrack.volume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onVideoVolumeChange(f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$5(Track track, Float f) {
        track.volume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onVideoVolumeChange(track.index, f.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, View view) {
        int i;
        ItemOptions forceTop;
        float dp;
        RectF rectF;
        int i2 = this.pressType;
        if (i2 == 2 && this.hasAudio) {
            SliderView onValueChange = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.audioVolume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda4
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    TimelineView.this.lambda$new$0((Float) obj);
                }
            });
            long min = Math.min(getBaseDuration(), getMaxScrollDuration());
            int i3 = this.w;
            int i4 = this.px;
            int i5 = this.ph;
            float min2 = Math.min((i3 - i4) - i5, i4 + i5 + ((((this.audioOffset - this.scroll) + (AndroidUtilities.lerp(this.audioRight, 1.0f, this.audioSelectedT.get()) * this.audioDuration)) / min) * this.sw));
            forceTop = ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.this.lambda$new$1();
                }
            }).setGravity(5).forceTop(true);
            dp = (-(this.w - min2)) + AndroidUtilities.dp(18.0f);
            rectF = this.audioBounds;
        } else if (i2 == 1 && this.hasRound) {
            SliderView onValueChange2 = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.roundVolume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda6
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    TimelineView.this.lambda$new$2((Float) obj);
                }
            });
            long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
            int i6 = this.w;
            int i7 = this.px;
            int i8 = this.ph;
            float min4 = Math.min((i6 - i7) - i8, i7 + i8 + ((((this.roundOffset - this.scroll) + (AndroidUtilities.lerp(this.roundRight, 1.0f, this.roundSelectedT.get()) * this.roundDuration)) / min3) * this.sw));
            forceTop = ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange2).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.this.lambda$new$3();
                }
            }).setGravity(5).forceTop(true);
            dp = (-(this.w - min4)) + AndroidUtilities.dp(18.0f);
            rectF = this.roundBounds;
        } else if (i2 == 0 && this.videoTrack != null) {
            forceTop = ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.videoTrack.volume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda8
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    TimelineView.this.lambda$new$4((Float) obj);
                }
            })).setGravity(5).forceTop(true);
            dp = AndroidUtilities.dp(18.0f);
            rectF = this.videoBounds;
        } else {
            if (i2 != 3 || (i = this.pressCollageIndex) < 0 || i >= this.collageTracks.size()) {
                return;
            }
            final Track track = (Track) this.collageTracks.get(this.pressCollageIndex);
            forceTop = ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(track.volume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda9
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    TimelineView.this.lambda$new$5(track, (Float) obj);
                }
            })).setGravity(5).forceTop(true);
            dp = AndroidUtilities.dp(18.0f);
            rectF = track.bounds;
        }
        forceTop.translate(dp, rectF.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProgressAt$9(long j) {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onProgressChange(j, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupRoundThumbs$8() {
        VideoThumbsLoader videoThumbsLoader = this.roundThumbs;
        if (videoThumbsLoader == null || videoThumbsLoader.getDuration() <= 0) {
            return;
        }
        this.roundDuration = this.roundThumbs.getDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortCollage$7(Track track, Track track2) {
        return (int) (track2.duration - track.duration);
    }

    private long maxSelectDuration() {
        return this.maxCount * 59000;
    }

    private long minAudioSelect() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0131, code lost:
    
        r1.onAudioLeftChange(r22.audioLeft);
        r22.delegate.onAudioRightChange(r22.audioRight);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e7, code lost:
    
        if (r1 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        if (r1 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        if (r1 != null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void moveAudioOffset(float f) {
        float f2;
        long j;
        float f3;
        long j2;
        long j3;
        long j4;
        TimelineDelegate timelineDelegate;
        long j5;
        long j6;
        long clamp;
        long j7;
        long j8;
        long j9;
        TimelineDelegate timelineDelegate2;
        long j10;
        TimelineDelegate timelineDelegate3;
        long j11;
        long j12;
        float f4;
        Track track = this.videoTrack;
        if (track == null && !this.hasRound) {
            long j13 = this.audioOffset;
            long clamp2 = Utilities.clamp(j13 + ((long) f), 0L, -(this.audioDuration - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.audioOffset = clamp2;
            float f5 = clamp2 - j13;
            this.audioLeft = Utilities.clamp(this.audioLeft - (f5 / this.audioDuration), 1.0f, 0.0f);
            this.audioRight = Utilities.clamp(this.audioRight - (f5 / this.audioDuration), 1.0f, 0.0f);
            timelineDelegate = this.delegate;
        } else if (this.audioSelected) {
            if (track != null) {
                f2 = track.left;
                j = track.duration;
            } else {
                f2 = this.roundLeft;
                j = this.roundDuration;
            }
            float f6 = f2 * j;
            if (track != null) {
                f3 = track.right;
                j2 = track.duration;
            } else {
                f3 = this.roundRight;
                j2 = this.roundDuration;
            }
            float f7 = f3 * j2;
            float f8 = track != null ? (track.right - track.left) * track.duration : this.roundDuration * (this.roundRight - this.roundLeft);
            float f9 = this.audioRight;
            float f10 = this.audioDuration;
            long j14 = (long) (f7 - (f9 * f10));
            float f11 = this.audioLeft;
            long j15 = (long) (f6 - (f11 * f10));
            float min = Math.min(f9 - f11, f8 / f10);
            long j16 = this.audioOffset;
            long j17 = (long) f;
            long j18 = j16 + j17;
            if (j18 > j14) {
                float clamp3 = Utilities.clamp(((f7 - j16) - j17) / this.audioDuration, 1.0f, min);
                this.audioRight = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.audioLeft = clamp4;
                float f12 = this.audioRight;
                float f13 = this.audioDuration;
                long j19 = (long) (f7 - (f12 * f13));
                long j20 = (long) (f6 - (clamp4 * f13));
                if (j19 < j20) {
                    j6 = j20;
                    j5 = j19;
                } else {
                    j5 = j20;
                    j6 = j19;
                }
                this.audioOffset = Utilities.clamp(this.audioOffset + j17, j6, j5);
                timelineDelegate = this.delegate;
            } else if (j18 < j15) {
                float clamp5 = Utilities.clamp(((f6 - j16) - j17) / this.audioDuration, 1.0f - min, 0.0f);
                this.audioLeft = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.audioRight = clamp6;
                float f14 = this.audioDuration;
                long j21 = (long) (f7 - (clamp6 * f14));
                long j22 = (long) (f6 - (this.audioLeft * f14));
                if (j21 < j22) {
                    j4 = j22;
                    j3 = j21;
                } else {
                    j3 = j22;
                    j4 = j21;
                }
                this.audioOffset = Utilities.clamp(this.audioOffset + j17, j4, j3);
                timelineDelegate = this.delegate;
            } else {
                this.audioOffset = j18;
            }
        } else {
            long j23 = this.audioOffset + ((long) f);
            float baseDuration = getBaseDuration();
            float f15 = this.audioDuration;
            this.audioOffset = Utilities.clamp(j23, (long) (baseDuration - (this.audioRight * f15)), (long) ((-this.audioLeft) * f15));
        }
        invalidate();
        TimelineDelegate timelineDelegate4 = this.delegate;
        if (timelineDelegate4 != null) {
            timelineDelegate4.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
        }
        boolean z = this.dragged;
        if (!z && (timelineDelegate3 = this.delegate) != null) {
            timelineDelegate3.onProgressDragChange(true);
            Track track2 = this.videoTrack;
            if (track2 != null) {
                j11 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f16 = track2.right;
                float f17 = track2.duration;
                j12 = (long) (f16 * f17);
                f4 = track2.left * f17;
            } else if (this.hasRound) {
                j11 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f18 = this.roundRight;
                float f19 = this.roundDuration;
                j12 = (long) (f18 * f19);
                f4 = this.roundLeft * f19;
            } else {
                float f20 = this.audioLeft;
                long j24 = this.audioDuration;
                j10 = Utilities.clamp((long) (f20 * j24), j24, 0L);
                if (this.videoTrack != null && Math.abs(this.progress - j10) > 400) {
                    this.loopProgressFrom = this.progress;
                    this.loopProgress.set(1.0f, true);
                }
                timelineDelegate2 = this.delegate;
                this.progress = j10;
            }
            j10 = Utilities.clamp(j11, j12, (long) f4);
            if (this.videoTrack != null) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            timelineDelegate2 = this.delegate;
            this.progress = j10;
        } else {
            if (!z && !this.scrolling) {
                return;
            }
            Track track3 = this.videoTrack;
            if (track3 != null) {
                j7 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f21 = track3.right;
                float f22 = track3.duration;
                j8 = (long) (f21 * f22);
                j9 = (long) (track3.left * f22);
            } else if (!this.hasRound || track3 == null) {
                float f23 = this.audioLeft;
                long j25 = this.audioDuration;
                clamp = Utilities.clamp((long) (f23 * j25), j25, 0L);
                this.progress = clamp;
                timelineDelegate2 = this.delegate;
                if (timelineDelegate2 != null) {
                    return;
                } else {
                    j10 = this.progress;
                }
            } else {
                j7 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f24 = this.roundRight;
                float f25 = track3.duration;
                j8 = (long) (f24 * f25);
                j9 = (long) (this.roundLeft * f25);
            }
            clamp = Utilities.clamp(j7, j8, j9);
            this.progress = clamp;
            timelineDelegate2 = this.delegate;
            if (timelineDelegate2 != null) {
            }
        }
        timelineDelegate2.onProgressChange(j10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fd, code lost:
    
        r2.onVideoLeftChange(r22.index, r22.left);
        r21.delegate.onVideoRightChange(r22.index, r22.right);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fb, code lost:
    
        if (r2 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void moveCollageOffset(Track track, float f) {
        long clamp;
        TimelineDelegate timelineDelegate;
        long j;
        TimelineDelegate timelineDelegate2;
        long j2;
        long j3;
        TimelineDelegate timelineDelegate3;
        long j4;
        long j5;
        if (track == null) {
            return;
        }
        Track track2 = this.collageMain;
        if (track2 != track && track2 != null) {
            if (this.collageSelected == this.collageTracks.indexOf(track)) {
                Track track3 = this.collageMain;
                float f2 = track3.duration;
                float f3 = track.right;
                float f4 = track.duration;
                long j6 = (long) ((f2 * 1.0f) - (f3 * f4));
                float f5 = track.left;
                long j7 = (long) ((f2 * 0.0f) - (f5 * f4));
                float min = Math.min(f3 - f5, ((track3.right - track3.left) * f2) / f4);
                long j8 = track.offset;
                long j9 = (long) f;
                long j10 = j8 + j9;
                if (j10 > j6) {
                    float clamp2 = Utilities.clamp((((this.collageMain.right * r2.duration) - j8) - j9) / track.duration, 1.0f, min);
                    track.right = clamp2;
                    float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                    track.left = clamp3;
                    Track track4 = this.collageMain;
                    float f6 = track4.right;
                    float f7 = track4.duration;
                    float f8 = track.right;
                    float f9 = track.duration;
                    long j11 = (long) ((f6 * f7) - (f8 * f9));
                    long j12 = (long) ((track4.left * f7) - (clamp3 * f9));
                    if (j11 < j12) {
                        j5 = j12;
                        j4 = j11;
                    } else {
                        j4 = j12;
                        j5 = j11;
                    }
                    track.offset = Utilities.clamp(track.offset + j9, j5, j4);
                    timelineDelegate3 = this.delegate;
                } else if (j10 < j7) {
                    float clamp4 = Utilities.clamp((((this.collageMain.left * r2.duration) - j8) - j9) / track.duration, 1.0f - min, 0.0f);
                    track.left = clamp4;
                    float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                    track.right = clamp5;
                    Track track5 = this.collageMain;
                    float f10 = track5.right;
                    float f11 = track5.duration;
                    float f12 = track.duration;
                    long j13 = (long) ((f10 * f11) - (clamp5 * f12));
                    long j14 = (long) ((track5.left * f11) - (track.left * f12));
                    if (j13 < j14) {
                        j3 = j13;
                        j2 = j14;
                    } else {
                        j2 = j13;
                        j3 = j14;
                    }
                    track.offset = Utilities.clamp(track.offset + j9, j2, j3);
                    timelineDelegate3 = this.delegate;
                } else {
                    track.offset = j10;
                }
            } else {
                long j15 = track.offset + ((long) f);
                float baseDuration = getBaseDuration();
                float f13 = track.duration;
                track.offset = Utilities.clamp(j15, (long) (baseDuration - (track.right * f13)), (long) ((-track.left) * f13));
            }
        }
        invalidate();
        TimelineDelegate timelineDelegate4 = this.delegate;
        if (timelineDelegate4 != null) {
            timelineDelegate4.onVideoOffsetChange(track.index, track.offset);
        }
        boolean z = this.dragged;
        if (!z && (timelineDelegate2 = this.delegate) != null) {
            timelineDelegate2.onProgressDragChange(true);
            Track track6 = this.collageMain;
            if (track6 == track || track6 == null) {
                float f14 = track.left;
                long j16 = track.duration;
                j = Utilities.clamp((long) (f14 * j16), j16, 0L);
            } else {
                long j17 = track.offset + ((long) (track.left * track.duration));
                float f15 = track6.right;
                float f16 = track6.duration;
                j = Utilities.clamp(j17, (long) (f15 * f16), (long) (track6.left * f16));
            }
            Track track7 = this.collageMain;
            if (track7 != track && track7 != null && Math.abs(this.progress - j) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            timelineDelegate = this.delegate;
            this.progress = j;
        } else {
            if (!z && !this.scrolling) {
                return;
            }
            Track track8 = this.collageMain;
            if (track8 == track || track8 == null) {
                float f17 = track.left;
                long j18 = track.duration;
                clamp = Utilities.clamp((long) (f17 * j18), j18, 0L);
            } else {
                long j19 = track.offset + ((long) (track.left * track.duration));
                float f18 = track8.right;
                float f19 = track8.duration;
                clamp = Utilities.clamp(j19, (long) (f18 * f19), (long) (track8.left * f19));
            }
            this.progress = clamp;
            timelineDelegate = this.delegate;
            if (timelineDelegate == null) {
                return;
            } else {
                j = this.progress;
            }
        }
        timelineDelegate.onProgressChange(j, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0128, code lost:
    
        r1.onRoundLeftChange(r18.roundLeft);
        r18.delegate.onRoundRightChange(r18.roundRight);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0047, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0126, code lost:
    
        if (r1 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void moveRoundOffset(float f) {
        long j;
        long j2;
        TimelineDelegate timelineDelegate;
        long j3;
        long j4;
        long clamp;
        TimelineDelegate timelineDelegate2;
        long j5;
        TimelineDelegate timelineDelegate3;
        long j6;
        long j7;
        long j8;
        Track track = this.videoTrack;
        if (track == null) {
            long j9 = this.roundOffset;
            long clamp2 = Utilities.clamp(j9 + ((long) f), 0L, -(this.roundDuration - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.roundOffset = clamp2;
            float f2 = clamp2 - j9;
            this.roundLeft = Utilities.clamp(this.roundLeft - (f2 / this.roundDuration), 1.0f, 0.0f);
            this.roundRight = Utilities.clamp(this.roundRight - (f2 / this.roundDuration), 1.0f, 0.0f);
            timelineDelegate = this.delegate;
        } else if (this.roundSelected) {
            float f3 = track.right;
            float f4 = track.duration;
            float f5 = this.roundRight;
            float f6 = this.roundDuration;
            long j10 = (long) ((f3 * f4) - (f5 * f6));
            float f7 = track.left;
            float f8 = this.roundLeft;
            long j11 = (long) ((f7 * f4) - (f8 * f6));
            float min = Math.min(f5 - f8, ((f3 - f7) * f4) / f6);
            long j12 = this.roundOffset;
            long j13 = (long) f;
            long j14 = j12 + j13;
            if (j14 > j10) {
                float clamp3 = Utilities.clamp((((this.videoTrack.right * r1.duration) - j12) - j13) / this.roundDuration, 1.0f, min);
                this.roundRight = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.roundLeft = clamp4;
                Track track2 = this.videoTrack;
                float f9 = track2.right;
                float f10 = track2.duration;
                float f11 = this.roundRight;
                float f12 = this.roundDuration;
                long j15 = (long) ((f9 * f10) - (f11 * f12));
                long j16 = (long) ((track2.left * f10) - (clamp4 * f12));
                if (j15 < j16) {
                    j4 = j16;
                    j3 = j15;
                } else {
                    j3 = j16;
                    j4 = j15;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j13, j4, j3);
                timelineDelegate = this.delegate;
            } else if (j14 < j11) {
                float clamp5 = Utilities.clamp((((this.videoTrack.left * r1.duration) - j12) - j13) / this.roundDuration, 1.0f - min, 0.0f);
                this.roundLeft = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.roundRight = clamp6;
                Track track3 = this.videoTrack;
                float f13 = track3.right;
                float f14 = track3.duration;
                float f15 = this.roundDuration;
                long j17 = (long) ((f13 * f14) - (clamp6 * f15));
                long j18 = (long) ((track3.left * f14) - (this.roundLeft * f15));
                if (j17 < j18) {
                    j2 = j17;
                    j = j18;
                } else {
                    j = j17;
                    j2 = j18;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j13, j, j2);
                timelineDelegate = this.delegate;
            } else {
                this.roundOffset = j14;
            }
        } else {
            long j19 = this.roundOffset + ((long) f);
            float baseDuration = getBaseDuration();
            float f16 = this.roundDuration;
            this.roundOffset = Utilities.clamp(j19, (long) (baseDuration - (this.roundRight * f16)), (long) ((-this.roundLeft) * f16));
        }
        invalidate();
        TimelineDelegate timelineDelegate4 = this.delegate;
        if (timelineDelegate4 != null) {
            timelineDelegate4.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
        }
        boolean z = this.dragged;
        if (!z && (timelineDelegate3 = this.delegate) != null) {
            timelineDelegate3.onProgressDragChange(true);
            Track track4 = this.videoTrack;
            if (track4 != null) {
                j7 = this.roundOffset + ((long) (this.roundLeft * this.roundDuration));
                float f17 = track4.right;
                float f18 = track4.duration;
                j6 = (long) (f17 * f18);
                j8 = (long) (track4.left * f18);
            } else {
                float f19 = this.roundLeft;
                j6 = this.roundDuration;
                j7 = (long) (f19 * j6);
                j8 = 0;
            }
            j5 = Utilities.clamp(j7, j6, j8);
            if (this.videoTrack != null && Math.abs(this.progress - j5) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            timelineDelegate2 = this.delegate;
            this.progress = j5;
        } else {
            if (!z && !this.scrolling) {
                return;
            }
            Track track5 = this.videoTrack;
            if (track5 != null) {
                long j20 = this.roundOffset + ((long) (this.roundLeft * this.roundDuration));
                float f20 = track5.right;
                float f21 = track5.duration;
                clamp = Utilities.clamp(j20, (long) (f20 * f21), (long) (track5.left * f21));
            } else {
                float f22 = this.roundLeft;
                long j21 = this.roundDuration;
                clamp = Utilities.clamp((long) (f22 * j21), j21, 0L);
            }
            this.progress = clamp;
            timelineDelegate2 = this.delegate;
            if (timelineDelegate2 == null) {
                return;
            } else {
                j5 = this.progress;
            }
        }
        timelineDelegate2.onProgressChange(j5, false);
    }

    private boolean setProgressAt(float f, boolean z) {
        if (this.videoTrack == null && !this.hasAudio && this.collageTracks.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f2 = ((f - this.px) - this.ph) / this.sw;
        Track track = this.collageMain;
        long j = track != null ? (long) (track.offset + (track.left * track.duration)) : 0L;
        float f3 = f2 * min;
        if (track == null) {
            j = this.videoTrack == null ? this.audioOffset : 0L;
        }
        final long clamp = (long) Utilities.clamp((f3 - j) + this.scroll, getBaseDuration(), 0.0f);
        Track track2 = this.videoTrack;
        if (track2 != null) {
            float f4 = clamp / track2.duration;
            if (f4 < track2.left || f4 > track2.right) {
                return false;
            }
        }
        Track track3 = this.collageMain;
        if (track3 != null && (clamp < 0 || clamp >= ((long) ((track3.right - track3.left) * track3.duration)))) {
            return false;
        }
        if (this.hasAudio && track2 == null && this.collageTracks.isEmpty()) {
            float f5 = clamp / this.audioDuration;
            if (f5 < this.audioLeft || f5 > this.audioRight) {
                return false;
            }
        }
        this.progress = clamp;
        invalidate();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onProgressChange(clamp, z);
        }
        Runnable runnable = this.askExactSeek;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.askExactSeek = null;
        }
        if (!z) {
            return true;
        }
        Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                TimelineView.this.lambda$setProgressAt$9(clamp);
            }
        };
        this.askExactSeek = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 150L);
        return true;
    }

    private void setupAudioWaveform() {
        if (getMeasuredWidth() > 0) {
            if (this.waveform == null || this.resetWaveform) {
                this.waveform = new AudioWaveformLoader(this.audioPath, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.waveformIsLoaded = false;
                this.waveformMax.set(1.0f, true);
            }
        }
    }

    private void setupRoundThumbs() {
        if (getMeasuredWidth() <= 0 || this.roundThumbs != null) {
            return;
        }
        Track track = this.videoTrack;
        if (track == null || track.duration >= 1) {
            String str = this.roundPath;
            int i = this.w;
            int i2 = this.px;
            int i3 = (i - i2) - i2;
            int dp = AndroidUtilities.dp(38.0f);
            long j = this.roundDuration;
            Long valueOf = j > 2 ? Long.valueOf(j) : null;
            Track track2 = this.videoTrack;
            this.roundThumbs = new VideoThumbsLoader(false, str, i3, dp, valueOf, track2 != null ? track2.duration : getMaxScrollDuration(), -1L, -1L, new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.this.lambda$setupRoundThumbs$8();
                }
            });
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.scroller.computeScrollOffset()) {
            if (this.scrolling) {
                this.scrolling = false;
                TimelineDelegate timelineDelegate = this.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onProgressDragChange(false);
                    return;
                }
                return;
            }
            return;
        }
        int currX = this.scroller.getCurrX();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.scrollingVideo) {
            this.scroll = (long) Math.max(0.0f, (((currX - this.px) - this.ph) / this.sw) * min);
        } else {
            if (!this.audioSelected) {
                this.scroller.abortAnimation();
                return;
            }
            int i = this.px;
            int i2 = this.ph;
            float f = this.sw;
            float f2 = min;
            moveAudioOffset(((((currX - i) - i2) / f) * f2) - ((((this.wasScrollX - i) - i2) / f) * f2));
        }
        invalidate();
        this.wasScrollX = currX;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0689 A[LOOP:4: B:133:0x0689->B:139:0x06c8, LOOP_START, PHI: r2 r7
      0x0689: PHI (r2v196 int) = (r2v195 int), (r2v197 int) binds: [B:132:0x0687, B:139:0x06c8] A[DONT_GENERATE, DONT_INLINE]
      0x0689: PHI (r7v45 float) = (r7v44 float), (r7v46 float) binds: [B:132:0x0687, B:139:0x06c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0967 A[LOOP:6: B:219:0x0967->B:225:0x09a6, LOOP_START, PHI: r10 r13
      0x0967: PHI (r10v49 float) = (r10v48 float), (r10v50 float) binds: [B:218:0x0965, B:225:0x09a6] A[DONT_GENERATE, DONT_INLINE]
      0x0967: PHI (r13v31 int) = (r13v30 int), (r13v32 int) binds: [B:218:0x0965, B:225:0x09a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x10f1  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x12bb  */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1259  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x1270  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x1298  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x1264  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0f82  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0f99  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x109a  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0e3c  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void dispatchDraw(Canvas canvas) {
        long j;
        int contentHeight;
        int i;
        long clamp;
        long j2;
        long j3;
        long j4;
        TimelineDelegate timelineDelegate;
        Track track;
        Track track2;
        int i2;
        float f;
        float max;
        float f2;
        boolean z;
        float f3;
        float f4;
        Paint paint;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        long j5;
        float f12;
        float f13;
        float f14;
        float f15;
        long j6;
        long j7;
        float f16;
        float f17;
        Paint paint2;
        float f18;
        float f19;
        double d;
        float f20;
        float max2;
        float f21;
        float f22;
        Track track3;
        float f23;
        float f24;
        float f25;
        float f26;
        Track track4;
        long j8;
        Paint paint3;
        float f27;
        float lerp;
        float lerp2;
        Paint paint4;
        int multAlpha;
        Paint paint5;
        float f28;
        BlurringShader.BlurManager blurManager;
        long j9;
        float f29;
        float f30;
        float f31;
        Paint paint6;
        boolean z2;
        float f32;
        long j10;
        int i3;
        float f33;
        float f34;
        float f35;
        Track track5;
        float f36;
        float f37;
        Paint paint7;
        long j11;
        long j12;
        float f38;
        float f39;
        boolean z3;
        float f40;
        Paint paint8;
        float f41;
        Paint paint9;
        int i4;
        int i5;
        BlurringShader.BlurManager blurManager2;
        Canvas canvas2 = canvas;
        Paint paint10 = this.backgroundBlur.getPaint(1.0f);
        float f42 = this.openT.set(this.open);
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (f42 < 1.0f) {
            this.timelineBounds.set(this.px, (this.h - this.py) - AndroidUtilities.dp(28.0f), this.w - this.px, this.h - this.py);
            this.timelineClipPath.rewind();
            this.timelineClipPath.addRoundRect(this.timelineBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.saveLayerAlpha(this.timelineBounds, (int) ((1.0f - f42) * 255.0f), 31);
            canvas2.clipPath(this.timelineClipPath);
            if (this.blurManager.hasRenderNode()) {
                this.backgroundBlur.drawRect(canvas2);
            } else if (paint10 == null) {
                canvas2.drawColor(TLRPC.FLAG_30);
                if (this.collageWaveforms.isEmpty() && (blurManager2 = this.blurManager) != null && blurManager2.hasRenderNode()) {
                    float f43 = this.timelineWaveformMax.set(WaveformPath.getMaxBar(this.collageWaveforms));
                    WaveformPath waveformPath = this.timelineWaveformPath;
                    RectF rectF = this.timelineBounds;
                    waveformPath.check(this.px + this.ph + (((this.audioOffset - this.scroll) / min) * this.sw), rectF.left, rectF.right, 0.0f, AndroidUtilities.dp(28.0f), f43, this.timelineBounds.bottom, this.collageWaveforms);
                    canvas2.saveLayerAlpha(this.timelineBounds, 102, 31);
                    canvas2.clipPath(this.timelineWaveformPath);
                    this.audioWaveformBlur.drawRect(canvas2);
                    canvas.restore();
                } else if (!this.collageWaveforms.isEmpty()) {
                    Paint paint11 = this.audioWaveformBlur.getPaint(0.4f);
                    if (paint11 == null) {
                        paint11 = this.waveformPaint;
                        paint11.setAlpha(64);
                    }
                    float f44 = this.timelineWaveformMax.set(WaveformPath.getMaxBar(this.collageWaveforms));
                    WaveformPath waveformPath2 = this.timelineWaveformPath;
                    RectF rectF2 = this.timelineBounds;
                    waveformPath2.check(this.px + this.ph + (((this.audioOffset - this.scroll) / min) * this.sw), rectF2.left, rectF2.right, 0.0f, AndroidUtilities.dp(28.0f), f44, this.timelineBounds.bottom, this.collageWaveforms);
                    canvas2.drawPath(this.timelineWaveformPath, paint11);
                }
                float currentWidth = ((this.timelineText.getCurrentWidth() + AndroidUtilities.dp(3.66f)) + this.timelineIcon.getIntrinsicWidth()) / 2.0f;
                int centerX = (int) (this.timelineBounds.centerX() - currentWidth);
                int centerY = (int) this.timelineBounds.centerY();
                Drawable drawable = this.timelineIcon;
                drawable.setBounds(centerX, centerY - (drawable.getIntrinsicHeight() / 2), this.timelineIcon.getIntrinsicWidth() + centerX, (this.timelineIcon.getIntrinsicHeight() / 2) + centerY);
                this.timelineIcon.setAlpha(NotificationCenter.storiesSendAsUpdate);
                this.timelineIcon.draw(canvas2);
                this.timelineText.draw(canvas, (this.timelineBounds.centerX() - currentWidth) + this.timelineIcon.getIntrinsicWidth() + AndroidUtilities.dp(3.66f), centerY, -1, 0.75f);
                canvas.restore();
            } else {
                canvas2.drawRect(this.timelineBounds, paint10);
            }
            canvas2.drawColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
            if (this.collageWaveforms.isEmpty()) {
            }
            if (!this.collageWaveforms.isEmpty()) {
            }
            float currentWidth2 = ((this.timelineText.getCurrentWidth() + AndroidUtilities.dp(3.66f)) + this.timelineIcon.getIntrinsicWidth()) / 2.0f;
            int centerX2 = (int) (this.timelineBounds.centerX() - currentWidth2);
            int centerY2 = (int) this.timelineBounds.centerY();
            Drawable drawable2 = this.timelineIcon;
            drawable2.setBounds(centerX2, centerY2 - (drawable2.getIntrinsicHeight() / 2), this.timelineIcon.getIntrinsicWidth() + centerX2, (this.timelineIcon.getIntrinsicHeight() / 2) + centerY2);
            this.timelineIcon.setAlpha(NotificationCenter.storiesSendAsUpdate);
            this.timelineIcon.draw(canvas2);
            this.timelineText.draw(canvas, (this.timelineBounds.centerX() - currentWidth2) + this.timelineIcon.getIntrinsicWidth() + AndroidUtilities.dp(3.66f), centerY2, -1, 0.75f);
            canvas.restore();
        }
        if (f42 > 0.0f) {
            if (f42 < 1.0f) {
                f2 = 0.0f;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f42 * 255.0f), 31);
                z = true;
            } else {
                f2 = 0.0f;
                z = false;
            }
            Track track6 = this.videoTrack;
            float f45 = track6 != null ? 1.0f : 0.0f;
            float f46 = track6 != null ? track6.selectedT.set((this.audioSelected || this.roundSelected) ? false : true) : 0.0f;
            float f47 = this.h - this.py;
            float dp = AndroidUtilities.dp(4.0f);
            if (this.videoTrack != null) {
                canvas.save();
                float videoHeight = getVideoHeight();
                Track track7 = this.videoTrack;
                float f48 = track7.left;
                long j13 = track7.duration;
                float f49 = j13;
                float f50 = (f48 * f49 * f46) + f2;
                float f51 = (track7.right * f49 * f46) + f2;
                if (j13 <= 0) {
                    f40 = f50;
                } else {
                    f40 = f50;
                    f2 = (this.px + this.ph) - ((this.scroll / min) * this.sw);
                }
                float f52 = this.ph;
                float f53 = f2 - f52;
                if (j13 <= 0) {
                    f7 = f51;
                    paint8 = paint10;
                    f41 = 0.0f;
                } else {
                    f7 = f51;
                    paint8 = paint10;
                    f41 = this.px + r12 + (((j13 - this.scroll) / min) * this.sw);
                }
                this.videoBounds.set(f53, f47 - videoHeight, f41 + f52, f47);
                float f54 = f47 - ((dp * f45) + videoHeight);
                RectF rectF3 = this.videoBounds;
                float f55 = (rectF3.top * f46) + 0.0f;
                float f56 = (rectF3.bottom * f46) + 0.0f;
                this.videoClipPath.rewind();
                f8 = f56;
                this.videoClipPath.addRoundRect(this.videoBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(this.videoClipPath);
                VideoThumbsLoader videoThumbsLoader = this.videoTrack.thumbs;
                if (videoThumbsLoader != null) {
                    int frameWidth = videoThumbsLoader.getFrameWidth();
                    float f57 = frameWidth;
                    f3 = f46;
                    f4 = f45;
                    int max3 = (int) Math.max(0.0d, Math.floor((f53 - this.px) / f57));
                    int min2 = (int) Math.min(this.videoTrack.thumbs.count, Math.ceil(((r4 - f53) - this.px) / f57) + 1.0d);
                    int i6 = (int) this.videoBounds.top;
                    boolean z4 = this.videoTrack.thumbs.frames.size() >= min2;
                    boolean z5 = (frameWidth == 0 || !z4 || this.videoTrack.isRound) ? false : true;
                    if (z5) {
                        int i7 = max3;
                        i4 = i7;
                        while (true) {
                            if (i7 >= Math.min(this.videoTrack.thumbs.frames.size(), min2)) {
                                break;
                            }
                            if (((VideoThumbsLoader.BitmapFrame) this.videoTrack.thumbs.frames.get(i7)).bitmap == null) {
                                z5 = false;
                                break;
                            }
                            i7++;
                        }
                    } else {
                        i4 = max3;
                    }
                    if (!z5) {
                        if (this.blurManager.hasRenderNode()) {
                            this.backgroundBlur.drawRect(canvas2);
                            canvas2.drawColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
                        } else if (paint8 == null) {
                            canvas2.drawColor(TLRPC.FLAG_30);
                        } else {
                            paint9 = paint8;
                            canvas2.drawRect(this.videoBounds, paint9);
                            canvas2.drawColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
                            if (frameWidth != 0) {
                                int i8 = i4;
                                while (i8 < Math.min(this.videoTrack.thumbs.frames.size(), min2)) {
                                    VideoThumbsLoader.BitmapFrame bitmapFrame = (VideoThumbsLoader.BitmapFrame) this.videoTrack.thumbs.frames.get(i8);
                                    if (bitmapFrame.bitmap != null) {
                                        i5 = min2;
                                        this.videoFramePaint.setAlpha((int) (bitmapFrame.getAlpha() * 255.0f));
                                        canvas2.drawBitmap(bitmapFrame.bitmap, f53, i6 - ((int) ((r0.getHeight() - videoHeight) / 2.0f)), this.videoFramePaint);
                                    } else {
                                        i5 = min2;
                                    }
                                    f53 += f57;
                                    i8++;
                                    min2 = i5;
                                }
                            }
                            if (!z4) {
                                this.videoTrack.thumbs.load();
                            }
                        }
                    }
                    paint9 = paint8;
                    if (frameWidth != 0) {
                    }
                    if (!z4) {
                    }
                } else {
                    f3 = f46;
                    f4 = f45;
                    paint9 = paint8;
                }
                this.selectedVideoClipPath.rewind();
                if (this.isCover) {
                    f9 = f55;
                    paint = paint9;
                } else {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f58 = this.px + this.ph;
                    Track track8 = this.videoTrack;
                    float f59 = track8.left;
                    float f60 = track8.duration;
                    paint = paint9;
                    float f61 = this.scroll;
                    float f62 = min;
                    float f63 = this.sw;
                    float f64 = (((((f59 * f60) - f61) / f62) * f63) + f58) - (f59 <= 0.0f ? r4 : 0);
                    f9 = f55;
                    float f65 = this.h - this.py;
                    float f66 = f65 - videoHeight;
                    float f67 = track8.right;
                    rectF4.set(f64, f66, f58 + ((((f60 * f67) - f61) / f62) * f63) + (f67 >= 1.0f ? r4 : 0), f65);
                    this.selectedVideoClipPath.addRoundRect(rectF4, this.selectedVideoRadii, Path.Direction.CW);
                    canvas2.clipPath(this.selectedVideoClipPath, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas.restore();
                f6 = videoHeight;
                f5 = f40;
                f47 = f54;
            } else {
                f3 = f46;
                f4 = f45;
                paint = paint10;
                f5 = 0.0f;
                f6 = 0.0f;
                f7 = 0.0f;
                f8 = 0.0f;
                f9 = 0.0f;
            }
            if (this.collageTracks.isEmpty()) {
                f10 = dp;
                f11 = f6;
                j5 = min;
                f12 = 0.0f;
            } else {
                getCollageHeight();
                int i9 = 0;
                while (i9 < this.collageTracks.size()) {
                    Track track9 = (Track) this.collageTracks.get(i9);
                    float f68 = track9.selectedT.set((this.audioSelected || this.roundSelected || this.collageSelected != i9) ? false : true);
                    if (track9 != this.collageMain) {
                        int i10 = i9;
                        float f69 = min;
                        float lerp3 = this.px + this.ph + ((((track9.offset - this.scroll) + (AndroidUtilities.lerp(track9.left, 0.0f, f68) * track9.duration)) / f69) * this.sw);
                        f32 = dp;
                        f33 = this.px + this.ph + ((((track9.offset - this.scroll) + (AndroidUtilities.lerp(track9.right, 1.0f, f68) * track9.duration)) / f69) * this.sw);
                        j10 = min;
                        f34 = lerp3;
                        i3 = i10;
                    } else {
                        f32 = dp;
                        int i11 = i9;
                        float f70 = this.px + this.ph;
                        long j14 = track9.offset - this.scroll;
                        float f71 = min;
                        float f72 = this.sw;
                        float f73 = ((j14 / f71) * f72) + f70;
                        j10 = min;
                        i3 = i11;
                        f33 = f70 + (((j14 + track9.duration) / f71) * f72);
                        f34 = f73;
                    }
                    canvas.save();
                    float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), f68);
                    RectF rectF5 = track9.bounds;
                    float f74 = this.ph;
                    rectF5.set(f34 - f74, f47 - lerp4, f33 + f74, f47);
                    RectF rectF6 = track9.bounds;
                    f9 += rectF6.top * f68;
                    f8 += rectF6.bottom * f68;
                    float f75 = track9.offset;
                    float f76 = track9.left;
                    float f77 = track9.duration;
                    float f78 = f5 + (((f76 * f77) + f75) * f68);
                    f7 += (f75 + (track9.right * f77)) * f68;
                    this.collageClipPath.rewind();
                    this.collageClipPath.addRoundRect(track9.bounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(this.collageClipPath);
                    VideoThumbsLoader videoThumbsLoader2 = track9.thumbs;
                    if (videoThumbsLoader2 != null) {
                        long j15 = track9.duration;
                        if (j15 <= 0) {
                            j12 = j10;
                            f38 = 0.0f;
                        } else {
                            j12 = j10;
                            f38 = this.px + this.ph + (((track9.offset - this.scroll) / j12) * this.sw);
                        }
                        float f79 = this.ph;
                        float f80 = f38 - f79;
                        if (j15 <= 0) {
                            f36 = f78;
                            f37 = f6;
                            f39 = 0.0f;
                        } else {
                            f36 = f78;
                            f37 = f6;
                            f39 = this.px + r11 + ((((track9.offset + j15) - this.scroll) / j12) * this.sw);
                        }
                        float f81 = f39 + f79;
                        int frameWidth2 = videoThumbsLoader2.getFrameWidth();
                        f35 = lerp4;
                        track5 = track9;
                        float f82 = f80 - ((this.px + this.ph) + (((track9.offset - this.scroll) / j12) * this.sw));
                        float f83 = frameWidth2;
                        j10 = j12;
                        int max4 = (int) Math.max(0.0d, Math.floor(f82 / f83));
                        int min3 = (int) Math.min(track5.thumbs.count, Math.ceil((f81 - f80) / f83) + 1.0d);
                        int i12 = (int) track5.bounds.top;
                        boolean z6 = track5.thumbs.frames.size() >= min3;
                        if (z6) {
                            for (int i13 = max4; i13 < Math.min(track5.thumbs.frames.size(), min3); i13++) {
                                if (((VideoThumbsLoader.BitmapFrame) track5.thumbs.frames.get(i13)).bitmap == null) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = z6;
                        if (!z3) {
                            if (this.blurManager.hasRenderNode()) {
                                this.backgroundBlur.drawRect(canvas2);
                                canvas2.drawColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
                            } else if (paint == null) {
                                canvas2.drawColor(TLRPC.FLAG_30);
                            } else {
                                paint7 = paint;
                                canvas2.drawRect(track5.bounds, paint7);
                                canvas2.drawColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
                                if (frameWidth2 != 0) {
                                    while (max4 < Math.min(track5.thumbs.frames.size(), min3)) {
                                        VideoThumbsLoader.BitmapFrame bitmapFrame2 = (VideoThumbsLoader.BitmapFrame) track5.thumbs.frames.get(max4);
                                        if (bitmapFrame2.bitmap != null) {
                                            this.collageFramePaint.setAlpha((int) (bitmapFrame2.getAlpha() * 255.0f));
                                            canvas2.drawBitmap(bitmapFrame2.bitmap, f80, i12 - ((int) ((r1.getHeight() - f35) / 2.0f)), this.collageFramePaint);
                                        }
                                        f80 += f83;
                                        max4++;
                                    }
                                }
                                if (!z6) {
                                    track5.thumbs.load();
                                }
                            }
                        }
                        paint7 = paint;
                        if (frameWidth2 != 0) {
                        }
                        if (!z6) {
                        }
                    } else {
                        f35 = lerp4;
                        track5 = track9;
                        f36 = f78;
                        f37 = f6;
                        paint7 = paint;
                    }
                    this.selectedCollageClipPath.rewind();
                    if (this.isCover) {
                        paint = paint7;
                        j11 = j10;
                    } else {
                        RectF rectF7 = AndroidUtilities.rectTmp;
                        float f84 = this.px + this.ph;
                        float f85 = track5.left;
                        float f86 = track5.duration;
                        float f87 = this.scroll;
                        paint = paint7;
                        float f88 = track5.offset;
                        long j16 = j10;
                        float f89 = j16;
                        j11 = j16;
                        float f90 = this.sw;
                        float f91 = ((((((f85 * f86) - f87) + f88) / f89) * f90) + f84) - (f85 <= 0.0f ? r3 : 0);
                        RectF rectF8 = track5.bounds;
                        float f92 = rectF8.top;
                        float f93 = track5.right;
                        rectF7.set(f91, f92, f84 + (((((f86 * f93) - f87) + f88) / f89) * f90) + (f93 >= 1.0f ? r3 : 0), rectF8.bottom);
                        this.selectedCollageClipPath.addRoundRect(rectF7, this.selectedVideoRadii, Path.Direction.CW);
                        canvas2.clipPath(this.selectedCollageClipPath, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas.restore();
                    f47 -= (f32 * 1.0f) + f35;
                    i9 = i3 + 1;
                    dp = f32;
                    f5 = f36;
                    f6 = f37;
                    min = j11;
                }
                f10 = dp;
                f11 = f6;
                j5 = min;
                f12 = 1.0f;
            }
            float f94 = this.roundT.set(this.hasRound);
            float f95 = this.roundSelectedT.set(this.hasRound && this.roundSelected);
            float roundHeight = getRoundHeight() * f94;
            float f96 = ((this.videoTrack == null && !this.hasAudio && this.collageTracks.isEmpty()) ? 1.0f : f95) * f94;
            if (f94 > 0.0f) {
                long j17 = this.roundOffset;
                float f97 = j17;
                float f98 = this.roundLeft;
                float f99 = this.roundDuration;
                float f100 = f5 + ((f97 + (f98 * f99)) * f96);
                f7 += (f97 + (this.roundRight * f99)) * f96;
                if (this.videoTrack != null) {
                    float f101 = this.px + this.ph;
                    float lerp5 = (j17 - this.scroll) + (AndroidUtilities.lerp(f98, 0.0f, f95) * this.roundDuration);
                    long j18 = j5;
                    float f102 = j18;
                    f29 = f101 + ((lerp5 / f102) * this.sw);
                    f30 = this.px + this.ph + ((((this.roundOffset - this.scroll) + (AndroidUtilities.lerp(this.roundRight, 1.0f, f95) * this.roundDuration)) / f102) * this.sw);
                    f15 = f94;
                    j9 = j18;
                } else {
                    j9 = j5;
                    float f103 = this.px + this.ph;
                    f15 = f94;
                    long j19 = j17 - this.scroll;
                    float f104 = j9;
                    float f105 = this.sw;
                    f29 = ((j19 / f104) * f105) + f103;
                    f30 = (((j19 + r13) / f104) * f105) + f103;
                }
                RectF rectF9 = this.roundBounds;
                float f106 = this.ph;
                rectF9.set(f29 - f106, f47 - roundHeight, f30 + f106, f47);
                float f107 = f47 - ((f10 * f15) + roundHeight);
                RectF rectF10 = this.roundBounds;
                f9 += rectF10.top * f96;
                f8 += rectF10.bottom * f96;
                this.roundClipPath.rewind();
                this.roundClipPath.addRoundRect(this.roundBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.save();
                canvas2 = canvas;
                canvas2.clipPath(this.roundClipPath);
                VideoThumbsLoader videoThumbsLoader3 = this.roundThumbs;
                if (videoThumbsLoader3 != null) {
                    long j20 = this.roundDuration;
                    float f108 = j20 <= 0 ? 0.0f : this.px + this.ph + (((this.roundOffset - this.scroll) / j9) * this.sw);
                    float f109 = this.ph;
                    float f110 = f108 - f109;
                    float f111 = (j20 <= 0 ? 0.0f : ((((this.roundOffset + j20) - this.scroll) / j9) * this.sw) + this.px + r12) + f109;
                    int frameWidth3 = videoThumbsLoader3.getFrameWidth();
                    float f112 = frameWidth3;
                    f14 = f12;
                    int max5 = (int) Math.max(0.0d, Math.floor((f110 - (this.videoTrack != null ? (this.px + this.ph) + (((this.roundOffset - this.scroll) / j9) * this.sw) : this.px)) / f112));
                    int min4 = (int) Math.min(this.roundThumbs.count, Math.ceil((f111 - f110) / f112) + 1.0d);
                    int i14 = (int) this.roundBounds.top;
                    boolean z7 = this.roundThumbs.frames.size() >= min4;
                    if (z7) {
                        for (int i15 = max5; i15 < Math.min(this.roundThumbs.frames.size(), min4); i15++) {
                            if (((VideoThumbsLoader.BitmapFrame) this.roundThumbs.frames.get(i15)).bitmap == null) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = z7;
                    if (!z2) {
                        if (this.blurManager.hasRenderNode()) {
                            this.backgroundBlur.drawRect(canvas2);
                            canvas2.drawColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
                        } else if (paint == null) {
                            canvas2.drawColor(TLRPC.FLAG_30);
                        } else {
                            f31 = f107;
                            paint6 = paint;
                            canvas2.drawRect(this.roundBounds, paint6);
                            canvas2.drawColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
                            if (frameWidth3 != 0) {
                                while (max5 < Math.min(this.roundThumbs.frames.size(), min4)) {
                                    VideoThumbsLoader.BitmapFrame bitmapFrame3 = (VideoThumbsLoader.BitmapFrame) this.roundThumbs.frames.get(max5);
                                    if (bitmapFrame3.bitmap != null) {
                                        this.videoFramePaint.setAlpha((int) (bitmapFrame3.getAlpha() * 255.0f));
                                        canvas2.drawBitmap(bitmapFrame3.bitmap, f110, i14 - ((int) ((r2.getHeight() - roundHeight) / 2.0f)), this.videoFramePaint);
                                    }
                                    f110 += f112;
                                    max5++;
                                }
                            }
                            if (!z7) {
                                this.roundThumbs.load();
                            }
                        }
                    }
                    f31 = f107;
                    paint6 = paint;
                    if (frameWidth3 != 0) {
                    }
                    if (!z7) {
                    }
                } else {
                    f31 = f107;
                    f14 = f12;
                    paint6 = paint;
                }
                this.selectedVideoClipPath.rewind();
                RectF rectF11 = AndroidUtilities.rectTmp;
                int i16 = this.px;
                int i17 = this.ph;
                float f113 = i16 + i17;
                float f114 = this.roundLeft;
                float f115 = this.roundDuration;
                float f116 = this.scroll;
                float f117 = this.roundOffset;
                float f118 = j9;
                float f119 = this.sw;
                float f120 = ((((((f114 * f115) - f116) + f117) / f118) * f119) + f113) - (f114 <= 0.0f ? i17 : 0);
                float f121 = i17 * (1.0f - f95);
                float f122 = f120 - f121;
                paint = paint6;
                RectF rectF12 = this.roundBounds;
                long j21 = j9;
                float f123 = rectF12.top;
                float f124 = this.roundRight;
                float f125 = f113 + (((((f115 * f124) - f116) + f117) / f118) * f119);
                if (f124 < 1.0f) {
                    i17 = 0;
                }
                rectF11.set(f122, f123, f125 + i17 + f121, rectF12.bottom);
                this.selectedVideoClipPath.addRoundRect(rectF11, this.selectedVideoRadii, Path.Direction.CW);
                canvas2.clipPath(this.selectedVideoClipPath, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas.restore();
                f5 = f100;
                f13 = f31;
                j6 = j21;
            } else {
                f13 = f47;
                f14 = f12;
                f15 = f94;
                j6 = j5;
            }
            float f126 = this.audioT.set(this.hasAudio);
            float f127 = this.audioSelectedT.set(this.hasAudio && this.audioSelected);
            float audioHeight = getAudioHeight() * f126;
            float f128 = ((this.videoTrack == null && !this.hasRound && this.collageTracks.isEmpty()) ? 1.0f : f127) * f126;
            if (f126 > 0.0f) {
                float f129 = this.audioOffset;
                float f130 = this.audioLeft;
                float f131 = this.audioDuration;
                float f132 = f5 + (((f130 * f131) + f129) * f128);
                f7 += (f129 + (this.audioRight * f131)) * f128;
                Paint paint12 = this.audioBlur.getPaint(f126);
                canvas.save();
                if (this.videoTrack == null && !this.hasRound && this.collageTracks.isEmpty()) {
                    float f133 = this.px + this.ph;
                    long j22 = this.audioOffset - this.scroll;
                    float f134 = j6;
                    f17 = f95;
                    float f135 = this.sw;
                    lerp = ((j22 / f134) * f135) + f133;
                    paint3 = paint12;
                    f27 = f128;
                    lerp2 = f133 + (((j22 + this.audioDuration) / f134) * f135);
                } else {
                    paint3 = paint12;
                    f27 = f128;
                    f17 = f95;
                    float f136 = j6;
                    lerp = this.px + this.ph + ((((this.audioOffset - this.scroll) + (AndroidUtilities.lerp(this.audioLeft, 0.0f, f127) * this.audioDuration)) / f136) * this.sw);
                    lerp2 = this.px + this.ph + ((((this.audioOffset - this.scroll) + (AndroidUtilities.lerp(this.audioRight, 1.0f, f127) * this.audioDuration)) / f136) * this.sw);
                }
                RectF rectF13 = this.audioBounds;
                float f137 = this.ph;
                rectF13.set(lerp - f137, f13 - audioHeight, f137 + lerp2, f13);
                RectF rectF14 = this.audioBounds;
                f9 += rectF14.top * f27;
                f8 += rectF14.bottom * f27;
                this.audioClipPath.rewind();
                this.audioClipPath.addRoundRect(this.audioBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(this.audioClipPath);
                BlurringShader.BlurManager blurManager3 = this.blurManager;
                if (blurManager3 != null && blurManager3.hasRenderNode()) {
                    this.backgroundBlur.drawRect(canvas2);
                    multAlpha = Theme.multAlpha(AndroidUtilities.DARK_STATUS_BAR_OVERLAY, f126);
                } else if (paint3 == null) {
                    multAlpha = Theme.multAlpha(TLRPC.FLAG_30, f126);
                } else {
                    paint4 = paint3;
                    canvas2.drawRect(this.audioBounds, paint4);
                    canvas2.drawColor(Theme.multAlpha(AndroidUtilities.DARK_STATUS_BAR_OVERLAY, f126));
                    if (this.waveform == null && (blurManager = this.blurManager) != null && blurManager.hasRenderNode()) {
                        float f138 = this.waveformMax.set(this.waveform.getMaxBar(), !this.waveformIsLoaded);
                        this.waveformIsLoaded = this.waveform.getLoadedCount() > 0;
                        paint2 = paint;
                        this.waveformPath.check(this.px + this.ph + (((this.audioOffset - this.scroll) / j6) * this.sw), lerp, lerp2, f127, j6, audioHeight, f138, this.audioBounds.bottom, this.waveform);
                        canvas2.saveLayerAlpha(this.audioBounds, 102, 31);
                        canvas2.clipPath(this.waveformPath);
                        this.audioWaveformBlur.drawRect(canvas2);
                        canvas.restore();
                    } else {
                        paint2 = paint;
                        if (this.waveform != null && paint4 != null) {
                            paint5 = this.audioWaveformBlur.getPaint(0.4f * f126);
                            if (paint5 == null) {
                                paint5 = this.waveformPaint;
                                paint5.setAlpha((int) (64.0f * f126));
                            }
                            float f139 = this.waveformMax.set(this.waveform.getMaxBar(), !this.waveformIsLoaded);
                            this.waveformIsLoaded = this.waveform.getLoadedCount() <= 0;
                            this.waveformPath.check(this.px + this.ph + (((this.audioOffset - this.scroll) / j6) * this.sw), lerp, lerp2, f127, j6, audioHeight, f139, this.audioBounds.bottom, this.waveform);
                            canvas2.drawPath(this.waveformPath, paint5);
                        }
                    }
                    if (f127 >= 1.0f) {
                        int i18 = this.px;
                        float f140 = this.ph + i18;
                        float f141 = this.audioOffset - this.scroll;
                        float f142 = this.audioLeft;
                        float f143 = this.audioDuration;
                        float f144 = j6;
                        float f145 = this.sw;
                        float f146 = ((((f142 * f143) + f141) / f144) * f145) + f140;
                        float f147 = f140 + (((f141 + (this.audioRight * f143)) / f144) * f145);
                        float max6 = (Math.max(i18, f146) + Math.min(this.w - this.px, f147)) / 2.0f;
                        float centerY3 = this.audioBounds.centerY();
                        float max7 = Math.max(0.0f, (Math.min(this.w - this.px, f147) - Math.max(this.px, f146)) - AndroidUtilities.dp(24.0f));
                        float dpf2 = AndroidUtilities.dpf2(13.0f) + ((this.audioAuthor == null && this.audioTitle == null) ? 0.0f : AndroidUtilities.dpf2(3.11f) + this.audioAuthorWidth + AndroidUtilities.dpf2(9.66f) + this.audioTitleWidth);
                        boolean z8 = dpf2 < max7;
                        float min5 = max6 - (Math.min(dpf2, max7) / 2.0f);
                        this.audioIcon.setBounds((int) min5, (int) (centerY3 - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + min5), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + centerY3));
                        float f148 = 1.0f - f127;
                        float f149 = f148 * 255.0f;
                        this.audioIcon.setAlpha((int) f149);
                        this.audioIcon.draw(canvas2);
                        float dpf22 = min5 + AndroidUtilities.dpf2(16.11f);
                        j7 = j6;
                        d = 0.0d;
                        f19 = f3;
                        f16 = f127;
                        f18 = f4;
                        canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, NotificationCenter.suggestedLangpack, 31);
                        float min6 = Math.min(f147, this.w) - AndroidUtilities.dp(12.0f);
                        canvas2.clipRect(dpf22, 0.0f, min6, this.h);
                        if (this.audioAuthor != null) {
                            canvas.save();
                            canvas2.translate(dpf22 - this.audioAuthorLeft, centerY3 - (this.audioAuthor.getHeight() / 2.0f));
                            this.audioAuthorPaint.setAlpha((int) (f149 * f126));
                            this.audioAuthor.draw(canvas2);
                            canvas.restore();
                            f28 = dpf22 + this.audioAuthorWidth;
                        } else {
                            f28 = dpf22;
                        }
                        if (this.audioAuthor != null && this.audioTitle != null) {
                            float dpf23 = f28 + AndroidUtilities.dpf2(3.66f);
                            int alpha = this.audioDotPaint.getAlpha();
                            this.audioDotPaint.setAlpha((int) (alpha * f148));
                            canvas2.drawCircle(AndroidUtilities.dp(1.0f) + dpf23, centerY3, AndroidUtilities.dp(1.0f), this.audioDotPaint);
                            this.audioDotPaint.setAlpha(alpha);
                            f28 = dpf23 + AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(4.0f);
                        }
                        if (this.audioTitle != null) {
                            canvas.save();
                            canvas2.translate(f28 - this.audioTitleLeft, centerY3 - (this.audioTitle.getHeight() / 2.0f));
                            this.audioTitlePaint.setAlpha((int) (f149 * f126));
                            this.audioTitle.draw(canvas2);
                            canvas.restore();
                        }
                        if (!z8) {
                            this.ellipsizeMatrix.reset();
                            this.ellipsizeMatrix.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                            this.ellipsizeMatrix.postTranslate(min6 - AndroidUtilities.dp(8.0f), 0.0f);
                            this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
                            RectF rectF15 = this.audioBounds;
                            canvas.drawRect(min6 - AndroidUtilities.dp(8.0f), rectF15.top, min6, rectF15.bottom, this.ellipsizePaint);
                        }
                        canvas.restore();
                    } else {
                        j7 = j6;
                        f16 = f127;
                        f18 = f4;
                        f19 = f3;
                        d = 0.0d;
                    }
                    canvas.restore();
                    f5 = f132;
                }
                canvas2.drawColor(multAlpha);
                paint4 = paint3;
                if (this.waveform == null) {
                }
                paint2 = paint;
                if (this.waveform != null) {
                    paint5 = this.audioWaveformBlur.getPaint(0.4f * f126);
                    if (paint5 == null) {
                    }
                    float f1392 = this.waveformMax.set(this.waveform.getMaxBar(), !this.waveformIsLoaded);
                    this.waveformIsLoaded = this.waveform.getLoadedCount() <= 0;
                    this.waveformPath.check(this.px + this.ph + (((this.audioOffset - this.scroll) / j6) * this.sw), lerp, lerp2, f127, j6, audioHeight, f1392, this.audioBounds.bottom, this.waveform);
                    canvas2.drawPath(this.waveformPath, paint5);
                }
                if (f127 >= 1.0f) {
                }
                canvas.restore();
                f5 = f132;
            } else {
                j7 = j6;
                f16 = f127;
                f17 = f95;
                paint2 = paint;
                f18 = f4;
                f19 = f3;
                d = 0.0d;
            }
            float f150 = f9;
            float f151 = this.px + this.ph;
            float f152 = this.scroll;
            long j23 = j7;
            float f153 = j23;
            float f154 = this.sw;
            float f155 = f151 + (((f5 - f152) / f153) * f154);
            float f156 = f151 + (((f7 - f152) / f153) * f154);
            if (!this.collageTracks.isEmpty()) {
                max2 = f14;
            } else if (this.hasAudio && this.videoTrack == null) {
                max2 = f126;
            } else {
                f20 = f15;
                max2 = Math.max(f18, f20);
                if (f126 <= d || f20 > d || f18 > d || f14 > d) {
                    if (this.videoTrack == null || this.hasRound || !this.collageTracks.isEmpty()) {
                        f21 = f16;
                        f22 = 1.0f;
                    } else {
                        f21 = f16;
                        f22 = AndroidUtilities.lerp(0.6f, 1.0f, f21) * f126;
                    }
                    drawRegion(canvas, paint2, f150, f8, f155, f156, f22 * max2);
                    track3 = this.videoTrack;
                    if (track3 == null && ((this.hasAudio || this.hasRound) && (f21 > 0.0f || f17 > 0.0f))) {
                        float f157 = this.h - this.py;
                        float f158 = this.ph + this.px;
                        float f159 = track3.left;
                        float f160 = track3.duration;
                        float f161 = this.scroll;
                        float f162 = this.sw;
                        drawRegion(canvas, paint2, f157 - f11, f157, f158 + ((((f159 * f160) - f161) / f153) * f162), f158 + ((((track3.right * f160) - f161) / f153) * f162), 0.8f);
                    } else if (this.collageMain != null && this.collageTracks.size() > 1) {
                        Track track10 = this.collageMain;
                        RectF rectF16 = track10.bounds;
                        float f163 = rectF16.top;
                        float f164 = rectF16.bottom;
                        float f165 = this.ph + this.px;
                        float f166 = track10.offset;
                        float f167 = track10.left;
                        float f168 = track10.duration;
                        j = j23;
                        float f169 = this.scroll;
                        float f170 = this.sw;
                        drawRegion(canvas, paint2, f163, f164, (((((f167 * f168) + f166) - f169) / f153) * f170) + f165, f165 + ((((f166 + (track10.right * f168)) - f169) / f153) * f170), 0.8f);
                        if (this.maxCount > 1 && (track4 = this.videoTrack) != null) {
                            float f171 = track4.duration;
                            float f172 = track4.right;
                            float f173 = track4.left;
                            j8 = (long) ((f172 - f173) * f171);
                            if (j8 > 68999) {
                                float f174 = this.px + this.ph;
                                float f175 = this.scroll;
                                float f176 = this.sw;
                                float f177 = ((((f173 * f171) - f175) / f153) * f176) + f174;
                                float f178 = f174 + ((((f172 * f171) - f175) / f153) * f176);
                                canvas.save();
                                float f179 = this.h - this.py;
                                canvas2.clipRect(f177, f179 - f11, f178, f179);
                                this.regionPaint.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f19) * 255.0f));
                                long j24 = 59000;
                                int min7 = (int) Math.min(this.maxCount - 1, j8 / 59000);
                                int i19 = 1;
                                while (i19 <= min7) {
                                    if (Math.min(j24, j8 - (i19 * j24)) < 1000) {
                                        break;
                                    }
                                    float f180 = this.px + this.ph;
                                    Track track11 = this.videoTrack;
                                    float f181 = f180 + ((((((long) (track11.duration * track11.left)) + r0) - this.scroll) / f153) * this.sw);
                                    canvas.drawRect(f181, (this.h - this.py) - f11, f181 + AndroidUtilities.dp(1.0f), this.h - this.py, this.regionPaint);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("#");
                                    i19++;
                                    sb.append(i19);
                                    canvas2.drawText(sb.toString(), f181 + AndroidUtilities.dp(2.0f), ((this.h - this.py) - f11) + AndroidUtilities.dp(14.0f), this.countTextPaint);
                                    j24 = 59000;
                                }
                                canvas.restore();
                            }
                        }
                        f23 = this.loopProgress.set(0.0f);
                        float contentHeight2 = ((this.h - getContentHeight()) + this.py) - AndroidUtilities.dpf2(2.3f);
                        float dpf24 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
                        if (f23 > 0.0f) {
                            long j25 = this.loopProgressFrom;
                            if (j25 == -1) {
                                Track track12 = this.videoTrack;
                                if (track12 != null) {
                                    f26 = track12.duration * track12.right;
                                } else {
                                    Track track13 = this.collageMain;
                                    if (track13 != null) {
                                        f26 = track13.duration * (track13.right - track13.left);
                                    } else {
                                        if (this.hasRound) {
                                            f24 = this.roundDuration;
                                            f25 = this.roundRight;
                                        } else {
                                            f24 = this.audioDuration;
                                            f25 = this.audioRight;
                                        }
                                        j25 = (long) (f24 * f25);
                                    }
                                }
                                j25 = (long) f26;
                            }
                            drawProgress(canvas, contentHeight2, dpf24, j25, f23 * max2);
                        }
                        drawProgress(canvas, contentHeight2, dpf24, this.progress, (1.0f - f23) * max2);
                    }
                    j = j23;
                    if (this.maxCount > 1) {
                        float f1712 = track4.duration;
                        float f1722 = track4.right;
                        float f1732 = track4.left;
                        j8 = (long) ((f1722 - f1732) * f1712);
                        if (j8 > 68999) {
                        }
                    }
                    f23 = this.loopProgress.set(0.0f);
                    float contentHeight22 = ((this.h - getContentHeight()) + this.py) - AndroidUtilities.dpf2(2.3f);
                    float dpf242 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
                    if (f23 > 0.0f) {
                    }
                    drawProgress(canvas, contentHeight22, dpf242, this.progress, (1.0f - f23) * max2);
                } else {
                    j = j23;
                }
                if (z) {
                    canvas.restore();
                }
            }
            f20 = f15;
            if (f126 <= d) {
            }
            if (this.videoTrack == null) {
            }
            f21 = f16;
            f22 = 1.0f;
            drawRegion(canvas, paint2, f150, f8, f155, f156, f22 * max2);
            track3 = this.videoTrack;
            if (track3 == null) {
            }
            if (this.collageMain != null) {
                Track track102 = this.collageMain;
                RectF rectF162 = track102.bounds;
                float f1632 = rectF162.top;
                float f1642 = rectF162.bottom;
                float f1652 = this.ph + this.px;
                float f1662 = track102.offset;
                float f1672 = track102.left;
                float f1682 = track102.duration;
                j = j23;
                float f1692 = this.scroll;
                float f1702 = this.sw;
                drawRegion(canvas, paint2, f1632, f1642, (((((f1672 * f1682) + f1662) - f1692) / f153) * f1702) + f1652, f1652 + ((((f1662 + (track102.right * f1682)) - f1692) / f153) * f1702), 0.8f);
                if (this.maxCount > 1) {
                }
                f23 = this.loopProgress.set(0.0f);
                float contentHeight222 = ((this.h - getContentHeight()) + this.py) - AndroidUtilities.dpf2(2.3f);
                float dpf2422 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
                if (f23 > 0.0f) {
                }
                drawProgress(canvas, contentHeight222, dpf2422, this.progress, (1.0f - f23) * max2);
                if (z) {
                }
            }
            j = j23;
            if (this.maxCount > 1) {
            }
            f23 = this.loopProgress.set(0.0f);
            float contentHeight2222 = ((this.h - getContentHeight()) + this.py) - AndroidUtilities.dpf2(2.3f);
            float dpf24222 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
            if (f23 > 0.0f) {
            }
            drawProgress(canvas, contentHeight2222, dpf24222, this.progress, (1.0f - f23) * max2);
            if (z) {
            }
        } else {
            j = min;
        }
        if (this.dragged) {
            float f182 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            long j26 = j;
            float f183 = this.dragSpeed;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / this.sw) * j26 * f182 * f183);
            if (this.isCover) {
                this.dragSpeed = f183 + (f182 * 0.25f);
            }
            int i20 = this.pressHandle;
            if (i20 == 4 && (track2 = this.videoTrack) != null) {
                float f184 = track2.left;
                long j27 = this.scroll;
                long j28 = track2.duration;
                float f185 = j28;
                if (f184 < j27 / f185) {
                    i2 = -1;
                } else if (track2.right > (j27 + j26) / f185) {
                    i2 = 1;
                } else {
                    this.dragSpeed = 1.0f;
                    i2 = 0;
                }
                long j29 = i2 * dp2;
                this.scroll = Utilities.clamp(j27 + j29, j28 - j26, 0L);
                this.progress += j29;
                Track track14 = this.videoTrack;
                float f186 = (r0 - j27) / track14.duration;
                if (f186 > 0.0f) {
                    f = 1.0f;
                    max = Math.min(1.0f - track14.right, f186);
                } else {
                    f = 1.0f;
                    max = Math.max(0.0f - track14.left, f186);
                }
                Track track15 = this.videoTrack;
                track15.left = Utilities.clamp(track15.left + max, f, 0.0f);
                Track track16 = this.videoTrack;
                track16.right = Utilities.clamp(track16.right + max, f, 0.0f);
                TimelineDelegate timelineDelegate2 = this.delegate;
                if (timelineDelegate2 != null) {
                    timelineDelegate2.onVideoLeftChange(false, this.videoTrack.left);
                    this.delegate.onVideoRightChange(false, this.videoTrack.right);
                }
            } else if (i20 == 8) {
                float f187 = this.audioLeft;
                long j30 = this.audioOffset;
                long j31 = -j30;
                long j32 = this.audioDuration;
                float f188 = j32;
                if (f187 < (100 + j31) / f188) {
                    i = -1;
                } else if (this.audioRight >= ((j31 + j26) - 100) / f188) {
                    i = 1;
                } else {
                    this.dragSpeed = 1.0f;
                    i = 0;
                }
                if (i != 0) {
                    if (this.audioSelected && (track = this.videoTrack) != null) {
                        j2 = j30 - (i * dp2);
                        float f189 = track.right;
                        float f190 = track.duration;
                        j3 = (long) ((f189 * f190) - (f187 * f188));
                        j4 = (long) ((track.left * f190) - (this.audioRight * f188));
                    } else if (this.roundSelected && this.hasRound) {
                        j2 = j30 - (i * dp2);
                        float f191 = this.roundRight;
                        float f192 = this.roundDuration;
                        j3 = (long) ((f191 * f192) - (f187 * f188));
                        j4 = (long) ((this.roundLeft * f192) - (this.audioRight * f188));
                    } else {
                        clamp = Utilities.clamp(j30 - (i * dp2), 0L, -(j32 - Math.min(getBaseDuration(), getMaxScrollDuration())));
                        this.audioOffset = clamp;
                        float f193 = (-(this.audioOffset - j30)) / this.audioDuration;
                        float min8 = f193 <= 0.0f ? Math.min(1.0f - this.audioRight, f193) : Math.max(0.0f - this.audioLeft, f193);
                        if (this.videoTrack == null) {
                            float f194 = this.progress;
                            float f195 = this.audioDuration;
                            this.progress = (long) Utilities.clamp(f194 + (min8 * f195), f195, 0.0f);
                        }
                        this.audioLeft = Utilities.clamp(this.audioLeft + min8, 1.0f, 0.0f);
                        this.audioRight = Utilities.clamp(this.audioRight + min8, 1.0f, 0.0f);
                        timelineDelegate = this.delegate;
                        if (timelineDelegate != null) {
                            timelineDelegate.onAudioLeftChange(this.audioLeft);
                            this.delegate.onAudioRightChange(this.audioRight);
                            this.delegate.onProgressChange(this.progress, false);
                        }
                    }
                    clamp = Utilities.clamp(j2, j3, j4);
                    this.audioOffset = clamp;
                    float f1932 = (-(this.audioOffset - j30)) / this.audioDuration;
                    if (f1932 <= 0.0f) {
                    }
                    if (this.videoTrack == null) {
                    }
                    this.audioLeft = Utilities.clamp(this.audioLeft + min8, 1.0f, 0.0f);
                    this.audioRight = Utilities.clamp(this.audioRight + min8, 1.0f, 0.0f);
                    timelineDelegate = this.delegate;
                    if (timelineDelegate != null) {
                    }
                }
            }
            invalidate();
            contentHeight = getContentHeight();
            if (this.lastHeight == contentHeight) {
                this.lastHeight = contentHeight;
                Runnable runnable = this.onHeightChange;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            return;
        }
        this.dragSpeed = 1.0f;
        contentHeight = getContentHeight();
        if (this.lastHeight == contentHeight) {
        }
    }

    public int getContentHeight() {
        return (int) (this.py + (this.videoTrack != null ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.collageTracks.isEmpty() ? 0.0f : getCollageHeight() + AndroidUtilities.dp(4.0f)) + (this.hasRound ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.hasAudio ? AndroidUtilities.dp(4.0f) + getAudioHeight() : 0.0f) + this.py);
    }

    public int getMaxCount() {
        return this.maxCount;
    }

    public long getMaxScrollDuration() {
        if (this.collageTracks.isEmpty()) {
            return Math.max(120000L, (long) (maxSelectDuration() * 1.5f));
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(this.py + AndroidUtilities.dp(28.0f) + this.py, getContentHeight(), this.openT.get());
    }

    public boolean isDragging() {
        return this.dragged;
    }

    public void normalizeScrollByVideo() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        Track track = this.videoTrack;
        float f = (track.right + track.left) / 2.0f;
        long j = track.duration;
        this.scroll = Utilities.clamp((long) ((f * j) - (min / 2.0f)), j - min, 0L);
        invalidate();
    }

    public boolean onBackPressed() {
        boolean z = false;
        if (this.audioSelected) {
            this.audioSelected = false;
            z = true;
            if (this.hasRound && this.videoTrack == null) {
                this.roundSelected = true;
                TimelineDelegate timelineDelegate = this.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onRoundSelectChange(true);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        this.audioAuthorPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.audioTitlePaint.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.px = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.py = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w = size;
        int dp3 = AndroidUtilities.dp(heightDp());
        this.h = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.ph = dp4;
        this.sw = (this.w - (dp4 * 2)) - (this.px * 2);
        Track track = this.videoTrack;
        if (track != null && track.path != null && track.thumbs == null) {
            track.setupThumbs(false);
        }
        if (!this.collageTracks.isEmpty()) {
            Iterator it = this.collageTracks.iterator();
            while (it.hasNext()) {
                Track track2 = (Track) it.next();
                if (track2.path != null && track2.thumbs == null) {
                    track2.setupThumbs(false);
                    track2.setupWaveform(false);
                }
            }
        }
        if (this.audioPath == null || this.waveform != null) {
            return;
        }
        setupAudioWaveform();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0210, code lost:
    
        if (r26.dragged == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x096d, code lost:
    
        r26.dragSpeed = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0971, code lost:
    
        r26.dragged = true;
        r26.draggingProgress = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0279, code lost:
    
        if (r1 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x032b, code lost:
    
        if (r26.dragged != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04e4, code lost:
    
        if (r26.dragged == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04f9, code lost:
    
        if (r26.dragged == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x050d, code lost:
    
        if (r26.dragged == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0539, code lost:
    
        if (r26.dragged == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0755, code lost:
    
        if (r26.dragged == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0969, code lost:
    
        if (r26.dragged == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0a93, code lost:
    
        if (r1 != null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0ac7, code lost:
    
        r1.onRoundSelectChange(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0ab5, code lost:
    
        if (r1 != null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0ac5, code lost:
    
        if (r1 != null) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0b1a, code lost:
    
        if (java.lang.Math.abs(r1) > org.telegram.messenger.AndroidUtilities.dp(100.0f)) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0b3e, code lost:
    
        r3 = java.lang.Math.min(r26.videoTrack.duration, getMaxScrollDuration());
        r5 = r26.px;
        r6 = r5;
        r8 = r3;
        r9 = r26.sw;
        r7 = (int) (((r26.scroll / r8) * r9) + r6);
        r3 = (int) (r6 + (((r26.videoTrack.duration - r3) / r8) * r9));
        r26.scrolling = true;
        r4 = r26.scroller;
        r26.wasScrollX = r7;
        r24 = 0;
        r25 = 0;
        r19 = 0;
        r21 = 0;
        r17 = r4;
        r18 = r7;
        r20 = -r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0b3c, code lost:
    
        if (java.lang.Math.abs(r1) > org.telegram.messenger.AndroidUtilities.dp(100.0f)) goto L500;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0cc1  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0ccb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0ce6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Runnable runnable;
        VelocityTracker velocityTracker;
        TimelineDelegate timelineDelegate;
        VelocityTracker velocityTracker2;
        int xVelocity;
        float min;
        int i;
        Track track;
        long j;
        int i2;
        boolean z2;
        long j2;
        float f;
        float f2;
        long j3;
        VelocityTracker velocityTracker3;
        VelocityTracker velocityTracker4;
        int xVelocity2;
        VelocityTracker velocityTracker5;
        TimelineDelegate timelineDelegate2;
        Runnable runnable2;
        VelocityTracker velocityTracker6;
        float min2;
        float max;
        float min3;
        float max2;
        boolean z3;
        TimelineDelegate timelineDelegate3;
        int i3;
        int i4;
        TimelineDelegate timelineDelegate4;
        float f3;
        float f4;
        TimelineDelegate timelineDelegate5;
        VelocityTracker obtain;
        if (this.videoTrack == null && this.collageTracks.isEmpty() && !this.hasAudio && !this.hasRound) {
            return false;
        }
        float timelineHeight = this.h - getTimelineHeight();
        if (motionEvent.getAction() == 0 && motionEvent.getY() < timelineHeight) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (motionEvent.getAction() == 0) {
            Runnable runnable3 = this.askExactSeek;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                this.askExactSeek = null;
            }
            this.scroller.abortAnimation();
            this.pressHandleCollageIndex = -1;
            this.pressHandle = detectHandle(motionEvent);
            this.pressType = -1;
            this.pressCollageIndex = -1;
            int i5 = this.h - this.py;
            if (!this.open && this.timelineBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                this.pressType = 10;
                this.pressHandle = -1;
            }
            if (this.pressType == -1 && this.videoTrack != null) {
                float f5 = i5;
                if (motionEvent.getY() < f5 && motionEvent.getY() > (f5 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 0;
                }
                i5 = (int) (f5 - (getVideoHeight() + AndroidUtilities.dp(4.0f)));
            }
            if (this.pressType == -1 && !this.collageTracks.isEmpty()) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.collageTracks.size()) {
                        break;
                    }
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((Track) this.collageTracks.get(i6)).selectedT.get());
                    float f6 = i5;
                    if (motionEvent.getY() < f6 && motionEvent.getY() > (f6 - lerp) - AndroidUtilities.dp(2.0f)) {
                        this.pressType = 3;
                        this.pressCollageIndex = i6;
                        break;
                    }
                    i5 = (int) (f6 - (lerp + AndroidUtilities.dp(4.0f)));
                    i6++;
                }
            }
            if (this.pressType == -1 && this.hasRound) {
                float f7 = i5;
                if (motionEvent.getY() < f7 && motionEvent.getY() > (f7 - getRoundHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 1;
                }
                i5 = (int) (f7 - (getRoundHeight() + AndroidUtilities.dp(4.0f)));
            }
            if (this.pressType == -1 && this.hasAudio) {
                float f8 = i5;
                if (motionEvent.getY() < f8 && motionEvent.getY() > (f8 - getAudioHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 2;
                }
                getAudioHeight();
                AndroidUtilities.dp(4.0f);
            }
            this.pressTime = System.currentTimeMillis();
            int i7 = this.pressHandle;
            this.draggingProgress = i7 == 0 || i7 == -1 || i7 == 1;
            this.hadDragChange = false;
            if (i7 == 1 || i7 == 5 || i7 == 8) {
                obtain = VelocityTracker.obtain();
            } else {
                VelocityTracker velocityTracker7 = this.velocityTracker;
                if (velocityTracker7 != null) {
                    velocityTracker7.recycle();
                    obtain = null;
                }
                this.dragSpeed = 1.0f;
                this.dragged = false;
                this.lastX = motionEvent.getX();
                if (!this.isCover) {
                    AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
                    AndroidUtilities.runOnUIThread(this.onLongPress, ViewConfiguration.getLongPressTimeout());
                }
            }
            this.velocityTracker = obtain;
            this.dragSpeed = 1.0f;
            this.dragged = false;
            this.lastX = motionEvent.getX();
            if (!this.isCover) {
            }
        } else if (motionEvent.getAction() == 2) {
            float x = motionEvent.getX() - this.lastX;
            if (this.open && (this.dragged || Math.abs(x) > AndroidUtilities.touchSlop)) {
                long min4 = Math.min(getBaseDuration(), getMaxScrollDuration());
                Track track2 = this.videoTrack;
                if (track2 != null && this.pressHandle == 1) {
                    this.scroll = (long) Utilities.clamp(this.scroll - ((x / this.sw) * min4), track2.duration - min4, 0.0f);
                    invalidate();
                } else if (track2 == null || !((i4 = this.pressHandle) == 2 || i4 == 3 || i4 == 4)) {
                    int i8 = this.pressHandle;
                    if (i8 == 6 || i8 == 7 || i8 == 8) {
                        float f9 = (x / this.sw) * (min4 / this.audioDuration);
                        if (i8 == 6) {
                            float minAudioSelect = this.audioRight - (minAudioSelect() / this.audioDuration);
                            float max3 = Math.max(0L, this.scroll - this.audioOffset);
                            float f10 = this.audioDuration;
                            float f11 = max3 / f10;
                            Track track3 = this.videoTrack;
                            if (track3 != null || (track3 = this.collageMain) != null) {
                                max = Math.max(f11, (((track3.left * track3.duration) + this.scroll) - this.audioOffset) / f10);
                            } else if (this.hasRound) {
                                max = Math.max(f11, (((this.roundLeft * this.roundDuration) + this.scroll) - this.audioOffset) / f10);
                            } else {
                                max = Math.max(f11, this.audioRight - (maxSelectDuration() / this.audioDuration));
                                if (!this.hadDragChange && f9 < 0.0f && this.audioLeft <= this.audioRight - (maxSelectDuration() / this.audioDuration)) {
                                    this.pressHandle = 8;
                                }
                            }
                            float f12 = this.audioLeft;
                            float clamp = Utilities.clamp(f12 + f9, minAudioSelect, max);
                            this.audioLeft = clamp;
                            if (Math.abs(f12 - clamp) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate6 = this.delegate;
                            if (timelineDelegate6 != null) {
                                timelineDelegate6.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
                            }
                            TimelineDelegate timelineDelegate7 = this.delegate;
                            if (timelineDelegate7 != null) {
                                timelineDelegate7.onAudioLeftChange(this.audioLeft);
                            }
                        } else if (i8 == 7) {
                            float min5 = Math.min(1.0f, Math.max(0L, (this.scroll - this.audioOffset) + min4) / this.audioDuration);
                            float f13 = this.audioLeft;
                            float minAudioSelect2 = minAudioSelect();
                            float f14 = this.audioDuration;
                            float f15 = f13 + (minAudioSelect2 / f14);
                            Track track4 = this.videoTrack;
                            if (track4 != null || (track4 = this.collageMain) != null) {
                                min2 = Math.min(min5, (((track4.right * track4.duration) + this.scroll) - this.audioOffset) / f14);
                            } else if (this.hasRound) {
                                min2 = Math.min(min5, (((this.roundRight * this.roundDuration) + this.scroll) - this.audioOffset) / f14);
                            } else {
                                min2 = Math.min(min5, this.audioLeft + (maxSelectDuration() / this.audioDuration));
                                if (!this.hadDragChange && f9 > 0.0f && this.audioRight >= this.audioLeft + (maxSelectDuration() / this.audioDuration)) {
                                    this.pressHandle = 8;
                                }
                            }
                            float f16 = this.audioRight;
                            float clamp2 = Utilities.clamp(f16 + f9, min2, f15);
                            this.audioRight = clamp2;
                            if (Math.abs(f16 - clamp2) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate8 = this.delegate;
                            if (timelineDelegate8 != null) {
                                timelineDelegate8.onAudioRightChange(this.audioRight);
                            }
                        }
                        if (this.pressHandle == 8) {
                            float min6 = f9 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.scroll - this.audioOffset) + min4) / this.audioDuration) - this.audioRight), f9) : Math.max(Math.min(0.0f, (Math.max(0L, this.scroll - this.audioOffset) / this.audioDuration) - this.audioLeft), f9);
                            float f17 = this.audioLeft + min6;
                            this.audioLeft = f17;
                            this.audioRight += min6;
                            TimelineDelegate timelineDelegate9 = this.delegate;
                            if (timelineDelegate9 != null) {
                                timelineDelegate9.onAudioLeftChange(f17);
                                this.delegate.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
                                this.delegate.onAudioRightChange(this.audioRight);
                            }
                            TimelineDelegate timelineDelegate10 = this.delegate;
                            if (timelineDelegate10 != null) {
                                timelineDelegate10.onProgressDragChange(true);
                            }
                        }
                        if (this.videoTrack == null && !this.hasRound) {
                            this.progress = (long) (this.audioLeft * this.audioDuration);
                            TimelineDelegate timelineDelegate11 = this.delegate;
                            if (timelineDelegate11 != null) {
                                timelineDelegate11.onProgressDragChange(true);
                                this.delegate.onProgressChange(this.progress, false);
                            }
                        }
                        invalidate();
                    } else if (i8 == 10 || i8 == 11 || i8 == 12) {
                        float f18 = (x / this.sw) * (min4 / this.roundDuration);
                        if (i8 == 10) {
                            float minAudioSelect3 = this.roundRight - (minAudioSelect() / this.roundDuration);
                            float max4 = Math.max(0L, this.scroll - this.roundOffset);
                            float f19 = this.roundDuration;
                            float f20 = max4 / f19;
                            Track track5 = this.videoTrack;
                            if (track5 == null && (track5 = this.collageMain) == null) {
                                max2 = Math.max(f20, this.roundRight - (maxSelectDuration() / this.roundDuration));
                                if (!this.hadDragChange && f18 < 0.0f && this.roundLeft <= this.roundRight - (maxSelectDuration() / this.roundDuration)) {
                                    this.pressHandle = 8;
                                }
                            } else {
                                max2 = Math.max(f20, (((track5.left * track5.duration) + this.scroll) - this.roundOffset) / f19);
                            }
                            float f21 = this.roundLeft;
                            float clamp3 = Utilities.clamp(f21 + f18, minAudioSelect3, max2);
                            this.roundLeft = clamp3;
                            if (Math.abs(f21 - clamp3) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate12 = this.delegate;
                            if (timelineDelegate12 != null) {
                                timelineDelegate12.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
                            }
                            TimelineDelegate timelineDelegate13 = this.delegate;
                            if (timelineDelegate13 != null) {
                                timelineDelegate13.onRoundLeftChange(this.roundLeft);
                            }
                        } else if (i8 == 11) {
                            float min7 = Math.min(1.0f, Math.max(0L, (this.scroll - this.roundOffset) + min4) / this.roundDuration);
                            float f22 = this.roundLeft;
                            float minAudioSelect4 = minAudioSelect();
                            float f23 = this.roundDuration;
                            float f24 = f22 + (minAudioSelect4 / f23);
                            Track track6 = this.videoTrack;
                            if (track6 != null) {
                                min7 = Math.min(min7, (((track6.right * track6.duration) + this.scroll) - this.roundOffset) / f23);
                            }
                            Track track7 = this.collageMain;
                            if (track7 != null) {
                                min3 = Math.min(min7, (((track7.right * track7.duration) + this.scroll) - this.roundOffset) / this.roundDuration);
                            } else {
                                min3 = Math.min(min7, this.roundLeft + (maxSelectDuration() / this.roundDuration));
                                if (!this.hadDragChange && f18 > 0.0f && this.roundRight >= this.roundLeft + (maxSelectDuration() / this.roundDuration)) {
                                    this.pressHandle = 8;
                                }
                            }
                            float f25 = this.roundRight;
                            float clamp4 = Utilities.clamp(f25 + f18, min3, f24);
                            this.roundRight = clamp4;
                            if (Math.abs(f25 - clamp4) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate14 = this.delegate;
                            if (timelineDelegate14 != null) {
                                timelineDelegate14.onRoundRightChange(this.roundRight);
                            }
                        }
                        if (this.pressHandle == 12) {
                            float min8 = f18 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.scroll - this.roundOffset) + min4) / this.roundDuration) - this.roundRight, f18) : Math.max((Math.max(0L, this.scroll - this.roundOffset) / this.roundDuration) - this.roundLeft, f18);
                            float f26 = this.roundLeft + min8;
                            this.roundLeft = f26;
                            this.roundRight += min8;
                            TimelineDelegate timelineDelegate15 = this.delegate;
                            if (timelineDelegate15 != null) {
                                timelineDelegate15.onRoundLeftChange(f26);
                                this.delegate.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
                                this.delegate.onRoundRightChange(this.roundRight);
                            }
                            TimelineDelegate timelineDelegate16 = this.delegate;
                            if (timelineDelegate16 != null) {
                                timelineDelegate16.onProgressDragChange(true);
                            }
                        }
                        if (this.videoTrack == null) {
                            this.progress = (long) (this.roundLeft * this.roundDuration);
                            TimelineDelegate timelineDelegate17 = this.delegate;
                            if (timelineDelegate17 != null) {
                                timelineDelegate17.onProgressDragChange(true);
                                this.delegate.onProgressChange(this.progress, false);
                            }
                        }
                        invalidate();
                    } else {
                        int i9 = this.pressHandleCollageIndex;
                        if (i9 < 0 || i9 >= this.collageTracks.size() || !((i3 = this.pressHandle) == 13 || i3 == 14 || i3 == 15)) {
                            int i10 = this.pressHandle;
                            if (i10 == 5) {
                                moveAudioOffset((x / this.sw) * min4);
                            } else if (i10 == 9) {
                                moveRoundOffset((x / this.sw) * min4);
                            } else {
                                int i11 = this.pressHandleCollageIndex;
                                if (i11 >= 0 && i11 < this.collageTracks.size() && this.pressHandle == 16) {
                                    moveCollageOffset((Track) this.collageTracks.get(this.pressHandleCollageIndex), (x / this.sw) * min4);
                                } else if (this.draggingProgress) {
                                    setProgressAt(motionEvent.getX(), currentTimeMillis - this.lastTime < 350);
                                    if (this.dragged || (timelineDelegate3 = this.delegate) == null) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                        timelineDelegate3.onProgressDragChange(true);
                                    }
                                    if (!this.dragged) {
                                        this.dragSpeed = 1.0f;
                                    }
                                    this.dragged = z3;
                                }
                            }
                        } else {
                            Track track8 = (Track) this.collageTracks.get(this.pressHandleCollageIndex);
                            float f27 = (x / this.sw) * (min4 / track8.duration);
                            int i12 = this.pressHandle;
                            if (i12 == 13) {
                                float minAudioSelect5 = track8.right - (minAudioSelect() / track8.duration);
                                float max5 = Math.max(0L, this.scroll - track8.offset) / track8.duration;
                                if (track8 == this.collageMain) {
                                    max5 = Math.max(max5, track8.right - (maxSelectDuration() / track8.duration));
                                    if (!this.hadDragChange && f27 < 0.0f && track8.left <= track8.right - (maxSelectDuration() / track8.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f28 = track8.left;
                                float clamp5 = Utilities.clamp(f28 + f27, minAudioSelect5, max5);
                                track8.left = clamp5;
                                if (Math.abs(f28 - clamp5) > 0.01f) {
                                    this.hadDragChange = true;
                                }
                                TimelineDelegate timelineDelegate18 = this.delegate;
                                if (timelineDelegate18 != null) {
                                    timelineDelegate18.onVideoOffsetChange(track8.index, track8.offset);
                                }
                                TimelineDelegate timelineDelegate19 = this.delegate;
                                if (timelineDelegate19 != null) {
                                    timelineDelegate19.onVideoLeftChange(track8.index, track8.left);
                                }
                            } else if (i12 == 14) {
                                float min9 = Math.min(1.0f, Math.max(0L, (this.scroll - track8.offset) + min4) / track8.duration);
                                float minAudioSelect6 = track8.left + (minAudioSelect() / track8.duration);
                                if (track8 == this.collageMain) {
                                    min9 = Math.min(min9, track8.left + (maxSelectDuration() / track8.duration));
                                    if (!this.hadDragChange && f27 > 0.0f && track8.right >= track8.left + (maxSelectDuration() / track8.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f29 = track8.right;
                                float clamp6 = Utilities.clamp(f29 + f27, min9, minAudioSelect6);
                                track8.right = clamp6;
                                if (Math.abs(f29 - clamp6) > 0.01f) {
                                    this.hadDragChange = true;
                                }
                                TimelineDelegate timelineDelegate20 = this.delegate;
                                if (timelineDelegate20 != null) {
                                    timelineDelegate20.onVideoRightChange(track8.index, track8.right);
                                }
                            }
                            if (this.pressHandle == 15) {
                                float min10 = f27 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.scroll - track8.offset) + min4) / track8.duration) - track8.right, f27) : Math.max((Math.max(0L, this.scroll - track8.offset) / track8.duration) - track8.left, f27);
                                float f30 = track8.left + min10;
                                track8.left = f30;
                                track8.right += min10;
                                TimelineDelegate timelineDelegate21 = this.delegate;
                                if (timelineDelegate21 != null) {
                                    timelineDelegate21.onVideoLeftChange(track8.index, f30);
                                    this.delegate.onVideoOffsetChange(track8.index, track8.offset);
                                    this.delegate.onVideoRightChange(track8.index, track8.right);
                                }
                                TimelineDelegate timelineDelegate22 = this.delegate;
                                if (timelineDelegate22 != null) {
                                    timelineDelegate22.onProgressDragChange(true);
                                }
                            }
                            invalidate();
                        }
                    }
                } else {
                    float f31 = track2.duration;
                    float f32 = (x / this.sw) * (min4 / f31);
                    if (i4 == 2) {
                        track2.left = Utilities.clamp(track2.left + f32, track2.right - (1000.0f / f31), 0.0f);
                        TimelineDelegate timelineDelegate23 = this.delegate;
                        if (timelineDelegate23 != null) {
                            timelineDelegate23.onVideoLeftChange(false, this.videoTrack.left);
                        }
                        Track track9 = this.videoTrack;
                        float f33 = track9.right - track9.left;
                        float maxSelectDuration = maxSelectDuration();
                        Track track10 = this.videoTrack;
                        if (f33 > maxSelectDuration / track10.duration) {
                            track10.right = Math.min(1.0f, track10.left + (maxSelectDuration() / this.videoTrack.duration));
                            timelineDelegate4 = this.delegate;
                        }
                        float f34 = this.progress;
                        Track track11 = this.videoTrack;
                        float f35 = track11.duration;
                        f3 = f34 / f35;
                        f4 = track11.left;
                        if (f3 >= f4 || f3 > track11.right) {
                            long j4 = (long) (f4 * f35);
                            this.progress = j4;
                            timelineDelegate5 = this.delegate;
                            if (timelineDelegate5 != null) {
                                timelineDelegate5.onProgressChange(j4, false);
                            }
                        }
                        invalidate();
                    } else {
                        if (i4 == 3) {
                            track2.right = Utilities.clamp(track2.right + f32, 1.0f, track2.left + (1000.0f / f31));
                            TimelineDelegate timelineDelegate24 = this.delegate;
                            if (timelineDelegate24 != null) {
                                timelineDelegate24.onVideoRightChange(false, this.videoTrack.right);
                            }
                            Track track12 = this.videoTrack;
                            float f36 = track12.right - track12.left;
                            float maxSelectDuration2 = maxSelectDuration();
                            Track track13 = this.videoTrack;
                            if (f36 > maxSelectDuration2 / track13.duration) {
                                track13.left = Math.max(0.0f, track13.right - (maxSelectDuration() / this.videoTrack.duration));
                                TimelineDelegate timelineDelegate25 = this.delegate;
                                if (timelineDelegate25 != null) {
                                    timelineDelegate25.onVideoLeftChange(false, this.videoTrack.left);
                                }
                            }
                        } else if (i4 == 4) {
                            float min11 = f32 > 0.0f ? Math.min(1.0f - track2.right, f32) : Math.max(-track2.left, f32);
                            Track track14 = this.videoTrack;
                            float f37 = track14.left + min11;
                            track14.left = f37;
                            track14.right += min11;
                            TimelineDelegate timelineDelegate26 = this.delegate;
                            if (timelineDelegate26 != null) {
                                timelineDelegate26.onVideoLeftChange(false, f37);
                                timelineDelegate4 = this.delegate;
                                timelineDelegate4.onVideoRightChange(false, this.videoTrack.right);
                            }
                        }
                        float f342 = this.progress;
                        Track track112 = this.videoTrack;
                        float f352 = track112.duration;
                        f3 = f342 / f352;
                        f4 = track112.left;
                        if (f3 >= f4) {
                        }
                        long j42 = (long) (f4 * f352);
                        this.progress = j42;
                        timelineDelegate5 = this.delegate;
                        if (timelineDelegate5 != null) {
                        }
                        invalidate();
                    }
                }
                this.lastX = motionEvent.getX();
            }
            if (this.dragged) {
                AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
            }
            int i13 = this.pressHandle;
            if ((i13 == 1 || i13 == 5 || i13 == 8) && (velocityTracker6 = this.velocityTracker) != null) {
                velocityTracker6.addMovement(motionEvent);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
            this.scroller.abortAnimation();
            if (motionEvent.getAction() == 1) {
                if ((System.currentTimeMillis() - this.pressTime > ViewConfiguration.getTapTimeout() || this.dragged) && this.open) {
                    int i14 = this.pressHandle;
                    int i15 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                    if (i14 == 16 && (velocityTracker5 = this.velocityTracker) != null) {
                        velocityTracker5.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        xVelocity2 = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = true;
                        if (this.videoTrack != null) {
                        }
                    } else if (i14 != 1 || (velocityTracker4 = this.velocityTracker) == null) {
                        if ((i14 == 5 || (i14 == 8 && !this.dragged)) && this.audioSelected && (velocityTracker2 = this.velocityTracker) != null) {
                            if (this.videoTrack == null) {
                                i15 = 1500;
                            }
                            velocityTracker2.computeCurrentVelocity(i15);
                            xVelocity = (int) this.velocityTracker.getXVelocity();
                            this.scrollingVideo = false;
                            if (Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                min = Math.min(getBaseDuration(), getMaxScrollDuration());
                                i = (int) (this.px + this.ph + ((this.audioOffset / min) * this.sw));
                                track = this.videoTrack;
                                if (track != null) {
                                    float f38 = track.right;
                                    f = track.duration;
                                    f2 = f38 * f;
                                    j3 = this.audioDuration;
                                    j2 = (long) (f2 - 0);
                                    j = (long) ((track.left * f) - j3);
                                    i2 = xVelocity;
                                    z2 = true;
                                } else if (this.hasRound) {
                                    float f39 = this.roundRight;
                                    float f40 = this.roundDuration;
                                    long j5 = (long) ((f39 * f40) - 0);
                                    j = (long) ((this.roundLeft * f40) - this.audioDuration);
                                    i2 = xVelocity;
                                    j2 = j5;
                                    z2 = true;
                                } else {
                                    j = -(this.audioDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                    i2 = xVelocity;
                                    z2 = true;
                                    j2 = 0;
                                }
                            }
                        } else if ((i14 == 9 || (i14 == 12 && !this.dragged)) && this.roundSelected && (velocityTracker3 = this.velocityTracker) != null) {
                            if (this.videoTrack == null) {
                                i15 = 1500;
                            }
                            velocityTracker3.computeCurrentVelocity(i15);
                            xVelocity = (int) this.velocityTracker.getXVelocity();
                            this.scrollingVideo = false;
                            if (Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                min = Math.min(getBaseDuration(), getMaxScrollDuration());
                                i = (int) (this.px + this.ph + ((this.roundOffset / min) * this.sw));
                                track = this.videoTrack;
                                if (track != null) {
                                    float f41 = track.right;
                                    f = track.duration;
                                    f2 = f41 * f;
                                    j3 = this.roundDuration;
                                    j2 = (long) (f2 - 0);
                                    j = (long) ((track.left * f) - j3);
                                    i2 = xVelocity;
                                    z2 = true;
                                } else {
                                    j2 = 0;
                                    j = -(this.roundDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                    i2 = xVelocity;
                                    z2 = true;
                                }
                            }
                        }
                        this.scrolling = z2;
                        Scroller scroller = this.scroller;
                        this.wasScrollX = i;
                        float f42 = this.px + this.ph;
                        float f43 = this.sw;
                        int i16 = (int) (((j / min) * f43) + f42);
                        int i17 = (int) (f42 + ((j2 / min) * f43));
                        int i18 = 0;
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        Scroller scroller2 = scroller;
                        int i22 = i;
                        scroller2.fling(i22, i20, i2, i21, i16, i17, i18, i19);
                        z = false;
                        runnable = this.askExactSeek;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                            this.askExactSeek = null;
                        }
                        if (this.dragged && z && (timelineDelegate = this.delegate) != null) {
                            timelineDelegate.onProgressDragChange(false);
                        }
                        this.dragSpeed = 1.0f;
                        this.dragged = false;
                        this.draggingProgress = false;
                        this.pressTime = -1L;
                        this.pressHandle = -1;
                        velocityTracker = this.velocityTracker;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.velocityTracker = null;
                        }
                    } else {
                        velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        xVelocity2 = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = true;
                        if (this.videoTrack != null) {
                        }
                    }
                } else if (this.open) {
                    if (!this.isCover || this.videoTrack == null) {
                        int i23 = this.pressType;
                        if (i23 == 3) {
                            int i24 = (this.audioSelected || this.roundSelected) ? -1 : this.collageSelected;
                            int i25 = this.pressCollageIndex;
                            if (i24 != i25) {
                                this.audioSelected = false;
                                this.roundSelected = false;
                                this.collageSelected = i25;
                                if (this.delegate != null && i25 >= 0 && i25 < this.collageTracks.size()) {
                                    this.delegate.onVideoSelected(((Track) this.collageTracks.get(this.pressCollageIndex)).index);
                                }
                            }
                        }
                        if (i23 == 2 && !this.audioSelected) {
                            this.audioSelected = true;
                            this.roundSelected = false;
                            timelineDelegate2 = this.delegate;
                        } else if (i23 == 1 && !this.roundSelected) {
                            this.audioSelected = false;
                            this.roundSelected = true;
                            TimelineDelegate timelineDelegate27 = this.delegate;
                            if (timelineDelegate27 != null) {
                                timelineDelegate27.onRoundSelectChange(true);
                            }
                        } else if (i23 != 2 && this.audioSelected) {
                            this.audioSelected = false;
                            this.roundSelected = false;
                            timelineDelegate2 = this.delegate;
                        } else if (i23 == 1 || !this.roundSelected) {
                            long j6 = this.progress;
                            if (setProgressAt(motionEvent.getX(), false) && Math.abs(this.progress - j6) > 400) {
                                this.loopProgressFrom = j6;
                                this.loopProgress.set(1.0f, true);
                            }
                        } else {
                            this.audioSelected = false;
                            this.roundSelected = false;
                            timelineDelegate2 = this.delegate;
                        }
                        runnable = this.askExactSeek;
                        if (runnable != null) {
                        }
                        if (this.dragged) {
                            timelineDelegate.onProgressDragChange(false);
                        }
                        this.dragSpeed = 1.0f;
                        this.dragged = false;
                        this.draggingProgress = false;
                        this.pressTime = -1L;
                        this.pressHandle = -1;
                        velocityTracker = this.velocityTracker;
                        if (velocityTracker != null) {
                        }
                    } else {
                        long clamp7 = (long) Utilities.clamp(((((motionEvent.getX() - this.px) - this.ph) / this.sw) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.scroll, getBaseDuration(), 0.0f);
                        Track track15 = this.videoTrack;
                        float f44 = track15.right - track15.left;
                        track15.left = (clamp7 / getBaseDuration()) * (1.0f - f44);
                        Track track16 = this.videoTrack;
                        float f45 = track16.left;
                        track16.right = f44 + f45;
                        TimelineDelegate timelineDelegate28 = this.delegate;
                        if (timelineDelegate28 != null) {
                            timelineDelegate28.onVideoLeftChange(true, f45);
                            this.delegate.onVideoRightChange(true, this.videoTrack.right);
                        }
                    }
                    invalidate();
                } else if (this.pressType == 10 && (runnable2 = this.onTimelineClick) != null) {
                    runnable2.run();
                }
            }
            z = true;
            runnable = this.askExactSeek;
            if (runnable != null) {
            }
            if (this.dragged) {
            }
            this.dragSpeed = 1.0f;
            this.dragged = false;
            this.draggingProgress = false;
            this.pressTime = -1L;
            this.pressHandle = -1;
            velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
            }
        }
        this.lastTime = System.currentTimeMillis();
        return true;
    }

    public void selectRound(boolean z) {
        if (z && this.hasRound) {
            this.roundSelected = true;
            this.audioSelected = false;
        } else {
            this.roundSelected = false;
            this.audioSelected = this.hasAudio && this.videoTrack == null;
        }
        invalidate();
    }

    public void setAudio(String str, String str2, String str3, long j, long j2, float f, float f2, float f3, boolean z) {
        String str4;
        String str5;
        if (!TextUtils.equals(this.audioPath, str)) {
            AudioWaveformLoader audioWaveformLoader = this.waveform;
            if (audioWaveformLoader != null) {
                audioWaveformLoader.destroy();
                this.waveform = null;
                this.waveformIsLoaded = false;
            }
            this.audioPath = str;
            setupAudioWaveform();
        }
        this.audioPath = str;
        boolean z2 = !TextUtils.isEmpty(str);
        this.hasAudio = z2;
        if (z2) {
            str4 = str2;
            str5 = str3;
        } else {
            this.audioSelected = false;
            str4 = null;
            str5 = null;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = null;
        }
        if (this.hasAudio) {
            this.audioDuration = j;
            this.audioOffset = j2 - ((long) (j * f));
            this.audioLeft = f;
            this.audioRight = f2;
            this.audioVolume = f3;
            if (str4 != null) {
                StaticLayout staticLayout = new StaticLayout(str4, this.audioAuthorPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.audioAuthor = staticLayout;
                this.audioAuthorWidth = staticLayout.getLineCount() > 0 ? this.audioAuthor.getLineWidth(0) : 0.0f;
                this.audioAuthorLeft = this.audioAuthor.getLineCount() > 0 ? this.audioAuthor.getLineLeft(0) : 0.0f;
            } else {
                this.audioAuthorWidth = 0.0f;
                this.audioAuthor = null;
            }
            if (str5 != null) {
                StaticLayout staticLayout2 = new StaticLayout(str5, this.audioTitlePaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.audioTitle = staticLayout2;
                this.audioTitleWidth = staticLayout2.getLineCount() > 0 ? this.audioTitle.getLineWidth(0) : 0.0f;
                this.audioTitleLeft = this.audioTitle.getLineCount() > 0 ? this.audioTitle.getLineLeft(0) : 0.0f;
            } else {
                this.audioTitleWidth = 0.0f;
                this.audioTitle = null;
            }
        }
        if (!z) {
            this.audioT.set(this.hasAudio, true);
        }
        invalidate();
    }

    public void setCollage(ArrayList<StoryEntry> arrayList) {
        VideoThumbsLoader videoThumbsLoader;
        for (int i = 0; i < this.collageTracks.size(); i++) {
            Track track = (Track) this.collageTracks.get(i);
            if (track != null && (videoThumbsLoader = track.thumbs) != null) {
                videoThumbsLoader.destroy();
            }
        }
        this.collageTracks.clear();
        for (int i2 = 0; i2 < this.collageWaveforms.size(); i2++) {
            AudioWaveformLoader audioWaveformLoader = (AudioWaveformLoader) this.collageWaveforms.get(i2);
            if (audioWaveformLoader != null) {
                audioWaveformLoader.destroy();
            }
        }
        this.collageWaveforms.clear();
        this.timelineWaveformMax.set(1.0f, true);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.collageWaveforms.add(null);
                StoryEntry storyEntry = arrayList.get(i3);
                if (storyEntry.isVideo) {
                    Track track2 = new Track();
                    track2.index = i3;
                    track2.isRound = false;
                    track2.path = storyEntry.file.getAbsolutePath();
                    track2.duration = storyEntry.duration;
                    track2.offset = storyEntry.videoOffset;
                    track2.volume = storyEntry.videoVolume;
                    track2.left = storyEntry.videoLeft;
                    track2.right = storyEntry.videoRight;
                    track2.setupThumbs(false);
                    track2.setupWaveform(false);
                    this.collageTracks.add(track2);
                }
            }
        }
        sortCollage();
        this.collageSelected = 0;
    }

    public void setCover() {
        this.isCover = true;
    }

    public void setCoverVideo(long j, long j2) {
        this.coverStart = j;
        this.coverEnd = j2;
        Track track = this.videoTrack;
        if (track != null) {
            track.setupThumbs(true);
        }
    }

    public void setDelegate(TimelineDelegate timelineDelegate) {
        this.delegate = timelineDelegate;
    }

    public void setMaxCount(int i) {
        this.maxCount = i;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.onHeightChange = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.onTimelineClick = runnable;
    }

    public void setOpen(boolean z, boolean z2) {
        if (this.open == z && z2) {
            return;
        }
        this.open = z;
        if (!z2) {
            this.openT.set(z, true);
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if ((r4 + 240) >= (r7 * r9.audioRight)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if ((r4 + 240) >= (r6 * r9.audioRight)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r4 + 240) >= (r7 * r0.right)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        r9.loopProgressFrom = -1;
        r9.loopProgress.set(1.0f, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(long j) {
        Track track = this.videoTrack;
        if (track != null) {
            if (j < this.progress) {
                float f = j;
                float f2 = track.duration;
                if (f <= (track.left * f2) + 240.0f) {
                }
            }
        }
        if (this.hasAudio && !this.hasRound && track == null) {
            if (j < this.progress) {
                float f3 = j;
                float f4 = this.audioDuration;
                if (f3 <= (this.audioLeft * f4) + 240.0f) {
                }
            }
        }
        if (this.hasRound && track == null) {
            if (j < this.progress) {
                float f5 = j;
                float f6 = this.roundDuration;
                if (f5 <= (this.audioLeft * f6) + 240.0f) {
                }
            }
        }
        this.progress = j;
        invalidate();
    }

    public void setRound(String str, long j, long j2, float f, float f2, float f3, boolean z) {
        if (TextUtils.equals(this.roundPath, str)) {
            return;
        }
        VideoThumbsLoader videoThumbsLoader = this.roundThumbs;
        if (videoThumbsLoader != null) {
            videoThumbsLoader.destroy();
            this.roundThumbs = null;
        }
        long j3 = this.roundDuration;
        if (str != null) {
            this.roundPath = str;
            this.roundDuration = j;
            this.roundOffset = j2 - ((long) (j * f));
            this.roundLeft = f;
            this.roundRight = f2;
            this.roundVolume = f3;
            setupRoundThumbs();
            if (this.videoTrack == null) {
                this.audioSelected = false;
                this.roundSelected = true;
            }
        } else {
            this.roundPath = null;
            this.roundDuration = 1L;
            this.roundSelected = false;
        }
        this.hasRound = this.roundPath != null;
        if (j3 != j && this.videoTrack == null && this.waveform != null) {
            this.resetWaveform = true;
            setupAudioWaveform();
        }
        if (this.hasAudio && this.hasRound && this.videoTrack == null) {
            this.audioLeft = 0.0f;
            this.audioRight = Utilities.clamp(j / this.audioDuration, 1.0f, 0.0f);
        }
        if (!z) {
            this.roundSelectedT.set(this.roundSelected, true);
            this.audioSelectedT.set(this.audioSelected, true);
            this.roundT.set(this.hasRound, true);
        }
        invalidate();
    }

    public void setRoundNull(boolean z) {
        setRound(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z);
    }

    public void setVideo(boolean z, String str, long j, float f) {
        Track track = this.videoTrack;
        if (TextUtils.equals(track == null ? null : track.path, str)) {
            return;
        }
        Track track2 = this.videoTrack;
        if (track2 != null) {
            VideoThumbsLoader videoThumbsLoader = track2.thumbs;
            if (videoThumbsLoader != null) {
                videoThumbsLoader.destroy();
                this.videoTrack.thumbs = null;
            }
            this.videoTrack = null;
        }
        if (str != null) {
            this.scroll = 0L;
            Track track3 = new Track();
            this.videoTrack = track3;
            track3.isRound = z;
            track3.path = str;
            track3.duration = j;
            track3.volume = f;
            track3.setupThumbs(false);
        } else {
            this.videoTrack = null;
            this.scroll = 0L;
        }
        if (!this.hasRound) {
            this.roundSelected = false;
        }
        this.progress = 0L;
        invalidate();
    }

    public void setVideoLeft(float f) {
        Track track = this.videoTrack;
        if (track == null) {
            return;
        }
        track.left = f;
        invalidate();
    }

    public void setVideoRight(float f) {
        Track track = this.videoTrack;
        if (track == null) {
            return;
        }
        track.right = f;
        invalidate();
    }

    public void sortCollage() {
        Collections.sort(this.collageTracks, new Comparator() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$sortCollage$7;
                lambda$sortCollage$7 = TimelineView.lambda$sortCollage$7((TimelineView.Track) obj, (TimelineView.Track) obj2);
                return lambda$sortCollage$7;
            }
        });
        this.collageMain = this.collageTracks.isEmpty() ? null : (Track) this.collageTracks.get(0);
    }
}
