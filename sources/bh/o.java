package bh;

import androidx.recyclerview.widget.RecyclerView;
import f2.a1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o extends a1 {
    public final /* synthetic */ t a;
    public final /* synthetic */ u b;

    public o(u uVar, t tVar) {
        this.b = uVar;
        this.a = tVar;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t tVar = this.a;
        if (tVar.h || tVar.i) {
            return;
        }
        if ((r2.c.U2.x.size() - 1) - this.b.c.T2.M0() < 5) {
            tVar.a();
        }
    }
}
