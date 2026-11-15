package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class d0 extends pj0 {
    public final ArrayList r;
    public final int s;
    public final Context w;
    public final /* synthetic */ g0 x;

    public d0(g0 g0Var, Context context) {
        this.x = g0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i7 = m10.t0;
        this.s = i7;
        this.w = context;
        arrayList.addAll(v1.f(i7).e());
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int M(int i7) {
        if (i7 == 0 || i7 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.pj0
    public final Object O(int i7, int i10) {
        if (i7 != 0 && i10 >= 0) {
            ArrayList arrayList = this.r;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.pj0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.pj0
    public final View T(int i7, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        return (i7 == 0 || i7 == 2 || i10 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.pj0
    public final void W(int i7, int i10, v4.e1 e1Var) {
        if (e1Var.f == 0) {
            q1 q1Var = (q1) e1Var.a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == 1 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof u1) {
                u1 u1Var = (u1) O;
                q1Var.a(u1Var, null, z10);
                q1Var.d.a(this.x.x.contains(Integer.valueOf(u1Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.pj0, v4.h0
    public final void f() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(v1.f(this.s).e());
        X(false);
        this.x.Q();
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View q1Var;
        Context context = this.w;
        if (i7 == 0) {
            q1Var = new q1(context, this.x.a, false);
        } else if (i7 != 1) {
            q1Var = new View(context);
            q1Var.setTag(-33024);
        } else {
            q1Var = new View(context);
            q1Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
            q1Var.setTag(-33024);
        }
        return new cj0(q1Var);
    }
}
