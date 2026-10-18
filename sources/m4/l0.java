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
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.w9;
import org.telegram.ui.jc0;
import org.telegram.ui.lc0;
import org.telegram.ui.mc0;
import org.telegram.ui.oc0;
import org.telegram.ui.pc0;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        pc0 pc0Var = (pc0) this.b;
        ArrayList arrayList = pc0Var.g0;
        if (iMarker.getTag() instanceof oc0) {
            pc0Var.X.setVisibility(4);
            if (!pc0Var.C0) {
                ImageView imageView = pc0Var.a;
                int i10 = h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(pc0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                pc0Var.a.setTag(Integer.valueOf(i10));
                pc0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                jc0 jc0Var = (jc0) arrayList.get(i11);
                if (jc0Var == null || jc0Var.e != iMarker) {
                    i11++;
                } else {
                    pc0Var.i0 = jc0Var.a;
                    if (pc0Var.j0) {
                        pc0Var.j0 = false;
                        pc0Var.B0();
                    }
                    pc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.e.getPosition(), this.a));
                }
            }
            mc0 mc0Var = pc0Var.x;
            pc0 pc0Var2 = mc0Var.b;
            HashMap hashMap = mc0Var.a;
            oc0 oc0Var = (oc0) iMarker.getTag();
            if (oc0Var != null && pc0Var2.n0 != oc0Var) {
                pc0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = pc0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        mc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    pc0Var2.m0 = null;
                }
                pc0Var2.n0 = oc0Var;
                pc0Var2.m0 = iMarker;
                Context context = mc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                mc0Var.addView(frameLayout, z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                pc0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                pc0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(pc0Var2.getThemedColor(h6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(pc0Var2.o0, z5.c(71.0f, -2));
                pc0Var2.o0.setAlpha(0.0f);
                pc0Var2.o0.setOnClickListener(new g51(27, mc0Var, oc0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(pc0Var2.getThemedColor(h6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView j10 = org.telegram.ui.Cells.c1.j(pc0Var2.o0, textView, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                j10.setTextSize(1, 14.0f);
                j10.setMaxLines(1);
                j10.setEllipsize(truncateAt);
                j10.setSingleLine(true);
                j10.setTextColor(pc0Var2.getThemedColor(h6.A6));
                j10.setGravity(LocaleController.isRTL ? 5 : 3);
                pc0Var2.o0.addView(j10, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(oc0Var.c.title);
                j10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(h6.K(AndroidUtilities.dp(36.0f), t4.a(oc0Var.a)));
                frameLayout.addView(frameLayout3, z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), oc0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(w9Var, z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lc0(mc0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                pc0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
