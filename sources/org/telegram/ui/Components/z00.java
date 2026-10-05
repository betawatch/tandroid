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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class z00 extends yl0 {
    public final /* synthetic */ f10 c;

    public z00(f10 f10Var) {
        this.c = f10Var;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f != 2) {
            return false;
        }
        int b10 = c1Var.b();
        f10 f10Var = this.c;
        return b10 >= f10Var.r0 && c1Var.b() <= f10Var.s0;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.o0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        f10 f10Var = this.c;
        f10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == f10Var.p0 || i10 == f10Var.t0 || i10 == f10Var.x0) {
            return 1;
        }
        return (i10 == f10Var.q0 || i10 == f10Var.u0) ? 3 : 2;
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
        f10 f10Var = this.c;
        ArrayList arrayList2 = f10Var.g0;
        org.telegram.ui.ActionBar.n2 n2Var = f10Var.n;
        int i11 = c1Var.f;
        View view = c1Var.a;
        TLRPC.User user = null;
        if (i11 != 2) {
            if (i11 == 3) {
                c10 c10Var = (c10) view;
                if (i10 == f10Var.u0) {
                    c10Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    c10Var.a("", null);
                    return;
                } else {
                    f10Var.y0 = c10Var;
                    f10Var.T();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    f10Var.n0 = (e10) view;
                    f10Var.S(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setForeground(org.telegram.ui.ActionBar.i6.V0(f10Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.b7));
            if (i10 == f10Var.x0 || i10 == f10Var.p0 || arrayList2 == null || arrayList2.isEmpty()) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
            e9Var.setFixedSize(0);
            if (f10Var.b0) {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        int i12 = f10Var.r0;
        if (i10 < i12 || i10 > f10Var.s0) {
            int i13 = f10Var.v0;
            if (i10 >= i13 && i10 <= f10Var.w0 && (arrayList = f10Var.j0) != null) {
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
            g4Var.setTag(Long.valueOf(j3));
            checkBoxBase = g4Var.getCheckBox().getCheckBoxBase();
            f7 = !f10Var.h0.contains(Long.valueOf(j3)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f7) {
                checkBoxBase.h = f7;
                checkBoxBase.b();
            }
            g4Var.c(f10Var.i0.contains(Long.valueOf(j3)), false);
            g4Var.d(user, str, str2);
        }
        j3 = 0;
        str = null;
        str2 = null;
        if (user instanceof TLRPC.Chat) {
        }
        g4Var.setTag(Long.valueOf(j3));
        checkBoxBase = g4Var.getCheckBox().getCheckBoxBase();
        if (!f10Var.h0.contains(Long.valueOf(j3))) {
        }
        if (checkBoxBase.h != f7) {
        }
        g4Var.c(f10Var.i0.contains(Long.valueOf(j3)), false);
        g4Var.d(user, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, org.telegram.ui.Components.c10] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View, org.telegram.ui.Cells.e9] */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.view.View, org.telegram.ui.Cells.g4] */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e10 e10Var;
        e10 e10Var2;
        f10 f10Var = this.c;
        if (i10 == 0) {
            e10Var = new e10(f10Var, f10Var.getContext(), (f10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || f10Var.a0 != null, f10Var.f0, f10Var.d0, f10Var.e0);
            f10Var.n0 = e10Var;
        } else {
            e10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(f10Var.getContext());
                e9Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.a7, false));
                e10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? g4Var = new org.telegram.ui.Cells.g4(f10Var.getContext(), 1, 0, false);
                g4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                e10Var = g4Var;
            } else if (i10 == 3) {
                ?? c10Var = new c10(f10Var.getContext());
                c10Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                e10Var2 = c10Var;
            }
            e10Var = e10Var2;
        }
        return new il0(e10Var);
    }
}
