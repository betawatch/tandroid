package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class dy extends u4.t0 {
    public final int a;
    public boolean b;
    public final /* synthetic */ ey c;

    public dy(ey eyVar, int i3) {
        this.c = eyVar;
        this.a = i3;
    }

    @Override // u4.t0
    public void a(RecyclerView recyclerView, int i3) {
        ObjectAnimator objectAnimator;
        rx rxVar;
        ey eyVar = this.c;
        ObjectAnimator[] objectAnimatorArr = eyVar.S0;
        u4.z0 z0Var = recyclerView.getLayoutManager().e;
        if (z0Var != null && z0Var.e) {
            this.b = true;
            return;
        }
        int i10 = this.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (eyVar.K0) {
                    eyVar.K0 = false;
                }
                if (i10 == 0) {
                    rxVar = eyVar.H0;
                } else if (i10 == 1) {
                    rxVar = eyVar.W;
                } else {
                    if (i10 != 2) {
                        throw new IllegalArgumentException(k2.p1.i(i10, "Unexpected argument: "));
                    }
                    rxVar = eyVar.p0;
                }
                if (rxVar != null) {
                    rxVar.b();
                }
                this.b = false;
            }
            if (!this.b && (objectAnimator = objectAnimatorArr[i10]) != null && objectAnimator.isRunning()) {
                objectAnimatorArr[i10].cancel();
            }
            if (i10 == 0) {
                if (eyVar.U0 == null) {
                    kg.a1 a1Var = new kg.a1(eyVar, eyVar.d1, eyVar.u1.a(), eyVar.u1.f(), 1);
                    eyVar.U0 = a1Var;
                    a1Var.a();
                }
                eyVar.U0.b();
                return;
            }
            return;
        }
        if (!this.b) {
            int[] iArr = eyVar.R0;
            fx fxVar = eyVar.u1;
            if ((fxVar == null || !fxVar.z()) && i10 != 0) {
                float N = org.telegram.messenger.g0.N(i10 == 1 ? 36.0f : 48.0f);
                float f10 = iArr[i10] / (-N);
                if (f10 <= 0.0f || f10 >= 1.0f) {
                    tj0 x10 = eyVar.x(i10);
                    int L = org.telegram.messenger.g0.L(i10 == 1 ? 38.0f : 48.0f);
                    u4.d1 K = x10.K(0);
                    if (K != null) {
                        int bottom = K.a.getBottom();
                        int i11 = iArr[i10];
                        float f11 = (bottom - (L + i11)) / eyVar.c1;
                        if (f11 > 0.0f || f11 < 1.0f) {
                            eyVar.i(i10, i11, f11 > 0.5f);
                        }
                    }
                } else {
                    HorizontalScrollView y9 = eyVar.y(i10);
                    int i12 = f10 > 0.5f ? (int) (-Math.ceil(N)) : 0;
                    if (f10 > 0.5f) {
                        eyVar.i(i10, i12, false);
                    }
                    if (i10 == 1) {
                        eyVar.m(i12);
                    }
                    ObjectAnimator objectAnimator2 = objectAnimatorArr[i10];
                    if (objectAnimator2 == null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y9, (Property<HorizontalScrollView, Float>) View.TRANSLATION_Y, y9.getTranslationY(), i12);
                        objectAnimatorArr[i10] = ofFloat;
                        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.g2(eyVar, i10, 3));
                        objectAnimatorArr[i10].setDuration(200L);
                    } else {
                        objectAnimator2.setFloatValues(y9.getTranslationY(), i12);
                    }
                    objectAnimatorArr[i10].start();
                }
            }
        }
        if (eyVar.K0) {
            eyVar.K0 = false;
        }
        this.b = false;
    }

    @Override // u4.t0
    public void b(RecyclerView recyclerView, int i3, int i10) {
        ey eyVar = this.c;
        int i11 = this.a;
        eyVar.p(i11);
        ey.e(eyVar, i11, i10);
        if (i11 == 0) {
            eyVar.q(false);
        } else if (i11 == 1) {
            eyVar.l(false);
        } else if (i11 == 2) {
            ey.f(eyVar, false);
        }
        if (this.b) {
            return;
        }
        float f10 = i10;
        FrameLayout frameLayout = eyVar.n;
        if (SystemClock.elapsedRealtime() - eyVar.E2 < ViewConfiguration.getTapTimeout()) {
            return;
        }
        eyVar.I += f10;
        int L = eyVar.h.getCurrentItem() == 0 ? org.telegram.messenger.g0.L(38.0f) : org.telegram.messenger.g0.L(48.0f);
        float f11 = eyVar.I;
        if (f11 >= L) {
            eyVar.M(false);
            return;
        }
        if (f11 <= (-L)) {
            eyVar.M(true);
        } else {
            if ((frameLayout.getTag() != null || eyVar.I >= 0.0f) && (frameLayout.getTag() == null || eyVar.I <= 0.0f)) {
                return;
            }
            eyVar.I = 0.0f;
        }
    }
}
