// default package

import android.graphics.Point;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bh3 implements va5, f39 {
    public final /* synthetic */ cj3 a;

    public /* synthetic */ bh3(cj3 cj3Var) {
        this.a = cj3Var;
    }

    @Override // va5
    public final void a(wa5 wa5Var, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(zc7.a(-j, 0L));
        cj3 cj3Var = this.a;
        wi3 wi3Var = cj3Var.E2;
        if (cj3Var.D2) {
            cj3Var.removeSelfFromStack();
        }
        wi3Var.r(cj3Var, arrayList, null, true, cj3Var.L2, cj3Var.M2, cj3Var.N2, null);
    }

    @Override // f39
    public final boolean e(float f, float f2, int i, View view) {
        boolean z = view instanceof rr8;
        cj3 cj3Var = this.a;
        if (z) {
            rr8 rr8Var = (rr8) view;
            if (rr8Var.o0) {
                cj3Var.e5(rr8Var.getDialogId(), view);
                return true;
            }
        }
        hi3 hi3Var = cj3Var.D0;
        ns9 ns9Var = hi3Var.b0;
        return cj3Var.z4(view, i, f, hi3Var.e0);
    }

    @Override // f39
    public final void f() {
        Point point = gl.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // f39
    public final void g(float f) {
        Point point = gl.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f);
        }
    }
}
