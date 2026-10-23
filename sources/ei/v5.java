package ei;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class v5 extends qg.f1 {
    public final /* synthetic */ xa E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(xa xaVar, Context context, qg.t0 t0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.ja jaVar) {
        super(context, t0Var, bitmap, bitmap2, jaVar);
        this.E = xaVar;
    }

    @Override // qg.f1
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
