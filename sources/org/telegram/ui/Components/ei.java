package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ei extends org.telegram.ui.ActionBar.j1 {
    public final /* synthetic */ fi x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(fi fiVar, fi fiVar2) {
        super(fiVar2);
        this.x = fiVar;
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final boolean b() {
        ry ryVar;
        si siVar = this.x.l0;
        if ((!siVar.J || siVar.s2) && siVar.q3) {
            ki kiVar = siVar.w2;
            if (kiVar != siVar.h2 && kiVar != siVar.i2 && !siVar.b1().m()) {
                return true;
            }
            ki kiVar2 = siVar.w2;
            rn rnVar = siVar.h2;
            if (kiVar2 == rnVar && ((ryVar = rnVar.F) == null || ryVar.getVisibility() != 0)) {
                return true;
            }
            ki kiVar3 = siVar.w2;
            rn rnVar2 = siVar.i2;
            if (kiVar3 == rnVar2) {
                ry ryVar2 = rnVar2.F;
                return ryVar2 == null || ryVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final void e(float f10, float f11, boolean z10) {
        fi fiVar = this.x;
        si siVar = fiVar.l0;
        siVar.j4 = f10;
        float f12 = siVar.b4;
        if (f12 > 0.0f) {
            siVar.j4 = com.google.android.gms.internal.vision.e2.z(f12, siVar.c4, (siVar.w2 != siVar.r2 || z10) ? 1.0f - f11 : f11, f10);
        }
        siVar.V2.setTranslationY(siVar.j4);
        siVar.Y2.setTranslationY(siVar.j4);
        org.telegram.ui.ActionBar.r0 r0Var = siVar.c3;
        if (r0Var != null) {
            r0Var.setTranslationY(siVar.j4);
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = siVar.a3;
        if (r0Var2 != null) {
            r0Var2.setTranslationY(siVar.Y2.getTranslationY());
        }
        hi.m3 m3Var = siVar.b3;
        if (m3Var != null) {
            m3Var.setTranslationY(siVar.Y2.getTranslationY());
        }
        siVar.d3.setTranslationY(siVar.j4);
        siVar.Q1(0);
        siVar.F0 = siVar.w2 != siVar.r2 ? siVar.j4 : 0.0f;
        siVar.c.invalidate();
        fiVar.invalidate();
        siVar.B2.invalidate();
        siVar.K1();
        ki kiVar = siVar.w2;
        if (kiVar != null) {
            kiVar.n(siVar.j4, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final void f() {
        si siVar = this.x.l0;
        siVar.N1(siVar.w2, 0);
        siVar.a4 = siVar.Z3[0];
        siVar.w2.y();
        if (!(siVar.w2 instanceof ki.t3) || siVar.B3) {
            return;
        }
        int L = siVar.d ? org.telegram.messenger.g0.L(84.0f) : 0;
        for (int i7 = 0; i7 < siVar.v2.size(); i7++) {
            ((ki.t3) siVar.v2.valueAt(i7)).setMeasureOffsetY(L);
        }
    }

    @Override // org.telegram.ui.ActionBar.j1
    public final void g(int i7, boolean z10) {
        int i10;
        fi fiVar = this.x;
        si siVar = fiVar.l0;
        int i11 = siVar.a4;
        if (i11 <= 0 || i11 == (i10 = siVar.Z3[0]) || !(z10 || siVar.w2 == siVar.r2)) {
            siVar.b4 = -1.0f;
        } else {
            siVar.b4 = i11;
            siVar.c4 = i10;
        }
        fiVar.invalidate();
        sh shVar = siVar.v3;
        if ((siVar.w2 instanceof ki.t3) && !siVar.B3) {
            if (z10) {
                shVar.setVisibility(8);
            } else {
                shVar.setVisibility(0);
            }
        }
        siVar.w2.z(i7, z10);
    }
}
