// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ej7 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new ej7());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        fj7 fj7Var = (fj7) view;
        fj7Var.a(c6cVar.d, c6cVar.A, (g6b) c6cVar.H);
        fj7Var.b(c6cVar.e, false);
        boolean z2 = c6cVar.f;
        if (fj7Var.h != z2) {
            fj7Var.h = z2;
            fj7Var.G.a(z2);
            fj7Var.invalidate();
        }
        fj7Var.setOnCheckboxClick(c6cVar.E);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new fj7(context, ylbVar);
    }
}
