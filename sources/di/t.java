package di;

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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c51;
import org.telegram.ui.o41;
import org.telegram.ui.rn;
import org.telegram.ui.ud;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t extends org.telegram.ui.ActionBar.h2 implements fs {
    public final ud E;
    public final ud F;
    public final ud G;
    public final ud H;
    public final ud I;
    public final ud J;
    public final SpannableStringBuilder K;
    public ob L;
    public FrameLayout M;
    public FrameLayout N;
    public g71 O;
    public boolean P;
    public int Q;
    public ai.r2 R;
    public LinearLayout S;
    public RelativeSizeSpan T;
    public org.telegram.ui.Components.n6 U;
    public org.telegram.ui.Components.n6 V;
    public p W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final int a;
    public q a0;
    public final long b;
    public bi.s b0;
    public final boolean c;
    public hi.d c0;
    public ao d;
    public final lq[] d0;
    public e51 e;
    public ai.r2 e0;
    public qt0 f;
    public RelativeSizeSpan f0;
    public org.telegram.ui.Components.n6 g0;
    public bi.i3 h;
    public org.telegram.ui.Components.n6 h0;
    public hi.d i0;
    public double j0;
    public org.telegram.ui.Components.gc k0;
    public SpannableStringBuilder l0;
    public SpannableStringBuilder m0;
    public int n;
    public SpannableStringBuilder n0;
    public boolean o0;
    public o41 p0;
    public o41 q0;
    public View r;
    public DecimalFormat r0;
    public te.a s;
    public SpannableStringBuilder s0;
    public final c t0;
    public final int u0;
    public TLRPC.TL_payments_starsRevenueStats w;
    public TLRPC.TL_starsRevenueStatus x;
    public o41 y;

    /* JADX WARN: Multi-variable type inference failed */
    public t(int i7, long j3) {
        super(null);
        this.n = -1;
        this.E = ud.a("XTR", gd.M0(2131752950, null));
        this.F = ud.a("XTR", gd.M0(2131752948, null));
        this.G = ud.a("XTR", gd.M0(2131752947, null));
        this.H = ud.a("TON", gd.M0(2131753022, null));
        this.I = ud.a("TON", gd.M0(2131753021, null));
        this.J = ud.a("TON", gd.M0(2131753020, null));
        this.X = false;
        this.Y = true;
        this.d0 = new lq[1];
        this.t0 = new c(this, 0 == true ? 1 : 0);
        this.u0 = -1;
        this.a = i7;
        this.b = j3;
        boolean z10 = j3 == getUserConfig().e();
        this.c = z10;
        if (i7 == 0) {
            e0.g(this.currentAccount).r(j3);
            if (!z10) {
                e0.g(this.currentAccount).l(j3);
            }
        } else if (i7 == 1) {
            e0 g10 = e0.g(this.currentAccount);
            Long l10 = (Long) g10.d.get(Long.valueOf(j3));
            g10.j(j3, l10 == null || System.currentTimeMillis() - l10.longValue() > 30000);
        }
        this.K = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(z10 ? gd.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().U5) : gd.M0(2131752946, null), new c(this, 2)), true);
    }

    public static void Z(t tVar) {
        tVar.showDialog(xd.I(tVar.getParentActivity(), tVar.resourceProvider, true));
    }

    public static void a0(t tVar, l41 l41Var) {
        if (l41Var.H(jb.class)) {
            pb.l1(tVar.getParentActivity(), true, tVar.b, tVar.currentAccount, (TL_stars.StarsTransaction) l41Var.H, tVar.getResourceProvider());
        } else if (l41Var.H instanceof TL_stats.BroadcastRevenueTransaction) {
            xd.M(tVar.getParentActivity(), tVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) l41Var.H, tVar.b, tVar.resourceProvider);
        } else if (l41Var.d == 2) {
            tVar.presentFragment(new ki.i3(tVar.b));
        }
    }

    public static void b0(t tVar) {
        c cVar = tVar.t0;
        org.telegram.ui.Components.gc.e();
        TLRPC.TL_payments_starsRevenueStats h = e0.g(tVar.currentAccount).h(tVar.b, false);
        long j3 = h == null ? 0L : h.status.available_balance.amount;
        if (j3 < tVar.getMessagesController().U5) {
            tVar.Y = true;
            tVar.Z = j3;
        } else {
            tVar.Y = false;
            tVar.Z = tVar.getMessagesController().U5;
        }
        tVar.X = true;
        tVar.a0.setText(Long.toString(tVar.Z));
        q qVar = tVar.a0;
        qVar.setSelection(qVar.getText().length());
        tVar.X = false;
        org.telegram.messenger.g0.r(cVar);
        cVar.run();
    }

    public static void c0(t tVar, Context context, View view) {
        if (view.isEnabled()) {
            hi.d dVar = tVar.c0;
            if (dVar.R) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = mp.u1(tVar.currentAccount).l1(tVar.b);
            ConnectionsManager.getInstance(tVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bi.k1(3, tVar, context));
        }
    }

    public static void d0(t tVar, ArrayList arrayList) {
        int i7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10;
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        ud udVar = tVar.J;
        ud udVar2 = tVar.I;
        ud udVar3 = tVar.G;
        ud udVar4 = tVar.F;
        ud udVar5 = tVar.E;
        long j3 = tVar.b;
        ud udVar6 = tVar.H;
        boolean z11 = tVar.c;
        int i11 = tVar.u0;
        tVar.n = -1;
        e0 g10 = e0.g(tVar.currentAccount);
        int i12 = tVar.a;
        if (i12 == 0) {
            arrayList.add(l41.h(2, i11, tVar.y));
            arrayList.add(l41.B(-1, null));
            arrayList.add(l41.b(gd.M0(2131752951, null)));
            TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, false);
            if (h == null || (tL_starsRevenueStatus2 = h.status) == null) {
                z10 = z11;
            } else {
                udVar5.a = false;
                udVar5.g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus2.available_balance;
                udVar5.i = starsAmount;
                udVar5.h = "XTR";
                udVar5.f = "USD";
                double d = starsAmount.amount;
                z10 = z11;
                double d2 = tVar.j0;
                udVar5.j = (long) (d * d2 * 100.0d);
                udVar4.a = false;
                udVar4.g = true;
                udVar4.i = tL_starsRevenueStatus2.current_balance;
                udVar4.h = "XTR";
                udVar4.j = (long) (r11.amount * d2 * 100.0d);
                udVar4.f = "USD";
                udVar3.a = false;
                udVar3.g = true;
                udVar3.i = tL_starsRevenueStatus2.overall_revenue;
                udVar3.h = "XTR";
                udVar3.j = (long) (r11.amount * d2 * 100.0d);
                udVar3.f = "USD";
                tVar.w0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                tVar.S.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(l41.v(udVar5));
            arrayList.add(l41.v(udVar4));
            arrayList.add(l41.v(udVar3));
            arrayList.add(l41.B(-2, gd.M0(z10 ? 2131745450 : 2131752949, null)));
            arrayList.add(l41.b(gd.M0(2131752961, null)));
            arrayList.add(l41.j(1, tVar.R));
            arrayList.add(l41.B(-3, tVar.K));
            if (z10) {
                return;
            }
            if (tVar.getMessagesController().j6) {
                arrayList.add(ki.g.i(2, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lk, tVar.resourceProvider), rn.i0(gd.M0(2131753143, null)), gd.M0(2131753144, null)));
                arrayList.add(l41.B(-4, null));
            }
            tVar.n = arrayList.size();
            arrayList.add(l41.n(tVar.h, -2));
            return;
        }
        if (i12 == 1) {
            TLRPC.TL_payments_starsRevenueStats j10 = g10.j(j3, true);
            int i13 = 3;
            if (!z11) {
                if (tVar.l0 == null) {
                    tVar.l0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(gd.a0(null, null, 2131753034, 50), -1, 3, new c(tVar, i13), tVar.resourceProvider), true);
                }
                arrayList.add(l41.g(tVar.l0));
            }
            if (tVar.p0 == null && j10 != null) {
                o41 i02 = c51.i0(j10.top_hours_graph, gd.M0(2131753036, null), 0, false);
                tVar.p0 = i02;
                if (i02 != null) {
                    i02.n = true;
                }
            }
            o41 o41Var = tVar.p0;
            if (o41Var != null && !o41Var.l) {
                arrayList.add(l41.h(5, i11, o41Var));
                arrayList.add(l41.B(-1, null));
            }
            if (tVar.q0 != null || j10 == null) {
                i7 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j10.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j10.usd_rate);
                }
                i7 = 2;
                tVar.q0 = c51.i0(statsGraph, gd.M0(2131753035, null), 2, false);
            }
            o41 o41Var2 = tVar.q0;
            if (o41Var2 != null && !o41Var2.l) {
                arrayList.add(l41.h(i7, i11, o41Var2));
                arrayList.add(l41.B(-2, null));
            }
            if (!tVar.o0 && j10 != null && (tL_starsRevenueStatus = j10.status) != null) {
                double d10 = j10.usd_rate;
                long j11 = tL_starsRevenueStatus.available_balance.amount;
                udVar6.d = j11;
                double d11 = j11 / 1.0E9d;
                long j12 = (long) (d11 * d10 * 100.0d);
                udVar6.e = j12;
                if (tVar.r0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    tVar.r0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i10 = 6;
                    tVar.r0.setMaximumFractionDigits(6);
                    tVar.r0.setGroupingUsed(false);
                } else {
                    i10 = 6;
                }
                DecimalFormat decimalFormat2 = tVar.r0;
                if (d11 > 1.5d) {
                    i10 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xd.K("TON " + tVar.r0.format(d11), tVar.g0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(tVar.f0, indexOf, spannableStringBuilder.length(), 33);
                }
                tVar.g0.setText(spannableStringBuilder);
                tVar.h0.setText("≈" + org.telegram.messenger.r1.i().f(j12, "USD"));
                udVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j10.status;
                long j13 = tL_starsRevenueStatus3.current_balance.amount;
                udVar2.d = j13;
                udVar2.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
                udVar2.f = "USD";
                udVar.a = true;
                long j14 = tL_starsRevenueStatus3.overall_revenue.amount;
                udVar.d = j14;
                udVar.e = (long) ((j14 / 1.0E9d) * d10 * 100.0d);
                udVar.f = "USD";
                tVar.o0 = true;
                tVar.i0.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (tVar.o0) {
                arrayList.add(l41.b(gd.M0(2131753023, null)));
                arrayList.add(l41.v(udVar6));
                arrayList.add(l41.v(udVar2));
                arrayList.add(l41.v(udVar));
                if (tVar.m0 == null) {
                    tVar.m0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(gd.M0(2131753019, null), -1, 3, new c(tVar, 4), tVar.resourceProvider), true);
                }
                arrayList.add(l41.B(-4, tVar.m0));
            }
            arrayList.add(l41.b(gd.M0(2131753040, null)));
            arrayList.add(l41.k(tVar.e0));
            if (tVar.n0 == null) {
                tVar.n0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.R2(gd.M0(mp.u1(tVar.currentAccount).L5 ? 2131753039 : 2131753037, null), -1, 3, new c(tVar, 5), null), true);
            }
            arrayList.add(l41.B(-5, tVar.n0));
            tVar.n = arrayList.size();
            arrayList.add(l41.n(tVar.h, -2));
        }
    }

    public static void e0(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
        int i7;
        if (tL_error == null) {
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                vf.c.v(tVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url, false);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    tVar.Y = true;
                    vf.c.v(tVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url, false);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(tVar.currentAccount).sendRequest(new TL_account.getPassword(), new l(tVar, twoStepVerificationActivity, z10, j3), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.lc.e0(tL_error);
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = gd.M0(2131751286, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(activity);
        int i10 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(textView, i10, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((gd.a0 ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.g0.W2(gd.M0(2131742606, null)));
        linearLayout.addView(textView, c8.ma.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(gd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, null, mode);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.ActionBar.u6.U(textView2, i10, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((gd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.W2(gd.M0(2131751289, null)));
        if (gd.a0) {
            linearLayout2.addView(textView2, c8.ma.o(-1, -2));
            linearLayout2.addView(imageView, c8.ma.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, c8.ma.o(-2, -2));
            linearLayout2.addView(textView2, c8.ma.o(-1, -2));
        }
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 0);
        linearLayout.addView(f10, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(gd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, null, mode);
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.u6.U(textView3, i10, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((gd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.W2(gd.M0(2131751288, null)));
        if (gd.a0) {
            f10.addView(textView3, c8.ma.o(-1, -2));
            i7 = 5;
            f10.addView(imageView2, c8.ma.r(-2, -2, 5));
        } else {
            i7 = 5;
            f10.addView(imageView2, c8.ma.o(-2, -2));
            f10.addView(textView3, c8.ma.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(gd.M0(2131751280, null), new d(tVar));
            alertDialog$Builder.h(gd.M0(2131752578, null), null);
        } else {
            TextView textView4 = new TextView(activity);
            org.telegram.ui.ActionBar.u6.U(textView4, i10, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.f3.k(textView4, (gd.a0 ? i7 : 3) | 48, null, 2131751287);
            linearLayout.addView(textView4, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(gd.M0(2131747638, null), null);
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.showDialog(u1Var);
        } else {
            tVar.showDialog(u1Var);
        }
    }

    public static void f0(t tVar, View view) {
        if (!view.isEnabled() || tVar.i0.R) {
            return;
        }
        if (tVar.c && ii.n.c(tVar.currentAccount)) {
            ii.n.g(tVar, tVar.H.d, new i(tVar, 0));
            return;
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        ab.g gVar = new ab.g(14, tVar, twoStepVerificationActivity);
        twoStepVerificationActivity.a0 = 1;
        twoStepVerificationActivity.c0 = gVar;
        tVar.i0.setLoading(true);
        twoStepVerificationActivity.x0(new g(tVar, twoStepVerificationActivity, 0));
    }

    public static String x0(int i7) {
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
        return gd.a0(null, null, 2131747129, String.format(locale, "%02d", Integer.valueOf(i10)), String.format(locale, "%02d", Integer.valueOf(i12)), String.format(locale, "%02d", Integer.valueOf(i14)));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        boolean z10;
        boolean z11 = this.c;
        int i7 = this.a;
        int i10 = 1;
        if (i7 == 1 || !z11) {
            qt0 qt0Var = new qt0(context);
            this.f = qt0Var;
            qt0Var.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new d6.i(this, 13));
            qt0 qt0Var2 = this.f;
            qt0Var2.getClass();
            this.h = new bi.i3(26, context, qt0Var2);
            frameLayout = this.f;
        } else {
            this.f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.a7));
        this.d = new ao(context, null, false, getResourceProvider());
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.b));
        this.d.k(c22, true);
        this.simpleActionBar.setTitle(o10.q(c22));
        if (i7 == 0) {
            this.simpleActionBar.setSubtitle(gd.M0(2131752938, null));
        } else {
            this.simpleActionBar.setSubtitle(gd.M0(2131752937, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 4));
        this.simpleActionBar.setBackground(null);
        ob obVar = (i7 != 0 || this.f == null) ? null : new ob(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        this.L = obVar;
        if (i7 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.M = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.M.setClipToPadding(false);
            ek0 ek0Var = new ek0(context, this.resourceProvider, this.f);
            this.O = ek0Var;
            ek0Var.setAdapter(new r(this, context, ek0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.N = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            this.N.addView(ek0Var.i(-2, true), c8.ma.e(-1, 48, 48));
            this.M.addView(ek0Var, c8.ma.c(-1.0f, -1));
        } else if (obVar != null) {
            this.O = obVar.getViewPager();
            this.N = this.L.getTabsContainer();
        }
        ai.r2 r2Var = new ai.r2(context, i10);
        this.R = r2Var;
        r2Var.setOrientation(1);
        ai.r2 r2Var2 = this.R;
        int i11 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.u6.h(i11, r2Var2, getResourceProvider());
        this.R.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.U = n6Var;
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.n6 n6Var2 = this.U;
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i12, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.U.setGravity(17);
        this.T = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.U, c8.ma.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.V = n6Var3;
        n6Var3.setGravity(17);
        org.telegram.ui.Components.n6 n6Var4 = this.V;
        int i13 = org.telegram.ui.ActionBar.n6.y6;
        org.telegram.ui.ActionBar.u6.Y(n6Var4, i13, getResourceProvider());
        this.V.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.R.addView(this.V, c8.ma.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        int i14 = 0;
        p pVar = new p(i14, context, this);
        this.W = pVar;
        pVar.setText(gd.M0(2131752942, null));
        this.W.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        q qVar = new q(context, i14);
        this.a0 = qVar;
        qVar.setFocusable(false);
        org.telegram.ui.ActionBar.u6.U(this.a0, i12, getResourceProvider());
        this.a0.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.a0.setCursorWidth(1.5f);
        this.a0.setBackground(null);
        this.a0.setTextSize(1, 18.0f);
        this.a0.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        this.a0.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        this.a0.setInputType(2);
        this.a0.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.u6.C(this.a0, org.telegram.ui.ActionBar.n6.lg, getResourceProvider());
        org.telegram.ui.ActionBar.u6.y(this.a0, org.telegram.ui.ActionBar.n6.mg, getResourceProvider());
        int i15 = 3;
        this.a0.setGravity(gd.a0 ? 5 : 3);
        this.a0.setOnFocusChangeListener(new ch.c0(this, i10));
        this.a0.addTextChangedListener(new ah.j(this, i15));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, c8.ma.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.a0, c8.ma.p(-1, -2, 1.0f, ks.E1));
        this.W.e(this.a0);
        this.W.addView(linearLayout, c8.ma.e(-1, -2, 48));
        this.a0.setOnEditorActionListener(new n(this, 0));
        this.R.addView(this.W, c8.ma.t(-1, -2, 1, 18, 14, 18, 2));
        this.W.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.S = linearLayout2;
        linearLayout2.setOrientation(0);
        bi.s sVar = new bi.s(1, context, getResourceProvider(), 1 == true ? 1 : 0);
        sVar.setRoundRadius(24);
        this.b0 = sVar;
        sVar.setEnabled(mp.u1(this.currentAccount).L5);
        final int i16 = 0;
        this.b0.i(gd.M0(2131752958, null), false, true);
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: di.o
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.z0();
                        break;
                    default:
                        t.f0(this.b, view);
                        break;
                }
            }
        });
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.c0 = dVar;
        dVar.setEnabled(true);
        this.c0.i(gd.M0(2131748182, null), false, true);
        this.c0.setOnClickListener(new ai.v2(10, this, context));
        this.S.addView(this.b0, c8.ma.p(-1, 48, 1.0f, ks.E1));
        if (!z11) {
            this.S.addView(new Space(context), c8.ma.p(8, 48, 0.0f, ks.E1));
            this.S.addView(this.c0, c8.ma.p(-1, 48, 1.0f, ks.E1));
        }
        this.R.addView(this.S, c8.ma.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ai.r2 r2Var3 = new ai.r2(context, 2);
        this.e0 = r2Var3;
        r2Var3.setOrientation(1);
        org.telegram.ui.ActionBar.u6.h(i11, this.e0, this.resourceProvider);
        this.e0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.n6 n6Var5 = new org.telegram.ui.Components.n6(context, false, true, true);
        this.g0 = n6Var5;
        n6Var5.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.Y(this.g0, i12, this.resourceProvider);
        this.g0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.g0.setGravity(17);
        this.f0 = new RelativeSizeSpan(0.6770833f);
        this.e0.addView(this.g0, c8.ma.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.n6 n6Var6 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.h0 = n6Var6;
        n6Var6.setGravity(17);
        org.telegram.ui.ActionBar.u6.Y(this.h0, i13, this.resourceProvider);
        this.h0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.e0.addView(this.h0, c8.ma.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        hi.d dVar2 = new hi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.i0 = dVar2;
        dVar2.setEnabled(mp.u1(this.currentAccount).L5);
        final int i17 = 1;
        this.i0.i(gd.M0(z11 ? 2131748183 : 2131748159, null), false, true);
        this.i0.setVisibility(8);
        this.i0.setOnClickListener(new View.OnClickListener(this) { // from class: di.o
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.z0();
                        break;
                    default:
                        t.f0(this.b, view);
                        break;
                }
            }
        });
        this.e0.addView(this.i0, c8.ma.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        int i18 = 1;
        e51 e51Var = new e51(this, new i(this, i18), new d(this), new ci.v(this, i18));
        this.e = e51Var;
        e51Var.r1();
        e51 e51Var2 = this.e;
        boolean z12 = false;
        e51Var2.g3.r = false;
        e51Var2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        qt0 qt0Var3 = this.f;
        if (qt0Var3 != null) {
            e51 e51Var3 = this.e;
            getParentActivity();
            jg.i0 i0Var = new jg.i0(5, qt0Var3, z12);
            e51Var3.f3 = i0Var;
            e51Var3.setLayoutManager(i0Var);
            this.f.u(this.e, new d(this));
            z10 = true;
            this.f.x(i7 == 1 ? this.M : this.L, this.O, new d(this));
            FrameLayout frameLayout5 = this.N;
            this.f.y(frameLayout5);
            frameLayout5.setLayoutParams(c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z10 = true;
            frameLayout2.addView(this.e, c8.ma.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.r = new View(getParentActivity());
        frameLayout2.addView(this.r, frameLayout2.indexOfChild(this.f != null ? this.N : this.simpleActionBar), c8.ma.e(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        te.a aVar = new te.a(0, new d(this), lr.h, 380L, false);
        this.s = aVar;
        qt0 qt0Var4 = this.f;
        if (qt0Var4 == null || !qt0Var4.f0) {
            z10 = false;
        }
        aVar.a(z10, false);
        if (this.f != null) {
            getBaseSimpleGlass().n = this.f;
            ob obVar2 = this.L;
            if (obVar2 != null) {
                obVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.O);
            }
            int i19 = 0;
            getBaseSimpleGlass().o = new f(i19, this, new e(i19, frameLayout2));
            View view = this.N;
            fh.g c10 = getBaseSimpleGlass().c.c(view, null, false);
            c10.p(c8.i0.m(this.resourceProvider));
            c10.q(org.telegram.messenger.g0.L(9.66f));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            view.setBackground(c10);
        }
        org.telegram.messenger.g0.E2(this.d.e);
        frameLayout2.addView(this.d.e, c8.ma.e(42, 42, 53));
        t0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.E3 && ((Long) objArr[0]).longValue() == this.b) {
            u0();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        g71 g71Var = this.O;
        if (g71Var == null || !g71Var.canScrollHorizontally(-1)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        ks.f(this.currentAccount).c(this, ks.E3);
        u0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        this.P = true;
        ks.f(this.currentAccount).n(this, ks.E3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        t0();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ao aoVar = this.d;
            if (aoVar != null) {
                aoVar.i(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fj, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gj, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void t0() {
        if (this.e == null) {
            return;
        }
        org.telegram.messenger.g0.z3(this.d.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
        e51 e51Var = this.e;
        i0.b bVar = this.mSystemInsets;
        ri.a.e(e51Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        if (this.f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            this.f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            qt0 qt0Var = this.f;
            qt0Var.B();
            qt0Var.requestLayout();
            qt0Var.invalidate();
        }
        if (this.r != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.mSystemInsets.b + (this.f != null ? org.telegram.messenger.g0.L(44.0f) : 0);
            ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.r.setLayoutParams(layoutParams);
            }
            y0();
        }
    }

    public final void u0() {
        mg.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = e0.g(this.currentAccount).h(this.b, false);
        if (h == this.w) {
            if ((h == null ? null : h.status) == this.x) {
                return;
            }
        }
        this.w = h;
        this.x = h == null ? null : h.status;
        if (h != null) {
            this.j0 = h.usd_rate;
            o41 i02 = c51.i0(h.revenue_graph, gd.M0(2131752952, null), 2, false);
            this.y = i02;
            if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.y.d.d.get(0) != null) {
                o41 o41Var = this.y;
                o41Var.h = true;
                ((mg.a) o41Var.d.d.get(0)).g = org.telegram.ui.ActionBar.n6.pk;
                this.y.d.h = (float) ((1.0d / this.j0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            w0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            e51 e51Var = this.e;
            if (e51Var != null) {
                qt0 qt0Var = this.f;
                boolean z10 = qt0Var != null && qt0Var.f0;
                e51Var.g3.O(qt0Var == null);
                if (z10) {
                    this.f.a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z10, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f10 = j10.i(this.currentAccount).f();
        if (parentActivity == null || f10 == null) {
            return;
        }
        long j10 = this.b;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = mp.u1(this.currentAccount).l1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j3;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = mp.u1(this.currentAccount).l1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new j(this, twoStepVerificationActivity, parentActivity, z10, j3));
    }

    public final void w0(TL_stars.StarsAmount starsAmount, int i7) {
        if (this.U == null || this.V == null) {
            return;
        }
        long j3 = (long) (this.j0 * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pb.b1(false, TextUtils.concat("XTR ", pb.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.T, indexOf, spannableStringBuilder.length(), 33);
        }
        this.U.setText(spannableStringBuilder);
        this.V.setText("≈" + org.telegram.messenger.r1.i().f(j3, "USD"));
        this.W.setVisibility(j3 > 0 ? 0 : 8);
        if (this.Y) {
            this.X = true;
            q qVar = this.a0;
            long j10 = starsAmount.amount;
            this.Z = j10;
            qVar.setText(Long.toString(j10));
            q qVar2 = this.a0;
            qVar2.setSelection(qVar2.getText().length());
            this.X = false;
            this.b0.setEnabled(this.Z > 0);
        }
        this.Q = i7;
        c cVar = this.t0;
        org.telegram.messenger.g0.r(cVar);
        cVar.run();
    }

    public final void y0() {
        View view = this.r;
        if (view == null) {
            return;
        }
        te.a aVar = this.s;
        view.setTranslationY(this.f != null ? org.telegram.messenger.g0.L(44.0f) * (-(1.0f - (aVar == null ? 0.0f : aVar.e))) : 0.0f);
    }

    public final void z0() {
        bi.s sVar = this.b0;
        if (!sVar.e0 || sVar.R) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i7 = 1;
        if (this.Q > currentTime) {
            this.k0 = org.telegram.ui.Components.lc.b0(this).Q(R.raw.timer_3, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752941, x0(this.Q - currentTime)))).j();
            return;
        }
        if (this.Z < getMessagesController().U5) {
            org.telegram.ui.Components.lc.b0(this).M(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.g0.T2(gd.G((int) getMessagesController().U5, "BotStarsWithdrawMinLimit", new Object[0]), new c(this, i7))).j();
            return;
        }
        long j3 = this.Z;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        h hVar = new h(this, j3, twoStepVerificationActivity, 0);
        twoStepVerificationActivity.a0 = 1;
        twoStepVerificationActivity.c0 = hVar;
        this.b0.setLoading(true);
        twoStepVerificationActivity.x0(new g(this, twoStepVerificationActivity, i7));
    }
}
