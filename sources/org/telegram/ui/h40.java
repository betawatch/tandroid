package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h40 extends org.telegram.ui.Components.dk0 {
    public org.telegram.messenger.t3 c;
    public final int d;
    public ArrayList f;
    public a20 h;
    public final e40 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public h40(org.telegram.messenger.t3 t3Var, int i7, e40 e40Var) {
        this.c = t3Var;
        this.d = i7;
        this.n = e40Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.s sVar, boolean z10) {
        if (z10 && sVar.getRenderer() == null) {
            sVar.setRenderer(org.telegram.ui.Components.voip.z.c(this.f, this.h, null, null, sVar, sVar.getParticipant(), this.c, this.n));
        } else {
            if (z10 || sVar.getRenderer() == null) {
                return;
            }
            sVar.getRenderer().setTabletGridView(null);
            sVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.ek0 ek0Var = this.n.m4;
        int size = this.e.size();
        return size <= 1 ? ek0Var.getMeasuredHeight() : size <= 4 ? ek0Var.getMeasuredHeight() / 2 : (int) (ek0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, a20 a20Var) {
        this.f = arrayList;
        this.h = a20Var;
    }

    public final void H(org.telegram.ui.Components.ek0 ek0Var, boolean z10, boolean z11) {
        this.r = z10;
        if (z11) {
            for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
                View childAt = ek0Var.getChildAt(i7);
                if (childAt instanceof org.telegram.ui.Components.voip.s) {
                    org.telegram.ui.Components.voip.s sVar = (org.telegram.ui.Components.voip.s) childAt;
                    if (sVar.getParticipant() != null) {
                        E(sVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.ek0 ek0Var, boolean z10) {
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
            v4.p.c(new jg.g(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.Z3(ek0Var);
        }
    }

    @Override // v4.i0
    public final int b() {
        return this.e.size();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Components.voip.s sVar = (org.telegram.ui.Components.voip.s) f1Var.a;
        org.telegram.messenger.u3 participant = sVar.getParticipant();
        ArrayList arrayList = this.e;
        org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList.get(i7);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.u3) arrayList.get(i7)).a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i7 == 0 || i7 == 1)) {
            i10 = 3;
        }
        sVar.a = i10;
        sVar.b = this;
        if (sVar.getMeasuredHeight() != F()) {
            sVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.c.J;
        sVar.d = u3Var;
        if (participant != null && !participant.equals(u3Var) && sVar.e && sVar.getRenderer() != null) {
            E(sVar, false);
            E(sVar, true);
        } else if (sVar.getRenderer() != null) {
            sVar.getRenderer().j(true);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new org.telegram.ui.Components.mj0(new x30(this, viewGroup.getContext()));
    }
}
