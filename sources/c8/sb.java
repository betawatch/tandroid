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
import org.telegram.messenger.cz;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y61;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class sb {
    public static pg.i a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        pg.i iVar = a;
        if (z10 == (iVar != null)) {
            return;
        }
        if (z10) {
            pg.i iVar2 = new pg.i(launchActivity);
            int i7 = 3;
            iVar2.r = new pg.d(iVar2, i7);
            iVar2.F = new ArrayList();
            pg.g gVar = new pg.g(iVar2);
            iVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            iVar2.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            jn jnVar = new jn(launchActivity, gVar);
            ((GestureDetector) jnVar.b).setIsLongpressEnabled(false);
            y61 y61Var = new y61(iVar2, launchActivity, jnVar, i7);
            iVar2.a = y61Var;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.O9, null, PorterDuff.Mode.SRC_IN);
            y61Var.addView(imageView);
            y61Var.setVisibility(8);
            iVar2.addView(y61Var, ma.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            iVar2.x = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            iVar2.y = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(org.telegram.messenger.hd.N0(2131751634, null));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f));
            linearLayout.addView(textView, ma.o(-1, -2));
            ek0 ek0Var = new ek0(launchActivity, null);
            iVar2.E = ek0Var;
            ek0Var.setLayoutManager(new v4.c0());
            ek0Var.setAdapter(new org.telegram.ui.l4(iVar2, launchActivity));
            ek0Var.setOnItemClickListener(new bi.k8(iVar2, 19));
            linearLayout.addView(ek0Var, ma.l(1.0f, -1, 0));
            iVar2.addView(linearLayout, ma.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            iVar2.d();
            iVar2.setFitsSystemWindows(true);
            iVar2.setWillNotDraw(false);
            a = iVar2;
            launchActivity.v0.addView(iVar2, new FrameLayout.LayoutParams(-1, -1));
            pg.i iVar3 = a;
            iVar3.a.setVisibility(0);
            r1.g gVar2 = new r1.g(new r1.f(0.0f));
            gVar2.m = org.telegram.ui.Cells.c0.p(1000.0f, 750.0f, 0.75f);
            gVar2.b(new fi.q7(2, iVar3));
            gVar2.h();
        } else {
            iVar.getClass();
            launchActivity.v0.removeView(a);
            a = null;
        }
        if (z11) {
            cz.x1 = z10;
            cz.y();
        }
    }
}
