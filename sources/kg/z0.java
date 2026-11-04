package kg;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z0 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ a0.h e;
    public final /* synthetic */ hp f;
    public final /* synthetic */ e1 h;

    public z0(e1 e1Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, hp hpVar) {
        this.h = e1Var;
        this.a = chat;
        this.b = str;
        this.c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f = hpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e1 e1Var = this.h;
        if (e1Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = hp.i1(this.a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i3 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i3 | 1;
        tL_channelParticipantsMentions.q = this.b;
        long j10 = this.c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i3 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i10 = e1Var.j0 + 1;
        e1Var.j0 = i10;
        e1Var.k0 = ConnectionsManager.getInstance(e1Var.f).sendRequest(tL_channels_getParticipants, new cg.j0(this, i10, this.d, this.e, this.f, 4));
    }
}
