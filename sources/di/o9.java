package di;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class o9 extends x {
    public final /* synthetic */ y9 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9(y9 y9Var, int i10, Context context, y9 y9Var2, b bVar) {
        super(context);
        this.Q0 = y9Var;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new a5.d(this, 20);
        this.O0 = -1;
        this.y0 = i10;
        this.H0 = new n4(context);
        this.N0 = y9Var2;
        c8 c8Var = new c8(this, context, y9Var2, bVar);
        this.z0 = c8Var;
        setAdapter(c8Var);
        a1.c cVar = new a1.c(this, 27);
        boolean z10 = this.m0 == null;
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.o0 = 1;
        this.n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new d8(this, y9Var2));
        setOverScrollMode(2);
    }
}
