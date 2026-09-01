package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x00 extends sl0 {
    public final /* synthetic */ d10 c;

    public x00(d10 d10Var) {
        this.c = d10Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f != 2) {
            return false;
        }
        int b10 = m1Var.b();
        d10 d10Var = this.c;
        return b10 >= d10Var.o0 && m1Var.b() <= d10Var.p0;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.l0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        d10 d10Var = this.c;
        d10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == d10Var.m0 || i10 == d10Var.q0 || i10 == d10Var.u0) {
            return 1;
        }
        return (i10 == d10Var.n0 || i10 == d10Var.r0) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j10;
        String str;
        String str2;
        CheckBoxBase checkBoxBase;
        float f10;
        TLRPC.Chat chat;
        d10 d10Var = this.c;
        ArrayList arrayList2 = d10Var.d0;
        org.telegram.ui.ActionBar.p2 p2Var = d10Var.n;
        int i11 = m1Var.f;
        View view = m1Var.a;
        TLRPC.User user = null;
        if (i11 != 2) {
            if (i11 == 3) {
                a10 a10Var = (a10) view;
                if (i10 == d10Var.r0) {
                    a10Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    a10Var.a("", null);
                    return;
                } else {
                    d10Var.v0 = a10Var;
                    d10Var.V();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    d10Var.k0 = (c10) view;
                    d10Var.U(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setForeground(org.telegram.ui.ActionBar.k6.V0(d10Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
            if (i10 == d10Var.u0 || i10 == d10Var.m0 || arrayList2 == null || arrayList2.isEmpty()) {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
            a9Var.setFixedSize(0);
            if (d10Var.Y) {
                a9Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                a9Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        int i12 = d10Var.o0;
        if (i10 < i12 || i10 > d10Var.p0) {
            int i13 = d10Var.s0;
            if (i10 >= i13 && i10 <= d10Var.t0 && (arrayList = d10Var.g0) != null) {
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
            if (peer instanceof TLRPC.TL_peerUser) {
                j10 = peer.user_id;
                user = p2Var.getMessagesController().getUser(Long.valueOf(peer.user_id));
                str = UserObject.getUserName(user);
                str2 = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUser) : LocaleController.getString(R.string.FilterInviteBot);
            } else {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j10 = -peer.chat_id;
                    chat = p2Var.getMessagesController().getChat(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j10 = -peer.channel_id;
                    chat = p2Var.getMessagesController().getChat(Long.valueOf(peer.channel_id));
                }
                str2 = null;
                user = chat;
                str = null;
            }
            if (user instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) user;
                String str3 = chat2.title;
                str2 = chat2.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count) : LocaleController.formatPluralStringComma("Members", chat2.participants_count) : ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.getString(R.string.ChannelPublic) : LocaleController.getString(R.string.MegaPublic);
                str = str3;
            }
            g4Var.setTag(Long.valueOf(j10));
            checkBoxBase = g4Var.getCheckBox().getCheckBoxBase();
            f10 = !d10Var.e0.contains(Long.valueOf(j10)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f10) {
                checkBoxBase.h = f10;
                checkBoxBase.b();
            }
            g4Var.c(d10Var.f0.contains(Long.valueOf(j10)), false);
            g4Var.d(user, str, str2);
        }
        j10 = 0;
        str = null;
        str2 = null;
        if (user instanceof TLRPC.Chat) {
        }
        g4Var.setTag(Long.valueOf(j10));
        checkBoxBase = g4Var.getCheckBox().getCheckBoxBase();
        if (!d10Var.e0.contains(Long.valueOf(j10))) {
        }
        if (checkBoxBase.h != f10) {
        }
        g4Var.c(d10Var.f0.contains(Long.valueOf(j10)), false);
        g4Var.d(user, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, org.telegram.ui.Components.a10] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, org.telegram.ui.Cells.a9] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View, org.telegram.ui.Cells.g4] */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        c10 c10Var;
        c10 c10Var2;
        d10 d10Var = this.c;
        if (i10 == 0) {
            c10Var = new c10(d10Var, d10Var.getContext(), (d10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || d10Var.X != null, d10Var.c0, d10Var.a0, d10Var.b0);
            d10Var.k0 = c10Var;
        } else {
            c10Var = null;
            if (i10 == 1) {
                ?? a9Var = new org.telegram.ui.Cells.a9(d10Var.getContext());
                a9Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
                c10Var2 = a9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(d10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                c10Var = g4Var;
            } else if (i10 == 3) {
                ?? a10Var = new a10(d10Var.getContext());
                a10Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                c10Var2 = a10Var;
            }
            c10Var = c10Var2;
        }
        return new fl0(c10Var);
    }
}
