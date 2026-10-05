package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ef1 extends org.telegram.ui.Components.p70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ gf1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef1(gf1 gf1Var, Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(context, i10, iVar, j3, n2Var, null);
        this.B0 = gf1Var;
        this.A0 = j10;
    }

    @Override // org.telegram.ui.Components.p70
    public final boolean W() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
