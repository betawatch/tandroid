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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s00 extends il0 {
    public final /* synthetic */ y00 c;

    public s00(y00 y00Var) {
        this.c = y00Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f != 2) {
            return false;
        }
        int b10 = n1Var.b();
        y00 y00Var = this.c;
        return b10 >= y00Var.n0 && n1Var.b() <= y00Var.o0;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.k0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        y00 y00Var = this.c;
        y00Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == y00Var.l0 || i10 == y00Var.p0 || i10 == y00Var.t0) {
            return 1;
        }
        return (i10 == y00Var.m0 || i10 == y00Var.q0) ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        ArrayList arrayList;
        TLRPC.Peer peer;
        long j10;
        String str;
        String str2;
        CheckBoxBase checkBoxBase;
        float f9;
        TLRPC.Chat chat;
        y00 y00Var = this.c;
        ArrayList arrayList2 = y00Var.c0;
        org.telegram.ui.ActionBar.o2 o2Var = y00Var.n;
        int i11 = n1Var.f;
        View view = n1Var.a;
        TLRPC.User user = null;
        if (i11 != 2) {
            if (i11 == 3) {
                v00 v00Var = (v00) view;
                if (i10 == y00Var.q0) {
                    v00Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    v00Var.a("", null);
                    return;
                } else {
                    y00Var.u0 = v00Var;
                    y00Var.V();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    y00Var.j0 = (x00) view;
                    y00Var.U(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setForeground(org.telegram.ui.ActionBar.g6.V0(y00Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
            if (i10 == y00Var.t0 || i10 == y00Var.l0 || arrayList2 == null || arrayList2.isEmpty()) {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
            y8Var.setFixedSize(0);
            if (y00Var.X) {
                y8Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                y8Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
        int i12 = y00Var.n0;
        if (i10 < i12 || i10 > y00Var.o0) {
            int i13 = y00Var.r0;
            if (i10 >= i13 && i10 <= y00Var.s0 && (arrayList = y00Var.f0) != null) {
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
            e4Var.setTag(Long.valueOf(j10));
            checkBoxBase = e4Var.getCheckBox().getCheckBoxBase();
            f9 = !y00Var.d0.contains(Long.valueOf(j10)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f9) {
                checkBoxBase.h = f9;
                checkBoxBase.b();
            }
            e4Var.c(y00Var.e0.contains(Long.valueOf(j10)), false);
            e4Var.d(user, str, str2);
        }
        j10 = 0;
        str = null;
        str2 = null;
        if (user instanceof TLRPC.Chat) {
        }
        e4Var.setTag(Long.valueOf(j10));
        checkBoxBase = e4Var.getCheckBox().getCheckBoxBase();
        if (!y00Var.d0.contains(Long.valueOf(j10))) {
        }
        if (checkBoxBase.h != f9) {
        }
        e4Var.c(y00Var.e0.contains(Long.valueOf(j10)), false);
        e4Var.d(user, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, org.telegram.ui.Components.v00] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, org.telegram.ui.Cells.y8] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View, org.telegram.ui.Cells.e4] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        x00 x00Var;
        x00 x00Var2;
        y00 y00Var = this.c;
        if (i10 == 0) {
            x00Var = new x00(y00Var, y00Var.getContext(), (y00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || y00Var.W != null, y00Var.b0, y00Var.Z, y00Var.a0);
            y00Var.j0 = x00Var;
        } else {
            x00Var = null;
            if (i10 == 1) {
                ?? y8Var = new org.telegram.ui.Cells.y8(y00Var.getContext());
                y8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
                x00Var2 = y8Var;
            } else if (i10 == 2) {
                ?? e4Var = new org.telegram.ui.Cells.e4(y00Var.getContext(), 1, 0, false);
                e4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                x00Var = e4Var;
            } else if (i10 == 3) {
                ?? v00Var = new v00(y00Var.getContext());
                v00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                x00Var2 = v00Var;
            }
            x00Var = x00Var2;
        }
        return new vk0(x00Var);
    }
}
