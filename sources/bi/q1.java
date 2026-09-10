package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n81;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class q1 extends n81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f3 c;

    public q1(f3 f3Var, boolean z10, Context context) {
        this.c = f3Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        l2 l2Var = (l2) view;
        if (this.a) {
            i10 = 1;
        }
        l2Var.a(i10);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        Context context = this.b;
        f3 f3Var = this.c;
        return i10 == 1 ? new k2(f3Var, context) : new q2(f3Var, context);
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
