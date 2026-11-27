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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dg6 extends cna {
    public Boolean E;
    public int F;
    public int G;
    public final /* synthetic */ qh6 H;
    public final e29 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public zz3 h;
    public Bundle n;
    public String r;
    public String s;
    public String w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg6(qh6 qh6Var, Context context) {
        super(context);
        this.H = qh6Var;
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        e29 e29Var = new e29(context);
        this.a = e29Var;
        e29Var.setAutoRepeat(true);
        e29Var.f(R.raw.sandclock, jn7.E1, jn7.E1, null);
        frameLayout.addView(e29Var, tre.e(jn7.E1, jn7.E1, 1));
        Point point = hl.q;
        frameLayout.setVisibility((point.x <= point.y || hl.O1()) ? 0 : 8);
        linearLayout.addView(frameLayout, tre.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131745844, null));
        textView.setGravity(17);
        textView.setLineSpacing(hl.L(2.0f), 1.0f);
        linearLayout.addView(textView, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        linearLayout.addView(textView2, tre.t(-2, -2, 1, 12, 8, 12, 0));
        addView(linearLayout, tre.l(1.0f, -1, 0));
        TextView textView3 = new TextView(context);
        this.f = textView3;
        uh9.q(textView3, 1, "ResetAccountStatus", 2131745840);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView3, tre.t(-2, -2, 49, 0, 24, 0, 0));
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(1);
        textView4.setTextSize(1, 20.0f);
        textView4.setTypeface(hl.o());
        textView4.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView4, tre.t(-2, -2, 1, 0, 8, 0, 0));
        TextView textView5 = new TextView(context);
        this.d = textView5;
        textView5.setGravity(17);
        textView5.setText(ob6.M0(2131745844, null));
        textView5.setTypeface(hl.o());
        textView5.setTextSize(1, 15.0f);
        textView5.setLineSpacing(hl.L(2.0f), 1.0f);
        textView5.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        textView5.setTextColor(-1);
        addView(textView5, tre.t(-1, 50, 1, 16, 32, 16, 48));
        textView5.setOnClickListener(new sa5(this, (byte) 22));
    }

    @Override // cna
    public final boolean b() {
        return true;
    }

    @Override // cna
    public final boolean c(boolean z) {
        this.H.y1(true, true);
        hl.r(this.h);
        this.h = null;
        this.n = null;
        return true;
    }

    @Override // cna
    public String getHeaderName() {
        return ob6.M0(2131745844, "ResetAccount");
    }

    @Override // cna
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("resetview_params");
        this.n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override // cna
    public final void l(Bundle bundle) {
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            bundle.putBundle("resetview_params", bundle2);
        }
    }

    @Override // cna
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
        uh9.r("ResetAccountInfo", null, 2131745841, new Object[]{ob6.a(f78.f().e("+" + this.r))}, this.c);
        n();
        zz3 zz3Var = new zz3(this, (byte) 23);
        this.h = zz3Var;
        hl.d3(zz3Var, 1000L);
    }

    public final void n() {
        int i;
        int i2 = this.y;
        i = ((e) this.H).currentAccount;
        int max = Math.max(0, i2 - (ConnectionsManager.getInstance(i).getCurrentTime() - this.x));
        int i3 = max / 86400;
        int round = Math.round(max / 86400.0f);
        int i4 = max / 3600;
        int i5 = (max / 60) % 60;
        int i6 = max % 60;
        TextView textView = this.e;
        if (i3 >= 2) {
            textView.setText(ob6.G(round, "Days", new Object[0]));
        } else {
            textView.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        boolean z = max == 0;
        Boolean bool = this.E;
        if (bool == null || bool.booleanValue() != z) {
            e29 e29Var = this.a;
            if (z) {
                e29Var.getAnimatedDrawable().F(0);
            } else {
                e29Var.setAutoRepeat(true);
                if (!e29Var.b()) {
                    e29Var.d();
                }
            }
            textView.setVisibility(z ? 4 : 0);
            this.f.setVisibility(z ? 4 : 0);
            this.d.setVisibility(z ? 0 : 4);
            this.E = Boolean.valueOf(z);
        }
    }

    @Override // cna
    public final void updateColors() {
        int i = aob.G6;
        this.b.setTextColor(aob.w0(null, i, false));
        this.c.setTextColor(aob.w0(null, i, false));
        this.f.setTextColor(aob.w0(null, i, false));
        this.e.setTextColor(aob.w0(null, i, false));
        int w0 = aob.w0(null, aob.Ni, false);
        int w02 = aob.w0(null, aob.Q9, false);
        TextView textView = this.d;
        if (textView.getBackground() == null) {
            int L = hl.L(6.0f);
            textView.setBackground(aob.i0(L, L, L, L, w0, w02, w02));
        } else if (w0 != this.F || w02 != this.G) {
            aob.F1(textView.getBackground(), w0, false);
            aob.F1(textView.getBackground(), w02, true);
        }
        this.F = w0;
        this.G = w02;
    }
}
