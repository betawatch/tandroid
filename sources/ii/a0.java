package ii;

import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a0 implements q0 {
    public final /* synthetic */ r2 a;
    public final /* synthetic */ j0 b;

    public a0(j0 j0Var, r2 r2Var) {
        this.b = j0Var;
        this.a = r2Var;
    }

    @Override // ii.q0
    public final void a(long j10) {
        this.a.presentFragment(wn.ea(j10));
        this.b.dismiss();
    }

    @Override // ii.q0
    public final void c() {
        j0 j0Var = this.b;
        j0Var.w.d.g3.O(true);
        j0Var.v.d.g3.O(true);
    }

    @Override // ii.q0
    public final void close() {
        this.b.d.E(0);
    }
}
