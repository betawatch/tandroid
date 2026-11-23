package hi;

import android.os.SystemClock;
import android.util.Pair;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lv0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c8(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7;
        long j3;
        switch (this.a) {
            case 0:
                k8 k8Var = (k8) this.c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.t1 t1Var = k8Var.H;
                if (t1Var != null) {
                    t1Var.c(350L);
                    k8Var.H = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    while (i7 < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i7);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j3 = org.telegram.messenger.n5.o(peer);
                            i7 = j3 < 0 ? i7 + 1 : 0;
                        } else {
                            j3 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j3;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    k8Var.e(this.b, tL_chatParticipants);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ji.i(0, (ji.o) this.c, (String) obj), Math.max(0L, (this.b + 1200) - SystemClock.uptimeMillis()));
                break;
            case 2:
                ResultCallback resultCallback = (ResultCallback) this.c;
                gg.a aVar = (gg.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.b), aVar));
                    break;
                }
                break;
            default:
                lv0 lv0Var = (lv0) this.c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    ls.f(k10.t0).d(new bi.q2(lv0Var, tL_messages_emojiGroups, this.b, 26));
                    break;
                }
                break;
        }
    }
}
