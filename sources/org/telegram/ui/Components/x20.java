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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class x20 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final w20 e;
    public final ue f;
    public final /* synthetic */ float h;
    public final /* synthetic */ z20 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(z20 z20Var, Context context, float f7) {
        super(context);
        this.n = z20Var;
        this.h = f7;
        this.e = new w20(this);
        this.f = new ue(7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        z20 z20Var = this.n;
        if (i12 == z20Var.I && z20Var.J == point.y) {
            return;
        }
        z20Var.I = i12;
        z20Var.J = point.y;
        if (z20Var.K < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.K = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.L = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        z20 z20Var2 = z20.d0;
        if (z20Var2 != null) {
            z20 z20Var3 = this.n;
            float f7 = z20Var3.K;
            float f10 = z20Var3.L;
            float f11 = -AndroidUtilities.dp(36.0f);
            z20Var2.r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
            z20Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
            z20Var2.h();
            x20 x20Var = z20Var2.a;
            if (x20Var.getParent() != null) {
                z20Var2.n.updateViewLayout(x20Var, z20Var2.r);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x20 x20Var;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (z20.d0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.G);
            z20 z20Var = this.n;
            int i10 = z20Var.G[0];
            WindowManager.LayoutParams layoutParams = z20Var.r;
            z20Var.Q = i10 - layoutParams.x;
            z20Var.R = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.e, 300L);
            z20 z20Var2 = this.n;
            WindowManager.LayoutParams layoutParams2 = z20Var2.r;
            z20Var2.O = layoutParams2.x;
            z20Var2.P = layoutParams2.y;
            z20Var2.X = true;
            z20Var2.a();
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
                        z20 z20Var3 = this.n;
                        z20Var3.W = true;
                        z20Var3.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f7 = 0.0f;
                        f10 = 0.0f;
                    }
                }
                z20 z20Var4 = this.n;
                if (!z20Var4.W) {
                    return true;
                }
                z20Var4.O += f7;
                z20Var4.P += f10;
                this.a = rawX;
                this.b = rawY;
                z20Var4.i();
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
                z20 z20Var5 = this.n;
                if (!z20Var5.F && z20Var5.a0 != z10) {
                    z20Var5.a0 = z10;
                    ValueAnimator valueAnimator = z20Var5.c0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        z20Var5.c0.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(z20Var5.b0, z10 ? 1.0f : 0.0f);
                    z20Var5.c0 = ofFloat;
                    ofFloat.addUpdateListener(new l6(z20Var5, 25));
                    z20Var5.c0.addListener(new org.telegram.ui.to(11, z20Var5, z10));
                    z20Var5.c0.setDuration(250L);
                    z20Var5.c0.setInterpolator(pr.f);
                    z20Var5.c0.start();
                }
                z20 z20Var6 = this.n;
                f30 f30Var = z20Var6.U;
                if (z20Var6.y != z11) {
                    z20Var6.y = z11;
                    z20Var6.c.invalidate();
                    if (!z20Var6.F) {
                        z20Var6.v.N(z11 ? 33 : 0);
                        z20Var6.V.d();
                    }
                    if (z11) {
                        try {
                            f30Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (f30Var.s != z11) {
                    f30Var.invalidate();
                }
                f30Var.s = z11;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.f);
        AndroidUtilities.cancelRunOnUIThread(this.e);
        z20 z20Var7 = this.n;
        if (!z20Var7.y) {
            z20Var7.X = false;
            z20Var7.a();
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
                this.d.setDuration(150L).setInterpolator(pr.f);
                this.d.start();
                z20 z20Var8 = this.n;
                if (z20Var8.K >= 0.0f) {
                    float[] fArr = z20Var8.H;
                    Point point2 = AndroidUtilities.displaySize;
                    float f21 = point2.x;
                    float f22 = point2.y;
                    float f23 = -AndroidUtilities.dp(36.0f);
                    fArr[0] = (f16 - f23) / ((f21 - (f23 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr[1] = f17 / (f22 - AndroidUtilities.dp(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    z20 z20Var9 = this.n;
                    float f24 = z20Var9.H[0];
                    z20Var9.K = f24;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f24);
                    z20 z20Var10 = this.n;
                    float f25 = z20Var10.H[1];
                    z20Var10.L = f25;
                    putFloat.putFloat("relativeY", f25).apply();
                }
            }
            z20 z20Var11 = this.n;
            z20Var11.W = false;
            z20Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        z20 z20Var12 = this.n;
        aj0 aj0Var = z20Var12.V;
        xi0 xi0Var = z20Var12.v;
        ah.y yVar = z20Var12.b;
        x20 x20Var2 = z20Var12.a;
        di.r6 r6Var = z20Var12.c;
        z20 z20Var13 = z20.d0;
        if (z20Var13 == null) {
            return false;
        }
        z20Var12.F = true;
        z20.e0 = true;
        z20Var12.U.K = true;
        z20Var13.e(false);
        float measuredWidth5 = (x20Var2.getMeasuredWidth() / 2.0f) + z20Var12.r.x;
        float measuredWidth6 = ((yVar.getMeasuredWidth() / 2.0f) + (z20Var12.N - z20Var12.Q)) - measuredWidth5;
        float measuredHeight4 = ((yVar.getMeasuredHeight() / 2.0f) + (z20Var12.M - z20Var12.R)) - ((x20Var2.getMeasuredHeight() / 2.0f) + z20Var12.r.y);
        z20 z20Var14 = z20.d0;
        WindowManager windowManager = z20Var14.n;
        x20 x20Var3 = z20Var14.a;
        ah.y yVar2 = z20Var14.b;
        FrameLayout frameLayout = z20Var14.d;
        org.telegram.ui.u7 u7Var = z20Var14.e;
        z20Var12.d();
        z20.d0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i13 = xi0Var.b0;
        if (i13 < 33) {
            x20Var = x20Var3;
            j3 = (long) (((1.0f - (i13 / 33.0f)) * xi0Var.p()) / 2.0f);
        } else {
            x20Var = x20Var3;
            j3 = 0;
        }
        float f26 = z20Var12.r.x;
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f26, measuredWidth6 + f26);
        ofFloat6.addUpdateListener(z20Var12.S);
        ValueAnimator duration = ofFloat6.setDuration(250L);
        pr prVar = pr.f;
        duration.setInterpolator(prVar);
        animatorSet.playTogether(ofFloat6);
        float f27 = z20Var12.r.y;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f27, (f27 + measuredHeight4) - AndroidUtilities.dp(30.0f), z20Var12.r.y + measuredHeight4);
        ofFloat7.addUpdateListener(z20Var12.T);
        ofFloat7.setDuration(250L).setInterpolator(prVar);
        animatorSet.playTogether(ofFloat7);
        float[] fArr2 = {x20Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        x20 x20Var4 = x20Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(x20Var4, (Property<x20, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {x20Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(x20Var4, (Property<x20, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(x20Var4, (Property<x20, Float>) property3, 1.0f, 0.0f);
        float f28 = 350L;
        ofFloat8.setStartDelay((long) (f28 * 0.7f));
        ofFloat8.setDuration((long) (f28 * 0.3f));
        animatorSet.playTogether(ofFloat8);
        AndroidUtilities.runOnUIThread(new ue(6), 370L);
        long j10 = j3 + 530;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(r6Var, (Property<di.r6, Float>) property, 1.0f, 1.05f);
        ofFloat9.setDuration(j10);
        pr prVar2 = pr.j;
        ofFloat9.setInterpolator(prVar2);
        animatorSet.playTogether(ofFloat9);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(r6Var, (Property<di.r6, Float>) property2, 1.0f, 1.05f);
        ofFloat10.setDuration(j10);
        ofFloat10.setInterpolator(prVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(r6Var, (Property<di.r6, Float>) property, 1.0f, 0.3f);
        ofFloat11.setStartDelay(j10);
        ofFloat11.setDuration(350L);
        pr prVar3 = pr.h;
        ofFloat11.setInterpolator(prVar3);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(r6Var, (Property<di.r6, Float>) property2, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j10);
        ofFloat12.setDuration(350L);
        ofFloat12.setInterpolator(prVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(r6Var, (Property<di.r6, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        ofFloat13.setStartDelay(j10);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(prVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(r6Var, (Property<di.r6, Float>) property3, 1.0f, 0.0f);
        ofFloat14.setStartDelay(j10);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(prVar3);
        animatorSet.playTogether(ofFloat14);
        animatorSet.addListener(new y20(z20Var12, x20Var4, yVar2, windowManager, frameLayout, u7Var));
        animatorSet.start();
        xi0Var.N(66);
        aj0Var.i();
        aj0Var.d();
        return false;
    }
}
