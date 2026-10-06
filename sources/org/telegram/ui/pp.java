package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class pp extends org.telegram.ui.Components.y80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ qp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp(qp qpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = qpVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.y80
    public final boolean a(boolean z10, org.telegram.ui.Components.w80 w80Var) {
        tp tpVar = this.x.d;
        if (tpVar.P) {
            return false;
        }
        tpVar.P = true;
        e(new oh(19, this, w80Var), new ai.s4(this, this.w, z10, w80Var, 16));
        return true;
    }

    @Override // org.telegram.ui.Components.y80
    public final boolean b(boolean z10, org.telegram.ui.Components.x80 x80Var) {
        tp tpVar = this.x.d;
        if (tpVar.O) {
            return false;
        }
        tpVar.O = true;
        e(new oh(19, this, x80Var), new ai.s4(this, this.w, z10, x80Var, 15));
        return true;
    }

    public final void e(oh ohVar, Runnable runnable) {
        tp tpVar = this.x.d;
        if (ChatObject.isChannel(tpVar.f)) {
            runnable.run();
        } else {
            tpVar.getMessagesController().convertToMegaGroup(tpVar.getParentActivity(), this.w.id, tpVar, new o(19, this, runnable), ohVar);
        }
    }
}
