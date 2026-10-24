package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fe1 extends org.telegram.ui.Components.x70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ he1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe1(he1 he1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, long j11) {
        super(context, i10, hVar, j10, o2Var, null);
        this.B0 = he1Var;
        this.A0 = j11;
    }

    @Override // org.telegram.ui.Components.x70
    public final boolean X() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
