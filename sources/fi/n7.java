package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.r40;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n7 extends c5.a {
    public final /* synthetic */ Context c;
    public final /* synthetic */ i9 d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 e;
    public final /* synthetic */ w f;

    public n7(w wVar, Context context, i9 i9Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f = wVar;
        this.c = context;
        this.d = i9Var;
        this.e = e6Var;
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        FrameLayout frameLayout = (FrameLayout) obj;
        lVar.removeView(frameLayout);
        b4 b4Var = (b4) frameLayout.getChildAt(0);
        org.telegram.messenger.g0.E2(b4Var);
        this.f.Q0.add(b4Var);
    }

    @Override // c5.a
    public final int b() {
        w wVar = this.f;
        ArrayList arrayList = wVar.y0;
        return arrayList != null ? arrayList.size() : wVar.B0.size();
    }

    @Override // c5.a
    public final Object e(c5.l lVar, int i7) {
        b4 m7Var;
        Context context = this.c;
        w wVar = this.f;
        p7 p7Var = new p7(wVar, context);
        ArrayList arrayList = wVar.Q0;
        boolean isEmpty = arrayList.isEmpty();
        i9 i9Var = this.d;
        if (isEmpty) {
            m7Var = new m7(this, this.c, i9Var, wVar.I0, this.e);
        } else {
            m7Var = (b4) arrayList.remove(0);
            m7Var.Y0.a.getImageReceiver().O0(true, true);
            if (m7Var.O1 != null) {
                m7Var.L1.e1();
                m7Var.L1.setAlpha(1.0f - m7Var.O3);
            }
            mi0 mi0Var = m7Var.P1;
            if (mi0Var != null) {
                mi0Var.n();
            }
            mi0 mi0Var2 = m7Var.b3;
            if (mi0Var2 != null) {
                mi0Var2.n();
            }
            r40 r40Var = m7Var.t2;
            if (r40Var != null) {
                org.telegram.messenger.g0.E2(r40Var);
                m7Var.t2.d(true);
                m7Var.t2 = null;
            }
            m7Var.setActive(false);
            m7Var.setIsVisible(false);
            m7Var.v2 = false;
            m7Var.y2.e(false, 0.0f);
            m7Var.V0 = null;
            m7Var.S2 = false;
            m7Var.n0();
        }
        p7Var.a = m7Var;
        m7Var.setAccount(wVar.z0);
        m7Var.setDelegate(wVar.C0);
        m7Var.setLongpressed(i9Var.a1);
        p7Var.setTag(Integer.valueOf(i7));
        ArrayList arrayList2 = wVar.y0;
        if (arrayList2 != null) {
            if (i9Var.R0) {
                i7 = (arrayList2.size() - 1) - i7;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(i7);
            p7Var.c = arrayList3;
            k6 k6Var = i9Var.O0;
            if ((k6Var instanceof d6) || (k6Var instanceof n6)) {
                gj f10 = k6Var.f(((Integer) arrayList3.get(0)).intValue());
                p7Var.b = f10 == null ? wVar.x0 : gj.B0(f10.k);
            } else {
                p7Var.b = wVar.x0;
            }
        } else {
            p7Var.c = null;
            p7Var.b = ((Long) wVar.B0.get(i7)).longValue();
        }
        p7Var.addView(m7Var);
        m7Var.requestLayout();
        lVar.addView(p7Var);
        return p7Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
