package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mo extends org.telegram.ui.Components.b70 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ no y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(no noVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = noVar;
        this.x = chat2;
    }

    @Override // org.telegram.ui.Components.b70
    public final boolean a(boolean z10, org.telegram.ui.Components.z60 z60Var) {
        qo qoVar = this.y.d;
        if (qoVar.Q) {
            return false;
        }
        qoVar.Q = true;
        e(new lo(1, this, z60Var), new rn(this, this.x, z10, z60Var, 2));
        return true;
    }

    @Override // org.telegram.ui.Components.b70
    public final boolean b(boolean z10, org.telegram.ui.Components.a70 a70Var) {
        qo qoVar = this.y.d;
        if (qoVar.P) {
            return false;
        }
        qoVar.P = true;
        e(new lo(1, this, a70Var), new rn(this, this.x, z10, a70Var, 1));
        return true;
    }

    public final void e(lo loVar, Runnable runnable) {
        qo qoVar = this.y.d;
        if (org.telegram.messenger.t3.T(qoVar.f)) {
            runnable.run();
        } else {
            qoVar.getMessagesController().T(qoVar.getParentActivity(), this.x.id, qoVar, new jo(0, this, runnable), loVar);
        }
    }
}
