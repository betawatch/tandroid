package bb;

import ag.g;
import ag.h;
import ag.k;
import ag.l;
import ag.m;
import ag.o;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import f2.j0;
import java.util.ArrayList;
import k7.c6;
import o1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class a {
    public static o a;

    public static void a(LaunchActivity launchActivity, boolean z4, boolean z10) {
        o oVar = a;
        if (z4 == (oVar != null)) {
            return;
        }
        if (z4) {
            o oVar2 = new o(launchActivity);
            oVar2.r = new g(oVar2, 3);
            oVar2.B = new ArrayList();
            k kVar = new k(oVar2);
            oVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            oVar2.C = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            f1 f1Var = new f1(launchActivity, kVar);
            ((GestureDetector) f1Var.b).setIsLongpressEnabled(false);
            l lVar = new l(oVar2, launchActivity, f1Var, 0);
            oVar2.a = lVar;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            imageView.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.O9, false), PorterDuff.Mode.SRC_IN));
            lVar.addView(imageView);
            lVar.setVisibility(8);
            oVar2.addView(lVar, c6.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            oVar2.w = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            oVar2.x = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DebugMenu));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
            linearLayout.addView(textView, c6.n(-1, -2));
            tl0 tl0Var = new tl0(launchActivity, null);
            oVar2.y = tl0Var;
            tl0Var.setLayoutManager(new j0());
            tl0Var.setAdapter(new m(oVar2, launchActivity));
            tl0Var.setOnItemClickListener(new h(oVar2, 0));
            linearLayout.addView(tl0Var, c6.l(1.0f, -1, 0));
            oVar2.addView(linearLayout, c6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            oVar2.d();
            oVar2.setFitsSystemWindows(true);
            oVar2.setWillNotDraw(false);
            a = oVar2;
            launchActivity.t0.addView(oVar2, new FrameLayout.LayoutParams(-1, -1));
            o oVar3 = a;
            oVar3.a.setVisibility(0);
            j jVar = new j(new kb.a(0.0f));
            jVar.u = yh.n(1000.0f, 750.0f, 0.75f);
            jVar.b(new ag.c(0, oVar3));
            jVar.f();
        } else {
            oVar.getClass();
            launchActivity.t0.removeView(a);
            a = null;
        }
        if (z10) {
            SharedConfig.isFloatingDebugActive = z4;
            SharedConfig.saveConfig();
        }
    }
}
