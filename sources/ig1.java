// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ig1 extends ka {
    public int d = -1;
    public int e = -1;
    public final /* synthetic */ kg1 f;

    public ig1(kg1 kg1Var) {
        this.f = kg1Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return ((jg1) this.f.y.get(s49Var.b())).b;
    }

    @Override // w39
    public final int b() {
        return this.f.y.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((jg1) this.f.y.get(i)).a;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        kg1 kg1Var;
        int i2;
        int i3 = s49Var.f;
        if (i3 != 4) {
            if (i3 == 1 || i3 == 12) {
                hk1 hk1Var = (hk1) s49Var.a;
                hk1Var.setTitle(((jg1) this.f.y.get(i)).c);
                hk1Var.c(false);
                if (s49Var.f == 12) {
                    hk1Var.setPadding(gl.L(3.0f), hk1Var.getPaddingTop(), hk1Var.getPaddingRight(), hk1Var.getPaddingBottom());
                    return;
                }
                return;
            }
            if (i3 == 0) {
                oxa oxaVar = (oxa) s49Var.a;
                oxaVar.a(Integer.toString(this.f.d.level), 0, null, k96.M0(2131753156, null));
                kg1 kg1Var2 = this.f;
                TL_stats.TL_statsPercentValue tL_statsPercentValue = kg1Var2.d.premium_audience;
                if (tL_statsPercentValue != null) {
                    double d = tL_statsPercentValue.total;
                    if (d != 0.0d) {
                        oxaVar.a("≈" + ((int) this.f.d.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), k96.M0(hc2.V(this.f.J) ? 2131746738 : 2131746848, null));
                        oxaVar.a(String.valueOf(this.f.d.boosts), 2, null, k96.M0(2131753159, null));
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f.d;
                        oxaVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, k96.M0(2131753154, null));
                        return;
                    }
                }
                oxaVar.a("≈0", 1, "0%", k96.M0(hc2.V(kg1Var2.J) ? 2131746738 : 2131746848, null));
                oxaVar.a(String.valueOf(this.f.d.boosts), 2, null, k96.M0(2131753159, null));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.f.d;
                oxaVar.a(String.valueOf(Math.max(0, tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts)), 3, null, k96.M0(2131753154, null));
                return;
            }
            if (i3 == 5) {
                TL_stories.Boost boost = ((jg1) this.f.y.get(i)).d;
                TLRPC.User V1 = na7.q1(this.f.b).V1(Long.valueOf(boost.user_id));
                uv4 uv4Var = (uv4) s49Var.a;
                int i4 = boost.multiplier;
                int i5 = boost.expires;
                uv4Var.d(V1, qu2.p(V1), i4 > 1 ? k96.a0("BoostsExpireOn", null, 2131753158, k96.r(i5, false)) : k96.a0("BoostExpireOn", null, 2131753658, k96.r(i5, false)), !((jg1) this.f.y.get(i)).f);
                uv4Var.setStatus(boost);
                uv4Var.setAvatarPadding(5);
                return;
            }
            if (i3 == 6) {
                ((mhb) s49Var.a).setText(((jg1) this.f.y.get(i)).c);
                return;
            }
            if (i3 == 9) {
                dh6 dh6Var = (dh6) s49Var.a;
                kg1 kg1Var3 = this.f;
                if (kg1Var3.E == 0) {
                    dh6Var.b(R.drawable.arrow_more, 5, k96.G(kg1Var3.s, "BoostingShowMoreBoosts", new Object[0]), false);
                    return;
                } else {
                    dh6Var.b(R.drawable.arrow_more, 5, k96.G(kg1Var3.x, "BoostingShowMoreGifts", new Object[0]), false);
                    return;
                }
            }
            if (i3 == 3) {
                ((f36) s49Var.a).setLink(((jg1) this.f.y.get(i)).c);
                return;
            }
            if (i3 == 11) {
                TL_stories.PrepaidGiveaway prepaidGiveaway = ((jg1) this.f.y.get(i)).e;
                xv4 xv4Var = (xv4) s49Var.a;
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    xv4Var.d(prepaidGiveaway, k96.G(prepaidGiveaway.quantity, "BoostingTelegramPremiumCountPlural", new Object[0]), k96.G(prepaidGiveaway.quantity, "BoostingSubscriptionsCountPlural", k96.G(((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, "PrepaidGiveawayMonths", new Object[0])), !r11.f);
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                    xv4Var.d(prepaidGiveaway, k96.H(',', "BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), k96.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]), !r11.f);
                }
                xv4Var.setImage(prepaidGiveaway);
                xv4Var.setAvatarPadding(5);
                return;
            }
            if (i3 == 13) {
                int i6 = this.d;
                kg1 kg1Var4 = this.f;
                int i7 = kg1Var4.P;
                if (i6 == i7 && this.e == kg1Var4.O) {
                    return;
                }
                this.d = i7;
                this.e = kg1Var4.O;
                kg1Var4.f.f();
                kg1 kg1Var5 = this.f;
                kg1Var5.f.a(0, k96.G(kg1Var5.P, "BoostingBoostsCount", new Object[0]), null);
                if (na7.q1(this.f.b).k4.O1.f && (i2 = (kg1Var = this.f).O) > 0 && i2 != kg1Var.P) {
                    kg1Var.f.a(1, k96.G(i2, "BoostingGiftsCount", new Object[0]), null);
                }
                kg1 kg1Var6 = this.f;
                kg1Var6.f.setInitialTabId(kg1Var6.E);
                this.f.f.c();
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        kg1 kg1Var = this.f;
        wjb wjbVar = kg1Var.e;
        uxa uxaVar = kg1Var.c;
        byte b = 1;
        switch (i) {
            case 0:
                view = new oxa(kg1Var.getContext(), 2);
                break;
            case 1:
                View hk1Var = new hk1(kg1Var.getContext(), null);
                hk1Var.setPadding(hk1Var.getPaddingLeft(), gl.L(16.0f), hk1Var.getRight(), gl.L(16.0f));
                view = hk1Var;
                break;
            case 2:
                Context context = viewGroup.getContext();
                int i2 = bkb.Z6;
                View b9aVar = new b9a(context, bkb.w0(null, i2, false), 0);
                zkb.h(i2, null, b9aVar);
                view = b9aVar;
                break;
            case 3:
                f36 f36Var = new f36(kg1Var.getContext(), kg1Var.c, null, false, false);
                f36Var.d.setVisibility(8);
                f36Var.a.setGravity(17);
                f36Var.h.setVisibility(8);
                f36Var.w.setVisibility(8);
                f36Var.setPadding(gl.L(11.0f), 0, gl.L(11.0f), gl.L(24.0f));
                view = f36Var;
                break;
            case 4:
                LimitPreviewView limitPreviewView = new LimitPreviewView(kg1Var.getContext(), R.drawable.filled_limit_boost, 0, 0, kg1Var.e);
                limitPreviewView.d0 = true;
                limitPreviewView.setTag(-33024);
                limitPreviewView.setPadding(0, gl.L(20.0f), 0, gl.L(20.0f));
                limitPreviewView.h(kg1Var.d, false);
                view = limitPreviewView;
                break;
            case 5:
                view = new uv4(kg1Var.getContext());
                break;
            case 6:
                view = new mhb(20, wjbVar, viewGroup.getContext());
                break;
            case 7:
                view = new wh4(kg1Var.getContext(), 8, (byte) 0);
                break;
            case 8:
                a6 a6Var = new a6(kg1Var.getContext(), (byte) 3);
                TextView textView = new TextView(kg1Var.getContext());
                tb4.u(14.0f, hc2.V(kg1Var.J) ? 2131748042 : 2131748043, 1, textView, null);
                zkb.X(textView, bkb.x6, null);
                textView.setGravity(17);
                a6Var.addView(textView, nme.d(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                view = a6Var;
                break;
            case 9:
                do0 do0Var = new do0(kg1Var.getContext(), b);
                do0Var.a(bkb.u6, bkb.t6);
                view = do0Var;
                break;
            case 10:
                wgb wgbVar = new wgb(kg1Var.getContext());
                wgbVar.o(R.drawable.msg_gift_premium, k96.a0("BoostingGetBoostsViaGifts", null, 2131753509, new Object[0]), false);
                wgbVar.s = 64;
                int i3 = bkb.p6;
                wgbVar.g(i3, i3);
                view = wgbVar;
                break;
            case 11:
                view = new xv4(kg1Var.getContext());
                break;
            case 12:
                View hk1Var2 = new hk1(kg1Var.getContext(), null);
                hk1Var2.setPadding(hk1Var2.getPaddingLeft(), gl.L(16.0f), hk1Var2.getRight(), gl.L(8.0f));
                view = hk1Var2;
                break;
            case 13:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(uxaVar.getParentActivity(), wjbVar);
                kg1Var.f = scrollSlidingTextTabStrip;
                int i4 = bkb.vi;
                int i5 = bkb.ui;
                scrollSlidingTextTabStrip.M = i4;
                scrollSlidingTextTabStrip.N = i5;
                scrollSlidingTextTabStrip.updateColors();
                st stVar = new st(this, uxaVar.getParentActivity());
                kg1Var.f.setDelegate(new lj9(this, (byte) 15));
                stVar.addView(kg1Var.f, nme.c(48.0f, -2));
                view = stVar;
                break;
            default:
                fvc.b();
                return null;
        }
        return ls6.h(view, view, -1, -2);
    }
}
