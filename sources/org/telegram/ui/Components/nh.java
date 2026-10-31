package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nh extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ph x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(ph phVar, ph phVar2) {
        super(phVar2);
        this.x = phVar;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final boolean b() {
        vy vyVar;
        bi biVar = this.x.k0;
        if ((!biVar.I || biVar.o2) && biVar.m3) {
            uh uhVar = biVar.s2;
            if (uhVar != biVar.d2 && uhVar != biVar.e2 && !biVar.Z0().m()) {
                return true;
            }
            uh uhVar2 = biVar.s2;
            jn jnVar = biVar.d2;
            if (uhVar2 == jnVar && ((vyVar = jnVar.E) == null || vyVar.getVisibility() != 0)) {
                return true;
            }
            uh uhVar3 = biVar.s2;
            jn jnVar2 = biVar.e2;
            if (uhVar3 == jnVar2) {
                vy vyVar2 = jnVar2.E;
                return vyVar2 == null || vyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void e(float f7, float f10, boolean z10) {
        ph phVar = this.x;
        bi biVar = phVar.k0;
        biVar.f4 = f7;
        float f11 = biVar.X3;
        if (f11 > 0.0f) {
            biVar.f4 = c3.i0.z(f11, biVar.Y3, (biVar.s2 != biVar.n2 || z10) ? 1.0f - f10 : f10, f7);
        }
        biVar.R2.setTranslationY(biVar.f4);
        biVar.U2.setTranslationY(biVar.f4);
        org.telegram.ui.ActionBar.t0 t0Var = biVar.Y2;
        if (t0Var != null) {
            t0Var.setTranslationY(biVar.f4);
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = biVar.W2;
        if (t0Var2 != null) {
            t0Var2.setTranslationY(biVar.U2.getTranslationY());
        }
        vh.p2 p2Var = biVar.X2;
        if (p2Var != null) {
            p2Var.setTranslationY(biVar.U2.getTranslationY());
        }
        biVar.Z2.setTranslationY(biVar.f4);
        biVar.O1(0);
        biVar.E0 = biVar.s2 != biVar.n2 ? biVar.f4 : 0.0f;
        biVar.c.invalidate();
        phVar.invalidate();
        biVar.x2.invalidate();
        biVar.I1();
        uh uhVar = biVar.s2;
        if (uhVar != null) {
            uhVar.m(biVar.f4, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void f() {
        bi biVar = this.x.k0;
        biVar.L1(biVar.s2, 0);
        biVar.W3 = biVar.V3[0];
        biVar.s2.y();
        if (!(biVar.s2 instanceof xh.i3) || biVar.x3) {
            return;
        }
        int L = biVar.d ? org.telegram.messenger.i0.L(84.0f) : 0;
        for (int i10 = 0; i10 < biVar.r2.size(); i10++) {
            ((xh.i3) biVar.r2.valueAt(i10)).setMeasureOffsetY(L);
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void g(int i10, boolean z10) {
        int i11;
        ph phVar = this.x;
        bi biVar = phVar.k0;
        int i12 = biVar.W3;
        if (i12 <= 0 || i12 == (i11 = biVar.V3[0]) || !(z10 || biVar.s2 == biVar.n2)) {
            biVar.X3 = -1.0f;
        } else {
            biVar.X3 = i12;
            biVar.Y3 = i11;
        }
        phVar.invalidate();
        ah ahVar = biVar.r3;
        if ((biVar.s2 instanceof xh.i3) && !biVar.x3) {
            if (z10) {
                ahVar.setVisibility(8);
            } else {
                ahVar.setVisibility(0);
            }
        }
        biVar.s2.z(i10, z10);
    }
}
