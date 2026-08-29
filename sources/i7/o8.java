package i7;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class o8 {
    public static xf.j a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        xf.j jVar = a;
        if (z10 == (jVar != null)) {
            return;
        }
        if (z10) {
            xf.j jVar2 = new xf.j(launchActivity);
            jVar2.r = new xf.d(jVar2, 3);
            jVar2.A = new ArrayList();
            xf.g gVar = new xf.g(jVar2);
            jVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            jVar2.B = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            o4.g gVar2 = new o4.g(launchActivity, gVar);
            ((GestureDetector) gVar2.b).setIsLongpressEnabled(false);
            rf.d dVar = new rf.d(jVar2, launchActivity, gVar2, 1);
            jVar2.a = dVar;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false), PorterDuff.Mode.SRC_IN));
            dVar.addView(imageView);
            dVar.setVisibility(8);
            jVar2.addView(dVar, f6.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            jVar2.w = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            jVar2.x = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DebugMenu));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
            linearLayout.addView(textView, f6.n(-1, -2));
            jl0 jl0Var = new jl0(launchActivity, null);
            jVar2.y = jl0Var;
            jl0Var.setLayoutManager(new f2.j0());
            jl0Var.setAdapter(new u71(jVar2, launchActivity));
            jl0Var.setOnItemClickListener(new bg.o(jVar2, 24));
            linearLayout.addView(jl0Var, f6.l(1.0f, -1, 0));
            jVar2.addView(linearLayout, f6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            jVar2.d();
            jVar2.setFitsSystemWindows(true);
            jVar2.setWillNotDraw(false);
            a = jVar2;
            launchActivity.s0.addView(jVar2, new FrameLayout.LayoutParams(-1, -1));
            xf.j jVar3 = a;
            jVar3.a.setVisibility(0);
            o1.k kVar = new o1.k(new ib.a(0.0f));
            kVar.u = th.l(1000.0f, 750.0f, 0.75f);
            kVar.b(new bg.z(3, jVar3));
            kVar.f();
        } else {
            jVar.getClass();
            launchActivity.s0.removeView(a);
            a = null;
        }
        if (z11) {
            SharedConfig.isFloatingDebugActive = z10;
            SharedConfig.saveConfig();
        }
    }
}
