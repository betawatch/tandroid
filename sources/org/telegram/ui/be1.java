package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class be1 extends org.telegram.ui.Components.v70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ de1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(de1 de1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.n2 n2Var, long j11) {
        super(context, i10, hVar, j10, n2Var, null);
        this.B0 = de1Var;
        this.A0 = j11;
    }

    @Override // org.telegram.ui.Components.v70
    public final boolean Y() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
