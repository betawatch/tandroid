package gi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g5 extends tg.u0 {
    public final /* synthetic */ x9 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(x9 x9Var, Context context, tg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.x9 x9Var2) {
        super(context, i0Var, bitmap, bitmap2, x9Var2);
        this.F = x9Var;
    }

    @Override // tg.u0
    public final void g(tg.h hVar) {
        int indexOf = tg.h.a.indexOf(hVar);
        int i3 = indexOf + 1;
        if (i3 <= 1) {
            indexOf = i3;
        }
        x9 x9Var = this.F;
        x9Var.U0.b(indexOf);
        x9Var.C(hVar);
    }
}
