package fi;

import android.util.Pair;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yu0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f8(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7;
        long j3;
        switch (this.a) {
            case 0:
                n8 n8Var = (n8) this.c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.u1 u1Var = n8Var.G;
                if (u1Var != null) {
                    u1Var.c(350L);
                    n8Var.G = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    while (i7 < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i7);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j3 = org.telegram.messenger.m5.o(peer);
                            i7 = j3 < 0 ? i7 + 1 : 0;
                        } else {
                            j3 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j3;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    n8Var.e(this.b, tL_chatParticipants);
                    break;
                }
                break;
            case 1:
                ResultCallback resultCallback = (ResultCallback) this.c;
                gg.a aVar = (gg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.b), aVar));
                    break;
                }
                break;
            default:
                yu0 yu0Var = (yu0) this.c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    qs.f(p10.s0).d(new bi.d3(yu0Var, tL_messages_emojiGroups, this.b, 25));
                    break;
                }
                break;
        }
    }
}
