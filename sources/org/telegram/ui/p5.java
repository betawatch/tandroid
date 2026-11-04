package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p5 extends sg.b {
    public final /* synthetic */ v5 d;

    public p5(v5 v5Var) {
        this.d = v5Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return ((u5) this.d.d0.get(d1Var.b())).b;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.d0.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((u5) this.d.d0.get(i3)).a;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        v5 v5Var = this.d;
        int i11 = v5Var.T;
        TLRPC.Chat chat = v5Var.j0;
        ArrayList arrayList = v5Var.d0;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 4 || i12 == 14 || i12 == 15) {
            return;
        }
        if (i12 == 1 || i12 == 12 || i12 == 16) {
            og.c cVar = (og.c) view;
            cVar.setTitle(((u5) arrayList.get(i3)).c);
            cVar.c(false);
            if (d1Var.f == 12) {
                cVar.setPadding(org.telegram.messenger.g0.L(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i12 == 0) {
            l41 l41Var = (l41) view;
            l41Var.a(Integer.toString(v5Var.U.level), 0, null, org.telegram.messenger.bd.M0(2131753159, null));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = v5Var.U.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    l41Var.a("≈" + ((int) v5Var.U.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131746937 : 2131747047, null));
                    l41Var.a(String.valueOf(v5Var.U.boosts), 2, null, org.telegram.messenger.bd.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = v5Var.U;
                    l41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.bd.M0(2131753157, null));
                    l41Var.setPadding(org.telegram.messenger.g0.L(23.0f), l41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), l41Var.getPaddingBottom());
                    return;
                }
            }
            l41Var.a("~0", 1, "0%", org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(chat) ? 2131746937 : 2131747047, null));
            l41Var.a(String.valueOf(v5Var.U.boosts), 2, null, org.telegram.messenger.bd.M0(2131753162, null));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = v5Var.U;
            l41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.bd.M0(2131753157, null));
            l41Var.setPadding(org.telegram.messenger.g0.L(23.0f), l41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), l41Var.getPaddingBottom());
            return;
        }
        if (i12 == 5) {
            TL_stories.Boost boost = ((u5) arrayList.get(i3)).d;
            TLRPC.User a22 = org.telegram.messenger.hp.s1(i11).a2(Long.valueOf(boost.user_id));
            ch.b bVar = (ch.b) view;
            bVar.d(a22, org.telegram.messenger.g5.p(a22), boost.multiplier > 1 ? org.telegram.messenger.bd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.bd.r(boost.expires, false)) : org.telegram.messenger.bd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.bd.r(boost.expires, false)), !((u5) arrayList.get(i3)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setText(((u5) arrayList.get(i3)).c);
            y8Var.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.875f, -1));
            return;
        }
        if (i12 == 9) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (v5Var.e0 == 0) {
                x4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.bd.G(v5Var.a0, "BoostingShowMoreBoosts", new Object[0]), false);
                return;
            } else {
                x4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.bd.G(v5Var.c0, "BoostingShowMoreGifts", new Object[0]), false);
                return;
            }
        }
        if (i12 == 3) {
            ((org.telegram.ui.Components.m70) view).setLink(((u5) arrayList.get(i3)).c);
            return;
        }
        if (i12 == 11) {
            u5 u5Var = (u5) arrayList.get(i3);
            TL_stories.PrepaidGiveaway prepaidGiveaway = u5Var.e;
            boolean z10 = u5Var.f;
            ch.c cVar2 = (ch.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.d(prepaidGiveaway, org.telegram.messenger.bd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.bd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.bd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.d(prepaidGiveaway, org.telegram.messenger.bd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.bd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i12 == 13) {
            if (v5Var.W.getTag() == null || ((Integer) v5Var.W.getTag()).intValue() != Objects.hash(Integer.valueOf(v5Var.p0), Integer.valueOf(v5Var.o0))) {
                v5Var.W.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(v5Var.p0), Integer.valueOf(v5Var.o0))));
                v5Var.W.f();
                v5Var.W.a(0, org.telegram.messenger.bd.G(v5Var.p0, "BoostingBoostsCount", new Object[0]), null);
                if (org.telegram.messenger.hp.s1(i11).p4 && (i10 = v5Var.o0) > 0 && i10 != v5Var.p0) {
                    v5Var.W.a(1, org.telegram.messenger.bd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                }
                v5Var.W.setInitialTabId(v5Var.e0);
                v5Var.W.c();
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View x6Var;
        View view;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i10 = 0;
        v5 v5Var = this.d;
        switch (i3) {
            case 0:
                view = new l41(v5Var.getParentActivity(), 2);
                return k2.p1.p(view, view, -1, -2);
            case 1:
            case 16:
                og.c cVar = new og.c(v5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                view = cVar;
                return k2.p1.p(view, view, -1, -2);
            case 2:
                x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), 0, 0);
                view = x6Var;
                return k2.p1.p(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(v5Var.getParentActivity(), v5Var, null, false, false);
                m70Var.d.setVisibility(8);
                m70Var.a.setGravity(17);
                m70Var.h.setVisibility(8);
                m70Var.w.setVisibility(8);
                m70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                view = m70Var;
                return k2.p1.p(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new ch.b(v5Var.getParentActivity());
                return k2.p1.p(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                e6Var = ((org.telegram.ui.ActionBar.d2) v5Var).resourceProvider;
                x6Var = new org.telegram.ui.Cells.y8(20, context, e6Var);
                view = x6Var;
                return k2.p1.p(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.v3(v5Var.getParentActivity(), 8);
                return k2.p1.p(view, view, -1, -2);
            case 8:
                ai.d2 d2Var = new ai.d2(v5Var.getParentActivity(), 9);
                TextView textView = new TextView(v5Var.getParentActivity());
                textView.setText(org.telegram.messenger.bd.M0(org.telegram.messenger.t3.V(v5Var.j0) ? 2131748242 : 2131748243, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, null);
                textView.setGravity(17);
                d2Var.addView(textView, b8.mf.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = d2Var;
                return k2.p1.p(view, view, -1, -2);
            case 9:
                o5 o5Var = new o5(v5Var.getParentActivity(), i10);
                o5Var.a(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                view = o5Var;
                return k2.p1.p(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(v5Var.getParentActivity());
                l8Var.o(R.drawable.msg_gift_premium, org.telegram.messenger.bd.a0(null, null, 2131753512, new Object[0]), false);
                l8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.k6.q6;
                l8Var.g(i11, i11);
                view = l8Var;
                return k2.p1.p(view, view, -1, -2);
            case 11:
                view = new ch.c(v5Var.getParentActivity());
                return k2.p1.p(view, view, -1, -2);
            case 12:
                og.c cVar2 = new og.c(v5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                view = cVar2;
                return k2.p1.p(view, view, -1, -2);
            case 13:
                Activity parentActivity = v5Var.getParentActivity();
                e6Var2 = ((org.telegram.ui.ActionBar.d2) v5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, e6Var2);
                v5Var.W = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.k6.a;
                int i13 = org.telegram.ui.ActionBar.k6.ti;
                int i14 = org.telegram.ui.ActionBar.k6.si;
                int i15 = org.telegram.ui.ActionBar.k6.a;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.N = i14;
                scrollSlidingTextTabStrip.updateColors();
                ai.c0 c0Var = new ai.c0(this, v5Var.getParentActivity());
                v5Var.W.setDelegate(new f(this, 6));
                c0Var.addView(v5Var.W, b8.mf.c(48.0f, -2));
                view = c0Var;
                return k2.p1.p(view, view, -1, -2);
            case 14:
                view = v5Var.o0(v5Var.getParentActivity());
                return k2.p1.p(view, view, -1, -2);
            case 15:
                ai.x2 x2Var = new ai.x2(11, v5Var.getParentActivity(), this);
                x2Var.setTag(-33024);
                view = x2Var;
                return k2.p1.p(view, view, -1, -2);
        }
    }
}
