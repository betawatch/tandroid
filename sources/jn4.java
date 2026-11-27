// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jn4 extends c79 {
    public final /* synthetic */ qn4 c;

    public jn4(qn4 qn4Var) {
        this.c = qn4Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        if (f89Var.f != 2) {
            return false;
        }
        int b = f89Var.b();
        qn4 qn4Var = this.c;
        return b >= qn4Var.m2 && f89Var.b() <= qn4Var.n2;
    }

    @Override // j79
    public final int b() {
        return this.c.j2;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        qn4 qn4Var = this.c;
        if (i == qn4Var.k2 || i == qn4Var.o2 || i == qn4Var.s2) {
            return 1;
        }
        return (i == qn4Var.l2 || i == qn4Var.p2) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
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
        qn4 qn4Var = this.c;
        ArrayList arrayList2 = qn4Var.b2;
        e eVar = qn4Var.r1;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 2) {
            if (i2 == 3) {
                nn4 nn4Var = (nn4) view;
                if (i == qn4Var.p2) {
                    nn4Var.b(ob6.M0(2131750622, null), false);
                    nn4Var.a("", null);
                    return;
                } else {
                    qn4Var.t2 = nn4Var;
                    qn4Var.e1();
                    return;
                }
            }
            if (i2 != 1) {
                if (i2 == 0) {
                    qn4Var.i2 = (pn4) view;
                    qn4Var.d1(false);
                    return;
                }
                return;
            }
            ilb ilbVar = (ilb) view;
            ilbVar.setForeground(aob.W0(qn4Var.getContext(), R.drawable.greydivider, aob.b7));
            if (i == qn4Var.s2 || i == qn4Var.k2 || arrayList2 == null || arrayList2.isEmpty()) {
                ilbVar.setFixedSize(12);
                ilbVar.setText("");
                return;
            }
            ilbVar.setFixedSize(0);
            if (qn4Var.W1) {
                ilbVar.setText(ob6.M0(2131750614, null));
                return;
            } else {
                ilbVar.setText(ob6.M0(2131750615, null));
                return;
            }
        }
        bd5 bd5Var = (bd5) view;
        int i3 = qn4Var.m2;
        if (i < i3 || i > qn4Var.n2) {
            int i4 = qn4Var.q2;
            if (i >= i4 && i <= qn4Var.r2 && (arrayList = qn4Var.e2) != null) {
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
                    chat3 = eVar.getMessagesController().M0(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j = -peer.channel_id;
                    chat3 = eVar.getMessagesController().M0(Long.valueOf(peer.channel_id));
                }
                str = null;
                chat = chat3;
                str2 = str;
                chat2 = chat;
                if (chat2 instanceof TLRPC.Chat) {
                }
                bd5Var.setTag(Long.valueOf(j));
                checkBoxBase = bd5Var.getCheckBox().getCheckBoxBase();
                if (qn4Var.c2.contains(Long.valueOf(j))) {
                }
                if (checkBoxBase.h != f) {
                }
                bd5Var.c(qn4Var.d2.contains(Long.valueOf(j)), false);
                bd5Var.d(chat2, str, str2);
            }
            j = peer.user_id;
            TLRPC.User X1 = eVar.getMessagesController().X1(Long.valueOf(peer.user_id));
            str = lbc.r(X1);
            if (X1 == null || !X1.bot) {
                str2 = ob6.M0(2131750704, null);
                chat2 = X1;
            } else {
                str2 = ob6.M0(2131750736, null);
                chat2 = X1;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                if (chat4.participants_count != 0) {
                    boolean V = xc2.V(chat4);
                    int i5 = chat4.participants_count;
                    M0 = V ? ob6.H(',', "Subscribers", i5) : ob6.H(',', "Members", i5);
                } else {
                    M0 = xc2.V(chat4) ? ob6.M0(2131752288, null) : ob6.M0(2131748392, null);
                }
                str2 = M0;
                str = str3;
            }
            bd5Var.setTag(Long.valueOf(j));
            checkBoxBase = bd5Var.getCheckBox().getCheckBoxBase();
            f = qn4Var.c2.contains(Long.valueOf(j)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f) {
                checkBoxBase.h = f;
                checkBoxBase.b();
            }
            bd5Var.c(qn4Var.d2.contains(Long.valueOf(j)), false);
            bd5Var.d(chat2, str, str2);
        }
        j = 0;
        chat = null;
        str = null;
        str2 = str;
        chat2 = chat;
        if (chat2 instanceof TLRPC.Chat) {
        }
        bd5Var.setTag(Long.valueOf(j));
        checkBoxBase = bd5Var.getCheckBox().getCheckBoxBase();
        if (qn4Var.c2.contains(Long.valueOf(j))) {
        }
        if (checkBoxBase.h != f) {
        }
        bd5Var.c(qn4Var.d2.contains(Long.valueOf(j)), false);
        bd5Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, nn4] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, bd5] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View, ilb] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        pn4 pn4Var;
        pn4 pn4Var2;
        qn4 qn4Var = this.c;
        if (i == 0) {
            pn4Var = new pn4(qn4Var, qn4Var.getContext(), (qn4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || qn4Var.V1 != null, qn4Var.a2, qn4Var.Y1, qn4Var.Z1);
            qn4Var.i2 = pn4Var;
        } else {
            pn4Var = null;
            if (i == 1) {
                ?? ilbVar = new ilb(qn4Var.getContext());
                yob.h(aob.a7, null, ilbVar);
                pn4Var2 = ilbVar;
            } else if (i == 2) {
                ?? bd5Var = new bd5(qn4Var.getContext(), 1, 0, false);
                yob.h(aob.d6, null, bd5Var);
                pn4Var2 = bd5Var;
            } else if (i == 3) {
                ?? nn4Var = new nn4(qn4Var.getContext());
                yob.h(aob.d6, null, nn4Var);
                pn4Var2 = nn4Var;
            }
            pn4Var = pn4Var2;
        }
        return new n69(pn4Var);
    }
}
