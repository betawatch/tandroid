package li;

import android.text.SpannableStringBuilder;
import c8.ed;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.fl;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class k0 {
    public static SpannableStringBuilder a(fj fjVar, String str, String str2, boolean z10, boolean z11) {
        TLRPC.Message message = fjVar.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z12 = n5.o(message.peer_id) == n5.o(message.from_id);
        boolean z13 = tL_messageActionChangeCommunity.community_id == 0;
        if (z12) {
            if (z13) {
                return org.telegram.messenger.g0.W2(gd.N0(z11 ? 2131751856 : z10 ? 2131751850 : 2131751844, null));
            }
            return org.telegram.messenger.g0.W2(gd.a0(null, null, z11 ? 2131751858 : z10 ? 2131751852 : 2131751846, str));
        }
        if (fjVar.N3()) {
            if (z13) {
                return org.telegram.messenger.g0.W2(gd.N0(z11 ? 2131751854 : z10 ? 2131751848 : 2131751842, null));
            }
            return org.telegram.messenger.g0.W2(gd.a0(null, null, z11 ? 2131751855 : z10 ? 2131751849 : 2131751843, str));
        }
        if (z13) {
            return org.telegram.messenger.g0.W2(gd.a0(null, null, z11 ? 2131751857 : z10 ? 2131751851 : 2131751845, str2));
        }
        return org.telegram.messenger.g0.W2(gd.a0(null, null, z11 ? 2131751859 : z10 ? 2131751853 : 2131751847, str2, str));
    }

    public static int b(int i7, long j3) {
        TLRPC.Chat O0;
        long j10;
        TLRPC.User user;
        TLRPC.ChatFull P0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j3 > 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
            if (c22 == null) {
                return 0;
            }
            j10 = c22.linked_community_id;
            user = c22;
            O0 = null;
        } else {
            O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            if (O0 == null) {
                return 0;
            }
            j10 = O0.linked_community_id;
            user = null;
        }
        if (j10 != 0 && (P0 = mp.u1(i7).P0(j10)) != null && (arrayList = P0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (n5.o(communityPeer2.peer) == j3) {
                    return c(O0, user != null ? mp.u1(i7).U0(user.id) : null, user, communityPeer2);
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
            if (!v3.j0(chat)) {
                if (v3.t0(chat) || communityPeer.can_view_history) {
                    return 2;
                }
                return (!ed.a(communityPeer.flags, 1) || communityPeer.visible) ? 3 : 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(int i7, long j3, g2 g2Var) {
        r4 r4Var;
        bn bnVar;
        int i10;
        List list = null;
        if (org.telegram.messenger.g0.Q1()) {
            r4Var = null;
            bnVar = null;
        } else {
            r4Var = g2Var.getParentLayout();
            if (r4Var != null) {
                List fragmentStack = r4Var.getFragmentStack();
                i10 = fragmentStack.size() - 2;
                while (true) {
                    if (i10 < 0) {
                        bnVar = null;
                        i10 = -1;
                        break;
                    }
                    g2 g2Var2 = (g2) fragmentStack.get(i10);
                    if (g2Var2 instanceof bn) {
                        bnVar = (bn) g2Var2;
                        if (bnVar.a() == j3) {
                            break;
                        }
                    }
                    i10--;
                }
                list = fragmentStack;
                boolean U = v3.U(g2Var.getCurrentAccount(), j3);
                if (i10 != -1) {
                    if (!(g2Var instanceof bx)) {
                        g2Var.finishFragment();
                    }
                    f(kc.Y(), i7, U);
                    return;
                }
                for (int size = list.size() - 2; size > i10; size--) {
                    ((ActionBarLayout) r4Var).d0((g2) list.get(size), false);
                }
                g2Var.finishFragment();
                org.telegram.messenger.g0.h3(new f0(i7, bnVar, U), 250L);
                return;
            }
            bnVar = null;
        }
        i10 = -1;
        boolean U2 = v3.U(g2Var.getCurrentAccount(), j3);
        if (i10 != -1) {
        }
    }

    public static void e(t1[] t1VarArr, g2 g2Var, int i7, TLRPC.Chat chat) {
        if (t1VarArr[0] != null) {
            return;
        }
        mp u12 = mp.u1(i7);
        di.j0 j0Var = new di.j0(t1VarArr, g2Var, i7, chat);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = u12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new fl(u12, j0Var, 0));
        ConnectionsManager.getInstance(i7).bindRequestToGuid(sendRequestTyped, g2Var.getClassGuid());
        t1 t1Var = new t1(3, g2Var.getContext(), null);
        t1VarArr[0] = t1Var;
        t1Var.r(500L);
        t1VarArr[0].setOnCancelListener(new d0(i7, sendRequestTyped, t1VarArr, 0));
    }

    public static void f(kc kcVar, int i7, boolean z10) {
        String N0;
        int i10 = i7 == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i11 = i7 == 2 ? 24 : 36;
        if (i7 == 0) {
            N0 = gd.N0(2131751931, null);
        } else if (i7 == 1) {
            N0 = gd.N0(z10 ? 2131751930 : 2131751929, null);
        } else {
            N0 = gd.N0(2131751928, null);
        }
        kcVar.G(i10, i11, N0).j();
    }
}
