package ci;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
