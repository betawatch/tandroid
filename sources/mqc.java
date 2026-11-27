// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class mqc extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new mqc());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        ((nqc) view).a(b8cVar.k, b8cVar.m, b8cVar.n);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new nqc(context, vnbVar);
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }

    @Override // a8c
    public final boolean g() {
        return true;
    }
}
