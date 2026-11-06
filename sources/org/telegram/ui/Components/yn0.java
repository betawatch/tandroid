package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class yn0 extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ zn0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn0(zn0 zn0Var, zn0 zn0Var2) {
        super(zn0Var2);
        this.x = zn0Var;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        mo0 mo0Var = this.x.p0;
        if (mo0Var.I || !mo0Var.Q1) {
            return false;
        }
        return !mo0Var.k1.m();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z9) {
        zn0 zn0Var = this.x;
        mo0 mo0Var = zn0Var.p0;
        int i7 = mo0.Q2;
        for (int i10 = 0; i10 < mo0Var.b.getChildCount(); i10++) {
            View childAt = mo0Var.b.getChildAt(i10);
            if (childAt != mo0Var.n1 && childAt != mo0Var.s1 && childAt != mo0Var.K1[1] && childAt != mo0Var.u1 && childAt != mo0Var.j1 && childAt != mo0Var.U1 && childAt != mo0Var.m1) {
                childAt.setTranslationY(f10);
            }
        }
        on0 on0Var = mo0Var.x1;
        mo0Var.l2 = f10;
        int i11 = zn0Var.k0;
        if (i11 != -1) {
            if (!z9) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            mo0Var.h2 = (int) ((zn0Var.l0 * f11) + (i11 * f12));
            float f13 = ((i11 - r6) * f12) + f10;
            on0Var.setTranslationY(f13);
            if (z9) {
                mo0Var.y1.setTranslationY(f13);
            } else {
                mo0Var.y1.setTranslationY(f13 + mo0Var.x1.getPaddingTop());
            }
        } else {
            int i12 = zn0Var.m0;
            if (i12 != -1) {
                float f14 = 1.0f - f11;
                mo0Var.h2 = (int) ((zn0Var.n0 * f11) + (i12 * f14));
                if (!z9) {
                    f14 = f11;
                }
                if (z9) {
                    on0Var.setTranslationY(f10 - ((i12 - r6) * f11));
                } else {
                    on0Var.setTranslationY(((r6 - i12) * f14) + f10);
                }
            }
        }
        mo0Var.x1.setTopGlowOffset((int) (mo0Var.h2 + mo0Var.l2));
        mo0Var.i1.setTranslationY(mo0Var.h2 + mo0Var.l2);
        mo0Var.I1.setTranslationY(mo0Var.h2 + mo0Var.l2);
        mo0Var.j1.invalidate();
        mo0Var.E0 = mo0Var.l2;
        mo0Var.c.invalidate();
        mo0Var.Z0();
        zn0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        mo0 mo0Var = this.x.p0;
        sn0 sn0Var = mo0Var.k1;
        if (sn0Var == null || !sn0Var.m()) {
            int i7 = mo0Var.F2;
            org.telegram.messenger.g0.L(20.0f);
        }
        mo0Var.j2 = false;
        int i10 = mo0Var.h2;
        mo0Var.i2 = i10;
        mo0Var.x1.setTopGlowOffset(i10);
        mo0Var.i1.setTranslationY(mo0Var.h2);
        mo0Var.I1.setTranslationY(mo0Var.h2);
        mo0Var.x1.setTranslationY(0.0f);
        mo0Var.y1.setTranslationY(0.0f);
        mo0Var.Z0();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z9) {
        zn0 zn0Var = this.x;
        mo0 mo0Var = zn0Var.p0;
        int i10 = mo0Var.i2;
        int i11 = mo0Var.h2;
        if (i10 != i11) {
            zn0Var.k0 = i10;
            zn0Var.l0 = i11;
            mo0Var.j2 = true;
            mo0Var.h2 = i10;
        } else {
            zn0Var.k0 = -1;
        }
        int i12 = zn0Var.i0;
        int i13 = zn0Var.j0;
        if (i12 != i13) {
            zn0Var.m0 = 0;
            zn0Var.n0 = 0;
            mo0Var.j2 = true;
            if (z9) {
                zn0Var.n0 = i12 - i13;
            } else {
                zn0Var.n0 = 0 - (i12 - i13);
            }
            mo0Var.h2 = z9 ? zn0Var.k0 : zn0Var.l0;
        } else {
            zn0Var.m0 = -1;
        }
        mo0Var.x1.setTopGlowOffset((int) (mo0Var.l2 + mo0Var.h2));
        mo0Var.i1.setTranslationY(mo0Var.l2 + mo0Var.h2);
        mo0Var.I1.setTranslationY(mo0Var.l2 + mo0Var.h2);
        zn0Var.invalidate();
    }
}
