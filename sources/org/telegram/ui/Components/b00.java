package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class b00 extends dk0 {
    public final /* synthetic */ i00 c;

    public b00(i00 i00Var) {
        this.c = i00Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f != 2) {
            return false;
        }
        int b10 = f1Var.b();
        i00 i00Var = this.c;
        return b10 >= i00Var.n2 && f1Var.b() <= i00Var.o2;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.k2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        i00 i00Var = this.c;
        i00Var.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 == i00Var.l2 || i7 == i00Var.p2 || i7 == i00Var.t2) {
            return 1;
        }
        return (i7 == i00Var.m2 || i7 == i00Var.q2) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j3;
        TLRPC.Chat chat;
        String str;
        String str2;
        TLRPC.Chat chat2;
        CheckBoxBase checkBoxBase;
        float f10;
        TLRPC.Chat chat3;
        i00 i00Var = this.c;
        ArrayList arrayList2 = i00Var.c2;
        org.telegram.ui.ActionBar.g2 g2Var = i00Var.s1;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 2) {
            if (i10 == 3) {
                f00 f00Var = (f00) view;
                if (i7 == i00Var.q2) {
                    f00Var.b(org.telegram.messenger.gd.N0(2131750645, null), false);
                    f00Var.a("", null);
                    return;
                } else {
                    i00Var.u2 = f00Var;
                    i00Var.j1();
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == 0) {
                    i00Var.j2 = (h00) view;
                    i00Var.i1(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setForeground(org.telegram.ui.ActionBar.m6.Y0(i00Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.m6.b7));
            if (i7 == i00Var.t2 || i7 == i00Var.l2 || arrayList2 == null || arrayList2.isEmpty()) {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
            a9Var.setFixedSize(0);
            if (i00Var.X1) {
                a9Var.setText(org.telegram.messenger.gd.N0(2131750637, null));
                return;
            } else {
                a9Var.setText(org.telegram.messenger.gd.N0(2131750638, null));
                return;
            }
        }
        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
        int i11 = i00Var.n2;
        if (i7 < i11 || i7 > i00Var.o2) {
            int i12 = i00Var.r2;
            if (i7 >= i12 && i7 <= i00Var.s2 && (arrayList = i00Var.f2) != null) {
                peer = (TLRPC.Peer) arrayList.get(i7 - i12);
            }
            peer = null;
        } else {
            if (arrayList2 != null) {
                peer = (TLRPC.Peer) arrayList2.get(i7 - i11);
            }
            peer = null;
        }
        if (peer != null) {
            if (!(peer instanceof TLRPC.TL_peerUser)) {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j3 = -peer.chat_id;
                    chat3 = g2Var.getMessagesController().O0(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j3 = -peer.channel_id;
                    chat3 = g2Var.getMessagesController().O0(Long.valueOf(peer.channel_id));
                }
                str = null;
                chat = chat3;
                str2 = str;
                chat2 = chat;
                if (chat2 instanceof TLRPC.Chat) {
                }
                i4Var.setTag(Long.valueOf(j3));
                checkBoxBase = i4Var.getCheckBox().getCheckBoxBase();
                if (i00Var.d2.contains(Long.valueOf(j3))) {
                }
                if (checkBoxBase.h != f10) {
                }
                i4Var.c(i00Var.e2.contains(Long.valueOf(j3)), false);
                i4Var.d(chat2, str, str2);
            }
            j3 = peer.user_id;
            TLRPC.User c22 = g2Var.getMessagesController().c2(Long.valueOf(peer.user_id));
            str = org.telegram.messenger.o10.q(c22);
            if (c22 == null || !c22.bot) {
                str2 = org.telegram.messenger.gd.N0(2131750727, null);
                chat2 = c22;
            } else {
                str2 = org.telegram.messenger.gd.N0(2131750759, null);
                chat2 = c22;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                str2 = chat4.participants_count != 0 ? org.telegram.messenger.v3.V(chat4) ? org.telegram.messenger.gd.H(',', "Subscribers", chat4.participants_count) : org.telegram.messenger.gd.H(',', "Members", chat4.participants_count) : org.telegram.messenger.v3.V(chat4) ? org.telegram.messenger.gd.N0(2131752306, null) : org.telegram.messenger.gd.N0(2131748445, null);
                str = str3;
            }
            i4Var.setTag(Long.valueOf(j3));
            checkBoxBase = i4Var.getCheckBox().getCheckBoxBase();
            f10 = i00Var.d2.contains(Long.valueOf(j3)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f10) {
                checkBoxBase.h = f10;
                checkBoxBase.b();
            }
            i4Var.c(i00Var.e2.contains(Long.valueOf(j3)), false);
            i4Var.d(chat2, str, str2);
        }
        j3 = 0;
        chat = null;
        str = null;
        str2 = str;
        chat2 = chat;
        if (chat2 instanceof TLRPC.Chat) {
        }
        i4Var.setTag(Long.valueOf(j3));
        checkBoxBase = i4Var.getCheckBox().getCheckBoxBase();
        if (i00Var.d2.contains(Long.valueOf(j3))) {
        }
        if (checkBoxBase.h != f10) {
        }
        i4Var.c(i00Var.e2.contains(Long.valueOf(j3)), false);
        i4Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, org.telegram.ui.Cells.i4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, org.telegram.ui.Components.f00] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, org.telegram.ui.Cells.a9] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        h00 h00Var;
        h00 h00Var2;
        i00 i00Var = this.c;
        if (i7 == 0) {
            h00Var = new h00(i00Var, i00Var.getContext(), (i00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || i00Var.W1 != null, i00Var.b2, i00Var.Z1, i00Var.a2);
            i00Var.j2 = h00Var;
        } else {
            h00Var = null;
            if (i7 == 1) {
                ?? a9Var = new org.telegram.ui.Cells.a9(i00Var.getContext());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.a7, a9Var, null);
                h00Var2 = a9Var;
            } else if (i7 == 2) {
                ?? i4Var = new org.telegram.ui.Cells.i4(i00Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, i4Var, null);
                h00Var = i4Var;
            } else if (i7 == 3) {
                ?? f00Var = new f00(i00Var.getContext());
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, f00Var, null);
                h00Var2 = f00Var;
            }
            h00Var = h00Var2;
        }
        return new mj0(h00Var);
    }
}
