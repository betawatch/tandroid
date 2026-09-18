package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class hi implements pj {
    public final /* synthetic */ vi a;

    public hi(vi viVar) {
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.pj
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.a.f0;
        if (znVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, znVar.T5, znVar.n5, znVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = znVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = znVar.N8();
            of2.suggestionParams = znVar.g5;
            znVar.getSendMessagesHelper().sendMessage(of2);
            znVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.pj
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.zn) this.a.f0).db(arrayList, str, z10, i10, j3, z11);
    }
}
