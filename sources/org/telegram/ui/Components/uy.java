package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class uy extends s4.s0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ vy c;

    public uy(vy vyVar, int i10) {
        this.c = vyVar;
        this.a = i10;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        ObjectAnimator objectAnimator;
        iy iyVar;
        vy vyVar = this.c;
        ObjectAnimator[] objectAnimatorArr = vyVar.R0;
        s4.y0 y0Var = recyclerView.getLayoutManager().e;
        if (y0Var != null && y0Var.e) {
            this.b = true;
            return;
        }
        int i11 = this.a;
        if (i10 != 0) {
            if (i10 == 1) {
                if (vyVar.J0) {
                    vyVar.J0 = false;
                }
                if (i11 == 0) {
                    iyVar = vyVar.G0;
                } else if (i11 == 1) {
                    iyVar = vyVar.V;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException(i0.a.i(i11, "Unexpected argument: "));
                    }
                    iyVar = vyVar.o0;
                }
                if (iyVar != null) {
                    iyVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i11]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i11].cancel();
            }
            if (i11 == 0) {
                if (vyVar.T0 == null) {
                    mw mwVar = new mw(vyVar, vyVar.c1, vyVar.t1.a(), vyVar.t1.f(), 0);
                    vyVar.T0 = mwVar;
                    mwVar.a();
                }
                vyVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = vyVar.Q0;
            vx vxVar = vyVar.t1;
            if ((vxVar == null || !vxVar.z()) && i11 != 0) {
                float N = org.telegram.messenger.i0.N(i11 == 1 ? 36.0f : 48.0f);
                float f7 = iArr[i11] / (-N);
                if (f7 <= 0.0f || f7 >= 1.0f) {
                    tk0 y3 = vyVar.y(i11);
                    int L = org.telegram.messenger.i0.L(i11 == 1 ? 38.0f : 48.0f);
                    s4.c1 K = y3.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i12 = iArr[i11];
                        float f10 = (bottom - (L + i12)) / vyVar.b1;
                        if (f10 > 0.0f || f10 < 1.0f) {
                            vyVar.i(i11, i12, f10 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView z10 = vyVar.z(i11);
                    int i13 = f7 > 0.5f ? (int) (-Math.ceil(N)) : 0;
                    if (f7 > 0.5f) {
                        vyVar.i(i11, i13, false);
                    }
                    if (i11 == 1) {
                        vyVar.m(i13);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i11];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, z10.getTranslationY(), i13);
                        objectAnimatorArr[i11] = ofFloat;
                        ofFloat.addUpdateListener(new nh.b(vyVar, i11, 4));
                        objectAnimatorArr[i11].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(z10.getTranslationY(), i13);
                    }
                    objectAnimatorArr[i11].start();
                }
            }
        }
        if (vyVar.J0) {
            vyVar.J0 = false;
        }
        this.b = false;
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        vy vyVar = this.c;
        int i12 = this.a;
        vyVar.p(i12);
        vy.e(vyVar, i12, i11);
        if (i12 == 0) {
            vyVar.q(false);
        } else if (i12 == 1) {
            vyVar.l(false);
        } else if (i12 == 2) {
            vy.f(vyVar, false);
        }
        if (this.b) {
            return;
        }
        float f7 = i11;
        FrameLayout frameLayout = vyVar.n;
        if (SystemClock.elapsedRealtime() - vyVar.D2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        vyVar.H += f7;
        int L = vyVar.h.getCurrentItem() == 0 ? org.telegram.messenger.i0.L(38.0f) : org.telegram.messenger.i0.L(48.0f);
        float f10 = vyVar.H;
        if (f10 >= L) {
            vyVar.N(false);
            return;
        }
        if (f10 <= (-L)) {
            vyVar.N(true);
        } else {
            if ((frameLayout.getTag() != null || vyVar.H >= 0.0f) && (frameLayout.getTag() == null || vyVar.H <= 0.0f)) {
                return;
            }
            vyVar.H = 0.0f;
        }
    }
}
