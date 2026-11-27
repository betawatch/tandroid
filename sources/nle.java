// default package

import android.graphics.PorterDuff;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class nle {
    public static ll4 a;

    public static void a(LaunchActivity launchActivity, boolean z, boolean z2) {
        ll4 ll4Var = a;
        byte b = 1;
        if (z != (ll4Var != null)) {
            if (z) {
                ll4 ll4Var2 = new ll4(launchActivity);
                ll4Var2.r = new gl4(ll4Var2, (byte) 3);
                ll4Var2.F = new ArrayList();
                jl4 jl4Var = new jl4(ll4Var2);
                ll4Var2.e = launchActivity.getSharedPreferences("floating_debug", 0);
                ll4Var2.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                kj4 kj4Var = new kj4(launchActivity, jl4Var);
                ((GestureDetector) kj4Var.b).setIsLongpressEnabled(false);
                tt ttVar = new tt(ll4Var2, launchActivity, kj4Var, (byte) 15);
                ll4Var2.a = ttVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                yob.s(imageView, aob.O9, null, PorterDuff.Mode.SRC_IN);
                ttVar.addView(imageView);
                ttVar.setVisibility(8);
                ll4Var2.addView(ttVar, tre.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                ll4Var2.x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                ll4Var2.y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(ob6.M0(2131751611, null));
                textView.setTypeface(hl.o());
                textView.setPadding(hl.L(24.0f), hl.L(19.0f), hl.L(24.0f), hl.L(19.0f));
                linearLayout.addView(textView, tre.o(-1, -2));
                d79 d79Var = new d79(launchActivity, null);
                ll4Var2.E = d79Var;
                d79Var.setLayoutManager(new x46());
                d79Var.setAdapter(new t20(ll4Var2, launchActivity));
                d79Var.setOnItemClickListener(new zg4(ll4Var2, b));
                linearLayout.addView(d79Var, tre.l(1.0f, -1, 0));
                ll4Var2.addView(linearLayout, tre.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                ll4Var2.d();
                ll4Var2.setFitsSystemWindows(true);
                ll4Var2.setWillNotDraw(false);
                a = ll4Var2;
                launchActivity.v0.addView(ll4Var2, new FrameLayout.LayoutParams(-1, -1));
                ll4 ll4Var3 = a;
                ll4Var3.a.setVisibility(0);
                vpa vpaVar = new vpa(new xk4(0.0f));
                vpaVar.m = bp1.j(1000.0f, 750.0f, 0.75f);
                vpaVar.b(new i10(ll4Var3, (byte) 5));
                vpaVar.h();
            } else {
                ll4Var.getClass();
                launchActivity.v0.removeView(a);
                a = null;
            }
            if (z2) {
                xea.t1 = z;
                xea.x();
            }
        }
    }
}
