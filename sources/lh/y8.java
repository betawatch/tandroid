package lh;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y8 extends u {
    public final /* synthetic */ i9 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(i9 i9Var, int i10, Context context, i9 i9Var2, b bVar) {
        super(context);
        this.M0 = i9Var;
        this.w0 = new ArrayList();
        this.z0 = true;
        this.I0 = new m7(this, 0);
        this.K0 = -1;
        this.u0 = i10;
        this.D0 = new a4(context);
        this.J0 = i9Var2;
        o7 o7Var = new o7(this, context, i9Var2, bVar);
        this.v0 = o7Var;
        setAdapter(o7Var);
        l4.s0 s0Var = new l4.s0(this, 7);
        boolean z10 = this.i0 == null;
        this.i0 = s0Var;
        setChildrenDrawingOrderEnabled(true);
        this.k0 = 1;
        this.j0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new p7(this, i9Var2));
        setOverScrollMode(2);
    }
}
