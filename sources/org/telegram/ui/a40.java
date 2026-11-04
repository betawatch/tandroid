package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a40 extends org.telegram.ui.Components.sj0 {
    public org.telegram.messenger.r3 c;
    public final int d;
    public ArrayList f;
    public u10 h;
    public final x30 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public a40(org.telegram.messenger.r3 r3Var, int i3, x30 x30Var) {
        this.c = r3Var;
        this.d = i3;
        this.n = x30Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
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
        org.telegram.ui.Components.tj0 tj0Var = this.n.f4;
        int size = this.e.size();
        return size <= 1 ? tj0Var.getMeasuredHeight() : size <= 4 ? tj0Var.getMeasuredHeight() / 2 : (int) (tj0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, u10 u10Var) {
        this.f = arrayList;
        this.h = u10Var;
    }

    public final void H(org.telegram.ui.Components.tj0 tj0Var, boolean z10, boolean z11) {
        this.r = z10;
        if (z11) {
            for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
                View childAt = tj0Var.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Components.voip.k) {
                    org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) childAt;
                    if (kVar.getParticipant() != null) {
                        E(kVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.tj0 tj0Var, boolean z10) {
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
            u4.o.c(new kg.g(this, arrayList2, 4), true).c(this);
            org.telegram.messenger.g0.b4(tj0Var);
        }
    }

    @Override // u4.h0
    public final int b() {
        return this.e.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) d1Var.a;
        org.telegram.messenger.s3 participant = kVar.getParticipant();
        ArrayList arrayList = this.e;
        org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(i3);
        TLRPC.GroupCallParticipant groupCallParticipant = ((org.telegram.messenger.s3) arrayList.get(i3)).a;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i3 == 0 || i3 == 1)) {
            i10 = 3;
        }
        kVar.a = i10;
        kVar.b = this;
        if (kVar.getMeasuredHeight() != F()) {
            kVar.requestLayout();
        }
        org.telegram.messenger.c.a(this.d);
        TLRPC.Peer peer = this.c.J;
        kVar.d = s3Var;
        if (participant != null && !participant.equals(s3Var) && kVar.e && kVar.getRenderer() != null) {
            E(kVar, false);
            E(kVar, true);
        } else if (kVar.getRenderer() != null) {
            kVar.getRenderer().j(true);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new org.telegram.ui.Components.bj0(new q30(this, viewGroup.getContext()));
    }
}
