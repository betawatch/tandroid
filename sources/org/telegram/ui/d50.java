package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class d50 extends org.telegram.ui.Components.tk0 {
    public org.telegram.messenger.u3 c;
    public final int d;
    public ArrayList f;
    public x20 h;
    public final a50 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public d50(org.telegram.messenger.u3 u3Var, int i10, a50 a50Var) {
        this.c = u3Var;
        this.d = i10;
        this.n = a50Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.k kVar, boolean z10) {
        if (z10 && kVar.getRenderer() == null) {
            kVar.setRenderer(org.telegram.ui.Components.voip.r.c(this.f, this.h, null, null, kVar, kVar.getParticipant(), this.c, this.n));
        } else {
            if (z10 || kVar.getRenderer() == null) {
                return;
            }
            kVar.getRenderer().setTabletGridView(null);
            kVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.uk0 uk0Var = this.n.e4;
        int size = this.e.size();
        return size <= 1 ? uk0Var.getMeasuredHeight() : size <= 4 ? uk0Var.getMeasuredHeight() / 2 : (int) (uk0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, x20 x20Var) {
        this.f = arrayList;
        this.h = x20Var;
    }

    public final void H(org.telegram.ui.Components.uk0 uk0Var, boolean z10, boolean z11) {
        this.r = z10;
        if (z11) {
            for (int i10 = 0; i10 < uk0Var.getChildCount(); i10++) {
                View childAt = uk0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.k) {
                    org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) childAt;
                    if (kVar.getParticipant() != null) {
                        E(kVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.uk0 uk0Var, boolean z10) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (!z10) {
            arrayList.clear();
            arrayList.addAll(this.c.f);
            f();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.f);
            s4.n.c(new hg.a(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.i0.a4(uk0Var);
        }
    }

    @Override // s4.g0
    public final int b() {
        return this.e.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) c1Var.a;
        org.telegram.messenger.v3 participant = kVar.getParticipant();
        ArrayList arrayList = this.e;
        org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.v3) arrayList.get(i10)).a;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        kVar.a = i11;
        kVar.b = this;
        if (kVar.getMeasuredHeight() != F()) {
            kVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.c.J;
        kVar.d = v3Var;
        if (participant != null && !participant.equals(v3Var) && kVar.e && kVar.getRenderer() != null) {
            E(kVar, false);
            E(kVar, true);
        } else if (kVar.getRenderer() != null) {
            kVar.getRenderer().j(true);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.dk0(new t40(this, viewGroup.getContext()));
    }
}
