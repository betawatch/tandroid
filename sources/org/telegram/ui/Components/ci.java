package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ci implements oj {
    public final /* synthetic */ ti a;

    public ci(ti tiVar) {
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.oj
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.un unVar = (org.telegram.ui.un) this.a.f0;
        if (unVar.m7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, unVar.f6, unVar.z5, unVar.j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = unVar.L8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = unVar.X8();
            of2.suggestionParams = unVar.s5;
            unVar.getSendMessagesHelper().sendMessage(of2);
            unVar.D6();
        }
    }

    @Override // org.telegram.ui.Components.oj
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.un) this.a.f0).ob(arrayList, str, z10, i10, j10, z11);
    }
}
