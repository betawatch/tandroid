package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nz extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ oz c;

    public nz(oz ozVar) {
        this.c = ozVar;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        oz ozVar = this.c;
        if (i10 == ozVar.N || i10 == ozVar.J) {
            return 2;
        }
        if (i10 == ozVar.H) {
            return 3;
        }
        if (i10 < ozVar.L || i10 >= ozVar.M) {
            return (i10 == ozVar.K || i10 == ozVar.I) ? 5 : 0;
        }
        return 4;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        oz ozVar = this.c;
        ArrayList arrayList = ozVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            ozVar.P = (dz) view;
            ozVar.h0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 != ozVar.N) {
                i9Var.setFixedSize(12);
                return;
            }
            i9Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                i9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                i9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String str3 = null;
        if (i11 == 3) {
            gz gzVar = (gz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            bi.md mdVar = gzVar.h;
            org.telegram.ui.ActionBar.b6 b6Var = gzVar.c;
            TextView textView = gzVar.n;
            ImageView imageView = gzVar.d;
            bi.md mdVar2 = gzVar.f;
            gzVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            b6Var.l(str4, false);
            if (gzVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = gzVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    gzVar.w = null;
                }
                float f7 = str4 != null ? 1.0f : 0.0f;
                gzVar.v = f7;
                fz fzVar = gzVar.e;
                fzVar.d = f7;
                fzVar.invalidate();
                mdVar2.setAlpha(gzVar.v);
                gzVar.h.setAlpha(gzVar.v);
                imageView.setAlpha(gzVar.v);
                textView.setAlpha(1.0f - gzVar.v);
                b6Var.setAlpha(gzVar.v);
                gzVar.b.setAlpha(1.0f - gzVar.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    mdVar2.setVisibility(8);
                    mdVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                mdVar2.setVisibility(0);
                mdVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) view;
                if (k10Var == ozVar.O) {
                    ozVar.O = null;
                }
                if (i10 == ozVar.I) {
                    k10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    k10Var.a("", null);
                    return;
                }
                ozVar.O = k10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    ozVar.g0(false);
                    return;
                } else {
                    k10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    k10Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        Long l4 = (Long) ozVar.h.get(i10 - ozVar.L);
        long longValue = l4.longValue();
        if (longValue >= 0) {
            TLRPC.User user = ozVar.getMessagesController().getUser(l4);
            if (user != null) {
                str2 = UserObject.getUserName(user);
                chat = user;
            } else {
                str2 = null;
                chat = user;
            }
        } else {
            TLRPC.Chat chat2 = ozVar.getMessagesController().getChat(Long.valueOf(-longValue));
            if (chat2 != null) {
                str3 = chat2.title;
                str = chat2.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count) : LocaleController.formatPluralStringComma("Members", chat2.participants_count) : ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.getString("ChannelPublic") : LocaleController.getString("MegaPublic");
            } else {
                str = null;
            }
            String str5 = str3;
            str3 = str;
            str2 = str5;
            chat = chat2;
        }
        if (arrayList.contains(l4)) {
            k4Var.setForbiddenCheck(false);
            k4Var.c(ozVar.e.contains(l4), false);
        } else {
            k4Var.setForbiddenCheck(true);
            k4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str3 = ((TLRPC.User) chat).bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
            } else if (chat instanceof TLRPC.Chat) {
                str3 = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
            }
        }
        k4Var.setTag(l4);
        k4Var.d(chat, str2, str3);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View k10Var;
        View view;
        oz ozVar = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.i9(ozVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    k10Var = new mz(this, ozVar.getParentActivity(), ozVar);
                    k10Var.setLayoutParams(new s4.q0(-1, -2));
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k10Var, null);
                } else if (i10 == 4) {
                    View k4Var = new org.telegram.ui.Cells.k4(ozVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k4Var, null);
                    view = k4Var;
                } else if (i10 == 5) {
                    k10Var = new org.telegram.ui.Components.k10(ozVar.getParentActivity());
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k10Var, null);
                }
                view2 = k10Var;
            }
            return new org.telegram.ui.Components.wl0(view2);
        }
        Activity parentActivity = ozVar.getParentActivity();
        int i11 = R.raw.folder_share;
        dz dzVar = new dz(parentActivity);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(parentActivity);
        bk0Var.f(i11, 90, 90, null);
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        bk0Var.d();
        bk0Var.setImportantForAccessibility(2);
        dzVar.addView(bk0Var, org.telegram.ui.Components.kb1.h(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        xh.n nVar = new xh.n(parentActivity);
        dzVar.a = nVar;
        org.telegram.ui.ActionBar.f7.V(nVar, org.telegram.ui.ActionBar.y6.B6, null);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setLines(2);
        dzVar.addView(nVar, org.telegram.ui.Components.kb1.h(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = dzVar;
        view2 = view;
        return new org.telegram.ui.Components.wl0(view2);
    }
}
