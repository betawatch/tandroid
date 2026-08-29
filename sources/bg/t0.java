package bg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t0 extends ag.t1 {
    public final /* synthetic */ Bitmap A;
    public final /* synthetic */ ws0 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ws0 ws0Var, Context context, ag.f1 f1Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, f1Var, bitmap, null, null);
        this.B = ws0Var;
        this.A = bitmap2;
    }

    @Override // ag.t1
    public final void g(ag.m mVar) {
        int indexOf = ag.m.a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.A != null) {
            indexOf = i10;
        }
        ws0 ws0Var = this.B;
        ws0Var.p1.b(indexOf);
        ws0Var.q(mVar);
    }
}
