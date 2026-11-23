package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class sq0 implements org.telegram.ui.e50 {
    public final /* synthetic */ jt0 a;

    public sq0(jt0 jt0Var) {
        this.a = jt0Var;
    }

    @Override // org.telegram.ui.e50
    public final void c(org.telegram.ui.f50 f50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        f50Var.presentFragment(new org.telegram.ui.bn(bundle), true);
        wr0 wr0Var = this.a.S;
        org.telegram.ui.ActionBar.g2 g2Var = wr0Var.r.y1;
        if (wr0Var.n != 0) {
            g2Var.getConnectionsManager().cancelRequest(wr0Var.n, true);
            wr0Var.n = 0;
        }
        wr0Var.d.clear();
        wr0Var.e = false;
        wr0Var.h = false;
        wr0Var.E(0L);
        TLRPC.User c22 = g2Var.getMessagesController().c2(Long.valueOf(wr0Var.F()));
        if (c22 != null) {
            g2Var.getMessagesController().c3(c22, g2Var.getClassGuid(), true, null);
        }
    }
}
