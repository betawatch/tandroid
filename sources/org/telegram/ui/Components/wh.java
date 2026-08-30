package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wh implements gj {
    public final /* synthetic */ li a;

    public wh(li liVar) {
        this.a = liVar;
    }

    @Override // org.telegram.ui.Components.gj
    public final void a(TLRPC.User user, boolean z4, int i10, long j10) {
        org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.a.c0;
        if (xnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, xnVar.Q5, xnVar.k5, xnVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
            of2.sendMessageChatArguments = xnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = xnVar.N8();
            of2.suggestionParams = xnVar.d5;
            xnVar.getSendMessagesHelper().sendMessage(of2);
            xnVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.gj
    public final void b(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
        ((org.telegram.ui.xn) this.a.c0).db(arrayList, str, z4, i10, j10, z10);
    }
}
