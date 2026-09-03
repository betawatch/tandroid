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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z20 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final y20 e;
    public final mc f;
    public final /* synthetic */ float h;
    public final /* synthetic */ b30 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(b30 b30Var, Context context, float f10) {
        super(context);
        this.n = b30Var;
        this.h = f10;
        this.e = new y20(this);
        this.f = new mc(9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        b30 b30Var = this.n;
        if (i12 == b30Var.F && b30Var.G == point.y) {
            return;
        }
        b30Var.F = i12;
        b30Var.G = point.y;
        if (b30Var.H < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.H = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.I = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        b30 b30Var2 = b30.a0;
        if (b30Var2 != null) {
            b30 b30Var3 = this.n;
            float f10 = b30Var3.H;
            float f11 = b30Var3.I;
            float f12 = -AndroidUtilities.dp(36.0f);
            b30Var2.r.x = (int) e2.c.w(AndroidUtilities.displaySize.x - (2.0f * f12), AndroidUtilities.dp(105.0f), f10, f12);
            b30Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f11);
            b30Var2.h();
            z20 z20Var = b30Var2.a;
            if (z20Var.getParent() != null) {
                b30Var2.n.updateViewLayout(z20Var, b30Var2.r);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z20 z20Var;
        long j10;
        boolean z4;
        boolean z10;
        boolean z11 = false;
        if (b30.a0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.D);
            b30 b30Var = this.n;
            int i10 = b30Var.D[0];
            WindowManager.LayoutParams layoutParams = b30Var.r;
            b30Var.N = i10 - layoutParams.x;
            b30Var.O = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.e, 300L);
            b30 b30Var2 = this.n;
            WindowManager.LayoutParams layoutParams2 = b30Var2.r;
            b30Var2.L = layoutParams2.x;
            b30Var2.M = layoutParams2.y;
            b30Var2.U = true;
            b30Var2.a();
            return true;
        }
        int i11 = 2;
        if (action != 1) {
            if (action == 2) {
                float f10 = rawX - this.a;
                float f11 = rawY - this.b;
                if (!this.n.T) {
                    float f12 = (f11 * f11) + (f10 * f10);
                    float f13 = this.h;
                    if (f12 > f13 * f13) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        AndroidUtilities.cancelRunOnUIThread(this.e);
                        b30 b30Var3 = this.n;
                        b30Var3.T = true;
                        b30Var3.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                }
                b30 b30Var4 = this.n;
                if (!b30Var4.T) {
                    return true;
                }
                b30Var4.L += f10;
                b30Var4.M += f11;
                this.a = rawX;
                this.b = rawY;
                b30Var4.i();
                float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.L;
                float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.M;
                float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.K - this.n.N);
                float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.J - this.n.O);
                float f14 = measuredWidth - measuredWidth2;
                float f15 = measuredHeight - measuredHeight2;
                float f16 = (f15 * f15) + (f14 * f14);
                if (f16 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                    this.n.R.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f14 / f15)));
                    z4 = f16 < ((float) (AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)));
                    z10 = true;
                } else {
                    z4 = false;
                    z10 = false;
                }
                b30 b30Var5 = this.n;
                if (!b30Var5.C && b30Var5.X != z4) {
                    b30Var5.X = z4;
                    ValueAnimator valueAnimator = b30Var5.Z;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        b30Var5.Z.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(b30Var5.Y, z4 ? 1.0f : 0.0f);
                    b30Var5.Z = ofFloat;
                    ofFloat.addUpdateListener(new f6(b30Var5, 25));
                    b30Var5.Z.addListener(new m00(i11, b30Var5, z4));
                    b30Var5.Z.setDuration(250L);
                    b30Var5.Z.setInterpolator(mr.f);
                    b30Var5.Z.start();
                }
                b30 b30Var6 = this.n;
                h30 h30Var = b30Var6.R;
                if (b30Var6.y != z10) {
                    b30Var6.y = z10;
                    b30Var6.c.invalidate();
                    if (!b30Var6.C) {
                        b30Var6.v.N(z10 ? 33 : 0);
                        b30Var6.S.d();
                    }
                    if (z10) {
                        try {
                            h30Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (h30Var.s != z10) {
                    h30Var.invalidate();
                }
                h30Var.s = z10;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.f);
        AndroidUtilities.cancelRunOnUIThread(this.e);
        b30 b30Var7 = this.n;
        if (!b30Var7.y) {
            b30Var7.U = false;
            b30Var7.a();
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
                if (motionEvent.getAction() == 1 && !this.n.T) {
                    if (VoIPService.getSharedInstance() == null) {
                        return false;
                    }
                    this.n.e(!r1.w);
                    return false;
                }
                z11 = false;
            }
            if (parent != null && this.n.T) {
                parent.requestDisallowInterceptTouchEvent(z11);
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x;
                int i13 = point.y;
                float f17 = this.n.r.x;
                float measuredWidth3 = getMeasuredWidth() + f17;
                float f18 = this.n.r.y;
                float measuredHeight3 = getMeasuredHeight() + f18;
                this.d = new AnimatorSet();
                float f19 = -AndroidUtilities.dp(36.0f);
                if (f17 < f19) {
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.n.r.x, f19);
                    ofFloat2.addUpdateListener(this.n.P);
                    this.d.playTogether(ofFloat2);
                    f17 = f19;
                } else if (measuredWidth3 > i12 - f19) {
                    float measuredWidth4 = (i12 - getMeasuredWidth()) - f19;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.r.x, measuredWidth4);
                    ofFloat3.addUpdateListener(this.n.P);
                    this.d.playTogether(ofFloat3);
                    f17 = measuredWidth4;
                }
                int dp = AndroidUtilities.dp(36.0f) + i13;
                if (f18 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    float f20 = this.n.r.y;
                    f18 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f20, f18);
                    ofFloat4.addUpdateListener(this.n.Q);
                    this.d.playTogether(ofFloat4);
                } else if (measuredHeight3 > dp) {
                    float f21 = this.n.r.y;
                    f18 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f21, f18);
                    ofFloat5.addUpdateListener(this.n.Q);
                    this.d.playTogether(ofFloat5);
                }
                this.d.setDuration(150L).setInterpolator(mr.f);
                this.d.start();
                b30 b30Var8 = this.n;
                if (b30Var8.H >= 0.0f) {
                    float[] fArr = b30Var8.E;
                    Point point2 = AndroidUtilities.displaySize;
                    float f22 = point2.x;
                    float f23 = point2.y;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr[0] = (f17 - f24) / ((f22 - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr[1] = f18 / (f23 - AndroidUtilities.dp(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    b30 b30Var9 = this.n;
                    float f25 = b30Var9.E[0];
                    b30Var9.H = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    b30 b30Var10 = this.n;
                    float f26 = b30Var10.E[1];
                    b30Var10.I = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            b30 b30Var11 = this.n;
            b30Var11.T = false;
            b30Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        b30 b30Var12 = this.n;
        jj0 jj0Var = b30Var12.S;
        gj0 gj0Var = b30Var12.v;
        dg.u2 u2Var = b30Var12.b;
        z20 z20Var2 = b30Var12.a;
        eg.i0 i0Var = b30Var12.c;
        b30 b30Var13 = b30.a0;
        if (b30Var13 == null) {
            return false;
        }
        b30Var12.C = true;
        b30.b0 = true;
        b30Var12.R.H = true;
        b30Var13.e(false);
        float measuredWidth5 = (z20Var2.getMeasuredWidth() / 2.0f) + b30Var12.r.x;
        float measuredWidth6 = ((u2Var.getMeasuredWidth() / 2.0f) + (b30Var12.K - b30Var12.N)) - measuredWidth5;
        float measuredHeight4 = ((u2Var.getMeasuredHeight() / 2.0f) + (b30Var12.J - b30Var12.O)) - ((z20Var2.getMeasuredHeight() / 2.0f) + b30Var12.r.y);
        b30 b30Var14 = b30.a0;
        WindowManager windowManager = b30Var14.n;
        z20 z20Var3 = b30Var14.a;
        dg.u2 u2Var2 = b30Var14.b;
        FrameLayout frameLayout = b30Var14.d;
        org.telegram.ui.y7 y7Var = b30Var14.e;
        b30Var12.d();
        b30.a0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i14 = gj0Var.Y;
        if (i14 < 33) {
            z20Var = z20Var3;
            j10 = (long) (((1.0f - (i14 / 33.0f)) * gj0Var.p()) / 2.0f);
        } else {
            z20Var = z20Var3;
            j10 = 0;
        }
        float f27 = b30Var12.r.x;
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f27, measuredWidth6 + f27);
        ofFloat6.addUpdateListener(b30Var12.P);
        ValueAnimator duration = ofFloat6.setDuration(250L);
        mr mrVar = mr.f;
        duration.setInterpolator(mrVar);
        animatorSet.playTogether(ofFloat6);
        float f28 = b30Var12.r.y;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f28, (f28 + measuredHeight4) - AndroidUtilities.dp(30.0f), b30Var12.r.y + measuredHeight4);
        ofFloat7.addUpdateListener(b30Var12.Q);
        ofFloat7.setDuration(250L).setInterpolator(mrVar);
        animatorSet.playTogether(ofFloat7);
        float[] fArr2 = {z20Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        z20 z20Var4 = z20Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(z20Var4, (Property<z20, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {z20Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(z20Var4, (Property<z20, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(z20Var4, (Property<z20, Float>) property3, 1.0f, 0.0f);
        float f29 = 350L;
        ofFloat8.setStartDelay((long) (f29 * 0.7f));
        ofFloat8.setDuration((long) (f29 * 0.3f));
        animatorSet.playTogether(ofFloat8);
        AndroidUtilities.runOnUIThread(new mc(8), 370L);
        long j11 = j10 + 530;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property, 1.0f, 1.05f);
        ofFloat9.setDuration(j11);
        mr mrVar2 = mr.j;
        ofFloat9.setInterpolator(mrVar2);
        animatorSet.playTogether(ofFloat9);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property2, 1.0f, 1.05f);
        ofFloat10.setDuration(j11);
        ofFloat10.setInterpolator(mrVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property, 1.0f, 0.3f);
        ofFloat11.setStartDelay(j11);
        ofFloat11.setDuration(350L);
        mr mrVar3 = mr.h;
        ofFloat11.setInterpolator(mrVar3);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property2, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j11);
        ofFloat12.setDuration(350L);
        ofFloat12.setInterpolator(mrVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        ofFloat13.setStartDelay(j11);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(mrVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(i0Var, (Property<eg.i0, Float>) property3, 1.0f, 0.0f);
        ofFloat14.setStartDelay(j11);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(mrVar3);
        animatorSet.playTogether(ofFloat14);
        animatorSet.addListener(new a30(b30Var12, z20Var4, u2Var2, windowManager, frameLayout, y7Var));
        animatorSet.start();
        gj0Var.N(66);
        jj0Var.i();
        jj0Var.d();
        return false;
    }
}
