package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ki implements sj {
    public final /* synthetic */ yi a;

    public ki(yi yiVar) {
        this.a = yiVar;
    }

    @Override // org.telegram.ui.Components.sj
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.a.f0;
        if (eoVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, eoVar.T5, eoVar.n5, eoVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = eoVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = eoVar.N8();
            of2.suggestionParams = eoVar.g5;
            eoVar.getSendMessagesHelper().sendMessage(of2);
            eoVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.sj
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.eo) this.a.f0).db(arrayList, str, z10, i10, j3, z11);
    }
}
