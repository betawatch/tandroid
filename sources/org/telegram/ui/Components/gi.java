package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class gi extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ hi x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(hi hiVar, hi hiVar2) {
        super(hiVar2);
        this.x = hiVar;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        ty tyVar;
        ui uiVar = this.x.l0;
        if ((!uiVar.J || uiVar.s2) && uiVar.q3) {
            mi miVar = uiVar.w2;
            if (miVar != uiVar.h2 && miVar != uiVar.i2 && !uiVar.b1().m()) {
                return true;
            }
            mi miVar2 = uiVar.w2;
            tn tnVar = uiVar.h2;
            if (miVar2 == tnVar && ((tyVar = tnVar.F) == null || tyVar.getVisibility() != 0)) {
                return true;
            }
            mi miVar3 = uiVar.w2;
            tn tnVar2 = uiVar.i2;
            if (miVar3 == tnVar2) {
                ty tyVar2 = tnVar2.F;
                return tyVar2 == null || tyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        hi hiVar = this.x;
        ui uiVar = hiVar.l0;
        uiVar.j4 = f10;
        float f12 = uiVar.b4;
        if (f12 > 0.0f) {
            uiVar.j4 = com.google.android.gms.internal.vision.e2.z(f12, uiVar.c4, (uiVar.w2 != uiVar.r2 || z10) ? 1.0f - f11 : f11, f10);
        }
        uiVar.V2.setTranslationY(uiVar.j4);
        uiVar.Y2.setTranslationY(uiVar.j4);
        org.telegram.ui.ActionBar.q0 q0Var = uiVar.c3;
        if (q0Var != null) {
            q0Var.setTranslationY(uiVar.j4);
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = uiVar.a3;
        if (q0Var2 != null) {
            q0Var2.setTranslationY(uiVar.Y2.getTranslationY());
        }
        hi.l3 l3Var = uiVar.b3;
        if (l3Var != null) {
            l3Var.setTranslationY(uiVar.Y2.getTranslationY());
        }
        uiVar.d3.setTranslationY(uiVar.j4);
        uiVar.Q1(0);
        uiVar.F0 = uiVar.w2 != uiVar.r2 ? uiVar.j4 : 0.0f;
        uiVar.c.invalidate();
        hiVar.invalidate();
        uiVar.B2.invalidate();
        uiVar.K1();
        mi miVar = uiVar.w2;
        if (miVar != null) {
            miVar.n(uiVar.j4, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        ui uiVar = this.x.l0;
        uiVar.N1(uiVar.w2, 0);
        uiVar.a4 = uiVar.Z3[0];
        uiVar.w2.y();
        if (!(uiVar.w2 instanceof ki.s3) || uiVar.B3) {
            return;
        }
        int L = uiVar.d ? org.telegram.messenger.g0.L(84.0f) : 0;
        for (int i7 = 0; i7 < uiVar.v2.size(); i7++) {
            ((ki.s3) uiVar.v2.valueAt(i7)).setMeasureOffsetY(L);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        int i10;
        hi hiVar = this.x;
        ui uiVar = hiVar.l0;
        int i11 = uiVar.a4;
        if (i11 <= 0 || i11 == (i10 = uiVar.Z3[0]) || !(z10 || uiVar.w2 == uiVar.r2)) {
            uiVar.b4 = -1.0f;
        } else {
            uiVar.b4 = i11;
            uiVar.c4 = i10;
        }
        hiVar.invalidate();
        uh uhVar = uiVar.v3;
        if ((uiVar.w2 instanceof ki.s3) && !uiVar.B3) {
            if (z10) {
                uhVar.setVisibility(8);
            } else {
                uhVar.setVisibility(0);
            }
        }
        uiVar.w2.z(i7, z10);
    }
}
