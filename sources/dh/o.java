package dh;

import androidx.recyclerview.widget.RecyclerView;
import f2.z0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o extends z0 {
    public final /* synthetic */ t a;
    public final /* synthetic */ u b;

    public o(u uVar, t tVar) {
        this.b = uVar;
        this.a = tVar;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t tVar = this.a;
        if (tVar.h || tVar.i) {
            return;
        }
        if ((r2.c.V2.x.size() - 1) - this.b.c.U2.M0() < 5) {
            tVar.a();
        }
    }
}
