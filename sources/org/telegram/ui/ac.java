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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ac extends bg.c {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ cc f;

    public ac(cc ccVar) {
        this.f = ccVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return ((bc) this.f.x.get(l1Var.b())).b;
    }

    @Override // f2.o0
    public final int h() {
        return this.f.x.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((bc) this.f.x.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        cc ccVar = this.f;
        int i12 = ccVar.b;
        TLRPC.Chat chat = ccVar.G;
        ArrayList arrayList = ccVar.x;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            xf.c cVar = (xf.c) view;
            cVar.setTitle(((bc) arrayList.get(i10)).c);
            cVar.c(false);
            if (l1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            ia1 ia1Var = (ia1) view;
            ia1Var.a(Integer.toString(ccVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = ccVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    ia1Var.a("≈" + ((int) ccVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    ia1Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = ccVar.d;
                    ia1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            ia1Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            ia1Var.a(String.valueOf(ccVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = ccVar.d;
            ia1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((bc) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            lg.b bVar = (lg.b) view;
            bVar.d(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((bc) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.z8) view).setText(((bc) arrayList.get(i10)).c);
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
            ((org.telegram.ui.Components.x80) view).setLink(((bc) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            bc bcVar = (bc) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = bcVar.e;
            boolean z4 = bcVar.f;
            lg.c cVar2 = (lg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.d(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z4);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.d(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z4);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i13 == 13) {
            int i14 = this.d;
            int i15 = ccVar.M;
            if (i14 == i15 && this.e == ccVar.L) {
                return;
            }
            this.d = i15;
            this.e = ccVar.L;
            ccVar.f.g();
            ccVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", ccVar.M, new Object[0]), null);
            if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = ccVar.L) > 0 && i11 != ccVar.M) {
                ccVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            ccVar.f.setInitialTabId(ccVar.y);
            ccVar.f.c();
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        cc ccVar = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = ccVar.e;
        oa1 oa1Var = ccVar.c;
        switch (i10) {
            case 0:
                view = new ia1(ccVar.getContext(), 2);
                break;
            case 1:
                View cVar = new xf.c(ccVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                view = new org.telegram.ui.Cells.y6(viewGroup.getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(ccVar.getContext(), ccVar.c, null, false, false);
                x80Var.d.setVisibility(8);
                x80Var.a.setGravity(17);
                x80Var.h.setVisibility(8);
                x80Var.v.setVisibility(8);
                x80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = x80Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(ccVar.getContext(), R.drawable.filled_limit_boost, 0, ccVar.e, 0);
                limitPreviewView.W = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(ccVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new lg.b(ccVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.z8(viewGroup.getContext(), 20, f6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.r3(ccVar.getContext(), 8);
                break;
            case 8:
                dh.d dVar = new dh.d(ccVar.getContext(), 9);
                TextView textView = new TextView(ccVar.getContext());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(ccVar.G) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                ai.s(org.telegram.ui.ActionBar.j6.y6, null, false, textView, 17);
                dVar.addView(textView, k7.b6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = dVar;
                break;
            case 9:
                s5 s5Var = new s5(ccVar.getContext(), 1);
                s5Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                view = s5Var;
                break;
            case 10:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(ccVar.getContext());
                n8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                n8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                n8Var.e(i11, i11);
                view = n8Var;
                break;
            case 11:
                view = new lg.c(ccVar.getContext());
                break;
            case 12:
                View cVar2 = new xf.c(ccVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(oa1Var.getParentActivity(), f6Var);
                ccVar.f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.j6.Fh;
                int i13 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.I = i12;
                scrollSlidingTextTabStrip.J = i13;
                scrollSlidingTextTabStrip.e();
                ah.e eVar = new ah.e(this, oa1Var.getParentActivity());
                ccVar.f.setDelegate(new h(this, 11));
                eVar.addView(ccVar.f, k7.b6.c(48.0f, -2));
                view = eVar;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return ai.n(view, view, -1, -2);
    }
}
