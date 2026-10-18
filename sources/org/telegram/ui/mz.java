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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class mz extends org.telegram.ui.Components.hm0 {
    public final /* synthetic */ nz c;

    public mz(nz nzVar) {
        this.c = nzVar;
    }

    @Override // org.telegram.ui.Components.hm0
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
        nz nzVar = this.c;
        if (i10 == nzVar.O || i10 == nzVar.K) {
            return 2;
        }
        if (i10 == nzVar.I) {
            return 3;
        }
        if (i10 < nzVar.M || i10 >= nzVar.N) {
            return (i10 == nzVar.L || i10 == nzVar.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        nz nzVar = this.c;
        ArrayList arrayList = nzVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = nzVar.d;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            nzVar.Q = (dz) view;
            nzVar.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(nzVar.getParentActivity(), i10 == nzVar.O ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
            if (i10 != nzVar.O) {
                d9Var.setFixedSize(12);
                return;
            }
            d9Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                d9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                d9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String str3 = null;
        if (i11 == 3) {
            gz gzVar = (gz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            ai.vd vdVar = gzVar.h;
            org.telegram.ui.ActionBar.j5 j5Var = gzVar.c;
            TextView textView = gzVar.n;
            ImageView imageView = gzVar.d;
            ai.vd vdVar2 = gzVar.f;
            gzVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            j5Var.l(str4, false);
            if (gzVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = gzVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    gzVar.w = null;
                }
                float f7 = str4 != null ? 1.0f : 0.0f;
                gzVar.v = f7;
                ei.u8 u8Var = gzVar.e;
                u8Var.c = f7;
                u8Var.invalidate();
                vdVar2.setAlpha(gzVar.v);
                gzVar.h.setAlpha(gzVar.v);
                imageView.setAlpha(gzVar.v);
                textView.setAlpha(1.0f - gzVar.v);
                j5Var.setAlpha(gzVar.v);
                gzVar.b.setAlpha(1.0f - gzVar.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    vdVar2.setVisibility(8);
                    vdVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                vdVar2.setVisibility(0);
                vdVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.h10 h10Var = (org.telegram.ui.Components.h10) view;
                if (h10Var == nzVar.P) {
                    nzVar.P = null;
                }
                if (i10 == nzVar.J) {
                    h10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    h10Var.a("", null);
                    return;
                }
                nzVar.P = h10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    nzVar.f0(false);
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
        Long l4 = (Long) nzVar.h.get(i10 - nzVar.M);
        long longValue = l4.longValue();
        if (longValue >= 0) {
            TLRPC.User user = nzVar.getMessagesController().getUser(l4);
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
        if (arrayList.contains(l4)) {
            f4Var.setForbiddenCheck(false);
            f4Var.c(nzVar.e.contains(l4), false);
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
        nz nzVar = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.d9(nzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    h10Var = new lz(this, nzVar.getParentActivity(), nzVar);
                    h10Var.setLayoutParams(new s4.o0(-1, -2));
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(nzVar.getParentActivity(), 1, 0, false);
                    f4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    view = f4Var;
                } else if (i10 == 5) {
                    h10Var = new org.telegram.ui.Components.h10(nzVar.getParentActivity());
                    h10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                }
                view2 = h10Var;
            }
            return new org.telegram.ui.Components.sl0(view2);
        }
        Activity parentActivity = nzVar.getParentActivity();
        int i11 = R.raw.folder_share;
        dz dzVar = new dz(parentActivity);
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(parentActivity);
        xj0Var.f(i11, 90, 90, null);
        xj0Var.setScaleType(ImageView.ScaleType.CENTER);
        xj0Var.d();
        xj0Var.setImportantForAccessibility(2);
        dzVar.addView(xj0Var, w7.z5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        wh.n nVar = new wh.n(parentActivity);
        dzVar.a = nVar;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B6, false));
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setLines(2);
        dzVar.addView(nVar, w7.z5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = dzVar;
        view2 = view;
        return new org.telegram.ui.Components.sl0(view2);
    }
}
