package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class p5 extends og.b {
    public final /* synthetic */ w5 d;

    public p5(w5 w5Var) {
        this.d = w5Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return ((v5) this.d.a0.get(c1Var.b())).b;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.a0.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((v5) this.d.a0.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        w5 w5Var = this.d;
        int i12 = w5Var.Q;
        TLRPC.Chat chat = w5Var.g0;
        ArrayList arrayList = w5Var.a0;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 4 || i13 == 14 || i13 == 15) {
            return;
        }
        if (i13 == 1 || i13 == 12 || i13 == 16) {
            kg.c cVar = (kg.c) view;
            cVar.setTitle(((v5) arrayList.get(i10)).c);
            cVar.c(false);
            if (c1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            la1 la1Var = (la1) view;
            la1Var.a(Integer.toString(w5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = w5Var.R.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    la1Var.a("≈" + ((int) w5Var.R.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    la1Var.a(String.valueOf(w5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = w5Var.R;
                    la1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    la1Var.setPadding(AndroidUtilities.dp(23.0f), la1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), la1Var.getPaddingBottom());
                    return;
                }
            }
            la1Var.a("~0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            la1Var.a(String.valueOf(w5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = w5Var.R;
            la1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            la1Var.setPadding(AndroidUtilities.dp(23.0f), la1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), la1Var.getPaddingBottom());
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((v5) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            yg.b bVar = (yg.b) view;
            bVar.d(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((v5) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setText(((v5) arrayList.get(i10)).c);
            f9Var.setTextColor(org.telegram.ui.ActionBar.h6.l1(0.875f, -1));
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (w5Var.b0 == 0) {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", w5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", w5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.w80) view).setLink(((v5) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            v5 v5Var = (v5) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = v5Var.e;
            boolean z10 = v5Var.f;
            yg.c cVar2 = (yg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.d(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.d(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i13 == 13) {
            if (w5Var.T.getTag() == null || ((Integer) w5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(w5Var.m0), Integer.valueOf(w5Var.l0))) {
                w5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(w5Var.m0), Integer.valueOf(w5Var.l0))));
                w5Var.T.g();
                w5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", w5Var.m0, new Object[0]), null);
                if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = w5Var.l0) > 0 && i11 != w5Var.m0) {
                    w5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                }
                w5Var.T.setInitialTabId(w5Var.b0);
                w5Var.T.c();
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a7Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        w5 w5Var = this.d;
        switch (i10) {
            case 0:
                view = new la1(w5Var.getParentActivity(), 2);
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 1:
            case 16:
                kg.c cVar = new kg.c(w5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 2:
                a7Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), 0, 0);
                view = a7Var;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(w5Var.getParentActivity(), w5Var, null, false, false);
                w80Var.d.setVisibility(8);
                w80Var.a.setGravity(17);
                w80Var.h.setVisibility(8);
                w80Var.v.setVisibility(8);
                w80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = w80Var;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new yg.b(w5Var.getParentActivity());
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                d6Var = ((org.telegram.ui.ActionBar.n2) w5Var).resourceProvider;
                a7Var = new org.telegram.ui.Cells.f9(context, 20, d6Var);
                view = a7Var;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.t3(w5Var.getParentActivity(), 8);
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 8:
                ai.w5 w5Var2 = new ai.w5(w5Var.getParentActivity(), 7);
                TextView textView = new TextView(w5Var.getParentActivity());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(w5Var.g0) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.h6.y6, null, false, textView, 17);
                w5Var2.addView(textView, w7.x5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = w5Var2;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 9:
                o5 o5Var = new o5(w5Var.getParentActivity(), 0);
                o5Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                view = o5Var;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(w5Var.getParentActivity());
                s8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                s8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.h6.q6;
                s8Var.e(i11, i11);
                view = s8Var;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 11:
                view = new yg.c(w5Var.getParentActivity());
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 12:
                kg.c cVar2 = new kg.c(w5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 13:
                Activity parentActivity = w5Var.getParentActivity();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) w5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, d6Var2);
                w5Var.T = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.h6.Fh;
                int i13 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i12;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.e();
                ci.m6 m6Var = new ci.m6(this, w5Var.getParentActivity());
                w5Var.T.setDelegate(new g(this, 6));
                m6Var.addView(w5Var.T, w7.x5.c(48.0f, -2));
                view = m6Var;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 14:
                view = w5Var.r0(w5Var.getParentActivity());
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
            case 15:
                ci.bb bbVar = new ci.bb(this, w5Var.getParentActivity(), 9);
                bbVar.setTag(-33024);
                view = bbVar;
                return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
        }
    }
}
