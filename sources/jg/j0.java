package jg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.er0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j0 extends ig.c1 {
    public final /* synthetic */ Bitmap E;
    public final /* synthetic */ er0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(er0 er0Var, Context context, ig.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = er0Var;
        this.E = bitmap2;
    }

    @Override // ig.c1
    public final void g(ig.h hVar) {
        int indexOf = ig.h.a.indexOf(hVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        er0 er0Var = this.F;
        er0Var.c1.b(indexOf);
        er0Var.z(hVar);
    }
}
