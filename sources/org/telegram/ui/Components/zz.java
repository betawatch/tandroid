package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class zz extends s4.t0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ a00 c;

    public zz(a00 a00Var, int i10) {
        this.c = a00Var;
        this.a = i10;
    }

    @Override // s4.t0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        mz mzVar;
        a00 a00Var = this.c;
        ObjectAnimator[] objectAnimatorArr = a00Var.R0;
        s4.z0 z0Var = recyclerView.getLayoutManager().e;
        if (z0Var != null && z0Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (a00Var.J0) {
                    a00Var.J0 = false;
                }
                if (i11 == 0) {
                    mzVar = a00Var.G0;
                } else if (i11 == 1) {
                    mzVar = a00Var.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(hg.c.h(i11, "Unexpected argument: "));
                    }
                    mzVar = a00Var.o0;
                }
                if (mzVar != null) {
                    mzVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (a00Var.T0 == null) {
                    gg.f1 f1Var = new gg.f1(a00Var, a00Var.c1, a00Var.t1.a(), a00Var.t1.f(), 1);
                    a00Var.T0 = f1Var;
                    f1Var.a();
                }
                a00Var.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = a00Var.Q0;
            az azVar = a00Var.t1;
            if ((azVar == null || !azVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-dpf2);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    qm0 y3 = a00Var.y(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    s4.d1 K = y3.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / a00Var.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            a00Var.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView z10 = a00Var.z(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f7 > 0.5f) {
                        a00Var.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        a00Var.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, z10.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(a00Var, i11, 3));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(z10.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (a00Var.J0) {
            a00Var.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.t0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        a00 a00Var = this.c;
        int i12 = this.a;
        a00Var.q(i12);
        a00.e(a00Var, i12, i11);
        if (i12 == 0) {
            a00Var.r(false);
        } else if (i12 == 1) {
            a00Var.l(false);
        } else if (i12 == 2) {
            a00.f(a00Var, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = a00Var.n;
        if (SystemClock.elapsedRealtime() - a00Var.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        a00Var.H += f7;
        int dp = a00Var.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = a00Var.H;
        if (f10 >= dp) {
            a00Var.M(false);
            return;
        }
        if (f10 <= (-dp)) {
            a00Var.M(true);
        } else {
            if ((frameLayout.getTag() != null || a00Var.H >= 0.0f) && (frameLayout.getTag() == null || a00Var.H <= 0.0f)) {
                return;
            }
            a00Var.H = 0.0f;
        }
    }
}
