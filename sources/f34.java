// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class f34 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new f34());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        g34 g34Var = (g34) view;
        g34Var.n = (pcc) b8cVar.H;
        g34Var.r = b8cVar;
        g34Var.b(b8cVar.A, false);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new g34(context, vnbVar);
    }
}
