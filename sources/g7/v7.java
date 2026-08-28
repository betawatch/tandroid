package g7;

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
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class v7 {
    public static uf.h a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        uf.h hVar = a;
        if (z10 == (hVar != null)) {
            return;
        }
        if (z10) {
            uf.h hVar2 = new uf.h(launchActivity);
            hVar2.r = new uf.c(hVar2, 3);
            hVar2.A = new ArrayList();
            uf.f fVar = new uf.f(hVar2);
            hVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            hVar2.B = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            m5.c0 c0Var = new m5.c0(launchActivity, fVar);
            ((GestureDetector) c0Var.b).setIsLongpressEnabled(false);
            fh.v vVar = new fh.v(hVar2, launchActivity, c0Var, 29);
            hVar2.a = vVar;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.O9, false), PorterDuff.Mode.SRC_IN));
            vVar.addView(imageView);
            vVar.setVisibility(8);
            hVar2.addView(vVar, e6.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            hVar2.w = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            hVar2.x = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DebugMenu));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
            linearLayout.addView(textView, e6.n(-1, -2));
            wk0 wk0Var = new wk0(launchActivity, null);
            hVar2.y = wk0Var;
            wk0Var.setLayoutManager(new f2.m0());
            wk0Var.setAdapter(new i71(hVar2, launchActivity));
            wk0Var.setOnItemClickListener(new eh.j(hVar2, 20));
            linearLayout.addView(wk0Var, e6.l(1.0f, -1, 0));
            hVar2.addView(linearLayout, e6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            hVar2.d();
            hVar2.setFitsSystemWindows(true);
            hVar2.setWillNotDraw(false);
            a = hVar2;
            launchActivity.s0.addView(hVar2, new FrameLayout.LayoutParams(-1, -1));
            uf.h hVar3 = a;
            hVar3.a.setVisibility(0);
            o1.j jVar = new o1.j(new gb.a(0.0f));
            jVar.u = org.telegram.ui.Cells.j2.i(1000.0f, 750.0f, 0.75f);
            jVar.b(new ih.x7(2, hVar3));
            jVar.f();
        } else {
            hVar.getClass();
            launchActivity.s0.removeView(a);
            a = null;
        }
        if (z11) {
            SharedConfig.isFloatingDebugActive = z10;
            SharedConfig.saveConfig();
        }
    }
}
