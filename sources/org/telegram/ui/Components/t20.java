package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t20 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final s20 e;
    public final g5 f;
    public final /* synthetic */ float h;
    public final /* synthetic */ w20 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(w20 w20Var, Context context, float f9) {
        super(context);
        this.n = w20Var;
        this.h = f9;
        this.e = new s20(this);
        this.f = new g5(13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        w20 w20Var = this.n;
        if (i12 == w20Var.E && w20Var.F == point.y) {
            return;
        }
        w20Var.E = i12;
        w20Var.F = point.y;
        if (w20Var.G < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.G = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.H = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        w20 w20Var2 = w20.Z;
        if (w20Var2 != null) {
            w20 w20Var3 = this.n;
            float f9 = w20Var3.G;
            float f10 = w20Var3.H;
            float f11 = -AndroidUtilities.dp(36.0f);
            w20Var2.r.x = (int) com.google.android.recaptcha.internal.a.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f9, f11);
            w20Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
            w20Var2.h();
            t20 t20Var = w20Var2.a;
            if (t20Var.getParent() != null) {
                w20Var2.n.updateViewLayout(t20Var, w20Var2.r);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t20 t20Var;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (w20.Z == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.C);
            w20 w20Var = this.n;
            int i10 = w20Var.C[0];
            WindowManager.LayoutParams layoutParams = w20Var.r;
            w20Var.M = i10 - layoutParams.x;
            w20Var.N = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.e, 300L);
            w20 w20Var2 = this.n;
            WindowManager.LayoutParams layoutParams2 = w20Var2.r;
            w20Var2.K = layoutParams2.x;
            w20Var2.L = layoutParams2.y;
            w20Var2.T = true;
            w20Var2.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f9 = rawX - this.a;
                float f10 = rawY - this.b;
                if (!this.n.S) {
                    float f11 = (f10 * f10) + (f9 * f9);
                    float f12 = this.h;
                    if (f11 > f12 * f12) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        AndroidUtilities.cancelRunOnUIThread(this.e);
                        w20 w20Var3 = this.n;
                        w20Var3.S = true;
                        w20Var3.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f9 = 0.0f;
                        f10 = 0.0f;
                    }
                }
                w20 w20Var4 = this.n;
                if (!w20Var4.S) {
                    return true;
                }
                w20Var4.K += f9;
                w20Var4.L += f10;
                this.a = rawX;
                this.b = rawY;
                w20Var4.i();
                float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.K;
                float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.L;
                float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.J - this.n.M);
                float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.I - this.n.N);
                float f13 = measuredWidth - measuredWidth2;
                float f14 = measuredHeight - measuredHeight2;
                float f15 = (f14 * f14) + (f13 * f13);
                if (f15 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                    this.n.Q.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f13 / f14)));
                    z10 = f15 < ((float) (AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)));
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = false;
                }
                w20 w20Var5 = this.n;
                if (!w20Var5.B && w20Var5.W != z10) {
                    w20Var5.W = z10;
                    ValueAnimator valueAnimator = w20Var5.Y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        w20Var5.Y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(w20Var5.X, z10 ? 1.0f : 0.0f);
                    w20Var5.Y = ofFloat;
                    ofFloat.addUpdateListener(new j6(w20Var5, 25));
                    w20Var5.Y.addListener(new z9(10, w20Var5, z10));
                    w20Var5.Y.setDuration(250L);
                    w20Var5.Y.setInterpolator(jr.f);
                    w20Var5.Y.start();
                }
                w20 w20Var6 = this.n;
                c30 c30Var = w20Var6.Q;
                if (w20Var6.y != z11) {
                    w20Var6.y = z11;
                    w20Var6.c.invalidate();
                    if (!w20Var6.B) {
                        w20Var6.v.N(z11 ? 33 : 0);
                        w20Var6.R.d();
                    }
                    if (z11) {
                        try {
                            c30Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (c30Var.s != z11) {
                    c30Var.invalidate();
                }
                c30Var.s = z11;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.f);
        AndroidUtilities.cancelRunOnUIThread(this.e);
        w20 w20Var7 = this.n;
        if (!w20Var7.y) {
            w20Var7.T = false;
            w20Var7.a();
            if (this.c) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, false, false);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                this.c = false;
            } else {
                if (motionEvent.getAction() == 1 && !this.n.S) {
                    if (VoIPService.getSharedInstance() == null) {
                        return false;
                    }
                    this.n.e(!r1.w);
                    return false;
                }
                z12 = false;
            }
            if (parent != null && this.n.S) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = AndroidUtilities.displaySize;
                int i11 = point.x;
                int i12 = point.y;
                float f16 = this.n.r.x;
                float measuredWidth3 = getMeasuredWidth() + f16;
                float f17 = this.n.r.y;
                float measuredHeight3 = getMeasuredHeight() + f17;
                this.d = new AnimatorSet();
                float f18 = -AndroidUtilities.dp(36.0f);
                if (f16 < f18) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.n.r.x, f18);
                    ofFloat2.addUpdateListener(this.n.O);
                    this.d.playTogether(ofFloat2);
                    f16 = f18;
                } else if (measuredWidth3 > i11 - f18) {
                    float measuredWidth4 = (i11 - getMeasuredWidth()) - f18;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.r.x, measuredWidth4);
                    ofFloat3.addUpdateListener(this.n.O);
                    this.d.playTogether(ofFloat3);
                    f16 = measuredWidth4;
                }
                int dp = AndroidUtilities.dp(36.0f) + i12;
                if (f17 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    float f19 = this.n.r.y;
                    f17 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f19, f17);
                    ofFloat4.addUpdateListener(this.n.P);
                    this.d.playTogether(ofFloat4);
                } else if (measuredHeight3 > dp) {
                    float f20 = this.n.r.y;
                    f17 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f20, f17);
                    ofFloat5.addUpdateListener(this.n.P);
                    this.d.playTogether(ofFloat5);
                }
                this.d.setDuration(150L).setInterpolator(jr.f);
                this.d.start();
                w20 w20Var8 = this.n;
                if (w20Var8.G >= 0.0f) {
                    float[] fArr = w20Var8.D;
                    Point point2 = AndroidUtilities.displaySize;
                    float f21 = point2.x;
                    float f22 = point2.y;
                    float f23 = -AndroidUtilities.dp(36.0f);
                    fArr[0] = (f16 - f23) / ((f21 - (f23 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr[1] = f17 / (f22 - AndroidUtilities.dp(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    w20 w20Var9 = this.n;
                    float f24 = w20Var9.D[0];
                    w20Var9.G = f24;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f24);
                    w20 w20Var10 = this.n;
                    float f25 = w20Var10.D[1];
                    w20Var10.H = f25;
                    putFloat.putFloat("relativeY", f25).apply();
                }
            }
            w20 w20Var11 = this.n;
            w20Var11.S = false;
            w20Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        w20 w20Var12 = this.n;
        aj0 aj0Var = w20Var12.R;
        xi0 xi0Var = w20Var12.v;
        bg.x2 x2Var = w20Var12.b;
        t20 t20Var2 = w20Var12.a;
        cg.i0 i0Var = w20Var12.c;
        w20 w20Var13 = w20.Z;
        if (w20Var13 == null) {
            return false;
        }
        w20Var12.B = true;
        w20.a0 = true;
        w20Var12.Q.G = true;
        w20Var13.e(false);
        float measuredWidth5 = (t20Var2.getMeasuredWidth() / 2.0f) + w20Var12.r.x;
        float measuredWidth6 = ((x2Var.getMeasuredWidth() / 2.0f) + (w20Var12.J - w20Var12.M)) - measuredWidth5;
        float measuredHeight4 = ((x2Var.getMeasuredHeight() / 2.0f) + (w20Var12.I - w20Var12.N)) - ((t20Var2.getMeasuredHeight() / 2.0f) + w20Var12.r.y);
        w20 w20Var14 = w20.Z;
        WindowManager windowManager = w20Var14.n;
        t20 t20Var3 = w20Var14.a;
        bg.x2 x2Var2 = w20Var14.b;
        FrameLayout frameLayout = w20Var14.d;
        org.telegram.ui.s7 s7Var = w20Var14.e;
        w20Var12.d();
        w20.Z = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i13 = xi0Var.X;
        if (i13 < 33) {
            t20Var = t20Var3;
            j10 = (long) (((1.0f - (i13 / 33.0f)) * xi0Var.p()) / 2.0f);
        } else {
            t20Var = t20Var3;
            j10 = 0;
        }
        float f26 = w20Var12.r.x;
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f26, measuredWidth6 + f26);
        ofFloat6.addUpdateListener(w20Var12.O);
        ValueAnimator duration = ofFloat6.setDuration(250L);
        jr jrVar = jr.f;
        duration.setInterpolator(jrVar);
        animatorSet.playTogether(ofFloat6);
        float f27 = w20Var12.r.y;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f27, (f27 + measuredHeight4) - AndroidUtilities.dp(30.0f), w20Var12.r.y + measuredHeight4);
        ofFloat7.addUpdateListener(w20Var12.P);
        ofFloat7.setDuration(250L).setInterpolator(jrVar);
        animatorSet.playTogether(ofFloat7);
        float[] fArr2 = {t20Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        t20 t20Var4 = t20Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(t20Var4, (Property<t20, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {t20Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(t20Var4, (Property<t20, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(t20Var4, (Property<t20, Float>) property3, 1.0f, 0.0f);
        float f28 = 350L;
        ofFloat8.setStartDelay((long) (f28 * 0.7f));
        ofFloat8.setDuration((long) (f28 * 0.3f));
        animatorSet.playTogether(ofFloat8);
        AndroidUtilities.runOnUIThread(new g5(12), 370L);
        long j11 = j10 + 530;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property, 1.0f, 1.05f);
        ofFloat9.setDuration(j11);
        jr jrVar2 = jr.j;
        ofFloat9.setInterpolator(jrVar2);
        animatorSet.playTogether(ofFloat9);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property2, 1.0f, 1.05f);
        ofFloat10.setDuration(j11);
        ofFloat10.setInterpolator(jrVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property, 1.0f, 0.3f);
        ofFloat11.setStartDelay(j11);
        ofFloat11.setDuration(350L);
        jr jrVar3 = jr.h;
        ofFloat11.setInterpolator(jrVar3);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property2, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j11);
        ofFloat12.setDuration(350L);
        ofFloat12.setInterpolator(jrVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        ofFloat13.setStartDelay(j11);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(jrVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(i0Var, (Property<cg.i0, Float>) property3, 1.0f, 0.0f);
        ofFloat14.setStartDelay(j11);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(jrVar3);
        animatorSet.playTogether(ofFloat14);
        animatorSet.addListener(new v20(w20Var12, t20Var4, x2Var2, windowManager, frameLayout, s7Var));
        animatorSet.start();
        xi0Var.N(66);
        aj0Var.i();
        aj0Var.d();
        return false;
    }
}
