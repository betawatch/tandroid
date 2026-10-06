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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public class mz extends s4.s0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ nz c;

    public mz(nz nzVar, int i10) {
        this.c = nzVar;
        this.a = i10;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        az azVar;
        nz nzVar = this.c;
        ObjectAnimator[] objectAnimatorArr = nzVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        if (y0Var != null && y0Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (nzVar.J0) {
                    nzVar.J0 = false;
                }
                if (i11 == 0) {
                    azVar = nzVar.G0;
                } else if (i11 == 1) {
                    azVar = nzVar.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(hg.c.h(i11, "Unexpected argument: "));
                    }
                    azVar = nzVar.o0;
                }
                if (azVar != null) {
                    azVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (nzVar.T0 == null) {
                    gg.g1 g1Var = new gg.g1(nzVar, nzVar.c1, nzVar.t1.a(), nzVar.t1.f(), 1);
                    nzVar.T0 = g1Var;
                    g1Var.a();
                }
                nzVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = nzVar.Q0;
            oy oyVar = nzVar.t1;
            if ((oyVar == null || !oyVar.z()) && i11 != 0) {
                float dpf2 = AndroidUtilities.dpf2(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-dpf2);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    zl0 x10 = nzVar.x(i11);
                    int dp = AndroidUtilities.dp(i11 == 1 ? 38.0f : 48.0f);
                    s4.c1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (dp + i12)) / nzVar.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            nzVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y3 = nzVar.y(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(dpf2)) : 0;
                    if (f7 > 0.5f) {
                        nzVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        nzVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y3, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y3.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.q2(nzVar, i11, 3));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y3.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (nzVar.J0) {
            nzVar.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        nz nzVar = this.c;
        int i12 = this.a;
        nzVar.p(i12);
        nz.e(nzVar, i12, i11);
        if (i12 == 0) {
            nzVar.q(false);
        } else if (i12 == 1) {
            nzVar.l(false);
        } else if (i12 == 2) {
            nz.f(nzVar, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = nzVar.n;
        if (SystemClock.elapsedRealtime() - nzVar.C2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        nzVar.H += f7;
        int dp = nzVar.h.getCurrentItem() == 0 ? AndroidUtilities.dp(38.0f) : AndroidUtilities.dp(48.0f);
        float f10 = nzVar.H;
        if (f10 >= dp) {
            nzVar.K(false);
            return;
        }
        if (f10 <= (-dp)) {
            nzVar.K(true);
        } else {
            if ((frameLayout.getTag() != null || nzVar.H >= 0.0f) && (frameLayout.getTag() == null || nzVar.H <= 0.0f)) {
                return;
            }
            nzVar.H = 0.0f;
        }
    }
}
