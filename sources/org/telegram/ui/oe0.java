package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class oe0 extends org.telegram.ui.Components.pw0 {
    public final /* synthetic */ dg0 E;
    public final org.telegram.ui.Components.xj0 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public a6 h;
    public Bundle n;
    public String r;
    public String s;
    public String v;
    public int w;
    public int x;
    public Boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe0(dg0 dg0Var, Context context) {
        super(context);
        this.E = dg0Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
        this.a = xj0Var;
        xj0Var.setAutoRepeat(true);
        xj0Var.f(R.raw.sandclock, 120, 120, null);
        frameLayout.addView(xj0Var, w7.z5.e(120, 120, 1));
        Point point = AndroidUtilities.displaySize;
        frameLayout.setVisibility((point.x <= point.y || AndroidUtilities.isTablet()) ? 0 : 8);
        linearLayout.addView(frameLayout, w7.z5.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.ResetAccount));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView, w7.z5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, w7.z5.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setGravity(1);
        textView3.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView3, w7.z5.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView4, w7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(LocaleController.getString(R.string.ResetAccount));
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, w7.z5.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new s50(this, 7));
    }

    @Override // org.telegram.ui.Components.pw0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.pw0
    public final boolean c(boolean z10) {
        this.E.k1(true, true);
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.h = null;
        this.n = null;
        return true;
    }

    @Override // org.telegram.ui.Components.pw0
    public String getHeaderName() {
        return LocaleController.getString("ResetAccount", R.string.ResetAccount);
    }

    @Override // org.telegram.ui.Components.pw0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // org.telegram.ui.Components.pw0
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.pw0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.n = bundle;
        this.r = bundle.getString("phoneFormated");
        this.s = bundle.getString("phoneHash");
        this.v = bundle.getString("code");
        this.w = bundle.getInt("startTime");
        this.x = bundle.getInt("waitTime");
        this.c.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", R.string.ResetAccountInfo, LocaleController.addNbsp(jf.b.c().b("+" + this.r)))));
        o();
        a6 a6Var = new a6(this, 9);
        this.h = a6Var;
        AndroidUtilities.runOnUIThread(a6Var, 1000L);
    }

    @Override // org.telegram.ui.Components.pw0
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int dp = AndroidUtilities.dp(6.0f);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Wh, false);
        int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Q9, false);
        this.d.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, x02, x03, x03));
    }

    public final void o() {
        int i10;
        int i11 = this.x;
        i10 = ((org.telegram.ui.ActionBar.n2) this.E).currentAccount;
        int max = Math.max(0, i11 - (ConnectionsManager.getInstance(i10).getCurrentTime() - this.w));
        int i12 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i13 = max / 3600;
        int i14 = (max / 60) % 60;
        int i15 = max % 60;
        TextView textView = this.e;
        if (i12 >= 2) {
            textView.setText(LocaleController.formatPluralString("Days", round, new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15)));
        }
        boolean z10 = max == 0;
        Boolean bool = this.y;
        if (bool == null || bool.booleanValue() != z10) {
            org.telegram.ui.Components.xj0 xj0Var = this.a;
            if (z10) {
                xj0Var.getAnimatedDrawable().K(0);
            } else {
                xj0Var.setAutoRepeat(true);
                if (!xj0Var.b()) {
                    xj0Var.d();
                }
            }
            textView.setVisibility(z10 ? 4 : 0);
            this.f.setVisibility(z10 ? 4 : 0);
            this.d.setVisibility(z10 ? 0 : 4);
            this.y = Boolean.valueOf(z10);
        }
    }
}
