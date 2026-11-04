package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mh extends org.telegram.ui.ActionBar.h1 {
    public final /* synthetic */ oh x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh(oh ohVar, oh ohVar2) {
        super(ohVar2);
        this.x = ohVar;
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final boolean b() {
        ey eyVar;
        bi biVar = this.x.l0;
        if ((!biVar.J || biVar.p2) && biVar.n3) {
            th thVar = biVar.t2;
            if (thVar != biVar.e2 && thVar != biVar.f2 && !biVar.a1().m()) {
                return true;
            }
            th thVar2 = biVar.t2;
            an anVar = biVar.e2;
            if (thVar2 == anVar && ((eyVar = anVar.F) == null || eyVar.getVisibility() != 0)) {
                return true;
            }
            th thVar3 = biVar.t2;
            an anVar2 = biVar.f2;
            if (thVar3 == anVar2) {
                ey eyVar2 = anVar2.F;
                return eyVar2 == null || eyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void e(float f10, float f11, boolean z10) {
        oh ohVar = this.x;
        bi biVar = ohVar.l0;
        biVar.g4 = f10;
        float f12 = biVar.Y3;
        if (f12 > 0.0f) {
            biVar.g4 = com.google.android.recaptcha.internal.a.y(f12, biVar.Z3, (biVar.t2 != biVar.o2 || z10) ? 1.0f - f11 : f11, f10);
        }
        biVar.S2.setTranslationY(biVar.g4);
        biVar.V2.setTranslationY(biVar.g4);
        org.telegram.ui.ActionBar.q0 q0Var = biVar.Z2;
        if (q0Var != null) {
            q0Var.setTranslationY(biVar.g4);
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = biVar.X2;
        if (q0Var2 != null) {
            q0Var2.setTranslationY(biVar.V2.getTranslationY());
        }
        gi.l3 l3Var = biVar.Y2;
        if (l3Var != null) {
            l3Var.setTranslationY(biVar.V2.getTranslationY());
        }
        biVar.a3.setTranslationY(biVar.g4);
        biVar.P1(0);
        biVar.F0 = biVar.t2 != biVar.o2 ? biVar.g4 : 0.0f;
        biVar.c.invalidate();
        ohVar.invalidate();
        biVar.y2.invalidate();
        biVar.J1();
        th thVar = biVar.t2;
        if (thVar != null) {
            thVar.n(biVar.g4, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void f() {
        bi biVar = this.x.l0;
        biVar.M1(biVar.t2, 0);
        biVar.X3 = biVar.W3[0];
        biVar.t2.y();
        if (!(biVar.t2 instanceof ii.d4) || biVar.y3) {
            return;
        }
        int L = biVar.d ? org.telegram.messenger.g0.L(84.0f) : 0;
        for (int i3 = 0; i3 < biVar.s2.size(); i3++) {
            ((ii.d4) biVar.s2.valueAt(i3)).setMeasureOffsetY(L);
        }
    }

    @Override // org.telegram.ui.ActionBar.h1
    public final void g(int i3, boolean z10) {
        int i10;
        oh ohVar = this.x;
        bi biVar = ohVar.l0;
        int i11 = biVar.X3;
        if (i11 <= 0 || i11 == (i10 = biVar.W3[0]) || !(z10 || biVar.t2 == biVar.o2)) {
            biVar.Y3 = -1.0f;
        } else {
            biVar.Y3 = i11;
            biVar.Z3 = i10;
        }
        ohVar.invalidate();
        ah ahVar = biVar.s3;
        if ((biVar.t2 instanceof ii.d4) && !biVar.y3) {
            if (z10) {
                ahVar.setVisibility(8);
            } else {
                ahVar.setVisibility(0);
            }
        }
        biVar.t2.z(i3, z10);
    }
}
