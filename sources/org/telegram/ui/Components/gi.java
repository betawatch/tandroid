package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class gi implements sj {
    public final /* synthetic */ xi a;

    public gi(xi xiVar) {
        this.a = xiVar;
    }

    @Override // org.telegram.ui.Components.sj
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.yn ynVar = (org.telegram.ui.yn) this.a.f0;
        if (ynVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, ynVar.R5, ynVar.l5, ynVar.V3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = ynVar.D8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = ynVar.O8();
            of2.suggestionParams = ynVar.e5;
            ynVar.getSendMessagesHelper().sendMessage(of2);
            ynVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.sj
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.yn) this.a.f0).cb(arrayList, str, z10, i10, j3, z11);
    }
}
