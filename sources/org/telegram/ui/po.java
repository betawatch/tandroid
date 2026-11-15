package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class po extends org.telegram.ui.Components.i70 {
    public final /* synthetic */ TLRPC.Chat x;
    public final /* synthetic */ qo y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po(qo qoVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.y = qoVar;
        this.x = chat2;
    }

    @Override // org.telegram.ui.Components.i70
    public final boolean a(boolean z10, org.telegram.ui.Components.g70 g70Var) {
        to toVar = this.y.d;
        if (toVar.Q) {
            return false;
        }
        toVar.Q = true;
        e(new zg(15, this, g70Var), new wn(this, this.x, z10, g70Var, 2));
        return true;
    }

    @Override // org.telegram.ui.Components.i70
    public final boolean b(boolean z10, org.telegram.ui.Components.h70 h70Var) {
        to toVar = this.y.d;
        if (toVar.P) {
            return false;
        }
        toVar.P = true;
        e(new zg(15, this, h70Var), new wn(this, this.x, z10, h70Var, 1));
        return true;
    }

    public final void e(zg zgVar, Runnable runnable) {
        to toVar = this.y.d;
        if (org.telegram.messenger.t3.T(toVar.f)) {
            runnable.run();
        } else {
            toVar.getMessagesController().T(toVar.getParentActivity(), this.x.id, toVar, new m2.d(24, this, runnable), zgVar);
        }
    }
}
