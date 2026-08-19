package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;

/* loaded from: classes5.dex */
public class SlideChooseView extends View {
    private final SeekBarAccessibilityDelegate accessibilityDelegate;
    private Callback callback;
    private int circleSize;
    private int dashedFrom;
    private int gapSize;
    private int lastDash;
    private Drawable[] leftDrawables;
    private Paint linePaint;
    private int lineSize;
    private int minIndex;
    private boolean moving;
    private AnimatedFloat movingAnimatedHolder;
    private int[] optionsSizes;
    private String[] optionsStr;
    private Paint paint;
    private final Theme.ResourcesProvider resourcesProvider;
    private int selectedIndex;
    private AnimatedFloat selectedIndexAnimatedHolder;
    private float selectedIndexTouch;
    private int sideSide;
    private boolean startMoving;
    private int startMovingPreset;
    private TextPaint textPaint;
    private boolean touchWasClose;
    private float xTouchDown;
    private float yTouchDown;

    public interface Callback {

        public abstract /* synthetic */ class -CC {
            public static void $default$onTouchEnd(Callback callback) {
            }
        }

        void onOptionSelected(int i);

        void onTouchEnd();
    }

    public SlideChooseView(Context context) {
        this(context, null);
    }

    public SlideChooseView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.dashedFrom = -1;
        this.minIndex = TLObject.FLAG_31;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        this.selectedIndexAnimatedHolder = new AnimatedFloat(this, 120L, cubicBezierInterpolator);
        this.movingAnimatedHolder = new AnimatedFloat(this, 150L, cubicBezierInterpolator);
        this.touchWasClose = false;
        this.resourcesProvider = resourcesProvider;
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.linePaint = paint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        this.accessibilityDelegate = new IntSeekBarAccessibilityDelegate() { // from class: org.telegram.ui.Components.SlideChooseView.1
            @Override // org.telegram.ui.Components.IntSeekBarAccessibilityDelegate
            protected int getProgress() {
                return SlideChooseView.this.selectedIndex;
            }

            @Override // org.telegram.ui.Components.IntSeekBarAccessibilityDelegate
            protected void setProgress(int i) {
                SlideChooseView.this.setOption(i);
            }

            @Override // org.telegram.ui.Components.IntSeekBarAccessibilityDelegate
            protected int getMaxValue() {
                return SlideChooseView.this.optionsStr.length - 1;
            }

            @Override // org.telegram.ui.Components.SeekBarAccessibilityDelegate
            protected CharSequence getContentDescription(View view) {
                if (SlideChooseView.this.selectedIndex < SlideChooseView.this.optionsStr.length) {
                    return SlideChooseView.this.optionsStr[SlideChooseView.this.selectedIndex];
                }
                return null;
            }
        };
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public void setOptions(int i, String... strArr) {
        setOptions(i, null, strArr);
    }

    public void setOptions(int i, Drawable[] drawableArr, String... strArr) {
        this.optionsStr = strArr;
        this.leftDrawables = drawableArr;
        this.selectedIndex = i;
        this.optionsSizes = new int[strArr.length];
        int i2 = 0;
        while (true) {
            if (i2 >= this.optionsStr.length) {
                break;
            }
            this.optionsSizes[i2] = (int) Math.ceil(this.textPaint.measureText(r7[i2]));
            i2++;
        }
        Drawable[] drawableArr2 = this.leftDrawables;
        if (drawableArr2 != null) {
            for (Drawable drawable : drawableArr2) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
        }
        requestLayout();
    }

    public void setMinAllowedIndex(int i) {
        String[] strArr;
        if (i != -1 && (strArr = this.optionsStr) != null) {
            i = Math.min(i, strArr.length - 1);
        }
        if (this.minIndex != i) {
            this.minIndex = i;
            if (this.selectedIndex < i) {
                this.selectedIndex = i;
            }
            invalidate();
        }
    }

