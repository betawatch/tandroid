package ji;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a(e eVar, int i3) {
        this.a = i3;
        this.b = eVar;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        String M0;
        int i3 = this.a;
        e eVar = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(r31.l(0, eVar.h));
                r31 c2 = r31.c(1, R.drawable.msg_groups_create, bd.M0(2131751939, null));
                c2.q = true;
                arrayList.add(c2);
                arrayList.add(r31.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = eVar.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(r31.t(3, bd.M0(2131751969, null)));
                    ArrayList arrayList3 = eVar.n;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull N0 = eVar.getMessagesController().N0(chat.id);
                        r31 w10 = r31.w(chat);
                        long j10 = chat.id;
                        w10.d = (int) (j10 ^ (j10 >>> 32));
                        if (N0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = N0.linked_peers;
                            M0 = bd.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            M0 = bd.M0(2131748787, null);
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
                    j0.d(eVar, eVar.b, 0);
                    break;
                } else {
                    eVar.getClass();
                    fc.a0(eVar).f0(tL_error, false);
                    break;
                }
        }
    }
}
