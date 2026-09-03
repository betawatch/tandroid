package dg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.mt0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s0 extends cg.p1 {
    public final /* synthetic */ Bitmap B;
    public final /* synthetic */ mt0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(mt0 mt0Var, Context context, cg.d1 d1Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, d1Var, bitmap, null, null);
        this.C = mt0Var;
        this.B = bitmap2;
    }

    @Override // cg.p1
    public final void g(cg.m mVar) {
        int indexOf = cg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.B != null) {
            indexOf = i10;
        }
        mt0 mt0Var = this.C;
        mt0Var.q1.b(indexOf);
        mt0Var.x(mVar);
    }
}
