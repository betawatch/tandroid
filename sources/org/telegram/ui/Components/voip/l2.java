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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.Components.qr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ti1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class l2 extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ m2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(m2 m2Var, Context context) {
        super(context);
        this.f = m2Var;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new ai.k2(18));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        m2 m2Var = this.f;
        m2Var.n.setPivotX(m2Var.r.getMeasuredWidth());
        m2Var.n.setPivotY(m2Var.r.getMeasuredHeight());
        m2Var.n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * m2Var.s);
        m2Var.n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * m2Var.s);
        m2Var.n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * m2Var.s);
        m2Var.n.setScaleX(((1.0f - m2Var.s) * 0.6f) + 0.4f);
        m2Var.n.setScaleY(((1.0f - m2Var.s) * 0.6f) + 0.4f);
        m2Var.n.setAlpha(Math.min(1.0f, 1.0f - m2Var.s));
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.b = AndroidUtilities.dp(16.0f);
        this.c = AndroidUtilities.dp(16.0f);
        this.d = AndroidUtilities.dp(60.0f);
        this.e = AndroidUtilities.dp(16.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r4 != 3) goto L63;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m2 m2Var = this.f;
        if (m2.T || m2.U == null) {
            return false;
        }
        AndroidUtilities.cancelRunOnUIThread(m2Var.M);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    m2 m2Var2 = this.f;
                    float f7 = rawX - m2Var2.H;
                    float f10 = rawY - m2Var2.I;
                    if (!m2Var2.J) {
                        float f11 = (f10 * f10) + (f7 * f7);
                        float f12 = this.a;
                        if (f11 > f12 * f12) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            m2 m2Var3 = this.f;
                            m2Var3.J = true;
                            m2Var3.H = rawX;
                            m2Var3.I = rawY;
                            f7 = 0.0f;
                            f10 = 0.0f;
                        }
                    }
                    m2 m2Var4 = this.f;
                    if (m2Var4.J) {
                        WindowManager.LayoutParams layoutParams = m2Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f7);
                        layoutParams.y = (int) (layoutParams.y + f10);
                        m2Var4.H = rawX;
                        m2Var4.I = rawY;
                        AndroidUtilities.updateViewLayout(m2Var4.c, m2Var4.a, layoutParams);
                        return true;
                    }
                }
            }
            AnimatorSet animatorSet = this.f.N;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (motionEvent.getAction() == 1 && !this.f.J && System.currentTimeMillis() - this.f.K < 150) {
                Context context = getContext();
                boolean z10 = context instanceof LaunchActivity;
                if (z10 && !ApplicationLoader.mainInterfacePaused) {
                    ti1.w((Activity) context, this.f.L);
                } else if (z10) {
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.setAction("voip");
                    context.startActivity(intent);
                }
                this.f.J = false;
                return false;
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                Point point = AndroidUtilities.displaySize;
                int i10 = point.x;
                int i11 = point.y + m2.W;
                float f13 = this.d;
                float f14 = this.e;
                m2 m2Var5 = this.f;
                float left = m2Var5.b.getLeft() + m2Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                m2 m2Var6 = this.f;
                float top = m2Var6.b.getTop() + m2Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.N = new AnimatorSet();
                float f15 = this.b;
                if (left < f15) {
                    m2 m2Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(m2Var7.d.x, f15 - m2Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.O);
                    this.f.N.playTogether(ofFloat);
                } else if (measuredWidth > i10 - this.c) {
                    m2 m2Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m2Var8.d.x, (i10 - m2Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.O);
                    this.f.N.playTogether(ofFloat2);
                }
                if (top < f13) {
                    m2 m2Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(m2Var9.d.y, f13 - m2Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.P);
                    this.f.N.playTogether(ofFloat3);
                } else if (measuredHeight > i11 - f14) {
                    m2 m2Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(m2Var10.d.y, (i11 - m2Var10.b.getMeasuredHeight()) - f14);
                    ofFloat4.addUpdateListener(this.f.P);
                    this.f.N.playTogether(ofFloat4);
                }
                this.f.N.setDuration(150L).setInterpolator(qr.f);
                this.f.N.start();
            }
            this.f.J = false;
            m2.U.getClass();
            return true;
        }
        m2 m2Var11 = this.f;
        m2Var11.H = rawX;
        m2Var11.I = rawY;
        m2Var11.K = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.N;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
