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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class y00 extends xl0 {
    public final /* synthetic */ e10 c;

    public y00(e10 e10Var) {
        this.c = e10Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f != 2) {
            return false;
        }
        int b10 = c1Var.b();
        e10 e10Var = this.c;
        return b10 >= e10Var.r0 && c1Var.b() <= e10Var.s0;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.o0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        e10 e10Var = this.c;
        e10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == e10Var.p0 || i10 == e10Var.t0 || i10 == e10Var.x0) {
            return 1;
        }
        return (i10 == e10Var.q0 || i10 == e10Var.u0) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j3;
        String str;
        String str2;
        CheckBoxBase checkBoxBase;
        float f7;
        TLRPC.Chat chat;
        e10 e10Var = this.c;
        ArrayList arrayList2 = e10Var.g0;
        org.telegram.ui.ActionBar.m2 m2Var = e10Var.n;
        int i11 = c1Var.f;
        View view = c1Var.a;
        TLRPC.User user = null;
        if (i11 != 2) {
            if (i11 == 3) {
                b10 b10Var = (b10) view;
                if (i10 == e10Var.u0) {
                    b10Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    b10Var.a("", null);
                    return;
                } else {
                    e10Var.y0 = b10Var;
                    e10Var.V();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    e10Var.n0 = (d10) view;
                    e10Var.U(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setForeground(org.telegram.ui.ActionBar.h6.V0(e10Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
            if (i10 == e10Var.x0 || i10 == e10Var.p0 || arrayList2 == null || arrayList2.isEmpty()) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
            e9Var.setFixedSize(0);
            if (e10Var.b0) {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        int i12 = e10Var.r0;
        if (i10 < i12 || i10 > e10Var.s0) {
            int i13 = e10Var.v0;
            if (i10 >= i13 && i10 <= e10Var.w0 && (arrayList = e10Var.j0) != null) {
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
                j3 = peer.user_id;
                user = m2Var.getMessagesController().getUser(Long.valueOf(peer.user_id));
                str = UserObject.getUserName(user);
                str2 = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUser) : LocaleController.getString(R.string.FilterInviteBot);
            } else {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j3 = -peer.chat_id;
                    chat = m2Var.getMessagesController().getChat(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j3 = -peer.channel_id;
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
            g4Var.setTag(Long.valueOf(j3));
            checkBoxBase = g4Var.getCheckBox().getCheckBoxBase();
            f7 = !e10Var.h0.contains(Long.valueOf(j3)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f7) {
                checkBoxBase.h = f7;
                checkBoxBase.b();
            }
            g4Var.c(e10Var.i0.contains(Long.valueOf(j3)), false);
            g4Var.d(user, str, str2);
        }
        j3 = 0;
        str = null;
        str2 = null;
        if (user instanceof TLRPC.Chat) {
        }
        g4Var.setTag(Long.valueOf(j3));
        checkBoxBase = g4Var.getCheckBox().getCheckBoxBase();
        if (!e10Var.h0.contains(Long.valueOf(j3))) {
        }
        if (checkBoxBase.h != f7) {
        }
        g4Var.c(e10Var.i0.contains(Long.valueOf(j3)), false);
        g4Var.d(user, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, org.telegram.ui.Components.b10] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, org.telegram.ui.Cells.e9] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View, org.telegram.ui.Cells.g4] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d10 d10Var;
        d10 d10Var2;
        e10 e10Var = this.c;
        if (i10 == 0) {
            d10Var = new d10(e10Var, e10Var.getContext(), (e10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || e10Var.a0 != null, e10Var.f0, e10Var.d0, e10Var.e0);
            e10Var.n0 = d10Var;
        } else {
            d10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(e10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.a7, false));
                d10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(e10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                d10Var = g4Var;
            } else if (i10 == 3) {
                ?? b10Var = new b10(e10Var.getContext());
                b10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                d10Var2 = b10Var;
            }
            d10Var = d10Var2;
        }
        return new il0(d10Var);
    }
}
