// default package

import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lo2 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ po2 b;

    public /* synthetic */ lo2(po2 po2Var, byte b) {
        this.a = b;
        this.b = po2Var;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        ArrayList<TL_communities.CommunityPeer> arrayList;
        TLRPC.ChatPhoto chatPhoto;
        byte b = this.a;
        int i = 0;
        po2 po2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    c41.b0(po2Var).g0(tL_error, false);
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(c6c.l(nm7.V1, po2Var.s));
                if (sd2.y(1, po2Var.J)) {
                    TLRPC.Chat chat = po2Var.J;
                    c6c c = c6c.c(nm7.W1, R.drawable.outline_profile_photo, jb6.M0((chat == null || (chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty)) ? 2131751788 : 2131751789, null));
                    c.r = true;
                    arrayList2.add(c);
                    arrayList2.add(c6c.E(2, gm.L(14.0f)));
                    arrayList2.add(c6c.t(0, jb6.M0(2131751811, null)));
                    arrayList2.add(c6c.j(7, po2Var.r));
                    arrayList2.add(c6c.E(1, gm.L(14.0f)));
                }
                if (sd2.w(2, po2Var.J)) {
                    arrayList2.add(c6c.t(3, jb6.M0(2131751809, null)));
                    c6c y = c6c.y(nm7.f2, jb6.M0(2131751780, null), jb6.M0(2131751779, null));
                    y.L(po2Var.n);
                    arrayList2.add(y);
                    c6c y2 = c6c.y(nm7.g2, jb6.M0(2131751778, null), jb6.M0(2131751777, null));
                    y2.L(!po2Var.n);
                    arrayList2.add(y2);
                    arrayList2.add(c6c.E(4, gm.L(14.0f)));
                }
                if (sd2.N(po2Var.J)) {
                    String M0 = jb6.M0(2131751902, null);
                    TLRPC.ChatFull chatFull = po2Var.K;
                    arrayList2.add(c6c.d(nm7.X1, R.drawable.msg_admins, M0, chatFull != null ? Integer.toString(chatFull.admins_count) : ""));
                    String M02 = jb6.M0(2131751832, null);
                    TLRPC.ChatFull chatFull2 = po2Var.K;
                    arrayList2.add(c6c.d(nm7.Y1, R.drawable.community_requests_outline_24, M02, chatFull2 != null ? Integer.toString(chatFull2.requests_pending) : ""));
                    String M03 = jb6.M0(2131751818, null);
                    TLRPC.ChatFull chatFull3 = po2Var.K;
                    arrayList2.add(c6c.d(nm7.Z1, R.drawable.msg_user_remove, M03, chatFull3 != null ? Integer.toString(chatFull3.kicked_count) : ""));
                }
                arrayList2.add(c6c.E(5, gm.L(14.0f)));
                c6c c2 = c6c.c(nm7.b2, R.drawable.msg_groups_create, jb6.M0(2131751855, null));
                c2.r = true;
                arrayList2.add(c2);
                TLRPC.ChatFull chatFull4 = po2Var.K;
                if (chatFull4 != null && (arrayList = chatFull4.linked_peers) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        TL_communities.CommunityPeer communityPeer = arrayList.get(i);
                        i++;
                        arrayList2.add(c6c.w(po2Var.getMessagesController().a2(pg3.n(communityPeer.peer))));
                    }
                    break;
                }
                break;
        }
    }
}
