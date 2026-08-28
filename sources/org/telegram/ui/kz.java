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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kz extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ lz c;

    public kz(lz lzVar) {
        this.c = lzVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 4;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.D;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        lz lzVar = this.c;
        if (i9 == lzVar.K || i9 == lzVar.G) {
            return 2;
        }
        if (i9 == lzVar.E) {
            return 3;
        }
        if (i9 < lzVar.I || i9 >= lzVar.J) {
            return (i9 == lzVar.H || i9 == lzVar.F) ? 5 : 0;
        }
        return 4;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        String str2;
        TLRPC.Chat chat;
        lz lzVar = this.c;
        ArrayList arrayList = lzVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = lzVar.d;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            lzVar.M = (cz) view;
            lzVar.f0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(lzVar.getParentActivity(), i9 == lzVar.K ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
            if (i9 != lzVar.K) {
                b9Var.setFixedSize(12);
                return;
            }
            b9Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                b9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                b9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String str3 = null;
        if (i10 == 3) {
            ez ezVar = (ez) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            bg.t tVar = ezVar.h;
            org.telegram.ui.ActionBar.h5 h5Var = ezVar.c;
            TextView textView = ezVar.n;
            ImageView imageView = ezVar.d;
            bg.t tVar2 = ezVar.f;
            ezVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            h5Var.l(str4, false);
            if (ezVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = ezVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ezVar.w = null;
                }
                float f10 = str4 != null ? 1.0f : 0.0f;
                ezVar.v = f10;
                kh.v8 v8Var = ezVar.e;
                v8Var.c = f10;
                v8Var.invalidate();
                tVar2.setAlpha(ezVar.v);
                ezVar.h.setAlpha(ezVar.v);
                imageView.setAlpha(ezVar.v);
                textView.setAlpha(1.0f - ezVar.v);
                h5Var.setAlpha(ezVar.v);
                ezVar.b.setAlpha(1.0f - ezVar.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    tVar2.setVisibility(8);
                    tVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                tVar2.setVisibility(0);
                tVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 5) {
                org.telegram.ui.Components.k00 k00Var = (org.telegram.ui.Components.k00) view;
                if (k00Var == lzVar.L) {
                    lzVar.L = null;
                }
                if (i9 == lzVar.F) {
                    k00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    k00Var.a("", null);
                    return;
                }
                lzVar.L = k00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    lzVar.e0(false);
                    return;
                } else {
                    k00Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    k00Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        Long l10 = (Long) lzVar.h.get(i9 - lzVar.I);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User user = lzVar.getMessagesController().getUser(l10);
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
        if (arrayList.contains(l10)) {
            g4Var.setForbiddenCheck(false);
            g4Var.c(lzVar.e.contains(l10), false);
        } else {
            g4Var.setForbiddenCheck(true);
            g4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str3 = ((TLRPC.User) chat).bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
            } else if (chat instanceof TLRPC.Chat) {
                str3 = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
            }
        }
        g4Var.setTag(l10);
        g4Var.d(chat, str2, str3);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View k00Var;
        View view;
        lz lzVar = this.c;
        View view2 = null;
        if (i9 != 0) {
            if (i9 == 2) {
                view2 = new org.telegram.ui.Cells.b9(lzVar.getParentActivity());
            } else {
                if (i9 == 3) {
                    k00Var = new jz(this, lzVar.getParentActivity(), lzVar);
                    k00Var.setLayoutParams(new f2.a1(-1, -2));
                    k00Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                } else if (i9 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(lzVar.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                    view = g4Var;
                } else if (i9 == 5) {
                    k00Var = new org.telegram.ui.Components.k00(lzVar.getParentActivity());
                    k00Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                }
                view2 = k00Var;
            }
            return new org.telegram.ui.Components.ik0(view2);
        }
        Activity parentActivity = lzVar.getParentActivity();
        int i10 = R.raw.folder_share;
        cz czVar = new cz(parentActivity);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(parentActivity);
        pi0Var.f(i10, 90, 90, null);
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        pi0Var.d();
        pi0Var.setImportantForAccessibility(2);
        czVar.addView(pi0Var, g7.e6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        dh.u uVar = new dh.u(parentActivity);
        czVar.a = uVar;
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B6, false));
        uVar.setTextSize(1, 14.0f);
        uVar.setGravity(17);
        uVar.setLines(2);
        czVar.addView(uVar, g7.e6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = czVar;
        view2 = view;
        return new org.telegram.ui.Components.ik0(view2);
    }
}
