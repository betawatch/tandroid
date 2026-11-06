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
import org.telegram.ui.ec1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class d2 extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ e2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(e2 e2Var, Context context) {
        super(context);
        this.f = e2Var;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bg.q0(18));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e2 e2Var = this.f;
        e2Var.r.setPivotX(e2Var.s.getMeasuredWidth());
        e2Var.r.setPivotY(e2Var.s.getMeasuredHeight());
        e2Var.r.setTranslationX((1.0f / getScaleX()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.w);
        e2Var.r.setTranslationY((1.0f / getScaleY()) * (-org.telegram.messenger.g0.L(4.0f)) * e2Var.w);
        e2Var.r.setRoundCorners((1.0f / getScaleY()) * org.telegram.messenger.g0.L(8.0f) * e2Var.w);
        e2Var.r.setScaleX(((1.0f - e2Var.w) * 0.6f) + 0.4f);
        e2Var.r.setScaleY(((1.0f - e2Var.w) * 0.6f) + 0.4f);
        e2Var.r.setAlpha(Math.min(1.0f, 1.0f - e2Var.w));
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
        e2 e2Var = this.f;
        if (e2.S || e2.T == null) {
            return false;
        }
        org.telegram.messenger.g0.r(e2Var.N);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    e2 e2Var2 = this.f;
                    float f10 = rawX - e2Var2.I;
                    float f11 = rawY - e2Var2.J;
                    if (!e2Var2.K) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.a;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            e2 e2Var3 = this.f;
                            e2Var3.K = true;
                            e2Var3.I = rawX;
                            e2Var3.J = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    e2 e2Var4 = this.f;
                    if (e2Var4.K) {
                        WindowManager.LayoutParams layoutParams = e2Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f10);
                        layoutParams.y = (int) (layoutParams.y + f11);
                        e2Var4.I = rawX;
                        e2Var4.J = rawY;
                        org.telegram.messenger.g0.T3(e2Var4.c, e2Var4.a, layoutParams);
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
                boolean z9 = context instanceof LaunchActivity;
                if (z9 && !org.telegram.messenger.t0.x) {
                    ec1.n((Activity) context, this.f.M);
                } else if (z9) {
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.setAction("voip");
                    context.startActivity(intent);
                }
                this.f.K = false;
                return false;
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                Point point = org.telegram.messenger.g0.q;
                int i7 = point.x;
                int i10 = point.y + e2.V;
                float f14 = this.d;
                float f15 = this.e;
                e2 e2Var5 = this.f;
                float left = e2Var5.b.getLeft() + e2Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                e2 e2Var6 = this.f;
                float top = e2Var6.b.getTop() + e2Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.O = new AnimatorSet();
                float f16 = this.b;
                if (left < f16) {
                    e2 e2Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(e2Var7.d.x, f16 - e2Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.P);
                    this.f.O.playTogether(ofFloat);
                } else if (measuredWidth > i7 - this.c) {
                    e2 e2Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(e2Var8.d.x, (i7 - e2Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.P);
                    this.f.O.playTogether(ofFloat2);
                }
                if (top < f14) {
                    e2 e2Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(e2Var9.d.y, f14 - e2Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.Q);
                    this.f.O.playTogether(ofFloat3);
                } else if (measuredHeight > i10 - f15) {
                    e2 e2Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(e2Var10.d.y, (i10 - e2Var10.b.getMeasuredHeight()) - f15);
                    ofFloat4.addUpdateListener(this.f.Q);
                    this.f.O.playTogether(ofFloat4);
                }
                this.f.O.setDuration(150L).setInterpolator(xq.f);
                this.f.O.start();
            }
            this.f.K = false;
            e2.T.getClass();
            return true;
        }
        e2 e2Var11 = this.f;
        e2Var11.I = rawX;
        e2Var11.J = rawY;
        e2Var11.L = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.O;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
