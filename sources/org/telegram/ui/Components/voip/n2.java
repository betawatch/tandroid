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
import org.telegram.ui.Components.jr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oh1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n2 extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    public final float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final /* synthetic */ o2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(o2 o2Var, Context context) {
        super(context);
        this.f = o2Var;
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        setOutlineProvider(new eg.k1(16));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o2 o2Var = this.f;
        o2Var.n.setPivotX(o2Var.r.getMeasuredWidth());
        o2Var.n.setPivotY(o2Var.r.getMeasuredHeight());
        o2Var.n.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * o2Var.s);
        o2Var.n.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * o2Var.s);
        o2Var.n.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * o2Var.s);
        o2Var.n.setScaleX(((1.0f - o2Var.s) * 0.6f) + 0.4f);
        o2Var.n.setScaleY(((1.0f - o2Var.s) * 0.6f) + 0.4f);
        o2Var.n.setAlpha(Math.min(1.0f, 1.0f - o2Var.s));
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
        o2 o2Var = this.f;
        if (o2.P || o2.Q == null) {
            return false;
        }
        AndroidUtilities.cancelRunOnUIThread(o2Var.I);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    o2 o2Var2 = this.f;
                    float f9 = rawX - o2Var2.D;
                    float f10 = rawY - o2Var2.E;
                    if (!o2Var2.F) {
                        float f11 = (f10 * f10) + (f9 * f9);
                        float f12 = this.a;
                        if (f11 > f12 * f12) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            o2 o2Var3 = this.f;
                            o2Var3.F = true;
                            o2Var3.D = rawX;
                            o2Var3.E = rawY;
                            f9 = 0.0f;
                            f10 = 0.0f;
                        }
                    }
                    o2 o2Var4 = this.f;
                    if (o2Var4.F) {
                        WindowManager.LayoutParams layoutParams = o2Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f9);
                        layoutParams.y = (int) (layoutParams.y + f10);
                        o2Var4.D = rawX;
                        o2Var4.E = rawY;
                        AndroidUtilities.updateViewLayout(o2Var4.c, o2Var4.a, layoutParams);
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
                    oh1.w((Activity) context, this.f.H);
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
                int i11 = point.y + o2.S;
                float f13 = this.d;
                float f14 = this.e;
                o2 o2Var5 = this.f;
                float left = o2Var5.b.getLeft() + o2Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                o2 o2Var6 = this.f;
                float top = o2Var6.b.getTop() + o2Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.J = new AnimatorSet();
                float f15 = this.b;
                if (left < f15) {
                    o2 o2Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(o2Var7.d.x, f15 - o2Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.K);
                    this.f.J.playTogether(ofFloat);
                } else if (measuredWidth > i10 - this.c) {
                    o2 o2Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(o2Var8.d.x, (i10 - o2Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.K);
                    this.f.J.playTogether(ofFloat2);
                }
                if (top < f13) {
                    o2 o2Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(o2Var9.d.y, f13 - o2Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.L);
                    this.f.J.playTogether(ofFloat3);
                } else if (measuredHeight > i11 - f14) {
                    o2 o2Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(o2Var10.d.y, (i11 - o2Var10.b.getMeasuredHeight()) - f14);
                    ofFloat4.addUpdateListener(this.f.L);
                    this.f.J.playTogether(ofFloat4);
                }
                this.f.J.setDuration(150L).setInterpolator(jr.f);
                this.f.J.start();
            }
            this.f.F = false;
            o2.Q.getClass();
            return true;
        }
        o2 o2Var11 = this.f;
        o2Var11.D = rawX;
        o2Var11.E = rawY;
        o2Var11.G = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.J;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
