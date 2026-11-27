// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bra extends l9c {
    public final /* synthetic */ gra Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bra(gra graVar, d79 d79Var, Context context, int i, hj8 hj8Var, vnb vnbVar) {
        super(d79Var, context, i, 0, true, hj8Var, vnbVar);
        this.Q = graVar;
    }

    @Override // l9c, j79
    public final void t(f89 f89Var, int i) {
        super.t(f89Var, i);
        View view = f89Var.a;
        if (view instanceof era) {
            era eraVar = (era) view;
            cra craVar = eraVar.w;
            boolean b1 = this.Q.b1(craVar);
            eraVar.c.f(b1, false);
            eraVar.r.a(b1, false);
            eraVar.setOnClickListener(new jy8(this, craVar, (byte) 15));
        }
    }
}
