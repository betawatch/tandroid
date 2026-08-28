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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o5 extends wf.b {
    public final /* synthetic */ u5 d;

    public o5(u5 u5Var) {
        this.d = u5Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return ((t5) this.d.W.get(q1Var.b())).b;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.W.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((t5) this.d.W.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        u5 u5Var = this.d;
        int i11 = u5Var.M;
        TLRPC.Chat chat = u5Var.c0;
        ArrayList arrayList = u5Var.W;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 == 4 || i12 == 14 || i12 == 15) {
            return;
        }
        if (i12 == 1 || i12 == 12 || i12 == 16) {
            sf.c cVar = (sf.c) view;
            cVar.setTitle(((t5) arrayList.get(i9)).c);
            cVar.c(false);
            if (q1Var.f == 12) {
                cVar.setPadding(AndroidUtilities.dp(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i12 == 0) {
            m91 m91Var = (m91) view;
            m91Var.a(Integer.toString(u5Var.N.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = u5Var.N.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    m91Var.a("≈" + ((int) u5Var.N.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    m91Var.a(String.valueOf(u5Var.N.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = u5Var.N;
                    m91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                    m91Var.setPadding(AndroidUtilities.dp(23.0f), m91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), m91Var.getPaddingBottom());
                    return;
                }
            }
            m91Var.a("~0", 1, "0%", LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
            m91Var.a(String.valueOf(u5Var.N.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = u5Var.N;
            m91Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
            m91Var.setPadding(AndroidUtilities.dp(23.0f), m91Var.getPaddingTop(), AndroidUtilities.dp(23.0f), m91Var.getPaddingBottom());
            return;
        }
        if (i12 == 5) {
            TL_stories.Boost boost = ((t5) arrayList.get(i9)).d;
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(boost.user_id));
            gg.b bVar = (gg.b) view;
            bVar.e(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((t5) arrayList.get(i9)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setText(((t5) arrayList.get(i9)).c);
            b9Var.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.875f, -1));
            return;
        }
        if (i12 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (u5Var.X == 0) {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreBoosts", u5Var.T, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            } else {
                y4Var.b(LocaleController.formatPluralString("BoostingShowMoreGifts", u5Var.V, new Object[0]), R.drawable.arrow_more, 5, false);
                return;
            }
        }
        if (i12 == 3) {
            ((org.telegram.ui.Components.e80) view).setLink(((t5) arrayList.get(i9)).c);
            return;
        }
        if (i12 == 11) {
            t5 t5Var = (t5) arrayList.get(i9);
            TL_stories.PrepaidGiveaway prepaidGiveaway = t5Var.e;
            boolean z10 = t5Var.f;
            gg.c cVar2 = (gg.c) view;
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
        if (i12 == 13) {
            if (u5Var.P.getTag() == null || ((Integer) u5Var.P.getTag()).intValue() != Objects.hash(Integer.valueOf(u5Var.i0), Integer.valueOf(u5Var.h0))) {
                u5Var.P.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(u5Var.i0), Integer.valueOf(u5Var.h0))));
                u5Var.P.g();
                u5Var.P.a(0, LocaleController.formatPluralString("BoostingBoostsCount", u5Var.i0, new Object[0]), null);
                if (MessagesController.getInstance(i11).giveawayGiftsPurchaseAvailable && (i10 = u5Var.h0) > 0 && i10 != u5Var.i0) {
                    u5Var.P.a(1, LocaleController.formatPluralString("BoostingGiftsCount", i10, new Object[0]), null);
                }
                u5Var.P.setInitialTabId(u5Var.X);
                u5Var.P.c();
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View z6Var;
        View view;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        u5 u5Var = this.d;
        switch (i9) {
            case 0:
                view = new m91(u5Var.getParentActivity(), 2);
                return j3.r0.s(view, view, -1, -2);
            case 1:
            case 16:
                sf.c cVar = new sf.c(u5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
                view = cVar;
                return j3.r0.s(view, view, -1, -2);
            case 2:
                z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), 0, 0);
                view = z6Var;
                return j3.r0.s(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(u5Var.getParentActivity(), u5Var, null, false, false);
                e80Var.d.setVisibility(8);
                e80Var.a.setGravity(17);
                e80Var.h.setVisibility(8);
                e80Var.v.setVisibility(8);
                e80Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                view = e80Var;
                return j3.r0.s(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new gg.b(u5Var.getParentActivity());
                return j3.r0.s(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                b6Var = ((org.telegram.ui.ActionBar.o2) u5Var).resourceProvider;
                z6Var = new org.telegram.ui.Cells.b9(context, 20, b6Var);
                view = z6Var;
                return j3.r0.s(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.t3(u5Var.getParentActivity(), 8);
                return j3.r0.s(view, view, -1, -2);
            case 8:
                dh.g gVar = new dh.g(u5Var.getParentActivity(), 6);
                TextView textView = new TextView(u5Var.getParentActivity());
                textView.setText(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(u5Var.c0) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint));
                textView.setTextSize(1, 14.0f);
                j3.r0.w(org.telegram.ui.ActionBar.f6.y6, null, false, textView, 17);
                gVar.addView(textView, g7.e6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = gVar;
                return j3.r0.s(view, view, -1, -2);
            case 9:
                n5 n5Var = new n5(u5Var.getParentActivity(), 0);
                n5Var.a(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                view = n5Var;
                return j3.r0.s(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(u5Var.getParentActivity());
                p8Var.m(R.drawable.msg_gift_premium, LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                p8Var.s = 64;
                int i10 = org.telegram.ui.ActionBar.f6.q6;
                p8Var.e(i10, i10);
                view = p8Var;
                return j3.r0.s(view, view, -1, -2);
            case 11:
                view = new gg.c(u5Var.getParentActivity());
                return j3.r0.s(view, view, -1, -2);
            case 12:
                sf.c cVar2 = new sf.c(u5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar2.getRight(), AndroidUtilities.dp(8.0f));
                view = cVar2;
                return j3.r0.s(view, view, -1, -2);
            case 13:
                Activity parentActivity = u5Var.getParentActivity();
                b6Var2 = ((org.telegram.ui.ActionBar.o2) u5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, b6Var2);
                u5Var.P = scrollSlidingTextTabStrip;
                int i11 = org.telegram.ui.ActionBar.f6.Fh;
                int i12 = org.telegram.ui.ActionBar.f6.Eh;
                scrollSlidingTextTabStrip.H = i11;
                scrollSlidingTextTabStrip.I = i12;
                scrollSlidingTextTabStrip.d();
                fh.v vVar = new fh.v(this, u5Var.getParentActivity());
                u5Var.P.setDelegate(new g(this, 6));
                vVar.addView(u5Var.P, g7.e6.c(48.0f, -2));
                view = vVar;
                return j3.r0.s(view, view, -1, -2);
            case 14:
                view = u5Var.q0(u5Var.getParentActivity());
                return j3.r0.s(view, view, -1, -2);
            case 15:
                fh.l2 l2Var = new fh.l2(this, u5Var.getParentActivity(), 8);
                l2Var.setTag(-33024);
                view = l2Var;
                return j3.r0.s(view, view, -1, -2);
        }
    }
}
