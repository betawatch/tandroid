package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class af1 extends org.telegram.ui.Components.d70 {
    public final /* synthetic */ long x0;
    public final /* synthetic */ cf1 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af1(cf1 cf1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, long j11) {
        super(context, i10, hVar, j10, p2Var, null);
        this.y0 = cf1Var;
        this.x0 = j11;
    }

    @Override // org.telegram.ui.Components.d70
    public final boolean X() {
        TLRPC.Chat chat = this.y0.b.getMessagesController().getChat(Long.valueOf(this.x0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
