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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d00 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ e00 c;

    public d00(e00 e00Var) {
        this.c = e00Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.H;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        e00 e00Var = this.c;
        if (i10 == e00Var.O || i10 == e00Var.K) {
            return 2;
        }
        if (i10 == e00Var.I) {
            return 3;
        }
        if (i10 < e00Var.M || i10 >= e00Var.N) {
            return (i10 == e00Var.L || i10 == e00Var.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        e00 e00Var = this.c;
        ArrayList arrayList = e00Var.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = e00Var.d;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            e00Var.Q = (vz) view;
            e00Var.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(e00Var.getParentActivity(), i10 == e00Var.O ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
            if (i10 != e00Var.O) {
                f9Var.setFixedSize(12);
                return;
            }
            f9Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                f9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                f9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String str3 = null;
        if (i11 == 3) {
            xz xzVar = (xz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            di.h hVar = xzVar.h;
            org.telegram.ui.ActionBar.l5 l5Var = xzVar.c;
            TextView textView = xzVar.n;
            ImageView imageView = xzVar.d;
            di.h hVar2 = xzVar.f;
            xzVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            l5Var.l(str4, false);
            if (xzVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = xzVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    xzVar.w = null;
                }
                float f7 = str4 != null ? 1.0f : 0.0f;
                xzVar.v = f7;
                bi.la laVar = xzVar.e;
                laVar.c = f7;
                laVar.invalidate();
                hVar2.setAlpha(xzVar.v);
                xzVar.h.setAlpha(xzVar.v);
                imageView.setAlpha(xzVar.v);
                textView.setAlpha(1.0f - xzVar.v);
                l5Var.setAlpha(xzVar.v);
                xzVar.b.setAlpha(1.0f - xzVar.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    hVar2.setVisibility(8);
                    hVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                hVar2.setVisibility(0);
                hVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) view;
                if (h10Var == e00Var.P) {
                    e00Var.P = null;
                }
                if (i10 == e00Var.J) {
                    h10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    h10Var.a("", null);
                    return;
                }
                e00Var.P = h10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    e00Var.f0(false);
                    return;
                } else {
                    h10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    h10Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        Long l4 = (Long) e00Var.h.get(i10 - e00Var.M);
        long longValue = l4.longValue();
        if (longValue >= 0) {
            TLRPC.User user = e00Var.getMessagesController().getUser(l4);
            if (user != null) {
                str2 = UserObject.getUserName(user);
                chat = user;
            } else {
                str2 = null;
                chat = user;
            }
        } else {
            TLRPC.Chat chat2 = e00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
            g4Var.c(e00Var.e.contains(l4), false);
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

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View h10Var;
        View view;
        e00 e00Var = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.f9(e00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    h10Var = new c00(this, e00Var.getParentActivity(), e00Var);
                    h10Var.setLayoutParams(new s4.p0(-1, -2));
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(e00Var.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    h10Var = new org.telegram.ui.Components.h10(e00Var.getParentActivity());
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                }
                view2 = h10Var;
            }
            return new org.telegram.ui.Components.fl0(view2);
        }
        Activity parentActivity = e00Var.getParentActivity();
        int i11 = R.raw.folder_share;
        vz vzVar = new vz(parentActivity);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(parentActivity);
        kj0Var.f(i11, 90, 90, null);
        kj0Var.setScaleType(ImageView.ScaleType.CENTER);
        kj0Var.d();
        kj0Var.setImportantForAccessibility(2);
        vzVar.addView(kj0Var, w7.a6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        uh.o oVar = new uh.o(parentActivity);
        vzVar.a = oVar;
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(17);
        oVar.setLines(2);
        vzVar.addView(oVar, w7.a6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = vzVar;
        view2 = view;
        return new org.telegram.ui.Components.fl0(view2);
    }
}
