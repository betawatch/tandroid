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
                            TimelineView.Track.this.lambda$setupThumbs$0();
                        }
                    });
                }
            }
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
                TimelineView.this.lambda$new$6(viewGroup, resourcesProvider, blurManager, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$6(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, View view) {
        int i;
        int i2 = this.pressType;
        try {
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
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        TimelineView.this.lambda$new$1();
                    }
                }).setGravity(5).forceTop(true).translate((-(this.w - Math.min((i3 - i4) - i5, (i4 + i5) + ((((this.audioOffset - this.scroll) + (AndroidUtilities.lerp(this.audioRight, 1.0f, this.audioSelectedT.get()) * this.audioDuration)) / min) * this.sw)))) + AndroidUtilities.dp(18.0f), this.audioBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 1 && this.hasRound) {
                SliderView onValueChange2 = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.roundVolume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda6
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TimelineView.this.lambda$new$2((Float) obj);
                    }
                });
                long min2 = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i6 = this.w;
                int i7 = this.px;
                int i8 = this.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange2).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        TimelineView.this.lambda$new$3();
                    }
                }).setGravity(5).forceTop(true).translate((-(this.w - Math.min((i6 - i7) - i8, (i7 + i8) + ((((this.roundOffset - this.scroll) + (AndroidUtilities.lerp(this.roundRight, 1.0f, this.roundSelectedT.get()) * this.roundDuration)) / min2) * this.sw)))) + AndroidUtilities.dp(18.0f), this.roundBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 0 && this.videoTrack != null) {
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.videoTrack.volume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda8
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TimelineView.this.lambda$new$4((Float) obj);
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), this.videoBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            } else {
                if (i2 != 3 || (i = this.pressCollageIndex) < 0 || i >= this.collageTracks.size()) {
                    return;
                }
                final Track track = (Track) this.collageTracks.get(this.pressCollageIndex);
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(track.volume).setOnValueChange(new Utilities.Callback() { // from class: org.telegram.ui.Stories.recorder.TimelineView$$ExternalSyntheticLambda9
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TimelineView.this.lambda$new$5(track, (Float) obj);
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), track.bounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortCollage$7(Track track, Track track2) {
        return (int) (track2.duration - track.duration);
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
                    TimelineView.this.lambda$setupRoundThumbs$8();
                }
            });
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
                TimelineView.this.lambda$setProgressAt$9(clamp);
            }
        };
        this.askExactSeek = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 150L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProgressAt$9(long j) {
        TimelineDelegate timelineDelegate = this.delegate;
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

    /* JADX WARN: Removed duplicated region for block: B:205:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0dff  */
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
                float f = i3;
                if (motionEvent.getY() < f && motionEvent.getY() > (f - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 0;
                }
                i3 = (int) (f - (getVideoHeight() + AndroidUtilities.dp(4.0f)));
            }
            if (this.pressType == -1 && !this.collageTracks.isEmpty()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.collageTracks.size()) {
                        break;
                    }
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((Track) this.collageTracks.get(i4)).selectedT.get());
                    float f2 = i3;
                    if (motionEvent.getY() < f2 && motionEvent.getY() > (f2 - lerp) - AndroidUtilities.dp(2.0f)) {
                        this.pressType = 3;
                        this.pressCollageIndex = i4;
                        break;
                    }
                    i3 = (int) (f2 - (lerp + AndroidUtilities.dp(4.0f)));
                    i4++;
                }
            }
            if (this.pressType == -1 && this.hasRound) {
                float f3 = i3;
                if (motionEvent.getY() < f3 && motionEvent.getY() > (f3 - getRoundHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 1;
                }
                i3 = (int) (f3 - (getRoundHeight() + AndroidUtilities.dp(4.0f)));
            }
            if (this.pressType == -1 && this.hasAudio) {
                float f4 = i3;
                if (motionEvent.getY() < f4 && motionEvent.getY() > (f4 - getAudioHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 2;
                }
                getAudioHeight();
                AndroidUtilities.dp(4.0f);
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
                    float f5 = track.duration;
                    float f6 = (x / this.sw) * (min3 / f5);
                    if (i2 == 2) {
                        track.left = Utilities.clamp(track.left + f6, track.right - (1000.0f / f5), 0.0f);
                        TimelineDelegate timelineDelegate3 = this.delegate;
                        if (timelineDelegate3 != null) {
                            timelineDelegate3.onVideoLeftChange(false, this.videoTrack.left);
                        }
                        Track track2 = this.videoTrack;
                        float f7 = track2.right - track2.left;
                        float maxSelectDuration = maxSelectDuration();
                        Track track3 = this.videoTrack;
                        if (f7 > maxSelectDuration / track3.duration) {
                            track3.right = Math.min(1.0f, track3.left + (maxSelectDuration() / this.videoTrack.duration));
                            TimelineDelegate timelineDelegate4 = this.delegate;
                            if (timelineDelegate4 != null) {
                                timelineDelegate4.onVideoRightChange(false, this.videoTrack.right);
                            }
                        }
                    } else if (i2 == 3) {
                        track.right = Utilities.clamp(track.right + f6, 1.0f, track.left + (1000.0f / f5));
                        TimelineDelegate timelineDelegate5 = this.delegate;
                        if (timelineDelegate5 != null) {
                            timelineDelegate5.onVideoRightChange(false, this.videoTrack.right);
                        }
                        Track track4 = this.videoTrack;
                        float f8 = track4.right - track4.left;
                        float maxSelectDuration2 = maxSelectDuration();
                        Track track5 = this.videoTrack;
                        if (f8 > maxSelectDuration2 / track5.duration) {
                            track5.left = Math.max(0.0f, track5.right - (maxSelectDuration() / this.videoTrack.duration));
                            TimelineDelegate timelineDelegate6 = this.delegate;
                            if (timelineDelegate6 != null) {
                                timelineDelegate6.onVideoLeftChange(false, this.videoTrack.left);
                            }
                        }
                    } else if (i2 == 4) {
                        if (f6 > 0.0f) {
                            max6 = Math.min(1.0f - track.right, f6);
                        } else {
                            max6 = Math.max(-track.left, f6);
                        }
                        Track track6 = this.videoTrack;
                        float f9 = track6.left + max6;
                        track6.left = f9;
                        track6.right += max6;
                        TimelineDelegate timelineDelegate7 = this.delegate;
                        if (timelineDelegate7 != null) {
                            timelineDelegate7.onVideoLeftChange(false, f9);
                            this.delegate.onVideoRightChange(false, this.videoTrack.right);
                        }
                    }
                    float f10 = this.progress;
                    Track track7 = this.videoTrack;
                    float f11 = track7.duration;
                    float f12 = f10 / f11;
                    float f13 = track7.left;
                    if (f12 < f13 || f12 > track7.right) {
                        long j5 = (long) (f13 * f11);
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
                        float f14 = (x / this.sw) * (min3 / this.audioDuration);
                        if (i6 == 6) {
                            float minAudioSelect = this.audioRight - (minAudioSelect() / this.audioDuration);
                            float max7 = Math.max(0L, this.scroll - this.audioOffset);
                            float f15 = this.audioDuration;
                            float f16 = max7 / f15;
                            Track track8 = this.videoTrack;
                            if (track8 != null) {
                                max2 = Math.max(f16, (((track8.left * track8.duration) + this.scroll) - this.audioOffset) / f15);
                            } else {
                                Track track9 = this.collageMain;
                                if (track9 != null) {
                                    max2 = Math.max(f16, (((track9.left * track9.duration) + this.scroll) - this.audioOffset) / f15);
                                } else if (this.hasRound) {
                                    max2 = Math.max(f16, (((this.roundLeft * this.roundDuration) + this.scroll) - this.audioOffset) / f15);
                                } else {
                                    max2 = Math.max(f16, this.audioRight - (maxSelectDuration() / this.audioDuration));
                                    if (!this.hadDragChange && f14 < 0.0f && this.audioLeft <= this.audioRight - (maxSelectDuration() / this.audioDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f17 = this.audioLeft;
                            float clamp = Utilities.clamp(f17 + f14, minAudioSelect, max2);
                            this.audioLeft = clamp;
                            if (Math.abs(f17 - clamp) > 0.01f) {
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
                            float f18 = this.audioLeft;
                            float minAudioSelect2 = minAudioSelect();
                            float f19 = this.audioDuration;
                            float f20 = f18 + (minAudioSelect2 / f19);
                            Track track10 = this.videoTrack;
                            if (track10 != null) {
                                min = Math.min(min4, (((track10.right * track10.duration) + this.scroll) - this.audioOffset) / f19);
                            } else {
                                Track track11 = this.collageMain;
                                if (track11 != null) {
                                    min = Math.min(min4, (((track11.right * track11.duration) + this.scroll) - this.audioOffset) / f19);
                                } else if (this.hasRound) {
                                    min = Math.min(min4, (((this.roundRight * this.roundDuration) + this.scroll) - this.audioOffset) / f19);
                                } else {
                                    min = Math.min(min4, this.audioLeft + (maxSelectDuration() / this.audioDuration));
                                    if (!this.hadDragChange && f14 > 0.0f && this.audioRight >= this.audioLeft + (maxSelectDuration() / this.audioDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f21 = this.audioRight;
                            float clamp2 = Utilities.clamp(f21 + f14, min, f20);
                            this.audioRight = clamp2;
                            if (Math.abs(f21 - clamp2) > 0.01f) {
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
                            if (f14 > 0.0f) {
                                max = Math.min(Math.max(0.0f, min5 - this.audioRight), f14);
                            } else {
                                max = Math.max(Math.min(0.0f, max8 - this.audioLeft), f14);
                            }
                            float f22 = this.audioLeft + max;
                            this.audioLeft = f22;
                            this.audioRight += max;
                            TimelineDelegate timelineDelegate12 = this.delegate;
                            if (timelineDelegate12 != null) {
                                timelineDelegate12.onAudioLeftChange(f22);
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
                        float f23 = (x / this.sw) * (min3 / this.roundDuration);
                        if (i6 == 10) {
                            float minAudioSelect3 = this.roundRight - (minAudioSelect() / this.roundDuration);
                            float max9 = Math.max(0L, this.scroll - this.roundOffset);
                            float f24 = this.roundDuration;
                            float f25 = max9 / f24;
                            Track track12 = this.videoTrack;
                            if (track12 != null) {
                                max4 = Math.max(f25, (((track12.left * track12.duration) + this.scroll) - this.roundOffset) / f24);
                            } else {
                                Track track13 = this.collageMain;
                                if (track13 != null) {
                                    max4 = Math.max(f25, (((track13.left * track13.duration) + this.scroll) - this.roundOffset) / f24);
                                } else {
                                    max4 = Math.max(f25, this.roundRight - (maxSelectDuration() / this.roundDuration));
                                    if (!this.hadDragChange && f23 < 0.0f && this.roundLeft <= this.roundRight - (maxSelectDuration() / this.roundDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f26 = this.roundLeft;
                            float clamp3 = Utilities.clamp(f26 + f23, minAudioSelect3, max4);
                            this.roundLeft = clamp3;
                            if (Math.abs(f26 - clamp3) > 0.01f) {
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
                            float f27 = this.roundLeft;
                            float minAudioSelect4 = minAudioSelect();
                            float f28 = this.roundDuration;
                            float f29 = f27 + (minAudioSelect4 / f28);
                            Track track14 = this.videoTrack;
                            if (track14 != null) {
                                min6 = Math.min(min6, (((track14.right * track14.duration) + this.scroll) - this.roundOffset) / f28);
                            }
                            Track track15 = this.collageMain;
                            if (track15 != null) {
                                min2 = Math.min(min6, (((track15.right * track15.duration) + this.scroll) - this.roundOffset) / this.roundDuration);
                            } else {
                                min2 = Math.min(min6, this.roundLeft + (maxSelectDuration() / this.roundDuration));
                                if (!this.hadDragChange && f23 > 0.0f && this.roundRight >= this.roundLeft + (maxSelectDuration() / this.roundDuration)) {
                                    this.pressHandle = 8;
                                }
                            }
                            float f30 = this.roundRight;
                            float clamp4 = Utilities.clamp(f30 + f23, min2, f29);
                            this.roundRight = clamp4;
                            if (Math.abs(f30 - clamp4) > 0.01f) {
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
                            if (f23 > 0.0f) {
                                max3 = Math.min(min7 - this.roundRight, f23);
                            } else {
                                max3 = Math.max(max10 - this.roundLeft, f23);
                            }
                            float f31 = this.roundLeft + max3;
                            this.roundLeft = f31;
                            this.roundRight += max3;
                            TimelineDelegate timelineDelegate18 = this.delegate;
                            if (timelineDelegate18 != null) {
                                timelineDelegate18.onRoundLeftChange(f31);
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
                            float f32 = (x / this.sw) * (min3 / track16.duration);
                            int i8 = this.pressHandle;
                            if (i8 == 13) {
                                float minAudioSelect5 = track16.right - (minAudioSelect() / track16.duration);
                                float max11 = Math.max(0L, this.scroll - track16.offset) / track16.duration;
                                if (track16 == this.collageMain) {
                                    max11 = Math.max(max11, track16.right - (maxSelectDuration() / track16.duration));
                                    if (!this.hadDragChange && f32 < 0.0f && track16.left <= track16.right - (maxSelectDuration() / track16.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f33 = track16.left;
                                float clamp5 = Utilities.clamp(f33 + f32, minAudioSelect5, max11);
                                track16.left = clamp5;
                                if (Math.abs(f33 - clamp5) > 0.01f) {
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
                                    if (!this.hadDragChange && f32 > 0.0f && track16.right >= track16.left + (maxSelectDuration() / track16.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f34 = track16.right;
                                float clamp6 = Utilities.clamp(f34 + f32, min8, minAudioSelect6);
                                track16.right = clamp6;
                                if (Math.abs(f34 - clamp6) > 0.01f) {
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
                                if (f32 > 0.0f) {
                                    max5 = Math.min(min9 - track16.right, f32);
                                } else {
                                    max5 = Math.max(max12 - track16.left, f32);
                                }
                                float f35 = track16.left + max5;
                                track16.left = f35;
                                track16.right += max5;
                                TimelineDelegate timelineDelegate24 = this.delegate;
                                if (timelineDelegate24 != null) {
                                    timelineDelegate24.onVideoLeftChange(track16.index, f35);
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
                        float f36 = track17.right - track17.left;
                        track17.left = (clamp7 / getBaseDuration()) * (1.0f - f36);
                        Track track18 = this.videoTrack;
                        float f37 = track18.left;
                        track18.right = f36 + f37;
                        TimelineDelegate timelineDelegate26 = this.delegate;
                        if (timelineDelegate26 != null) {
                            timelineDelegate26.onVideoLeftChange(true, f37);
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
                            float f38 = i17;
                            float f39 = min10;
                            float f40 = this.sw;
                            int i18 = (int) (((this.scroll / f39) * f40) + f38);
                            this.scrolling = true;
                            Scroller scroller = this.scroller;
                            this.wasScrollX = i18;
                            scroller.fling(i18, 0, -xVelocity, 0, i17, (int) (f38 + (((this.videoTrack.duration - min10) / f39) * f40)), 0, 0);
                            z = false;
                        }
                    } else if (i15 == 1 && (velocityTracker4 = this.velocityTracker) != null) {
                        velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                        int xVelocity2 = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = true;
                        if (this.videoTrack != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                            long min11 = Math.min(this.videoTrack.duration, getMaxScrollDuration());
                            int i19 = this.px;
                            float f41 = i19;
                            float f42 = min11;
                            float f43 = this.sw;
                            int i20 = (int) (((this.scroll / f42) * f43) + f41);
                            this.scrolling = true;
                            Scroller scroller2 = this.scroller;
                            this.wasScrollX = i20;
                            scroller2.fling(i20, 0, -xVelocity2, 0, i19, (int) (f41 + (((this.videoTrack.duration - min11) / f42) * f43)), 0, 0);
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
                                float f44 = track19.right;
                                float f45 = track19.duration;
                                j = (long) ((track19.left * f45) - this.audioDuration);
                                j2 = (long) ((f44 * f45) - 0);
                            } else if (this.hasRound) {
                                float f46 = this.roundRight;
                                float f47 = this.roundDuration;
                                j2 = (long) ((f46 * f47) - 0);
                                j = (long) ((this.roundLeft * f47) - this.audioDuration);
                            } else {
                                j = -(this.audioDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                z2 = true;
                                j2 = 0;
                                this.scrolling = z2;
                                Scroller scroller3 = this.scroller;
                                this.wasScrollX = i21;
                                float f48 = this.px + this.ph;
                                float f49 = this.sw;
                                scroller3.fling(i21, 0, xVelocity3, 0, (int) (((j / min12) * f49) + f48), (int) (f48 + ((j2 / min12) * f49)), 0, 0);
                                z = false;
                            }
                            z2 = true;
                            this.scrolling = z2;
                            Scroller scroller32 = this.scroller;
                            this.wasScrollX = i21;
                            float f482 = this.px + this.ph;
                            float f492 = this.sw;
                            scroller32.fling(i21, 0, xVelocity3, 0, (int) (((j / min12) * f492) + f482), (int) (f482 + ((j2 / min12) * f492)), 0, 0);
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
                                float f50 = track20.right;
                                float f51 = track20.duration;
                                j3 = (long) ((f50 * f51) - 0);
                                j4 = (long) ((track20.left * f51) - this.roundDuration);
                            } else {
                                j3 = 0;
                                j4 = -(this.roundDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                            }
                            this.scrolling = true;
                            Scroller scroller4 = this.scroller;
                            this.wasScrollX = i22;
                            float f52 = this.px + this.ph;
                            float f53 = this.sw;
                            scroller4.fling(i22, 0, xVelocity4, 0, (int) (((j4 / min13) * f53) + f52), (int) (f52 + ((j3 / min13) * f53)), 0, 0);
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
                    j2 = j13;
                    j = j14;
                } else {
                    j = j13;
                    j2 = j14;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j9, j, j2);
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
                        j2 = j12;
                        j = j13;
                    } else {
                        j = j12;
                        j2 = j13;
                    }
                    track.offset = Utilities.clamp(track.offset + j8, j, j2);
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
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0690 A[LOOP:4: B:128:0x0690->B:134:0x06d4, LOOP_START, PHI: r5 r6 r11
      0x0690: PHI (r5v125 int) = (r5v124 int), (r5v126 int) binds: [B:127:0x068e, B:134:0x06d4] A[DONT_GENERATE, DONT_INLINE]
      0x0690: PHI (r6v134 int) = (r6v133 int), (r6v135 int) binds: [B:127:0x068e, B:134:0x06d4] A[DONT_GENERATE, DONT_INLINE]
      0x0690: PHI (r11v50 float) = (r11v49 float), (r11v51 float) binds: [B:127:0x068e, B:134:0x06d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0975 A[LOOP:6: B:219:0x0975->B:225:0x09b4, LOOP_START, PHI: r5 r7
      0x0975: PHI (r5v92 int) = (r5v91 int), (r5v93 int) binds: [B:218:0x0973, B:225:0x09b4] A[DONT_GENERATE, DONT_INLINE]
      0x0975: PHI (r7v44 float) = (r7v43 float), (r7v45 float) binds: [B:218:0x0973, B:225:0x09b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x1118  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0fb6  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x10c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03f4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void dispatchDraw(Canvas canvas) {
        long j;
        int i;
        float max;
        Track track;
        Track track2;
        int i2;
        float f;
        float max2;
        float f2;
        boolean z;
        float f3;
        float f4;
        float f5;
        Paint paint;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        Canvas canvas2;
        float f12;
        Paint paint2;
        float f13;
        float f14;
        Canvas canvas3;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        Paint paint3;
        double d;
        Canvas canvas4;
        float f21;
        float f22;
        float max3;
        float f23;
        float f24;
        Track track3;
        float f25;
        float f26;
        float f27;
        float f28;
        Track track4;
        long j2;
        float f29;
        float lerp;
        float lerp2;
        Canvas canvas5;
        long j3;
        double d2;
        float f30;
        BlurringShader.BlurManager blurManager;
        float f31;
        float f32;
        float f33;
        Paint paint4;
        float f34;
        boolean z2;
        float f35;
        long j4;
        int i3;
        float f36;
        float f37;
        Canvas canvas6;
        float f38;
        int i4;
        float f39;
        Paint paint5;
        Paint paint6;
        Canvas canvas7;
        float f40;
        float f41;
        boolean z3;
        int i5;
        Paint paint7;
        float f42;
        float f43;
        float f44;
        Paint paint8;
        int i6;
        int i7;
        BlurringShader.BlurManager blurManager2;
        Canvas canvas8 = canvas;
        Paint paint9 = this.backgroundBlur.getPaint(1.0f);
        float f45 = this.openT.set(this.open);
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (f45 < 1.0f) {
            this.timelineBounds.set(this.px, (this.h - this.py) - AndroidUtilities.dp(28.0f), this.w - this.px, this.h - this.py);
            this.timelineClipPath.rewind();
            this.timelineClipPath.addRoundRect(this.timelineBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas8.saveLayerAlpha(this.timelineBounds, (int) ((1.0f - f45) * 255.0f), 31);
            canvas8.clipPath(this.timelineClipPath);
            if (this.blurManager.hasRenderNode()) {
                this.backgroundBlur.drawRect(canvas8);
                canvas8.drawColor(855638016);
            } else if (paint9 == null) {
                canvas8.drawColor(TLObject.FLAG_30);
            } else {
                canvas8.drawRect(this.timelineBounds, paint9);
                canvas8.drawColor(855638016);
            }
            if (!this.collageWaveforms.isEmpty() && (blurManager2 = this.blurManager) != null && blurManager2.hasRenderNode()) {
                float f46 = this.timelineWaveformMax.set(WaveformPath.getMaxBar(this.collageWaveforms));
                WaveformPath waveformPath = this.timelineWaveformPath;
                RectF rectF = this.timelineBounds;
                waveformPath.check(this.px + this.ph + (((this.audioOffset - this.scroll) / min) * this.sw), rectF.left, rectF.right, 0.0f, AndroidUtilities.dp(28.0f), f46, this.timelineBounds.bottom, this.collageWaveforms);
                canvas8.saveLayerAlpha(this.timelineBounds, 102, 31);
                canvas8.clipPath(this.timelineWaveformPath);
                this.audioWaveformBlur.drawRect(canvas8);
                canvas.restore();
            } else if (!this.collageWaveforms.isEmpty()) {
                Paint paint10 = this.audioWaveformBlur.getPaint(0.4f);
                if (paint10 == null) {
                    paint10 = this.waveformPaint;
                    paint10.setAlpha(64);
                }
                float f47 = this.timelineWaveformMax.set(WaveformPath.getMaxBar(this.collageWaveforms));
                WaveformPath waveformPath2 = this.timelineWaveformPath;
                RectF rectF2 = this.timelineBounds;
                waveformPath2.check(this.px + this.ph + (((this.audioOffset - this.scroll) / min) * this.sw), rectF2.left, rectF2.right, 0.0f, AndroidUtilities.dp(28.0f), f47, this.timelineBounds.bottom, this.collageWaveforms);
                canvas8.drawPath(this.timelineWaveformPath, paint10);
            }
            float currentWidth = ((this.timelineText.getCurrentWidth() + AndroidUtilities.dp(3.66f)) + this.timelineIcon.getIntrinsicWidth()) / 2.0f;
            int centerX = (int) (this.timelineBounds.centerX() - currentWidth);
            int centerY = (int) this.timelineBounds.centerY();
            Drawable drawable = this.timelineIcon;
            drawable.setBounds(centerX, centerY - (drawable.getIntrinsicHeight() / 2), this.timelineIcon.getIntrinsicWidth() + centerX, (this.timelineIcon.getIntrinsicHeight() / 2) + centerY);
            this.timelineIcon.setAlpha(NotificationCenter.boostByChannelCreated);
            this.timelineIcon.draw(canvas8);
            this.timelineText.draw(canvas, (this.timelineBounds.centerX() - currentWidth) + this.timelineIcon.getIntrinsicWidth() + AndroidUtilities.dp(3.66f), centerY, -1, 0.75f);
            canvas.restore();
        }
        if (f45 > 0.0f) {
            if (f45 < 1.0f) {
                f2 = 0.0f;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f45 * 255.0f), 31);
                z = true;
            } else {
                f2 = 0.0f;
                z = false;
            }
            Track track5 = this.videoTrack;
            float f48 = track5 != null ? 1.0f : 0.0f;
            if (track5 != null) {
                f3 = track5.selectedT.set((this.audioSelected || this.roundSelected) ? false : true);
            } else {
                f3 = 0.0f;
            }
            float f49 = this.h - this.py;
            float dp = AndroidUtilities.dp(4.0f);
            if (this.videoTrack != null) {
                canvas.save();
                float videoHeight = getVideoHeight();
                Track track6 = this.videoTrack;
                float f50 = track6.left;
                long j5 = track6.duration;
                float f51 = j5;
                float f52 = (f50 * f51 * f3) + f2;
                float f53 = (track6.right * f51 * f3) + f2;
                if (j5 <= 0) {
                    f8 = f53;
                    paint7 = paint9;
                    f42 = 0.0f;
                } else {
                    f8 = f53;
                    paint7 = paint9;
                    f42 = (this.px + this.ph) - ((this.scroll / min) * this.sw);
                }
                float f54 = this.ph;
                float f55 = f42 - f54;
                if (j5 <= 0) {
                    f43 = f52;
                    f44 = 0.0f;
                } else {
                    f43 = f52;
                    f44 = this.px + r10 + (((j5 - this.scroll) / min) * this.sw);
                }
                this.videoBounds.set(f55, f49 - videoHeight, f44 + f54, f49);
                float f56 = f49 - ((dp * f48) + videoHeight);
                RectF rectF3 = this.videoBounds;
                float f57 = (rectF3.top * f3) + 0.0f;
                float f58 = (rectF3.bottom * f3) + 0.0f;
                this.videoClipPath.rewind();
                f9 = f58;
                this.videoClipPath.addRoundRect(this.videoBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas8.clipPath(this.videoClipPath);
                VideoThumbsLoader videoThumbsLoader = this.videoTrack.thumbs;
                if (videoThumbsLoader != null) {
                    int frameWidth = videoThumbsLoader.getFrameWidth();
                    float f59 = frameWidth;
                    f4 = f3;
                    f5 = f48;
                    int max4 = (int) Math.max(0.0d, Math.floor((f55 - this.px) / f59));
                    int min2 = (int) Math.min(this.videoTrack.thumbs.count, Math.ceil(((r4 - f55) - this.px) / f59) + 1.0d);
                    int i8 = (int) this.videoBounds.top;
                    boolean z4 = this.videoTrack.thumbs.frames.size() >= min2;
                    boolean z5 = (frameWidth == 0 || !z4 || this.videoTrack.isRound) ? false : true;
                    if (z5) {
                        int i9 = max4;
                        i6 = i9;
                        while (true) {
                            if (i9 >= Math.min(this.videoTrack.thumbs.frames.size(), min2)) {
                                break;
                            }
                            if (((VideoThumbsLoader.BitmapFrame) this.videoTrack.thumbs.frames.get(i9)).bitmap == null) {
                                z5 = false;
                                break;
                            }
                            i9++;
                        }
                    } else {
                        i6 = max4;
                    }
                    if (!z5) {
                        if (this.blurManager.hasRenderNode()) {
                            this.backgroundBlur.drawRect(canvas8);
                            canvas8.drawColor(855638016);
                        } else if (paint7 == null) {
                            canvas8.drawColor(TLObject.FLAG_30);
                        } else {
                            paint8 = paint7;
                            canvas8.drawRect(this.videoBounds, paint8);
                            canvas8.drawColor(855638016);
                            if (frameWidth != 0) {
                                int i10 = i6;
                                while (i10 < Math.min(this.videoTrack.thumbs.frames.size(), min2)) {
                                    VideoThumbsLoader.BitmapFrame bitmapFrame = (VideoThumbsLoader.BitmapFrame) this.videoTrack.thumbs.frames.get(i10);
                                    if (bitmapFrame.bitmap != null) {
                                        i7 = min2;
                                        this.videoFramePaint.setAlpha((int) (bitmapFrame.getAlpha() * 255.0f));
                                        canvas8.drawBitmap(bitmapFrame.bitmap, f55, i8 - ((int) ((r0.getHeight() - videoHeight) / 2.0f)), this.videoFramePaint);
                                    } else {
                                        i7 = min2;
                                    }
                                    f55 += f59;
                                    i10++;
                                    min2 = i7;
                                }
                            }
                            if (!z4) {
                                this.videoTrack.thumbs.load();
                            }
                        }
                    }
                    paint8 = paint7;
                    if (frameWidth != 0) {
                    }
                    if (!z4) {
                    }
                } else {
                    f4 = f3;
                    f5 = f48;
                    paint8 = paint7;
                }
                this.selectedVideoClipPath.rewind();
                if (this.isCover) {
                    f10 = f57;
                    paint = paint8;
                } else {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f60 = this.px + this.ph;
                    Track track7 = this.videoTrack;
                    float f61 = track7.left;
                    float f62 = track7.duration;
                    paint = paint8;
                    float f63 = this.scroll;
                    float f64 = min;
                    float f65 = this.sw;
                    float f66 = (((((f61 * f62) - f63) / f64) * f65) + f60) - (f61 <= 0.0f ? r4 : 0);
                    f10 = f57;
                    float f67 = this.h - this.py;
                    float f68 = f67 - videoHeight;
                    float f69 = track7.right;
                    rectF4.set(f66, f68, f60 + ((((f62 * f69) - f63) / f64) * f65) + (f69 >= 1.0f ? r4 : 0), f67);
                    this.selectedVideoClipPath.addRoundRect(rectF4, this.selectedVideoRadii, Path.Direction.CW);
                    canvas8.clipPath(this.selectedVideoClipPath, Region.Op.DIFFERENCE);
                    canvas8.drawColor(1342177280);
                }
                canvas.restore();
                f7 = videoHeight;
                f6 = f43;
                f49 = f56;
            } else {
                f4 = f3;
                f5 = f48;
                paint = paint9;
                f6 = 0.0f;
                f7 = 0.0f;
                f8 = 0.0f;
                f9 = 0.0f;
                f10 = 0.0f;
            }
            if (this.collageTracks.isEmpty()) {
                f11 = dp;
                float f70 = f6;
                canvas2 = canvas8;
                f12 = f7;
                paint2 = paint;
                f13 = f70;
                f14 = 0.0f;
            } else {
                getCollageHeight();
                int i11 = 0;
                while (i11 < this.collageTracks.size()) {
                    Track track8 = (Track) this.collageTracks.get(i11);
                    float f71 = track8.selectedT.set((this.audioSelected || this.roundSelected || this.collageSelected != i11) ? false : true);
                    if (track8 != this.collageMain) {
                        int i12 = i11;
                        float f72 = min;
                        float lerp3 = this.px + this.ph + ((((track8.offset - this.scroll) + (AndroidUtilities.lerp(track8.left, 0.0f, f71) * track8.duration)) / f72) * this.sw);
                        f35 = dp;
                        f36 = this.px + this.ph + ((((track8.offset - this.scroll) + (AndroidUtilities.lerp(track8.right, 1.0f, f71) * track8.duration)) / f72) * this.sw);
                        j4 = min;
                        f37 = lerp3;
                        i3 = i12;
                    } else {
                        f35 = dp;
                        int i13 = i11;
                        float f73 = this.px + this.ph;
                        long j6 = track8.offset - this.scroll;
                        float f74 = min;
                        float f75 = this.sw;
                        float f76 = ((j6 / f74) * f75) + f73;
                        j4 = min;
                        i3 = i13;
                        f36 = f73 + (((j6 + track8.duration) / f74) * f75);
                        f37 = f76;
                    }
                    canvas.save();
                    float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), f71);
                    RectF rectF5 = track8.bounds;
                    float f77 = this.ph;
                    rectF5.set(f37 - f77, f49 - lerp4, f36 + f77, f49);
                    RectF rectF6 = track8.bounds;
                    f10 += rectF6.top * f71;
                    f9 += rectF6.bottom * f71;
                    float f78 = track8.offset;
                    float f79 = track8.left;
                    float f80 = track8.duration;
                    float f81 = f6 + (((f79 * f80) + f78) * f71);
                    f8 += (f78 + (track8.right * f80)) * f71;
                    this.collageClipPath.rewind();
                    this.collageClipPath.addRoundRect(track8.bounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas8.clipPath(this.collageClipPath);
                    VideoThumbsLoader videoThumbsLoader2 = track8.thumbs;
                    if (videoThumbsLoader2 != null) {
                        long j7 = track8.duration;
                        if (j7 <= 0) {
                            i4 = i3;
                            min = j4;
                            f40 = 0.0f;
                        } else {
                            i4 = i3;
                            min = j4;
                            f40 = this.px + this.ph + (((track8.offset - this.scroll) / min) * this.sw);
                        }
                        float f82 = f40 - this.ph;
                        if (j7 <= 0) {
                            f38 = f7;
                            f41 = 0.0f;
                        } else {
                            f38 = f7;
                            f41 = ((((track8.offset + j7) - this.scroll) / min) * this.sw) + this.px + r12;
                        }
                        int frameWidth2 = videoThumbsLoader2.getFrameWidth();
                        float f83 = frameWidth2;
                        int max5 = (int) Math.max(0.0d, Math.floor((f82 - ((this.px + this.ph) + (((track8.offset - this.scroll) / min) * this.sw))) / f83));
                        int min3 = (int) Math.min(track8.thumbs.count, Math.ceil(((f41 + r13) - f82) / f83) + 1.0d);
                        int i14 = (int) track8.bounds.top;
                        boolean z6 = track8.thumbs.frames.size() >= min3;
                        if (z6) {
                            for (int i15 = max5; i15 < Math.min(track8.thumbs.frames.size(), min3); i15++) {
                                if (((VideoThumbsLoader.BitmapFrame) track8.thumbs.frames.get(i15)).bitmap == null) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z3 = z6;
                        if (z3) {
                            canvas6 = canvas;
                        } else if (this.blurManager.hasRenderNode()) {
                            canvas6 = canvas;
                            this.backgroundBlur.drawRect(canvas6);
                            canvas6.drawColor(855638016);
                        } else {
                            canvas6 = canvas;
                            if (paint == null) {
                                canvas6.drawColor(TLObject.FLAG_30);
                            } else {
                                f39 = f81;
                                paint5 = paint;
                                canvas6.drawRect(track8.bounds, paint5);
                                canvas6.drawColor(855638016);
                                if (frameWidth2 != 0) {
                                    while (max5 < Math.min(track8.thumbs.frames.size(), min3)) {
                                        VideoThumbsLoader.BitmapFrame bitmapFrame2 = (VideoThumbsLoader.BitmapFrame) track8.thumbs.frames.get(max5);
                                        if (bitmapFrame2.bitmap != null) {
                                            i5 = min3;
                                            this.collageFramePaint.setAlpha((int) (bitmapFrame2.getAlpha() * 255.0f));
                                            canvas6.drawBitmap(bitmapFrame2.bitmap, f82, i14 - ((int) ((r1.getHeight() - lerp4) / 2.0f)), this.collageFramePaint);
                                        } else {
                                            i5 = min3;
                                        }
                                        f82 += f83;
                                        max5++;
                                        min3 = i5;
                                    }
                                }
                                if (!z6) {
                                    track8.thumbs.load();
                                }
                            }
                        }
                        f39 = f81;
                        paint5 = paint;
                        if (frameWidth2 != 0) {
                        }
                        if (!z6) {
                        }
                    } else {
                        canvas6 = canvas8;
                        f38 = f7;
                        i4 = i3;
                        min = j4;
                        f39 = f81;
                        paint5 = paint;
                    }
                    this.selectedCollageClipPath.rewind();
                    if (this.isCover) {
                        paint6 = paint5;
                        canvas7 = canvas6;
                    } else {
                        RectF rectF7 = AndroidUtilities.rectTmp;
                        float f84 = this.px + this.ph;
                        float f85 = track8.left;
                        float f86 = track8.duration;
                        float f87 = this.scroll;
                        float f88 = track8.offset;
                        float f89 = min;
                        float f90 = this.sw;
                        float f91 = ((((((f85 * f86) - f87) + f88) / f89) * f90) + f84) - (f85 <= 0.0f ? r6 : 0);
                        RectF rectF8 = track8.bounds;
                        paint6 = paint5;
                        float f92 = rectF8.top;
                        float f93 = track8.right;
                        rectF7.set(f91, f92, f84 + (((((f86 * f93) - f87) + f88) / f89) * f90) + (f93 >= 1.0f ? r6 : 0), rectF8.bottom);
                        this.selectedCollageClipPath.addRoundRect(rectF7, this.selectedVideoRadii, Path.Direction.CW);
                        canvas7 = canvas;
                        canvas7.clipPath(this.selectedCollageClipPath, Region.Op.DIFFERENCE);
                        canvas7.drawColor(1342177280);
                    }
                    canvas.restore();
                    f49 -= lerp4 + (f35 * 1.0f);
                    i11 = i4 + 1;
                    canvas8 = canvas7;
                    dp = f35;
                    f7 = f38;
                    f6 = f39;
                    paint = paint6;
                }
                f11 = dp;
                f13 = f6;
                canvas2 = canvas8;
                f12 = f7;
                paint2 = paint;
                f14 = 1.0f;
            }
            float f94 = this.roundT.set(this.hasRound);
            float f95 = this.roundSelectedT.set(this.hasRound && this.roundSelected);
            float roundHeight = getRoundHeight() * f94;
            float f96 = ((this.videoTrack == null && !this.hasAudio && this.collageTracks.isEmpty()) ? 1.0f : f95) * f94;
            if (f94 > 0.0f) {
                long j8 = this.roundOffset;
                float f97 = j8;
                float f98 = this.roundLeft;
                f15 = f14;
                float f99 = this.roundDuration;
                f13 += (f97 + (f98 * f99)) * f96;
                f8 += (f97 + (this.roundRight * f99)) * f96;
                if (this.videoTrack != null) {
                    float f100 = this.px + this.ph;
                    float lerp5 = (j8 - this.scroll) + (AndroidUtilities.lerp(f98, 0.0f, f95) * this.roundDuration);
                    float f101 = min;
                    f32 = f100 + ((lerp5 / f101) * this.sw);
                    f31 = this.px + this.ph + ((((this.roundOffset - this.scroll) + (AndroidUtilities.lerp(this.roundRight, 1.0f, f95) * this.roundDuration)) / f101) * this.sw);
                    f17 = f95;
                } else {
                    float f102 = this.px + this.ph;
                    f17 = f95;
                    long j9 = j8 - this.scroll;
                    float f103 = min;
                    float f104 = this.sw;
                    f31 = f102 + (((j9 + r12) / f103) * f104);
                    f32 = ((j9 / f103) * f104) + f102;
                }
                RectF rectF9 = this.roundBounds;
                float f105 = this.ph;
                rectF9.set(f32 - f105, f49 - roundHeight, f31 + f105, f49);
                float f106 = f49 - ((f11 * f94) + roundHeight);
                RectF rectF10 = this.roundBounds;
                f10 += rectF10.top * f96;
                f9 += rectF10.bottom * f96;
                this.roundClipPath.rewind();
                this.roundClipPath.addRoundRect(this.roundBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.save();
                canvas3 = canvas;
                canvas3.clipPath(this.roundClipPath);
                VideoThumbsLoader videoThumbsLoader3 = this.roundThumbs;
                if (videoThumbsLoader3 != null) {
                    long j10 = this.roundDuration;
                    float f107 = j10 <= 0 ? 0.0f : this.px + this.ph + (((this.roundOffset - this.scroll) / min) * this.sw);
                    float f108 = this.ph;
                    float f109 = f107 - f108;
                    float f110 = (j10 <= 0 ? 0.0f : ((((this.roundOffset + j10) - this.scroll) / min) * this.sw) + this.px + r10) + f108;
                    int frameWidth3 = videoThumbsLoader3.getFrameWidth();
                    if (this.videoTrack != null) {
                        f34 = this.px + this.ph + (((this.roundOffset - this.scroll) / min) * this.sw);
                    } else {
                        f34 = this.px;
                    }
                    float f111 = frameWidth3;
                    int max6 = (int) Math.max(0.0d, Math.floor((f109 - f34) / f111));
                    int min4 = (int) Math.min(this.roundThumbs.count, Math.ceil((f110 - f109) / f111) + 1.0d);
                    int i16 = (int) this.roundBounds.top;
                    boolean z7 = this.roundThumbs.frames.size() >= min4;
                    if (z7) {
                        for (int i17 = max6; i17 < Math.min(this.roundThumbs.frames.size(), min4); i17++) {
                            if (((VideoThumbsLoader.BitmapFrame) this.roundThumbs.frames.get(i17)).bitmap == null) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = z7;
                    if (!z2) {
                        if (this.blurManager.hasRenderNode()) {
                            this.backgroundBlur.drawRect(canvas3);
                            canvas3.drawColor(855638016);
                        } else if (paint2 == null) {
                            canvas3.drawColor(TLObject.FLAG_30);
                        } else {
                            f33 = f106;
                            paint4 = paint2;
                            canvas3.drawRect(this.roundBounds, paint4);
                            canvas3.drawColor(855638016);
                            if (frameWidth3 != 0) {
                                while (max6 < Math.min(this.roundThumbs.frames.size(), min4)) {
                                    VideoThumbsLoader.BitmapFrame bitmapFrame3 = (VideoThumbsLoader.BitmapFrame) this.roundThumbs.frames.get(max6);
                                    if (bitmapFrame3.bitmap != null) {
                                        this.videoFramePaint.setAlpha((int) (bitmapFrame3.getAlpha() * 255.0f));
                                        canvas3.drawBitmap(bitmapFrame3.bitmap, f109, i16 - ((int) ((r2.getHeight() - roundHeight) / 2.0f)), this.videoFramePaint);
                                    }
                                    f109 += f111;
                                    max6++;
                                }
                            }
                            if (!z7) {
                                this.roundThumbs.load();
                            }
                        }
                    }
                    f33 = f106;
                    paint4 = paint2;
                    if (frameWidth3 != 0) {
                    }
                    if (!z7) {
                    }
                } else {
                    f33 = f106;
                    paint4 = paint2;
                }
                this.selectedVideoClipPath.rewind();
                RectF rectF11 = AndroidUtilities.rectTmp;
                int i18 = this.px;
                int i19 = this.ph;
                float f112 = i18 + i19;
                float f113 = this.roundLeft;
                float f114 = this.roundDuration;
                float f115 = this.scroll;
                float f116 = this.roundOffset;
                float f117 = min;
                float f118 = this.sw;
                float f119 = ((((((f113 * f114) - f115) + f116) / f117) * f118) + f112) - (f113 <= 0.0f ? i19 : 0);
                float f120 = i19 * (1.0f - f17);
                float f121 = f119 - f120;
                paint2 = paint4;
                RectF rectF12 = this.roundBounds;
                float f122 = rectF12.top;
                f16 = f94;
                float f123 = this.roundRight;
                rectF11.set(f121, f122, f112 + (((((f114 * f123) - f115) + f116) / f117) * f118) + (f123 >= 1.0f ? i19 : 0) + f120, rectF12.bottom);
                this.selectedVideoClipPath.addRoundRect(rectF11, this.selectedVideoRadii, Path.Direction.CW);
                canvas3.clipPath(this.selectedVideoClipPath, Region.Op.DIFFERENCE);
                canvas3.drawColor(1342177280);
                canvas.restore();
                f49 = f33;
            } else {
                canvas3 = canvas2;
                f15 = f14;
                f16 = f94;
                f17 = f95;
            }
            float f124 = this.audioT.set(this.hasAudio);
            float f125 = this.audioSelectedT.set(this.hasAudio && this.audioSelected);
            float audioHeight = getAudioHeight() * f124;
            float f126 = ((this.videoTrack == null && !this.hasRound && this.collageTracks.isEmpty()) ? 1.0f : f125) * f124;
            if (f124 > 0.0f) {
                float f127 = this.audioOffset;
                float f128 = this.audioLeft;
                float f129 = this.audioDuration;
                f13 += ((f128 * f129) + f127) * f126;
                f8 += (f127 + (this.audioRight * f129)) * f126;
                Paint paint11 = this.audioBlur.getPaint(f124);
                canvas.save();
                if (this.videoTrack != null || this.hasRound || !this.collageTracks.isEmpty()) {
                    f29 = f124;
                    float f130 = min;
                    lerp = this.px + this.ph + ((((this.audioOffset - this.scroll) + (AndroidUtilities.lerp(this.audioLeft, 0.0f, f125) * this.audioDuration)) / f130) * this.sw);
                    lerp2 = this.px + this.ph + ((((this.audioOffset - this.scroll) + (AndroidUtilities.lerp(this.audioRight, 1.0f, f125) * this.audioDuration)) / f130) * this.sw);
                } else {
                    float f131 = this.px + this.ph;
                    long j11 = this.audioOffset - this.scroll;
                    float f132 = min;
                    float f133 = this.sw;
                    lerp = ((j11 / f132) * f133) + f131;
                    f29 = f124;
                    lerp2 = f131 + (((j11 + this.audioDuration) / f132) * f133);
                }
                RectF rectF13 = this.audioBounds;
                float f134 = this.ph;
                rectF13.set(lerp - f134, f49 - audioHeight, f134 + lerp2, f49);
                RectF rectF14 = this.audioBounds;
                f10 += rectF14.top * f126;
                f9 += rectF14.bottom * f126;
                this.audioClipPath.rewind();
                this.audioClipPath.addRoundRect(this.audioBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas3.clipPath(this.audioClipPath);
                BlurringShader.BlurManager blurManager3 = this.blurManager;
                if (blurManager3 == null || !blurManager3.hasRenderNode()) {
                    f124 = f29;
                    if (paint11 == null) {
                        canvas3.drawColor(Theme.multAlpha(TLObject.FLAG_30, f124));
                    } else {
                        canvas3.drawRect(this.audioBounds, paint11);
                        canvas3.drawColor(Theme.multAlpha(855638016, f124));
                    }
                } else {
                    this.backgroundBlur.drawRect(canvas3);
                    f124 = f29;
                    canvas3.drawColor(Theme.multAlpha(855638016, f124));
                }
                if (this.waveform != null && (blurManager = this.blurManager) != null && blurManager.hasRenderNode()) {
                    float f135 = this.waveformMax.set(this.waveform.getMaxBar(), !this.waveformIsLoaded);
                    this.waveformIsLoaded = this.waveform.getLoadedCount() > 0;
                    d2 = 0.0d;
                    canvas5 = canvas;
                    paint3 = paint2;
                    j3 = min;
                    this.waveformPath.check(this.px + this.ph + (((this.audioOffset - this.scroll) / min) * this.sw), lerp, lerp2, f125, j3, audioHeight, f135, this.audioBounds.bottom, this.waveform);
                    canvas5.saveLayerAlpha(this.audioBounds, 102, 31);
                    canvas5.clipPath(this.waveformPath);
                    this.audioWaveformBlur.drawRect(canvas5);
                    canvas.restore();
                } else {
                    canvas5 = canvas3;
                    j3 = min;
                    paint3 = paint2;
                    d2 = 0.0d;
                    if (this.waveform != null && paint11 != null) {
                        Paint paint12 = this.audioWaveformBlur.getPaint(0.4f * f124);
                        if (paint12 == null) {
                            paint12 = this.waveformPaint;
                            paint12.setAlpha((int) (64.0f * f124));
                        }
                        float f136 = this.waveformMax.set(this.waveform.getMaxBar(), !this.waveformIsLoaded);
                        this.waveformIsLoaded = this.waveform.getLoadedCount() > 0;
                        this.waveformPath.check(this.px + this.ph + (((this.audioOffset - this.scroll) / j3) * this.sw), lerp, lerp2, f125, j3, audioHeight, f136, this.audioBounds.bottom, this.waveform);
                        canvas5.drawPath(this.waveformPath, paint12);
                    }
                }
                if (f125 < 1.0f) {
                    int i20 = this.px;
                    float f137 = this.ph + i20;
                    float f138 = this.audioOffset - this.scroll;
                    float f139 = this.audioLeft;
                    float f140 = this.audioDuration;
                    j = j3;
                    float f141 = j;
                    float f142 = this.sw;
                    float f143 = ((((f139 * f140) + f138) / f141) * f142) + f137;
                    float f144 = f137 + (((f138 + (this.audioRight * f140)) / f141) * f142);
                    float max7 = (Math.max(i20, f143) + Math.min(this.w - this.px, f144)) / 2.0f;
                    float centerY2 = this.audioBounds.centerY();
                    float max8 = Math.max(0.0f, (Math.min(this.w - this.px, f144) - Math.max(this.px, f143)) - AndroidUtilities.dp(24.0f));
                    float dpf2 = AndroidUtilities.dpf2(13.0f) + ((this.audioAuthor == null && this.audioTitle == null) ? 0.0f : AndroidUtilities.dpf2(3.11f) + this.audioAuthorWidth + AndroidUtilities.dpf2(9.66f) + this.audioTitleWidth);
                    boolean z8 = dpf2 < max8;
                    float min5 = max7 - (Math.min(dpf2, max8) / 2.0f);
                    this.audioIcon.setBounds((int) min5, (int) (centerY2 - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + min5), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + centerY2));
                    float f145 = 1.0f - f125;
                    float f146 = f145 * 255.0f;
                    this.audioIcon.setAlpha((int) f146);
                    this.audioIcon.draw(canvas5);
                    float dpf22 = min5 + AndroidUtilities.dpf2(16.11f);
                    d = d2;
                    f20 = f4;
                    f18 = f125;
                    f19 = f5;
                    canvas4 = canvas5;
                    canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, NotificationCenter.didReceiveSmsCode, 31);
                    float min6 = Math.min(f144, this.w) - AndroidUtilities.dp(12.0f);
                    canvas4.clipRect(dpf22, 0.0f, min6, this.h);
                    if (this.audioAuthor != null) {
                        canvas.save();
                        canvas4.translate(dpf22 - this.audioAuthorLeft, centerY2 - (this.audioAuthor.getHeight() / 2.0f));
                        this.audioAuthorPaint.setAlpha((int) (f146 * f124));
                        this.audioAuthor.draw(canvas4);
                        canvas.restore();
                        f30 = dpf22 + this.audioAuthorWidth;
                    } else {
                        f30 = dpf22;
                    }
                    if (this.audioAuthor != null && this.audioTitle != null) {
                        float dpf23 = f30 + AndroidUtilities.dpf2(3.66f);
                        int alpha = this.audioDotPaint.getAlpha();
                        this.audioDotPaint.setAlpha((int) (alpha * f145));
                        canvas4.drawCircle(AndroidUtilities.dp(1.0f) + dpf23, centerY2, AndroidUtilities.dp(1.0f), this.audioDotPaint);
                        this.audioDotPaint.setAlpha(alpha);
                        f30 = dpf23 + AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(4.0f);
                    }
                    if (this.audioTitle != null) {
                        canvas.save();
                        canvas4.translate(f30 - this.audioTitleLeft, centerY2 - (this.audioTitle.getHeight() / 2.0f));
                        this.audioTitlePaint.setAlpha((int) (f146 * f124));
                        this.audioTitle.draw(canvas4);
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
                    f18 = f125;
                    d = d2;
                    j = j3;
                    f19 = f5;
                    f20 = f4;
                    canvas4 = canvas5;
                }
                canvas.restore();
            } else {
                f18 = f125;
                j = min;
                f19 = f5;
                f20 = f4;
                paint3 = paint2;
                d = 0.0d;
                canvas4 = canvas3;
            }
            float f147 = f9;
            float f148 = f10;
            float f149 = this.px + this.ph;
            float f150 = this.scroll;
            float f151 = j;
            float f152 = this.sw;
            float f153 = f149 + (((f13 - f150) / f151) * f152);
            float f154 = f149 + (((f8 - f150) / f151) * f152);
            if (!this.collageTracks.isEmpty()) {
                f21 = f16;
                max3 = f15;
            } else if (this.hasAudio && this.videoTrack == null) {
                max3 = f124;
                f21 = f16;
            } else {
                f21 = f16;
                f22 = f19;
                max3 = Math.max(f22, f21);
                if (f124 <= d || f21 > d || f22 > d || f15 > d) {
                    if (this.videoTrack == null || this.hasRound || !this.collageTracks.isEmpty()) {
                        f23 = f18;
                        f24 = 1.0f;
                    } else {
                        f23 = f18;
                        f24 = AndroidUtilities.lerp(0.6f, 1.0f, f23) * f124;
                    }
                    drawRegion(canvas, paint3, f148, f147, f153, f154, f24 * max3);
                    track3 = this.videoTrack;
                    if (track3 == null && ((this.hasAudio || this.hasRound) && (f23 > 0.0f || f17 > 0.0f))) {
                        float f155 = this.h - this.py;
                        float f156 = this.ph + this.px;
                        float f157 = track3.left;
                        float f158 = track3.duration;
                        float f159 = this.scroll;
                        float f160 = this.sw;
                        drawRegion(canvas, paint3, f155 - f12, f155, f156 + ((((f157 * f158) - f159) / f151) * f160), f156 + ((((track3.right * f158) - f159) / f151) * f160), 0.8f);
                    } else if (this.collageMain != null && this.collageTracks.size() > 1) {
                        Track track9 = this.collageMain;
                        RectF rectF16 = track9.bounds;
                        float f161 = rectF16.top;
                        float f162 = rectF16.bottom;
                        float f163 = this.ph + this.px;
                        float f164 = track9.offset;
                        float f165 = track9.left;
                        float f166 = track9.duration;
                        float f167 = this.scroll;
                        float f168 = this.sw;
                        drawRegion(canvas, paint3, f161, f162, (((((f165 * f166) + f164) - f167) / f151) * f168) + f163, f163 + ((((f164 + (track9.right * f166)) - f167) / f151) * f168), 0.8f);
                    }
                    if (this.maxCount > 1 && (track4 = this.videoTrack) != null) {
                        float f169 = track4.duration;
                        float f170 = track4.right;
                        float f171 = track4.left;
                        j2 = (long) ((f170 - f171) * f169);
                        if (j2 > 68999) {
                            float f172 = this.px + this.ph;
                            float f173 = this.scroll;
                            float f174 = this.sw;
                            float f175 = ((((f171 * f169) - f173) / f151) * f174) + f172;
                            float f176 = f172 + ((((f170 * f169) - f173) / f151) * f174);
                            canvas.save();
                            float f177 = this.h - this.py;
                            canvas4.clipRect(f175, f177 - f12, f176, f177);
                            this.regionPaint.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f20) * 255.0f));
                            long j12 = 59000;
                            int min7 = (int) Math.min(this.maxCount - 1, j2 / 59000);
                            int i21 = 1;
                            while (i21 <= min7) {
                                int i22 = min7;
                                if (Math.min(j12, j2 - (i21 * j12)) < 1000) {
                                    break;
                                }
                                float f178 = this.px + this.ph;
                                Track track10 = this.videoTrack;
                                float f179 = f178 + ((((((long) (track10.duration * track10.left)) + r0) - this.scroll) / f151) * this.sw);
                                canvas.drawRect(f179, (this.h - this.py) - f12, f179 + AndroidUtilities.dp(1.0f), this.h - this.py, this.regionPaint);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                i21++;
                                sb.append(i21);
                                canvas4.drawText(sb.toString(), f179 + AndroidUtilities.dp(2.0f), ((this.h - this.py) - f12) + AndroidUtilities.dp(14.0f), this.countTextPaint);
                                min7 = i22;
                                j12 = 59000;
                            }
                            canvas.restore();
                        }
                    }
                    f25 = this.loopProgress.set(0.0f);
                    float contentHeight = ((this.h - getContentHeight()) + this.py) - AndroidUtilities.dpf2(2.3f);
                    float dpf24 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
                    if (f25 > 0.0f) {
                        long j13 = this.loopProgressFrom;
                        if (j13 == -1) {
                            Track track11 = this.videoTrack;
                            if (track11 != null) {
                                f28 = track11.duration * track11.right;
                            } else {
                                Track track12 = this.collageMain;
                                if (track12 != null) {
                                    f28 = track12.duration * (track12.right - track12.left);
                                } else {
                                    if (this.hasRound) {
                                        f26 = this.roundDuration;
                                        f27 = this.roundRight;
                                    } else {
                                        f26 = this.audioDuration;
                                        f27 = this.audioRight;
                                    }
                                    j13 = (long) (f26 * f27);
                                }
                            }
                            j13 = (long) f28;
                        }
                        drawProgress(canvas, contentHeight, dpf24, j13, f25 * max3);
                    }
                    drawProgress(canvas, contentHeight, dpf24, this.progress, (1.0f - f25) * max3);
                }
                if (z) {
                    canvas.restore();
                }
            }
            f22 = f19;
            if (f124 <= d) {
            }
            if (this.videoTrack == null) {
            }
            f23 = f18;
            f24 = 1.0f;
            drawRegion(canvas, paint3, f148, f147, f153, f154, f24 * max3);
            track3 = this.videoTrack;
            if (track3 == null) {
            }
            if (this.collageMain != null) {
                Track track92 = this.collageMain;
                RectF rectF162 = track92.bounds;
                float f1612 = rectF162.top;
                float f1622 = rectF162.bottom;
                float f1632 = this.ph + this.px;
                float f1642 = track92.offset;
                float f1652 = track92.left;
                float f1662 = track92.duration;
                float f1672 = this.scroll;
                float f1682 = this.sw;
                drawRegion(canvas, paint3, f1612, f1622, (((((f1652 * f1662) + f1642) - f1672) / f151) * f1682) + f1632, f1632 + ((((f1642 + (track92.right * f1662)) - f1672) / f151) * f1682), 0.8f);
            }
            if (this.maxCount > 1) {
                float f1692 = track4.duration;
                float f1702 = track4.right;
                float f1712 = track4.left;
                j2 = (long) ((f1702 - f1712) * f1692);
                if (j2 > 68999) {
                }
            }
            f25 = this.loopProgress.set(0.0f);
            float contentHeight2 = ((this.h - getContentHeight()) + this.py) - AndroidUtilities.dpf2(2.3f);
            float dpf242 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
            if (f25 > 0.0f) {
            }
            drawProgress(canvas, contentHeight2, dpf242, this.progress, (1.0f - f25) * max3);
            if (z) {
            }
        } else {
            j = min;
        }
        if (this.dragged) {
            float f180 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float f181 = this.dragSpeed;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / this.sw) * j * f180 * f181);
            if (this.isCover) {
                this.dragSpeed = f181 + (f180 * 0.25f);
            }
            int i23 = this.pressHandle;
            if (i23 == 4 && (track2 = this.videoTrack) != null) {
                float f182 = track2.left;
                long j14 = this.scroll;
                long j15 = track2.duration;
                float f183 = j15;
                if (f182 < j14 / f183) {
                    i2 = -1;
                } else if (track2.right > (j14 + j) / f183) {
                    i2 = 1;
                } else {
                    this.dragSpeed = 1.0f;
                    i2 = 0;
                }
                long j16 = i2 * dp2;
                this.scroll = Utilities.clamp(j14 + j16, j15 - j, 0L);
                this.progress += j16;
                Track track13 = this.videoTrack;
                float f184 = (r2 - j14) / track13.duration;
                if (f184 > 0.0f) {
                    f = 1.0f;
                    max2 = Math.min(1.0f - track13.right, f184);
                } else {
                    f = 1.0f;
                    max2 = Math.max(0.0f - track13.left, f184);
                }
                Track track14 = this.videoTrack;
                track14.left = Utilities.clamp(track14.left + max2, f, 0.0f);
                Track track15 = this.videoTrack;
                track15.right = Utilities.clamp(track15.right + max2, f, 0.0f);
                TimelineDelegate timelineDelegate = this.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onVideoLeftChange(false, this.videoTrack.left);
                    this.delegate.onVideoRightChange(false, this.videoTrack.right);
                }
                invalidate();
            } else if (i23 == 8) {
                float f185 = this.audioLeft;
                long j17 = this.audioOffset;
                float f186 = 100 + (-j17);
                long j18 = this.audioDuration;
                float f187 = j18;
                if (f185 < f186 / f187) {
                    i = -1;
                } else if (this.audioRight >= ((r6 + j) - 100) / f187) {
                    i = 1;
                } else {
                    this.dragSpeed = 1.0f;
                    i = 0;
                }
                if (i != 0) {
                    if (this.audioSelected && (track = this.videoTrack) != null) {
                        long j19 = j17 - (i * dp2);
                        float f188 = track.right;
                        float f189 = track.duration;
                        this.audioOffset = Utilities.clamp(j19, (long) ((f188 * f189) - (f185 * f187)), (long) ((track.left * f189) - (this.audioRight * f187)));
                    } else if (this.roundSelected && this.hasRound) {
                        long j20 = j17 - (i * dp2);
                        float f190 = this.roundRight;
                        float f191 = this.roundDuration;
                        this.audioOffset = Utilities.clamp(j20, (long) ((f190 * f191) - (f185 * f187)), (long) ((this.roundLeft * f191) - (this.audioRight * f187)));
                    } else {
                        this.audioOffset = Utilities.clamp(j17 - (i * dp2), 0L, -(j18 - Math.min(getBaseDuration(), getMaxScrollDuration())));
                    }
                    float f192 = (-(this.audioOffset - j17)) / this.audioDuration;
                    if (f192 > 0.0f) {
                        max = Math.min(1.0f - this.audioRight, f192);
                    } else {
                        max = Math.max(0.0f - this.audioLeft, f192);
                    }
                    if (this.videoTrack == null) {
                        float f193 = this.progress;
                        float f194 = this.audioDuration;
                        this.progress = (long) Utilities.clamp(f193 + (max * f194), f194, 0.0f);
                    }
                    this.audioLeft = Utilities.clamp(this.audioLeft + max, 1.0f, 0.0f);
                    this.audioRight = Utilities.clamp(this.audioRight + max, 1.0f, 0.0f);
                    TimelineDelegate timelineDelegate2 = this.delegate;
                    if (timelineDelegate2 != null) {
                        timelineDelegate2.onAudioLeftChange(this.audioLeft);
                        this.delegate.onAudioRightChange(this.audioRight);
                        this.delegate.onProgressChange(this.progress, false);
                    }
                    invalidate();
                } else {
                    this.dragSpeed = 1.0f;
                }
            } else {
                this.dragSpeed = 1.0f;
            }
        } else {
            this.dragSpeed = 1.0f;
        }
        int contentHeight3 = getContentHeight();
        if (this.lastHeight != contentHeight3) {
            this.lastHeight = contentHeight3;
            Runnable runnable = this.onHeightChange;
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
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
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
                    TimelineView.VideoThumbsLoader.this.lambda$retrieveFrame$1(bitmap);
                }
            });
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
                        TimelineView.AudioWaveformLoader.this.lambda$run$0((short[]) obj, ((Integer) obj2).intValue());
                    }
                });
            } else {
                Utilities.phoneBookQueue.postRunnable(new TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fa A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            MediaCodec.BufferInfo bufferInfo;
            short[] sArr;
            long j;
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
                short[] sArr2 = new short[32];
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
                            sArr = sArr2;
                            j = 2500;
                            bufferInfo = bufferInfo2;
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            z = true;
                        } else {
                            bufferInfo = bufferInfo2;
                            sArr = sArr2;
                            j = 2500;
                            createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.extractor.getSampleTime(), 0);
                            this.extractor.advance();
                        }
                    } else {
                        bufferInfo = bufferInfo2;
                        sArr = sArr2;
                        j = 2500;
                    }
                    if (i >= 0) {
                        createDecoderByType.getOutputBuffer(i).position(0);
                    }
                    MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                    i = createDecoderByType.dequeueOutputBuffer(bufferInfo3, j);
                    while (i != -1 && !z) {
                        if (i >= 0) {
                            ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i);
                            if (outputBuffer != null && bufferInfo3.size > 0) {
                                int i5 = i4;
                                final short[] sArr3 = sArr;
                                while (outputBuffer.remaining() > 0) {
                                    short s3 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                    if (i5 >= round) {
                                        sArr3[i2 - i3] = s2;
                                        i2++;
                                        final int i6 = i2 - i3;
                                        if (i6 < sArr3.length && i2 < this.count) {
                                            sArr = sArr3;
                                            if (i2 < this.data.length) {
                                                i4 = 0;
                                                s2 = 0;
                                                break;
                                            } else {
                                                sArr3 = sArr;
                                                i5 = 0;
                                                s = 0;
                                            }
                                        }
                                        short[] sArr4 = new short[sArr3.length];
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Stories.recorder.TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda2
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                TimelineView.AudioWaveformLoader.this.lambda$run$0(sArr3, i6);
                                            }
                                        });
                                        sArr = sArr4;
                                        i3 = i2;
                                        if (i2 < this.data.length) {
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
                                sArr = sArr3;
                            }
                            createDecoderByType.releaseOutputBuffer(i, false);
                            if ((bufferInfo3.flags & 4) != 0) {
                                sArr2 = sArr;
                                z = true;
                                break;
                            }
                        } else if (i == -3) {
                            createDecoderByType.getOutputBuffers();
                        }
                        i = createDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                    }
                    sArr2 = sArr;
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
