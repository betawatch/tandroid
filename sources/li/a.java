package li;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ a(g gVar, int i7) {
        this.a = i7;
        this.b = gVar;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        String M0;
        int i7 = this.a;
        g gVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(l41.l(0, gVar.h));
                l41 c10 = l41.c(1, R.drawable.msg_groups_create, gd.M0(2131751928, null));
                c10.r = true;
                arrayList.add(c10);
                arrayList.add(l41.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = gVar.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(l41.t(3, gd.M0(2131751958, null)));
                    ArrayList arrayList3 = gVar.n;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull P0 = gVar.getMessagesController().P0(chat.id);
                        l41 w10 = l41.w(chat);
                        long j3 = chat.id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (P0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = P0.linked_peers;
                            M0 = gd.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            M0 = gd.M0(2131748587, null);
                        }
                        w10.n = M0;
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
