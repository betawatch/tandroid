package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.w81;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class i1 extends w81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ n2 c;

    public i1(n2 n2Var, boolean z10, Context context) {
        this.c = n2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
        w1 w1Var = (w1) view;
        if (this.a) {
            i10 = 1;
        }
        w1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.w81
    public final View d(int i10) {
        Context context = this.b;
        n2 n2Var = this.c;
        return i10 == 1 ? new v1(n2Var, context) : new b2(n2Var, context);
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.w81
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
