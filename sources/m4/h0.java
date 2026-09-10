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
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.w9;
import org.telegram.ui.cd0;
import org.telegram.ui.ed0;
import org.telegram.ui.fd0;
import org.telegram.ui.hd0;
import org.telegram.ui.id0;
import org.telegram.ui.ow;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements k0, IMapsProvider.OnMarkerClickListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // m4.k0
    public void h(r rVar) {
        ((l0) this.b).g.t.a(this.a);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        id0 id0Var = (id0) this.b;
        ArrayList arrayList = id0Var.g0;
        if (iMarker.getTag() instanceof hd0) {
            id0Var.X.setVisibility(4);
            if (!id0Var.C0) {
                ImageView imageView = id0Var.a;
                int i10 = j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(id0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                id0Var.a.setTag(Integer.valueOf(i10));
                id0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                cd0 cd0Var = (cd0) arrayList.get(i11);
                if (cd0Var == null || cd0Var.e != iMarker) {
                    i11++;
                } else {
                    id0Var.i0 = cd0Var.a;
                    if (id0Var.j0) {
                        id0Var.j0 = false;
                        id0Var.C0();
                    }
                    id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cd0Var.e.getPosition(), this.a));
                }
            }
            fd0 fd0Var = id0Var.x;
            id0 id0Var2 = fd0Var.b;
            HashMap hashMap = fd0Var.a;
            hd0 hd0Var = (hd0) iMarker.getTag();
            if (hd0Var != null && id0Var2.n0 != hd0Var) {
                id0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = id0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        fd0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    id0Var2.m0 = null;
                }
                id0Var2.n0 = hd0Var;
                id0Var2.m0 = iMarker;
                Context context = fd0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                fd0Var.addView(frameLayout, a6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                id0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                id0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(id0Var2.getThemedColor(j6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(id0Var2.o0, a6.c(71.0f, -2));
                id0Var2.o0.setAlpha(0.0f);
                id0Var2.o0.setOnClickListener(new ow(14, fd0Var, hd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(id0Var2.getThemedColor(j6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView f7 = r6.f(id0Var2.o0, textView, a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                f7.setTextSize(1, 14.0f);
                f7.setMaxLines(1);
                f7.setEllipsize(truncateAt);
                f7.setSingleLine(true);
                f7.setTextColor(id0Var2.getThemedColor(j6.A6));
                f7.setGravity(LocaleController.isRTL ? 5 : 3);
                id0Var2.o0.addView(f7, a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(hd0Var.c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(j6.K(AndroidUtilities.dp(36.0f), u4.a(hd0Var.a)));
                frameLayout.addView(frameLayout3, a6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), hd0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(w9Var, a6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ed0(fd0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                id0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
