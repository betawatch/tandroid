package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wh implements gj {
    public final /* synthetic */ li a;

    public wh(li liVar) {
        this.a = liVar;
    }

    @Override // org.telegram.ui.Components.gj
    public final void a(TLRPC.User user, boolean z4, int i10, long j10) {
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.a.c0;
        if (znVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, znVar.Q5, znVar.k5, znVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
            of2.sendMessageChatArguments = znVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = znVar.N8();
            of2.suggestionParams = znVar.d5;
            znVar.getSendMessagesHelper().sendMessage(of2);
            znVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.gj
    public final void b(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
        ((org.telegram.ui.zn) this.a.c0).db(arrayList, str, z4, i10, j10, z10);
    }
}
