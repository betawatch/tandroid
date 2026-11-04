package n9;

import ai.j6;
import android.graphics.PorterDuff;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ei.a8;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n4;
import org.telegram.ui.n61;
import u4.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b {
    public static qg.h a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        qg.h hVar = a;
        if (z10 == (hVar != null)) {
            return;
        }
        if (z10) {
            qg.h hVar2 = new qg.h(launchActivity);
            int i3 = 3;
            hVar2.r = new qg.c(hVar2, i3);
            hVar2.F = new ArrayList();
            qg.f fVar = new qg.f(hVar2);
            hVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            hVar2.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            y00 y00Var = new y00(launchActivity, fVar);
            ((GestureDetector) y00Var.a).setIsLongpressEnabled(false);
            n61 n61Var = new n61(hVar2, launchActivity, y00Var, i3);
            hVar2.a = n61Var;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            r6.t(imageView, k6.O9, null, PorterDuff.Mode.SRC_IN);
            n61Var.addView(imageView);
            n61Var.setVisibility(8);
            hVar2.addView(n61Var, mf.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            hVar2.x = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            hVar2.y = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(bd.M0(2131751647, null));
            textView.setTypeface(g0.o());
            textView.setPadding(g0.L(24.0f), g0.L(19.0f), g0.L(24.0f), g0.L(19.0f));
            linearLayout.addView(textView, mf.o(-1, -2));
            tj0 tj0Var = new tj0(launchActivity, null);
            hVar2.E = tj0Var;
            tj0Var.setLayoutManager(new b0());
            tj0Var.setAdapter(new n4(hVar2, launchActivity));
            tj0Var.setOnItemClickListener(new j6(hVar2, 19));
            linearLayout.addView(tj0Var, mf.l(1.0f, -1, 0));
            hVar2.addView(linearLayout, mf.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            hVar2.d();
            hVar2.setFitsSystemWindows(true);
            hVar2.setWillNotDraw(false);
            a = hVar2;
            launchActivity.x0.addView(hVar2, new FrameLayout.LayoutParams(-1, -1));
            qg.h hVar3 = a;
            hVar3.a.setVisibility(0);
            q1.g gVar = new q1.g(new q1.f(0.0f));
            gVar.m = f1.s(1000.0f, 750.0f, 0.75f);
            gVar.b(new a8(2, hVar3));
            gVar.h();
        } else {
            hVar.getClass();
            launchActivity.x0.removeView(a);
            a = null;
        }
        if (z11) {
            az.x1 = z10;
            az.y();
        }
    }
}
