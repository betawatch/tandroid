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
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Components.w9;
import org.telegram.ui.bd0;
import org.telegram.ui.cd0;
import org.telegram.ui.ov;
import org.telegram.ui.wc0;
import org.telegram.ui.yc0;
import org.telegram.ui.zc0;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        cd0 cd0Var = (cd0) this.b;
        ArrayList arrayList = cd0Var.g0;
        if (iMarker.getTag() instanceof bd0) {
            cd0Var.X.setVisibility(4);
            if (!cd0Var.C0) {
                ImageView imageView = cd0Var.a;
                int i10 = h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(cd0Var.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                cd0Var.a.setTag(Integer.valueOf(i10));
                cd0Var.C0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                wc0 wc0Var = (wc0) arrayList.get(i11);
                if (wc0Var == null || wc0Var.e != iMarker) {
                    i11++;
                } else {
                    cd0Var.i0 = wc0Var.a;
                    if (cd0Var.j0) {
                        cd0Var.j0 = false;
                        cd0Var.C0();
                    }
                    cd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(wc0Var.e.getPosition(), this.a));
                }
            }
            zc0 zc0Var = cd0Var.x;
            cd0 cd0Var2 = zc0Var.b;
            HashMap hashMap = zc0Var.a;
            bd0 bd0Var = (bd0) iMarker.getTag();
            if (bd0Var != null && cd0Var2.n0 != bd0Var) {
                cd0Var2.y0(false);
                IMapsProvider.IMarker iMarker2 = cd0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        zc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    cd0Var2.m0 = null;
                }
                cd0Var2.n0 = bd0Var;
                cd0Var2.m0 = iMarker;
                Context context = zc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                zc0Var.addView(frameLayout, y5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                cd0Var2.o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                cd0Var2.o0.getBackground().setColorFilter(new PorterDuffColorFilter(cd0Var2.getThemedColor(h6.h5), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(cd0Var2.o0, y5.c(71.0f, -2));
                cd0Var2.o0.setAlpha(0.0f);
                cd0Var2.o0.setOnClickListener(new ov(17, zc0Var, bd0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(cd0Var2.getThemedColor(h6.G6));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView h = org.telegram.ui.Cells.c1.h(cd0Var2.o0, textView, y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(cd0Var2.getThemedColor(h6.A6));
                h.setGravity(LocaleController.isRTL ? 5 : 3);
                cd0Var2.o0.addView(h, y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(bd0Var.c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(h6.K(AndroidUtilities.dp(36.0f), u4.a(bd0Var.a)));
                frameLayout.addView(frameLayout3, y5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), bd0Var.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(w9Var, y5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yc0(zc0Var, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                cd0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
