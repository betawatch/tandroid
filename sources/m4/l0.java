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
import org.telegram.ui.fd0;
import org.telegram.ui.hd0;
import org.telegram.ui.id0;
import org.telegram.ui.kd0;
import org.telegram.ui.ld0;
import org.telegram.ui.xv;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements o0, IMapsProvider.OnMarkerClickListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // m4.o0
    public void e(v vVar) {
        ((p0) this.b).g.t.a(this.a);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        ld0 ld0Var = (ld0) this.b;
        ArrayList arrayList = ld0Var.g0;
        if (iMarker.getTag() instanceof kd0) {
            ld0Var.X.setVisibility(4);
            if (!ld0Var.C0) {
                ImageView imageView = ld0Var.a;
                int i10 = g6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(ld0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                ld0Var.a.setTag(Integer.valueOf(i10));
                ld0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                fd0 fd0Var = (fd0) arrayList.get(i11);
                if (fd0Var == null || fd0Var.e != iMarker) {
                    i11++;
                } else {
                    ld0Var.i0 = fd0Var.a;
                    if (ld0Var.j0) {
                        ld0Var.j0 = false;
                        ld0Var.B0();
                    }
                    ld0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(fd0Var.e.getPosition(), this.a));
                }
            }
            id0 id0Var = ld0Var.x;
            ld0 ld0Var2 = id0Var.b;
            HashMap hashMap = id0Var.a;
            kd0 kd0Var = (kd0) iMarker.getTag();
            if (kd0Var != null && ld0Var2.n0 != kd0Var) {
                ld0Var2.x0(false);
                IMapsProvider.IMarker iMarker2 = ld0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        id0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    ld0Var2.m0 = null;
                }
                ld0Var2.n0 = kd0Var;
                ld0Var2.m0 = iMarker;
                Context context = id0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                id0Var.addView(frameLayout, z5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                ld0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                ld0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(ld0Var2.getThemedColor(g6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(ld0Var2.o0, z5.d(71.0f, -2));
                ld0Var2.o0.setAlpha(0.0f);
                ld0Var2.o0.setOnClickListener(new xv(17, id0Var, kd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(ld0Var2.getThemedColor(g6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView g10 = org.telegram.ui.Cells.c1.g(ld0Var2.o0, textView, z5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(ld0Var2.getThemedColor(g6.A6));
                g10.setGravity(LocaleController.isRTL ? 5 : 3);
                ld0Var2.o0.addView(g10, z5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
                textView.setText(kd0Var.c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(g6.K(AndroidUtilities.dp(36.0f), u4.a(kd0Var.a)));
                frameLayout.addView(frameLayout3, z5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                z9 z9Var = new z9(context);
                z9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), kd0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(z9Var, z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hd0(id0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                ld0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
