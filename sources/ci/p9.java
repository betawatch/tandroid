package ci;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class p9 extends x {
    public final /* synthetic */ z9 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(z9 z9Var, int i10, Context context, z9 z9Var2, b bVar) {
        super(context);
        this.Q0 = z9Var;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new androidx.activity.i(this, 10);
        this.O0 = -1;
        this.y0 = i10;
        this.H0 = new m4(context);
        this.N0 = z9Var2;
        e8 e8Var = new e8(this, context, z9Var2, bVar);
        this.z0 = e8Var;
        setAdapter(e8Var);
        a1.c cVar = new a1.c(this, 19);
        boolean z10 = this.m0 == null;
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.o0 = 1;
        this.n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new f8(this, z9Var2));
        setOverScrollMode(2);
    }
}
