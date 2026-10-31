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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.eb;
import org.telegram.messenger.fa;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.xk;
import org.telegram.ui.sb0;
import org.telegram.ui.ub0;
import org.telegram.ui.wu;
import org.telegram.ui.xb0;
import org.telegram.ui.yb0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements o0, eb {
    public final /* synthetic */ float a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, float f7) {
        this.b = obj;
        this.a = f7;
    }

    @Override // org.telegram.messenger.eb
    public void a(fa faVar) {
        yb0 yb0Var = (yb0) this.b;
        ArrayList arrayList = yb0Var.p0;
        if (faVar.b() instanceof xb0) {
            yb0Var.V.setVisibility(4);
            if (!yb0Var.K0) {
                ImageView imageView = yb0Var.a;
                int i10 = t6.ij;
                a7.t(imageView, i10, yb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                yb0Var.a.setTag(Integer.valueOf(i10));
                yb0Var.K0 = true;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                sb0 sb0Var = (sb0) arrayList.get(i11);
                if (sb0Var == null || sb0Var.e != faVar) {
                    i11++;
                } else {
                    yb0Var.r0 = sb0Var.a;
                    if (yb0Var.s0) {
                        yb0Var.s0 = false;
                        yb0Var.R0();
                    }
                    yb0Var.G.b(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(sb0Var.e.a(), this.a));
                }
            }
            ub0 ub0Var = yb0Var.w;
            yb0 yb0Var2 = ub0Var.b;
            HashMap hashMap = ub0Var.a;
            xb0 xb0Var = (xb0) faVar.b();
            if (xb0Var == null || yb0Var2.w0 == xb0Var) {
                return;
            }
            yb0Var2.M0(false);
            fa faVar2 = yb0Var2.v0;
            if (faVar2 != null) {
                View view = (View) hashMap.get(faVar2);
                if (view != null) {
                    ub0Var.removeView(view);
                    hashMap.remove(faVar2);
                }
                yb0Var2.v0 = null;
            }
            yb0Var2.w0 = xb0Var;
            yb0Var2.v0 = faVar;
            Context context = ub0Var.getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            ub0Var.addView(frameLayout, b6.c(114.0f, -2));
            FrameLayout frameLayout2 = new FrameLayout(context);
            yb0Var2.x0 = frameLayout2;
            frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
            FrameLayout frameLayout3 = yb0Var2.x0;
            a7.y(frameLayout3, frameLayout3.getBackground(), t6.h5, yb0Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            frameLayout.addView(yb0Var2.x0, b6.c(71.0f, -2));
            yb0Var2.x0.setAlpha(0.0f);
            yb0Var2.x0.setOnClickListener(new wu(17, ub0Var, xb0Var));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setSingleLine(true);
            a7.V(textView, t6.G6, yb0Var2.getResourceProvider());
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setGravity(cd.X ? 5 : 3);
            TextView l4 = org.telegram.ui.Cells.f1.l(yb0Var2.x0, textView, b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
            l4.setTextSize(1, 14.0f);
            l4.setMaxLines(1);
            l4.setEllipsize(truncateAt);
            l4.setSingleLine(true);
            a7.V(l4, t6.A6, yb0Var2.getResourceProvider());
            l4.setGravity(cd.X ? 5 : 3);
            yb0Var2.x0.addView(l4, b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
            textView.setText(xb0Var.c.title);
            l4.setText(cd.L0(2131744280, null));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(t6.L(org.telegram.messenger.i0.L(36.0f), x4.a(xb0Var.a)));
            frameLayout.addView(frameLayout4, b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
            g9 g9Var = new g9(context);
            g9Var.h(a1.g.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), xb0Var.c.venue_type, "_64.png"), null, null);
            frameLayout4.addView(g9Var, b6.e(30, 30, 17));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xk(ub0Var, frameLayout4));
            ofFloat.setDuration(360L);
            ofFloat.start();
            hashMap.put(faVar, frameLayout);
            yb0Var2.G.c(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLng(faVar.a()), zs.X4);
        }
    }

    @Override // m4.o0
    public void b(w wVar) {
        ((p0) this.b).h.t.b(this.a);
    }
}
