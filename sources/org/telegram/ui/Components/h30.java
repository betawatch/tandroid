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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h30 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final g30 e;
    public final c30 f;
    public final /* synthetic */ float h;
    public final /* synthetic */ j30 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(j30 j30Var, Context context, float f7) {
        super(context);
        this.n = j30Var;
        this.h = f7;
        this.e = new g30(this);
        this.f = new c30(1);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        j30 j30Var = this.n;
        if (i12 == j30Var.I && j30Var.J == point.y) {
            return;
        }
        j30Var.I = i12;
        j30Var.J = point.y;
        if (j30Var.K < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.K = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.L = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        j30 j30Var2 = j30.d0;
        if (j30Var2 != null) {
            j30 j30Var3 = this.n;
            float f7 = j30Var3.K;
            float f10 = j30Var3.L;
            float f11 = -AndroidUtilities.dp(36.0f);
            j30Var2.r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
            j30Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
            j30Var2.h();
            h30 h30Var = j30Var2.a;
            if (h30Var.getParent() != null) {
                j30Var2.n.updateViewLayout(h30Var, j30Var2.r);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h30 h30Var;
        long j3;
        boolean z10;
        boolean z11;
        if (j30.d0 != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            ViewParent parent = getParent();
            int action = motionEvent.getAction();
            if (action == 0) {
                getLocationOnScreen(this.n.G);
                j30 j30Var = this.n;
                int i10 = j30Var.G[0];
                WindowManager.LayoutParams layoutParams = j30Var.r;
                j30Var.Q = i10 - layoutParams.x;
                j30Var.R = r4[1] - layoutParams.y;
                this.a = rawX;
                this.b = rawY;
                System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(this.e, 300L);
                j30 j30Var2 = this.n;
                WindowManager.LayoutParams layoutParams2 = j30Var2.r;
                j30Var2.O = layoutParams2.x;
                j30Var2.P = layoutParams2.y;
                j30Var2.X = true;
                j30Var2.a();
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
                            j30 j30Var3 = this.n;
                            j30Var3.W = true;
                            j30Var3.f(true);
                            this.n.e(false);
                            this.a = rawX;
                            this.b = rawY;
                            f7 = 0.0f;
                            f10 = 0.0f;
                        }
                    }
                    j30 j30Var4 = this.n;
                    if (!j30Var4.W) {
                        return true;
                    }
                    j30Var4.O += f7;
                    j30Var4.P += f10;
                    this.a = rawX;
                    this.b = rawY;
                    j30Var4.i();
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
                    j30 j30Var5 = this.n;
                    if (!j30Var5.F && j30Var5.a0 != z10) {
                        j30Var5.a0 = z10;
                        ValueAnimator valueAnimator = j30Var5.c0;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            j30Var5.c0.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(j30Var5.b0, z10 ? 1.0f : 0.0f);
                        j30Var5.c0 = ofFloat;
                        ofFloat.addUpdateListener(new j6(j30Var5, 25));
                        j30Var5.c0.addListener(new yo(6, j30Var5, z10));
                        j30Var5.c0.setDuration(250L);
                        j30Var5.c0.setInterpolator(wr.f);
                        j30Var5.c0.start();
                    }
                    j30 j30Var6 = this.n;
                    p30 p30Var = j30Var6.U;
                    if (j30Var6.y != z11) {
                        j30Var6.y = z11;
                        j30Var6.c.invalidate();
                        if (!j30Var6.F) {
                            j30Var6.v.P(z11 ? 33 : 0);
                            j30Var6.V.d();
                        }
                        if (z11) {
                            try {
                                p30Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (p30Var.s != z11) {
                        p30Var.invalidate();
                    }
                    p30Var.s = z11;
                    return true;
                }
                if (action != 3) {
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f);
            AndroidUtilities.cancelRunOnUIThread(this.e);
            j30 j30Var7 = this.n;
            if (!j30Var7.y) {
                j30Var7.X = false;
                j30Var7.a();
                if (this.c) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setMicMute(true, false, false);
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    }
                    this.c = false;
                } else if (motionEvent.getAction() == 1 && !this.n.W) {
                    if (VoIPService.getSharedInstance() != null) {
                        this.n.e(!r1.w);
                        return false;
                    }
                }
                if (parent != null && this.n.W) {
                    parent.requestDisallowInterceptTouchEvent(false);
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
                    this.d.setDuration(150L).setInterpolator(wr.f);
                    this.d.start();
                    j30 j30Var8 = this.n;
                    if (j30Var8.K >= 0.0f) {
                        float[] fArr = j30Var8.H;
                        Point point2 = AndroidUtilities.displaySize;
                        float f21 = point2.x;
                        float f22 = point2.y;
                        float f23 = -AndroidUtilities.dp(36.0f);
                        fArr[0] = (f16 - f23) / ((f21 - (f23 * 2.0f)) - AndroidUtilities.dp(105.0f));
                        fArr[1] = f17 / (f22 - AndroidUtilities.dp(105.0f));
                        fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                        fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                        j30 j30Var9 = this.n;
                        float f24 = j30Var9.H[0];
                        j30Var9.K = f24;
                        SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f24);
                        j30 j30Var10 = this.n;
                        float f25 = j30Var10.H[1];
                        j30Var10.L = f25;
                        putFloat.putFloat("relativeY", f25).apply();
                    }
                }
                j30 j30Var11 = this.n;
                j30Var11.W = false;
                j30Var11.f(false);
                return true;
            }
            if (this.c && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().setMicMute(true, false, false);
            }
            this.c = false;
            j30 j30Var12 = this.n;
            kj0 kj0Var = j30Var12.V;
            hj0 hj0Var = j30Var12.v;
            bi.ld ldVar = j30Var12.b;
            h30 h30Var2 = j30Var12.a;
            bi.s7 s7Var = j30Var12.c;
            j30 j30Var13 = j30.d0;
            if (j30Var13 != null) {
                j30Var12.F = true;
                j30.e0 = true;
                j30Var12.U.K = true;
                j30Var13.e(false);
                float measuredWidth5 = (h30Var2.getMeasuredWidth() / 2.0f) + j30Var12.r.x;
                float measuredWidth6 = ((ldVar.getMeasuredWidth() / 2.0f) + (j30Var12.N - j30Var12.Q)) - measuredWidth5;
                float measuredHeight4 = ((ldVar.getMeasuredHeight() / 2.0f) + (j30Var12.M - j30Var12.R)) - ((h30Var2.getMeasuredHeight() / 2.0f) + j30Var12.r.y);
                j30 j30Var14 = j30.d0;
                WindowManager windowManager = j30Var14.n;
                h30 h30Var3 = j30Var14.a;
                bi.ld ldVar2 = j30Var14.b;
                FrameLayout frameLayout = j30Var14.d;
                org.telegram.ui.t7 t7Var = j30Var14.e;
                j30Var12.d();
                j30.d0 = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i13 = hj0Var.b0;
                if (i13 < 33) {
                    h30Var = h30Var3;
                    j3 = (long) (((1.0f - (i13 / 33.0f)) * hj0Var.r()) / 2.0f);
                } else {
                    h30Var = h30Var3;
                    j3 = 0;
                }
                float f26 = j30Var12.r.x;
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f26, measuredWidth6 + f26);
                ofFloat6.addUpdateListener(j30Var12.S);
                ValueAnimator duration = ofFloat6.setDuration(250L);
                wr wrVar = wr.f;
                duration.setInterpolator(wrVar);
                animatorSet.playTogether(ofFloat6);
                float f27 = j30Var12.r.y;
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f27, (f27 + measuredHeight4) - AndroidUtilities.dp(30.0f), j30Var12.r.y + measuredHeight4);
                ofFloat7.addUpdateListener(j30Var12.T);
                ofFloat7.setDuration(250L).setInterpolator(wrVar);
                animatorSet.playTogether(ofFloat7);
                float[] fArr2 = {h30Var.getScaleX(), 0.1f};
                Property property = View.SCALE_X;
                h30 h30Var4 = h30Var;
                animatorSet.playTogether(ObjectAnimator.ofFloat(h30Var4, (Property<h30, Float>) property, fArr2).setDuration(180L));
                float[] fArr3 = {h30Var4.getScaleY(), 0.1f};
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ObjectAnimator.ofFloat(h30Var4, (Property<h30, Float>) property2, fArr3).setDuration(180L));
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h30Var4, (Property<h30, Float>) property3, 1.0f, 0.0f);
                float f28 = 350L;
                ofFloat8.setStartDelay((long) (f28 * 0.7f));
                ofFloat8.setDuration((long) (f28 * 0.3f));
                animatorSet.playTogether(ofFloat8);
                AndroidUtilities.runOnUIThread(new c30(0), 370L);
                long j10 = j3 + 530;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) property, 1.0f, 1.05f);
                ofFloat9.setDuration(j10);
                wr wrVar2 = wr.j;
                ofFloat9.setInterpolator(wrVar2);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) property2, 1.0f, 1.05f);
                ofFloat10.setDuration(j10);
                ofFloat10.setInterpolator(wrVar2);
                animatorSet.playTogether(ofFloat10);
                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) property, 1.0f, 0.3f);
                ofFloat11.setStartDelay(j10);
                ofFloat11.setDuration(350L);
                wr wrVar3 = wr.h;
                ofFloat11.setInterpolator(wrVar3);
                animatorSet.playTogether(ofFloat11);
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) property2, 1.0f, 0.3f);
                ofFloat12.setStartDelay(j10);
                ofFloat12.setDuration(350L);
                ofFloat12.setInterpolator(wrVar3);
                animatorSet.playTogether(ofFloat12);
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat13.setStartDelay(j10);
                ofFloat13.setDuration(350L);
                ofFloat13.setInterpolator(wrVar3);
                animatorSet.playTogether(ofFloat13);
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(s7Var, (Property<bi.s7, Float>) property3, 1.0f, 0.0f);
                ofFloat14.setStartDelay(j10);
                ofFloat14.setDuration(350L);
                ofFloat14.setInterpolator(wrVar3);
                animatorSet.playTogether(ofFloat14);
                animatorSet.addListener(new i30(j30Var12, h30Var4, ldVar2, windowManager, frameLayout, t7Var));
                animatorSet.start();
                hj0Var.P(66);
                kj0Var.i();
                kj0Var.d();
                return false;
            }
        }
        return false;
    }
}
