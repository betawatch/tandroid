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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o80;
import org.telegram.ui.bn;
import org.telegram.ui.gs0;
import org.telegram.ui.l60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class ea extends d51 implements fs {
    public LinearLayout E;
    public da F;
    public ShapeDrawable G;
    public org.telegram.ui.ActionBar.u4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public final Runnable K;
    public final ViewTreeObserver.OnWindowFocusChangeListener L;
    public SpannableString M;
    public SpannableString N;
    public org.telegram.ui.Components.n6 O;
    public TextView P;
    public TextView Q;
    public j80 R;
    public TextView S;
    public SpannableString T;
    public org.telegram.ui.ActionBar.n2 U;
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
    public hi.e e0;
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
    public o6 s0;
    public sa t0;
    public bn u0;
    public f7 v0;
    public h9 w;
    public int w0;
    public hi.i5 x;
    public int x0;
    public FrameLayout y;

    public ea(TLRPC.User user) {
        this.s = 0L;
        this.K = new o9(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.p9
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                ea eaVar = ea.this;
                Runnable runnable = eaVar.K;
                if (z10 && eaVar.J && (editTextBoldCursor = eaVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    eaVar.I.post(runnable);
                }
            }
        };
        this.f0 = -1L;
        this.i0 = true;
        this.p0 = 6;
        this.f = user;
        this.h = null;
        this.r = true;
        v0.D(this.currentAccount).j0(user, new q9(this, 2));
    }

    public static void d0(ea eaVar) {
        o6.N0(eaVar.currentAccount, eaVar.getParentActivity(), eaVar.getResourceProvider());
    }

    public static void e0(final ea eaVar) {
        hi.e eVar = eaVar.e0;
        if (!eVar.e0 || eVar.R) {
            return;
        }
        final v0 D = v0.D(eaVar.currentAccount);
        long p02 = eaVar.p0();
        long A = D.A();
        if (eaVar.r || !WalletEngine2.isValidRecipientAddress(eaVar.h) || p02 <= 0) {
            return;
        }
        long j3 = ((org.telegram.messenger.l0) mp.u1(eaVar.currentAccount).A7.r0.b).c;
        if (p02 < j3) {
            String l02 = eaVar.l0 ? eaVar.l0(j3, eaVar.n0()) : q0(j3);
            eaVar.F.setAmountText(l02);
            eaVar.I.setSelection(l02.length());
            EditTextBoldCursor editTextBoldCursor = eaVar.I;
            int i7 = -eaVar.p0;
            eaVar.p0 = i7;
            org.telegram.messenger.g0.E3(i7, editTextBoldCursor, null);
            return;
        }
        if (p02 > A) {
            org.telegram.messenger.q2.E.a();
            j80 j80Var = eaVar.R;
            int i10 = -eaVar.p0;
            eaVar.p0 = i10;
            org.telegram.messenger.g0.E3(i10, j80Var, null);
            return;
        }
        long j10 = eaVar.f0;
        if (j10 >= 0 && p02 + j10 > A) {
            p02 -= j10;
        }
        eaVar.J = false;
        EditTextBoldCursor editTextBoldCursor2 = eaVar.I;
        if (editTextBoldCursor2 != null) {
            editTextBoldCursor2.removeCallbacks(eaVar.K);
            eaVar.fragmentView.requestFocus();
            org.telegram.messenger.g0.v1(eaVar.I);
        }
        eaVar.e0.setLoading(true);
        eaVar.r0 = null;
        if (eaVar.f != null && TextUtils.isEmpty(eaVar.n)) {
            eaVar.q0 = true;
            D.m0(eaVar.f, eaVar.h, p02, eaVar.h0, eaVar.i0 ? eaVar.r0() : null, null, null, new s9(eaVar, 0), new s9(eaVar, 1));
            return;
        }
        final String str = eaVar.h0;
        byte[] r02 = eaVar.i0 ? eaVar.r0() : null;
        boolean z10 = r02 != null;
        if (!D.M()) {
            final long j11 = p02;
            final boolean z11 = z10;
            D.m(eaVar.h, j11, str, r02, new p10() { // from class: org.telegram.ui.Wallet.u9
                @Override // org.telegram.messenger.p10
                public final void a(Object obj, Object obj2) {
                    TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                    String str2 = (String) obj2;
                    ea eaVar2 = ea.this;
                    if (str2 != null) {
                        eaVar2.e0.setLoading(false);
                        kc.b0(eaVar2).f0(str2, false);
                        return;
                    }
                    wallettransaction.peer = v0.i(eaVar2.f, eaVar2.h, eaVar2.n);
                    wallettransaction.comment = str;
                    wallettransaction.comment_encrypted = z11;
                    wallettransaction.date = eaVar2.getConnectionsManager().getCurrentTime();
                    org.telegram.messenger.g0.v1(eaVar2.I);
                    o6.K0(eaVar2.getParentActivity(), eaVar2.getCurrentAccount(), wallettransaction, new t9(eaVar2, D, j11, 1), new q9(eaVar2, 4), eaVar2.r0(), null, eaVar2.getResourceProvider());
                    org.telegram.messenger.g0.h3(new o9(eaVar2, 3), 1000L);
                }
            });
            return;
        }
        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
        wallettransaction.peer = v0.i(eaVar.f, eaVar.h, eaVar.n);
        wallettransaction.comment = str;
        wallettransaction.comment_encrypted = z10;
        wallettransaction.date = eaVar.getConnectionsManager().getCurrentTime();
        wallettransaction.fee = Math.max(0L, eaVar.f0);
        wallettransaction.gasless = true;
        wallettransaction.amount = p02;
        org.telegram.messenger.g0.v1(eaVar.I);
        o6.K0(eaVar.getParentActivity(), eaVar.getCurrentAccount(), wallettransaction, new t9(eaVar, D, p02, 0), new q9(eaVar, 3), eaVar.r0(), null, eaVar.getResourceProvider());
        org.telegram.messenger.g0.h3(new o9(eaVar, 2), 1000L);
    }

    public static void f0(ea eaVar, String str) {
        if (v0.L(str)) {
            eaVar.q0 = false;
            eaVar.e0.setLoading(false);
            return;
        }
        if (str != null) {
            eaVar.q0 = false;
            eaVar.e0.setLoading(false);
            kc.b0(eaVar).f0(str, false);
            return;
        }
        if (!eaVar.g0) {
            eaVar.w0();
            return;
        }
        org.telegram.ui.ActionBar.r4 parentLayout = eaVar.getParentLayout();
        if (parentLayout == null) {
            eaVar.finishFragment();
            return;
        }
        long j3 = eaVar.f.id;
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (arrayList.isEmpty() || i5.c.h(1, arrayList) != eaVar) {
            return;
        }
        int size = arrayList.size() - 2;
        while (true) {
            if (size < 0) {
                break;
            }
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) arrayList.get(size);
            if ((g2Var instanceof bn) && g2Var.getCurrentAccount() == eaVar.currentAccount) {
                bn bnVar = (bn) g2Var;
                if (bnVar.a() == j3 && bnVar.g4 == 0) {
                    eaVar.u0 = bnVar;
                    for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                        ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.g2) arrayList.get(size2), false);
                    }
                }
            }
            size--;
        }
        if (eaVar.u0 == null) {
            eaVar.getNotificationCenter().k(ks.v, Long.valueOf(j3), Boolean.FALSE);
            bn ua2 = bn.ua(j3);
            ua2.setCurrentAccount(eaVar.currentAccount);
            if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ua2)) {
                eaVar.finishFragment();
                return;
            }
            eaVar.u0 = ua2;
        }
        eaVar.finishFragment();
    }

    public static void g0(ea eaVar, TL_wallet.walletUserAddress walletuseraddress) {
        eaVar.r = false;
        eaVar.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            eaVar.f = mp.u1(eaVar.currentAccount).c2(Long.valueOf(walletuseraddress.user_id));
        }
        bi.i6 i6Var = eaVar.a;
        if (i6Var != null) {
            i6Var.g3.O(true);
        }
        eaVar.C0();
        h9 h9Var = eaVar.w;
        if (h9Var != null) {
            h9Var.a(eaVar.h, eaVar.f);
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
            kVar.setTitle(gd.N0(2131742745, null));
        }
    }

    public final void B0(boolean z10) {
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) gd.N0(2131742832, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) gd.N0(2131742886, null));
            spannableStringBuilder.append((CharSequence) " >");
            kq kqVar = new kq(R.drawable.settings_arrow, 0);
            float N = org.telegram.messenger.g0.N(0.66f);
            kqVar.r = 0.0f;
            kqVar.s = N;
            spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new hi.cb(this, 9), length, spannableStringBuilder.length(), 33);
            this.R.setText(spannableStringBuilder);
        }
        this.R.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(kr.h).start();
    }

    public final void C0() {
        E0();
        if (this.I == null || this.e0 == null) {
            return;
        }
        v0 D = v0.D(this.currentAccount);
        long A = D.A();
        long p02 = p0();
        long j3 = ((org.telegram.messenger.l0) mp.u1(this.currentAccount).A7.r0.b).c;
        if (p02 > 0 && p02 < j3) {
            String l02 = this.l0 ? l0(j3, n0()) : q0(j3);
            this.F.setAmountText(l02);
            this.I.setSelection(l02.length());
            EditTextBoldCursor editTextBoldCursor = this.I;
            int i7 = -this.p0;
            this.p0 = i7;
            org.telegram.messenger.g0.E3(i7, editTextBoldCursor, null);
            return;
        }
        boolean z10 = WalletEngine2.isValidRecipientAddress(this.h) && !this.r && p02 > 0 && p02 <= A;
        B0(!TextUtils.isEmpty(this.I.getText()) && p02 > A);
        long p03 = p0();
        if (this.n0 == null) {
            this.n0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
        }
        String format = p03 > 0 ? this.n0.format(BigDecimal.valueOf(p03, 9)) : "";
        this.e0.setLoading(this.r || this.q0);
        this.e0.i(TextUtils.isEmpty(format) ? gd.N0(2131742749, null) : gd.V(null, null, 2131742750, v0.q("Grams", format, 2131749314)), true, true);
        this.e0.setEnabled(z10);
        D0();
        F0();
        if (!this.l0) {
            this.O.setText(o0(D, p02));
            return;
        }
        org.telegram.ui.Components.n6 n6Var = this.O;
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
        spannableStringBuilder.append((CharSequence) gd.N0(2131749340, null));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
        n6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M));
    }

    public final void D0() {
        if (this.S == null) {
            return;
        }
        v0 D = v0.D(this.currentAccount);
        this.S.setText(gd.V(null, null, 2131742934, v0.q("Grams", v0.u(D.A(), false), 2131749314)));
        boolean z10 = this.X;
        EditTextBoldCursor editTextBoldCursor = this.I;
        this.X = z10 | ((editTextBoldCursor == null || TextUtils.isEmpty(editTextBoldCursor.getText())) ? false : true);
        boolean z11 = (!D.M() || v0.c(D.y(), this.h)) && this.X;
        if (z11) {
            long j3 = this.f0;
            if (j3 >= 0) {
                this.U.setText(gd.V(null, null, 2131742820, v0.x(j3, false)));
            } else {
                this.U.setText(gd.V(null, null, 2131742820, this.V));
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
        this.Z.setInterpolator(kr.h);
        this.Z.addUpdateListener(new a4(this, 8));
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
        ViewPropertyAnimator duration = this.E.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.v9
            public final /* synthetic */ ea b;

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
        kr krVar = kr.h;
        duration.setInterpolator(krVar).start();
        final int i10 = 1;
        this.P.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).withEndAction(new Runnable(this) { // from class: org.telegram.ui.Wallet.v9
            public final /* synthetic */ ea b;

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
        }).setDuration(320L).setInterpolator(krVar).start();
    }

    public final void F0() {
        this.F.d(v0.D(this.currentAccount), this.l0);
    }

    public final void G0() {
        float f10 = this.c0;
        float f11 = 1.0f - f10;
        float max = Math.max(this.d0, Math.max(0.0f, Math.min(1.0f, f10)));
        this.d0 = max;
        float f12 = 1.0f - max;
        da daVar = this.F;
        float f13 = this.c0;
        daVar.e(f13, max, this.b0 == null && f13 == 1.0f);
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

    @Override // org.telegram.ui.Components.d51
    public final CharSequence a0() {
        return gd.N0(2131742745, null);
    }

    @Override // org.telegram.ui.Components.d51
    public final boolean c0(n41 n41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d51, org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        View createView = super.createView(context);
        this.fragmentView = createView;
        final int i7 = 1;
        createView.setFocusableInTouchMode(true);
        this.a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.u6.h(i10, view, getResourceProvider());
        org.telegram.ui.ActionBar.u6.h(i10, this.actionBar, getResourceProvider());
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(1, R.drawable.ic_ab_other);
        a10.setContentDescription(gd.N0(2131754838, null));
        final int i12 = 2;
        a10.e(2, R.drawable.msg_addbot, gd.N0(2131742886, null));
        a10.e(3, R.drawable.menu_comments, gd.N0(2131742954, null));
        this.actionBar.setActionBarMenuOnItemClick(new gs0(this, 23));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        h9 h9Var = new h9(context, new o9(this, 5), new o9(this, 6), this.resourceProvider);
        this.w = h9Var;
        frameLayout.addView(h9Var, c8.na.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        h9 h9Var2 = this.w;
        if (h9Var2 != null) {
            h9Var2.a(this.h, this.f);
        }
        hi.i5 i5Var = new hi.i5(this, context);
        this.x = i5Var;
        i5Var.setOrientation(1);
        this.x.setClipChildren(false);
        this.x.setClipToPadding(false);
        frameLayout.addView(this.x, c8.na.e(-1, -2, 17));
        da daVar = new da(context, getResourceProvider());
        this.F = daVar;
        if (daVar.getDiamondView().f == null) {
            this.d0 = 1.0f;
            this.c0 = 1.0f;
        }
        this.x.addView(this.F, c8.na.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.F.getEditText();
        this.I = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: org.telegram.ui.Wallet.x9
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i13, int i14, Spanned spanned, int i15, int i16) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i15).toString());
                sb2.append((Object) charSequence.subSequence(i13, i14));
                sb2.append((Object) spanned.subSequence(i16, spanned.length()));
                String sb3 = sb2.toString();
                int i17 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                ea eaVar = ea.this;
                if (eaVar.l0) {
                    BigDecimal n02 = eaVar.n0();
                    valueOf = valueOf.multiply(n02);
                    i17 = ea.m0(n02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i17) {
                    return spanned.subSequence(i15, i16);
                }
                if (ea.v0(sb3).compareTo(valueOf) > 0) {
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
        this.I.setOnEditorActionListener(new i9(this, i7));
        this.I.addTextChangedListener(new j9(this, i7));
        long j3 = this.s;
        if (j3 > 0) {
            da daVar2 = this.F;
            BigDecimal valueOf = BigDecimal.valueOf(j3, 9);
            daVar2.setAmountText((valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros()).toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.I;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.M = new SpannableString("⇅");
        kq kqVar = new kq(R.drawable.wallet_currency_exchange, 0);
        kqVar.x = 0.72f;
        SpannableString spannableString = this.M;
        spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
        this.N = new SpannableString("G");
        kq kqVar2 = new kq(R.drawable.wallet_gram_small, 0);
        kqVar2.d = false;
        SpannableString spannableString2 = this.N;
        spannableString2.setSpan(kqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true, true, true);
        this.O = n6Var;
        n6Var.c.m(0.35f, 320L, 3.5f, kr.h);
        this.O.setScaleProperty(0.25f);
        this.O.setText(o0(v0.D(this.currentAccount), 0L));
        org.telegram.ui.Components.n6 n6Var2 = this.O;
        int i13 = org.telegram.ui.ActionBar.n6.z6;
        org.telegram.ui.ActionBar.q6 p10 = org.telegram.ui.ActionBar.u6.p(i10, i13);
        org.telegram.ui.ActionBar.u6.m(n6Var2, p10.a, p10.b, 4, 0.0f, getResourceProvider());
        this.O.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.O.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        this.O.setGravity(17);
        this.O.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.O.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.08f, getThemedColor(i13));
        org.telegram.ui.Components.n6 n6Var3 = this.O;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(14.0f), r12);
        this.G = d02;
        n6Var3.setSizeableBackground(d02);
        this.x.addView(this.O, c8.na.t(-2, 28, 49, 0, 8, 0, 0));
        c8.sa.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.n9
            public final /* synthetic */ ea b;

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
                        ea.e0(this.b);
                        break;
                    case 2:
                        ea eaVar = this.b;
                        BigDecimal n02 = eaVar.n0();
                        if (eaVar.l0 || n02.signum() > 0) {
                            long p02 = eaVar.p0();
                            eaVar.l0 = !eaVar.l0;
                            eaVar.F0();
                            String l02 = p02 <= 0 ? "" : eaVar.l0 ? eaVar.l0(p02, n02) : ea.q0(p02);
                            eaVar.F.setAmountText(l02);
                            eaVar.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        ea.d0(this.b);
                        break;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        this.x.addView(frameLayout2, c8.na.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        this.y.addView(this.E, c8.na.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.P;
        int i14 = org.telegram.ui.ActionBar.n6.Fi;
        org.telegram.ui.ActionBar.u6.U(textView2, i14, getResourceProvider());
        org.telegram.ui.ActionBar.u6.Q(this.P, org.telegram.ui.ActionBar.n6.b0(org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(i14)), org.telegram.ui.ActionBar.n6.r1(0.25f, getThemedColor(i14)), 14, 14), org.telegram.ui.ActionBar.u6.K(0.1f, i14), org.telegram.ui.ActionBar.u6.K(0.25f, i14), getResourceProvider());
        this.P.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131742886, null));
        spannableStringBuilder.append((CharSequence) " >");
        kq kqVar3 = new kq(R.drawable.settings_arrow, 0);
        float N = org.telegram.messenger.g0.N(0.66f);
        kqVar3.r = 0.0f;
        kqVar3.s = N;
        spannableStringBuilder.setSpan(kqVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.P.setText(spannableStringBuilder);
        this.y.addView(this.P, c8.na.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        c8.sa.a(this.P);
        final int i15 = 3;
        this.P.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.n9
            public final /* synthetic */ ea b;

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
                        ea.e0(this.b);
                        break;
                    case 2:
                        ea eaVar = this.b;
                        BigDecimal n02 = eaVar.n0();
                        if (eaVar.l0 || n02.signum() > 0) {
                            long p02 = eaVar.p0();
                            eaVar.l0 = !eaVar.l0;
                            eaVar.F0();
                            String l02 = p02 <= 0 ? "" : eaVar.l0 ? eaVar.l0(p02, n02) : ea.q0(p02);
                            eaVar.F.setAmountText(l02);
                            eaVar.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        ea.d0(this.b);
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
        org.telegram.ui.ActionBar.u4 u4Var = new org.telegram.ui.ActionBar.u4(0, true, false, null);
        u4Var.x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = u4Var.c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i16 = org.telegram.ui.ActionBar.n6.bm;
        paint.setColor(getThemedColor(i16));
        u4Var.w = Integer.valueOf(getThemedColor(i16));
        this.Q.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        this.Q.setBackground(u4Var);
        this.H = u4Var;
        this.Q.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(this.Q, i13, getResourceProvider());
        this.Q.setTypeface(org.telegram.messenger.g0.o());
        this.Q.setEllipsize(TextUtils.TruncateAt.END);
        this.Q.setMaxLines(4);
        if (TextUtils.isEmpty(this.h0)) {
            this.Q.setVisibility(8);
        } else {
            this.Q.setText(this.h0);
            this.Q.setVisibility(0);
        }
        this.E.addView(this.Q, c8.na.t(-2, -2, 49, 32, 12, 32, 0));
        this.Q.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.n9
            public final /* synthetic */ ea b;

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
                        ea.e0(this.b);
                        break;
                    case 2:
                        ea eaVar = this.b;
                        BigDecimal n02 = eaVar.n0();
                        if (eaVar.l0 || n02.signum() > 0) {
                            long p02 = eaVar.p0();
                            eaVar.l0 = !eaVar.l0;
                            eaVar.F0();
                            String l02 = p02 <= 0 ? "" : eaVar.l0 ? eaVar.l0(p02, n02) : ea.q0(p02);
                            eaVar.F.setAmountText(l02);
                            eaVar.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        ea.d0(this.b);
                        break;
                }
            }
        });
        c8.sa.b(this.Q, 0.02f, 1.2f);
        E0();
        j80 j80Var = new j80(context, this.resourceProvider);
        this.R = j80Var;
        org.telegram.ui.ActionBar.u6.U(j80Var, org.telegram.ui.ActionBar.n6.q7, getResourceProvider());
        org.telegram.ui.ActionBar.u6.G(this.R, i14, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.R.setTypeface(org.telegram.messenger.g0.o());
        this.R.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        B0(false);
        this.E.addView(this.R, c8.na.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        this.a0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        TextView textView3 = new TextView(context);
        this.S = textView3;
        org.telegram.ui.ActionBar.u6.U(textView3, i13, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.a0.addView(this.S, c8.na.t(-1, -2, 55, 16, 0, 16, 0));
        this.T = new SpannableString(">");
        kq kqVar4 = new kq(R.drawable.settings_arrow, 0);
        float L = org.telegram.messenger.g0.L(1.0f);
        kqVar4.r = 0.0f;
        kqVar4.s = L;
        SpannableString spannableString3 = this.T;
        spannableString3.setSpan(kqVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(10, context, this);
        this.U = n2Var;
        org.telegram.ui.ActionBar.u6.U(n2Var, i13, getResourceProvider());
        this.U.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        this.U.setVisibility(8);
        this.a0.addView(this.U, c8.na.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(gd.N0(2131748586, null));
        this.V = spannableString4;
        spannableString4.setSpan(new o80(org.telegram.messenger.g0.L(80.0f), this.U), 0, this.V.length(), 33);
        hi.e eVar = new hi.e(context, getResourceProvider(), true);
        eVar.setRoundRadius(24);
        this.e0 = eVar;
        eVar.setText(gd.N0(2131742749, null));
        this.e0.setEnabled(false);
        this.e0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Wallet.n9
            public final /* synthetic */ ea b;

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
                        ea.e0(this.b);
                        break;
                    case 2:
                        ea eaVar = this.b;
                        BigDecimal n02 = eaVar.n0();
                        if (eaVar.l0 || n02.signum() > 0) {
                            long p02 = eaVar.p0();
                            eaVar.l0 = !eaVar.l0;
                            eaVar.F0();
                            String l02 = p02 <= 0 ? "" : eaVar.l0 ? eaVar.l0(p02, n02) : ea.q0(p02);
                            eaVar.F.setAmountText(l02);
                            eaVar.I.setSelection(l02.length());
                            break;
                        }
                        break;
                    default:
                        ea.d0(this.b);
                        break;
                }
            }
        });
        this.a0.addView(this.e0, c8.na.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.a0, c8.na.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.d4) {
            D0();
            C0();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        try {
            ShapeDrawable shapeDrawable = this.G;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.n6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.n6.z6)));
                this.G.invalidateSelf();
                org.telegram.ui.Components.n6 n6Var = this.O;
                if (n6Var != null) {
                    n6Var.invalidate();
                }
            }
            if (this.H != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.bm);
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
        da daVar = this.F;
        if (daVar != null) {
            daVar.getDiamondView().l(null);
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
        int max = Math.max(0, Math.min(s02 != null ? s02.exp : TextUtils.equals(v0.D(this.currentAccount).h.g(), "USD") ? 2 : 0, 20));
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
        g gVar = v0.D(this.currentAccount).h;
        gVar.f();
        double h = gVar.h();
        double d = ((org.telegram.messenger.i0) mp.u1(this.currentAccount).A7.l.b).a;
        return (h <= 0.0d || d <= 0.0d || Double.isNaN(h) || Double.isInfinite(h) || Double.isNaN(d) || Double.isInfinite(d)) ? BigDecimal.ZERO : BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
    }

    public final SpannableStringBuilder o0(v0 v0Var, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(v0Var.r(j3, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate s02 = s0();
        z0(spannableStringBuilder, length, length2, (s02 == null || TextUtils.isEmpty(s02.decimalSeparator)) ? '.' : s02.decimalSeparator.charAt(0));
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        da daVar;
        View view2;
        if (!z10 && this.u0 != null && (wallettransaction = this.r0) != null && wallettransaction.localMessageId != 0 && (daVar = this.F) != null) {
            n7 diamondView = daVar.getDiamondView();
            if (diamondView.f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                f7 f7Var = new f7(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.u0, this.r0, runnable, null);
                this.v0 = f7Var;
                return f7Var.m;
            }
        }
        if (z10 || this.s0 == null || this.r0 == null || this.F == null || (view = this.fragmentView) == null || !(view.getParent() instanceof View) || getParentLayout() == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        sa saVar = new sa(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.s0, this.r0, runnable, null);
        this.t0 = saVar;
        return saVar.m;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.d4);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        this.J = false;
        k0();
        f7 f7Var = this.v0;
        if (f7Var != null) {
            AnimatorSet animatorSet = f7Var.m;
            if (!f7Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    f7Var.a(false);
                }
            }
            this.v0 = null;
        }
        sa saVar = this.t0;
        if (saVar != null) {
            AnimatorSet animatorSet2 = saVar.m;
            if (!saVar.s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    saVar.b();
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
        getNotificationCenter().n(this, ks.d4);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.j0 = i12;
        if (this.a0 == null) {
            return;
        }
        int max = Math.max(0, this.k0 - i12);
        this.a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f) + this.j0);
        if (this.w0 != max) {
            this.a0.animate().cancel();
            this.a0.animate().translationY(-max).setDuration(320L).setInterpolator(kr.h).start();
            this.w0 = max;
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.k0 = l1Var.a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        t0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.d6);
            LinearLayout linearLayout = this.a0;
            if (linearLayout == null || themedColor == this.x0 || !(linearLayout.getBackground() instanceof GradientDrawable)) {
                return;
            }
            this.x0 = themedColor;
            ((GradientDrawable) this.a0.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, themedColor), themedColor, themedColor});
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        da daVar;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (daVar = this.F) != null && this.c0 < 1.0f) {
            daVar.getDiamondView().l(new o9(this, 1));
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
        g gVar = v0.D(this.currentAccount).h;
        TL_wallet.currencyRates f10 = gVar.f();
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
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, gVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    public final void t0() {
        if (WalletEngine2.isValidRecipientAddress(this.h)) {
            this.f0 = -1L;
            D0();
            v0 D = v0.D(this.currentAccount);
            if (!D.M() || v0.c(D.y(), this.h) || this.f == null || !TextUtils.isEmpty(this.n)) {
                D.m(this.h, 0L, this.h0, this.i0 ? r0() : null, new q9(this, 1));
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
        String N0 = gd.N0(2131742954, null);
        org.telegram.ui.ActionBar.t1 t1Var = v1Var.a;
        t1Var.S = N0;
        final kg.z0 z0Var = new kg.z0(this, parentActivity);
        z0Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.u6.U(z0Var, org.telegram.ui.ActionBar.n6.j5, getResourceProvider());
        org.telegram.ui.ActionBar.u6.D(z0Var, org.telegram.ui.ActionBar.n6.t5, getResourceProvider());
        z0Var.setHint(gd.N0(2131742918, null));
        z0Var.setText(this.h0);
        z0Var.setSelection(z0Var.length());
        z0Var.setInputType(147457);
        z0Var.setMaxLines(5);
        int i7 = 6;
        z0Var.setImeOptions(6);
        org.telegram.ui.ActionBar.u6.F(z0Var, org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, getResourceProvider());
        z0Var.setBackground(null);
        z0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, parentActivity, getResourceProvider());
        int i10 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i10, this.resourceProvider), 7, org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.i6 i6Var = this.resourceProvider;
        d2Var.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(d2Var, h02, null, M, i6Var);
        d2Var.e(gd.N0(2131742825, null), "", !this.i0 || r0() == null, false, false);
        d2Var.setMultiline(true);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
        layoutParams.topMargin = 0;
        layoutParams.gravity = (gd.a0 ? 5 : 3) | 16;
        d2Var.getCheckBoxView().setLayoutParams(layoutParams);
        d2Var.setPadding(gd.a0 ? org.telegram.messenger.g0.L(4.0f) : 0, org.telegram.messenger.g0.L(12.0f), gd.a0 ? 0 : org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        d2Var.setEnabled(r0() != null);
        d2Var.setOnClickListener(new p3(d2Var, i7));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.addView(z0Var, c8.na.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
        linearLayout.addView(d2Var, c8.na.t(-1, -2, 83, 8, 0, 8, 0));
        t1Var.H = 6;
        v1Var.o(linearLayout);
        t1Var.a = org.telegram.messenger.g0.L(292.0f);
        v1Var.h(gd.N0(2131752577, null), new l60(20));
        int i11 = 2;
        v1Var.k(gd.N0(2131754483, null), new y8(this, z0Var, d2Var, i11));
        t1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Wallet.r9
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                kg.z0 z0Var2 = kg.z0.this;
                z0Var2.requestFocus();
                org.telegram.messenger.g0.I3(z0Var2);
            }
        });
        t1Var.setOnDismissListener(new r2(this, i11));
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
        z0Var.addTextChangedListener(new bi.y5(z0Var, (TextView) d));
    }

    public final void w0() {
        org.telegram.ui.ActionBar.r4 parentLayout = getParentLayout();
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
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
            if (g2Var instanceof oa) {
                ((ActionBarLayout) parentLayout).d0(g2Var, false);
            }
        }
        List fragmentStack = parentLayout.getFragmentStack();
        if (fragmentStack.size() >= 2 && (p5.c.h(2, fragmentStack) instanceof o6) && ((org.telegram.ui.ActionBar.g2) p5.c.h(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
            this.s0 = (o6) p5.c.h(2, fragmentStack);
        } else {
            o6 o6Var = new o6();
            o6Var.setCurrentAccount(this.currentAccount);
            if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, o6Var)) {
                this.s0 = o6Var;
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

    public ea(String str) {
        this(i10.t0, str);
    }

    public ea(int i7, String str) {
        this.s = 0L;
        this.K = new o9(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: org.telegram.ui.Wallet.p9
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                ea eaVar = ea.this;
                Runnable runnable = eaVar.K;
                if (z10 && eaVar.J && (editTextBoldCursor = eaVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    eaVar.I.post(runnable);
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
        v0.D(this.currentAccount).i0(new q9(this, 0), str);
    }

    @Override // org.telegram.ui.Components.d51
    public final void Z(ArrayList arrayList, b51 b51Var) {
    }

    @Override // org.telegram.ui.Components.d51
    public final void b0(n41 n41Var, View view) {
    }
}
