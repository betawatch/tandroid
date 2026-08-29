package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ge1 extends org.telegram.ui.Components.x60 {
    public final /* synthetic */ long w0;
    public final /* synthetic */ ie1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge1(ie1 ie1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, long j11) {
        super(context, i10, hVar, j10, o2Var, null);
        this.x0 = ie1Var;
        this.w0 = j11;
    }

    @Override // org.telegram.ui.Components.x60
    public final boolean X() {
        TLRPC.Chat chat = this.x0.b.getMessagesController().getChat(Long.valueOf(this.w0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
