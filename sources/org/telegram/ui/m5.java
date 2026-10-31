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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m5 extends hg.c {
    public final /* synthetic */ t5 d;

    public m5(t5 t5Var) {
        this.d = t5Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return ((s5) this.d.c0.get(c1Var.b())).b;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.c0.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((s5) this.d.c0.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        t5 t5Var = this.d;
        int i12 = t5Var.S;
        TLRPC.Chat chat = t5Var.i0;
        ArrayList arrayList = t5Var.c0;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 4 || i13 == 14 || i13 == 15) {
            return;
        }
        if (i13 == 1 || i13 == 12 || i13 == 16) {
            dg.d dVar = (dg.d) view;
            dVar.setTitle(((s5) arrayList.get(i10)).c);
            dVar.c(false);
            if (c1Var.f == 12) {
                dVar.setPadding(org.telegram.messenger.i0.L(3.0f), dVar.getPaddingTop(), dVar.getPaddingRight(), dVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i13 == 0) {
            o61 o61Var = (o61) view;
            o61Var.a(Integer.toString(t5Var.T.level), 0, null, org.telegram.messenger.cd.L0(2131753159, null));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = t5Var.T.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    o61Var.a("≈" + ((int) t5Var.T.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat) ? 2131746944 : 2131747054, null));
                    o61Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.cd.L0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var.T;
                    o61Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.cd.L0(2131753157, null));
                    o61Var.setPadding(org.telegram.messenger.i0.L(23.0f), o61Var.getPaddingTop(), org.telegram.messenger.i0.L(23.0f), o61Var.getPaddingBottom());
                    return;
                }
            }
            o61Var.a("~0", 1, "0%", org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(chat) ? 2131746944 : 2131747054, null));
            o61Var.a(String.valueOf(t5Var.T.boosts), 2, null, org.telegram.messenger.cd.L0(2131753162, null));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = t5Var.T;
            o61Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.cd.L0(2131753157, null));
            o61Var.setPadding(org.telegram.messenger.i0.L(23.0f), o61Var.getPaddingTop(), org.telegram.messenger.i0.L(23.0f), o61Var.getPaddingBottom());
            return;
        }
        if (i13 == 5) {
            TL_stories.Boost boost = ((s5) arrayList.get(i10)).d;
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(boost.user_id));
            rg.b bVar = (rg.b) view;
            bVar.d(Z1, org.telegram.messenger.i5.p(Z1), boost.multiplier > 1 ? org.telegram.messenger.cd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.cd.r(boost.expires, false)) : org.telegram.messenger.cd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.cd.r(boost.expires, false)), !((s5) arrayList.get(i10)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 6) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setText(((s5) arrayList.get(i10)).c);
            b9Var.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.875f, -1));
            return;
        }
        if (i13 == 9) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            if (t5Var.d0 == 0) {
                b5Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.cd.G(t5Var.Z, "BoostingShowMoreBoosts", new Object[0]), false);
                return;
            } else {
                b5Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.cd.G(t5Var.b0, "BoostingShowMoreGifts", new Object[0]), false);
                return;
            }
        }
        if (i13 == 3) {
            ((org.telegram.ui.Components.j80) view).setLink(((s5) arrayList.get(i10)).c);
            return;
        }
        if (i13 == 11) {
            s5 s5Var = (s5) arrayList.get(i10);
            TL_stories.PrepaidGiveaway prepaidGiveaway = s5Var.e;
            boolean z10 = s5Var.f;
            rg.c cVar = (rg.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar.d(prepaidGiveaway, org.telegram.messenger.cd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.cd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.cd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar.d(prepaidGiveaway, org.telegram.messenger.cd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.cd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
            }
            cVar.setImage(prepaidGiveaway);
            cVar.setAvatarPadding(5);
            return;
        }
        if (i13 == 13) {
            if (t5Var.V.getTag() == null || ((Integer) t5Var.V.getTag()).intValue() != Objects.hash(Integer.valueOf(t5Var.o0), Integer.valueOf(t5Var.n0))) {
                t5Var.V.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(t5Var.o0), Integer.valueOf(t5Var.n0))));
                t5Var.V.f();
                t5Var.V.a(0, org.telegram.messenger.cd.G(t5Var.o0, "BoostingBoostsCount", new Object[0]), null);
                if (org.telegram.messenger.vp.r1(i12).q4 && (i11 = t5Var.n0) > 0 && i11 != t5Var.o0) {
                    t5Var.V.a(1, org.telegram.messenger.cd.G(i11, "BoostingGiftsCount", new Object[0]), null);
                }
                t5Var.V.setInitialTabId(t5Var.d0);
                t5Var.V.c();
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View c7Var;
        View view;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        int i11 = 0;
        t5 t5Var = this.d;
        switch (i10) {
            case 0:
                view = new o61(t5Var.getParentActivity(), 2);
                return sc.e.o(view, view, -1, -2);
            case 1:
            case 16:
                dg.d dVar = new dg.d(t5Var.getParentActivity(), null);
                dVar.setPadding(dVar.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), dVar.getRight(), org.telegram.messenger.i0.L(16.0f));
                view = dVar;
                return sc.e.o(view, view, -1, -2);
            case 2:
                c7Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), 0, 0);
                view = c7Var;
                return sc.e.o(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(t5Var.getParentActivity(), t5Var, null, false, false);
                j80Var.d.setVisibility(8);
                j80Var.a.setGravity(17);
                j80Var.h.setVisibility(8);
                j80Var.w.setVisibility(8);
                j80Var.setPadding(org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(24.0f));
                view = j80Var;
                return sc.e.o(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new rg.b(t5Var.getParentActivity());
                return sc.e.o(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                p6Var = ((org.telegram.ui.ActionBar.k2) t5Var).resourceProvider;
                c7Var = new org.telegram.ui.Cells.b9(20, context, p6Var);
                view = c7Var;
                return sc.e.o(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.x3(t5Var.getParentActivity(), 8);
                return sc.e.o(view, view, -1, -2);
            case 8:
                org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(t5Var.getParentActivity(), 11);
                TextView textView = new TextView(t5Var.getParentActivity());
                textView.setText(org.telegram.messenger.cd.L0(org.telegram.messenger.w3.V(t5Var.i0) ? 2131748251 : 2131748252, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.y6, null);
                textView.setGravity(17);
                a5Var.addView(textView, w7.b6.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = a5Var;
                return sc.e.o(view, view, -1, -2);
            case 9:
                l5 l5Var = new l5(t5Var.getParentActivity(), i11);
                l5Var.a(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                view = l5Var;
                return sc.e.o(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(t5Var.getParentActivity());
                p8Var.o(R.drawable.msg_gift_premium, org.telegram.messenger.cd.a0(null, null, 2131753512, new Object[0]), false);
                p8Var.s = 64;
                int i12 = org.telegram.ui.ActionBar.t6.q6;
                p8Var.g(i12, i12);
                view = p8Var;
                return sc.e.o(view, view, -1, -2);
            case 11:
                view = new rg.c(t5Var.getParentActivity());
                return sc.e.o(view, view, -1, -2);
            case 12:
                dg.d dVar2 = new dg.d(t5Var.getParentActivity(), null);
                dVar2.setPadding(dVar2.getPaddingLeft(), org.telegram.messenger.i0.L(16.0f), dVar2.getRight(), org.telegram.messenger.i0.L(8.0f));
                view = dVar2;
                return sc.e.o(view, view, -1, -2);
            case 13:
                Activity parentActivity = t5Var.getParentActivity();
                p6Var2 = ((org.telegram.ui.ActionBar.k2) t5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, p6Var2);
                t5Var.V = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.t6.a;
                int i14 = org.telegram.ui.ActionBar.t6.ti;
                int i15 = org.telegram.ui.ActionBar.t6.si;
                int i16 = org.telegram.ui.ActionBar.t6.a;
                scrollSlidingTextTabStrip.L = i14;
                scrollSlidingTextTabStrip.M = i15;
                scrollSlidingTextTabStrip.updateColors();
                fg.i iVar = new fg.i(this, t5Var.getParentActivity());
                t5Var.V.setDelegate(new e(this, 6));
                iVar.addView(t5Var.V, w7.b6.c(48.0f, -2));
                view = iVar;
                return sc.e.o(view, view, -1, -2);
            case 14:
                view = t5Var.n0(t5Var.getParentActivity());
                return sc.e.o(view, view, -1, -2);
            case 15:
                bi.t0 t0Var = new bi.t0(this, t5Var.getParentActivity(), 5);
                t0Var.setTag(-33024);
                view = t0Var;
                return sc.e.o(view, view, -1, -2);
        }
    }
}
