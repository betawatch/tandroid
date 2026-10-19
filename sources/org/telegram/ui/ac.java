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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ac extends pg.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ cc f;

    public ac(cc ccVar) {
        this.f = ccVar;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return ((bc) this.f.x.get(b1Var.b())).b;
    }

    @Override // s4.g0
    public final int h() {
        return this.f.x.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((bc) this.f.x.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        cc ccVar = this.f;
        int i12 = ccVar.b;
        TLRPC.Chat chat = ccVar.J;
        ArrayList arrayList = ccVar.x;
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            lg.c cVar = (lg.c) view;
            cVar.setTitle(((bc) arrayList.get(i10)).c);
            cVar.c(false);
            if (b1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            j91 j91Var = (j91) view;
            j91Var.a(Integer.toString(ccVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = ccVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    j91Var.a("≈" + ((int) ccVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    j91Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ccVar.d;
                    j91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            j91Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            j91Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = ccVar.d;
            j91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((bc) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            zg.b bVar = (zg.b) view;
            bVar.e(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((bc) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.d9) view).setText(((bc) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (ccVar.y == 0) {
                x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", ccVar.s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", ccVar.w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.q90) view).setLink(((bc) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            bc bcVar = (bc) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = bcVar.e;
            boolean z10 = bcVar.f;
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
            int i15 = ccVar.P;
            if (i14 == i15 && this.e == ccVar.O) {
                return;
            }
            this.d = i15;
            this.e = ccVar.O;
            ccVar.f.g();
            ccVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", ccVar.P, new Object[0]), null);
            if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = ccVar.O) > 0 && i11 != ccVar.P) {
                ccVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            ccVar.f.setInitialTabId(ccVar.y);
            ccVar.f.c();
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        cc ccVar = this.f;
        org.telegram.ui.ActionBar.d6 d6Var = ccVar.e;
        p91 p91Var = ccVar.c;
        switch (i10) {
            case 0:
                view = new j91(ccVar.getContext(), 2);
                break;
            case 1:
                View cVar = new lg.c(ccVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                view = new org.telegram.ui.Cells.z6(viewGroup.getContext(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(ccVar.getContext(), ccVar.c, null, false, false);
                q90Var.d.setVisibility(8);
                q90Var.a.setGravity(17);
                q90Var.h.setVisibility(8);
                q90Var.v.setVisibility(8);
                q90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = q90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(ccVar.getContext(), R.drawable.filled_limit_boost, 0, ccVar.e, 0);
                limitPreviewView.c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(ccVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new zg.b(ccVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.d9(viewGroup.getContext(), 20, d6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.s3(ccVar.getContext(), 8);
                break;
            case 8:
                ci.i4 i4Var = new ci.i4(ccVar.getContext(), 9);
                TextView textView = new TextView(ccVar.getContext());
                org.telegram.messenger.kk.j(14.0f, ChatObject.isChannelAndNotMegaGroup(ccVar.J) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint, 1, textView);
                com.google.android.gms.internal.play_billing.k3.o(org.telegram.ui.ActionBar.h6.y6, null, false, textView, 17);
                i4Var.addView(textView, w7.z5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = i4Var;
                break;
            case 9:
                s5 s5Var = new s5(ccVar.getContext(), 1);
                s5Var.a(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                view = s5Var;
                break;
            case 10:
                org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(ccVar.getContext());
                q8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                q8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.h6.q6;
                q8Var.e(i11, i11);
                view = q8Var;
                break;
            case 11:
                view = new zg.c(ccVar.getContext());
                break;
            case 12:
                View cVar2 = new lg.c(ccVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(p91Var.getParentActivity(), d6Var);
                ccVar.f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.h6.Fh;
                int i13 = org.telegram.ui.ActionBar.h6.Eh;
                scrollSlidingTextTabStrip.L = i12;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.d();
                ah.v vVar = new ah.v(this, p91Var.getParentActivity());
                ccVar.f.setDelegate(new g(this, 11));
                vVar.addView(ccVar.f, w7.z5.c(48.0f, -2));
                view = vVar;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
