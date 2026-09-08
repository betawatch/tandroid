package bi;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class fb extends c0 {
    public final /* synthetic */ pb Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(pb pbVar, int i10, Context context, pb pbVar2, b bVar) {
        super(context);
        this.Q0 = pbVar;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new androidx.activity.i(this, 9);
        this.O0 = -1;
        this.y0 = i10;
        this.H0 = new l5(context);
        this.N0 = pbVar2;
        r9 r9Var = new r9(this, context, pbVar2, bVar);
        this.z0 = r9Var;
        setAdapter(r9Var);
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
        b(new s9(this, pbVar2));
        setOverScrollMode(2);
    }
}
