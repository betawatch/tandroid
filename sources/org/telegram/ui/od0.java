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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class od0 extends org.telegram.ui.Components.zu0 {
    public final /* synthetic */ hf0 D;
    public final uc0 a;
    public final TextView b;
    public final TextView c;
    public final nh.p d;
    public final org.telegram.ui.Components.ei0 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String w;
    public boolean x;
    public final md0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00e0 A[LOOP:0: B:9:0x00de->B:10:0x00e0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public od0(hf0 hf0Var, Context context) {
        super(context);
        int i10;
        int length;
        int i11;
        this.D = hf0Var;
        this.y = new md0(this, 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.e = ei0Var;
        ei0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        ei0Var.setAutoRepeat(false);
        frameLayout.addView(ei0Var, w7.b6.e(120, 120, 1));
        if (!org.telegram.messenger.i0.O1()) {
            Point point = org.telegram.messenger.i0.q;
            if (point.x <= point.y || org.telegram.messenger.i0.Q1()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, w7.b6.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setText(org.telegram.messenger.cd.L0(2131751124, null));
                textView.setGravity(17);
                float f7 = 2.0f;
                textView.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                addView(textView, w7.b6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                textView2.setText(org.telegram.messenger.cd.L0(2131746096, null));
                addView(textView2, w7.b6.t(-2, -2, 1, 12, 8, 12, 0));
                uc0 uc0Var = new uc0(this, context, 1);
                this.a = uc0Var;
                uc0Var.b(6, 1);
                bs[] bsVarArr = uc0Var.f;
                length = bsVarArr.length;
                i11 = 0;
                while (i11 < length) {
                    bs bsVar = bsVarArr[i11];
                    bsVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.i0.C1());
                    bsVar.addTextChangedListener(new n0(this, 10));
                    bsVar.setOnFocusChangeListener(new od(this, 6));
                    i11++;
                    f7 = f7;
                }
                addView(this.a, w7.b6.t(-2, 42, 1, 0, 32, 0, 0));
                nh.p pVar = new nh.p(context, null, false);
                this.d = pVar;
                pVar.setGravity(17);
                pVar.setTextSize(1, 14.0f);
                pVar.setLineSpacing(org.telegram.messenger.i0.L(f7), 1.0f);
                pVar.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                pVar.setMaxLines(2);
                pVar.setOnClickListener(new f50(this, 6));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(pVar, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, w7.b6.l(1.0f, -1, 0));
                li.k.i(pVar);
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, w7.b6.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 18.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setText(org.telegram.messenger.cd.L0(2131751124, null));
        textView3.setGravity(17);
        float f72 = 2.0f;
        textView3.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        addView(textView3, w7.b6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        textView22.setText(org.telegram.messenger.cd.L0(2131746096, null));
        addView(textView22, w7.b6.t(-2, -2, 1, 12, 8, 12, 0));
        uc0 uc0Var2 = new uc0(this, context, 1);
        this.a = uc0Var2;
        uc0Var2.b(6, 1);
        bs[] bsVarArr2 = uc0Var2.f;
        length = bsVarArr2.length;
        i11 = 0;
        while (i11 < length) {
        }
        addView(this.a, w7.b6.t(-2, 42, 1, 0, 32, 0, 0));
        nh.p pVar2 = new nh.p(context, null, false);
        this.d = pVar2;
        pVar2.setGravity(17);
        pVar2.setTextSize(1, 14.0f);
        pVar2.setLineSpacing(org.telegram.messenger.i0.L(f72), 1.0f);
        pVar2.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        pVar2.setMaxLines(2);
        pVar2.setOnClickListener(new f50(this, 6));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(pVar2, w7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, w7.b6.l(1.0f, -1, 0));
        li.k.i(pVar2);
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final boolean c(boolean z10) {
        this.D.s1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void d() {
        this.n = false;
    }

    @Override // org.telegram.ui.Components.zu0
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131748737, "LoginPassword");
    }

    @Override // org.telegram.ui.Components.zu0
    public final void h(String str) {
        int i10;
        if (this.n) {
            return;
        }
        uc0 uc0Var = this.a;
        uc0Var.e = true;
        for (bs bsVar : uc0Var.f) {
            bsVar.A(0.0f);
        }
        String code = uc0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        hf0 hf0Var = this.D;
        hf0Var.v1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new org.telegram.ui.Components.t20(22, this, code), 10);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void j() {
        org.telegram.messenger.i0.h3(new md0(this, 0), hf0.y0);
    }

    @Override // org.telegram.ui.Components.zu0
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

    @Override // org.telegram.ui.Components.zu0
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

    @Override // org.telegram.ui.Components.zu0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        uc0 uc0Var = this.a;
        uc0Var.setText("");
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
            org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
            yz0Var.a |= 256;
            yz0Var.b = indexOf;
            int i10 = lastIndexOf + 1;
            yz0Var.c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i10, 0);
        }
        this.d.setText(org.telegram.messenger.i0.m0(org.telegram.messenger.cd.L0(2131746098, null), valueOf));
        hf0.Z0(this.D, uc0Var);
        uc0Var.requestFocus();
    }

    public final void n(boolean z10) {
        uc0 uc0Var = this.a;
        if (this.D.getParentActivity() == null) {
            return;
        }
        try {
            uc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (bs bsVar : uc0Var.f) {
                bsVar.setText("");
            }
        }
        for (bs bsVar2 : uc0Var.f) {
            bsVar2.z(1.0f);
        }
        uc0Var.f[0].requestFocus();
        org.telegram.messenger.i0.F3(10.0f, uc0Var, new md0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
    }

    @Override // org.telegram.ui.Components.zu0
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.a.invalidate();
    }
}
