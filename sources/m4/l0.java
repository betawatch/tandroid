package m4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y4;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.y9;
import org.telegram.ui.d3;
import org.telegram.ui.lc0;
import org.telegram.ui.nc0;
import org.telegram.ui.oc0;
import org.telegram.ui.qc0;
import org.telegram.ui.rc0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements o0, IMapsProvider.OnMarkerClickListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // m4.o0
    public void i(w wVar) {
        ((p0) this.b).g.t.b(this.a);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        rc0 rc0Var = (rc0) this.b;
        ArrayList arrayList = rc0Var.g0;
        if (iMarker.getTag() instanceof qc0) {
            rc0Var.X.setVisibility(4);
            if (!rc0Var.B0) {
                ImageView imageView = rc0Var.a;
                int i10 = y6.ui;
                f7.t(imageView, i10, rc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                rc0Var.a.setTag(Integer.valueOf(i10));
                rc0Var.B0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                lc0 lc0Var = (lc0) arrayList.get(i11);
                if (lc0Var == null || lc0Var.e != iMarker) {
                    i11++;
                } else {
                    rc0Var.i0 = lc0Var.a;
                    if (rc0Var.j0) {
                        rc0Var.j0 = false;
                        rc0Var.D0();
                    }
                    rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(lc0Var.e.getPosition(), this.a));
                }
            }
            oc0 oc0Var = rc0Var.x;
            rc0 rc0Var2 = oc0Var.b;
            HashMap hashMap = oc0Var.a;
            qc0 qc0Var = (qc0) iMarker.getTag();
            if (qc0Var != null && rc0Var2.n0 != qc0Var) {
                rc0Var2.z0(false);
                IMapsProvider.IMarker iMarker2 = rc0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        oc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    rc0Var2.m0 = null;
                }
                rc0Var2.n0 = qc0Var;
                rc0Var2.m0 = iMarker;
                Context context = oc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                oc0Var.addView(frameLayout, kb1.g(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                rc0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                FrameLayout frameLayout3 = rc0Var2.o0;
                f7.y(frameLayout3, frameLayout3.getBackground(), y6.h5, rc0Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                frameLayout.addView(rc0Var2.o0, kb1.g(71.0f, -2));
                rc0Var2.o0.setAlpha(0.0f);
                rc0Var2.o0.setOnClickListener(new l51(28, oc0Var, qc0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                f7.V(textView, y6.G6, rc0Var2.getResourceProvider());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView k10 = d3.k(rc0Var2.o0, textView, kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                k10.setTextSize(1, 14.0f);
                k10.setMaxLines(1);
                k10.setEllipsize(truncateAt);
                k10.setSingleLine(true);
                f7.V(k10, y6.A6, rc0Var2.getResourceProvider());
                k10.setGravity(LocaleController.isRTL ? 5 : 3);
                rc0Var2.o0.addView(k10, kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(qc0Var.c.title);
                k10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout4 = new FrameLayout(context);
                frameLayout4.setBackground(y6.K(AndroidUtilities.dp(36.0f), y4.a(qc0Var.a)));
                frameLayout.addView(frameLayout4, kb1.h(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                y9 y9Var = new y9(context);
                y9Var.g(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), qc0Var.c.venue_type, "_64.png"), null, null);
                frameLayout4.addView(y9Var, kb1.i(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new nc0(oc0Var, frameLayout4));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                rc0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
