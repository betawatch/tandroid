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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g00 extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ h00 c;

    public g00(h00 h00Var) {
        this.c = h00Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 4;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.H;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        h00 h00Var = this.c;
        if (i10 == h00Var.O || i10 == h00Var.K) {
            return 2;
        }
        if (i10 == h00Var.I) {
            return 3;
        }
        if (i10 < h00Var.M || i10 >= h00Var.N) {
            return (i10 == h00Var.L || i10 == h00Var.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        h00 h00Var = this.c;
        ArrayList arrayList = h00Var.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = h00Var.d;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            h00Var.Q = (xz) view;
            h00Var.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setBackground(org.telegram.ui.ActionBar.g6.W0(h00Var.getParentActivity(), i10 == h00Var.O ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
            if (i10 != h00Var.O) {
                e9Var.setFixedSize(12);
                return;
            }
            e9Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                e9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                e9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String str3 = null;
        if (i11 == 3) {
            a00 a00Var = (a00) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            bi.f4 f4Var = a00Var.h;
            org.telegram.ui.ActionBar.h5 h5Var = a00Var.c;
            TextView textView = a00Var.n;
            ImageView imageView = a00Var.d;
            bi.f4 f4Var2 = a00Var.f;
            a00Var.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            h5Var.l(str4, false);
            if (a00Var.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = a00Var.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    a00Var.w = null;
                }
                float f7 = str4 != null ? 1.0f : 0.0f;
                a00Var.v = f7;
                di.f9 f9Var = a00Var.e;
                f9Var.c = f7;
                f9Var.invalidate();
                f4Var2.setAlpha(a00Var.v);
                a00Var.h.setAlpha(a00Var.v);
                imageView.setAlpha(a00Var.v);
                textView.setAlpha(1.0f - a00Var.v);
                h5Var.setAlpha(a00Var.v);
                a00Var.b.setAlpha(1.0f - a00Var.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    f4Var2.setVisibility(8);
                    f4Var.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                f4Var2.setVisibility(0);
                f4Var.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.l10 l10Var = (org.telegram.ui.Components.l10) view;
                if (l10Var == h00Var.P) {
                    h00Var.P = null;
                }
                if (i10 == h00Var.J) {
                    l10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    l10Var.a("", null);
                    return;
                }
                h00Var.P = l10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    h00Var.f0(false);
                    return;
                } else {
                    l10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    l10Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        Long l4 = (Long) h00Var.h.get(i10 - h00Var.M);
        long longValue = l4.longValue();
        if (longValue >= 0) {
            TLRPC.User user = h00Var.getMessagesController().getUser(l4);
            if (user != null) {
                str2 = UserObject.getUserName(user);
                chat = user;
            } else {
                str2 = null;
                chat = user;
            }
        } else {
            TLRPC.Chat chat2 = h00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
            g4Var.setForbiddenCheck(false);
            g4Var.c(h00Var.e.contains(l4), false);
        } else {
            g4Var.setForbiddenCheck(true);
            g4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str3 = ((TLRPC.User) chat).bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
            } else if (chat instanceof TLRPC.Chat) {
                str3 = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
            }
        }
        g4Var.setTag(l4);
        g4Var.d(chat, str2, str3);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l10Var;
        View view;
        h00 h00Var = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(h00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    l10Var = new f00(this, h00Var.getParentActivity(), h00Var);
                    l10Var.setLayoutParams(new s4.o0(-1, -2));
                    l10Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(1, 0, h00Var.getParentActivity(), false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    l10Var = new org.telegram.ui.Components.l10(h00Var.getParentActivity());
                    l10Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                }
                view2 = l10Var;
            }
            return new org.telegram.ui.Components.wl0(view2);
        }
        Activity parentActivity = h00Var.getParentActivity();
        int i11 = R.raw.folder_share;
        xz xzVar = new xz(parentActivity);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(parentActivity);
        bk0Var.f(i11, 90, 90, null);
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        bk0Var.d();
        bk0Var.setImportantForAccessibility(2);
        xzVar.addView(bk0Var, w7.a6.a(90.0f, 0.0f, 14.0f, 0.0f, 0.0f, 90, 49));
        wh.n nVar = new wh.n(parentActivity);
        xzVar.a = nVar;
        nVar.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B6, false));
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setLines(2);
        xzVar.addView(nVar, w7.a6.a(-2.0f, 40.0f, 121.0f, 40.0f, 24.0f, -1, 49));
        view = xzVar;
        view2 = view;
        return new org.telegram.ui.Components.wl0(view2);
    }
}
