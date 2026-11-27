// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class lj7 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new lj7());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        mj7 mj7Var = (mj7) view;
        mj7Var.a(b8cVar.d, b8cVar.A, (c8b) b8cVar.H);
        mj7Var.b(b8cVar.e, false);
        boolean z2 = b8cVar.f;
        if (mj7Var.h != z2) {
            mj7Var.h = z2;
            mj7Var.G.a(z2);
            mj7Var.invalidate();
        }
        mj7Var.setOnCheckboxClick(b8cVar.E);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new mj7(context, vnbVar);
    }
}
