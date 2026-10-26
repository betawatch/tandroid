package org.telegram.ui;

import android.content.Context;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bc extends qg.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ dc f;

    public bc(dc dcVar) {
        this.f = dcVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return ((cc) this.f.x.get(e1Var.b())).b;
    }

    @Override // s4.h0
    public final int h() {
        return this.f.x.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((cc) this.f.x.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        dc dcVar = this.f;
        int i12 = dcVar.b;
        TLRPC.Chat chat = dcVar.I;
        ArrayList arrayList = dcVar.x;
        int i13 = e1Var.f;
        View view = e1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            mg.c cVar = (mg.c) view;
            cVar.setTitle(((cc) arrayList.get(i10)).c);
            cVar.c(false);
            if (e1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            q91 q91Var = (q91) view;
            q91Var.a(Integer.toString(dcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = dcVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    q91Var.a("≈" + ((int) dcVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    q91Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = dcVar.d;
                    q91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            q91Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            q91Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = dcVar.d;
            q91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((cc) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            ah.b bVar = (ah.b) view;
            bVar.d(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((cc) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.i9) view).setText(((cc) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
            if (dcVar.y == 0) {
                c5Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", dcVar.s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                c5Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", dcVar.w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.r90) view).setLink(((cc) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            cc ccVar = (cc) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = ccVar.e;
            boolean z10 = ccVar.f;
            ah.c cVar2 = (ah.c) view;
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
            int i14 = this.d;
            int i15 = dcVar.O;
            if (i14 == i15 && this.e == dcVar.N) {
                return;
            }
            this.d = i15;
            this.e = dcVar.N;
            dcVar.f.f();
            dcVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", dcVar.O, new Object[0]), null);
            if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = dcVar.N) > 0 && i11 != dcVar.O) {
                dcVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            dcVar.f.setInitialTabId(dcVar.y);
            dcVar.f.c();
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        dc dcVar = this.f;
        org.telegram.ui.ActionBar.u6 u6Var = dcVar.e;
        w91 w91Var = dcVar.c;
        int i11 = 1;
        switch (i10) {
            case 0:
                view = new q91(dcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new mg.c(dcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i12 = org.telegram.ui.ActionBar.y6.a7;
                View f7Var = new org.telegram.ui.Cells.f7(context, org.telegram.ui.ActionBar.y6.x0(null, i12, false), 0);
                org.telegram.ui.ActionBar.f7.i(i12, f7Var, null);
                view = f7Var;
                break;
            case 3:
                org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(dcVar.getContext(), dcVar.c, null, false, false);
                r90Var.d.setVisibility(8);
                r90Var.a.setGravity(17);
                r90Var.h.setVisibility(8);
                r90Var.v.setVisibility(8);
                r90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = r90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(dcVar.getContext(), R.drawable.filled_limit_boost, 0, dcVar.e, 0);
                limitPreviewView.c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.g(dcVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new ah.b(dcVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.i9(viewGroup.getContext(), 20, u6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.x3(dcVar.getContext(), 8);
                break;
            case 8:
                di.i4 i4Var = new di.i4(dcVar.getContext(), 8);
                TextView textView = new TextView(dcVar.getContext());
                d3.o(ChatObject.isChannelAndNotMegaGroup(dcVar.I) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint, textView, 1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.y6, null);
                textView.setGravity(17);
                i4Var.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = i4Var;
                break;
            case 9:
                q5 q5Var = new q5(dcVar.getContext(), i11);
                q5Var.a(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                view = q5Var;
                break;
            case 10:
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(dcVar.getContext());
                v8Var.o(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                v8Var.s = 64;
                int i13 = org.telegram.ui.ActionBar.y6.q6;
                v8Var.g(i13, i13);
                view = v8Var;
                break;
            case 11:
                view = new ah.c(dcVar.getContext());
                break;
            case 12:
                View cVar2 = new mg.c(dcVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(w91Var.getParentActivity(), u6Var);
                dcVar.f = scrollSlidingTextTabStrip;
                int i14 = org.telegram.ui.ActionBar.y6.a;
                int i15 = org.telegram.ui.ActionBar.y6.Fh;
                int i16 = org.telegram.ui.ActionBar.y6.Eh;
                int i17 = org.telegram.ui.ActionBar.y6.a;
                scrollSlidingTextTabStrip.L = i15;
                scrollSlidingTextTabStrip.M = i16;
                scrollSlidingTextTabStrip.updateColors();
                bh.p pVar = new bh.p(this, w91Var.getParentActivity());
                dcVar.f.setDelegate(new f(this, 10));
                pVar.addView(dcVar.f, org.telegram.ui.Components.gb1.g(48.0f, -2));
                view = pVar;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return ic.a.n(view, view, -1, -2);
    }
}
