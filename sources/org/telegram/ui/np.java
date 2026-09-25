package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class np extends org.telegram.ui.Components.v80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ op x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(op opVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = opVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.v80
    public final boolean a(boolean z10, org.telegram.ui.Components.t80 t80Var) {
        rp rpVar = this.x.d;
        if (rpVar.P) {
            return false;
        }
        rpVar.P = true;
        e(new fh(20, this, t80Var), new ai.s4(this, this.w, z10, t80Var, 16));
        return true;
    }

    @Override // org.telegram.ui.Components.v80
    public final boolean b(boolean z10, org.telegram.ui.Components.u80 u80Var) {
        rp rpVar = this.x.d;
        if (rpVar.O) {
            return false;
        }
        rpVar.O = true;
        e(new fh(20, this, u80Var), new ai.s4(this, this.w, z10, u80Var, 15));
        return true;
    }

    public final void e(fh fhVar, Runnable runnable) {
        rp rpVar = this.x.d;
        if (ChatObject.isChannel(rpVar.f)) {
            runnable.run();
        } else {
            rpVar.getMessagesController().convertToMegaGroup(rpVar.getParentActivity(), this.w.id, rpVar, new o(18, this, runnable), fhVar);
        }
    }
}
