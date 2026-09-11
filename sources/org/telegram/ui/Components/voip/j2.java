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
import org.telegram.ui.ui1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class j2 extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ k2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(k2 k2Var, Context context) {
        super(context);
        this.f = k2Var;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new bi.z1(16));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k2 k2Var = this.f;
        k2Var.n.setPivotX(k2Var.r.getMeasuredWidth());
        k2Var.n.setPivotY(k2Var.r.getMeasuredHeight());
        k2Var.n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * k2Var.s);
        k2Var.n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * k2Var.s);
        k2Var.n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * k2Var.s);
        k2Var.n.setScaleX(((1.0f - k2Var.s) * 0.6f) + 0.4f);
        k2Var.n.setScaleY(((1.0f - k2Var.s) * 0.6f) + 0.4f);
        k2Var.n.setAlpha(Math.min(1.0f, 1.0f - k2Var.s));
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
        k2 k2Var = this.f;
        if (k2.T || k2.U == null) {
            return false;
        }
        AndroidUtilities.cancelRunOnUIThread(k2Var.M);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    k2 k2Var2 = this.f;
                    float f7 = rawX - k2Var2.H;
                    float f10 = rawY - k2Var2.I;
                    if (!k2Var2.J) {
                        float f11 = (f10 * f10) + (f7 * f7);
                        float f12 = this.a;
                        if (f11 > f12 * f12) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            k2 k2Var3 = this.f;
                            k2Var3.J = true;
                            k2Var3.H = rawX;
                            k2Var3.I = rawY;
                            f7 = 0.0f;
                            f10 = 0.0f;
                        }
                    }
                    k2 k2Var4 = this.f;
                    if (k2Var4.J) {
                        WindowManager.LayoutParams layoutParams = k2Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f7);
                        layoutParams.y = (int) (layoutParams.y + f10);
                        k2Var4.H = rawX;
                        k2Var4.I = rawY;
                        AndroidUtilities.updateViewLayout(k2Var4.c, k2Var4.a, layoutParams);
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
                    ui1.w((Activity) context, this.f.L);
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
                int i11 = point.y + k2.W;
                float f13 = this.d;
                float f14 = this.e;
                k2 k2Var5 = this.f;
                float left = k2Var5.b.getLeft() + k2Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                k2 k2Var6 = this.f;
                float top = k2Var6.b.getTop() + k2Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.N = new AnimatorSet();
                float f15 = this.b;
                if (left < f15) {
                    k2 k2Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(k2Var7.d.x, f15 - k2Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.O);
                    this.f.N.playTogether(ofFloat);
                } else if (measuredWidth > i10 - this.c) {
                    k2 k2Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(k2Var8.d.x, (i10 - k2Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.O);
                    this.f.N.playTogether(ofFloat2);
                }
                if (top < f13) {
                    k2 k2Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(k2Var9.d.y, f13 - k2Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.P);
                    this.f.N.playTogether(ofFloat3);
                } else if (measuredHeight > i11 - f14) {
                    k2 k2Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(k2Var10.d.y, (i11 - k2Var10.b.getMeasuredHeight()) - f14);
                    ofFloat4.addUpdateListener(this.f.P);
                    this.f.N.playTogether(ofFloat4);
                }
                this.f.N.setDuration(150L).setInterpolator(pr.f);
                this.f.N.start();
            }
            this.f.J = false;
            k2.U.getClass();
            return true;
        }
        k2 k2Var11 = this.f;
        k2Var11.H = rawX;
        k2Var11.I = rawY;
        k2Var11.K = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.N;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
