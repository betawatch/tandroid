package eh;

import androidx.recyclerview.widget.RecyclerView;
import f2.a1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
