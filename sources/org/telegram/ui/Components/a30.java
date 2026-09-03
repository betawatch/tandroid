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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a30 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final z20 e;
    public final jc f;
    public final /* synthetic */ float h;
    public final /* synthetic */ c30 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(c30 c30Var, Context context, float f10) {
        super(context);
        this.n = c30Var;
        this.h = f10;
        this.e = new z20(this);
        this.f = new jc(11);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        c30 c30Var = this.n;
        if (i12 == c30Var.F && c30Var.G == point.y) {
            return;
        }
        c30Var.F = i12;
        c30Var.G = point.y;
        if (c30Var.H < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.H = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.I = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        c30 c30Var2 = c30.a0;
        if (c30Var2 != null) {
            c30 c30Var3 = this.n;
            float f10 = c30Var3.H;
            float f11 = c30Var3.I;
            float f12 = -AndroidUtilities.dp(36.0f);
            c30Var2.r.x = (int) e2.c.w(AndroidUtilities.displaySize.x - (2.0f * f12), AndroidUtilities.dp(105.0f), f10, f12);
            c30Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f11);
            c30Var2.h();
            a30 a30Var = c30Var2.a;
            if (a30Var.getParent() != null) {
                c30Var2.n.updateViewLayout(a30Var, c30Var2.r);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a30 a30Var;
        long j10;
        boolean z4;
        boolean z10;
        boolean z11 = false;
        if (c30.a0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.D);
            c30 c30Var = this.n;
            int i10 = c30Var.D[0];
            WindowManager.LayoutParams layoutParams = c30Var.r;
            c30Var.N = i10 - layoutParams.x;
            c30Var.O = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.e, 300L);
            c30 c30Var2 = this.n;
            WindowManager.LayoutParams layoutParams2 = c30Var2.r;
            c30Var2.L = layoutParams2.x;
            c30Var2.M = layoutParams2.y;
            c30Var2.U = true;
            c30Var2.a();
            return true;
        }
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
                        c30 c30Var3 = this.n;
                        c30Var3.T = true;
                        c30Var3.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                }
                c30 c30Var4 = this.n;
                if (!c30Var4.T) {
                    return true;
                }
                c30Var4.L += f10;
                c30Var4.M += f11;
                this.a = rawX;
                this.b = rawY;
                c30Var4.i();
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
                c30 c30Var5 = this.n;
                if (!c30Var5.C && c30Var5.X != z4) {
                    c30Var5.X = z4;
                    ValueAnimator valueAnimator = c30Var5.Z;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        c30Var5.Z.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(c30Var5.Y, z4 ? 1.0f : 0.0f);
                    c30Var5.Z = ofFloat;
                    ofFloat.addUpdateListener(new f6(c30Var5, 25));
                    c30Var5.Z.addListener(new x20(z11 ? 1 : 0, c30Var5, z4));
                    c30Var5.Z.setDuration(250L);
                    c30Var5.Z.setInterpolator(pr.f);
                    c30Var5.Z.start();
                }
                c30 c30Var6 = this.n;
                i30 i30Var = c30Var6.R;
                if (c30Var6.y != z10) {
                    c30Var6.y = z10;
                    c30Var6.c.invalidate();
                    if (!c30Var6.C) {
                        c30Var6.v.N(z10 ? 33 : 0);
                        c30Var6.S.d();
                    }
                    if (z10) {
                        try {
                            i30Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (i30Var.s != z10) {
                    i30Var.invalidate();
                }
                i30Var.s = z10;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.f);
        AndroidUtilities.cancelRunOnUIThread(this.e);
        c30 c30Var7 = this.n;
        if (!c30Var7.y) {
            c30Var7.U = false;
            c30Var7.a();
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
                    ofFloat2.addUpdateListener(this.n.P);
                    this.d.playTogether(ofFloat2);
                    f17 = f19;
                } else if (measuredWidth3 > i11 - f19) {
                    float measuredWidth4 = (i11 - getMeasuredWidth()) - f19;
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.r.x, measuredWidth4);
                    ofFloat3.addUpdateListener(this.n.P);
                    this.d.playTogether(ofFloat3);
                    f17 = measuredWidth4;
                }
                int dp = AndroidUtilities.dp(36.0f) + i12;
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
                this.d.setDuration(150L).setInterpolator(pr.f);
                this.d.start();
                c30 c30Var8 = this.n;
                if (c30Var8.H >= 0.0f) {
                    float[] fArr = c30Var8.E;
                    Point point2 = AndroidUtilities.displaySize;
                    float f22 = point2.x;
                    float f23 = point2.y;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr[0] = (f17 - f24) / ((f22 - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr[1] = f18 / (f23 - AndroidUtilities.dp(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    c30 c30Var9 = this.n;
                    float f25 = c30Var9.E[0];
                    c30Var9.H = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    c30 c30Var10 = this.n;
                    float f26 = c30Var10.E[1];
                    c30Var10.I = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            c30 c30Var11 = this.n;
            c30Var11.T = false;
            c30Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        c30 c30Var12 = this.n;
        kj0 kj0Var = c30Var12.S;
        hj0 hj0Var = c30Var12.v;
        eg.s2 s2Var = c30Var12.b;
        a30 a30Var2 = c30Var12.a;
        fg.i0 i0Var = c30Var12.c;
        c30 c30Var13 = c30.a0;
        if (c30Var13 == null) {
            return false;
        }
        c30Var12.C = true;
        c30.b0 = true;
        c30Var12.R.H = true;
        c30Var13.e(false);
        float measuredWidth5 = (a30Var2.getMeasuredWidth() / 2.0f) + c30Var12.r.x;
        float measuredWidth6 = ((s2Var.getMeasuredWidth() / 2.0f) + (c30Var12.K - c30Var12.N)) - measuredWidth5;
        float measuredHeight4 = ((s2Var.getMeasuredHeight() / 2.0f) + (c30Var12.J - c30Var12.O)) - ((a30Var2.getMeasuredHeight() / 2.0f) + c30Var12.r.y);
        c30 c30Var14 = c30.a0;
        WindowManager windowManager = c30Var14.n;
        a30 a30Var3 = c30Var14.a;
        eg.s2 s2Var2 = c30Var14.b;
        FrameLayout frameLayout = c30Var14.d;
        org.telegram.ui.w7 w7Var = c30Var14.e;
        c30Var12.d();
        c30.a0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i13 = hj0Var.Y;
        if (i13 < 33) {
            a30Var = a30Var3;
            j10 = (long) (((1.0f - (i13 / 33.0f)) * hj0Var.p()) / 2.0f);
        } else {
            a30Var = a30Var3;
            j10 = 0;
        }
        float f27 = c30Var12.r.x;
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f27, measuredWidth6 + f27);
        ofFloat6.addUpdateListener(c30Var12.P);
        ValueAnimator duration = ofFloat6.setDuration(250L);
        pr prVar = pr.f;
        duration.setInterpolator(prVar);
        animatorSet.playTogether(ofFloat6);
        float f28 = c30Var12.r.y;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f28, (f28 + measuredHeight4) - AndroidUtilities.dp(30.0f), c30Var12.r.y + measuredHeight4);
        ofFloat7.addUpdateListener(c30Var12.Q);
        ofFloat7.setDuration(250L).setInterpolator(prVar);
        animatorSet.playTogether(ofFloat7);
        float[] fArr2 = {a30Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        a30 a30Var4 = a30Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {a30Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property3, 1.0f, 0.0f);
        float f29 = 350L;
        ofFloat8.setStartDelay((long) (f29 * 0.7f));
        ofFloat8.setDuration((long) (f29 * 0.3f));
        animatorSet.playTogether(ofFloat8);
        AndroidUtilities.runOnUIThread(new jc(10), 370L);
        long j11 = j10 + 530;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property, 1.0f, 1.05f);
        ofFloat9.setDuration(j11);
        pr prVar2 = pr.j;
        ofFloat9.setInterpolator(prVar2);
        animatorSet.playTogether(ofFloat9);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property2, 1.0f, 1.05f);
        ofFloat10.setDuration(j11);
        ofFloat10.setInterpolator(prVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property, 1.0f, 0.3f);
        ofFloat11.setStartDelay(j11);
        ofFloat11.setDuration(350L);
        pr prVar3 = pr.h;
        ofFloat11.setInterpolator(prVar3);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property2, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j11);
        ofFloat12.setDuration(350L);
        ofFloat12.setInterpolator(prVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        ofFloat13.setStartDelay(j11);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(prVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(i0Var, (Property<fg.i0, Float>) property3, 1.0f, 0.0f);
        ofFloat14.setStartDelay(j11);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(prVar3);
        animatorSet.playTogether(ofFloat14);
        animatorSet.addListener(new b30(c30Var12, a30Var4, s2Var2, windowManager, frameLayout, w7Var));
        animatorSet.start();
        hj0Var.N(66);
        kj0Var.i();
        kj0Var.d();
        return false;
    }
}
