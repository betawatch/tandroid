// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class el4 extends n39 {
    public final /* synthetic */ ll4 c;

    public el4(ll4 ll4Var) {
        this.c = ll4Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        if (s49Var.f != 2) {
            return false;
        }
        int b = s49Var.b();
        ll4 ll4Var = this.c;
        return b >= ll4Var.m2 && s49Var.b() <= ll4Var.n2;
    }

    @Override // w39
    public final int b() {
        return this.c.j2;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        ll4 ll4Var = this.c;
        if (i == ll4Var.k2 || i == ll4Var.o2 || i == ll4Var.s2) {
            return 1;
        }
        return (i == ll4Var.l2 || i == ll4Var.p2) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j;
        TLRPC.Chat chat;
        String str;
        String str2;
        TLRPC.Chat chat2;
        CheckBoxBase checkBoxBase;
        float f;
        String M0;
        TLRPC.Chat chat3;
        ll4 ll4Var = this.c;
        ArrayList arrayList2 = ll4Var.b2;
        d dVar = ll4Var.r1;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 2) {
            if (i2 == 3) {
                il4 il4Var = (il4) view;
                if (i == ll4Var.p2) {
                    il4Var.b(k96.M0(2131750645, null), false);
                    il4Var.a("", null);
                    return;
                } else {
                    ll4Var.t2 = il4Var;
                    ll4Var.d1();
                    return;
                }
            }
            if (i2 != 1) {
                if (i2 == 0) {
                    ll4Var.i2 = (kl4) view;
                    ll4Var.c1(false);
                    return;
                }
                return;
            }
            mhb mhbVar = (mhb) view;
            mhbVar.setForeground(bkb.W0(ll4Var.getContext(), R.drawable.greydivider, bkb.a7));
            if (i == ll4Var.s2 || i == ll4Var.k2 || arrayList2 == null || arrayList2.isEmpty()) {
                mhbVar.setFixedSize(12);
                mhbVar.setText("");
                return;
            }
            mhbVar.setFixedSize(0);
            if (ll4Var.W1) {
                mhbVar.setText(k96.M0(2131750637, null));
                return;
            } else {
                mhbVar.setText(k96.M0(2131750638, null));
                return;
            }
        }
        za5 za5Var = (za5) view;
        int i3 = ll4Var.m2;
        if (i < i3 || i > ll4Var.n2) {
            int i4 = ll4Var.q2;
            if (i >= i4 && i <= ll4Var.r2 && (arrayList = ll4Var.e2) != null) {
                peer = (TLRPC.Peer) arrayList.get(i - i4);
            }
            peer = null;
        } else {
            if (arrayList2 != null) {
                peer = (TLRPC.Peer) arrayList2.get(i - i3);
            }
            peer = null;
        }
        if (peer != null) {
            if (!(peer instanceof TLRPC.TL_peerUser)) {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j = -peer.chat_id;
                    chat3 = dVar.getMessagesController().K0(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j = -peer.channel_id;
                    chat3 = dVar.getMessagesController().K0(Long.valueOf(peer.channel_id));
                }
                str = null;
                chat = chat3;
                str2 = str;
                chat2 = chat;
                if (chat2 instanceof TLRPC.Chat) {
                }
                za5Var.setTag(Long.valueOf(j));
                checkBoxBase = za5Var.getCheckBox().getCheckBoxBase();
                if (ll4Var.c2.contains(Long.valueOf(j))) {
                }
                if (checkBoxBase.h != f) {
                }
                za5Var.c(ll4Var.d2.contains(Long.valueOf(j)), false);
                za5Var.d(chat2, str, str2);
            }
            j = peer.user_id;
            TLRPC.User V1 = dVar.getMessagesController().V1(Long.valueOf(peer.user_id));
            str = l7c.r(V1);
            if (V1 == null || !V1.bot) {
                str2 = k96.M0(2131750727, null);
                chat2 = V1;
            } else {
                str2 = k96.M0(2131750759, null);
                chat2 = V1;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                if (chat4.participants_count != 0) {
                    boolean V = hc2.V(chat4);
                    int i5 = chat4.participants_count;
                    M0 = V ? k96.H(',', "Subscribers", i5) : k96.H(',', "Members", i5);
                } else {
                    M0 = hc2.V(chat4) ? k96.M0(2131752306, null) : k96.M0(2131748446, null);
                }
                str2 = M0;
                str = str3;
            }
            za5Var.setTag(Long.valueOf(j));
            checkBoxBase = za5Var.getCheckBox().getCheckBoxBase();
            f = ll4Var.c2.contains(Long.valueOf(j)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f) {
                checkBoxBase.h = f;
                checkBoxBase.b();
            }
            za5Var.c(ll4Var.d2.contains(Long.valueOf(j)), false);
            za5Var.d(chat2, str, str2);
        }
        j = 0;
        chat = null;
        str = null;
        str2 = str;
        chat2 = chat;
        if (chat2 instanceof TLRPC.Chat) {
        }
        za5Var.setTag(Long.valueOf(j));
        checkBoxBase = za5Var.getCheckBox().getCheckBoxBase();
        if (ll4Var.c2.contains(Long.valueOf(j))) {
        }
        if (checkBoxBase.h != f) {
        }
        za5Var.c(ll4Var.d2.contains(Long.valueOf(j)), false);
        za5Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, il4] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, za5] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View, mhb] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        kl4 kl4Var;
        kl4 kl4Var2;
        ll4 ll4Var = this.c;
        if (i == 0) {
            kl4Var = new kl4(ll4Var, ll4Var.getContext(), (ll4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || ll4Var.V1 != null, ll4Var.a2, ll4Var.Y1, ll4Var.Z1);
            ll4Var.i2 = kl4Var;
        } else {
            kl4Var = null;
            if (i == 1) {
                ?? mhbVar = new mhb(ll4Var.getContext());
                zkb.h(bkb.Z6, null, mhbVar);
                kl4Var2 = mhbVar;
            } else if (i == 2) {
                ?? za5Var = new za5(ll4Var.getContext(), 1, 0, false);
                zkb.h(bkb.c6, null, za5Var);
                kl4Var2 = za5Var;
            } else if (i == 3) {
                ?? il4Var = new il4(ll4Var.getContext());
                zkb.h(bkb.c6, null, il4Var);
                kl4Var2 = il4Var;
            }
            kl4Var = kl4Var2;
        }
        return new y29(kl4Var);
    }
}
