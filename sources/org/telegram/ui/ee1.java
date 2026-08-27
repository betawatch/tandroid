package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ee1 extends org.telegram.ui.Components.p60 {
    public final /* synthetic */ long w0;
    public final /* synthetic */ ge1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee1(ge1 ge1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.n2 n2Var, long j11) {
        super(context, i10, hVar, j10, n2Var, null);
        this.x0 = ge1Var;
        this.w0 = j11;
    }

    @Override // org.telegram.ui.Components.p60
    public final boolean X() {
        TLRPC.Chat chat = this.x0.b.getMessagesController().getChat(Long.valueOf(this.w0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
