package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class de1 extends org.telegram.ui.Components.k60 {
    public final /* synthetic */ long w0;
    public final /* synthetic */ fe1 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de1(fe1 fe1Var, Context context, int i9, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, long j11) {
        super(context, i9, hVar, j10, o2Var, null);
        this.x0 = fe1Var;
        this.w0 = j11;
    }

    @Override // org.telegram.ui.Components.k60
    public final boolean W() {
        TLRPC.Chat chat = this.x0.b.getMessagesController().getChat(Long.valueOf(this.w0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
