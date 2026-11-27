// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n17 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ zh6 e;
    public final /* synthetic */ uc7 f;
    public final /* synthetic */ r17 h;

    public n17(r17 r17Var, TLRPC.Chat chat, String str, long j, ArrayList arrayList, zh6 zh6Var, uc7 uc7Var) {
        this.h = r17Var;
        this.a = chat;
        this.b = str;
        this.c = j;
        this.d = arrayList;
        this.e = zh6Var;
        this.f = uc7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r17 r17Var = this.h;
        if (r17Var.F != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = uc7.i1(this.a);
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
        int i2 = r17Var.j0 + 1;
        r17Var.j0 = i2;
        r17Var.k0 = ConnectionsManager.getInstance(r17Var.f).sendRequest(tL_channels_getParticipants, new eu0((Object) this, i2, (Object) this.d, (Object) this.e, (Object) this.f, (byte) 8));
    }
}
