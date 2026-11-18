package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qq0 implements org.telegram.ui.e50 {
    public final /* synthetic */ gt0 a;

    public qq0(gt0 gt0Var) {
        this.a = gt0Var;
    }

    @Override // org.telegram.ui.e50
    public final void c(org.telegram.ui.f50 f50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        f50Var.presentFragment(new org.telegram.ui.bn(bundle), true);
        ur0 ur0Var = this.a.S;
        org.telegram.ui.ActionBar.h2 h2Var = ur0Var.r.y1;
        if (ur0Var.n != 0) {
            h2Var.getConnectionsManager().cancelRequest(ur0Var.n, true);
            ur0Var.n = 0;
        }
        ur0Var.d.clear();
        ur0Var.e = false;
        ur0Var.h = false;
        ur0Var.E(0L);
        TLRPC.User c22 = h2Var.getMessagesController().c2(Long.valueOf(ur0Var.F()));
        if (c22 != null) {
            h2Var.getMessagesController().c3(c22, h2Var.getClassGuid(), true, null);
        }
    }
}
