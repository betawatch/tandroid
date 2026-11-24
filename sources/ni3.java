// default package

import android.graphics.Point;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ni3 implements tc5, i59 {
    public final /* synthetic */ nk3 a;

    public /* synthetic */ ni3(nk3 nk3Var) {
        this.a = nk3Var;
    }

    @Override // tc5
    public final void a(uc5 uc5Var, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bf7.a(-j, 0L));
        nk3 nk3Var = this.a;
        hk3 hk3Var = nk3Var.E2;
        if (nk3Var.D2) {
            nk3Var.removeSelfFromStack();
        }
        hk3Var.q(nk3Var, arrayList, null, true, nk3Var.L2, nk3Var.M2, nk3Var.N2, null);
    }

    @Override // i59
    public final boolean d(float f, float f2, int i, View view) {
        boolean z = view instanceof ut8;
        nk3 nk3Var = this.a;
        if (z) {
            ut8 ut8Var = (ut8) view;
            if (ut8Var.o0) {
                nk3Var.i5(ut8Var.getDialogId(), view);
                return true;
            }
        }
        sj3 sj3Var = nk3Var.D0;
        pu9 pu9Var = sj3Var.b0;
        return nk3Var.D4(view, i, f, sj3Var.e0);
    }

    @Override // i59
    public final void i() {
        Point point = gm.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override // i59
    public final void k(float f) {
        Point point = gm.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f);
        }
    }
}
