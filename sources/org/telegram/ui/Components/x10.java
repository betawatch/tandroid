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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x10 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final w10 e;
    public final me f;
    public final /* synthetic */ float h;
    public final /* synthetic */ z10 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(z10 z10Var, Context context, float f10) {
        super(context);
        this.n = z10Var;
        this.h = f10;
        this.e = new w10(this);
        this.f = new me(8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x;
        z10 z10Var = this.n;
        if (i11 == z10Var.K && z10Var.L == point.y) {
            return;
        }
        z10Var.K = i11;
        z10Var.L = point.y;
        if (z10Var.M < 0.0f) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("groupcallpipconfig", 0);
            this.n.M = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.N = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        z10 z10Var2 = z10.f0;
        if (z10Var2 != null) {
            z10 z10Var3 = this.n;
            float f10 = z10Var3.M;
            float f11 = z10Var3.N;
            float f12 = -org.telegram.messenger.g0.L(36.0f);
            z10Var2.s.x = (int) com.google.android.gms.internal.vision.e2.z(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
            z10Var2.s.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
            z10Var2.i();
            x10 x10Var = z10Var2.a;
            if (x10Var.getParent() != null) {
                z10Var2.n.updateViewLayout(x10Var, z10Var2.s);
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
        x10 x10Var;
        long j3;
        float f10;
        boolean z10;
        boolean z11;
        z10 z10Var;
        z10 z10Var2;
        f20 f20Var;
        ValueAnimator valueAnimator;
        boolean z12 = false;
        if (z10.f0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.I);
            z10 z10Var3 = this.n;
            int i7 = z10Var3.I[0];
            WindowManager.LayoutParams layoutParams = z10Var3.s;
            z10Var3.S = i7 - layoutParams.x;
            z10Var3.T = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            org.telegram.messenger.g0.h3(this.e, 300L);
            z10 z10Var4 = this.n;
            WindowManager.LayoutParams layoutParams2 = z10Var4.s;
            z10Var4.Q = layoutParams2.x;
            z10Var4.R = layoutParams2.y;
            z10Var4.Z = true;
            z10Var4.a();
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
                        z10 z10Var5 = this.n;
                        z10Var5.Y = true;
                        z10Var5.g(true);
                        this.n.f(false);
                        this.a = rawX;
                        this.b = rawY;
                        f11 = 0.0f;
                        f12 = 0.0f;
                    }
                }
                z10 z10Var6 = this.n;
                if (z10Var6.Y) {
                    z10Var6.Q += f11;
                    z10Var6.R += f12;
                    this.a = rawX;
                    this.b = rawY;
                    z10Var6.j();
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
                            z10Var = this.n;
                            if (!z10Var.H && z10Var.c0 != z10) {
                                z10Var.c0 = z10;
                                valueAnimator = z10Var.e0;
                                if (valueAnimator != null) {
                                    valueAnimator.removeAllListeners();
                                    z10Var.e0.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(z10Var.d0, !z10 ? 1.0f : f10);
                                z10Var.e0 = ofFloat;
                                ofFloat.addUpdateListener(new w(z10Var, 27));
                                z10Var.e0.addListener(new org.telegram.ui.on(11, z10Var, z10));
                                z10Var.e0.setDuration(250L);
                                z10Var.e0.setInterpolator(lr.f);
                                z10Var.e0.start();
                            }
                            z10Var2 = this.n;
                            f20Var = z10Var2.W;
                            if (z10Var2.F != z11) {
                                z10Var2.F = z11;
                                z10Var2.c.invalidate();
                                if (!z10Var2.H) {
                                    z10Var2.x.P(z11 ? 33 : 0);
                                    z10Var2.X.d();
                                }
                                if (z11) {
                                    try {
                                        f20Var.performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (f20Var.s != z11) {
                                f20Var.invalidate();
                            }
                            f20Var.s = z11;
                        }
                    } else {
                        f10 = 0.0f;
                        z10 = false;
                    }
                    z11 = z10;
                    z10Var = this.n;
                    if (!z10Var.H) {
                        z10Var.c0 = z10;
                        valueAnimator = z10Var.e0;
                        if (valueAnimator != null) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(z10Var.d0, !z10 ? 1.0f : f10);
                        z10Var.e0 = ofFloat2;
                        ofFloat2.addUpdateListener(new w(z10Var, 27));
                        z10Var.e0.addListener(new org.telegram.ui.on(11, z10Var, z10));
                        z10Var.e0.setDuration(250L);
                        z10Var.e0.setInterpolator(lr.f);
                        z10Var.e0.start();
                    }
                    z10Var2 = this.n;
                    f20Var = z10Var2.W;
                    if (z10Var2.F != z11) {
                    }
                    if (f20Var.s != z11) {
                    }
                    f20Var.s = z11;
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(this.f);
        org.telegram.messenger.g0.r(this.e);
        z10 z10Var7 = this.n;
        if (!z10Var7.F) {
            z10Var7.Z = false;
            z10Var7.a();
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
                this.d.setDuration(150L).setInterpolator(lr.f);
                this.d.start();
                z10 z10Var8 = this.n;
                if (z10Var8.M >= 0.0f) {
                    float[] fArr = z10Var8.J;
                    float f23 = point.x;
                    float f24 = point.y;
                    float f25 = -org.telegram.messenger.g0.L(36.0f);
                    fArr[0] = (f18 - f25) / ((f23 - (f25 * 2.0f)) - org.telegram.messenger.g0.L(105.0f));
                    fArr[1] = f19 / (f24 - org.telegram.messenger.g0.L(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("groupcallpipconfig", 0).edit();
                    z10 z10Var9 = this.n;
                    float f26 = z10Var9.J[0];
                    z10Var9.M = f26;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f26);
                    z10 z10Var10 = this.n;
                    float f27 = z10Var10.J[1];
                    z10Var10.N = f27;
                    putFloat.putFloat("relativeY", f27).apply();
                }
            }
            z10 z10Var11 = this.n;
            z10Var11.Y = false;
            z10Var11.g(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        z10 z10Var12 = this.n;
        ph0 ph0Var = z10Var12.X;
        mh0 mh0Var = z10Var12.x;
        bi.a3 a3Var = z10Var12.b;
        x10 x10Var2 = z10Var12.a;
        hi.m5 m5Var = z10Var12.c;
        z10 z10Var13 = z10.f0;
        if (z10Var13 == null) {
            return false;
        }
        z10Var12.H = true;
        z10.g0 = true;
        z10Var12.W.I = true;
        z10Var13.f(false);
        float measuredWidth5 = (x10Var2.getMeasuredWidth() / 2.0f) + z10Var12.s.x;
        float measuredWidth6 = ((a3Var.getMeasuredWidth() / 2.0f) + (z10Var12.P - z10Var12.S)) - measuredWidth5;
        float measuredHeight4 = ((a3Var.getMeasuredHeight() / 2.0f) + (z10Var12.O - z10Var12.T)) - ((x10Var2.getMeasuredHeight() / 2.0f) + z10Var12.s.y);
        z10 z10Var14 = z10.f0;
        WindowManager windowManager = z10Var14.n;
        x10 x10Var3 = z10Var14.a;
        bi.a3 a3Var2 = z10Var14.b;
        FrameLayout frameLayout = z10Var14.d;
        org.telegram.ui.w7 w7Var = z10Var14.e;
        z10Var12.e();
        z10.f0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i12 = mh0Var.b0;
        if (i12 < 33) {
            x10Var = x10Var3;
            j3 = (long) (((1.0f - (i12 / 33.0f)) * mh0Var.r()) / 2.0f);
        } else {
            x10Var = x10Var3;
            j3 = 0;
        }
        float f28 = z10Var12.s.x;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f28, measuredWidth6 + f28);
        ofFloat7.addUpdateListener(z10Var12.U);
        ValueAnimator duration = ofFloat7.setDuration(250L);
        lr lrVar = lr.f;
        duration.setInterpolator(lrVar);
        animatorSet.playTogether(ofFloat7);
        float f29 = z10Var12.s.y;
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(f29, (f29 + measuredHeight4) - org.telegram.messenger.g0.L(30.0f), z10Var12.s.y + measuredHeight4);
        ofFloat8.addUpdateListener(z10Var12.V);
        ofFloat8.setDuration(250L).setInterpolator(lrVar);
        animatorSet.playTogether(ofFloat8);
        float[] fArr2 = {x10Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        x10 x10Var4 = x10Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(x10Var4, (Property<x10, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {x10Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(x10Var4, (Property<x10, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(x10Var4, (Property<x10, Float>) property3, 1.0f, 0.0f);
        float f30 = 350L;
        ofFloat9.setStartDelay((long) (f30 * 0.7f));
        ofFloat9.setDuration((long) (f30 * 0.3f));
        animatorSet.playTogether(ofFloat9);
        org.telegram.messenger.g0.h3(new me(7), 370L);
        long j10 = j3 + 530;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(m5Var, (Property<hi.m5, Float>) property, 1.0f, 1.05f);
        ofFloat10.setDuration(j10);
        lr lrVar2 = lr.j;
        ofFloat10.setInterpolator(lrVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(m5Var, (Property<hi.m5, Float>) property2, 1.0f, 1.05f);
        ofFloat11.setDuration(j10);
        ofFloat11.setInterpolator(lrVar2);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(m5Var, (Property<hi.m5, Float>) property, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j10);
        ofFloat12.setDuration(350L);
        lr lrVar3 = lr.h;
        ofFloat12.setInterpolator(lrVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(m5Var, (Property<hi.m5, Float>) property2, 1.0f, 0.3f);
        ofFloat13.setStartDelay(j10);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(lrVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(m5Var, (Property<hi.m5, Float>) View.TRANSLATION_Y, 0.0f, org.telegram.messenger.g0.L(60.0f));
        ofFloat14.setStartDelay(j10);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(lrVar3);
        animatorSet.playTogether(ofFloat14);
        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(m5Var, (Property<hi.m5, Float>) property3, 1.0f, 0.0f);
        ofFloat15.setStartDelay(j10);
        ofFloat15.setDuration(350L);
        ofFloat15.setInterpolator(lrVar3);
        animatorSet.playTogether(ofFloat15);
        animatorSet.addListener(new y10(z10Var12, x10Var4, a3Var2, windowManager, frameLayout, w7Var));
        animatorSet.start();
        mh0Var.P(66);
        ph0Var.i();
        ph0Var.d();
        return false;
    }
}
