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
import org.telegram.ui.Components.w9;
import org.telegram.ui.ad0;
import org.telegram.ui.cd0;
import org.telegram.ui.dd0;
import org.telegram.ui.fd0;
import org.telegram.ui.gd0;
import org.telegram.ui.tv;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements j0, IMapsProvider.OnMarkerClickListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // m4.j0
    public void f(r rVar) {
        ((k0) this.b).g.t.a(this.a);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        gd0 gd0Var = (gd0) this.b;
        ArrayList arrayList = gd0Var.g0;
        if (iMarker.getTag() instanceof fd0) {
            gd0Var.X.setVisibility(4);
            if (!gd0Var.C0) {
                ImageView imageView = gd0Var.a;
                int i10 = i6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(gd0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                gd0Var.a.setTag(Integer.valueOf(i10));
                gd0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                ad0 ad0Var = (ad0) arrayList.get(i11);
                if (ad0Var == null || ad0Var.e != iMarker) {
                    i11++;
                } else {
                    gd0Var.i0 = ad0Var.a;
                    if (gd0Var.j0) {
                        gd0Var.j0 = false;
                        gd0Var.C0();
                    }
                    gd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ad0Var.e.getPosition(), this.a));
                }
            }
            dd0 dd0Var = gd0Var.x;
            gd0 gd0Var2 = dd0Var.b;
            HashMap hashMap = dd0Var.a;
            fd0 fd0Var = (fd0) iMarker.getTag();
            if (fd0Var != null && gd0Var2.n0 != fd0Var) {
                gd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = gd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        dd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    gd0Var2.m0 = null;
                }
                gd0Var2.n0 = fd0Var;
                gd0Var2.m0 = iMarker;
                Context context = dd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                dd0Var.addView(frameLayout, z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                gd0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                gd0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(gd0Var2.getThemedColor(i6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(gd0Var2.o0, z5.c(71.0f, -2));
                gd0Var2.o0.setAlpha(0.0f);
                gd0Var2.o0.setOnClickListener(new tv(17, dd0Var, fd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(gd0Var2.getThemedColor(i6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView i12 = org.telegram.ui.Cells.c1.i(gd0Var2.o0, textView, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                i12.setTextSize(1, 14.0f);
                i12.setMaxLines(1);
                i12.setEllipsize(truncateAt);
                i12.setSingleLine(true);
                i12.setTextColor(gd0Var2.getThemedColor(i6.A6));
                i12.setGravity(LocaleController.isRTL ? 5 : 3);
                gd0Var2.o0.addView(i12, z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(fd0Var.c.title);
                i12.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(i6.K(AndroidUtilities.dp(36.0f), u4.a(fd0Var.a)));
                frameLayout.addView(frameLayout3, z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), fd0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(w9Var, z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new cd0(dd0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                gd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
