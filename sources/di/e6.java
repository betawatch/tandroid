package di;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class e6 extends qg.c1 {
    public final /* synthetic */ mb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(mb mbVar, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.la laVar) {
        super(context, q0Var, bitmap, bitmap2, laVar);
        this.E = mbVar;
    }

    @Override // qg.c1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        mb mbVar = this.E;
        mbVar.k1.b(indexOf);
        mbVar.o(mVar);
    }
}
