package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
