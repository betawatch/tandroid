package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class f6 extends pg.d1 {
    public final /* synthetic */ nb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(nb nbVar, Context context, pg.r0 r0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, r0Var, bitmap, bitmap2, jaVar);
        this.E = nbVar;
    }

    @Override // pg.d1
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
