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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class bc extends og.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ dc f;

    public bc(dc dcVar) {
        this.f = dcVar;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return ((cc) this.f.x.get(c1Var.b())).b;
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        dc dcVar = this.f;
        int i12 = dcVar.b;
        TLRPC.Chat chat = dcVar.J;
        ArrayList arrayList = dcVar.x;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 4) {
            return;
        }
        if (i13 == 1 || i13 == 12) {
            kg.c cVar = (kg.c) view;
            cVar.setTitle(((cc) arrayList.get(i10)).c);
            cVar.c(false);
            if (c1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            va1 va1Var = (va1) view;
            va1Var.a(Integer.toString(dcVar.d.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = dcVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    va1Var.a("≈" + ((int) dcVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    va1Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = dcVar.d;
                    va1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    return;
                }
            }
            va1Var.a("≈0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            va1Var.a(String.valueOf(dcVar.d.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = dcVar.d;
            va1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((cc) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            yg.b bVar = (yg.b) view;
            bVar.d(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((cc) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            ((org.telegram.ui.Cells.f9) view).setText(((cc) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.z4 z4Var = (org.telegram.ui.Cells.z4) view;
            if (dcVar.y == 0) {
                z4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", dcVar.s, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                z4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", dcVar.w, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.d90) view).setLink(((cc) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            cc ccVar = (cc) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = ccVar.e;
            boolean z10 = ccVar.f;
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
            int i14 = this.d;
            int i15 = dcVar.P;
            if (i14 == i15 && this.e == dcVar.O) {
                return;
            }
            this.d = i15;
            this.e = dcVar.O;
            dcVar.f.g();
            dcVar.f.a(0, LocaleController.formatPluralString("BoostingBoostsCount", dcVar.P, new Object[0]), null);
            if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = dcVar.O) > 0 && i11 != dcVar.P) {
                dcVar.f.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
            }
            dcVar.f.setInitialTabId(dcVar.y);
            dcVar.f.c();
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        dc dcVar = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = dcVar.e;
        bb1 bb1Var = dcVar.c;
        switch (i10) {
            case 0:
                view = new va1(dcVar.getContext(), 2);
                break;
            case 1:
                View cVar = new kg.c(dcVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                break;
            case 2:
                view = new org.telegram.ui.Cells.c7(viewGroup.getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false), 0);
                break;
            case 3:
                org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(dcVar.getContext(), dcVar.c, null, false, false);
                d90Var.d.setVisibility(8);
                d90Var.a.setGravity(17);
                d90Var.h.setVisibility(8);
                d90Var.v.setVisibility(8);
                d90Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = d90Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(dcVar.getContext(), R.drawable.filled_limit_boost, 0, dcVar.e, 0);
                limitPreviewView.c0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f));
                limitPreviewView.e(dcVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new yg.b(dcVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.f9(viewGroup.getContext(), 20, f6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.u3(dcVar.getContext(), 8);
                break;
            case 8:
                ai.x5 x5Var = new ai.x5(dcVar.getContext(), 9);
                TextView textView = new TextView(dcVar.getContext());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(dcVar.J) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.y6, null, false, textView, 17);
                x5Var.addView(textView, w7.y5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = x5Var;
                break;
            case 9:
                n5 n5Var = new n5(dcVar.getContext(), 1);
                n5Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                view = n5Var;
                break;
            case 10:
                org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(dcVar.getContext());
                s8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString("BoostingGetBoostsViaGifts", R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                s8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                s8Var.e(i11, i11);
                view = s8Var;
                break;
            case 11:
                view = new yg.c(dcVar.getContext());
                break;
            case 12:
                View cVar2 = new kg.c(dcVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(bb1Var.getParentActivity(), f6Var);
                dcVar.f = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.j6.Fh;
                int i13 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.L = i12;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.e();
                ci.n6 n6Var = new ci.n6(this, bb1Var.getParentActivity());
                dcVar.f.setDelegate(new g(this, 11));
                n6Var.addView(dcVar.f, w7.y5.c(48.0f, -2));
                view = n6Var;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
