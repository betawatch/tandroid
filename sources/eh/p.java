package eh;

import androidx.recyclerview.widget.RecyclerView;
import f2.a1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class p extends a1 {
    public final /* synthetic */ u a;
    public final /* synthetic */ v b;

    public p(v vVar, u uVar) {
        this.b = vVar;
        this.a = uVar;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u uVar = this.a;
        if (uVar.h || uVar.i) {
            return;
        }
        if ((r2.c.V2.x.size() - 1) - this.b.c.U2.M0() < 5) {
            uVar.a();
        }
    }
}
