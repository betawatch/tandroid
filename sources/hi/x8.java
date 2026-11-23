package hi;

import android.os.SystemClock;
import android.util.Pair;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kv0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x8(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7;
        long j3;
        switch (this.a) {
            case 0:
                f9 f9Var = (f9) this.c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                org.telegram.ui.ActionBar.t1 t1Var = f9Var.H;
                if (t1Var != null) {
                    t1Var.c(350L);
                    f9Var.H = null;
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
                    f9Var.e(this.b, tL_chatParticipants);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ji.f(2, (ji.n) this.c, (String) obj), Math.max(0L, (this.b + 1200) - SystemClock.uptimeMillis()));
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
                kv0 kv0Var = (kv0) this.c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    ks.f(i10.t0).d(new bi.s2(kv0Var, tL_messages_emojiGroups, this.b, 26));
                    break;
                }
                break;
        }
    }
}
