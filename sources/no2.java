// default package

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class no2 {
    public static SpannableStringBuilder a(k27 k27Var, String str, String str2, boolean z, boolean z2) {
        TLRPC.Message message = k27Var.k;
        TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message.action;
        boolean z3 = cf3.n(message.peer_id) == cf3.n(message.from_id);
        boolean z4 = tL_messageActionChangeCommunity.community_id == 0;
        if (z3) {
            if (z4) {
                return gl.S2(k96.M0(z2 ? 2131751856 : z ? 2131751850 : 2131751844, null));
            }
            return gl.S2(k96.a0(null, null, z2 ? 2131751858 : z ? 2131751852 : 2131751846, str));
        }
        if (k27Var.N3()) {
            if (z4) {
                return gl.S2(k96.M0(z2 ? 2131751854 : z ? 2131751848 : 2131751842, null));
            }
            return gl.S2(k96.a0(null, null, z2 ? 2131751855 : z ? 2131751849 : 2131751843, str));
        }
        if (z4) {
            return gl.S2(k96.a0(null, null, z2 ? 2131751857 : z ? 2131751851 : 2131751845, str2));
        }
        return gl.S2(k96.a0(null, null, z2 ? 2131751859 : z ? 2131751853 : 2131751847, str2, str));
    }

    public static int b(int i, long j) {
        TLRPC.Chat K0;
        long j2;
        TLRPC.User user;
        TLRPC.ChatFull L0;
        ArrayList<TL_communities.CommunityPeer> arrayList;
        if (j > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            if (V1 == null) {
                return 0;
            }
            j2 = V1.linked_community_id;
            user = V1;
            K0 = null;
        } else {
            K0 = na7.q1(i).K0(Long.valueOf(-j));
            if (K0 == null) {
                return 0;
            }
            j2 = K0.linked_community_id;
            user = null;
        }
        if (j2 != 0 && (L0 = na7.q1(i).L0(j2)) != null && (arrayList = L0.linked_peers) != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_communities.CommunityPeer communityPeer = arrayList.get(i2);
                i2++;
                TL_communities.CommunityPeer communityPeer2 = communityPeer;
                if (cf3.n(communityPeer2.peer) == j) {
                    return c(K0, user != null ? na7.q1(i).Q0(user.id) : null, user, communityPeer2);
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
            if (!hc2.j0(chat)) {
                if (hc2.t0(chat) || communityPeer.can_view_history) {
                    return 2;
                }
                return (!fod.a(communityPeer.flags, 1) || communityPeer.visible) ? 3 : 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(int i, long j, d dVar) {
        ui5 ui5Var;
        mu1 mu1Var;
        int i2;
        List list = null;
        if (gl.O1()) {
            ui5Var = null;
            mu1Var = null;
        } else {
            ui5Var = dVar.getParentLayout();
            if (ui5Var != null) {
                List fragmentStack = ui5Var.getFragmentStack();
                i2 = fragmentStack.size() - 2;
                while (true) {
                    if (i2 < 0) {
                        mu1Var = null;
                        i2 = -1;
                        break;
                    }
                    d dVar2 = (d) fragmentStack.get(i2);
                    if (dVar2 instanceof mu1) {
                        mu1Var = (mu1) dVar2;
                        if (mu1Var.a() == j) {
                            break;
                        }
                    }
                    i2--;
                }
                list = fragmentStack;
                boolean U = hc2.U(dVar.getCurrentAccount(), j);
                if (i2 != -1) {
                    if (!(dVar instanceof cj3)) {
                        dVar.finishFragment();
                    }
                    f(u21.Y(), i, U);
                    return;
                }
                for (int size = list.size() - 2; size > i2; size--) {
                    ((ActionBarLayout) ui5Var).c0((d) list.get(size), false);
                }
                dVar.finishFragment();
                gl.d3(new ko1(i, mu1Var, U), 250L);
                return;
            }
            mu1Var = null;
        }
        i2 = -1;
        boolean U2 = hc2.U(dVar.getCurrentAccount(), j);
        if (i2 != -1) {
        }
    }

    public static void e(hd[] hdVarArr, d dVar, int i, TLRPC.Chat chat) {
        byte b = 0;
        if (hdVarArr[0] != null) {
            return;
        }
        na7 q1 = na7.q1(i);
        e eVar = new e((Object) hdVarArr, (Object) dVar, i, (Object) chat, (byte) 5);
        TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
        tL_channels_getAdminedPublicChannels.for_community_peer = true;
        int sendRequestTyped = q1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new hc((byte) 0), new ae2(q1, eVar, (byte) 28));
        ConnectionsManager.getInstance(i).bindRequestToGuid(sendRequestTyped, dVar.getClassGuid());
        hd hdVar = new hd(3, null, dVar.getContext());
        hdVarArr[0] = hdVar;
        hdVar.q(500L);
        hdVarArr[0].setOnCancelListener(new fo2(i, sendRequestTyped, hdVarArr, b));
    }

    public static void f(u21 u21Var, int i, boolean z) {
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
            M0 = k96.M0(2131751931, null);
        } else if (i == 1) {
            M0 = k96.M0(z ? 2131751930 : 2131751929, null);
        } else {
            M0 = k96.M0(2131751928, null);
        }
        u21Var.G(i2, i3, M0).j();
    }
}
