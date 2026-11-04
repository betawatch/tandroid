package ci;

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
import b8.cd;
import b8.mf;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.d41;
import org.telegram.ui.ln;
import org.telegram.ui.r41;
import org.telegram.ui.ud;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends org.telegram.ui.ActionBar.d2 implements cs {
    public final ud E;
    public final ud F;
    public final ud G;
    public final ud H;
    public final ud I;
    public final ud J;
    public final SpannableStringBuilder K;
    public vb L;
    public FrameLayout M;
    public FrameLayout N;
    public n61 O;
    public boolean P;
    public int Q;
    public q R;
    public LinearLayout S;
    public RelativeSizeSpan T;
    public org.telegram.ui.Components.h6 U;
    public org.telegram.ui.Components.h6 V;
    public r W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final int a;
    public s a0;
    public final long b;
    public ai.x b0;
    public final boolean c;
    public gi.d c0;
    public jn d;
    public final wp[] d0;
    public l41 e;
    public q e0;
    public gt0 f;
    public RelativeSizeSpan f0;
    public org.telegram.ui.Components.h6 g0;
    public ai.x2 h;
    public org.telegram.ui.Components.h6 h0;
    public gi.d i0;
    public double j0;
    public org.telegram.ui.Components.ac k0;
    public SpannableStringBuilder l0;
    public SpannableStringBuilder m0;
    public int n;
    public SpannableStringBuilder n0;
    public boolean o0;
    public d41 p0;
    public d41 q0;
    public View r;
    public DecimalFormat r0;
    public qe.a s;
    public SpannableStringBuilder s0;
    public final d t0;
    public final int u0;
    public TLRPC.TL_payments_starsRevenueStats w;
    public TLRPC.TL_starsRevenueStatus x;
    public d41 y;

    /* JADX WARN: Multi-variable type inference failed */
    public v(int i3, long j10) {
        super(null);
        this.n = -1;
        this.E = ud.a("XTR", bd.M0(2131752961, null));
        this.F = ud.a("XTR", bd.M0(2131752959, null));
        this.G = ud.a("XTR", bd.M0(2131752958, null));
        this.H = ud.a("TON", bd.M0(2131753033, null));
        this.I = ud.a("TON", bd.M0(2131753032, null));
        this.J = ud.a("TON", bd.M0(2131753031, null));
        this.X = false;
        this.Y = true;
        this.d0 = new wp[1];
        this.t0 = new d(this, 0 == true ? 1 : 0);
        this.u0 = -1;
        this.a = i3;
        this.b = j10;
        boolean z10 = j10 == getUserConfig().e();
        this.c = z10;
        if (i3 == 0) {
            i0.g(this.currentAccount).r(j10);
            if (!z10) {
                i0.g(this.currentAccount).l(j10);
            }
        } else if (i3 == 1) {
            i0 g7 = i0.g(this.currentAccount);
            Long l10 = (Long) g7.d.get(Long.valueOf(j10));
            g7.j(j10, l10 == null || System.currentTimeMillis() - l10.longValue() > 30000);
        }
        this.K = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(z10 ? bd.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().R5) : bd.M0(2131752957, null), new d(this, 2)), true);
    }

    public static void Z(v vVar) {
        vVar.showDialog(xd.I(vVar.getParentActivity(), vVar.resourceProvider, true));
    }

    public static void a0(v vVar, r31 r31Var) {
        if (r31Var.H(qb.class)) {
            wb.k1(vVar.getParentActivity(), true, vVar.b, vVar.currentAccount, (TL_stars.StarsTransaction) r31Var.G, vVar.getResourceProvider());
        } else if (r31Var.G instanceof TL_stats.BroadcastRevenueTransaction) {
            xd.M(vVar.getParentActivity(), vVar.currentAccount, (TL_stats.BroadcastRevenueTransaction) r31Var.G, vVar.b, vVar.resourceProvider);
        } else if (r31Var.d == 2) {
            vVar.presentFragment(new ii.q3(vVar.b));
        }
    }

    public static void b0(v vVar) {
        d dVar = vVar.t0;
        org.telegram.ui.Components.ac.e();
        TLRPC.TL_payments_starsRevenueStats h = i0.g(vVar.currentAccount).h(vVar.b, false);
        long j10 = h == null ? 0L : h.status.available_balance.amount;
        if (j10 < vVar.getMessagesController().R5) {
            vVar.Y = true;
            vVar.Z = j10;
        } else {
            vVar.Y = false;
            vVar.Z = vVar.getMessagesController().R5;
        }
        vVar.X = true;
        vVar.a0.setText(Long.toString(vVar.Z));
        s sVar = vVar.a0;
        sVar.setSelection(sVar.getText().length());
        vVar.X = false;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
    }

    public static void c0(v vVar, Context context, View view) {
        if (view.isEnabled()) {
            gi.d dVar = vVar.c0;
            if (dVar.R) {
                return;
            }
            dVar.setLoading(true);
            TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
            tL_payments_getStarsRevenueAdsAccountUrl.peer = hp.s1(vVar.currentAccount).j1(vVar.b);
            ConnectionsManager.getInstance(vVar.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ai.f3(2, vVar, context));
        }
    }

    public static void d0(v vVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        int i3;
        if (tL_error == null) {
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
                sf.c.v(vVar.getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url, false);
                return;
            } else {
                if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
                    vVar.Y = true;
                    sf.c.v(vVar.getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url, false);
                    return;
                }
                return;
            }
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(vVar.currentAccount).sendRequest(new TL_account.getPassword(), new l(vVar, twoStepVerificationActivity, z10, j10), 8);
                return;
            }
            twoStepVerificationActivity.t0();
            twoStepVerificationActivity.finishFragment();
            org.telegram.ui.Components.fc.d0(tL_error);
            return;
        }
        twoStepVerificationActivity.t0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = bd.M0(2131751298, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.o(linearLayout);
        TextView textView = new TextView(activity);
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((bd.a0 ? 5 : 3) | 48);
        textView.setText(org.telegram.messenger.g0.X2(bd.M0(2131742874, null)));
        linearLayout.addView(textView, mf.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(bd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, null, mode);
        TextView textView2 = new TextView(activity);
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((bd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.X2(bd.M0(2131751301, null)));
        if (bd.a0) {
            linearLayout2.addView(textView2, mf.o(-1, -2));
            linearLayout2.addView(imageView, mf.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, mf.o(-2, -2));
            linearLayout2.addView(textView2, mf.o(-1, -2));
        }
        LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
        linearLayout.addView(e10, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(bd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, null, mode);
        TextView textView3 = new TextView(activity);
        org.telegram.ui.ActionBar.r6.V(textView3, i10, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((bd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.X2(bd.M0(2131751300, null)));
        if (bd.a0) {
            e10.addView(textView3, mf.o(-1, -2));
            i3 = 5;
            e10.addView(imageView2, mf.r(-2, -2, 5));
        } else {
            i3 = 5;
            e10.addView(imageView2, mf.o(-2, -2));
            e10.addView(textView3, mf.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(bd.M0(2131751292, null), new e(vVar));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(activity);
            org.telegram.ui.ActionBar.r6.V(textView4, i10, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.k5.m(textView4, (bd.a0 ? i3 : 3) | 48, null, 2131751299);
            linearLayout.addView(textView4, mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(bd.M0(2131747839, null), null);
        }
        twoStepVerificationActivity.showDialog(s1Var);
    }

    public static void e0(v vVar, ArrayList arrayList) {
        int i3;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10;
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        ud udVar = vVar.J;
        ud udVar2 = vVar.I;
        ud udVar3 = vVar.G;
        ud udVar4 = vVar.F;
        ud udVar5 = vVar.E;
        long j10 = vVar.b;
        ud udVar6 = vVar.H;
        boolean z11 = vVar.c;
        int i11 = vVar.u0;
        vVar.n = -1;
        i0 g7 = i0.g(vVar.currentAccount);
        int i12 = vVar.a;
        if (i12 == 0) {
            arrayList.add(r31.h(2, i11, vVar.y));
            arrayList.add(r31.B(-1, null));
            arrayList.add(r31.b(bd.M0(2131752962, null)));
            TLRPC.TL_payments_starsRevenueStats h = g7.h(j10, false);
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
                double d10 = vVar.j0;
                udVar5.j = (long) (d * d10 * 100.0d);
                udVar4.a = false;
                udVar4.g = true;
                udVar4.i = tL_starsRevenueStatus2.current_balance;
                udVar4.h = "XTR";
                udVar4.j = (long) (r11.amount * d10 * 100.0d);
                udVar4.f = "USD";
                udVar3.a = false;
                udVar3.g = true;
                udVar3.i = tL_starsRevenueStatus2.overall_revenue;
                udVar3.h = "XTR";
                udVar3.j = (long) (r11.amount * d10 * 100.0d);
                udVar3.f = "USD";
                vVar.v0(starsAmount, tL_starsRevenueStatus2.next_withdrawal_at);
                vVar.S.setVisibility(h.status.withdrawal_enabled ? 0 : 8);
            }
            arrayList.add(r31.v(udVar5));
            arrayList.add(r31.v(udVar4));
            arrayList.add(r31.v(udVar3));
            arrayList.add(r31.B(-2, bd.M0(z10 ? 2131745655 : 2131752960, null)));
            arrayList.add(r31.b(bd.M0(2131752972, null)));
            arrayList.add(r31.j(1, vVar.R));
            arrayList.add(r31.B(-3, vVar.K));
            if (z10) {
                return;
            }
            if (vVar.getMessagesController().g6) {
                arrayList.add(ii.g.i(2, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, vVar.resourceProvider), ln.i0(bd.M0(2131753145, null)), bd.M0(2131753146, null)));
                arrayList.add(r31.B(-4, null));
            }
            vVar.n = arrayList.size();
            arrayList.add(r31.n(vVar.h, -2));
            return;
        }
        if (i12 == 1) {
            TLRPC.TL_payments_starsRevenueStats j11 = g7.j(j10, true);
            int i13 = 3;
            if (!z11) {
                if (vVar.l0 == null) {
                    vVar.l0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(bd.a0(null, null, 2131753045, 50), -1, 3, new d(vVar, i13), vVar.resourceProvider), true);
                }
                arrayList.add(r31.g(vVar.l0));
            }
            if (vVar.p0 == null && j11 != null) {
                d41 i02 = r41.i0(j11.top_hours_graph, bd.M0(2131753047, null), 0, false);
                vVar.p0 = i02;
                if (i02 != null) {
                    i02.n = true;
                }
            }
            d41 d41Var = vVar.p0;
            if (d41Var != null && !d41Var.l) {
                arrayList.add(r31.h(5, i11, d41Var));
                arrayList.add(r31.B(-1, null));
            }
            if (vVar.q0 != null || j11 == null) {
                i3 = 2;
            } else {
                TL_stats.StatsGraph statsGraph = j11.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j11.usd_rate);
                }
                i3 = 2;
                vVar.q0 = r41.i0(statsGraph, bd.M0(2131753046, null), 2, false);
            }
            d41 d41Var2 = vVar.q0;
            if (d41Var2 != null && !d41Var2.l) {
                arrayList.add(r31.h(i3, i11, d41Var2));
                arrayList.add(r31.B(-2, null));
            }
            if (!vVar.o0 && j11 != null && (tL_starsRevenueStatus = j11.status) != null) {
                double d11 = j11.usd_rate;
                long j12 = tL_starsRevenueStatus.available_balance.amount;
                udVar6.d = j12;
                double d12 = j12 / 1.0E9d;
                long j13 = (long) (d12 * d11 * 100.0d);
                udVar6.e = j13;
                if (vVar.r0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    vVar.r0 = decimalFormat;
                    decimalFormat.setMinimumFractionDigits(2);
                    i10 = 6;
                    vVar.r0.setMaximumFractionDigits(6);
                    vVar.r0.setGroupingUsed(false);
                } else {
                    i10 = 6;
                }
                DecimalFormat decimalFormat2 = vVar.r0;
                if (d12 > 1.5d) {
                    i10 = 2;
                }
                decimalFormat2.setMaximumFractionDigits(i10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xd.K("TON " + vVar.r0.format(d12), vVar.g0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder.setSpan(vVar.f0, indexOf, spannableStringBuilder.length(), 33);
                }
                vVar.g0.setText(spannableStringBuilder);
                vVar.h0.setText("≈" + org.telegram.messenger.r1.i().f(j13, "USD"));
                udVar6.f = "USD";
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j11.status;
                long j14 = tL_starsRevenueStatus3.current_balance.amount;
                udVar2.d = j14;
                udVar2.e = (long) ((j14 / 1.0E9d) * d11 * 100.0d);
                udVar2.f = "USD";
                udVar.a = true;
                long j15 = tL_starsRevenueStatus3.overall_revenue.amount;
                udVar.d = j15;
                udVar.e = (long) ((j15 / 1.0E9d) * d11 * 100.0d);
                udVar.f = "USD";
                vVar.o0 = true;
                vVar.i0.setVisibility((tL_starsRevenueStatus3.available_balance.amount <= 0 || !tL_starsRevenueStatus3.withdrawal_enabled) ? 8 : 0);
            }
            if (vVar.o0) {
                arrayList.add(r31.b(bd.M0(2131753034, null)));
                arrayList.add(r31.v(udVar6));
                arrayList.add(r31.v(udVar2));
                arrayList.add(r31.v(udVar));
                if (vVar.m0 == null) {
                    vVar.m0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(bd.M0(2131753030, null), -1, 3, new d(vVar, 4), vVar.resourceProvider), true);
                }
                arrayList.add(r31.B(-4, vVar.m0));
            }
            arrayList.add(r31.b(bd.M0(2131753051, null)));
            arrayList.add(r31.k(vVar.e0));
            if (vVar.n0 == null) {
                vVar.n0 = org.telegram.messenger.g0.H2(org.telegram.messenger.g0.S2(bd.M0(hp.s1(vVar.currentAccount).I5 ? 2131753050 : 2131753048, null), -1, 3, new d(vVar, 5), null), true);
            }
            arrayList.add(r31.B(-5, vVar.n0));
            vVar.n = arrayList.size();
            arrayList.add(r31.n(vVar.h, -2));
        }
    }

    public static String w0(int i3) {
        int i10 = i3 / 86400;
        int i11 = i3 - (86400 * i10);
        int i12 = i11 / 3600;
        int i13 = i11 - (i12 * 3600);
        int i14 = i13 / 60;
        int i15 = i13 - (i14 * 60);
        if (i10 == 0) {
            return i12 == 0 ? String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i15)) : String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i14), Integer.valueOf(i15));
        }
        Locale locale = Locale.ENGLISH;
        return bd.a0(null, null, 2131747330, String.format(locale, "%02d", Integer.valueOf(i10)), String.format(locale, "%02d", Integer.valueOf(i12)), String.format(locale, "%02d", Integer.valueOf(i14)));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        FrameLayout frameLayout;
        boolean z10;
        boolean z11 = this.c;
        int i3 = this.a;
        int i10 = 1;
        if (i3 == 1 || !z11) {
            gt0 gt0Var = new gt0(context);
            this.f = gt0Var;
            gt0Var.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new bb.c(this, 9));
            gt0 gt0Var2 = this.f;
            gt0Var2.getClass();
            this.h = new ai.x2(26, context, gt0Var2);
            frameLayout = this.f;
        } else {
            this.f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        this.d = new jn(context, null, false, getResourceProvider());
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.b));
        this.d.k(a22, true);
        this.simpleActionBar.setTitle(l10.p(a22));
        if (i3 == 0) {
            this.simpleActionBar.setSubtitle(bd.M0(2131752949, null));
        } else {
            this.simpleActionBar.setSubtitle(bd.M0(2131752948, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, i10));
        this.simpleActionBar.setBackground(null);
        vb vbVar = (i3 != 0 || this.f == null) ? null : new vb(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        this.L = vbVar;
        if (i3 == 1) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.M = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.M.setClipToPadding(false);
            vj0 vj0Var = new vj0(context, this.resourceProvider, this.f);
            this.O = vj0Var;
            vj0Var.setAdapter(new t(this, context, vj0Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.N = frameLayout4;
            frameLayout4.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            this.N.addView(vj0Var.j(-2, true), mf.e(-1, 48, 48));
            this.M.addView(vj0Var, mf.c(-1.0f, -1));
        } else if (vbVar != null) {
            this.O = vbVar.getViewPager();
            this.N = this.L.getTabsContainer();
        }
        q qVar = new q(context, 0);
        this.R = qVar;
        qVar.setOrientation(1);
        q qVar2 = this.R;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i11, qVar2, getResourceProvider());
        this.R.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
        this.U = h6Var;
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.Components.h6 h6Var2 = this.U;
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i12, getResourceProvider());
        this.U.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.U.setGravity(17);
        this.T = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.U, mf.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var3 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.V = h6Var3;
        h6Var3.setGravity(17);
        org.telegram.ui.Components.h6 h6Var4 = this.V;
        int i13 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.Z(h6Var4, i13, getResourceProvider());
        this.V.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.R.addView(this.V, mf.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        int i14 = 0;
        r rVar = new r(i14, context, this);
        this.W = rVar;
        rVar.setText(bd.M0(2131752953, null));
        this.W.setLeftPadding(org.telegram.messenger.g0.L(36.0f));
        s sVar = new s(context, i14);
        this.a0 = sVar;
        sVar.setFocusable(false);
        org.telegram.ui.ActionBar.r6.V(this.a0, i12, getResourceProvider());
        this.a0.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.a0.setCursorWidth(1.5f);
        this.a0.setBackground(null);
        this.a0.setTextSize(1, 18.0f);
        this.a0.setMaxLines(1);
        int L = org.telegram.messenger.g0.L(16.0f);
        this.a0.setPadding(org.telegram.messenger.g0.L(6.0f), L, L, L);
        this.a0.setInputType(2);
        this.a0.setTypeface(Typeface.DEFAULT);
        org.telegram.ui.ActionBar.r6.D(this.a0, org.telegram.ui.ActionBar.k6.ig, getResourceProvider());
        org.telegram.ui.ActionBar.r6.z(this.a0, org.telegram.ui.ActionBar.k6.jg, getResourceProvider());
        this.a0.setGravity(bd.a0 ? 5 : 3);
        this.a0.setOnFocusChangeListener(new m(this, 0));
        this.a0.addTextChangedListener(new bh.h(this, i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, mf.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.a0, mf.p(-1, -2, 1.0f, hs.E1));
        this.W.e(this.a0);
        this.W.addView(linearLayout, mf.e(-1, -2, 48));
        this.a0.setOnEditorActionListener(new o(this, 0));
        this.R.addView(this.W, mf.t(-1, -2, 1, 18, 14, 18, 2));
        this.W.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.S = linearLayout2;
        linearLayout2.setOrientation(0);
        ai.x xVar = new ai.x(1, context, getResourceProvider(), 1 == true ? 1 : 0);
        xVar.setRoundRadius(24);
        this.b0 = xVar;
        xVar.setEnabled(hp.s1(this.currentAccount).I5);
        final int i15 = 0;
        this.b0.i(bd.M0(2131752969, null), false, true);
        this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: ci.p
            public final /* synthetic */ v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.y0();
                        break;
                    default:
                        if (view.isEnabled()) {
                            v vVar = this.b;
                            if (!vVar.i0.R) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ai.n nVar = new ai.n(9, vVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.a0 = 1;
                                twoStepVerificationActivity.c0 = nVar;
                                vVar.i0.setLoading(true);
                                twoStepVerificationActivity.x0(new h(vVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        gi.d dVar = new gi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.c0 = dVar;
        dVar.setEnabled(true);
        this.c0.i(bd.M0(2131748382, null), false, true);
        this.c0.setOnClickListener(new ai.d(5, this, context));
        this.S.addView(this.b0, mf.p(-1, 48, 1.0f, hs.E1));
        if (!z11) {
            this.S.addView(new Space(context), mf.p(8, 48, 0.0f, hs.E1));
            this.S.addView(this.c0, mf.p(-1, 48, 1.0f, hs.E1));
        }
        this.R.addView(this.S, mf.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        q qVar3 = new q(context, 1);
        this.e0 = qVar3;
        qVar3.setOrientation(1);
        org.telegram.ui.ActionBar.r6.i(i11, this.e0, this.resourceProvider);
        this.e0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(17.0f));
        org.telegram.ui.Components.h6 h6Var5 = new org.telegram.ui.Components.h6(context, false, true, true);
        this.g0 = h6Var5;
        h6Var5.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(this.g0, i12, this.resourceProvider);
        this.g0.setTextSize(org.telegram.messenger.g0.L(32.0f));
        this.g0.setGravity(17);
        this.f0 = new RelativeSizeSpan(0.6770833f);
        this.e0.addView(this.g0, mf.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.h6 h6Var6 = new org.telegram.ui.Components.h6(context, true, true, true);
        this.h0 = h6Var6;
        h6Var6.setGravity(17);
        org.telegram.ui.ActionBar.r6.Z(this.h0, i13, this.resourceProvider);
        this.h0.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.e0.addView(this.h0, mf.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        gi.d dVar2 = new gi.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.i0 = dVar2;
        dVar2.setEnabled(hp.s1(this.currentAccount).I5);
        final int i16 = 1;
        this.i0.i(bd.M0(z11 ? 2131748383 : 2131748359, null), false, true);
        this.i0.setVisibility(8);
        this.i0.setOnClickListener(new View.OnClickListener(this) { // from class: ci.p
            public final /* synthetic */ v b;

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
                            v vVar = this.b;
                            if (!vVar.i0.R) {
                                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                ai.n nVar = new ai.n(9, vVar, twoStepVerificationActivity);
                                twoStepVerificationActivity.a0 = 1;
                                twoStepVerificationActivity.c0 = nVar;
                                vVar.i0.setLoading(true);
                                twoStepVerificationActivity.x0(new h(vVar, twoStepVerificationActivity, 0));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.e0.addView(this.i0, mf.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        l41 l41Var = new l41(this, new ai.c(this, 11), new e(this), new a3.j(this, 17));
        this.e = l41Var;
        l41Var.r1();
        l41 l41Var2 = this.e;
        boolean z12 = false;
        l41Var2.g3.r = false;
        l41Var2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        gt0 gt0Var3 = this.f;
        if (gt0Var3 != null) {
            l41 l41Var3 = this.e;
            getParentActivity();
            kg.f0 f0Var = new kg.f0(5, gt0Var3, z12);
            l41Var3.f3 = f0Var;
            l41Var3.setLayoutManager(f0Var);
            this.f.u(this.e, new e(this));
            z10 = true;
            this.f.x(i3 == 1 ? this.M : this.L, this.O, new e(this));
            FrameLayout frameLayout5 = this.N;
            this.f.y(frameLayout5);
            frameLayout5.setLayoutParams(mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            z10 = true;
            frameLayout2.addView(this.e, mf.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().f(frameLayout2, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.r = new View(getParentActivity());
        frameLayout2.addView(this.r, frameLayout2.indexOfChild(this.f != null ? this.N : this.simpleActionBar), mf.e(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        qe.a aVar = new qe.a(0, new e(this), xq.h, 380L, false);
        this.s = aVar;
        gt0 gt0Var4 = this.f;
        if (gt0Var4 == null || !gt0Var4.f0) {
            z10 = false;
        }
        aVar.a(z10, false);
        if (this.f != null) {
            getBaseSimpleGlass().m = this.f;
            vb vbVar2 = this.L;
            if (vbVar2 != null) {
                vbVar2.setGlassEngine(this.glassEngine);
            } else {
                this.glassEngine.c(this.O);
            }
            int i17 = 0;
            getBaseSimpleGlass().n = new g(i17, this, new f(i17, frameLayout2));
            View view = this.N;
            gh.g c2 = getBaseSimpleGlass().c.c(view, null, false);
            c2.p(cd.m(this.resourceProvider));
            c2.q(org.telegram.messenger.g0.L(9.66f));
            c2.r(org.telegram.messenger.g0.L(18.0f));
            view.setBackground(c2);
        }
        org.telegram.messenger.g0.E2(this.d.e);
        frameLayout2.addView(this.d.e, mf.e(42, 42, 53));
        s0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.C3 && ((Long) objArr[0]).longValue() == this.b) {
            t0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isLightStatusBar() {
        return org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false)) > 0.721f;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        n61 n61Var = this.O;
        if (n61Var == null || !n61Var.canScrollHorizontally(-1)) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        hs.f(this.currentAccount).c(this, hs.C3);
        t0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        this.P = true;
        hs.f(this.currentAccount).n(this, hs.C3);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        s0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            jn jnVar = this.d;
            if (jnVar != null) {
                jnVar.i(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Cj, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dj, false));
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
        l41 l41Var = this.e;
        i0.b bVar = this.mSystemInsets;
        pi.a.e(l41Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 0);
        if (this.f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
            this.f.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
            gt0 gt0Var = this.f;
            gt0Var.B();
            gt0Var.requestLayout();
            gt0Var.invalidate();
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
        ng.b bVar;
        ArrayList arrayList;
        TLRPC.TL_payments_starsRevenueStats h = i0.g(this.currentAccount).h(this.b, false);
        if (h == this.w) {
            if ((h == null ? null : h.status) == this.x) {
                return;
            }
        }
        this.w = h;
        this.x = h == null ? null : h.status;
        if (h != null) {
            this.j0 = h.usd_rate;
            d41 i02 = r41.i0(h.revenue_graph, bd.M0(2131752963, null), 2, false);
            this.y = i02;
            if (i02 != null && (bVar = i02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.y.d.d.get(0) != null) {
                d41 d41Var = this.y;
                d41Var.h = true;
                ((ng.a) d41Var.d.d.get(0)).g = org.telegram.ui.ActionBar.k6.mk;
                this.y.d.h = (float) ((1.0d / this.j0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = h.status;
            v0(tL_starsRevenueStatus.available_balance, tL_starsRevenueStatus.next_withdrawal_at);
            l41 l41Var = this.e;
            if (l41Var != null) {
                gt0 gt0Var = this.f;
                boolean z10 = gt0Var != null && gt0Var.f0;
                l41Var.g3.O(gt0Var == null);
                if (z10) {
                    this.f.a();
                }
            }
        }
    }

    public final void u0(boolean z10, long j10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f10 = h10.i(this.currentAccount).f();
        if (parentActivity == null || f10 == null) {
            return;
        }
        long j11 = this.b;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = hp.s1(this.currentAccount).j1(j11);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = j10;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = hp.s1(this.currentAccount).j1(j11);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new j(this, twoStepVerificationActivity, parentActivity, z10, j10));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(TL_stars.StarsAmount starsAmount, int i3) {
        if (this.U == null || this.V == null) {
            return;
        }
        long j10 = (long) (this.j0 * starsAmount.amount * 100.0d);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wb.a1(false, TextUtils.concat("XTR ", wb.M0(starsAmount, 0.8f, ' ')), 1.0f, null));
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(this.T, indexOf, spannableStringBuilder.length(), 33);
        }
        this.U.setText(spannableStringBuilder);
        this.V.setText("≈" + org.telegram.messenger.r1.i().f(j10, "USD"));
        this.W.setVisibility(j10 > 0 ? 0 : 8);
        if (this.Y) {
            this.X = true;
            s sVar = this.a0;
            long j11 = starsAmount.amount;
            this.Z = j11;
            sVar.setText(Long.toString(j11));
            s sVar2 = this.a0;
            sVar2.setSelection(sVar2.getText().length());
            this.X = false;
            this.b0.setEnabled(this.Z > 0);
        }
        this.Q = i3;
        d dVar = this.t0;
        org.telegram.messenger.g0.r(dVar);
        dVar.run();
    }

    public final void x0() {
        View view = this.r;
        if (view == null) {
            return;
        }
        qe.a aVar = this.s;
        view.setTranslationY(this.f != null ? org.telegram.messenger.g0.L(44.0f) * (-(1.0f - (aVar == null ? 0.0f : aVar.e))) : 0.0f);
    }

    public final void y0() {
        ai.x xVar = this.b0;
        if (!xVar.d0 || xVar.R) {
            return;
        }
        int currentTime = getConnectionsManager().getCurrentTime();
        int i3 = 1;
        if (this.Q > currentTime) {
            this.k0 = org.telegram.ui.Components.fc.a0(this).Q(R.raw.timer_3, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752952, w0(this.Q - currentTime)))).j();
            return;
        }
        if (this.Z < getMessagesController().R5) {
            org.telegram.ui.Components.fc.a0(this).M(getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.g0.U2(bd.G((int) getMessagesController().R5, "BotStarsWithdrawMinLimit", new Object[0]), new d(this, i3))).j();
            return;
        }
        long j10 = this.Z;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        i iVar = new i(this, j10, twoStepVerificationActivity, 0);
        twoStepVerificationActivity.a0 = 1;
        twoStepVerificationActivity.c0 = iVar;
        this.b0.setLoading(true);
        twoStepVerificationActivity.x0(new h(this, twoStepVerificationActivity, i3));
    }
}
