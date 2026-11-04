package lg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e0 extends oj0 {
    public final ArrayList r;
    public final int s;
    public final Context w;
    public final /* synthetic */ h0 x;

    public e0(h0 h0Var, Context context) {
        this.x = h0Var;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        int i3 = h10.t0;
        this.s = i3;
        this.w = context;
        arrayList.addAll(u1.f(i3).e());
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        return null;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int M(int i3) {
        if (i3 == 0 || i3 == 2) {
            return 1;
        }
        return this.r.size();
    }

    @Override // org.telegram.ui.Components.oj0
    public final Object O(int i3, int i10) {
        if (i3 != 0 && i10 >= 0) {
            ArrayList arrayList = this.r;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int P(int i3, int i10) {
        if (i3 == 0) {
            return 1;
        }
        return i3 == 2 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int R() {
        return 3;
    }

    @Override // org.telegram.ui.Components.oj0
    public final View T(int i3, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        return (i3 == 0 || i3 == 2 || i10 >= this.r.size()) ? false : true;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void W(int i3, int i10, u4.d1 d1Var) {
        if (d1Var.f == 0) {
            q1 q1Var = (q1) d1Var.a;
            Object O = O(i3, i10);
            boolean z10 = true;
            if (i3 == 1 && i10 == M(i3) - 1) {
                z10 = false;
            }
            if (O instanceof t1) {
                t1 t1Var = (t1) O;
                q1Var.a(t1Var, null, z10);
                q1Var.d.a(this.x.x.contains(Integer.valueOf(t1Var.a)), false);
            }
        }
    }

    @Override // org.telegram.ui.Components.oj0, u4.h0
    public final void f() {
        ArrayList arrayList = this.r;
        arrayList.clear();
        arrayList.addAll(u1.f(this.s).e());
        X(false);
        this.x.P();
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View q1Var;
        Context context = this.w;
        if (i3 == 0) {
            q1Var = new q1(context, this.x.a, false);
        } else if (i3 != 1) {
            q1Var = new View(context);
            q1Var.setTag(-33024);
        } else {
            q1Var = new View(context);
            q1Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
            q1Var.setTag(-33024);
        }
        return new bj0(q1Var);
    }
}
