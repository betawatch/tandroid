package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mf1 extends org.telegram.ui.Components.b70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ of1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(of1 of1Var, Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(context, i10, iVar, j3, n2Var, null);
        this.B0 = of1Var;
        this.A0 = j10;
    }

    @Override // org.telegram.ui.Components.b70
    public final boolean X() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
