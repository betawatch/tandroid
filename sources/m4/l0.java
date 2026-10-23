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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.hc0;
import org.telegram.ui.jc0;
import org.telegram.ui.kc0;
import org.telegram.ui.mc0;
import org.telegram.ui.nc0;
import w7.z5;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements o0, IMapsProvider.OnMarkerClickListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // m4.o0
    public void f(v vVar) {
        ((p0) this.b).g.t.a(this.a);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        nc0 nc0Var = (nc0) this.b;
        ArrayList arrayList = nc0Var.g0;
        if (iMarker.getTag() instanceof mc0) {
            nc0Var.X.setVisibility(4);
            if (!nc0Var.C0) {
                ImageView imageView = nc0Var.a;
                int i10 = h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(nc0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                nc0Var.a.setTag(Integer.valueOf(i10));
                nc0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                hc0 hc0Var = (hc0) arrayList.get(i11);
                if (hc0Var == null || hc0Var.e != iMarker) {
                    i11++;
                } else {
                    nc0Var.i0 = hc0Var.a;
                    if (nc0Var.j0) {
                        nc0Var.j0 = false;
                        nc0Var.B0();
                    }
                    nc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(hc0Var.e.getPosition(), this.a));
                }
            }
            kc0 kc0Var = nc0Var.x;
            nc0 nc0Var2 = kc0Var.b;
            HashMap hashMap = kc0Var.a;
            mc0 mc0Var = (mc0) iMarker.getTag();
            if (mc0Var != null && nc0Var2.n0 != mc0Var) {
                nc0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = nc0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        kc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    nc0Var2.m0 = null;
                }
                nc0Var2.n0 = mc0Var;
                nc0Var2.m0 = iMarker;
                Context context = kc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                kc0Var.addView(frameLayout, z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                nc0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                nc0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(nc0Var2.getThemedColor(h6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(nc0Var2.o0, z5.c(71.0f, -2));
                nc0Var2.o0.setAlpha(0.0f);
                nc0Var2.o0.setOnClickListener(new i51(27, kc0Var, mc0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(nc0Var2.getThemedColor(h6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView j10 = org.telegram.ui.Cells.c1.j(nc0Var2.o0, textView, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                j10.setTextSize(1, 14.0f);
                j10.setMaxLines(1);
                j10.setEllipsize(truncateAt);
                j10.setSingleLine(true);
                j10.setTextColor(nc0Var2.getThemedColor(h6.A6));
                j10.setGravity(LocaleController.isRTL ? 5 : 3);
                nc0Var2.o0.addView(j10, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(mc0Var.c.title);
                j10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(h6.K(AndroidUtilities.dp(36.0f), t4.a(mc0Var.a)));
                frameLayout.addView(frameLayout3, z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), mc0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(w9Var, z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jc0(kc0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                nc0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
