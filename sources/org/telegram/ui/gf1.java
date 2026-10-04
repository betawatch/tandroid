package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class gf1 extends org.telegram.ui.Components.p70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ if1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf1(if1 if1Var, Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(context, i10, iVar, j3, n2Var, null);
        this.B0 = if1Var;
        this.A0 = j10;
    }

    @Override // org.telegram.ui.Components.p70
    public final boolean W() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
