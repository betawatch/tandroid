package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ii implements rj {
    public final /* synthetic */ wi a;

    public ii(wi wiVar) {
        this.a = wiVar;
    }

    @Override // org.telegram.ui.Components.rj
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.a.f0;
        if (wnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, wnVar.T5, wnVar.n5, wnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = wnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = wnVar.N8();
            of2.suggestionParams = wnVar.g5;
            wnVar.getSendMessagesHelper().sendMessage(of2);
            wnVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.rj
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.wn) this.a.f0).db(arrayList, str, z10, i10, j3, z11);
    }
}
