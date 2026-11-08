package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class d0 extends kj0 {
    public final ArrayList r;
    public final int s;
    public final Context w;
    public final /* synthetic */ g0 x;

    public d0(g0 g0Var, Context context) {
        this.x = g0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i7 = p10.s0;
        this.s = i7;
        this.w = context;
        arrayList.addAll(t1.f(i7).e());
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int M(int i7) {
        if (i7 == 0 || i7 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.kj0
    public final Object O(int i7, int i10) {
        if (i7 != 0 && i10 >= 0) {
            ArrayList arrayList = this.r;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.kj0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.kj0
    public final View T(int i7, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        return (i7 == 0 || i7 == 2 || i10 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void W(int i7, int i10, v4.d1 d1Var) {
        if (d1Var.f == 0) {
            p1 p1Var = (p1) d1Var.a;
            Object O = O(i7, i10);
            boolean z9 = true;
            if (i7 == 1 && i10 == M(i7) - 1) {
                z9 = false;
            }
            if (O instanceof s1) {
                s1 s1Var = (s1) O;
                p1Var.a(s1Var, null, z9);
                p1Var.d.a(this.x.x.contains(Integer.valueOf(s1Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.kj0, v4.g0
    public final void f() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(t1.f(this.s).e());
        X(false);
        this.x.P();
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View p1Var;
        Context context = this.w;
        if (i7 == 0) {
            p1Var = new p1(context, this.x.a, false);
        } else if (i7 != 1) {
            p1Var = new View(context);
            p1Var.setTag(-33024);
        } else {
            p1Var = new View(context);
            p1Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
            p1Var.setTag(-33024);
        }
        return new xi0(p1Var);
    }
}
