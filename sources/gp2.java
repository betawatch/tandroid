// default package

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class gp2 {
    public static SpannableStringBuilder a(r47 r47Var, String str, String str2, boolean z, boolean z2) {
        TLRPC.Message message = r47Var.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z3 = wf3.n(message.peer_id) == wf3.n(message.from_id);
        boolean z4 = tL_messageActionChangeCommunity.community_id == 0;
        if (z3) {
            if (z4) {
                return hl.S2(ob6.M0(z2 ? 2131751833 : z ? 2131751827 : 2131751821, null));
            }
            return hl.S2(ob6.a0(null, null, z2 ? 2131751835 : z ? 2131751829 : 2131751823, str));
        }
        if (r47Var.N3()) {
            if (z4) {
                return hl.S2(ob6.M0(z2 ? 2131751831 : z ? 2131751825 : 2131751819, null));
            }
            return hl.S2(ob6.a0(null, null, z2 ? 2131751832 : z ? 2131751826 : 2131751820, str));
        }
        if (z4) {
            return hl.S2(ob6.a0(null, null, z2 ? 2131751834 : z ? 2131751828 : 2131751822, str2));
        }
        return hl.S2(ob6.a0(null, null, z2 ? 2131751836 : z ? 2131751830 : 2131751824, str2, str));
    }

    public static int b(int i, long j) {
        TLRPC.Chat M0;
        long j2;
        TLRPC.User user;
        TLRPC.ChatFull N0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            if (X1 == null) {
                return 0;
            }
            j2 = X1.linked_community_id;
            user = X1;
            M0 = null;
        } else {
            M0 = uc7.s1(i).M0(Long.valueOf(-j));
            if (M0 == null) {
                return 0;
            }
            j2 = M0.linked_community_id;
            user = null;
        }
        if (j2 != 0 && (N0 = uc7.s1(i).N0(j2)) != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (wf3.n(communityPeer2.peer) == j) {
                    return c(M0, user != null ? uc7.s1(i).S0(user.id) : null, user, communityPeer2);
                }
            }
        }
        return 0;
    }

    public static int c(TLRPC.Chat chat, TLRPC.Dialog dialog, TLRPC.User user, TL_communities.CommunityPeer communityPeer) {
        if (user != null) {
            if (dialog == null) {
                return 2;
            }
        } else {
            if (chat == null) {
                return 0;
            }
            if (!xc2.j0(chat)) {
                if (xc2.t0(chat) || communityPeer.can_view_history) {
                    return 2;
                }
                return (!vsd.a(communityPeer.flags, 1) || communityPeer.visible) ? 3 : 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(int i, long j, e eVar) {
        wk5 wk5Var;
        zu1 zu1Var;
        int i2;
        List list = null;
        if (hl.O1()) {
            wk5Var = null;
            zu1Var = null;
        } else {
            wk5Var = eVar.getParentLayout();
            if (wk5Var != null) {
                List fragmentStack = wk5Var.getFragmentStack();
                i2 = fragmentStack.size() - 2;
                while (true) {
                    if (i2 < 0) {
                        zu1Var = null;
                        i2 = -1;
                        break;
                    }
                    e eVar2 = (e) fragmentStack.get(i2);
                    if (eVar2 instanceof zu1) {
                        zu1Var = (zu1) eVar2;
                        if (zu1Var.a() == j) {
                            break;
                        }
                    }
                    i2--;
                }
                list = fragmentStack;
                boolean U = xc2.U(eVar.getCurrentAccount(), j);
                if (i2 != -1) {
                    if (!(eVar instanceof uj3)) {
                        eVar.finishFragment();
                    }
                    f(d31.Y(), i, U);
                    return;
                }
                for (int size = list.size() - 2; size > i2; size--) {
                    ((ActionBarLayout) wk5Var).c0((e) list.get(size), false);
                }
                eVar.finishFragment();
                hl.d3(new ap1(i, zu1Var, U), 250L);
                return;
            }
            zu1Var = null;
        }
        i2 = -1;
        boolean U2 = xc2.U(eVar.getCurrentAccount(), j);
        if (i2 != -1) {
        }
    }

    public static void e(id[] idVarArr, e eVar, int i, TLRPC.Chat chat) {
        byte b = 0;
        if (idVarArr[0] != null) {
            return;
        }
        uc7 s1 = uc7.s1(i);
        f fVar = new f((Object) idVarArr, (Object) eVar, i, (Object) chat, (byte) 5);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = s1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new ic((byte) 0), new qe2(s1, fVar, (byte) 28));
        ConnectionsManager.getInstance(i).bindRequestToGuid(sendRequestTyped, eVar.getClassGuid());
        id idVar = new id(3, null, eVar.getContext());
        idVarArr[0] = idVar;
        idVar.q(500L);
        idVarArr[0].setOnCancelListener(new yo2(i, sendRequestTyped, idVarArr, b));
    }

    public static void f(d31 d31Var, int i, boolean z) {
        int i2;
        int i3;
        String M0;
        if (i == 2) {
            i2 = R.raw.timer_toast;
            i3 = 24;
        } else {
            i2 = R.raw.contact_check;
            i3 = 36;
        }
        if (i == 0) {
            M0 = ob6.M0(2131751908, null);
        } else if (i == 1) {
            M0 = ob6.M0(z ? 2131751907 : 2131751906, null);
        } else {
            M0 = ob6.M0(2131751905, null);
        }
        d31Var.G(i2, i3, M0).j();
    }
}
