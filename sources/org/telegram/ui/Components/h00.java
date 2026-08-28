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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h00 extends vk0 {
    public final /* synthetic */ n00 c;

    public h00(n00 n00Var) {
        this.c = n00Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f != 2) {
            return false;
        }
        int b10 = q1Var.b();
        n00 n00Var = this.c;
        return b10 >= n00Var.n0 && q1Var.b() <= n00Var.o0;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.k0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        n00 n00Var = this.c;
        n00Var.getClass();
        if (i9 == 0) {
            return 0;
        }
        if (i9 == n00Var.l0 || i9 == n00Var.p0 || i9 == n00Var.t0) {
            return 1;
        }
        return (i9 == n00Var.m0 || i9 == n00Var.q0) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j10;
        String str;
        String str2;
        CheckBoxBase checkBoxBase;
        float f10;
        TLRPC.Chat chat;
        n00 n00Var = this.c;
        ArrayList arrayList2 = n00Var.c0;
        org.telegram.ui.ActionBar.o2 o2Var = n00Var.n;
        int i10 = q1Var.f;
        View view = q1Var.a;
        TLRPC.User user = null;
        if (i10 != 2) {
            if (i10 == 3) {
                k00 k00Var = (k00) view;
                if (i9 == n00Var.q0) {
                    k00Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    k00Var.a("", null);
                    return;
                } else {
                    n00Var.u0 = k00Var;
                    n00Var.U();
                    return;
                }
            }
            if (i10 != 1) {
                if (i10 == 0) {
                    n00Var.j0 = (m00) view;
                    n00Var.T(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setForeground(org.telegram.ui.ActionBar.f6.V0(n00Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
            if (i9 == n00Var.t0 || i9 == n00Var.l0 || arrayList2 == null || arrayList2.isEmpty()) {
                b9Var.setFixedSize(12);
                b9Var.setText("");
                return;
            }
            b9Var.setFixedSize(0);
            if (n00Var.X) {
                b9Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                b9Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        int i11 = n00Var.n0;
        if (i9 < i11 || i9 > n00Var.o0) {
            int i12 = n00Var.r0;
            if (i9 >= i12 && i9 <= n00Var.s0 && (arrayList = n00Var.f0) != null) {
                peer = (TLRPC.Peer) arrayList.get(i9 - i12);
            }
            peer = null;
        } else {
            if (arrayList2 != null) {
                peer = (TLRPC.Peer) arrayList2.get(i9 - i11);
            }
            peer = null;
        }
        if (peer != null) {
            if (peer instanceof TLRPC.TL_peerUser) {
                j10 = peer.user_id;
                user = o2Var.getMessagesController().getUser(Long.valueOf(peer.user_id));
                str = UserObject.getUserName(user);
                str2 = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUser) : LocaleController.getString(R.string.FilterInviteBot);
            } else {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j10 = -peer.chat_id;
                    chat = o2Var.getMessagesController().getChat(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j10 = -peer.channel_id;
                    chat = o2Var.getMessagesController().getChat(Long.valueOf(peer.channel_id));
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
            f10 = !n00Var.d0.contains(Long.valueOf(j10)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f10) {
                checkBoxBase.h = f10;
                checkBoxBase.b();
            }
            g4Var.c(n00Var.e0.contains(Long.valueOf(j10)), false);
            g4Var.d(user, str, str2);
        }
        j10 = 0;
        str = null;
        str2 = null;
        if (user instanceof TLRPC.Chat) {
        }
        g4Var.setTag(Long.valueOf(j10));
        checkBoxBase = g4Var.getCheckBox().getCheckBoxBase();
        if (!n00Var.d0.contains(Long.valueOf(j10))) {
        }
        if (checkBoxBase.h != f10) {
        }
        g4Var.c(n00Var.e0.contains(Long.valueOf(j10)), false);
        g4Var.d(user, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, org.telegram.ui.Components.k00] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, org.telegram.ui.Cells.b9] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View, org.telegram.ui.Cells.g4] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        m00 m00Var;
        m00 m00Var2;
        n00 n00Var = this.c;
        if (i9 == 0) {
            m00Var = new m00(n00Var, n00Var.getContext(), (n00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || n00Var.W != null, n00Var.b0, n00Var.Z, n00Var.a0);
            n00Var.j0 = m00Var;
        } else {
            m00Var = null;
            if (i9 == 1) {
                ?? b9Var = new org.telegram.ui.Cells.b9(n00Var.getContext());
                b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
                m00Var2 = b9Var;
            } else if (i9 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(n00Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                m00Var = g4Var;
            } else if (i9 == 3) {
                ?? k00Var = new k00(n00Var.getContext());
                k00Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                m00Var2 = k00Var;
            }
            m00Var = m00Var2;
        }
        return new ik0(m00Var);
    }
}
