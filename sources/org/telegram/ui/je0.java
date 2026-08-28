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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class je0 extends org.telegram.ui.Components.cv0 {
    public final ld0 a;
    public final TextView b;
    public final TextView c;
    public final dh.u d;
    public final org.telegram.ui.Components.pi0 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String v;
    public boolean w;
    public final he0 x;
    public final /* synthetic */ fg0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d8 A[LOOP:0: B:9:0x00d6->B:10:0x00d8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public je0(fg0 fg0Var, Context context) {
        super(context);
        int i9;
        this.y = fg0Var;
        this.x = new he0(this, 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.e = pi0Var;
        pi0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        pi0Var.setAutoRepeat(false);
        frameLayout.addView(pi0Var, g7.e6.e(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i9 = 0;
                frameLayout.setVisibility(i9);
                addView(frameLayout, g7.e6.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                j3.r0.u(18.0f, 1, textView);
                textView.setText(LocaleController.getString(R.string.EnterCode));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, g7.e6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
                addView(textView2, g7.e6.t(-2, -2, 1, 12, 8, 12, 0));
                ld0 ld0Var = new ld0(this, context, 1);
                this.a = ld0Var;
                ld0Var.b(6, 1);
                for (vr vrVar : ld0Var.f) {
                    vrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                    vrVar.addTextChangedListener(new o0(this, 8));
                    vrVar.setOnFocusChangeListener(new ld(this, 6));
                }
                addView(this.a, g7.e6.t(-2, 42, 1, 0, 32, 0, 0));
                dh.u uVar = new dh.u(context, null, false);
                this.d = uVar;
                uVar.setGravity(17);
                uVar.setTextSize(1, 14.0f);
                uVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                uVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                uVar.setMaxLines(2);
                uVar.setOnClickListener(new q50(this, 6));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(uVar, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, g7.e6.l(1.0f, -1, 0));
                org.telegram.ui.Cells.e3.s2(uVar);
            }
        }
        i9 = 8;
        frameLayout.setVisibility(i9);
        addView(frameLayout, g7.e6.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        j3.r0.u(18.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.EnterCode));
        textView3.setGravity(17);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, g7.e6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView22.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
        addView(textView22, g7.e6.t(-2, -2, 1, 12, 8, 12, 0));
        ld0 ld0Var2 = new ld0(this, context, 1);
        this.a = ld0Var2;
        ld0Var2.b(6, 1);
        while (r12 < r11) {
        }
        addView(this.a, g7.e6.t(-2, 42, 1, 0, 32, 0, 0));
        dh.u uVar2 = new dh.u(context, null, false);
        this.d = uVar2;
        uVar2.setGravity(17);
        uVar2.setTextSize(1, 14.0f);
        uVar2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        uVar2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        uVar2.setMaxLines(2);
        uVar2.setOnClickListener(new q50(this, 6));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(uVar2, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, g7.e6.l(1.0f, -1, 0));
        org.telegram.ui.Cells.e3.s2(uVar2);
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final boolean c(boolean z10) {
        this.y.k1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void d() {
        this.n = false;
    }

    @Override // org.telegram.ui.Components.cv0
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void h(String str) {
        int i9;
        if (this.n) {
            return;
        }
        ld0 ld0Var = this.a;
        ld0Var.e = true;
        for (vr vrVar : ld0Var.f) {
            vrVar.j(0.0f);
        }
        String code = ld0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.n = true;
        fg0 fg0Var = this.y;
        fg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_checkRecoveryPassword, new v40(9, this, code), 10);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void j() {
        AndroidUtilities.runOnUIThread(new he0(this, 0), fg0.p0);
    }

    @Override // org.telegram.ui.Components.cv0
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

    @Override // org.telegram.ui.Components.cv0
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

    @Override // org.telegram.ui.Components.cv0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ld0 ld0Var = this.a;
        ld0Var.setText("");
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
            org.telegram.ui.Components.vz0 vz0Var = new org.telegram.ui.Components.vz0();
            vz0Var.a |= 256;
            vz0Var.b = indexOf;
            int i9 = lastIndexOf + 1;
            vz0Var.c = i9;
            valueOf.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), indexOf, i9, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        fg0.T0(this.y, ld0Var);
        ld0Var.requestFocus();
    }

    @Override // org.telegram.ui.Components.cv0
    public final void n() {
        this.b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false));
        this.a.invalidate();
    }

    public final void o(boolean z10) {
        ld0 ld0Var = this.a;
        if (this.y.getParentActivity() == null) {
            return;
        }
        try {
            ld0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (vr vrVar : ld0Var.f) {
                vrVar.setText("");
            }
        }
        for (vr vrVar2 : ld0Var.f) {
            vrVar2.i(1.0f);
        }
        ld0Var.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ld0Var, new he0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.x);
    }
}
