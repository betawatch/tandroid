package ji;

import android.text.SpannableStringBuilder;
import ci.o0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cl;
import org.telegram.messenger.hp;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.fc;
import org.telegram.ui.uw;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class j0 {
    public static SpannableStringBuilder a(zi ziVar, String str, String str2, boolean z10, boolean z11) {
        TLRPC.Message message = ziVar.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z12 = m5.o(message.peer_id) == m5.o(message.from_id);
        boolean z13 = tL_messageActionChangeCommunity.community_id == 0;
        if (z12) {
            if (z13) {
                return org.telegram.messenger.g0.X2(bd.M0(z11 ? 2131751868 : z10 ? 2131751862 : 2131751856, null));
            }
            return org.telegram.messenger.g0.X2(bd.a0(null, null, z11 ? 2131751870 : z10 ? 2131751864 : 2131751858, str));
        }
        if (ziVar.O3()) {
            if (z13) {
                return org.telegram.messenger.g0.X2(bd.M0(z11 ? 2131751866 : z10 ? 2131751860 : 2131751854, null));
            }
            return org.telegram.messenger.g0.X2(bd.a0(null, null, z11 ? 2131751867 : z10 ? 2131751861 : 2131751855, str));
        }
        if (z13) {
            return org.telegram.messenger.g0.X2(bd.a0(null, null, z11 ? 2131751869 : z10 ? 2131751863 : 2131751857, str2));
        }
        return org.telegram.messenger.g0.X2(bd.a0(null, null, z11 ? 2131751871 : z10 ? 2131751865 : 2131751859, str2, str));
    }

    public static int b(int i3, long j10) {
        TLRPC.Chat M0;
        long j11;
        TLRPC.User user;
        TLRPC.ChatFull N0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j10 > 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            if (a22 == null) {
                return 0;
            }
            j11 = a22.linked_community_id;
            user = a22;
            M0 = null;
        } else {
            M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            if (M0 == null) {
                return 0;
            }
            j11 = M0.linked_community_id;
            user = null;
        }
        if (j11 != 0 && (N0 = hp.s1(i3).N0(j11)) != null && (arrayList = N0.linked_peers) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i10);
                i10++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (m5.o(communityPeer2.peer) == j10) {
                    return c(M0, user != null ? hp.s1(i3).S0(user.id) : null, user, communityPeer2);
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
                return (!x7.u.a(communityPeer.flags, 1) || communityPeer.visible) ? 3 : 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(d2 d2Var, long j10, int i3) {
        q4 q4Var;
        wm wmVar;
        int i10;
        List list = null;
        if (org.telegram.messenger.g0.Q1()) {
            q4Var = null;
            wmVar = null;
        } else {
            q4Var = d2Var.getParentLayout();
            if (q4Var != null) {
                List fragmentStack = q4Var.getFragmentStack();
                i10 = fragmentStack.size() - 2;
                while (true) {
                    if (i10 < 0) {
                        wmVar = null;
                        i10 = -1;
                        break;
                    }
                    d2 d2Var2 = (d2) fragmentStack.get(i10);
                    if (d2Var2 instanceof wm) {
                        wmVar = (wm) d2Var2;
                        if (wmVar.a() == j10) {
                            break;
                        }
                    }
                    i10--;
                }
                list = fragmentStack;
                boolean U = t3.U(d2Var.getCurrentAccount(), j10);
                if (i10 != -1) {
                    if (!(d2Var instanceof uw)) {
                        d2Var.finishFragment();
                    }
                    f(fc.X(), i3, U);
                    return;
                }
                for (int size = list.size() - 2; size > i10; size--) {
                    ((ActionBarLayout) q4Var).d0((d2) list.get(size), false);
                }
                d2Var.finishFragment();
                org.telegram.messenger.g0.i3(new e0(i3, wmVar, U), 250L);
                return;
            }
            wmVar = null;
        }
        i10 = -1;
        boolean U2 = t3.U(d2Var.getCurrentAccount(), j10);
        if (i10 != -1) {
        }
    }

    public static void e(s1[] s1VarArr, d2 d2Var, int i3, TLRPC.Chat chat) {
        if (s1VarArr[0] != null) {
            return;
        }
        hp s12 = hp.s1(i3);
        o0 o0Var = new o0(s1VarArr, d2Var, i3, chat);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = s12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new c3.b(1), new cl(s12, o0Var, 0));
        ConnectionsManager.getInstance(i3).bindRequestToGuid(sendRequestTyped, d2Var.getClassGuid());
        s1 s1Var = new s1(3, d2Var.getContext(), null);
        s1VarArr[0] = s1Var;
        s1Var.r(500L);
        s1VarArr[0].setOnCancelListener(new c0(i3, sendRequestTyped, s1VarArr, 0));
    }

    public static void f(fc fcVar, int i3, boolean z10) {
        String M0;
        int i10 = i3 == 2 ? R.raw.timer_toast : R.raw.contact_check;
        int i11 = i3 == 2 ? 24 : 36;
        if (i3 == 0) {
            M0 = bd.M0(2131751943, null);
        } else if (i3 == 1) {
            M0 = bd.M0(z10 ? 2131751942 : 2131751941, null);
        } else {
            M0 = bd.M0(2131751940, null);
        }
        fcVar.G(i10, i11, M0).j();
    }
}
