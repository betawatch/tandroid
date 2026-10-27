package a8;

import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class xe {
    public static og.i a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        og.i iVar = a;
        if (z10 == (iVar != null)) {
            return;
        }
        if (z10) {
            og.i iVar2 = new og.i(launchActivity);
            iVar2.r = new og.c(iVar2, 3);
            iVar2.E = new ArrayList();
            og.f fVar = new og.f(iVar2);
            iVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            iVar2.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            jg.s0 s0Var = new jg.s0(launchActivity, fVar);
            ((GestureDetector) s0Var.b).setIsLongpressEnabled(false);
            bh.p pVar = new bh.p(iVar2, launchActivity, s0Var, 5);
            iVar2.a = pVar;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.O9, null, PorterDuff.Mode.SRC_IN);
            pVar.addView(imageView);
            pVar.setVisibility(8);
            iVar2.addView(pVar, kb1.g(56.0f, 56));
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
            linearLayout.addView(textView, kb1.r(-1, -2));
            nm0 nm0Var = new nm0(launchActivity, null);
            iVar2.y = nm0Var;
            nm0Var.setLayoutManager(new s4.c0());
            nm0Var.setAdapter(new og.g(iVar2, launchActivity));
            nm0Var.setOnItemClickListener(new ai.k(iVar2, 18));
            linearLayout.addView(nm0Var, kb1.p(1.0f, -1, 0));
            iVar2.addView(linearLayout, kb1.h(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            iVar2.d();
            iVar2.setFitsSystemWindows(true);
            iVar2.setWillNotDraw(false);
            a = iVar2;
            launchActivity.w0.addView(iVar2, new FrameLayout.LayoutParams(-1, -1));
            og.i iVar3 = a;
            iVar3.a.setVisibility(0);
            o1.j jVar = new o1.j(new ac.a(0.0f));
            jVar.u = org.telegram.ui.d3.l(1000.0f, 750.0f, 0.75f);
            jVar.b(new di.i8(2, iVar3));
            jVar.h();
        } else {
            iVar.getClass();
            launchActivity.w0.removeView(a);
            a = null;
        }
        if (z11) {
            SharedConfig.isFloatingDebugActive = z10;
            SharedConfig.saveConfig();
        }
    }
}
