package jh;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class y8 extends u {
    public final /* synthetic */ i9 M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(i9 i9Var, int i10, Context context, i9 i9Var2, b bVar) {
        super(context);
        this.M0 = i9Var;
        this.w0 = new ArrayList();
        this.z0 = true;
        this.I0 = new a8.b(this, 25);
        this.K0 = -1;
        this.u0 = i10;
        this.D0 = new b4(context);
        this.J0 = i9Var2;
        n7 n7Var = new n7(this, context, i9Var2, bVar);
        this.v0 = n7Var;
        setAdapter(n7Var);
        h3.x xVar = new h3.x(this, 25);
        boolean z10 = this.i0 == null;
        this.i0 = xVar;
        setChildrenDrawingOrderEnabled(true);
        this.k0 = 1;
        this.j0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new o7(this, i9Var2));
        setOverScrollMode(2);
    }
}
