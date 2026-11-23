package li;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n5;
import org.telegram.messenger.p10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ i(o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = this.a;
        int i10 = 0;
        o oVar = this.b;
        switch (i7) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                oVar.getClass();
                if (tL_error != null) {
                    kc.b0(oVar).g0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(n41.l(ks.W1, oVar.s));
                if (v3.y(1, oVar.J)) {
                    TLRPC.Chat chat = oVar.J;
                    n41 c10 = n41.c(ks.X1, R.drawable.outline_profile_photo, gd.N0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751839 : 2131751840, null));
                    c10.r = true;
                    arrayList2.add(c10);
                    arrayList2.add(n41.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(n41.t(0, gd.N0(2131751862, null)));
                    arrayList2.add(n41.j(7, oVar.r));
                    arrayList2.add(n41.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.w(2, oVar.J)) {
                    arrayList2.add(n41.t(3, gd.N0(2131751860, null)));
                    n41 y10 = n41.y(ks.g2, gd.N0(2131751831, null), gd.N0(2131751830, null));
                    y10.L(oVar.n);
                    arrayList2.add(y10);
                    n41 y11 = n41.y(ks.h2, gd.N0(2131751829, null), gd.N0(2131751828, null));
                    y11.L(!oVar.n);
                    arrayList2.add(y11);
                    arrayList2.add(n41.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.N(oVar.J)) {
                    String N0 = gd.N0(2131751953, null);
                    TLRPC.ChatFull chatFull = oVar.K;
                    arrayList2.add(n41.d(ks.Y1, R.drawable.msg_admins, N0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String N02 = gd.N0(2131751883, null);
                    TLRPC.ChatFull chatFull2 = oVar.K;
                    arrayList2.add(n41.d(ks.Z1, R.drawable.community_requests_outline_24, N02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String N03 = gd.N0(2131751869, null);
                    TLRPC.ChatFull chatFull3 = oVar.K;
                    arrayList2.add(n41.d(ks.a2, R.drawable.msg_user_remove, N03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(n41.E(5, org.telegram.messenger.g0.L(14.0f)));
                n41 c11 = n41.c(ks.c2, R.drawable.msg_groups_create, gd.N0(2131751906, null));
                c11.r = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = oVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(n41.w(oVar.getMessagesController().g2(n5.o(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
