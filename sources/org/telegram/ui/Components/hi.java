package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hi implements qj {
    public final /* synthetic */ vi a;

    public hi(vi viVar) {
        this.a = viVar;
    }

    @Override // org.telegram.ui.Components.qj
    public final void b(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.fo foVar = (org.telegram.ui.fo) this.a.f0;
        if (foVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, foVar.T5, foVar.n5, foVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = foVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = foVar.S8();
            of2.suggestionParams = foVar.g5;
            foVar.getSendMessagesHelper().sendMessage(of2);
            foVar.B6();
        }
    }

    @Override // org.telegram.ui.Components.qj
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.fo) this.a.f0).hb(arrayList, str, z10, i10, j10, z11);
    }
}
