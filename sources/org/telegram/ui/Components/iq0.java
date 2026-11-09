package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class iq0 implements org.telegram.ui.e50 {
    public final /* synthetic */ zs0 a;

    public iq0(zs0 zs0Var) {
        this.a = zs0Var;
    }

    @Override // org.telegram.ui.e50
    public final void e(org.telegram.ui.f50 f50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        f50Var.presentFragment(new org.telegram.ui.cn(bundle), true);
        nr0 nr0Var = this.a.R;
        org.telegram.ui.ActionBar.f2 f2Var = nr0Var.r.x1;
        if (nr0Var.n != 0) {
            f2Var.getConnectionsManager().cancelRequest(nr0Var.n, true);
            nr0Var.n = 0;
        }
        nr0Var.d.clear();
        nr0Var.e = false;
        nr0Var.h = false;
        nr0Var.E(0L);
        TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(nr0Var.F()));
        if (a22 != null) {
            f2Var.getMessagesController().W2(a22, f2Var.getClassGuid(), true, null);
        }
    }
}
