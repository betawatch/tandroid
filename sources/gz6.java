// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gz6 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ vf6 e;
    public final /* synthetic */ na7 f;
    public final /* synthetic */ kz6 h;

    public gz6(kz6 kz6Var, TLRPC.Chat chat, String str, long j, ArrayList arrayList, vf6 vf6Var, na7 na7Var) {
        this.h = kz6Var;
        this.a = chat;
        this.b = str;
        this.c = j;
        this.d = arrayList;
        this.e = vf6Var;
        this.f = na7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kz6 kz6Var = this.h;
        if (kz6Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = na7.g1(this.a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i | 1;
        tL_channelParticipantsMentions.q = this.b;
        long j = this.c;
        if (j != 0) {
            tL_channelParticipantsMentions.flags = i | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i2 = kz6Var.j0 + 1;
        kz6Var.j0 = i2;
        kz6Var.k0 = ConnectionsManager.getInstance(kz6Var.f).sendRequest(tL_channels_getParticipants, new vt0((Object) this, i2, (Object) this.d, (Object) this.e, (Object) this.f, (byte) 8));
    }
}
