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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e20 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final d20 e;
    public final org.telegram.messenger.rz f;
    public final /* synthetic */ float h;
    public final /* synthetic */ g20 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(g20 g20Var, Context context, float f7) {
        super(context);
        this.n = g20Var;
        this.h = f7;
        this.e = new d20(this);
        this.f = new org.telegram.messenger.rz(21);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = org.telegram.messenger.i0.q;
        int i12 = point.x;
        g20 g20Var = this.n;
        if (i12 == g20Var.I && g20Var.J == point.y) {
            return;
        }
        g20Var.I = i12;
        g20Var.J = point.y;
        if (g20Var.K < 0.0f) {
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("groupcallpipconfig", 0);
            this.n.K = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.L = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        g20 g20Var2 = g20.d0;
        if (g20Var2 != null) {
            g20 g20Var3 = this.n;
            float f7 = g20Var3.K;
            float f10 = g20Var3.L;
            float f11 = -org.telegram.messenger.i0.L(36.0f);
            g20Var2.r.x = (int) c3.i0.z(point.x - (2.0f * f11), org.telegram.messenger.i0.L(105.0f), f7, f11);
            g20Var2.r.y = (int) ((point.y - org.telegram.messenger.i0.L(105.0f)) * f10);
            g20Var2.h();
            e20 e20Var = g20Var2.a;
            if (e20Var.getParent() != null) {
                g20Var2.n.updateViewLayout(e20Var, g20Var2.r);
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
        e20 e20Var;
        long j10;
        float f7;
        boolean z10;
        boolean z11;
        g20 g20Var;
        g20 g20Var2;
        m20 m20Var;
        ValueAnimator valueAnimator;
        boolean z12 = false;
        if (g20.d0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.G);
            g20 g20Var3 = this.n;
            int i10 = g20Var3.G[0];
            WindowManager.LayoutParams layoutParams = g20Var3.r;
            g20Var3.Q = i10 - layoutParams.x;
            g20Var3.R = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            org.telegram.messenger.i0.h3(this.e, 300L);
            g20 g20Var4 = this.n;
            WindowManager.LayoutParams layoutParams2 = g20Var4.r;
            g20Var4.O = layoutParams2.x;
            g20Var4.P = layoutParams2.y;
            g20Var4.X = true;
            g20Var4.a();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float f10 = rawX - this.a;
                float f11 = rawY - this.b;
                if (!this.n.W) {
                    float f12 = (f11 * f11) + (f10 * f10);
                    float f13 = this.h;
                    if (f12 > f13 * f13) {
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        org.telegram.messenger.i0.r(this.e);
                        g20 g20Var5 = this.n;
                        g20Var5.W = true;
                        g20Var5.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                }
                g20 g20Var6 = this.n;
                if (g20Var6.W) {
                    g20Var6.O += f10;
                    g20Var6.P += f11;
                    this.a = rawX;
                    this.b = rawY;
                    g20Var6.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.O;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.P;
                    float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.N - this.n.Q);
                    float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.M - this.n.R);
                    float f14 = measuredWidth - measuredWidth2;
                    float f15 = measuredHeight - measuredHeight2;
                    float f16 = (f15 * f15) + (f14 * f14);
                    if (f16 < org.telegram.messenger.i0.L(80.0f) * org.telegram.messenger.i0.L(80.0f)) {
                        f7 = 0.0f;
                        this.n.U.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f14 / f15)));
                        if (f16 < org.telegram.messenger.i0.L(50.0f) * org.telegram.messenger.i0.L(50.0f)) {
                            z10 = true;
                        } else {
                            z10 = false;
                            z11 = true;
                            g20Var = this.n;
                            if (!g20Var.F && g20Var.a0 != z10) {
                                g20Var.a0 = z10;
                                valueAnimator = g20Var.c0;
                                if (valueAnimator != null) {
                                    valueAnimator.removeAllListeners();
                                    g20Var.c0.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(g20Var.b0, !z10 ? 1.0f : f7);
                                g20Var.c0 = ofFloat;
                                ofFloat.addUpdateListener(new a6(g20Var, 25));
                                g20Var.c0.addListener(new eg.m(26, g20Var, z10));
                                g20Var.c0.setDuration(250L);
                                g20Var.c0.setInterpolator(gr.f);
                                g20Var.c0.start();
                            }
                            g20Var2 = this.n;
                            m20Var = g20Var2.U;
                            if (g20Var2.D != z11) {
                                g20Var2.D = z11;
                                g20Var2.c.invalidate();
                                if (!g20Var2.F) {
                                    g20Var2.w.P(z11 ? 33 : 0);
                                    g20Var2.V.d();
                                }
                                if (z11) {
                                    try {
                                        m20Var.performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (m20Var.s != z11) {
                                m20Var.invalidate();
                            }
                            m20Var.s = z11;
                        }
                    } else {
                        f7 = 0.0f;
                        z10 = false;
                    }
                    z11 = z10;
                    g20Var = this.n;
                    if (!g20Var.F) {
                        g20Var.a0 = z10;
                        valueAnimator = g20Var.c0;
                        if (valueAnimator != null) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(g20Var.b0, !z10 ? 1.0f : f7);
                        g20Var.c0 = ofFloat2;
                        ofFloat2.addUpdateListener(new a6(g20Var, 25));
                        g20Var.c0.addListener(new eg.m(26, g20Var, z10));
                        g20Var.c0.setDuration(250L);
                        g20Var.c0.setInterpolator(gr.f);
                        g20Var.c0.start();
                    }
                    g20Var2 = this.n;
                    m20Var = g20Var2.U;
                    if (g20Var2.D != z11) {
                    }
                    if (m20Var.s != z11) {
                    }
                    m20Var.s = z11;
                }
            }
            return true;
        }
        org.telegram.messenger.i0.r(this.f);
        org.telegram.messenger.i0.r(this.e);
        g20 g20Var7 = this.n;
        if (!g20Var7.D) {
            g20Var7.X = false;
            g20Var7.a();
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
                    this.n.e(!r1.x);
                    return false;
                }
                z12 = false;
            }
            if (parent != null && this.n.W) {
                parent.requestDisallowInterceptTouchEvent(z12);
                Point point = org.telegram.messenger.i0.q;
                int i11 = point.x;
                int i12 = point.y;
                float f17 = this.n.r.x;
                float measuredWidth3 = getMeasuredWidth() + f17;
                float f18 = this.n.r.y;
                float measuredHeight3 = getMeasuredHeight() + f18;
                this.d = new AnimatorSet();
                float f19 = -org.telegram.messenger.i0.L(36.0f);
                if (f17 < f19) {
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.r.x, f19);
                    ofFloat3.addUpdateListener(this.n.S);
                    this.d.playTogether(ofFloat3);
                    f17 = f19;
                } else if (measuredWidth3 > i11 - f19) {
                    float measuredWidth4 = (i11 - getMeasuredWidth()) - f19;
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(this.n.r.x, measuredWidth4);
                    ofFloat4.addUpdateListener(this.n.S);
                    this.d.playTogether(ofFloat4);
                    f17 = measuredWidth4;
                }
                int L = org.telegram.messenger.i0.L(36.0f) + i12;
                if (f18 < org.telegram.messenger.i0.m - org.telegram.messenger.i0.L(36.0f)) {
                    float f20 = this.n.r.y;
                    f18 = org.telegram.messenger.i0.m - org.telegram.messenger.i0.L(36.0f);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f20, f18);
                    ofFloat5.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat5);
                } else if (measuredHeight3 > L) {
                    float f21 = this.n.r.y;
                    f18 = L - getMeasuredHeight();
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f21, f18);
                    ofFloat6.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat6);
                }
                this.d.setDuration(150L).setInterpolator(gr.f);
                this.d.start();
                g20 g20Var8 = this.n;
                if (g20Var8.K >= 0.0f) {
                    float[] fArr = g20Var8.H;
                    float f22 = point.x;
                    float f23 = point.y;
                    float f24 = -org.telegram.messenger.i0.L(36.0f);
                    fArr[0] = (f17 - f24) / ((f22 - (f24 * 2.0f)) - org.telegram.messenger.i0.L(105.0f));
                    fArr[1] = f18 / (f23 - org.telegram.messenger.i0.L(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("groupcallpipconfig", 0).edit();
                    g20 g20Var9 = this.n;
                    float f25 = g20Var9.H[0];
                    g20Var9.K = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    g20 g20Var10 = this.n;
                    float f26 = g20Var10.H[1];
                    g20Var10.L = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            g20 g20Var11 = this.n;
            g20Var11.W = false;
            g20Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        g20 g20Var12 = this.n;
        ei0 ei0Var = g20Var12.V;
        bi0 bi0Var = g20Var12.w;
        jg.l0 l0Var = g20Var12.b;
        e20 e20Var2 = g20Var12.a;
        kg.f0 f0Var = g20Var12.c;
        g20 g20Var13 = g20.d0;
        if (g20Var13 == null) {
            return false;
        }
        g20Var12.F = true;
        g20.e0 = true;
        g20Var12.U.K = true;
        g20Var13.e(false);
        float measuredWidth5 = (e20Var2.getMeasuredWidth() / 2.0f) + g20Var12.r.x;
        float measuredWidth6 = ((l0Var.getMeasuredWidth() / 2.0f) + (g20Var12.N - g20Var12.Q)) - measuredWidth5;
        float measuredHeight4 = ((l0Var.getMeasuredHeight() / 2.0f) + (g20Var12.M - g20Var12.R)) - ((e20Var2.getMeasuredHeight() / 2.0f) + g20Var12.r.y);
        g20 g20Var14 = g20.d0;
        WindowManager windowManager = g20Var14.n;
        e20 e20Var3 = g20Var14.a;
        jg.l0 l0Var2 = g20Var14.b;
        FrameLayout frameLayout = g20Var14.d;
        org.telegram.ui.w7 w7Var = g20Var14.e;
        g20Var12.d();
        g20.d0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i13 = bi0Var.a0;
        if (i13 < 33) {
            e20Var = e20Var3;
            j10 = (long) (((1.0f - (i13 / 33.0f)) * bi0Var.r()) / 2.0f);
        } else {
            e20Var = e20Var3;
            j10 = 0;
        }
        float f27 = g20Var12.r.x;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f27, measuredWidth6 + f27);
        ofFloat7.addUpdateListener(g20Var12.S);
        ValueAnimator duration = ofFloat7.setDuration(250L);
        gr grVar = gr.f;
        duration.setInterpolator(grVar);
        animatorSet.playTogether(ofFloat7);
        float f28 = g20Var12.r.y;
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(f28, (f28 + measuredHeight4) - org.telegram.messenger.i0.L(30.0f), g20Var12.r.y + measuredHeight4);
        ofFloat8.addUpdateListener(g20Var12.T);
        ofFloat8.setDuration(250L).setInterpolator(grVar);
        animatorSet.playTogether(ofFloat8);
        float[] fArr2 = {e20Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        e20 e20Var4 = e20Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(e20Var4, (Property<e20, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {e20Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(e20Var4, (Property<e20, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(e20Var4, (Property<e20, Float>) property3, 1.0f, 0.0f);
        float f29 = 350L;
        ofFloat9.setStartDelay((long) (f29 * 0.7f));
        ofFloat9.setDuration((long) (f29 * 0.3f));
        animatorSet.playTogether(ofFloat9);
        org.telegram.messenger.i0.h3(new org.telegram.messenger.rz(20), 370L);
        long j11 = j10 + 530;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property, 1.0f, 1.05f);
        ofFloat10.setDuration(j11);
        gr grVar2 = gr.j;
        ofFloat10.setInterpolator(grVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property2, 1.0f, 1.05f);
        ofFloat11.setDuration(j11);
        ofFloat11.setInterpolator(grVar2);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j11);
        ofFloat12.setDuration(350L);
        gr grVar3 = gr.h;
        ofFloat12.setInterpolator(grVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property2, 1.0f, 0.3f);
        ofFloat13.setStartDelay(j11);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(grVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) View.TRANSLATION_Y, 0.0f, org.telegram.messenger.i0.L(60.0f));
        ofFloat14.setStartDelay(j11);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(grVar3);
        animatorSet.playTogether(ofFloat14);
        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(f0Var, (Property<kg.f0, Float>) property3, 1.0f, 0.0f);
        ofFloat15.setStartDelay(j11);
        ofFloat15.setDuration(350L);
        ofFloat15.setInterpolator(grVar3);
        animatorSet.playTogether(ofFloat15);
        animatorSet.addListener(new f20(g20Var12, e20Var4, l0Var2, windowManager, frameLayout, w7Var));
        animatorSet.start();
        bi0Var.P(66);
        ei0Var.i();
        ei0Var.d();
        return false;
    }
}
