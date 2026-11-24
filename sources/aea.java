// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class aea extends n39 {
    public final Context c;
    public TLRPC.ChatFull d;
    public ArrayList e;
    public final /* synthetic */ nfa f;

    public aea(nfa nfaVar, Context context) {
        this.f = nfaVar;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        TLRPC.ChatFull chatFull = this.d;
        if (chatFull != null && chatFull.participants.participants.isEmpty()) {
            return 1;
        }
        TLRPC.ChatFull chatFull2 = this.d;
        if (chatFull2 != null) {
            return chatFull2.participants.participants.size();
        }
        return 0;
    }

    @Override // w39
    public final int d(int i) {
        TLRPC.ChatFull chatFull = this.d;
        return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        nfa nfaVar = this.f;
        d dVar = nfaVar.y1;
        View view = s49Var.a;
        if (view instanceof v6c) {
            v6c v6cVar = (v6c) view;
            boolean isEmpty = this.e.isEmpty();
            TLRPC.ChatFull chatFull = this.d;
            TLRPC.ChatParticipant chatParticipant = !isEmpty ? chatFull.participants.participants.get(((Integer) this.e.get(i)).intValue()) : chatFull.participants.participants.get(i);
            if (chatParticipant != null) {
                if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    String str2 = channelParticipant.rank;
                    if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = k96.M0(2131752411, "ChannelCreator");
                        }
                        z5 = true;
                        z6 = true;
                        z4 = false;
                    } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = k96.M0(2131752508, "ChannelAdmin");
                        }
                        z4 = channelParticipant.promoted_by == dVar.getUserConfig().e();
                        z5 = true;
                        z6 = false;
                    } else {
                        z4 = false;
                        z5 = false;
                        z6 = false;
                    }
                    boolean z7 = z6;
                    z3 = z4;
                    z = z5;
                    z2 = z7;
                    str = str2;
                } else {
                    String str3 = chatParticipant.rank;
                    if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = k96.M0(2131752411, "ChannelCreator");
                        }
                        str = str3;
                        z = true;
                        z2 = true;
                        z3 = false;
                    } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                        if (TextUtils.isEmpty(str3)) {
                            str3 = k96.M0(2131752508, "ChannelAdmin");
                        }
                        z3 = chatParticipant.inviter_id == dVar.getUserConfig().e();
                        str = str3;
                        z = true;
                        z2 = false;
                    } else {
                        str = str3;
                        z = false;
                        z2 = false;
                        z3 = false;
                    }
                }
                TLRPC.User V1 = dVar.getMessagesController().V1(Long.valueOf(chatParticipant.user_id));
                v6cVar.a(str, z, z2, l7c.D(V1) && hc2.h(dVar.getMessagesController().K0(Long.valueOf(-nfaVar.m1))), new pq5(this, V1, str, z, z2, z3, (byte) 2));
                v6cVar.d(V1, null, null, i != this.d.participants.participants.size() - 1);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        nfa nfaVar = this.f;
        if (i == 20) {
            bi G = nfa.G(7, nfaVar.m1, nfaVar.I1, this.c);
            G.setLayoutParams(new e49(-1, -1));
            return new y29(G);
        }
        v6c v6cVar = new v6c(9, 0, nfaVar.I1, this.c, true, false);
        v6cVar.setLayoutParams(new e49(-1, -2));
        return new y29(v6cVar);
    }
}
