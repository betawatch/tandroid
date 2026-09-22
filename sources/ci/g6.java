package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class g6 extends pg.c1 {
    public final /* synthetic */ qb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(qb qbVar, Context context, pg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ha haVar) {
        super(context, q0Var, bitmap, bitmap2, haVar);
        this.E = qbVar;
    }

    @Override // pg.c1
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
