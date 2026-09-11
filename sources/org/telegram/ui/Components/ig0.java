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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ig0 extends FrameLayout {
    public final /* synthetic */ int a = 4;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(pg0 pg0Var, Context context) {
        super(context);
        this.d = pg0Var;
        this.b = false;
        this.c = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.c;
                if (this.b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.uy) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                Paint paint2 = (Paint) this.c;
                if (this.b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.eh0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) obj;
                if (!this.b && a61Var.r > 0.0f) {
                    if (((Paint) this.c) == null) {
                        Paint paint3 = new Paint();
                        this.c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.c).setAlpha((int) (a61Var.r * 255.0f));
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 4:
                boolean z10 = this.b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (!(view instanceof TextView)) {
                    return super.drawChild(canvas, view, j3);
                }
                boolean drawChild = super.drawChild(canvas, view, j3);
                float f7 = limitPreviewView.a;
                boolean z11 = false;
                boolean z12 = f7 != 0.0f && f7 <= 1.0f && z10;
                if (f7 == 1.0f && !z10) {
                    z11 = true;
                }
                if ((!z12 && !z11) || limitPreviewView.e0 == null) {
                    return drawChild;
                }
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.c, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.v5) ((org.telegram.ui.z0) limitPreviewView.e0).b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                canvas.restore();
                invalidate();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.c;
                int dp = AndroidUtilities.dp(13.0f);
                pg0 pg0Var = (pg0) this.d;
                Drawable drawable = pg0Var.d;
                int i21 = pg0Var.E;
                i10 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingTop;
                int i22 = (i21 - i10) - dp;
                i11 = ((org.telegram.ui.ActionBar.f3) pg0Var).currentSheetAnimationType;
                if (i11 == 1) {
                    i22 = (int) (pg0Var.b.getTranslationY() + i22);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + i22;
                int dp3 = AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                i12 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingTop;
                int i23 = i12 + dp3;
                i13 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingTop;
                if (i13 + i22 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp4 = AndroidUtilities.dp(4.0f) + dp;
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - i22;
                    i20 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingTop;
                    float min = Math.min(1.0f, (currentActionBarHeight - i20) / dp4);
                    int currentActionBarHeight2 = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp4) * min);
                    i22 -= currentActionBarHeight2;
                    dp2 -= currentActionBarHeight2;
                    i23 += currentActionBarHeight2;
                    f7 = 1.0f - min;
                } else {
                    f7 = 1.0f;
                }
                int i24 = AndroidUtilities.statusBarHeight;
                int i25 = dp2 + i24;
                drawable.setBounds(0, i22 + i24, getMeasuredWidth(), i23);
                drawable.draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false));
                    i16 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingLeft;
                    i17 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i18 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingLeft;
                    float f10 = measuredWidth - i18;
                    i19 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingTop;
                    rectF.set(i16, i17 + r4, f10, AndroidUtilities.dp(24.0f) + i19 + r4);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.t0);
                }
                if (f7 != 0.0f) {
                    int dp5 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp5) / 2, i25, (getMeasuredWidth() + dp5) / 2, AndroidUtilities.dp(4.0f) + i25);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false);
                    int alpha = Color.alpha(w02);
                    org.telegram.ui.ActionBar.j6.t0.setColor(w02);
                    org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
                }
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
                org.telegram.ui.ActionBar.j6.t0.setColor(Color.argb((int) (pg0Var.f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                i14 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingLeft;
                float f11 = i14;
                int measuredWidth2 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingLeft;
                canvas.drawRect(f11, 0.0f, measuredWidth2 - i15, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.j6.t0);
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
                pg0 pg0Var = (pg0) this.d;
                if (motionEvent.getAction() == 0 && pg0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + pg0Var.E && pg0Var.f.getAlpha() == 0.0f) {
                        pg0Var.dismiss();
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
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                pg0.t((pg0) this.d);
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
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                pg0 pg0Var = (pg0) this.d;
                y5 y5Var = pg0Var.y;
                lg0 lg0Var = pg0Var.c;
                jg0 jg0Var = pg0Var.b;
                z10 = ((org.telegram.ui.ActionBar.f3) pg0Var).isFullscreen;
                if (!z10) {
                    this.b = true;
                    i14 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingLeft;
                    int i16 = AndroidUtilities.statusBarHeight;
                    i15 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingLeft;
                    setPadding(i14, i16, i15, 0);
                    this.b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) jg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) pg0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                i12 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingTop;
                int dp = AndroidUtilities.dp(15.0f) + i12 + AndroidUtilities.statusBarHeight;
                int R = lg0Var.R();
                for (int i17 = 0; i17 < R; i17++) {
                    if (i17 == 0) {
                        i13 = ((org.telegram.ui.ActionBar.f3) pg0Var).backgroundPaddingLeft;
                        y5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (i13 * 2)), TLObject.FLAG_30), i11);
                        M = y5Var.getMeasuredHeight();
                    } else {
                        M = ((lg0Var.M(i17) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                int dp2 = AndroidUtilities.dp(8.0f) + (dp < paddingTop ? paddingTop - dp : paddingTop - ((paddingTop / 5) * 3));
                if (jg0Var.getPaddingTop() != dp2) {
                    this.b = true;
                    jg0Var.setPinnedSectionOffsetY(-dp2);
                    jg0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
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
            case 0:
                return !((pg0) this.d).isDismissed() && super.onTouchEvent(motionEvent);
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
    public ig0(org.telegram.ui.eh0 eh0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = eh0Var;
        this.b = z10;
        this.c = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(org.telegram.ui.a61 a61Var, Context context, boolean z10) {
        super(context);
        this.d = a61Var;
        this.b = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(org.telegram.ui.uy uyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = uyVar;
        this.b = z10;
        this.c = new Paint(1);
    }
}
