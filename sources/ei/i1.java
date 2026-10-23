package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d91;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
