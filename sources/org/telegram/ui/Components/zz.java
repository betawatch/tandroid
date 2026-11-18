package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zz extends bk0 {
    public final /* synthetic */ g00 c;

    public zz(g00 g00Var) {
        this.c = g00Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f != 2) {
            return false;
        }
        int b10 = f1Var.b();
        g00 g00Var = this.c;
        return b10 >= g00Var.n2 && f1Var.b() <= g00Var.o2;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.k2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        g00 g00Var = this.c;
        g00Var.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 == g00Var.l2 || i7 == g00Var.p2 || i7 == g00Var.t2) {
            return 1;
        }
        return (i7 == g00Var.m2 || i7 == g00Var.q2) ? 3 : 2;
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
        g00 g00Var = this.c;
        ArrayList arrayList2 = g00Var.c2;
        org.telegram.ui.ActionBar.h2 h2Var = g00Var.s1;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 2) {
            if (i10 == 3) {
                d00 d00Var = (d00) view;
                if (i7 == g00Var.q2) {
                    d00Var.b(org.telegram.messenger.gd.M0(2131750646, null), false);
                    d00Var.a("", null);
                    return;
                } else {
                    g00Var.u2 = d00Var;
                    g00Var.j1();
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == 0) {
                    g00Var.j2 = (f00) view;
                    g00Var.i1(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setForeground(org.telegram.ui.ActionBar.n6.Y0(g00Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.n6.b7));
            if (i7 == g00Var.t2 || i7 == g00Var.l2 || arrayList2 == null || arrayList2.isEmpty()) {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
            a9Var.setFixedSize(0);
            if (g00Var.X1) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131750638, null));
                return;
            } else {
                a9Var.setText(org.telegram.messenger.gd.M0(2131750639, null));
                return;
            }
        }
        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
        int i11 = g00Var.n2;
        if (i7 < i11 || i7 > g00Var.o2) {
            int i12 = g00Var.r2;
            if (i7 >= i12 && i7 <= g00Var.s2 && (arrayList = g00Var.f2) != null) {
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
                    chat3 = h2Var.getMessagesController().O0(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j3 = -peer.channel_id;
                    chat3 = h2Var.getMessagesController().O0(Long.valueOf(peer.channel_id));
                }
                str = null;
                chat = chat3;
                str2 = str;
                chat2 = chat;
                if (chat2 instanceof TLRPC.Chat) {
                }
                i4Var.setTag(Long.valueOf(j3));
                checkBoxBase = i4Var.getCheckBox().getCheckBoxBase();
                if (g00Var.d2.contains(Long.valueOf(j3))) {
                }
                if (checkBoxBase.h != f10) {
                }
                i4Var.c(g00Var.e2.contains(Long.valueOf(j3)), false);
                i4Var.d(chat2, str, str2);
            }
            j3 = peer.user_id;
            TLRPC.User c22 = h2Var.getMessagesController().c2(Long.valueOf(peer.user_id));
            str = org.telegram.messenger.o10.q(c22);
            if (c22 == null || !c22.bot) {
                str2 = org.telegram.messenger.gd.M0(2131750728, null);
                chat2 = c22;
            } else {
                str2 = org.telegram.messenger.gd.M0(2131750760, null);
                chat2 = c22;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                str2 = chat4.participants_count != 0 ? org.telegram.messenger.v3.V(chat4) ? org.telegram.messenger.gd.H(',', "Subscribers", chat4.participants_count) : org.telegram.messenger.gd.H(',', "Members", chat4.participants_count) : org.telegram.messenger.v3.V(chat4) ? org.telegram.messenger.gd.M0(2131752307, null) : org.telegram.messenger.gd.M0(2131748446, null);
                str = str3;
            }
            i4Var.setTag(Long.valueOf(j3));
            checkBoxBase = i4Var.getCheckBox().getCheckBoxBase();
            f10 = g00Var.d2.contains(Long.valueOf(j3)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f10) {
                checkBoxBase.h = f10;
                checkBoxBase.b();
            }
            i4Var.c(g00Var.e2.contains(Long.valueOf(j3)), false);
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
        if (g00Var.d2.contains(Long.valueOf(j3))) {
        }
        if (checkBoxBase.h != f10) {
        }
        i4Var.c(g00Var.e2.contains(Long.valueOf(j3)), false);
        i4Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, org.telegram.ui.Cells.i4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, org.telegram.ui.Components.d00] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, org.telegram.ui.Cells.a9] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        f00 f00Var;
        f00 f00Var2;
        g00 g00Var = this.c;
        if (i7 == 0) {
            f00Var = new f00(g00Var, g00Var.getContext(), (g00Var.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || g00Var.W1 != null, g00Var.b2, g00Var.Z1, g00Var.a2);
            g00Var.j2 = f00Var;
        } else {
            f00Var = null;
            if (i7 == 1) {
                ?? a9Var = new org.telegram.ui.Cells.a9(g00Var.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.a7, a9Var, null);
                f00Var2 = a9Var;
            } else if (i7 == 2) {
                ?? i4Var = new org.telegram.ui.Cells.i4(g00Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, i4Var, null);
                f00Var = i4Var;
            } else if (i7 == 3) {
                ?? d00Var = new d00(g00Var.getContext());
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, d00Var, null);
                f00Var2 = d00Var;
            }
            f00Var = f00Var2;
        }
        return new kj0(f00Var);
    }
}
