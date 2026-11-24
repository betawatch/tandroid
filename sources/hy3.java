// default package

import android.os.SystemClock;
import android.util.Pair;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hy3 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hy3(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // p8c
    public final void a(Object obj) {
        int i;
        long j;
        byte b = this.a;
        long j2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ResultCallback resultCallback = (ResultCallback) obj2;
                mqc mqcVar = (mqc) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(j2), mqcVar));
                    break;
                }
                break;
            case 1:
                tya tyaVar = (tya) obj2;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    kk7.f(y6c.t0).d(new go6((Object) tyaVar, (Object) tL_messages_emojiGroups, this.b, (byte) 28));
                    break;
                }
                break;
            case 2:
                t5b t5bVar = (t5b) obj2;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                hd hdVar = t5bVar.H;
                if (hdVar != null) {
                    hdVar.b(350L);
                    t5bVar.H = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    while (i < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j = cf3.n(peer);
                            i = j < 0 ? i + 1 : 0;
                        } else {
                            j = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    t5bVar.e(j2, tL_chatParticipants);
                    break;
                }
                break;
            default:
                gl.e3(new mhc((gjc) obj2, (String) obj, (byte) 5), Math.max(0L, (j2 + 1200) - SystemClock.uptimeMillis()));
                break;
        }
    }
}
