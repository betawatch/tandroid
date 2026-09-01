package eg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.ht0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class q0 extends dg.o1 {
    public final /* synthetic */ Bitmap B;
    public final /* synthetic */ ht0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ht0 ht0Var, Context context, dg.c1 c1Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, c1Var, bitmap, null, null);
        this.C = ht0Var;
        this.B = bitmap2;
    }

    @Override // dg.o1
    public final void g(dg.m mVar) {
        int indexOf = dg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.B != null) {
            indexOf = i10;
        }
        ht0 ht0Var = this.C;
        ht0Var.q1.b(indexOf);
        ht0Var.g(mVar);
    }
}
