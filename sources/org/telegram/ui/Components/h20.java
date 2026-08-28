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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h20 extends FrameLayout {
    public float a;
    public float b;
    public boolean c;
    public AnimatorSet d;
    public final g20 e;
    public final hc f;
    public final /* synthetic */ float h;
    public final /* synthetic */ j20 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h20(j20 j20Var, Context context, float f10) {
        super(context);
        this.n = j20Var;
        this.h = f10;
        this.e = new g20(this);
        this.f = new hc(11);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        Point point = AndroidUtilities.displaySize;
        int i11 = point.x;
        j20 j20Var = this.n;
        if (i11 == j20Var.E && j20Var.F == point.y) {
            return;
        }
        j20Var.E = i11;
        j20Var.F = point.y;
        if (j20Var.G < 0.0f) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0);
            this.n.G = sharedPreferences.getFloat("relativeX", 1.0f);
            this.n.H = sharedPreferences.getFloat("relativeY", 0.4f);
        }
        j20 j20Var2 = j20.Z;
        if (j20Var2 != null) {
            j20 j20Var3 = this.n;
            float f10 = j20Var3.G;
            float f11 = j20Var3.H;
            float f12 = -AndroidUtilities.dp(36.0f);
            j20Var2.r.x = (int) e2.c.z(AndroidUtilities.displaySize.x - (2.0f * f12), AndroidUtilities.dp(105.0f), f10, f12);
            j20Var2.r.y = (int) ((AndroidUtilities.displaySize.y - AndroidUtilities.dp(105.0f)) * f11);
            j20Var2.h();
            h20 h20Var = j20Var2.a;
            if (h20Var.getParent() != null) {
                j20Var2.n.updateViewLayout(h20Var, j20Var2.r);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fh.d2 d2Var;
        long j10;
        int i9;
        boolean z10;
        boolean z11;
        if (j20.Z != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            ViewParent parent = getParent();
            int action = motionEvent.getAction();
            if (action == 0) {
                getLocationOnScreen(this.n.C);
                j20 j20Var = this.n;
                int i10 = j20Var.C[0];
                WindowManager.LayoutParams layoutParams = j20Var.r;
                j20Var.M = i10 - layoutParams.x;
                j20Var.N = r4[1] - layoutParams.y;
                this.a = rawX;
                this.b = rawY;
                System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(this.e, 300L);
                j20 j20Var2 = this.n;
                WindowManager.LayoutParams layoutParams2 = j20Var2.r;
                j20Var2.K = layoutParams2.x;
                j20Var2.L = layoutParams2.y;
                j20Var2.T = true;
                j20Var2.a();
                return true;
            }
            int i11 = 10;
            if (action != 1) {
                if (action == 2) {
                    float f10 = rawX - this.a;
                    float f11 = rawY - this.b;
                    if (!this.n.S) {
                        float f12 = (f11 * f11) + (f10 * f10);
                        float f13 = this.h;
                        if (f12 > f13 * f13) {
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            AndroidUtilities.cancelRunOnUIThread(this.e);
                            j20 j20Var3 = this.n;
                            j20Var3.S = true;
                            j20Var3.f(true);
                            this.n.e(false);
                            this.a = rawX;
                            this.b = rawY;
                            f10 = 0.0f;
                            f11 = 0.0f;
                        }
                    }
                    j20 j20Var4 = this.n;
                    if (!j20Var4.S) {
                        return true;
                    }
                    j20Var4.K += f10;
                    j20Var4.L += f11;
                    this.a = rawX;
                    this.b = rawY;
                    j20Var4.i();
                    float measuredWidth = (getMeasuredWidth() / 2.0f) + this.n.K;
                    float measuredHeight = (getMeasuredHeight() / 2.0f) + this.n.L;
                    float measuredWidth2 = (r1.b.getMeasuredWidth() / 2.0f) + (r1.J - this.n.M);
                    float measuredHeight2 = (r5.b.getMeasuredHeight() / 2.0f) + (r5.I - this.n.N);
                    float f14 = measuredWidth - measuredWidth2;
                    float f15 = measuredHeight - measuredHeight2;
                    float f16 = (f15 * f15) + (f14 * f14);
                    if (f16 < AndroidUtilities.dp(80.0f) * AndroidUtilities.dp(80.0f)) {
                        i9 = 0;
                        this.n.Q.setRemoveAngle((((measuredWidth <= measuredWidth2 || measuredHeight >= measuredHeight2) && (measuredWidth >= measuredWidth2 || measuredHeight >= measuredHeight2)) ? 90.0d : 270.0d) - Math.toDegrees(Math.atan(f14 / f15)));
                        z10 = f16 < ((float) (AndroidUtilities.dp(50.0f) * AndroidUtilities.dp(50.0f)));
                        z11 = true;
                    } else {
                        i9 = 0;
                        z10 = false;
                        z11 = false;
                    }
                    j20 j20Var5 = this.n;
                    if (!j20Var5.B && j20Var5.W != z10) {
                        j20Var5.W = z10;
                        ValueAnimator valueAnimator = j20Var5.Y;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllListeners();
                            j20Var5.Y.cancel();
                        }
                        float f17 = j20Var5.X;
                        float f18 = z10 ? 1.0f : 0.0f;
                        float[] fArr = new float[2];
                        fArr[i9] = f17;
                        fArr[1] = f18;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        j20Var5.Y = ofFloat;
                        ofFloat.addUpdateListener(new e6(j20Var5, 25));
                        j20Var5.Y.addListener(new u9(i11, j20Var5, z10));
                        j20Var5.Y.setDuration(250L);
                        j20Var5.Y.setInterpolator(gr.f);
                        j20Var5.Y.start();
                    }
                    j20 j20Var6 = this.n;
                    p20 p20Var = j20Var6.Q;
                    if (j20Var6.y != z11) {
                        j20Var6.y = z11;
                        j20Var6.c.invalidate();
                        if (!j20Var6.B) {
                            mi0 mi0Var = j20Var6.v;
                            if (z11) {
                                i9 = 33;
                            }
                            mi0Var.N(i9);
                            j20Var6.R.d();
                        }
                        if (z11) {
                            try {
                                p20Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (p20Var.s != z11) {
                        p20Var.invalidate();
                    }
                    p20Var.s = z11;
                    return true;
                }
                if (action != 3) {
                    return true;
                }
            }
            AndroidUtilities.cancelRunOnUIThread(this.f);
            AndroidUtilities.cancelRunOnUIThread(this.e);
            j20 j20Var7 = this.n;
            if (!j20Var7.y) {
                j20Var7.T = false;
                j20Var7.a();
                if (this.c) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setMicMute(true, false, false);
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    }
                    this.c = false;
                } else if (motionEvent.getAction() == 1 && !this.n.S) {
                    if (VoIPService.getSharedInstance() != null) {
                        this.n.e(!r1.w);
                        return false;
                    }
                }
                if (parent != null && this.n.S) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    Point point = AndroidUtilities.displaySize;
                    int i12 = point.x;
                    int i13 = point.y;
                    float f19 = this.n.r.x;
                    float measuredWidth3 = getMeasuredWidth() + f19;
                    float f20 = this.n.r.y;
                    float measuredHeight3 = getMeasuredHeight() + f20;
                    this.d = new AnimatorSet();
                    float f21 = -AndroidUtilities.dp(36.0f);
                    if (f19 < f21) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.n.r.x, f21);
                        ofFloat2.addUpdateListener(this.n.O);
                        this.d.playTogether(ofFloat2);
                        f19 = f21;
                    } else if (measuredWidth3 > i12 - f21) {
                        float measuredWidth4 = (i12 - getMeasuredWidth()) - f21;
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(this.n.r.x, measuredWidth4);
                        ofFloat3.addUpdateListener(this.n.O);
                        this.d.playTogether(ofFloat3);
                        f19 = measuredWidth4;
                    }
                    int dp = AndroidUtilities.dp(36.0f) + i13;
                    if (f20 < AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f)) {
                        float f22 = this.n.r.y;
                        f20 = AndroidUtilities.statusBarHeight - AndroidUtilities.dp(36.0f);
                        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f22, f20);
                        ofFloat4.addUpdateListener(this.n.P);
                        this.d.playTogether(ofFloat4);
                    } else if (measuredHeight3 > dp) {
                        float f23 = this.n.r.y;
                        f20 = dp - getMeasuredHeight();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(f23, f20);
                        ofFloat5.addUpdateListener(this.n.P);
                        this.d.playTogether(ofFloat5);
                    }
                    this.d.setDuration(150L).setInterpolator(gr.f);
                    this.d.start();
                    j20 j20Var8 = this.n;
                    if (j20Var8.G >= 0.0f) {
                        float[] fArr2 = j20Var8.D;
                        Point point2 = AndroidUtilities.displaySize;
                        float f24 = point2.x;
                        float f25 = point2.y;
                        float f26 = -AndroidUtilities.dp(36.0f);
                        fArr2[0] = (f19 - f26) / ((f24 - (f26 * 2.0f)) - AndroidUtilities.dp(105.0f));
                        fArr2[1] = f20 / (f25 - AndroidUtilities.dp(105.0f));
                        fArr2[0] = Math.min(1.0f, Math.max(0.0f, fArr2[0]));
                        fArr2[1] = Math.min(1.0f, Math.max(0.0f, fArr2[1]));
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("groupcallpipconfig", 0).edit();
                        j20 j20Var9 = this.n;
                        float f27 = j20Var9.D[0];
                        j20Var9.G = f27;
                        SharedPreferences.Editor putFloat = edit.putFloat("relativeX", f27);
                        j20 j20Var10 = this.n;
                        float f28 = j20Var10.D[1];
                        j20Var10.H = f28;
                        putFloat.putFloat("relativeY", f28).apply();
                    }
                }
                j20 j20Var11 = this.n;
                j20Var11.S = false;
                j20Var11.f(false);
                return true;
            }
            if (this.c && VoIPService.getSharedInstance() != null) {
                VoIPService.getSharedInstance().setMicMute(true, false, false);
            }
            this.c = false;
            j20 j20Var12 = this.n;
            pi0 pi0Var = j20Var12.R;
            mi0 mi0Var2 = j20Var12.v;
            fh.d2 d2Var2 = j20Var12.b;
            h20 h20Var = j20Var12.a;
            kh.h6 h6Var = j20Var12.c;
            j20 j20Var13 = j20.Z;
            if (j20Var13 != null) {
                j20Var12.B = true;
                j20.a0 = true;
                j20Var12.Q.G = true;
                j20Var13.e(false);
                float measuredWidth5 = (h20Var.getMeasuredWidth() / 2.0f) + j20Var12.r.x;
                float measuredWidth6 = ((d2Var2.getMeasuredWidth() / 2.0f) + (j20Var12.J - j20Var12.M)) - measuredWidth5;
                float measuredHeight4 = ((d2Var2.getMeasuredHeight() / 2.0f) + (j20Var12.I - j20Var12.N)) - ((h20Var.getMeasuredHeight() / 2.0f) + j20Var12.r.y);
                j20 j20Var14 = j20.Z;
                WindowManager windowManager = j20Var14.n;
                h20 h20Var2 = j20Var14.a;
                fh.d2 d2Var3 = j20Var14.b;
                FrameLayout frameLayout = j20Var14.d;
                org.telegram.ui.t7 t7Var = j20Var14.e;
                j20Var12.d();
                j20.Z = null;
                AnimatorSet animatorSet = new AnimatorSet();
                int i14 = mi0Var2.X;
                if (i14 < 33) {
                    d2Var = d2Var3;
                    j10 = (long) (((1.0f - (i14 / 33.0f)) * mi0Var2.p()) / 2.0f);
                } else {
                    d2Var = d2Var3;
                    j10 = 0;
                }
                long j11 = j10;
                float f29 = j20Var12.r.x;
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(f29, measuredWidth6 + f29);
                ofFloat6.addUpdateListener(j20Var12.O);
                ValueAnimator duration = ofFloat6.setDuration(250L);
                gr grVar = gr.f;
                duration.setInterpolator(grVar);
                animatorSet.playTogether(ofFloat6);
                float f30 = j20Var12.r.y;
                ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f30, (f30 + measuredHeight4) - AndroidUtilities.dp(30.0f), j20Var12.r.y + measuredHeight4);
                ofFloat7.addUpdateListener(j20Var12.P);
                ofFloat7.setDuration(250L).setInterpolator(grVar);
                animatorSet.playTogether(ofFloat7);
                float[] fArr3 = {h20Var2.getScaleX(), 0.1f};
                Property property = View.SCALE_X;
                animatorSet.playTogether(ObjectAnimator.ofFloat(h20Var2, (Property<h20, Float>) property, fArr3).setDuration(180L));
                float[] fArr4 = {h20Var2.getScaleY(), 0.1f};
                Property property2 = View.SCALE_Y;
                animatorSet.playTogether(ObjectAnimator.ofFloat(h20Var2, (Property<h20, Float>) property2, fArr4).setDuration(180L));
                Property property3 = View.ALPHA;
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h20Var2, (Property<h20, Float>) property3, 1.0f, 0.0f);
                float f31 = 350L;
                ofFloat8.setStartDelay((long) (f31 * 0.7f));
                ofFloat8.setDuration((long) (f31 * 0.3f));
                animatorSet.playTogether(ofFloat8);
                AndroidUtilities.runOnUIThread(new hc(10), 370L);
                long j12 = j11 + 530;
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) property, 1.0f, 1.05f);
                ofFloat9.setDuration(j12);
                gr grVar2 = gr.j;
                ofFloat9.setInterpolator(grVar2);
                animatorSet.playTogether(ofFloat9);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) property2, 1.0f, 1.05f);
                ofFloat10.setDuration(j12);
                ofFloat10.setInterpolator(grVar2);
                animatorSet.playTogether(ofFloat10);
                ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) property, 1.0f, 0.3f);
                ofFloat11.setStartDelay(j12);
                ofFloat11.setDuration(350L);
                gr grVar3 = gr.h;
                ofFloat11.setInterpolator(grVar3);
                animatorSet.playTogether(ofFloat11);
                ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) property2, 1.0f, 0.3f);
                ofFloat12.setStartDelay(j12);
                ofFloat12.setDuration(350L);
                ofFloat12.setInterpolator(grVar3);
                animatorSet.playTogether(ofFloat12);
                ObjectAnimator ofFloat13 = ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(60.0f));
                ofFloat13.setStartDelay(j12);
                ofFloat13.setDuration(350L);
                ofFloat13.setInterpolator(grVar3);
                animatorSet.playTogether(ofFloat13);
                ObjectAnimator ofFloat14 = ObjectAnimator.ofFloat(h6Var, (Property<kh.h6, Float>) property3, 1.0f, 0.0f);
                ofFloat14.setStartDelay(j12);
                ofFloat14.setDuration(350L);
                ofFloat14.setInterpolator(grVar3);
                animatorSet.playTogether(ofFloat14);
                animatorSet.addListener(new i20(j20Var12, h20Var2, d2Var, windowManager, frameLayout, t7Var));
                animatorSet.start();
                mi0Var2.N(66);
                pi0Var.i();
                pi0Var.d();
                return false;
            }
        }
        return false;
    }
}
