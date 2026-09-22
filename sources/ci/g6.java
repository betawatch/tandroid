package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class g6 extends pg.f1 {
    public final /* synthetic */ qb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(qb qbVar, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ia iaVar) {
        super(context, s0Var, bitmap, bitmap2, iaVar);
        this.E = qbVar;
    }

    @Override // pg.f1
    public final void g(pg.m mVar) {
        int indexOf = pg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        qb qbVar = this.E;
        qbVar.k1.b(indexOf);
        qbVar.b(mVar);
    }
}
