package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d91;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class i1 extends d91 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ r2 c;

    public i1(r2 r2Var, boolean z10, Context context) {
        this.c = r2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        z1 z1Var = (z1) view;
        if (this.a) {
            i10 = 1;
        }
        z1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        Context context = this.b;
        r2 r2Var = this.c;
        return i10 == 1 ? new y1(r2Var, context) : new d2(r2Var, context);
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
