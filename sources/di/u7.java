package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.p40;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u7 extends c5.a {
    public final /* synthetic */ Context c;
    public final /* synthetic */ q9 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 e;
    public final /* synthetic */ w f;

    public u7(w wVar, Context context, q9 q9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f = wVar;
        this.c = context;
        this.d = q9Var;
        this.e = g6Var;
    }

    @Override // c5.a
    public final void a(c5.k kVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        kVar.removeView(frameLayout);
        j4 j4Var = (j4) frameLayout.getChildAt(0);
        org.telegram.messenger.g0.E2(j4Var);
        this.f.P0.add(j4Var);
    }

    @Override // c5.a
    public final int b() {
        w wVar = this.f;
        ArrayList arrayList = wVar.x0;
        return arrayList != null ? arrayList.size() : wVar.A0.size();
    }

    @Override // c5.a
    public final Object e(c5.k kVar, int i7) {
        j4 t7Var;
        Context context = this.c;
        w wVar = this.f;
        w7 w7Var = new w7(wVar, context);
        ArrayList arrayList = wVar.P0;
        boolean isEmpty = arrayList.isEmpty();
        q9 q9Var = this.d;
        if (isEmpty) {
            t7Var = new t7(this, this.c, q9Var, wVar.H0, this.e);
        } else {
            t7Var = (j4) arrayList.remove(0);
            t7Var.X0.a.getImageReceiver().O0(true, true);
            if (t7Var.N1 != null) {
                t7Var.K1.P0();
                t7Var.K1.setAlpha(1.0f - t7Var.N3);
            }
            ji0 ji0Var = t7Var.O1;
            if (ji0Var != null) {
                ji0Var.n();
            }
            ji0 ji0Var2 = t7Var.a3;
            if (ji0Var2 != null) {
                ji0Var2.n();
            }
            p40 p40Var = t7Var.s2;
            if (p40Var != null) {
                org.telegram.messenger.g0.E2(p40Var);
                t7Var.s2.d(true);
                t7Var.s2 = null;
            }
            t7Var.setActive(false);
            t7Var.setIsVisible(false);
            t7Var.u2 = false;
            t7Var.x2.e(false, 0.0f);
            t7Var.U0 = null;
            t7Var.R2 = false;
            t7Var.n0();
        }
        w7Var.a = t7Var;
        t7Var.setAccount(wVar.y0);
        t7Var.setDelegate(wVar.B0);
        t7Var.setLongpressed(q9Var.Z0);
        w7Var.setTag(Integer.valueOf(i7));
        ArrayList arrayList2 = wVar.x0;
        if (arrayList2 != null) {
            if (q9Var.Q0) {
                i7 = (arrayList2.size() - 1) - i7;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i7);
            w7Var.c = arrayList3;
            r6 r6Var = q9Var.N0;
            if ((r6Var instanceof l6) || (r6Var instanceof u6)) {
                ij f10 = r6Var.f(((Integer) arrayList3.get(0)).intValue());
                w7Var.b = f10 == null ? wVar.w0 : ij.B0(f10.k);
            } else {
                w7Var.b = wVar.w0;
            }
        } else {
            w7Var.c = null;
            w7Var.b = ((Long) wVar.A0.get(i7)).longValue();
        }
        w7Var.addView(t7Var);
        t7Var.requestLayout();
        kVar.addView(w7Var);
        return w7Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
