// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class kj7 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new kj7());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        lj7 lj7Var = (lj7) view;
        lj7Var.a(b8cVar.d, b8cVar.A, (c8b) b8cVar.H);
        lj7Var.b(b8cVar.e, false);
        boolean z2 = b8cVar.f;
        if (lj7Var.h != z2) {
            lj7Var.h = z2;
            lj7Var.G.a(z2);
            lj7Var.invalidate();
        }
        lj7Var.setOnCheckboxClick(b8cVar.E);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new lj7(context, vnbVar);
    }
}
