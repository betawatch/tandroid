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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class o5 extends pg.b {
    public final /* synthetic */ v5 d;

    public o5(v5 v5Var) {
        this.d = v5Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return ((u5) this.d.a0.get(c1Var.b())).b;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.a0.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((u5) this.d.a0.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        v5 v5Var = this.d;
        int i12 = v5Var.Q;
        TLRPC.Chat chat = v5Var.g0;
        ArrayList arrayList = v5Var.a0;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 4 || i13 == 14 || i13 == 15) {
            return;
        }
        if (i13 == 1 || i13 == 12 || i13 == 16) {
            lg.c cVar = (lg.c) view;
            cVar.setTitle(((u5) arrayList.get(i10)).c);
            cVar.c(false);
            if (c1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            va1 va1Var = (va1) view;
            va1Var.a(Integer.toString(v5Var.R.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = v5Var.R.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    va1Var.a("≈" + ((int) v5Var.R.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    va1Var.a(String.valueOf(v5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var.R;
                    va1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    va1Var.setPadding(AndroidUtilities.dp(23.0f), va1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), va1Var.getPaddingBottom());
                    return;
                }
            }
            va1Var.a("~0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            va1Var.a(String.valueOf(v5Var.R.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = v5Var.R;
            va1Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            va1Var.setPadding(AndroidUtilities.dp(23.0f), va1Var.getPaddingTop(), AndroidUtilities.dp(23.0f), va1Var.getPaddingBottom());
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((u5) arrayList.get(i10)).d;
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(boost.user_id));
            zg.b bVar = (zg.b) view;
            bVar.e(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((u5) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText(((u5) arrayList.get(i10)).c);
            e9Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.875f, -1));
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (v5Var.b0 == 0) {
                x4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", v5Var.X, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                x4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", v5Var.Z, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.w80) view).setLink(((u5) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            u5 u5Var = (u5) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = u5Var.e;
            boolean z10 = u5Var.f;
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
            if (v5Var.T.getTag() == null || ((Integer) v5Var.T.getTag()).intValue() != Objects.hash(Integer.valueOf(v5Var.m0), Integer.valueOf(v5Var.l0))) {
                v5Var.T.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(v5Var.m0), Integer.valueOf(v5Var.l0))));
                v5Var.T.g();
                v5Var.T.a(0, LocaleController.formatPluralString("BoostingBoostsCount", v5Var.m0, new Object[0]), null);
                if (MessagesController.getInstance(i12).giveawayGiftsPurchaseAvailable && (i11 = v5Var.l0) > 0 && i11 != v5Var.m0) {
                    v5Var.T.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i11, new Object[0]), null);
                }
                v5Var.T.setInitialTabId(v5Var.b0);
                v5Var.T.c();
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a7Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        v5 v5Var = this.d;
        switch (i10) {
            case 0:
                view = new va1(v5Var.getParentActivity(), 2);
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 1:
            case 16:
                lg.c cVar = new lg.c(v5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 2:
                a7Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), 0, 0);
                view = a7Var;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(v5Var.getParentActivity(), v5Var, null, false, false);
                w80Var.d.setVisibility(8);
                w80Var.a.setGravity(17);
                w80Var.h.setVisibility(8);
                w80Var.v.setVisibility(8);
                w80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = w80Var;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new zg.b(v5Var.getParentActivity());
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                f6Var = ((org.telegram.ui.ActionBar.n2) v5Var).resourceProvider;
                a7Var = new org.telegram.ui.Cells.e9(context, 20, f6Var);
                view = a7Var;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.s3(v5Var.getParentActivity(), 8);
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 8:
                bi.g5 g5Var = new bi.g5(v5Var.getParentActivity(), 7);
                TextView textView = new TextView(v5Var.getParentActivity());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(v5Var.g0) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.y6, null, false, textView, 17);
                g5Var.addView(textView, w7.x5.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = g5Var;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 9:
                n5 n5Var = new n5(v5Var.getParentActivity(), 0);
                n5Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                view = n5Var;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(v5Var.getParentActivity());
                r8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                r8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.j6.q6;
                r8Var.e(i11, i11);
                view = r8Var;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 11:
                view = new zg.c(v5Var.getParentActivity());
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 12:
                lg.c cVar2 = new lg.c(v5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 13:
                Activity parentActivity = v5Var.getParentActivity();
                f6Var2 = ((org.telegram.ui.ActionBar.n2) v5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, f6Var2);
                v5Var.T = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.j6.Fh;
                int i13 = org.telegram.ui.ActionBar.j6.Eh;
                scrollSlidingTextTabStrip.L = i12;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.d();
                ah.w wVar = new ah.w(this, v5Var.getParentActivity());
                v5Var.T.setDelegate(new g(this, 6));
                wVar.addView(v5Var.T, w7.x5.c(48.0f, -2));
                view = wVar;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 14:
                view = v5Var.r0(v5Var.getParentActivity());
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
            case 15:
                di.eb ebVar = new di.eb(this, v5Var.getParentActivity(), 9);
                ebVar.setTag(-33024);
                view = ebVar;
                return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
        }
    }
}
