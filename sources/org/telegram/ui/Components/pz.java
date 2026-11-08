package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class pz extends oj0 {
    public final /* synthetic */ wz c;

    public pz(wz wzVar) {
        this.c = wzVar;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f != 2) {
            return false;
        }
        int b10 = d1Var.b();
        wz wzVar = this.c;
        return b10 >= wzVar.j2 && d1Var.b() <= wzVar.k2;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.g2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        wz wzVar = this.c;
        wzVar.getClass();
        if (i7 == 0) {
            return 0;
        }
        if (i7 == wzVar.h2 || i7 == wzVar.l2 || i7 == wzVar.p2) {
            return 1;
        }
        return (i7 == wzVar.i2 || i7 == wzVar.m2) ? 3 : 2;
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
        wz wzVar = this.c;
        ArrayList arrayList2 = wzVar.Y1;
        org.telegram.ui.ActionBar.f2 f2Var = wzVar.o1;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 2) {
            if (i10 == 3) {
                tz tzVar = (tz) view;
                if (i7 == wzVar.m2) {
                    tzVar.b(org.telegram.messenger.id.M0(2131750663, null), false);
                    tzVar.a("", null);
                    return;
                } else {
                    wzVar.q2 = tzVar;
                    wzVar.i1();
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == 0) {
                    wzVar.f2 = (vz) view;
                    wzVar.h1(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setForeground(org.telegram.ui.ActionBar.k6.Y0(wzVar.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
            if (i7 == wzVar.p2 || i7 == wzVar.h2 || arrayList2 == null || arrayList2.isEmpty()) {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
            z8Var.setFixedSize(0);
            if (wzVar.T1) {
                z8Var.setText(org.telegram.messenger.id.M0(2131750655, null));
                return;
            } else {
                z8Var.setText(org.telegram.messenger.id.M0(2131750656, null));
                return;
            }
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        int i11 = wzVar.j2;
        if (i7 < i11 || i7 > wzVar.k2) {
            int i12 = wzVar.n2;
            if (i7 >= i12 && i7 <= wzVar.o2 && (arrayList = wzVar.b2) != null) {
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
                if (wzVar.Z1.contains(Long.valueOf(j3))) {
                }
                if (checkBoxBase.h != f10) {
                }
                h4Var.c(wzVar.a2.contains(Long.valueOf(j3)), false);
                h4Var.d(chat2, str, str2);
            }
            j3 = peer.user_id;
            TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(peer.user_id));
            str = org.telegram.messenger.t10.p(a22);
            if (a22 == null || !a22.bot) {
                str2 = org.telegram.messenger.id.M0(2131750740, null);
                chat2 = a22;
            } else {
                str2 = org.telegram.messenger.id.M0(2131750772, null);
                chat2 = a22;
            }
            if (chat2 instanceof TLRPC.Chat) {
                TLRPC.Chat chat4 = chat2;
                String str3 = chat4.title;
                str2 = chat4.participants_count != 0 ? org.telegram.messenger.t3.V(chat4) ? org.telegram.messenger.id.H(',', "Subscribers", chat4.participants_count) : org.telegram.messenger.id.H(',', "Members", chat4.participants_count) : org.telegram.messenger.t3.V(chat4) ? org.telegram.messenger.id.M0(2131752318, null) : org.telegram.messenger.id.M0(2131748639, null);
                str = str3;
            }
            h4Var.setTag(Long.valueOf(j3));
            checkBoxBase = h4Var.getCheckBox().getCheckBoxBase();
            f10 = wzVar.Z1.contains(Long.valueOf(j3)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f10) {
                checkBoxBase.h = f10;
                checkBoxBase.b();
            }
            h4Var.c(wzVar.a2.contains(Long.valueOf(j3)), false);
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
        if (wzVar.Z1.contains(Long.valueOf(j3))) {
        }
        if (checkBoxBase.h != f10) {
        }
        h4Var.c(wzVar.a2.contains(Long.valueOf(j3)), false);
        h4Var.d(chat2, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, org.telegram.ui.Cells.h4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, org.telegram.ui.Components.tz] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, org.telegram.ui.Cells.z8] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        vz vzVar;
        vz vzVar2;
        wz wzVar = this.c;
        if (i7 == 0) {
            vzVar = new vz(wzVar, wzVar.getContext(), (wzVar.R1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || wzVar.S1 != null, wzVar.X1, wzVar.V1, wzVar.W1);
            wzVar.f2 = vzVar;
        } else {
            vzVar = null;
            if (i7 == 1) {
                ?? z8Var = new org.telegram.ui.Cells.z8(wzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, z8Var, null);
                vzVar2 = z8Var;
            } else if (i7 == 2) {
                ?? h4Var = new org.telegram.ui.Cells.h4(wzVar.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, h4Var, null);
                vzVar = h4Var;
            } else if (i7 == 3) {
                ?? tzVar = new tz(wzVar.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, tzVar, null);
                vzVar2 = tzVar;
            }
            vzVar = vzVar2;
        }
        return new xi0(vzVar);
    }
}
