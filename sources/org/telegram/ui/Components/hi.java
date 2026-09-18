package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hi implements pj {
    public final /* synthetic */ vi a;

    public hi(vi viVar) {
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.pj
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.bo boVar = (org.telegram.ui.bo) this.a.f0;
        if (boVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, boVar.T5, boVar.n5, boVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = boVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = boVar.N8();
            of2.suggestionParams = boVar.g5;
            boVar.getSendMessagesHelper().sendMessage(of2);
            boVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.pj
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.bo) this.a.f0).db(arrayList, str, z10, i10, j3, z11);
    }
}
