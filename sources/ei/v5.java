package ei;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class v5 extends qg.e1 {
    public final /* synthetic */ xa E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(xa xaVar, Context context, qg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, s0Var, bitmap, bitmap2, jaVar);
        this.E = xaVar;
    }

    @Override // qg.e1
    public final void g(qg.m mVar) {
        int indexOf = qg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1) {
            indexOf = i10;
        }
        xa xaVar = this.E;
        xaVar.k1.b(indexOf);
        xaVar.o(mVar);
    }
}
