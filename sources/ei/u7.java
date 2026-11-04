package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.li0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u7 extends b5.a {
    public final /* synthetic */ Context c;
    public final /* synthetic */ r9 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ x f;

    public u7(x xVar, Context context, r9 r9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f = xVar;
        this.c = context;
        this.d = r9Var;
        this.e = e6Var;
    }

    @Override // b5.a
    public final void a(b5.l lVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        lVar.removeView(frameLayout);
        j4 j4Var = (j4) frameLayout.getChildAt(0);
        org.telegram.messenger.g0.E2(j4Var);
        this.f.Q0.add(j4Var);
    }

    @Override // b5.a
    public final int b() {
        x xVar = this.f;
        ArrayList arrayList = xVar.y0;
        return arrayList != null ? arrayList.size() : xVar.B0.size();
    }

    @Override // b5.a
    public final Object e(b5.l lVar, int i3) {
        j4 t7Var;
        Context context = this.c;
        x xVar = this.f;
        w7 w7Var = new w7(xVar, context);
        ArrayList arrayList = xVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        r9 r9Var = this.d;
        if (isEmpty) {
            t7Var = new t7(this, this.c, r9Var, xVar.I0, this.e);
        } else {
            t7Var = (j4) arrayList.remove(0);
            t7Var.Y0.a.getImageReceiver().O0(true, true);
            if (t7Var.O1 != null) {
                t7Var.L1.O0();
                t7Var.L1.setAlpha(1.0f - t7Var.O3);
            }
            li0 li0Var = t7Var.P1;
            if (li0Var != null) {
                li0Var.n();
            }
            li0 li0Var2 = t7Var.b3;
            if (li0Var2 != null) {
                li0Var2.n();
            }
            k40 k40Var = t7Var.t2;
            if (k40Var != null) {
                org.telegram.messenger.g0.E2(k40Var);
                t7Var.t2.c(true);
                t7Var.t2 = null;
            }
            t7Var.setActive(false);
            t7Var.setIsVisible(false);
            t7Var.v2 = false;
            t7Var.y2.e(false, 0.0f);
            t7Var.V0 = null;
            t7Var.S2 = false;
            t7Var.n0();
        }
        w7Var.a = t7Var;
        t7Var.setAccount(xVar.z0);
        t7Var.setDelegate(xVar.C0);
        t7Var.setLongpressed(r9Var.b1);
        w7Var.setTag(Integer.valueOf(i3));
        ArrayList arrayList2 = xVar.y0;
        if (arrayList2 != null) {
            if (r9Var.S0) {
                i3 = (arrayList2.size() - 1) - i3;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i3);
            w7Var.c = arrayList3;
            r6 r6Var = r9Var.P0;
            if ((r6Var instanceof l6) || (r6Var instanceof u6)) {
                zi f10 = r6Var.f(((Integer) arrayList3.get(0)).intValue());
                w7Var.b = f10 == null ? xVar.x0 : zi.B0(f10.k);
            } else {
                w7Var.b = xVar.x0;
            }
        } else {
            w7Var.c = null;
            w7Var.b = ((Long) xVar.B0.get(i3)).longValue();
        }
        w7Var.addView(t7Var);
        t7Var.requestLayout();
        lVar.addView(w7Var);
        return w7Var;
    }

    @Override // b5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
