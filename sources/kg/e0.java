package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.k10;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class e0 extends zj0 {
    public final ArrayList r;
    public final int s;
    public final Context w;
    public final /* synthetic */ h0 x;

    public e0(h0 h0Var, Context context) {
        this.x = h0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i7 = k10.t0;
        this.s = i7;
        this.w = context;
        arrayList.addAll(v1.f(i7).e());
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int M(int i7) {
        if (i7 == 0 || i7 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.zj0
    public final Object O(int i7, int i10) {
        if (i7 != 0 && i10 >= 0) {
            ArrayList arrayList = this.r;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.zj0
    public final View T(int i7, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.zj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        return (i7 == 0 || i7 == 2 || i10 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.zj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        if (f1Var.f == 0) {
            r1 r1Var = (r1) f1Var.a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == 1 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof u1) {
                u1 u1Var = (u1) O;
                r1Var.a(u1Var, null, z10);
                r1Var.d.a(this.x.x.contains(Integer.valueOf(u1Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.zj0, v4.i0
    public final void f() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(v1.f(this.s).e());
        X(false);
        this.x.Q();
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View r1Var;
        Context context = this.w;
        if (i7 == 0) {
            r1Var = new r1(context, this.x.a, false);
        } else if (i7 != 1) {
            r1Var = new View(context);
            r1Var.setTag(-33024);
        } else {
            r1Var = new View(context);
            r1Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
            r1Var.setTag(-33024);
        }
        return new mj0(r1Var);
    }
}
