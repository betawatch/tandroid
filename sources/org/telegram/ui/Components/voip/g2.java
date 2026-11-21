package org.telegram.ui.Components.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class g2 extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ h2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, Context context) {
        super(context);
        this.f = h2Var;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h2 h2Var = this.f;
        h2Var.r.setPivotX(h2Var.s.getMeasuredWidth());
        h2Var.r.setPivotY(h2Var.s.getMeasuredHeight());
        h2Var.r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.w);
        h2Var.r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * h2Var.w);
        h2Var.r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * h2Var.w);
        h2Var.r.setScaleX(((1.0f - h2Var.w) * 0.6f) + 0.4f);
        h2Var.r.setScaleY(((1.0f - h2Var.w) * 0.6f) + 0.4f);
        h2Var.r.setAlpha(Math.min(1.0f, 1.0f - h2Var.w));
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.b = org.telegram.messenger.g0.L(16.0f);
        this.c = org.telegram.messenger.g0.L(16.0f);
        this.d = org.telegram.messenger.g0.L(60.0f);
        this.e = org.telegram.messenger.g0.L(16.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r4 != 3) goto L63;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h2 h2Var = this.f;
        if (h2.T || h2.U == null) {
            return false;
        }
        org.telegram.messenger.g0.r(h2Var.O);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    h2 h2Var2 = this.f;
                    float f10 = rawX - h2Var2.J;
                    float f11 = rawY - h2Var2.K;
                    if (!h2Var2.L) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.a;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            h2 h2Var3 = this.f;
                            h2Var3.L = true;
                            h2Var3.J = rawX;
                            h2Var3.K = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    h2 h2Var4 = this.f;
                    if (h2Var4.L) {
                        WindowManager.LayoutParams layoutParams = h2Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f10);
                        layoutParams.y = (int) (layoutParams.y + f11);
                        h2Var4.J = rawX;
                        h2Var4.K = rawY;
                        org.telegram.messenger.g0.R3(h2Var4.c, h2Var4.a, layoutParams);
                        return true;
                    }
                }
            }
            AnimatorSet animatorSet = this.f.P;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (motionEvent.getAction() == 1 && !this.f.L && System.currentTimeMillis() - this.f.M < 150) {
                Context context = getContext();
                boolean z10 = context instanceof LaunchActivity;
                if (z10 && !org.telegram.messenger.t0.x) {
                    hc1.n((Activity) context, this.f.N);
                } else if (z10) {
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.setAction("voip");
                    context.startActivity(intent);
                }
                this.f.L = false;
                return false;
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                Point point = org.telegram.messenger.g0.q;
                int i7 = point.x;
                int i10 = point.y + h2.W;
                float f14 = this.d;
                float f15 = this.e;
                h2 h2Var5 = this.f;
                float left = h2Var5.b.getLeft() + h2Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                h2 h2Var6 = this.f;
                float top = h2Var6.b.getTop() + h2Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.P = new AnimatorSet();
                float f16 = this.b;
                if (left < f16) {
                    h2 h2Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(h2Var7.d.x, f16 - h2Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat);
                } else if (measuredWidth > i7 - this.c) {
                    h2 h2Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(h2Var8.d.x, (i7 - h2Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat2);
                }
                if (top < f14) {
                    h2 h2Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(h2Var9.d.y, f14 - h2Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat3);
                } else if (measuredHeight > i10 - f15) {
                    h2 h2Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(h2Var10.d.y, (i10 - h2Var10.b.getMeasuredHeight()) - f15);
                    ofFloat4.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat4);
                }
                this.f.P.setDuration(150L).setInterpolator(nr.f);
                this.f.P.start();
            }
            this.f.L = false;
            h2.U.getClass();
            return true;
        }
        h2 h2Var11 = this.f;
        h2Var11.J = rawX;
        h2Var11.K = rawY;
        h2Var11.M = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.P;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
