// default package

import android.os.SystemClock;
import android.util.Pair;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cz3 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cz3(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // pcc
    public final void a(Object obj) {
        int i;
        long j;
        byte b = this.a;
        long j2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ResultCallback resultCallback = (ResultCallback) obj2;
                avc avcVar = (avc) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(j2), avcVar));
                    break;
                }
                break;
            case 1:
                t2b t2bVar = (t2b) obj2;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    jn7.f(yac.t0).d(new cq6((Object) t2bVar, (Object) tL_messages_emojiGroups, this.b, (byte) 29));
                    break;
                }
                break;
            case 2:
                r9b r9bVar = (r9b) obj2;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                id idVar = r9bVar.H;
                if (idVar != null) {
                    idVar.b(350L);
                    r9bVar.H = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    while (i < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j = wf3.n(peer);
                            i = j < 0 ? i + 1 : 0;
                        } else {
                            j = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    r9bVar.e(j2, tL_chatParticipants);
                    break;
                }
                break;
            default:
                hl.d3(new slc((snc) obj2, (String) obj, (byte) 5), Math.max(0L, (j2 + 1200) - SystemClock.uptimeMillis()));
                break;
        }
    }
}
