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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.go0;
import org.telegram.ui.nt0;
import org.telegram.ui.tb0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class m9 extends n41 implements ls {
    public LinearLayout D;
    public l9 E;
    public ShapeDrawable F;
    public org.telegram.ui.ActionBar.t4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public final Runnable J;
    public final ViewTreeObserver.OnWindowFocusChangeListener K;
    public SpannableString L;
    public SpannableString M;
    public org.telegram.ui.Components.j6 N;
    public TextView O;
    public TextView P;
    public w70 Q;
    public TextView R;
    public SpannableString S;
    public org.telegram.ui.ActionBar.m2 T;
    public SpannableString U;
    public boolean V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public LinearLayout Z;
    public r1.g a0;
    public float b0;
    public float c0;
    public fi.d d0;
    public TL_wallet.walletUserAddress e;
    public long e0;
    public TLRPC.User f;
    public boolean f0;
    public String g0;
    public String h;
    public boolean h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public DecimalFormat m0;
    public String n;
    public DecimalFormat n0;
    public int o0;
    public boolean p0;
    public TL_wallet.walletTransaction q0;
    public boolean r;
    public x5 r0;
    public long s;
    public aa s0;
    public an t0;
    public n6 u0;
    public int v0;
    public q8 w;
    public int w0;
    public fi.a5 x;
    public FrameLayout y;

    public m9(TLRPC.User user) {
        this.s = 0L;
        this.J = new w8(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.x8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z9) {
                EditTextBoldCursor editTextBoldCursor;
                m9 m9Var = m9.this;
                Runnable runnable = m9Var.J;
                if (z9 && m9Var.I && (editTextBoldCursor = m9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    m9Var.H.post(runnable);
                }
            }
        };
        this.e0 = -1L;
        this.h0 = true;
        this.o0 = 6;
        this.f = user;
        this.h = null;
        this.r = true;
        m0.x(this.currentAccount).a0(user, new y8(this, 2));
    }

    public static void d0(m9 m9Var) {
        x5.J0(m9Var.currentAccount, m9Var.getParentActivity(), m9Var.getResourceProvider());
    }

    public static void e0(final m9 m9Var) {
        fi.d dVar = m9Var.d0;
        if (!dVar.c0 || dVar.Q) {
            return;
        }
        final m0 x10 = m0.x(m9Var.currentAccount);
        long p02 = m9Var.p0();
        long v = x10.v();
        if (m9Var.r || !WalletEngine2.isValidRecipientAddress(m9Var.h) || p02 <= 0) {
            return;
        }
        long j3 = ((org.telegram.messenger.l0) qp.s1(m9Var.currentAccount).x7.l0.b).c;
        if (p02 < j3) {
            String l02 = m9Var.k0 ? m9Var.l0(j3, m9Var.n0()) : q0(j3);
            m9Var.E.setAmountText(l02);
            m9Var.H.setSelection(l02.length());
            EditTextBoldCursor editTextBoldCursor = m9Var.H;
            int i7 = -m9Var.o0;
            m9Var.o0 = i7;
            org.telegram.messenger.g0.G3(i7, editTextBoldCursor, null);
            return;
        }
        if (p02 > v) {
            org.telegram.messenger.p2.D.a();
            w70 w70Var = m9Var.Q;
            int i10 = -m9Var.o0;
            m9Var.o0 = i10;
            org.telegram.messenger.g0.G3(i10, w70Var, null);
            return;
        }
        long j10 = m9Var.e0;
        if (j10 >= 0 && p02 + j10 > v) {
            p02 -= j10;
        }
        m9Var.I = false;
        EditTextBoldCursor editTextBoldCursor2 = m9Var.H;
        if (editTextBoldCursor2 != null) {
            editTextBoldCursor2.removeCallbacks(m9Var.J);
            m9Var.fragmentView.requestFocus();
            org.telegram.messenger.g0.v1(m9Var.H);
        }
        m9Var.d0.setLoading(true);
        m9Var.q0 = null;
        if (m9Var.f != null && TextUtils.isEmpty(m9Var.n)) {
            m9Var.p0 = true;
            x10.d0(m9Var.f, m9Var.h, p02, m9Var.g0, m9Var.h0 ? m9Var.r0() : null, null, null, new a9(m9Var, 0), new a9(m9Var, 1), null);
            return;
        }
        final String str = m9Var.g0;
        byte[] r02 = m9Var.h0 ? m9Var.r0() : null;
        boolean z9 = r02 != null;
        if (!x10.F()) {
            final long j11 = p02;
            final boolean z10 = z9;
            x10.i(m9Var.h, j11, str, r02, new v10() { // from class: org.telegram.ui.Wallet.c9
                @Override // org.telegram.messenger.v10
                public final void a(Object obj, Object obj2) {
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = (String) obj2;
                    m9 m9Var2 = m9.this;
                    if (str2 != null) {
                        m9Var2.d0.setLoading(false);
                        hc.a0(m9Var2).e0(str2, false);
                        return;
                    }
                    wallettransaction.peer = m0.g(m9Var2.f, m9Var2.h, m9Var2.n);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z10;
                    wallettransaction.date = m9Var2.getConnectionsManager().getCurrentTime();
                    org.telegram.messenger.g0.v1(m9Var2.H);
                    x5.G0(m9Var2.getParentActivity(), m9Var2.getCurrentAccount(), wallettransaction, new b9(m9Var2, x10, j11, 1), new y8(m9Var2, 4), m9Var2.r0(), null, m9Var2.getResourceProvider());
                    org.telegram.messenger.g0.i3(new w8(m9Var2, 3), 1000L);
                }
            });
            return;
        }
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        wallettransaction.peer = m0.g(m9Var.f, m9Var.h, m9Var.n);
        wallettransaction.comment = str;
        wallettransaction.comment_encrypted = z9;
        wallettransaction.date = m9Var.getConnectionsManager().getCurrentTime();
        wallettransaction.fee = Math.max(0L, m9Var.e0);
        wallettransaction.gasless = true;
        wallettransaction.amount = p02;
        org.telegram.messenger.g0.v1(m9Var.H);
        x5.G0(m9Var.getParentActivity(), m9Var.getCurrentAccount(), wallettransaction, new b9(m9Var, x10, p02, 0), new y8(m9Var, 3), m9Var.r0(), null, m9Var.getResourceProvider());
        org.telegram.messenger.g0.i3(new w8(m9Var, 2), 1000L);
    }

    public static void f0(m9 m9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            m9Var.p0 = false;
            m9Var.d0.setLoading(false);
            return;
        }
        if (str != null) {
            m9Var.p0 = false;
            m9Var.d0.setLoading(false);
            hc.a0(m9Var).e0(str, false);
            return;
        }
        if (!m9Var.f0) {
            m9Var.w0();
            return;
        }
        org.telegram.ui.ActionBar.q4 parentLayout = m9Var.getParentLayout();
        if (parentLayout == null) {
            m9Var.finishFragment();
            return;
        }
        long j3 = m9Var.f.id;
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || jg.g.i(1, arrayList) != m9Var) {
            return;
        }
        int size = arrayList.size() - 2;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) arrayList.get(size);
            if ((f2Var instanceof an) && f2Var.getCurrentAccount() == m9Var.currentAccount) {
                an anVar = (an) f2Var;
                if (anVar.a() == j3 && anVar.f4 == 0) {
                    m9Var.t0 = anVar;
                    for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                        ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.f2) arrayList.get(size2), false);
                    }
                }
            }
            size--;
        }
        if (m9Var.t0 == null) {
            m9Var.getNotificationCenter().k(qs.v, Long.valueOf(j3), Boolean.FALSE);
            an ra2 = an.ra(j3);
            ra2.setCurrentAccount(m9Var.currentAccount);
            if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ra2)) {
                m9Var.finishFragment();
                return;
            }
            m9Var.t0 = ra2;
        }
        m9Var.finishFragment();
    }

    public static void g0(m9 m9Var, TL_wallet.walletUserAddress walletuseraddress) {
        m9Var.r = false;
        m9Var.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            m9Var.f = qp.s1(m9Var.currentAccount).a2(Long.valueOf(walletuseraddress.user_id));
        }
        fi.w3 w3Var = m9Var.a;
        if (w3Var != null) {
            w3Var.f3.O(true);
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
        int i7 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i7++;
        }
        return i7;
    }

    public static String q0(long j3) {
        BigDecimal scale = BigDecimal.valueOf(j3).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
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

    public static void z0(SpannableStringBuilder spannableStringBuilder, int i7, int i10, char c10) {
        int i11 = i7 + 1;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i10) {
                return;
            }
            if (spannableStringBuilder.charAt(i11) == c10 && Character.isDigit(spannableStringBuilder.charAt(i11 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i12))) {
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
            kVar.setTitle(id.M0(2131743019, null));
        }
    }

    public final void B0(boolean z9) {
        if (z9) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) id.M0(2131743087, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) id.M0(2131743140, null));
            spannableStringBuilder.append((CharSequence) " >");
            wp wpVar = new wp(R.drawable.settings_arrow, 0);
            float N = org.telegram.messenger.g0.N(0.66f);
            wpVar.r = 0.0f;
            wpVar.s = N;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new fi.ka(this, 9), length, spannableStringBuilder.length(), 33);
            this.Q.setText(spannableStringBuilder);
        }
        this.Q.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.6f).scaleY(z9 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(xq.h).start();
    }

    public final void C0() {
        E0();
        if (this.H == null || this.d0 == null) {
            return;
        }
        m0 x10 = m0.x(this.currentAccount);
        long v = x10.v();
        long p02 = p0();
        long j3 = ((org.telegram.messenger.l0) qp.s1(this.currentAccount).x7.l0.b).c;
        if (p02 > 0 && p02 < j3) {
            String l02 = this.k0 ? l0(j3, n0()) : q0(j3);
            this.E.setAmountText(l02);
            this.H.setSelection(l02.length());
            EditTextBoldCursor editTextBoldCursor = this.H;
            int i7 = -this.o0;
            this.o0 = i7;
            org.telegram.messenger.g0.G3(i7, editTextBoldCursor, null);
            return;
        }
        boolean z9 = WalletEngine2.isValidRecipientAddress(this.h) && !this.r && p02 > 0 && p02 <= v;
        B0(!TextUtils.isEmpty(this.H.getText()) && p02 > v);
        long p03 = p0();
        if (this.m0 == null) {
            this.m0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        String format = p03 > 0 ? this.m0.format(BigDecimal.valueOf(p03, 9)) : "";
        this.d0.setLoading(this.r || this.p0);
        this.d0.i(TextUtils.isEmpty(format) ? id.M0(2131743023, null) : id.V(null, null, 2131743024, m0.l("Grams", format, 2131749508)), true, true);
        this.d0.setEnabled(z9);
        D0();
        F0();
        if (!this.k0) {
            this.N.setText(o0(x10, p02));
            return;
        }
        org.telegram.ui.Components.j6 j6Var = this.N;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.M).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        if (this.n0 == null) {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
            this.n0 = decimalFormat;
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        }
        spannableStringBuilder.append((CharSequence) this.n0.format(BigDecimal.valueOf(p02).movePointLeft(9)));
        z0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) id.M0(2131749517, null));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
        j6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L));
    }

    public final void D0() {
        if (this.R == null) {
            return;
        }
        m0 x10 = m0.x(this.currentAccount);
        this.R.setText(id.V(null, null, 2131743188, m0.l("Grams", m0.p(x10.v(), false), 2131749508)));
        boolean z9 = this.W;
        EditTextBoldCursor editTextBoldCursor = this.H;
        this.W = z9 | ((editTextBoldCursor == null || TextUtils.isEmpty(editTextBoldCursor.getText())) ? false : true);
        boolean z10 = (!x10.F() || m0.b(x10.t(), this.h)) && this.W;
        if (z10) {
            long j3 = this.e0;
            if (j3 >= 0) {
                this.T.setText(id.V(null, null, 2131743075, m0.s(j3, false)));
            } else {
                this.T.setText(id.V(null, null, 2131743075, this.U));
            }
        }
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        float f10 = z10 ? 1.0f : 0.0f;
        if (!this.T.isAttachedToWindow()) {
            y0(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X, f10);
        this.Y = ofFloat;
        ofFloat.setDuration(320L);
        this.Y.setInterpolator(xq.h);
        this.Y.addUpdateListener(new q3(this, 8));
        this.Y.start();
    }

    public final void E0() {
        if (this.D == null || this.O == null) {
            return;
        }
        final boolean z9 = p0() > 0 || this.P.getVisibility() == 0;
        if (z9 == this.l0) {
            return;
        }
        this.l0 = z9;
        this.D.setVisibility(0);
        this.O.setVisibility(0);
        final int i7 = 0;
        ViewPropertyAnimator duration = this.D.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.8f).scaleY(z9 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.d9
            public final /* synthetic */ m9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.D.setVisibility(z9 ? 0 : 4);
                        break;
                    default:
                        this.b.O.setVisibility(!z9 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).start();
        final int i10 = 1;
        this.O.animate().alpha(z9 ? 0.0f : 1.0f).scaleX(!z9 ? 1.0f : 0.8f).scaleY(z9 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.d9
            public final /* synthetic */ m9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.D.setVisibility(z9 ? 0 : 4);
                        break;
                    default:
                        this.b.O.setVisibility(!z9 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(xqVar).start();
    }

    public final void F0() {
        this.E.d(m0.x(this.currentAccount), this.k0);
    }

    public final void G0() {
        float f10 = this.b0;
        float f11 = 1.0f - f10;
        float max = Math.max(this.c0, Math.max(0.0f, Math.min(1.0f, f10)));
        this.c0 = max;
        float f12 = 1.0f - max;
        l9 l9Var = this.E;
        float f13 = this.b0;
        l9Var.e(f13, max, this.a0 == null && f13 == 1.0f);
        this.E.setTranslationY((((this.x.getHeight() / 2.0f) - this.E.getTop()) - (this.E.getHeight() / 2.0f)) * f11);
        this.N.setAlpha(this.c0);
        this.N.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.y.setAlpha(this.c0);
        this.y.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.Z.setAlpha(this.c0);
        for (int i7 = 0; i7 < this.Z.getChildCount(); i7++) {
            this.Z.getChildAt(i7).setTranslationY(org.telegram.messenger.g0.L(24.0f) * f12);
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final CharSequence a0() {
        return id.M0(2131743019, null);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.n41, org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        View createView = super.createView(context);
        this.fragmentView = createView;
        final int i7 = 1;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i10, view, getResourceProvider());
        org.telegram.ui.ActionBar.r6.i(i10, this.actionBar, getResourceProvider());
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(1, R.drawable.ic_ab_other);
        a10.setContentDescription(id.M0(2131754839, null));
        final int i12 = 2;
        a10.e(2, R.drawable.msg_addbot, id.M0(2131743140, null));
        a10.e(3, R.drawable.menu_comments, id.M0(2131743208, null));
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 20));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        q8 q8Var = new q8(context, new w8(this, 5), new w8(this, 6), this.resourceProvider);
        this.w = q8Var;
        frameLayout.addView(q8Var, c8.ha.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        q8 q8Var2 = this.w;
        if (q8Var2 != null) {
            q8Var2.a(this.h, this.f);
        }
        fi.a5 a5Var = new fi.a5(this, context);
        this.x = a5Var;
        a5Var.setOrientation(1);
        this.x.setClipChildren(false);
        this.x.setClipToPadding(false);
        frameLayout.addView(this.x, c8.ha.e(-1, -2, 17));
        l9 l9Var = new l9(context, getResourceProvider());
        this.E = l9Var;
        if (l9Var.getDiamondView().f == null) {
            this.c0 = 1.0f;
            this.b0 = 1.0f;
        }
        this.x.addView(this.E, c8.ha.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.E.getEditText();
        this.H = editText;
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
                if (m9Var.k0) {
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
                boolean z9 = false;
                for (int i18 = 0; i18 < sb3.length(); i18++) {
                    char charAt = sb3.charAt(i18);
                    if (charAt == '.' || charAt == ',') {
                        if (z9) {
                            return spanned.subSequence(i15, i16);
                        }
                        z9 = true;
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
        this.H.setImeOptions(33554438);
        this.H.setOnEditorActionListener(new r8(this, i7));
        this.H.addTextChangedListener(new ah.j(this, 28));
        long j3 = this.s;
        if (j3 > 0) {
            l9 l9Var2 = this.E;
            BigDecimal valueOf = BigDecimal.valueOf(j3, 9);
            l9Var2.setAmountText((valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros()).toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.H;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.L = new SpannableString("⇅");
        wp wpVar = new wp(R.drawable.wallet_currency_exchange, 0);
        wpVar.x = 0.72f;
        SpannableString spannableString = this.L;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        this.M = new SpannableString("G");
        wp wpVar2 = new wp(R.drawable.wallet_gram_small, 0);
        wpVar2.d = false;
        SpannableString spannableString2 = this.M;
        spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true, true, true);
        this.N = j6Var;
        j6Var.c.m(0.35f, 320L, 3.5f, xq.h);
        this.N.setScaleProperty(0.25f);
        this.N.setText(o0(m0.x(this.currentAccount), 0L));
        org.telegram.ui.Components.j6 j6Var2 = this.N;
        int i13 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i10, i13);
        org.telegram.ui.ActionBar.r6.n(j6Var2, q10.a, q10.b, 4, 0.0f, getResourceProvider());
        this.N.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.N.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        this.N.setGravity(17);
        this.N.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.N.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.08f, getThemedColor(i13));
        org.telegram.ui.Components.j6 j6Var3 = this.N;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(14.0f), r12);
        this.F = d02;
        j6Var3.setSizeableBackground(d02);
        this.x.addView(this.N, c8.ha.t(-2, 28, 49, 0, 8, 0, 0));
        c8.ka.a(this.N);
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.v8
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
                        if (m9Var.k0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.k0 = !m9Var.k0;
                            m9Var.F0();
                            String l02 = p02 <= 0 ? "" : m9Var.k0 ? m9Var.l0(p02, n02) : m9.q0(p02);
                            m9Var.E.setAmountText(l02);
                            m9Var.H.setSelection(l02.length());
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
        this.x.addView(frameLayout2, c8.ha.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        linearLayout.setOrientation(1);
        this.y.addView(this.D, c8.ha.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.O;
        int i14 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(textView2, i14, getResourceProvider());
        org.telegram.ui.ActionBar.r6.R(this.O, org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i14)), org.telegram.ui.ActionBar.k6.r1(0.25f, getThemedColor(i14)), 14, 14), org.telegram.ui.ActionBar.r6.L(0.1f, i14), org.telegram.ui.ActionBar.r6.L(0.25f, i14), getResourceProvider());
        this.O.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.O.setGravity(17);
        this.O.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131743140, null));
        spannableStringBuilder.append((CharSequence) " >");
        wp wpVar3 = new wp(R.drawable.settings_arrow, 0);
        float N = org.telegram.messenger.g0.N(0.66f);
        wpVar3.r = 0.0f;
        wpVar3.s = N;
        spannableStringBuilder.setSpan(wpVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        this.y.addView(this.O, c8.ha.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        c8.ka.a(this.O);
        final int i15 = 3;
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.v8
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
                        if (m9Var.k0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.k0 = !m9Var.k0;
                            m9Var.F0();
                            String l02 = p02 <= 0 ? "" : m9Var.k0 ? m9Var.l0(p02, n02) : m9.q0(p02);
                            m9Var.E.setAmountText(l02);
                            m9Var.H.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        m9.d0(this.b);
                        break;
                }
            }
        });
        this.D.setVisibility(4);
        this.D.setAlpha(0.0f);
        this.D.setScaleX(0.8f);
        this.D.setScaleY(0.8f);
        this.O.setVisibility(0);
        this.O.setAlpha(1.0f);
        this.O.setScaleX(1.0f);
        this.O.setScaleY(1.0f);
        this.l0 = false;
        this.P = new TextView(context);
        org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        t4Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = t4Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i16 = org.telegram.ui.ActionBar.k6.Yl;
        paint.setColor(getThemedColor(i16));
        t4Var.w = Integer.valueOf(getThemedColor(i16));
        this.P.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        this.P.setBackground(t4Var);
        this.G = t4Var;
        this.P.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(this.P, i13, getResourceProvider());
        this.P.setTypeface(org.telegram.messenger.g0.o());
        this.P.setEllipsize(TextUtils.TruncateAt.END);
        this.P.setMaxLines(4);
        if (TextUtils.isEmpty(this.g0)) {
            this.P.setVisibility(8);
        } else {
            this.P.setText(this.g0);
            this.P.setVisibility(0);
        }
        this.D.addView(this.P, c8.ha.t(-2, -2, 49, 32, 12, 32, 0));
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.v8
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
                        if (m9Var.k0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.k0 = !m9Var.k0;
                            m9Var.F0();
                            String l02 = p02 <= 0 ? "" : m9Var.k0 ? m9Var.l0(p02, n02) : m9.q0(p02);
                            m9Var.E.setAmountText(l02);
                            m9Var.H.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        m9.d0(this.b);
                        break;
                }
            }
        });
        c8.ka.b(this.P, 0.02f, 1.2f);
        E0();
        w70 w70Var = new w70(context, this.resourceProvider);
        this.Q = w70Var;
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
        org.telegram.ui.ActionBar.r6.H(this.Q, i14, getResourceProvider());
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setTypeface(org.telegram.messenger.g0.o());
        this.Q.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        B0(false);
        this.D.addView(this.Q, c8.ha.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Z = linearLayout2;
        linearLayout2.setOrientation(1);
        this.Z.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        this.Z.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        TextView textView3 = new TextView(context);
        this.R = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i13, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.Z.addView(this.R, c8.ha.t(-1, -2, 55, 16, 0, 16, 0));
        this.S = new SpannableString(">");
        wp wpVar4 = new wp(R.drawable.settings_arrow, 0);
        float L = org.telegram.messenger.g0.L(1.0f);
        wpVar4.r = 0.0f;
        wpVar4.s = L;
        SpannableString spannableString3 = this.S;
        spannableString3.setSpan(wpVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(10, context, this);
        this.T = m2Var;
        org.telegram.ui.ActionBar.r6.V(m2Var, i13, getResourceProvider());
        this.T.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        this.T.setVisibility(8);
        this.Z.addView(this.T, c8.ha.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(id.M0(2131748780, null));
        this.U = spannableString4;
        spannableString4.setSpan(new b80(org.telegram.messenger.g0.L(80.0f), this.T), 0, this.U.length(), 33);
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.d0 = dVar;
        dVar.setText(id.M0(2131743023, null));
        this.d0.setEnabled(false);
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.v8
            public final /* synthetic */ m9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        this.b.u0();
                        break;
                    case 1:
                        m9.e0(this.b);
                        break;
                    case 2:
                        m9 m9Var = this.b;
                        BigDecimal n02 = m9Var.n0();
                        if (m9Var.k0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.k0 = !m9Var.k0;
                            m9Var.F0();
                            String l02 = p02 <= 0 ? "" : m9Var.k0 ? m9Var.l0(p02, n02) : m9.q0(p02);
                            m9Var.E.setAmountText(l02);
                            m9Var.H.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        m9.d0(this.b);
                        break;
                }
            }
        });
        this.Z.addView(this.d0, c8.ha.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.Z, c8.ha.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.a4) {
            D0();
            C0();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        try {
            ShapeDrawable shapeDrawable = this.F;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.k6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.k6.z6)));
                this.F.invalidateSelf();
                org.telegram.ui.Components.j6 j6Var = this.N;
                if (j6Var != null) {
                    j6Var.invalidate();
                }
            }
            if (this.G != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Yl);
                this.G.c.setColor(themedColor);
                this.G.w = Integer.valueOf(themedColor);
                this.G.invalidateSelf();
                TextView textView = this.P;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void k0() {
        l9 l9Var = this.E;
        if (l9Var != null) {
            l9Var.getDiamondView().l(null);
        }
        r1.g gVar = this.a0;
        if (gVar != null) {
            gVar.d();
        }
        this.b0 = 1.0f;
        if (this.E != null) {
            G0();
        }
    }

    public final String l0(long j3, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate s02 = s0();
        int max = Math.max(0, Math.min(s02 != null ? s02.exp : TextUtils.equals(m0.x(this.currentAccount).h.g(), "USD") ? 2 : 0, 20));
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
        f fVar = m0.x(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.i0) qp.s1(this.currentAccount).x7.l.b).a;
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    public final SpannableStringBuilder o0(m0 m0Var, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(m0Var.m(j3, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate s02 = s0();
        z0(spannableStringBuilder, length, length2, (s02 == null || TextUtils.isEmpty(s02.decimalSeparator)) ? '.' : s02.decimalSeparator.charAt(0));
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        l9 l9Var;
        View view2;
        if (!z9 && this.t0 != null && (wallettransaction = this.q0) != null && wallettransaction.localMessageId != 0 && (l9Var = this.E) != null) {
            v6 diamondView = l9Var.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                n6 n6Var = new n6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.t0, this.q0, runnable, null);
                this.u0 = n6Var;
                return n6Var.m;
            }
        }
        if (z9 || this.r0 == null || this.q0 == null || this.E == null || (view = this.fragmentView) == null || !(view.getParent() instanceof View) || getParentLayout() == null) {
            return super.onCustomTransitionAnimation(z9, runnable);
        }
        aa aaVar = new aa(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.r0, this.q0, runnable, null);
        this.s0 = aaVar;
        return aaVar.m;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.a4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        this.I = false;
        k0();
        n6 n6Var = this.u0;
        if (n6Var != null) {
            AnimatorSet animatorSet = n6Var.m;
            if (!n6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    n6Var.a(false);
                }
            }
            this.u0 = null;
        }
        aa aaVar = this.s0;
        if (aaVar != null) {
            AnimatorSet animatorSet2 = aaVar.m;
            if (!aaVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    aaVar.b();
                }
            }
            this.s0 = null;
        }
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.J);
        }
        getNotificationCenter().n(this, qs.a4);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.i0 = i12;
        if (this.Z == null) {
            return;
        }
        int max = Math.max(0, this.j0 - i12);
        this.Z.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f) + this.i0);
        if (this.v0 != max) {
            this.Z.animate().cancel();
            this.Z.animate().translationY(-max).setDuration(320L).setInterpolator(xq.h).start();
            this.v0 = max;
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.j0 = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        k0();
        this.I = false;
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.J);
            this.fragmentView.requestFocus();
            org.telegram.messenger.g0.v1(this.H);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        t0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.d6);
            LinearLayout linearLayout = this.Z;
            if (linearLayout == null || themedColor == this.w0 || !(linearLayout.getBackground() instanceof GradientDrawable)) {
                return;
            }
            this.w0 = themedColor;
            ((GradientDrawable) this.Z.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor, themedColor});
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 || z10 || !this.I || (editTextBoldCursor = this.H) == null) {
            return;
        }
        Runnable runnable = this.J;
        editTextBoldCursor.removeCallbacks(runnable);
        this.H.post(runnable);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        EditTextBoldCursor editTextBoldCursor;
        l9 l9Var;
        super.onTransitionAnimationStart(z9, z10);
        if (z9 && !z10 && (l9Var = this.E) != null && this.b0 < 1.0f) {
            l9Var.getDiamondView().l(new w8(this, 1));
        }
        if (!z9 || z10 || (editTextBoldCursor = this.H) == null) {
            return;
        }
        Runnable runnable = this.J;
        editTextBoldCursor.removeCallbacks(runnable);
        if (this.s > 0) {
            EditTextBoldCursor editTextBoldCursor2 = this.H;
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
        } else {
            this.I = true;
            this.H.requestFocus();
            this.H.post(runnable);
        }
    }

    public final long p0() {
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor == null) {
            return 0L;
        }
        BigDecimal v02 = v0(editTextBoldCursor.getText().toString());
        if (this.k0) {
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
        int i7 = 0;
        while (true) {
            byte[] bArr = this.e.public_key;
            if (i7 >= bArr.length) {
                return null;
            }
            if (bArr[i7] != 0) {
                return bArr;
            }
            i7++;
        }
    }

    public final TL_wallet.currencyRate s0() {
        f fVar = m0.x(this.currentAccount).h;
        TL_wallet.currencyRates f10 = fVar.f();
        if (f10 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f10.rates;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i7);
            i7++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, fVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    public final void t0() {
        if (WalletEngine2.isValidRecipientAddress(this.h)) {
            this.e0 = -1L;
            D0();
            m0 x10 = m0.x(this.currentAccount);
            if (!x10.F() || m0.b(x10.t(), this.h) || this.f == null || !TextUtils.isEmpty(this.n)) {
                x10.i(this.h, 0L, this.g0, this.h0 ? r0() : null, new y8(this, 1));
            }
        }
    }

    public final void u0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        boolean z9 = this.j0 - this.i0 > org.telegram.messenger.g0.L(20.0f);
        AlertDialog$Builder w1Var = z9 ? new org.telegram.ui.ActionBar.w1(0, parentActivity, getResourceProvider()) : new AlertDialog$Builder(0, parentActivity, getResourceProvider());
        String M0 = id.M0(2131743208, null);
        org.telegram.ui.ActionBar.u1 u1Var = w1Var.a;
        u1Var.R = M0;
        final kg.x0 x0Var = new kg.x0(this, parentActivity);
        x0Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(x0Var, org.telegram.ui.ActionBar.k6.j5, getResourceProvider());
        org.telegram.ui.ActionBar.r6.E(x0Var, org.telegram.ui.ActionBar.k6.t5, getResourceProvider());
        x0Var.setHint(id.M0(2131743172, null));
        x0Var.setText(this.g0);
        x0Var.setSelection(x0Var.length());
        x0Var.setInputType(147457);
        x0Var.setMaxLines(5);
        int i7 = 6;
        x0Var.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.G(x0Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, getResourceProvider());
        x0Var.setBackground(null);
        x0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, getResourceProvider());
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, this.resourceProvider), 7, org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        c2Var.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, f6Var);
        c2Var.e(id.M0(2131743080, null), "", !this.h0 || r0() == null, false, false);
        c2Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.gravity = (id.a0 ? 5 : 3) | 16;
        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
        c2Var.setPadding(id.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), id.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        c2Var.setEnabled(r0() != null);
        c2Var.setOnClickListener(new i3(c2Var, i7));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.addView(x0Var, c8.ha.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        linearLayout.addView(c2Var, c8.ha.t(-1, -2, 83, 8, 0, 8, 0));
        u1Var.G = 6;
        w1Var.o(linearLayout);
        u1Var.a = org.telegram.messenger.g0.L(292.0f);
        w1Var.h(id.M0(2131752589, null), new go0(14));
        int i11 = 2;
        w1Var.k(id.M0(2131754486, null), new i8(this, x0Var, c2Var, i11));
        u1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Wallet.z8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                kg.x0 x0Var2 = kg.x0.this;
                x0Var2.requestFocus();
                org.telegram.messenger.g0.K3(x0Var2);
            }
        });
        u1Var.setOnDismissListener(new l2(this, i11));
        if (z9) {
            u1Var.r(250L);
        } else {
            u1Var.show();
        }
        u1Var.j0 = false;
        View d = u1Var.d(-1);
        if (!(d instanceof TextView) || TextUtils.isEmpty(this.g0)) {
            return;
        }
        x0Var.addTextChangedListener(new tb0(x0Var, (TextView) d));
    }

    public final void w0() {
        org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || jg.g.i(1, arrayList) != this) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
            if (f2Var instanceof w9) {
                ((ActionBarLayout) parentLayout).d0(f2Var, false);
            }
        }
        List fragmentStack = parentLayout.getFragmentStack();
        if (fragmentStack.size() >= 2 && (rf.b.g(2, fragmentStack) instanceof x5) && ((org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
            this.r0 = (x5) rf.b.g(2, fragmentStack);
        } else {
            x5 x5Var = new x5();
            x5Var.setCurrentAccount(this.currentAccount);
            if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, x5Var)) {
                this.r0 = x5Var;
            }
        }
        finishFragment();
    }

    public final void x0() {
        this.f0 = true;
    }

    public final void y0(float f10) {
        this.X = f10;
        this.T.setAlpha(f10);
        this.T.setVisibility(f10 > 0.0f ? 0 : 8);
        ((LinearLayout.LayoutParams) this.T.getLayoutParams()).topMargin = Math.round(org.telegram.messenger.g0.L(4.0f) * f10);
        this.T.requestLayout();
    }

    public m9(String str) {
        this(p10.s0, str);
    }

    public m9(int i7, String str) {
        this.s = 0L;
        this.J = new w8(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.x8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z9) {
                EditTextBoldCursor editTextBoldCursor;
                m9 m9Var = m9.this;
                Runnable runnable = m9Var.J;
                if (z9 && m9Var.I && (editTextBoldCursor = m9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    m9Var.H.post(runnable);
                }
            }
        };
        this.e0 = -1L;
        this.h0 = true;
        this.o0 = 6;
        setCurrentAccount(i7);
        this.f = null;
        this.h = str;
        t0();
        this.r = true;
        m0.x(this.currentAccount).Z(new y8(this, 0), str);
    }

    @Override // org.telegram.ui.Components.n41
    public final void Z(ArrayList arrayList, l41 l41Var) {
    }

    @Override // org.telegram.ui.Components.n41
    public final void b0(x31 x31Var, View view) {
    }
}
