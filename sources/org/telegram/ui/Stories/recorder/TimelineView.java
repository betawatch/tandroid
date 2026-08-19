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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
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

    public static int heightDp() {
        return 388;
    }

    public long getMaxScrollDuration() {
        if (this.collageTracks.isEmpty()) {
            return Math.max(120000L, (long) (maxSelectDuration() * 1.5f));
        }
        return 70000L;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.onTimelineClick = runnable;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.onHeightChange = runnable;
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
                            TimelineView.Track.$r8$lambda$5nKwQ2tgX4hRgpG5-diUTp4Qn7g(TimelineView.Track.this);
                        }
                    });
                }
            }
        }

        public static /* synthetic */ void $r8$lambda$5nKwQ2tgX4hRgpG5-diUTp4Qn7g(Track track) {
            VideoThumbsLoader videoThumbsLoader = track.thumbs;
            if (videoThumbsLoader == null || videoThumbsLoader.getDuration() <= 0) {
                return;
            }
            track.duration = track.thumbs.getDuration();
            TimelineView.this.sortCollage();
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

    public void setMaxCount(int i) {
        this.maxCount = i;
    }

    public int getMaxCount() {
        return this.maxCount;
    }

    private long maxSelectDuration() {
        return this.maxCount * 59000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        Track track = this.videoTrack;
        if (track != null) {
            return Math.max(1L, track.duration);
        }
        Track track2 = this.collageMain;
        if (track2 != null) {
            return Math.max(1L, track2.duration);
        }
        if (this.hasRound) {
            return Math.max(1L, this.roundDuration);
        }
        return Math.max(1L, this.audioDuration);
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

    public void setCover() {
        this.isCover = true;
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
        textPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(2.0f), TLObject.FLAG_30);
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
                TimelineView.$r8$lambda$3xfpuv3NLYw_7m5eQR4XDlX9AVw(TimelineView.this, viewGroup, resourcesProvider, blurManager, view);
            }
        };
    }

    public static /* synthetic */ void $r8$lambda$3xfpuv3NLYw_7m5eQR4XDlX9AVw(final TimelineView timelineView, ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, View view) {
        int i;
        int i2 = timelineView.pressType;
        try {
            if (i2 == 2 && timelineView.hasAudio) {
                SliderView onValueChange = new SliderView(timelineView.getContext(), 0).setMinMax(0.0f, 1.5f).setValue(timelineView.audioVolume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda4
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TimelineView.$r8$lambda$7j3DKEqbZxbFm4cHs9YxhnORcSQ(TimelineView.this, (Float) obj);
                    }
                });
                long min = Math.min(timelineView.getBaseDuration(), timelineView.getMaxScrollDuration());
                int i3 = timelineView.w;
                int i4 = timelineView.px;
                int i5 = timelineView.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, timelineView).addView(onValueChange).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        TimelineView.$r8$lambda$kx2RWR0HuGW--ZWCMCnhKwT75y4(TimelineView.this);
                    }
                }).setGravity(5).forceTop(true).translate((-(timelineView.w - Math.min((i3 - i4) - i5, (i4 + i5) + ((((timelineView.audioOffset - timelineView.scroll) + (AndroidUtilities.lerp(timelineView.audioRight, 1.0f, timelineView.audioSelectedT.get()) * timelineView.audioDuration)) / min) * timelineView.sw)))) + AndroidUtilities.dp(18.0f), timelineView.audioBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                timelineView.performHapticFeedback(0, 1);
                return;
            }
            if (i2 == 1 && timelineView.hasRound) {
                SliderView onValueChange2 = new SliderView(timelineView.getContext(), 0).setMinMax(0.0f, 1.5f).setValue(timelineView.roundVolume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TimelineView.$r8$lambda$cGqD5y3W4FcwjXr1-H28Dw0Gpno(TimelineView.this, (Float) obj);
                    }
                });
                long min2 = Math.min(timelineView.getBaseDuration(), timelineView.getMaxScrollDuration());
                int i6 = timelineView.w;
                int i7 = timelineView.px;
                int i8 = timelineView.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, timelineView).addView(onValueChange2).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        TimelineView.$r8$lambda$G8ujk_cWeaysCw6dOFM32DyUvr0(TimelineView.this);
                    }
                }).setGravity(5).forceTop(true).translate((-(timelineView.w - Math.min((i6 - i7) - i8, (i7 + i8) + ((((timelineView.roundOffset - timelineView.scroll) + (AndroidUtilities.lerp(timelineView.roundRight, 1.0f, timelineView.roundSelectedT.get()) * timelineView.roundDuration)) / min2) * timelineView.sw)))) + AndroidUtilities.dp(18.0f), timelineView.roundBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                timelineView.performHapticFeedback(0, 1);
                return;
            }
            if (i2 == 0 && timelineView.videoTrack != null) {
                ItemOptions.makeOptions(viewGroup, resourcesProvider, timelineView).addView(new SliderView(timelineView.getContext(), 0).setMinMax(0.0f, 1.5f).setValue(timelineView.videoTrack.volume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TimelineView.$r8$lambda$lokWYyMBVmGgL-aI60HGFVf3AAg(TimelineView.this, (Float) obj);
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), timelineView.videoBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                timelineView.performHapticFeedback(0, 1);
            } else {
                if (i2 != 3 || (i = timelineView.pressCollageIndex) < 0 || i >= timelineView.collageTracks.size()) {
                    return;
                }
                final Track track = (Track) timelineView.collageTracks.get(timelineView.pressCollageIndex);
                ItemOptions.makeOptions(viewGroup, resourcesProvider, timelineView).addView(new SliderView(timelineView.getContext(), 0).setMinMax(0.0f, 1.5f).setValue(track.volume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda9
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TimelineView.$r8$lambda$hR6yXxbyw7j0f7kSfKmENclw7Qw(TimelineView.this, track, (Float) obj);
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), track.bounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                timelineView.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void $r8$lambda$7j3DKEqbZxbFm4cHs9YxhnORcSQ(TimelineView timelineView, Float f) {
        timelineView.getClass();
        timelineView.audioVolume = f.floatValue();
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioVolumeChange(f.floatValue());
        }
    }

    public static /* synthetic */ void $r8$lambda$kx2RWR0HuGW--ZWCMCnhKwT75y4(TimelineView timelineView) {
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioRemove();
        }
    }

    public static /* synthetic */ void $r8$lambda$cGqD5y3W4FcwjXr1-H28Dw0Gpno(TimelineView timelineView, Float f) {
        timelineView.getClass();
        timelineView.roundVolume = f.floatValue();
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundVolumeChange(f.floatValue());
        }
    }

    public static /* synthetic */ void $r8$lambda$G8ujk_cWeaysCw6dOFM32DyUvr0(TimelineView timelineView) {
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundRemove();
        }
    }

    public static /* synthetic */ void $r8$lambda$lokWYyMBVmGgL-aI60HGFVf3AAg(TimelineView timelineView, Float f) {
        timelineView.videoTrack.volume = f.floatValue();
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onVideoVolumeChange(f.floatValue());
        }
    }

    public static /* synthetic */ void $r8$lambda$hR6yXxbyw7j0f7kSfKmENclw7Qw(TimelineView timelineView, Track track, Float f) {
        timelineView.getClass();
        track.volume = f.floatValue();
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onVideoVolumeChange(track.index, f.floatValue());
        }
    }

    public void setDelegate(TimelineDelegate timelineDelegate) {
        this.delegate = timelineDelegate;
    }

    public void setCoverVideo(long j, long j2) {
        this.coverStart = j;
        this.coverEnd = j2;
        Track track = this.videoTrack;
        if (track != null) {
            track.setupThumbs(true);
        }
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

    public static /* synthetic */ int $r8$lambda$CcgHyMQkOAL1CJP_zrgPRlX6yxQ(Track track, Track track2) {
        return (int) (track2.duration - track.duration);
    }

    public void sortCollage() {
        Collections.sort(this.collageTracks, new Comparator() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return TimelineView.$r8$lambda$CcgHyMQkOAL1CJP_zrgPRlX6yxQ((TimelineView.Track) obj, (TimelineView.Track) obj2);
            }
        });
        this.collageMain = this.collageTracks.isEmpty() ? null : (Track) this.collageTracks.get(0);
    }

    public void setRoundNull(boolean z) {
        setRound(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z);
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
                    TimelineView.$r8$lambda$VKEvP7BMWSMm0sA52g6r4hpygfg(TimelineView.this);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$VKEvP7BMWSMm0sA52g6r4hpygfg(TimelineView timelineView) {
        VideoThumbsLoader videoThumbsLoader = timelineView.roundThumbs;
        if (videoThumbsLoader == null || videoThumbsLoader.getDuration() <= 0) {
            return;
        }
        timelineView.roundDuration = timelineView.roundThumbs.getDuration();
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

    public void normalizeScrollByVideo() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        Track track = this.videoTrack;
        float f = (track.right + track.left) / 2.0f;
        long j = track.duration;
        this.scroll = Utilities.clamp((long) ((f * j) - (min / 2.0f)), j - min, 0L);
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
        boolean isEmpty = TextUtils.isEmpty(str);
        this.hasAudio = !isEmpty;
        if (isEmpty) {
            this.audioSelected = false;
            str4 = null;
            str5 = null;
        } else {
            str4 = str2;
            str5 = str3;
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

    private void setupAudioWaveform() {
        if (getMeasuredWidth() > 0) {
            if (this.waveform == null || this.resetWaveform) {
                this.waveform = new AudioWaveformLoader(this.audioPath, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.waveformIsLoaded = false;
                this.waveformMax.set(1.0f, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0143 A[LOOP:0: B:38:0x0143->B:42:0x01fe, LOOP_START, PHI: r6
      0x0143: PHI (r6v37 int) = (r6v11 int), (r6v38 int) binds: [B:37:0x0141, B:42:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int detectHandle(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(this.progress, getBaseDuration(), 0L);
        Track track = this.collageMain;
        float f = min;
        float f2 = this.px + this.ph + (this.sw * (((clamp + (track != null ? track.offset + (track.left * track.duration) : this.videoTrack == null ? this.audioOffset : 0L)) - this.scroll) / f));
        if (!this.isCover && x >= f2 - AndroidUtilities.dp(12.0f) && x <= f2 + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z2 = this.videoTrack != null && y > (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        boolean z3 = !this.collageTracks.isEmpty() && y > ((((((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(4.0f))) - getCollageHeight()) - ((float) AndroidUtilities.dp(4.0f))) - ((float) AndroidUtilities.dp(2.0f)) && y < (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (this.hasRound) {
            if (y > (((((((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getCollageHeight()) - AndroidUtilities.dp(this.collageTracks.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f)) {
                if (y < ((((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) - getCollageHeight()) - AndroidUtilities.dp(this.collageTracks.isEmpty() ? 0.0f : 4.0f)) {
                    z = true;
                    if (z3) {
                        i = 1;
                        i2 = -1;
                        if (z2) {
                            float f3 = this.px + this.ph;
                            Track track2 = this.videoTrack;
                            float f4 = track2.left;
                            float f5 = track2.duration;
                            float f6 = this.scroll;
                            float f7 = this.sw;
                            float f8 = ((((f4 * f5) - f6) / f) * f7) + f3;
                            float f9 = f3 + ((((track2.right * f5) - f6) / f) * f7);
                            if (this.isCover) {
                                return (getBaseDuration() < getMaxScrollDuration() || (x >= f8 - ((float) AndroidUtilities.dp(15.0f)) && x <= f9 + ((float) AndroidUtilities.dp(15.0f)))) ? 4 : 1;
                            }
                            if (x >= f8 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f8) {
                                return 2;
                            }
                            if (x >= f9 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f9) {
                                return 3;
                            }
                            if (x >= f8 && x <= f9) {
                                Track track3 = this.videoTrack;
                                if (track3.left > 0.01f || track3.right < 0.99f) {
                                    return 4;
                                }
                            }
                        } else if (z) {
                            float f10 = this.px + this.ph;
                            float f11 = this.roundOffset;
                            float f12 = this.roundLeft;
                            float f13 = this.roundDuration;
                            float f14 = this.scroll;
                            float f15 = this.sw;
                            float f16 = (((((f12 * f13) + f11) - f14) / f) * f15) + f10;
                            float f17 = f10 + ((((f11 + (this.roundRight * f13)) - f14) / f) * f15);
                            if (this.roundSelected || this.videoTrack == null) {
                                if (x >= f16 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f16) {
                                    return 10;
                                }
                                if (x >= f17 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f17) {
                                    return 11;
                                }
                                if (x >= f16 && x <= f17) {
                                    return this.videoTrack == null ? 12 : 9;
                                }
                                float f18 = this.px + this.ph;
                                long j = this.roundOffset;
                                long j2 = this.scroll;
                                float f19 = this.sw;
                                float f20 = (((j - j2) / f) * f19) + f18;
                                f17 = f18 + ((((j + this.roundDuration) - j2) / f) * f19);
                                f16 = f20;
                            }
                            if (x >= f16 && x <= f17) {
                                return 9;
                            }
                        } else if (this.hasAudio) {
                            float f21 = this.px + this.ph;
                            float f22 = this.audioOffset;
                            float f23 = this.audioLeft;
                            float f24 = this.audioDuration;
                            float f25 = this.scroll;
                            float f26 = this.sw;
                            float f27 = (((((f23 * f24) + f22) - f25) / f) * f26) + f21;
                            float f28 = f21 + ((((f22 + (this.audioRight * f24)) - f25) / f) * f26);
                            if (this.audioSelected || (this.videoTrack == null && !this.hasRound)) {
                                if (x >= f27 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f27) {
                                    return 6;
                                }
                                if (x >= f28 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f28) {
                                    return 7;
                                }
                                if (x >= f27 && x <= f28) {
                                    return this.videoTrack == null ? 8 : 5;
                                }
                                float f29 = this.px + this.ph;
                                long j3 = this.audioOffset;
                                long j4 = this.scroll;
                                float f30 = this.sw;
                                float f31 = (((j3 - j4) / f) * f30) + f29;
                                f28 = f29 + ((((j3 + this.audioDuration) - j4) / f) * f30);
                                f27 = f31;
                            }
                            if (x >= f27 && x <= f28) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i3 = 0; i3 < this.collageTracks.size(); i3++) {
                            Track track4 = (Track) this.collageTracks.get(i3);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(track4.bounds);
                            rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                            if (rectF.contains(x, y)) {
                                float f32 = this.px + this.ph;
                                float f33 = track4.offset;
                                float f34 = this.sw;
                                float f35 = ((f33 / f) * f34) + f32;
                                float f36 = track4.left;
                                float f37 = track4.duration;
                                float f38 = ((((f36 * f37) + f33) / f) * f34) + f32;
                                float f39 = (((f33 + (track4.right * f37)) / f) * f34) + f32;
                                float f40 = f32 + (((r4 + r11) / f) * f34);
                                this.pressHandleCollageIndex = i3;
                                if (x >= f38 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f38) {
                                    return 13;
                                }
                                if (x >= f39 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f39) {
                                    return 14;
                                }
                                if (x < f38 || x > f39 || (track4.left <= 0.01f && track4.right >= 0.99f)) {
                                    return (x < f35 || x > f40) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i = 1;
                        i2 = -1;
                    }
                    Track track5 = this.videoTrack;
                    return (track5 == null && track5.duration > getMaxScrollDuration() && z2) ? i : i2;
                }
            }
        }
        z = false;
        if (z3) {
        }
        Track track52 = this.videoTrack;
        if (track52 == null) {
        }
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

    public boolean isDragging() {
        return this.dragged;
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
                TimelineView.$r8$lambda$LB5xKJ5UqtqxrxGlddx1Rq3Q_M0(TimelineView.this, clamp);
            }
        };
        this.askExactSeek = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 150L);
        return true;
    }

    public static /* synthetic */ void $r8$lambda$LB5xKJ5UqtqxrxGlddx1Rq3Q_M0(TimelineView timelineView, long j) {
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onProgressChange(j, false);
        }
    }

    private float getVideoHeight() {
        if (this.videoTrack == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), r0.selectedT.get());
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

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.audioSelectedT.set(this.audioSelected));
    }

    private float getRoundHeight() {
        if (!this.hasRound) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.roundSelectedT.set(this.roundSelected));
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0dd8  */
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
        long j;
        boolean z2;
        long j2;
        float f;
        float f2;
        VelocityTracker velocityTracker3;
        long j3;
        long j4;
        VelocityTracker velocityTracker4;
        VelocityTracker velocityTracker5;
        Runnable runnable2;
        VelocityTracker velocityTracker6;
        float min;
        float max;
        float max2;
        float min2;
        float max3;
        float max4;
        boolean z3;
        TimelineDelegate timelineDelegate2;
        int i;
        boolean z4;
        float max5;
        int i2;
        float max6;
        float f3;
        float f4;
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
            int i3 = this.h - this.py;
            if (!this.open && this.timelineBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                this.pressType = 10;
                this.pressHandle = -1;
            }
            if (this.pressType == -1 && this.videoTrack != null) {
                float f5 = i3;
                if (motionEvent.getY() < f5 && motionEvent.getY() > (f5 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 0;
                }
                i3 = (int) (f5 - (getVideoHeight() + AndroidUtilities.dp(4.0f)));
            }
            if (this.pressType == -1 && !this.collageTracks.isEmpty()) {
                for (int i4 = 0; i4 < this.collageTracks.size(); i4++) {
                    f3 = 4.0f;
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((Track) this.collageTracks.get(i4)).selectedT.get());
                    float f6 = i3;
                    if (motionEvent.getY() < f6) {
                        f4 = 2.0f;
                        if (motionEvent.getY() > (f6 - lerp) - AndroidUtilities.dp(2.0f)) {
                            this.pressType = 3;
                            this.pressCollageIndex = i4;
                            break;
                        }
                    }
                    i3 = (int) (f6 - (lerp + AndroidUtilities.dp(4.0f)));
                }
            }
            f3 = 4.0f;
            f4 = 2.0f;
            if (this.pressType == -1 && this.hasRound) {
                float f7 = i3;
                if (motionEvent.getY() < f7 && motionEvent.getY() > (f7 - getRoundHeight()) - AndroidUtilities.dp(f4)) {
                    this.pressType = 1;
                }
                i3 = (int) (f7 - (getRoundHeight() + AndroidUtilities.dp(f3)));
            }
            if (this.pressType == -1 && this.hasAudio) {
                float f8 = i3;
                if (motionEvent.getY() < f8 && motionEvent.getY() > (f8 - getAudioHeight()) - AndroidUtilities.dp(f4)) {
                    this.pressType = 2;
                }
                getAudioHeight();
                AndroidUtilities.dp(f3);
            }
            this.pressTime = System.currentTimeMillis();
            int i5 = this.pressHandle;
            this.draggingProgress = i5 == 0 || i5 == -1 || i5 == 1;
            this.hadDragChange = false;
            if (i5 == 1 || i5 == 5 || i5 == 8) {
                this.velocityTracker = VelocityTracker.obtain();
            } else {
                VelocityTracker velocityTracker7 = this.velocityTracker;
                if (velocityTracker7 != null) {
                    velocityTracker7.recycle();
                    this.velocityTracker = null;
                }
            }
            this.dragSpeed = 1.0f;
            this.dragged = false;
            this.lastX = motionEvent.getX();
            if (!this.isCover) {
                AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
                AndroidUtilities.runOnUIThread(this.onLongPress, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            float x = motionEvent.getX() - this.lastX;
            if (this.open && (this.dragged || Math.abs(x) > AndroidUtilities.touchSlop)) {
                long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                Track track = this.videoTrack;
                if (track != null && this.pressHandle == 1) {
                    this.scroll = (long) Utilities.clamp(this.scroll - ((x / this.sw) * min3), track.duration - min3, 0.0f);
                    invalidate();
                    if (!this.dragged) {
                        this.dragSpeed = 1.0f;
                    }
                    this.dragged = true;
                    this.draggingProgress = false;
                } else if (track != null && ((i2 = this.pressHandle) == 2 || i2 == 3 || i2 == 4)) {
                    float f9 = track.duration;
                    float f10 = (x / this.sw) * (min3 / f9);
                    if (i2 == 2) {
                        track.left = Utilities.clamp(track.left + f10, track.right - (1000.0f / f9), 0.0f);
                        TimelineDelegate timelineDelegate3 = this.delegate;
                        if (timelineDelegate3 != null) {
                            timelineDelegate3.onVideoLeftChange(false, this.videoTrack.left);
                        }
                        Track track2 = this.videoTrack;
                        float f11 = track2.right - track2.left;
                        float maxSelectDuration = maxSelectDuration();
                        Track track3 = this.videoTrack;
                        if (f11 > maxSelectDuration / track3.duration) {
                            track3.right = Math.min(1.0f, track3.left + (maxSelectDuration() / this.videoTrack.duration));
                            TimelineDelegate timelineDelegate4 = this.delegate;
                            if (timelineDelegate4 != null) {
                                timelineDelegate4.onVideoRightChange(false, this.videoTrack.right);
                            }
                        }
                    } else if (i2 == 3) {
                        track.right = Utilities.clamp(track.right + f10, 1.0f, track.left + (1000.0f / f9));
                        TimelineDelegate timelineDelegate5 = this.delegate;
                        if (timelineDelegate5 != null) {
                            timelineDelegate5.onVideoRightChange(false, this.videoTrack.right);
                        }
                        Track track4 = this.videoTrack;
                        float f12 = track4.right - track4.left;
                        float maxSelectDuration2 = maxSelectDuration();
                        Track track5 = this.videoTrack;
                        if (f12 > maxSelectDuration2 / track5.duration) {
                            track5.left = Math.max(0.0f, track5.right - (maxSelectDuration() / this.videoTrack.duration));
                            TimelineDelegate timelineDelegate6 = this.delegate;
                            if (timelineDelegate6 != null) {
                                timelineDelegate6.onVideoLeftChange(false, this.videoTrack.left);
                            }
                        }
                    } else if (i2 == 4) {
                        if (f10 > 0.0f) {
                            max6 = Math.min(1.0f - track.right, f10);
                        } else {
                            max6 = Math.max(-track.left, f10);
                        }
                        Track track6 = this.videoTrack;
                        float f13 = track6.left + max6;
                        track6.left = f13;
                        track6.right += max6;
                        TimelineDelegate timelineDelegate7 = this.delegate;
                        if (timelineDelegate7 != null) {
                            timelineDelegate7.onVideoLeftChange(false, f13);
                            this.delegate.onVideoRightChange(false, this.videoTrack.right);
                        }
                    }
                    float f14 = this.progress;
                    Track track7 = this.videoTrack;
                    float f15 = track7.duration;
                    float f16 = f14 / f15;
                    float f17 = track7.left;
                    if (f16 < f17 || f16 > track7.right) {
                        long j5 = (long) (f17 * f15);
                        this.progress = j5;
                        TimelineDelegate timelineDelegate8 = this.delegate;
                        if (timelineDelegate8 != null) {
                            timelineDelegate8.onProgressChange(j5, false);
                        }
                    }
                    invalidate();
                    if (!this.dragged) {
                        this.dragSpeed = 1.0f;
                    }
                    this.dragged = true;
                    this.draggingProgress = false;
                } else {
                    int i6 = this.pressHandle;
                    if (i6 == 6 || i6 == 7 || i6 == 8) {
                        float f18 = (x / this.sw) * (min3 / this.audioDuration);
                        if (i6 == 6) {
                            float minAudioSelect = this.audioRight - (minAudioSelect() / this.audioDuration);
                            float max7 = Math.max(0L, this.scroll - this.audioOffset);
                            float f19 = this.audioDuration;
                            float f20 = max7 / f19;
                            Track track8 = this.videoTrack;
                            if (track8 != null) {
                                max2 = Math.max(f20, (((track8.left * track8.duration) + this.scroll) - this.audioOffset) / f19);
                            } else {
                                Track track9 = this.collageMain;
                                if (track9 != null) {
                                    max2 = Math.max(f20, (((track9.left * track9.duration) + this.scroll) - this.audioOffset) / f19);
                                } else if (this.hasRound) {
                                    max2 = Math.max(f20, (((this.roundLeft * this.roundDuration) + this.scroll) - this.audioOffset) / f19);
                                } else {
                                    max2 = Math.max(f20, this.audioRight - (maxSelectDuration() / this.audioDuration));
                                    if (!this.hadDragChange && f18 < 0.0f && this.audioLeft <= this.audioRight - (maxSelectDuration() / this.audioDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f21 = this.audioLeft;
                            float clamp = Utilities.clamp(f21 + f18, minAudioSelect, max2);
                            this.audioLeft = clamp;
                            if (Math.abs(f21 - clamp) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate9 = this.delegate;
                            if (timelineDelegate9 != null) {
                                timelineDelegate9.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
                            }
                            TimelineDelegate timelineDelegate10 = this.delegate;
                            if (timelineDelegate10 != null) {
                                timelineDelegate10.onAudioLeftChange(this.audioLeft);
                            }
                        } else if (i6 == 7) {
                            float min4 = Math.min(1.0f, Math.max(0L, (this.scroll - this.audioOffset) + min3) / this.audioDuration);
                            float f22 = this.audioLeft;
                            float minAudioSelect2 = minAudioSelect();
                            float f23 = this.audioDuration;
                            float f24 = f22 + (minAudioSelect2 / f23);
                            Track track10 = this.videoTrack;
                            if (track10 != null) {
                                min = Math.min(min4, (((track10.right * track10.duration) + this.scroll) - this.audioOffset) / f23);
                            } else {
                                Track track11 = this.collageMain;
                                if (track11 != null) {
                                    min = Math.min(min4, (((track11.right * track11.duration) + this.scroll) - this.audioOffset) / f23);
                                } else if (this.hasRound) {
                                    min = Math.min(min4, (((this.roundRight * this.roundDuration) + this.scroll) - this.audioOffset) / f23);
                                } else {
                                    min = Math.min(min4, this.audioLeft + (maxSelectDuration() / this.audioDuration));
                                    if (!this.hadDragChange && f18 > 0.0f && this.audioRight >= this.audioLeft + (maxSelectDuration() / this.audioDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f25 = this.audioRight;
                            float clamp2 = Utilities.clamp(f25 + f18, min, f24);
                            this.audioRight = clamp2;
                            if (Math.abs(f25 - clamp2) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate11 = this.delegate;
                            if (timelineDelegate11 != null) {
                                timelineDelegate11.onAudioRightChange(this.audioRight);
                            }
                        }
                        if (this.pressHandle == 8) {
                            float max8 = Math.max(0L, this.scroll - this.audioOffset) / this.audioDuration;
                            float min5 = Math.min(1.0f, Math.max(0L, (this.scroll - this.audioOffset) + min3) / this.audioDuration);
                            if (f18 > 0.0f) {
                                max = Math.min(Math.max(0.0f, min5 - this.audioRight), f18);
                            } else {
                                max = Math.max(Math.min(0.0f, max8 - this.audioLeft), f18);
                            }
                            float f26 = this.audioLeft + max;
                            this.audioLeft = f26;
                            this.audioRight += max;
                            TimelineDelegate timelineDelegate12 = this.delegate;
                            if (timelineDelegate12 != null) {
                                timelineDelegate12.onAudioLeftChange(f26);
                                this.delegate.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
                                this.delegate.onAudioRightChange(this.audioRight);
                            }
                            TimelineDelegate timelineDelegate13 = this.delegate;
                            if (timelineDelegate13 != null) {
                                timelineDelegate13.onProgressDragChange(true);
                            }
                        }
                        if (this.videoTrack == null && !this.hasRound) {
                            this.progress = (long) (this.audioLeft * this.audioDuration);
                            TimelineDelegate timelineDelegate14 = this.delegate;
                            if (timelineDelegate14 != null) {
                                timelineDelegate14.onProgressDragChange(true);
                                this.delegate.onProgressChange(this.progress, false);
                            }
                        }
                        invalidate();
                        if (!this.dragged) {
                            this.dragSpeed = 1.0f;
                        }
                        this.dragged = true;
                        this.draggingProgress = false;
                    } else if (i6 == 10 || i6 == 11 || i6 == 12) {
                        float f27 = (x / this.sw) * (min3 / this.roundDuration);
                        if (i6 == 10) {
                            float minAudioSelect3 = this.roundRight - (minAudioSelect() / this.roundDuration);
                            float max9 = Math.max(0L, this.scroll - this.roundOffset);
                            float f28 = this.roundDuration;
                            float f29 = max9 / f28;
                            Track track12 = this.videoTrack;
                            if (track12 != null) {
                                max4 = Math.max(f29, (((track12.left * track12.duration) + this.scroll) - this.roundOffset) / f28);
                            } else {
                                Track track13 = this.collageMain;
                                if (track13 != null) {
                                    max4 = Math.max(f29, (((track13.left * track13.duration) + this.scroll) - this.roundOffset) / f28);
                                } else {
                                    max4 = Math.max(f29, this.roundRight - (maxSelectDuration() / this.roundDuration));
                                    if (!this.hadDragChange && f27 < 0.0f && this.roundLeft <= this.roundRight - (maxSelectDuration() / this.roundDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f30 = this.roundLeft;
                            float clamp3 = Utilities.clamp(f30 + f27, minAudioSelect3, max4);
                            this.roundLeft = clamp3;
                            if (Math.abs(f30 - clamp3) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate15 = this.delegate;
                            if (timelineDelegate15 != null) {
                                timelineDelegate15.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
                            }
                            TimelineDelegate timelineDelegate16 = this.delegate;
                            if (timelineDelegate16 != null) {
                                timelineDelegate16.onRoundLeftChange(this.roundLeft);
                            }
                        } else if (i6 == 11) {
                            float min6 = Math.min(1.0f, Math.max(0L, (this.scroll - this.roundOffset) + min3) / this.roundDuration);
                            float f31 = this.roundLeft;
                            float minAudioSelect4 = minAudioSelect();
                            float f32 = this.roundDuration;
                            float f33 = f31 + (minAudioSelect4 / f32);
                            Track track14 = this.videoTrack;
                            if (track14 != null) {
                                min6 = Math.min(min6, (((track14.right * track14.duration) + this.scroll) - this.roundOffset) / f32);
                            }
                            Track track15 = this.collageMain;
                            if (track15 != null) {
                                min2 = Math.min(min6, (((track15.right * track15.duration) + this.scroll) - this.roundOffset) / this.roundDuration);
                            } else {
                                min2 = Math.min(min6, this.roundLeft + (maxSelectDuration() / this.roundDuration));
                                if (!this.hadDragChange && f27 > 0.0f && this.roundRight >= this.roundLeft + (maxSelectDuration() / this.roundDuration)) {
                                    this.pressHandle = 8;
                                }
                            }
                            float f34 = this.roundRight;
                            float clamp4 = Utilities.clamp(f34 + f27, min2, f33);
                            this.roundRight = clamp4;
                            if (Math.abs(f34 - clamp4) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate17 = this.delegate;
                            if (timelineDelegate17 != null) {
                                timelineDelegate17.onRoundRightChange(this.roundRight);
                            }
                        }
                        if (this.pressHandle == 12) {
                            float max10 = Math.max(0L, this.scroll - this.roundOffset) / this.roundDuration;
                            float min7 = Math.min(1.0f, Math.max(0L, (this.scroll - this.roundOffset) + min3) / this.roundDuration);
                            if (f27 > 0.0f) {
                                max3 = Math.min(min7 - this.roundRight, f27);
                            } else {
                                max3 = Math.max(max10 - this.roundLeft, f27);
                            }
                            float f35 = this.roundLeft + max3;
                            this.roundLeft = f35;
                            this.roundRight += max3;
                            TimelineDelegate timelineDelegate18 = this.delegate;
                            if (timelineDelegate18 != null) {
                                timelineDelegate18.onRoundLeftChange(f35);
                                this.delegate.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
                                this.delegate.onRoundRightChange(this.roundRight);
                            }
                            TimelineDelegate timelineDelegate19 = this.delegate;
                            if (timelineDelegate19 != null) {
                                timelineDelegate19.onProgressDragChange(true);
                            }
                        }
                        if (this.videoTrack == null) {
                            this.progress = (long) (this.roundLeft * this.roundDuration);
                            TimelineDelegate timelineDelegate20 = this.delegate;
                            if (timelineDelegate20 != null) {
                                timelineDelegate20.onProgressDragChange(true);
                                this.delegate.onProgressChange(this.progress, false);
                            }
                        }
                        invalidate();
                        if (!this.dragged) {
                            this.dragSpeed = 1.0f;
                        }
                        this.dragged = true;
                        this.draggingProgress = false;
                    } else {
                        int i7 = this.pressHandleCollageIndex;
                        if (i7 >= 0 && i7 < this.collageTracks.size() && ((i = this.pressHandle) == 13 || i == 14 || i == 15)) {
                            Track track16 = (Track) this.collageTracks.get(this.pressHandleCollageIndex);
                            float f36 = (x / this.sw) * (min3 / track16.duration);
                            int i8 = this.pressHandle;
                            if (i8 == 13) {
                                float minAudioSelect5 = track16.right - (minAudioSelect() / track16.duration);
                                float max11 = Math.max(0L, this.scroll - track16.offset) / track16.duration;
                                if (track16 == this.collageMain) {
                                    max11 = Math.max(max11, track16.right - (maxSelectDuration() / track16.duration));
                                    if (!this.hadDragChange && f36 < 0.0f && track16.left <= track16.right - (maxSelectDuration() / track16.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f37 = track16.left;
                                float clamp5 = Utilities.clamp(f37 + f36, minAudioSelect5, max11);
                                track16.left = clamp5;
                                if (Math.abs(f37 - clamp5) > 0.01f) {
                                    this.hadDragChange = true;
                                }
                                TimelineDelegate timelineDelegate21 = this.delegate;
                                if (timelineDelegate21 != null) {
                                    timelineDelegate21.onVideoOffsetChange(track16.index, track16.offset);
                                }
                                TimelineDelegate timelineDelegate22 = this.delegate;
                                if (timelineDelegate22 != null) {
                                    timelineDelegate22.onVideoLeftChange(track16.index, track16.left);
                                }
                            } else if (i8 == 14) {
                                float min8 = Math.min(1.0f, Math.max(0L, (this.scroll - track16.offset) + min3) / track16.duration);
                                float minAudioSelect6 = track16.left + (minAudioSelect() / track16.duration);
                                if (track16 == this.collageMain) {
                                    min8 = Math.min(min8, track16.left + (maxSelectDuration() / track16.duration));
                                    if (!this.hadDragChange && f36 > 0.0f && track16.right >= track16.left + (maxSelectDuration() / track16.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f38 = track16.right;
                                float clamp6 = Utilities.clamp(f38 + f36, min8, minAudioSelect6);
                                track16.right = clamp6;
                                if (Math.abs(f38 - clamp6) > 0.01f) {
                                    this.hadDragChange = true;
                                }
                                TimelineDelegate timelineDelegate23 = this.delegate;
                                if (timelineDelegate23 != null) {
                                    timelineDelegate23.onVideoRightChange(track16.index, track16.right);
                                }
                            }
                            if (this.pressHandle == 15) {
                                float max12 = Math.max(0L, this.scroll - track16.offset) / track16.duration;
                                float min9 = Math.min(1.0f, Math.max(0L, (this.scroll - track16.offset) + min3) / track16.duration);
                                if (f36 > 0.0f) {
                                    max5 = Math.min(min9 - track16.right, f36);
                                } else {
                                    max5 = Math.max(max12 - track16.left, f36);
                                }
                                float f39 = track16.left + max5;
                                track16.left = f39;
                                track16.right += max5;
                                TimelineDelegate timelineDelegate24 = this.delegate;
                                if (timelineDelegate24 != null) {
                                    timelineDelegate24.onVideoLeftChange(track16.index, f39);
                                    this.delegate.onVideoOffsetChange(track16.index, track16.offset);
                                    this.delegate.onVideoRightChange(track16.index, track16.right);
                                }
                                TimelineDelegate timelineDelegate25 = this.delegate;
                                if (timelineDelegate25 != null) {
                                    z4 = true;
                                    timelineDelegate25.onProgressDragChange(true);
                                    invalidate();
                                    if (!this.dragged) {
                                        this.dragSpeed = 1.0f;
                                    }
                                    this.dragged = z4;
                                    this.draggingProgress = false;
                                }
                            }
                            z4 = true;
                            invalidate();
                            if (!this.dragged) {
                            }
                            this.dragged = z4;
                            this.draggingProgress = false;
                        } else {
                            int i9 = this.pressHandle;
                            if (i9 == 5) {
                                moveAudioOffset((x / this.sw) * min3);
                                if (!this.dragged) {
                                    this.dragSpeed = 1.0f;
                                }
                                this.dragged = true;
                                this.draggingProgress = false;
                            } else if (i9 == 9) {
                                moveRoundOffset((x / this.sw) * min3);
                                if (!this.dragged) {
                                    this.dragSpeed = 1.0f;
                                }
                                this.dragged = true;
                                this.draggingProgress = false;
                            } else {
                                int i10 = this.pressHandleCollageIndex;
                                if (i10 >= 0 && i10 < this.collageTracks.size() && this.pressHandle == 16) {
                                    moveCollageOffset((Track) this.collageTracks.get(this.pressHandleCollageIndex), (x / this.sw) * min3);
                                    if (!this.dragged) {
                                        this.dragSpeed = 1.0f;
                                    }
                                    this.dragged = true;
                                    this.draggingProgress = false;
                                } else if (this.draggingProgress) {
                                    setProgressAt(motionEvent.getX(), currentTimeMillis - this.lastTime < 350);
                                    if (this.dragged || (timelineDelegate2 = this.delegate) == null) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                        timelineDelegate2.onProgressDragChange(true);
                                    }
                                    if (!this.dragged) {
                                        this.dragSpeed = 1.0f;
                                    }
                                    this.dragged = z3;
                                }
                            }
                        }
                    }
                }
                this.lastX = motionEvent.getX();
            }
            if (this.dragged) {
                AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
            }
            int i11 = this.pressHandle;
            if ((i11 == 1 || i11 == 5 || i11 == 8) && (velocityTracker6 = this.velocityTracker) != null) {
                velocityTracker6.addMovement(motionEvent);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
            this.scroller.abortAnimation();
            if (motionEvent.getAction() == 1) {
                if ((System.currentTimeMillis() - this.pressTime <= ViewConfiguration.getTapTimeout() && !this.dragged) || !this.open) {
                    if (!this.open) {
                        if (this.pressType == 10 && (runnable2 = this.onTimelineClick) != null) {
                            runnable2.run();
                        }
                    } else if (this.isCover && this.videoTrack != null) {
                        long clamp7 = (long) Utilities.clamp(((((motionEvent.getX() - this.px) - this.ph) / this.sw) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.scroll, getBaseDuration(), 0.0f);
                        Track track17 = this.videoTrack;
                        float f40 = track17.right - track17.left;
                        track17.left = (clamp7 / getBaseDuration()) * (1.0f - f40);
                        Track track18 = this.videoTrack;
                        float f41 = track18.left;
                        track18.right = f40 + f41;
                        TimelineDelegate timelineDelegate26 = this.delegate;
                        if (timelineDelegate26 != null) {
                            timelineDelegate26.onVideoLeftChange(true, f41);
                            this.delegate.onVideoRightChange(true, this.videoTrack.right);
                        }
                        invalidate();
                    } else {
                        int i12 = this.pressType;
                        if (i12 == 3) {
                            int i13 = (this.audioSelected || this.roundSelected) ? -1 : this.collageSelected;
                            int i14 = this.pressCollageIndex;
                            if (i13 != i14) {
                                this.audioSelected = false;
                                this.roundSelected = false;
                                this.collageSelected = i14;
                                if (this.delegate != null && i14 >= 0 && i14 < this.collageTracks.size()) {
                                    this.delegate.onVideoSelected(((Track) this.collageTracks.get(this.pressCollageIndex)).index);
                                }
                                invalidate();
                            }
                        }
                        if (i12 == 2 && !this.audioSelected) {
                            this.audioSelected = true;
                            this.roundSelected = false;
                            TimelineDelegate timelineDelegate27 = this.delegate;
                            if (timelineDelegate27 != null) {
                                timelineDelegate27.onRoundSelectChange(false);
                            }
                            invalidate();
                        } else if (i12 == 1 && !this.roundSelected) {
                            this.audioSelected = false;
                            this.roundSelected = true;
                            TimelineDelegate timelineDelegate28 = this.delegate;
                            if (timelineDelegate28 != null) {
                                timelineDelegate28.onRoundSelectChange(true);
                            }
                            invalidate();
                        } else if (i12 != 2 && this.audioSelected) {
                            this.audioSelected = false;
                            this.roundSelected = false;
                            TimelineDelegate timelineDelegate29 = this.delegate;
                            if (timelineDelegate29 != null) {
                                timelineDelegate29.onRoundSelectChange(false);
                            }
                            invalidate();
                        } else if (i12 != 1 && this.roundSelected) {
                            this.audioSelected = false;
                            this.roundSelected = false;
                            TimelineDelegate timelineDelegate30 = this.delegate;
                            if (timelineDelegate30 != null) {
                                timelineDelegate30.onRoundSelectChange(false);
                            }
                            invalidate();
                        } else {
                            long j6 = this.progress;
                            if (setProgressAt(motionEvent.getX(), false) && Math.abs(this.progress - j6) > 400) {
                                this.loopProgressFrom = j6;
                                this.loopProgress.set(1.0f, true);
                                invalidate();
                            }
                        }
                    }
                } else {
                    int i15 = this.pressHandle;
                    int i16 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                    if (i15 == 16 && (velocityTracker5 = this.velocityTracker) != null) {
                        velocityTracker5.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        int xVelocity = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = true;
                        if (this.videoTrack != null && Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                            long min10 = Math.min(this.videoTrack.duration, getMaxScrollDuration());
                            int i17 = this.px;
                            float f42 = i17;
                            float f43 = min10;
                            float f44 = this.sw;
                            int i18 = (int) (((this.scroll / f43) * f44) + f42);
                            this.scrolling = true;
                            Scroller scroller = this.scroller;
                            this.wasScrollX = i18;
                            scroller.fling(i18, 0, -xVelocity, 0, i17, (int) (f42 + (((this.videoTrack.duration - min10) / f43) * f44)), 0, 0);
                            z = false;
                        }
                    } else if (i15 == 1 && (velocityTracker4 = this.velocityTracker) != null) {
                        velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        int xVelocity2 = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = true;
                        if (this.videoTrack != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                            long min11 = Math.min(this.videoTrack.duration, getMaxScrollDuration());
                            int i19 = this.px;
                            float f45 = i19;
                            float f46 = min11;
                            float f47 = this.sw;
                            int i20 = (int) (((this.scroll / f46) * f47) + f45);
                            this.scrolling = true;
                            Scroller scroller2 = this.scroller;
                            this.wasScrollX = i20;
                            scroller2.fling(i20, 0, -xVelocity2, 0, i19, (int) (f45 + (((this.videoTrack.duration - min11) / f46) * f47)), 0, 0);
                            z = false;
                        }
                    } else if ((i15 == 5 || (i15 == 8 && !this.dragged)) && this.audioSelected && (velocityTracker2 = this.velocityTracker) != null) {
                        if (this.videoTrack == null) {
                            i16 = 1500;
                        }
                        velocityTracker2.computeCurrentVelocity(i16);
                        int xVelocity3 = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = false;
                        if (Math.abs(xVelocity3) > AndroidUtilities.dp(100.0f)) {
                            float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                            int i21 = (int) (this.px + this.ph + ((this.audioOffset / min12) * this.sw));
                            Track track19 = this.videoTrack;
                            if (track19 != null) {
                                float f48 = track19.right;
                                float f49 = track19.duration;
                                long j7 = this.audioDuration;
                                j2 = (long) ((f48 * f49) - 0);
                                f = track19.left * f49;
                                f2 = j7;
                            } else if (this.hasRound) {
                                float f50 = this.roundRight;
                                float f51 = this.roundDuration;
                                long j8 = this.audioDuration;
                                j2 = (long) ((f50 * f51) - 0);
                                f = this.roundLeft * f51;
                                f2 = j8;
                            } else {
                                j = -(this.audioDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                z2 = true;
                                j2 = 0;
                                this.scrolling = z2;
                                Scroller scroller3 = this.scroller;
                                this.wasScrollX = i21;
                                float f52 = this.px + this.ph;
                                float f53 = this.sw;
                                scroller3.fling(i21, 0, xVelocity3, 0, (int) (((j / min12) * f53) + f52), (int) (f52 + ((j2 / min12) * f53)), 0, 0);
                                z = false;
                            }
                            j = (long) (f - f2);
                            z2 = true;
                            this.scrolling = z2;
                            Scroller scroller32 = this.scroller;
                            this.wasScrollX = i21;
                            float f522 = this.px + this.ph;
                            float f532 = this.sw;
                            scroller32.fling(i21, 0, xVelocity3, 0, (int) (((j / min12) * f532) + f522), (int) (f522 + ((j2 / min12) * f532)), 0, 0);
                            z = false;
                        }
                    } else if ((i15 == 9 || (i15 == 12 && !this.dragged)) && this.roundSelected && (velocityTracker3 = this.velocityTracker) != null) {
                        if (this.videoTrack == null) {
                            i16 = 1500;
                        }
                        velocityTracker3.computeCurrentVelocity(i16);
                        int xVelocity4 = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = false;
                        if (Math.abs(xVelocity4) > AndroidUtilities.dp(100.0f)) {
                            float min13 = Math.min(getBaseDuration(), getMaxScrollDuration());
                            int i22 = (int) (this.px + this.ph + ((this.roundOffset / min13) * this.sw));
                            Track track20 = this.videoTrack;
                            if (track20 != null) {
                                float f54 = track20.right;
                                float f55 = track20.duration;
                                j3 = (long) ((f54 * f55) - 0);
                                j4 = (long) ((track20.left * f55) - this.roundDuration);
                            } else {
                                j3 = 0;
                                j4 = -(this.roundDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                            }
                            this.scrolling = true;
                            Scroller scroller4 = this.scroller;
                            this.wasScrollX = i22;
                            float f56 = this.px + this.ph;
                            float f57 = this.sw;
                            scroller4.fling(i22, 0, xVelocity4, 0, (int) (((j4 / min13) * f57) + f56), (int) (f56 + ((j3 / min13) * f57)), 0, 0);
                            z = false;
                        }
                    }
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
                }
            }
            z = true;
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
        }
        this.lastTime = System.currentTimeMillis();
        return true;
    }

    private long minAudioSelect() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    private void moveAudioOffset(float f) {
        float f2;
        long j;
        float f3;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        TimelineDelegate timelineDelegate;
        long clamp;
        Track track = this.videoTrack;
        if (track == null && !this.hasRound) {
            long j7 = this.audioOffset;
            long clamp2 = Utilities.clamp(j7 + ((long) f), 0L, -(this.audioDuration - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.audioOffset = clamp2;
            float f4 = clamp2 - j7;
            this.audioLeft = Utilities.clamp(this.audioLeft - (f4 / this.audioDuration), 1.0f, 0.0f);
            this.audioRight = Utilities.clamp(this.audioRight - (f4 / this.audioDuration), 1.0f, 0.0f);
            TimelineDelegate timelineDelegate2 = this.delegate;
            if (timelineDelegate2 != null) {
                timelineDelegate2.onAudioLeftChange(this.audioLeft);
                this.delegate.onAudioRightChange(this.audioRight);
            }
        } else if (this.audioSelected) {
            if (track != null) {
                f2 = track.left;
                j = track.duration;
            } else {
                f2 = this.roundLeft;
                j = this.roundDuration;
            }
            float f5 = f2 * j;
            if (track != null) {
                f3 = track.right;
                j2 = track.duration;
            } else {
                f3 = this.roundRight;
                j2 = this.roundDuration;
            }
            float f6 = f3 * j2;
            float f7 = track != null ? (track.right - track.left) * track.duration : this.roundDuration * (this.roundRight - this.roundLeft);
            float f8 = this.audioRight;
            float f9 = this.audioDuration;
            long j8 = (long) (f6 - (f8 * f9));
            float f10 = this.audioLeft;
            long j9 = (long) (f5 - (f10 * f9));
            float min = Math.min(f8 - f10, f7 / f9);
            long j10 = this.audioOffset;
            long j11 = (long) f;
            long j12 = j10 + j11;
            if (j12 > j8) {
                float clamp3 = Utilities.clamp(((f6 - j10) - j11) / this.audioDuration, 1.0f, min);
                this.audioRight = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.audioLeft = clamp4;
                float f11 = this.audioRight;
                float f12 = this.audioDuration;
                long j13 = (long) (f6 - (f11 * f12));
                long j14 = (long) (f5 - (clamp4 * f12));
                if (j13 < j14) {
                    j6 = j14;
                    j5 = j13;
                } else {
                    j5 = j14;
                    j6 = j13;
                }
                this.audioOffset = Utilities.clamp(this.audioOffset + j11, j6, j5);
                TimelineDelegate timelineDelegate3 = this.delegate;
                if (timelineDelegate3 != null) {
                    timelineDelegate3.onAudioLeftChange(this.audioLeft);
                    this.delegate.onAudioRightChange(this.audioRight);
                }
            } else if (j12 < j9) {
                float clamp5 = Utilities.clamp(((f5 - j10) - j11) / this.audioDuration, 1.0f - min, 0.0f);
                this.audioLeft = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.audioRight = clamp6;
                float f13 = this.audioDuration;
                long j15 = (long) (f6 - (clamp6 * f13));
                long j16 = (long) (f5 - (this.audioLeft * f13));
                if (j15 < j16) {
                    j4 = j16;
                    j3 = j15;
                } else {
                    j3 = j16;
                    j4 = j15;
                }
                this.audioOffset = Utilities.clamp(this.audioOffset + j11, j4, j3);
                TimelineDelegate timelineDelegate4 = this.delegate;
                if (timelineDelegate4 != null) {
                    timelineDelegate4.onAudioLeftChange(this.audioLeft);
                    this.delegate.onAudioRightChange(this.audioRight);
                }
            } else {
                this.audioOffset = j12;
            }
        } else {
            long j17 = this.audioOffset + ((long) f);
            float baseDuration = getBaseDuration();
            float f14 = this.audioDuration;
            this.audioOffset = Utilities.clamp(j17, (long) (baseDuration - (this.audioRight * f14)), (long) ((-this.audioLeft) * f14));
        }
        invalidate();
        TimelineDelegate timelineDelegate5 = this.delegate;
        if (timelineDelegate5 != null) {
            timelineDelegate5.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
        }
        boolean z = this.dragged;
        if (!z && (timelineDelegate = this.delegate) != null) {
            timelineDelegate.onProgressDragChange(true);
            Track track2 = this.videoTrack;
            if (track2 != null) {
                long j18 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f15 = track2.right;
                float f16 = track2.duration;
                clamp = Utilities.clamp(j18, (long) (f15 * f16), (long) (track2.left * f16));
            } else if (this.hasRound) {
                long j19 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f17 = this.roundRight;
                float f18 = this.roundDuration;
                clamp = Utilities.clamp(j19, (long) (f17 * f18), (long) (this.roundLeft * f18));
            } else {
                float f19 = this.audioLeft;
                long j20 = this.audioDuration;
                clamp = Utilities.clamp((long) (f19 * j20), j20, 0L);
            }
            if (this.videoTrack != null && Math.abs(this.progress - clamp) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            TimelineDelegate timelineDelegate6 = this.delegate;
            this.progress = clamp;
            timelineDelegate6.onProgressChange(clamp, false);
            return;
        }
        if (z || this.scrolling) {
            Track track3 = this.videoTrack;
            if (track3 != null) {
                long j21 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f20 = track3.right;
                float f21 = track3.duration;
                this.progress = Utilities.clamp(j21, (long) (f20 * f21), (long) (track3.left * f21));
            } else if (this.hasRound && track3 != null) {
                long j22 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f22 = this.roundRight;
                float f23 = track3.duration;
                this.progress = Utilities.clamp(j22, (long) (f22 * f23), (long) (this.roundLeft * f23));
            } else {
                float f24 = this.audioLeft;
                long j23 = this.audioDuration;
                this.progress = Utilities.clamp((long) (f24 * j23), j23, 0L);
            }
            TimelineDelegate timelineDelegate7 = this.delegate;
            if (timelineDelegate7 != null) {
                timelineDelegate7.onProgressChange(this.progress, false);
            }
        }
    }

    private void moveRoundOffset(float f) {
        long j;
        long j2;
        long j3;
        long j4;
        TimelineDelegate timelineDelegate;
        long clamp;
        Track track = this.videoTrack;
        if (track == null) {
            long j5 = this.roundOffset;
            long clamp2 = Utilities.clamp(j5 + ((long) f), 0L, -(this.roundDuration - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.roundOffset = clamp2;
            float f2 = clamp2 - j5;
            this.roundLeft = Utilities.clamp(this.roundLeft - (f2 / this.roundDuration), 1.0f, 0.0f);
            this.roundRight = Utilities.clamp(this.roundRight - (f2 / this.roundDuration), 1.0f, 0.0f);
            TimelineDelegate timelineDelegate2 = this.delegate;
            if (timelineDelegate2 != null) {
                timelineDelegate2.onRoundLeftChange(this.roundLeft);
                this.delegate.onRoundRightChange(this.roundRight);
            }
        } else if (this.roundSelected) {
            float f3 = track.right;
            float f4 = track.duration;
            float f5 = this.roundRight;
            float f6 = this.roundDuration;
            long j6 = (long) ((f3 * f4) - (f5 * f6));
            float f7 = track.left;
            float f8 = this.roundLeft;
            long j7 = (long) ((f7 * f4) - (f8 * f6));
            float min = Math.min(f5 - f8, ((f3 - f7) * f4) / f6);
            long j8 = this.roundOffset;
            long j9 = (long) f;
            long j10 = j8 + j9;
            if (j10 > j6) {
                float clamp3 = Utilities.clamp((((this.videoTrack.right * r1.duration) - j8) - j9) / this.roundDuration, 1.0f, min);
                this.roundRight = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.roundLeft = clamp4;
                Track track2 = this.videoTrack;
                float f9 = track2.right;
                float f10 = track2.duration;
                float f11 = this.roundRight;
                float f12 = this.roundDuration;
                long j11 = (long) ((f9 * f10) - (f11 * f12));
                long j12 = (long) ((track2.left * f10) - (clamp4 * f12));
                if (j11 < j12) {
                    j4 = j12;
                    j3 = j11;
                } else {
                    j3 = j12;
                    j4 = j11;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j9, j4, j3);
                TimelineDelegate timelineDelegate3 = this.delegate;
                if (timelineDelegate3 != null) {
                    timelineDelegate3.onRoundLeftChange(this.roundLeft);
                    this.delegate.onRoundRightChange(this.roundRight);
                }
            } else if (j10 < j7) {
                float clamp5 = Utilities.clamp((((this.videoTrack.left * r1.duration) - j8) - j9) / this.roundDuration, 1.0f - min, 0.0f);
                this.roundLeft = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.roundRight = clamp6;
                Track track3 = this.videoTrack;
                float f13 = track3.right;
                float f14 = track3.duration;
                float f15 = this.roundDuration;
                long j13 = (long) ((f13 * f14) - (clamp6 * f15));
                long j14 = (long) ((track3.left * f14) - (this.roundLeft * f15));
                if (j13 < j14) {
                    j2 = j14;
                    j = j13;
                } else {
                    j = j14;
                    j2 = j13;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j9, j2, j);
                TimelineDelegate timelineDelegate4 = this.delegate;
                if (timelineDelegate4 != null) {
                    timelineDelegate4.onRoundLeftChange(this.roundLeft);
                    this.delegate.onRoundRightChange(this.roundRight);
                }
            } else {
                this.roundOffset = j10;
            }
        } else {
            long j15 = this.roundOffset + ((long) f);
            float baseDuration = getBaseDuration();
            float f16 = this.roundDuration;
            this.roundOffset = Utilities.clamp(j15, (long) (baseDuration - (this.roundRight * f16)), (long) ((-this.roundLeft) * f16));
        }
        invalidate();
        TimelineDelegate timelineDelegate5 = this.delegate;
        if (timelineDelegate5 != null) {
            timelineDelegate5.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
        }
        boolean z = this.dragged;
        if (!z && (timelineDelegate = this.delegate) != null) {
            timelineDelegate.onProgressDragChange(true);
            Track track4 = this.videoTrack;
            if (track4 != null) {
                long j16 = this.roundOffset + ((long) (this.roundLeft * this.roundDuration));
                float f17 = track4.right;
                float f18 = track4.duration;
                clamp = Utilities.clamp(j16, (long) (f17 * f18), (long) (track4.left * f18));
            } else {
                float f19 = this.roundLeft;
                long j17 = this.roundDuration;
                clamp = Utilities.clamp((long) (f19 * j17), j17, 0L);
            }
            if (this.videoTrack != null && Math.abs(this.progress - clamp) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            TimelineDelegate timelineDelegate6 = this.delegate;
            this.progress = clamp;
            timelineDelegate6.onProgressChange(clamp, false);
            return;
        }
        if (z || this.scrolling) {
            Track track5 = this.videoTrack;
            if (track5 != null) {
                long j18 = this.roundOffset + ((long) (this.roundLeft * this.roundDuration));
                float f20 = track5.right;
                float f21 = track5.duration;
                this.progress = Utilities.clamp(j18, (long) (f20 * f21), (long) (track5.left * f21));
            } else {
                float f22 = this.roundLeft;
                long j19 = this.roundDuration;
                this.progress = Utilities.clamp((long) (f22 * j19), j19, 0L);
            }
            TimelineDelegate timelineDelegate7 = this.delegate;
            if (timelineDelegate7 != null) {
                timelineDelegate7.onProgressChange(this.progress, false);
            }
        }
    }

    private void moveCollageOffset(Track track, float f) {
        TimelineDelegate timelineDelegate;
        long clamp;
        long j;
        long j2;
        long j3;
        long j4;
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
                long j5 = (long) ((f2 * 1.0f) - (f3 * f4));
                float f5 = track.left;
                long j6 = (long) ((f2 * 0.0f) - (f5 * f4));
                float min = Math.min(f3 - f5, ((track3.right - track3.left) * f2) / f4);
                long j7 = track.offset;
                long j8 = (long) f;
                long j9 = j7 + j8;
                if (j9 > j5) {
                    float clamp2 = Utilities.clamp((((this.collageMain.right * r2.duration) - j7) - j8) / track.duration, 1.0f, min);
                    track.right = clamp2;
                    float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                    track.left = clamp3;
                    Track track4 = this.collageMain;
                    float f6 = track4.right;
                    float f7 = track4.duration;
                    float f8 = track.right;
                    float f9 = track.duration;
                    long j10 = (long) ((f6 * f7) - (f8 * f9));
                    long j11 = (long) ((track4.left * f7) - (clamp3 * f9));
                    if (j10 < j11) {
                        j4 = j11;
                        j3 = j10;
                    } else {
                        j3 = j11;
                        j4 = j10;
                    }
                    track.offset = Utilities.clamp(track.offset + j8, j4, j3);
                    TimelineDelegate timelineDelegate2 = this.delegate;
                    if (timelineDelegate2 != null) {
                        timelineDelegate2.onVideoLeftChange(track.index, track.left);
                        this.delegate.onVideoRightChange(track.index, track.right);
                    }
                } else if (j9 < j6) {
                    float clamp4 = Utilities.clamp((((this.collageMain.left * r2.duration) - j7) - j8) / track.duration, 1.0f - min, 0.0f);
                    track.left = clamp4;
                    float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                    track.right = clamp5;
                    Track track5 = this.collageMain;
                    float f10 = track5.right;
                    float f11 = track5.duration;
                    float f12 = track.duration;
                    long j12 = (long) ((f10 * f11) - (clamp5 * f12));
                    long j13 = (long) ((track5.left * f11) - (track.left * f12));
                    if (j12 < j13) {
                        j2 = j13;
                        j = j12;
                    } else {
                        j = j13;
                        j2 = j12;
                    }
                    track.offset = Utilities.clamp(track.offset + j8, j2, j);
                    TimelineDelegate timelineDelegate3 = this.delegate;
                    if (timelineDelegate3 != null) {
                        timelineDelegate3.onVideoLeftChange(track.index, track.left);
                        this.delegate.onVideoRightChange(track.index, track.right);
                    }
                } else {
                    track.offset = j9;
                }
            } else {
                long j14 = track.offset + ((long) f);
                float baseDuration = getBaseDuration();
                float f13 = track.duration;
                track.offset = Utilities.clamp(j14, (long) (baseDuration - (track.right * f13)), (long) ((-track.left) * f13));
            }
        }
        invalidate();
        TimelineDelegate timelineDelegate4 = this.delegate;
        if (timelineDelegate4 != null) {
            timelineDelegate4.onVideoOffsetChange(track.index, track.offset);
        }
        boolean z = this.dragged;
        if (!z && (timelineDelegate = this.delegate) != null) {
            timelineDelegate.onProgressDragChange(true);
            Track track6 = this.collageMain;
            if (track6 != track && track6 != null) {
                long j15 = track.offset + ((long) (track.left * track.duration));
                float f14 = track6.right;
                float f15 = track6.duration;
                clamp = Utilities.clamp(j15, (long) (f14 * f15), (long) (track6.left * f15));
            } else {
                float f16 = track.left;
                long j16 = track.duration;
                clamp = Utilities.clamp((long) (f16 * j16), j16, 0L);
            }
            Track track7 = this.collageMain;
            if (track7 != track && track7 != null && Math.abs(this.progress - clamp) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            TimelineDelegate timelineDelegate5 = this.delegate;
            this.progress = clamp;
            timelineDelegate5.onProgressChange(clamp, false);
            return;
        }
        if (z || this.scrolling) {
            Track track8 = this.collageMain;
            if (track8 != track && track8 != null) {
                long j17 = track.offset + ((long) (track.left * track.duration));
                float f17 = track8.right;
                float f18 = track8.duration;
                this.progress = Utilities.clamp(j17, (long) (f17 * f18), (long) (track8.left * f18));
            } else {
                float f19 = track.left;
                long j18 = track.duration;
                this.progress = Utilities.clamp((long) (f19 * j18), j18, 0L);
            }
            TimelineDelegate timelineDelegate6 = this.delegate;
            if (timelineDelegate6 != null) {
                timelineDelegate6.onProgressChange(this.progress, false);
            }
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.scroller.computeScrollOffset()) {
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
            return;
        }
        if (this.scrolling) {
            this.scrolling = false;
            TimelineDelegate timelineDelegate = this.delegate;
            if (timelineDelegate != null) {
                timelineDelegate.onProgressDragChange(false);
            }
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

        private void layout(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, AudioWaveformLoader audioWaveformLoader) {
            rewind();
            float round = Math.round(AndroidUtilities.dpf2(3.3333f));
            int count = audioWaveformLoader.getCount();
            int min = Math.min(count - 1, (int) Math.ceil(((this.ph + f3) - f) / round));
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
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x1009  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x1111  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x1151  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0eab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        float max;
        Track track;
        Track track2;
        int i2;
        float f3;
        float max2;
        Canvas canvas2;
        boolean z;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Paint paint;
        float f16;
        float f17;
        float f18;
        float f19;
        double d;
        float max3;
        float f20;
        float f21;
        float f22;
        Canvas canvas3;
        int i3;
        TimelineView timelineView;
        float f23;
        float f24;
        float f25;
        float f26;
        Track track3;
        long j;
        float lerp;
        float f27;
        long j2;
        float f28;
        float f29;
        BlurringShader.BlurManager blurManager;
        float f30;
        float f31;
        float f32;
        VideoThumbsLoader videoThumbsLoader;
        int i4;
        float f33;
        float f34;
        float f35;
        float f36;
        boolean z2;
        int i5;
        float f37;
        int i6;
        float f38;
        float f39;
        float f40;
        float f41;
        VideoThumbsLoader videoThumbsLoader2;
        float f42;
        float f43;
        float f44;
        boolean z3;
        float f45;
        float f46;
        float f47;
        int i7;
        BlurringShader.BlurManager blurManager2;
        TimelineView timelineView2 = this;
        Paint paint2 = timelineView2.backgroundBlur.getPaint(1.0f);
        float f48 = timelineView2.openT.set(timelineView2.open);
        long min = Math.min(timelineView2.getBaseDuration(), timelineView2.getMaxScrollDuration());
        if (f48 < 1.0f) {
            f = 28.0f;
            f2 = 1.0f;
            timelineView2.timelineBounds.set(timelineView2.px, (timelineView2.h - timelineView2.py) - AndroidUtilities.dp(28.0f), timelineView2.w - timelineView2.px, timelineView2.h - timelineView2.py);
            timelineView2.timelineClipPath.rewind();
            timelineView2.timelineClipPath.addRoundRect(timelineView2.timelineBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(timelineView2.timelineBounds, (int) ((1.0f - f48) * 255.0f), 31);
            canvas.clipPath(timelineView2.timelineClipPath);
            if (timelineView2.blurManager.hasRenderNode()) {
                timelineView2.backgroundBlur.drawRect(canvas);
                canvas.drawColor(855638016);
            } else if (paint2 == null) {
                canvas.drawColor(TLObject.FLAG_30);
            } else {
                canvas.drawRect(timelineView2.timelineBounds, paint2);
                canvas.drawColor(855638016);
            }
            if (!timelineView2.collageWaveforms.isEmpty() && (blurManager2 = timelineView2.blurManager) != null && blurManager2.hasRenderNode()) {
                float f49 = timelineView2.timelineWaveformMax.set(WaveformPath.getMaxBar(timelineView2.collageWaveforms));
                WaveformPath waveformPath = timelineView2.timelineWaveformPath;
                RectF rectF = timelineView2.timelineBounds;
                waveformPath.check(timelineView2.px + timelineView2.ph + (((timelineView2.audioOffset - timelineView2.scroll) / min) * timelineView2.sw), rectF.left, rectF.right, 0.0f, AndroidUtilities.dp(28.0f), f49, timelineView2.timelineBounds.bottom, timelineView2.collageWaveforms);
                canvas.saveLayerAlpha(timelineView2.timelineBounds, 102, 31);
                canvas.clipPath(timelineView2.timelineWaveformPath);
                timelineView2.audioWaveformBlur.drawRect(canvas);
                canvas.restore();
            } else if (!timelineView2.collageWaveforms.isEmpty()) {
                Paint paint3 = timelineView2.audioWaveformBlur.getPaint(0.4f);
                if (paint3 == null) {
                    paint3 = timelineView2.waveformPaint;
                    paint3.setAlpha(64);
                }
                float f50 = timelineView2.timelineWaveformMax.set(WaveformPath.getMaxBar(timelineView2.collageWaveforms));
                WaveformPath waveformPath2 = timelineView2.timelineWaveformPath;
                RectF rectF2 = timelineView2.timelineBounds;
                waveformPath2.check(timelineView2.px + timelineView2.ph + (((timelineView2.audioOffset - timelineView2.scroll) / min) * timelineView2.sw), rectF2.left, rectF2.right, 0.0f, AndroidUtilities.dp(28.0f), f50, timelineView2.timelineBounds.bottom, timelineView2.collageWaveforms);
                canvas.drawPath(timelineView2.timelineWaveformPath, paint3);
            }
            float currentWidth = ((timelineView2.timelineText.getCurrentWidth() + AndroidUtilities.dp(3.66f)) + timelineView2.timelineIcon.getIntrinsicWidth()) / 2.0f;
            int centerX = (int) (timelineView2.timelineBounds.centerX() - currentWidth);
            int centerY = (int) timelineView2.timelineBounds.centerY();
            Drawable drawable = timelineView2.timelineIcon;
            drawable.setBounds(centerX, centerY - (drawable.getIntrinsicHeight() / 2), timelineView2.timelineIcon.getIntrinsicWidth() + centerX, (timelineView2.timelineIcon.getIntrinsicHeight() / 2) + centerY);
            timelineView2.timelineIcon.setAlpha(NotificationCenter.boostByChannelCreated);
            timelineView2.timelineIcon.draw(canvas);
            timelineView2.timelineText.draw(canvas, (timelineView2.timelineBounds.centerX() - currentWidth) + timelineView2.timelineIcon.getIntrinsicWidth() + AndroidUtilities.dp(3.66f), centerY, -1, 0.75f);
            canvas.restore();
        } else {
            f = 28.0f;
            f2 = 1.0f;
        }
        if (f48 > 0.0f) {
            if (f48 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, timelineView2.getWidth(), timelineView2.getHeight(), (int) (f48 * 255.0f), 31);
                z = true;
            } else {
                canvas2 = canvas;
                z = false;
            }
            Track track4 = timelineView2.videoTrack;
            float f51 = track4 != null ? 1.0f : 0.0f;
            if (track4 != null) {
                f4 = track4.selectedT.set((timelineView2.audioSelected || timelineView2.roundSelected) ? false : true);
            } else {
                f4 = 0.0f;
            }
            float f52 = timelineView2.h - timelineView2.py;
            float dp = AndroidUtilities.dp(4.0f);
            float f53 = f4;
            float f54 = f51;
            if (timelineView2.videoTrack != null) {
                canvas2.save();
                float videoHeight = timelineView2.getVideoHeight();
                Track track5 = timelineView2.videoTrack;
                float f55 = track5.left;
                long j3 = track5.duration;
                float f56 = j3;
                float f57 = (f55 * f56 * f53) + 0.0f;
                f7 = (track5.right * f56 * f53) + 0.0f;
                float f58 = j3 <= 0 ? 0.0f : (timelineView2.px + timelineView2.ph) - ((timelineView2.scroll / min) * timelineView2.sw);
                float f59 = timelineView2.ph;
                float f60 = f58 - f59;
                if (j3 <= 0) {
                    f5 = dp;
                    f8 = videoHeight;
                    f46 = 0.0f;
                } else {
                    f5 = dp;
                    f8 = videoHeight;
                    f46 = timelineView2.px + r3 + (((j3 - timelineView2.scroll) / min) * timelineView2.sw);
                }
                timelineView2.videoBounds.set(f60, f52 - f8, f46 + f59, f52);
                float f61 = f52 - (f8 + (f5 * f54));
                RectF rectF3 = timelineView2.videoBounds;
                float f62 = (rectF3.top * f53) + 0.0f;
                float f63 = (rectF3.bottom * f53) + 0.0f;
                timelineView2.videoClipPath.rewind();
                timelineView2.videoClipPath.addRoundRect(timelineView2.videoBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(timelineView2.videoClipPath);
                VideoThumbsLoader videoThumbsLoader3 = timelineView2.videoTrack.thumbs;
                if (videoThumbsLoader3 != null) {
                    int frameWidth = videoThumbsLoader3.getFrameWidth();
                    float f64 = frameWidth;
                    f47 = f61;
                    f9 = f63;
                    int max4 = (int) Math.max(0.0d, Math.floor((f60 - timelineView2.px) / f64));
                    int min2 = (int) Math.min(timelineView2.videoTrack.thumbs.count, Math.ceil(((r3 - f60) - timelineView2.px) / f64) + 1.0d);
                    int i8 = (int) timelineView2.videoBounds.top;
                    boolean z4 = timelineView2.videoTrack.thumbs.frames.size() >= min2;
                    boolean z5 = (frameWidth == 0 || !z4 || timelineView2.videoTrack.isRound) ? false : true;
                    f10 = f62;
                    if (z5) {
                        int i9 = max4;
                        while (true) {
                            if (i9 >= Math.min(timelineView2.videoTrack.thumbs.frames.size(), min2)) {
                                break;
                            }
                            if (((VideoThumbsLoader.BitmapFrame) timelineView2.videoTrack.thumbs.frames.get(i9)).bitmap == null) {
                                z5 = false;
                                break;
                            }
                            i9++;
                        }
                    }
                    if (!z5) {
                        if (timelineView2.blurManager.hasRenderNode()) {
                            timelineView2.backgroundBlur.drawRect(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint2 == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(timelineView2.videoBounds, paint2);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (frameWidth != 0) {
                        float f65 = f60;
                        int i10 = max4;
                        while (i10 < Math.min(timelineView2.videoTrack.thumbs.frames.size(), min2)) {
                            VideoThumbsLoader.BitmapFrame bitmapFrame = (VideoThumbsLoader.BitmapFrame) timelineView2.videoTrack.thumbs.frames.get(i10);
                            if (bitmapFrame.bitmap != null) {
                                i7 = i10;
                                timelineView2.videoFramePaint.setAlpha((int) (bitmapFrame.getAlpha() * 255.0f));
                                canvas2.drawBitmap(bitmapFrame.bitmap, f65, i8 - ((int) ((r2.getHeight() - f8) / 2.0f)), timelineView2.videoFramePaint);
                            } else {
                                i7 = i10;
                            }
                            f65 += f64;
                            i10 = i7 + 1;
                        }
                    }
                    if (!z4) {
                        timelineView2.videoTrack.thumbs.load();
                    }
                } else {
                    f47 = f61;
                    f9 = f63;
                    f10 = f62;
                }
                timelineView2.selectedVideoClipPath.rewind();
                if (!timelineView2.isCover) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f66 = timelineView2.px + timelineView2.ph;
                    Track track6 = timelineView2.videoTrack;
                    float f67 = track6.left;
                    float f68 = track6.duration;
                    float f69 = timelineView2.scroll;
                    float f70 = min;
                    float f71 = ((f67 * f68) - f69) / f70;
                    float f72 = timelineView2.sw;
                    float f73 = (f66 + (f71 * f72)) - (f67 <= 0.0f ? r4 : 0);
                    float f74 = timelineView2.h - timelineView2.py;
                    float f75 = f74 - f8;
                    float f76 = track6.right;
                    rectF4.set(f73, f75, f66 + ((((f68 * f76) - f69) / f70) * f72) + (f76 >= f2 ? r4 : 0), f74);
                    timelineView2.selectedVideoClipPath.addRoundRect(rectF4, timelineView2.selectedVideoRadii, Path.Direction.CW);
                    canvas2.clipPath(timelineView2.selectedVideoClipPath, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f52 = f47;
                f6 = f57;
            } else {
                f5 = dp;
                f6 = 0.0f;
                f7 = 0.0f;
                f8 = 0.0f;
                f9 = 0.0f;
                f10 = 0.0f;
            }
            if (timelineView2.collageTracks.isEmpty()) {
                f11 = 0.0f;
            } else {
                timelineView2.getCollageHeight();
                int i11 = 0;
                while (i11 < timelineView2.collageTracks.size()) {
                    Track track7 = (Track) timelineView2.collageTracks.get(i11);
                    float f77 = track7.selectedT.set((timelineView2.audioSelected || timelineView2.roundSelected || timelineView2.collageSelected != i11) ? false : true);
                    if (track7 != timelineView2.collageMain) {
                        f37 = f6;
                        i6 = i11;
                        float f78 = min;
                        f39 = timelineView2.px + timelineView2.ph + ((((track7.offset - timelineView2.scroll) + (AndroidUtilities.lerp(track7.left, 0.0f, f77) * track7.duration)) / f78) * timelineView2.sw);
                        f38 = timelineView2.px + timelineView2.ph + ((((track7.offset - timelineView2.scroll) + (AndroidUtilities.lerp(track7.right, 1.0f, f77) * track7.duration)) / f78) * timelineView2.sw);
                    } else {
                        f37 = f6;
                        i6 = i11;
                        float f79 = timelineView2.px + timelineView2.ph;
                        float f80 = track7.offset - timelineView2.scroll;
                        float f81 = min;
                        float f82 = timelineView2.sw;
                        float f83 = ((f80 / f81) * f82) + f79;
                        f38 = (((r2 + track7.duration) / f81) * f82) + f79;
                        f39 = f83;
                    }
                    canvas2.save();
                    float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(f), AndroidUtilities.dp(38.0f), f77);
                    RectF rectF5 = track7.bounds;
                    float f84 = f38;
                    float f85 = timelineView2.ph;
                    rectF5.set(f39 - f85, f52 - lerp2, f84 + f85, f52);
                    RectF rectF6 = track7.bounds;
                    f10 += rectF6.top * f77;
                    f9 += rectF6.bottom * f77;
                    float f86 = track7.offset;
                    float f87 = track7.left;
                    float f88 = track7.duration;
                    float f89 = (((f87 * f88) + f86) * f77) + f37;
                    f7 += (f86 + (track7.right * f88)) * f77;
                    timelineView2.collageClipPath.rewind();
                    timelineView2.collageClipPath.addRoundRect(track7.bounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(timelineView2.collageClipPath);
                    VideoThumbsLoader videoThumbsLoader4 = track7.thumbs;
                    if (videoThumbsLoader4 != null) {
                        long j4 = track7.duration;
                        if (j4 <= 0) {
                            videoThumbsLoader2 = videoThumbsLoader4;
                            f40 = f89;
                            f42 = 0.0f;
                        } else {
                            videoThumbsLoader2 = videoThumbsLoader4;
                            f40 = f89;
                            f42 = timelineView2.px + timelineView2.ph + (((track7.offset - timelineView2.scroll) / min) * timelineView2.sw);
                        }
                        float f90 = f42;
                        float f91 = timelineView2.ph;
                        float f92 = f90 - f91;
                        if (j4 <= 0) {
                            f43 = f91;
                            f44 = 0.0f;
                        } else {
                            f43 = f91;
                            f44 = timelineView2.px + r3 + ((((track7.offset + j4) - timelineView2.scroll) / min) * timelineView2.sw);
                        }
                        float f93 = f44 + f43;
                        int frameWidth2 = videoThumbsLoader2.getFrameWidth();
                        float f94 = frameWidth2;
                        int max5 = (int) Math.max(0.0d, Math.floor((f92 - ((timelineView2.px + timelineView2.ph) + (((track7.offset - timelineView2.scroll) / min) * timelineView2.sw))) / f94));
                        int min3 = (int) Math.min(track7.thumbs.count, Math.ceil((f93 - f92) / f94) + 1.0d);
                        int i12 = (int) track7.bounds.top;
                        boolean z6 = track7.thumbs.frames.size() >= min3;
                        if (z6) {
                            for (int i13 = max5; i13 < Math.min(track7.thumbs.frames.size(), min3); i13++) {
                                if (((VideoThumbsLoader.BitmapFrame) track7.thumbs.frames.get(i13)).bitmap == null) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = z6;
                        if (!z3) {
                            if (timelineView2.blurManager.hasRenderNode()) {
                                timelineView2.backgroundBlur.drawRect(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint2 == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                canvas2.drawRect(track7.bounds, paint2);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (frameWidth2 != 0) {
                            float f95 = f92;
                            while (max5 < Math.min(track7.thumbs.frames.size(), min3)) {
                                VideoThumbsLoader.BitmapFrame bitmapFrame2 = (VideoThumbsLoader.BitmapFrame) track7.thumbs.frames.get(max5);
                                int i14 = min3;
                                if (bitmapFrame2.bitmap != null) {
                                    f45 = f52;
                                    timelineView2.collageFramePaint.setAlpha((int) (bitmapFrame2.getAlpha() * 255.0f));
                                    canvas2.drawBitmap(bitmapFrame2.bitmap, f95, i12 - ((int) ((r2.getHeight() - lerp2) / 2.0f)), timelineView2.collageFramePaint);
                                } else {
                                    f45 = f52;
                                }
                                f95 += f94;
                                max5++;
                                min3 = i14;
                                f52 = f45;
                            }
                        }
                        f41 = f52;
                        if (!z6) {
                            track7.thumbs.load();
                        }
                    } else {
                        f40 = f89;
                        f41 = f52;
                    }
                    timelineView2.selectedCollageClipPath.rewind();
                    if (!timelineView2.isCover) {
                        RectF rectF7 = AndroidUtilities.rectTmp;
                        float f96 = timelineView2.px + timelineView2.ph;
                        float f97 = track7.left;
                        float f98 = track7.duration;
                        float f99 = timelineView2.scroll;
                        float f100 = (f97 * f98) - f99;
                        float f101 = track7.offset;
                        float f102 = min;
                        float f103 = (f100 + f101) / f102;
                        float f104 = timelineView2.sw;
                        float f105 = (f96 + (f103 * f104)) - (f97 <= 0.0f ? r4 : 0);
                        RectF rectF8 = track7.bounds;
                        float f106 = rectF8.top;
                        float f107 = track7.right;
                        rectF7.set(f105, f106, f96 + (((((f98 * f107) - f99) + f101) / f102) * f104) + (f107 >= 1.0f ? r4 : 0), rectF8.bottom);
                        timelineView2.selectedCollageClipPath.addRoundRect(rectF7, timelineView2.selectedVideoRadii, Path.Direction.CW);
                        canvas2.clipPath(timelineView2.selectedCollageClipPath, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f52 = f41 - (lerp2 + (f5 * 1.0f));
                    i11 = i6 + 1;
                    f6 = f40;
                }
                f11 = 1.0f;
            }
            float f108 = timelineView2.roundT.set(timelineView2.hasRound);
            float f109 = timelineView2.roundSelectedT.set(timelineView2.hasRound && timelineView2.roundSelected);
            float roundHeight = timelineView2.getRoundHeight() * f108;
            float f110 = ((timelineView2.videoTrack == null && !timelineView2.hasAudio && timelineView2.collageTracks.isEmpty()) ? 1.0f : f109) * f108;
            if (f108 > 0.0f) {
                float f111 = f6;
                f12 = f108;
                long j5 = timelineView2.roundOffset;
                float f112 = j5;
                float f113 = timelineView2.roundLeft;
                float f114 = timelineView2.roundDuration;
                float f115 = f111 + ((f112 + (f113 * f114)) * f110);
                f7 += (f112 + (timelineView2.roundRight * f114)) * f110;
                if (timelineView2.videoTrack != null) {
                    float f116 = timelineView2.px + timelineView2.ph;
                    float lerp3 = (j5 - timelineView2.scroll) + (timelineView2.roundDuration * AndroidUtilities.lerp(f113, 0.0f, f109));
                    float f117 = min;
                    float f118 = f116 + ((lerp3 / f117) * timelineView2.sw);
                    f30 = timelineView2.px + timelineView2.ph + ((((timelineView2.roundOffset - timelineView2.scroll) + (AndroidUtilities.lerp(timelineView2.roundRight, 1.0f, f109) * timelineView2.roundDuration)) / f117) * timelineView2.sw);
                    f13 = f109;
                    f31 = f118;
                } else {
                    float f119 = timelineView2.px + timelineView2.ph;
                    f13 = f109;
                    float f120 = j5 - timelineView2.scroll;
                    float f121 = min;
                    float f122 = timelineView2.sw;
                    f30 = (((r2 + r6) / f121) * f122) + f119;
                    f31 = ((f120 / f121) * f122) + f119;
                }
                RectF rectF9 = timelineView2.roundBounds;
                float f123 = timelineView2.ph;
                rectF9.set(f31 - f123, f52 - roundHeight, f30 + f123, f52);
                float f124 = f52 - (roundHeight + (f5 * f12));
                RectF rectF10 = timelineView2.roundBounds;
                f10 += rectF10.top * f110;
                f9 += rectF10.bottom * f110;
                timelineView2.roundClipPath.rewind();
                timelineView2.roundClipPath.addRoundRect(timelineView2.roundBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(timelineView2.roundClipPath);
                VideoThumbsLoader videoThumbsLoader5 = timelineView2.roundThumbs;
                if (videoThumbsLoader5 != null) {
                    int i15 = (timelineView2.roundDuration > 0L ? 1 : (timelineView2.roundDuration == 0L ? 0 : -1));
                    if (i15 <= 0) {
                        videoThumbsLoader = videoThumbsLoader5;
                        i4 = i15;
                        f33 = 0.0f;
                    } else {
                        videoThumbsLoader = videoThumbsLoader5;
                        i4 = i15;
                        f33 = (((timelineView2.roundOffset - timelineView2.scroll) / min) * timelineView2.sw) + timelineView2.px + timelineView2.ph;
                    }
                    float f125 = timelineView2.ph;
                    float f126 = f33 - f125;
                    float f127 = (i4 <= 0 ? 0.0f : timelineView2.px + r3 + ((((timelineView2.roundOffset + r5) - timelineView2.scroll) / min) * timelineView2.sw)) + f125;
                    int frameWidth3 = videoThumbsLoader.getFrameWidth();
                    if (timelineView2.videoTrack != null) {
                        f34 = f126;
                        f35 = f127;
                        f36 = timelineView2.px + timelineView2.ph + (((timelineView2.roundOffset - timelineView2.scroll) / min) * timelineView2.sw);
                    } else {
                        f34 = f126;
                        f35 = f127;
                        f36 = timelineView2.px;
                    }
                    float f128 = frameWidth3;
                    int max6 = (int) Math.max(0.0d, Math.floor((f34 - f36) / f128));
                    float f129 = (f35 - f34) / f128;
                    f32 = f124;
                    int min4 = (int) Math.min(timelineView2.roundThumbs.count, Math.ceil(f129) + 1.0d);
                    int i16 = (int) timelineView2.roundBounds.top;
                    boolean z7 = timelineView2.roundThumbs.frames.size() >= min4;
                    if (z7) {
                        for (int i17 = max6; i17 < Math.min(timelineView2.roundThumbs.frames.size(), min4); i17++) {
                            if (((VideoThumbsLoader.BitmapFrame) timelineView2.roundThumbs.frames.get(i17)).bitmap == null) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = z7;
                    if (!z2) {
                        if (timelineView2.blurManager.hasRenderNode()) {
                            timelineView2.backgroundBlur.drawRect(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint2 == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(timelineView2.roundBounds, paint2);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (frameWidth3 != 0) {
                        while (max6 < Math.min(timelineView2.roundThumbs.frames.size(), min4)) {
                            VideoThumbsLoader.BitmapFrame bitmapFrame3 = (VideoThumbsLoader.BitmapFrame) timelineView2.roundThumbs.frames.get(max6);
                            if (bitmapFrame3.bitmap != null) {
                                i5 = min4;
                                timelineView2.videoFramePaint.setAlpha((int) (bitmapFrame3.getAlpha() * 255.0f));
                                canvas2.drawBitmap(bitmapFrame3.bitmap, f34, i16 - ((int) ((r2.getHeight() - roundHeight) / 2.0f)), timelineView2.videoFramePaint);
                            } else {
                                i5 = min4;
                            }
                            f34 += f128;
                            max6++;
                            min4 = i5;
                        }
                    }
                    if (!z7) {
                        timelineView2.roundThumbs.load();
                    }
                } else {
                    f32 = f124;
                }
                timelineView2.selectedVideoClipPath.rewind();
                RectF rectF11 = AndroidUtilities.rectTmp;
                int i18 = timelineView2.px;
                int i19 = timelineView2.ph;
                float f130 = i18 + i19;
                float f131 = timelineView2.roundLeft;
                float f132 = timelineView2.roundDuration;
                float f133 = timelineView2.scroll;
                float f134 = (f131 * f132) - f133;
                float f135 = timelineView2.roundOffset;
                float f136 = min;
                float f137 = timelineView2.sw;
                float f138 = i19 * (1.0f - f13);
                float f139 = ((f130 + (((f134 + f135) / f136) * f137)) - (f131 <= 0.0f ? i19 : 0)) - f138;
                RectF rectF12 = timelineView2.roundBounds;
                float f140 = rectF12.top;
                float f141 = timelineView2.roundRight;
                rectF11.set(f139, f140, f130 + (((((f132 * f141) - f133) + f135) / f136) * f137) + (f141 >= 1.0f ? i19 : 0) + f138, rectF12.bottom);
                timelineView2.selectedVideoClipPath.addRoundRect(rectF11, timelineView2.selectedVideoRadii, Path.Direction.CW);
                canvas2.clipPath(timelineView2.selectedVideoClipPath, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f52 = f32;
                f6 = f115;
            } else {
                f12 = f108;
                f13 = f109;
            }
            float f142 = timelineView2.audioT.set(timelineView2.hasAudio);
            float f143 = timelineView2.audioSelectedT.set(timelineView2.hasAudio && timelineView2.audioSelected);
            float audioHeight = timelineView2.getAudioHeight() * f142;
            float f144 = ((timelineView2.videoTrack == null && !timelineView2.hasRound && timelineView2.collageTracks.isEmpty()) ? 1.0f : f143) * f142;
            if (f142 > 0.0f) {
                float f145 = timelineView2.audioOffset;
                float f146 = timelineView2.audioLeft;
                float f147 = timelineView2.audioDuration;
                float f148 = f6 + ((f145 + (f146 * f147)) * f144);
                float f149 = f7 + ((f145 + (timelineView2.audioRight * f147)) * f144);
                Paint paint4 = timelineView2.audioBlur.getPaint(f142);
                canvas2.save();
                if (timelineView2.videoTrack != null || timelineView2.hasRound || !timelineView2.collageTracks.isEmpty()) {
                    float f150 = min;
                    float lerp4 = ((((timelineView2.audioOffset - timelineView2.scroll) + (AndroidUtilities.lerp(timelineView2.audioLeft, 0.0f, f143) * timelineView2.audioDuration)) / f150) * timelineView2.sw) + timelineView2.px + timelineView2.ph;
                    lerp = ((((timelineView2.audioOffset - timelineView2.scroll) + (AndroidUtilities.lerp(timelineView2.audioRight, 1.0f, f143) * timelineView2.audioDuration)) / f150) * timelineView2.sw) + timelineView2.px + timelineView2.ph;
                    f27 = lerp4;
                } else {
                    float f151 = timelineView2.px + timelineView2.ph;
                    float f152 = min;
                    float f153 = (timelineView2.audioOffset - timelineView2.scroll) / f152;
                    float f154 = timelineView2.sw;
                    float f155 = f151 + (f153 * f154);
                    lerp = (((r5 + timelineView2.audioDuration) / f152) * f154) + f151;
                    f27 = f155;
                }
                float f156 = lerp;
                RectF rectF13 = timelineView2.audioBounds;
                float f157 = timelineView2.ph;
                float f158 = f27;
                rectF13.set(f27 - f157, f52 - audioHeight, f157 + f156, f52);
                RectF rectF14 = timelineView2.audioBounds;
                f10 += rectF14.top * f144;
                f9 += rectF14.bottom * f144;
                timelineView2.audioClipPath.rewind();
                timelineView2.audioClipPath.addRoundRect(timelineView2.audioBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(timelineView2.audioClipPath);
                BlurringShader.BlurManager blurManager3 = timelineView2.blurManager;
                if (blurManager3 != null && blurManager3.hasRenderNode()) {
                    timelineView2.backgroundBlur.drawRect(canvas2);
                    canvas2.drawColor(Theme.multAlpha(855638016, f142));
                } else if (paint4 == null) {
                    canvas2.drawColor(Theme.multAlpha(TLObject.FLAG_30, f142));
                } else {
                    canvas2.drawRect(timelineView2.audioBounds, paint4);
                    canvas2.drawColor(Theme.multAlpha(855638016, f142));
                }
                if (timelineView2.waveform != null && (blurManager = timelineView2.blurManager) != null && blurManager.hasRenderNode()) {
                    float f159 = timelineView2.waveformMax.set(timelineView2.waveform.getMaxBar(), !timelineView2.waveformIsLoaded);
                    timelineView2.waveformIsLoaded = timelineView2.waveform.getLoadedCount() > 0;
                    timelineView2.waveformPath.check(timelineView2.px + timelineView2.ph + (((timelineView2.audioOffset - timelineView2.scroll) / min) * timelineView2.sw), f158, f156, f143, min, audioHeight, f159, timelineView2.audioBounds.bottom, timelineView2.waveform);
                    j2 = min;
                    canvas2.saveLayerAlpha(timelineView2.audioBounds, 102, 31);
                    canvas2.clipPath(timelineView2.waveformPath);
                    timelineView2.audioWaveformBlur.drawRect(canvas2);
                    canvas2.restore();
                } else {
                    j2 = min;
                    if (timelineView2.waveform != null && paint4 != null) {
                        Paint paint5 = timelineView2.audioWaveformBlur.getPaint(f142 * 0.4f);
                        if (paint5 == null) {
                            paint5 = timelineView2.waveformPaint;
                            paint5.setAlpha((int) (64.0f * f142));
                        }
                        float f160 = timelineView2.waveformMax.set(timelineView2.waveform.getMaxBar(), !timelineView2.waveformIsLoaded);
                        timelineView2.waveformIsLoaded = timelineView2.waveform.getLoadedCount() > 0;
                        f28 = f142;
                        timelineView2.waveformPath.check(timelineView2.px + timelineView2.ph + (((timelineView2.audioOffset - timelineView2.scroll) / j2) * timelineView2.sw), f158, f156, f143, j2, audioHeight, f160, timelineView2.audioBounds.bottom, timelineView2.waveform);
                        min = j2;
                        canvas2.drawPath(timelineView2.waveformPath, paint5);
                        if (f143 >= 1.0f) {
                            int i20 = timelineView2.px;
                            float f161 = timelineView2.ph + i20;
                            float f162 = timelineView2.audioOffset - timelineView2.scroll;
                            float f163 = timelineView2.audioLeft;
                            float f164 = timelineView2.audioDuration;
                            float f165 = min;
                            float f166 = timelineView2.sw;
                            float f167 = ((((f163 * f164) + f162) / f165) * f166) + f161;
                            float f168 = f161 + (((f162 + (timelineView2.audioRight * f164)) / f165) * f166);
                            float max7 = (Math.max(i20, f167) + Math.min(timelineView2.w - timelineView2.px, f168)) / 2.0f;
                            float centerY2 = timelineView2.audioBounds.centerY();
                            float max8 = Math.max(0.0f, (Math.min(timelineView2.w - timelineView2.px, f168) - Math.max(timelineView2.px, f167)) - AndroidUtilities.dp(24.0f));
                            float dpf2 = AndroidUtilities.dpf2(13.0f) + ((timelineView2.audioAuthor == null && timelineView2.audioTitle == null) ? 0.0f : AndroidUtilities.dpf2(3.11f) + timelineView2.audioAuthorWidth + AndroidUtilities.dpf2(9.66f) + timelineView2.audioTitleWidth);
                            boolean z8 = dpf2 < max8;
                            float min5 = max7 - (Math.min(dpf2, max8) / 2.0f);
                            timelineView2.audioIcon.setBounds((int) min5, (int) (centerY2 - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + min5), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + centerY2));
                            float f169 = 1.0f - f143;
                            float f170 = f169 * 255.0f;
                            timelineView2.audioIcon.setAlpha((int) f170);
                            timelineView2.audioIcon.draw(canvas2);
                            float dpf22 = min5 + AndroidUtilities.dpf2(16.11f);
                            boolean z9 = z8;
                            f14 = f28;
                            paint = paint2;
                            f18 = f53;
                            d = 0.0d;
                            f16 = f143;
                            f17 = f54;
                            f15 = f11;
                            f19 = f12;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, timelineView2.w, timelineView2.h, NotificationCenter.didReceiveSmsCode, 31);
                            float min6 = Math.min(f168, timelineView2.w) - AndroidUtilities.dp(12.0f);
                            canvas2.clipRect(dpf22, 0.0f, min6, timelineView2.h);
                            if (timelineView2.audioAuthor != null) {
                                canvas2.save();
                                canvas2.translate(dpf22 - timelineView2.audioAuthorLeft, centerY2 - (timelineView2.audioAuthor.getHeight() / 2.0f));
                                timelineView2.audioAuthorPaint.setAlpha((int) (f170 * f14));
                                timelineView2.audioAuthor.draw(canvas2);
                                canvas2.restore();
                                f29 = timelineView2.audioAuthorWidth + dpf22;
                            } else {
                                f29 = dpf22;
                            }
                            if (timelineView2.audioAuthor != null && timelineView2.audioTitle != null) {
                                float dpf23 = f29 + AndroidUtilities.dpf2(3.66f);
                                int alpha = timelineView2.audioDotPaint.getAlpha();
                                timelineView2.audioDotPaint.setAlpha((int) (alpha * f169));
                                canvas2.drawCircle(AndroidUtilities.dp(1.0f) + dpf23, centerY2, AndroidUtilities.dp(1.0f), timelineView2.audioDotPaint);
                                timelineView2.audioDotPaint.setAlpha(alpha);
                                f29 = dpf23 + AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(4.0f);
                            }
                            if (timelineView2.audioTitle != null) {
                                canvas2.save();
                                canvas2.translate(f29 - timelineView2.audioTitleLeft, centerY2 - (timelineView2.audioTitle.getHeight() / 2.0f));
                                timelineView2.audioTitlePaint.setAlpha((int) (f170 * f14));
                                timelineView2.audioTitle.draw(canvas2);
                                canvas2.restore();
                            }
                            if (!z9) {
                                timelineView2.ellipsizeMatrix.reset();
                                timelineView2.ellipsizeMatrix.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                                timelineView2.ellipsizeMatrix.postTranslate(min6 - AndroidUtilities.dp(8.0f), 0.0f);
                                timelineView2.ellipsizeGradient.setLocalMatrix(timelineView2.ellipsizeMatrix);
                                RectF rectF15 = timelineView2.audioBounds;
                                canvas2.drawRect(min6 - AndroidUtilities.dp(8.0f), rectF15.top, min6, rectF15.bottom, timelineView2.ellipsizePaint);
                            }
                            canvas.restore();
                        } else {
                            f14 = f28;
                            f15 = f11;
                            paint = paint2;
                            f16 = f143;
                            f17 = f54;
                            f18 = f53;
                            f19 = f12;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f6 = f148;
                        f7 = f149;
                    }
                }
                f28 = f142;
                min = j2;
                if (f143 >= 1.0f) {
                }
                canvas.restore();
                f6 = f148;
                f7 = f149;
            } else {
                f14 = f142;
                f15 = f11;
                paint = paint2;
                f16 = f143;
                f17 = f54;
                f18 = f53;
                f19 = f12;
                d = 0.0d;
            }
            float f171 = f9;
            float f172 = f10;
            float f173 = timelineView2.px + timelineView2.ph;
            float f174 = timelineView2.scroll;
            float f175 = min;
            float f176 = timelineView2.sw;
            float f177 = (((f6 - f174) / f175) * f176) + f173;
            float f178 = f173 + (((f7 - f174) / f175) * f176);
            if (!timelineView2.collageTracks.isEmpty()) {
                f20 = f177;
                max3 = f15;
            } else if (timelineView2.hasAudio && timelineView2.videoTrack == null) {
                f20 = f177;
                max3 = f14;
            } else {
                max3 = Math.max(f17, f19);
                f20 = f177;
            }
            if (f14 > d || f19 > d || f17 > d || f15 > d) {
                if (timelineView2.videoTrack == null && !timelineView2.hasRound && timelineView2.collageTracks.isEmpty()) {
                    f21 = f16;
                    f22 = AndroidUtilities.lerp(0.6f, 1.0f, f21) * f14;
                } else {
                    f21 = f16;
                    f22 = 1.0f;
                }
                Paint paint6 = paint;
                timelineView2.drawRegion(canvas, paint6, f172, f171, f20, f178, f22 * max3);
                Track track8 = timelineView2.videoTrack;
                if (track8 != null && ((timelineView2.hasAudio || timelineView2.hasRound) && (f21 > 0.0f || f13 > 0.0f))) {
                    float f179 = timelineView2.h - timelineView2.py;
                    float f180 = timelineView2.ph + timelineView2.px;
                    float f181 = track8.left;
                    float f182 = track8.duration;
                    float f183 = timelineView2.scroll;
                    float f184 = timelineView2.sw;
                    float f185 = ((((f181 * f182) - f183) / f175) * f184) + f180;
                    float f186 = f180 + ((((track8.right * f182) - f183) / f175) * f184);
                    canvas3 = canvas;
                    timelineView2.drawRegion(canvas3, paint6, f179 - f8, f179, f185, f186, 0.8f);
                } else if (timelineView2.collageMain != null) {
                    i3 = 1;
                    if (timelineView2.collageTracks.size() > 1) {
                        Track track9 = timelineView2.collageMain;
                        RectF rectF16 = track9.bounds;
                        float f187 = rectF16.top;
                        float f188 = rectF16.bottom;
                        float f189 = timelineView2.ph + timelineView2.px;
                        float f190 = track9.offset;
                        float f191 = track9.left;
                        float f192 = track9.duration;
                        float f193 = timelineView2.scroll;
                        float f194 = timelineView2.sw;
                        float f195 = (((((f191 * f192) + f190) - f193) / f175) * f194) + f189;
                        float f196 = ((((f190 + (track9.right * f192)) - f193) / f175) * f194) + f189;
                        canvas3 = canvas;
                        timelineView2.drawRegion(canvas3, paint6, f187, f188, f195, f196, 0.8f);
                    } else {
                        canvas3 = canvas;
                    }
                    timelineView = timelineView2;
                    if (timelineView.maxCount > i3 && (track3 = timelineView.videoTrack) != null) {
                        float f197 = track3.duration;
                        float f198 = track3.right;
                        float f199 = track3.left;
                        j = (long) ((f198 - f199) * f197);
                        if (j > 68999) {
                            float f200 = timelineView.px + timelineView.ph;
                            float f201 = timelineView.scroll;
                            float f202 = timelineView.sw;
                            float f203 = ((((f199 * f197) - f201) / f175) * f202) + f200;
                            float f204 = f200 + ((((f198 * f197) - f201) / f175) * f202);
                            canvas3.save();
                            float f205 = timelineView.h - timelineView.py;
                            canvas3.clipRect(f203, f205 - f8, f204, f205);
                            timelineView.regionPaint.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f18) * 255.0f));
                            long j6 = 59000;
                            int min7 = (int) Math.min(timelineView.maxCount - 1, j / 59000);
                            int i21 = 1;
                            while (i21 <= min7) {
                                if (Math.min(j6, j - (i21 * j6)) < 1000) {
                                    break;
                                }
                                float f206 = timelineView.px + timelineView.ph;
                                Track track10 = timelineView.videoTrack;
                                float f207 = f206 + ((((((long) (track10.duration * track10.left)) + r2) - timelineView.scroll) / f175) * timelineView.sw);
                                int i22 = i21;
                                canvas.drawRect(f207, (timelineView.h - timelineView.py) - f8, AndroidUtilities.dp(1.0f) + f207, timelineView.h - timelineView.py, timelineView.regionPaint);
                                canvas3 = canvas;
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                int i23 = i22 + 1;
                                sb.append(i23);
                                canvas3.drawText(sb.toString(), f207 + AndroidUtilities.dp(2.0f), ((timelineView.h - timelineView.py) - f8) + AndroidUtilities.dp(14.0f), timelineView.countTextPaint);
                                i21 = i23;
                                j6 = 59000;
                            }
                            canvas3.restore();
                            f23 = timelineView.loopProgress.set(0.0f);
                            float contentHeight = ((timelineView.h - timelineView.getContentHeight()) + timelineView.py) - AndroidUtilities.dpf2(2.3f);
                            float dpf24 = AndroidUtilities.dpf2(4.3f) + (timelineView.h - timelineView.py);
                            if (f23 > 0.0f) {
                                long j7 = timelineView.loopProgressFrom;
                                if (j7 == -1) {
                                    Track track11 = timelineView.videoTrack;
                                    if (track11 != null) {
                                        f26 = track11.duration * track11.right;
                                    } else {
                                        Track track12 = timelineView.collageMain;
                                        if (track12 != null) {
                                            f26 = track12.duration * (track12.right - track12.left);
                                        } else {
                                            if (timelineView.hasRound) {
                                                f24 = timelineView.roundDuration;
                                                f25 = timelineView.roundRight;
                                            } else {
                                                f24 = timelineView.audioDuration;
                                                f25 = timelineView.audioRight;
                                            }
                                            j7 = (long) (f24 * f25);
                                        }
                                    }
                                    j7 = (long) f26;
                                }
                                timelineView2 = this;
                                timelineView2.drawProgress(canvas3, contentHeight, dpf24, j7, f23 * max3);
                            } else {
                                timelineView2 = timelineView;
                            }
                            timelineView2.drawProgress(canvas, contentHeight, dpf24, timelineView2.progress, (1.0f - f23) * max3);
                        }
                    }
                    f23 = timelineView.loopProgress.set(0.0f);
                    float contentHeight2 = ((timelineView.h - timelineView.getContentHeight()) + timelineView.py) - AndroidUtilities.dpf2(2.3f);
                    float dpf242 = AndroidUtilities.dpf2(4.3f) + (timelineView.h - timelineView.py);
                    if (f23 > 0.0f) {
                    }
                    timelineView2.drawProgress(canvas, contentHeight2, dpf242, timelineView2.progress, (1.0f - f23) * max3);
                } else {
                    canvas3 = canvas;
                }
                timelineView = timelineView2;
                i3 = 1;
                if (timelineView.maxCount > i3) {
                    float f1972 = track3.duration;
                    float f1982 = track3.right;
                    float f1992 = track3.left;
                    j = (long) ((f1982 - f1992) * f1972);
                    if (j > 68999) {
                    }
                }
                f23 = timelineView.loopProgress.set(0.0f);
                float contentHeight22 = ((timelineView.h - timelineView.getContentHeight()) + timelineView.py) - AndroidUtilities.dpf2(2.3f);
                float dpf2422 = AndroidUtilities.dpf2(4.3f) + (timelineView.h - timelineView.py);
                if (f23 > 0.0f) {
                }
                timelineView2.drawProgress(canvas, contentHeight22, dpf2422, timelineView2.progress, (1.0f - f23) * max3);
            }
            if (z) {
                canvas.restore();
            }
        }
        if (timelineView2.dragged) {
            float f208 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float f209 = timelineView2.dragSpeed;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / timelineView2.sw) * min * f208 * f209);
            if (timelineView2.isCover) {
                timelineView2.dragSpeed = f209 + (f208 * 0.25f);
            }
            int i24 = timelineView2.pressHandle;
            if (i24 == 4 && (track2 = timelineView2.videoTrack) != null) {
                float f210 = track2.left;
                long j8 = timelineView2.scroll;
                long j9 = track2.duration;
                float f211 = j9;
                if (f210 < j8 / f211) {
                    i2 = -1;
                } else if (track2.right > (j8 + min) / f211) {
                    i2 = 1;
                } else {
                    timelineView2.dragSpeed = 1.0f;
                    i2 = 0;
                }
                long j10 = i2 * dp2;
                timelineView2.scroll = Utilities.clamp(j8 + j10, j9 - min, 0L);
                timelineView2.progress += j10;
                Track track13 = timelineView2.videoTrack;
                float f212 = (r3 - j8) / track13.duration;
                if (f212 > 0.0f) {
                    f3 = 1.0f;
                    max2 = Math.min(1.0f - track13.right, f212);
                } else {
                    f3 = 1.0f;
                    max2 = Math.max(0.0f - track13.left, f212);
                }
                Track track14 = timelineView2.videoTrack;
                track14.left = Utilities.clamp(track14.left + max2, f3, 0.0f);
                Track track15 = timelineView2.videoTrack;
                track15.right = Utilities.clamp(track15.right + max2, f3, 0.0f);
                TimelineDelegate timelineDelegate = timelineView2.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onVideoLeftChange(false, timelineView2.videoTrack.left);
                    timelineView2.delegate.onVideoRightChange(false, timelineView2.videoTrack.right);
                }
                timelineView2.invalidate();
            } else if (i24 == 8) {
                float f213 = timelineView2.audioLeft;
                long j11 = timelineView2.audioOffset;
                float f214 = 100 + (-j11);
                long j12 = timelineView2.audioDuration;
                float f215 = j12;
                if (f213 < f214 / f215) {
                    i = -1;
                } else if (timelineView2.audioRight >= ((r8 + min) - 100) / f215) {
                    i = 1;
                } else {
                    timelineView2.dragSpeed = 1.0f;
                    i = 0;
                }
                if (i != 0) {
                    if (timelineView2.audioSelected && (track = timelineView2.videoTrack) != null) {
                        long j13 = j11 - (i * dp2);
                        float f216 = track.right;
                        float f217 = track.duration;
                        timelineView2.audioOffset = Utilities.clamp(j13, (long) ((f216 * f217) - (f213 * f215)), (long) ((track.left * f217) - (timelineView2.audioRight * f215)));
                    } else if (timelineView2.roundSelected && timelineView2.hasRound) {
                        long j14 = j11 - (i * dp2);
                        float f218 = timelineView2.roundRight;
                        float f219 = timelineView2.roundDuration;
                        timelineView2.audioOffset = Utilities.clamp(j14, (long) ((f218 * f219) - (f213 * f215)), (long) ((timelineView2.roundLeft * f219) - (timelineView2.audioRight * f215)));
                    } else {
                        timelineView2.audioOffset = Utilities.clamp(j11 - (i * dp2), 0L, -(j12 - Math.min(timelineView2.getBaseDuration(), timelineView2.getMaxScrollDuration())));
                    }
                    float f220 = (-(timelineView2.audioOffset - j11)) / timelineView2.audioDuration;
                    if (f220 > 0.0f) {
                        max = Math.min(1.0f - timelineView2.audioRight, f220);
                    } else {
                        max = Math.max(0.0f - timelineView2.audioLeft, f220);
                    }
                    if (timelineView2.videoTrack == null) {
                        float f221 = timelineView2.progress;
                        float f222 = timelineView2.audioDuration;
                        timelineView2.progress = (long) Utilities.clamp(f221 + (max * f222), f222, 0.0f);
                    }
                    timelineView2.audioLeft = Utilities.clamp(timelineView2.audioLeft + max, 1.0f, 0.0f);
                    timelineView2.audioRight = Utilities.clamp(timelineView2.audioRight + max, 1.0f, 0.0f);
                    TimelineDelegate timelineDelegate2 = timelineView2.delegate;
                    if (timelineDelegate2 != null) {
                        timelineDelegate2.onAudioLeftChange(timelineView2.audioLeft);
                        timelineView2.delegate.onAudioRightChange(timelineView2.audioRight);
                        timelineView2.delegate.onProgressChange(timelineView2.progress, false);
                    }
                    timelineView2.invalidate();
                } else {
                    timelineView2.dragSpeed = 1.0f;
                }
            } else {
                timelineView2.dragSpeed = 1.0f;
            }
        } else {
            timelineView2.dragSpeed = 1.0f;
        }
        int contentHeight3 = timelineView2.getContentHeight();
        if (timelineView2.lastHeight != contentHeight3) {
            timelineView2.lastHeight = contentHeight3;
            Runnable runnable = timelineView2.onHeightChange;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void drawRegion(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        if (f5 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f3 - AndroidUtilities.dp(10.0f), f, f4 + AndroidUtilities.dp(10.0f), f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, NotificationCenter.didReceiveSmsCode, 31);
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
        this.regionHandlePaint.setAlpha(NotificationCenter.didReceiveSmsCode);
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
            ArrayList arrayList = this.collageTracks;
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                Track track2 = (Track) obj;
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

        public VideoThumbsLoader(boolean z, final String str, final int i, final int i2, final Long l, final long j, final long j2, final long j3, final Runnable runnable) {
            this.isRound = z;
            Utilities.themeQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    TimelineView.VideoThumbsLoader.$r8$lambda$fteXkXvoy6bA9L1ywK_hhKALubA(TimelineView.VideoThumbsLoader.this, str, l, j2, j3, i2, j, i, runnable);
                }
            });
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            if (r0 != 270) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void $r8$lambda$fteXkXvoy6bA9L1ywK_hhKALubA(VideoThumbsLoader videoThumbsLoader, String str, Long l, long j, long j2, int i, long j3, int i2, Runnable runnable) {
            Exception exc;
            int i3;
            int i4;
            String extractMetadata;
            long maxScrollDuration = TimelineView.this.getMaxScrollDuration();
            try {
                videoThumbsLoader.metadataRetriever.setDataSource(str);
                String extractMetadata2 = videoThumbsLoader.metadataRetriever.extractMetadata(9);
                if (extractMetadata2 != null) {
                    maxScrollDuration = Long.parseLong(extractMetadata2);
                    videoThumbsLoader.duration = maxScrollDuration;
                }
                String extractMetadata3 = videoThumbsLoader.metadataRetriever.extractMetadata(18);
                i4 = extractMetadata3 != null ? Integer.parseInt(extractMetadata3) : 0;
                try {
                    String extractMetadata4 = videoThumbsLoader.metadataRetriever.extractMetadata(19);
                    r6 = extractMetadata4 != null ? Integer.parseInt(extractMetadata4) : 0;
                    extractMetadata = videoThumbsLoader.metadataRetriever.extractMetadata(24);
                } catch (Exception e) {
                    i3 = i4;
                    exc = e;
                    videoThumbsLoader.metadataRetriever = null;
                    FileLog.e(exc);
                    i4 = r6;
                    r6 = i3;
                    if (l != null) {
                    }
                    if (j != -1) {
                    }
                    float clamp = Utilities.clamp((r6 != 0 || i4 == 0) ? 1.0f : r6 / i4, 1.3333334f, 0.5625f);
                    videoThumbsLoader.frameHeight = Math.max(1, i);
                    videoThumbsLoader.frameWidth = Math.max(1, (int) Math.ceil(i * clamp));
                    int ceil = (int) Math.ceil(((Math.max(maxScrollDuration, j3) / j3) * i2) / videoThumbsLoader.frameWidth);
                    videoThumbsLoader.count = ceil;
                    videoThumbsLoader.frameIterator = (long) (maxScrollDuration / ceil);
                    videoThumbsLoader.nextFrame = -videoThumbsLoader.frameIterator;
                    if (j != -1) {
                    }
                    videoThumbsLoader.load();
                    if (runnable != null) {
                    }
                }
            } catch (Exception e2) {
                exc = e2;
                i3 = 0;
            }
            if (extractMetadata != null) {
                int parseInt = Integer.parseInt(extractMetadata);
                if (parseInt != 90) {
                }
                if (l != null) {
                    maxScrollDuration = l.longValue();
                    videoThumbsLoader.duration = maxScrollDuration;
                }
                if (j != -1 && j2 != -1) {
                    maxScrollDuration = j2 - j;
                }
                float clamp2 = Utilities.clamp((r6 != 0 || i4 == 0) ? 1.0f : r6 / i4, 1.3333334f, 0.5625f);
                videoThumbsLoader.frameHeight = Math.max(1, i);
                videoThumbsLoader.frameWidth = Math.max(1, (int) Math.ceil(i * clamp2));
                int ceil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j3) / j3) * i2) / videoThumbsLoader.frameWidth);
                videoThumbsLoader.count = ceil2;
                videoThumbsLoader.frameIterator = (long) (maxScrollDuration / ceil2);
                videoThumbsLoader.nextFrame = -videoThumbsLoader.frameIterator;
                if (j != -1) {
                    videoThumbsLoader.nextFrame = j - videoThumbsLoader.frameIterator;
                }
                videoThumbsLoader.load();
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            }
            int i5 = r6;
            r6 = i4;
            i4 = i5;
            if (l != null) {
            }
            if (j != -1) {
                maxScrollDuration = j2 - j;
            }
            float clamp22 = Utilities.clamp((r6 != 0 || i4 == 0) ? 1.0f : r6 / i4, 1.3333334f, 0.5625f);
            videoThumbsLoader.frameHeight = Math.max(1, i);
            videoThumbsLoader.frameWidth = Math.max(1, (int) Math.ceil(i * clamp22));
            int ceil22 = (int) Math.ceil(((Math.max(maxScrollDuration, j3) / j3) * i2) / videoThumbsLoader.frameWidth);
            videoThumbsLoader.count = ceil22;
            videoThumbsLoader.frameIterator = (long) (maxScrollDuration / ceil22);
            videoThumbsLoader.nextFrame = -videoThumbsLoader.frameIterator;
            if (j != -1) {
            }
            videoThumbsLoader.load();
            if (runnable != null) {
            }
        }

        public int getFrameWidth() {
            return this.frameWidth;
        }

        public long getDuration() {
            return this.duration;
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
                    TimelineView.VideoThumbsLoader.this.receiveFrame(bitmap);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void receiveFrame(Bitmap bitmap) {
            if (!this.loading || this.destroyed) {
                return;
            }
            this.frames.add(new BitmapFrame(bitmap));
            this.loading = false;
            TimelineView.this.invalidate();
        }

        public void destroy() {
            this.destroyed = true;
            Utilities.themeQueue.cancelRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
            ArrayList arrayList = this.frames;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Bitmap bitmap = ((BitmapFrame) obj).bitmap;
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
    }

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
                        TimelineView.AudioWaveformLoader.this.receiveData((short[]) obj, ((Integer) obj2).intValue());
                    }
                });
            } else {
                Utilities.phoneBookQueue.postRunnable(new TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void run() {
            MediaCodec.BufferInfo bufferInfo;
            short s;
            try {
                int round = Math.round(((this.duration * this.inputFormat.getInteger("sample-rate")) / this.count) / 5.0f);
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.inputFormat.getString("mime"));
                if (createDecoderByType == null) {
                    return;
                }
                createDecoderByType.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 0);
                createDecoderByType.start();
                createDecoderByType.getInputBuffers();
                createDecoderByType.getOutputBuffers();
                final short[] sArr = new short[32];
                int i = -1;
                int i2 = 0;
                boolean z = false;
                int i3 = 0;
                int i4 = 0;
                short s2 = 0;
                while (true) {
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                    if (dequeueInputBuffer >= 0) {
                        int readSampleData = this.extractor.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                        if (readSampleData < 0) {
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            bufferInfo = bufferInfo2;
                            z = true;
                        } else {
                            bufferInfo = bufferInfo2;
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), 0);
                            this.extractor.advance();
                        }
                    } else {
                        bufferInfo = bufferInfo2;
                    }
                    if (i >= 0) {
                        createDecoderByType.getOutputBuffer(i).position(0);
                    }
                    i = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                    while (true) {
                        if (i == -1 || z) {
                            break;
                        }
                        if (i >= 0) {
                            ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i);
                            if (outputBuffer != null && bufferInfo.size > 0) {
                                int i5 = i4;
                                while (outputBuffer.remaining() > 0) {
                                    short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                    if (i5 >= round) {
                                        sArr[i2 - i3] = s2;
                                        i2++;
                                        final int i6 = i2 - i3;
                                        if (i6 >= sArr.length || i2 >= this.count) {
                                            short[] sArr2 = new short[sArr.length];
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda2
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    TimelineView.AudioWaveformLoader.this.receiveData(sArr, i6);
                                                }
                                            });
                                            sArr = sArr2;
                                            i3 = i2;
                                        }
                                        if (i2 >= this.data.length) {
                                            i4 = 0;
                                            s2 = 0;
                                            break;
                                        } else {
                                            s = 0;
                                            i5 = 0;
                                        }
                                    } else {
                                        s = s2;
                                    }
                                    s2 = s < s3 ? s3 : s;
                                    i5++;
                                    if (outputBuffer.remaining() < 8) {
                                        break;
                                    } else {
                                        outputBuffer.position(outputBuffer.position() + 8);
                                    }
                                }
                                i4 = i5;
                            }
                            createDecoderByType.releaseOutputBuffer(i, false);
                            if ((bufferInfo.flags & 4) != 0) {
                                z = true;
                                break;
                            }
                        } else if (i == -3) {
                            createDecoderByType.getOutputBuffers();
                        }
                        i = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                    }
                    synchronized (this.lock) {
                        try {
                            if (!this.stop) {
                                if (z || i2 >= this.count) {
                                    break;
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

        /* JADX INFO: Access modifiers changed from: private */
        public void receiveData(short[] sArr, int i) {
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

        public short getMaxBar() {
            return this.max;
        }

        public short getBar(int i) {
            return this.data[i];
        }

        public int getLoadedCount() {
            return this.loaded;
        }

        public int getCount() {
            return this.count;
        }
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(this.py + AndroidUtilities.dp(28.0f) + this.py, getContentHeight(), this.openT.get());
    }

    public int getContentHeight() {
        return (int) (this.py + (this.videoTrack != null ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.collageTracks.isEmpty() ? 0.0f : getCollageHeight() + AndroidUtilities.dp(4.0f)) + (this.hasRound ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.hasAudio ? AndroidUtilities.dp(4.0f) + getAudioHeight() : 0.0f) + this.py);
    }
}
