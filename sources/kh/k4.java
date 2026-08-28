package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k4 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new k4());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        l4 l4Var = (l4) view;
        l4Var.a(l41Var.d, l41Var.z, (a8) l41Var.G);
        l4Var.b(l41Var.e, false);
        boolean z11 = l41Var.f;
        if (l4Var.f != z11) {
            l4Var.f = z11;
            l4Var.A.a(z11);
            l4Var.invalidate();
        }
        l4Var.setOnCheckboxClick(l41Var.D);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new l4(context, b6Var);
    }
}
