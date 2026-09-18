package ai;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class zb extends j0 {
    public final /* synthetic */ jc Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(jc jcVar, int i10, Context context, jc jcVar2, d dVar) {
        super(context);
        this.Q0 = jcVar;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new q4(this, 1);
        this.O0 = -1;
        this.y0 = i10;
        this.H0 = new c6(context);
        this.N0 = jcVar2;
        ka kaVar = new ka(this, context, jcVar2, dVar);
        this.z0 = kaVar;
        setAdapter(kaVar);
        a1.c cVar = new a1.c(this, 8);
        boolean z10 = this.m0 == null;
        this.m0 = cVar;
        setChildrenDrawingOrderEnabled(true);
        this.o0 = 1;
        this.n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new la(this, jcVar2));
        setOverScrollMode(2);
    }
}
