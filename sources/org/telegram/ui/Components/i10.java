package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i10 extends lm0 {
    public final /* synthetic */ o10 c;

    public i10(o10 o10Var) {
        this.c = o10Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f != 2) {
            return false;
        }
        int b10 = b1Var.b();
        o10 o10Var = this.c;
        return b10 >= o10Var.r0 && b1Var.b() <= o10Var.s0;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.o0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        o10 o10Var = this.c;
        o10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == o10Var.p0 || i10 == o10Var.t0 || i10 == o10Var.x0) {
            return 1;
        }
        return (i10 == o10Var.q0 || i10 == o10Var.u0) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j10;
        String str;
        String str2;
        CheckBoxBase checkBoxBase;
        float f7;
        TLRPC.Chat chat;
        o10 o10Var = this.c;
        ArrayList arrayList2 = o10Var.g0;
        org.telegram.ui.ActionBar.m2 m2Var = o10Var.n;
        int i11 = b1Var.f;
        View view = b1Var.a;
        TLRPC.User user = null;
        if (i11 != 2) {
            if (i11 == 3) {
                l10 l10Var = (l10) view;
                if (i10 == o10Var.u0) {
                    l10Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    l10Var.a("", null);
                    return;
                } else {
                    o10Var.y0 = l10Var;
                    o10Var.W();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    o10Var.n0 = (n10) view;
                    o10Var.V(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setForeground(org.telegram.ui.ActionBar.g6.W0(o10Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
            if (i10 == o10Var.x0 || i10 == o10Var.p0 || arrayList2 == null || arrayList2.isEmpty()) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
            e9Var.setFixedSize(0);
            if (o10Var.b0) {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        int i12 = o10Var.r0;
        if (i10 < i12 || i10 > o10Var.s0) {
            int i13 = o10Var.v0;
            if (i10 >= i13 && i10 <= o10Var.w0 && (arrayList = o10Var.j0) != null) {
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
                user = m2Var.getMessagesController().getUser(Long.valueOf(peer.user_id));
                str = UserObject.getUserName(user);
                str2 = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUser) : LocaleController.getString(R.string.FilterInviteBot);
            } else {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j10 = -peer.chat_id;
                    chat = m2Var.getMessagesController().getChat(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j10 = -peer.channel_id;
                    chat = m2Var.getMessagesController().getChat(Long.valueOf(peer.channel_id));
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
            f7 = !o10Var.h0.contains(Long.valueOf(j10)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f7) {
                checkBoxBase.h = f7;
                checkBoxBase.b();
            }
            g4Var.c(o10Var.i0.contains(Long.valueOf(j10)), false);
            g4Var.d(user, str, str2);
        }
        j10 = 0;
        str = null;
        str2 = null;
        if (user instanceof TLRPC.Chat) {
        }
        g4Var.setTag(Long.valueOf(j10));
        checkBoxBase = g4Var.getCheckBox().getCheckBoxBase();
        if (!o10Var.h0.contains(Long.valueOf(j10))) {
        }
        if (checkBoxBase.h != f7) {
        }
        g4Var.c(o10Var.i0.contains(Long.valueOf(j10)), false);
        g4Var.d(user, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, org.telegram.ui.Components.l10] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, org.telegram.ui.Cells.e9] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View, org.telegram.ui.Cells.g4] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        n10 n10Var;
        n10 n10Var2;
        o10 o10Var = this.c;
        if (i10 == 0) {
            boolean z10 = false;
            Context context = o10Var.getContext();
            if ((o10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || o10Var.a0 != null) {
                z10 = true;
            }
            n10Var = new n10(o10Var, context, z10, o10Var.f0, o10Var.d0, o10Var.e0);
            o10Var.n0 = n10Var;
        } else {
            n10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(o10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false));
                n10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(1, 0, o10Var.getContext(), false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                n10Var = g4Var;
            } else if (i10 == 3) {
                ?? l10Var = new l10(o10Var.getContext());
                l10Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                n10Var2 = l10Var;
            }
            n10Var = n10Var2;
        }
        return new wl0(n10Var);
    }
}
