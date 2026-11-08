package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ph extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ qh x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(qh qhVar, qh qhVar2) {
        super(qhVar2);
        this.x = qhVar;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        hy hyVar;
        di diVar = this.x.k0;
        if ((!diVar.I || diVar.o2) && diVar.m3) {
            vh vhVar = diVar.s2;
            if (vhVar != diVar.d2 && vhVar != diVar.e2 && !diVar.a1().m()) {
                return true;
            }
            vh vhVar2 = diVar.s2;
            bn bnVar = diVar.d2;
            if (vhVar2 == bnVar && ((hyVar = bnVar.E) == null || hyVar.getVisibility() != 0)) {
                return true;
            }
            vh vhVar3 = diVar.s2;
            bn bnVar2 = diVar.e2;
            if (vhVar3 == bnVar2) {
                hy hyVar2 = bnVar2.E;
                return hyVar2 == null || hyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z9) {
        qh qhVar = this.x;
        di diVar = qhVar.k0;
        diVar.f4 = f10;
        float f12 = diVar.X3;
        if (f12 > 0.0f) {
            diVar.f4 = com.google.android.recaptcha.internal.a.z(f12, diVar.Y3, (diVar.s2 != diVar.n2 || z9) ? 1.0f - f11 : f11, f10);
        }
        diVar.R2.setTranslationY(diVar.f4);
        diVar.U2.setTranslationY(diVar.f4);
        org.telegram.ui.ActionBar.r0 r0Var = diVar.Y2;
        if (r0Var != null) {
            r0Var.setTranslationY(diVar.f4);
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = diVar.W2;
        if (r0Var2 != null) {
            r0Var2.setTranslationY(diVar.U2.getTranslationY());
        }
        fi.m3 m3Var = diVar.X2;
        if (m3Var != null) {
            m3Var.setTranslationY(diVar.U2.getTranslationY());
        }
        diVar.Z2.setTranslationY(diVar.f4);
        diVar.P1(0);
        diVar.E0 = diVar.s2 != diVar.n2 ? diVar.f4 : 0.0f;
        diVar.c.invalidate();
        qhVar.invalidate();
        diVar.x2.invalidate();
        diVar.J1();
        vh vhVar = diVar.s2;
        if (vhVar != null) {
            vhVar.n(diVar.f4, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        di diVar = this.x.k0;
        diVar.M1(diVar.s2, 0);
        diVar.W3 = diVar.V3[0];
        diVar.s2.y();
        if (!(diVar.s2 instanceof hi.c4) || diVar.x3) {
            return;
        }
        int L = diVar.d ? org.telegram.messenger.g0.L(84.0f) : 0;
        for (int i7 = 0; i7 < diVar.r2.size(); i7++) {
            ((hi.c4) diVar.r2.valueAt(i7)).setMeasureOffsetY(L);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z9) {
        int i10;
        qh qhVar = this.x;
        di diVar = qhVar.k0;
        int i11 = diVar.W3;
        if (i11 <= 0 || i11 == (i10 = diVar.V3[0]) || !(z9 || diVar.s2 == diVar.n2)) {
            diVar.X3 = -1.0f;
        } else {
            diVar.X3 = i11;
            diVar.Y3 = i10;
        }
        qhVar.invalidate();
        dh dhVar = diVar.r3;
        if ((diVar.s2 instanceof hi.c4) && !diVar.x3) {
            if (z9) {
                dhVar.setVisibility(8);
            } else {
                dhVar.setVisibility(0);
            }
        }
        diVar.s2.z(i7, z9);
    }
}
