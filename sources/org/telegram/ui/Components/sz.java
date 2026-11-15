package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sz extends tj0 {
    public final /* synthetic */ zz c;

    public sz(zz zzVar) {
        this.c = zzVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f != 2) {
            return false;
        }
        int b10 = e1Var.b();
        zz zzVar = this.c;
        return b10 >= zzVar.n2 && e1Var.b() <= zzVar.o2;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.k2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        zz zzVar = this.c;
        zzVar.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 == zzVar.l2 || i7 == zzVar.p2 || i7 == zzVar.t2) {
            return 1;
        }
        return (i7 == zzVar.m2 || i7 == zzVar.q2) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
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
        zz zzVar = this.c;
        ArrayList arrayList2 = zzVar.c2;
        org.telegram.ui.ActionBar.e2 e2Var = zzVar.s1;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 != 2) {
            if (i10 == 3) {
                wz wzVar = (wz) view;
                if (i7 == zzVar.q2) {
                    wzVar.b(org.telegram.messenger.hd.M0(2131750662, null), false);
                    wzVar.a("", null);
                    return;
                } else {
                    zzVar.u2 = wzVar;
                    zzVar.i1();
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == 0) {
                    zzVar.j2 = (yz) view;
                    zzVar.h1(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setForeground(org.telegram.ui.ActionBar.j6.Y0(zzVar.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
            if (i7 == zzVar.t2 || i7 == zzVar.l2 || arrayList2 == null || arrayList2.isEmpty()) {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
            y8Var.setFixedSize(0);
            if (zzVar.X1) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131750654, null));
                return;
            } else {
                y8Var.setText(org.telegram.messenger.hd.M0(2131750655, null));
                return;
            }
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        int i11 = zzVar.n2;
        if (i7 < i11 || i7 > zzVar.o2) {
            int i12 = zzVar.r2;
            if (i7 >= i12 && i7 <= zzVar.s2 && (arrayList = zzVar.f2) != null) {
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
                    chat3 = e2Var.getMessagesController().M0(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j3 = -peer.channel_id;
                    chat3 = e2Var.getMessagesController().M0(Long.valueOf(peer.channel_id));
                }
                str = null;
                chat = chat3;
                str2 = str;
                chat2 = chat;
                if (chat2 instanceof TLRPC.Chat) {
                }
                h4Var.setTag(Long.valueOf(j3));
                checkBoxBase = h4Var.getCheckBox().getCheckBoxBase();
                if (zzVar.d2.contains(Long.valueOf(j3))) {
                }
                if (checkBoxBase.h != f10) {
                }
                h4Var.c(zzVar.e2.contains(Long.valueOf(j3)), false);
                h4Var.d(chat2, str, str2);
            }
            j3 = peer.user_id;
            TLRPC.User a22 = e2Var.getMessagesController().a2(Long.valueOf(peer.user_id));
            str = org.telegram.messenger.q10.p(a22);
            if (a22 == null || !a22.bot) {
                str2 = org.telegram.messenger.hd.M0(2131750739, null);
                chat2 = a22;
            } else {
                str2 = org.telegram.messenger.hd.M0(2131750771, null);
                chat2 = a22;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                str2 = chat4.participants_count != 0 ? org.telegram.messenger.t3.V(chat4) ? org.telegram.messenger.hd.H(',', "Subscribers", chat4.participants_count) : org.telegram.messenger.hd.H(',', "Members", chat4.participants_count) : org.telegram.messenger.t3.V(chat4) ? org.telegram.messenger.hd.M0(2131752318, null) : org.telegram.messenger.hd.M0(2131748638, null);
                str = str3;
            }
            h4Var.setTag(Long.valueOf(j3));
            checkBoxBase = h4Var.getCheckBox().getCheckBoxBase();
            f10 = zzVar.d2.contains(Long.valueOf(j3)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f10) {
                checkBoxBase.h = f10;
                checkBoxBase.b();
            }
            h4Var.c(zzVar.e2.contains(Long.valueOf(j3)), false);
            h4Var.d(chat2, str, str2);
        }
        j3 = 0;
        chat = null;
        str = null;
        str2 = str;
        chat2 = chat;
        if (chat2 instanceof TLRPC.Chat) {
        }
        h4Var.setTag(Long.valueOf(j3));
        checkBoxBase = h4Var.getCheckBox().getCheckBoxBase();
        if (zzVar.d2.contains(Long.valueOf(j3))) {
        }
        if (checkBoxBase.h != f10) {
        }
        h4Var.c(zzVar.e2.contains(Long.valueOf(j3)), false);
        h4Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, org.telegram.ui.Cells.h4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, org.telegram.ui.Components.wz] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, org.telegram.ui.Cells.y8] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        yz yzVar;
        yz yzVar2;
        zz zzVar = this.c;
        if (i7 == 0) {
            yzVar = new yz(zzVar, zzVar.getContext(), (zzVar.V1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || zzVar.W1 != null, zzVar.b2, zzVar.Z1, zzVar.a2);
            zzVar.j2 = yzVar;
        } else {
            yzVar = null;
            if (i7 == 1) {
                ?? y8Var = new org.telegram.ui.Cells.y8(zzVar.getContext());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.a7, y8Var, null);
                yzVar2 = y8Var;
            } else if (i7 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(zzVar.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, h4Var, null);
                yzVar = h4Var;
            } else if (i7 == 3) {
                ?? wzVar = new wz(zzVar.getContext());
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, wzVar, null);
                yzVar2 = wzVar;
            }
            yzVar = yzVar2;
        }
        return new cj0(yzVar);
    }
}
