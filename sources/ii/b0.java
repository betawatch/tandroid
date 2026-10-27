package ii;

import android.view.View;
import org.telegram.ui.Components.n91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b0 extends n91 {
    public final /* synthetic */ j0 a;

    public b0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
        ((g0) view).getClass();
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        j0 j0Var = this.a;
        return i10 == 2 ? j0Var.x : i10 == 0 ? j0Var.v : j0Var.w;
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return this.a.N ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        if (this.a.N || i10 == 2) {
            return 2;
        }
        return i10 == 0 ? 0 : 1;
    }
}
