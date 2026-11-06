package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c51;
import org.telegram.ui.o41;
import org.telegram.ui.pn;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z extends org.telegram.ui.ActionBar.f2 implements ls {
    public final org.telegram.ui.wd D;
    public final org.telegram.ui.wd E;
    public final org.telegram.ui.wd F;
    public final org.telegram.ui.wd G;
    public final org.telegram.ui.wd H;
    public final org.telegram.ui.wd I;
    public final SpannableStringBuilder J;
    public cd K;
    public FrameLayout L;
    public FrameLayout M;
    public p61 N;
    public boolean O;
    public int P;
    public t Q;
    public LinearLayout R;
    public RelativeSizeSpan S;
    public org.telegram.ui.Components.j6 T;
    public org.telegram.ui.Components.j6 U;
    public u V;
    public boolean W;
    public boolean X;
    public long Y;
    public v Z;
    public final int a;
    public w a0;
    public final long b;
    public fi.d b0;
    public final boolean c;
    public final wp[] c0;
    public kn d;
    public t d0;
    public k41 e;
    public RelativeSizeSpan e0;
    public ht0 f;
    public org.telegram.ui.Components.j6 f0;
    public org.telegram.ui.Components.j6 g0;
    public ec h;
    public fi.d h0;
    public double i0;
    public org.telegram.ui.Components.cc j0;
    public SpannableStringBuilder k0;
    public SpannableStringBuilder l0;
    public SpannableStringBuilder m0;
    public int n;
    public boolean n0;
    public o41 o0;
    public o41 p0;
    public DecimalFormat q0;
    public View r;
    public SpannableStringBuilder r0;
    public te.a s;
    public final d s0;
    public final int t0;
    public TLRPC.TL_payments_starsRevenueStats w;
    public TLRPC.TL_starsRevenueStatus x;
    public o41 y;

    /* JADX WARN: Multi-variable type inference failed */
    public z(int i7, long j3) {
        super(null);
        this.n = -1;
        this.D = org.telegram.ui.wd.a("XTR", org.telegram.messenger.hd.M0(2131752961, null));
        this.E = org.telegram.ui.wd.a("XTR", org.telegram.messenger.hd.M0(2131752959, null));
        this.F = org.telegram.ui.wd.a("XTR", org.telegram.messenger.hd.M0(2131752958, null));
        this.G = org.telegram.ui.wd.a("TON", org.telegram.messenger.hd.M0(2131753033, null));
        this.H = org.telegram.ui.wd.a("TON", org.telegram.messenger.hd.M0(2131753032, null));
        this.I = org.telegram.ui.wd.a("TON", org.telegram.messenger.hd.M0(2131753031, null));
        this.W = false;
        this.X = true;
        this.c0 = new wp[1];
        this.s0 = new d(this, 0 == true ? 1 : 0);
        this.t0 = -1;
        this.a = i7;
        this.b = j3;
        boolean z9 = j3 == getUserConfig().e();
        this.c = z9;
        if (i7 == 0) {
            n0.g(this.currentAccount).r(j3);
            if (!z9) {
                n0.g(this.currentAccount).l(j3);
            }
        } else if (i7 == 1) {
            n0 g10 = n0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, l10 == null || System.currentTimeMillis() - l10.longValue() > 30000);
        }
        this.J = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(z9 ? org.telegram.messenger.hd.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().R5) : org.telegram.messenger.hd.M0(2131752957, null), new d(this, 2)), true);
    }

    public static void Z(z zVar) {
        zVar.showDialog(org.telegram.ui.zd.I(zVar.getParentActivity(), zVar.resourceProvider, true));
    }

    public static void a0(z zVar, r31 r31Var) {
        if (r31Var.H(xc.class)) {
            dd.k1(zVar.getParentActivity(), true, zVar.b, zVar.currentAccount, (TL_stars.StarsTransaction) r31Var.G, zVar.getResourceProvider());
        } else if (r31Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            org.telegram.ui.zd.M(zVar.getParentActivity(), zVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) r31Var.G, zVar.b, zVar.resourceProvider);
        } else if (r31Var.d == 2) {
            zVar.presentFragment(new hi.q3(zVar.b));
        }
    }

    public static void b0(z zVar) {
        d dVar = zVar.s0;
        org.telegram.ui.Components.cc.e();
        TLRPC.TL_payments_starsRevenueStats h = n0.g(zVar.currentAccount).h(zVar.b, false);
        long j3 = h == null ? 0L : h.status.available_balance.amount;
        if (j3 < zVar.getMessagesController().R5) {
            zVar.X = true;
            zVar.Y = j3;
        } else {
            zVar.X = false;
            zVar.Y = zVar.getMessagesController().R5;
        }
        zVar.W = true;
        zVar.Z.setText(Long.toString(zVar.Y));
        v vVar = zVar.Z;
        vVar.setSelection(vVar.getText().length());
        zVar.W = false;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
    }

    public static void c0(z zVar, Context context, View view) {
        if (view.isEnabled()) {
            fi.d dVar = zVar.b0;
            if (dVar.Q) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = qp.s1(zVar.currentAccount).j1(zVar.b);
            ConnectionsManager.getInstance(zVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new j(0, zVar, context));
        }
    }

    public static void d0(z zVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z9, long j3, TLObject tLObject) {
        int i7;
        if (tL_error == null) {
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                vf.c.v(zVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url, false);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    zVar.X = true;
                    vf.c.v(zVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url, false);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(zVar.currentAccount).sendRequest(new TL_account.getPassword(), new m(zVar, twoStepVerificationActivity, z9, j3), 8);
                return;
            }
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
            org.telegram.ui.Components.hc.d0(tL_error);
            return;
        }
        twoStepVerificationActivity.t0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = org.telegram.messenger.hd.M0(2131751298, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(activity);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131742865, null)));
        linearLayout.addView(textView, c8.ha.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, null, mode);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751301, null)));
        if (org.telegram.messenger.hd.a0) {
            linearLayout2.addView(textView2, c8.ha.o(-1, -2));
            linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, c8.ha.o(-2, -2));
            linearLayout2.addView(textView2, c8.ha.o(-1, -2));
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
        linearLayout.addView(e10, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, null, mode);
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.r6.V(textView3, i10, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131751300, null)));
        if (org.telegram.messenger.hd.a0) {
            e10.addView(textView3, c8.ha.o(-1, -2));
            i7 = 5;
            e10.addView(imageView2, c8.ha.r(-2, -2, 5));
        } else {
            i7 = 5;
            e10.addView(imageView2, c8.ha.o(-2, -2));
            e10.addView(textView3, c8.ha.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751292, null), new e(zVar));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(activity);
            org.telegram.ui.ActionBar.r6.V(textView4, i10, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.k5.m(textView4, (org.telegram.messenger.hd.a0 ? i7 : 3) | 48, null, 2131751299);
            linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747830, null), null);
        }
        twoStepVerificationActivity.showDialog(u1Var);
    }

    public static void e0(z zVar, ArrayList arrayList) {
        int i7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10;
        boolean z9;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        org.telegram.ui.wd wdVar = zVar.I;
        org.telegram.ui.wd wdVar2 = zVar.H;
        org.telegram.ui.wd wdVar3 = zVar.F;
        org.telegram.ui.wd wdVar4 = zVar.E;
        org.telegram.ui.wd wdVar5 = zVar.D;
        long j3 = zVar.b;
        org.telegram.ui.wd wdVar6 = zVar.G;
        boolean z10 = zVar.c;
        int i11 = zVar.t0;
        zVar.n = -1;
        n0 g10 = n0.g(zVar.currentAccount);
        int i12 = zVar.a;
        if (i12 == 0) {
            arrayList.add(r31.h(2, i11, zVar.y));
            arrayList.add(r31.B(-1, null));
            arrayList.add(r31.b(org.telegram.messenger.hd.M0(2131752962, null)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, false);
            if (h == null || (tL_starsRevenueStatus2 = h.status) == null) {
                z9 = z10;
            } else {
                wdVar5.a = false;
                wdVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                wdVar5.i = starsAmount;
                wdVar5.h = "XTR";
                wdVar5.f = "USD";
                double d = starsAmount.amount;
                z9 = z10;
                double d2 = zVar.i0;
                wdVar5.j = (long) (d * d2 * 100.0d);
                wdVar4.a = false;
                wdVar4.g = true;
                wdVar4.i = tL_starsRevenueStatus2.current_balance;
                wdVar4.h = "XTR";
                wdVar4.j = (long) (r11.amount * d2 * 100.0d);
                wdVar4.f = "USD";
                wdVar3.a = false;
                wdVar3.g = true;
                wdVar3.i = tL_starsRevenueStatus2.overall_revenue;
                wdVar3.h = "XTR";
                wdVar3.j = (long) (r11.amount * d2 * 100.0d);
                wdVar3.f = "USD";
                zVar.v0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                zVar.R.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(r31.v(wdVar5));
            arrayList.add(r31.v(wdVar4));
            arrayList.add(r31.v(wdVar3));
            arrayList.add(r31.B(-2, org.telegram.messenger.hd.M0(z9 ? 2131745646 : 2131752960, null)));
            arrayList.add(r31.b(org.telegram.messenger.hd.M0(2131752972, null)));
            arrayList.add(r31.j(1, zVar.Q));
            arrayList.add(r31.B(-3, zVar.J));
            if (z9) {
                return;
            }
            if (zVar.getMessagesController().g6) {
                arrayList.add(hi.f.i(2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, zVar.resourceProvider), pn.i0(org.telegram.messenger.hd.M0(2131753145, null)), org.telegram.messenger.hd.M0(2131753146, null)));
                arrayList.add(r31.B(-4, null));
            }
            zVar.n = arrayList.size();
            arrayList.add(r31.n(zVar.h, -2));
            return;
        }
        if (i12 == 1) {
            TLRPC.TL_payments_starsRevenueStats j10 = g10.j(j3, true);
            int i13 = 3;
            if (!z10) {
                if (zVar.k0 == null) {
                    zVar.k0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131753045, 50), -1, 3, new d(zVar, i13), zVar.resourceProvider), true);
                }
                arrayList.add(r31.g(zVar.k0));
            }
            if (zVar.o0 == null && j10 != null) {
                o41 i02 = c51.i0(j10.top_hours_graph, org.telegram.messenger.hd.M0(2131753047, null), 0, false);
                zVar.o0 = i02;
                if (i02 != null) {
                    i02.n = true;
                }
            }
            o41 o41Var = zVar.o0;
            if (o41Var != null && !o41Var.l) {
                arrayList.add(r31.h(5, i11, o41Var));
                arrayList.add(r31.B(-1, null));
            }
            if (zVar.p0 != null || j10 == null) {
                i7 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j10.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j10.usd_rate);
                }
                i7 = 2;
                zVar.p0 = c51.i0(statsGraph, org.telegram.messenger.hd.M0(2131753046, null), 2, false);
            }
            o41 o41Var2 = zVar.p0;
            if (o41Var2 != null && !o41Var2.l) {
                arrayList.add(r31.h(i7, i11, o41Var2));
                arrayList.add(r31.B(-2, null));
            }
            if (!zVar.n0 && j10 != null && (tL_starsRevenueStatus = j10.status) != null) {
                double d10 = j10.usd_rate;
                long j11 = tL_starsRevenueStatus.available_balance.amount;
                wdVar6.d = j11;
                double d11 = j11 / 1.0E9d;
                long j12 = (long) (d11 * d10 * 100.0d);
                wdVar6.e = j12;
                if (zVar.q0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    zVar.q0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i10 = 6;
                    zVar.q0.setMaximumFractionDigits(6);
                    zVar.q0.setGroupingUsed(false);
                } else {
                    i10 = 6;
                }
                DecimalFormat decimalFormat2 = zVar.q0;
                if (d11 > 1.5d) {
                    i10 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.ui.zd.K("TON " + zVar.q0.format(d11), zVar.f0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(zVar.e0, indexOf, spannableStringBuilder.length(), 33);
                }
                zVar.f0.setText(spannableStringBuilder);
                zVar.g0.setText("≈" + org.telegram.messenger.r1.i().f(j12, "USD"));
                wdVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j10.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                wdVar2.d = j13;
                wdVar2.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
                wdVar2.f = "USD";
                wdVar.a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                wdVar.d = j14;
                wdVar.e = (long) ((j14 / 1.0E9d) * d10 * 100.0d);
                wdVar.f = "USD";
                zVar.n0 = true;
                zVar.h0.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (zVar.n0) {
                arrayList.add(r31.b(org.telegram.messenger.hd.M0(2131753034, null)));
                arrayList.add(r31.v(wdVar6));
                arrayList.add(r31.v(wdVar2));
                arrayList.add(r31.v(wdVar));
                if (zVar.l0 == null) {
                    zVar.l0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131753030, null), -1, 3, new d(zVar, 4), zVar.resourceProvider), true);
                }
                arrayList.add(r31.B(-4, zVar.l0));
            }
            arrayList.add(r31.b(org.telegram.messenger.hd.M0(2131753051, null)));
            arrayList.add(r31.k(zVar.d0));
            if (zVar.m0 == null) {
                zVar.m0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(qp.s1(zVar.currentAccount).I5 ? 2131753050 : 2131753048, null), -1, 3, new d(zVar, 5), null), true);
            }
            arrayList.add(r31.B(-5, zVar.m0));
            zVar.n = arrayList.size();
            arrayList.add(r31.n(zVar.h, -2));
        }
    }

    public static String w0(int i7) {
        int i10 = i7 / 86400;
        int i11 = i7 - (86400 * i10);
        int i12 = i11 / 3600;
        int i13 = i11 - (i12 * 3600);
        int i14 = i13 / 60;
        int i15 = i13 - (i14 * 60);
        if (i10 == 0) {
            return i12 == 0 ? String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)) : String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i14), Integer.valueOf(i15));
        }
        Locale locale = Locale.ENGLISH;
        return org.telegram.messenger.hd.a0(null, null, 2131747321, String.format(locale, "%02d", Integer.valueOf(i10)), String.format(locale, "%02d", Integer.valueOf(i12)), String.format(locale, "%02d", Integer.valueOf(i14)));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        boolean z9;
        boolean z10 = this.c;
        int i7 = this.a;
        int i10 = 1;
        if (i7 == 1 || !z10) {
            ht0 ht0Var = new ht0(context);
            this.f = ht0Var;
            ht0Var.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new aa.n(this, 6));
            ht0 ht0Var2 = this.f;
            ht0Var2.getClass();
            this.h = new ec(25, context, ht0Var2);
            frameLayout = this.f;
        } else {
            this.f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        int i11 = 0;
        this.d = new kn(context, null, false, getResourceProvider());
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.b));
        this.d.k(a22, true);
        this.simpleActionBar.setTitle(t10.p(a22));
        if (i7 == 0) {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.M0(2131752949, null));
        } else {
            this.simpleActionBar.setSubtitle(org.telegram.messenger.hd.M0(2131752948, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s(this, i11));
        this.simpleActionBar.setBackground(null);
        cd cdVar = (i7 != 0 || this.f == null) ? null : new cd(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        this.K = cdVar;
        if (i7 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.L = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.L.setClipToPadding(false);
            rj0 rj0Var = new rj0(context, this.resourceProvider, this.f);
            this.N = rj0Var;
            rj0Var.setAdapter(new x(this, context, rj0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.M = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            this.M.addView(rj0Var.n(-2, true), c8.ha.e(-1, 48, 48));
            this.L.addView(rj0Var, c8.ha.c(-1.0f, -1));
        } else if (cdVar != null) {
            this.N = cdVar.getViewPager();
            this.M = this.K.getTabsContainer();
        }
        t tVar = new t(context, 0);
        this.Q = tVar;
        tVar.setOrientation(1);
        t tVar2 = this.Q;
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i12, tVar2, getResourceProvider());
        this.Q.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.T = j6Var;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.j6 j6Var2 = this.T;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i13, getResourceProvider());
        this.T.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.T.setGravity(17);
        this.S = new RelativeSizeSpan(0.6770833f);
        this.Q.addView(this.T, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.U = j6Var3;
        j6Var3.setGravity(17);
        org.telegram.ui.Components.j6 j6Var4 = this.U;
        int i14 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(j6Var4, i14, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.Q.addView(this.U, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        int i15 = 0;
        u uVar = new u(i15, context, this);
        this.V = uVar;
        uVar.setText(org.telegram.messenger.hd.M0(2131752953, null));
        this.V.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        v vVar = new v(context, i15);
        this.Z = vVar;
        vVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.V(this.Z, i13, getResourceProvider());
        this.Z.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.Z.setCursorWidth(1.5f);
        this.Z.setBackground(null);
        this.Z.setTextSize(1, 18.0f);
        this.Z.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        this.Z.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        this.Z.setInputType(2);
        this.Z.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.D(this.Z, org.telegram.ui.ActionBar.k6.ig, getResourceProvider());
        org.telegram.ui.ActionBar.r6.z(this.Z, org.telegram.ui.ActionBar.k6.jg, getResourceProvider());
        this.Z.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
        this.Z.setOnFocusChangeListener(new n(this, 0));
        this.Z.addTextChangedListener(new ah.j(this, i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, c8.ha.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.Z, c8.ha.p(-1, -2, 1.0f, qs.E1));
        this.V.e(this.Z);
        this.V.addView(linearLayout, c8.ha.e(-1, -2, 48));
        this.Z.setOnEditorActionListener(new p(this, 0));
        this.Q.addView(this.V, c8.ha.t(-1, -2, 1, 18, 14, 18, 2));
        this.V.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.R = linearLayout2;
        final int i16 = 0;
        linearLayout2.setOrientation(0);
        w wVar = new w(i16, context, getResourceProvider(), true);
        wVar.setRoundRadius(24);
        this.a0 = wVar;
        wVar.setEnabled(qp.s1(this.currentAccount).I5);
        this.a0.i(org.telegram.messenger.hd.M0(2131752969, null), false, true);
        this.a0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.q
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.y0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            z zVar = this.b;
                            if (!zVar.h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ab.g gVar = new ab.g(4, zVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = gVar;
                                zVar.h0.setLoading(true);
                                twoStepVerificationActivity.x0(new h(zVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.b0 = dVar;
        dVar.setEnabled(true);
        this.b0.i(org.telegram.messenger.hd.M0(2131748373, null), false, true);
        this.b0.setOnClickListener(new r(i16, this, context));
        this.R.addView(this.a0, c8.ha.p(-1, 48, 1.0f, qs.E1));
        if (!z10) {
            this.R.addView(new Space(context), c8.ha.p(8, 48, 0.0f, qs.E1));
            this.R.addView(this.b0, c8.ha.p(-1, 48, 1.0f, qs.E1));
        }
        this.Q.addView(this.R, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        t tVar3 = new t(context, 1);
        this.d0 = tVar3;
        tVar3.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i12, this.d0, this.resourceProvider);
        this.d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.j6 j6Var5 = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f0 = j6Var5;
        j6Var5.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(this.f0, i13, this.resourceProvider);
        this.f0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.f0.setGravity(17);
        this.e0 = new RelativeSizeSpan(0.6770833f);
        this.d0.addView(this.f0, c8.ha.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var6 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.g0 = j6Var6;
        j6Var6.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(this.g0, i14, this.resourceProvider);
        this.g0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.d0.addView(this.g0, c8.ha.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        fi.d dVar2 = new fi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.h0 = dVar2;
        dVar2.setEnabled(qp.s1(this.currentAccount).I5);
        final int i17 = 1;
        this.h0.i(org.telegram.messenger.hd.M0(z10 ? 2131748374 : 2131748350, null), false, true);
        this.h0.setVisibility(8);
        this.h0.setOnClickListener(new View.OnClickListener(this) { // from class: bi.q
            public final /* synthetic */ z b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.y0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            z zVar = this.b;
                            if (!zVar.h0.Q) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ab.g gVar = new ab.g(4, zVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.Z = 1;
                                twoStepVerificationActivity.b0 = gVar;
                                zVar.h0.setLoading(true);
                                twoStepVerificationActivity.x0(new h(zVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.d0.addView(this.h0, c8.ha.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        k41 k41Var = new k41(this, new ai.e(this, 1), new e(this), new a3.l(this, 21));
        this.e = k41Var;
        k41Var.r1();
        k41 k41Var2 = this.e;
        boolean z11 = false;
        k41Var2.f3.r = false;
        k41Var2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        ht0 ht0Var3 = this.f;
        if (ht0Var3 != null) {
            k41 k41Var3 = this.e;
            getParentActivity();
            jg.i0 i0Var = new jg.i0(5, ht0Var3, z11);
            k41Var3.e3 = i0Var;
            k41Var3.setLayoutManager(i0Var);
            this.f.u(this.e, new e(this));
            z9 = true;
            this.f.x(i7 == 1 ? this.L : this.K, this.N, new e(this));
            FrameLayout frameLayout5 = this.M;
            this.f.y(frameLayout5);
            frameLayout5.setLayoutParams(c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z9 = true;
            frameLayout2.addView(this.e, c8.ha.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.r = new View(getParentActivity());
        frameLayout2.addView(this.r, frameLayout2.indexOfChild(this.f != null ? this.M : this.simpleActionBar), c8.ha.e(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        te.a aVar = new te.a(0, new e(this), xq.h, 380L, false);
        this.s = aVar;
        ht0 ht0Var4 = this.f;
        aVar.a((ht0Var4 == null || !ht0Var4.e0) ? false : z9, false);
        if (this.f != null) {
            getBaseSimpleGlass().n = this.f;
            cd cdVar2 = this.K;
            if (cdVar2 != null) {
                cdVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.N);
            }
            int i18 = 0;
            getBaseSimpleGlass().o = new g(i18, this, new f(i18, frameLayout2));
            View view = this.M;
            fh.g c10 = getBaseSimpleGlass().c.c(view, null, false);
            c10.p(c8.g0.m(this.resourceProvider));
            c10.q(org.telegram.messenger.g0.L(9.66f));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            view.setBackground(c10);
        }
        org.telegram.messenger.g0.E2(this.d.e);
        frameLayout2.addView(this.d.e, c8.ha.e(42, 42, 53));
        s0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.C3 && ((Long) objArr[0]).longValue() == this.b) {
            t0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        p61 p61Var = this.N;
        if (p61Var == null || !p61Var.canScrollHorizontally(-1)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        qs.f(this.currentAccount).c(this, qs.C3);
        t0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        this.O = true;
        qs.f(this.currentAccount).n(this, qs.C3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        s0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            kn knVar = this.d;
            if (knVar != null) {
                knVar.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Cj, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dj, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0() {
        if (this.e == null) {
            return;
        }
        org.telegram.messenger.g0.B3(this.d.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
        k41 k41Var = this.e;
        i0.b bVar = this.mSystemInsets;
        oi.a.e(k41Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        if (this.f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            this.f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            ht0 ht0Var = this.f;
            ht0Var.B();
            ht0Var.requestLayout();
            ht0Var.invalidate();
        }
        if (this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + (this.f != null ? org.telegram.messenger.g0.L(44.0f) : 0);
            ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.r.setLayoutParams(layoutParams);
            }
            x0();
        }
    }

    public final void t0() {
        mg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = n0.g(this.currentAccount).h(this.b, false);
        if (h == this.w) {
            if ((h == null ? null : h.status) == this.x) {
                return;
            }
        }
        this.w = h;
        this.x = h == null ? null : h.status;
        if (h != null) {
            this.i0 = h.usd_rate;
            o41 i02 = c51.i0(h.revenue_graph, org.telegram.messenger.hd.M0(2131752963, null), 2, false);
            this.y = i02;
            if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.y.d.d.get(0) != null) {
                o41 o41Var = this.y;
                o41Var.h = true;
                ((mg.a) o41Var.d.d.get(0)).g = org.telegram.ui.ActionBar.k6.mk;
                this.y.d.h = (float) ((1.0d / this.i0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            v0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            k41 k41Var = this.e;
            if (k41Var != null) {
                ht0 ht0Var = this.f;
                boolean z9 = ht0Var != null && ht0Var.e0;
                k41Var.f3.O(ht0Var == null);
                if (z9) {
                    this.f.a();
                }
            }
        }
    }

    public final void u0(boolean z9, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f10 = p10.i(this.currentAccount).f();
        if (parentActivity == null || f10 == null) {
            return;
        }
        long j10 = this.b;
        if (z9) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = qp.s1(this.currentAccount).j1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j3;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = qp.s1(this.currentAccount).j1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new k(this, twoStepVerificationActivity, parentActivity, z9, j3));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(TL_stars.StarsAmount starsAmount, int i7) {
        if (this.T == null || this.U == null) {
            return;
        }
        long j3 = (long) (this.i0 * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.a1(false, TextUtils.concat("XTR ", dd.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.S, indexOf, spannableStringBuilder.length(), 33);
        }
        this.T.setText(spannableStringBuilder);
        this.U.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
        this.V.setVisibility(j3 > 0 ? 0 : 8);
        if (this.X) {
            this.W = true;
            v vVar = this.Z;
            long j10 = starsAmount.amount;
            this.Y = j10;
            vVar.setText(Long.toString(j10));
            v vVar2 = this.Z;
            vVar2.setSelection(vVar2.getText().length());
            this.W = false;
            this.a0.setEnabled(this.Y > 0);
        }
        this.P = i7;
        d dVar = this.s0;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
    }

    public final void x0() {
        View view = this.r;
        if (view == null) {
            return;
        }
        te.a aVar = this.s;
        view.setTranslationY(this.f != null ? org.telegram.messenger.g0.L(44.0f) * (-(1.0f - (aVar == null ? 0.0f : aVar.e))) : 0.0f);
    }

    public final void y0() {
        w wVar = this.a0;
        if (!wVar.c0 || wVar.Q) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i7 = 1;
        if (this.P > currentTime) {
            this.j0 = org.telegram.ui.Components.hc.a0(this).Q(R.raw.timer_3, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131752952, w0(this.P - currentTime)))).j();
            return;
        }
        if (this.Y < getMessagesController().R5) {
            org.telegram.ui.Components.hc.a0(this).M(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.G((int) getMessagesController().R5, "BotStarsWithdrawMinLimit", new Object[0]), new d(this, i7))).j();
            return;
        }
        long j3 = this.Y;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        i iVar = new i(this, j3, twoStepVerificationActivity, 0);
        twoStepVerificationActivity.Z = 1;
        twoStepVerificationActivity.b0 = iVar;
        this.a0.setLoading(true);
        twoStepVerificationActivity.x0(new h(this, twoStepVerificationActivity, i7));
    }
}
