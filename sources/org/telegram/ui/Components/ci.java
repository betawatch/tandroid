package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ci implements oj {
    public final /* synthetic */ ti a;

    public ci(ti tiVar) {
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.oj
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.a.f0;
        if (wnVar.o7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, wnVar.j6, wnVar.D5, wnVar.j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = wnVar.O8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = wnVar.a9();
            of2.suggestionParams = wnVar.w5;
            wnVar.getSendMessagesHelper().sendMessage(of2);
            wnVar.E6();
        }
    }

    @Override // org.telegram.ui.Components.oj
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.wn) this.a.f0).sb(arrayList, str, z10, i10, j10, z11);
    }
}
