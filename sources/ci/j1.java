package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.o81;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class j1 extends o81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ t2 c;

    public j1(t2 t2Var, boolean z10, Context context) {
        this.c = t2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
        a2 a2Var = (a2) view;
        if (this.a) {
            i10 = 1;
        }
        a2Var.a(i10);
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        Context context = this.b;
        t2 t2Var = this.c;
        return i10 == 1 ? new z1(t2Var, context) : new e2(t2Var, context);
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.o81
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
