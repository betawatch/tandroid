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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class af0 extends org.telegram.ui.Components.tv0 {
    public final de0 a;
    public final TextView b;
    public final TextView c;
    public final wh.p d;
    public final org.telegram.ui.Components.aj0 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String v;
    public boolean w;
    public final ye0 x;
    public final /* synthetic */ wg0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d8 A[LOOP:0: B:9:0x00d6->B:10:0x00d8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public af0(wg0 wg0Var, Context context) {
        super(context);
        int i10;
        this.y = wg0Var;
        this.x = new ye0(this, 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.e = aj0Var;
        aj0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        aj0Var.setAutoRepeat(false);
        frameLayout.addView(aj0Var, w7.x5.e(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, w7.x5.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                com.google.android.gms.internal.vision.e2.m(18.0f, 1, textView);
                textView.setText(LocaleController.getString(R.string.EnterCode));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, w7.x5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
                addView(textView2, w7.x5.t(-2, -2, 1, 12, 8, 12, 0));
                de0 de0Var = new de0(this, context, 1);
                this.a = de0Var;
                de0Var.b(6, 1);
                for (gs gsVar : de0Var.f) {
                    gsVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                    gsVar.addTextChangedListener(new l0(this, 8));
                    gsVar.setOnFocusChangeListener(new pd(this, 6));
                }
                addView(this.a, w7.x5.t(-2, 42, 1, 0, 32, 0, 0));
                wh.p pVar = new wh.p(context, null, false);
                this.d = pVar;
                pVar.setGravity(17);
                pVar.setTextSize(1, 14.0f);
                pVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                pVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                pVar.setMaxLines(2);
                pVar.setOnClickListener(new l60(this, 6));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(pVar, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, w7.x5.l(1.0f, -1, 0));
                n7.z0.g(pVar);
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, w7.x5.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        com.google.android.gms.internal.vision.e2.m(18.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.EnterCode));
        textView3.setGravity(17);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, w7.x5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView22.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
        addView(textView22, w7.x5.t(-2, -2, 1, 12, 8, 12, 0));
        de0 de0Var2 = new de0(this, context, 1);
        this.a = de0Var2;
        de0Var2.b(6, 1);
        while (r12 < r11) {
        }
        addView(this.a, w7.x5.t(-2, 42, 1, 0, 32, 0, 0));
        wh.p pVar2 = new wh.p(context, null, false);
        this.d = pVar2;
        pVar2.setGravity(17);
        pVar2.setTextSize(1, 14.0f);
        pVar2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        pVar2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        pVar2.setMaxLines(2);
        pVar2.setOnClickListener(new l60(this, 6));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(pVar2, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, w7.x5.l(1.0f, -1, 0));
        n7.z0.g(pVar2);
    }

    @Override // org.telegram.ui.Components.tv0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.tv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.tv0
    public final boolean c(boolean z10) {
        this.y.k1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // org.telegram.ui.Components.tv0
    public final void d() {
        this.n = false;
    }

    @Override // org.telegram.ui.Components.tv0
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void h(String str) {
        int i10;
        if (this.n) {
            return;
        }
        de0 de0Var = this.a;
        de0Var.e = true;
        for (gs gsVar : de0Var.f) {
            gsVar.j(0.0f);
        }
        String code = de0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.n = true;
        wg0 wg0Var = this.y;
        wg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new bc0(2, this, code), 10);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void j() {
        AndroidUtilities.runOnUIThread(new ye0(this, 0), wg0.t0);
    }

    @Override // org.telegram.ui.Components.tv0
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

    @Override // org.telegram.ui.Components.tv0
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

    @Override // org.telegram.ui.Components.tv0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        de0 de0Var = this.a;
        de0Var.setText("");
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
            org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01();
            n01Var.a |= 256;
            n01Var.b = indexOf;
            int i10 = lastIndexOf + 1;
            n01Var.c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.o01(n01Var, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        wg0.T0(this.y, de0Var);
        de0Var.requestFocus();
    }

    @Override // org.telegram.ui.Components.tv0
    public final void n() {
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
        this.a.invalidate();
    }

    public final void o(boolean z10) {
        de0 de0Var = this.a;
        if (this.y.getParentActivity() == null) {
            return;
        }
        try {
            de0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (gs gsVar : de0Var.f) {
                gsVar.setText("");
            }
        }
        for (gs gsVar2 : de0Var.f) {
            gsVar2.i(1.0f);
        }
        de0Var.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(de0Var, new ye0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.x);
    }
}
