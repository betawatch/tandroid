package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f6 extends pg.e1 {
    public final /* synthetic */ nb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(nb nbVar, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ma maVar) {
        super(context, s0Var, bitmap, bitmap2, maVar);
        this.E = nbVar;
    }

    @Override // pg.e1
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
