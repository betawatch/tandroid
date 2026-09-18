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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.w9;
import org.telegram.ui.dd0;
import org.telegram.ui.fd0;
import org.telegram.ui.gd0;
import org.telegram.ui.id0;
import org.telegram.ui.jd0;
import org.telegram.ui.tv;
import w7.y5;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements j0, IMapsProvider.OnMarkerClickListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // m4.j0
    public void g(r rVar) {
        ((k0) this.b).g.t.a(this.a);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        jd0 jd0Var = (jd0) this.b;
        ArrayList arrayList = jd0Var.g0;
        if (iMarker.getTag() instanceof id0) {
            jd0Var.X.setVisibility(4);
            if (!jd0Var.C0) {
                ImageView imageView = jd0Var.a;
                int i10 = j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(jd0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                jd0Var.a.setTag(Integer.valueOf(i10));
                jd0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                dd0 dd0Var = (dd0) arrayList.get(i11);
                if (dd0Var == null || dd0Var.e != iMarker) {
                    i11++;
                } else {
                    jd0Var.i0 = dd0Var.a;
                    if (jd0Var.j0) {
                        jd0Var.j0 = false;
                        jd0Var.C0();
                    }
                    jd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(dd0Var.e.getPosition(), this.a));
                }
            }
            gd0 gd0Var = jd0Var.x;
            jd0 jd0Var2 = gd0Var.b;
            HashMap hashMap = gd0Var.a;
            id0 id0Var = (id0) iMarker.getTag();
            if (id0Var != null && jd0Var2.n0 != id0Var) {
                jd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = jd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        gd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    jd0Var2.m0 = null;
                }
                jd0Var2.n0 = id0Var;
                jd0Var2.m0 = iMarker;
                Context context = gd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                gd0Var.addView(frameLayout, y5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                jd0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                jd0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(jd0Var2.getThemedColor(j6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(jd0Var2.o0, y5.c(71.0f, -2));
                jd0Var2.o0.setAlpha(0.0f);
                jd0Var2.o0.setOnClickListener(new tv(17, gd0Var, id0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(jd0Var2.getThemedColor(j6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView g10 = org.telegram.ui.Cells.c1.g(jd0Var2.o0, textView, y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(jd0Var2.getThemedColor(j6.A6));
                g10.setGravity(LocaleController.isRTL ? 5 : 3);
                jd0Var2.o0.addView(g10, y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(id0Var.c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(j6.K(AndroidUtilities.dp(36.0f), u4.a(id0Var.a)));
                frameLayout.addView(frameLayout3, y5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), id0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(w9Var, y5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new fd0(gd0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                jd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
