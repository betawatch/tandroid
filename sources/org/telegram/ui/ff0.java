package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ff0 extends org.telegram.ui.Components.tw0 {
    public final ie0 a;
    public final TextView b;
    public final TextView c;
    public final wh.n d;
    public final org.telegram.ui.Components.bk0 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String v;
    public boolean w;
    public final df0 x;
    public final /* synthetic */ bh0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d9 A[LOOP:0: B:9:0x00d7->B:10:0x00d9, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ff0(bh0 bh0Var, Context context) {
        super(context);
        int i10;
        this.y = bh0Var;
        this.x = new df0(this, 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        this.e = bk0Var;
        bk0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        bk0Var.setAutoRepeat(false);
        frameLayout.addView(bk0Var, w7.a6.e(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, w7.a6.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView);
                textView.setText(LocaleController.getString(R.string.EnterCode));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, w7.a6.a(-2.0f, 32.0f, 16.0f, 32.0f, 0.0f, -1, 1));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
                addView(textView2, w7.a6.t(-2, -2, 1, 12, 8, 12, 0));
                ie0 ie0Var = new ie0(this, context, 1);
                this.a = ie0Var;
                ie0Var.b(6, 1);
                for (ks ksVar : ie0Var.f) {
                    ksVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                    ksVar.addTextChangedListener(new n0(this, 8));
                    ksVar.setOnFocusChangeListener(new vd(this, 6));
                }
                addView(this.a, w7.a6.t(-2, 42, 1, 0, 32, 0, 0));
                wh.n nVar = new wh.n(context, null, false);
                this.d = nVar;
                nVar.setGravity(17);
                nVar.setTextSize(1, 14.0f);
                nVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                nVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                nVar.setMaxLines(2);
                nVar.setOnClickListener(new t60(this, 5));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(nVar, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 32.0f, -1, 80));
                addView(frameLayout2, w7.a6.l(1.0f, -1, 0));
                li.k.o(nVar);
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, w7.a6.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.EnterCode));
        textView3.setGravity(17);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, w7.a6.a(-2.0f, 32.0f, 16.0f, 32.0f, 0.0f, -1, 1));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView22.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
        addView(textView22, w7.a6.t(-2, -2, 1, 12, 8, 12, 0));
        ie0 ie0Var2 = new ie0(this, context, 1);
        this.a = ie0Var2;
        ie0Var2.b(6, 1);
        while (r12 < r11) {
        }
        addView(this.a, w7.a6.t(-2, 42, 1, 0, 32, 0, 0));
        wh.n nVar2 = new wh.n(context, null, false);
        this.d = nVar2;
        nVar2.setGravity(17);
        nVar2.setTextSize(1, 14.0f);
        nVar2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        nVar2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        nVar2.setMaxLines(2);
        nVar2.setOnClickListener(new t60(this, 5));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(nVar2, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 32.0f, -1, 80));
        addView(frameLayout22, w7.a6.l(1.0f, -1, 0));
        li.k.o(nVar2);
    }

    @Override // org.telegram.ui.Components.tw0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.tw0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.tw0
    public final boolean c(boolean z10) {
        this.y.k1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // org.telegram.ui.Components.tw0
    public final void d() {
        this.n = false;
    }

    @Override // org.telegram.ui.Components.tw0
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override // org.telegram.ui.Components.tw0
    public final void h(String str) {
        int i10;
        if (this.n) {
            return;
        }
        ie0 ie0Var = this.a;
        ie0Var.e = true;
        for (ks ksVar : ie0Var.f) {
            ksVar.j(0.0f);
        }
        String code = ie0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.n = true;
        bh0 bh0Var = this.y;
        bh0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.m2) bh0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new fc0(2, this, code), 10);
    }

    @Override // org.telegram.ui.Components.tw0
    public final void j() {
        AndroidUtilities.runOnUIThread(new df0(this, 0), bh0.t0);
    }

    @Override // org.telegram.ui.Components.tw0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override // org.telegram.ui.Components.tw0
    public final void l(Bundle bundle) {
        String code = this.a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.tw0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ie0 ie0Var = this.a;
        ie0Var.setText("");
        this.f = bundle;
        this.h = bundle.getString("password");
        this.r = this.f.getString("requestPhone");
        this.s = this.f.getString("phoneHash");
        this.v = this.f.getString("phoneCode");
        String string = this.f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            org.telegram.ui.Components.p11 p11Var = new org.telegram.ui.Components.p11();
            p11Var.a |= 256;
            p11Var.b = indexOf;
            int i10 = lastIndexOf + 1;
            p11Var.c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.q11(p11Var, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        bh0.T0(this.y, ie0Var);
        ie0Var.requestFocus();
    }

    @Override // org.telegram.ui.Components.tw0
    public final void n() {
        this.b.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.a.invalidate();
    }

    public final void o(boolean z10) {
        ie0 ie0Var = this.a;
        if (this.y.getParentActivity() == null) {
            return;
        }
        try {
            ie0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (ks ksVar : ie0Var.f) {
                ksVar.setText("");
            }
        }
        for (ks ksVar2 : ie0Var.f) {
            ksVar2.i(1.0f);
        }
        ie0Var.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ie0Var, new df0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.x);
    }
}
