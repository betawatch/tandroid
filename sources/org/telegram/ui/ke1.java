package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ke1 extends org.telegram.ui.Components.z70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ me1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke1(me1 me1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.r2 r2Var, long j11) {
        super(context, i10, hVar, j10, r2Var, null);
        this.B0 = me1Var;
        this.A0 = j11;
    }

    @Override // org.telegram.ui.Components.z70
    public final boolean X() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
