package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fi implements oj {
    public final /* synthetic */ ti a;

    public fi(ti tiVar) {
        this.a = tiVar;
    }

    @Override // org.telegram.ui.Components.oj
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.a.f0;
        if (snVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, snVar.f6, snVar.z5, snVar.j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = snVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = snVar.S8();
            of2.suggestionParams = snVar.s5;
            snVar.getSendMessagesHelper().sendMessage(of2);
            snVar.B6();
        }
    }

    @Override // org.telegram.ui.Components.oj
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.sn) this.a.f0).jb(arrayList, str, z10, i10, j10, z11);
    }
}
