package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ao0 extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ bo0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(bo0 bo0Var, bo0 bo0Var2) {
        super(bo0Var2);
        this.x = bo0Var;
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final boolean b() {
        oo0 oo0Var = this.x.q0;
        if (oo0Var.J || !oo0Var.R1) {
            return false;
        }
        return !oo0Var.l1.m();
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void e(float f10, float f11, boolean z10) {
        bo0 bo0Var = this.x;
        oo0 oo0Var = bo0Var.q0;
        int i3 = oo0.R2;
        for (int i10 = 0; i10 < oo0Var.b.getChildCount(); i10++) {
            View childAt = oo0Var.b.getChildAt(i10);
            if (childAt != oo0Var.o1 && childAt != oo0Var.t1 && childAt != oo0Var.L1[1] && childAt != oo0Var.v1 && childAt != oo0Var.k1 && childAt != oo0Var.V1 && childAt != oo0Var.n1) {
                childAt.setTranslationY(f10);
            }
        }
        qn0 qn0Var = oo0Var.y1;
        oo0Var.m2 = f10;
        int i11 = bo0Var.l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            oo0Var.i2 = (int) ((bo0Var.m0 * f11) + (i11 * f12));
            float f13 = ((i11 - r6) * f12) + f10;
            qn0Var.setTranslationY(f13);
            if (z10) {
                oo0Var.z1.setTranslationY(f13);
            } else {
                oo0Var.z1.setTranslationY(f13 + oo0Var.y1.getPaddingTop());
            }
        } else {
            int i12 = bo0Var.n0;
            if (i12 != -1) {
                float f14 = 1.0f - f11;
                oo0Var.i2 = (int) ((bo0Var.o0 * f11) + (i12 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    qn0Var.setTranslationY(f10 - ((i12 - r6) * f11));
                } else {
                    qn0Var.setTranslationY(((r6 - i12) * f14) + f10);
                }
            }
        }
        oo0Var.y1.setTopGlowOffset((int) (oo0Var.i2 + oo0Var.m2));
        oo0Var.j1.setTranslationY(oo0Var.i2 + oo0Var.m2);
        oo0Var.J1.setTranslationY(oo0Var.i2 + oo0Var.m2);
        oo0Var.k1.invalidate();
        oo0Var.F0 = oo0Var.m2;
        oo0Var.c.invalidate();
        oo0Var.Z0();
        bo0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void f() {
        oo0 oo0Var = this.x.q0;
        un0 un0Var = oo0Var.l1;
        if (un0Var == null || !un0Var.m()) {
            int i3 = oo0Var.G2;
            org.telegram.messenger.g0.L(20.0f);
        }
        oo0Var.k2 = false;
        int i10 = oo0Var.i2;
        oo0Var.j2 = i10;
        oo0Var.y1.setTopGlowOffset(i10);
        oo0Var.j1.setTranslationY(oo0Var.i2);
        oo0Var.J1.setTranslationY(oo0Var.i2);
        oo0Var.y1.setTranslationY(0.0f);
        oo0Var.z1.setTranslationY(0.0f);
        oo0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void g(int i3, boolean z10) {
        bo0 bo0Var = this.x;
        oo0 oo0Var = bo0Var.q0;
        int i10 = oo0Var.j2;
        int i11 = oo0Var.i2;
        if (i10 != i11) {
            bo0Var.l0 = i10;
            bo0Var.m0 = i11;
            oo0Var.k2 = true;
            oo0Var.i2 = i10;
        } else {
            bo0Var.l0 = -1;
        }
        int i12 = bo0Var.j0;
        int i13 = bo0Var.k0;
        if (i12 != i13) {
            bo0Var.n0 = 0;
            bo0Var.o0 = 0;
            oo0Var.k2 = true;
            if (z10) {
                bo0Var.o0 = i12 - i13;
            } else {
                bo0Var.o0 = 0 - (i12 - i13);
            }
            oo0Var.i2 = z10 ? bo0Var.l0 : bo0Var.m0;
        } else {
            bo0Var.n0 = -1;
        }
        oo0Var.y1.setTopGlowOffset((int) (oo0Var.m2 + oo0Var.i2));
        oo0Var.j1.setTranslationY(oo0Var.m2 + oo0Var.i2);
        oo0Var.J1.setTranslationY(oo0Var.m2 + oo0Var.i2);
        bo0Var.invalidate();
    }
}
