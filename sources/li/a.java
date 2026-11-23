package li;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ a(g gVar, int i7) {
        this.a = i7;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        String N0;
        int i7 = this.a;
        g gVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(o41.l(0, gVar.h));
                o41 c10 = o41.c(1, R.drawable.msg_groups_create, hd.N0(2131751927, null));
                c10.r = true;
                arrayList.add(c10);
                arrayList.add(o41.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = gVar.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(o41.t(3, hd.N0(2131751957, null)));
                    ArrayList arrayList3 = gVar.n;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull P0 = gVar.getMessagesController().P0(chat.id);
                        o41 w10 = o41.w(chat);
                        long j3 = chat.id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (P0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = P0.linked_peers;
                            N0 = hd.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            N0 = hd.N0(2131748586, null);
                        }
                        w10.n = N0;
                        arrayList.add(w10);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    l0.d(0, gVar.b, gVar);
                    break;
                } else {
                    gVar.getClass();
                    lc.b0(gVar).g0(tL_error, false);
                    break;
                }
        }
    }
}
