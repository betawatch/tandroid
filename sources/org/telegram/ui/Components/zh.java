package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zh implements ij {
    public final /* synthetic */ ni a;

    public zh(ni niVar) {
        this.a = niVar;
    }

    @Override // org.telegram.ui.Components.ij
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.tn tnVar = (org.telegram.ui.tn) this.a.b0;
        if (tnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, tnVar.P5, tnVar.j5, tnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = tnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = tnVar.N8();
            of2.suggestionParams = tnVar.c5;
            tnVar.getSendMessagesHelper().sendMessage(of2);
            tnVar.y6();
        }
    }

    @Override // org.telegram.ui.Components.ij
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.tn) this.a.b0).db(arrayList, str, z10, i10, j10, z11);
    }
}
