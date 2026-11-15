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
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.l41;
import org.telegram.ui.qn;
import org.telegram.ui.ud;
import org.telegram.ui.xd;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t extends org.telegram.ui.ActionBar.e2 implements is {
    public final ud E;
    public final ud F;
    public final ud G;
    public final ud H;
    public final ud I;
    public final ud J;
    public final SpannableStringBuilder K;
    public lb L;
    public FrameLayout M;
    public FrameLayout N;
    public w61 O;
    public boolean P;
    public int Q;
    public ai.q2 R;
    public LinearLayout S;
    public RelativeSizeSpan T;
    public org.telegram.ui.Components.h6 U;
    public org.telegram.ui.Components.h6 V;
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
    public sn d;
    public final eq[] d0;
    public u41 e;
    public ai.q2 e0;
    public it0 f;
    public RelativeSizeSpan f0;
    public org.telegram.ui.Components.h6 g0;
    public bi.o2 h;
    public org.telegram.ui.Components.h6 h0;
    public hi.d i0;
    public double j0;
    public org.telegram.ui.Components.xb k0;
    public SpannableStringBuilder l0;
    public SpannableStringBuilder m0;
    public int n;
    public SpannableStringBuilder n0;
    public boolean o0;
    public l41 p0;
    public l41 q0;
    public View r;
    public DecimalFormat r0;
    public te.a s;
    public SpannableStringBuilder s0;
    public final c t0;
    public final int u0;
    public TLRPC.TL_payments_starsRevenueStats w;
    public TLRPC.TL_starsRevenueStatus x;
    public l41 y;

    /* JADX WARN: Multi-variable type inference failed */
    public t(int i7, long j3) {
        super(null);
        this.n = -1;
        this.E = ud.a("XTR", hd.M0(2131752961, null));
        this.F = ud.a("XTR", hd.M0(2131752959, null));
        this.G = ud.a("XTR", hd.M0(2131752958, null));
        this.H = ud.a("TON", hd.M0(2131753033, null));
        this.I = ud.a("TON", hd.M0(2131753032, null));
        this.J = ud.a("TON", hd.M0(2131753031, null));
        this.X = false;
        this.Y = true;
        this.d0 = new eq[1];
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
        this.K = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(z10 ? hd.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().S5) : hd.M0(2131752957, null), new c(this, 2)), true);
    }

    public static void Z(t tVar) {
        tVar.showDialog(xd.I(tVar.getParentActivity(), tVar.resourceProvider, true));
    }

    public static void a0(t tVar, b41 b41Var) {
        if (b41Var.H(gb.class)) {
            mb.k1(tVar.getParentActivity(), true, tVar.b, tVar.currentAccount, (TL_stars.StarsTransaction) b41Var.G, tVar.getResourceProvider());
        } else if (b41Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            xd.M(tVar.getParentActivity(), tVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) b41Var.G, tVar.b, tVar.resourceProvider);
        } else if (b41Var.d == 2) {
            tVar.presentFragment(new ki.n3(tVar.b));
        }
    }

    public static void b0(t tVar) {
        c cVar = tVar.t0;
        org.telegram.ui.Components.xb.e();
        TLRPC.TL_payments_starsRevenueStats h = e0.g(tVar.currentAccount).h(tVar.b, false);
        long j3 = h == null ? 0L : h.status.available_balance.amount;
        if (j3 < tVar.getMessagesController().S5) {
            tVar.Y = true;
            tVar.Z = j3;
        } else {
            tVar.Y = false;
            tVar.Z = tVar.getMessagesController().S5;
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
            tL_payments_getStarsRevenueAdsAccountUrl.peer = np.s1(tVar.currentAccount).j1(tVar.b);
            ConnectionsManager.getInstance(tVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new bi.v2(2, tVar, context));
        }
    }

    public static void d0(t tVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3, TLObject tLObject) {
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
                ConnectionsManager.getInstance(tVar.currentAccount).sendRequest(new TL_account.getPassword(), new k(tVar, twoStepVerificationActivity, z10, j3), 8);
                return;
            }
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
            org.telegram.ui.Components.cc.d0(tL_error);
            return;
        }
        twoStepVerificationActivity.t0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = hd.M0(2131751297, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = M0;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(activity);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.U(textView, i10, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((hd.a0 ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.g0.X2(hd.M0(2131742864, null)));
        linearLayout.addView(textView, c8.ja.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, null, mode);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.ActionBar.q6.U(textView2, i10, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((hd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131751300, null)));
        if (hd.a0) {
            linearLayout2.addView(textView2, c8.ja.o(-1, -2));
            linearLayout2.addView(imageView, c8.ja.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, c8.ja.o(-2, -2));
            linearLayout2.addView(textView2, c8.ja.o(-1, -2));
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
        linearLayout.addView(e10, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(hd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.q6.s(imageView2, i10, null, mode);
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.q6.U(textView3, i10, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((hd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.X2(hd.M0(2131751299, null)));
        if (hd.a0) {
            e10.addView(textView3, c8.ja.o(-1, -2));
            i7 = 5;
            e10.addView(imageView2, c8.ja.r(-2, -2, 5));
        } else {
            i7 = 5;
            e10.addView(imageView2, c8.ja.o(-2, -2));
            e10.addView(textView3, c8.ja.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(hd.M0(2131751291, null), new d(tVar));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(activity);
            org.telegram.ui.ActionBar.q6.U(textView4, i10, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.k5.l(textView4, (hd.a0 ? i7 : 3) | 48, null, 2131751298);
            linearLayout.addView(textView4, c8.ja.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(hd.M0(2131747831, null), null);
        }
        twoStepVerificationActivity.showDialog(t1Var);
    }

    public static void e0(t tVar, ArrayList arrayList) {
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
            arrayList.add(b41.h(2, i11, tVar.y));
            arrayList.add(b41.B(-1, null));
            arrayList.add(b41.b(hd.M0(2131752962, null)));
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
                tVar.v0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                tVar.S.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(b41.v(udVar5));
            arrayList.add(b41.v(udVar4));
            arrayList.add(b41.v(udVar3));
            arrayList.add(b41.B(-2, hd.M0(z10 ? 2131745645 : 2131752960, null)));
            arrayList.add(b41.b(hd.M0(2131752972, null)));
            arrayList.add(b41.j(1, tVar.R));
            arrayList.add(b41.B(-3, tVar.K));
            if (z10) {
                return;
            }
            if (tVar.getMessagesController().h6) {
                arrayList.add(ki.g.i(2, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lk, tVar.resourceProvider), qn.i0(hd.M0(2131753145, null)), hd.M0(2131753146, null)));
                arrayList.add(b41.B(-4, null));
            }
            tVar.n = arrayList.size();
            arrayList.add(b41.n(tVar.h, -2));
            return;
        }
        if (i12 == 1) {
            TLRPC.TL_payments_starsRevenueStats j10 = g10.j(j3, true);
            int i13 = 3;
            if (!z11) {
                if (tVar.l0 == null) {
                    tVar.l0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(hd.a0(null, null, 2131753045, 50), -1, 3, new c(tVar, i13), tVar.resourceProvider), true);
                }
                arrayList.add(b41.g(tVar.l0));
            }
            if (tVar.p0 == null && j10 != null) {
                l41 i02 = z41.i0(j10.top_hours_graph, hd.M0(2131753047, null), 0, false);
                tVar.p0 = i02;
                if (i02 != null) {
                    i02.n = true;
                }
            }
            l41 l41Var = tVar.p0;
            if (l41Var != null && !l41Var.l) {
                arrayList.add(b41.h(5, i11, l41Var));
                arrayList.add(b41.B(-1, null));
            }
            if (tVar.q0 != null || j10 == null) {
                i7 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j10.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j10.usd_rate);
                }
                i7 = 2;
                tVar.q0 = z41.i0(statsGraph, hd.M0(2131753046, null), 2, false);
            }
            l41 l41Var2 = tVar.q0;
            if (l41Var2 != null && !l41Var2.l) {
                arrayList.add(b41.h(i7, i11, l41Var2));
                arrayList.add(b41.B(-2, null));
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
                arrayList.add(b41.b(hd.M0(2131753034, null)));
                arrayList.add(b41.v(udVar6));
                arrayList.add(b41.v(udVar2));
                arrayList.add(b41.v(udVar));
                if (tVar.m0 == null) {
                    tVar.m0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(hd.M0(2131753030, null), -1, 3, new c(tVar, 4), tVar.resourceProvider), true);
                }
                arrayList.add(b41.B(-4, tVar.m0));
            }
            arrayList.add(b41.b(hd.M0(2131753051, null)));
            arrayList.add(b41.k(tVar.e0));
            if (tVar.n0 == null) {
                tVar.n0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(hd.M0(np.s1(tVar.currentAccount).J5 ? 2131753050 : 2131753048, null), -1, 3, new c(tVar, 5), null), true);
            }
            arrayList.add(b41.B(-5, tVar.n0));
            tVar.n = arrayList.size();
            arrayList.add(b41.n(tVar.h, -2));
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
        return hd.a0(null, null, 2131747322, String.format(locale, "%02d", Integer.valueOf(i10)), String.format(locale, "%02d", Integer.valueOf(i12)), String.format(locale, "%02d", Integer.valueOf(i14)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        boolean z10;
        lb lbVar;
        boolean z11;
        boolean z12 = this.c;
        int i7 = 17;
        int i10 = this.a;
        int i11 = 1;
        if (i10 == 1 || !z12) {
            it0 it0Var = new it0(context);
            this.f = it0Var;
            it0Var.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new cb.c(this, i7));
            it0 it0Var2 = this.f;
            it0Var2.getClass();
            this.h = new bi.o2(26, context, it0Var2);
            frameLayout = this.f;
        } else {
            this.f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        this.d = new sn(context, null, false, getResourceProvider());
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.b));
        this.d.k(a22, true);
        this.simpleActionBar.setTitle(q10.p(a22));
        if (i10 == 0) {
            this.simpleActionBar.setSubtitle(hd.M0(2131752949, null));
        } else {
            this.simpleActionBar.setSubtitle(hd.M0(2131752948, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 2));
        this.simpleActionBar.setBackground(null);
        if (i10 != 0 || this.f == null) {
            z10 = false;
            lbVar = null;
        } else {
            z10 = false;
            lbVar = new lb(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        }
        this.L = lbVar;
        if (i10 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.M = frameLayout3;
            frameLayout3.setClipChildren(z10);
            this.M.setClipToPadding(z10);
            wj0 wj0Var = new wj0(context, this.resourceProvider, this.f);
            this.O = wj0Var;
            wj0Var.setAdapter(new r(this, context, wj0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.N = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            this.N.addView(wj0Var.i(-2, true), c8.ja.e(-1, 48, 48));
            this.M.addView(wj0Var, c8.ja.c(-1.0f, -1));
        } else if (lbVar != null) {
            this.O = lbVar.getViewPager();
            this.N = this.L.getTabsContainer();
        }
        ai.q2 q2Var = new ai.q2(context, i11);
        this.R = q2Var;
        q2Var.setOrientation(1);
        ai.q2 q2Var2 = this.R;
        int i12 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.q6.h(i12, q2Var2, getResourceProvider());
        this.R.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.U = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.h6 h6Var2 = this.U;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.Y(h6Var2, i13, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.U.setGravity(17);
        this.T = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.U, c8.ja.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.V = h6Var3;
        h6Var3.setGravity(17);
        org.telegram.ui.Components.h6 h6Var4 = this.V;
        int i14 = org.telegram.ui.ActionBar.j6.y6;
        org.telegram.ui.ActionBar.q6.Y(h6Var4, i14, getResourceProvider());
        this.V.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.R.addView(this.V, c8.ja.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        int i15 = 0;
        p pVar = new p(i15, context, this);
        this.W = pVar;
        pVar.setText(hd.M0(2131752953, null));
        this.W.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        q qVar = new q(context, i15);
        this.a0 = qVar;
        qVar.setFocusable(false);
        org.telegram.ui.ActionBar.q6.U(this.a0, i13, getResourceProvider());
        this.a0.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.a0.setCursorWidth(1.5f);
        this.a0.setBackground(null);
        this.a0.setTextSize(1, 18.0f);
        this.a0.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        this.a0.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        int i16 = 2;
        this.a0.setInputType(2);
        this.a0.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.q6.C(this.a0, org.telegram.ui.ActionBar.j6.lg, getResourceProvider());
        org.telegram.ui.ActionBar.q6.y(this.a0, org.telegram.ui.ActionBar.j6.mg, getResourceProvider());
        this.a0.setGravity(hd.a0 ? 5 : 3);
        this.a0.setOnFocusChangeListener(new ch.c0(this, i11));
        this.a0.addTextChangedListener(new ah.j(this, i16));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, c8.ja.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.a0, c8.ja.p(-1, -2, 1.0f, ns.E1));
        this.W.e(this.a0);
        this.W.addView(linearLayout, c8.ja.e(-1, -2, 48));
        this.a0.setOnEditorActionListener(new m(this, 0));
        this.R.addView(this.W, c8.ja.t(-1, -2, 1, 18, 14, 18, 2));
        this.W.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.S = linearLayout2;
        linearLayout2.setOrientation(0);
        bi.s sVar = new bi.s(1, context, getResourceProvider(), 1 == true ? 1 : 0);
        sVar.setRoundRadius(24);
        this.b0 = sVar;
        sVar.setEnabled(np.s1(this.currentAccount).J5);
        final int i17 = 0;
        this.b0.i(hd.M0(2131752969, null), false, true);
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: di.n
            public final /* synthetic */ t b;

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
                            t tVar = this.b;
                            if (!tVar.i0.R) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ab.g gVar = new ab.g(15, tVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.a0 = 1;
                                twoStepVerificationActivity.c0 = gVar;
                                tVar.i0.setLoading(true);
                                twoStepVerificationActivity.x0(new g(tVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.c0 = dVar;
        dVar.setEnabled(true);
        this.c0.i(hd.M0(2131748374, null), false, true);
        this.c0.setOnClickListener(new ai.t2(7, this, context));
        this.S.addView(this.b0, c8.ja.p(-1, 48, 1.0f, ns.E1));
        if (!z12) {
            this.S.addView(new Space(context), c8.ja.p(8, 48, 0.0f, ns.E1));
            this.S.addView(this.c0, c8.ja.p(-1, 48, 1.0f, ns.E1));
        }
        this.R.addView(this.S, c8.ja.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ai.q2 q2Var3 = new ai.q2(context, 2);
        this.e0 = q2Var3;
        q2Var3.setOrientation(1);
        org.telegram.ui.ActionBar.q6.h(i12, this.e0, this.resourceProvider);
        this.e0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var5 = new org.telegram.ui.Components.h6(context, false, true, true);
        this.g0 = h6Var5;
        h6Var5.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(this.g0, i13, this.resourceProvider);
        this.g0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.g0.setGravity(17);
        this.f0 = new RelativeSizeSpan(0.6770833f);
        this.e0.addView(this.g0, c8.ja.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var6 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.h0 = h6Var6;
        h6Var6.setGravity(17);
        org.telegram.ui.ActionBar.q6.Y(this.h0, i14, this.resourceProvider);
        this.h0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.e0.addView(this.h0, c8.ja.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        hi.d dVar2 = new hi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.i0 = dVar2;
        dVar2.setEnabled(np.s1(this.currentAccount).J5);
        final int i18 = 1;
        this.i0.i(hd.M0(z12 ? 2131748375 : 2131748351, null), false, true);
        this.i0.setVisibility(8);
        this.i0.setOnClickListener(new View.OnClickListener(this) { // from class: di.n
            public final /* synthetic */ t b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.y0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            t tVar = this.b;
                            if (!tVar.i0.R) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ab.g gVar = new ab.g(15, tVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.a0 = 1;
                                twoStepVerificationActivity.c0 = gVar;
                                tVar.i0.setLoading(true);
                                twoStepVerificationActivity.x0(new g(tVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.e0.addView(this.i0, c8.ja.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        Object[] objArr = 0;
        u41 u41Var = new u41(this, new bi.b(this, 12), new d(this), new o(this, 0));
        this.e = u41Var;
        u41Var.r1();
        u41 u41Var2 = this.e;
        u41Var2.g3.r = false;
        u41Var2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        it0 it0Var3 = this.f;
        if (it0Var3 != null) {
            u41 u41Var3 = this.e;
            getParentActivity();
            jg.i0 i0Var = new jg.i0(5, it0Var3, objArr == true ? 1 : 0);
            u41Var3.f3 = i0Var;
            u41Var3.setLayoutManager(i0Var);
            this.f.u(this.e, new d(this));
            z11 = true;
            this.f.x(i10 == 1 ? this.M : this.L, this.O, new d(this));
            FrameLayout frameLayout5 = this.N;
            this.f.y(frameLayout5);
            frameLayout5.setLayoutParams(c8.ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z11 = true;
            frameLayout2.addView(this.e, c8.ja.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.r = new View(getParentActivity());
        frameLayout2.addView(this.r, frameLayout2.indexOfChild(this.f != null ? this.N : this.simpleActionBar), c8.ja.e(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        te.a aVar = new te.a(0, new d(this), er.h, 380L, false);
        this.s = aVar;
        it0 it0Var4 = this.f;
        if (it0Var4 == null || !it0Var4.f0) {
            z11 = false;
        }
        aVar.a(z11, false);
        if (this.f != null) {
            getBaseSimpleGlass().n = this.f;
            lb lbVar2 = this.L;
            if (lbVar2 != null) {
                lbVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.O);
            }
            int i19 = 0;
            getBaseSimpleGlass().o = new f(i19, this, new e(i19, frameLayout2));
            View view = this.N;
            fh.g c10 = getBaseSimpleGlass().c.c(view, null, false);
            c10.p(c8.g0.l(this.resourceProvider));
            c10.q(org.telegram.messenger.g0.L(9.66f));
            c10.r(org.telegram.messenger.g0.L(18.0f));
            view.setBackground(c10);
        }
        org.telegram.messenger.g0.E2(this.d.e);
        frameLayout2.addView(this.d.e, c8.ja.e(42, 42, 53));
        s0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.C3 && ((Long) objArr[0]).longValue() == this.b) {
            t0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        w61 w61Var = this.O;
        if (w61Var == null || !w61Var.canScrollHorizontally(-1)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        ns.f(this.currentAccount).c(this, ns.C3);
        t0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        this.P = true;
        ns.f(this.currentAccount).n(this, ns.C3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        s0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            sn snVar = this.d;
            if (snVar != null) {
                snVar.i(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fj, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Gj, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void s0() {
        if (this.e == null) {
            return;
        }
        org.telegram.messenger.g0.A3(this.d.e, 0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(42.0f)) / 2) + this.mSystemInsets.b, org.telegram.messenger.g0.L(6.0f), 0);
        u41 u41Var = this.e;
        i0.c cVar = this.mSystemInsets;
        ri.a.e(u41Var, cVar.b, cVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        if (this.f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            this.f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            it0 it0Var = this.f;
            it0Var.B();
            it0Var.requestLayout();
            it0Var.invalidate();
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
            l41 i02 = z41.i0(h.revenue_graph, hd.M0(2131752963, null), 2, false);
            this.y = i02;
            if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.y.d.d.get(0) != null) {
                l41 l41Var = this.y;
                l41Var.h = true;
                ((mg.a) l41Var.d.d.get(0)).g = org.telegram.ui.ActionBar.j6.pk;
                this.y.d.h = (float) ((1.0d / this.j0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            v0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            u41 u41Var = this.e;
            if (u41Var != null) {
                it0 it0Var = this.f;
                boolean z10 = it0Var != null && it0Var.f0;
                u41Var.g3.O(it0Var == null);
                if (z10) {
                    this.f.a();
                }
            }
        }
    }

    public final void u0(boolean z10, long j3, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f10 = m10.i(this.currentAccount).f();
        if (parentActivity == null || f10 == null) {
            return;
        }
        long j10 = this.b;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = np.s1(this.currentAccount).j1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j3;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = np.s1(this.currentAccount).j1(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new i(this, twoStepVerificationActivity, parentActivity, z10, j3));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(TL_stars.StarsAmount starsAmount, int i7) {
        if (this.U == null || this.V == null) {
            return;
        }
        long j3 = (long) (this.j0 * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mb.a1(false, TextUtils.concat("XTR ", mb.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
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

    public final void x0() {
        View view = this.r;
        if (view == null) {
            return;
        }
        te.a aVar = this.s;
        view.setTranslationY(this.f != null ? org.telegram.messenger.g0.L(44.0f) * (-(1.0f - (aVar == null ? 0.0f : aVar.e))) : 0.0f);
    }

    public final void y0() {
        bi.s sVar = this.b0;
        if (!sVar.d0 || sVar.R) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i7 = 1;
        if (this.Q > currentTime) {
            this.k0 = org.telegram.ui.Components.cc.a0(this).Q(R.raw.timer_3, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752952, w0(this.Q - currentTime)))).j();
            return;
        }
        if (this.Z < getMessagesController().S5) {
            org.telegram.ui.Components.cc.a0(this).M(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.g0.U2(hd.G((int) getMessagesController().S5, "BotStarsWithdrawMinLimit", new Object[0]), new c(this, i7))).j();
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
