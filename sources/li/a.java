package li;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ a(f fVar, int i7) {
        this.a = i7;
        this.b = fVar;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        String N0;
        int i7 = this.a;
        f fVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(n41.l(0, fVar.h));
                n41 c10 = n41.c(1, R.drawable.msg_groups_create, gd.N0(2131751927, null));
                c10.r = true;
                arrayList.add(c10);
                arrayList.add(n41.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = fVar.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(n41.t(3, gd.N0(2131751957, null)));
                    ArrayList arrayList3 = fVar.n;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull P0 = fVar.getMessagesController().P0(chat.id);
                        n41 w10 = n41.w(chat);
                        long j3 = chat.id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (P0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = P0.linked_peers;
                            N0 = gd.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            N0 = gd.N0(2131748586, null);
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
                    k0.d(0, fVar.b, fVar);
                    break;
                } else {
                    fVar.getClass();
                    kc.b0(fVar).g0(tL_error, false);
                    break;
                }
        }
    }
}
