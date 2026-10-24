package hg;

import ai.tb;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class e1 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ a0.h e;
    public final /* synthetic */ MessagesController f;
    public final /* synthetic */ j1 h;

    public e1(j1 j1Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = j1Var;
        this.a = chat;
        this.b = str;
        this.c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = this.h;
        if (j1Var.E != this) {
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
        long j10 = this.c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i10 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i11 = j1Var.i0 + 1;
        j1Var.i0 = i11;
        j1Var.j0 = ConnectionsManager.getInstance(j1Var.f).sendRequest(tL_channels_getParticipants, new tb(this, i11, this.d, this.e, this.f, 3));
    }
}
