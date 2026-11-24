// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class en4 extends q59 {
    public final /* synthetic */ ln4 c;

    public en4(ln4 ln4Var) {
        this.c = ln4Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        if (u69Var.f != 2) {
            return false;
        }
        int b = u69Var.b();
        ln4 ln4Var = this.c;
        return b >= ln4Var.m2 && u69Var.b() <= ln4Var.n2;
    }

    @Override // y59
    public final int b() {
        return this.c.j2;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        ln4 ln4Var = this.c;
        if (i == ln4Var.k2 || i == ln4Var.o2 || i == ln4Var.s2) {
            return 1;
        }
        return (i == ln4Var.l2 || i == ln4Var.p2) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
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
        ln4 ln4Var = this.c;
        ArrayList arrayList2 = ln4Var.b2;
        d dVar = ln4Var.r1;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 2) {
            if (i2 == 3) {
                in4 in4Var = (in4) view;
                if (i == ln4Var.p2) {
                    in4Var.b(jb6.M0(2131750594, null), false);
                    in4Var.a("", null);
                    return;
                } else {
                    ln4Var.t2 = in4Var;
                    ln4Var.d1();
                    return;
                }
            }
            if (i2 != 1) {
                if (i2 == 0) {
                    ln4Var.i2 = (kn4) view;
                    ln4Var.c1(false);
                    return;
                }
                return;
            }
            njb njbVar = (njb) view;
            njbVar.setForeground(cmb.W0(ln4Var.getContext(), R.drawable.greydivider, cmb.a7));
            if (i == ln4Var.s2 || i == ln4Var.k2 || arrayList2 == null || arrayList2.isEmpty()) {
                njbVar.setFixedSize(12);
                njbVar.setText("");
                return;
            }
            njbVar.setFixedSize(0);
            if (ln4Var.W1) {
                njbVar.setText(jb6.M0(2131750586, null));
                return;
            } else {
                njbVar.setText(jb6.M0(2131750587, null));
                return;
            }
        }
        xc5 xc5Var = (xc5) view;
        int i3 = ln4Var.m2;
        if (i < i3 || i > ln4Var.n2) {
            int i4 = ln4Var.q2;
            if (i >= i4 && i <= ln4Var.r2 && (arrayList = ln4Var.e2) != null) {
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
                    chat3 = dVar.getMessagesController().L0(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j = -peer.channel_id;
                    chat3 = dVar.getMessagesController().L0(Long.valueOf(peer.channel_id));
                }
                str = null;
                chat = chat3;
                str2 = str;
                chat2 = chat;
                if (chat2 instanceof TLRPC.Chat) {
                }
                xc5Var.setTag(Long.valueOf(j));
                checkBoxBase = xc5Var.getCheckBox().getCheckBoxBase();
                if (ln4Var.c2.contains(Long.valueOf(j))) {
                }
                if (checkBoxBase.h != f) {
                }
                xc5Var.c(ln4Var.d2.contains(Long.valueOf(j)), false);
                xc5Var.d(chat2, str, str2);
            }
            j = peer.user_id;
            TLRPC.User W1 = dVar.getMessagesController().W1(Long.valueOf(peer.user_id));
            str = m9c.r(W1);
            if (W1 == null || !W1.bot) {
                str2 = jb6.M0(2131750676, null);
                chat2 = W1;
            } else {
                str2 = jb6.M0(2131750708, null);
                chat2 = W1;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                if (chat4.participants_count != 0) {
                    boolean V = sd2.V(chat4);
                    int i5 = chat4.participants_count;
                    M0 = V ? jb6.H(',', "Subscribers", i5) : jb6.H(',', "Members", i5);
                } else {
                    M0 = sd2.V(chat4) ? jb6.M0(2131752260, null) : jb6.M0(2131748395, null);
                }
                str2 = M0;
                str = str3;
            }
            xc5Var.setTag(Long.valueOf(j));
            checkBoxBase = xc5Var.getCheckBox().getCheckBoxBase();
            f = ln4Var.c2.contains(Long.valueOf(j)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f) {
                checkBoxBase.h = f;
                checkBoxBase.b();
            }
            xc5Var.c(ln4Var.d2.contains(Long.valueOf(j)), false);
            xc5Var.d(chat2, str, str2);
        }
        j = 0;
        chat = null;
        str = null;
        str2 = str;
        chat2 = chat;
        if (chat2 instanceof TLRPC.Chat) {
        }
        xc5Var.setTag(Long.valueOf(j));
        checkBoxBase = xc5Var.getCheckBox().getCheckBoxBase();
        if (ln4Var.c2.contains(Long.valueOf(j))) {
        }
        if (checkBoxBase.h != f) {
        }
        xc5Var.c(ln4Var.d2.contains(Long.valueOf(j)), false);
        xc5Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, in4] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, xc5] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View, njb] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        kn4 kn4Var;
        kn4 kn4Var2;
        ln4 ln4Var = this.c;
        if (i == 0) {
            kn4Var = new kn4(ln4Var, ln4Var.getContext(), (ln4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || ln4Var.V1 != null, ln4Var.a2, ln4Var.Y1, ln4Var.Z1);
            ln4Var.i2 = kn4Var;
        } else {
            kn4Var = null;
            if (i == 1) {
                ?? njbVar = new njb(ln4Var.getContext());
                anb.h(cmb.Z6, null, njbVar);
                kn4Var2 = njbVar;
            } else if (i == 2) {
                ?? xc5Var = new xc5(ln4Var.getContext(), 1, 0, false);
                anb.h(cmb.c6, null, xc5Var);
                kn4Var2 = xc5Var;
            } else if (i == 3) {
                ?? in4Var = new in4(ln4Var.getContext());
                anb.h(cmb.c6, null, in4Var);
                kn4Var2 = in4Var;
            }
            kn4Var = kn4Var2;
        }
        return new b59(kn4Var);
    }
}
