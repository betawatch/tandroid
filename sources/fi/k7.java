package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class k7 extends c5.a {
    public final /* synthetic */ Context c;
    public final /* synthetic */ f9 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 e;
    public final /* synthetic */ w f;

    public k7(w wVar, Context context, f9 f9Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f = wVar;
        this.c = context;
        this.d = f9Var;
        this.e = h6Var;
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        lVar.removeView(frameLayout);
        z3 z3Var = (z3) frameLayout.getChildAt(0);
        org.telegram.messenger.g0.E2(z3Var);
        this.f.Q0.add(z3Var);
    }

    @Override // c5.a
    public final int b() {
        w wVar = this.f;
        ArrayList arrayList = wVar.y0;
        return arrayList != null ? arrayList.size() : wVar.B0.size();
    }

    @Override // c5.a
    public final Object e(c5.l lVar, int i7) {
        z3 j7Var;
        Context context = this.c;
        w wVar = this.f;
        m7 m7Var = new m7(wVar, context);
        ArrayList arrayList = wVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        f9 f9Var = this.d;
        if (isEmpty) {
            j7Var = new j7(this, this.c, f9Var, wVar.I0, this.e);
        } else {
            j7Var = (z3) arrayList.remove(0);
            j7Var.Y0.a.getImageReceiver().O0(true, true);
            if (j7Var.O1 != null) {
                j7Var.L1.q1();
                j7Var.L1.setAlpha(1.0f - j7Var.O3);
            }
            xi0 xi0Var = j7Var.P1;
            if (xi0Var != null) {
                xi0Var.n();
            }
            xi0 xi0Var2 = j7Var.b3;
            if (xi0Var2 != null) {
                xi0Var2.n();
            }
            c50 c50Var = j7Var.t2;
            if (c50Var != null) {
                org.telegram.messenger.g0.E2(c50Var);
                j7Var.t2.d(true);
                j7Var.t2 = null;
            }
            j7Var.setActive(false);
            j7Var.setIsVisible(false);
            j7Var.v2 = false;
            j7Var.y2.e(false, 0.0f);
            j7Var.V0 = null;
            j7Var.S2 = false;
            j7Var.n0();
        }
        m7Var.a = j7Var;
        j7Var.setAccount(wVar.z0);
        j7Var.setDelegate(wVar.C0);
        j7Var.setLongpressed(f9Var.a1);
        m7Var.setTag(Integer.valueOf(i7));
        ArrayList arrayList2 = wVar.y0;
        if (arrayList2 != null) {
            if (f9Var.R0) {
                i7 = (arrayList2.size() - 1) - i7;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i7);
            m7Var.c = arrayList3;
            h6 h6Var = f9Var.O0;
            if ((h6Var instanceof b6) || (h6Var instanceof k6)) {
                fj f10 = h6Var.f(((Integer) arrayList3.get(0)).intValue());
                m7Var.b = f10 == null ? wVar.x0 : fj.B0(f10.k);
            } else {
                m7Var.b = wVar.x0;
            }
        } else {
            m7Var.c = null;
            m7Var.b = ((Long) wVar.B0.get(i7)).longValue();
        }
        m7Var.addView(j7Var);
        j7Var.requestLayout();
        lVar.addView(m7Var);
        return m7Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
