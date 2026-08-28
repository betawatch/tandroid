package ih;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o0 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new o0());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((p0) view).set((u0) l41Var.G);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        p0 p0Var = new p0(i9, context, false);
        p0Var.setLayoutParams(new f2.a1(-2, -2));
        return p0Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.G == l41Var2.G;
    }
}
