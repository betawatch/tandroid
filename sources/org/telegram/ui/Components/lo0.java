package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lo0 extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ mo0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(mo0 mo0Var, mo0 mo0Var2) {
        super(mo0Var2);
        this.x = mo0Var;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        zo0 zo0Var = this.x.q0;
        if (zo0Var.J || !zo0Var.U1) {
            return false;
        }
        return !zo0Var.o1.m();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        mo0 mo0Var = this.x;
        zo0 zo0Var = mo0Var.q0;
        int i7 = zo0.U2;
        for (int i10 = 0; i10 < zo0Var.b.getChildCount(); i10++) {
            View childAt = zo0Var.b.getChildAt(i10);
            if (childAt != zo0Var.r1 && childAt != zo0Var.w1 && childAt != zo0Var.O1[1] && childAt != zo0Var.y1 && childAt != zo0Var.n1 && childAt != zo0Var.Y1 && childAt != zo0Var.q1) {
                childAt.setTranslationY(f10);
            }
        }
        bo0 bo0Var = zo0Var.B1;
        zo0Var.p2 = f10;
        int i11 = mo0Var.l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            zo0Var.l2 = (int) ((mo0Var.m0 * f11) + (i11 * f12));
            float f13 = ((i11 - r6) * f12) + f10;
            bo0Var.setTranslationY(f13);
            if (z10) {
                zo0Var.C1.setTranslationY(f13);
            } else {
                zo0Var.C1.setTranslationY(f13 + zo0Var.B1.getPaddingTop());
            }
        } else {
            int i12 = mo0Var.n0;
            if (i12 != -1) {
                float f14 = 1.0f - f11;
                zo0Var.l2 = (int) ((mo0Var.o0 * f11) + (i12 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    bo0Var.setTranslationY(f10 - ((i12 - r6) * f11));
                } else {
                    bo0Var.setTranslationY(((r6 - i12) * f14) + f10);
                }
            }
        }
        zo0Var.B1.setTopGlowOffset((int) (zo0Var.l2 + zo0Var.p2));
        zo0Var.m1.setTranslationY(zo0Var.l2 + zo0Var.p2);
        zo0Var.M1.setTranslationY(zo0Var.l2 + zo0Var.p2);
        zo0Var.n1.invalidate();
        zo0Var.F0 = zo0Var.p2;
        zo0Var.c.invalidate();
        zo0Var.a1();
        mo0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        zo0 zo0Var = this.x.q0;
        fo0 fo0Var = zo0Var.o1;
        if (fo0Var == null || !fo0Var.m()) {
            int i7 = zo0Var.J2;
            org.telegram.messenger.g0.L(20.0f);
        }
        zo0Var.n2 = false;
        int i10 = zo0Var.l2;
        zo0Var.m2 = i10;
        zo0Var.B1.setTopGlowOffset(i10);
        zo0Var.m1.setTranslationY(zo0Var.l2);
        zo0Var.M1.setTranslationY(zo0Var.l2);
        zo0Var.B1.setTranslationY(0.0f);
        zo0Var.C1.setTranslationY(0.0f);
        zo0Var.a1();
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        mo0 mo0Var = this.x;
        zo0 zo0Var = mo0Var.q0;
        int i10 = zo0Var.m2;
        int i11 = zo0Var.l2;
        if (i10 != i11) {
            mo0Var.l0 = i10;
            mo0Var.m0 = i11;
            zo0Var.n2 = true;
            zo0Var.l2 = i10;
        } else {
            mo0Var.l0 = -1;
        }
        int i12 = mo0Var.j0;
        int i13 = mo0Var.k0;
        if (i12 != i13) {
            mo0Var.n0 = 0;
            mo0Var.o0 = 0;
            zo0Var.n2 = true;
            if (z10) {
                mo0Var.o0 = i12 - i13;
            } else {
                mo0Var.o0 = 0 - (i12 - i13);
            }
            zo0Var.l2 = z10 ? mo0Var.l0 : mo0Var.m0;
        } else {
            mo0Var.n0 = -1;
        }
        zo0Var.B1.setTopGlowOffset((int) (zo0Var.p2 + zo0Var.l2));
        zo0Var.m1.setTranslationY(zo0Var.p2 + zo0Var.l2);
        zo0Var.M1.setTranslationY(zo0Var.p2 + zo0Var.l2);
        mo0Var.invalidate();
    }
}
