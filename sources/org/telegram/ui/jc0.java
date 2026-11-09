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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jc0 extends org.telegram.ui.Components.yt0 {
    public final /* synthetic */ ee0 D;
    public final nb0 a;
    public final TextView b;
    public final TextView c;
    public final xh.l d;
    public final org.telegram.ui.Components.dh0 e;
    public Bundle f;
    public String h;
    public boolean n;
    public String r;
    public String s;
    public String w;
    public boolean x;
    public final hc0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00e0 A[LOOP:0: B:9:0x00de->B:10:0x00e0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jc0(ee0 ee0Var, Context context) {
        super(context);
        int i7;
        int length;
        int i10;
        this.D = ee0Var;
        this.y = new hc0(this, 1);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
        this.e = dh0Var;
        dh0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        dh0Var.setAutoRepeat(false);
        frameLayout.addView(dh0Var, c8.ha.e(120, 120, 1));
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                frameLayout.setVisibility(i7);
                addView(frameLayout, c8.ha.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setTextSize(1, 18.0f);
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setText(org.telegram.messenger.id.M0(2131751123, null));
                textView.setGravity(17);
                float f10 = 2.0f;
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView, c8.ha.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                TextView textView2 = new TextView(context);
                this.c = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setText(org.telegram.messenger.id.M0(2131746079, null));
                addView(textView2, c8.ha.t(-2, -2, 1, 12, 8, 12, 0));
                nb0 nb0Var = new nb0(1, context, this);
                this.a = nb0Var;
                nb0Var.b(6, 1);
                dr[] drVarArr = nb0Var.f;
                length = drVarArr.length;
                i10 = 0;
                while (i10 < length) {
                    dr drVar = drVarArr[i10];
                    drVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
                    drVar.addTextChangedListener(new m0(this, 10));
                    drVar.setOnFocusChangeListener(new fd(this, 6));
                    i10++;
                    f10 = f10;
                }
                addView(this.a, c8.ha.t(-2, 42, 1, 0, 32, 0, 0));
                xh.l lVar = new xh.l(context, null, false);
                this.d = lVar;
                lVar.setGravity(17);
                lVar.setTextSize(1, 14.0f);
                lVar.setLineSpacing(org.telegram.messenger.g0.L(f10), 1.0f);
                lVar.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                lVar.setMaxLines(2);
                lVar.setOnClickListener(new i40(this, 6));
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.addView(lVar, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(frameLayout2, c8.ha.l(1.0f, -1, 0));
                h6.m.g(lVar);
            }
        }
        i7 = 8;
        frameLayout.setVisibility(i7);
        addView(frameLayout, c8.ha.e(-1, -2, 1));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 18.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.id.M0(2131751123, null));
        textView3.setGravity(17);
        float f102 = 2.0f;
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView3, c8.ha.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView22 = new TextView(context);
        this.c = textView22;
        textView22.setTextSize(1, 14.0f);
        textView22.setGravity(17);
        textView22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView22.setText(org.telegram.messenger.id.M0(2131746079, null));
        addView(textView22, c8.ha.t(-2, -2, 1, 12, 8, 12, 0));
        nb0 nb0Var2 = new nb0(1, context, this);
        this.a = nb0Var2;
        nb0Var2.b(6, 1);
        dr[] drVarArr2 = nb0Var2.f;
        length = drVarArr2.length;
        i10 = 0;
        while (i10 < length) {
        }
        addView(this.a, c8.ha.t(-2, 42, 1, 0, 32, 0, 0));
        xh.l lVar2 = new xh.l(context, null, false);
        this.d = lVar2;
        lVar2.setGravity(17);
        lVar2.setTextSize(1, 14.0f);
        lVar2.setLineSpacing(org.telegram.messenger.g0.L(f102), 1.0f);
        lVar2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        lVar2.setMaxLines(2);
        lVar2.setOnClickListener(new i40(this, 6));
        FrameLayout frameLayout22 = new FrameLayout(context);
        frameLayout22.addView(lVar2, c8.ha.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout22, c8.ha.l(1.0f, -1, 0));
        h6.m.g(lVar2);
    }

    @Override // org.telegram.ui.Components.yt0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.yt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.yt0
    public final boolean c(boolean z9) {
        this.D.C1(true, true);
        this.f = null;
        this.n = false;
        return true;
    }

    @Override // org.telegram.ui.Components.yt0
    public final void d() {
        this.n = false;
    }

    @Override // org.telegram.ui.Components.yt0
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131748726, "LoginPassword");
    }

    @Override // org.telegram.ui.Components.yt0
    public final void h(String str) {
        int i7;
        if (this.n) {
            return;
        }
        nb0 nb0Var = this.a;
        nb0Var.e = true;
        for (dr drVar : nb0Var.f) {
            drVar.A(0.0f);
        }
        String code = nb0Var.getCode();
        if (code.length() == 0) {
            n(false);
            return;
        }
        this.n = true;
        ee0 ee0Var = this.D;
        ee0Var.F1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_checkRecoveryPassword, new j50(8, this, code), 10);
    }

    @Override // org.telegram.ui.Components.yt0
    public final void j() {
        org.telegram.messenger.g0.i3(new hc0(this, 0), ee0.y0);
    }

    @Override // org.telegram.ui.Components.yt0
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

    @Override // org.telegram.ui.Components.yt0
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

    @Override // org.telegram.ui.Components.yt0
    public final void m(Bundle bundle, boolean z9) {
        if (bundle == null) {
            return;
        }
        nb0 nb0Var = this.a;
        nb0Var.setText("");
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
            org.telegram.ui.Components.vy0 vy0Var = new org.telegram.ui.Components.vy0();
            vy0Var.a |= 256;
            vy0Var.b = indexOf;
            int i7 = lastIndexOf + 1;
            vy0Var.c = i7;
            valueOf.setSpan(new org.telegram.ui.Components.wy0(vy0Var, 0), indexOf, i7, 0);
        }
        this.d.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746081, null), valueOf));
        ee0.b1(this.D, nb0Var);
        nb0Var.requestFocus();
    }

    public final void n(boolean z9) {
        nb0 nb0Var = this.a;
        if (this.D.getParentActivity() == null) {
            return;
        }
        try {
            nb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z9) {
            for (dr drVar : nb0Var.f) {
                drVar.setText("");
            }
        }
        for (dr drVar2 : nb0Var.f) {
            drVar2.z(1.0f);
        }
        nb0Var.f[0].requestFocus();
        org.telegram.messenger.g0.G3(10.0f, nb0Var, new hc0(this, 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.y);
    }

    @Override // org.telegram.ui.Components.yt0
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.q6, false));
        this.a.invalidate();
    }
}
