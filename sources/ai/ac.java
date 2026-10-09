package ai;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class ac extends j0 {
    public final /* synthetic */ kc Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(kc kcVar, int i10, Context context, kc kcVar2, d dVar) {
        super(context);
        this.Q0 = kcVar;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new r4(this, 1);
        this.O0 = -1;
        this.y0 = i10;
        this.H0 = new c6(context);
        this.N0 = kcVar2;
        la laVar = new la(this, context, kcVar2, dVar);
        this.z0 = laVar;
        setAdapter(laVar);
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
        b(new ma(this, kcVar2));
        setOverScrollMode(2);
    }
}
