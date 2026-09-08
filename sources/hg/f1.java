package hg;

import bi.fa;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f1 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ a0.i e;
    public final /* synthetic */ MessagesController f;
    public final /* synthetic */ k1 h;

    public f1(k1 k1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.i iVar, MessagesController messagesController) {
        this.h = k1Var;
        this.a = chat;
        this.b = str;
        this.c = j3;
        this.d = arrayList;
        this.e = iVar;
        this.f = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k1 k1Var = this.h;
        if (k1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i10 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i10 | 1;
        tL_channelParticipantsMentions.q = this.b;
        long j3 = this.c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = k1Var.i0 + 1;
        k1Var.i0 = i11;
        k1Var.j0 = ConnectionsManager.getInstance(k1Var.f).sendRequest(tL_channels_getParticipants, new fa(this, i11, this.d, this.e, this.f, 1));
    }
}
