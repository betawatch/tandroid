package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gc extends pg.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ ic f;

    public gc(ic icVar) {
        this.f = icVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return ((hc) this.f.x.get(b1Var.b())).b;
    }

    @Override // s4.g0
    public final int h() {
        return this.f.x.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((hc) this.f.x.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        ic icVar = this.f;
        int i12 = icVar.b;
        TLRPC.Chat chat = icVar.J;
        ArrayList arrayList = icVar.x;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            lg.c cVar = (lg.c) view;
            cVar.setTitle(((hc) arrayList.get(i10)).c);
            cVar.c(false);
            if (b1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            bb1 bb1Var = (bb1) view;
            bb1Var.a(Integer.toString(icVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = icVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    bb1Var.a("≈" + ((int) icVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    bb1Var.a(String.valueOf(icVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = icVar.d;
                    bb1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            bb1Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            bb1Var.a(String.valueOf(icVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = icVar.d;
            bb1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((hc) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            zg.b bVar = (zg.b) view;
            bVar.e(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((hc) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.e9) view).setText(((hc) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (icVar.y == 0) {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", icVar.s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", icVar.w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.w90) view).setLink(((hc) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            hc hcVar = (hc) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = hcVar.e;
            boolean z10 = hcVar.f;
            zg.c cVar2 = (zg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.e(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.e(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z10);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i13 == 13) {
            int i14 = this.d;
            int i15 = icVar.P;
            if (i14 == i15 && this.e == icVar.O) {
                return;
            }
            this.d = i15;
            this.e = icVar.O;
            icVar.f.g();
            icVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", icVar.P, new Object[0]), null);
            if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = icVar.O) > 0 && i11 != icVar.P) {
                icVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            icVar.f.setInitialTabId(icVar.y);
            icVar.f.c();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        ic icVar = this.f;
        org.telegram.ui.ActionBar.c6 c6Var = icVar.e;
        hb1 hb1Var = icVar.c;
        switch (i10) {
            case 0:
                view = new bb1(icVar.getContext(), 2);
                break;
            case 1:
                View cVar = new lg.c(icVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                view = new org.telegram.ui.Cells.b7(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(icVar.getContext(), icVar.c, null, false, false);
                w90Var.d.setVisibility(8);
                w90Var.a.setGravity(17);
                w90Var.h.setVisibility(8);
                w90Var.v.setVisibility(8);
                w90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = w90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(icVar.getContext(), R.drawable.filled_limit_boost, 0, icVar.e, 0);
                limitPreviewView.c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(icVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new zg.b(icVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.e9(viewGroup.getContext(), 20, c6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.t3(icVar.getContext(), 8);
                break;
            case 8:
                bi.i5 i5Var = new bi.i5(icVar.getContext(), 9);
                TextView textView = new TextView(icVar.getContext());
                org.telegram.messenger.yh.j(14.0f, ChatObject.isChannelAndNotMegaGroup(icVar.J) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint, 1, textView);
                com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.g6.y6, null, false, textView, 17);
                i5Var.addView(textView, w7.a6.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -1, 0));
                view = i5Var;
                break;
            case 9:
                r5 r5Var = new r5(icVar.getContext(), 1);
                r5Var.a(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                view = r5Var;
                break;
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(icVar.getContext());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                r8Var.e(i11, i11);
                view = r8Var;
                break;
            case 11:
                view = new zg.c(icVar.getContext());
                break;
            case 12:
                View cVar2 = new lg.c(icVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(hb1Var.getParentActivity(), c6Var);
                icVar.f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.g6.Fh;
                int i13 = org.telegram.ui.ActionBar.g6.Eh;
                scrollSlidingTextTabStrip.L = i12;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.d();
                ah.v vVar = new ah.v(this, hb1Var.getParentActivity());
                icVar.f.setDelegate(new g(this, 11));
                vVar.addView(icVar.f, w7.a6.d(48.0f, -2));
                view = vVar;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
