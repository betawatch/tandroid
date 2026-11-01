package org.telegram.ui.ActionBar;

import android.util.Pair;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.r20;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cw0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u3(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        int i10;
        long j10;
        switch (this.a) {
            case 0:
                ResultCallback resultCallback = (ResultCallback) this.c;
                wf.a aVar = (wf.a) obj;
                if (resultCallback != null) {
                    resultCallback.onComplete(new Pair(Long.valueOf(this.b), aVar));
                    break;
                }
                break;
            case 1:
                cw0 cw0Var = (cw0) this.c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    at.f(e20.s0).d(new a3.i0(cw0Var, tL_messages_emojiGroups, this.b, 16));
                    break;
                }
                break;
            default:
                vh.r6 r6Var = (vh.r6) this.c;
                TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) obj;
                x1 x1Var = r6Var.G;
                if (x1Var != null) {
                    x1Var.c(350L);
                    r6Var.G = null;
                }
                if (tL_channels_channelParticipants != null && !tL_channels_channelParticipants.participants.isEmpty()) {
                    TLRPC.TL_chatParticipants tL_chatParticipants = new TLRPC.TL_chatParticipants();
                    while (i10 < tL_channels_channelParticipants.participants.size()) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        TLRPC.Peer peer = channelParticipant.peer;
                        if (peer != null) {
                            j10 = org.telegram.messenger.o5.o(peer);
                            i10 = j10 < 0 ? i10 + 1 : 0;
                        } else {
                            j10 = channelParticipant.user_id;
                        }
                        tL_chatParticipant.user_id = j10;
                        tL_chatParticipants.participants.add(tL_chatParticipant);
                    }
                    r6Var.e(this.b, tL_chatParticipants);
                    break;
                }
                break;
        }
    }
}
