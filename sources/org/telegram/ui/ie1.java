package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ie1 extends org.telegram.ui.Components.y70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ ke1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie1(ke1 ke1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.r2 r2Var, long j11) {
        super(context, i10, hVar, j10, r2Var, null);
        this.B0 = ke1Var;
        this.A0 = j11;
    }

    @Override // org.telegram.ui.Components.y70
    public final boolean X() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
