package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.u70;
import org.telegram.ui.vs0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m9 extends h41 implements cs {
    public LinearLayout E;
    public l9 F;
    public ShapeDrawable G;
    public org.telegram.ui.ActionBar.t4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public final Runnable K;
    public final ViewTreeObserver.OnWindowFocusChangeListener L;
    public SpannableString M;
    public SpannableString N;
    public org.telegram.ui.Components.h6 O;
    public TextView P;
    public TextView Q;
    public s70 R;
    public TextView S;
    public SpannableString T;
    public org.telegram.ui.ActionBar.k2 U;
    public SpannableString V;
    public boolean W;
    public boolean X;
    public float Y;
    public ValueAnimator Z;
    public LinearLayout a0;
    public q1.g b0;
    public float c0;
    public float d0;
    public TL_wallet.walletUserAddress e;
    public gi.d e0;
    public TLRPC.User f;
    public long f0;
    public boolean g0;
    public String h;
    public String h0;
    public boolean i0;
    public int j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public String n;
    public DecimalFormat n0;
    public DecimalFormat o0;
    public int p0;
    public boolean q0;
    public boolean r;
    public TL_wallet.walletTransaction r0;
    public long s;
    public w5 s0;
    public aa t0;
    public wm u0;
    public m6 v0;
    public q8 w;
    public int w0;
    public gi.y4 x;
    public int x0;
    public FrameLayout y;

    public m9(TLRPC.User user) {
        this.s = 0L;
        this.K = new w8(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.x8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                m9 m9Var = m9.this;
                Runnable runnable = m9Var.K;
                if (z10 && m9Var.J && (editTextBoldCursor = m9Var.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    m9Var.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        this.f = user;
        this.h = null;
        this.r = true;
        k0.x(this.currentAccount).a0(user, new y8(this, 2));
    }

    public static void d0(m9 m9Var) {
        w5.J0(m9Var.currentAccount, m9Var.getParentActivity(), m9Var.getResourceProvider());
    }

    public static void e0(final m9 m9Var) {
        gi.d dVar = m9Var.e0;
        if (!dVar.d0 || dVar.R) {
            return;
        }
        final k0 x10 = k0.x(m9Var.currentAccount);
        long p02 = m9Var.p0();
        long v = x10.v();
        if (m9Var.r || !WalletEngine2.isValidRecipientAddress(m9Var.h) || p02 <= 0) {
            return;
        }
        long j10 = ((org.telegram.messenger.l0) hp.s1(m9Var.currentAccount).x7.l0.b).c;
        if (p02 < j10) {
            String l02 = m9Var.l0 ? m9Var.l0(j10, m9Var.n0()) : q0(j10);
            m9Var.F.setAmountText(l02);
            m9Var.I.setSelection(l02.length());
            EditTextBoldCursor editTextBoldCursor = m9Var.I;
            int i3 = -m9Var.p0;
            m9Var.p0 = i3;
            org.telegram.messenger.g0.G3(i3, editTextBoldCursor, null);
            return;
        }
        if (p02 > v) {
            org.telegram.messenger.p2.E.a();
            s70 s70Var = m9Var.R;
            int i10 = -m9Var.p0;
            m9Var.p0 = i10;
            org.telegram.messenger.g0.G3(i10, s70Var, null);
            return;
        }
        long j11 = m9Var.f0;
        if (j11 >= 0 && p02 + j11 > v) {
            p02 -= j11;
        }
        m9Var.J = false;
        EditTextBoldCursor editTextBoldCursor2 = m9Var.I;
        if (editTextBoldCursor2 != null) {
            editTextBoldCursor2.removeCallbacks(m9Var.K);
            m9Var.fragmentView.requestFocus();
            org.telegram.messenger.g0.v1(m9Var.I);
        }
        m9Var.e0.setLoading(true);
        m9Var.r0 = null;
        if (m9Var.f != null && TextUtils.isEmpty(m9Var.n)) {
            m9Var.q0 = true;
            x10.d0(m9Var.f, m9Var.h, p02, m9Var.h0, m9Var.i0 ? m9Var.r0() : null, null, null, new a9(m9Var, 0), new a9(m9Var, 1), null);
            return;
        }
        final String str = m9Var.h0;
        byte[] r02 = m9Var.i0 ? m9Var.r0() : null;
        boolean z10 = r02 != null;
        if (!x10.F()) {
            final long j12 = p02;
            final boolean z11 = z10;
            x10.i(m9Var.h, j12, str, r02, new n10() { // from class: org.telegram.ui.Wallet.c9
                @Override // org.telegram.messenger.n10
                public final void a(Object obj, Object obj2) {
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = (String) obj2;
                    m9 m9Var2 = m9.this;
                    if (str2 != null) {
                        m9Var2.e0.setLoading(false);
                        fc.a0(m9Var2).e0(str2, false);
                        return;
                    }
                    wallettransaction.peer = k0.g(m9Var2.f, m9Var2.h, m9Var2.n);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z11;
                    wallettransaction.date = m9Var2.getConnectionsManager().getCurrentTime();
                    org.telegram.messenger.g0.v1(m9Var2.I);
                    w5.G0(m9Var2.getParentActivity(), m9Var2.getCurrentAccount(), wallettransaction, new b9(m9Var2, x10, j12, 1), new y8(m9Var2, 4), m9Var2.r0(), null, m9Var2.getResourceProvider());
                    org.telegram.messenger.g0.i3(new w8(m9Var2, 3), 1000L);
                }
            });
            return;
        }
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        wallettransaction.peer = k0.g(m9Var.f, m9Var.h, m9Var.n);
        wallettransaction.comment = str;
        wallettransaction.comment_encrypted = z10;
        wallettransaction.date = m9Var.getConnectionsManager().getCurrentTime();
        wallettransaction.fee = Math.max(0L, m9Var.f0);
        wallettransaction.gasless = true;
        wallettransaction.amount = p02;
        org.telegram.messenger.g0.v1(m9Var.I);
        w5.G0(m9Var.getParentActivity(), m9Var.getCurrentAccount(), wallettransaction, new b9(m9Var, x10, p02, 0), new y8(m9Var, 3), m9Var.r0(), null, m9Var.getResourceProvider());
        org.telegram.messenger.g0.i3(new w8(m9Var, 2), 1000L);
    }

    public static void f0(m9 m9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            m9Var.q0 = false;
            m9Var.e0.setLoading(false);
            return;
        }
        if (str != null) {
            m9Var.q0 = false;
            m9Var.e0.setLoading(false);
            fc.a0(m9Var).e0(str, false);
            return;
        }
        if (!m9Var.g0) {
            m9Var.w0();
            return;
        }
        org.telegram.ui.ActionBar.q4 parentLayout = m9Var.getParentLayout();
        if (parentLayout == null) {
            m9Var.finishFragment();
            return;
        }
        long j10 = m9Var.f.id;
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || k2.p1.h(1, arrayList) != m9Var) {
            return;
        }
        int size = arrayList.size() - 2;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) arrayList.get(size);
            if ((d2Var instanceof wm) && d2Var.getCurrentAccount() == m9Var.currentAccount) {
                wm wmVar = (wm) d2Var;
                if (wmVar.a() == j10 && wmVar.g4 == 0) {
                    m9Var.u0 = wmVar;
                    for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                        ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.d2) arrayList.get(size2), false);
                    }
                }
            }
            size--;
        }
        if (m9Var.u0 == null) {
            m9Var.getNotificationCenter().k(hs.v, Long.valueOf(j10), Boolean.FALSE);
            wm ra2 = wm.ra(j10);
            ra2.setCurrentAccount(m9Var.currentAccount);
            if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ra2)) {
                m9Var.finishFragment();
                return;
            }
            m9Var.u0 = ra2;
        }
        m9Var.finishFragment();
    }

    public static void g0(m9 m9Var, TL_wallet.walletUserAddress walletuseraddress) {
        m9Var.r = false;
        m9Var.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            m9Var.f = hp.s1(m9Var.currentAccount).a2(Long.valueOf(walletuseraddress.user_id));
        }
        ai.h4 h4Var = m9Var.a;
        if (h4Var != null) {
            h4Var.g3.O(true);
        }
        m9Var.C0();
        q8 q8Var = m9Var.w;
        if (q8Var != null) {
            q8Var.a(m9Var.h, m9Var.f);
        }
    }

    public static int m0(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i3 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i3++;
        }
        return i3;
    }

    public static String q0(long j10) {
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static BigDecimal v0(String str) {
        if (TextUtils.isEmpty(str)) {
            return BigDecimal.ZERO;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str.replace(',', '.'));
            return bigDecimal.signum() < 0 ? BigDecimal.ZERO : bigDecimal;
        } catch (NumberFormatException unused) {
            return BigDecimal.ZERO;
        }
    }

    public static void z0(SpannableStringBuilder spannableStringBuilder, int i3, int i10, char c2) {
        int i11 = i3 + 1;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10) {
                return;
            }
            if (spannableStringBuilder.charAt(i11) == c2 && Character.isDigit(spannableStringBuilder.charAt(i11 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i12))) {
                int i13 = i12;
                while (i13 < i10 && Character.isDigit(spannableStringBuilder.charAt(i13))) {
                    i13++;
                }
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), i12, i13, 33);
                return;
            }
            i11 = i12;
        }
    }

    public final void A0(String str) {
        this.n = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(bd.M0(2131743026, null));
        }
    }

    public final void B0(boolean z10) {
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) bd.M0(2131743094, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) bd.M0(2131743147, null));
            spannableStringBuilder.append((CharSequence) " >");
            wp wpVar = new wp(R.drawable.settings_arrow, 0);
            float N = org.telegram.messenger.g0.N(0.66f);
            wpVar.r = 0.0f;
            wpVar.s = N;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new gi.ka(this, 9), length, spannableStringBuilder.length(), 33);
            this.R.setText(spannableStringBuilder);
        }
        this.R.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(xq.h).start();
    }

    public final void C0() {
        E0();
        if (this.I == null || this.e0 == null) {
            return;
        }
        k0 x10 = k0.x(this.currentAccount);
        long v = x10.v();
        long p02 = p0();
        long j10 = ((org.telegram.messenger.l0) hp.s1(this.currentAccount).x7.l0.b).c;
        if (p02 > 0 && p02 < j10) {
            String l02 = this.l0 ? l0(j10, n0()) : q0(j10);
            this.F.setAmountText(l02);
            this.I.setSelection(l02.length());
            EditTextBoldCursor editTextBoldCursor = this.I;
            int i3 = -this.p0;
            this.p0 = i3;
            org.telegram.messenger.g0.G3(i3, editTextBoldCursor, null);
            return;
        }
        boolean z10 = WalletEngine2.isValidRecipientAddress(this.h) && !this.r && p02 > 0 && p02 <= v;
        B0(!TextUtils.isEmpty(this.I.getText()) && p02 > v);
        long p03 = p0();
        if (this.n0 == null) {
            this.n0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        String format = p03 > 0 ? this.n0.format(BigDecimal.valueOf(p03, 9)) : "";
        this.e0.setLoading(this.r || this.q0);
        this.e0.i(TextUtils.isEmpty(format) ? bd.M0(2131743030, null) : bd.V(null, null, 2131743031, k0.l("Grams", format, 2131749515)), true, true);
        this.e0.setEnabled(z10);
        D0();
        F0();
        if (!this.l0) {
            this.O.setText(o0(x10, p02));
            return;
        }
        org.telegram.ui.Components.h6 h6Var = this.O;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.N).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        if (this.o0 == null) {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
            this.o0 = decimalFormat;
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        }
        spannableStringBuilder.append((CharSequence) this.o0.format(BigDecimal.valueOf(p02).movePointLeft(9)));
        z0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) bd.M0(2131749524, null));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
        h6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M));
    }

    public final void D0() {
        if (this.S == null) {
            return;
        }
        k0 x10 = k0.x(this.currentAccount);
        this.S.setText(bd.V(null, null, 2131743195, k0.l("Grams", k0.p(x10.v(), false), 2131749515)));
        boolean z10 = this.X;
        EditTextBoldCursor editTextBoldCursor = this.I;
        this.X = z10 | ((editTextBoldCursor == null || TextUtils.isEmpty(editTextBoldCursor.getText())) ? false : true);
        boolean z11 = (!x10.F() || k0.b(x10.t(), this.h)) && this.X;
        if (z11) {
            long j10 = this.f0;
            if (j10 >= 0) {
                this.U.setText(bd.V(null, null, 2131743082, k0.s(j10, false)));
            } else {
                this.U.setText(bd.V(null, null, 2131743082, this.V));
            }
        }
        if (this.W == z11) {
            return;
        }
        this.W = z11;
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        float f10 = z11 ? 1.0f : 0.0f;
        if (!this.U.isAttachedToWindow()) {
            y0(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y, f10);
        this.Z = ofFloat;
        ofFloat.setDuration(320L);
        this.Z.setInterpolator(xq.h);
        this.Z.addUpdateListener(new p3(this, 8));
        this.Z.start();
    }

    public final void E0() {
        if (this.E == null || this.P == null) {
            return;
        }
        final boolean z10 = p0() > 0 || this.Q.getVisibility() == 0;
        if (z10 == this.m0) {
            return;
        }
        this.m0 = z10;
        this.E.setVisibility(0);
        this.P.setVisibility(0);
        final int i3 = 0;
        ViewPropertyAnimator duration = this.E.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.d9
            public final /* synthetic */ m9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.E.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.P.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).start();
        final int i10 = 1;
        this.P.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.d9
            public final /* synthetic */ m9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.E.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.P.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(xqVar).start();
    }

    public final void F0() {
        this.F.d(k0.x(this.currentAccount), this.l0);
    }

    public final void G0() {
        float f10 = this.c0;
        float f11 = 1.0f - f10;
        float max = Math.max(this.d0, Math.max(0.0f, Math.min(1.0f, f10)));
        this.d0 = max;
        float f12 = 1.0f - max;
        l9 l9Var = this.F;
        float f13 = this.c0;
        l9Var.e(f13, max, this.b0 == null && f13 == 1.0f);
        this.F.setTranslationY((((this.x.getHeight() / 2.0f) - this.F.getTop()) - (this.F.getHeight() / 2.0f)) * f11);
        this.O.setAlpha(this.d0);
        this.O.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.y.setAlpha(this.d0);
        this.y.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.a0.setAlpha(this.d0);
        for (int i3 = 0; i3 < this.a0.getChildCount(); i3++) {
            this.a0.getChildAt(i3).setTranslationY(org.telegram.messenger.g0.L(24.0f) * f12);
        }
    }

    @Override // org.telegram.ui.Components.h41
    public final CharSequence a0() {
        return bd.M0(2131743026, null);
    }

    @Override // org.telegram.ui.Components.h41
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        View createView = super.createView(context);
        this.fragmentView = createView;
        final int i3 = 1;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i10, view, getResourceProvider());
        org.telegram.ui.ActionBar.r6.i(i10, this.actionBar, getResourceProvider());
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(1, R.drawable.ic_ab_other);
        a10.setContentDescription(bd.M0(2131754839, null));
        final int i12 = 2;
        a10.e(2, R.drawable.msg_addbot, bd.M0(2131743147, null));
        a10.e(3, R.drawable.menu_comments, bd.M0(2131743215, null));
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 21));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        q8 q8Var = new q8(context, new w8(this, 5), new w8(this, 6), this.resourceProvider);
        this.w = q8Var;
        frameLayout.addView(q8Var, mf.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        q8 q8Var2 = this.w;
        if (q8Var2 != null) {
            q8Var2.a(this.h, this.f);
        }
        gi.y4 y4Var = new gi.y4(this, context);
        this.x = y4Var;
        y4Var.setOrientation(1);
        this.x.setClipChildren(false);
        this.x.setClipToPadding(false);
        frameLayout.addView(this.x, mf.e(-1, -2, 17));
        l9 l9Var = new l9(context, getResourceProvider());
        this.F = l9Var;
        if (l9Var.getDiamondView().f == null) {
            this.d0 = 1.0f;
            this.c0 = 1.0f;
        }
        this.x.addView(this.F, mf.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.F.getEditText();
        this.I = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: org.telegram.ui.Wallet.f9
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i15).toString());
                sb2.append((Object) charSequence.subSequence(i13, i14));
                sb2.append((Object) spanned.subSequence(i16, spanned.length()));
                String sb3 = sb2.toString();
                int i17 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                m9 m9Var = m9.this;
                if (m9Var.l0) {
                    BigDecimal n02 = m9Var.n0();
                    valueOf = valueOf.multiply(n02);
                    i17 = m9.m0(n02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i17) {
                    return spanned.subSequence(i15, i16);
                }
                if (m9.v0(sb3).compareTo(valueOf) > 0) {
                    return spanned.subSequence(i15, i16);
                }
                if (i13 == i14) {
                    return null;
                }
                boolean z10 = false;
                for (int i18 = 0; i18 < sb3.length(); i18++) {
                    char charAt = sb3.charAt(i18);
                    if (charAt == '.' || charAt == ',') {
                        if (z10) {
                            return spanned.subSequence(i15, i16);
                        }
                        z10 = true;
                    }
                }
                if (i15 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
                    return "0" + ((Object) charSequence.subSequence(i13, i14));
                }
                if (sb3.startsWith("00")) {
                    return spanned.subSequence(i15, i16);
                }
                return null;
            }
        }});
        this.I.setImeOptions(33554438);
        this.I.setOnEditorActionListener(new r8(this, i3));
        this.I.addTextChangedListener(new bh.h(this, 28));
        long j10 = this.s;
        if (j10 > 0) {
            l9 l9Var2 = this.F;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            l9Var2.setAmountText((valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros()).toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.I;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.M = new SpannableString("⇅");
        wp wpVar = new wp(R.drawable.wallet_currency_exchange, 0);
        wpVar.x = 0.72f;
        SpannableString spannableString = this.M;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        this.N = new SpannableString("G");
        wp wpVar2 = new wp(R.drawable.wallet_gram_small, 0);
        wpVar2.d = false;
        SpannableString spannableString2 = this.N;
        spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true, true, true);
        this.O = h6Var;
        h6Var.c.m(0.35f, 320L, 3.5f, xq.h);
        this.O.setScaleProperty(0.25f);
        this.O.setText(o0(k0.x(this.currentAccount), 0L));
        org.telegram.ui.Components.h6 h6Var2 = this.O;
        int i13 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i10, i13);
        org.telegram.ui.ActionBar.r6.n(h6Var2, q10.a, q10.b, 4, 0.0f, getResourceProvider());
        this.O.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.O.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        this.O.setGravity(17);
        this.O.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.O.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.08f, getThemedColor(i13));
        org.telegram.ui.Components.h6 h6Var3 = this.O;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(14.0f), r12);
        this.G = d02;
        h6Var3.setSizeableBackground(d02);
        this.x.addView(this.O, mf.t(-2, 28, 49, 0, 8, 0, 0));
        pf.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.v8
            public final /* synthetic */ m9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.u0();
                        break;
                    case 1:
                        m9.e0(this.b);
                        break;
                    case 2:
                        m9 m9Var = this.b;
                        BigDecimal n02 = m9Var.n0();
                        if (m9Var.l0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.l0 = !m9Var.l0;
                            m9Var.F0();
                            String l02 = p02 <= 0 ? "" : m9Var.l0 ? m9Var.l0(p02, n02) : m9.q0(p02);
                            m9Var.F.setAmountText(l02);
                            m9Var.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        m9.d0(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        this.x.addView(frameLayout2, mf.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        this.y.addView(this.E, mf.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.P;
        int i14 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(textView2, i14, getResourceProvider());
        org.telegram.ui.ActionBar.r6.R(this.P, org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i14)), org.telegram.ui.ActionBar.k6.r1(0.25f, getThemedColor(i14)), 14, 14), org.telegram.ui.ActionBar.r6.L(0.1f, i14), org.telegram.ui.ActionBar.r6.L(0.25f, i14), getResourceProvider());
        this.P.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131743147, null));
        spannableStringBuilder.append((CharSequence) " >");
        wp wpVar3 = new wp(R.drawable.settings_arrow, 0);
        float N = org.telegram.messenger.g0.N(0.66f);
        wpVar3.r = 0.0f;
        wpVar3.s = N;
        spannableStringBuilder.setSpan(wpVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.P.setText(spannableStringBuilder);
        this.y.addView(this.P, mf.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        pf.a(this.P);
        final int i15 = 3;
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.v8
            public final /* synthetic */ m9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.b.u0();
                        break;
                    case 1:
                        m9.e0(this.b);
                        break;
                    case 2:
                        m9 m9Var = this.b;
                        BigDecimal n02 = m9Var.n0();
                        if (m9Var.l0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.l0 = !m9Var.l0;
                            m9Var.F0();
                            String l02 = p02 <= 0 ? "" : m9Var.l0 ? m9Var.l0(p02, n02) : m9.q0(p02);
                            m9Var.F.setAmountText(l02);
                            m9Var.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        m9.d0(this.b);
                        break;
                }
            }
        });
        this.E.setVisibility(4);
        this.E.setAlpha(0.0f);
        this.E.setScaleX(0.8f);
        this.E.setScaleY(0.8f);
        this.P.setVisibility(0);
        this.P.setAlpha(1.0f);
        this.P.setScaleX(1.0f);
        this.P.setScaleY(1.0f);
        this.m0 = false;
        this.Q = new TextView(context);
        org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        t4Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = t4Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i16 = org.telegram.ui.ActionBar.k6.Yl;
        paint.setColor(getThemedColor(i16));
        t4Var.w = Integer.valueOf(getThemedColor(i16));
        this.Q.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        this.Q.setBackground(t4Var);
        this.H = t4Var;
        this.Q.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(this.Q, i13, getResourceProvider());
        this.Q.setTypeface(org.telegram.messenger.g0.o());
        this.Q.setEllipsize(TextUtils.TruncateAt.END);
        this.Q.setMaxLines(4);
        if (TextUtils.isEmpty(this.h0)) {
            this.Q.setVisibility(8);
        } else {
            this.Q.setText(this.h0);
            this.Q.setVisibility(0);
        }
        this.E.addView(this.Q, mf.t(-2, -2, 49, 32, 12, 32, 0));
        this.Q.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.v8
            public final /* synthetic */ m9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.b.u0();
                        break;
                    case 1:
                        m9.e0(this.b);
                        break;
                    case 2:
                        m9 m9Var = this.b;
                        BigDecimal n02 = m9Var.n0();
                        if (m9Var.l0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.l0 = !m9Var.l0;
                            m9Var.F0();
                            String l02 = p02 <= 0 ? "" : m9Var.l0 ? m9Var.l0(p02, n02) : m9.q0(p02);
                            m9Var.F.setAmountText(l02);
                            m9Var.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        m9.d0(this.b);
                        break;
                }
            }
        });
        pf.b(this.Q, 0.02f, 1.2f);
        E0();
        s70 s70Var = new s70(context, this.resourceProvider);
        this.R = s70Var;
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
        org.telegram.ui.ActionBar.r6.H(this.R, i14, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.R.setTypeface(org.telegram.messenger.g0.o());
        this.R.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        B0(false);
        this.E.addView(this.R, mf.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        this.a0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        TextView textView3 = new TextView(context);
        this.S = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i13, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.a0.addView(this.S, mf.t(-1, -2, 55, 16, 0, 16, 0));
        this.T = new SpannableString(">");
        wp wpVar4 = new wp(R.drawable.settings_arrow, 0);
        float L = org.telegram.messenger.g0.L(1.0f);
        wpVar4.r = 0.0f;
        wpVar4.s = L;
        SpannableString spannableString3 = this.T;
        spannableString3.setSpan(wpVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(10, context, this);
        this.U = k2Var;
        org.telegram.ui.ActionBar.r6.V(k2Var, i13, getResourceProvider());
        this.U.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        this.U.setVisibility(8);
        this.a0.addView(this.U, mf.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(bd.M0(2131748787, null));
        this.V = spannableString4;
        spannableString4.setSpan(new x70(org.telegram.messenger.g0.L(80.0f), this.U), 0, this.V.length(), 33);
        gi.d dVar = new gi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.e0 = dVar;
        dVar.setText(bd.M0(2131743030, null));
        this.e0.setEnabled(false);
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.v8
            public final /* synthetic */ m9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        this.b.u0();
                        break;
                    case 1:
                        m9.e0(this.b);
                        break;
                    case 2:
                        m9 m9Var = this.b;
                        BigDecimal n02 = m9Var.n0();
                        if (m9Var.l0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.l0 = !m9Var.l0;
                            m9Var.F0();
                            String l02 = p02 <= 0 ? "" : m9Var.l0 ? m9Var.l0(p02, n02) : m9.q0(p02);
                            m9Var.F.setAmountText(l02);
                            m9Var.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        m9.d0(this.b);
                        break;
                }
            }
        });
        this.a0.addView(this.e0, mf.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.a0, mf.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.a4) {
            D0();
            C0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        try {
            ShapeDrawable shapeDrawable = this.G;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.k6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.k6.z6)));
                this.G.invalidateSelf();
                org.telegram.ui.Components.h6 h6Var = this.O;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
            }
            if (this.H != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Yl);
                this.H.c.setColor(themedColor);
                this.H.w = Integer.valueOf(themedColor);
                this.H.invalidateSelf();
                TextView textView = this.Q;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void k0() {
        l9 l9Var = this.F;
        if (l9Var != null) {
            l9Var.getDiamondView().l(null);
        }
        q1.g gVar = this.b0;
        if (gVar != null) {
            gVar.d();
        }
        this.c0 = 1.0f;
        if (this.F != null) {
            G0();
        }
    }

    public final String l0(long j10, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate s02 = s0();
        int max = Math.max(0, Math.min(s02 != null ? s02.exp : TextUtils.equals(k0.x(this.currentAccount).h.g(), "USD") ? 2 : 0, 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int m0 = m0(bigDecimal);
        if (scale.scale() > m0) {
            scale = scale.setScale(m0, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public final BigDecimal n0() {
        f fVar = k0.x(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.i0) hp.s1(this.currentAccount).x7.l.b).a;
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    public final SpannableStringBuilder o0(k0 k0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(k0Var.m(j10, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate s02 = s0();
        z0(spannableStringBuilder, length, length2, (s02 == null || TextUtils.isEmpty(s02.decimalSeparator)) ? '.' : s02.decimalSeparator.charAt(0));
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        l9 l9Var;
        View view2;
        if (!z10 && this.u0 != null && (wallettransaction = this.r0) != null && wallettransaction.localMessageId != 0 && (l9Var = this.F) != null) {
            u6 diamondView = l9Var.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                m6 m6Var = new m6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.u0, this.r0, runnable, null);
                this.v0 = m6Var;
                return m6Var.m;
            }
        }
        if (z10 || this.s0 == null || this.r0 == null || this.F == null || (view = this.fragmentView) == null || !(view.getParent() instanceof View) || getParentLayout() == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        aa aaVar = new aa(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.s0, this.r0, runnable, null);
        this.t0 = aaVar;
        return aaVar.m;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.a4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        this.J = false;
        k0();
        m6 m6Var = this.v0;
        if (m6Var != null) {
            AnimatorSet animatorSet = m6Var.m;
            if (!m6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    m6Var.a(false);
                }
            }
            this.v0 = null;
        }
        aa aaVar = this.t0;
        if (aaVar != null) {
            AnimatorSet animatorSet2 = aaVar.m;
            if (!aaVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    aaVar.b();
                }
            }
            this.t0 = null;
        }
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.K);
        }
        getNotificationCenter().n(this, hs.a4);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.j0 = i12;
        if (this.a0 == null) {
            return;
        }
        int max = Math.max(0, this.k0 - i12);
        this.a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f) + this.j0);
        if (this.w0 != max) {
            this.a0.animate().cancel();
            this.a0.animate().translationY(-max).setDuration(320L).setInterpolator(xq.h).start();
            this.w0 = max;
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.k0 = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        k0();
        this.J = false;
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.K);
            this.fragmentView.requestFocus();
            org.telegram.messenger.g0.v1(this.I);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        t0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            LinearLayout linearLayout = this.a0;
            if (linearLayout == null || themedColor == this.x0 || !(linearLayout.getBackground() instanceof GradientDrawable)) {
                return;
            }
            this.x0 = themedColor;
            ((GradientDrawable) this.a0.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor, themedColor});
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11 || !this.J || (editTextBoldCursor = this.I) == null) {
            return;
        }
        Runnable runnable = this.K;
        editTextBoldCursor.removeCallbacks(runnable);
        this.I.post(runnable);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        l9 l9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (l9Var = this.F) != null && this.c0 < 1.0f) {
            l9Var.getDiamondView().l(new w8(this, 1));
        }
        if (!z10 || z11 || (editTextBoldCursor = this.I) == null) {
            return;
        }
        Runnable runnable = this.K;
        editTextBoldCursor.removeCallbacks(runnable);
        if (this.s > 0) {
            EditTextBoldCursor editTextBoldCursor2 = this.I;
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
        } else {
            this.J = true;
            this.I.requestFocus();
            this.I.post(runnable);
        }
    }

    public final long p0() {
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor == null) {
            return 0L;
        }
        BigDecimal v02 = v0(editTextBoldCursor.getText().toString());
        if (this.l0) {
            BigDecimal n02 = n0();
            if (n02.signum() <= 0) {
                return 0L;
            }
            v02 = v02.divide(n02, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = v02.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    public final byte[] r0() {
        TL_wallet.walletUserAddress walletuseraddress = this.e;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr = this.e.public_key;
            if (i3 >= bArr.length) {
                return null;
            }
            if (bArr[i3] != 0) {
                return bArr;
            }
            i3++;
        }
    }

    public final TL_wallet.currencyRate s0() {
        f fVar = k0.x(this.currentAccount).h;
        TL_wallet.currencyRates f10 = fVar.f();
        if (f10 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f10.rates;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i3);
            i3++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, fVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    public final void t0() {
        if (WalletEngine2.isValidRecipientAddress(this.h)) {
            this.f0 = -1L;
            D0();
            k0 x10 = k0.x(this.currentAccount);
            if (!x10.F() || k0.b(x10.t(), this.h) || this.f == null || !TextUtils.isEmpty(this.n)) {
                x10.i(this.h, 0L, this.h0, this.i0 ? r0() : null, new y8(this, 1));
            }
        }
    }

    public final void u0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        boolean z10 = this.k0 - this.j0 > org.telegram.messenger.g0.L(20.0f);
        AlertDialog$Builder u1Var = z10 ? new org.telegram.ui.ActionBar.u1(0, parentActivity, getResourceProvider()) : new AlertDialog$Builder(0, parentActivity, getResourceProvider());
        String M0 = bd.M0(2131743215, null);
        org.telegram.ui.ActionBar.s1 s1Var = u1Var.a;
        s1Var.S = M0;
        final lg.y0 y0Var = new lg.y0(this, parentActivity);
        y0Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(y0Var, org.telegram.ui.ActionBar.k6.j5, getResourceProvider());
        org.telegram.ui.ActionBar.r6.E(y0Var, org.telegram.ui.ActionBar.k6.t5, getResourceProvider());
        y0Var.setHint(bd.M0(2131743179, null));
        y0Var.setText(this.h0);
        y0Var.setSelection(y0Var.length());
        y0Var.setInputType(147457);
        y0Var.setMaxLines(5);
        int i3 = 6;
        y0Var.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.G(y0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, getResourceProvider());
        y0Var.setBackground(null);
        y0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, getResourceProvider());
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, this.resourceProvider), 7, org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        c2Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, e6Var);
        c2Var.e(bd.M0(2131743087, null), "", !this.i0 || r0() == null, false, false);
        c2Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.gravity = (bd.a0 ? 5 : 3) | 16;
        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
        c2Var.setPadding(bd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), bd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        c2Var.setEnabled(r0() != null);
        c2Var.setOnClickListener(new h3(c2Var, i3));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.addView(y0Var, mf.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        linearLayout.addView(c2Var, mf.t(-1, -2, 83, 8, 0, 8, 0));
        s1Var.H = 6;
        u1Var.o(linearLayout);
        s1Var.a = org.telegram.messenger.g0.L(292.0f);
        u1Var.h(bd.M0(2131752589, null), new u70(19));
        int i11 = 2;
        u1Var.k(bd.M0(2131754486, null), new i8(this, y0Var, c2Var, i11));
        s1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Wallet.z8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                lg.y0 y0Var2 = lg.y0.this;
                y0Var2.requestFocus();
                org.telegram.messenger.g0.K3(y0Var2);
            }
        });
        s1Var.setOnDismissListener(new k2(this, i11));
        if (z10) {
            s1Var.r(250L);
        } else {
            s1Var.show();
        }
        s1Var.k0 = false;
        View d = s1Var.d(-1);
        if (!(d instanceof TextView) || TextUtils.isEmpty(this.h0)) {
            return;
        }
        y0Var.addTextChangedListener(new ai.w3(y0Var, (TextView) d));
    }

    public final void w0() {
        org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || k2.p1.h(1, arrayList) != this) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
            if (d2Var instanceof w9) {
                ((ActionBarLayout) parentLayout).d0(d2Var, false);
            }
        }
        List fragmentStack = parentLayout.getFragmentStack();
        if (fragmentStack.size() >= 2 && (t4.c.d(2, fragmentStack) instanceof w5) && ((org.telegram.ui.ActionBar.d2) t4.c.d(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
            this.s0 = (w5) t4.c.d(2, fragmentStack);
        } else {
            w5 w5Var = new w5();
            w5Var.setCurrentAccount(this.currentAccount);
            if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, w5Var)) {
                this.s0 = w5Var;
            }
        }
        finishFragment();
    }

    public final void x0() {
        this.g0 = true;
    }

    public final void y0(float f10) {
        this.Y = f10;
        this.U.setAlpha(f10);
        this.U.setVisibility(f10 > 0.0f ? 0 : 8);
        ((LinearLayout.LayoutParams) this.U.getLayoutParams()).topMargin = Math.round(org.telegram.messenger.g0.L(4.0f) * f10);
        this.U.requestLayout();
    }

    public m9(String str) {
        this(h10.t0, str);
    }

    public m9(int i3, String str) {
        this.s = 0L;
        this.K = new w8(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.x8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                m9 m9Var = m9.this;
                Runnable runnable = m9Var.K;
                if (z10 && m9Var.J && (editTextBoldCursor = m9Var.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    m9Var.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        setCurrentAccount(i3);
        this.f = null;
        this.h = str;
        t0();
        this.r = true;
        k0.x(this.currentAccount).Z(new y8(this, 0), str);
    }

    @Override // org.telegram.ui.Components.h41
    public final void Z(ArrayList arrayList, f41 f41Var) {
    }

    @Override // org.telegram.ui.Components.h41
    public final void b0(r31 r31Var, View view) {
    }
}
