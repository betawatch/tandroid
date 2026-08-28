package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zh extends org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ ai x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(ai aiVar, ai aiVar2) {
        super(aiVar2);
        this.x = aiVar;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        wy wyVar;
        ki kiVar = this.x.x0;
        if (!kiVar.isDismissed() && kiVar.o1) {
            ci ciVar = kiVar.u0;
            if (ciVar != kiVar.i0 && ciVar != kiVar.j0 && !kiVar.m1().m()) {
                return true;
            }
            ci ciVar2 = kiVar.u0;
            jn jnVar = kiVar.i0;
            if (ciVar2 == jnVar && ((wyVar = jnVar.A) == null || wyVar.getVisibility() != 0)) {
                return true;
            }
            ci ciVar3 = kiVar.u0;
            jn jnVar2 = kiVar.j0;
            if (ciVar3 == jnVar2) {
                wy wyVar2 = jnVar2.A;
                return wyVar2 == null || wyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f10, float f11, boolean z10) {
        ai aiVar = this.x;
        ki kiVar = aiVar.x0;
        kiVar.h2 = f10;
        float f12 = kiVar.Z1;
        if (f12 > 0.0f) {
            kiVar.h2 = e2.c.z(1.0f, f11, f12 - kiVar.a2, f10);
        }
        kiVar.T0.setTranslationY(kiVar.h2);
        kiVar.W0.setTranslationY(kiVar.h2);
        org.telegram.ui.ActionBar.w0 w0Var = kiVar.a1;
        if (w0Var != null) {
            w0Var.setTranslationY(kiVar.h2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = kiVar.Y0;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(kiVar.W0.getTranslationY());
        }
        kh.x3 x3Var = kiVar.Z0;
        if (x3Var != null) {
            x3Var.setTranslationY(kiVar.W0.getTranslationY());
        }
        kiVar.b1.setTranslationY(kiVar.h2);
        kiVar.a2(0);
        kiVar.setCurrentPanTranslationY(kiVar.h2);
        aiVar.invalidate();
        kiVar.z0.invalidate();
        kiVar.U1();
        ci ciVar = kiVar.u0;
        if (ciVar != null) {
            ciVar.k(kiVar.h2);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
        boolean z10;
        ki kiVar = this.x.x0;
        kiVar.X1(kiVar.u0, 0);
        kiVar.Y1 = kiVar.X1[0];
        kiVar.u0.v();
        if (!(kiVar.u0 instanceof mh.g4) || kiVar.z1) {
            return;
        }
        z10 = ((org.telegram.ui.ActionBar.f3) kiVar).keyboardVisible;
        int dp = z10 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i9 = 0; i9 < kiVar.t0.size(); i9++) {
            ((mh.g4) kiVar.t0.valueAt(i9)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i9, boolean z10) {
        int i10;
        ai aiVar = this.x;
        ki kiVar = aiVar.x0;
        int i11 = kiVar.Y1;
        if (i11 <= 0 || i11 == (i10 = kiVar.X1[0]) || !z10) {
            kiVar.Z1 = -1.0f;
        } else {
            kiVar.Z1 = i11;
            kiVar.a2 = i10;
        }
        aiVar.invalidate();
        mh mhVar = kiVar.t1;
        if ((kiVar.u0 instanceof mh.g4) && !kiVar.z1) {
            if (z10) {
                mhVar.setVisibility(8);
            } else {
                mhVar.setVisibility(0);
            }
        }
        kiVar.u0.w(i9, z10);
    }
}
