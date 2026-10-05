package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class f6 extends pg.f1 {
    public final /* synthetic */ mb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(mb mbVar, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ka kaVar) {
        super(context, s0Var, bitmap, bitmap2, kaVar);
        this.E = mbVar;
    }

    @Override // pg.f1
    public final void g(pg.m mVar) {
        int indexOf = pg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        mb mbVar = this.E;
        mbVar.k1.b(indexOf);
        mbVar.b(mVar);
    }
}
