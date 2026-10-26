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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kz extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ lz c;

    public kz(lz lzVar) {
        this.c = lzVar;
    }

    @Override // org.telegram.ui.Components.lm0
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
        lz lzVar = this.c;
        if (i10 == lzVar.N || i10 == lzVar.J) {
            return 2;
        }
        if (i10 == lzVar.H) {
            return 3;
        }
        if (i10 < lzVar.L || i10 >= lzVar.M) {
            return (i10 == lzVar.K || i10 == lzVar.I) ? 5 : 0;
        }
        return 4;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        lz lzVar = this.c;
        ArrayList arrayList = lzVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            lzVar.P = (bz) view;
            lzVar.h0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 != lzVar.N) {
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
            ez ezVar = (ez) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            bi.md mdVar = ezVar.h;
            org.telegram.ui.ActionBar.b6 b6Var = ezVar.c;
            TextView textView = ezVar.n;
            ImageView imageView = ezVar.d;
            bi.md mdVar2 = ezVar.f;
            ezVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            b6Var.l(str4, false);
            if (ezVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = ezVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ezVar.w = null;
                }
                float f7 = str4 != null ? 1.0f : 0.0f;
                ezVar.v = f7;
                dz dzVar = ezVar.e;
                dzVar.d = f7;
                dzVar.invalidate();
                mdVar2.setAlpha(ezVar.v);
                ezVar.h.setAlpha(ezVar.v);
                imageView.setAlpha(ezVar.v);
                textView.setAlpha(1.0f - ezVar.v);
                b6Var.setAlpha(ezVar.v);
                ezVar.b.setAlpha(1.0f - ezVar.v);
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
                if (k10Var == lzVar.O) {
                    lzVar.O = null;
                }
                if (i10 == lzVar.I) {
                    k10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    k10Var.a("", null);
                    return;
                }
                lzVar.O = k10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    lzVar.g0(false);
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
        Long l4 = (Long) lzVar.h.get(i10 - lzVar.L);
        long longValue = l4.longValue();
        if (longValue >= 0) {
            TLRPC.User user = lzVar.getMessagesController().getUser(l4);
            if (user != null) {
                str2 = UserObject.getUserName(user);
                chat = user;
            } else {
                str2 = null;
                chat = user;
            }
        } else {
            TLRPC.Chat chat2 = lzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
            k4Var.c(lzVar.e.contains(l4), false);
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
        lz lzVar = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.i9(lzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    k10Var = new jz(this, lzVar.getParentActivity(), lzVar);
                    k10Var.setLayoutParams(new s4.q0(-1, -2));
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k10Var, null);
                } else if (i10 == 4) {
                    View k4Var = new org.telegram.ui.Cells.k4(lzVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k4Var, null);
                    view = k4Var;
                } else if (i10 == 5) {
                    k10Var = new org.telegram.ui.Components.k10(lzVar.getParentActivity());
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, k10Var, null);
                }
                view2 = k10Var;
            }
            return new org.telegram.ui.Components.vl0(view2);
        }
        Activity parentActivity = lzVar.getParentActivity();
        int i11 = R.raw.folder_share;
        bz bzVar = new bz(parentActivity);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(parentActivity);
        ak0Var.f(i11, 90, 90, null);
        ak0Var.setScaleType(ImageView.ScaleType.CENTER);
        ak0Var.d();
        ak0Var.setImportantForAccessibility(2);
        bzVar.addView(ak0Var, org.telegram.ui.Components.gb1.h(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        xh.n nVar = new xh.n(parentActivity);
        bzVar.a = nVar;
        org.telegram.ui.ActionBar.f7.V(nVar, org.telegram.ui.ActionBar.y6.B6, null);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setLines(2);
        bzVar.addView(nVar, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = bzVar;
        view2 = view;
        return new org.telegram.ui.Components.vl0(view2);
    }
}
