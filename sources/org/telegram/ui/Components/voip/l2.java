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
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
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
        setOutlineProvider(new gg.j1(14));
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
        if (m2.Q || m2.R == null) {
            return false;
        }
        AndroidUtilities.cancelRunOnUIThread(m2Var.J);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    m2 m2Var2 = this.f;
                    float f10 = rawX - m2Var2.E;
                    float f11 = rawY - m2Var2.F;
                    if (!m2Var2.G) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.a;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            m2 m2Var3 = this.f;
                            m2Var3.G = true;
                            m2Var3.E = rawX;
                            m2Var3.F = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    m2 m2Var4 = this.f;
                    if (m2Var4.G) {
                        WindowManager.LayoutParams layoutParams = m2Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f10);
                        layoutParams.y = (int) (layoutParams.y + f11);
                        m2Var4.E = rawX;
                        m2Var4.F = rawY;
                        AndroidUtilities.updateViewLayout(m2Var4.c, m2Var4.a, layoutParams);
                        return true;
                    }
                }
            }
            AnimatorSet animatorSet = this.f.K;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (motionEvent.getAction() == 1 && !this.f.G && System.currentTimeMillis() - this.f.H < 150) {
                Context context = getContext();
                boolean z4 = context instanceof LaunchActivity;
                if (z4 && !ApplicationLoader.mainInterfacePaused) {
                    ai1.w((Activity) context, this.f.I);
                } else if (z4) {
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.setAction("voip");
                    context.startActivity(intent);
                }
                this.f.G = false;
                return false;
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                Point point = AndroidUtilities.displaySize;
                int i10 = point.x;
                int i11 = point.y + m2.T;
                float f14 = this.d;
                float f15 = this.e;
                m2 m2Var5 = this.f;
                float left = m2Var5.b.getLeft() + m2Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                m2 m2Var6 = this.f;
                float top = m2Var6.b.getTop() + m2Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.K = new AnimatorSet();
                float f16 = this.b;
                if (left < f16) {
                    m2 m2Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(m2Var7.d.x, f16 - m2Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.L);
                    this.f.K.playTogether(ofFloat);
                } else if (measuredWidth > i10 - this.c) {
                    m2 m2Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m2Var8.d.x, (i10 - m2Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.L);
                    this.f.K.playTogether(ofFloat2);
                }
                if (top < f14) {
                    m2 m2Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(m2Var9.d.y, f14 - m2Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.M);
                    this.f.K.playTogether(ofFloat3);
                } else if (measuredHeight > i11 - f15) {
                    m2 m2Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(m2Var10.d.y, (i11 - m2Var10.b.getMeasuredHeight()) - f15);
                    ofFloat4.addUpdateListener(this.f.M);
                    this.f.K.playTogether(ofFloat4);
                }
                this.f.K.setDuration(150L).setInterpolator(nr.f);
                this.f.K.start();
            }
            this.f.G = false;
            m2.R.getClass();
            return true;
        }
        m2 m2Var11 = this.f;
        m2Var11.E = rawX;
        m2Var11.F = rawY;
        m2Var11.H = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.K;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
