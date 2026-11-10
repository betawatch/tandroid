package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class oh extends org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ ph x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(ph phVar, ph phVar2) {
        super(phVar2);
        this.x = phVar;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final boolean b() {
        gy gyVar;
        ci ciVar = this.x.k0;
        if ((!ciVar.I || ciVar.r2) && ciVar.p3) {
            uh uhVar = ciVar.v2;
            if (uhVar != ciVar.g2 && uhVar != ciVar.h2 && !ciVar.a1().m()) {
                return true;
            }
            uh uhVar2 = ciVar.v2;
            an anVar = ciVar.g2;
            if (uhVar2 == anVar && ((gyVar = anVar.E) == null || gyVar.getVisibility() != 0)) {
                return true;
            }
            uh uhVar3 = ciVar.v2;
            an anVar2 = ciVar.h2;
            if (uhVar3 == anVar2) {
                gy gyVar2 = anVar2.E;
                return gyVar2 == null || gyVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void e(float f10, float f11, boolean z9) {
        ph phVar = this.x;
        ci ciVar = phVar.k0;
        ciVar.i4 = f10;
        float f12 = ciVar.a4;
        if (f12 > 0.0f) {
            ciVar.i4 = com.google.android.recaptcha.internal.a.z(f12, ciVar.b4, (ciVar.v2 != ciVar.q2 || z9) ? 1.0f - f11 : f11, f10);
        }
        ciVar.U2.setTranslationY(ciVar.i4);
        ciVar.X2.setTranslationY(ciVar.i4);
        org.telegram.ui.ActionBar.r0 r0Var = ciVar.b3;
        if (r0Var != null) {
            r0Var.setTranslationY(ciVar.i4);
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = ciVar.Z2;
        if (r0Var2 != null) {
            r0Var2.setTranslationY(ciVar.X2.getTranslationY());
        }
        fi.m3 m3Var = ciVar.a3;
        if (m3Var != null) {
            m3Var.setTranslationY(ciVar.X2.getTranslationY());
        }
        ciVar.c3.setTranslationY(ciVar.i4);
        ciVar.P1(0);
        ciVar.E0 = ciVar.v2 != ciVar.q2 ? ciVar.i4 : 0.0f;
        ciVar.c.invalidate();
        phVar.invalidate();
        ciVar.A2.invalidate();
        ciVar.J1();
        uh uhVar = ciVar.v2;
        if (uhVar != null) {
            uhVar.n(ciVar.i4, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void f() {
        ci ciVar = this.x.k0;
        ciVar.M1(ciVar.v2, 0);
        ciVar.Z3 = ciVar.Y3[0];
        ciVar.v2.y();
        if (!(ciVar.v2 instanceof hi.c4) || ciVar.A3) {
            return;
        }
        int L = ciVar.d ? org.telegram.messenger.g0.L(84.0f) : 0;
        for (int i7 = 0; i7 < ciVar.u2.size(); i7++) {
            ((hi.c4) ciVar.u2.valueAt(i7)).setMeasureOffsetY(L);
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void g(int i7, boolean z9) {
        int i10;
        ph phVar = this.x;
        ci ciVar = phVar.k0;
        int i11 = ciVar.Z3;
        if (i11 <= 0 || i11 == (i10 = ciVar.Y3[0]) || !(z9 || ciVar.v2 == ciVar.q2)) {
            ciVar.a4 = -1.0f;
        } else {
            ciVar.a4 = i11;
            ciVar.b4 = i10;
        }
        phVar.invalidate();
        ch chVar = ciVar.u3;
        if ((ciVar.v2 instanceof hi.c4) && !ciVar.A3) {
            if (z9) {
                chVar.setVisibility(8);
            } else {
                chVar.setVisibility(0);
            }
        }
        ciVar.v2.z(i7, z9);
    }
}
