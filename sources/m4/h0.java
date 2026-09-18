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
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Components.u9;
import org.telegram.ui.ed0;
import org.telegram.ui.gd0;
import org.telegram.ui.hd0;
import org.telegram.ui.jd0;
import org.telegram.ui.kd0;
import org.telegram.ui.uv;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements k0, IMapsProvider.OnMarkerClickListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // m4.k0
    public void g(r rVar) {
        ((l0) this.b).g.t.a(this.a);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        kd0 kd0Var = (kd0) this.b;
        ArrayList arrayList = kd0Var.g0;
        if (iMarker.getTag() instanceof jd0) {
            kd0Var.X.setVisibility(4);
            if (!kd0Var.C0) {
                ImageView imageView = kd0Var.a;
                int i10 = j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(kd0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                kd0Var.a.setTag(Integer.valueOf(i10));
                kd0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                ed0 ed0Var = (ed0) arrayList.get(i11);
                if (ed0Var == null || ed0Var.e != iMarker) {
                    i11++;
                } else {
                    kd0Var.i0 = ed0Var.a;
                    if (kd0Var.j0) {
                        kd0Var.j0 = false;
                        kd0Var.C0();
                    }
                    kd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ed0Var.e.getPosition(), this.a));
                }
            }
            hd0 hd0Var = kd0Var.x;
            kd0 kd0Var2 = hd0Var.b;
            HashMap hashMap = hd0Var.a;
            jd0 jd0Var = (jd0) iMarker.getTag();
            if (jd0Var != null && kd0Var2.n0 != jd0Var) {
                kd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = kd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        hd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    kd0Var2.m0 = null;
                }
                kd0Var2.n0 = jd0Var;
                kd0Var2.m0 = iMarker;
                Context context = hd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                hd0Var.addView(frameLayout, x5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                kd0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                kd0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(kd0Var2.getThemedColor(j6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(kd0Var2.o0, x5.c(71.0f, -2));
                kd0Var2.o0.setAlpha(0.0f);
                kd0Var2.o0.setOnClickListener(new uv(17, hd0Var, jd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(kd0Var2.getThemedColor(j6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView f7 = p6.f(kd0Var2.o0, textView, x5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                f7.setTextSize(1, 14.0f);
                f7.setMaxLines(1);
                f7.setEllipsize(truncateAt);
                f7.setSingleLine(true);
                f7.setTextColor(kd0Var2.getThemedColor(j6.A6));
                f7.setGravity(LocaleController.isRTL ? 5 : 3);
                kd0Var2.o0.addView(f7, x5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(jd0Var.c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(j6.K(AndroidUtilities.dp(36.0f), t4.a(jd0Var.a)));
                frameLayout.addView(frameLayout3, x5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                u9 u9Var = new u9(context);
                u9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), jd0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(u9Var, x5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new gd0(hd0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                kd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
