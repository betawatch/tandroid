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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k20 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final j20 e;
    public final gc f;
    public final /* synthetic */ float h;
    public final /* synthetic */ n20 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(n20 n20Var, Context context, float f10) {
        super(context);
        this.n = n20Var;
        this.h = f10;
        this.e = new j20(this);
        this.f = new gc(10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        n20 n20Var = this.n;
        if (i12 == n20Var.E && n20Var.F == point.y) {
            return;
        }
        n20Var.E = i12;
        n20Var.F = point.y;
        if (n20Var.G < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.G = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.H = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        n20 n20Var2 = n20.Z;
        if (n20Var2 != null) {
            n20 n20Var3 = this.n;
            float f10 = n20Var3.G;
            float f11 = n20Var3.H;
            float f12 = -AndroidUtilities.dp(36.0f);
            n20Var2.r.x = (int) com.google.android.recaptcha.internal.a.z(AndroidUtilities.displaySize.x - (2.0f * f12), AndroidUtilities.dp(105.0f), f10, f12);
            n20Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f11);
            n20Var2.h();
            k20 k20Var = n20Var2.a;
            if (k20Var.getParent() != null) {
                n20Var2.n.updateViewLayout(k20Var, n20Var2.r);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k20 k20Var;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (n20.Z == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.C);
            n20 n20Var = this.n;
            int i10 = n20Var.C[0];
            WindowManager.LayoutParams layoutParams = n20Var.r;
            n20Var.M = i10 - layoutParams.x;
            n20Var.N = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.e, 300L);
            n20 n20Var2 = this.n;
            WindowManager.LayoutParams layoutParams2 = n20Var2.r;
            n20Var2.K = layoutParams2.x;
            n20Var2.L = layoutParams2.y;
            n20Var2.T = true;
            n20Var2.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f10 = rawX - this.a;
                float f11 = rawY - this.b;
                if (!this.n.S) {
                    float f12 = (f11 * f11) + (f10 * f10);
                    float f13 = this.h;
                    if (f12 > f13 * f13) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        AndroidUtilities.cancelRunOnUIThread(this.e);
                        n20 n20Var3 = this.n;
                        n20Var3.S = true;
                        n20Var3.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                }
                n20 n20Var4 = this.n;
                if (!n20Var4.S) {
                    return true;
                }
                n20Var4.K += f10;
                n20Var4.L += f11;
                this.a = rawX;
                this.b = rawY;
                n20Var4.i();
                float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.K;
                float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.L;
                float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.J - this.n.M);
                float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.I - this.n.N);
                float f14 = measuredWidth - measuredWidth2;
                float f15 = measuredHeight - measuredHeight2;
                float f16 = (f15 * f15) + (f14 * f14);
                if (f16 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                    this.n.Q.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f14 / f15)));
                    z10 = f16 < ((float) (AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)));
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = false;
                }
                n20 n20Var5 = this.n;
                if (!n20Var5.B && n20Var5.W != z10) {
                    n20Var5.W = z10;
                    ValueAnimator valueAnimator = n20Var5.Y;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        n20Var5.Y.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(n20Var5.X, z10 ? 1.0f : 0.0f);
                    n20Var5.Y = ofFloat;
                    ofFloat.addUpdateListener(new e6(n20Var5, 25));
                    n20Var5.Y.addListener(new org.telegram.ui.go(11, n20Var5, z10));
                    n20Var5.Y.setDuration(250L);
                    n20Var5.Y.setInterpolator(er.f);
                    n20Var5.Y.start();
                }
                n20 n20Var6 = this.n;
                t20 t20Var = n20Var6.Q;
                if (n20Var6.y != z11) {
                    n20Var6.y = z11;
                    n20Var6.c.invalidate();
                    if (!n20Var6.B) {
                        n20Var6.v.N(z11 ? 33 : 0);
                        n20Var6.R.d();
                    }
                    if (z11) {
                        try {
                            t20Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (t20Var.s != z11) {
                    t20Var.invalidate();
                }
                t20Var.s = z11;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.f);
        AndroidUtilities.cancelRunOnUIThread(this.e);
        n20 n20Var7 = this.n;
        if (!n20Var7.y) {
            n20Var7.T = false;
            n20Var7.a();
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
                float f17 = this.n.r.x;
                float measuredWidth3 = getMeasuredWidth() + f17;
                float f18 = this.n.r.y;
                float measuredHeight3 = getMeasuredHeight() + f18;
                this.d = new AnimatorSet();
                float f19 = -AndroidUtilities.dp(36.0f);
                if (f17 < f19) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.n.r.x, f19);
                    ofFloat2.addUpdateListener(this.n.O);
                    this.d.playTogether(ofFloat2);
                    f17 = f19;
                } else if (measuredWidth3 > i11 - f19) {
                    float measuredWidth4 = (i11 - getMeasuredWidth()) - f19;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.r.x, measuredWidth4);
                    ofFloat3.addUpdateListener(this.n.O);
                    this.d.playTogether(ofFloat3);
                    f17 = measuredWidth4;
                }
                int dp = AndroidUtilities.dp(36.0f) + i12;
                if (f18 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    float f20 = this.n.r.y;
                    f18 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f20, f18);
                    ofFloat4.addUpdateListener(this.n.P);
                    this.d.playTogether(ofFloat4);
                } else if (measuredHeight3 > dp) {
                    float f21 = this.n.r.y;
                    f18 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f21, f18);
                    ofFloat5.addUpdateListener(this.n.P);
                    this.d.playTogether(ofFloat5);
                }
                this.d.setDuration(150L).setInterpolator(er.f);
                this.d.start();
                n20 n20Var8 = this.n;
                if (n20Var8.G >= 0.0f) {
                    float[] fArr = n20Var8.D;
                    Point point2 = AndroidUtilities.displaySize;
                    float f22 = point2.x;
                    float f23 = point2.y;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr[0] = (f17 - f24) / ((f22 - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr[1] = f18 / (f23 - AndroidUtilities.dp(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    n20 n20Var9 = this.n;
                    float f25 = n20Var9.D[0];
                    n20Var9.G = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    n20 n20Var10 = this.n;
                    float f26 = n20Var10.D[1];
                    n20Var10.H = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            n20 n20Var11 = this.n;
            n20Var11.S = false;
            n20Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        n20 n20Var12 = this.n;
        ri0 ri0Var = n20Var12.R;
        oi0 oi0Var = n20Var12.v;
        ag.p1 p1Var = n20Var12.b;
        k20 k20Var2 = n20Var12.a;
        ag.t0 t0Var = n20Var12.c;
        n20 n20Var13 = n20.Z;
        if (n20Var13 == null) {
            return false;
        }
        n20Var12.B = true;
        n20.a0 = true;
        n20Var12.Q.G = true;
        n20Var13.e(false);
        float measuredWidth5 = (k20Var2.getMeasuredWidth() / 2.0f) + n20Var12.r.x;
        float measuredWidth6 = ((p1Var.getMeasuredWidth() / 2.0f) + (n20Var12.J - n20Var12.M)) - measuredWidth5;
        float measuredHeight4 = ((p1Var.getMeasuredHeight() / 2.0f) + (n20Var12.I - n20Var12.N)) - ((k20Var2.getMeasuredHeight() / 2.0f) + n20Var12.r.y);
        n20 n20Var14 = n20.Z;
        WindowManager windowManager = n20Var14.n;
        k20 k20Var3 = n20Var14.a;
        ag.p1 p1Var2 = n20Var14.b;
        FrameLayout frameLayout = n20Var14.d;
        org.telegram.ui.u7 u7Var = n20Var14.e;
        n20Var12.d();
        n20.Z = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i13 = oi0Var.X;
        if (i13 < 33) {
            k20Var = k20Var3;
            j10 = (long) (((1.0f - (i13 / 33.0f)) * oi0Var.p()) / 2.0f);
        } else {
            k20Var = k20Var3;
            j10 = 0;
        }
        float f27 = n20Var12.r.x;
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f27, measuredWidth6 + f27);
        ofFloat6.addUpdateListener(n20Var12.O);
        ValueAnimator duration = ofFloat6.setDuration(250L);
        er erVar = er.f;
        duration.setInterpolator(erVar);
        animatorSet.playTogether(ofFloat6);
        float f28 = n20Var12.r.y;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f28, (f28 + measuredHeight4) - AndroidUtilities.dp(30.0f), n20Var12.r.y + measuredHeight4);
        ofFloat7.addUpdateListener(n20Var12.P);
        ofFloat7.setDuration(250L).setInterpolator(erVar);
        animatorSet.playTogether(ofFloat7);
        float[] fArr2 = {k20Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        k20 k20Var4 = k20Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(k20Var4, (Property<k20, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {k20Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(k20Var4, (Property<k20, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(k20Var4, (Property<k20, Float>) property3, 1.0f, 0.0f);
        float f29 = 350L;
        ofFloat8.setStartDelay((long) (f29 * 0.7f));
        ofFloat8.setDuration((long) (f29 * 0.3f));
        animatorSet.playTogether(ofFloat8);
        AndroidUtilities.runOnUIThread(new gc(9), 370L);
        long j11 = j10 + 530;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, 1.0f, 1.05f);
        ofFloat9.setDuration(j11);
        er erVar2 = er.j;
        ofFloat9.setInterpolator(erVar2);
        animatorSet.playTogether(ofFloat9);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property2, 1.0f, 1.05f);
        ofFloat10.setDuration(j11);
        ofFloat10.setInterpolator(erVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property, 1.0f, 0.3f);
        ofFloat11.setStartDelay(j11);
        ofFloat11.setDuration(350L);
        er erVar3 = er.h;
        ofFloat11.setInterpolator(erVar3);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property2, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j11);
        ofFloat12.setDuration(350L);
        ofFloat12.setInterpolator(erVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        ofFloat13.setStartDelay(j11);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(erVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(t0Var, (Property<ag.t0, Float>) property3, 1.0f, 0.0f);
        ofFloat14.setStartDelay(j11);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(erVar3);
        animatorSet.playTogether(ofFloat14);
        animatorSet.addListener(new m20(n20Var12, k20Var4, p1Var2, windowManager, frameLayout, u7Var));
        animatorSet.start();
        oi0Var.N(66);
        ri0Var.i();
        ri0Var.d();
        return false;
    }
}
