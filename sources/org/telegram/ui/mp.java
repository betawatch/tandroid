package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mp extends org.telegram.ui.Components.y70 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ np y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp(np npVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = npVar;
        this.x = chat2;
    }

    @Override // org.telegram.ui.Components.y70
    public final boolean a(boolean z10, org.telegram.ui.Components.w70 w70Var) {
        qp qpVar = this.y.d;
        if (qpVar.P) {
            return false;
        }
        qpVar.P = true;
        e(new zg(20, this, w70Var), new kp(this, this.x, z10, w70Var, 0));
        return true;
    }

    @Override // org.telegram.ui.Components.y70
    public final boolean b(boolean z10, org.telegram.ui.Components.x70 x70Var) {
        qp qpVar = this.y.d;
        if (qpVar.O) {
            return false;
        }
        qpVar.O = true;
        e(new zg(20, this, x70Var), new bi.n4(this, this.x, z10, x70Var, 29));
        return true;
    }

    public final void e(zg zgVar, Runnable runnable) {
        qp qpVar = this.y.d;
        if (org.telegram.messenger.w3.T(qpVar.f)) {
            runnable.run();
        } else {
            qpVar.getMessagesController().T(qpVar.getParentActivity(), this.x.id, qpVar, new ng.d(20, this, runnable), zgVar);
        }
    }
}
