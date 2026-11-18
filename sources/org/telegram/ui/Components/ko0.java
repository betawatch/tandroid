package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ko0 extends org.telegram.ui.ActionBar.j1 {
    public final /* synthetic */ lo0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko0(lo0 lo0Var, lo0 lo0Var2) {
        super(lo0Var2);
        this.x = lo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final boolean b() {
        yo0 yo0Var = this.x.q0;
        if (yo0Var.J || !yo0Var.U1) {
            return false;
        }
        return !yo0Var.o1.m();
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final void e(float f10, float f11, boolean z10) {
        lo0 lo0Var = this.x;
        yo0 yo0Var = lo0Var.q0;
        int i7 = yo0.U2;
        for (int i10 = 0; i10 < yo0Var.b.getChildCount(); i10++) {
            View childAt = yo0Var.b.getChildAt(i10);
            if (childAt != yo0Var.r1 && childAt != yo0Var.w1 && childAt != yo0Var.O1[1] && childAt != yo0Var.y1 && childAt != yo0Var.n1 && childAt != yo0Var.Y1 && childAt != yo0Var.q1) {
                childAt.setTranslationY(f10);
            }
        }
        ao0 ao0Var = yo0Var.B1;
        yo0Var.p2 = f10;
        int i11 = lo0Var.l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            yo0Var.l2 = (int) ((lo0Var.m0 * f11) + (i11 * f12));
            float f13 = ((i11 - r6) * f12) + f10;
            ao0Var.setTranslationY(f13);
            if (z10) {
                yo0Var.C1.setTranslationY(f13);
            } else {
                yo0Var.C1.setTranslationY(f13 + yo0Var.B1.getPaddingTop());
            }
        } else {
            int i12 = lo0Var.n0;
            if (i12 != -1) {
                float f14 = 1.0f - f11;
                yo0Var.l2 = (int) ((lo0Var.o0 * f11) + (i12 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    ao0Var.setTranslationY(f10 - ((i12 - r6) * f11));
                } else {
                    ao0Var.setTranslationY(((r6 - i12) * f14) + f10);
                }
            }
        }
        yo0Var.B1.setTopGlowOffset((int) (yo0Var.l2 + yo0Var.p2));
        yo0Var.m1.setTranslationY(yo0Var.l2 + yo0Var.p2);
        yo0Var.M1.setTranslationY(yo0Var.l2 + yo0Var.p2);
        yo0Var.n1.invalidate();
        yo0Var.F0 = yo0Var.p2;
        yo0Var.c.invalidate();
        yo0Var.a1();
        lo0Var.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final void f() {
        yo0 yo0Var = this.x.q0;
        eo0 eo0Var = yo0Var.o1;
        if (eo0Var == null || !eo0Var.m()) {
            int i7 = yo0Var.J2;
            org.telegram.messenger.g0.L(20.0f);
        }
        yo0Var.n2 = false;
        int i10 = yo0Var.l2;
        yo0Var.m2 = i10;
        yo0Var.B1.setTopGlowOffset(i10);
        yo0Var.m1.setTranslationY(yo0Var.l2);
        yo0Var.M1.setTranslationY(yo0Var.l2);
        yo0Var.B1.setTranslationY(0.0f);
        yo0Var.C1.setTranslationY(0.0f);
        yo0Var.a1();
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final void g(int i7, boolean z10) {
        lo0 lo0Var = this.x;
        yo0 yo0Var = lo0Var.q0;
        int i10 = yo0Var.m2;
        int i11 = yo0Var.l2;
        if (i10 != i11) {
            lo0Var.l0 = i10;
            lo0Var.m0 = i11;
            yo0Var.n2 = true;
            yo0Var.l2 = i10;
        } else {
            lo0Var.l0 = -1;
        }
        int i12 = lo0Var.j0;
        int i13 = lo0Var.k0;
        if (i12 != i13) {
            lo0Var.n0 = 0;
            lo0Var.o0 = 0;
            yo0Var.n2 = true;
            if (z10) {
                lo0Var.o0 = i12 - i13;
            } else {
                lo0Var.o0 = 0 - (i12 - i13);
            }
            yo0Var.l2 = z10 ? lo0Var.l0 : lo0Var.m0;
        } else {
            lo0Var.n0 = -1;
        }
        yo0Var.B1.setTopGlowOffset((int) (yo0Var.p2 + yo0Var.l2));
        yo0Var.m1.setTranslationY(yo0Var.p2 + yo0Var.l2);
        yo0Var.M1.setTranslationY(yo0Var.p2 + yo0Var.l2);
        lo0Var.invalidate();
    }
}
