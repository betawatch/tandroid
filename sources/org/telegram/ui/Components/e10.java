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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class e10 extends lm0 {
    public final /* synthetic */ k10 c;

    public e10(k10 k10Var) {
        this.c = k10Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f != 2) {
            return false;
        }
        int b10 = b1Var.b();
        k10 k10Var = this.c;
        return b10 >= k10Var.r0 && b1Var.b() <= k10Var.s0;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.o0;
    }

    @Override // s4.g0
    public final int j(int i10) {
        k10 k10Var = this.c;
        k10Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == k10Var.p0 || i10 == k10Var.t0 || i10 == k10Var.x0) {
            return 1;
        }
        return (i10 == k10Var.q0 || i10 == k10Var.u0) ? 3 : 2;
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
        k10 k10Var = this.c;
        ArrayList arrayList2 = k10Var.g0;
        org.telegram.ui.ActionBar.o2 o2Var = k10Var.n;
        int i11 = b1Var.f;
        View view = b1Var.a;
        TLRPC.User user = null;
        if (i11 != 2) {
            if (i11 == 3) {
                h10 h10Var = (h10) view;
                if (i10 == k10Var.u0) {
                    h10Var.b(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                    h10Var.a("", null);
                    return;
                } else {
                    k10Var.y0 = h10Var;
                    k10Var.W();
                    return;
                }
            }
            if (i11 != 1) {
                if (i11 == 0) {
                    k10Var.n0 = (j10) view;
                    k10Var.V(false);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setForeground(org.telegram.ui.ActionBar.k6.X0(k10Var.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
            if (i10 == k10Var.x0 || i10 == k10Var.p0 || arrayList2 == null || arrayList2.isEmpty()) {
                e9Var.setFixedSize(12);
                e9Var.setText("");
                return;
            }
            e9Var.setFixedSize(0);
            if (k10Var.b0) {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                return;
            } else {
                e9Var.setText(LocaleController.getString(R.string.FolderLinkHint));
                return;
            }
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        int i12 = k10Var.r0;
        if (i10 < i12 || i10 > k10Var.s0) {
            int i13 = k10Var.v0;
            if (i10 >= i13 && i10 <= k10Var.w0 && (arrayList = k10Var.j0) != null) {
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
            f4Var.setTag(Long.valueOf(j10));
            checkBoxBase = f4Var.getCheckBox().getCheckBoxBase();
            f7 = !k10Var.h0.contains(Long.valueOf(j10)) ? 0.5f : 1.0f;
            if (checkBoxBase.h != f7) {
                checkBoxBase.h = f7;
                checkBoxBase.b();
            }
            f4Var.c(k10Var.i0.contains(Long.valueOf(j10)), false);
            f4Var.d(user, str, str2);
        }
        j10 = 0;
        str = null;
        str2 = null;
        if (user instanceof TLRPC.Chat) {
        }
        f4Var.setTag(Long.valueOf(j10));
        checkBoxBase = f4Var.getCheckBox().getCheckBoxBase();
        if (!k10Var.h0.contains(Long.valueOf(j10))) {
        }
        if (checkBoxBase.h != f7) {
        }
        f4Var.c(k10Var.i0.contains(Long.valueOf(j10)), false);
        f4Var.d(user, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, org.telegram.ui.Cells.f4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, org.telegram.ui.Components.h10] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, org.telegram.ui.Cells.e9] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        j10 j10Var;
        j10 j10Var2;
        k10 k10Var = this.c;
        if (i10 == 0) {
            j10Var = new j10(k10Var, k10Var.getContext(), (k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || k10Var.a0 != null, k10Var.f0, k10Var.d0, k10Var.e0);
            k10Var.n0 = j10Var;
        } else {
            j10Var = null;
            if (i10 == 1) {
                ?? e9Var = new org.telegram.ui.Cells.e9(k10Var.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, e9Var, null);
                j10Var2 = e9Var;
            } else if (i10 == 2) {
                ?? f4Var = new org.telegram.ui.Cells.f4(k10Var.getContext(), 1, 0, false);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, f4Var, null);
                j10Var = f4Var;
            } else if (i10 == 3) {
                ?? h10Var = new h10(k10Var.getContext());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, h10Var, null);
                j10Var2 = h10Var;
            }
            j10Var = j10Var2;
        }
        return new wl0(j10Var);
    }
}
