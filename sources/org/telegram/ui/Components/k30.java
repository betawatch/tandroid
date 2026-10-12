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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class k30 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final j30 e;
    public final ve f;
    public final /* synthetic */ float h;
    public final /* synthetic */ m30 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(m30 m30Var, Context context, float f7) {
        super(context);
        this.n = m30Var;
        this.h = f7;
        this.e = new j30(this);
        this.f = new ve(7);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x;
        m30 m30Var = this.n;
        if (i12 == m30Var.I && m30Var.J == point.y) {
            return;
        }
        m30Var.I = i12;
        m30Var.J = point.y;
        if (m30Var.K < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.K = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.L = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        m30 m30Var2 = m30.d0;
        if (m30Var2 != null) {
            m30 m30Var3 = this.n;
            float f7 = m30Var3.K;
            float f10 = m30Var3.L;
            float f11 = -AndroidUtilities.dp(36.0f);
            m30Var2.r.x = (int) com.google.android.gms.internal.play_billing.k3.y(AndroidUtilities.displaySize.x - (2.0f * f11), AndroidUtilities.dp(105.0f), f7, f11);
            m30Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f10);
            m30Var2.h();
            k30 k30Var = m30Var2.a;
            if (k30Var.getParent() != null) {
                m30Var2.n.updateViewLayout(k30Var, m30Var2.r);
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
        k30 k30Var;
        long j10;
        float f7;
        boolean z10;
        boolean z11;
        m30 m30Var;
        m30 m30Var2;
        s30 s30Var;
        ValueAnimator valueAnimator;
        boolean z12 = false;
        if (m30.d0 == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        ViewParent parent = getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            getLocationOnScreen(this.n.G);
            m30 m30Var3 = this.n;
            int i10 = m30Var3.G[0];
            WindowManager.LayoutParams layoutParams = m30Var3.r;
            m30Var3.Q = i10 - layoutParams.x;
            m30Var3.R = r5[1] - layoutParams.y;
            this.a = rawX;
            this.b = rawY;
            System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(this.e, 300L);
            m30 m30Var4 = this.n;
            WindowManager.LayoutParams layoutParams2 = m30Var4.r;
            m30Var4.O = layoutParams2.x;
            m30Var4.P = layoutParams2.y;
            m30Var4.X = true;
            m30Var4.a();
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
                        AndroidUtilities.cancelRunOnUIThread(this.e);
                        m30 m30Var5 = this.n;
                        m30Var5.W = true;
                        m30Var5.f(true);
                        this.n.e(false);
                        this.a = rawX;
                        this.b = rawY;
                        f10 = 0.0f;
                        f11 = 0.0f;
                    }
                }
                m30 m30Var6 = this.n;
                if (m30Var6.W) {
                    m30Var6.O += f10;
                    m30Var6.P += f11;
                    this.a = rawX;
                    this.b = rawY;
                    m30Var6.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.O;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.P;
                    float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.N - this.n.Q);
                    float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.M - this.n.R);
                    float f14 = measuredWidth - measuredWidth2;
                    float f15 = measuredHeight - measuredHeight2;
                    float f16 = (f15 * f15) + (f14 * f14);
                    if (f16 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                        f7 = 0.0f;
                        this.n.U.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f14 / f15)));
                        if (f16 < AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)) {
                            z10 = true;
                        } else {
                            z10 = false;
                            z11 = true;
                            m30Var = this.n;
                            if (!m30Var.F && m30Var.a0 != z10) {
                                m30Var.a0 = z10;
                                valueAnimator = m30Var.c0;
                                if (valueAnimator != null) {
                                    valueAnimator.removeAllListeners();
                                    m30Var.c0.cancel();
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(m30Var.b0, !z10 ? 1.0f : f7);
                                m30Var.c0 = ofFloat;
                                ofFloat.addUpdateListener(new n6(m30Var, 26));
                                m30Var.c0.addListener(new org.telegram.ui.vo(11, m30Var, z10));
                                m30Var.c0.setDuration(250L);
                                m30Var.c0.setInterpolator(es.f);
                                m30Var.c0.start();
                            }
                            m30Var2 = this.n;
                            s30Var = m30Var2.U;
                            if (m30Var2.y != z11) {
                                m30Var2.y = z11;
                                m30Var2.c.invalidate();
                                if (!m30Var2.F) {
                                    m30Var2.v.P(z11 ? 33 : 0);
                                    m30Var2.V.d();
                                }
                                if (z11) {
                                    try {
                                        s30Var.performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            if (s30Var.s != z11) {
                                s30Var.invalidate();
                            }
                            s30Var.s = z11;
                        }
                    } else {
                        f7 = 0.0f;
                        z10 = false;
                    }
                    z11 = z10;
                    m30Var = this.n;
                    if (!m30Var.F) {
                        m30Var.a0 = z10;
                        valueAnimator = m30Var.c0;
                        if (valueAnimator != null) {
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(m30Var.b0, !z10 ? 1.0f : f7);
                        m30Var.c0 = ofFloat2;
                        ofFloat2.addUpdateListener(new n6(m30Var, 26));
                        m30Var.c0.addListener(new org.telegram.ui.vo(11, m30Var, z10));
                        m30Var.c0.setDuration(250L);
                        m30Var.c0.setInterpolator(es.f);
                        m30Var.c0.start();
                    }
                    m30Var2 = this.n;
                    s30Var = m30Var2.U;
                    if (m30Var2.y != z11) {
                    }
                    if (s30Var.s != z11) {
                    }
                    s30Var.s = z11;
                }
            }
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f);
        AndroidUtilities.cancelRunOnUIThread(this.e);
        m30 m30Var7 = this.n;
        if (!m30Var7.y) {
            m30Var7.X = false;
            m30Var7.a();
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
                float f17 = this.n.r.x;
                float measuredWidth3 = getMeasuredWidth() + f17;
                float f18 = this.n.r.y;
                float measuredHeight3 = getMeasuredHeight() + f18;
                this.d = new AnimatorSet();
                float f19 = -AndroidUtilities.dp(36.0f);
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
                int dp = AndroidUtilities.dp(36.0f) + i12;
                if (f18 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                    float f20 = this.n.r.y;
                    f18 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                    ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f20, f18);
                    ofFloat5.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat5);
                } else if (measuredHeight3 > dp) {
                    float f21 = this.n.r.y;
                    f18 = dp - getMeasuredHeight();
                    ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f21, f18);
                    ofFloat6.addUpdateListener(this.n.T);
                    this.d.playTogether(ofFloat6);
                }
                this.d.setDuration(150L).setInterpolator(es.f);
                this.d.start();
                m30 m30Var8 = this.n;
                if (m30Var8.K >= 0.0f) {
                    float[] fArr = m30Var8.H;
                    Point point2 = AndroidUtilities.displaySize;
                    float f22 = point2.x;
                    float f23 = point2.y;
                    float f24 = -AndroidUtilities.dp(36.0f);
                    fArr[0] = (f17 - f24) / ((f22 - (f24 * 2.0f)) - AndroidUtilities.dp(105.0f));
                    fArr[1] = f18 / (f23 - AndroidUtilities.dp(105.0f));
                    fArr[0] = Math.min(1.0f, Math.max(0.0f, fArr[0]));
                    fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1]));
                    SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                    m30 m30Var9 = this.n;
                    float f25 = m30Var9.H[0];
                    m30Var9.K = f25;
                    SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f25);
                    m30 m30Var10 = this.n;
                    float f26 = m30Var10.H[1];
                    m30Var10.L = f26;
                    putFloat.putFloat("relativeY", f26).apply();
                }
            }
            m30 m30Var11 = this.n;
            m30Var11.W = false;
            m30Var11.f(false);
            return true;
        }
        if (this.c && VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().setMicMute(true, false, false);
        }
        this.c = false;
        m30 m30Var12 = this.n;
        bk0 bk0Var = m30Var12.V;
        yj0 yj0Var = m30Var12.v;
        ah.x xVar = m30Var12.b;
        k30 k30Var2 = m30Var12.a;
        di.p6 p6Var = m30Var12.c;
        m30 m30Var13 = m30.d0;
        if (m30Var13 == null) {
            return false;
        }
        m30Var12.F = true;
        m30.e0 = true;
        m30Var12.U.K = true;
        m30Var13.e(false);
        float measuredWidth5 = (k30Var2.getMeasuredWidth() / 2.0f) + m30Var12.r.x;
        float measuredWidth6 = ((xVar.getMeasuredWidth() / 2.0f) + (m30Var12.N - m30Var12.Q)) - measuredWidth5;
        float measuredHeight4 = ((xVar.getMeasuredHeight() / 2.0f) + (m30Var12.M - m30Var12.R)) - ((k30Var2.getMeasuredHeight() / 2.0f) + m30Var12.r.y);
        m30 m30Var14 = m30.d0;
        WindowManager windowManager = m30Var14.n;
        k30 k30Var3 = m30Var14.a;
        ah.x xVar2 = m30Var14.b;
        FrameLayout frameLayout = m30Var14.d;
        org.telegram.ui.y7 y7Var = m30Var14.e;
        m30Var12.d();
        m30.d0 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        int i13 = yj0Var.a0;
        if (i13 < 33) {
            k30Var = k30Var3;
            j10 = (long) (((1.0f - (i13 / 33.0f)) * yj0Var.r()) / 2.0f);
        } else {
            k30Var = k30Var3;
            j10 = 0;
        }
        float f27 = m30Var12.r.x;
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f27, measuredWidth6 + f27);
        ofFloat7.addUpdateListener(m30Var12.S);
        ValueAnimator duration = ofFloat7.setDuration(250L);
        es esVar = es.f;
        duration.setInterpolator(esVar);
        animatorSet.playTogether(ofFloat7);
        float f28 = m30Var12.r.y;
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(f28, (f28 + measuredHeight4) - AndroidUtilities.dp(30.0f), m30Var12.r.y + measuredHeight4);
        ofFloat8.addUpdateListener(m30Var12.T);
        ofFloat8.setDuration(250L).setInterpolator(esVar);
        animatorSet.playTogether(ofFloat8);
        float[] fArr2 = {k30Var.getScaleX(), 0.1f};
        Property property = View.SCALE_X;
        k30 k30Var4 = k30Var;
        animatorSet.playTogether(ObjectAnimator.ofFloat(k30Var4, (Property<k30, Float>) property, fArr2).setDuration(180L));
        float[] fArr3 = {k30Var4.getScaleY(), 0.1f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(k30Var4, (Property<k30, Float>) property2, fArr3).setDuration(180L));
        Property property3 = View.ALPHA;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(k30Var4, (Property<k30, Float>) property3, 1.0f, 0.0f);
        float f29 = 350L;
        ofFloat9.setStartDelay((long) (f29 * 0.7f));
        ofFloat9.setDuration((long) (f29 * 0.3f));
        animatorSet.playTogether(ofFloat9);
        AndroidUtilities.runOnUIThread(new ve(6), 370L);
        long j11 = j10 + 530;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(p6Var, (Property<di.p6, Float>) property, 1.0f, 1.05f);
        ofFloat10.setDuration(j11);
        es esVar2 = es.j;
        ofFloat10.setInterpolator(esVar2);
        animatorSet.playTogether(ofFloat10);
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(p6Var, (Property<di.p6, Float>) property2, 1.0f, 1.05f);
        ofFloat11.setDuration(j11);
        ofFloat11.setInterpolator(esVar2);
        animatorSet.playTogether(ofFloat11);
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(p6Var, (Property<di.p6, Float>) property, 1.0f, 0.3f);
        ofFloat12.setStartDelay(j11);
        ofFloat12.setDuration(350L);
        es esVar3 = es.h;
        ofFloat12.setInterpolator(esVar3);
        animatorSet.playTogether(ofFloat12);
        ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(p6Var, (Property<di.p6, Float>) property2, 1.0f, 0.3f);
        ofFloat13.setStartDelay(j11);
        ofFloat13.setDuration(350L);
        ofFloat13.setInterpolator(esVar3);
        animatorSet.playTogether(ofFloat13);
        ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(p6Var, (Property<di.p6, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
        ofFloat14.setStartDelay(j11);
        ofFloat14.setDuration(350L);
        ofFloat14.setInterpolator(esVar3);
        animatorSet.playTogether(ofFloat14);
        ObjectAnimator ofFloat15 = ObjectAnimator.ofFloat(p6Var, (Property<di.p6, Float>) property3, 1.0f, 0.0f);
        ofFloat15.setStartDelay(j11);
        ofFloat15.setDuration(350L);
        ofFloat15.setInterpolator(esVar3);
        animatorSet.playTogether(ofFloat15);
        animatorSet.addListener(new l30(m30Var12, k30Var4, xVar2, windowManager, frameLayout, y7Var));
        animatorSet.start();
        yj0Var.P(66);
        bk0Var.i();
        bk0Var.d();
        return false;
    }
}
