package org.telegram.ui.Charts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.ChartPickerDelegate;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.ChartBottomSignatureData;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LegendSignatureView;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;
import org.telegram.ui.Components.CubicBezierInterpolator;
/* loaded from: classes4.dex */
public abstract class BaseChartView<T extends ChartData, L extends LineViewData> extends View implements ChartPickerDelegate.Listener {
    protected static final boolean ANIMATE_PICKER_SIZES;
    public static FastOutSlowInInterpolator INTERPOLATOR;
    public static final boolean USE_LINES;
    private final int ANIM_DURATION;
    ValueAnimator alphaAnimator;
    ValueAnimator alphaBottomAnimator;
    public boolean animateLegentTo;
    float animateToMaxHeight;
    float animateToMinHeight;
    protected float animatedToPickerMaxHeight;
    protected float animatedToPickerMinHeight;
    private Bitmap bottomChartBitmap;
    private Canvas bottomChartCanvas;
    ArrayList<ChartBottomSignatureData> bottomSignatureDate;
    protected int bottomSignatureOffset;
    Paint bottomSignaturePaint;
    float bottomSignaturePaintAlpha;
    protected boolean canCaptureChartSelection;
    long capturedTime;
    int capturedX;
    int capturedY;
    int chartActiveLineAlpha;
    public RectF chartArea;
    int chartBottom;
    protected boolean chartCaptured;
    T chartData;
    public float chartEnd;
    public float chartFullWidth;
    ChartHeaderView chartHeaderView;
    public float chartStart;
    public float chartWidth;
    ChartBottomSignatureData currentBottomSignatures;
    public float currentMaxHeight;
    public float currentMinHeight;
    protected DateSelectionListener dateSelectionListener;
    protected boolean drawPointOnSelection;
    Paint emptyPaint;
    public boolean enabled;
    int endXIndex;
    private Rect exclusionRect;
    private List<Rect> exclusionRects;
    private ValueAnimator.AnimatorUpdateListener heightUpdateListener;
    int hintLinePaintAlpha;
    ArrayList<ChartHorizontalLinesData> horizontalLines;
    boolean invalidatePickerChart;
    boolean landscape;
    int lastH;
    long lastTime;
    int lastW;
    int lastX;
    int lastY;
    public boolean legendShowing;
    public LegendSignatureView legendSignatureView;
    Paint linePaint;
    public ArrayList<L> lines;
    Animator maxValueAnimator;
    private ValueAnimator.AnimatorUpdateListener minHeightUpdateListener;
    private float minMaxUpdateStep;
    Path pathTmp;
    Animator pickerAnimator;
    public ChartPickerDelegate pickerDelegate;
    private ValueAnimator.AnimatorUpdateListener pickerHeightUpdateListener;
    protected float pickerMaxHeight;
    protected float pickerMinHeight;
    private ValueAnimator.AnimatorUpdateListener pickerMinHeightUpdateListener;
    Rect pickerRect;
    Paint pickerSelectorPaint;
    public float pickerWidth;
    public int pikerHeight;
    boolean postTransition;
    protected Theme.ResourcesProvider resourcesProvider;
    Paint ripplePaint;
    protected float selectedCoordinate;
    protected int selectedIndex;
    Paint selectedLinePaint;
    public float selectionA;
    ValueAnimator selectionAnimator;
    private ValueAnimator.AnimatorUpdateListener selectionAnimatorListener;
    Paint selectionBackgroundPaint;
    private Animator.AnimatorListener selectorAnimatorEndListener;
    public SharedUiComponents sharedUiComponents;
    TextPaint signaturePaint;
    TextPaint signaturePaint2;
    float signaturePaintAlpha;
    private float startFromMax;
    private float startFromMaxH;
    private float startFromMin;
    private float startFromMinH;
    int startXIndex;
    boolean superDraw;
    float thresholdMaxHeight;
    protected int tmpI;
    protected int tmpN;
    private final int touchSlop;
    public int transitionMode;
    public TransitionParams transitionParams;
    Paint unactiveBottomChartPaint;
    boolean useAlphaSignature;
    protected boolean useMinHeight;
    VibrationEffect vibrationEffect;
    Paint whiteLinePaint;
    public static final float HORIZONTAL_PADDING = AndroidUtilities.dpf2(16.0f);
    private static final float SELECTED_LINE_WIDTH = AndroidUtilities.dpf2(1.5f);
    public static final float SIGNATURE_TEXT_SIZE = AndroidUtilities.dpf2(12.0f);
    public static final int SIGNATURE_TEXT_HEIGHT = AndroidUtilities.dp(18.0f);
    private static final int BOTTOM_SIGNATURE_TEXT_HEIGHT = AndroidUtilities.dp(14.0f);
    public static final int BOTTOM_SIGNATURE_START_ALPHA = AndroidUtilities.dp(10.0f);
    protected static final int PICKER_PADDING = AndroidUtilities.dp(16.0f);
    private static final int PICKER_CAPTURE_WIDTH = AndroidUtilities.dp(24.0f);
    private static final int LANDSCAPE_END_PADDING = AndroidUtilities.dp(16.0f);
    private static final int BOTTOM_SIGNATURE_OFFSET = AndroidUtilities.dp(10.0f);
    private static final int DP_12 = AndroidUtilities.dp(12.0f);
    private static final int DP_8 = AndroidUtilities.dp(8.0f);
    private static final int DP_6 = AndroidUtilities.dp(6.0f);
    private static final int DP_5 = AndroidUtilities.dp(5.0f);
    private static final int DP_2 = AndroidUtilities.dp(2.0f);
    private static final int DP_1 = AndroidUtilities.dp(1.0f);

    /* loaded from: classes4.dex */
    public interface DateSelectionListener {
        void onDateSelected(long j);
    }

    public abstract L createLineViewData(ChartData.Line line);

    protected void drawChart(Canvas canvas) {
    }

    protected void drawPickerChart(Canvas canvas) {
    }

    public void fillTransitionParams(TransitionParams transitionParams) {
    }

