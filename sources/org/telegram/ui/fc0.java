package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fc0 extends org.telegram.ui.Components.vt0 {
    public final /* synthetic */ xd0 E;
    public final ib0 a;
    public final TextView b;
    public final TextView c;
    public final yh.l d;
    public final org.telegram.ui.Components.fh0 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String w;
    public boolean x;
    public final dc0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00e0 A[LOOP:0: B:9:0x00de->B:10:0x00e0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fc0(xd0 xd0Var, Context context) {
        super(context);
        int i3;
        int length;
        int i10;
        this.E = xd0Var;
        this.y = new dc0(this, 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.e = fh0Var;
        fh0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        fh0Var.setAutoRepeat(false);
        frameLayout.addView(fh0Var, b8.mf.e(120, 120, 1));
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i3 = 0;
                frameLayout.setVisibility(i3);
                addView(frameLayout, b8.mf.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setText(org.telegram.messenger.bd.M0(2131751124, null));
                textView.setGravity(17);
                float f10 = 2.0f;
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView, b8.mf.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setText(org.telegram.messenger.bd.M0(2131746089, null));
                addView(textView2, b8.mf.t(-2, -2, 1, 12, 8, 12, 0));
                ib0 ib0Var = new ib0(1, context, this);
                this.a = ib0Var;
                ib0Var.b(6, 1);
                zq[] zqVarArr = ib0Var.f;
                length = zqVarArr.length;
                i10 = 0;
                while (i10 < length) {
                    zq zqVar = zqVarArr[i10];
                    zqVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
                    zqVar.addTextChangedListener(new n0(this, 10));
                    zqVar.setOnFocusChangeListener(new ed(this, 6));
                    i10++;
                    f10 = f10;
                }
                addView(this.a, b8.mf.t(-2, 42, 1, 0, 32, 0, 0));
                yh.l lVar = new yh.l(context, null, false);
                this.d = lVar;
                lVar.setGravity(17);
                lVar.setTextSize(1, 14.0f);
                lVar.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
                lVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                lVar.setMaxLines(2);
                lVar.setOnClickListener(new b40(this, 6));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(lVar, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, b8.mf.l(1.0f, -1, 0));
                k4.j.k(lVar);
            }
        }
        i3 = 8;
        frameLayout.setVisibility(i3);
        addView(frameLayout, b8.mf.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 18.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.bd.M0(2131751124, null));
        textView3.setGravity(17);
        float f102 = 2.0f;
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView3, b8.mf.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView22.setText(org.telegram.messenger.bd.M0(2131746089, null));
        addView(textView22, b8.mf.t(-2, -2, 1, 12, 8, 12, 0));
        ib0 ib0Var2 = new ib0(1, context, this);
        this.a = ib0Var2;
        ib0Var2.b(6, 1);
        zq[] zqVarArr2 = ib0Var2.f;
        length = zqVarArr2.length;
        i10 = 0;
        while (i10 < length) {
        }
        addView(this.a, b8.mf.t(-2, 42, 1, 0, 32, 0, 0));
        yh.l lVar2 = new yh.l(context, null, false);
        this.d = lVar2;
        lVar2.setGravity(17);
        lVar2.setTextSize(1, 14.0f);
        lVar2.setLineSpacing(org.telegram.messenger.g0.L(f102), 1.0f);
        lVar2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        lVar2.setMaxLines(2);
        lVar2.setOnClickListener(new b40(this, 6));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(lVar2, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, b8.mf.l(1.0f, -1, 0));
        k4.j.k(lVar2);
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean c(boolean z10) {
        this.E.t1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final void d() {
        this.n = false;
    }

    @Override // org.telegram.ui.Components.vt0
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131748734, "LoginPassword");
    }

    @Override // org.telegram.ui.Components.vt0
    public final void h(String str) {
        int i3;
        if (this.n) {
            return;
        }
        ib0 ib0Var = this.a;
        ib0Var.e = true;
        for (zq zqVar : ib0Var.f) {
            zqVar.A(0.0f);
        }
        String code = ib0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        xd0 xd0Var = this.E;
        xd0Var.w1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_checkRecoveryPassword, new xy(11, this, code), 10);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void j() {
        org.telegram.messenger.g0.i3(new dc0(this, 0), xd0.z0);
    }

    @Override // org.telegram.ui.Components.vt0
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

    @Override // org.telegram.ui.Components.vt0
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

    @Override // org.telegram.ui.Components.vt0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ib0 ib0Var = this.a;
        ib0Var.setText("");
        this.f = bundle;
        this.h = bundle.getString("password");
        this.r = this.f.getString("requestPhone");
        this.s = this.f.getString("phoneHash");
        this.w = this.f.getString("phoneCode");
        String string = this.f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
            ty0Var.a |= 256;
            ty0Var.b = indexOf;
            int i3 = lastIndexOf + 1;
            ty0Var.c = i3;
            valueOf.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), indexOf, i3, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131746091, null), valueOf));
        xd0.a1(this.E, ib0Var);
        ib0Var.requestFocus();
    }

    public final void n(boolean z10) {
        ib0 ib0Var = this.a;
        if (this.E.getParentActivity() == null) {
            return;
        }
        try {
            ib0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (zq zqVar : ib0Var.f) {
                zqVar.setText("");
            }
        }
        for (zq zqVar2 : ib0Var.f) {
            zqVar2.z(1.0f);
        }
        ib0Var.f[0].requestFocus();
        org.telegram.messenger.g0.G3(10.0f, ib0Var, new dc0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.a.invalidate();
    }
}
