package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class op extends org.telegram.ui.Components.l80 {
    public final /* synthetic */ TLRPC.Chat w;
    public final /* synthetic */ pp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(pp ppVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.x = ppVar;
        this.w = chat2;
    }

    @Override // org.telegram.ui.Components.l80
    public final boolean a(boolean z10, org.telegram.ui.Components.j80 j80Var) {
        sp spVar = this.x.d;
        if (spVar.P) {
            return false;
        }
        spVar.P = true;
        e(new rh(15, this, j80Var), new ai.s4(this, this.w, z10, j80Var, 15));
        return true;
    }

    @Override // org.telegram.ui.Components.l80
    public final boolean b(boolean z10, org.telegram.ui.Components.k80 k80Var) {
        sp spVar = this.x.d;
        if (spVar.O) {
            return false;
        }
        spVar.O = true;
        e(new rh(15, this, k80Var), new ai.s4(this, this.w, z10, k80Var, 14));
        return true;
    }

    public final void e(rh rhVar, Runnable runnable) {
        sp spVar = this.x.d;
        if (ChatObject.isChannel(spVar.f)) {
            runnable.run();
        } else {
            spVar.getMessagesController().convertToMegaGroup(spVar.getParentActivity(), this.w.id, spVar, new u(17, this, runnable), rhVar);
        }
    }
}
