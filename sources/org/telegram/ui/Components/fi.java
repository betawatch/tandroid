package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class fi implements oj {
    public final /* synthetic */ ti a;

    public fi(ti tiVar) {
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.oj
    public final void b(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.a.f0;
        if (snVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, snVar.T5, snVar.n5, snVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = snVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = snVar.S8();
            of2.suggestionParams = snVar.g5;
            snVar.getSendMessagesHelper().sendMessage(of2);
            snVar.B6();
        }
    }

    @Override // org.telegram.ui.Components.oj
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.sn) this.a.f0).hb(arrayList, str, z10, i10, j10, z11);
    }
}
