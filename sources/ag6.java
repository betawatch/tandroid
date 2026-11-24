// default package

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ag6 extends kla {
    public Boolean E;
    public int F;
    public int G;
    public final /* synthetic */ mh6 H;
    public final s09 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public o04 h;
    public Bundle n;
    public String r;
    public String s;
    public String w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag6(mh6 mh6Var, Context context) {
        super(context);
        this.H = mh6Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        s09 s09Var = new s09(context);
        this.a = s09Var;
        s09Var.setAutoRepeat(true);
        s09Var.f(R.raw.sandclock, nm7.E1, nm7.E1, null);
        frameLayout.addView(s09Var, qoe.e(nm7.E1, nm7.E1, 1));
        Point point = gm.q;
        frameLayout.setVisibility((point.x <= point.y || gm.O1()) ? 0 : 8);
        linearLayout.addView(frameLayout, qoe.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131745850, null));
        textView.setGravity(17);
        textView.setLineSpacing(gm.L(2.0f), 1.0f);
        linearLayout.addView(textView, qoe.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        linearLayout.addView(textView2, qoe.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, qoe.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        hg9.p(textView3, 1, "ResetAccountStatus", 2131745846);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView3, qoe.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(gm.o());
        textView4.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView4, qoe.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(jb6.M0(2131745850, null));
        textView5.setTypeface(gm.o());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(gm.L(2.0f), 1.0f);
        textView5.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, qoe.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new ca5(this, (byte) 24));
    }

    @Override // kla
    public final boolean b() {
        return true;
    }

    @Override // kla
    public final boolean d(boolean z) {
        this.H.y1(true, true);
        gm.r(this.h);
        this.h = null;
        this.n = null;
        return true;
    }

    @Override // kla
    public String getHeaderName() {
        return jb6.M0(2131745850, "ResetAccount");
    }

    @Override // kla
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // kla
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override // kla
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        this.n = bundle;
        this.r = bundle.getString("phoneFormated");
        this.s = bundle.getString("phoneHash");
        this.w = bundle.getString("code");
        this.x = bundle.getInt("startTime");
        this.y = bundle.getInt("waitTime");
        hg9.q("ResetAccountInfo", null, 2131745847, new Object[]{jb6.a(r58.f().e("+" + this.r))}, this.c);
        n();
        o04 o04Var = new o04(this, (byte) 23);
        this.h = o04Var;
        gm.d3(o04Var, 1000L);
    }

    public final void n() {
        int i;
        int i2 = this.y;
        i = ((d) this.H).currentAccount;
        int max = Math.max(0, i2 - (ConnectionsManager.getInstance(i).getCurrentTime() - this.x));
        int i3 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i4 = max / 3600;
        int i5 = (max / 60) % 60;
        int i6 = max % 60;
        TextView textView = this.e;
        if (i3 >= 2) {
            textView.setText(jb6.G(round, "Days", new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        boolean z = max == 0;
        Boolean bool = this.E;
        if (bool == null || bool.booleanValue() != z) {
            s09 s09Var = this.a;
            if (z) {
                s09Var.getAnimatedDrawable().F(0);
            } else {
                s09Var.setAutoRepeat(true);
                if (!s09Var.b()) {
                    s09Var.d();
                }
            }
            textView.setVisibility(z ? 4 : 0);
            this.f.setVisibility(z ? 4 : 0);
            this.d.setVisibility(z ? 0 : 4);
            this.E = Boolean.valueOf(z);
        }
    }

    @Override // kla
    public final void updateColors() {
        int i = cmb.F6;
        this.b.setTextColor(cmb.w0(null, i, false));
        this.c.setTextColor(cmb.w0(null, i, false));
        this.f.setTextColor(cmb.w0(null, i, false));
        this.e.setTextColor(cmb.w0(null, i, false));
        int w0 = cmb.w0(null, cmb.Mi, false);
        int w02 = cmb.w0(null, cmb.P9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int L = gm.L(6.0f);
            textView.setBackground(cmb.i0(L, L, L, L, w0, w02, w02));
        } else if (w0 != this.F || w02 != this.G) {
            cmb.F1(textView.getBackground(), w0, false);
            cmb.F1(textView.getBackground(), w02, true);
        }
        this.F = w0;
        this.G = w02;
    }
}
