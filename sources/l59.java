// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l59 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q59 b;

    public /* synthetic */ l59(q59 q59Var, byte b) {
        this.a = b;
        this.b = q59Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        int i = 0;
        q59 q59Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.clear();
                ArrayList arrayList2 = q59Var.j;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj3 = arrayList2.get(i);
                    i++;
                    TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj3;
                    long n = wf3.n(messagePeerVote.peer);
                    TLObject b2 = uc7.s1(q59Var.a).b2(n);
                    int i2 = messagePeerVote.date;
                    my myVar = new my(q59Var, n, (byte) 5);
                    int i3 = n59.b;
                    b8c K = b8c.K(n59.class);
                    K.H = b2;
                    K.C = n;
                    K.A = i2;
                    K.E = myVar;
                    arrayList.add(K);
                }
                if (!q59Var.h) {
                    if (!arrayList2.isEmpty()) {
                        int i4 = p59.b;
                        arrayList.add(b8c.K(p59.class));
                        break;
                    } else {
                        int i5 = o59.b;
                        arrayList.add(b8c.K(o59.class));
                        arrayList.add(b8c.K(o59.class));
                        arrayList.add(b8c.K(o59.class));
                        arrayList.add(b8c.K(o59.class));
                        arrayList.add(b8c.K(o59.class));
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) obj;
                int i6 = q59Var.a;
                q59Var.i = false;
                if (tL_messages_votesList == null) {
                    q59Var.g = null;
                    q59Var.h = true;
                    break;
                } else {
                    uc7.s1(i6).j4(tL_messages_votesList.users, false);
                    uc7.s1(i6).c4(tL_messages_votesList.chats, false);
                    String str = tL_messages_votesList.next_offset;
                    q59Var.g = str;
                    q59Var.h = str == null;
                    q59Var.j.addAll(tL_messages_votesList.votes);
                    q59Var.e.run();
                    break;
                }
        }
    }
}
