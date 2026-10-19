package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class fi implements oj {
    public final /* synthetic */ ti a;

    public fi(ti tiVar) {
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.oj
    public final void b(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.a.f0;
        if (qnVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, qnVar.T5, qnVar.n5, qnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = qnVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = qnVar.S8();
            of2.suggestionParams = qnVar.g5;
            qnVar.getSendMessagesHelper().sendMessage(of2);
            qnVar.B6();
        }
    }

    @Override // org.telegram.ui.Components.oj
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.qn) this.a.f0).hb(arrayList, str, z10, i10, j10, z11);
    }
}
