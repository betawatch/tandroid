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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.y9;
import org.telegram.ui.bd0;
import org.telegram.ui.dd0;
import org.telegram.ui.ed0;
import org.telegram.ui.gd0;
import org.telegram.ui.hd0;
import org.telegram.ui.rv;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        hd0 hd0Var = (hd0) this.b;
        ArrayList arrayList = hd0Var.g0;
        if (iMarker.getTag() instanceof gd0) {
            hd0Var.X.setVisibility(4);
            if (!hd0Var.C0) {
                ImageView imageView = hd0Var.a;
                int i10 = i6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                hd0Var.a.setTag(Integer.valueOf(i10));
                hd0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                bd0 bd0Var = (bd0) arrayList.get(i11);
                if (bd0Var == null || bd0Var.e != iMarker) {
                    i11++;
                } else {
                    hd0Var.i0 = bd0Var.a;
                    if (hd0Var.j0) {
                        hd0Var.j0 = false;
                        hd0Var.B0();
                    }
                    hd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(bd0Var.e.getPosition(), this.a));
                }
            }
            ed0 ed0Var = hd0Var.x;
            hd0 hd0Var2 = ed0Var.b;
            HashMap hashMap = ed0Var.a;
            gd0 gd0Var = (gd0) iMarker.getTag();
            if (gd0Var != null && hd0Var2.n0 != gd0Var) {
                hd0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = hd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ed0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    hd0Var2.m0 = null;
                }
                hd0Var2.n0 = gd0Var;
                hd0Var2.m0 = iMarker;
                Context context = ed0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ed0Var.addView(frameLayout, x5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                hd0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                hd0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(hd0Var2.getThemedColor(i6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(hd0Var2.o0, x5.d(71.0f, -2));
                hd0Var2.o0.setAlpha(0.0f);
                hd0Var2.o0.setOnClickListener(new rv(17, ed0Var, gd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(hd0Var2.getThemedColor(i6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView g10 = org.telegram.ui.Cells.c1.g(hd0Var2.o0, textView, x5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(hd0Var2.getThemedColor(i6.A6));
                g10.setGravity(LocaleController.isRTL ? 5 : 3);
                hd0Var2.o0.addView(g10, x5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
                textView.setText(gd0Var.c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(i6.K(AndroidUtilities.dp(36.0f), u4.a(gd0Var.a)));
                frameLayout.addView(frameLayout3, x5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                y9 y9Var = new y9(context);
                y9Var.f(a1.g.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), gd0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(y9Var, x5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new dd0(ed0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                hd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
