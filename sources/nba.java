// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nba extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new nba());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((oba) view).set(b8cVar.A);
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.A == b8cVar2.A;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new oba(context, vnbVar);
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d;
    }
}
