package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qb extends rg.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ sb f;

    public qb(sb sbVar) {
        this.f = sbVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return ((rb) this.f.y.get(e1Var.b())).b;
    }

    @Override // v4.h0
    public final int b() {
        return this.f.y.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        return ((rb) this.f.y.get(i7)).a;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        sb sbVar = this.f;
        int i11 = sbVar.b;
        TLRPC.Chat chat = sbVar.J;
        ArrayList arrayList = sbVar.y;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 4) {
            return;
        }
        if (i12 == 1 || i12 == 12) {
            ng.c cVar = (ng.c) view;
            cVar.setTitle(((rb) arrayList.get(i7)).c);
            cVar.c(false);
            if (e1Var.f == 12) {
                cVar.setPadding(org.telegram.messenger.g0.L(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i12 == 0) {
            t41 t41Var = (t41) view;
            t41Var.a(Integer.toString(sbVar.d.level), 0, null, org.telegram.messenger.hd.M0(2131753159, null));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = sbVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    t41Var.a("≈" + ((int) sbVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131746929 : 2131747039, null));
                    t41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.hd.M0(2131753162, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sbVar.d;
                    t41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.hd.M0(2131753157, null));
                    return;
                }
            }
            t41Var.a("≈0", 1, "0%", org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(chat) ? 2131746929 : 2131747039, null));
            t41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.hd.M0(2131753162, null));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = sbVar.d;
            t41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.hd.M0(2131753157, null));
            return;
        }
        if (i12 == 5) {
            TL_stories.Boost boost = ((rb) arrayList.get(i7)).d;
            TLRPC.User a22 = org.telegram.messenger.np.s1(i11).a2(Long.valueOf(boost.user_id));
            bh.b bVar = (bh.b) view;
            bVar.d(a22, org.telegram.messenger.g5.p(a22), boost.multiplier > 1 ? org.telegram.messenger.hd.a0("BoostsExpireOn", null, 2131753161, org.telegram.messenger.hd.r(boost.expires, false)) : org.telegram.messenger.hd.a0("BoostExpireOn", null, 2131753661, org.telegram.messenger.hd.r(boost.expires, false)), !((rb) arrayList.get(i7)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i12 == 6) {
            ((org.telegram.ui.Cells.y8) view).setText(((rb) arrayList.get(i7)).c);
            return;
        }
        if (i12 == 9) {
            org.telegram.ui.Cells.x4 x4Var = (org.telegram.ui.Cells.x4) view;
            if (sbVar.E == 0) {
                x4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.hd.G(sbVar.s, "BoostingShowMoreBoosts", new Object[0]), false);
                return;
            } else {
                x4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.hd.G(sbVar.x, "BoostingShowMoreGifts", new Object[0]), false);
                return;
            }
        }
        if (i12 == 3) {
            ((org.telegram.ui.Components.t70) view).setLink(((rb) arrayList.get(i7)).c);
            return;
        }
        if (i12 == 11) {
            rb rbVar = (rb) arrayList.get(i7);
            TL_stories.PrepaidGiveaway prepaidGiveaway = rbVar.e;
            boolean z10 = rbVar.f;
            bh.c cVar2 = (bh.c) view;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                cVar2.d(prepaidGiveaway, org.telegram.messenger.hd.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), org.telegram.messenger.hd.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", org.telegram.messenger.hd.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !z10);
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                cVar2.d(prepaidGiveaway, org.telegram.messenger.hd.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), org.telegram.messenger.hd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !z10);
            }
            cVar2.setImage(prepaidGiveaway);
            cVar2.setAvatarPadding(5);
            return;
        }
        if (i12 == 13) {
            int i13 = this.d;
            int i14 = sbVar.P;
            if (i13 == i14 && this.e == sbVar.O) {
                return;
            }
            this.d = i14;
            this.e = sbVar.O;
            sbVar.f.f();
            sbVar.f.a(0, org.telegram.messenger.hd.G(sbVar.P, "BoostingBoostsCount", new Object[0]), null);
            if (org.telegram.messenger.np.s1(i11).q4 && (i10 = sbVar.O) > 0 && i10 != sbVar.P) {
                sbVar.f.a(1, org.telegram.messenger.hd.G(i10, "BoostingGiftsCount", new Object[0]), null);
            }
            sbVar.f.setInitialTabId(sbVar.E);
            sbVar.f.c();
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        sb sbVar = this.f;
        org.telegram.ui.ActionBar.e6 e6Var = sbVar.e;
        z41 z41Var = sbVar.c;
        int i10 = 1;
        switch (i7) {
            case 0:
                view = new t41(sbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new ng.c(sbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                view = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i11 = org.telegram.ui.ActionBar.j6.a7;
                View x6Var = new org.telegram.ui.Cells.x6(context, org.telegram.ui.ActionBar.j6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.q6.h(i11, x6Var, null);
                view = x6Var;
                break;
            case 3:
                org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(sbVar.getContext(), sbVar.c, null, false, false);
                t70Var.d.setVisibility(8);
                t70Var.a.setGravity(17);
                t70Var.h.setVisibility(8);
                t70Var.w.setVisibility(8);
                t70Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                view = t70Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(R.drawable.filled_limit_boost, 0, 0, sbVar.getContext(), sbVar.e);
                limitPreviewView.d0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f));
                limitPreviewView.g(sbVar.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new bh.b(sbVar.getContext());
                break;
            case 6:
                view = new org.telegram.ui.Cells.y8(20, viewGroup.getContext(), e6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.v3(sbVar.getContext(), 8);
                break;
            case 8:
                bi.v1 v1Var = new bi.v1(sbVar.getContext(), 10);
                TextView textView = new TextView(sbVar.getContext());
                textView.setText(org.telegram.messenger.hd.M0(org.telegram.messenger.t3.V(sbVar.J) ? 2131748234 : 2131748235, null));
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.y6, null);
                textView.setGravity(17);
                v1Var.addView(textView, c8.ja.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = v1Var;
                break;
            case 9:
                m5 m5Var = new m5(sbVar.getContext(), i10);
                m5Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                view = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(sbVar.getContext());
                l8Var.o(R.drawable.msg_gift_premium, org.telegram.messenger.hd.a0("BoostingGetBoostsViaGifts", null, 2131753512, new Object[0]), false);
                l8Var.s = 64;
                int i12 = org.telegram.ui.ActionBar.j6.q6;
                l8Var.g(i12, i12);
                view = l8Var;
                break;
            case 11:
                view = new bh.c(sbVar.getContext());
                break;
            case 12:
                View cVar2 = new ng.c(sbVar.getContext(), null);
                cVar2.setPadding(cVar2.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar2.getRight(), org.telegram.messenger.g0.L(8.0f));
                view = cVar2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(z41Var.getParentActivity(), e6Var);
                sbVar.f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.j6.a;
                int i14 = org.telegram.ui.ActionBar.j6.wi;
                int i15 = org.telegram.ui.ActionBar.j6.vi;
                int i16 = org.telegram.ui.ActionBar.j6.a;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.N = i15;
                scrollSlidingTextTabStrip.updateColors();
                ai.k0 k0Var = new ai.k0(this, z41Var.getParentActivity());
                sbVar.f.setDelegate(new f(this, 9));
                k0Var.addView(sbVar.f, c8.ja.c(48.0f, -2));
                view = k0Var;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return i5.c.q(view, view, -1, -2);
    }
}
