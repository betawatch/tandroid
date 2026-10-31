package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class b1 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new b1());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        c1 c1Var = (c1) view;
        a aVar = (a) a51Var.G;
        z2 z2Var = (z2) a51Var.H;
        c1Var.a = aVar;
        c1Var.w = z2Var;
        c1Var.x = cd.X;
        c1Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new c1(context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean f() {
        return false;
    }
}
