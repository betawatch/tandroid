// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class an2 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ en2 b;

    public /* synthetic */ an2(en2 en2Var, byte b) {
        this.a = b;
        this.b = en2Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatPhoto chatPhoto;
        byte b = this.a;
        int i = 0;
        en2 en2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    u21.b0(en2Var).g0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(c4c.l(kk7.V1, en2Var.s));
                if (hc2.y(1, en2Var.J)) {
                    TLRPC.Chat chat = en2Var.J;
                    c4c c = c4c.c(kk7.W1, R.drawable.outline_profile_photo, k96.M0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751839 : 2131751840, null));
                    c.r = true;
                    arrayList2.add(c);
                    arrayList2.add(c4c.E(2, gl.L(14.0f)));
                    arrayList2.add(c4c.t(0, k96.M0(2131751862, null)));
                    arrayList2.add(c4c.j(7, en2Var.r));
                    arrayList2.add(c4c.E(1, gl.L(14.0f)));
                }
                if (hc2.w(2, en2Var.J)) {
                    arrayList2.add(c4c.t(3, k96.M0(2131751860, null)));
                    c4c y = c4c.y(kk7.f2, k96.M0(2131751831, null), k96.M0(2131751830, null));
                    y.L(en2Var.n);
                    arrayList2.add(y);
                    c4c y2 = c4c.y(kk7.g2, k96.M0(2131751829, null), k96.M0(2131751828, null));
                    y2.L(!en2Var.n);
                    arrayList2.add(y2);
                    arrayList2.add(c4c.E(4, gl.L(14.0f)));
                }
                if (hc2.N(en2Var.J)) {
                    String M0 = k96.M0(2131751953, null);
                    TLRPC.ChatFull chatFull = en2Var.K;
                    arrayList2.add(c4c.d(kk7.X1, R.drawable.msg_admins, M0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String M02 = k96.M0(2131751883, null);
                    TLRPC.ChatFull chatFull2 = en2Var.K;
                    arrayList2.add(c4c.d(kk7.Y1, R.drawable.community_requests_outline_24, M02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String M03 = k96.M0(2131751869, null);
                    TLRPC.ChatFull chatFull3 = en2Var.K;
                    arrayList2.add(c4c.d(kk7.Z1, R.drawable.msg_user_remove, M03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(c4c.E(5, gl.L(14.0f)));
                c4c c2 = c4c.c(kk7.b2, R.drawable.msg_groups_create, k96.M0(2131751906, null));
                c2.r = true;
                arrayList2.add(c2);
                TLRPC.ChatFull chatFull4 = en2Var.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i);
                        i++;
                        arrayList2.add(c4c.w(en2Var.getMessagesController().Z1(cf3.n(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
