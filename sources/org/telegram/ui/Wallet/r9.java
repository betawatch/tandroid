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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.ra1;
import org.telegram.ui.un;
import org.telegram.ui.y01;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r9 extends r51 implements us {
    public LinearLayout D;
    public q9 E;
    public ShapeDrawable F;
    public org.telegram.ui.ActionBar.c5 G;
    public EditTextBoldCursor H;
    public boolean I;
    public final Runnable J;
    public final ViewTreeObserver.OnWindowFocusChangeListener K;
    public SpannableString L;
    public SpannableString M;
    public org.telegram.ui.Components.f6 N;
    public TextView O;
    public TextView P;
    public p80 Q;
    public TextView R;
    public SpannableString S;
    public org.telegram.ui.ActionBar.q2 T;
    public SpannableString U;
    public boolean V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public LinearLayout Z;
    public o1.j a0;
    public float b0;
    public float c0;
    public vh.d d0;
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
    public b6 r0;
    public long s;
    public fa s0;
    public un t0;
    public s6 u0;
    public int v0;
    public w8 w;
    public int w0;
    public jg.d0 x;
    public FrameLayout y;

    public r9(TLRPC.User user) {
        this.s = 0L;
        this.J = new c9(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.d9
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                r9 r9Var = r9.this;
                Runnable runnable = r9Var.J;
                if (z10 && r9Var.I && (editTextBoldCursor = r9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    r9Var.H.post(runnable);
                }
            }
        };
        this.e0 = -1L;
        this.h0 = true;
        this.o0 = 6;
        this.f = user;
        this.h = null;
        this.r = true;
        k0.x(this.currentAccount).a0(user, new e9(this, 2));
    }

    public static void c0(r9 r9Var) {
        b6.I0(r9Var.currentAccount, r9Var.getParentActivity(), r9Var.getResourceProvider());
    }

    public static void d0(final r9 r9Var) {
        vh.d dVar = r9Var.d0;
        if (!dVar.c0 || dVar.Q) {
            return;
        }
        final k0 x10 = k0.x(r9Var.currentAccount);
        long o02 = r9Var.o0();
        long v = x10.v();
        if (r9Var.r || !WalletEngine2.isValidRecipientAddress(r9Var.h) || o02 <= 0) {
            return;
        }
        long j10 = vp.r1(r9Var.currentAccount).y7.l0.a.c;
        if (o02 < j10) {
            String k02 = r9Var.k0 ? r9Var.k0(j10, r9Var.m0()) : p0(j10);
            r9Var.E.setAmountText(k02);
            r9Var.H.setSelection(k02.length());
            EditTextBoldCursor editTextBoldCursor = r9Var.H;
            int i10 = -r9Var.o0;
            r9Var.o0 = i10;
            org.telegram.messenger.i0.F3(i10, editTextBoldCursor, null);
            return;
        }
        if (o02 > v) {
            org.telegram.messenger.t2.D.a();
            p80 p80Var = r9Var.Q;
            int i11 = -r9Var.o0;
            r9Var.o0 = i11;
            org.telegram.messenger.i0.F3(i11, p80Var, null);
            return;
        }
        long j11 = r9Var.e0;
        if (j11 >= 0 && o02 + j11 > v) {
            o02 -= j11;
        }
        r9Var.I = false;
        EditTextBoldCursor editTextBoldCursor2 = r9Var.H;
        if (editTextBoldCursor2 != null) {
            editTextBoldCursor2.removeCallbacks(r9Var.J);
            r9Var.fragmentView.requestFocus();
            org.telegram.messenger.i0.v1(r9Var.H);
        }
        r9Var.d0.setLoading(true);
        r9Var.q0 = null;
        if (r9Var.f != null && TextUtils.isEmpty(r9Var.n)) {
            r9Var.p0 = true;
            x10.d0(r9Var.f, r9Var.h, o02, r9Var.g0, r9Var.h0 ? r9Var.q0() : null, null, null, new g9(r9Var, 0), new g9(r9Var, 1), null);
            return;
        }
        final String str = r9Var.g0;
        byte[] q02 = r9Var.h0 ? r9Var.q0() : null;
        boolean z10 = q02 != null;
        if (!x10.F()) {
            final long j12 = o02;
            final boolean z11 = z10;
            x10.i(r9Var.h, j12, str, q02, new j20() { // from class: org.telegram.ui.Wallet.i9
                @Override // org.telegram.messenger.j20
                public final void a(Object obj, Object obj2) {
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = (String) obj2;
                    r9 r9Var2 = r9.this;
                    if (str2 != null) {
                        r9Var2.d0.setLoading(false);
                        cc.a0(r9Var2).e0(str2, false);
                        return;
                    }
                    wallettransaction.peer = k0.g(r9Var2.f, r9Var2.h, r9Var2.n);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z11;
                    wallettransaction.date = r9Var2.getConnectionsManager().getCurrentTime();
                    org.telegram.messenger.i0.v1(r9Var2.H);
                    b6.F0(r9Var2.getParentActivity(), r9Var2.getCurrentAccount(), wallettransaction, new h9(r9Var2, x10, j12, 1), new e9(r9Var2, 4), r9Var2.q0(), null, r9Var2.getResourceProvider());
                    org.telegram.messenger.i0.h3(new c9(r9Var2, 3), 1000L);
                }
            });
            return;
        }
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        wallettransaction.peer = k0.g(r9Var.f, r9Var.h, r9Var.n);
        wallettransaction.comment = str;
        wallettransaction.comment_encrypted = z10;
        wallettransaction.date = r9Var.getConnectionsManager().getCurrentTime();
        wallettransaction.fee = Math.max(0L, r9Var.e0);
        wallettransaction.gasless = true;
        wallettransaction.amount = o02;
        org.telegram.messenger.i0.v1(r9Var.H);
        b6.F0(r9Var.getParentActivity(), r9Var.getCurrentAccount(), wallettransaction, new h9(r9Var, x10, o02, 0), new e9(r9Var, 3), r9Var.q0(), null, r9Var.getResourceProvider());
        org.telegram.messenger.i0.h3(new c9(r9Var, 2), 1000L);
    }

    public static void e0(r9 r9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            r9Var.p0 = false;
            r9Var.d0.setLoading(false);
            return;
        }
        if (str != null) {
            r9Var.p0 = false;
            r9Var.d0.setLoading(false);
            cc.a0(r9Var).e0(str, false);
            return;
        }
        if (!r9Var.f0) {
            r9Var.v0();
            return;
        }
        org.telegram.ui.ActionBar.z4 parentLayout = r9Var.getParentLayout();
        if (parentLayout == null) {
            r9Var.finishFragment();
            return;
        }
        long j10 = r9Var.f.id;
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i0.a.g(1, arrayList) != r9Var) {
            return;
        }
        int size = arrayList.size() - 2;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) arrayList.get(size);
            if ((k2Var instanceof un) && k2Var.getCurrentAccount() == r9Var.currentAccount) {
                un unVar = (un) k2Var;
                if (unVar.a() == j10 && unVar.f4 == 0) {
                    r9Var.t0 = unVar;
                    for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                        ((ActionBarLayout) parentLayout).c0((org.telegram.ui.ActionBar.k2) arrayList.get(size2), false);
                    }
                }
            }
            size--;
        }
        if (r9Var.t0 == null) {
            r9Var.getNotificationCenter().k(zs.v, Long.valueOf(j10), Boolean.FALSE);
            un ha = un.ha(j10);
            ha.setCurrentAccount(r9Var.currentAccount);
            if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ha)) {
                r9Var.finishFragment();
                return;
            }
            r9Var.t0 = ha;
        }
        r9Var.finishFragment();
    }

    public static void f0(r9 r9Var, TL_wallet.walletUserAddress walletuseraddress) {
        r9Var.r = false;
        r9Var.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            r9Var.f = vp.r1(r9Var.currentAccount).Z1(Long.valueOf(walletuseraddress.user_id));
        }
        ii iiVar = r9Var.a;
        if (iiVar != null) {
            iiVar.f3.O(true);
        }
        r9Var.B0();
        w8 w8Var = r9Var.w;
        if (w8Var != null) {
            w8Var.a(r9Var.h, r9Var.f);
        }
    }

    public static int l0(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i10 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i10++;
        }
        return i10;
    }

    public static String p0(long j10) {
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public static BigDecimal u0(String str) {
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

    public static void y0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
        int i12 = i10 + 1;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11) {
                return;
            }
            if (spannableStringBuilder.charAt(i12) == c10 && Character.isDigit(spannableStringBuilder.charAt(i12 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i13))) {
                int i14 = i13;
                while (i14 < i11 && Character.isDigit(spannableStringBuilder.charAt(i14))) {
                    i14++;
                }
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), i13, i14, 33);
                return;
            }
            i12 = i13;
        }
    }

    public final void A0(boolean z10) {
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) cd.L0(2131743110, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) cd.L0(2131743163, null));
            spannableStringBuilder.append((CharSequence) " >");
            dq dqVar = new dq(R.drawable.settings_arrow, 0);
            float N = org.telegram.messenger.i0.N(0.66f);
            dqVar.r = 0.0f;
            dqVar.s = N;
            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new dh.a(this, 10), length, spannableStringBuilder.length(), 33);
            this.Q.setText(spannableStringBuilder);
        }
        this.Q.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(gr.h).start();
    }

    public final void B0() {
        D0();
        if (this.H == null || this.d0 == null) {
            return;
        }
        k0 x10 = k0.x(this.currentAccount);
        long v = x10.v();
        long o02 = o0();
        long j10 = vp.r1(this.currentAccount).y7.l0.a.c;
        if (o02 > 0 && o02 < j10) {
            String k02 = this.k0 ? k0(j10, m0()) : p0(j10);
            this.E.setAmountText(k02);
            this.H.setSelection(k02.length());
            EditTextBoldCursor editTextBoldCursor = this.H;
            int i10 = -this.o0;
            this.o0 = i10;
            org.telegram.messenger.i0.F3(i10, editTextBoldCursor, null);
            return;
        }
        boolean z10 = WalletEngine2.isValidRecipientAddress(this.h) && !this.r && o02 > 0 && o02 <= v;
        A0(!TextUtils.isEmpty(this.H.getText()) && o02 > v);
        long o03 = o0();
        if (this.m0 == null) {
            this.m0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        String format = o03 > 0 ? this.m0.format(BigDecimal.valueOf(o03, 9)) : "";
        this.d0.setLoading(this.r || this.p0);
        this.d0.i(TextUtils.isEmpty(format) ? cd.L0(2131743046, null) : cd.V(null, null, 2131743047, k0.l("Grams", format, 2131749516)), true, true);
        this.d0.setEnabled(z10);
        C0();
        E0();
        if (!this.k0) {
            this.N.setText(n0(x10, o02));
            return;
        }
        org.telegram.ui.Components.f6 f6Var = this.N;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.M).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        if (this.n0 == null) {
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
            this.n0 = decimalFormat;
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        }
        spannableStringBuilder.append((CharSequence) this.n0.format(BigDecimal.valueOf(o02).movePointLeft(9)));
        y0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) cd.L0(2131749525, null));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
        f6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L));
    }

    public final void C0() {
        if (this.R == null) {
            return;
        }
        k0 x10 = k0.x(this.currentAccount);
        this.R.setText(cd.V(null, null, 2131743211, k0.l("Grams", k0.p(x10.v(), false), 2131749516)));
        boolean z10 = this.W;
        EditTextBoldCursor editTextBoldCursor = this.H;
        this.W = z10 | ((editTextBoldCursor == null || TextUtils.isEmpty(editTextBoldCursor.getText())) ? false : true);
        boolean z11 = (!x10.F() || k0.b(x10.t(), this.h)) && this.W;
        if (z11) {
            long j10 = this.e0;
            if (j10 >= 0) {
                this.T.setText(cd.V(null, null, 2131743098, k0.s(j10, false)));
            } else {
                this.T.setText(cd.V(null, null, 2131743098, this.U));
            }
        }
        if (this.V == z11) {
            return;
        }
        this.V = z11;
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        float f7 = z11 ? 1.0f : 0.0f;
        if (!this.T.isAttachedToWindow()) {
            x0(f7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X, f7);
        this.Y = ofFloat;
        ofFloat.setDuration(320L);
        this.Y.setInterpolator(gr.h);
        this.Y.addUpdateListener(new r3(this, 8));
        this.Y.start();
    }

    public final void D0() {
        if (this.D == null || this.O == null) {
            return;
        }
        final boolean z10 = o0() > 0 || this.P.getVisibility() == 0;
        if (z10 == this.l0) {
            return;
        }
        this.l0 = z10;
        this.D.setVisibility(0);
        this.O.setVisibility(0);
        final int i10 = 0;
        ViewPropertyAnimator duration = this.D.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.j9
            public final /* synthetic */ r9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.D.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.O.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        gr grVar = gr.h;
        duration.setInterpolator(grVar).start();
        final int i11 = 1;
        this.O.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.j9
            public final /* synthetic */ r9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.D.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.O.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L).setInterpolator(grVar).start();
    }

    public final void E0() {
        this.E.d(k0.x(this.currentAccount), this.k0);
    }

    public final void F0() {
        float f7 = this.b0;
        float f10 = 1.0f - f7;
        float max = Math.max(this.c0, Math.max(0.0f, Math.min(1.0f, f7)));
        this.c0 = max;
        float f11 = 1.0f - max;
        q9 q9Var = this.E;
        float f12 = this.b0;
        q9Var.e(f12, max, this.a0 == null && f12 == 1.0f);
        this.E.setTranslationY((((this.x.getHeight() / 2.0f) - this.E.getTop()) - (this.E.getHeight() / 2.0f)) * f10);
        this.N.setAlpha(this.c0);
        this.N.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f11);
        this.y.setAlpha(this.c0);
        this.y.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f11);
        this.Z.setAlpha(this.c0);
        for (int i10 = 0; i10 < this.Z.getChildCount(); i10++) {
            this.Z.getChildAt(i10).setTranslationY(org.telegram.messenger.i0.L(24.0f) * f11);
        }
    }

    @Override // org.telegram.ui.Components.r51
    public final CharSequence Z() {
        return cd.L0(2131743042, null);
    }

    @Override // org.telegram.ui.Components.r51
    public final boolean b0(a51 a51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r51, org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        View createView = super.createView(context);
        this.fragmentView = createView;
        final int i10 = 1;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i11, view, getResourceProvider());
        org.telegram.ui.ActionBar.a7.i(i11, this.actionBar, getResourceProvider());
        final int i12 = 0;
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(cd.L0(2131754839, null));
        final int i13 = 2;
        a2.e(2, R.drawable.msg_addbot, cd.L0(2131743163, null));
        a2.e(3, R.drawable.menu_comments, cd.L0(2131743231, null));
        this.actionBar.setActionBarMenuOnItemClick(new y01(this, 11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        w8 w8Var = new w8(context, new c9(this, 5), new c9(this, 6), this.resourceProvider);
        this.w = w8Var;
        frameLayout.addView(w8Var, w7.b6.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        w8 w8Var2 = this.w;
        if (w8Var2 != null) {
            w8Var2.a(this.h, this.f);
        }
        jg.d0 d0Var = new jg.d0(this, context);
        this.x = d0Var;
        d0Var.setOrientation(1);
        this.x.setClipChildren(false);
        this.x.setClipToPadding(false);
        frameLayout.addView(this.x, w7.b6.e(-1, -2, 17));
        q9 q9Var = new q9(context, getResourceProvider());
        this.E = q9Var;
        if (q9Var.getDiamondView().f == null) {
            this.c0 = 1.0f;
            this.b0 = 1.0f;
        }
        this.x.addView(this.E, w7.b6.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.E.getEditText();
        this.H = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: org.telegram.ui.Wallet.l9
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i16).toString());
                sb2.append((Object) charSequence.subSequence(i14, i15));
                sb2.append((Object) spanned.subSequence(i17, spanned.length()));
                String sb3 = sb2.toString();
                int i18 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                r9 r9Var = r9.this;
                if (r9Var.k0) {
                    BigDecimal m0 = r9Var.m0();
                    valueOf = valueOf.multiply(m0);
                    i18 = r9.l0(m0);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i18) {
                    return spanned.subSequence(i16, i17);
                }
                if (r9.u0(sb3).compareTo(valueOf) > 0) {
                    return spanned.subSequence(i16, i17);
                }
                if (i14 == i15) {
                    return null;
                }
                boolean z10 = false;
                for (int i19 = 0; i19 < sb3.length(); i19++) {
                    char charAt = sb3.charAt(i19);
                    if (charAt == '.' || charAt == ',') {
                        if (z10) {
                            return spanned.subSequence(i16, i17);
                        }
                        z10 = true;
                    }
                }
                if (i16 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
                    return "0" + ((Object) charSequence.subSequence(i14, i15));
                }
                if (sb3.startsWith("00")) {
                    return spanned.subSequence(i16, i17);
                }
                return null;
            }
        }});
        this.H.setImeOptions(33554438);
        this.H.setOnEditorActionListener(new x8(this, i10));
        this.H.addTextChangedListener(new ag.a1(this, 23));
        long j10 = this.s;
        if (j10 > 0) {
            q9 q9Var2 = this.E;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            q9Var2.setAmountText((valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros()).toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.H;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.L = new SpannableString("⇅");
        dq dqVar = new dq(R.drawable.wallet_currency_exchange, 0);
        dqVar.x = 0.72f;
        SpannableString spannableString = this.L;
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        this.M = new SpannableString("G");
        dq dqVar2 = new dq(R.drawable.wallet_gram_small, 0);
        dqVar2.d = false;
        SpannableString spannableString2 = this.M;
        spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true, true, true);
        this.N = f6Var;
        f6Var.c.m(0.35f, 320L, 3.5f, gr.h);
        this.N.setScaleProperty(0.25f);
        this.N.setText(n0(k0.x(this.currentAccount), 0L));
        org.telegram.ui.Components.f6 f6Var2 = this.N;
        int i14 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i11, i14);
        org.telegram.ui.ActionBar.a7.n(f6Var2, q6.a, q6.b, 4, 0.0f, getResourceProvider());
        this.N.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.N.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        this.N.setGravity(17);
        this.N.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        this.N.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.08f, getThemedColor(i14));
        org.telegram.ui.Components.f6 f6Var3 = this.N;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(14.0f), r12);
        this.F = d02;
        f6Var3.setSizeableBackground(d02);
        this.x.addView(this.N, w7.b6.t(-2, 28, 49, 0, 8, 0, 0));
        w7.e6.a(this.N);
        this.N.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.b9
            public final /* synthetic */ r9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.b.t0();
                        break;
                    case 1:
                        r9.d0(this.b);
                        break;
                    case 2:
                        r9 r9Var = this.b;
                        BigDecimal m0 = r9Var.m0();
                        if (r9Var.k0 || m0.signum() > 0) {
                            long o02 = r9Var.o0();
                            r9Var.k0 = !r9Var.k0;
                            r9Var.E0();
                            String k02 = o02 <= 0 ? "" : r9Var.k0 ? r9Var.k0(o02, m0) : r9.p0(o02);
                            r9Var.E.setAmountText(k02);
                            r9Var.H.setSelection(k02.length());
                            break;
                        }
                        break;
                    default:
                        r9.c0(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        this.x.addView(frameLayout2, w7.b6.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        linearLayout.setOrientation(1);
        this.y.addView(this.D, w7.b6.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.O;
        int i15 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.V(textView2, i15, getResourceProvider());
        org.telegram.ui.ActionBar.a7.R(this.O, org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.r1(0.1f, getThemedColor(i15)), org.telegram.ui.ActionBar.t6.r1(0.25f, getThemedColor(i15)), 14, 14), org.telegram.ui.ActionBar.a7.L(0.1f, i15), org.telegram.ui.ActionBar.a7.L(0.25f, i15), getResourceProvider());
        this.O.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        this.O.setGravity(17);
        this.O.setTypeface(org.telegram.messenger.i0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131743163, null));
        spannableStringBuilder.append((CharSequence) " >");
        dq dqVar3 = new dq(R.drawable.settings_arrow, 0);
        float N = org.telegram.messenger.i0.N(0.66f);
        dqVar3.r = 0.0f;
        dqVar3.s = N;
        spannableStringBuilder.setSpan(dqVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        this.y.addView(this.O, w7.b6.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w7.e6.a(this.O);
        final int i16 = 3;
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.b9
            public final /* synthetic */ r9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.b.t0();
                        break;
                    case 1:
                        r9.d0(this.b);
                        break;
                    case 2:
                        r9 r9Var = this.b;
                        BigDecimal m0 = r9Var.m0();
                        if (r9Var.k0 || m0.signum() > 0) {
                            long o02 = r9Var.o0();
                            r9Var.k0 = !r9Var.k0;
                            r9Var.E0();
                            String k02 = o02 <= 0 ? "" : r9Var.k0 ? r9Var.k0(o02, m0) : r9.p0(o02);
                            r9Var.E.setAmountText(k02);
                            r9Var.H.setSelection(k02.length());
                            break;
                        }
                        break;
                    default:
                        r9.c0(this.b);
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
        org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(0, true, false, null);
        c5Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = c5Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.i0.N(0.5f)));
        int i17 = org.telegram.ui.ActionBar.t6.Yl;
        paint.setColor(getThemedColor(i17));
        c5Var.w = Integer.valueOf(getThemedColor(i17));
        this.P.setPadding(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(8.0f));
        this.P.setBackground(c5Var);
        this.G = c5Var;
        this.P.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(this.P, i14, getResourceProvider());
        this.P.setTypeface(org.telegram.messenger.i0.o());
        this.P.setEllipsize(TextUtils.TruncateAt.END);
        this.P.setMaxLines(4);
        if (TextUtils.isEmpty(this.g0)) {
            this.P.setVisibility(8);
        } else {
            this.P.setText(this.g0);
            this.P.setVisibility(0);
        }
        this.D.addView(this.P, w7.b6.t(-2, -2, 49, 32, 12, 32, 0));
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.b9
            public final /* synthetic */ r9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.b.t0();
                        break;
                    case 1:
                        r9.d0(this.b);
                        break;
                    case 2:
                        r9 r9Var = this.b;
                        BigDecimal m0 = r9Var.m0();
                        if (r9Var.k0 || m0.signum() > 0) {
                            long o02 = r9Var.o0();
                            r9Var.k0 = !r9Var.k0;
                            r9Var.E0();
                            String k02 = o02 <= 0 ? "" : r9Var.k0 ? r9Var.k0(o02, m0) : r9.p0(o02);
                            r9Var.E.setAmountText(k02);
                            r9Var.H.setSelection(k02.length());
                            break;
                        }
                        break;
                    default:
                        r9.c0(this.b);
                        break;
                }
            }
        });
        w7.e6.b(this.P, 0.02f, 1.2f);
        D0();
        p80 p80Var = new p80(context, this.resourceProvider);
        this.Q = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.q7, getResourceProvider());
        org.telegram.ui.ActionBar.a7.H(this.Q, i15, getResourceProvider());
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setTypeface(org.telegram.messenger.i0.o());
        this.Q.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        A0(false);
        this.D.addView(this.Q, w7.b6.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Z = linearLayout2;
        linearLayout2.setOrientation(1);
        this.Z.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        this.Z.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        TextView textView3 = new TextView(context);
        this.R = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i14, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.Z.addView(this.R, w7.b6.t(-1, -2, 55, 16, 0, 16, 0));
        this.S = new SpannableString(">");
        dq dqVar4 = new dq(R.drawable.settings_arrow, 0);
        float L = org.telegram.messenger.i0.L(1.0f);
        dqVar4.r = 0.0f;
        dqVar4.s = L;
        SpannableString spannableString3 = this.S;
        spannableString3.setSpan(dqVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, context, 10);
        this.T = q2Var;
        org.telegram.ui.ActionBar.a7.V(q2Var, i14, getResourceProvider());
        this.T.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        this.T.setVisibility(8);
        this.Z.addView(this.T, w7.b6.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(cd.L0(2131748789, null));
        this.U = spannableString4;
        spannableString4.setSpan(new u80(org.telegram.messenger.i0.L(80.0f), this.T), 0, this.U.length(), 33);
        vh.d dVar = new vh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.d0 = dVar;
        dVar.setText(cd.L0(2131743046, null));
        this.d0.setEnabled(false);
        this.d0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.b9
            public final /* synthetic */ r9 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.t0();
                        break;
                    case 1:
                        r9.d0(this.b);
                        break;
                    case 2:
                        r9 r9Var = this.b;
                        BigDecimal m0 = r9Var.m0();
                        if (r9Var.k0 || m0.signum() > 0) {
                            long o02 = r9Var.o0();
                            r9Var.k0 = !r9Var.k0;
                            r9Var.E0();
                            String k02 = o02 <= 0 ? "" : r9Var.k0 ? r9Var.k0(o02, m0) : r9.p0(o02);
                            r9Var.E.setAmountText(k02);
                            r9Var.H.setSelection(k02.length());
                            break;
                        }
                        break;
                    default:
                        r9.c0(this.b);
                        break;
                }
            }
        });
        this.Z.addView(this.d0, w7.b6.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.Z, w7.b6.e(-1, -2, 87));
        B0();
        F0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.a4) {
            C0();
            B0();
        }
    }

    public final void i0() {
        try {
            ShapeDrawable shapeDrawable = this.F;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.t6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.t6.z6)));
                this.F.invalidateSelf();
                org.telegram.ui.Components.f6 f6Var = this.N;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
            }
            if (this.G != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Yl);
                this.G.c.setColor(themedColor);
                this.G.w = Integer.valueOf(themedColor);
                this.G.invalidateSelf();
                TextView textView = this.P;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        q9 q9Var = this.E;
        if (q9Var != null) {
            q9Var.getDiamondView().l(null);
        }
        o1.j jVar = this.a0;
        if (jVar != null) {
            jVar.d();
        }
        this.b0 = 1.0f;
        if (this.E != null) {
            F0();
        }
    }

    public final String k0(long j10, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate r02 = r0();
        int max = Math.max(0, Math.min(r02 != null ? r02.exp : TextUtils.equals(k0.x(this.currentAccount).h.g(), "USD") ? 2 : 0, 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int l02 = l0(bigDecimal);
        if (scale.scale() > l02) {
            scale = scale.setScale(l02, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        return (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
    }

    public final BigDecimal m0() {
        f fVar = k0.x(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.k0) vp.r1(this.currentAccount).y7.l.b).a;
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    public final SpannableStringBuilder n0(k0 k0Var, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(k0Var.m(j10, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate r02 = r0();
        y0(spannableStringBuilder, length, length2, (r02 == null || TextUtils.isEmpty(r02.decimalSeparator)) ? '.' : r02.decimalSeparator.charAt(0));
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L);
    }

    public final long o0() {
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor == null) {
            return 0L;
        }
        BigDecimal u02 = u0(editTextBoldCursor.getText().toString());
        if (this.k0) {
            BigDecimal m0 = m0();
            if (m0.signum() <= 0) {
                return 0L;
            }
            u02 = u02.divide(m0, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
        }
        BigInteger bigInteger = u02.movePointRight(9).toBigInteger();
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            return Long.MAX_VALUE;
        }
        return bigInteger.longValue();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        q9 q9Var;
        View view2;
        if (!z10 && this.t0 != null && (wallettransaction = this.q0) != null && wallettransaction.localMessageId != 0 && (q9Var = this.E) != null) {
            a7 diamondView = q9Var.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                s6 s6Var = new s6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.t0, this.q0, runnable, null);
                this.u0 = s6Var;
                return s6Var.m;
            }
        }
        if (z10 || this.r0 == null || this.q0 == null || this.E == null || (view = this.fragmentView) == null || !(view.getParent() instanceof View) || getParentLayout() == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        fa faVar = new fa(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.r0, this.q0, runnable, null);
        this.s0 = faVar;
        return faVar.m;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, zs.a4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        this.I = false;
        j0();
        s6 s6Var = this.u0;
        if (s6Var != null) {
            AnimatorSet animatorSet = s6Var.m;
            if (!s6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    s6Var.a(false);
                }
            }
            this.u0 = null;
        }
        fa faVar = this.s0;
        if (faVar != null) {
            AnimatorSet animatorSet2 = faVar.m;
            if (!faVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    faVar.b();
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
        getNotificationCenter().n(this, zs.a4);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.i0 = i13;
        if (this.Z == null) {
            return;
        }
        int max = Math.max(0, this.j0 - i13);
        this.Z.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f) + this.i0);
        if (this.v0 != max) {
            this.Z.animate().cancel();
            this.Z.animate().translationY(-max).setDuration(320L).setInterpolator(gr.h).start();
            this.v0 = max;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final r0.j1 onInsetsInternal(View view, r0.j1 j1Var) {
        this.j0 = j1Var.a.f(8).d;
        return super.onInsetsInternal(view, j1Var);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        j0();
        this.I = false;
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.J);
            this.fragmentView.requestFocus();
            org.telegram.messenger.i0.v1(this.H);
        }
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        s0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            i0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.d6);
            LinearLayout linearLayout = this.Z;
            if (linearLayout == null || themedColor == this.w0 || !(linearLayout.getBackground() instanceof GradientDrawable)) {
                return;
            }
            this.w0 = themedColor;
            ((GradientDrawable) this.Z.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, themedColor), themedColor, themedColor});
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 || z11 || !this.I || (editTextBoldCursor = this.H) == null) {
            return;
        }
        Runnable runnable = this.J;
        editTextBoldCursor.removeCallbacks(runnable);
        this.H.post(runnable);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        q9 q9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (q9Var = this.E) != null && this.b0 < 1.0f) {
            q9Var.getDiamondView().l(new c9(this, 1));
        }
        if (!z10 || z11 || (editTextBoldCursor = this.H) == null) {
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

    public final byte[] q0() {
        TL_wallet.walletUserAddress walletuseraddress = this.e;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.e.public_key;
            if (i10 >= bArr.length) {
                return null;
            }
            if (bArr[i10] != 0) {
                return bArr;
            }
            i10++;
        }
    }

    public final TL_wallet.currencyRate r0() {
        f fVar = k0.x(this.currentAccount).h;
        TL_wallet.currencyRates f7 = fVar.f();
        if (f7 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f7.rates;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i10);
            i10++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, fVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    public final void s0() {
        if (WalletEngine2.isValidRecipientAddress(this.h)) {
            this.e0 = -1L;
            C0();
            k0 x10 = k0.x(this.currentAccount);
            if (!x10.F() || k0.b(x10.t(), this.h) || this.f == null || !TextUtils.isEmpty(this.n)) {
                x10.i(this.h, 0L, this.g0, this.h0 ? q0() : null, new e9(this, 1));
            }
        }
    }

    public final void t0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        boolean z10 = this.j0 - this.i0 > org.telegram.messenger.i0.L(20.0f);
        AlertDialog$Builder a2Var = z10 ? new org.telegram.ui.ActionBar.a2(0, parentActivity, getResourceProvider()) : new AlertDialog$Builder(0, parentActivity, getResourceProvider());
        String L0 = cd.L0(2131743231, null);
        org.telegram.ui.ActionBar.x1 x1Var = a2Var.a;
        x1Var.R = L0;
        final ag.a2 a2Var2 = new ag.a2(this, parentActivity);
        a2Var2.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.V(a2Var2, org.telegram.ui.ActionBar.t6.j5, getResourceProvider());
        org.telegram.ui.ActionBar.a7.E(a2Var2, org.telegram.ui.ActionBar.t6.t5, getResourceProvider());
        a2Var2.setHint(cd.L0(2131743195, null));
        a2Var2.setText(this.g0);
        a2Var2.setSelection(a2Var2.length());
        a2Var2.setInputType(147457);
        a2Var2.setMaxLines(5);
        int i10 = 6;
        a2Var2.setImeOptions(6);
        org.telegram.ui.ActionBar.a7.G(a2Var2, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, getResourceProvider());
        a2Var2.setBackground(null);
        a2Var2.setPadding(0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(10.0f));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, getResourceProvider());
        int i11 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, this.resourceProvider), 7, org.telegram.messenger.i0.L(12.0f));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
        c2Var.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, p6Var);
        c2Var.e(cd.L0(2131743103, null), "", !this.h0 || q0() == null, false, false);
        c2Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.gravity = (cd.X ? 5 : 3) | 16;
        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
        c2Var.setPadding(cd.X ? org.telegram.messenger.i0.L(4.0f) : 0, org.telegram.messenger.i0.L(12.0f), cd.X ? 0 : org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f));
        c2Var.setEnabled(q0() != null);
        c2Var.setOnClickListener(new i3(c2Var, i10));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.addView(a2Var2, w7.b6.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        linearLayout.addView(c2Var, w7.b6.t(-1, -2, 83, 8, 0, 8, 0));
        x1Var.G = 6;
        a2Var.o(linearLayout);
        x1Var.a = org.telegram.messenger.i0.L(292.0f);
        a2Var.h(cd.L0(2131752589, null), new ra1(4));
        int i12 = 2;
        a2Var.k(cd.L0(2131754486, null), new o8(this, a2Var2, c2Var, i12));
        x1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Wallet.f9
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ag.a2 a2Var3 = ag.a2.this;
                a2Var3.requestFocus();
                org.telegram.messenger.i0.J3(a2Var3);
            }
        });
        x1Var.setOnDismissListener(new l2(this, i12));
        if (z10) {
            x1Var.r(250L);
        } else {
            x1Var.show();
        }
        x1Var.j0 = false;
        View d = x1Var.d(-1);
        if (!(d instanceof TextView) || TextUtils.isEmpty(this.g0)) {
            return;
        }
        a2Var2.addTextChangedListener(new jg.f3(a2Var2, (TextView) d));
    }

    public final void v0() {
        org.telegram.ui.ActionBar.z4 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i0.a.g(1, arrayList) != this) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
            if (k2Var instanceof ba) {
                ((ActionBarLayout) parentLayout).c0(k2Var, false);
            }
        }
        List fragmentStack = parentLayout.getFragmentStack();
        if (fragmentStack.size() >= 2 && (sc.e.g(2, fragmentStack) instanceof b6) && ((org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
            this.r0 = (b6) sc.e.g(2, fragmentStack);
        } else {
            b6 b6Var = new b6();
            b6Var.setCurrentAccount(this.currentAccount);
            if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, b6Var)) {
                this.r0 = b6Var;
            }
        }
        finishFragment();
    }

    public final void w0() {
        this.f0 = true;
    }

    public final void x0(float f7) {
        this.X = f7;
        this.T.setAlpha(f7);
        this.T.setVisibility(f7 > 0.0f ? 0 : 8);
        ((LinearLayout.LayoutParams) this.T.getLayoutParams()).topMargin = Math.round(org.telegram.messenger.i0.L(4.0f) * f7);
        this.T.requestLayout();
    }

    public final void z0(String str) {
        this.n = str;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setTitle(cd.L0(2131743042, null));
        }
    }

    public r9(String str) {
        this(d20.s0, str);
    }

    public r9(int i10, String str) {
        this.s = 0L;
        this.J = new c9(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.d9
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                r9 r9Var = r9.this;
                Runnable runnable = r9Var.J;
                if (z10 && r9Var.I && (editTextBoldCursor = r9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    r9Var.H.post(runnable);
                }
            }
        };
        this.e0 = -1L;
        this.h0 = true;
        this.o0 = 6;
        setCurrentAccount(i10);
        this.f = null;
        this.h = str;
        s0();
        this.r = true;
        k0.x(this.currentAccount).Z(new e9(this, 0), str);
    }

    @Override // org.telegram.ui.Components.r51
    public final void Y(ArrayList arrayList, p51 p51Var) {
    }

    @Override // org.telegram.ui.Components.r51
    public final void a0(a51 a51Var, View view) {
    }
}
