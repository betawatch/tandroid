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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nz extends org.telegram.ui.Components.lm0 {
    public final /* synthetic */ oz c;

    public nz(oz ozVar) {
        this.c = ozVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 4;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.I;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        oz ozVar = this.c;
        if (i10 == ozVar.P || i10 == ozVar.L) {
            return 2;
        }
        if (i10 == ozVar.J) {
            return 3;
        }
        if (i10 < ozVar.N || i10 >= ozVar.O) {
            return (i10 == ozVar.M || i10 == ozVar.K) ? 5 : 0;
        }
        return 4;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        oz ozVar = this.c;
        ArrayList arrayList = ozVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = ozVar.d;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            ozVar.R = (dz) view;
            ozVar.g0();
            return;
        }
        String str3 = null;
        if (i11 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            org.telegram.ui.ActionBar.r6.b0(i10 == ozVar.P ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7, ozVar.getParentActivity(), e9Var, null);
            if (i10 != ozVar.P) {
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
        if (i11 == 3) {
            hz hzVar = (hz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            ai.wd wdVar = hzVar.h;
            org.telegram.ui.ActionBar.n5 n5Var = hzVar.c;
            TextView textView = hzVar.n;
            ImageView imageView = hzVar.d;
            ai.wd wdVar2 = hzVar.f;
            hzVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            n5Var.l(str4, false);
            if (hzVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = hzVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    hzVar.w = null;
                }
                float f7 = str4 != null ? 1.0f : 0.0f;
                hzVar.v = f7;
                gz gzVar = hzVar.e;
                gzVar.d = f7;
                gzVar.invalidate();
                wdVar2.setAlpha(hzVar.v);
                hzVar.h.setAlpha(hzVar.v);
                imageView.setAlpha(hzVar.v);
                textView.setAlpha(1.0f - hzVar.v);
                n5Var.setAlpha(hzVar.v);
                hzVar.b.setAlpha(1.0f - hzVar.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    wdVar2.setVisibility(8);
                    wdVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                wdVar2.setVisibility(0);
                wdVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) view;
                if (h10Var == ozVar.Q) {
                    ozVar.Q = null;
                }
                if (i10 == ozVar.K) {
                    h10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    h10Var.a("", null);
                    return;
                }
                ozVar.Q = h10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    ozVar.f0(false);
                    return;
                } else {
                    h10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    h10Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        Long l4 = (Long) ozVar.h.get(i10 - ozVar.N);
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
            f4Var.setForbiddenCheck(false);
            f4Var.c(ozVar.e.contains(l4), false);
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

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View h10Var;
        View view;
        oz ozVar = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(ozVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    h10Var = new mz(this, ozVar.getParentActivity(), ozVar);
                    h10Var.setLayoutParams(new s4.o0(-1, -2));
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, h10Var, null);
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(ozVar.getParentActivity(), 1, 0, false);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, f4Var, null);
                    view = f4Var;
                } else if (i10 == 5) {
                    h10Var = new org.telegram.ui.Components.h10(ozVar.getParentActivity());
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, h10Var, null);
                }
                view2 = h10Var;
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
        dzVar.addView(bk0Var, w7.z5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        wh.n nVar = new wh.n(parentActivity);
        dzVar.a = nVar;
        org.telegram.ui.ActionBar.r6.W(nVar, org.telegram.ui.ActionBar.k6.B6, null);
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setLines(2);
        dzVar.addView(nVar, w7.z5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = dzVar;
        view2 = view;
        return new org.telegram.ui.Components.wl0(view2);
    }
}
