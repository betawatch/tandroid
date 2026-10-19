package ci;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class q9 extends x {
    public final /* synthetic */ aa Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(aa aaVar, int i10, Context context, aa aaVar2, b bVar) {
        super(context);
        this.Q0 = aaVar;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new androidx.activity.i(this, 10);
        this.O0 = -1;
        this.y0 = i10;
        this.H0 = new n4(context);
        this.N0 = aaVar2;
        f8 f8Var = new f8(this, context, aaVar2, bVar);
        this.z0 = f8Var;
        setAdapter(f8Var);
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
        b(new g8(this, aaVar2));
        setOverScrollMode(2);
    }
}
