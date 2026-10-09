package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ki implements tj {
    public final /* synthetic */ yi a;

    public ki(yi yiVar) {
        this.a = yiVar;
    }

    @Override // org.telegram.ui.Components.tj
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.a.f0;
        if (znVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, znVar.T5, znVar.n5, znVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = znVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = znVar.S8();
            of2.suggestionParams = znVar.g5;
            znVar.getSendMessagesHelper().sendMessage(of2);
            znVar.B6();
        }
    }

    @Override // org.telegram.ui.Components.tj
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.zn) this.a.f0).hb(arrayList, str, z10, i10, j3, z11);
    }
}
