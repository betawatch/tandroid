package li;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ h(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatPhoto chatPhoto;
        int i7 = this.a;
        int i10 = 0;
        n nVar = this.b;
        switch (i7) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                nVar.getClass();
                if (tL_error != null) {
                    cc.a0(nVar).f0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(b41.l(ns.W1, nVar.s));
                if (t3.y(1, nVar.J)) {
                    TLRPC.Chat chat = nVar.J;
                    b41 c10 = b41.c(ns.X1, R.drawable.outline_profile_photo, hd.M0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751851 : 2131751852, null));
                    c10.q = true;
                    arrayList2.add(c10);
                    arrayList2.add(b41.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(b41.t(0, hd.M0(2131751874, null)));
                    arrayList2.add(b41.j(7, nVar.r));
                    arrayList2.add(b41.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.w(2, nVar.J)) {
                    arrayList2.add(b41.t(3, hd.M0(2131751872, null)));
                    b41 y10 = b41.y(ns.g2, hd.M0(2131751843, null), hd.M0(2131751842, null));
                    y10.L(nVar.n);
                    arrayList2.add(y10);
                    b41 y11 = b41.y(ns.h2, hd.M0(2131751841, null), hd.M0(2131751840, null));
                    y11.L(!nVar.n);
                    arrayList2.add(y11);
                    arrayList2.add(b41.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.N(nVar.J)) {
                    String M0 = hd.M0(2131751965, null);
                    TLRPC.ChatFull chatFull = nVar.K;
                    arrayList2.add(b41.d(ns.Y1, R.drawable.msg_admins, M0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String M02 = hd.M0(2131751895, null);
                    TLRPC.ChatFull chatFull2 = nVar.K;
                    arrayList2.add(b41.d(ns.Z1, R.drawable.community_requests_outline_24, M02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String M03 = hd.M0(2131751881, null);
                    TLRPC.ChatFull chatFull3 = nVar.K;
                    arrayList2.add(b41.d(ns.a2, R.drawable.msg_user_remove, M03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(b41.E(5, org.telegram.messenger.g0.L(14.0f)));
                b41 c11 = b41.c(ns.c2, R.drawable.msg_groups_create, hd.M0(2131751918, null));
                c11.q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = nVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(b41.w(nVar.getMessagesController().e2(m5.o(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
