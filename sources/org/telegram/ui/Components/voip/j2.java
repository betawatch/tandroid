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
import org.telegram.ui.Components.bs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oh1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
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
        setOutlineProvider(new ci.n1(18));
        setClipToOutline(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        k2 k2Var = this.f;
        k2Var.r.setPivotX(k2Var.s.getMeasuredWidth());
        k2Var.r.setPivotY(k2Var.s.getMeasuredHeight());
        k2Var.r.setTranslationX((1.0f / getScaleX()) * (-AndroidUtilities.dp(4.0f)) * k2Var.v);
        k2Var.r.setTranslationY((1.0f / getScaleY()) * (-AndroidUtilities.dp(4.0f)) * k2Var.v);
        k2Var.r.setRoundCorners((1.0f / getScaleY()) * AndroidUtilities.dp(8.0f) * k2Var.v);
        k2Var.r.setScaleX(((1.0f - k2Var.v) * 0.6f) + 0.4f);
        k2Var.r.setScaleY(((1.0f - k2Var.v) * 0.6f) + 0.4f);
        k2Var.r.setAlpha(Math.min(1.0f, 1.0f - k2Var.v));
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
        if (k2.U || k2.V == null) {
            return false;
        }
        AndroidUtilities.cancelRunOnUIThread(k2Var.N);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    k2 k2Var2 = this.f;
                    float f7 = rawX - k2Var2.I;
                    float f10 = rawY - k2Var2.J;
                    if (!k2Var2.K) {
                        float f11 = (f10 * f10) + (f7 * f7);
                        float f12 = this.a;
                        if (f11 > f12 * f12) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            k2 k2Var3 = this.f;
                            k2Var3.K = true;
                            k2Var3.I = rawX;
                            k2Var3.J = rawY;
                            f7 = 0.0f;
                            f10 = 0.0f;
                        }
                    }
                    k2 k2Var4 = this.f;
                    if (k2Var4.K) {
                        WindowManager.LayoutParams layoutParams = k2Var4.d;
                        layoutParams.x = (int) (layoutParams.x + f7);
                        layoutParams.y = (int) (layoutParams.y + f10);
                        k2Var4.I = rawX;
                        k2Var4.J = rawY;
                        AndroidUtilities.updateViewLayout(k2Var4.c, k2Var4.a, layoutParams);
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
                if (z10 && !ApplicationLoader.mainInterfacePaused) {
                    oh1.v((Activity) context, this.f.M);
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
                Point point = AndroidUtilities.displaySize;
                int i10 = point.x;
                int i11 = point.y + k2.X;
                float f13 = this.d;
                float f14 = this.e;
                k2 k2Var5 = this.f;
                float left = k2Var5.b.getLeft() + k2Var5.d.x;
                float measuredWidth = this.f.b.getMeasuredWidth() + left;
                k2 k2Var6 = this.f;
                float top = k2Var6.b.getTop() + k2Var6.d.y;
                float measuredHeight = this.f.b.getMeasuredHeight() + top;
                this.f.O = new AnimatorSet();
                float f15 = this.b;
                if (left < f15) {
                    k2 k2Var7 = this.f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(k2Var7.d.x, f15 - k2Var7.b.getLeft());
                    ofFloat.addUpdateListener(this.f.P);
                    this.f.O.playTogether(ofFloat);
                } else if (measuredWidth > i10 - this.c) {
                    k2 k2Var8 = this.f;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(k2Var8.d.x, (i10 - k2Var8.b.getRight()) - this.c);
                    ofFloat2.addUpdateListener(this.f.P);
                    this.f.O.playTogether(ofFloat2);
                }
                if (top < f13) {
                    k2 k2Var9 = this.f;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(k2Var9.d.y, f13 - k2Var9.b.getTop());
                    ofFloat3.addUpdateListener(this.f.Q);
                    this.f.O.playTogether(ofFloat3);
                } else if (measuredHeight > i11 - f14) {
                    k2 k2Var10 = this.f;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(k2Var10.d.y, (i11 - k2Var10.b.getMeasuredHeight()) - f14);
                    ofFloat4.addUpdateListener(this.f.Q);
                    this.f.O.playTogether(ofFloat4);
                }
                this.f.O.setDuration(150L).setInterpolator(bs.f);
                this.f.O.start();
            }
            this.f.K = false;
            k2.V.getClass();
            return true;
        }
        k2 k2Var11 = this.f;
        k2Var11.I = rawX;
        k2Var11.J = rawY;
        k2Var11.L = System.currentTimeMillis();
        AnimatorSet animatorSet2 = this.f.O;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        return true;
    }
}
