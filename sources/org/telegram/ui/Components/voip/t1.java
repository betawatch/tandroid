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
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t1 extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ u1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, Context context) {
        super(context);
        this.f = u1Var;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new cg.p0(21));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        u1 u1Var = this.f;
        u1Var.r.setPivotX(u1Var.s.getMeasuredWidth());
        u1Var.r.setPivotY(u1Var.s.getMeasuredHeight());
        u1Var.r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * u1Var.w);
        u1Var.r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * u1Var.w);
        u1Var.r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * u1Var.w);
        u1Var.r.setScaleX(((1.0f - u1Var.w) * 0.6f) + 0.4f);
        u1Var.r.setScaleY(((1.0f - u1Var.w) * 0.6f) + 0.4f);
        u1Var.r.setAlpha(Math.min(1.0f, 1.0f - u1Var.w));
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
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
        u1 u1Var = this.f;
        if (u1.V || u1.W == null) {
            return false;
        }
        org.telegram.messenger.g0.r(u1Var.O);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    u1 u1Var2 = this.f;
                    float f10 = rawX - u1Var2.J;
                    float f11 = rawY - u1Var2.K;
                    if (!u1Var2.L) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.a;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            u1 u1Var3 = this.f;
                            u1Var3.L = true;
                            u1Var3.J = rawX;
                            u1Var3.K = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    u1 u1Var4 = this.f;
                    if (u1Var4.L) {
                        WindowManager.LayoutParams layoutParams = u1Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f10);
                        layoutParams.y = (int) (layoutParams.y + f11);
                        u1Var4.J = rawX;
                        u1Var4.K = rawY;
                        org.telegram.messenger.g0.T3(u1Var4.c, u1Var4.a, layoutParams);
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
                    zb1.v((Activity) context, this.f.N);
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
                int i3 = point.x;
                int i10 = point.y + u1.Y;
                float f14 = this.d;
                float f15 = this.e;
                u1 u1Var5 = this.f;
                float left = u1Var5.b.getLeft() + u1Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                u1 u1Var6 = this.f;
                float top = u1Var6.b.getTop() + u1Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.P = new AnimatorSet();
                float f16 = this.b;
                if (left < f16) {
                    u1 u1Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(u1Var7.d.x, f16 - u1Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat);
                } else if (measuredWidth > i3 - this.c) {
                    u1 u1Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(u1Var8.d.x, (i3 - u1Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.Q);
                    this.f.P.playTogether(ofFloat2);
                }
                if (top < f14) {
                    u1 u1Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(u1Var9.d.y, f14 - u1Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat3);
                } else if (measuredHeight > i10 - f15) {
                    u1 u1Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(u1Var10.d.y, (i10 - u1Var10.b.getMeasuredHeight()) - f15);
                    ofFloat4.addUpdateListener(this.f.R);
                    this.f.P.playTogether(ofFloat4);
                }
                this.f.P.setDuration(150L).setInterpolator(xq.f);
                this.f.P.start();
            }
            this.f.L = false;
            u1.W.getClass();
            return true;
        }
        u1 u1Var11 = this.f;
        u1Var11.J = rawX;
        u1Var11.K = rawY;
        u1Var11.M = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.P;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
