package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class hi implements pj {
    public final /* synthetic */ vi a;

    public hi(vi viVar) {
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.pj
    public final void b(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.co coVar = (org.telegram.ui.co) this.a.f0;
        if (coVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, coVar.T5, coVar.n5, coVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = coVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = coVar.N8();
            of2.suggestionParams = coVar.g5;
            coVar.getSendMessagesHelper().sendMessage(of2);
            coVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.pj
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.co) this.a.f0).db(arrayList, str, z10, i10, j3, z11);
    }
}
