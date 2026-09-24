package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class f6 extends pg.f1 {
    public final /* synthetic */ nb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(nb nbVar, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, s0Var, bitmap, bitmap2, jaVar);
        this.E = nbVar;
    }

    @Override // pg.f1
    public final void g(pg.m mVar) {
        int indexOf = pg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        nb nbVar = this.E;
        nbVar.k1.b(indexOf);
        nbVar.b(mVar);
    }
}
