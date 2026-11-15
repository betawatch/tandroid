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
import org.telegram.messenger.gz;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w61;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class pb {
    public static pg.i a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        pg.i iVar = a;
        if (z10 == (iVar != null)) {
            return;
        }
        if (z10) {
            pg.i iVar2 = new pg.i(launchActivity);
            iVar2.r = new pg.d(iVar2, 3);
            iVar2.F = new ArrayList();
            pg.g gVar = new pg.g(iVar2);
            iVar2.e = launchActivity.getSharedPreferences("floating_debug", 0);
            iVar2.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            ou ouVar = new ou(launchActivity, gVar);
            ((GestureDetector) ouVar.b).setIsLongpressEnabled(false);
            int i7 = 2;
            w61 w61Var = new w61(iVar2, launchActivity, ouVar, i7);
            iVar2.a = w61Var;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.O9, null, PorterDuff.Mode.SRC_IN);
            w61Var.addView(imageView);
            w61Var.setVisibility(8);
            iVar2.addView(w61Var, ja.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            iVar2.x = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            iVar2.y = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(org.telegram.messenger.hd.M0(2131751646, null));
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f));
            linearLayout.addView(textView, ja.o(-1, -2));
            uj0 uj0Var = new uj0(launchActivity, null);
            iVar2.E = uj0Var;
            uj0Var.setLayoutManager(new v4.b0());
            uj0Var.setAdapter(new org.telegram.ui.l4(iVar2, launchActivity));
            uj0Var.setOnItemClickListener(new bi.b6(iVar2, 19));
            linearLayout.addView(uj0Var, ja.l(1.0f, -1, 0));
            iVar2.addView(linearLayout, ja.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            iVar2.d();
            iVar2.setFitsSystemWindows(true);
            iVar2.setWillNotDraw(false);
            a = iVar2;
            launchActivity.v0.addView(iVar2, new FrameLayout.LayoutParams(-1, -1));
            pg.i iVar3 = a;
            iVar3.a.setVisibility(0);
            r1.g gVar2 = new r1.g(new r1.f(0.0f));
            gVar2.m = org.telegram.ui.Cells.y0.n(1000.0f, 750.0f, 0.75f);
            gVar2.b(new fi.t7(i7, iVar3));
            gVar2.h();
        } else {
            iVar.getClass();
            launchActivity.v0.removeView(a);
            a = null;
        }
        if (z11) {
            gz.x1 = z10;
            gz.y();
        }
    }
}
