// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
