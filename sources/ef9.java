// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ef9 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new ef9());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ff9 ff9Var = (ff9) view;
        mk0 mk0Var = (mk0) b8cVar.H;
        df9 df9Var = (df9) b8cVar.I;
        ff9Var.a = mk0Var;
        ff9Var.F = df9Var;
        ff9Var.c(mk0Var);
        ff9Var.h();
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        ff9 ff9Var = new ff9(i, vnbVar, context);
        ff9Var.setBackground(new vg9(aob.v0(aob.d6, vnbVar)));
        return ff9Var;
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
