// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo2 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ io2 b;

    public /* synthetic */ eo2(io2 io2Var, byte b) {
        this.a = b;
        this.b = io2Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        String M0;
        byte b = this.a;
        io2 io2Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(c6c.l(0, io2Var.h));
                c6c c = c6c.c(1, R.drawable.msg_groups_create, jb6.M0(2131751876, null));
                c.r = true;
                arrayList.add(c);
                arrayList.add(c6c.E(2, gm.L(14.0f)));
                ArrayList arrayList2 = io2Var.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(c6c.t(3, jb6.M0(2131751906, null)));
                    ArrayList arrayList3 = io2Var.n;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList3.get(i);
                        i++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull M02 = io2Var.getMessagesController().M0(chat.id);
                        c6c w = c6c.w(chat);
                        long j = chat.id;
                        w.d = (int) (j ^ (j >>> 32));
                        if (M02 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = M02.linked_peers;
                            M0 = jb6.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            M0 = jb6.M0(2131748536, null);
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
                    yp2.d(0, io2Var.b, io2Var);
                    break;
                } else {
                    c41.b0(io2Var).g0(tL_error, false);
                    break;
                }
        }
    }
}
