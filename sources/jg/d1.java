package jg;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d1 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ a0.h e;
    public final /* synthetic */ qp f;
    public final /* synthetic */ i1 h;

    public d1(i1 i1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.h hVar, qp qpVar) {
        this.h = i1Var;
        this.a = chat;
        this.b = str;
        this.c = j3;
        this.d = arrayList;
        this.e = hVar;
        this.f = qpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.h;
        if (i1Var.E != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = qp.i1(this.a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i7 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i7 | 1;
        tL_channelParticipantsMentions.q = this.b;
        long j3 = this.c;
        if (j3 != 0) {
            tL_channelParticipantsMentions.flags = i7 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j3;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i10 = i1Var.i0 + 1;
        i1Var.i0 = i10;
        i1Var.j0 = ConnectionsManager.getInstance(i1Var.f).sendRequest(tL_channels_getParticipants, new bg.k0(this, i10, this.d, this.e, this.f, 4));
    }
}
