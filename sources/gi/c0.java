package gi;

import android.view.View;
import org.telegram.ui.Components.a81;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class c0 extends a81 {
    public final /* synthetic */ k0 a;

    public c0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        ((h0) view).getClass();
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        k0 k0Var = this.a;
        return i10 == 2 ? k0Var.x : i10 == 0 ? k0Var.v : k0Var.w;
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return this.a.N ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        if (this.a.N || i10 == 2) {
            return 2;
        }
        return i10 == 0 ? 0 : 1;
    }
}
