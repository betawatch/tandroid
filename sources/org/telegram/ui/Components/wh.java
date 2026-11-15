package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wh extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ xh x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(xh xhVar, xh xhVar2) {
        super(xhVar2);
        this.x = xhVar;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        ly lyVar;
        ki kiVar = this.x.l0;
        if ((!kiVar.J || kiVar.s2) && kiVar.q3) {
            ci ciVar = kiVar.w2;
            if (ciVar != kiVar.h2 && ciVar != kiVar.i2 && !kiVar.a1().m()) {
                return true;
            }
            ci ciVar2 = kiVar.w2;
            jn jnVar = kiVar.h2;
            if (ciVar2 == jnVar && ((lyVar = jnVar.F) == null || lyVar.getVisibility() != 0)) {
                return true;
            }
            ci ciVar3 = kiVar.w2;
            jn jnVar2 = kiVar.i2;
            if (ciVar3 == jnVar2) {
                ly lyVar2 = jnVar2.F;
                return lyVar2 == null || lyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        xh xhVar = this.x;
        ki kiVar = xhVar.l0;
        kiVar.j4 = f10;
        float f12 = kiVar.b4;
        if (f12 > 0.0f) {
            kiVar.j4 = com.google.android.gms.internal.vision.e2.z(f12, kiVar.c4, (kiVar.w2 != kiVar.r2 || z10) ? 1.0f - f11 : f11, f10);
        }
        kiVar.V2.setTranslationY(kiVar.j4);
        kiVar.Y2.setTranslationY(kiVar.j4);
        org.telegram.ui.ActionBar.q0 q0Var = kiVar.c3;
        if (q0Var != null) {
            q0Var.setTranslationY(kiVar.j4);
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = kiVar.a3;
        if (q0Var2 != null) {
            q0Var2.setTranslationY(kiVar.Y2.getTranslationY());
        }
        hi.l3 l3Var = kiVar.b3;
        if (l3Var != null) {
            l3Var.setTranslationY(kiVar.Y2.getTranslationY());
        }
        kiVar.d3.setTranslationY(kiVar.j4);
        kiVar.P1(0);
        kiVar.F0 = kiVar.w2 != kiVar.r2 ? kiVar.j4 : 0.0f;
        kiVar.c.invalidate();
        xhVar.invalidate();
        kiVar.B2.invalidate();
        kiVar.J1();
        ci ciVar = kiVar.w2;
        if (ciVar != null) {
            ciVar.n(kiVar.j4, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        ki kiVar = this.x.l0;
        kiVar.M1(kiVar.w2, 0);
        kiVar.a4 = kiVar.Z3[0];
        kiVar.w2.y();
        if (!(kiVar.w2 instanceof ki.y3) || kiVar.B3) {
            return;
        }
        int L = kiVar.d ? org.telegram.messenger.g0.L(84.0f) : 0;
        for (int i7 = 0; i7 < kiVar.v2.size(); i7++) {
            ((ki.y3) kiVar.v2.valueAt(i7)).setMeasureOffsetY(L);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        int i10;
        xh xhVar = this.x;
        ki kiVar = xhVar.l0;
        int i11 = kiVar.a4;
        if (i11 <= 0 || i11 == (i10 = kiVar.Z3[0]) || !(z10 || kiVar.w2 == kiVar.r2)) {
            kiVar.b4 = -1.0f;
        } else {
            kiVar.b4 = i11;
            kiVar.c4 = i10;
        }
        xhVar.invalidate();
        kh khVar = kiVar.v3;
        if ((kiVar.w2 instanceof ki.y3) && !kiVar.B3) {
            if (z10) {
                khVar.setVisibility(8);
            } else {
                khVar.setVisibility(0);
            }
        }
        kiVar.w2.z(i7, z10);
    }
}
