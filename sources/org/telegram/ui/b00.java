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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class b00 extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ c00 c;

    public b00(c00 c00Var) {
        this.c = c00Var;
    }

    @Override // org.telegram.ui.Components.kl0
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
        c00 c00Var = this.c;
        if (i10 == c00Var.O || i10 == c00Var.K) {
            return 2;
        }
        if (i10 == c00Var.I) {
            return 3;
        }
        if (i10 < c00Var.M || i10 >= c00Var.N) {
            return (i10 == c00Var.L || i10 == c00Var.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        c00 c00Var = this.c;
        ArrayList arrayList = c00Var.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = c00Var.d;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            c00Var.Q = (tz) view;
            c00Var.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(c00Var.getParentActivity(), i10 == c00Var.O ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
            if (i10 != c00Var.O) {
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
            vz vzVar = (vz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            bi.c4 c4Var = vzVar.h;
            org.telegram.ui.ActionBar.j5 j5Var = vzVar.c;
            TextView textView = vzVar.n;
            ImageView imageView = vzVar.d;
            bi.c4 c4Var2 = vzVar.f;
            vzVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            j5Var.l(str4, false);
            if (vzVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = vzVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    vzVar.w = null;
                }
                float f7 = str4 != null ? 1.0f : 0.0f;
                vzVar.v = f7;
                di.i9 i9Var = vzVar.e;
                i9Var.c = f7;
                i9Var.invalidate();
                c4Var2.setAlpha(vzVar.v);
                vzVar.h.setAlpha(vzVar.v);
                imageView.setAlpha(vzVar.v);
                textView.setAlpha(1.0f - vzVar.v);
                j5Var.setAlpha(vzVar.v);
                vzVar.b.setAlpha(1.0f - vzVar.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    c4Var2.setVisibility(8);
                    c4Var.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                c4Var2.setVisibility(0);
                c4Var.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.z00 z00Var = (org.telegram.ui.Components.z00) view;
                if (z00Var == c00Var.P) {
                    c00Var.P = null;
                }
                if (i10 == c00Var.J) {
                    z00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    z00Var.a("", null);
                    return;
                }
                c00Var.P = z00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    c00Var.f0(false);
                    return;
                } else {
                    z00Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    z00Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        Long l4 = (Long) c00Var.h.get(i10 - c00Var.M);
        long longValue = l4.longValue();
        if (longValue >= 0) {
            TLRPC.User user = c00Var.getMessagesController().getUser(l4);
            if (user != null) {
                str2 = UserObject.getUserName(user);
                chat = user;
            } else {
                str2 = null;
                chat = user;
            }
        } else {
            TLRPC.Chat chat2 = c00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
            f4Var.setForbiddenCheck(false);
            f4Var.c(c00Var.e.contains(l4), false);
        } else {
            f4Var.setForbiddenCheck(true);
            f4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str3 = ((TLRPC.User) chat).bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
            } else if (chat instanceof TLRPC.Chat) {
                str3 = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
            }
        }
        f4Var.setTag(l4);
        f4Var.d(chat, str2, str3);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View z00Var;
        View view;
        c00 c00Var = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(c00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    z00Var = new a00(this, c00Var.getParentActivity(), c00Var);
                    z00Var.setLayoutParams(new s4.p0(-1, -2));
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(c00Var.getParentActivity(), 1, 0, false);
                    f4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = f4Var;
                } else if (i10 == 5) {
                    z00Var = new org.telegram.ui.Components.z00(c00Var.getParentActivity());
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                }
                view2 = z00Var;
            }
            return new org.telegram.ui.Components.vk0(view2);
        }
        Activity parentActivity = c00Var.getParentActivity();
        int i11 = R.raw.folder_share;
        tz tzVar = new tz(parentActivity);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(parentActivity);
        aj0Var.f(i11, 90, 90, null);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.d();
        aj0Var.setImportantForAccessibility(2);
        tzVar.addView(aj0Var, w7.x5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        wh.p pVar = new wh.p(parentActivity);
        tzVar.a = pVar;
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        pVar.setTextSize(1, 14.0f);
        pVar.setGravity(17);
        pVar.setLines(2);
        tzVar.addView(pVar, w7.x5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = tzVar;
        view2 = view;
        return new org.telegram.ui.Components.vk0(view2);
    }
}
