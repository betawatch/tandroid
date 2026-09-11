package di;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class g6 extends qg.c1 {
    public final /* synthetic */ rb E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(rb rbVar, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, q0Var, bitmap, bitmap2, jaVar);
        this.E = rbVar;
    }

    @Override // qg.c1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        rb rbVar = this.E;
        rbVar.k1.b(indexOf);
        rbVar.o(mVar);
    }
}
