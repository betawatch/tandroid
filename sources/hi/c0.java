package hi;

import android.view.View;
import org.telegram.ui.Components.v81;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class c0 extends v81 {
    public final /* synthetic */ k0 a;

    public c0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // org.telegram.ui.Components.v81
    public final void b(View view, int i10, int i11) {
        ((h0) view).getClass();
    }

    @Override // org.telegram.ui.Components.v81
    public final View d(int i10) {
        k0 k0Var = this.a;
        return i10 == 2 ? k0Var.x : i10 == 0 ? k0Var.v : k0Var.w;
    }

    @Override // org.telegram.ui.Components.v81
    public final int e() {
        return this.a.N ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.v81
    public final int h(int i10) {
        if (this.a.N || i10 == 2) {
            return 2;
        }
        return i10 == 0 ? 0 : 1;
    }
}
