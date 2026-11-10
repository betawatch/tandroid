package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class hq0 implements org.telegram.ui.f50 {
    public final /* synthetic */ ys0 a;

    public hq0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    @Override // org.telegram.ui.f50
    public final void e(org.telegram.ui.g50 g50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        g50Var.presentFragment(new org.telegram.ui.cn(bundle), true);
        mr0 mr0Var = this.a.R;
        org.telegram.ui.ActionBar.f2 f2Var = mr0Var.r.x1;
        if (mr0Var.n != 0) {
            f2Var.getConnectionsManager().cancelRequest(mr0Var.n, true);
            mr0Var.n = 0;
        }
        mr0Var.d.clear();
        mr0Var.e = false;
        mr0Var.h = false;
        mr0Var.E(0L);
        TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(mr0Var.F()));
        if (a22 != null) {
            f2Var.getMessagesController().W2(a22, f2Var.getClassGuid(), true, null);
        }
    }
}
