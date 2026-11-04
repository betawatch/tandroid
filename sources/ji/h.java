package ji;

import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.m5;
import org.telegram.messenger.n10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ h(n nVar, int i3) {
        this.a = i3;
        this.b = nVar;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatPhoto chatPhoto;
        int i3 = this.a;
        int i10 = 0;
        n nVar = this.b;
        switch (i3) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                nVar.getClass();
                if (tL_error != null) {
                    fc.a0(nVar).f0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(r31.l(hs.W1, nVar.s));
                if (t3.y(1, nVar.J)) {
                    TLRPC.Chat chat = nVar.J;
                    r31 c2 = r31.c(hs.X1, R.drawable.outline_profile_photo, bd.M0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751851 : 2131751852, null));
                    c2.q = true;
                    arrayList2.add(c2);
                    arrayList2.add(r31.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(r31.t(0, bd.M0(2131751874, null)));
                    arrayList2.add(r31.j(7, nVar.r));
                    arrayList2.add(r31.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.w(2, nVar.J)) {
                    arrayList2.add(r31.t(3, bd.M0(2131751872, null)));
                    r31 y9 = r31.y(hs.g2, bd.M0(2131751843, null), bd.M0(2131751842, null));
                    y9.L(nVar.n);
                    arrayList2.add(y9);
                    r31 y10 = r31.y(hs.h2, bd.M0(2131751841, null), bd.M0(2131751840, null));
                    y10.L(!nVar.n);
                    arrayList2.add(y10);
                    arrayList2.add(r31.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.N(nVar.J)) {
                    String M0 = bd.M0(2131751965, null);
                    TLRPC.ChatFull chatFull = nVar.K;
                    arrayList2.add(r31.d(hs.Y1, R.drawable.msg_admins, M0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String M02 = bd.M0(2131751895, null);
                    TLRPC.ChatFull chatFull2 = nVar.K;
                    arrayList2.add(r31.d(hs.Z1, R.drawable.community_requests_outline_24, M02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String M03 = bd.M0(2131751881, null);
                    TLRPC.ChatFull chatFull3 = nVar.K;
                    arrayList2.add(r31.d(hs.a2, R.drawable.msg_user_remove, M03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(r31.E(5, org.telegram.messenger.g0.L(14.0f)));
                r31 c10 = r31.c(hs.c2, R.drawable.msg_groups_create, bd.M0(2131751918, null));
                c10.q = true;
                arrayList2.add(c10);
                TLRPC.ChatFull chatFull4 = nVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(r31.w(nVar.getMessagesController().e2(m5.o(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