    public void setDashedFrom(int i) {
        this.dashedFrom = i;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float clamp = MathUtils.clamp(((x - this.sideSide) + (this.circleSize / 2.0f)) / ((this.lineSize + (this.gapSize * 2)) + r3), 0.0f, this.optionsStr.length - 1);
        boolean z = Math.abs(clamp - ((float) Math.round(clamp))) < 0.35f;
        if (z) {
            clamp = Math.round(clamp);
        }
        int i = this.minIndex;
        if (i != Integer.MIN_VALUE) {
            clamp = Math.max(clamp, i);
        }
        if (motionEvent.getAction() == 0) {
            this.xTouchDown = x;
            this.yTouchDown = y;
            this.selectedIndexTouch = clamp;
            this.startMovingPreset = this.selectedIndex;
            this.startMoving = true;
            invalidate();
        } else if (motionEvent.getAction() == 2) {
            if (!this.moving && Math.abs(this.xTouchDown - x) > Math.abs(this.yTouchDown - y)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.startMoving && Math.abs(this.xTouchDown - x) >= AndroidUtilities.touchSlop) {
                this.moving = true;
                this.startMoving = false;
            }
            if (this.moving) {
                this.selectedIndexTouch = clamp;
                invalidate();
                if (Math.round(this.selectedIndexTouch) != this.selectedIndex && z) {
                    setOption(Math.round(this.selectedIndexTouch));
                }
            }
            invalidate();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.moving) {
                this.selectedIndexTouch = clamp;
                if (motionEvent.getAction() == 1 && Math.round(this.selectedIndexTouch) != this.selectedIndex) {
                    setOption(Math.round(this.selectedIndexTouch));
                }
            } else {
                int i2 = this.selectedIndex;
                if (i2 != this.startMovingPreset) {
                    setOption(i2);
                }
            }
            Callback callback = this.callback;
            if (callback != null) {
                callback.onTouchEnd();
            }
            this.startMoving = false;
            this.moving = false;
            invalidate();
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOption(int i) {
        if (this.selectedIndex != i) {
            AndroidUtilities.vibrateCursor(this);
        }
        this.selectedIndex = i;
        Callback callback = this.callback;
        if (callback != null) {
            callback.onOptionSelected(i);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(74.0f), TLObject.FLAG_30));
        this.circleSize = AndroidUtilities.dp(6.0f);
        this.gapSize = AndroidUtilities.dp(2.0f);
        this.sideSide = AndroidUtilities.dp(22.0f);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.circleSize;
        String[] strArr = this.optionsStr;
        this.lineSize = (((measuredWidth - (i3 * strArr.length)) - ((this.gapSize * 2) * (strArr.length - 1))) - (this.sideSide * 2)) / Math.max(1, strArr.length - 1);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        Canvas canvas2 = canvas;
        float f3 = this.selectedIndexAnimatedHolder.set(this.selectedIndex);
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = this.movingAnimatedHolder.set(this.moving ? 1.0f : 0.0f);
        int measuredHeight = (getMeasuredHeight() / 2) + AndroidUtilities.dp(11.0f);
        int i2 = 0;
        while (i2 < this.optionsStr.length) {
            int i3 = this.sideSide;
            int i4 = this.lineSize + (this.gapSize * 2);
            int i5 = this.circleSize;
            int i6 = i3 + ((i4 + i5) * i2) + (i5 / 2);
            float f7 = i2;
            float f8 = f7 - f3;
            float max = Math.max(f4, f5 - Math.abs(f8));
            float clamp = MathUtils.clamp((f3 - f7) + f5, f4, f5);
            int themedColor = getThemedColor(Theme.key_switchTrack);
            int themedColor2 = getThemedColor(Theme.key_switchTrackChecked);
            int i7 = this.minIndex;
            int blendARGB = ColorUtils.blendARGB(themedColor, Theme.multAlpha(themedColor2, (i7 == Integer.MIN_VALUE || i2 > i7) ? 1.0f : 0.5f), clamp);
            this.paint.setColor(blendARGB);
            this.linePaint.setColor(blendARGB);
            float f9 = measuredHeight;
            canvas2.drawCircle(i6, f9, AndroidUtilities.lerp(this.circleSize / 2, AndroidUtilities.dp(6.0f), max), this.paint);
            if (i2 != 0) {
                int i8 = (i6 - (this.circleSize / 2)) - this.gapSize;
                int i9 = this.lineSize;
                int i10 = i8 - i9;
                int i11 = this.dashedFrom;
                f2 = 3.0f;
                if (i11 != -1 && i2 - 1 >= i11) {
                    int dp = i10 + AndroidUtilities.dp(3.0f);
                    int dp2 = (i9 - AndroidUtilities.dp(3.0f)) / AndroidUtilities.dp(13.0f);
                    if (this.lastDash != dp2) {
                        this.linePaint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(6.0f), (r9 - (AndroidUtilities.dp(8.0f) * dp2)) / (dp2 - 1)}, 0.0f));
                        this.lastDash = dp2;
                    }
                    f = max;
                    i = i6;
                    canvas2 = canvas;
                    canvas2.drawLine(AndroidUtilities.dp(1.0f) + dp, f9, (dp + r9) - AndroidUtilities.dp(1.0f), f9, this.linePaint);
                } else {
                    i = i6;
                    f = max;
                    float f10 = f8 - 1.0f;
                    float clamp2 = MathUtils.clamp(1.0f - Math.abs(f10), 0.0f, 1.0f);
                    int dp3 = (int) (i9 - (AndroidUtilities.dp(3.0f) * MathUtils.clamp(1.0f - Math.min(Math.abs(f8), Math.abs(f10)), 0.0f, 1.0f)));
                    canvas2 = canvas;
                    canvas2.drawRect((int) (i10 + (AndroidUtilities.dp(3.0f) * clamp2)), measuredHeight - AndroidUtilities.dp(1.0f), dp3 + r2, AndroidUtilities.dp(1.0f) + measuredHeight, this.paint);
                }
            } else {
                i = i6;
                f = max;
                f2 = 3.0f;
            }
            int i12 = this.optionsSizes[i2];
            String str = this.optionsStr[i2];
            this.textPaint.setColor(ColorUtils.blendARGB(getThemedColor(Theme.key_windowBackgroundWhiteGrayText), getThemedColor(Theme.key_windowBackgroundWhiteBlueText), f));
            if (this.leftDrawables != null) {
                canvas2.save();
                if (i2 == 0) {
                    canvas2.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(15.5f));
                } else if (i2 == this.optionsStr.length - 1) {
                    canvas2.translate(((getMeasuredWidth() - i12) - AndroidUtilities.dp(22.0f)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                } else {
                    canvas2.translate((i - (i12 / 2)) - AndroidUtilities.dp(10.0f), AndroidUtilities.dp(28.0f) - AndroidUtilities.dp(12.5f));
                }
                this.leftDrawables[i2].setColorFilter(this.textPaint.getColor(), PorterDuff.Mode.MULTIPLY);
                this.leftDrawables[i2].draw(canvas2);
                canvas2.restore();
                canvas2.save();
                float intrinsicWidth = this.leftDrawables[i2].getIntrinsicWidth() / 2.0f;
                if (i2 != 0) {
                    f2 = 2.0f;
                }
                canvas2.translate(intrinsicWidth - AndroidUtilities.dp(f2), 0.0f);
            }
            if (i2 == 0) {
                canvas2.drawText(str, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), this.textPaint);
            } else if (i2 == this.optionsStr.length - 1) {
                canvas2.drawText(str, (getMeasuredWidth() - i12) - AndroidUtilities.dp(22.0f), AndroidUtilities.dp(28.0f), this.textPaint);
            } else {
                canvas2.drawText(str, i - (i12 / 2), AndroidUtilities.dp(28.0f), this.textPaint);
            }
            if (this.leftDrawables != null) {
                canvas2.restore();
            }
            i2++;
            f4 = 0.0f;
            f5 = 1.0f;
        }
        float f11 = this.sideSide;
        int i13 = this.lineSize + (this.gapSize * 2);
        int i14 = this.circleSize;
        float f12 = f11 + ((i13 + i14) * f3) + (i14 / 2);
        Paint paint = this.paint;
        int i15 = Theme.key_switchTrackChecked;
        paint.setColor(ColorUtils.setAlphaComponent(getThemedColor(i15), 80));
        float f13 = measuredHeight;
        canvas2.drawCircle(f12, f13, AndroidUtilities.dp(f6 * 12.0f), this.paint);
        this.paint.setColor(getThemedColor(i15));
        canvas2.drawCircle(f12, f13, AndroidUtilities.dp(6.0f), this.paint);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.accessibilityDelegate.onInitializeAccessibilityNodeInfoInternal(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || this.accessibilityDelegate.performAccessibilityActionInternal(this, i, bundle);
    }

    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
