// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class a5b extends qt7 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ oab d;
    public final /* synthetic */ r63 e;
    public final /* synthetic */ eab f;

    public a5b(eab eabVar, Context context, oab oabVar, r63 r63Var) {
        this.f = eabVar;
        this.c = context;
        this.d = oabVar;
        this.e = r63Var;
    }

    @Override // qt7
    public final void a(ggc ggcVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        ggcVar.removeView(frameLayout);
        a58 a58Var = (a58) frameLayout.getChildAt(0);
        gm.B2(a58Var);
        this.f.Q0.add(a58Var);
    }

    @Override // qt7
    public final int b() {
        eab eabVar = this.f;
        ArrayList arrayList = eabVar.y0;
        return arrayList != null ? arrayList.size() : eabVar.B0.size();
    }

    @Override // qt7
    public final Object e(ggc ggcVar, int i) {
        a58 z4bVar;
        Context context = this.c;
        eab eabVar = this.f;
        b5b b5bVar = new b5b(eabVar, context);
        ArrayList arrayList = eabVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        oab oabVar = this.d;
        if (isEmpty) {
            z4bVar = new z4b(this, this.c, oabVar, eabVar.I0, this.e);
        } else {
            z4bVar = (a58) arrayList.remove(0);
            z4bVar.e1.a.getImageReceiver().v0(true, true);
            if (z4bVar.U1 != null) {
                z4bVar.R1.r1();
                z4bVar.R1.setAlpha(1.0f - z4bVar.T3);
            }
            v29 v29Var = z4bVar.V1;
            if (v29Var != null) {
                v29Var.k();
            }
            v29 v29Var2 = z4bVar.h3;
            if (v29Var2 != null) {
                v29Var2.k();
            }
            q qVar = z4bVar.z2;
            if (qVar != null) {
                gm.B2(qVar);
                z4bVar.z2.m();
                z4bVar.z2 = null;
            }
            z4bVar.setActive(false);
            z4bVar.setIsVisible(false);
            z4bVar.B2 = false;
            z4bVar.E2.e(false, 0.0f);
            z4bVar.b1 = null;
            z4bVar.Y2 = false;
            z4bVar.f0();
        }
        b5bVar.a = z4bVar;
        z4bVar.setAccount(eabVar.z0);
        z4bVar.setDelegate(eabVar.C0);
        z4bVar.setLongpressed(oabVar.a1);
        b5bVar.setTag(Integer.valueOf(i));
        ArrayList arrayList2 = eabVar.y0;
        if (arrayList2 != null) {
            if (oabVar.R0) {
                i = (arrayList2.size() - 1) - i;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i);
            b5bVar.c = arrayList3;
            z3b z3bVar = oabVar.O0;
            if ((z3bVar instanceof u3b) || (z3bVar instanceof b4b)) {
                k47 f = z3bVar.f(((Integer) arrayList3.get(0)).intValue());
                b5bVar.b = f == null ? eabVar.x0 : k47.B0(f.k);
            } else {
                b5bVar.b = eabVar.x0;
            }
        } else {
            b5bVar.c = null;
            b5bVar.b = ((Long) eabVar.B0.get(i)).longValue();
        }
        b5bVar.addView(z4bVar);
        z4bVar.requestLayout();
        ggcVar.addView(b5bVar);
        return b5bVar;
    }

    @Override // qt7
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
