package li;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n5;
import org.telegram.messenger.q10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ j(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // org.telegram.messenger.q10
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
                arrayList2.add(l41.l(ks.W1, pVar.s));
                if (v3.y(1, pVar.J)) {
                    TLRPC.Chat chat = pVar.J;
                    l41 c10 = l41.c(ks.X1, R.drawable.outline_profile_photo, gd.M0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751840 : 2131751841, null));
                    c10.r = true;
                    arrayList2.add(c10);
                    arrayList2.add(l41.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(l41.t(0, gd.M0(2131751863, null)));
                    arrayList2.add(l41.j(7, pVar.r));
                    arrayList2.add(l41.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.w(2, pVar.J)) {
                    arrayList2.add(l41.t(3, gd.M0(2131751861, null)));
                    l41 y10 = l41.y(ks.g2, gd.M0(2131751832, null), gd.M0(2131751831, null));
                    y10.L(pVar.n);
                    arrayList2.add(y10);
                    l41 y11 = l41.y(ks.h2, gd.M0(2131751830, null), gd.M0(2131751829, null));
                    y11.L(!pVar.n);
                    arrayList2.add(y11);
                    arrayList2.add(l41.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (v3.N(pVar.J)) {
                    String M0 = gd.M0(2131751954, null);
                    TLRPC.ChatFull chatFull = pVar.K;
                    arrayList2.add(l41.d(ks.Y1, R.drawable.msg_admins, M0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String M02 = gd.M0(2131751884, null);
                    TLRPC.ChatFull chatFull2 = pVar.K;
                    arrayList2.add(l41.d(ks.Z1, R.drawable.community_requests_outline_24, M02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String M03 = gd.M0(2131751870, null);
                    TLRPC.ChatFull chatFull3 = pVar.K;
                    arrayList2.add(l41.d(ks.a2, R.drawable.msg_user_remove, M03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(l41.E(5, org.telegram.messenger.g0.L(14.0f)));
                l41 c11 = l41.c(ks.c2, R.drawable.msg_groups_create, gd.M0(2131751907, null));
                c11.r = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = pVar.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(l41.w(pVar.getMessagesController().g2(n5.o(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
