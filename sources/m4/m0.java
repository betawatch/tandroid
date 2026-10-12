package m4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.z9;
import org.telegram.ui.hd0;
import org.telegram.ui.jd0;
import org.telegram.ui.kd0;
import org.telegram.ui.md0;
import org.telegram.ui.nd0;
import org.telegram.ui.xv;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements p0, IMapsProvider.OnMarkerClickListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // m4.p0
    public void f(w wVar) {
        ((q0) this.b).g.t.a(this.a);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        nd0 nd0Var = (nd0) this.b;
        ArrayList arrayList = nd0Var.g0;
        if (iMarker.getTag() instanceof md0) {
            nd0Var.X.setVisibility(4);
            if (!nd0Var.C0) {
                ImageView imageView = nd0Var.a;
                int i10 = g6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(nd0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                nd0Var.a.setTag(Integer.valueOf(i10));
                nd0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                hd0 hd0Var = (hd0) arrayList.get(i11);
                if (hd0Var == null || hd0Var.e != iMarker) {
                    i11++;
                } else {
                    nd0Var.i0 = hd0Var.a;
                    if (nd0Var.j0) {
                        nd0Var.j0 = false;
                        nd0Var.B0();
                    }
                    nd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(hd0Var.e.getPosition(), this.a));
                }
            }
            kd0 kd0Var = nd0Var.x;
            nd0 nd0Var2 = kd0Var.b;
            HashMap hashMap = kd0Var.a;
            md0 md0Var = (md0) iMarker.getTag();
            if (md0Var != null && nd0Var2.n0 != md0Var) {
                nd0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = nd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        kd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    nd0Var2.m0 = null;
                }
                nd0Var2.n0 = md0Var;
                nd0Var2.m0 = iMarker;
                Context context = kd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                kd0Var.addView(frameLayout, a6.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                nd0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                nd0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(nd0Var2.getThemedColor(g6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(nd0Var2.o0, a6.d(71.0f, -2));
                nd0Var2.o0.setAlpha(0.0f);
                nd0Var2.o0.setOnClickListener(new xv(17, kd0Var, md0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(nd0Var2.getThemedColor(g6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView h = org.telegram.ui.Cells.d0.h(nd0Var2.o0, textView, a6.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(nd0Var2.getThemedColor(g6.A6));
                h.setGravity(LocaleController.isRTL ? 5 : 3);
                nd0Var2.o0.addView(h, a6.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
                textView.setText(md0Var.c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(g6.K(AndroidUtilities.dp(36.0f), u4.a(md0Var.a)));
                frameLayout.addView(frameLayout3, a6.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                z9 z9Var = new z9(context);
                z9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), md0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(z9Var, a6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jd0(kd0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                nd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
