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
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.fb;
import org.telegram.messenger.ga;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.xk;
import org.telegram.ui.rb0;
import org.telegram.ui.tb0;
import org.telegram.ui.vu;
import org.telegram.ui.wb0;
import org.telegram.ui.xb0;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements o0, fb {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // org.telegram.messenger.fb
    public void a(ga gaVar) {
        xb0 xb0Var = (xb0) this.b;
        ArrayList arrayList = xb0Var.p0;
        if (gaVar.b() instanceof wb0) {
            xb0Var.V.setVisibility(4);
            if (!xb0Var.K0) {
                ImageView imageView = xb0Var.a;
                int i10 = t6.ij;
                a7.t(imageView, i10, xb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                xb0Var.a.setTag(Integer.valueOf(i10));
                xb0Var.K0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                rb0 rb0Var = (rb0) arrayList.get(i11);
                if (rb0Var == null || rb0Var.e != gaVar) {
                    i11++;
                } else {
                    xb0Var.r0 = rb0Var.a;
                    if (xb0Var.s0) {
                        xb0Var.s0 = false;
                        xb0Var.S0();
                    }
                    xb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(rb0Var.e.a(), this.a));
                }
            }
            tb0 tb0Var = xb0Var.w;
            xb0 xb0Var2 = tb0Var.b;
            HashMap hashMap = tb0Var.a;
            wb0 wb0Var = (wb0) gaVar.b();
            if (wb0Var == null || xb0Var2.w0 == wb0Var) {
                return;
            }
            xb0Var2.N0(false);
            ga gaVar2 = xb0Var2.v0;
            if (gaVar2 != null) {
                View view = (View) hashMap.get(gaVar2);
                if (view != null) {
                    tb0Var.removeView(view);
                    hashMap.remove(gaVar2);
                }
                xb0Var2.v0 = null;
            }
            xb0Var2.w0 = wb0Var;
            xb0Var2.v0 = gaVar;
            Context context = tb0Var.getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            tb0Var.addView(frameLayout, b6.c(114.0f, -2));
            FrameLayout frameLayout2 = new FrameLayout(context);
            xb0Var2.x0 = frameLayout2;
            frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
            FrameLayout frameLayout3 = xb0Var2.x0;
            a7.y(frameLayout3, frameLayout3.getBackground(), t6.h5, xb0Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            frameLayout.addView(xb0Var2.x0, b6.c(71.0f, -2));
            xb0Var2.x0.setAlpha(0.0f);
            xb0Var2.x0.setOnClickListener(new vu(17, tb0Var, wb0Var));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setSingleLine(true);
            a7.V(textView, t6.G6, xb0Var2.getResourceProvider());
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setGravity(dd.X ? 5 : 3);
            TextView l4 = org.telegram.ui.Cells.f1.l(xb0Var2.x0, textView, b6.d(-2, -2.0f, (dd.X ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
            l4.setTextSize(1, 14.0f);
            l4.setMaxLines(1);
            l4.setEllipsize(truncateAt);
            l4.setSingleLine(true);
            a7.V(l4, t6.A6, xb0Var2.getResourceProvider());
            l4.setGravity(dd.X ? 5 : 3);
            xb0Var2.x0.addView(l4, b6.d(-2, -2.0f, (dd.X ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
            textView.setText(wb0Var.c.title);
            l4.setText(dd.L0(2131744280, null));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(t6.L(org.telegram.messenger.i0.L(36.0f), x4.a(wb0Var.a)));
            frameLayout.addView(frameLayout4, b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
            g9 g9Var = new g9(context);
            g9Var.h(a1.g.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), wb0Var.c.venue_type, "_64.png"), null, null);
            frameLayout4.addView(g9Var, b6.e(30, 30, 17));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xk(tb0Var, frameLayout4));
            ofFloat.setDuration(360L);
            ofFloat.start();
            hashMap.put(gaVar, frameLayout);
            xb0Var2.G.c(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(gaVar.a()), at.X4);
        }
    }

    @Override // m4.o0
    public void b(w wVar) {
        ((p0) this.b).h.t.b(this.a);
    }
}
