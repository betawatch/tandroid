package ih;

import java.util.ArrayList;
import org.telegram.messenger.k20;
import org.telegram.messenger.o5;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ k(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        int i10 = this.a;
        q qVar = this.b;
        Object[] objArr = 0;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = qVar.j;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long o10 = o5.o(messagePeerVote.peer);
                    TLObject d22 = wp.r1(qVar.a).d2(o10);
                    int i12 = messagePeerVote.date;
                    p pVar = new p(qVar, o10, objArr == true ? 1 : 0);
                    int i13 = m.b;
                    b51 K = b51.K(m.class);
                    K.G = d22;
                    K.B = o10;
                    K.z = i12;
                    K.D = pVar;
                    arrayList.add(K);
                }
                if (!qVar.h) {
                    if (!arrayList2.isEmpty()) {
                        int i14 = o.b;
                        arrayList.add(b51.K(o.class));
                        break;
                    } else {
                        int i15 = n.b;
                        arrayList.add(b51.K(n.class));
                        arrayList.add(b51.K(n.class));
                        arrayList.add(b51.K(n.class));
                        arrayList.add(b51.K(n.class));
                        arrayList.add(b51.K(n.class));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i16 = qVar.a;
                qVar.i = false;
                if (tL_messages_votesList == null) {
                    qVar.g = null;
                    qVar.h = true;
                    break;
                } else {
                    wp.r1(i16).V3(tL_messages_votesList.users, false);
                    wp.r1(i16).P3(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    qVar.g = str;
                    qVar.h = str == null;
                    qVar.j.addAll(tL_messages_votesList.votes);
                    gg.c cVar = qVar.e;
                    if (cVar != null) {
                        cVar.run();
                        break;
                    }
                }
                break;
        }
    }
}
