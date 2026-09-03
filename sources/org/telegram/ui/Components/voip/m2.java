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
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m2 extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ n2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(n2 n2Var, Context context) {
        super(context);
        this.f = n2Var;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new hg.j1(14));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n2 n2Var = this.f;
        n2Var.n.setPivotX(n2Var.r.getMeasuredWidth());
        n2Var.n.setPivotY(n2Var.r.getMeasuredHeight());
        n2Var.n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * n2Var.s);
        n2Var.n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * n2Var.s);
        n2Var.n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * n2Var.s);
        n2Var.n.setScaleX(((1.0f - n2Var.s) * 0.6f) + 0.4f);
        n2Var.n.setScaleY(((1.0f - n2Var.s) * 0.6f) + 0.4f);
        n2Var.n.setAlpha(Math.min(1.0f, 1.0f - n2Var.s));
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
        n2 n2Var = this.f;
        if (n2.Q || n2.R == null) {
            return false;
        }
        AndroidUtilities.cancelRunOnUIThread(n2Var.J);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    n2 n2Var2 = this.f;
                    float f10 = rawX - n2Var2.E;
                    float f11 = rawY - n2Var2.F;
                    if (!n2Var2.G) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.a;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            n2 n2Var3 = this.f;
                            n2Var3.G = true;
                            n2Var3.E = rawX;
                            n2Var3.F = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    n2 n2Var4 = this.f;
                    if (n2Var4.G) {
                        WindowManager.LayoutParams layoutParams = n2Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f10);
                        layoutParams.y = (int) (layoutParams.y + f11);
                        n2Var4.E = rawX;
                        n2Var4.F = rawY;
                        AndroidUtilities.updateViewLayout(n2Var4.c, n2Var4.a, layoutParams);
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
                    ii1.w((Activity) context, this.f.I);
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
                int i11 = point.y + n2.T;
                float f14 = this.d;
                float f15 = this.e;
                n2 n2Var5 = this.f;
                float left = n2Var5.b.getLeft() + n2Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                n2 n2Var6 = this.f;
                float top = n2Var6.b.getTop() + n2Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.K = new AnimatorSet();
                float f16 = this.b;
                if (left < f16) {
                    n2 n2Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(n2Var7.d.x, f16 - n2Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.L);
                    this.f.K.playTogether(ofFloat);
                } else if (measuredWidth > i10 - this.c) {
                    n2 n2Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(n2Var8.d.x, (i10 - n2Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.L);
                    this.f.K.playTogether(ofFloat2);
                }
                if (top < f14) {
                    n2 n2Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(n2Var9.d.y, f14 - n2Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.M);
                    this.f.K.playTogether(ofFloat3);
                } else if (measuredHeight > i11 - f15) {
                    n2 n2Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(n2Var10.d.y, (i11 - n2Var10.b.getMeasuredHeight()) - f15);
                    ofFloat4.addUpdateListener(this.f.M);
                    this.f.K.playTogether(ofFloat4);
                }
                this.f.K.setDuration(150L).setInterpolator(pr.f);
                this.f.K.start();
            }
            this.f.G = false;
            n2.R.getClass();
            return true;
        }
        n2 n2Var11 = this.f;
        n2Var11.E = rawX;
        n2Var11.F = rawY;
        n2Var11.H = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.K;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
