package c8;

import android.graphics.PorterDuff;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class nb {
    public static pg.j a;

    public static void a(LaunchActivity launchActivity, boolean z9, boolean z10) {
        pg.j jVar = a;
        int i7 = 0;
        if (z9 == (jVar != null)) {
            return;
        }
        if (z9) {
            pg.j jVar2 = new pg.j(launchActivity);
            jVar2.r = new pg.d(jVar2, 3);
            jVar2.E = new ArrayList();
            pg.g gVar = new pg.g(jVar2);
            jVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            jVar2.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            vy vyVar = new vy(launchActivity, gVar);
            ((GestureDetector) vyVar.b).setIsLongpressEnabled(false);
            pg.h hVar = new pg.h(jVar2, launchActivity, vyVar, i7);
            jVar2.a = hVar;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.O9, null, PorterDuff.Mode.SRC_IN);
            hVar.addView(imageView);
            hVar.setVisibility(8);
            jVar2.addView(hVar, ha.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            jVar2.x = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            jVar2.y = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(org.telegram.messenger.id.M0(2131751646, null));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f));
            linearLayout.addView(textView, ha.o(-1, -2));
            qj0 qj0Var = new qj0(launchActivity, null);
            jVar2.D = qj0Var;
            qj0Var.setLayoutManager(new v4.b0());
            qj0Var.setAdapter(new org.telegram.ui.l4(jVar2, launchActivity));
            qj0Var.setOnItemClickListener(new ai.k(jVar2, 18));
            linearLayout.addView(qj0Var, ha.l(1.0f, -1, 0));
            jVar2.addView(linearLayout, ha.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            jVar2.d();
            jVar2.setFitsSystemWindows(true);
            jVar2.setWillNotDraw(false);
            a = jVar2;
            launchActivity.u0.addView(jVar2, new FrameLayout.LayoutParams(-1, -1));
            pg.j jVar3 = a;
            jVar3.a.setVisibility(0);
            r1.g gVar2 = new r1.g(new r1.f(0.0f));
            gVar2.m = org.telegram.ui.Cells.f1.o(1000.0f, 750.0f, 0.75f);
            gVar2.b(new di.a8(2, jVar3));
            gVar2.h();
        } else {
            jVar.getClass();
            launchActivity.u0.removeView(a);
            a = null;
        }
        if (z10) {
            iz.x1 = z9;
            iz.y();
        }
    }
}
