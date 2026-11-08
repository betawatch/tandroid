package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class gy extends v4.s0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ hy c;

    public gy(hy hyVar, int i7) {
        this.c = hyVar;
        this.a = i7;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        ObjectAnimator objectAnimator;
        ux uxVar;
        hy hyVar = this.c;
        ObjectAnimator[] objectAnimatorArr = hyVar.R0;
        v4.z0 z0Var = recyclerView.getLayoutManager().e;
        if (z0Var != null && z0Var.e) {
            this.b = true;
            return;
        }
        int i10 = this.a;
        if (i7 != 0) {
            if (i7 == 1) {
                if (hyVar.J0) {
                    hyVar.J0 = false;
                }
                if (i10 == 0) {
                    uxVar = hyVar.G0;
                } else if (i10 == 1) {
                    uxVar = hyVar.V;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(jg.g.j(i10, "Unexpected argument: "));
                    }
                    uxVar = hyVar.o0;
                }
                if (uxVar != null) {
                    uxVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i10]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i10].cancel();
            }
            if (i10 == 0) {
                if (hyVar.T0 == null) {
                    jg.e1 e1Var = new jg.e1(hyVar, hyVar.c1, hyVar.t1.a(), hyVar.t1.f(), 1);
                    hyVar.T0 = e1Var;
                    e1Var.a();
                }
                hyVar.T0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = hyVar.Q0;
            ix ixVar = hyVar.t1;
            if ((ixVar == null || !ixVar.z()) && i10 != 0) {
                float N = org.telegram.messenger.g0.N(i10 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i10] / (-N);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    pj0 x10 = hyVar.x(i10);
                    int L = org.telegram.messenger.g0.L(i10 == 1 ? 38.0f : 48.0f);
                    v4.d1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i11 = iArr[i10];
                        float f11 = (bottom - (L + i11)) / hyVar.b1;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            hyVar.i(i10, i11, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y10 = hyVar.y(i10);
                    int i12 = f10 > 0.5f ? (int) (-Math.ceil(N)) : 0;
                    if (f10 > 0.5f) {
                        hyVar.i(i10, i12, false);
                    }
                    if (i10 == 1) {
                        hyVar.m(i12);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i10];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y10, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y10.getTranslationY(), i12);
                        objectAnimatorArr[i10] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.i2(hyVar, i10, 3));
                        objectAnimatorArr[i10].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y10.getTranslationY(), i12);
                    }
                    objectAnimatorArr[i10].start();
                }
            }
        }
        if (hyVar.J0) {
            hyVar.J0 = false;
        }
        this.b = false;
    }

    @Override // v4.s0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        hy hyVar = this.c;
        int i11 = this.a;
        hyVar.p(i11);
        hy.e(hyVar, i11, i10);
        if (i11 == 0) {
            hyVar.q(false);
        } else if (i11 == 1) {
            hyVar.l(false);
        } else if (i11 == 2) {
            hy.f(hyVar, false);
        }
        if (this.b) {
            return;
        }
        float f10 = i10;
        FrameLayout frameLayout = hyVar.n;
        if (SystemClock.elapsedRealtime() - hyVar.D2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        hyVar.H += f10;
        int L = hyVar.h.getCurrentItem() == 0 ? org.telegram.messenger.g0.L(38.0f) : org.telegram.messenger.g0.L(48.0f);
        float f11 = hyVar.H;
        if (f11 >= L) {
            hyVar.M(false);
            return;
        }
        if (f11 <= (-L)) {
            hyVar.M(true);
        } else {
            if ((frameLayout.getTag() != null || hyVar.H >= 0.0f) && (frameLayout.getTag() == null || hyVar.H <= 0.0f)) {
                return;
            }
            hyVar.H = 0.0f;
        }
    }
}
