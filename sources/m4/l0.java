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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.mc0;
import org.telegram.ui.oc0;
import org.telegram.ui.pc0;
import org.telegram.ui.rc0;
import org.telegram.ui.sc0;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        sc0 sc0Var = (sc0) this.b;
        ArrayList arrayList = sc0Var.g0;
        if (iMarker.getTag() instanceof rc0) {
            sc0Var.X.setVisibility(4);
            if (!sc0Var.C0) {
                ImageView imageView = sc0Var.a;
                int i10 = k6.ui;
                r6.t(imageView, i10, sc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                sc0Var.a.setTag(Integer.valueOf(i10));
                sc0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                mc0 mc0Var = (mc0) arrayList.get(i11);
                if (mc0Var == null || mc0Var.e != iMarker) {
                    i11++;
                } else {
                    sc0Var.i0 = mc0Var.a;
                    if (sc0Var.j0) {
                        sc0Var.j0 = false;
                        sc0Var.C0();
                    }
                    sc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(mc0Var.e.getPosition(), this.a));
                }
            }
            pc0 pc0Var = sc0Var.x;
            sc0 sc0Var2 = pc0Var.b;
            HashMap hashMap = pc0Var.a;
            rc0 rc0Var = (rc0) iMarker.getTag();
            if (rc0Var != null && sc0Var2.n0 != rc0Var) {
                sc0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = sc0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        pc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    sc0Var2.m0 = null;
                }
                sc0Var2.n0 = rc0Var;
                sc0Var2.m0 = iMarker;
                Context context = pc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                pc0Var.addView(frameLayout, z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                sc0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                FrameLayout frameLayout3 = sc0Var2.o0;
                r6.z(frameLayout3, frameLayout3.getBackground(), k6.h5, sc0Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                frameLayout.addView(sc0Var2.o0, z5.c(71.0f, -2));
                sc0Var2.o0.setAlpha(0.0f);
                sc0Var2.o0.setOnClickListener(new d51(28, pc0Var, rc0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                r6.W(textView, k6.G6, sc0Var2.getResourceProvider());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView j10 = org.telegram.ui.Cells.b1.j(sc0Var2.o0, textView, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                j10.setTextSize(1, 14.0f);
                j10.setMaxLines(1);
                j10.setEllipsize(truncateAt);
                j10.setSingleLine(true);
                r6.W(j10, k6.A6, sc0Var2.getResourceProvider());
                j10.setGravity(LocaleController.isRTL ? 5 : 3);
                sc0Var2.o0.addView(j10, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(rc0Var.c.title);
                j10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout4 = new FrameLayout(context);
                frameLayout4.setBackground(k6.K(AndroidUtilities.dp(36.0f), t4.a(rc0Var.a)));
                frameLayout.addView(frameLayout4, z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.g(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), rc0Var.c.venue_type, "_64.png"), null, null);
                frameLayout4.addView(w9Var, z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new oc0(pc0Var, frameLayout4));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                sc0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
