package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d91;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class i1 extends d91 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ n2 c;

    public i1(n2 n2Var, boolean z10, Context context) {
        this.c = n2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
        w1 w1Var = (w1) view;
        if (this.a) {
            i10 = 1;
        }
        w1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        Context context = this.b;
        n2 n2Var = this.c;
        return i10 == 1 ? new v1(n2Var, context) : new b2(n2Var, context);
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
