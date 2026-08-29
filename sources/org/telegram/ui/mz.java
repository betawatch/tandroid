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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mz extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ nz c;

    public mz(nz nzVar) {
        this.c = nzVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 4;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.D;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        nz nzVar = this.c;
        if (i10 == nzVar.K || i10 == nzVar.G) {
            return 2;
        }
        if (i10 == nzVar.E) {
            return 3;
        }
        if (i10 < nzVar.I || i10 >= nzVar.J) {
            return (i10 == nzVar.H || i10 == nzVar.F) ? 5 : 0;
        }
        return 4;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        nz nzVar = this.c;
        ArrayList arrayList = nzVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            nzVar.M = (ez) view;
            nzVar.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(nzVar.getParentActivity(), i10 == nzVar.K ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
            if (i10 != nzVar.K) {
                y8Var.setFixedSize(12);
                return;
            }
            y8Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                y8Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                y8Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String str3 = null;
        if (i11 == 3) {
            gz gzVar = (gz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            eg.r rVar = gzVar.h;
            org.telegram.ui.ActionBar.h5 h5Var = gzVar.c;
            TextView textView = gzVar.n;
            ImageView imageView = gzVar.d;
            eg.r rVar2 = gzVar.f;
            gzVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            h5Var.l(str4, false);
            if (gzVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = gzVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    gzVar.w = null;
                }
                float f9 = str4 != null ? 1.0f : 0.0f;
                gzVar.v = f9;
                nh.i8 i8Var = gzVar.e;
                i8Var.c = f9;
                i8Var.invalidate();
                rVar2.setAlpha(gzVar.v);
                gzVar.h.setAlpha(gzVar.v);
                imageView.setAlpha(gzVar.v);
                textView.setAlpha(1.0f - gzVar.v);
                h5Var.setAlpha(gzVar.v);
                gzVar.b.setAlpha(1.0f - gzVar.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    rVar2.setVisibility(8);
                    rVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                rVar2.setVisibility(0);
                rVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) view;
                if (v00Var == nzVar.L) {
                    nzVar.L = null;
                }
                if (i10 == nzVar.F) {
                    v00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    v00Var.a("", null);
                    return;
                }
                nzVar.L = v00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    nzVar.f0(false);
                    return;
                } else {
                    v00Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    v00Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
        Long l10 = (Long) nzVar.h.get(i10 - nzVar.I);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User user = nzVar.getMessagesController().getUser(l10);
            if (user != null) {
                str2 = UserObject.getUserName(user);
                chat = user;
            } else {
                str2 = null;
                chat = user;
            }
        } else {
            TLRPC.Chat chat2 = nzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
        if (arrayList.contains(l10)) {
            e4Var.setForbiddenCheck(false);
            e4Var.c(nzVar.e.contains(l10), false);
        } else {
            e4Var.setForbiddenCheck(true);
            e4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str3 = ((TLRPC.User) chat).bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
            } else if (chat instanceof TLRPC.Chat) {
                str3 = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
            }
        }
        e4Var.setTag(l10);
        e4Var.d(chat, str2, str3);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View v00Var;
        View view;
        nz nzVar = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.y8(nzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    v00Var = new lz(this, nzVar.getParentActivity(), nzVar);
                    v00Var.setLayoutParams(new f2.x0(-1, -2));
                    v00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                } else if (i10 == 4) {
                    View e4Var = new org.telegram.ui.Cells.e4(nzVar.getParentActivity(), 1, 0, false);
                    e4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    view = e4Var;
                } else if (i10 == 5) {
                    v00Var = new org.telegram.ui.Components.v00(nzVar.getParentActivity());
                    v00Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                }
                view2 = v00Var;
            }
            return new org.telegram.ui.Components.vk0(view2);
        }
        Activity parentActivity = nzVar.getParentActivity();
        int i11 = R.raw.folder_share;
        ez ezVar = new ez(parentActivity);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(parentActivity);
        aj0Var.f(i11, 90, 90, null);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.d();
        aj0Var.setImportantForAccessibility(2);
        ezVar.addView(aj0Var, i7.f6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        gh.s sVar = new gh.s(parentActivity);
        ezVar.a = sVar;
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(17);
        sVar.setLines(2);
        ezVar.addView(sVar, i7.f6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = ezVar;
        view2 = view;
        return new org.telegram.ui.Components.vk0(view2);
    }
}
