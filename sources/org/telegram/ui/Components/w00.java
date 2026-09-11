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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class w00 extends kl0 {
    public final /* synthetic */ c10 c;

    public w00(c10 c10Var) {
        this.c = c10Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f != 2) {
            return false;
        }
        int b10 = c1Var.b();
        c10 c10Var = this.c;
        return b10 >= c10Var.r0 && c1Var.b() <= c10Var.s0;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.o0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        c10 c10Var = this.c;
        c10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == c10Var.p0 || i10 == c10Var.t0 || i10 == c10Var.x0) {
            return 1;
        }
        return (i10 == c10Var.q0 || i10 == c10Var.u0) ? 3 : 2;
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
        c10 c10Var = this.c;
        ArrayList arrayList2 = c10Var.g0;
        org.telegram.ui.ActionBar.n2 n2Var = c10Var.n;
        int i11 = c1Var.f;
        View view = c1Var.a;
        TLRPC.User user = null;
        if (i11 != 2) {
            if (i11 == 3) {
                z00 z00Var = (z00) view;
                if (i10 == c10Var.u0) {
                    z00Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    z00Var.a("", null);
                    return;
                } else {
                    c10Var.y0 = z00Var;
                    c10Var.V();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    c10Var.n0 = (b10) view;
                    c10Var.U(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setForeground(org.telegram.ui.ActionBar.j6.V0(c10Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
            if (i10 == c10Var.x0 || i10 == c10Var.p0 || arrayList2 == null || arrayList2.isEmpty()) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
            e9Var.setFixedSize(0);
            if (c10Var.b0) {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        int i12 = c10Var.r0;
        if (i10 < i12 || i10 > c10Var.s0) {
            int i13 = c10Var.v0;
            if (i10 >= i13 && i10 <= c10Var.w0 && (arrayList = c10Var.j0) != null) {
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
                user = n2Var.getMessagesController().getUser(Long.valueOf(peer.user_id));
                str = UserObject.getUserName(user);
                str2 = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUser) : LocaleController.getString(R.string.FilterInviteBot);
            } else {
                if (peer instanceof TLRPC.TL_peerChat) {
                    j3 = -peer.chat_id;
                    chat = n2Var.getMessagesController().getChat(Long.valueOf(peer.chat_id));
                } else if (peer instanceof TLRPC.TL_peerChannel) {
                    j3 = -peer.channel_id;
                    chat = n2Var.getMessagesController().getChat(Long.valueOf(peer.channel_id));
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
            f4Var.setTag(Long.valueOf(j3));
            checkBoxBase = f4Var.getCheckBox().getCheckBoxBase();
            f7 = !c10Var.h0.contains(Long.valueOf(j3)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f7) {
                checkBoxBase.h = f7;
                checkBoxBase.b();
            }
            f4Var.c(c10Var.i0.contains(Long.valueOf(j3)), false);
            f4Var.d(user, str, str2);
        }
        j3 = 0;
        str = null;
        str2 = null;
        if (user instanceof TLRPC.Chat) {
        }
        f4Var.setTag(Long.valueOf(j3));
        checkBoxBase = f4Var.getCheckBox().getCheckBoxBase();
        if (!c10Var.h0.contains(Long.valueOf(j3))) {
        }
        if (checkBoxBase.h != f7) {
        }
        f4Var.c(c10Var.i0.contains(Long.valueOf(j3)), false);
        f4Var.d(user, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, org.telegram.ui.Components.z00] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, org.telegram.ui.Cells.e9] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View, org.telegram.ui.Cells.f4] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        b10 b10Var;
        b10 b10Var2;
        c10 c10Var = this.c;
        if (i10 == 0) {
            b10Var = new b10(c10Var, c10Var.getContext(), (c10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || c10Var.a0 != null, c10Var.f0, c10Var.d0, c10Var.e0);
            c10Var.n0 = b10Var;
        } else {
            b10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(c10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
                b10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? f4Var = new org.telegram.ui.Cells.f4(c10Var.getContext(), 1, 0, false);
                f4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                b10Var = f4Var;
            } else if (i10 == 3) {
                ?? z00Var = new z00(c10Var.getContext());
                z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                b10Var2 = z00Var;
            }
            b10Var = b10Var2;
        }
        return new vk0(b10Var);
    }
}
