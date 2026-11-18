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
import org.telegram.messenger.bz;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y61;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
            hn hnVar = new hn(launchActivity, gVar);
            ((GestureDetector) hnVar.b).setIsLongpressEnabled(false);
            y61 y61Var = new y61(iVar2, launchActivity, hnVar, i7);
            iVar2.a = y61Var;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.O9, null, PorterDuff.Mode.SRC_IN);
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
            textView.setText(org.telegram.messenger.gd.M0(2131751635, null));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f));
            linearLayout.addView(textView, ma.o(-1, -2));
            ck0 ck0Var = new ck0(launchActivity, null);
            iVar2.E = ck0Var;
            ck0Var.setLayoutManager(new v4.c0());
            ck0Var.setAdapter(new org.telegram.ui.l4(iVar2, launchActivity));
            ck0Var.setOnItemClickListener(new bi.h8(iVar2, 19));
            linearLayout.addView(ck0Var, ma.l(1.0f, -1, 0));
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
            bz.x1 = z10;
            bz.y();
        }
    }
}
