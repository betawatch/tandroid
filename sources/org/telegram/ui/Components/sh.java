package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sh implements bj {
    public final /* synthetic */ gi a;

    public sh(gi giVar) {
        this.a = giVar;
    }

    @Override // org.telegram.ui.Components.bj
    public final void b(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.rn rnVar = (org.telegram.ui.rn) this.a.b0;
        if (rnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, rnVar.P5, rnVar.j5, rnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = rnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = rnVar.N8();
            of2.suggestionParams = rnVar.c5;
            rnVar.getSendMessagesHelper().sendMessage(of2);
            rnVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.bj
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.rn) this.a.b0).db(arrayList, str, z10, i10, j10, z11);
    }
}
