package ii;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                arrayList.add(y31.l(0, fVar.h));
                y31 c10 = y31.c(1, R.drawable.msg_groups_create, id.M0(2131751939, null));
                c10.q = true;
                arrayList.add(c10);
                arrayList.add(y31.E(2, org.telegram.messenger.g0.L(14.0f)));
                ArrayList arrayList2 = fVar.n;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(y31.t(3, id.M0(2131751969, null)));
                    ArrayList arrayList3 = fVar.n;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull N0 = fVar.getMessagesController().N0(chat.id);
                        y31 w10 = y31.w(chat);
                        long j3 = chat.id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (N0 != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = N0.linked_peers;
                            M0 = id.G(arrayList4 != null ? arrayList4.size() : 0, "Chats", new Object[0]);
                        } else {
                            M0 = id.M0(2131748779, null);
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
