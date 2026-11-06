package ii;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ a(f fVar, int i7) {
        this.a = i7;
        this.b = fVar;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        String M0;
        int i7 = this.a;
        f fVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(x31.l(0, fVar.h));
                x31 c10 = x31.c(1, R.drawable.msg_groups_create, hd.M0(2131751939, null));
                c10.q = true;
                arrayList.add(c10);
                arrayList.add(x31.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = fVar.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(x31.t(3, hd.M0(2131751969, null)));
                    ArrayList arrayList3 = fVar.n;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull N0 = fVar.getMessagesController().N0(chat.id);
                        x31 w10 = x31.w(chat);
                        long j3 = chat.id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (N0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = N0.linked_peers;
                            M0 = hd.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            M0 = hd.M0(2131748778, null);
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
                    m0.d(fVar, fVar.b, 0);
                    break;
                } else {
                    fVar.getClass();
                    hc.a0(fVar).f0(tL_error, false);
                    break;
                }
        }
    }
}
