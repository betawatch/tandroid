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
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zd1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        setOutlineProvider(new bi.d2(18));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        u1 u1Var = this.f;
        u1Var.r.setPivotX(u1Var.s.getMeasuredWidth());
        u1Var.r.setPivotY(u1Var.s.getMeasuredHeight());
        u1Var.r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.i0.L(4.0f)) * u1Var.w);
        u1Var.r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.i0.L(4.0f)) * u1Var.w);
        u1Var.r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.i0.L(8.0f) * u1Var.w);
        u1Var.r.setScaleX(((1.0f - u1Var.w) * 0.6f) + 0.4f);
        u1Var.r.setScaleY(((1.0f - u1Var.w) * 0.6f) + 0.4f);
        u1Var.r.setAlpha(Math.min(1.0f, 1.0f - u1Var.w));
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.b = org.telegram.messenger.i0.L(16.0f);
        this.c = org.telegram.messenger.i0.L(16.0f);
        this.d = org.telegram.messenger.i0.L(60.0f);
        this.e = org.telegram.messenger.i0.L(16.0f);
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
        if (u1.U || u1.V == null) {
            return false;
        }
        org.telegram.messenger.i0.r(u1Var.N);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    u1 u1Var2 = this.f;
                    float f7 = rawX - u1Var2.I;
                    float f10 = rawY - u1Var2.J;
                    if (!u1Var2.K) {
                        float f11 = (f10 * f10) + (f7 * f7);
                        float f12 = this.a;
                        if (f11 > f12 * f12) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            u1 u1Var3 = this.f;
                            u1Var3.K = true;
                            u1Var3.I = rawX;
                            u1Var3.J = rawY;
                            f7 = 0.0f;
                            f10 = 0.0f;
                        }
                    }
                    u1 u1Var4 = this.f;
                    if (u1Var4.K) {
                        WindowManager.LayoutParams layoutParams = u1Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f7);
                        layoutParams.y = (int) (layoutParams.y + f10);
                        u1Var4.I = rawX;
                        u1Var4.J = rawY;
                        org.telegram.messenger.i0.S3(u1Var4.c, u1Var4.a, layoutParams);
                        return true;
                    }
                }
            }
            AnimatorSet animatorSet = this.f.O;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (motionEvent.getAction() == 1 && !this.f.K && System.currentTimeMillis() - this.f.L < 150) {
                Context context = getContext();
                boolean z10 = context instanceof LaunchActivity;
                if (z10 && !org.telegram.messenger.w0.x) {
                    zd1.v((Activity) context, this.f.M);
                } else if (z10) {
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.setAction("voip");
                    context.startActivity(intent);
                }
                this.f.K = false;
                return false;
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                Point point = org.telegram.messenger.i0.q;
                int i10 = point.x;
                int i11 = point.y + u1.X;
                float f13 = this.d;
                float f14 = this.e;
                u1 u1Var5 = this.f;
                float left = u1Var5.b.getLeft() + u1Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                u1 u1Var6 = this.f;
                float top = u1Var6.b.getTop() + u1Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.O = new AnimatorSet();
                float f15 = this.b;
                if (left < f15) {
                    u1 u1Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(u1Var7.d.x, f15 - u1Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.P);
                    this.f.O.playTogether(ofFloat);
                } else if (measuredWidth > i10 - this.c) {
                    u1 u1Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(u1Var8.d.x, (i10 - u1Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.P);
                    this.f.O.playTogether(ofFloat2);
                }
                if (top < f13) {
                    u1 u1Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(u1Var9.d.y, f13 - u1Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.Q);
                    this.f.O.playTogether(ofFloat3);
                } else if (measuredHeight > i11 - f14) {
                    u1 u1Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(u1Var10.d.y, (i11 - u1Var10.b.getMeasuredHeight()) - f14);
                    ofFloat4.addUpdateListener(this.f.Q);
                    this.f.O.playTogether(ofFloat4);
                }
                this.f.O.setDuration(150L).setInterpolator(gr.f);
                this.f.O.start();
            }
            this.f.K = false;
            u1.V.getClass();
            return true;
        }
        u1 u1Var11 = this.f;
        u1Var11.I = rawX;
        u1Var11.J = rawY;
        u1Var11.L = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.O;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
