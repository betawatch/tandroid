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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n5 extends rg.b {
    public final /* synthetic */ t5 d;

    public n5(t5 t5Var) {
        this.d = t5Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return ((s5) this.d.c0.get(d1Var.b())).b;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.c0.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        return ((s5) this.d.c0.get(i7)).a;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        t5 t5Var = this.d;
        int i11 = t5Var.S;
        TLRPC.Chat chat = t5Var.i0;
        ArrayList arrayList = t5Var.c0;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 4 || i12 == 14 || i12 == 15) {
            return;
        }
        if (i12 == 1 || i12 == 12 || i12 == 16) {
            ng.c cVar = (ng.c) view;
            cVar.setTitle(((s5) arrayList.get(i7)).c);
            cVar.c(false);
            if (d1Var.f == 12) {
                cVar.setPadding(org.telegram.messenger.g0.L(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i12 == 0) {
            x41 x41Var = (x41) view;
            x41Var.a(Integer.toString(t5Var.T.level), 0, null, org.telegram.messenger.id.M0(2131753159, null));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = t5Var.T.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    x41Var.a("≈" + ((int) t5Var.T.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131746929 : 2131747039, null));
                    x41Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.id.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var.T;
                    x41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.id.M0(2131753157, null));
                    x41Var.setPadding(org.telegram.messenger.g0.L(23.0f), x41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), x41Var.getPaddingBottom());
                    return;
                }
            }
            x41Var.a("~0", 1, "0%", org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(chat) ? 2131746929 : 2131747039, null));
            x41Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.id.M0(2131753162, null));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = t5Var.T;
            x41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.id.M0(2131753157, null));
            x41Var.setPadding(org.telegram.messenger.g0.L(23.0f), x41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), x41Var.getPaddingBottom());
            return;
        }
        if (i12 == 5) {
            TL_stories.Boost boost = ((s5) arrayList.get(i7)).d;
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i11).a2(Long.valueOf(boost.user_id));
            bh.b bVar = (bh.b) view;
            bVar.d(a22, org.telegram.messenger.g5.p(a22), boost.multiplier > 1 ? org.telegram.messenger.id.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.id.r(boost.expires, false)) : org.telegram.messenger.id.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.id.r(boost.expires, false)), !((s5) arrayList.get(i7)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setText(((s5) arrayList.get(i7)).c);
            z8Var.setTextColor(org.telegram.ui.ActionBar.l6.r1(0.875f, -1));
            return;
        }
        if (i12 == 9) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (t5Var.d0 == 0) {
                x4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.id.G(t5Var.Z, "BoostingShowMoreBoosts", new Object[0]), false);
                return;
            } else {
                x4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.id.G(t5Var.b0, "BoostingShowMoreGifts", new Object[0]), false);
                return;
            }
        }
        if (i12 == 3) {
            ((org.telegram.ui.Components.r70) view).setLink(((s5) arrayList.get(i7)).c);
            return;
        }
        if (i12 == 11) {
            s5 s5Var = (s5) arrayList.get(i7);
            TL_stories.PrepaidGiveaway prepaidGiveaway = s5Var.e;
            boolean z9 = s5Var.f;
            bh.c cVar2 = (bh.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.d(prepaidGiveaway, org.telegram.messenger.id.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.id.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.id.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z9);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.d(prepaidGiveaway, org.telegram.messenger.id.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.id.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z9);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i12 == 13) {
            if (t5Var.V.getTag() == null || ((Integer) t5Var.V.getTag()).intValue() != Objects.hash(Integer.valueOf(t5Var.o0), Integer.valueOf(t5Var.n0))) {
                t5Var.V.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(t5Var.o0), Integer.valueOf(t5Var.n0))));
                t5Var.V.f();
                t5Var.V.a(0, org.telegram.messenger.id.G(t5Var.o0, "BoostingBoostsCount", new Object[0]), null);
                if (org.telegram.messenger.qp.s1(i11).p4 && (i10 = t5Var.n0) > 0 && i10 != t5Var.o0) {
                    t5Var.V.a(1, org.telegram.messenger.id.G(i10, "BoostingGiftsCount", new Object[0]), null);
                }
                t5Var.V.setInitialTabId(t5Var.d0);
                t5Var.V.c();
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View y6Var;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i10 = 0;
        t5 t5Var = this.d;
        switch (i7) {
            case 0:
                view = new x41(t5Var.getParentActivity(), 2);
                return jg.g.r(view, view, -1, -2);
            case 1:
            case 16:
                ng.c cVar = new ng.c(t5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                view = cVar;
                return jg.g.r(view, view, -1, -2);
            case 2:
                y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), 0, 0);
                view = y6Var;
                return jg.g.r(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.r70 r70Var = new org.telegram.ui.Components.r70(t5Var.getParentActivity(), t5Var, null, false, false);
                r70Var.d.setVisibility(8);
                r70Var.a.setGravity(17);
                r70Var.h.setVisibility(8);
                r70Var.w.setVisibility(8);
                r70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                view = r70Var;
                return jg.g.r(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new bh.b(t5Var.getParentActivity());
                return jg.g.r(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                g6Var = ((org.telegram.ui.ActionBar.f2) t5Var).resourceProvider;
                y6Var = new org.telegram.ui.Cells.z8(20, context, g6Var);
                view = y6Var;
                return jg.g.r(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.v3(t5Var.getParentActivity(), 8);
                return jg.g.r(view, view, -1, -2);
            case 8:
                di.b4 b4Var = new di.b4(t5Var.getParentActivity(), 7);
                TextView textView = new TextView(t5Var.getParentActivity());
                textView.setText(org.telegram.messenger.id.M0(org.telegram.messenger.t3.V(t5Var.i0) ? 2131748234 : 2131748235, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.y6, null);
                textView.setGravity(17);
                b4Var.addView(textView, c8.ha.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = b4Var;
                return jg.g.r(view, view, -1, -2);
            case 9:
                m5 m5Var = new m5(t5Var.getParentActivity(), i10);
                m5Var.a(org.telegram.ui.ActionBar.l6.v6, org.telegram.ui.ActionBar.l6.u6);
                view = m5Var;
                return jg.g.r(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(t5Var.getParentActivity());
                m8Var.o(R.drawable.msg_gift_premium, org.telegram.messenger.id.a0(null, null, 2131753512, new Object[0]), false);
                m8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.l6.q6;
                m8Var.g(i11, i11);
                view = m8Var;
                return jg.g.r(view, view, -1, -2);
            case 11:
                view = new bh.c(t5Var.getParentActivity());
                return jg.g.r(view, view, -1, -2);
            case 12:
                ng.c cVar2 = new ng.c(t5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                view = cVar2;
                return jg.g.r(view, view, -1, -2);
            case 13:
                Activity parentActivity = t5Var.getParentActivity();
                g6Var2 = ((org.telegram.ui.ActionBar.f2) t5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, g6Var2);
                t5Var.V = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.l6.a;
                int i13 = org.telegram.ui.ActionBar.l6.ti;
                int i14 = org.telegram.ui.ActionBar.l6.si;
                int i15 = org.telegram.ui.ActionBar.l6.a;
                scrollSlidingTextTabStrip.L = i13;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.updateColors();
                bi.x5 x5Var = new bi.x5(this, t5Var.getParentActivity());
                t5Var.V.setDelegate(new f(this, 6));
                x5Var.addView(t5Var.V, c8.ha.c(48.0f, -2));
                view = x5Var;
                return jg.g.r(view, view, -1, -2);
            case 14:
                view = t5Var.o0(t5Var.getParentActivity());
                return jg.g.r(view, view, -1, -2);
            case 15:
                bi.ec ecVar = new bi.ec(10, t5Var.getParentActivity(), this);
                ecVar.setTag(-33024);
                view = ecVar;
                return jg.g.r(view, view, -1, -2);
        }
    }
}
