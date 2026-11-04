package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oc0 extends org.telegram.ui.Components.vt0 {
    public Boolean E;
    public int F;
    public int G;
    public final /* synthetic */ xd0 H;
    public final org.telegram.ui.Components.fh0 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public o4 h;
    public Bundle n;
    public String r;
    public String s;
    public String w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(xd0 xd0Var, Context context) {
        super(context);
        this.H = xd0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.a = fh0Var;
        fh0Var.setAutoRepeat(true);
        fh0Var.f(R.raw.sandclock, 120, 120, null);
        frameLayout.addView(fh0Var, b8.mf.e(120, 120, 1));
        Point point = org.telegram.messenger.g0.q;
        frameLayout.setVisibility((point.x <= point.y || org.telegram.messenger.g0.Q1()) ? 0 : 8);
        linearLayout.addView(frameLayout, b8.mf.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.bd.M0(2131746127, null));
        textView.setGravity(17);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, b8.mf.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView2, b8.mf.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, b8.mf.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        org.telegram.messenger.k5.m(textView3, 1, "ResetAccountStatus", 2131746123);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView3, b8.mf.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView4, b8.mf.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(org.telegram.messenger.bd.M0(2131746127, null));
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView5.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, b8.mf.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new b40(this, 7));
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public final boolean c(boolean z10) {
        this.H.t1(true, true);
        org.telegram.messenger.g0.r(this.h);
        this.h = null;
        this.n = null;
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131746127, "ResetAccount");
    }

    @Override // org.telegram.ui.Components.vt0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.n = bundle;
        this.r = bundle.getString("phoneFormated");
        this.s = bundle.getString("phoneHash");
        this.w = bundle.getString("code");
        this.x = bundle.getInt("startTime");
        this.y = bundle.getInt("waitTime");
        org.telegram.messenger.k5.r("ResetAccountInfo", null, 2131746124, new Object[]{org.telegram.messenger.bd.a(mf.b.c().b("+" + this.r))}, this.c);
        n();
        o4 o4Var = new o4(this, 11);
        this.h = o4Var;
        org.telegram.messenger.g0.i3(o4Var, 1000L);
    }

    public final void n() {
        int i3;
        int i10 = this.y;
        i3 = ((org.telegram.ui.ActionBar.d2) this.H).currentAccount;
        int max = Math.max(0, i10 - (ConnectionsManager.getInstance(i3).getCurrentTime() - this.x));
        int i11 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i12 = max / 3600;
        int i13 = (max / 60) % 60;
        int i14 = max % 60;
        TextView textView = this.e;
        if (i11 >= 2) {
            textView.setText(org.telegram.messenger.bd.G(round, "Days", new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
        }
        boolean z10 = max == 0;
        Boolean bool = this.E;
        if (bool == null || bool.booleanValue() != z10) {
            org.telegram.ui.Components.fh0 fh0Var = this.a;
            if (z10) {
                fh0Var.getAnimatedDrawable().K(0);
            } else {
                fh0Var.setAutoRepeat(true);
                if (!fh0Var.b()) {
                    fh0Var.d();
                }
            }
            textView.setVisibility(z10 ? 4 : 0);
            this.f.setVisibility(z10 ? 4 : 0);
            this.d.setVisibility(z10 ? 0 : 4);
            this.E = Boolean.valueOf(z10);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void updateColors() {
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ki, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Q9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int L = org.telegram.messenger.g0.L(6.0f);
            textView.setBackground(org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, x03, x03));
        } else if (x02 != this.F || x03 != this.G) {
            org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), x02, false);
            org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), x03, true);
        }
        this.F = x02;
        this.G = x03;
    }
}
