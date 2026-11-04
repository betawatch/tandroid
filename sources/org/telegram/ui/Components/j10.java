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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j10 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final i10 e;
    public final go f;
    public final /* synthetic */ float h;
    public final /* synthetic */ l10 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j10(l10 l10Var, Context context, float f10) {
        super(context);
        this.n = l10Var;
        this.h = f10;
        this.e = new i10(this);
        this.f = new go(4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x;
        l10 l10Var = this.n;
        if (i11 == l10Var.J && l10Var.K == point.y) {
            return;
        }
        l10Var.J = i11;
        l10Var.K = point.y;
        if (l10Var.L < 0.0f) {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("groupcallpipconfig", 0);
            this.n.L = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.M = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        l10 l10Var2 = l10.e0;
        if (l10Var2 != null) {
            l10 l10Var3 = this.n;
            float f10 = l10Var3.L;
            float f11 = l10Var3.M;
            float f12 = -org.telegram.messenger.g0.L(36.0f);
            l10Var2.r.x = (int) com.google.android.recaptcha.internal.a.y(point.x - (2.0f * f12), org.telegram.messenger.g0.L(105.0f), f10, f12);
            l10Var2.r.y = (int) ((point.y - org.telegram.messenger.g0.L(105.0f)) * f11);
            l10Var2.h();
            j10 j10Var = l10Var2.a;
            if (j10Var.getParent() != null) {
                l10Var2.n.updateViewLayout(j10Var, l10Var2.r);
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
        j10 j10Var;
        long j10;
        float f10;
        boolean z10;
        boolean z11;
        l10 l10Var;
        l10 l10Var2;
        r10 r10Var;
        ValueAnimator valueAnimator;
        boolean z12 = false;
        if (l10.e0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.H);
            l10 l10Var3 = this.n;
            int i3 = l10Var3.H[0];
            WindowManager.LayoutParams layoutParams = l10Var3.r;
            l10Var3.R = i3 - layoutParams.x;
            l10Var3.S = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            org.telegram.messenger.g0.i3(this.e, 300L);
            l10 l10Var4 = this.n;
            WindowManager.LayoutParams layoutParams2 = l10Var4.r;
            l10Var4.P = layoutParams2.x;
            l10Var4.Q = layoutParams2.y;
            l10Var4.Y = true;
            l10Var4.a();
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
                        l10 l10Var5 = this.n;
                        l10Var5.X = true;
                        l10Var5.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f11 = 0.0f;
                        f12 = 0.0f;
                    }
                }
                l10 l10Var6 = this.n;
                if (l10Var6.X) {
                    l10Var6.P += f11;
                    l10Var6.Q += f12;
                    this.a = rawX;
                    this.b = rawY;
                    l10Var6.i();
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
                            z10 = true;
                        } else {
                            z10 = false;
                            z11 = true;
                            l10Var = this.n;
                            if (!l10Var.G && l10Var.b0 != z10) {
                                l10Var.b0 = z10;
                                valueAnimator = l10Var.d0;
                                if (valueAnimator != null) {
                                    valueAnimator.removeAllListeners();
                                    l10Var.d0.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(l10Var.c0, !z10 ? 1.0f : f10);
                                l10Var.d0 = ofFloat;
                                ofFloat.addUpdateListener(new c6(l10Var, 25));
                                l10Var.d0.addListener(new s9(10, l10Var, z10));
                                l10Var.d0.setDuration(250L);
                                l10Var.d0.setInterpolator(xq.f);
                                l10Var.d0.start();
                            }
                            l10Var2 = this.n;
                            r10Var = l10Var2.V;
                            if (l10Var2.E != z11) {
                                l10Var2.E = z11;
                                l10Var2.c.invalidate();
                                if (!l10Var2.G) {
                                    l10Var2.w.P(z11 ? 33 : 0);
                                    l10Var2.W.d();
                                }
                                if (z11) {
                                    try {
                                        r10Var.performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (r10Var.s != z11) {
                                r10Var.invalidate();
                            }
                            r10Var.s = z11;
                        }
                    } else {
                        f10 = 0.0f;
                        z10 = false;
                    }
                    z11 = z10;
                    l10Var = this.n;
                    if (!l10Var.G) {
                        l10Var.b0 = z10;
                        valueAnimator = l10Var.d0;
                        if (valueAnimator != null) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(l10Var.c0, !z10 ? 1.0f : f10);
                        l10Var.d0 = ofFloat2;
                        ofFloat2.addUpdateListener(new c6(l10Var, 25));
                        l10Var.d0.addListener(new s9(10, l10Var, z10));
                        l10Var.d0.setDuration(250L);
                        l10Var.d0.setInterpolator(xq.f);
                        l10Var.d0.start();
                    }
                    l10Var2 = this.n;
                    r10Var = l10Var2.V;
                    if (l10Var2.E != z11) {
                    }
                    if (r10Var.s != z11) {
                    }
                    r10Var.s = z11;
                }
            }
            return true;
        }
        org.telegram.messenger.g0.r(this.f);
        org.telegram.messenger.g0.r(this.e);
        l10 l10Var7 = this.n;
        if (!l10Var7.E) {
            l10Var7.Y = false;
            l10Var7.a();
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
                    this.n.e(!r1.x);
                    return false;
                }
                z12 = false;
            }
            if (parent != null && this.n.X) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = org.telegram.messenger.g0.q;
                int i10 = point.x;
                int i11 = point.y;
                float f18 = this.n.r.x;
                float measuredWidth3 = getMeasuredWidth() + f18;
                float f19 = this.n.r.y;
                float measuredHeight3 = getMeasuredHeight() + f19;
                this.d = new AnimatorSet();
                float f20 = -org.telegram.messenger.g0.L(36.0f);
                if (f18 < f20) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.r.x, f20);
                    ofFloat3.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat3);
                    f18 = f20;
                } else if (measuredWidth3 > i10 - f20) {
                    float measuredWidth4 = (i10 - getMeasuredWidth()) - f20;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.n.r.x, measuredWidth4);
                    ofFloat4.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat4);
                    f18 = measuredWidth4;
                }
                int L = org.telegram.messenger.g0.L(36.0f) + i11;
                if (f19 < org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(36.0f)) {
                    float f21 = this.n.r.y;
                    f19 = org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(36.0f);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f21, f19);
                    ofFloat5.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat5);
                } else if (measuredHeight3 > L) {
                    float f22 = this.n.r.y;
                    f19 = L - getMeasuredHeight();
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f22, f19);
                    ofFloat6.addUpdateListener(this.n.U);
                    this.d.playTogether(ofFloat6);
                }
                this.d.setDuration(150L).setInterpolator(xq.f);
                this.d.start();
                l10 l10Var8 = this.n;
                if (l10Var8.L >= 0.0f) {
                    float[] fArr = l10Var8.I;
                    float f23 = point.x;
                    float f24 = point.y;
                    float f25 = -org.telegram.messenger.g0.L(36.0f);
                    fArr[0] = (f18 - f25) / ((f23 - (f25 * 2.0f)) - org.telegram.messenger.g0.L(105.0f));
                    fArr[1] = f19 / (f24 - org.telegram.messenger.g0.L(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("groupcallpipconfig", 0).edit();
                    l10 l10Var9 = this.n;
                    float f26 = l10Var9.I[0];
                    l10Var9.L = f26;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f26);
                    l10 l10Var10 = this.n;
                    float f27 = l10Var10.I[1];
                    l10Var10.M = f27;
                    putFloat.putFloat("relativeY", f27).apply();
                }
            }
            l10 l10Var11 = this.n;
            l10Var11.X = false;
            l10Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        l10 l10Var12 = this.n;
        fh0 fh0Var = l10Var12.W;
        ch0 ch0Var = l10Var12.w;
        ai.o2 o2Var = l10Var12.b;
        j10 j10Var2 = l10Var12.a;
        gi.n5 n5Var = l10Var12.c;
        l10 l10Var13 = l10.e0;
        if (l10Var13 == null) {
            return false;
        }
        l10Var12.G = true;
        l10.f0 = true;
        l10Var12.V.L = true;
        l10Var13.e(false);
        float measuredWidth5 = (j10Var2.getMeasuredWidth() / 2.0f) + l10Var12.r.x;
        float measuredWidth6 = ((o2Var.getMeasuredWidth() / 2.0f) + (l10Var12.O - l10Var12.R)) - measuredWidth5;
        float measuredHeight4 = ((o2Var.getMeasuredHeight() / 2.0f) + (l10Var12.N - l10Var12.S)) - ((j10Var2.getMeasuredHeight() / 2.0f) + l10Var12.r.y);
        l10 l10Var14 = l10.e0;
        WindowManager windowManager = l10Var14.n;
        j10 j10Var3 = l10Var14.a;
        ai.o2 o2Var2 = l10Var14.b;
        FrameLayout frameLayout = l10Var14.d;
        org.telegram.ui.x7 x7Var = l10Var14.e;
        l10Var12.d();
        l10.e0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i12 = ch0Var.b0;
        if (i12 < 33) {
            j10Var = j10Var3;
            j10 = (long) (((1.0f - (i12 / 33.0f)) * ch0Var.r()) / 2.0f);
        } else {
            j10Var = j10Var3;
            j10 = 0;
        }
        float f28 = l10Var12.r.x;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f28, measuredWidth6 + f28);
        ofFloat7.addUpdateListener(l10Var12.T);
        ValueAnimator duration = ofFloat7.setDuration(250L);
        xq xqVar = xq.f;
        duration.setInterpolator(xqVar);
        animatorSet.playTogether(ofFloat7);
        float f29 = l10Var12.r.y;
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(f29, (f29 + measuredHeight4) - org.telegram.messenger.g0.L(30.0f), l10Var12.r.y + measuredHeight4);
        ofFloat8.addUpdateListener(l10Var12.U);
        ofFloat8.setDuration(250L).setInterpolator(xqVar);
        animatorSet.playTogether(ofFloat8);
        float[] fArr2 = {j10Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        j10 j10Var4 = j10Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(j10Var4, (Property<j10, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {j10Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(j10Var4, (Property<j10, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(j10Var4, (Property<j10, Float>) property3, 1.0f, 0.0f);
        float f30 = 350L;
        ofFloat9.setStartDelay((long) (f30 * 0.7f));
        ofFloat9.setDuration((long) (f30 * 0.3f));
        animatorSet.playTogether(ofFloat9);
        org.telegram.messenger.g0.i3(new go(3), 370L);
        long j11 = j10 + 530;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) property, 1.0f, 1.05f);
        ofFloat10.setDuration(j11);
        xq xqVar2 = xq.j;
        ofFloat10.setInterpolator(xqVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) property2, 1.0f, 1.05f);
        ofFloat11.setDuration(j11);
        ofFloat11.setInterpolator(xqVar2);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) property, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j11);
        ofFloat12.setDuration(350L);
        xq xqVar3 = xq.h;
        ofFloat12.setInterpolator(xqVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) property2, 1.0f, 0.3f);
        ofFloat13.setStartDelay(j11);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(xqVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) View.TRANSLATION_Y, 0.0f, org.telegram.messenger.g0.L(60.0f));
        ofFloat14.setStartDelay(j11);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(xqVar3);
        animatorSet.playTogether(ofFloat14);
        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(n5Var, (Property<gi.n5, Float>) property3, 1.0f, 0.0f);
        ofFloat15.setStartDelay(j11);
        ofFloat15.setDuration(350L);
        ofFloat15.setInterpolator(xqVar3);
        animatorSet.playTogether(ofFloat15);
        animatorSet.addListener(new k10(l10Var12, j10Var4, o2Var2, windowManager, frameLayout, x7Var));
        animatorSet.start();
        ch0Var.P(66);
        fh0Var.i();
        fh0Var.d();
        return false;
    }
}
