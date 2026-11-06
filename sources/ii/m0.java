package ii;

import android.text.SpannableStringBuilder;
import bi.v0;
import c8.zc;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.ml;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public abstract class m0 {
    public static SpannableStringBuilder a(ij ijVar, String str, String str2, boolean z9, boolean z10) {
        TLRPC.Message message = ijVar.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z11 = m5.o(message.peer_id) == m5.o(message.from_id);
        boolean z12 = tL_messageActionChangeCommunity.community_id == 0;
        if (z11) {
            if (z12) {
                return org.telegram.messenger.g0.X2(hd.M0(z10 ? 2131751868 : z9 ? 2131751862 : 2131751856, null));
            }
            return org.telegram.messenger.g0.X2(hd.a0(null, null, z10 ? 2131751870 : z9 ? 2131751864 : 2131751858, str));
        }
        if (ijVar.O3()) {
            if (z12) {
                return org.telegram.messenger.g0.X2(hd.M0(z10 ? 2131751866 : z9 ? 2131751860 : 2131751854, null));
            }
            return org.telegram.messenger.g0.X2(hd.a0(null, null, z10 ? 2131751867 : z9 ? 2131751861 : 2131751855, str));
        }
        if (z12) {
            return org.telegram.messenger.g0.X2(hd.a0(null, null, z10 ? 2131751869 : z9 ? 2131751863 : 2131751857, str2));
        }
        return org.telegram.messenger.g0.X2(hd.a0(null, null, z10 ? 2131751871 : z9 ? 2131751865 : 2131751859, str2, str));
    }

    public static int b(int i7, long j3) {
        TLRPC.Chat M0;
        long j10;
        TLRPC.User user;
        TLRPC.ChatFull N0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j3 > 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            if (a22 == null) {
                return 0;
            }
            j10 = a22.linked_community_id;
            user = a22;
            M0 = null;
        } else {
            M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            if (M0 == null) {
                return 0;
            }
            j10 = M0.linked_community_id;
            user = null;
        }
        if (j10 != 0 && (N0 = qp.s1(i7).N0(j10)) != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (m5.o(communityPeer2.peer) == j3) {
                    return c(M0, user != null ? qp.s1(i7).S0(user.id) : null, user, communityPeer2);
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
            if (!t3.j0(chat)) {
                if (t3.t0(chat) || communityPeer.can_view_history) {
                    return 2;
                }
                return (!zc.a(communityPeer.flags, 1) || communityPeer.visible) ? 3 : 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(f2 f2Var, long j3, int i7) {
        q4 q4Var;
        an anVar;
        int i10;
        List list = null;
        if (org.telegram.messenger.g0.Q1()) {
            q4Var = null;
            anVar = null;
        } else {
            q4Var = f2Var.getParentLayout();
            if (q4Var != null) {
                List fragmentStack = q4Var.getFragmentStack();
                i10 = fragmentStack.size() - 2;
                while (true) {
                    if (i10 < 0) {
                        anVar = null;
                        i10 = -1;
                        break;
                    }
                    f2 f2Var2 = (f2) fragmentStack.get(i10);
                    if (f2Var2 instanceof an) {
                        anVar = (an) f2Var2;
                        if (anVar.a() == j3) {
                            break;
                        }
                    }
                    i10--;
                }
                list = fragmentStack;
                boolean U = t3.U(f2Var.getCurrentAccount(), j3);
                if (i10 != -1) {
                    if (!(f2Var instanceof ww)) {
                        f2Var.finishFragment();
                    }
                    f(hc.X(), i7, U);
                    return;
                }
                for (int size = list.size() - 2; size > i10; size--) {
                    ((ActionBarLayout) q4Var).d0((f2) list.get(size), false);
                }
                f2Var.finishFragment();
                org.telegram.messenger.g0.i3(new h0(i7, anVar, U), 250L);
                return;
            }
            anVar = null;
        }
        i10 = -1;
        boolean U2 = t3.U(f2Var.getCurrentAccount(), j3);
        if (i10 != -1) {
        }
    }

    public static void e(u1[] u1VarArr, f2 f2Var, int i7, TLRPC.Chat chat) {
        if (u1VarArr[0] != null) {
            return;
        }
        qp s12 = qp.s1(i7);
        v0 v0Var = new v0(u1VarArr, f2Var, i7, chat);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new d3.b(1), new ml(s12, v0Var, 0));
        ConnectionsManager.getInstance(i7).bindRequestToGuid(sendRequestTyped, f2Var.getClassGuid());
        u1 u1Var = new u1(3, f2Var.getContext(), null);
        u1VarArr[0] = u1Var;
        u1Var.r(500L);
        u1VarArr[0].setOnCancelListener(new e0(i7, sendRequestTyped, u1VarArr, 0));
    }

    public static void f(hc hcVar, int i7, boolean z9) {
        String M0;
        int i10 = i7 == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i11 = i7 == 2 ? 24 : 36;
        if (i7 == 0) {
            M0 = hd.M0(2131751943, null);
        } else if (i7 == 1) {
            M0 = hd.M0(z9 ? 2131751942 : 2131751941, null);
        } else {
            M0 = hd.M0(2131751940, null);
        }
        hcVar.G(i10, i11, M0).j();
    }
}
