package di;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ab;
import c8.ha;
import c8.ka;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ov;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w5 extends org.telegram.ui.ActionBar.v2 {
    public static final /* synthetic */ int n1 = 0;
    public final ug.p0 i1;
    public boolean j1;
    public final int k1;
    public ov l1;
    public final ab m1;

    public w5(Context context, float f10, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.m1 = new ab(this, 24);
        this.k1 = i7;
        v5 v5Var = new v5(this, getContext(), f10);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int L = org.telegram.messenger.g0.L(80.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, null);
        imageView.setImageResource(R.drawable.large_stealth);
        v5Var.addView(imageView, ha.d(80, 80.0f, 1, 0.0f, 18.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        v5Var.addView(linearLayout, ha.d(-1, -2.0f, 0, 0.0f, 116.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
        org.telegram.messenger.camera.q.o(textView, org.telegram.ui.ActionBar.k6.G6, f6Var, null, 2131744879);
        linearLayout.addView(textView, ha.r(-2, -2, 1));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        k5Var.setTextSize(14);
        k5Var.setAlignment(Layout.Alignment.ALIGN_CENTER);
        k5Var.setMaxLines(100);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.y6, f6Var);
        if (p10.i(this.a).q()) {
            k5Var.l(hd.M0(2131744884, null), false);
        } else {
            k5Var.l(hd.M0(2131744880, null), false);
        }
        linearLayout.addView(k5Var, ha.t(-2, -2, 1, 36, 10, 36, 0));
        bi.s1 s1Var = new bi.s1(this, getContext());
        ((ImageView) s1Var.d).setImageResource(R.drawable.msg_stealth_5min);
        ((TextView) s1Var.b).setText(hd.M0(2131749310, null));
        ((TextView) s1Var.c).setText(hd.M0(2131749309, null));
        linearLayout.addView(s1Var, ha.t(-1, -2, 0, 0, 20, 0, 0));
        bi.s1 s1Var2 = new bi.s1(this, getContext());
        ((ImageView) s1Var2.d).setImageResource(R.drawable.msg_stealth_25min);
        ((TextView) s1Var2.b).setText(hd.M0(2131749317, null));
        ((TextView) s1Var2.c).setText(hd.M0(2131749316, null));
        linearLayout.addView(s1Var2, ha.t(-1, -2, 0, 0, 10, 0, 0));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(8.0f), context, f6Var, true);
        this.i1 = p0Var;
        p0Var.J = false;
        p0Var.h.getDrawable().D = false;
        p0Var.setIcon(R.raw.unlock_icon);
        ka.a(p0Var);
        TLRPC.User f11 = p10.i(this.a).f();
        if (f11.premium) {
            J0(false);
        } else {
            p0Var.setIcon(R.raw.unlock_icon);
            p0Var.b(hd.M0(2131743852, null), new ah.d(this, 16), false);
        }
        linearLayout.addView(p0Var, ha.t(-1, 48, 80, 14, 24, 14, 16));
        this.N = v5Var;
        p0Var.setOnClickListener(new t5(this, f11, i7, f6Var, 0));
    }

    public static void I0() {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        hc hcVar = Q.getLastStoryViewer() != null ? new hc(Q.getLastStoryViewer().s, Q.getLastStoryViewer().D) : hc.X();
        if (hcVar != null) {
            String M0 = hd.M0(2131744882, null);
            String M02 = hd.M0(2131744881, null);
            yb ybVar = new yb(hcVar.W(), hcVar.c);
            ybVar.a.setImageResource(R.drawable.msg_stories_stealth2);
            ybVar.b.setText(M0);
            TextView textView = ybVar.c;
            textView.setText(M02);
            textView.setSingleLine(false);
            textView.setMaxLines(5);
            hcVar.b(ybVar, 5000).j();
        }
    }

    public final void J0(boolean z9) {
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = qp.s1(this.a).P1().B;
        ug.p0 p0Var = this.i1;
        if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(this.a).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
            this.j1 = true;
            p0Var.c(hd.M0(2131744883, null), true, z9);
            org.telegram.ui.ActionBar.r6.Z(p0Var.h, org.telegram.ui.ActionBar.k6.Gi, null);
            return;
        }
        if (tL_storiesStealthMode != null) {
            int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
            int i7 = tL_storiesStealthMode.cooldown_until_date;
            if (currentTime <= i7) {
                long currentTime2 = i7 - ConnectionsManager.getInstance(this.a).getCurrentTime();
                int i10 = (int) (currentTime2 % 60);
                long j3 = currentTime2 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j3 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i10)));
                p0Var.c(hd.a0("AvailableIn", null, 2131753760, sb2.toString()), true, z9);
                ug.o0 o0Var = p0Var.h;
                org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.Gi, qs.J1);
                org.telegram.ui.ActionBar.r6.n(o0Var, h.a, -1, 1, h.d, null);
                ab abVar = this.m1;
                org.telegram.messenger.g0.r(abVar);
                org.telegram.messenger.g0.i3(abVar, 1000L);
                return;
            }
        }
        int i11 = this.k1;
        if (i11 == 0) {
            p0Var.c(hd.M0(2131751147, null), true, z9);
        } else if (i11 == 1) {
            p0Var.c(hd.M0(2131751146, null), true, z9);
        }
        org.telegram.ui.ActionBar.r6.Z(p0Var.h, org.telegram.ui.ActionBar.k6.Gi, null);
    }
}
