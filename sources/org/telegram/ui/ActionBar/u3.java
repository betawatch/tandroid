package org.telegram.ui.ActionBar;

import android.util.Pair;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bw0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u3(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.q20
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
                bw0 bw0Var = (bw0) this.c;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) obj;
                if (tL_messages_emojiGroups != null) {
                    zs.f(d20.s0).d(new a3.i0(bw0Var, tL_messages_emojiGroups, this.b, 16));
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