    protected void onActionUp() {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        USE_LINES = i < 28;
        ANIMATE_PICKER_SIZES = i > 21;
        INTERPOLATOR = new FastOutSlowInInterpolator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(ValueAnimator valueAnimator) {
        this.currentMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(ValueAnimator valueAnimator) {
        this.currentMinHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public BaseChartView(Context context) {
        this(context, null);
    }

    public BaseChartView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.horizontalLines = new ArrayList<>(10);
        this.bottomSignatureDate = new ArrayList<>(25);
        this.lines = new ArrayList<>();
        this.ANIM_DURATION = 400;
        this.drawPointOnSelection = true;
        this.currentMaxHeight = 250.0f;
        this.currentMinHeight = 0.0f;
        this.animateToMaxHeight = 0.0f;
        this.animateToMinHeight = 0.0f;
        this.thresholdMaxHeight = 0.0f;
        this.invalidatePickerChart = true;
        this.landscape = false;
        this.enabled = true;
        this.emptyPaint = new Paint();
        this.linePaint = new Paint();
        this.selectedLinePaint = new Paint();
        this.signaturePaint = new TextPaint(1);
        this.signaturePaint2 = new TextPaint(1);
        this.bottomSignaturePaint = new TextPaint(1);
        this.pickerSelectorPaint = new Paint(1);
        this.unactiveBottomChartPaint = new Paint();
        this.selectionBackgroundPaint = new Paint(1);
        this.ripplePaint = new Paint(1);
        this.whiteLinePaint = new Paint(1);
        this.pickerRect = new Rect();
        this.pathTmp = new Path();
        this.postTransition = false;
        this.pickerDelegate = new ChartPickerDelegate(this);
        this.chartCaptured = false;
        this.selectedIndex = -1;
        this.selectedCoordinate = -1.0f;
        this.legendShowing = false;
        this.selectionA = 0.0f;
        this.superDraw = false;
        this.useAlphaSignature = false;
        this.transitionMode = 0;
        this.pikerHeight = AndroidUtilities.dp(46.0f);
        this.chartArea = new RectF();
        this.pickerHeightUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Charts.BaseChartView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.this.pickerMaxHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseChartView baseChartView = BaseChartView.this;
                baseChartView.invalidatePickerChart = true;
                baseChartView.invalidate();
            }
        };
        this.pickerMinHeightUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Charts.BaseChartView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.this.pickerMinHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseChartView baseChartView = BaseChartView.this;
                baseChartView.invalidatePickerChart = true;
                baseChartView.invalidate();
            }
        };
        this.heightUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Charts.BaseChartView$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.this.lambda$new$0(valueAnimator);
            }
        };
        this.minHeightUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Charts.BaseChartView$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.this.lambda$new$1(valueAnimator);
            }
        };
        this.selectionAnimatorListener = new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Charts.BaseChartView.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseChartView.this.selectionA = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseChartView baseChartView = BaseChartView.this;
                baseChartView.legendSignatureView.setAlpha(baseChartView.selectionA);
                BaseChartView.this.invalidate();
            }
        };
        this.selectorAnimatorEndListener = new AnimatorListenerAdapter() { // from class: org.telegram.ui.Charts.BaseChartView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                BaseChartView baseChartView = BaseChartView.this;
                if (!baseChartView.animateLegentTo) {
                    baseChartView.legendShowing = false;
                    baseChartView.legendSignatureView.setVisibility(8);
                    BaseChartView.this.invalidate();
                }
                BaseChartView.this.postTransition = false;
            }
        };
        this.useMinHeight = false;
        this.lastW = 0;
        this.lastH = 0;
        this.exclusionRect = new Rect();
        ArrayList arrayList = new ArrayList();
        this.exclusionRects = arrayList;
        arrayList.add(this.exclusionRect);
        this.lastTime = 0L;
        this.animateLegentTo = false;
        this.resourcesProvider = resourcesProvider;
        init();
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init() {
        this.linePaint.setStrokeWidth(1.0f);
        this.selectedLinePaint.setStrokeWidth(SELECTED_LINE_WIDTH);
        TextPaint textPaint = this.signaturePaint;
        float f = SIGNATURE_TEXT_SIZE;
        textPaint.setTextSize(f);
        this.signaturePaint2.setTextSize(f);
        this.signaturePaint2.setTextAlign(Paint.Align.RIGHT);
        this.bottomSignaturePaint.setTextSize(f);
        this.bottomSignaturePaint.setTextAlign(Paint.Align.CENTER);
        this.selectionBackgroundPaint.setStrokeWidth(AndroidUtilities.dpf2(6.0f));
        Paint paint = this.selectionBackgroundPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        setLayerType(2, null);
        setWillNotDraw(false);
        LegendSignatureView createLegendView = createLegendView();
        this.legendSignatureView = createLegendView;
        createLegendView.setVisibility(8);
        this.whiteLinePaint.setColor(-1);
        this.whiteLinePaint.setStrokeWidth(AndroidUtilities.dpf2(3.0f));
        this.whiteLinePaint.setStrokeCap(cap);
        updateColors();
    }

    protected LegendSignatureView createLegendView() {
        return new LegendSignatureView(getContext(), this.resourcesProvider);
    }

    public void updateColors() {
        this.signaturePaint.setColor(Theme.getColor(this.useAlphaSignature ? Theme.key_statisticChartSignatureAlpha : Theme.key_statisticChartSignature, this.resourcesProvider));
        this.signaturePaint2.setColor(Theme.getColor(this.useAlphaSignature ? Theme.key_statisticChartSignatureAlpha : Theme.key_statisticChartSignature, this.resourcesProvider));
        this.bottomSignaturePaint.setColor(Theme.getColor(Theme.key_statisticChartSignature, this.resourcesProvider));
        this.linePaint.setColor(Theme.getColor(Theme.key_statisticChartHintLine, this.resourcesProvider));
        this.selectedLinePaint.setColor(Theme.getColor(Theme.key_statisticChartActiveLine, this.resourcesProvider));
        this.pickerSelectorPaint.setColor(Theme.getColor(Theme.key_statisticChartActivePickerChart, this.resourcesProvider));
        this.unactiveBottomChartPaint.setColor(Theme.getColor(Theme.key_statisticChartInactivePickerChart, this.resourcesProvider));
        this.selectionBackgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
        this.ripplePaint.setColor(Theme.getColor(Theme.key_statisticChartRipple, this.resourcesProvider));
        this.legendSignatureView.recolor();
        this.hintLinePaintAlpha = this.linePaint.getAlpha();
        this.chartActiveLineAlpha = this.selectedLinePaint.getAlpha();
        this.signaturePaintAlpha = this.signaturePaint.getAlpha() / 255.0f;
        this.bottomSignaturePaintAlpha = this.bottomSignaturePaint.getAlpha() / 255.0f;
        Iterator<L> it = this.lines.iterator();
        while (it.hasNext()) {
            it.next().updateColors();
        }
        if (this.legendShowing) {
            int i = this.selectedIndex;
            T t = this.chartData;
            long[] jArr = t.x;
            if (i < jArr.length) {
                this.legendSignatureView.setData(i, jArr[i], this.lines, false, t.yTooltipFormatter, t.yRate);
            }
        }
        this.invalidatePickerChart = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.landscape) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.displaySize.y - AndroidUtilities.dp(56.0f));
        }
        if (getMeasuredWidth() != this.lastW || getMeasuredHeight() != this.lastH) {
            this.lastW = getMeasuredWidth();
            this.lastH = getMeasuredHeight();
            float f = HORIZONTAL_PADDING;
            float f2 = 2.0f * f;
            this.bottomChartBitmap = Bitmap.createBitmap((int) (getMeasuredWidth() - f2), this.pikerHeight, Bitmap.Config.ARGB_4444);
            this.bottomChartCanvas = new Canvas(this.bottomChartBitmap);
            this.sharedUiComponents.getPickerMaskBitmap(this.pikerHeight, (int) (getMeasuredWidth() - f2));
            measureSizes();
            if (this.legendShowing) {
                moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - f);
            }
            onPickerDataChanged(false, true, false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect = this.exclusionRect;
            int measuredHeight = getMeasuredHeight();
            int i3 = PICKER_PADDING;
            rect.set(0, measuredHeight - ((this.pikerHeight + i3) + i3), getMeasuredWidth(), getMeasuredHeight());
            setSystemGestureExclusionRects(this.exclusionRects);
        }
    }

    private void measureSizes() {
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            return;
        }
        float f = HORIZONTAL_PADDING;
        this.pickerWidth = getMeasuredWidth() - (2.0f * f);
        this.chartStart = f;
        float measuredWidth = getMeasuredWidth() - (this.landscape ? LANDSCAPE_END_PADDING : f);
        this.chartEnd = measuredWidth;
        float f2 = measuredWidth - this.chartStart;
        this.chartWidth = f2;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        this.chartFullWidth = f2 / (chartPickerDelegate.pickerEnd - chartPickerDelegate.pickerStart);
        updateLineSignature();
        this.chartBottom = AndroidUtilities.dp(100.0f);
        this.chartArea.set(this.chartStart - f, 0.0f, this.chartEnd + f, getMeasuredHeight() - this.chartBottom);
        if (this.chartData != null) {
            this.bottomSignatureOffset = (int) (AndroidUtilities.dp(20.0f) / (this.pickerWidth / this.chartData.x.length));
        }
        measureHeightThreshold();
    }

    private void measureHeightThreshold() {
        int measuredHeight = getMeasuredHeight() - this.chartBottom;
        float f = this.animateToMaxHeight;
        if (f == 0.0f || measuredHeight == 0) {
            return;
        }
        this.thresholdMaxHeight = (f / measuredHeight) * SIGNATURE_TEXT_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.superDraw) {
            super.onDraw(canvas);
            return;
        }
        tick();
        int save = canvas.save();
        canvas.clipRect(0.0f, this.chartArea.top, getMeasuredWidth(), this.chartArea.bottom);
        drawBottomLine(canvas);
        this.tmpN = this.horizontalLines.size();
        int i = 0;
        this.tmpI = 0;
        while (true) {
            int i2 = this.tmpI;
            if (i2 >= this.tmpN) {
                break;
            }
            drawHorizontalLines(canvas, this.horizontalLines.get(i2));
            this.tmpI++;
        }
        drawChart(canvas);
        while (true) {
            this.tmpI = i;
            int i3 = this.tmpI;
            if (i3 < this.tmpN) {
                drawSignaturesToHorizontalLines(canvas, this.horizontalLines.get(i3));
                i = this.tmpI + 1;
            } else {
                canvas.restoreToCount(save);
                drawBottomSignature(canvas);
                drawPicker(canvas);
                drawSelection(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void tick() {
        float f = this.minMaxUpdateStep;
        if (f == 0.0f) {
            return;
        }
        float f2 = this.currentMaxHeight;
        float f3 = this.animateToMaxHeight;
        if (f2 != f3) {
            float f4 = this.startFromMax + f;
            this.startFromMax = f4;
            if (f4 > 1.0f) {
                this.startFromMax = 1.0f;
                this.currentMaxHeight = f3;
            } else {
                float f5 = this.startFromMaxH;
                this.currentMaxHeight = f5 + ((f3 - f5) * CubicBezierInterpolator.EASE_OUT.getInterpolation(f4));
            }
            invalidate();
        }
        if (this.useMinHeight) {
            float f6 = this.currentMinHeight;
            float f7 = this.animateToMinHeight;
            if (f6 != f7) {
                float f8 = this.startFromMin + this.minMaxUpdateStep;
                this.startFromMin = f8;
                if (f8 > 1.0f) {
                    this.startFromMin = 1.0f;
                    this.currentMinHeight = f7;
                } else {
                    float f9 = this.startFromMinH;
                    this.currentMinHeight = f9 + ((f7 - f9) * CubicBezierInterpolator.EASE_OUT.getInterpolation(f8));
                }
                invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void drawBottomSignature(Canvas canvas) {
        float f;
        if (this.chartData == null) {
            return;
        }
        this.tmpN = this.bottomSignatureDate.size();
        int i = this.transitionMode;
        if (i == 2) {
            f = 1.0f - this.transitionParams.progress;
        } else if (i == 1) {
            f = this.transitionParams.progress;
        } else {
            f = i == 3 ? this.transitionParams.progress : 1.0f;
        }
        this.tmpI = 0;
        while (true) {
            int i2 = this.tmpI;
            if (i2 >= this.tmpN) {
                return;
            }
            int i3 = this.bottomSignatureDate.get(i2).alpha;
            int i4 = this.bottomSignatureDate.get(this.tmpI).step;
            if (i4 == 0) {
                i4 = 1;
            }
            int i5 = this.startXIndex - this.bottomSignatureOffset;
            while (i5 % i4 != 0) {
                i5--;
            }
            int i6 = this.endXIndex - this.bottomSignatureOffset;
            while (true) {
                if (i6 % i4 == 0 && i6 >= this.chartData.x.length - 1) {
                    break;
                }
                i6++;
            }
            int i7 = this.bottomSignatureOffset;
            int i8 = i6 + i7;
            float f2 = (this.chartFullWidth * this.pickerDelegate.pickerStart) - HORIZONTAL_PADDING;
            for (int i9 = i5 + i7; i9 < i8; i9 += i4) {
                if (i9 >= 0) {
                    long[] jArr = this.chartData.x;
                    if (i9 < jArr.length - 1) {
                        long j = jArr[i9];
                        long j2 = jArr[0];
                        float f3 = ((((float) (j - j2)) / ((float) (jArr[jArr.length - 1] - j2))) * this.chartFullWidth) - f2;
                        float f4 = f3 - BOTTOM_SIGNATURE_OFFSET;
                        if (f4 > 0.0f) {
                            float f5 = this.chartWidth;
                            float f6 = HORIZONTAL_PADDING;
                            if (f4 <= f5 + f6) {
                                float f7 = BOTTOM_SIGNATURE_START_ALPHA;
                                if (f4 < f7) {
                                    this.bottomSignaturePaint.setAlpha((int) (i3 * (1.0f - ((f7 - f4) / f7)) * this.bottomSignaturePaintAlpha * f));
                                } else if (f4 > f5) {
                                    this.bottomSignaturePaint.setAlpha((int) (i3 * (1.0f - ((f4 - f5) / f6)) * this.bottomSignaturePaintAlpha * f));
                                } else {
                                    this.bottomSignaturePaint.setAlpha((int) (i3 * this.bottomSignaturePaintAlpha * f));
                                }
                                canvas.drawText(this.chartData.getDayString(i9), f3, (getMeasuredHeight() - this.chartBottom) + BOTTOM_SIGNATURE_TEXT_HEIGHT + AndroidUtilities.dp(3.0f), this.bottomSignaturePaint);
                            }
                        }
                    }
                }
            }
            this.tmpI++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void drawBottomLine(Canvas canvas) {
        int measuredHeight;
        if (this.chartData == null) {
            return;
        }
        int i = this.transitionMode;
        float f = 1.0f;
        if (i == 2) {
            f = 1.0f - this.transitionParams.progress;
        } else if (i == 1) {
            f = this.transitionParams.progress;
        } else if (i == 3) {
            f = this.transitionParams.progress;
        }
        this.linePaint.setAlpha((int) (this.hintLinePaintAlpha * f));
        this.signaturePaint.setAlpha((int) (this.signaturePaintAlpha * 255.0f * f));
        this.signaturePaint2.setAlpha((int) (this.signaturePaintAlpha * 255.0f * f));
        int textSize = (int) (SIGNATURE_TEXT_HEIGHT - this.signaturePaint.getTextSize());
        float measuredHeight2 = (getMeasuredHeight() - this.chartBottom) - 1;
        canvas.drawLine(this.chartStart, measuredHeight2, this.chartEnd, measuredHeight2, this.linePaint);
        if (this.useMinHeight) {
            return;
        }
        canvas.drawText("0", HORIZONTAL_PADDING, measuredHeight - textSize, this.signaturePaint);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void drawSelection(Canvas canvas) {
        T t;
        int i = this.selectedIndex;
        if (i < 0 || !this.legendShowing || (t = this.chartData) == null) {
            return;
        }
        int i2 = (int) (this.chartActiveLineAlpha * this.selectionA);
        float f = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f2 = chartPickerDelegate.pickerEnd;
        float f3 = chartPickerDelegate.pickerStart;
        float f4 = f / (f2 - f3);
        float f5 = (f3 * f4) - HORIZONTAL_PADDING;
        float[] fArr = t.xPercentage;
        if (i >= fArr.length) {
            return;
        }
        float f6 = (fArr[i] * f4) - f5;
        this.selectedLinePaint.setAlpha(i2);
        canvas.drawLine(f6, 0.0f, f6, this.chartArea.bottom, this.selectedLinePaint);
        if (!this.drawPointOnSelection) {
            return;
        }
        this.tmpN = this.lines.size();
        int i3 = 0;
        while (true) {
            this.tmpI = i3;
            int i4 = this.tmpI;
            if (i4 >= this.tmpN) {
                return;
            }
            L l = this.lines.get(i4);
            if (l.enabled || l.alpha != 0.0f) {
                float f7 = (float) l.line.y[this.selectedIndex];
                float f8 = this.currentMinHeight;
                float measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((f7 - f8) / (this.currentMaxHeight - f8)) * ((getMeasuredHeight() - this.chartBottom) - SIGNATURE_TEXT_HEIGHT));
                l.selectionPaint.setAlpha((int) (l.alpha * 255.0f * this.selectionA));
                this.selectionBackgroundPaint.setAlpha((int) (l.alpha * 255.0f * this.selectionA));
                canvas.drawPoint(f6, measuredHeight, l.selectionPaint);
                canvas.drawPoint(f6, measuredHeight, this.selectionBackgroundPaint);
            }
            i3 = this.tmpI + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085 A[LOOP:0: B:17:0x0083->B:18:0x0085, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
        float f;
        int i;
        int i2;
        long[] jArr = chartHorizontalLinesData.values;
        int length = jArr.length;
        float f2 = 1.0f;
        if (length > 2) {
            float f3 = ((float) (jArr[1] - jArr[0])) / (this.currentMaxHeight - this.currentMinHeight);
            if (f3 < 0.1d) {
                f = f3 / 0.1f;
                i = this.transitionMode;
                if (i != 2) {
                    f2 = 1.0f - this.transitionParams.progress;
                } else if (i == 1) {
                    f2 = this.transitionParams.progress;
                } else if (i == 3) {
                    f2 = this.transitionParams.progress;
                }
                this.linePaint.setAlpha((int) (chartHorizontalLinesData.alpha * (this.hintLinePaintAlpha / 255.0f) * f2 * f));
                this.signaturePaint.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
                this.signaturePaint2.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
                int measuredHeight = (getMeasuredHeight() - this.chartBottom) - SIGNATURE_TEXT_HEIGHT;
                for (i2 = !this.useMinHeight ? 1 : 0; i2 < length; i2++) {
                    float f4 = (float) chartHorizontalLinesData.values[i2];
                    float f5 = this.currentMinHeight;
                    int measuredHeight2 = (int) ((getMeasuredHeight() - this.chartBottom) - (measuredHeight * ((f4 - f5) / (this.currentMaxHeight - f5))));
                    canvas.drawRect(this.chartStart, measuredHeight2, this.chartEnd, measuredHeight2 + 1, this.linePaint);
                }
            }
        }
        f = 1.0f;
        i = this.transitionMode;
        if (i != 2) {
        }
        this.linePaint.setAlpha((int) (chartHorizontalLinesData.alpha * (this.hintLinePaintAlpha / 255.0f) * f2 * f));
        this.signaturePaint.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
        this.signaturePaint2.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
        int measuredHeight3 = (getMeasuredHeight() - this.chartBottom) - SIGNATURE_TEXT_HEIGHT;
        while (i2 < length) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawSignaturesToHorizontalLines(Canvas canvas, ChartHorizontalLinesData chartHorizontalLinesData) {
        float f;
        int i;
        int i2;
        long[] jArr = chartHorizontalLinesData.values;
        int length = jArr.length;
        float f2 = 1.0f;
        if (length > 2) {
            float f3 = ((float) (jArr[1] - jArr[0])) / (this.currentMaxHeight - this.currentMinHeight);
            if (f3 < 0.1d) {
                f = f3 / 0.1f;
                i = this.transitionMode;
                if (i != 2) {
                    f2 = 1.0f - this.transitionParams.progress;
                } else if (i == 1) {
                    f2 = this.transitionParams.progress;
                } else if (i == 3) {
                    f2 = this.transitionParams.progress;
                }
                this.linePaint.setAlpha((int) (chartHorizontalLinesData.alpha * (this.hintLinePaintAlpha / 255.0f) * f2 * f));
                this.signaturePaint.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
                this.signaturePaint2.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
                int measuredHeight = getMeasuredHeight() - this.chartBottom;
                int i3 = SIGNATURE_TEXT_HEIGHT;
                int i4 = measuredHeight - i3;
                int textSize = (int) (i3 - this.signaturePaint.getTextSize());
                for (i2 = 1 ^ (this.useMinHeight ? 1 : 0); i2 < length; i2++) {
                    float f4 = (float) chartHorizontalLinesData.values[i2];
                    float f5 = this.currentMinHeight;
                    float f6 = HORIZONTAL_PADDING;
                    float measuredHeight2 = ((int) ((getMeasuredHeight() - this.chartBottom) - (i4 * ((f4 - f5) / (this.currentMaxHeight - f5))))) - textSize;
                    chartHorizontalLinesData.drawText(canvas, 0, i2, f6, measuredHeight2, this.signaturePaint);
                    if (chartHorizontalLinesData.valuesStr2 != null) {
                        chartHorizontalLinesData.drawText(canvas, 1, i2, getMeasuredWidth() - f6, measuredHeight2, this.signaturePaint2);
                    }
                }
            }
        }
        f = 1.0f;
        i = this.transitionMode;
        if (i != 2) {
        }
        this.linePaint.setAlpha((int) (chartHorizontalLinesData.alpha * (this.hintLinePaintAlpha / 255.0f) * f2 * f));
        this.signaturePaint.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
        this.signaturePaint2.setAlpha((int) (chartHorizontalLinesData.alpha * this.signaturePaintAlpha * f2 * f));
        int measuredHeight3 = getMeasuredHeight() - this.chartBottom;
        int i32 = SIGNATURE_TEXT_HEIGHT;
        int i42 = measuredHeight3 - i32;
        int textSize2 = (int) (i32 - this.signaturePaint.getTextSize());
        while (i2 < length) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drawPicker(Canvas canvas) {
        float f;
        int i;
        int i2;
        Rect rect;
        int i3;
        Rect rect2;
        int i4;
        Rect rect3;
        int i5;
        Rect rect4;
        boolean z;
        ValueAnimator valueAnimator;
        TransitionParams transitionParams;
        if (this.chartData == null) {
            return;
        }
        this.pickerDelegate.pickerWidth = this.pickerWidth;
        int measuredHeight = getMeasuredHeight();
        int i6 = PICKER_PADDING;
        int i7 = measuredHeight - i6;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i6;
        float f2 = HORIZONTAL_PADDING;
        float f3 = this.pickerWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        int i8 = (int) ((chartPickerDelegate.pickerStart * f3) + f2);
        int i9 = (int) ((chartPickerDelegate.pickerEnd * f3) + f2);
        int i10 = this.transitionMode;
        if (i10 == 1) {
            float f4 = 1.0f - this.transitionParams.progress;
            i8 = (int) (i8 + ((((int) ((transitionParams.pickerStartOut * f3) + f2)) - i8) * f4));
            i9 = (int) (i9 + ((((int) ((f3 * transitionParams.pickerEndOut) + f2)) - i9) * f4));
        } else if (i10 == 3) {
            f = this.transitionParams.progress;
            i = i9;
            i2 = i8;
            if (this.chartData == null) {
                if (i10 == 0) {
                    for (int i11 = 0; i11 < this.lines.size(); i11++) {
                        L l = this.lines.get(i11);
                        ValueAnimator valueAnimator2 = l.animatorIn;
                        if ((valueAnimator2 != null && valueAnimator2.isRunning()) || ((valueAnimator = l.animatorOut) != null && valueAnimator.isRunning())) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    canvas.save();
                    float f5 = HORIZONTAL_PADDING;
                    int measuredHeight3 = getMeasuredHeight();
                    int i12 = PICKER_PADDING;
                    canvas.clipRect(f5, (measuredHeight3 - i12) - this.pikerHeight, getMeasuredWidth() - f5, getMeasuredHeight() - i12);
                    canvas.translate(f5, (getMeasuredHeight() - i12) - this.pikerHeight);
                    drawPickerChart(canvas);
                    canvas.restore();
                } else if (this.invalidatePickerChart) {
                    this.bottomChartBitmap.eraseColor(0);
                    drawPickerChart(this.bottomChartCanvas);
                    this.invalidatePickerChart = false;
                }
                if (!z) {
                    int i13 = this.transitionMode;
                    if (i13 == 2) {
                        float f6 = HORIZONTAL_PADDING;
                        float f7 = this.pickerWidth;
                        TransitionParams transitionParams2 = this.transitionParams;
                        float f8 = (f7 * transitionParams2.xPercentage) + f6;
                        this.emptyPaint.setAlpha((int) ((1.0f - transitionParams2.progress) * 255.0f));
                        canvas.save();
                        canvas.clipRect(f6, measuredHeight2, getMeasuredWidth() - f6, i7);
                        canvas.scale((this.transitionParams.progress * 2.0f) + 1.0f, 1.0f, f8, ((i7 - measuredHeight2) + measuredHeight2) >> 1);
                        canvas.drawBitmap(this.bottomChartBitmap, f6, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
                        canvas.restore();
                    } else if (i13 == 1) {
                        float f9 = ((i7 - measuredHeight2) + measuredHeight2) >> 1;
                        float f10 = HORIZONTAL_PADDING;
                        float f11 = this.pickerWidth;
                        TransitionParams transitionParams3 = this.transitionParams;
                        float f12 = transitionParams3.xPercentage;
                        float f13 = f11 * f12;
                        float f14 = f10 + f13;
                        if (f12 <= 0.5f) {
                            f13 = f11 * (1.0f - f12);
                        }
                        float f15 = f13 * transitionParams3.progress;
                        canvas.save();
                        canvas.clipRect(f14 - f15, measuredHeight2, f14 + f15, i7);
                        this.emptyPaint.setAlpha((int) (this.transitionParams.progress * 255.0f));
                        canvas.scale(this.transitionParams.progress, 1.0f, f14, f9);
                        canvas.drawBitmap(this.bottomChartBitmap, f10, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
                        canvas.restore();
                    } else {
                        this.emptyPaint.setAlpha((int) (f * 255.0f));
                        canvas.drawBitmap(this.bottomChartBitmap, HORIZONTAL_PADDING, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
                    }
                }
                if (this.transitionMode == 2) {
                    return;
                }
                float f16 = HORIZONTAL_PADDING;
                float f17 = measuredHeight2;
                int i14 = DP_12;
                float f18 = i7;
                canvas.drawRect(f16, f17, i2 + i14, f18, this.unactiveBottomChartPaint);
                canvas.drawRect(i - i14, f17, getMeasuredWidth() - f16, f18, this.unactiveBottomChartPaint);
            } else {
                canvas.drawRect(f2, measuredHeight2, getMeasuredWidth() - f2, i7, this.unactiveBottomChartPaint);
            }
            SharedUiComponents sharedUiComponents = this.sharedUiComponents;
            int i15 = this.pikerHeight;
            float f19 = HORIZONTAL_PADDING;
            canvas.drawBitmap(sharedUiComponents.getPickerMaskBitmap(i15, (int) (getMeasuredWidth() - (f19 * 2.0f))), f19, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
            if (this.chartData == null) {
                this.pickerRect.set(i2, measuredHeight2, i, i7);
                this.pickerDelegate.middlePickerArea.set(this.pickerRect);
                Path path = this.pathTmp;
                Rect rect5 = this.pickerRect;
                int i16 = rect5.left;
                int i17 = rect5.top;
                int i18 = DP_1;
                int i19 = DP_12;
                float f20 = DP_8;
                canvas.drawPath(RoundedRect(path, i16, i17 - i18, i16 + i19, rect5.bottom + i18, f20, f20, true, false, false, true), this.pickerSelectorPaint);
                canvas.drawPath(RoundedRect(this.pathTmp, i3 - i19, rect.top - i18, this.pickerRect.right, rect.bottom + i18, f20, f20, false, true, true, false), this.pickerSelectorPaint);
                canvas.drawRect(rect2.left + i19, this.pickerRect.bottom, rect2.right - i19, i4 + i18, this.pickerSelectorPaint);
                canvas.drawRect(rect3.left + i19, i5 - i18, rect3.right - i19, this.pickerRect.top, this.pickerSelectorPaint);
                Rect rect6 = this.pickerRect;
                int i20 = rect6.left;
                int i21 = DP_6;
                float centerY = rect6.centerY() - i21;
                Rect rect7 = this.pickerRect;
                canvas.drawLine(i20 + i21, centerY, rect7.left + i21, rect7.centerY() + i21, this.whiteLinePaint);
                float centerY2 = this.pickerRect.centerY() - i21;
                Rect rect8 = this.pickerRect;
                canvas.drawLine(rect4.right - i21, centerY2, rect8.right - i21, rect8.centerY() + i21, this.whiteLinePaint);
                ChartPickerDelegate.CapturesData middleCaptured = this.pickerDelegate.getMiddleCaptured();
                Rect rect9 = this.pickerRect;
                int i22 = rect9.bottom;
                int i23 = rect9.top;
                int i24 = (i22 - i23) >> 1;
                int i25 = i23 + i24;
                if (middleCaptured == null) {
                    ChartPickerDelegate.CapturesData leftCaptured = this.pickerDelegate.getLeftCaptured();
                    ChartPickerDelegate.CapturesData rightCaptured = this.pickerDelegate.getRightCaptured();
                    if (leftCaptured != null) {
                        canvas.drawCircle(this.pickerRect.left + DP_5, i25, (i24 * leftCaptured.aValue) - DP_2, this.ripplePaint);
                    }
                    if (rightCaptured != null) {
                        canvas.drawCircle(this.pickerRect.right - DP_5, i25, (i24 * rightCaptured.aValue) - DP_2, this.ripplePaint);
                    }
                }
                Rect rect10 = this.pickerDelegate.leftPickerArea;
                int i26 = PICKER_CAPTURE_WIDTH;
                int i27 = i26 >> 1;
                rect10.set(i2 - i26, measuredHeight2, i2 + i27, i7);
                this.pickerDelegate.rightPickerArea.set(i - i27, measuredHeight2, i + i26, i7);
                return;
            }
            return;
        }
        i = i9;
        i2 = i8;
        f = 1.0f;
        if (this.chartData == null) {
        }
        SharedUiComponents sharedUiComponents2 = this.sharedUiComponents;
        int i152 = this.pikerHeight;
        float f192 = HORIZONTAL_PADDING;
        canvas.drawBitmap(sharedUiComponents2.getPickerMaskBitmap(i152, (int) (getMeasuredWidth() - (f192 * 2.0f))), f192, (getMeasuredHeight() - PICKER_PADDING) - this.pikerHeight, this.emptyPaint);
        if (this.chartData == null) {
        }
    }

    private void setMaxMinValue(long j, long j2, boolean z) {
        setMaxMinValue(j, j2, z, false, false);
    }

    protected void setMaxMinValue(long j, long j2, boolean z, boolean z2, boolean z3) {
        if ((Math.abs(((float) ChartHorizontalLinesData.lookupHeight(j)) - this.animateToMaxHeight) < this.thresholdMaxHeight || j == 0) && ((float) j) == this.animateToMinHeight) {
            return;
        }
        final ChartHorizontalLinesData createHorizontalLinesData = createHorizontalLinesData(j, j2, this.chartData.yTickFormatter);
        long[] jArr = createHorizontalLinesData.values;
        long j3 = jArr[jArr.length - 1];
        long j4 = jArr[0];
        if (!z3) {
            float f = this.currentMaxHeight - this.currentMinHeight;
            float f2 = (float) (j3 - j4);
            float f3 = f / f2;
            if (f3 > 1.0f) {
                f3 = f2 / f;
            }
            double d = f3;
            float f4 = d > 0.7d ? 0.1f : d < 0.1d ? 0.03f : 0.045f;
            boolean z4 = ((float) j3) != this.animateToMaxHeight;
            if (this.useMinHeight && ((float) j4) != this.animateToMinHeight) {
                z4 = true;
            }
            if (z4) {
                Animator animator = this.maxValueAnimator;
                if (animator != null) {
                    animator.removeAllListeners();
                    this.maxValueAnimator.cancel();
                }
                this.startFromMaxH = this.currentMaxHeight;
                this.startFromMinH = this.currentMinHeight;
                this.startFromMax = 0.0f;
                this.startFromMin = 0.0f;
                this.minMaxUpdateStep = f4;
            }
        }
        float f5 = (float) j3;
        this.animateToMaxHeight = f5;
        float f6 = (float) j4;
        this.animateToMinHeight = f6;
        measureHeightThreshold();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastTime >= 320 || z2) {
            this.lastTime = currentTimeMillis;
            ValueAnimator valueAnimator = this.alphaAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.alphaAnimator.cancel();
            }
            if (!z) {
                this.currentMaxHeight = f5;
                this.currentMinHeight = f6;
                this.horizontalLines.clear();
                this.horizontalLines.add(createHorizontalLinesData);
                createHorizontalLinesData.alpha = NotificationCenter.voipServiceCreated;
                return;
            }
            this.horizontalLines.add(createHorizontalLinesData);
            if (z3) {
                Animator animator2 = this.maxValueAnimator;
                if (animator2 != null) {
                    animator2.removeAllListeners();
                    this.maxValueAnimator.cancel();
                }
                this.minMaxUpdateStep = 0.0f;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(createAnimator(this.currentMaxHeight, f5, this.heightUpdateListener));
                if (this.useMinHeight) {
                    animatorSet.playTogether(createAnimator(this.currentMinHeight, f6, this.minHeightUpdateListener));
                }
                this.maxValueAnimator = animatorSet;
                animatorSet.start();
            }
            int size = this.horizontalLines.size();
            for (int i = 0; i < size; i++) {
                ChartHorizontalLinesData chartHorizontalLinesData = this.horizontalLines.get(i);
                if (chartHorizontalLinesData != createHorizontalLinesData) {
                    chartHorizontalLinesData.fixedAlpha = chartHorizontalLinesData.alpha;
                }
            }
            ValueAnimator createAnimator = createAnimator(0.0f, 255.0f, new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Charts.BaseChartView$$ExternalSyntheticLambda3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    BaseChartView.this.lambda$setMaxMinValue$2(createHorizontalLinesData, valueAnimator2);
                }
            });
            this.alphaAnimator = createAnimator;
            createAnimator.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Charts.BaseChartView.5
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator3) {
                    BaseChartView.this.horizontalLines.clear();
                    BaseChartView.this.horizontalLines.add(createHorizontalLinesData);
                }
            });
            this.alphaAnimator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxMinValue$2(ChartHorizontalLinesData chartHorizontalLinesData, ValueAnimator valueAnimator) {
        chartHorizontalLinesData.alpha = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<ChartHorizontalLinesData> it = this.horizontalLines.iterator();
        while (it.hasNext()) {
            ChartHorizontalLinesData next = it.next();
            if (next != chartHorizontalLinesData) {
                next.alpha = (int) ((next.fixedAlpha / 255.0f) * (255 - chartHorizontalLinesData.alpha));
            }
        }
        invalidate();
    }

    protected ChartHorizontalLinesData createHorizontalLinesData(long j, long j2, int i) {
        return new ChartHorizontalLinesData(j, j2, this.useMinHeight, this.chartData.yRate, i, this.signaturePaint, this.signaturePaint2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ValueAnimator createAnimator(float f, float f2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(INTERPOLATOR);
        ofFloat.addUpdateListener(animatorUpdateListener);
        return ofFloat;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.chartData == null) {
            return false;
        }
        if (!this.enabled) {
            this.pickerDelegate.uncapture(motionEvent, motionEvent.getActionIndex());
            getParent().requestDisallowInterceptTouchEvent(false);
            this.chartCaptured = false;
            return false;
        }
        int x = (int) motionEvent.getX(motionEvent.getActionIndex());
        int y = (int) motionEvent.getY(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.capturedTime = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.pickerDelegate.capture(x, y, motionEvent.getActionIndex())) {
                return true;
            }
            this.lastX = x;
            this.capturedX = x;
            this.lastY = y;
            this.capturedY = y;
            if (this.chartArea.contains(x, y)) {
                if (this.selectedIndex < 0 || !this.animateLegentTo) {
                    this.chartCaptured = true;
                    selectXOnChart(x, y);
                }
                return true;
            }
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = x - this.lastX;
                int i2 = y - this.lastY;
                if (this.pickerDelegate.captured()) {
                    boolean move = this.pickerDelegate.move(x, y, motionEvent.getActionIndex());
                    if (motionEvent.getPointerCount() > 1) {
                        this.pickerDelegate.move((int) motionEvent.getX(1), (int) motionEvent.getY(1), 1);
                    }
                    getParent().requestDisallowInterceptTouchEvent(move);
                    return true;
                }
                if (this.chartCaptured) {
                    boolean z = (this.canCaptureChartSelection && System.currentTimeMillis() - this.capturedTime > 200) || Math.abs(i) > Math.abs(i2) || Math.abs(i2) < this.touchSlop;
                    this.lastX = x;
                    this.lastY = y;
                    getParent().requestDisallowInterceptTouchEvent(z);
                    selectXOnChart(x, y);
                } else if (this.chartArea.contains(this.capturedX, this.capturedY)) {
                    int i3 = this.capturedX - x;
                    int i4 = this.capturedY - y;
                    if (Math.sqrt((i3 * i3) + (i4 * i4)) > this.touchSlop || System.currentTimeMillis() - this.capturedTime > 200) {
                        this.chartCaptured = true;
                        selectXOnChart(x, y);
                    }
                }
                return true;
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return false;
                    }
                    this.pickerDelegate.uncapture(motionEvent, motionEvent.getActionIndex());
                    return true;
                }
                return this.pickerDelegate.capture(x, y, motionEvent.getActionIndex());
            }
        }
        if (this.pickerDelegate.uncapture(motionEvent, motionEvent.getActionIndex())) {
            return true;
        }
        if (this.chartArea.contains(this.capturedX, this.capturedY) && !this.chartCaptured) {
            animateLegend(false);
        }
        this.pickerDelegate.uncapture();
        updateLineSignature();
        getParent().requestDisallowInterceptTouchEvent(false);
        this.chartCaptured = false;
        onActionUp();
        invalidate();
        setMaxMinValue(findMaxValue(this.startXIndex, this.endXIndex), this.useMinHeight ? findMinValue(this.startXIndex, this.endXIndex) : 0L, true, true, false);
        return true;
    }

    protected void selectXOnChart(int i, int i2) {
        int i3 = this.selectedIndex;
        T t = this.chartData;
        if (t == null) {
            return;
        }
        float f = this.chartFullWidth;
        float f2 = (this.pickerDelegate.pickerStart * f) - HORIZONTAL_PADDING;
        float f3 = (i + f2) / f;
        this.selectedCoordinate = f3;
        if (f3 < 0.0f) {
            this.selectedIndex = 0;
            this.selectedCoordinate = 0.0f;
        } else if (f3 > 1.0f) {
            this.selectedIndex = t.x.length - 1;
            this.selectedCoordinate = 1.0f;
        } else {
            int findIndex = t.findIndex(this.startXIndex, this.endXIndex, f3);
            this.selectedIndex = findIndex;
            int i4 = findIndex + 1;
            float[] fArr = this.chartData.xPercentage;
            if (i4 < fArr.length) {
                if (Math.abs(this.chartData.xPercentage[this.selectedIndex + 1] - f3) < Math.abs(fArr[findIndex] - f3)) {
                    this.selectedIndex++;
                }
            }
        }
        int i5 = this.selectedIndex;
        int i6 = this.endXIndex;
        if (i5 > i6) {
            this.selectedIndex = i6;
        }
        int i7 = this.selectedIndex;
        int i8 = this.startXIndex;
        if (i7 < i8) {
            this.selectedIndex = i8;
        }
        if (i3 != this.selectedIndex) {
            this.legendShowing = true;
            animateLegend(true);
            moveLegend(f2);
            DateSelectionListener dateSelectionListener = this.dateSelectionListener;
            if (dateSelectionListener != null) {
                dateSelectionListener.onDateSelected(getSelectedDate());
            }
            runSmoothHaptic();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void runSmoothHaptic() {
        VibrationEffect createWaveform;
        if (Build.VERSION.SDK_INT >= 26) {
            Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
            if (this.vibrationEffect == null) {
                createWaveform = VibrationEffect.createWaveform(new long[]{0, 2}, -1);
                this.vibrationEffect = createWaveform;
            }
            vibrator.cancel();
            vibrator.vibrate(this.vibrationEffect);
        }
    }

    public void animateLegend(boolean z) {
        moveLegend();
        if (this.animateLegentTo == z) {
            return;
        }
        this.animateLegentTo = z;
        ValueAnimator valueAnimator = this.selectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.selectionAnimator.cancel();
        }
        ValueAnimator duration = createAnimator(this.selectionA, z ? 1.0f : 0.0f, this.selectionAnimatorListener).setDuration(200L);
        this.selectionAnimator = duration;
        duration.addListener(this.selectorAnimatorEndListener);
        this.selectionAnimator.start();
    }

    public void moveLegend(float f) {
        int i;
        float f2;
        T t = this.chartData;
        if (t == null || (i = this.selectedIndex) < 0) {
            return;
        }
        long[] jArr = t.x;
        if (i >= jArr.length || !this.legendShowing) {
            return;
        }
        this.legendSignatureView.setData(i, jArr[i], this.lines, false, t.yTooltipFormatter, t.yRate);
        this.legendSignatureView.setVisibility(0);
        this.legendSignatureView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
        float f3 = (this.chartData.xPercentage[this.selectedIndex] * this.chartFullWidth) - f;
        if (f3 > (this.chartStart + this.chartWidth) / 2.0f) {
            f2 = f3 - (this.legendSignatureView.getWidth() + DP_5);
        } else {
            f2 = f3 + DP_5;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (this.legendSignatureView.getMeasuredWidth() + f2 > getMeasuredWidth()) {
            f2 = getMeasuredWidth() - this.legendSignatureView.getMeasuredWidth();
        }
        this.legendSignatureView.setTranslationX(f2);
    }

    public long findMaxValue(int i, int i2) {
        int size = this.lines.size();
        long j = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (this.lines.get(i3).enabled) {
                long rMaxQ = this.lines.get(i3).line.segmentTree.rMaxQ(i, i2);
                if (rMaxQ > j) {
                    j = rMaxQ;
                }
            }
        }
        return j;
    }

    public long findMinValue(int i, int i2) {
        int size = this.lines.size();
        long j = Long.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            if (this.lines.get(i3).enabled) {
                long rMinQ = this.lines.get(i3).line.segmentTree.rMinQ(i, i2);
                if (rMinQ < j) {
                    j = rMinQ;
                }
            }
        }
        return j;
    }

    public boolean setData(T t) {
        boolean z = false;
        if (this.chartData != t) {
            invalidate();
            this.lines.clear();
            if (t != null && t.lines != null) {
                for (int i = 0; i < t.lines.size(); i++) {
                    this.lines.add(createLineViewData(t.lines.get(i)));
                }
            }
            clearSelection();
            this.chartData = t;
            if (t != null) {
                if (t.x[0] == 0) {
                    ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
                    chartPickerDelegate.pickerStart = 0.0f;
                    chartPickerDelegate.pickerEnd = 1.0f;
                } else {
                    this.pickerDelegate.minDistance = getMinDistance();
                    ChartPickerDelegate chartPickerDelegate2 = this.pickerDelegate;
                    float f = chartPickerDelegate2.pickerEnd;
                    float f2 = chartPickerDelegate2.minDistance;
                    if (f - chartPickerDelegate2.pickerStart < f2) {
                        float f3 = f - f2;
                        chartPickerDelegate2.pickerStart = f3;
                        if (f3 < 0.0f) {
                            chartPickerDelegate2.pickerStart = 0.0f;
                            chartPickerDelegate2.pickerEnd = 1.0f;
                        }
                    }
                }
            }
            z = true;
        }
        measureSizes();
        if (t != null) {
            updateIndexes();
            setMaxMinValue(findMaxValue(this.startXIndex, this.endXIndex), this.useMinHeight ? findMinValue(this.startXIndex, this.endXIndex) : 0L, false);
            this.pickerMaxHeight = 0.0f;
            this.pickerMinHeight = 2.14748365E9f;
            initPickerMaxHeight();
            int i2 = t.yTooltipFormatter;
            if (i2 == 1 || i2 == 2) {
                this.legendSignatureView.setSize(this.lines.size() * 2);
            } else {
                this.legendSignatureView.setSize(this.lines.size());
            }
            this.invalidatePickerChart = true;
            updateLineSignature();
        } else {
            ChartPickerDelegate chartPickerDelegate3 = this.pickerDelegate;
            chartPickerDelegate3.pickerStart = 0.7f;
            chartPickerDelegate3.pickerEnd = 1.0f;
            this.pickerMinHeight = 0.0f;
            this.pickerMaxHeight = 0.0f;
            this.horizontalLines.clear();
            Animator animator = this.maxValueAnimator;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimator = this.alphaAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.alphaAnimator.cancel();
            }
        }
        return z;
    }

    protected float getMinDistance() {
        T t = this.chartData;
        if (t == null) {
            return 0.1f;
        }
        int length = t.x.length;
        if (length < 5) {
            return 1.0f;
        }
        float f = 5.0f / length;
        if (f < 0.1f) {
            return 0.1f;
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void initPickerMaxHeight() {
        Iterator<L> it = this.lines.iterator();
        while (it.hasNext()) {
            L next = it.next();
            boolean z = next.enabled;
            if (z) {
                float f = (float) next.line.maxValue;
                if (f > this.pickerMaxHeight) {
                    this.pickerMaxHeight = f;
                }
            }
            if (z) {
                float f2 = (float) next.line.minValue;
                if (f2 < this.pickerMinHeight) {
                    this.pickerMinHeight = f2;
                }
            }
            float f3 = this.pickerMaxHeight;
            float f4 = this.pickerMinHeight;
            if (f3 == f4) {
                this.pickerMaxHeight = f3 + 1.0f;
                this.pickerMinHeight = f4 - 1.0f;
            }
        }
    }

    @Override // org.telegram.ui.Charts.ChartPickerDelegate.Listener
    public void onPickerDataChanged() {
        onPickerDataChanged(true, false, false);
    }

    public void onPickerDataChanged(boolean z, boolean z2, boolean z3) {
        if (this.chartData == null) {
            return;
        }
        float f = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        this.chartFullWidth = f / (chartPickerDelegate.pickerEnd - chartPickerDelegate.pickerStart);
        updateIndexes();
        setMaxMinValue(findMaxValue(this.startXIndex, this.endXIndex), this.useMinHeight ? findMinValue(this.startXIndex, this.endXIndex) : 0L, z, z2, z3);
        if (this.legendShowing && !z2) {
            animateLegend(false);
            moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - HORIZONTAL_PADDING);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Charts.ChartPickerDelegate.Listener
    public void onPickerJumpTo(float f, float f2, boolean z) {
        T t = this.chartData;
        if (t == null) {
            return;
        }
        if (z) {
            int findStartIndex = t.findStartIndex(Math.max(f, 0.0f));
            int findEndIndex = this.chartData.findEndIndex(findStartIndex, Math.min(f2, 1.0f));
            setMaxMinValue(findMaxValue(findStartIndex, findEndIndex), findMinValue(findStartIndex, findEndIndex), true, true, false);
            animateLegend(false);
            return;
        }
        updateIndexes();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateIndexes() {
        T t = this.chartData;
        if (t == null) {
            return;
        }
        int findStartIndex = t.findStartIndex(Math.max(this.pickerDelegate.pickerStart, 0.0f));
        this.startXIndex = findStartIndex;
        int findEndIndex = this.chartData.findEndIndex(findStartIndex, Math.min(this.pickerDelegate.pickerEnd, 1.0f));
        this.endXIndex = findEndIndex;
        int i = this.startXIndex;
        if (findEndIndex < i) {
            this.endXIndex = i;
        }
        ChartHeaderView chartHeaderView = this.chartHeaderView;
        if (chartHeaderView != null) {
            long[] jArr = this.chartData.x;
            chartHeaderView.setDates(jArr[i], jArr[this.endXIndex]);
        }
        updateLineSignature();
    }

    private void updateLineSignature() {
        T t = this.chartData;
        if (t != null) {
            float f = this.chartWidth;
            if (f == 0.0f) {
                return;
            }
            updateDates((int) ((f / (this.chartFullWidth * t.oneDayPercentage)) / 6.0f));
        }
    }

    private void updateDates(int i) {
        ChartBottomSignatureData chartBottomSignatureData = this.currentBottomSignatures;
        if (chartBottomSignatureData == null || i >= chartBottomSignatureData.stepMax || i <= chartBottomSignatureData.stepMin) {
            int highestOneBit = Integer.highestOneBit(i) << 1;
            ChartBottomSignatureData chartBottomSignatureData2 = this.currentBottomSignatures;
            if (chartBottomSignatureData2 == null || chartBottomSignatureData2.step != highestOneBit) {
                ValueAnimator valueAnimator = this.alphaBottomAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.alphaBottomAnimator.cancel();
                }
                double d = highestOneBit;
                Double.isNaN(d);
                double d2 = 0.2d * d;
                Double.isNaN(d);
                Double.isNaN(d);
                final ChartBottomSignatureData chartBottomSignatureData3 = new ChartBottomSignatureData(highestOneBit, (int) (d + d2), (int) (d - d2));
                chartBottomSignatureData3.alpha = NotificationCenter.voipServiceCreated;
                if (this.currentBottomSignatures == null) {
                    this.currentBottomSignatures = chartBottomSignatureData3;
                    chartBottomSignatureData3.alpha = NotificationCenter.voipServiceCreated;
                    this.bottomSignatureDate.add(chartBottomSignatureData3);
                    return;
                }
                this.currentBottomSignatures = chartBottomSignatureData3;
                this.tmpN = this.bottomSignatureDate.size();
                for (int i2 = 0; i2 < this.tmpN; i2++) {
                    ChartBottomSignatureData chartBottomSignatureData4 = this.bottomSignatureDate.get(i2);
                    chartBottomSignatureData4.fixedAlpha = chartBottomSignatureData4.alpha;
                }
                this.bottomSignatureDate.add(chartBottomSignatureData3);
                if (this.bottomSignatureDate.size() > 2) {
                    this.bottomSignatureDate.remove(0);
                }
                ValueAnimator duration = createAnimator(0.0f, 1.0f, new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Charts.BaseChartView$$ExternalSyntheticLambda4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        BaseChartView.this.lambda$updateDates$3(chartBottomSignatureData3, valueAnimator2);
                    }
                }).setDuration(200L);
                this.alphaBottomAnimator = duration;
                duration.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.Charts.BaseChartView.6
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        BaseChartView.this.bottomSignatureDate.clear();
                        BaseChartView.this.bottomSignatureDate.add(chartBottomSignatureData3);
                    }
                });
                this.alphaBottomAnimator.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateDates$3(ChartBottomSignatureData chartBottomSignatureData, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator<ChartBottomSignatureData> it = this.bottomSignatureDate.iterator();
        while (it.hasNext()) {
            ChartBottomSignatureData next = it.next();
            if (next == chartBottomSignatureData) {
                chartBottomSignatureData.alpha = (int) (255.0f * floatValue);
            } else {
                next.alpha = (int) ((1.0f - floatValue) * next.fixedAlpha);
            }
        }
        invalidate();
    }

    public void onCheckChanged() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        onPickerDataChanged(true, true, true);
        this.tmpN = this.lines.size();
        int i = 0;
        while (true) {
            this.tmpI = i;
            int i2 = this.tmpI;
            if (i2 >= this.tmpN) {
                break;
            }
            final L l = this.lines.get(i2);
            if (l.enabled && (valueAnimator3 = l.animatorOut) != null) {
                valueAnimator3.cancel();
            }
            if (!l.enabled && (valueAnimator2 = l.animatorIn) != null) {
                valueAnimator2.cancel();
            }
            if (l.enabled && l.alpha != 1.0f) {
                ValueAnimator valueAnimator4 = l.animatorIn;
                if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                    i = this.tmpI + 1;
                } else {
                    ValueAnimator createAnimator = createAnimator(l.alpha, 1.0f, new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Charts.BaseChartView$$ExternalSyntheticLambda5
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                            BaseChartView.this.lambda$onCheckChanged$4(l, valueAnimator5);
                        }
                    });
                    l.animatorIn = createAnimator;
                    createAnimator.start();
                }
            }
            if (!l.enabled && l.alpha != 0.0f && ((valueAnimator = l.animatorOut) == null || !valueAnimator.isRunning())) {
                ValueAnimator createAnimator2 = createAnimator(l.alpha, 0.0f, new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Charts.BaseChartView$$ExternalSyntheticLambda6
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                        BaseChartView.this.lambda$onCheckChanged$5(l, valueAnimator5);
                    }
                });
                l.animatorOut = createAnimator2;
                createAnimator2.start();
            }
            i = this.tmpI + 1;
        }
        updatePickerMinMaxHeight();
        if (this.legendShowing) {
            LegendSignatureView legendSignatureView = this.legendSignatureView;
            int i3 = this.selectedIndex;
            T t = this.chartData;
            legendSignatureView.setData(i3, t.x[i3], this.lines, true, t.yTooltipFormatter, t.yRate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCheckChanged$4(LineViewData lineViewData, ValueAnimator valueAnimator) {
        lineViewData.alpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.invalidatePickerChart = true;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCheckChanged$5(LineViewData lineViewData, ValueAnimator valueAnimator) {
        lineViewData.alpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.invalidatePickerChart = true;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updatePickerMinMaxHeight() {
        if (ANIMATE_PICKER_SIZES) {
            Iterator<L> it = this.lines.iterator();
            long j = Long.MAX_VALUE;
            long j2 = 0;
            while (it.hasNext()) {
                L next = it.next();
                boolean z = next.enabled;
                if (z) {
                    long j3 = next.line.maxValue;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                if (z) {
                    long j4 = next.line.minValue;
                    if (j4 < j) {
                        j = j4;
                    }
                }
            }
            if ((j == 2147483647L || ((float) j) == this.animatedToPickerMinHeight) && (j2 <= 0 || ((float) j2) == this.animatedToPickerMaxHeight)) {
                return;
            }
            this.animatedToPickerMaxHeight = (float) j2;
            Animator animator = this.pickerAnimator;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(createAnimator(this.pickerMaxHeight, this.animatedToPickerMaxHeight, this.pickerHeightUpdateListener), createAnimator(this.pickerMinHeight, this.animatedToPickerMinHeight, this.pickerMinHeightUpdateListener));
            this.pickerAnimator = animatorSet;
            animatorSet.start();
        }
    }

    public void setLandscape(boolean z) {
        this.landscape = z;
    }

    public void setHeader(ChartHeaderView chartHeaderView) {
        this.chartHeaderView = chartHeaderView;
    }

    public long getSelectedDate() {
        int i = this.selectedIndex;
        if (i < 0) {
            return -1L;
        }
        return this.chartData.x[i];
    }

    public void clearSelection() {
        this.selectedIndex = -1;
        this.legendShowing = false;
        this.animateLegentTo = false;
        this.legendSignatureView.setVisibility(8);
        this.selectionA = 0.0f;
    }

    public void selectDate(long j) {
        this.selectedIndex = Arrays.binarySearch(this.chartData.x, j);
        this.legendShowing = true;
        this.legendSignatureView.setVisibility(0);
        this.selectionA = 1.0f;
        moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - HORIZONTAL_PADDING);
        performHapticFeedback(3, 2);
    }

    public long getStartDate() {
        return this.chartData.x[this.startXIndex];
    }

    public long getEndDate() {
        return this.chartData.x[this.endXIndex];
    }

    public void updatePicker(ChartData chartData, long j) {
        int length = chartData.x.length;
        long j2 = j - (j % 86400000);
        long j3 = 86399999 + j2;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            long j4 = chartData.x[i3];
            if (j2 > j4) {
                i2 = i3;
            }
            if (j3 > j4) {
                i = i3;
            }
        }
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float[] fArr = chartData.xPercentage;
        chartPickerDelegate.pickerStart = fArr[i2];
        chartPickerDelegate.pickerEnd = fArr[i];
    }

    public void moveLegend() {
        moveLegend((this.chartFullWidth * this.pickerDelegate.pickerStart) - HORIZONTAL_PADDING);
    }

    @Override // android.view.View
    public void requestLayout() {
        super.requestLayout();
    }

    public static Path RoundedRect(Path path, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, boolean z3, boolean z4) {
        path.reset();
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = f7 / 2.0f;
        if (f5 > f9) {
            f5 = f9;
        }
        float f10 = f8 / 2.0f;
        if (f6 > f10) {
            f6 = f10;
        }
        float f11 = f7 - (f5 * 2.0f);
        float f12 = f8 - (2.0f * f6);
        path.moveTo(f3, f2 + f6);
        if (z2) {
            float f13 = -f6;
            path.rQuadTo(0.0f, f13, -f5, f13);
        } else {
            path.rLineTo(0.0f, -f6);
            path.rLineTo(-f5, 0.0f);
        }
        path.rLineTo(-f11, 0.0f);
        if (z) {
            float f14 = -f5;
            path.rQuadTo(f14, 0.0f, f14, f6);
        } else {
            path.rLineTo(-f5, 0.0f);
            path.rLineTo(0.0f, f6);
        }
        path.rLineTo(0.0f, f12);
        if (z4) {
            path.rQuadTo(0.0f, f6, f5, f6);
        } else {
            path.rLineTo(0.0f, f6);
            path.rLineTo(f5, 0.0f);
        }
        path.rLineTo(f11, 0.0f);
        if (z3) {
            path.rQuadTo(f5, 0.0f, f5, -f6);
        } else {
            path.rLineTo(f5, 0.0f);
            path.rLineTo(0.0f, -f6);
        }
        path.rLineTo(0.0f, -f12);
        path.close();
        return path;
    }

    public void setDateSelectionListener(DateSelectionListener dateSelectionListener) {
        this.dateSelectionListener = dateSelectionListener;
    }

    /* loaded from: classes4.dex */
    public static class SharedUiComponents {
        private Canvas canvas;
        private boolean invalidate;
        int k;
        private Bitmap pickerRoundBitmap;
        private RectF rectF;
        private Theme.ResourcesProvider resourcesProvider;
        private Paint xRefP;

        public SharedUiComponents() {
            this(null);
        }

        public SharedUiComponents(Theme.ResourcesProvider resourcesProvider) {
            this.rectF = new RectF();
            Paint paint = new Paint(1);
            this.xRefP = paint;
            this.k = 0;
            this.invalidate = true;
            paint.setColor(0);
            this.xRefP.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.resourcesProvider = resourcesProvider;
        }

        Bitmap getPickerMaskBitmap(int i, int i2) {
            int i3 = (i + i2) << 10;
            if (i3 != this.k || this.invalidate) {
                this.invalidate = false;
                this.k = i3;
                this.pickerRoundBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                this.canvas = new Canvas(this.pickerRoundBitmap);
                this.rectF.set(0.0f, 0.0f, i2, i);
                this.canvas.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
                this.canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.xRefP);
            }
            return this.pickerRoundBitmap;
        }

        public void invalidate() {
            this.invalidate = true;
        }
    }
}
