package ii;

import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        this.a.presentFragment(un.ba(j10));
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
