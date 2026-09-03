package nh;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class y8 extends v {
    public final /* synthetic */ i9 N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(i9 i9Var, int i10, Context context, i9 i9Var2, b bVar) {
        super(context);
        this.N0 = i9Var;
        this.x0 = new ArrayList();
        this.A0 = true;
        this.J0 = new m2.b(this, 3);
        this.L0 = -1;
        this.v0 = i10;
        this.E0 = new a4(context);
        this.K0 = i9Var2;
        o7 o7Var = new o7(this, context, i9Var2, bVar);
        this.w0 = o7Var;
        setAdapter(o7Var);
        lh.m5 m5Var = new lh.m5(this, 11);
        boolean z4 = this.j0 == null;
        this.j0 = m5Var;
        setChildrenDrawingOrderEnabled(true);
        this.l0 = 1;
        this.k0 = 2;
        if (z4) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new p7(this, i9Var2));
        setOverScrollMode(2);
    }
}
