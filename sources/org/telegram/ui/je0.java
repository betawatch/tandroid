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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class je0 extends org.telegram.ui.Components.ax0 {
    public final ld0 a;
    public final TextView b;
    public final TextView c;
    public final xh.n d;
    public final org.telegram.ui.Components.ak0 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String v;
    public boolean w;
    public final he0 x;
    public final /* synthetic */ gg0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d8 A[LOOP:0: B:9:0x00d6->B:10:0x00d8, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public je0(gg0 gg0Var, Context context) {
        super(context);
        int i10;
        this.y = gg0Var;
        this.x = new he0(this, 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(context);
        this.e = ak0Var;
        ak0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        ak0Var.setAutoRepeat(false);
        frameLayout.addView(ak0Var, org.telegram.ui.Components.gb1.i(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, org.telegram.ui.Components.gb1.i(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                ic.a.o(18.0f, 1, textView);
                textView.setText(LocaleController.getString(R.string.EnterCode));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
                addView(textView2, org.telegram.ui.Components.gb1.x(-2, -2, 1, 12, 8, 12, 0));
                ld0 ld0Var = new ld0(this, context, 1);
                this.a = ld0Var;
                ld0Var.b(6, 1);
                for (xr xrVar : ld0Var.f) {
                    xrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                    xrVar.addTextChangedListener(new m0(this, 8));
                    xrVar.setOnFocusChangeListener(new rd(this, 6));
                }
                addView(this.a, org.telegram.ui.Components.gb1.x(-2, 42, 1, 0, 32, 0, 0));
                xh.n nVar = new xh.n(context, null, false);
                this.d = nVar;
                nVar.setGravity(17);
                nVar.setTextSize(1, 14.0f);
                nVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                nVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                nVar.setMaxLines(2);
                nVar.setOnClickListener(new x50(this, 7));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(nVar, org.telegram.ui.Components.gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, org.telegram.ui.Components.gb1.p(1.0f, -1, 0));
                k6.c.h(nVar);
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, org.telegram.ui.Components.gb1.i(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        ic.a.o(18.0f, 1, textView3);
        textView3.setText(LocaleController.getString(R.string.EnterCode));
        textView3.setGravity(17);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, org.telegram.ui.Components.gb1.h(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView22.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
        addView(textView22, org.telegram.ui.Components.gb1.x(-2, -2, 1, 12, 8, 12, 0));
        ld0 ld0Var2 = new ld0(this, context, 1);
        this.a = ld0Var2;
        ld0Var2.b(6, 1);
        while (r12 < r11) {
        }
        addView(this.a, org.telegram.ui.Components.gb1.x(-2, 42, 1, 0, 32, 0, 0));
        xh.n nVar2 = new xh.n(context, null, false);
        this.d = nVar2;
        nVar2.setGravity(17);
        nVar2.setTextSize(1, 14.0f);
        nVar2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        nVar2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        nVar2.setMaxLines(2);
        nVar2.setOnClickListener(new x50(this, 7));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(nVar2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, org.telegram.ui.Components.gb1.p(1.0f, -1, 0));
        k6.c.h(nVar2);
    }

    @Override // org.telegram.ui.Components.ax0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ax0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.ax0
    public final boolean c(boolean z10) {
        this.y.p1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // org.telegram.ui.Components.ax0
    public final void d() {
        this.n = false;
    }

    @Override // org.telegram.ui.Components.ax0
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override // org.telegram.ui.Components.ax0
    public final void h(String str) {
        int i10;
        if (this.n) {
            return;
        }
        ld0 ld0Var = this.a;
        ld0Var.e = true;
        for (xr xrVar : ld0Var.f) {
            xrVar.j(0.0f);
        }
        String code = ld0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        gg0 gg0Var = this.y;
        gg0Var.s1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new j10(10, this, code), 10);
    }

    @Override // org.telegram.ui.Components.ax0
    public final void j() {
        AndroidUtilities.runOnUIThread(new he0(this, 0), gg0.x0);
    }

    @Override // org.telegram.ui.Components.ax0
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

    @Override // org.telegram.ui.Components.ax0
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

    @Override // org.telegram.ui.Components.ax0
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
            org.telegram.ui.Components.y11 y11Var = new org.telegram.ui.Components.y11();
            y11Var.a |= 256;
            y11Var.b = indexOf;
            int i10 = lastIndexOf + 1;
            y11Var.c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.z11(y11Var, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        gg0.W0(this.y, ld0Var);
        ld0Var.requestFocus();
    }

    public final void n(boolean z10) {
        ld0 ld0Var = this.a;
        if (this.y.getParentActivity() == null) {
            return;
        }
        try {
            ld0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (xr xrVar : ld0Var.f) {
                xrVar.setText("");
            }
        }
        for (xr xrVar2 : ld0Var.f) {
            xrVar2.i(1.0f);
        }
        ld0Var.f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ld0Var, new he0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.x);
    }

    @Override // org.telegram.ui.Components.ax0, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q6, false));
        this.a.invalidate();
    }
}
