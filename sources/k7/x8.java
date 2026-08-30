package k7;

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
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class x8 {
    public static zf.i a;

    public static void a(LaunchActivity launchActivity, boolean z4, boolean z10) {
        zf.i iVar = a;
        if (z4 == (iVar != null)) {
            return;
        }
        if (z4) {
            zf.i iVar2 = new zf.i(launchActivity);
            iVar2.r = new zf.c(iVar2, 3);
            iVar2.B = new ArrayList();
            zf.f fVar = new zf.f(iVar2);
            iVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            iVar2.C = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(launchActivity, fVar);
            ((GestureDetector) f1Var.b).setIsLongpressEnabled(false);
            ph.z4 z4Var = new ph.z4(iVar2, launchActivity, f1Var, 2);
            iVar2.a = z4Var;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false), PorterDuff.Mode.SRC_IN));
            z4Var.addView(imageView);
            z4Var.setVisibility(8);
            iVar2.addView(z4Var, b6.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            iVar2.w = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            iVar2.x = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DebugMenu));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
            linearLayout.addView(textView, b6.n(-1, -2));
            sl0 sl0Var = new sl0(launchActivity, null);
            iVar2.y = sl0Var;
            sl0Var.setLayoutManager(new f2.i0());
            sl0Var.setAdapter(new g81(iVar2, launchActivity));
            sl0Var.setOnItemClickListener(new dg.n(iVar2, 24));
            linearLayout.addView(sl0Var, b6.l(1.0f, -1, 0));
            iVar2.addView(linearLayout, b6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            iVar2.d();
            iVar2.setFitsSystemWindows(true);
            iVar2.setWillNotDraw(false);
            a = iVar2;
            launchActivity.t0.addView(iVar2, new FrameLayout.LayoutParams(-1, -1));
            zf.i iVar3 = a;
            iVar3.a.setVisibility(0);
            o1.j jVar = new o1.j(new kb.a(0.0f));
            jVar.u = yh.n(1000.0f, 750.0f, 0.75f);
            jVar.b(new dg.y(3, iVar3));
            jVar.f();
        } else {
            iVar.getClass();
            launchActivity.t0.removeView(a);
            a = null;
        }
        if (z10) {
            SharedConfig.isFloatingDebugActive = z4;
            SharedConfig.saveConfig();
        }
    }
}
