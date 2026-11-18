package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a1 extends z41 {
    public final /* synthetic */ h1 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(h1 h1Var, ck0 ck0Var, Context context, int i7, bi.b bVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(ck0Var, context, i7, 0, true, bVar, i6Var);
        this.Q = h1Var;
    }

    @Override // org.telegram.ui.Components.z41, v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        super.t(f1Var, i7);
        View view = f1Var.a;
        if (view instanceof f1) {
            f1 f1Var2 = (f1) view;
            c1 c1Var = f1Var2.w;
            boolean g12 = this.Q.g1(c1Var);
            f1Var2.c.f(g12, false);
            f1Var2.r.a(g12, false);
            f1Var2.setOnClickListener(new ai.v2(13, this, c1Var));
        }
    }
}
