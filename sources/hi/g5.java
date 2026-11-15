package hi;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g5 extends sg.u0 {
    public final /* synthetic */ u9 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(u9 u9Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2, org.telegram.ui.Components.u9 u9Var2) {
        super(context, i0Var, bitmap, bitmap2, u9Var2);
        this.F = u9Var;
    }

    @Override // sg.u0
    public final void g(sg.h hVar) {
        int indexOf = sg.h.a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1) {
            indexOf = i7;
        }
        u9 u9Var = this.F;
        u9Var.U0.b(indexOf);
        u9Var.w(hVar);
    }
}
