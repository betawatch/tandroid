package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n81;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class j1 extends n81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ s2 c;

    public j1(s2 s2Var, boolean z10, Context context) {
        this.c = s2Var;
        this.a = z10;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
        a2 a2Var = (a2) view;
        if (this.a) {
            i10 = 1;
        }
        a2Var.a(i10);
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        Context context = this.b;
        s2 s2Var = this.c;
        return i10 == 1 ? new z1(s2Var, context) : new e2(s2Var, context);
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
