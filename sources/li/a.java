package li;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a(e eVar, int i7) {
        this.a = i7;
        this.b = eVar;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        String M0;
        int i7 = this.a;
        e eVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(b41.l(0, eVar.h));
                b41 c10 = b41.c(1, R.drawable.msg_groups_create, hd.M0(2131751939, null));
                c10.q = true;
                arrayList.add(c10);
                arrayList.add(b41.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = eVar.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(b41.t(3, hd.M0(2131751969, null)));
                    ArrayList arrayList3 = eVar.n;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull N0 = eVar.getMessagesController().N0(chat.id);
                        b41 w10 = b41.w(chat);
                        long j3 = chat.id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (N0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = N0.linked_peers;
                            M0 = hd.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            M0 = hd.M0(2131748779, null);
                        }
                        w10.m = M0;
                        arrayList.add(w10);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    l0.d(eVar, eVar.b, 0);
                    break;
                } else {
                    eVar.getClass();
                    cc.a0(eVar).f0(tL_error, false);
                    break;
                }
        }
    }
}
