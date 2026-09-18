package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class g6 extends pg.e1 {
    public final /* synthetic */ qb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(qb qbVar, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, s0Var, bitmap, bitmap2, jaVar);
        this.E = qbVar;
    }

    @Override // pg.e1
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
