package jg;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c1 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ a0.h e;
    public final /* synthetic */ np f;
    public final /* synthetic */ h1 h;

    public c1(h1 h1Var, TLRPC.Chat chat, String str, long j3, ArrayList arrayList, a0.h hVar, np npVar) {
        this.h = h1Var;
        this.a = chat;
        this.b = str;
        this.c = j3;
        this.d = arrayList;
        this.e = hVar;
        this.f = npVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1 h1Var = this.h;
        if (h1Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = np.i1(this.a);
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
        int i10 = h1Var.j0 + 1;
        h1Var.j0 = i10;
        h1Var.k0 = ConnectionsManager.getInstance(h1Var.f).sendRequest(tL_channels_getParticipants, new bg.k0(this, i10, this.d, this.e, this.f, 4));
    }
}
