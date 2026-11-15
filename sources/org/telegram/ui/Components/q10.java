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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q10 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final p10 e;
    public final ih f;
    public final /* synthetic */ float h;
    public final /* synthetic */ s10 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(s10 s10Var, Context context, float f10) {
        super(context);
        this.n = s10Var;
        this.h = f10;
        this.e = new p10(this);
        this.f = new ih(6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x;
        s10 s10Var = this.n;
        if (i11 == s10Var.K && s10Var.L == point.y) {
            return;
        }
        s10Var.K = i11;
        s10Var.L = point.y;
        if (s10Var.M < 0.0f) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("groupcallpipconfig", 0);
            this.n.M = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.N = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        s10 s10Var2 = s10.f0;
        if (s10Var2 != null) {
            s10 s10Var3 = this.n;
            float f10 = s10Var3.M;
            float f11 = s10Var3.N;
            float f12 = -org.telegram.messenger.g0.L(36.0f);
            s10Var2.s.x = (int) com.google.android.gms.internal.vision.e2.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
            s10Var2.s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
            s10Var2.i();
            q10 q10Var = s10Var2.a;
            if (q10Var.getParent() != null) {
                s10Var2.n.updateViewLayout(q10Var, s10Var2.s);
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
        q10 q10Var;
        long j3;
        float f10;
        boolean z10;
        boolean z11;
        s10 s10Var;
        s10 s10Var2;
        y10 y10Var;
        ValueAnimator valueAnimator;
        boolean z12 = false;
        if (s10.f0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.I);
            s10 s10Var3 = this.n;
            int i7 = s10Var3.I[0];
            WindowManager.LayoutParams layoutParams = s10Var3.s;
            s10Var3.S = i7 - layoutParams.x;
            s10Var3.T = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            org.telegram.messenger.g0.i3(this.e, 300L);
            s10 s10Var4 = this.n;
            WindowManager.LayoutParams layoutParams2 = s10Var4.s;
            s10Var4.Q = layoutParams2.x;
            s10Var4.R = layoutParams2.y;
            s10Var4.Z = true;
            s10Var4.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f11 = rawX - this.a;
                float f12 = rawY - this.b;
                if (!this.n.Y) {
                    float f13 = (f12 * f12) + (f11 * f11);
                    float f14 = this.h;
                    if (f13 > f14 * f14) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        org.telegram.messenger.g0.r(this.e);
                        s10 s10Var5 = this.n;
                        s10Var5.Y = true;
                        s10Var5.g(true);
                        this.n.f(false);
                        this.a = rawX;
                        this.b = rawY;
                        f11 = 0.0f;
                        f12 = 0.0f;
                    }
                }
                s10 s10Var6 = this.n;
                if (s10Var6.Y) {
                    s10Var6.Q += f11;
                    s10Var6.R += f12;
                    this.a = rawX;
                    this.b = rawY;
                    s10Var6.j();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.Q;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.R;
                    float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.P - this.n.S);
                    float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.O - this.n.T);
                    float f15 = measuredWidth - measuredWidth2;
                    float f16 = measuredHeight - measuredHeight2;
                    float f17 = (f16 * f16) + (f15 * f15);
                    if (f17 < org.telegram.messenger.g0.L(80.0f) * org.telegram.messenger.g0.L(80.0f)) {
                        f10 = 0.0f;
                        this.n.W.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f15 / f16)));
                        if (f17 < org.telegram.messenger.g0.L(50.0f) * org.telegram.messenger.g0.L(50.0f)) {
                            z10 = true;
                        } else {
                            z10 = false;
                            z11 = true;
                            s10Var = this.n;
                            if (!s10Var.H && s10Var.c0 != z10) {
                                s10Var.c0 = z10;
                                valueAnimator = s10Var.e0;
                                if (valueAnimator != null) {
                                    valueAnimator.removeAllListeners();
                                    s10Var.e0.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(s10Var.d0, !z10 ? 1.0f : f10);
                                s10Var.e0 = ofFloat;
                                ofFloat.addUpdateListener(new c6(s10Var, 25));
                                s10Var.e0.addListener(new org.telegram.ui.nn(11, s10Var, z10));
                                s10Var.e0.setDuration(250L);
                                s10Var.e0.setInterpolator(er.f);
                                s10Var.e0.start();
                            }
                            s10Var2 = this.n;
                            y10Var = s10Var2.W;
                            if (s10Var2.F != z11) {
                                s10Var2.F = z11;
                                s10Var2.c.invalidate();
                                if (!s10Var2.H) {
                                    s10Var2.x.P(z11 ? 33 : 0);
                                    s10Var2.X.d();
                                }
                                if (z11) {
                                    try {
                                        y10Var.performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (y10Var.s != z11) {
                                y10Var.invalidate();
                            }
                            y10Var.s = z11;
                        }
                    } else {
                        f10 = 0.0f;
                        z10 = false;
                    }
                    z11 = z10;
                    s10Var = this.n;
                    if (!s10Var.H) {
                        s10Var.c0 = z10;
                        valueAnimator = s10Var.e0;
                        if (valueAnimator != null) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(s10Var.d0, !z10 ? 1.0f : f10);
                        s10Var.e0 = ofFloat2;
                        ofFloat2.addUpdateListener(new c6(s10Var, 25));
                        s10Var.e0.addListener(new org.telegram.ui.nn(11, s10Var, z10));
                        s10Var.e0.setDuration(250L);
                        s10Var.e0.setInterpolator(er.f);
                        s10Var.e0.start();
                    }
                    s10Var2 = this.n;
                    y10Var = s10Var2.W;
                    if (s10Var2.F != z11) {
                    }
                    if (y10Var.s != z11) {
                    }
                    y10Var.s = z11;
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(this.f);
        org.telegram.messenger.g0.r(this.e);
        s10 s10Var7 = this.n;
        if (!s10Var7.F) {
            s10Var7.Z = false;
            s10Var7.a();
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
                if (motionEvent.getAction() == 1 && !this.n.Y) {
                    if (VoIPService.getSharedInstance() == null) {
                        return false;
                    }
                    this.n.f(!r1.y);
                    return false;
                }
                z12 = false;
            }
            if (parent != null && this.n.Y) {
                parent.requestDisallowInterceptTouchEvent(z12);
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
                    ofFloat3.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat3);
                    f18 = f20;
                } else if (measuredWidth3 > i10 - f20) {
                    float measuredWidth4 = (i10 - getMeasuredWidth()) - f20;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.n.s.x, measuredWidth4);
                    ofFloat4.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat4);
                    f18 = measuredWidth4;
                }
                int L = org.telegram.messenger.g0.L(36.0f) + i11;
                if (f19 < org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(36.0f)) {
                    float f21 = this.n.s.y;
                    f19 = org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(36.0f);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f21, f19);
                    ofFloat5.addUpdateListener(this.n.V);
                    this.d.playTogether(ofFloat5);
                } else if (measuredHeight3 > L) {
                    float f22 = this.n.s.y;
                    f19 = L - getMeasuredHeight();
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f22, f19);
                    ofFloat6.addUpdateListener(this.n.V);
                    this.d.playTogether(ofFloat6);
                }
                this.d.setDuration(150L).setInterpolator(er.f);
                this.d.start();
                s10 s10Var8 = this.n;
                if (s10Var8.M >= 0.0f) {
                    float[] fArr = s10Var8.J;
                    float f23 = point.x;
                    float f24 = point.y;
                    float f25 = -org.telegram.messenger.g0.L(36.0f);
                    fArr[0] = (f18 - f25) / ((f23 - (f25 * 2.0f)) - org.telegram.messenger.g0.L(105.0f));
                    fArr[1] = f19 / (f24 - org.telegram.messenger.g0.L(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("groupcallpipconfig", 0).edit();
                    s10 s10Var9 = this.n;
                    float f26 = s10Var9.J[0];
                    s10Var9.M = f26;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f26);
                    s10 s10Var10 = this.n;
                    float f27 = s10Var10.J[1];
                    s10Var10.N = f27;
                    putFloat.putFloat("relativeY", f27).apply();
                }
            }
            s10 s10Var11 = this.n;
            s10Var11.Y = false;
            s10Var11.g(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        s10 s10Var12 = this.n;
        fh0 fh0Var = s10Var12.X;
        ch0 ch0Var = s10Var12.x;
        bi.g2 g2Var = s10Var12.b;
        q10 q10Var2 = s10Var12.a;
        hi.n5 n5Var = s10Var12.c;
        s10 s10Var13 = s10.f0;
        if (s10Var13 == null) {
            return false;
        }
        s10Var12.H = true;
        s10.g0 = true;
        s10Var12.W.I = true;
        s10Var13.f(false);
        float measuredWidth5 = (q10Var2.getMeasuredWidth() / 2.0f) + s10Var12.s.x;
        float measuredWidth6 = ((g2Var.getMeasuredWidth() / 2.0f) + (s10Var12.P - s10Var12.S)) - measuredWidth5;
        float measuredHeight4 = ((g2Var.getMeasuredHeight() / 2.0f) + (s10Var12.O - s10Var12.T)) - ((q10Var2.getMeasuredHeight() / 2.0f) + s10Var12.s.y);
        s10 s10Var14 = s10.f0;
        WindowManager windowManager = s10Var14.n;
        q10 q10Var3 = s10Var14.a;
        bi.g2 g2Var2 = s10Var14.b;
        FrameLayout frameLayout = s10Var14.d;
        org.telegram.ui.x7 x7Var = s10Var14.e;
        s10Var12.e();
        s10.f0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i12 = ch0Var.b0;
        if (i12 < 33) {
            q10Var = q10Var3;
            j3 = (long) (((1.0f - (i12 / 33.0f)) * ch0Var.r()) / 2.0f);
        } else {
            q10Var = q10Var3;
            j3 = 0;
        }
        float f28 = s10Var12.s.x;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f28, measuredWidth6 + f28);
        ofFloat7.addUpdateListener(s10Var12.U);
        ValueAnimator duration = ofFloat7.setDuration(250L);
        er erVar = er.f;
        duration.setInterpolator(erVar);
        animatorSet.playTogether(ofFloat7);
        float f29 = s10Var12.s.y;
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(f29, (f29 + measuredHeight4) - org.telegram.messenger.g0.L(30.0f), s10Var12.s.y + measuredHeight4);
        ofFloat8.addUpdateListener(s10Var12.V);
        ofFloat8.setDuration(250L).setInterpolator(erVar);
        animatorSet.playTogether(ofFloat8);
        float[] fArr2 = {q10Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        q10 q10Var4 = q10Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(q10Var4, (Property<q10, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {q10Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(q10Var4, (Property<q10, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(q10Var4, (Property<q10, Float>) property3, 1.0f, 0.0f);
        float f30 = 350L;
        ofFloat9.setStartDelay((long) (f30 * 0.7f));
        ofFloat9.setDuration((long) (f30 * 0.3f));
        animatorSet.playTogether(ofFloat9);
        org.telegram.messenger.g0.i3(new ih(5), 370L);
        long j10 = j3 + 530;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) property, 1.0f, 1.05f);
        ofFloat10.setDuration(j10);
        er erVar2 = er.j;
        ofFloat10.setInterpolator(erVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) property2, 1.0f, 1.05f);
        ofFloat11.setDuration(j10);
        ofFloat11.setInterpolator(erVar2);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) property, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j10);
        ofFloat12.setDuration(350L);
        er erVar3 = er.h;
        ofFloat12.setInterpolator(erVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) property2, 1.0f, 0.3f);
        ofFloat13.setStartDelay(j10);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(erVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) View.TRANSLATION_Y, 0.0f, org.telegram.messenger.g0.L(60.0f));
        ofFloat14.setStartDelay(j10);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(erVar3);
        animatorSet.playTogether(ofFloat14);
        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(n5Var, (Property<hi.n5, Float>) property3, 1.0f, 0.0f);
        ofFloat15.setStartDelay(j10);
        ofFloat15.setDuration(350L);
        ofFloat15.setInterpolator(erVar3);
        animatorSet.playTogether(ofFloat15);
        animatorSet.addListener(new r10(s10Var12, q10Var4, g2Var2, windowManager, frameLayout, x7Var));
        animatorSet.start();
        ch0Var.P(66);
        fh0Var.i();
        fh0Var.d();
        return false;
    }
}
