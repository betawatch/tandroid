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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class b30 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final a30 e;
    public final uh f;
    public final /* synthetic */ float h;
    public final /* synthetic */ d30 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(d30 d30Var, Context context, float f7) {
        super(context);
        this.n = d30Var;
        this.h = f7;
        this.e = new a30(this);
        this.f = new uh(6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        d30 d30Var = this.n;
        if (i12 == d30Var.I && d30Var.J == point.y) {
            return;
        }
        d30Var.I = i12;
        d30Var.J = point.y;
        if (d30Var.K < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.K = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.L = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        d30 d30Var2 = d30.d0;
        if (d30Var2 != null) {
            d30 d30Var3 = this.n;
            float f7 = d30Var3.K;
            float f10 = d30Var3.L;
            float f11 = -AndroidUtilities.dp(36.0f);
            d30Var2.r.x = (int) com.google.android.gms.internal.vision.e2.z(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
            d30Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
            d30Var2.h();
            b30 b30Var = d30Var2.a;
            if (b30Var.getParent() != null) {
                d30Var2.n.updateViewLayout(b30Var, d30Var2.r);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b30 b30Var;
        long j3;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (d30.d0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.G);
            d30 d30Var = this.n;
            int i10 = d30Var.G[0];
            WindowManager.LayoutParams layoutParams = d30Var.r;
            d30Var.Q = i10 - layoutParams.x;
            d30Var.R = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.e, 300L);
            d30 d30Var2 = this.n;
            WindowManager.LayoutParams layoutParams2 = d30Var2.r;
            d30Var2.O = layoutParams2.x;
            d30Var2.P = layoutParams2.y;
            d30Var2.X = true;
            d30Var2.a();
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
                        d30 d30Var3 = this.n;
                        d30Var3.W = true;
                        d30Var3.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f7 = 0.0f;
                        f10 = 0.0f;
                    }
                }
                d30 d30Var4 = this.n;
                if (!d30Var4.W) {
                    return true;
                }
                d30Var4.O += f7;
                d30Var4.P += f10;
                this.a = rawX;
                this.b = rawY;
                d30Var4.i();
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
                d30 d30Var5 = this.n;
                if (!d30Var5.F && d30Var5.a0 != z10) {
                    d30Var5.a0 = z10;
                    ValueAnimator valueAnimator = d30Var5.c0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        d30Var5.c0.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(d30Var5.b0, z10 ? 1.0f : 0.0f);
                    d30Var5.c0 = ofFloat;
                    ofFloat.addUpdateListener(new k6(d30Var5, 25));
                    d30Var5.c0.addListener(new da(10, d30Var5, z10));
                    d30Var5.c0.setDuration(250L);
                    d30Var5.c0.setInterpolator(tr.f);
                    d30Var5.c0.start();
                }
                d30 d30Var6 = this.n;
                j30 j30Var = d30Var6.U;
                if (d30Var6.y != z11) {
                    d30Var6.y = z11;
                    d30Var6.c.invalidate();
                    if (!d30Var6.F) {
                        d30Var6.v.P(z11 ? 33 : 0);
                        d30Var6.V.d();
                    }
                    if (z11) {
                        try {
                            j30Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                    }
                }
                if (j30Var.s != z11) {
                    j30Var.invalidate();
                }
                j30Var.s = z11;
                return true;
            }
            if (action != 3) {
                return true;
            }
        }
        AndroidUtilities.cancelRunOnUIThread(this.f);
        AndroidUtilities.cancelRunOnUIThread(this.e);
        d30 d30Var7 = this.n;
        if (!d30Var7.y) {
            d30Var7.X = false;
            d30Var7.a();
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
                this.d.setDuration(150L).setInterpolator(tr.f);
                this.d.start();
                d30 d30Var8 = this.n;
                if (d30Var8.K >= 0.0f) {
                    float[] fArr = d30Var8.H;
                    Point point2 = AndroidUtilities.displaySize;
                    float f21 = point2.x;
                    float f22 = point2.y;
                    float f23 = -AndroidUtilities.dp(36.0f);
                    fArr[0] = (f16 - f23) / ((f21 - (f23 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr[1] = f17 / (f22 - AndroidUtilities.dp(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    d30 d30Var9 = this.n;
                    float f24 = d30Var9.H[0];
                    d30Var9.K = f24;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f24);
                    d30 d30Var10 = this.n;
                    float f25 = d30Var10.H[1];
                    d30Var10.L = f25;
                    putFloat.putFloat("relativeY", f25).apply();
                }
            }
            d30 d30Var11 = this.n;
            d30Var11.W = false;
            d30Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        d30 d30Var12 = this.n;
        nj0 nj0Var = d30Var12.V;
        kj0 kj0Var = d30Var12.v;
        ai.f0 f0Var = d30Var12.b;
        b30 b30Var2 = d30Var12.a;
        ci.r6 r6Var = d30Var12.c;
        d30 d30Var13 = d30.d0;
        if (d30Var13 == null) {
            return false;
        }
        d30Var12.F = true;
        d30.e0 = true;
        d30Var12.U.K = true;
        d30Var13.e(false);
        float measuredWidth5 = (b30Var2.getMeasuredWidth() / 2.0f) + d30Var12.r.x;
        float measuredWidth6 = ((f0Var.getMeasuredWidth() / 2.0f) + (d30Var12.N - d30Var12.Q)) - measuredWidth5;
        float measuredHeight4 = ((f0Var.getMeasuredHeight() / 2.0f) + (d30Var12.M - d30Var12.R)) - ((b30Var2.getMeasuredHeight() / 2.0f) + d30Var12.r.y);
        d30 d30Var14 = d30.d0;
        WindowManager windowManager = d30Var14.n;
        b30 b30Var3 = d30Var14.a;
        ai.f0 f0Var2 = d30Var14.b;
        FrameLayout frameLayout = d30Var14.d;
        org.telegram.ui.x7 x7Var = d30Var14.e;
        d30Var12.d();
        d30.d0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i13 = kj0Var.a0;
        if (i13 < 33) {
            b30Var = b30Var3;
            j3 = (long) (((1.0f - (i13 / 33.0f)) * kj0Var.r()) / 2.0f);
        } else {
            b30Var = b30Var3;
            j3 = 0;
        }
        float f26 = d30Var12.r.x;
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f26, measuredWidth6 + f26);
        ofFloat6.addUpdateListener(d30Var12.S);
        ValueAnimator duration = ofFloat6.setDuration(250L);
        tr trVar = tr.f;
        duration.setInterpolator(trVar);
        animatorSet.playTogether(ofFloat6);
        float f27 = d30Var12.r.y;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f27, (f27 + measuredHeight4) - AndroidUtilities.dp(30.0f), d30Var12.r.y + measuredHeight4);
        ofFloat7.addUpdateListener(d30Var12.T);
        ofFloat7.setDuration(250L).setInterpolator(trVar);
        animatorSet.playTogether(ofFloat7);
        float[] fArr2 = {b30Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        b30 b30Var4 = b30Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(b30Var4, (Property<b30, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {b30Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(b30Var4, (Property<b30, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(b30Var4, (Property<b30, Float>) property3, 1.0f, 0.0f);
        float f28 = 350L;
        ofFloat8.setStartDelay((long) (f28 * 0.7f));
        ofFloat8.setDuration((long) (f28 * 0.3f));
        animatorSet.playTogether(ofFloat8);
        AndroidUtilities.runOnUIThread(new uh(5), 370L);
        long j10 = j3 + 530;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property, 1.0f, 1.05f);
        ofFloat9.setDuration(j10);
        tr trVar2 = tr.j;
        ofFloat9.setInterpolator(trVar2);
        animatorSet.playTogether(ofFloat9);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property2, 1.0f, 1.05f);
        ofFloat10.setDuration(j10);
        ofFloat10.setInterpolator(trVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property, 1.0f, 0.3f);
        ofFloat11.setStartDelay(j10);
        ofFloat11.setDuration(350L);
        tr trVar3 = tr.h;
        ofFloat11.setInterpolator(trVar3);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property2, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j10);
        ofFloat12.setDuration(350L);
        ofFloat12.setInterpolator(trVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        ofFloat13.setStartDelay(j10);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(trVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(r6Var, (Property<ci.r6, Float>) property3, 1.0f, 0.0f);
        ofFloat14.setStartDelay(j10);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(trVar3);
        animatorSet.playTogether(ofFloat14);
        animatorSet.addListener(new c30(d30Var12, b30Var4, f0Var2, windowManager, frameLayout, x7Var));
        animatorSet.start();
        kj0Var.P(66);
        nj0Var.i();
        nj0Var.d();
        return false;
    }
}
