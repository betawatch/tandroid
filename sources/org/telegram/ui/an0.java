package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class an0 implements org.telegram.ui.Cells.r5 {
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
        org.telegram.ui.Components.c5.r0(cn0Var, org.telegram.messenger.hd.N0(2131745114, null), org.telegram.messenger.hd.N0(2131745107, null), null);
        if (cn0Var.X == 1) {
            cn0Var.X = 2;
        }
    }

    @Override // org.telegram.ui.Cells.r5
    public final void e(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        cn0 cn0Var = (cn0) this.a.e;
        org.telegram.messenger.ve veVar = cn0Var.K;
        int i7 = -1;
        if (veVar != null) {
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) veVar.e.get(intValue);
            boolean containsKey = cn0Var.b.containsKey(Integer.valueOf(ffVar.C));
            z10 = !containsKey;
            if (!containsKey && cn0Var.I > 0 && cn0Var.b.size() >= cn0Var.I) {
                a();
                return;
            }
            if (cn0Var.e && !containsKey) {
                i7 = cn0Var.c.size();
            }
            s5Var.b(i7, z10, true);
            cn0Var.d0(intValue, ffVar);
        } else {
            org.telegram.messenger.g0.v1(cn0Var.getParentActivity().getCurrentFocus());
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) cn0Var.f.get(intValue);
            boolean containsKey2 = cn0Var.b.containsKey(jfVar.B);
            z10 = !containsKey2;
            if (!containsKey2 && cn0Var.I > 0 && cn0Var.b.size() >= cn0Var.I) {
                a();
                return;
            }
            if (cn0Var.e && !containsKey2) {
                i7 = cn0Var.c.size();
            }
            s5Var.b(i7, z10, true);
            cn0Var.d0(intValue, jfVar);
        }
        cn0Var.n0(z10 ? 1 : 2);
        cn0Var.t0.u();
    }
}
