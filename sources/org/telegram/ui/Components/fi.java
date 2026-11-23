package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fi extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ gi x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(gi giVar, gi giVar2) {
        super(giVar2);
        this.x = giVar;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        qy qyVar;
        ti tiVar = this.x.l0;
        if ((!tiVar.J || tiVar.s2) && tiVar.q3) {
            li liVar = tiVar.w2;
            if (liVar != tiVar.h2 && liVar != tiVar.i2 && !tiVar.b1().m()) {
                return true;
            }
            li liVar2 = tiVar.w2;
            qn qnVar = tiVar.h2;
            if (liVar2 == qnVar && ((qyVar = qnVar.F) == null || qyVar.getVisibility() != 0)) {
                return true;
            }
            li liVar3 = tiVar.w2;
            qn qnVar2 = tiVar.i2;
            if (liVar3 == qnVar2) {
                qy qyVar2 = qnVar2.F;
                return qyVar2 == null || qyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z10) {
        gi giVar = this.x;
        ti tiVar = giVar.l0;
        tiVar.j4 = f10;
        float f12 = tiVar.b4;
        if (f12 > 0.0f) {
            tiVar.j4 = com.google.android.gms.internal.vision.e2.z(f12, tiVar.c4, (tiVar.w2 != tiVar.r2 || z10) ? 1.0f - f11 : f11, f10);
        }
        tiVar.V2.setTranslationY(tiVar.j4);
        tiVar.Y2.setTranslationY(tiVar.j4);
        org.telegram.ui.ActionBar.q0 q0Var = tiVar.c3;
        if (q0Var != null) {
            q0Var.setTranslationY(tiVar.j4);
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = tiVar.a3;
        if (q0Var2 != null) {
            q0Var2.setTranslationY(tiVar.Y2.getTranslationY());
        }
        hi.u3 u3Var = tiVar.b3;
        if (u3Var != null) {
            u3Var.setTranslationY(tiVar.Y2.getTranslationY());
        }
        tiVar.d3.setTranslationY(tiVar.j4);
        tiVar.Q1(0);
        tiVar.F0 = tiVar.w2 != tiVar.r2 ? tiVar.j4 : 0.0f;
        tiVar.c.invalidate();
        giVar.invalidate();
        tiVar.B2.invalidate();
        tiVar.K1();
        li liVar = tiVar.w2;
        if (liVar != null) {
            liVar.n(tiVar.j4, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        ti tiVar = this.x.l0;
        tiVar.N1(tiVar.w2, 0);
        tiVar.a4 = tiVar.Z3[0];
        tiVar.w2.y();
        if (!(tiVar.w2 instanceof ki.t3) || tiVar.B3) {
            return;
        }
        int L = tiVar.d ? org.telegram.messenger.g0.L(84.0f) : 0;
        for (int i7 = 0; i7 < tiVar.v2.size(); i7++) {
            ((ki.t3) tiVar.v2.valueAt(i7)).setMeasureOffsetY(L);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z10) {
        int i10;
        gi giVar = this.x;
        ti tiVar = giVar.l0;
        int i11 = tiVar.a4;
        if (i11 <= 0 || i11 == (i10 = tiVar.Z3[0]) || !(z10 || tiVar.w2 == tiVar.r2)) {
            tiVar.b4 = -1.0f;
        } else {
            tiVar.b4 = i11;
            tiVar.c4 = i10;
        }
        giVar.invalidate();
        th thVar = tiVar.v3;
        if ((tiVar.w2 instanceof ki.t3) && !tiVar.B3) {
            if (z10) {
                thVar.setVisibility(8);
            } else {
                thVar.setVisibility(0);
            }
        }
        tiVar.w2.z(i7, z10);
    }
}
