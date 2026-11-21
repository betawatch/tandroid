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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class qb extends rg.b {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ sb f;

    public qb(sb sbVar) {
        this.f = sbVar;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return ((rb) this.f.y.get(f1Var.b())).b;
    }

    @Override // v4.i0
    public final int b() {
        return this.f.y.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        return ((rb) this.f.y.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        sb sbVar = this.f;
        int i11 = sbVar.b;
        TLRPC.Chat chat = sbVar.J;
        ArrayList arrayList = sbVar.y;
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 == 4) {
            return;
        }
        if (i12 == 1 || i12 == 12) {
            ng.c cVar = (ng.c) view;
            cVar.setTitle(((rb) arrayList.get(i7)).c);
            cVar.c(false);
            if (f1Var.f == 12) {
                cVar.setPadding(org.telegram.messenger.g0.L(3.0f), cVar.getPaddingTop(), cVar.getPaddingRight(), cVar.getPaddingBottom());
                return;
            }
            return;
        }
        if (i12 == 0) {
            w41 w41Var = (w41) view;
            w41Var.a(Integer.toString(sbVar.d.level), 0, null, org.telegram.messenger.gd.N0(2131753156, null));
            TL_stats.TL_statsPercentValue tL_statsPercentValue = sbVar.d.premium_audience;
            if (tL_statsPercentValue != null) {
                double d = tL_statsPercentValue.total;
                if (d != 0.0d) {
                    w41Var.a("≈" + ((int) sbVar.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat) ? 2131746735 : 2131746845, null));
                    w41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.gd.N0(2131753159, null));
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = sbVar.d;
                    w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, org.telegram.messenger.gd.N0(2131753154, null));
                    return;
                }
            }
            w41Var.a("≈0", 1, "0%", org.telegram.messenger.gd.N0(org.telegram.messenger.v3.V(chat) ? 2131746735 : 2131746845, null));
            w41Var.a(String.valueOf(sbVar.d.boosts), 2, null, org.telegram.messenger.gd.N0(2131753159, null));
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = sbVar.d;
            w41Var.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, org.telegram.messenger.gd.N0(2131753154, null));
            return;
        }
        if (i12 == 5) {
            TL_stories.Boost boost = ((rb) arrayList.get(i7)).d;
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i11).c2(Long.valueOf(boost.user_id));
            bh.b bVar = (bh.b) view;
            bVar.d(c22, org.telegram.messenger.i5.p(c22), boost.multiplier > 1 ? org.telegram.messenger.gd.a0("BoostsExpireOn", null, 2131753158, org.telegram.messenger.gd.r(boost.expires, false)) : org.telegram.messenger.gd.a0("BoostExpireOn", null, 2131753658, org.telegram.messenger.gd.r(boost.expires, false)), !((rb) arrayList.get(i7)).f);
            bVar.setStatus(boost);
            bVar.setAvatarPadding(5);
            return;
        }
        if (i12 == 6) {
            ((org.telegram.ui.Cells.a9) view).setText(((rb) arrayList.get(i7)).c);
            return;
        }
        if (i12 == 9) {
            org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
            if (sbVar.E == 0) {
                y4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.gd.G(sbVar.s, "BoostingShowMoreBoosts", new Object[0]), false);
                return;
            } else {
                y4Var.b(R.drawable.arrow_more, 5, org.telegram.messenger.gd.G(sbVar.x, "BoostingShowMoreGifts", new Object[0]), false);
                return;
            }
        }
        if (i12 == 3) {
            ((org.telegram.ui.Components.g80) view).setLink(((rb) arrayList.get(i7)).c);
            return;
        }
        if (i12 == 11) {
            rb rbVar = (rb) arrayList.get(i7);
            TL_stories.PrepaidGiveaway prepaidGiveaway = rbVar.e;
            boolean z10 = rbVar.f;
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
            int i13 = this.d;
            int i14 = sbVar.P;
            if (i13 == i14 && this.e == sbVar.O) {
                return;
            }
            this.d = i14;
            this.e = sbVar.O;
            sbVar.f.f();
            sbVar.f.a(0, org.telegram.messenger.gd.G(sbVar.P, "BoostingBoostsCount", new Object[0]), null);
            if (org.telegram.messenger.mp.u1(i11).s4 && (i10 = sbVar.O) > 0 && i10 != sbVar.P) {
                sbVar.f.a(1, org.telegram.messenger.gd.G(i10, "BoostingGiftsCount", new Object[0]), null);
            }
            sbVar.f.setInitialTabId(sbVar.E);
            sbVar.f.c();
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        sb sbVar = this.f;
        org.telegram.ui.ActionBar.h6 h6Var = sbVar.e;
        c51 c51Var = sbVar.c;
        int i10 = 1;
        switch (i7) {
            case 0:
                view = new w41(sbVar.getContext(), 2);
                break;
            case 1:
                View cVar = new ng.c(sbVar.getContext(), null);
                cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
                view = cVar;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i11 = org.telegram.ui.ActionBar.m6.a7;
                View z6Var = new org.telegram.ui.Cells.z6(context, org.telegram.ui.ActionBar.m6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.t6.h(i11, z6Var, null);
                view = z6Var;
                break;
            case 3:
                org.telegram.ui.Components.g80 g80Var = new org.telegram.ui.Components.g80(sbVar.getContext(), sbVar.c, null, false, false);
                g80Var.d.setVisibility(8);
                g80Var.a.setGravity(17);
                g80Var.h.setVisibility(8);
                g80Var.w.setVisibility(8);
                g80Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(24.0f));
                view = g80Var;
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
                view = new org.telegram.ui.Cells.a9(20, viewGroup.getContext(), h6Var);
                break;
            case 7:
                view = new org.telegram.ui.Cells.w3(sbVar.getContext(), 8);
                break;
            case 8:
                bi.t2 t2Var = new bi.t2(sbVar.getContext(), 10);
                TextView textView = new TextView(sbVar.getContext());
                org.telegram.messenger.n10.l(14.0f, org.telegram.messenger.v3.V(sbVar.J) ? 2131748041 : 2131748042, 1, textView, null);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.y6, null);
                textView.setGravity(17);
                t2Var.addView(textView, c8.ma.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = t2Var;
                break;
            case 9:
                m5 m5Var = new m5(sbVar.getContext(), i10);
                m5Var.a(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                view = m5Var;
                break;
            case 10:
                org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(sbVar.getContext());
                n8Var.o(R.drawable.msg_gift_premium, org.telegram.messenger.gd.a0("BoostingGetBoostsViaGifts", null, 2131753509, new Object[0]), false);
                n8Var.s = 64;
                int i12 = org.telegram.ui.ActionBar.m6.q6;
                n8Var.g(i12, i12);
                view = n8Var;
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
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(c51Var.getParentActivity(), h6Var);
                sbVar.f = scrollSlidingTextTabStrip;
                int i13 = org.telegram.ui.ActionBar.m6.a;
                int i14 = org.telegram.ui.ActionBar.m6.wi;
                int i15 = org.telegram.ui.ActionBar.m6.vi;
                int i16 = org.telegram.ui.ActionBar.m6.a;
                scrollSlidingTextTabStrip.M = i14;
                scrollSlidingTextTabStrip.N = i15;
                scrollSlidingTextTabStrip.updateColors();
                ai.l0 l0Var = new ai.l0(this, c51Var.getParentActivity());
                sbVar.f.setDelegate(new f(this, 9));
                l0Var.addView(sbVar.f, c8.ma.c(48.0f, -2));
                view = l0Var;
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return i5.c.q(view, view, -1, -2);
    }
}
