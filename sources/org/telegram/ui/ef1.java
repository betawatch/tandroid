package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ef1 extends org.telegram.ui.Components.m70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ gf1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef1(gf1 gf1Var, Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.m2 m2Var, long j10) {
        super(context, i10, iVar, j3, m2Var, null);
        this.B0 = gf1Var;
        this.A0 = j10;
    }

    @Override // org.telegram.ui.Components.m70
    public final boolean X() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
