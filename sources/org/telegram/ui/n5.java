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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class n5 extends rg.b {
    public final /* synthetic */ t5 d;

    public n5(t5 t5Var) {
        this.d = t5Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return ((s5) this.d.d0.get(f1Var.b())).b;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.d0.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((s5) this.d.d0.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        t5 t5Var = this.d;
        int i11 = t5Var.T;
        TLRPC.Chat chat = t5Var.j0;
        ArrayList arrayList = t5Var.d0;
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 == 4 || i12 == 14 || i12 == 15) {
            return;
        }
        if (i12 == 1 || i12 == 12 || i12 == 16) {
            ng.c cVar = (ng.c) view;
            cVar.setTitle(((s5) arrayList.get(i7)).c);
            cVar.c(false);
            if (f1Var.f == 12) {
                cVar.setPadding(org.telegram.messenger.g0.L(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i12 == 0) {
            v41 v41Var = (v41) view;
            v41Var.a(Integer.toString(t5Var.U.level), 0, null, org.telegram.messenger.gd.N0(2131753156, null));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = t5Var.U.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    v41Var.a("≈" + ((int) t5Var.U.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat) ? 2131746735 : 2131746845, null));
                    v41Var.a(String.valueOf(t5Var.U.boosts), 2, null, org.telegram.messenger.gd.N0(2131753159, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t5Var.U;
                    v41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.gd.N0(2131753154, null));
                    v41Var.setPadding(org.telegram.messenger.g0.L(23.0f), v41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), v41Var.getPaddingBottom());
                    return;
                }
            }
            v41Var.a("~0", 1, "0%", org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat) ? 2131746735 : 2131746845, null));
            v41Var.a(String.valueOf(t5Var.U.boosts), 2, null, org.telegram.messenger.gd.N0(2131753159, null));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = t5Var.U;
            v41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.gd.N0(2131753154, null));
            v41Var.setPadding(org.telegram.messenger.g0.L(23.0f), v41Var.getPaddingTop(), org.telegram.messenger.g0.L(23.0f), v41Var.getPaddingBottom());
            return;
        }
        if (i12 == 5) {
            TL_stories.Boost boost = ((s5) arrayList.get(i7)).d;
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(boost.user_id));
            bh.b bVar = (bh.b) view;
            bVar.d(c22, org.telegram.messenger.i5.p(c22), boost.multiplier > 1 ? org.telegram.messenger.gd.a0("BoostsExpireOn", null, 2131753158, org.telegram.messenger.gd.r(boost.expires, false)) : org.telegram.messenger.gd.a0("BoostExpireOn", null, 2131753658, org.telegram.messenger.gd.r(boost.expires, false)), !((s5) arrayList.get(i7)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setText(((s5) arrayList.get(i7)).c);
            z8Var.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.875f, -1));
            return;
        }
        if (i12 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (t5Var.e0 == 0) {
                y4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.gd.G(t5Var.a0, "BoostingShowMoreBoosts", new Object[0]), false);
                return;
            } else {
                y4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.gd.G(t5Var.c0, "BoostingShowMoreGifts", new Object[0]), false);
                return;
            }
        }
        if (i12 == 3) {
            ((org.telegram.ui.Components.d80) view).setLink(((s5) arrayList.get(i7)).c);
            return;
        }
        if (i12 == 11) {
            s5 s5Var = (s5) arrayList.get(i7);
            TL_stories.PrepaidGiveaway prepaidGiveaway = s5Var.e;
            boolean z10 = s5Var.f;
            bh.c cVar2 = (bh.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.d(prepaidGiveaway, org.telegram.messenger.gd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.gd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.gd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.d(prepaidGiveaway, org.telegram.messenger.gd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.gd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i12 == 13) {
            if (t5Var.W.getTag() == null || ((Integer) t5Var.W.getTag()).intValue() != Objects.hash(Integer.valueOf(t5Var.p0), Integer.valueOf(t5Var.o0))) {
                t5Var.W.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(t5Var.p0), Integer.valueOf(t5Var.o0))));
                t5Var.W.f();
                t5Var.W.a(0, org.telegram.messenger.gd.G(t5Var.p0, "BoostingBoostsCount", new Object[0]), null);
                if (org.telegram.messenger.mp.u1(i11).s4 && (i10 = t5Var.o0) > 0 && i10 != t5Var.p0) {
                    t5Var.W.a(1, org.telegram.messenger.gd.G(i10, "BoostingGiftsCount", new Object[0]), null);
                }
                t5Var.W.setInitialTabId(t5Var.e0);
                t5Var.W.c();
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View y6Var;
        View view;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i10 = 0;
        t5 t5Var = this.d;
        switch (i7) {
            case 0:
                view = new v41(t5Var.getParentActivity(), 2);
                return i5.c.q(view, view, -1, -2);
            case 1:
            case 16:
                ng.c cVar = new ng.c(t5Var.getParentActivity(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                view = cVar;
                return i5.c.q(view, view, -1, -2);
            case 2:
                y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), 0, 0);
                view = y6Var;
                return i5.c.q(view, view, -1, -2);
            case 3:
                org.telegram.ui.Components.d80 d80Var = new org.telegram.ui.Components.d80(t5Var.getParentActivity(), t5Var, null, false, false);
                d80Var.d.setVisibility(8);
                d80Var.a.setGravity(17);
                d80Var.h.setVisibility(8);
                d80Var.w.setVisibility(8);
                d80Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                view = d80Var;
                return i5.c.q(view, view, -1, -2);
            case 4:
            default:
                throw new UnsupportedOperationException();
            case 5:
                view = new bh.b(t5Var.getParentActivity());
                return i5.c.q(view, view, -1, -2);
            case 6:
                Context context = viewGroup.getContext();
                i6Var = ((org.telegram.ui.ActionBar.g2) t5Var).resourceProvider;
                y6Var = new org.telegram.ui.Cells.z8(20, context, i6Var);
                view = y6Var;
                return i5.c.q(view, view, -1, -2);
            case 7:
                view = new org.telegram.ui.Cells.w3(t5Var.getParentActivity(), 8);
                return i5.c.q(view, view, -1, -2);
            case 8:
                bi.v2 v2Var = new bi.v2(t5Var.getParentActivity(), 9);
                TextView textView = new TextView(t5Var.getParentActivity());
                org.telegram.messenger.m10.l(14.0f, org.telegram.messenger.v3.V(t5Var.j0) ? 2131748041 : 2131748042, 1, textView, null);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.y6, null);
                textView.setGravity(17);
                v2Var.addView(textView, c8.na.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = v2Var;
                return i5.c.q(view, view, -1, -2);
            case 9:
                m5 m5Var = new m5(t5Var.getParentActivity(), i10);
                m5Var.a(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                view = m5Var;
                return i5.c.q(view, view, -1, -2);
            case 10:
                org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(t5Var.getParentActivity());
                m8Var.o(R.drawable.msg_gift_premium, org.telegram.messenger.gd.a0(null, null, 2131753509, new Object[0]), false);
                m8Var.s = 64;
                int i11 = org.telegram.ui.ActionBar.n6.q6;
                m8Var.g(i11, i11);
                view = m8Var;
                return i5.c.q(view, view, -1, -2);
            case 11:
                view = new bh.c(t5Var.getParentActivity());
                return i5.c.q(view, view, -1, -2);
            case 12:
                ng.c cVar2 = new ng.c(t5Var.getParentActivity(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                view = cVar2;
                return i5.c.q(view, view, -1, -2);
            case 13:
                Activity parentActivity = t5Var.getParentActivity();
                i6Var2 = ((org.telegram.ui.ActionBar.g2) t5Var).resourceProvider;
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(parentActivity, i6Var2);
                t5Var.W = scrollSlidingTextTabStrip;
                int i12 = org.telegram.ui.ActionBar.n6.a;
                int i13 = org.telegram.ui.ActionBar.n6.wi;
                int i14 = org.telegram.ui.ActionBar.n6.vi;
                int i15 = org.telegram.ui.ActionBar.n6.a;
                scrollSlidingTextTabStrip.M = i13;
                scrollSlidingTextTabStrip.N = i14;
                scrollSlidingTextTabStrip.updateColors();
                ai.h0 h0Var = new ai.h0(this, t5Var.getParentActivity());
                t5Var.W.setDelegate(new f(this, 6));
                h0Var.addView(t5Var.W, c8.na.c(48.0f, -2));
                view = h0Var;
                return i5.c.q(view, view, -1, -2);
            case 14:
                view = t5Var.o0(t5Var.getParentActivity());
                return i5.c.q(view, view, -1, -2);
            case 15:
                bi.o3 o3Var = new bi.o3(11, t5Var.getParentActivity(), this);
                o3Var.setTag(-33024);
                view = o3Var;
                return i5.c.q(view, view, -1, -2);
        }
    }
}
