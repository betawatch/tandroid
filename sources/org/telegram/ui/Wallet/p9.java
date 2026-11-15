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
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.z70;
import org.telegram.ui.an;
import org.telegram.ui.ct0;
import org.telegram.ui.t70;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class p9 extends r41 implements is {
    public LinearLayout E;
    public o9 F;
    public ShapeDrawable G;
    public org.telegram.ui.ActionBar.r4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public final Runnable K;
    public final ViewTreeObserver.OnWindowFocusChangeListener L;
    public SpannableString M;
    public SpannableString N;
    public org.telegram.ui.Components.h6 O;
    public TextView P;
    public TextView Q;
    public z70 R;
    public TextView S;
    public SpannableString T;
    public org.telegram.ui.ActionBar.l2 U;
    public SpannableString V;
    public boolean W;
    public boolean X;
    public float Y;
    public ValueAnimator Z;
    public LinearLayout a0;
    public r1.g b0;
    public float c0;
    public float d0;
    public TL_wallet.walletUserAddress e;
    public hi.d e0;
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
    public y5 s0;
    public da t0;
    public an u0;
    public o6 v0;
    public s8 w;
    public int w0;
    public hi.y4 x;
    public int x0;
    public FrameLayout y;

    public p9(TLRPC.User user) {
        this.s = 0L;
        this.K = new y8(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.z8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                p9 p9Var = p9.this;
                Runnable runnable = p9Var.K;
                if (z10 && p9Var.J && (editTextBoldCursor = p9Var.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    p9Var.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        this.f = user;
        this.h = null;
        this.r = true;
        l0.x(this.currentAccount).a0(user, new a9(this, 2));
    }

    public static void d0(p9 p9Var) {
        y5.J0(p9Var.currentAccount, p9Var.getParentActivity(), p9Var.getResourceProvider());
    }

    public static void e0(final p9 p9Var) {
        hi.d dVar = p9Var.e0;
        if (!dVar.d0 || dVar.R) {
            return;
        }
        final l0 x10 = l0.x(p9Var.currentAccount);
        long p02 = p9Var.p0();
        long v = x10.v();
        if (p9Var.r || !WalletEngine2.isValidRecipientAddress(p9Var.h) || p02 <= 0) {
            return;
        }
        long j3 = ((org.telegram.messenger.l0) np.s1(p9Var.currentAccount).y7.l0.b).c;
        if (p02 < j3) {
            String l02 = p9Var.l0 ? p9Var.l0(j3, p9Var.n0()) : q0(j3);
            p9Var.F.setAmountText(l02);
            p9Var.I.setSelection(l02.length());
            EditTextBoldCursor editTextBoldCursor = p9Var.I;
            int i7 = -p9Var.p0;
            p9Var.p0 = i7;
            org.telegram.messenger.g0.F3(i7, editTextBoldCursor, null);
            return;
        }
        if (p02 > v) {
            org.telegram.messenger.p2.E.a();
            z70 z70Var = p9Var.R;
            int i10 = -p9Var.p0;
            p9Var.p0 = i10;
            org.telegram.messenger.g0.F3(i10, z70Var, null);
            return;
        }
        long j10 = p9Var.f0;
        if (j10 >= 0 && p02 + j10 > v) {
            p02 -= j10;
        }
        p9Var.J = false;
        EditTextBoldCursor editTextBoldCursor2 = p9Var.I;
        if (editTextBoldCursor2 != null) {
            editTextBoldCursor2.removeCallbacks(p9Var.K);
            p9Var.fragmentView.requestFocus();
            org.telegram.messenger.g0.v1(p9Var.I);
        }
        p9Var.e0.setLoading(true);
        p9Var.r0 = null;
        if (p9Var.f != null && TextUtils.isEmpty(p9Var.n)) {
            p9Var.q0 = true;
            x10.d0(p9Var.f, p9Var.h, p02, p9Var.h0, p9Var.i0 ? p9Var.r0() : null, null, null, new c9(p9Var, 0), new c9(p9Var, 1), null);
            return;
        }
        final String str = p9Var.h0;
        byte[] r02 = p9Var.i0 ? p9Var.r0() : null;
        boolean z10 = r02 != null;
        if (!x10.F()) {
            final long j11 = p02;
            final boolean z11 = z10;
            x10.i(p9Var.h, j11, str, r02, new s10() { // from class: org.telegram.ui.Wallet.e9
                @Override // org.telegram.messenger.s10
                public final void a(Object obj, Object obj2) {
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = (String) obj2;
                    p9 p9Var2 = p9.this;
                    if (str2 != null) {
                        p9Var2.e0.setLoading(false);
                        cc.a0(p9Var2).e0(str2, false);
                        return;
                    }
                    wallettransaction.peer = l0.g(p9Var2.f, p9Var2.h, p9Var2.n);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z11;
                    wallettransaction.date = p9Var2.getConnectionsManager().getCurrentTime();
                    org.telegram.messenger.g0.v1(p9Var2.I);
                    y5.G0(p9Var2.getParentActivity(), p9Var2.getCurrentAccount(), wallettransaction, new d9(p9Var2, x10, j11, 1), new a9(p9Var2, 4), p9Var2.r0(), null, p9Var2.getResourceProvider());
                    org.telegram.messenger.g0.i3(new y8(p9Var2, 3), 1000L);
                }
            });
            return;
        }
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        wallettransaction.peer = l0.g(p9Var.f, p9Var.h, p9Var.n);
        wallettransaction.comment = str;
        wallettransaction.comment_encrypted = z10;
        wallettransaction.date = p9Var.getConnectionsManager().getCurrentTime();
        wallettransaction.fee = Math.max(0L, p9Var.f0);
        wallettransaction.gasless = true;
        wallettransaction.amount = p02;
        org.telegram.messenger.g0.v1(p9Var.I);
        y5.G0(p9Var.getParentActivity(), p9Var.getCurrentAccount(), wallettransaction, new d9(p9Var, x10, p02, 0), new a9(p9Var, 3), p9Var.r0(), null, p9Var.getResourceProvider());
        org.telegram.messenger.g0.i3(new y8(p9Var, 2), 1000L);
    }

    public static void f0(p9 p9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            p9Var.q0 = false;
            p9Var.e0.setLoading(false);
            return;
        }
        if (str != null) {
            p9Var.q0 = false;
            p9Var.e0.setLoading(false);
            cc.a0(p9Var).e0(str, false);
            return;
        }
        if (!p9Var.g0) {
            p9Var.w0();
            return;
        }
        org.telegram.ui.ActionBar.o4 parentLayout = p9Var.getParentLayout();
        if (parentLayout == null) {
            p9Var.finishFragment();
            return;
        }
        long j3 = p9Var.f.id;
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i5.c.h(1, arrayList) != p9Var) {
            return;
        }
        int size = arrayList.size() - 2;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) arrayList.get(size);
            if ((e2Var instanceof an) && e2Var.getCurrentAccount() == p9Var.currentAccount) {
                an anVar = (an) e2Var;
                if (anVar.a() == j3 && anVar.g4 == 0) {
                    p9Var.u0 = anVar;
                    for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                        ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.e2) arrayList.get(size2), false);
                    }
                }
            }
            size--;
        }
        if (p9Var.u0 == null) {
            p9Var.getNotificationCenter().k(ns.v, Long.valueOf(j3), Boolean.FALSE);
            an ua2 = an.ua(j3);
            ua2.setCurrentAccount(p9Var.currentAccount);
            if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ua2)) {
                p9Var.finishFragment();
                return;
            }
            p9Var.u0 = ua2;
        }
        p9Var.finishFragment();
    }

    public static void g0(p9 p9Var, TL_wallet.walletUserAddress walletuseraddress) {
        p9Var.r = false;
        p9Var.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            p9Var.f = np.s1(p9Var.currentAccount).a2(Long.valueOf(walletuseraddress.user_id));
        }
        bi.v3 v3Var = p9Var.a;
        if (v3Var != null) {
            v3Var.g3.O(true);
        }
        p9Var.C0();
        s8 s8Var = p9Var.w;
        if (s8Var != null) {
            s8Var.a(p9Var.h, p9Var.f);
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
            kVar.setTitle(hd.M0(2131743016, null));
        }
    }

    public final void B0(boolean z10) {
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) hd.M0(2131743084, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) hd.M0(2131743137, null));
            spannableStringBuilder.append((CharSequence) " >");
            eq eqVar = new eq(R.drawable.settings_arrow, 0);
            float N = org.telegram.messenger.g0.N(0.66f);
            eqVar.r = 0.0f;
            eqVar.s = N;
            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new hi.ha(this, 9), length, spannableStringBuilder.length(), 33);
            this.R.setText(spannableStringBuilder);
        }
        this.R.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(er.h).start();
    }

    public final void C0() {
        E0();
        if (this.I == null || this.e0 == null) {
            return;
        }
        l0 x10 = l0.x(this.currentAccount);
        long v = x10.v();
        long p02 = p0();
        long j3 = ((org.telegram.messenger.l0) np.s1(this.currentAccount).y7.l0.b).c;
        if (p02 > 0 && p02 < j3) {
            String l02 = this.l0 ? l0(j3, n0()) : q0(j3);
            this.F.setAmountText(l02);
            this.I.setSelection(l02.length());
            EditTextBoldCursor editTextBoldCursor = this.I;
            int i7 = -this.p0;
            this.p0 = i7;
            org.telegram.messenger.g0.F3(i7, editTextBoldCursor, null);
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
        this.e0.i(TextUtils.isEmpty(format) ? hd.M0(2131743020, null) : hd.V(null, null, 2131743021, l0.l("Grams", format, 2131749507)), true, true);
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
        spannableStringBuilder.append((CharSequence) hd.M0(2131749516, null));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
        h6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M));
    }

    public final void D0() {
        if (this.S == null) {
            return;
        }
        l0 x10 = l0.x(this.currentAccount);
        this.S.setText(hd.V(null, null, 2131743185, l0.l("Grams", l0.p(x10.v(), false), 2131749507)));
        boolean z10 = this.X;
        EditTextBoldCursor editTextBoldCursor = this.I;
        this.X = z10 | ((editTextBoldCursor == null || TextUtils.isEmpty(editTextBoldCursor.getText())) ? false : true);
        boolean z11 = (!x10.F() || l0.b(x10.t(), this.h)) && this.X;
        if (z11) {
            long j3 = this.f0;
            if (j3 >= 0) {
                this.U.setText(hd.V(null, null, 2131743072, l0.s(j3, false)));
            } else {
                this.U.setText(hd.V(null, null, 2131743072, this.V));
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
        this.Z.setInterpolator(er.h);
        this.Z.addUpdateListener(new q3(this, 8));
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
        final int i7 = 0;
        ViewPropertyAnimator duration = this.E.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.f9
            public final /* synthetic */ p9 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.b.E.setVisibility(z10 ? 0 : 4);
                        break;
                    default:
                        this.b.P.setVisibility(!z10 ? 0 : 4);
                        break;
                }
            }
        }).setDuration(320L);
        er erVar = er.h;
        duration.setInterpolator(erVar).start();
        final int i10 = 1;
        this.P.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.f9
            public final /* synthetic */ p9 b;

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
        }).setDuration(320L).setInterpolator(erVar).start();
    }

    public final void F0() {
        this.F.d(l0.x(this.currentAccount), this.l0);
    }

    public final void G0() {
        float f10 = this.c0;
        float f11 = 1.0f - f10;
        float max = Math.max(this.d0, Math.max(0.0f, Math.min(1.0f, f10)));
        this.d0 = max;
        float f12 = 1.0f - max;
        o9 o9Var = this.F;
        float f13 = this.c0;
        o9Var.e(f13, max, this.b0 == null && f13 == 1.0f);
        this.F.setTranslationY((((this.x.getHeight() / 2.0f) - this.F.getTop()) - (this.F.getHeight() / 2.0f)) * f11);
        this.O.setAlpha(this.d0);
        this.O.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.y.setAlpha(this.d0);
        this.y.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.a0.setAlpha(this.d0);
        for (int i7 = 0; i7 < this.a0.getChildCount(); i7++) {
            this.a0.getChildAt(i7).setTranslationY(org.telegram.messenger.g0.L(24.0f) * f12);
        }
    }

    @Override // org.telegram.ui.Components.r41
    public final CharSequence a0() {
        return hd.M0(2131743016, null);
    }

    @Override // org.telegram.ui.Components.r41
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        View createView = super.createView(context);
        this.fragmentView = createView;
        final int i7 = 1;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.q6.h(i10, view, getResourceProvider());
        org.telegram.ui.ActionBar.q6.h(i10, this.actionBar, getResourceProvider());
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(1, R.drawable.ic_ab_other);
        a10.setContentDescription(hd.M0(2131754839, null));
        final int i12 = 2;
        a10.e(2, R.drawable.msg_addbot, hd.M0(2131743137, null));
        a10.e(3, R.drawable.menu_comments, hd.M0(2131743205, null));
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 21));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        s8 s8Var = new s8(context, new y8(this, 5), new y8(this, 6), this.resourceProvider);
        this.w = s8Var;
        frameLayout.addView(s8Var, c8.ja.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        s8 s8Var2 = this.w;
        if (s8Var2 != null) {
            s8Var2.a(this.h, this.f);
        }
        hi.y4 y4Var = new hi.y4(this, context);
        this.x = y4Var;
        y4Var.setOrientation(1);
        this.x.setClipChildren(false);
        this.x.setClipToPadding(false);
        frameLayout.addView(this.x, c8.ja.e(-1, -2, 17));
        o9 o9Var = new o9(context, getResourceProvider());
        this.F = o9Var;
        if (o9Var.getDiamondView().f == null) {
            this.d0 = 1.0f;
            this.c0 = 1.0f;
        }
        this.x.addView(this.F, c8.ja.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.F.getEditText();
        this.I = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: org.telegram.ui.Wallet.h9
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i15).toString());
                sb2.append((Object) charSequence.subSequence(i13, i14));
                sb2.append((Object) spanned.subSequence(i16, spanned.length()));
                String sb3 = sb2.toString();
                int i17 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                p9 p9Var = p9.this;
                if (p9Var.l0) {
                    BigDecimal n02 = p9Var.n0();
                    valueOf = valueOf.multiply(n02);
                    i17 = p9.m0(n02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i17) {
                    return spanned.subSequence(i15, i16);
                }
                if (p9.v0(sb3).compareTo(valueOf) > 0) {
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
        this.I.setOnEditorActionListener(new t8(this, i7));
        this.I.addTextChangedListener(new i9(this, i11));
        long j3 = this.s;
        if (j3 > 0) {
            o9 o9Var2 = this.F;
            BigDecimal valueOf = BigDecimal.valueOf(j3, 9);
            o9Var2.setAmountText((valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros()).toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.I;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.M = new SpannableString("⇅");
        eq eqVar = new eq(R.drawable.wallet_currency_exchange, 0);
        eqVar.x = 0.72f;
        SpannableString spannableString = this.M;
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        this.N = new SpannableString("G");
        eq eqVar2 = new eq(R.drawable.wallet_gram_small, 0);
        eqVar2.d = false;
        SpannableString spannableString2 = this.N;
        spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true, true, true);
        this.O = h6Var;
        h6Var.c.m(0.35f, 320L, 3.5f, er.h);
        this.O.setScaleProperty(0.25f);
        this.O.setText(o0(l0.x(this.currentAccount), 0L));
        org.telegram.ui.Components.h6 h6Var2 = this.O;
        int i13 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(i10, i13);
        org.telegram.ui.ActionBar.q6.m(h6Var2, p10.a, p10.b, 4, 0.0f, getResourceProvider());
        this.O.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.O.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        this.O.setGravity(17);
        this.O.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.O.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.08f, getThemedColor(i13));
        org.telegram.ui.Components.h6 h6Var3 = this.O;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(14.0f), r12);
        this.G = d02;
        h6Var3.setSizeableBackground(d02);
        this.x.addView(this.O, c8.ja.t(-2, 28, 49, 0, 8, 0, 0));
        c8.na.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.x8
            public final /* synthetic */ p9 b;

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
                        p9.e0(this.b);
                        break;
                    case 2:
                        p9 p9Var = this.b;
                        BigDecimal n02 = p9Var.n0();
                        if (p9Var.l0 || n02.signum() > 0) {
                            long p02 = p9Var.p0();
                            p9Var.l0 = !p9Var.l0;
                            p9Var.F0();
                            String l02 = p02 <= 0 ? "" : p9Var.l0 ? p9Var.l0(p02, n02) : p9.q0(p02);
                            p9Var.F.setAmountText(l02);
                            p9Var.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        p9.d0(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        this.x.addView(frameLayout2, c8.ja.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        this.y.addView(this.E, c8.ja.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.P;
        int i14 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.U(textView2, i14, getResourceProvider());
        org.telegram.ui.ActionBar.q6.Q(this.P, org.telegram.ui.ActionBar.j6.b0(org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(i14)), org.telegram.ui.ActionBar.j6.r1(0.25f, getThemedColor(i14)), 14, 14), org.telegram.ui.ActionBar.q6.K(0.1f, i14), org.telegram.ui.ActionBar.q6.K(0.25f, i14), getResourceProvider());
        this.P.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131743137, null));
        spannableStringBuilder.append((CharSequence) " >");
        eq eqVar3 = new eq(R.drawable.settings_arrow, 0);
        float N = org.telegram.messenger.g0.N(0.66f);
        eqVar3.r = 0.0f;
        eqVar3.s = N;
        spannableStringBuilder.setSpan(eqVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.P.setText(spannableStringBuilder);
        this.y.addView(this.P, c8.ja.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        c8.na.a(this.P);
        final int i15 = 3;
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.x8
            public final /* synthetic */ p9 b;

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
                        p9.e0(this.b);
                        break;
                    case 2:
                        p9 p9Var = this.b;
                        BigDecimal n02 = p9Var.n0();
                        if (p9Var.l0 || n02.signum() > 0) {
                            long p02 = p9Var.p0();
                            p9Var.l0 = !p9Var.l0;
                            p9Var.F0();
                            String l02 = p02 <= 0 ? "" : p9Var.l0 ? p9Var.l0(p02, n02) : p9.q0(p02);
                            p9Var.F.setAmountText(l02);
                            p9Var.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        p9.d0(this.b);
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
        org.telegram.ui.ActionBar.r4 r4Var = new org.telegram.ui.ActionBar.r4(0, true, false, null);
        r4Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = r4Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i16 = org.telegram.ui.ActionBar.j6.bm;
        paint.setColor(getThemedColor(i16));
        r4Var.w = Integer.valueOf(getThemedColor(i16));
        this.Q.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        this.Q.setBackground(r4Var);
        this.H = r4Var;
        this.Q.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(this.Q, i13, getResourceProvider());
        this.Q.setTypeface(org.telegram.messenger.g0.o());
        this.Q.setEllipsize(TextUtils.TruncateAt.END);
        this.Q.setMaxLines(4);
        if (TextUtils.isEmpty(this.h0)) {
            this.Q.setVisibility(8);
        } else {
            this.Q.setText(this.h0);
            this.Q.setVisibility(0);
        }
        this.E.addView(this.Q, c8.ja.t(-2, -2, 49, 32, 12, 32, 0));
        this.Q.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.x8
            public final /* synthetic */ p9 b;

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
                        p9.e0(this.b);
                        break;
                    case 2:
                        p9 p9Var = this.b;
                        BigDecimal n02 = p9Var.n0();
                        if (p9Var.l0 || n02.signum() > 0) {
                            long p02 = p9Var.p0();
                            p9Var.l0 = !p9Var.l0;
                            p9Var.F0();
                            String l02 = p02 <= 0 ? "" : p9Var.l0 ? p9Var.l0(p02, n02) : p9.q0(p02);
                            p9Var.F.setAmountText(l02);
                            p9Var.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        p9.d0(this.b);
                        break;
                }
            }
        });
        c8.na.b(this.Q, 0.02f, 1.2f);
        E0();
        z70 z70Var = new z70(context, this.resourceProvider);
        this.R = z70Var;
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.q7, getResourceProvider());
        org.telegram.ui.ActionBar.q6.G(this.R, i14, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.R.setTypeface(org.telegram.messenger.g0.o());
        this.R.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        B0(false);
        this.E.addView(this.R, c8.ja.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        this.a0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        TextView textView3 = new TextView(context);
        this.S = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, i13, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.a0.addView(this.S, c8.ja.t(-1, -2, 55, 16, 0, 16, 0));
        this.T = new SpannableString(">");
        eq eqVar4 = new eq(R.drawable.settings_arrow, 0);
        float L = org.telegram.messenger.g0.L(1.0f);
        eqVar4.r = 0.0f;
        eqVar4.s = L;
        SpannableString spannableString3 = this.T;
        spannableString3.setSpan(eqVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(10, context, this);
        this.U = l2Var;
        org.telegram.ui.ActionBar.q6.U(l2Var, i13, getResourceProvider());
        this.U.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        this.U.setVisibility(8);
        this.a0.addView(this.U, c8.ja.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(hd.M0(2131748779, null));
        this.V = spannableString4;
        spannableString4.setSpan(new e80(org.telegram.messenger.g0.L(80.0f), this.U), 0, this.V.length(), 33);
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.e0 = dVar;
        dVar.setText(hd.M0(2131743020, null));
        this.e0.setEnabled(false);
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.x8
            public final /* synthetic */ p9 b;

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
                        p9.e0(this.b);
                        break;
                    case 2:
                        p9 p9Var = this.b;
                        BigDecimal n02 = p9Var.n0();
                        if (p9Var.l0 || n02.signum() > 0) {
                            long p02 = p9Var.p0();
                            p9Var.l0 = !p9Var.l0;
                            p9Var.F0();
                            String l02 = p02 <= 0 ? "" : p9Var.l0 ? p9Var.l0(p02, n02) : p9.q0(p02);
                            p9Var.F.setAmountText(l02);
                            p9Var.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        p9.d0(this.b);
                        break;
                }
            }
        });
        this.a0.addView(this.e0, c8.ja.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.a0, c8.ja.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.a4) {
            D0();
            C0();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        try {
            ShapeDrawable shapeDrawable = this.G;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.j6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.j6.z6)));
                this.G.invalidateSelf();
                org.telegram.ui.Components.h6 h6Var = this.O;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
            }
            if (this.H != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.bm);
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
        o9 o9Var = this.F;
        if (o9Var != null) {
            o9Var.getDiamondView().l(null);
        }
        r1.g gVar = this.b0;
        if (gVar != null) {
            gVar.d();
        }
        this.c0 = 1.0f;
        if (this.F != null) {
            G0();
        }
    }

    public final String l0(long j3, BigDecimal bigDecimal) {
        BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate s02 = s0();
        int max = Math.max(0, Math.min(s02 != null ? s02.exp : TextUtils.equals(l0.x(this.currentAccount).h.g(), "USD") ? 2 : 0, 20));
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
        f fVar = l0.x(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.i0) np.s1(this.currentAccount).y7.l.b).a;
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    public final SpannableStringBuilder o0(l0 l0Var, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.m(j3, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate s02 = s0();
        z0(spannableStringBuilder, length, length2, (s02 == null || TextUtils.isEmpty(s02.decimalSeparator)) ? '.' : s02.decimalSeparator.charAt(0));
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        o9 o9Var;
        View view2;
        if (!z10 && this.u0 != null && (wallettransaction = this.r0) != null && wallettransaction.localMessageId != 0 && (o9Var = this.F) != null) {
            w6 diamondView = o9Var.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                o6 o6Var = new o6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.u0, this.r0, runnable, null);
                this.v0 = o6Var;
                return o6Var.m;
            }
        }
        if (z10 || this.s0 == null || this.r0 == null || this.F == null || (view = this.fragmentView) == null || !(view.getParent() instanceof View) || getParentLayout() == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        da daVar = new da(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.s0, this.r0, runnable, null);
        this.t0 = daVar;
        return daVar.m;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.a4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        this.J = false;
        k0();
        o6 o6Var = this.v0;
        if (o6Var != null) {
            AnimatorSet animatorSet = o6Var.m;
            if (!o6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    o6Var.a(false);
                }
            }
            this.v0 = null;
        }
        da daVar = this.t0;
        if (daVar != null) {
            AnimatorSet animatorSet2 = daVar.m;
            if (!daVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    daVar.b();
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
        getNotificationCenter().n(this, ns.a4);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.j0 = i12;
        if (this.a0 == null) {
            return;
        }
        int max = Math.max(0, this.k0 - i12);
        this.a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f) + this.j0);
        if (this.w0 != max) {
            this.a0.animate().cancel();
            this.a0.animate().translationY(-max).setDuration(320L).setInterpolator(er.h).start();
            this.w0 = max;
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.k0 = k1Var.a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override // org.telegram.ui.ActionBar.e2
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        t0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
            LinearLayout linearLayout = this.a0;
            if (linearLayout == null || themedColor == this.x0 || !(linearLayout.getBackground() instanceof GradientDrawable)) {
                return;
            }
            this.x0 = themedColor;
            ((GradientDrawable) this.a0.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, themedColor), themedColor, themedColor});
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        o9 o9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (o9Var = this.F) != null && this.c0 < 1.0f) {
            o9Var.getDiamondView().l(new y8(this, 1));
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
        f fVar = l0.x(this.currentAccount).h;
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
            this.f0 = -1L;
            D0();
            l0 x10 = l0.x(this.currentAccount);
            if (!x10.F() || l0.b(x10.t(), this.h) || this.f == null || !TextUtils.isEmpty(this.n)) {
                x10.i(this.h, 0L, this.h0, this.i0 ? r0() : null, new a9(this, 1));
            }
        }
    }

    public final void u0() {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        boolean z10 = this.k0 - this.j0 > org.telegram.messenger.g0.L(20.0f);
        AlertDialog$Builder v1Var = z10 ? new org.telegram.ui.ActionBar.v1(0, parentActivity, getResourceProvider()) : new AlertDialog$Builder(0, parentActivity, getResourceProvider());
        String M0 = hd.M0(2131743205, null);
        org.telegram.ui.ActionBar.t1 t1Var = v1Var.a;
        t1Var.S = M0;
        final kg.x0 x0Var = new kg.x0(this, parentActivity);
        x0Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(x0Var, org.telegram.ui.ActionBar.j6.j5, getResourceProvider());
        org.telegram.ui.ActionBar.q6.D(x0Var, org.telegram.ui.ActionBar.j6.t5, getResourceProvider());
        x0Var.setHint(hd.M0(2131743169, null));
        x0Var.setText(this.h0);
        x0Var.setSelection(x0Var.length());
        x0Var.setInputType(147457);
        x0Var.setMaxLines(5);
        int i7 = 6;
        x0Var.setImeOptions(6);
        org.telegram.ui.ActionBar.q6.F(x0Var, org.telegram.ui.ActionBar.j6.k6, org.telegram.ui.ActionBar.j6.l6, org.telegram.ui.ActionBar.j6.p7, getResourceProvider());
        x0Var.setBackground(null);
        x0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, getResourceProvider());
        int i10 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i10, this.resourceProvider), 7, org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        c2Var.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(c2Var, h02, null, M, e6Var);
        c2Var.e(hd.M0(2131743077, null), "", !this.i0 || r0() == null, false, false);
        c2Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.gravity = (hd.a0 ? 5 : 3) | 16;
        c2Var.getCheckBoxView().setLayoutParams(layoutParams);
        c2Var.setPadding(hd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), hd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        c2Var.setEnabled(r0() != null);
        c2Var.setOnClickListener(new g3(c2Var, i7));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.addView(x0Var, c8.ja.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        linearLayout.addView(c2Var, c8.ja.t(-1, -2, 83, 8, 0, 8, 0));
        t1Var.H = 6;
        v1Var.o(linearLayout);
        t1Var.a = org.telegram.messenger.g0.L(292.0f);
        v1Var.h(hd.M0(2131752589, null), new t70(19));
        int i11 = 2;
        v1Var.k(hd.M0(2131754486, null), new j8(this, x0Var, c2Var, i11));
        t1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Wallet.b9
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                kg.x0 x0Var2 = kg.x0.this;
                x0Var2.requestFocus();
                org.telegram.messenger.g0.J3(x0Var2);
            }
        });
        t1Var.setOnDismissListener(new j2(this, i11));
        if (z10) {
            t1Var.r(250L);
        } else {
            t1Var.show();
        }
        t1Var.k0 = false;
        View d = t1Var.d(-1);
        if (!(d instanceof TextView) || TextUtils.isEmpty(this.h0)) {
            return;
        }
        x0Var.addTextChangedListener(new bi.l3(x0Var, (TextView) d));
    }

    public final void w0() {
        org.telegram.ui.ActionBar.o4 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i5.c.h(1, arrayList) != this) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
            if (e2Var instanceof z9) {
                ((ActionBarLayout) parentLayout).d0(e2Var, false);
            }
        }
        List fragmentStack = parentLayout.getFragmentStack();
        if (fragmentStack.size() >= 2 && (r.b.h(2, fragmentStack) instanceof y5) && ((org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
            this.s0 = (y5) r.b.h(2, fragmentStack);
        } else {
            y5 y5Var = new y5();
            y5Var.setCurrentAccount(this.currentAccount);
            if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, y5Var)) {
                this.s0 = y5Var;
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

    public p9(String str) {
        this(m10.t0, str);
    }

    public p9(int i7, String str) {
        this.s = 0L;
        this.K = new y8(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.z8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                p9 p9Var = p9.this;
                Runnable runnable = p9Var.K;
                if (z10 && p9Var.J && (editTextBoldCursor = p9Var.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    p9Var.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        setCurrentAccount(i7);
        this.f = null;
        this.h = str;
        t0();
        this.r = true;
        l0.x(this.currentAccount).Z(new a9(this, 0), str);
    }

    @Override // org.telegram.ui.Components.r41
    public final void Z(ArrayList arrayList, p41 p41Var) {
    }

    @Override // org.telegram.ui.Components.r41
    public final void b0(b41 b41Var, View view) {
    }
}
