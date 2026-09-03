package eg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q0 extends dg.o1 {
    public final /* synthetic */ Bitmap B;
    public final /* synthetic */ mt0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(mt0 mt0Var, Context context, dg.c1 c1Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, c1Var, bitmap, null, null);
        this.C = mt0Var;
        this.B = bitmap2;
    }

    @Override // dg.o1
    public final void g(dg.m mVar) {
        int indexOf = dg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.B != null) {
            indexOf = i10;
        }
        mt0 mt0Var = this.C;
        mt0Var.q1.b(indexOf);
        mt0Var.g(mVar);
    }
}
