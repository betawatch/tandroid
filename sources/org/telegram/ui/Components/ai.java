package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ai extends org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ bi x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(bi biVar, bi biVar2) {
        super(biVar2);
        this.x = biVar;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        kz kzVar;
        li liVar = this.x.y0;
        if (!liVar.isDismissed() && liVar.p1) {
            di diVar = liVar.v0;
            if (diVar != liVar.j0 && diVar != liVar.k0 && !liVar.m1().m()) {
                return true;
            }
            di diVar2 = liVar.v0;
            pn pnVar = liVar.j0;
            if (diVar2 == pnVar && ((kzVar = pnVar.B) == null || kzVar.getVisibility() != 0)) {
                return true;
            }
            di diVar3 = liVar.v0;
            pn pnVar2 = liVar.k0;
            if (diVar3 == pnVar2) {
                kz kzVar2 = pnVar2.B;
                return kzVar2 == null || kzVar2.getVisibility() != 0;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void e(float f10, float f11, boolean z4) {
        bi biVar = this.x;
        li liVar = biVar.y0;
        liVar.i2 = f10;
        float f12 = liVar.a2;
        if (f12 > 0.0f) {
            liVar.i2 = e2.c.w(1.0f, f11, f12 - liVar.b2, f10);
        }
        liVar.U0.setTranslationY(liVar.i2);
        liVar.X0.setTranslationY(liVar.i2);
        org.telegram.ui.ActionBar.w0 w0Var = liVar.b1;
        if (w0Var != null) {
            w0Var.setTranslationY(liVar.i2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = liVar.Z0;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(liVar.X0.getTranslationY());
        }
        ph.f3 f3Var = liVar.a1;
        if (f3Var != null) {
            f3Var.setTranslationY(liVar.X0.getTranslationY());
        }
        liVar.c1.setTranslationY(liVar.i2);
        liVar.a2(0);
        liVar.setCurrentPanTranslationY(liVar.i2);
        biVar.invalidate();
        liVar.A0.invalidate();
        liVar.U1();
        di diVar = liVar.v0;
        if (diVar != null) {
            diVar.k(liVar.i2);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
        boolean z4;
        li liVar = this.x.y0;
        liVar.X1(liVar.v0, 0);
        liVar.Z1 = liVar.Y1[0];
        liVar.v0.v();
        if (!(liVar.v0 instanceof rh.n3) || liVar.A1) {
            return;
        }
        z4 = ((org.telegram.ui.ActionBar.g3) liVar).keyboardVisible;
        int dp = z4 ? AndroidUtilities.dp(84.0f) : 0;
        for (int i10 = 0; i10 < liVar.u0.size(); i10++) {
            ((rh.n3) liVar.u0.valueAt(i10)).setMeasureOffsetY(dp);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z4) {
        int i11;
        bi biVar = this.x;
        li liVar = biVar.y0;
        int i12 = liVar.Z1;
        if (i12 <= 0 || i12 == (i11 = liVar.Y1[0]) || !z4) {
            liVar.a2 = -1.0f;
        } else {
            liVar.a2 = i12;
            liVar.b2 = i11;
        }
        biVar.invalidate();
        mh mhVar = liVar.u1;
        if ((liVar.v0 instanceof rh.n3) && !liVar.A1) {
            if (z4) {
                mhVar.setVisibility(8);
            } else {
                mhVar.setVisibility(0);
            }
        }
        liVar.v0.w(i10, z4);
    }
}
