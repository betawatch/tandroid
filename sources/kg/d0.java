package kg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.xj0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d0 extends xj0 {
    public final ArrayList r;
    public final int s;
    public final Context w;
    public final /* synthetic */ g0 x;

    public d0(g0 g0Var, Context context) {
        this.x = g0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i7 = j10.t0;
        this.s = i7;
        this.w = context;
        arrayList.addAll(w1.f(i7).e());
    }

    @Override // org.telegram.ui.Components.ij0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.ij0
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.xj0
    public final int M(int i7) {
        if (i7 == 0 || i7 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.xj0
    public final Object O(int i7, int i10) {
        if (i7 != 0 && i10 >= 0) {
            ArrayList arrayList = this.r;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.xj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.xj0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.xj0
    public final View T(int i7, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.xj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        return (i7 == 0 || i7 == 2 || i10 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.xj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        if (f1Var.f == 0) {
            s1 s1Var = (s1) f1Var.a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == 1 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof v1) {
                v1 v1Var = (v1) O;
                s1Var.a(v1Var, null, z10);
                s1Var.d.a(this.x.x.contains(Integer.valueOf(v1Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.xj0, v4.i0
    public final void f() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(w1.f(this.s).e());
        X(false);
        this.x.Q();
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View s1Var;
        Context context = this.w;
        if (i7 == 0) {
            s1Var = new s1(context, this.x.a, false);
        } else if (i7 != 1) {
            s1Var = new View(context);
            s1Var.setTag(-33024);
        } else {
            s1Var = new View(context);
            s1Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
            s1Var.setTag(-33024);
        }
        return new kj0(s1Var);
    }
}
