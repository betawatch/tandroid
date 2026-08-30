package dg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.ft0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s0 extends cg.p1 {
    public final /* synthetic */ Bitmap B;
    public final /* synthetic */ ft0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ft0 ft0Var, Context context, cg.d1 d1Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, d1Var, bitmap, null, null);
        this.C = ft0Var;
        this.B = bitmap2;
    }

    @Override // cg.p1
    public final void g(cg.m mVar) {
        int indexOf = cg.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.B != null) {
            indexOf = i10;
        }
        ft0 ft0Var = this.C;
        ft0Var.q1.b(indexOf);
        ft0Var.x(mVar);
    }
}
