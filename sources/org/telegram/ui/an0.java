package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class an0 implements org.telegram.ui.Cells.q5 {
    public final /* synthetic */ l4 a;

    public an0(l4 l4Var) {
        this.a = l4Var;
    }

    public final void a() {
        bn bnVar;
        TLRPC.Chat chat;
        cn0 cn0Var = (cn0) this.a.e;
        if (!cn0Var.J || (bnVar = cn0Var.V) == null || (chat = bnVar.e) == null || org.telegram.messenger.v3.N(chat) || !chat.slowmode_enabled || cn0Var.X == 2) {
            return;
        }
        org.telegram.ui.Components.b5.r0(cn0Var, org.telegram.messenger.gd.M0(2131745115, null), org.telegram.messenger.gd.M0(2131745108, null), null);
        if (cn0Var.X == 1) {
            cn0Var.X = 2;
        }
    }

    @Override // org.telegram.ui.Cells.q5
    public final void e(org.telegram.ui.Cells.r5 r5Var) {
        boolean z10;
        int intValue = ((Integer) r5Var.getTag()).intValue();
        cn0 cn0Var = (cn0) this.a.e;
        org.telegram.messenger.ue ueVar = cn0Var.K;
        int i7 = -1;
        if (ueVar != null) {
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ueVar.e.get(intValue);
            boolean containsKey = cn0Var.b.containsKey(Integer.valueOf(efVar.C));
            z10 = !containsKey;
            if (!containsKey && cn0Var.I > 0 && cn0Var.b.size() >= cn0Var.I) {
                a();
                return;
            }
            if (cn0Var.e && !containsKey) {
                i7 = cn0Var.c.size();
            }
            r5Var.b(i7, z10, true);
            cn0Var.d0(intValue, efVar);
        } else {
            org.telegram.messenger.g0.v1(cn0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) cn0Var.f.get(intValue);
            boolean containsKey2 = cn0Var.b.containsKey(hfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && cn0Var.I > 0 && cn0Var.b.size() >= cn0Var.I) {
                a();
                return;
            }
            if (cn0Var.e && !containsKey2) {
                i7 = cn0Var.c.size();
            }
            r5Var.b(i7, z10, true);
            cn0Var.d0(intValue, hfVar);
        }
        cn0Var.n0(z10 ? 1 : 2);
        cn0Var.t0.u();
    }
}
