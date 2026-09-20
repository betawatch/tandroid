package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class nf1 extends org.telegram.ui.Components.j70 {
    public final /* synthetic */ long A0;
    public final /* synthetic */ pf1 B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf1(pf1 pf1Var, Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(context, i10, iVar, j3, n2Var, null);
        this.B0 = pf1Var;
        this.A0 = j10;
    }

    @Override // org.telegram.ui.Components.j70
    public final boolean X() {
        TLRPC.Chat chat = this.B0.b.getMessagesController().getChat(Long.valueOf(this.A0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
