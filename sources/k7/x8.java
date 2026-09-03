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
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class x8 {
    public static zf.h a;

    public static void a(LaunchActivity launchActivity, boolean z4, boolean z10) {
        zf.h hVar = a;
        if (z4 == (hVar != null)) {
            return;
        }
        if (z4) {
            zf.h hVar2 = new zf.h(launchActivity);
            hVar2.r = new zf.c(hVar2, 3);
            hVar2.B = new ArrayList();
            zf.f fVar = new zf.f(hVar2);
            hVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            hVar2.C = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            zz zzVar = new zz(launchActivity, fVar);
            ((GestureDetector) zzVar.b).setIsLongpressEnabled(false);
            ph.z4 z4Var = new ph.z4(hVar2, launchActivity, zzVar, 2);
            hVar2.a = z4Var;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false), PorterDuff.Mode.SRC_IN));
            z4Var.addView(imageView);
            z4Var.setVisibility(8);
            hVar2.addView(z4Var, b6.c(56.0f, 56));
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
            linearLayout.addView(textView, b6.n(-1, -2));
            rl0 rl0Var = new rl0(launchActivity, null);
            hVar2.y = rl0Var;
            rl0Var.setLayoutManager(new f2.i0());
            rl0Var.setAdapter(new g81(hVar2, launchActivity));
            rl0Var.setOnItemClickListener(new dg.n(hVar2, 24));
            linearLayout.addView(rl0Var, b6.l(1.0f, -1, 0));
            hVar2.addView(linearLayout, b6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            hVar2.d();
            hVar2.setFitsSystemWindows(true);
            hVar2.setWillNotDraw(false);
            a = hVar2;
            launchActivity.t0.addView(hVar2, new FrameLayout.LayoutParams(-1, -1));
            zf.h hVar3 = a;
            hVar3.a.setVisibility(0);
            o1.j jVar = new o1.j(new kb.a(0.0f));
            jVar.u = ai.m(1000.0f, 750.0f, 0.75f);
            jVar.b(new dg.y(3, hVar3));
            jVar.f();
        } else {
            hVar.getClass();
            launchActivity.t0.removeView(a);
            a = null;
        }
        if (z10) {
            SharedConfig.isFloatingDebugActive = z4;
            SharedConfig.saveConfig();
        }
    }
}
