package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class oz extends oj0 {
    public final /* synthetic */ vz c;

    public oz(vz vzVar) {
        this.c = vzVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f != 2) {
            return false;
        }
        int b10 = d1Var.b();
        vz vzVar = this.c;
        return b10 >= vzVar.j2 && d1Var.b() <= vzVar.k2;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.g2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        vz vzVar = this.c;
        vzVar.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 == vzVar.h2 || i7 == vzVar.l2 || i7 == vzVar.p2) {
            return 1;
        }
        return (i7 == vzVar.i2 || i7 == vzVar.m2) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
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
        vz vzVar = this.c;
        ArrayList arrayList2 = vzVar.Y1;
        org.telegram.ui.ActionBar.f2 f2Var = vzVar.o1;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 2) {
            if (i10 == 3) {
                sz szVar = (sz) view;
                if (i7 == vzVar.m2) {
                    szVar.b(org.telegram.messenger.hd.M0(2131750663, null), false);
                    szVar.a("", null);
                    return;
                } else {
                    vzVar.q2 = szVar;
                    vzVar.i1();
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == 0) {
                    vzVar.f2 = (uz) view;
                    vzVar.h1(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setForeground(org.telegram.ui.ActionBar.k6.Y0(vzVar.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
            if (i7 == vzVar.p2 || i7 == vzVar.h2 || arrayList2 == null || arrayList2.isEmpty()) {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
            z8Var.setFixedSize(0);
            if (vzVar.T1) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131750655, null));
                return;
            } else {
                z8Var.setText(org.telegram.messenger.hd.M0(2131750656, null));
                return;
            }
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        int i11 = vzVar.j2;
        if (i7 < i11 || i7 > vzVar.k2) {
            int i12 = vzVar.n2;
            if (i7 >= i12 && i7 <= vzVar.o2 && (arrayList = vzVar.b2) != null) {
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
                    chat3 = f2Var.getMessagesController().M0(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j3 = -peer.channel_id;
                    chat3 = f2Var.getMessagesController().M0(Long.valueOf(peer.channel_id));
                }
                str = null;
                chat = chat3;
                str2 = str;
                chat2 = chat;
                if (chat2 instanceof TLRPC.Chat) {
                }
                h4Var.setTag(Long.valueOf(j3));
                checkBoxBase = h4Var.getCheckBox().getCheckBoxBase();
                if (vzVar.Z1.contains(Long.valueOf(j3))) {
                }
                if (checkBoxBase.h != f10) {
                }
                h4Var.c(vzVar.a2.contains(Long.valueOf(j3)), false);
                h4Var.d(chat2, str, str2);
            }
            j3 = peer.user_id;
            TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(peer.user_id));
            str = org.telegram.messenger.t10.p(a22);
            if (a22 == null || !a22.bot) {
                str2 = org.telegram.messenger.hd.M0(2131750740, null);
                chat2 = a22;
            } else {
                str2 = org.telegram.messenger.hd.M0(2131750772, null);
                chat2 = a22;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                str2 = chat4.participants_count != 0 ? org.telegram.messenger.t3.V(chat4) ? org.telegram.messenger.hd.H(',', "Subscribers", chat4.participants_count) : org.telegram.messenger.hd.H(',', "Members", chat4.participants_count) : org.telegram.messenger.t3.V(chat4) ? org.telegram.messenger.hd.M0(2131752318, null) : org.telegram.messenger.hd.M0(2131748637, null);
                str = str3;
            }
            h4Var.setTag(Long.valueOf(j3));
            checkBoxBase = h4Var.getCheckBox().getCheckBoxBase();
            f10 = vzVar.Z1.contains(Long.valueOf(j3)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f10) {
                checkBoxBase.h = f10;
                checkBoxBase.b();
            }
            h4Var.c(vzVar.a2.contains(Long.valueOf(j3)), false);
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
        if (vzVar.Z1.contains(Long.valueOf(j3))) {
        }
        if (checkBoxBase.h != f10) {
        }
        h4Var.c(vzVar.a2.contains(Long.valueOf(j3)), false);
        h4Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, org.telegram.ui.Cells.h4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, org.telegram.ui.Components.sz] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, org.telegram.ui.Cells.z8] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        uz uzVar;
        uz uzVar2;
        vz vzVar = this.c;
        if (i7 == 0) {
            uzVar = new uz(vzVar, vzVar.getContext(), (vzVar.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || vzVar.S1 != null, vzVar.X1, vzVar.V1, vzVar.W1);
            vzVar.f2 = uzVar;
        } else {
            uzVar = null;
            if (i7 == 1) {
                ?? z8Var = new org.telegram.ui.Cells.z8(vzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, z8Var, null);
                uzVar2 = z8Var;
            } else if (i7 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(vzVar.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, h4Var, null);
                uzVar = h4Var;
            } else if (i7 == 3) {
                ?? szVar = new sz(vzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, szVar, null);
                uzVar2 = szVar;
            }
            uzVar = uzVar2;
        }
        return new xi0(uzVar);
    }
}
