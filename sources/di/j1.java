package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a81;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class j1 extends a81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ t2 c;

    public j1(t2 t2Var, boolean z10, Context context) {
        this.c = t2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
        a2 a2Var = (a2) view;
        if (this.a) {
            i10 = 1;
        }
        a2Var.a(i10);
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        Context context = this.b;
        t2 t2Var = this.c;
        return i10 == 1 ? new z1(t2Var, context) : new e2(t2Var, context);
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
