package fg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.tg0;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.i51;
import org.telegram.ui.py;
import org.telegram.ui.wg0;
import org.telegram.ui.y5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(xg0 xg0Var, Context context) {
        super(context);
        this.d = xg0Var;
        this.b = false;
        this.c = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.a;
        Object obj = this.d;
        switch (i10) {
            case 2:
                Paint paint = (Paint) this.c;
                if (this.b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((py) obj).getThemedColor(k6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.c;
                if (this.b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((wg0) obj).getThemedColor(k6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                i51 i51Var = (i51) obj;
                if (!this.b && i51Var.r > 0.0f) {
                    if (((Paint) this.c) == null) {
                        Paint paint3 = new Paint();
                        this.c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.c).setAlpha((int) (i51Var.r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.c);
                    canvas.restore();
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                boolean z4 = this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                float f10 = limitPreviewView.a;
                boolean z10 = false;
                boolean z11 = f10 != 0.0f && f10 <= 1.0f && z4;
                if (f10 == 1.0f && !z4) {
                    z10 = true;
                }
                if ((!z11 && !z10) || limitPreviewView.b0 == null) {
                    return drawChild;
                }
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.c, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((y5) ((org.telegram.ui.a1) limitPreviewView.b0).b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                canvas.restore();
                invalidate();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.c;
                int dp = AndroidUtilities.dp(13.0f);
                xg0 xg0Var = (xg0) this.d;
                Drawable drawable = xg0Var.d;
                int i21 = xg0Var.B;
                i10 = ((h3) xg0Var).backgroundPaddingTop;
                int i22 = (i21 - i10) - dp;
                i11 = ((h3) xg0Var).currentSheetAnimationType;
                if (i11 == 1) {
                    i22 = (int) (xg0Var.b.getTranslationY() + i22);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + i22;
                int dp3 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                i12 = ((h3) xg0Var).backgroundPaddingTop;
                int i23 = i12 + dp3;
                i13 = ((h3) xg0Var).backgroundPaddingTop;
                if (i13 + i22 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp4 = AndroidUtilities.dp(4.0f) + dp;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i22;
                    i20 = ((h3) xg0Var).backgroundPaddingTop;
                    float min = Math.min(1.0f, (currentActionBarHeight - i20) / dp4);
                    int currentActionBarHeight2 = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp4) * min);
                    i22 -= currentActionBarHeight2;
                    dp2 -= currentActionBarHeight2;
                    i23 += currentActionBarHeight2;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = dp2 + i24;
                drawable.setBounds(0, i22 + i24, getMeasuredWidth(), i23);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    k6.t0.setColor(k6.w0(null, k6.h5, false));
                    i16 = ((h3) xg0Var).backgroundPaddingLeft;
                    i17 = ((h3) xg0Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i18 = ((h3) xg0Var).backgroundPaddingLeft;
                    float f11 = measuredWidth - i18;
                    i19 = ((h3) xg0Var).backgroundPaddingTop;
                    rectF.set(i16, i17 + r4, f11, AndroidUtilities.dp(24.0f) + i19 + r4);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, k6.t0);
                }
                if (f10 != 0.0f) {
                    int dp5 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp5) / 2, i25, (getMeasuredWidth() + dp5) / 2, AndroidUtilities.dp(4.0f) + i25);
                    int w02 = k6.w0(null, k6.Ii, false);
                    int alpha = Color.alpha(w02);
                    k6.t0.setColor(w02);
                    k6.t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), k6.t0);
                }
                int w03 = k6.w0(null, k6.h5, false);
                k6.t0.setColor(Color.argb((int) (xg0Var.f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                i14 = ((h3) xg0Var).backgroundPaddingLeft;
                float f12 = i14;
                int measuredWidth2 = getMeasuredWidth();
                i15 = ((h3) xg0Var).backgroundPaddingLeft;
                canvas.drawRect(f12, 0.0f, measuredWidth2 - i15, AndroidUtilities.statusBarHeight, k6.t0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                xg0 xg0Var = (xg0) this.d;
                if (motionEvent.getAction() == 0 && xg0Var.B != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + xg0Var.B && xg0Var.f.getAlpha() == 0.0f) {
                        xg0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                xg0.t((xg0) this.d);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z4;
        int i12;
        int M;
        int i13;
        int i14;
        int i15;
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                xg0 xg0Var = (xg0) this.d;
                t5 t5Var = xg0Var.y;
                tg0 tg0Var = xg0Var.c;
                rg0 rg0Var = xg0Var.b;
                z4 = ((h3) xg0Var).isFullscreen;
                if (!z4) {
                    this.b = true;
                    i14 = ((h3) xg0Var).backgroundPaddingLeft;
                    int i16 = AndroidUtilities.statusBarHeight;
                    i15 = ((h3) xg0Var).backgroundPaddingLeft;
                    setPadding(i14, i16, i15, 0);
                    this.b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) rg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) xg0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                i12 = ((h3) xg0Var).backgroundPaddingTop;
                int dp = AndroidUtilities.dp(15.0f) + i12 + AndroidUtilities.statusBarHeight;
                int R = tg0Var.R();
                for (int i17 = 0; i17 < R; i17++) {
                    if (i17 == 0) {
                        i13 = ((h3) xg0Var).backgroundPaddingLeft;
                        t5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (i13 * 2)), TLObject.FLAG_30), i11);
                        M = t5Var.getMeasuredHeight();
                    } else {
                        M = ((tg0Var.M(i17) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                int dp2 = AndroidUtilities.dp(8.0f) + (dp < paddingTop ? paddingTop - dp : paddingTop - ((paddingTop / 5) * 3));
                if (rg0Var.getPaddingTop() != dp2) {
                    this.b = true;
                    rg0Var.setPinnedSectionOffsetY(-dp2);
                    rg0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
                    this.b = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return !((xg0) this.d).isDismissed() && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 1:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(wg0 wg0Var, Activity activity, boolean z4) {
        super(activity);
        this.d = wg0Var;
        this.b = z4;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LimitPreviewView limitPreviewView, Context context, boolean z4) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.b = z4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i51 i51Var, Context context, boolean z4) {
        super(context);
        this.d = i51Var;
        this.b = z4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(py pyVar, Activity activity, boolean z4) {
        super(activity);
        this.d = pyVar;
        this.b = z4;
        this.c = new Paint(1);
    }
}
