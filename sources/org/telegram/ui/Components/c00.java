package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c00 extends sk0 {
    public final /* synthetic */ j00 c;

    public c00(j00 j00Var) {
        this.c = j00Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f != 2) {
            return false;
        }
        int b10 = c1Var.b();
        j00 j00Var = this.c;
        return b10 >= j00Var.j2 && c1Var.b() <= j00Var.k2;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.g2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        j00 j00Var = this.c;
        j00Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == j00Var.h2 || i10 == j00Var.l2 || i10 == j00Var.p2) {
            return 1;
        }
        return (i10 == j00Var.i2 || i10 == j00Var.m2) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j10;
        TLRPC.Chat chat;
        String str;
        String str2;
        TLRPC.Chat chat2;
        CheckBoxBase checkBoxBase;
        float f7;
        TLRPC.Chat chat3;
        j00 j00Var = this.c;
        ArrayList arrayList2 = j00Var.Y1;
        org.telegram.ui.ActionBar.k2 k2Var = j00Var.o1;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 2) {
            if (i11 == 3) {
                g00 g00Var = (g00) view;
                if (i10 == j00Var.m2) {
                    g00Var.b(org.telegram.messenger.cd.L0(2131750663, null), false);
                    g00Var.a("", null);
                    return;
                } else {
                    j00Var.q2 = g00Var;
                    j00Var.i1();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    j00Var.f2 = (i00) view;
                    j00Var.h1(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setForeground(org.telegram.ui.ActionBar.t6.Y0(j00Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7));
            if (i10 == j00Var.p2 || i10 == j00Var.h2 || arrayList2 == null || arrayList2.isEmpty()) {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            }
            b9Var.setFixedSize(0);
            if (j00Var.T1) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131750655, null));
                return;
            } else {
                b9Var.setText(org.telegram.messenger.cd.L0(2131750656, null));
                return;
            }
        }
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
        int i12 = j00Var.j2;
        if (i10 < i12 || i10 > j00Var.k2) {
            int i13 = j00Var.n2;
            if (i10 >= i13 && i10 <= j00Var.o2 && (arrayList = j00Var.b2) != null) {
                peer = (TLRPC.Peer) arrayList.get(i10 - i13);
            }
            peer = null;
        } else {
            if (arrayList2 != null) {
                peer = (TLRPC.Peer) arrayList2.get(i10 - i12);
            }
            peer = null;
        }
        if (peer != null) {
            if (!(peer instanceof TLRPC.TL_peerUser)) {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j10 = -peer.chat_id;
                    chat3 = k2Var.getMessagesController().L0(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j10 = -peer.channel_id;
                    chat3 = k2Var.getMessagesController().L0(Long.valueOf(peer.channel_id));
                }
                str = null;
                chat = chat3;
                str2 = str;
                chat2 = chat;
                if (chat2 instanceof TLRPC.Chat) {
                }
                j4Var.setTag(Long.valueOf(j10));
                checkBoxBase = j4Var.getCheckBox().getCheckBoxBase();
                if (j00Var.Z1.contains(Long.valueOf(j10))) {
                }
                if (checkBoxBase.h != f7) {
                }
                j4Var.c(j00Var.a2.contains(Long.valueOf(j10)), false);
                j4Var.d(chat2, str, str2);
            }
            j10 = peer.user_id;
            TLRPC.User Z1 = k2Var.getMessagesController().Z1(Long.valueOf(peer.user_id));
            str = org.telegram.messenger.h20.p(Z1);
            if (Z1 == null || !Z1.bot) {
                str2 = org.telegram.messenger.cd.L0(2131750740, null);
                chat2 = Z1;
            } else {
                str2 = org.telegram.messenger.cd.L0(2131750772, null);
                chat2 = Z1;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                str2 = chat4.participants_count != 0 ? org.telegram.messenger.w3.V(chat4) ? org.telegram.messenger.cd.H(',', "Subscribers", chat4.participants_count) : org.telegram.messenger.cd.H(',', "Members", chat4.participants_count) : org.telegram.messenger.w3.V(chat4) ? org.telegram.messenger.cd.L0(2131752318, null) : org.telegram.messenger.cd.L0(2131748653, null);
                str = str3;
            }
            j4Var.setTag(Long.valueOf(j10));
            checkBoxBase = j4Var.getCheckBox().getCheckBoxBase();
            f7 = j00Var.Z1.contains(Long.valueOf(j10)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f7) {
                checkBoxBase.h = f7;
                checkBoxBase.b();
            }
            j4Var.c(j00Var.a2.contains(Long.valueOf(j10)), false);
            j4Var.d(chat2, str, str2);
        }
        j10 = 0;
        chat = null;
        str = null;
        str2 = str;
        chat2 = chat;
        if (chat2 instanceof TLRPC.Chat) {
        }
        j4Var.setTag(Long.valueOf(j10));
        checkBoxBase = j4Var.getCheckBox().getCheckBoxBase();
        if (j00Var.Z1.contains(Long.valueOf(j10))) {
        }
        if (checkBoxBase.h != f7) {
        }
        j4Var.c(j00Var.a2.contains(Long.valueOf(j10)), false);
        j4Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, org.telegram.ui.Cells.j4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, org.telegram.ui.Components.g00] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, org.telegram.ui.Cells.b9] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        i00 i00Var;
        i00 i00Var2;
        j00 j00Var = this.c;
        if (i10 == 0) {
            i00Var = new i00(j00Var, j00Var.getContext(), (j00Var.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || j00Var.S1 != null, j00Var.X1, j00Var.V1, j00Var.W1);
            j00Var.f2 = i00Var;
        } else {
            i00Var = null;
            if (i10 == 1) {
                ?? b9Var = new org.telegram.ui.Cells.b9(j00Var.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, b9Var, null);
                i00Var2 = b9Var;
            } else if (i10 == 2) {
                ?? j4Var = new org.telegram.ui.Cells.j4(j00Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, j4Var, null);
                i00Var = j4Var;
            } else if (i10 == 3) {
                ?? g00Var = new g00(j00Var.getContext());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, g00Var, null);
                i00Var2 = g00Var;
            }
            i00Var = i00Var2;
        }
        return new ck0(i00Var);
    }
}
