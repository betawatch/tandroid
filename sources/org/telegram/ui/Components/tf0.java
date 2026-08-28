package org.telegram.ui.Components;

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
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tf0 extends FrameLayout {
    public final /* synthetic */ int a = 4;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(ag0 ag0Var, Context context) {
        super(context);
        this.d = ag0Var;
        this.b = false;
        this.c = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i9 = this.a;
        Object obj = this.d;
        switch (i9) {
            case 1:
                Paint paint = (Paint) this.c;
                if (this.b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.dy) obj).getThemedColor(org.telegram.ui.ActionBar.f6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                Paint paint2 = (Paint) this.c;
                if (this.b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.ng0) obj).getThemedColor(org.telegram.ui.ActionBar.f6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                org.telegram.ui.s41 s41Var = (org.telegram.ui.s41) obj;
                if (!this.b && s41Var.r > 0.0f) {
                    if (((Paint) this.c) == null) {
                        Paint paint3 = new Paint();
                        this.c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.c).setAlpha((int) (s41Var.r * 255.0f));
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
            case 4:
                boolean z10 = this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j10);
                }
                boolean drawChild = super.drawChild(canvas, view, j10);
                float f10 = limitPreviewView.a;
                boolean z11 = false;
                boolean z12 = f10 != 0.0f && f10 <= 1.0f && z10;
                if (f10 == 1.0f && !z10) {
                    z11 = true;
                }
                if ((!z12 && !z11) || limitPreviewView.a0 == null) {
                    return drawChild;
                }
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.c, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.u5) ((org.telegram.ui.b1) limitPreviewView.a0).b).s0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                canvas.restore();
                invalidate();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i9;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.c;
                int dp = AndroidUtilities.dp(13.0f);
                ag0 ag0Var = (ag0) this.d;
                Drawable drawable = ag0Var.d;
                int i20 = ag0Var.A;
                i9 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingTop;
                int i21 = (i20 - i9) - dp;
                i10 = ((org.telegram.ui.ActionBar.f3) ag0Var).currentSheetAnimationType;
                if (i10 == 1) {
                    i21 = (int) (ag0Var.b.getTranslationY() + i21);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + i21;
                int dp3 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                i11 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingTop;
                int i22 = i11 + dp3;
                i12 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingTop;
                if (i12 + i21 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp4 = AndroidUtilities.dp(4.0f) + dp;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i21;
                    i19 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingTop;
                    float min = Math.min(1.0f, (currentActionBarHeight - i19) / dp4);
                    int currentActionBarHeight2 = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp4) * min);
                    i21 -= currentActionBarHeight2;
                    dp2 -= currentActionBarHeight2;
                    i22 += currentActionBarHeight2;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i23 = AndroidUtilities.statusBarHeight;
                int i24 = dp2 + i23;
                drawable.setBounds(0, i21 + i23, getMeasuredWidth(), i22);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.f6.t0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false));
                    i15 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingLeft;
                    i16 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i17 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingLeft;
                    float f11 = measuredWidth - i17;
                    i18 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingTop;
                    rectF.set(i15, i16 + r4, f11, AndroidUtilities.dp(24.0f) + i18 + r4);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.t0);
                }
                if (f10 != 0.0f) {
                    int dp5 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp5) / 2, i24, (getMeasuredWidth() + dp5) / 2, AndroidUtilities.dp(4.0f) + i24);
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ii, false);
                    int alpha = Color.alpha(w02);
                    org.telegram.ui.ActionBar.f6.t0.setColor(w02);
                    org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
                }
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.h5, false);
                org.telegram.ui.ActionBar.f6.t0.setColor(Color.argb((int) (ag0Var.f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                i13 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingLeft;
                float f12 = i13;
                int measuredWidth2 = getMeasuredWidth();
                i14 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingLeft;
                canvas.drawRect(f12, 0.0f, measuredWidth2 - i14, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.f6.t0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ag0 ag0Var = (ag0) this.d;
                if (motionEvent.getAction() == 0 && ag0Var.A != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + ag0Var.A && ag0Var.f.getAlpha() == 0.0f) {
                        ag0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                ag0.t((ag0) this.d);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        boolean z10;
        int i11;
        int M;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                ag0 ag0Var = (ag0) this.d;
                s5 s5Var = ag0Var.y;
                wf0 wf0Var = ag0Var.c;
                uf0 uf0Var = ag0Var.b;
                z10 = ((org.telegram.ui.ActionBar.f3) ag0Var).isFullscreen;
                if (!z10) {
                    this.b = true;
                    i13 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingLeft;
                    int i15 = AndroidUtilities.statusBarHeight;
                    i14 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingLeft;
                    setPadding(i13, i15, i14, 0);
                    this.b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) uf0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) ag0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                i11 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingTop;
                int dp = AndroidUtilities.dp(15.0f) + i11 + AndroidUtilities.statusBarHeight;
                int R = wf0Var.R();
                for (int i16 = 0; i16 < R; i16++) {
                    if (i16 == 0) {
                        i12 = ((org.telegram.ui.ActionBar.f3) ag0Var).backgroundPaddingLeft;
                        s5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9 - (i12 * 2)), TLObject.FLAG_30), i10);
                        M = s5Var.getMeasuredHeight();
                    } else {
                        M = ((wf0Var.M(i16) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                int dp2 = AndroidUtilities.dp(8.0f) + (dp < paddingTop ? paddingTop - dp : paddingTop - ((paddingTop / 5) * 3));
                if (uf0Var.getPaddingTop() != dp2) {
                    this.b = true;
                    uf0Var.setPinnedSectionOffsetY(-dp2);
                    uf0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
                    this.b = false;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return !((ag0) this.d).isDismissed() && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 0:
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
    public tf0(org.telegram.ui.ng0 ng0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = ng0Var;
        this.b = z10;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(org.telegram.ui.s41 s41Var, Context context, boolean z10) {
        super(context);
        this.d = s41Var;
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf0(org.telegram.ui.dy dyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = dyVar;
        this.b = z10;
        this.c = new Paint(1);
    }
}
