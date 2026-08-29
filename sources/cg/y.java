package cg;

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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.fy;
import org.telegram.ui.ng0;
import org.telegram.ui.u41;
import org.telegram.ui.v5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(lg0 lg0Var, Context context) {
        super(context);
        this.d = lg0Var;
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
                    paint.setColor(((fy) obj).getThemedColor(g6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.c;
                if (this.b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((ng0) obj).getThemedColor(g6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 4:
                u41 u41Var = (u41) obj;
                if (!this.b && u41Var.r > 0.0f) {
                    if (((Paint) this.c) == null) {
                        Paint paint3 = new Paint();
                        this.c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.c).setAlpha((int) (u41Var.r * 255.0f));
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
                boolean z10 = this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                float f9 = limitPreviewView.a;
                boolean z11 = false;
                boolean z12 = f9 != 0.0f && f9 <= 1.0f && z10;
                if (f9 == 1.0f && !z10) {
                    z11 = true;
                }
                if ((!z12 && !z11) || limitPreviewView.a0 == null) {
                    return drawChild;
                }
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.c, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((v5) ((org.telegram.ui.c1) limitPreviewView.a0).b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        float f9;
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
                lg0 lg0Var = (lg0) this.d;
                Drawable drawable = lg0Var.d;
                int i21 = lg0Var.A;
                i10 = ((f3) lg0Var).backgroundPaddingTop;
                int i22 = (i21 - i10) - dp;
                i11 = ((f3) lg0Var).currentSheetAnimationType;
                if (i11 == 1) {
                    i22 = (int) (lg0Var.b.getTranslationY() + i22);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + i22;
                int dp3 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                i12 = ((f3) lg0Var).backgroundPaddingTop;
                int i23 = i12 + dp3;
                i13 = ((f3) lg0Var).backgroundPaddingTop;
                if (i13 + i22 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                    float dp4 = AndroidUtilities.dp(4.0f) + dp;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - i22;
                    i20 = ((f3) lg0Var).backgroundPaddingTop;
                    float min = Math.min(1.0f, (currentActionBarHeight - i20) / dp4);
                    int currentActionBarHeight2 = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp4) * min);
                    i22 -= currentActionBarHeight2;
                    dp2 -= currentActionBarHeight2;
                    i23 += currentActionBarHeight2;
                    f9 = 1.0f - min;
                } else {
                    f9 = 1.0f;
                }
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = dp2 + i24;
                drawable.setBounds(0, i22 + i24, getMeasuredWidth(), i23);
                drawable.draw(canvas);
                if (f9 != 1.0f) {
                    g6.t0.setColor(g6.w0(null, g6.h5, false));
                    i16 = ((f3) lg0Var).backgroundPaddingLeft;
                    i17 = ((f3) lg0Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i18 = ((f3) lg0Var).backgroundPaddingLeft;
                    float f10 = measuredWidth - i18;
                    i19 = ((f3) lg0Var).backgroundPaddingTop;
                    rectF.set(i16, i17 + r4, f10, AndroidUtilities.dp(24.0f) + i19 + r4);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f9, AndroidUtilities.dp(12.0f) * f9, g6.t0);
                }
                if (f9 != 0.0f) {
                    int dp5 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp5) / 2, i25, (getMeasuredWidth() + dp5) / 2, AndroidUtilities.dp(4.0f) + i25);
                    int w02 = g6.w0(null, g6.Ii, false);
                    int alpha = Color.alpha(w02);
                    g6.t0.setColor(w02);
                    g6.t0.setAlpha((int) (alpha * 1.0f * f9));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), g6.t0);
                }
                int w03 = g6.w0(null, g6.h5, false);
                g6.t0.setColor(Color.argb((int) (lg0Var.f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                i14 = ((f3) lg0Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth2 = getMeasuredWidth();
                i15 = ((f3) lg0Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth2 - i15, AndroidUtilities.statusBarHeight, g6.t0);
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
                lg0 lg0Var = (lg0) this.d;
                if (motionEvent.getAction() == 0 && lg0Var.A != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + lg0Var.A && lg0Var.f.getAlpha() == 0.0f) {
                        lg0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                lg0.t((lg0) this.d);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int M;
        int i13;
        int i14;
        int i15;
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                lg0 lg0Var = (lg0) this.d;
                x5 x5Var = lg0Var.y;
                hg0 hg0Var = lg0Var.c;
                fg0 fg0Var = lg0Var.b;
                z10 = ((f3) lg0Var).isFullscreen;
                if (!z10) {
                    this.b = true;
                    i14 = ((f3) lg0Var).backgroundPaddingLeft;
                    int i16 = AndroidUtilities.statusBarHeight;
                    i15 = ((f3) lg0Var).backgroundPaddingLeft;
                    setPadding(i14, i16, i15, 0);
                    this.b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) fg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) lg0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                i12 = ((f3) lg0Var).backgroundPaddingTop;
                int dp = AndroidUtilities.dp(15.0f) + i12 + AndroidUtilities.statusBarHeight;
                int R = hg0Var.R();
                for (int i17 = 0; i17 < R; i17++) {
                    if (i17 == 0) {
                        i13 = ((f3) lg0Var).backgroundPaddingLeft;
                        x5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (i13 * 2)), TLObject.FLAG_30), i11);
                        M = x5Var.getMeasuredHeight();
                    } else {
                        M = ((hg0Var.M(i17) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                int dp2 = AndroidUtilities.dp(8.0f) + (dp < paddingTop ? paddingTop - dp : paddingTop - ((paddingTop / 5) * 3));
                if (fg0Var.getPaddingTop() != dp2) {
                    this.b = true;
                    fg0Var.setPinnedSectionOffsetY(-dp2);
                    fg0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
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
                return !((lg0) this.d).isDismissed() && super.onTouchEvent(motionEvent);
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
    public y(ng0 ng0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = ng0Var;
        this.b = z10;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u41 u41Var, Context context, boolean z10) {
        super(context);
        this.d = u41Var;
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(fy fyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = fyVar;
        this.b = z10;
        this.c = new Paint(1);
    }
}
