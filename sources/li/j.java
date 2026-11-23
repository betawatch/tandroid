package li;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.r10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ j(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = this.a;
        int i10 = 0;
        p pVar = this.b;
        switch (i7) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                pVar.getClass();
                if (tL_error != null) {
                    lc.b0(pVar).g0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(o41.l(ls.W1, pVar.s));
                if (v3.y(1, pVar.J)) {
                    TLRPC.Chat chat = pVar.J;
                    o41 c10 = o41.c(ls.X1, R.drawable.outline_profile_photo, hd.N0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751839 : 2131751840, null));
                    c10.r = true;
                    arrayList2.add(c10);
                    arrayList2.add(o41.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(o41.t(0, hd.N0(2131751862, null)));
                    arrayList2.add(o41.j(7, pVar.r));
                    arrayList2.add(o41.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.w(2, pVar.J)) {
                    arrayList2.add(o41.t(3, hd.N0(2131751860, null)));
                    o41 y10 = o41.y(ls.g2, hd.N0(2131751831, null), hd.N0(2131751830, null));
                    y10.L(pVar.n);
                    arrayList2.add(y10);
                    o41 y11 = o41.y(ls.h2, hd.N0(2131751829, null), hd.N0(2131751828, null));
                    y11.L(!pVar.n);
                    arrayList2.add(y11);
                    arrayList2.add(o41.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.N(pVar.J)) {
                    String N0 = hd.N0(2131751953, null);
                    TLRPC.ChatFull chatFull = pVar.K;
                    arrayList2.add(o41.d(ls.Y1, R.drawable.msg_admins, N0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String N02 = hd.N0(2131751883, null);
                    TLRPC.ChatFull chatFull2 = pVar.K;
                    arrayList2.add(o41.d(ls.Z1, R.drawable.community_requests_outline_24, N02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String N03 = hd.N0(2131751869, null);
                    TLRPC.ChatFull chatFull3 = pVar.K;
                    arrayList2.add(o41.d(ls.a2, R.drawable.msg_user_remove, N03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(o41.E(5, org.telegram.messenger.g0.L(14.0f)));
                o41 c11 = o41.c(ls.c2, R.drawable.msg_groups_create, hd.N0(2131751906, null));
                c11.r = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = pVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(o41.w(pVar.getMessagesController().g2(n5.o(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
