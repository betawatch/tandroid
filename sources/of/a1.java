package of;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a1 implements Runnable {
    public final /* synthetic */ TLRPC.Chat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ a0.h e;
    public final /* synthetic */ MessagesController f;
    public final /* synthetic */ f1 h;

    public a1(f1 f1Var, TLRPC.Chat chat, String str, long j10, ArrayList arrayList, a0.h hVar, MessagesController messagesController) {
        this.h = f1Var;
        this.a = chat;
        this.b = str;
        this.c = j10;
        this.d = arrayList;
        this.e = hVar;
        this.f = messagesController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1 f1Var = this.h;
        if (f1Var.A != this) {
            return;
        }
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = MessagesController.getInputChannel(this.a);
        tL_channels_getParticipants.limit = 20;
        tL_channels_getParticipants.offset = 0;
        TLRPC.TL_channelParticipantsMentions tL_channelParticipantsMentions = new TLRPC.TL_channelParticipantsMentions();
        int i9 = tL_channelParticipantsMentions.flags;
        tL_channelParticipantsMentions.flags = i9 | 1;
        tL_channelParticipantsMentions.q = this.b;
        long j10 = this.c;
        if (j10 != 0) {
            tL_channelParticipantsMentions.flags = i9 | 3;
            tL_channelParticipantsMentions.top_msg_id = (int) j10;
        }
        tL_channels_getParticipants.filter = tL_channelParticipantsMentions;
        int i10 = f1Var.e0 + 1;
        f1Var.e0 = i10;
        f1Var.f0 = ConnectionsManager.getInstance(f1Var.f).sendRequest(tL_channels_getParticipants, new ff.j0(this, i10, this.d, this.e, this.f, 4));
    }
}
