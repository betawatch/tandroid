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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g10 extends mm0 {
    public final /* synthetic */ n10 c;

    public g10(n10 n10Var) {
        this.c = n10Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f != 2) {
            return false;
        }
        int b10 = e1Var.b();
        n10 n10Var = this.c;
        return b10 >= n10Var.r0 && e1Var.b() <= n10Var.s0;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.o0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        n10 n10Var = this.c;
        n10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == n10Var.p0 || i10 == n10Var.t0 || i10 == n10Var.x0) {
            return 1;
        }
        return (i10 == n10Var.q0 || i10 == n10Var.u0) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j10;
        String str;
        String str2;
        CheckBoxBase checkBoxBase;
        float f7;
        TLRPC.Chat chat;
        n10 n10Var = this.c;
        ArrayList arrayList2 = n10Var.g0;
        org.telegram.ui.ActionBar.r2 r2Var = n10Var.n;
        int i11 = e1Var.f;
        View view = e1Var.a;
        TLRPC.User user = null;
        if (i11 != 2) {
            if (i11 == 3) {
                k10 k10Var = (k10) view;
                if (i10 == n10Var.u0) {
                    k10Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    k10Var.a("", null);
                    return;
                } else {
                    n10Var.y0 = k10Var;
                    n10Var.W();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    n10Var.n0 = (m10) view;
                    n10Var.V(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            i9Var.setForeground(org.telegram.ui.ActionBar.y6.X0(n10Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.y6.b7));
            if (i10 == n10Var.x0 || i10 == n10Var.p0 || arrayList2 == null || arrayList2.isEmpty()) {
                i9Var.setFixedSize(12);
                i9Var.setText("");
                return;
            }
            i9Var.setFixedSize(0);
            if (n10Var.b0) {
                i9Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                i9Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        int i12 = n10Var.r0;
        if (i10 < i12 || i10 > n10Var.s0) {
            int i13 = n10Var.v0;
            if (i10 >= i13 && i10 <= n10Var.w0 && (arrayList = n10Var.j0) != null) {
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
                user = r2Var.getMessagesController().getUser(Long.valueOf(peer.user_id));
                str = UserObject.getUserName(user);
                str2 = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUser) : LocaleController.getString(R.string.FilterInviteBot);
            } else {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j10 = -peer.chat_id;
                    chat = r2Var.getMessagesController().getChat(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j10 = -peer.channel_id;
                    chat = r2Var.getMessagesController().getChat(Long.valueOf(peer.channel_id));
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
            k4Var.setTag(Long.valueOf(j10));
            checkBoxBase = k4Var.getCheckBox().getCheckBoxBase();
            f7 = !n10Var.h0.contains(Long.valueOf(j10)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f7) {
                checkBoxBase.h = f7;
                checkBoxBase.b();
            }
            k4Var.c(n10Var.i0.contains(Long.valueOf(j10)), false);
            k4Var.d(user, str, str2);
        }
        j10 = 0;
        str = null;
        str2 = null;
        if (user instanceof TLRPC.Chat) {
        }
        k4Var.setTag(Long.valueOf(j10));
        checkBoxBase = k4Var.getCheckBox().getCheckBoxBase();
        if (!n10Var.h0.contains(Long.valueOf(j10))) {
        }
        if (checkBoxBase.h != f7) {
        }
        k4Var.c(n10Var.i0.contains(Long.valueOf(j10)), false);
        k4Var.d(user, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, org.telegram.ui.Cells.k4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, org.telegram.ui.Components.k10] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, org.telegram.ui.Cells.i9] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        m10 m10Var;
        m10 m10Var2;
        n10 n10Var = this.c;
        if (i10 == 0) {
            m10Var = new m10(n10Var, n10Var.getContext(), (n10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || n10Var.a0 != null, n10Var.f0, n10Var.d0, n10Var.e0);
            n10Var.n0 = m10Var;
        } else {
            m10Var = null;
            if (i10 == 1) {
                ?? i9Var = new org.telegram.ui.Cells.i9(n10Var.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, i9Var, null);
                m10Var2 = i9Var;
            } else if (i10 == 2) {
                ?? k4Var = new org.telegram.ui.Cells.k4(n10Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k4Var, null);
                m10Var = k4Var;
            } else if (i10 == 3) {
                ?? k10Var = new k10(n10Var.getContext());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k10Var, null);
                m10Var2 = k10Var;
            }
            m10Var = m10Var2;
        }
        return new wl0(m10Var);
    }
}
