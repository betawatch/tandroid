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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class y20 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final x20 e;
    public final th f;
    public final /* synthetic */ float h;
    public final /* synthetic */ a30 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y20(a30 a30Var, Context context, float f7) {
        super(context);
        this.n = a30Var;
        this.h = f7;
        this.e = new x20(this);
        this.f = new th(6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        a30 a30Var = this.n;
        if (i12 == a30Var.I && a30Var.J == point.y) {
            return;
        }
        a30Var.I = i12;
        a30Var.J = point.y;
        if (a30Var.K < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.K = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.L = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        a30 a30Var2 = a30.d0;
        if (a30Var2 != null) {
            a30 a30Var3 = this.n;
            float f7 = a30Var3.K;
            float f10 = a30Var3.L;
            float f11 = -AndroidUtilities.dp(36.0f);
            a30Var2.r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
            a30Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
            a30Var2.h();
            y20 y20Var = a30Var2.a;
            if (y20Var.getParent() != null) {
                a30Var2.n.updateViewLayout(y20Var, a30Var2.r);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y20 y20Var;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (a30.d0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.G);
            a30 a30Var = this.n;
            int i10 = a30Var.G[0];
            WindowManager.LayoutParams layoutParams = a30Var.r;
            a30Var.Q = i10 - layoutParams.x;
            a30Var.R = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.e, 300L);
            a30 a30Var2 = this.n;
            WindowManager.LayoutParams layoutParams2 = a30Var2.r;
            a30Var2.O = layoutParams2.x;
            a30Var2.P = layoutParams2.y;
            a30Var2.X = true;
            a30Var2.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f7 = rawX - this.a;
                float f10 = rawY - this.b;
                if (!this.n.W) {
                    float f11 = (f10 * f10) + (f7 * f7);
                    float f12 = this.h;
                    if (f11 > f12 * f12) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        AndroidUtilities.cancelRunOnUIThread(this.e);
                        a30 a30Var3 = this.n;
                        a30Var3.W = true;
                        a30Var3.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f7 = 0.0f;
                        f10 = 0.0f;
                    }
                }
                a30 a30Var4 = this.n;
                if (!a30Var4.W) {
                    return true;
                }
                a30Var4.O += f7;
                a30Var4.P += f10;
                this.a = rawX;
                this.b = rawY;
                a30Var4.i();
                float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.O;
                float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.P;
                float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.N - this.n.Q);
                float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.M - this.n.R);
                float f13 = measuredWidth - measuredWidth2;
                float f14 = measuredHeight - measuredHeight2;
                float f15 = (f14 * f14) + (f13 * f13);
                if (f15 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                    this.n.U.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f13 / f14)));
                    z10 = f15 < ((float) (AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)));
                    z11 = true;
                } else {
                    z10 = false;
                    z11 = false;
                }
                a30 a30Var5 = this.n;
                if (!a30Var5.F && a30Var5.a0 != z10) {
                    a30Var5.a0 = z10;
                    ValueAnimator valueAnimator = a30Var5.c0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        a30Var5.c0.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(a30Var5.b0, z10 ? 1.0f : 0.0f);
                    a30Var5.c0 = ofFloat;
                    ofFloat.addUpdateListener(new k6(a30Var5, 25));
                    a30Var5.c0.addListener(new ca(10, a30Var5, z10));
                    a30Var5.c0.setDuration(250L);
                    a30Var5.c0.setInterpolator(rr.f);
                    a30Var5.c0.start();
                }
                a30 a30Var6 = this.n;
                g30 g30Var = a30Var6.U;
                if (a30Var6.y != z11) {
                    a30Var6.y = z11;
                    a30Var6.c.invalidate();
                    if (!a30Var6.F) {
                        a30Var6.v.P(z11 ? 33 : 0);
                        a30Var6.V.d();
                    }
                    if (z11) {
                        try {
                            g30Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (g30Var.s != z11) {
                    g30Var.invalidate();
                }
                g30Var.s = z11;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.f);
        AndroidUtilities.cancelRunOnUIThread(this.e);
        a30 a30Var7 = this.n;
        if (!a30Var7.y) {
            a30Var7.X = false;
            a30Var7.a();
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
                if (motionEvent.getAction() == 1 && !this.n.W) {
                    if (VoIPService.getSharedInstance() == null) {
                        return false;
                    }
                    this.n.e(!r1.w);
                    return false;
                }
                z12 = false;
            }
            if (parent != null && this.n.W) {
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
                    ofFloat2.addUpdateListener(this.n.S);
                    this.d.playTogether(ofFloat2);
                    f16 = f18;
                } else if (measuredWidth3 > i11 - f18) {
                    float measuredWidth4 = (i11 - getMeasuredWidth()) - f18;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.r.x, measuredWidth4);
                    ofFloat3.addUpdateListener(this.n.S);
                    this.d.playTogether(ofFloat3);
                    f16 = measuredWidth4;
                }
                int dp = AndroidUtilities.dp(36.0f) + i12;
                if (f17 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    float f19 = this.n.r.y;
                    f17 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f19, f17);
                    ofFloat4.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat4);
                } else if (measuredHeight3 > dp) {
                    float f20 = this.n.r.y;
                    f17 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f20, f17);
                    ofFloat5.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat5);
                }
                this.d.setDuration(150L).setInterpolator(rr.f);
                this.d.start();
                a30 a30Var8 = this.n;
                if (a30Var8.K >= 0.0f) {
                    float[] fArr = a30Var8.H;
                    Point point2 = AndroidUtilities.displaySize;
                    float f21 = point2.x;
                    float f22 = point2.y;
                    float f23 = -AndroidUtilities.dp(36.0f);
                    fArr[0] = (f16 - f23) / ((f21 - (f23 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr[1] = f17 / (f22 - AndroidUtilities.dp(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    a30 a30Var9 = this.n;
                    float f24 = a30Var9.H[0];
                    a30Var9.K = f24;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f24);
                    a30 a30Var10 = this.n;
                    float f25 = a30Var10.H[1];
                    a30Var10.L = f25;
                    putFloat.putFloat("relativeY", f25).apply();
                }
            }
            a30 a30Var11 = this.n;
            a30Var11.W = false;
            a30Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        a30 a30Var12 = this.n;
        lj0 lj0Var = a30Var12.V;
        ij0 ij0Var = a30Var12.v;
        ai.f0 f0Var = a30Var12.b;
        y20 y20Var2 = a30Var12.a;
        ci.r6 r6Var = a30Var12.c;
        a30 a30Var13 = a30.d0;
        if (a30Var13 == null) {
            return false;
        }
        a30Var12.F = true;
        a30.e0 = true;
        a30Var12.U.K = true;
        a30Var13.e(false);
        float measuredWidth5 = (y20Var2.getMeasuredWidth() / 2.0f) + a30Var12.r.x;
        float measuredWidth6 = ((f0Var.getMeasuredWidth() / 2.0f) + (a30Var12.N - a30Var12.Q)) - measuredWidth5;
        float measuredHeight4 = ((f0Var.getMeasuredHeight() / 2.0f) + (a30Var12.M - a30Var12.R)) - ((y20Var2.getMeasuredHeight() / 2.0f) + a30Var12.r.y);
        a30 a30Var14 = a30.d0;
        WindowManager windowManager = a30Var14.n;
        y20 y20Var3 = a30Var14.a;
        ai.f0 f0Var2 = a30Var14.b;
        FrameLayout frameLayout = a30Var14.d;
        org.telegram.ui.u7 u7Var = a30Var14.e;
        a30Var12.d();
        a30.d0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i13 = ij0Var.a0;
        if (i13 < 33) {
            y20Var = y20Var3;
            j3 = (long) (((1.0f - (i13 / 33.0f)) * ij0Var.r()) / 2.0f);
        } else {
            y20Var = y20Var3;
            j3 = 0;
        }
        float f26 = a30Var12.r.x;
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f26, measuredWidth6 + f26);
        ofFloat6.addUpdateListener(a30Var12.S);
        ValueAnimator duration = ofFloat6.setDuration(250L);
        rr rrVar = rr.f;
        duration.setInterpolator(rrVar);
        animatorSet.playTogether(ofFloat6);
        float f27 = a30Var12.r.y;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f27, (f27 + measuredHeight4) - AndroidUtilities.dp(30.0f), a30Var12.r.y + measuredHeight4);
        ofFloat7.addUpdateListener(a30Var12.T);
        ofFloat7.setDuration(250L).setInterpolator(rrVar);
        animatorSet.playTogether(ofFloat7);
        float[] fArr2 = {y20Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        y20 y20Var4 = y20Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(y20Var4, (Property<y20, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {y20Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(y20Var4, (Property<y20, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(y20Var4, (Property<y20, Float>) property3, 1.0f, 0.0f);
        float f28 = 350L;
        ofFloat8.setStartDelay((long) (f28 * 0.7f));
        ofFloat8.setDuration((long) (f28 * 0.3f));
        animatorSet.playTogether(ofFloat8);
        AndroidUtilities.runOnUIThread(new th(5), 370L);
        long j10 = j3 + 530;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property, 1.0f, 1.05f);
        ofFloat9.setDuration(j10);
        rr rrVar2 = rr.j;
        ofFloat9.setInterpolator(rrVar2);
        animatorSet.playTogether(ofFloat9);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property2, 1.0f, 1.05f);
        ofFloat10.setDuration(j10);
        ofFloat10.setInterpolator(rrVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property, 1.0f, 0.3f);
        ofFloat11.setStartDelay(j10);
        ofFloat11.setDuration(350L);
        rr rrVar3 = rr.h;
        ofFloat11.setInterpolator(rrVar3);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property2, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j10);
        ofFloat12.setDuration(350L);
        ofFloat12.setInterpolator(rrVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        ofFloat13.setStartDelay(j10);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(rrVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property3, 1.0f, 0.0f);
        ofFloat14.setStartDelay(j10);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(rrVar3);
        animatorSet.playTogether(ofFloat14);
        animatorSet.addListener(new z20(a30Var12, y20Var4, f0Var2, windowManager, frameLayout, u7Var));
        animatorSet.start();
        ij0Var.P(66);
        lj0Var.i();
        lj0Var.d();
        return false;
    }
}
