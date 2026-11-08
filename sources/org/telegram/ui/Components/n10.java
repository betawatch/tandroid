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
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class n10 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final m10 e;
    public final vs f;
    public final /* synthetic */ float h;
    public final /* synthetic */ p10 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(p10 p10Var, Context context, float f10) {
        super(context);
        this.n = p10Var;
        this.h = f10;
        this.e = new m10(this);
        this.f = new vs(2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x;
        p10 p10Var = this.n;
        if (i11 == p10Var.J && p10Var.K == point.y) {
            return;
        }
        p10Var.J = i11;
        p10Var.K = point.y;
        if (p10Var.L < 0.0f) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("groupcallpipconfig", 0);
            this.n.L = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.M = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        p10 p10Var2 = p10.e0;
        if (p10Var2 != null) {
            p10 p10Var3 = this.n;
            float f10 = p10Var3.L;
            float f11 = p10Var3.M;
            float f12 = -org.telegram.messenger.g0.L(36.0f);
            p10Var2.s.x = (int) com.google.android.recaptcha.internal.a.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
            p10Var2.s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
            p10Var2.i();
            n10 n10Var = p10Var2.a;
            if (n10Var.getParent() != null) {
                p10Var2.n.updateViewLayout(n10Var, p10Var2.s);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r5 != 3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        n10 n10Var;
        long j3;
        float f10;
        boolean z9;
        boolean z10;
        p10 p10Var;
        p10 p10Var2;
        v10 v10Var;
        ValueAnimator valueAnimator;
        boolean z11 = false;
        if (p10.e0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.H);
            p10 p10Var3 = this.n;
            int i7 = p10Var3.H[0];
            WindowManager.LayoutParams layoutParams = p10Var3.s;
            p10Var3.R = i7 - layoutParams.x;
            p10Var3.S = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            org.telegram.messenger.g0.i3(this.e, 300L);
            p10 p10Var4 = this.n;
            WindowManager.LayoutParams layoutParams2 = p10Var4.s;
            p10Var4.P = layoutParams2.x;
            p10Var4.Q = layoutParams2.y;
            p10Var4.Y = true;
            p10Var4.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f11 = rawX - this.a;
                float f12 = rawY - this.b;
                if (!this.n.X) {
                    float f13 = (f12 * f12) + (f11 * f11);
                    float f14 = this.h;
                    if (f13 > f14 * f14) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        org.telegram.messenger.g0.r(this.e);
                        p10 p10Var5 = this.n;
                        p10Var5.X = true;
                        p10Var5.g(true);
                        this.n.f(false);
                        this.a = rawX;
                        this.b = rawY;
                        f11 = 0.0f;
                        f12 = 0.0f;
                    }
                }
                p10 p10Var6 = this.n;
                if (p10Var6.X) {
                    p10Var6.P += f11;
                    p10Var6.Q += f12;
                    this.a = rawX;
                    this.b = rawY;
                    p10Var6.j();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.P;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.Q;
                    float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.O - this.n.R);
                    float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.N - this.n.S);
                    float f15 = measuredWidth - measuredWidth2;
                    float f16 = measuredHeight - measuredHeight2;
                    float f17 = (f16 * f16) + (f15 * f15);
                    if (f17 < org.telegram.messenger.g0.L(80.0f) * org.telegram.messenger.g0.L(80.0f)) {
                        f10 = 0.0f;
                        this.n.V.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f15 / f16)));
                        if (f17 < org.telegram.messenger.g0.L(50.0f) * org.telegram.messenger.g0.L(50.0f)) {
                            z9 = true;
                        } else {
                            z9 = false;
                            z10 = true;
                            p10Var = this.n;
                            if (!p10Var.G && p10Var.b0 != z9) {
                                p10Var.b0 = z9;
                                valueAnimator = p10Var.d0;
                                if (valueAnimator != null) {
                                    valueAnimator.removeAllListeners();
                                    p10Var.d0.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(p10Var.c0, !z9 ? 1.0f : f10);
                                p10Var.d0 = ofFloat;
                                ofFloat.addUpdateListener(new e6(p10Var, 25));
                                p10Var.d0.addListener(new t9(10, p10Var, z9));
                                p10Var.d0.setDuration(250L);
                                p10Var.d0.setInterpolator(xq.f);
                                p10Var.d0.start();
                            }
                            p10Var2 = this.n;
                            v10Var = p10Var2.V;
                            if (p10Var2.E != z10) {
                                p10Var2.E = z10;
                                p10Var2.c.invalidate();
                                if (!p10Var2.G) {
                                    p10Var2.x.P(z10 ? 33 : 0);
                                    p10Var2.W.d();
                                }
                                if (z10) {
                                    try {
                                        v10Var.performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (v10Var.s != z10) {
                                v10Var.invalidate();
                            }
                            v10Var.s = z10;
                        }
                    } else {
                        f10 = 0.0f;
                        z9 = false;
                    }
                    z10 = z9;
                    p10Var = this.n;
                    if (!p10Var.G) {
                        p10Var.b0 = z9;
                        valueAnimator = p10Var.d0;
                        if (valueAnimator != null) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(p10Var.c0, !z9 ? 1.0f : f10);
                        p10Var.d0 = ofFloat2;
                        ofFloat2.addUpdateListener(new e6(p10Var, 25));
                        p10Var.d0.addListener(new t9(10, p10Var, z9));
                        p10Var.d0.setDuration(250L);
                        p10Var.d0.setInterpolator(xq.f);
                        p10Var.d0.start();
                    }
                    p10Var2 = this.n;
                    v10Var = p10Var2.V;
                    if (p10Var2.E != z10) {
                    }
                    if (v10Var.s != z10) {
                    }
                    v10Var.s = z10;
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(this.f);
        org.telegram.messenger.g0.r(this.e);
        p10 p10Var7 = this.n;
        if (!p10Var7.E) {
            p10Var7.Y = false;
            p10Var7.a();
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
                if (motionEvent.getAction() == 1 && !this.n.X) {
                    if (VoIPService.getSharedInstance() == null) {
                        return false;
                    }
                    this.n.f(!r1.y);
                    return false;
                }
                z11 = false;
            }
            if (parent != null && this.n.X) {
                parent.requestDisallowInterceptTouchEvent(z11);
                Point point = org.telegram.messenger.g0.q;
                int i10 = point.x;
                int i11 = point.y;
                float f18 = this.n.s.x;
                float measuredWidth3 = getMeasuredWidth() + f18;
                float f19 = this.n.s.y;
                float measuredHeight3 = getMeasuredHeight() + f19;
                this.d = new AnimatorSet();
                float f20 = -org.telegram.messenger.g0.L(36.0f);
                if (f18 < f20) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.s.x, f20);
                    ofFloat3.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat3);
                    f18 = f20;
                } else if (measuredWidth3 > i10 - f20) {
                    float measuredWidth4 = (i10 - getMeasuredWidth()) - f20;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.n.s.x, measuredWidth4);
                    ofFloat4.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat4);
                    f18 = measuredWidth4;
                }
                int L = org.telegram.messenger.g0.L(36.0f) + i11;
                if (f19 < org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(36.0f)) {
                    float f21 = this.n.s.y;
                    f19 = org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(36.0f);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f21, f19);
                    ofFloat5.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat5);
                } else if (measuredHeight3 > L) {
                    float f22 = this.n.s.y;
                    f19 = L - getMeasuredHeight();
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f22, f19);
                    ofFloat6.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat6);
                }
                this.d.setDuration(150L).setInterpolator(xq.f);
                this.d.start();
                p10 p10Var8 = this.n;
                if (p10Var8.L >= 0.0f) {
                    float[] fArr = p10Var8.I;
                    float f23 = point.x;
                    float f24 = point.y;
                    float f25 = -org.telegram.messenger.g0.L(36.0f);
                    fArr[0] = (f18 - f25) / ((f23 - (f25 * 2.0f)) - org.telegram.messenger.g0.L(105.0f));
                    fArr[1] = f19 / (f24 - org.telegram.messenger.g0.L(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("groupcallpipconfig", 0).edit();
                    p10 p10Var9 = this.n;
                    float f26 = p10Var9.I[0];
                    p10Var9.L = f26;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f26);
                    p10 p10Var10 = this.n;
                    float f27 = p10Var10.I[1];
                    p10Var10.M = f27;
                    putFloat.putFloat("relativeY", f27).apply();
                }
            }
            p10 p10Var11 = this.n;
            p10Var11.X = false;
            p10Var11.g(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        p10 p10Var12 = this.n;
        ch0 ch0Var = p10Var12.W;
        zg0 zg0Var = p10Var12.x;
        bi.e5 e5Var = p10Var12.b;
        n10 n10Var2 = p10Var12.a;
        fi.p5 p5Var = p10Var12.c;
        p10 p10Var13 = p10.e0;
        if (p10Var13 == null) {
            return false;
        }
        p10Var12.G = true;
        p10.f0 = true;
        p10Var12.V.H = true;
        p10Var13.f(false);
        float measuredWidth5 = (n10Var2.getMeasuredWidth() / 2.0f) + p10Var12.s.x;
        float measuredWidth6 = ((e5Var.getMeasuredWidth() / 2.0f) + (p10Var12.O - p10Var12.R)) - measuredWidth5;
        float measuredHeight4 = ((e5Var.getMeasuredHeight() / 2.0f) + (p10Var12.N - p10Var12.S)) - ((n10Var2.getMeasuredHeight() / 2.0f) + p10Var12.s.y);
        p10 p10Var14 = p10.e0;
        WindowManager windowManager = p10Var14.n;
        n10 n10Var3 = p10Var14.a;
        bi.e5 e5Var2 = p10Var14.b;
        FrameLayout frameLayout = p10Var14.d;
        org.telegram.ui.w7 w7Var = p10Var14.e;
        p10Var12.e();
        p10.e0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i12 = zg0Var.a0;
        if (i12 < 33) {
            n10Var = n10Var3;
            j3 = (long) (((1.0f - (i12 / 33.0f)) * zg0Var.r()) / 2.0f);
        } else {
            n10Var = n10Var3;
            j3 = 0;
        }
        float f28 = p10Var12.s.x;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f28, measuredWidth6 + f28);
        ofFloat7.addUpdateListener(p10Var12.T);
        ValueAnimator duration = ofFloat7.setDuration(250L);
        xq xqVar = xq.f;
        duration.setInterpolator(xqVar);
        animatorSet.playTogether(ofFloat7);
        float f29 = p10Var12.s.y;
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(f29, (f29 + measuredHeight4) - org.telegram.messenger.g0.L(30.0f), p10Var12.s.y + measuredHeight4);
        ofFloat8.addUpdateListener(p10Var12.U);
        ofFloat8.setDuration(250L).setInterpolator(xqVar);
        animatorSet.playTogether(ofFloat8);
        float[] fArr2 = {n10Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        n10 n10Var4 = n10Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(n10Var4, (Property<n10, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {n10Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(n10Var4, (Property<n10, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(n10Var4, (Property<n10, Float>) property3, 1.0f, 0.0f);
        float f30 = 350L;
        ofFloat9.setStartDelay((long) (f30 * 0.7f));
        ofFloat9.setDuration((long) (f30 * 0.3f));
        animatorSet.playTogether(ofFloat9);
        org.telegram.messenger.g0.i3(new vs(1), 370L);
        long j10 = j3 + 530;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) property, 1.0f, 1.05f);
        ofFloat10.setDuration(j10);
        xq xqVar2 = xq.j;
        ofFloat10.setInterpolator(xqVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) property2, 1.0f, 1.05f);
        ofFloat11.setDuration(j10);
        ofFloat11.setInterpolator(xqVar2);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) property, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j10);
        ofFloat12.setDuration(350L);
        xq xqVar3 = xq.h;
        ofFloat12.setInterpolator(xqVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) property2, 1.0f, 0.3f);
        ofFloat13.setStartDelay(j10);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(xqVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) View.TRANSLATION_Y, 0.0f, org.telegram.messenger.g0.L(60.0f));
        ofFloat14.setStartDelay(j10);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(xqVar3);
        animatorSet.playTogether(ofFloat14);
        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(p5Var, (Property<fi.p5, Float>) property3, 1.0f, 0.0f);
        ofFloat15.setStartDelay(j10);
        ofFloat15.setDuration(350L);
        ofFloat15.setInterpolator(xqVar3);
        animatorSet.playTogether(ofFloat15);
        animatorSet.addListener(new o10(p10Var12, n10Var4, e5Var2, windowManager, frameLayout, w7Var));
        animatorSet.start();
        zg0Var.P(66);
        ch0Var.i();
        ch0Var.d();
        return false;
    }
}
