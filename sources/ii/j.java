package ii;

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ j(p pVar, int i7) {
        this.a = i7;
        this.b = pVar;
    }

    @Override // org.telegram.messenger.v10
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
                    gc.a0(pVar).f0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(x31.l(qs.W1, pVar.s));
                if (t3.y(1, pVar.I)) {
                    TLRPC.Chat chat = pVar.I;
                    x31 c10 = x31.c(qs.X1, R.drawable.outline_profile_photo, id.M0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751851 : 2131751852, null));
                    c10.q = true;
                    arrayList2.add(c10);
                    arrayList2.add(x31.E(2, org.telegram.messenger.g0.L(14.0f)));
                    arrayList2.add(x31.t(0, id.M0(2131751874, null)));
                    arrayList2.add(x31.j(7, pVar.r));
                    arrayList2.add(x31.E(1, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.w(2, pVar.I)) {
                    arrayList2.add(x31.t(3, id.M0(2131751872, null)));
                    x31 y10 = x31.y(qs.g2, id.M0(2131751843, null), id.M0(2131751842, null));
                    y10.L(pVar.n);
                    arrayList2.add(y10);
                    x31 y11 = x31.y(qs.h2, id.M0(2131751841, null), id.M0(2131751840, null));
                    y11.L(!pVar.n);
                    arrayList2.add(y11);
                    arrayList2.add(x31.E(4, org.telegram.messenger.g0.L(14.0f)));
                }
                if (t3.N(pVar.I)) {
                    String M0 = id.M0(2131751965, null);
                    TLRPC.ChatFull chatFull = pVar.J;
                    arrayList2.add(x31.d(qs.Y1, R.drawable.msg_admins, M0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String M02 = id.M0(2131751895, null);
                    TLRPC.ChatFull chatFull2 = pVar.J;
                    arrayList2.add(x31.d(qs.Z1, R.drawable.community_requests_outline_24, M02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String M03 = id.M0(2131751881, null);
                    TLRPC.ChatFull chatFull3 = pVar.J;
                    arrayList2.add(x31.d(qs.a2, R.drawable.msg_user_remove, M03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(x31.E(5, org.telegram.messenger.g0.L(14.0f)));
                x31 c11 = x31.c(qs.c2, R.drawable.msg_groups_create, id.M0(2131751918, null));
                c11.q = true;
                arrayList2.add(c11);
                TLRPC.ChatFull chatFull4 = pVar.J;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                        i10++;
                        arrayList2.add(x31.w(pVar.getMessagesController().e2(m5.o(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
