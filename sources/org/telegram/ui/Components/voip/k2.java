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
import org.telegram.ui.Components.er;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k2 extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ l2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, Context context) {
        super(context);
        this.f = l2Var;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new cg.l1(16));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l2 l2Var = this.f;
        l2Var.n.setPivotX(l2Var.r.getMeasuredWidth());
        l2Var.n.setPivotY(l2Var.r.getMeasuredHeight());
        l2Var.n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * l2Var.s);
        l2Var.n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * l2Var.s);
        l2Var.n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * l2Var.s);
        l2Var.n.setScaleX(((1.0f - l2Var.s) * 0.6f) + 0.4f);
        l2Var.n.setScaleY(((1.0f - l2Var.s) * 0.6f) + 0.4f);
        l2Var.n.setAlpha(Math.min(1.0f, 1.0f - l2Var.s));
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
        l2 l2Var = this.f;
        if (l2.P || l2.Q == null) {
            return false;
        }
        AndroidUtilities.cancelRunOnUIThread(l2Var.I);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    l2 l2Var2 = this.f;
                    float f10 = rawX - l2Var2.D;
                    float f11 = rawY - l2Var2.E;
                    if (!l2Var2.F) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.a;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            l2 l2Var3 = this.f;
                            l2Var3.F = true;
                            l2Var3.D = rawX;
                            l2Var3.E = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    l2 l2Var4 = this.f;
                    if (l2Var4.F) {
                        WindowManager.LayoutParams layoutParams = l2Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f10);
                        layoutParams.y = (int) (layoutParams.y + f11);
                        l2Var4.D = rawX;
                        l2Var4.E = rawY;
                        AndroidUtilities.updateViewLayout(l2Var4.c, l2Var4.a, layoutParams);
                        return true;
                    }
                }
            }
            AnimatorSet animatorSet = this.f.J;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (motionEvent.getAction() == 1 && !this.f.F && System.currentTimeMillis() - this.f.G < 150) {
                Context context = getContext();
                boolean z10 = context instanceof LaunchActivity;
                if (z10 && !ApplicationLoader.mainInterfacePaused) {
                    lh1.w((Activity) context, this.f.H);
                } else if (z10) {
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.setAction("voip");
                    context.startActivity(intent);
                }
                this.f.F = false;
                return false;
            }
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                Point point = AndroidUtilities.displaySize;
                int i10 = point.x;
                int i11 = point.y + l2.S;
                float f14 = this.d;
                float f15 = this.e;
                l2 l2Var5 = this.f;
                float left = l2Var5.b.getLeft() + l2Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                l2 l2Var6 = this.f;
                float top = l2Var6.b.getTop() + l2Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.J = new AnimatorSet();
                float f16 = this.b;
                if (left < f16) {
                    l2 l2Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(l2Var7.d.x, f16 - l2Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.K);
                    this.f.J.playTogether(ofFloat);
                } else if (measuredWidth > i10 - this.c) {
                    l2 l2Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(l2Var8.d.x, (i10 - l2Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.K);
                    this.f.J.playTogether(ofFloat2);
                }
                if (top < f14) {
                    l2 l2Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(l2Var9.d.y, f14 - l2Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.L);
                    this.f.J.playTogether(ofFloat3);
                } else if (measuredHeight > i11 - f15) {
                    l2 l2Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(l2Var10.d.y, (i11 - l2Var10.b.getMeasuredHeight()) - f15);
                    ofFloat4.addUpdateListener(this.f.L);
                    this.f.J.playTogether(ofFloat4);
                }
                this.f.J.setDuration(150L).setInterpolator(er.f);
                this.f.J.start();
            }
            this.f.F = false;
            l2.Q.getClass();
            return true;
        }
        l2 l2Var11 = this.f;
        l2Var11.D = rawX;
        l2Var11.E = rawY;
        l2Var11.G = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.J;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
