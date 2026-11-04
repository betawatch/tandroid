package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lz extends sj0 {
    public final /* synthetic */ rz c;

    public lz(rz rzVar) {
        this.c = rzVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f != 2) {
            return false;
        }
        int b10 = d1Var.b();
        rz rzVar = this.c;
        return b10 >= rzVar.k2 && d1Var.b() <= rzVar.l2;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.h2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        rz rzVar = this.c;
        rzVar.getClass();
        if (i3 == 0) {
            return 0;
        }
        if (i3 == rzVar.i2 || i3 == rzVar.m2 || i3 == rzVar.q2) {
            return 1;
        }
        return (i3 == rzVar.j2 || i3 == rzVar.n2) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j10;
        TLRPC.Chat chat;
        String str;
        String str2;
        TLRPC.Chat chat2;
        CheckBoxBase checkBoxBase;
        float f10;
        TLRPC.Chat chat3;
        rz rzVar = this.c;
        ArrayList arrayList2 = rzVar.Z1;
        org.telegram.ui.ActionBar.d2 d2Var = rzVar.p1;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 2) {
            if (i10 == 3) {
                oz ozVar = (oz) view;
                if (i3 == rzVar.n2) {
                    ozVar.b(org.telegram.messenger.bd.M0(2131750663, null), false);
                    ozVar.a("", null);
                    return;
                } else {
                    rzVar.r2 = ozVar;
                    rzVar.i1();
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == 0) {
                    rzVar.g2 = (qz) view;
                    rzVar.h1(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setForeground(org.telegram.ui.ActionBar.k6.Y0(rzVar.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
            if (i3 == rzVar.q2 || i3 == rzVar.i2 || arrayList2 == null || arrayList2.isEmpty()) {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
            y8Var.setFixedSize(0);
            if (rzVar.U1) {
                y8Var.setText(org.telegram.messenger.bd.M0(2131750655, null));
                return;
            } else {
                y8Var.setText(org.telegram.messenger.bd.M0(2131750656, null));
                return;
            }
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        int i11 = rzVar.k2;
        if (i3 < i11 || i3 > rzVar.l2) {
            int i12 = rzVar.o2;
            if (i3 >= i12 && i3 <= rzVar.p2 && (arrayList = rzVar.c2) != null) {
                peer = (TLRPC.Peer) arrayList.get(i3 - i12);
            }
            peer = null;
        } else {
            if (arrayList2 != null) {
                peer = (TLRPC.Peer) arrayList2.get(i3 - i11);
            }
            peer = null;
        }
        if (peer != null) {
            if (!(peer instanceof TLRPC.TL_peerUser)) {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j10 = -peer.chat_id;
                    chat3 = d2Var.getMessagesController().M0(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j10 = -peer.channel_id;
                    chat3 = d2Var.getMessagesController().M0(Long.valueOf(peer.channel_id));
                }
                str = null;
                chat = chat3;
                str2 = str;
                chat2 = chat;
                if (chat2 instanceof TLRPC.Chat) {
                }
                h4Var.setTag(Long.valueOf(j10));
                checkBoxBase = h4Var.getCheckBox().getCheckBoxBase();
                if (rzVar.a2.contains(Long.valueOf(j10))) {
                }
                if (checkBoxBase.h != f10) {
                }
                h4Var.c(rzVar.b2.contains(Long.valueOf(j10)), false);
                h4Var.d(chat2, str, str2);
            }
            j10 = peer.user_id;
            TLRPC.User a22 = d2Var.getMessagesController().a2(Long.valueOf(peer.user_id));
            str = org.telegram.messenger.l10.p(a22);
            if (a22 == null || !a22.bot) {
                str2 = org.telegram.messenger.bd.M0(2131750740, null);
                chat2 = a22;
            } else {
                str2 = org.telegram.messenger.bd.M0(2131750772, null);
                chat2 = a22;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                str2 = chat4.participants_count != 0 ? org.telegram.messenger.t3.V(chat4) ? org.telegram.messenger.bd.H(',', "Subscribers", chat4.participants_count) : org.telegram.messenger.bd.H(',', "Members", chat4.participants_count) : org.telegram.messenger.t3.V(chat4) ? org.telegram.messenger.bd.M0(2131752318, null) : org.telegram.messenger.bd.M0(2131748646, null);
                str = str3;
            }
            h4Var.setTag(Long.valueOf(j10));
            checkBoxBase = h4Var.getCheckBox().getCheckBoxBase();
            f10 = rzVar.a2.contains(Long.valueOf(j10)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f10) {
                checkBoxBase.h = f10;
                checkBoxBase.b();
            }
            h4Var.c(rzVar.b2.contains(Long.valueOf(j10)), false);
            h4Var.d(chat2, str, str2);
        }
        j10 = 0;
        chat = null;
        str = null;
        str2 = str;
        chat2 = chat;
        if (chat2 instanceof TLRPC.Chat) {
        }
        h4Var.setTag(Long.valueOf(j10));
        checkBoxBase = h4Var.getCheckBox().getCheckBoxBase();
        if (rzVar.a2.contains(Long.valueOf(j10))) {
        }
        if (checkBoxBase.h != f10) {
        }
        h4Var.c(rzVar.b2.contains(Long.valueOf(j10)), false);
        h4Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, org.telegram.ui.Cells.h4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, org.telegram.ui.Components.oz] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, org.telegram.ui.Cells.y8] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        qz qzVar;
        qz qzVar2;
        rz rzVar = this.c;
        if (i3 == 0) {
            qzVar = new qz(rzVar, rzVar.getContext(), (rzVar.S1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || rzVar.T1 != null, rzVar.Y1, rzVar.W1, rzVar.X1);
            rzVar.g2 = qzVar;
        } else {
            qzVar = null;
            if (i3 == 1) {
                ?? y8Var = new org.telegram.ui.Cells.y8(rzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, y8Var, null);
                qzVar2 = y8Var;
            } else if (i3 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(rzVar.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, h4Var, null);
                qzVar = h4Var;
            } else if (i3 == 3) {
                ?? ozVar = new oz(rzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ozVar, null);
                qzVar2 = ozVar;
            }
            qzVar = qzVar2;
        }
        return new bj0(qzVar);
    }
}
