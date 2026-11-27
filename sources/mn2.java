// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn2 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qn2 b;

    public /* synthetic */ mn2(qn2 qn2Var, byte b) {
        this.a = b;
        this.b = qn2Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        String M0;
        byte b = this.a;
        qn2 qn2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(b8c.l(0, qn2Var.h));
                b8c c = b8c.c(1, R.drawable.msg_groups_create, ob6.M0(2131751904, null));
                c.r = true;
                arrayList.add(c);
                arrayList.add(b8c.E(2, hl.L(14.0f)));
                ArrayList arrayList2 = qn2Var.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(b8c.t(3, ob6.M0(2131751934, null)));
                    ArrayList arrayList3 = qn2Var.n;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList3.get(i);
                        i++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull N0 = qn2Var.getMessagesController().N0(chat.id);
                        b8c w = b8c.w(chat);
                        long j = chat.id;
                        w.d = (int) (j ^ (j >>> 32));
                        if (N0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = N0.linked_peers;
                            M0 = ob6.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            M0 = ob6.M0(2131748533, null);
                        }
                        w.n = M0;
                        arrayList.add(w);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    gp2.d(0, qn2Var.b, qn2Var);
                    break;
                } else {
                    d31.b0(qn2Var).g0(tL_error, false);
                    break;
                }
        }
    }
}
