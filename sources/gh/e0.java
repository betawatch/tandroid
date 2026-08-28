package gh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e0 extends k41 {
    static {
        k41.setup(new e0());
    }

    public static l41 a(String str, CharSequence charSequence, int i9) {
        l41 J = l41.J(e0.class);
        J.b = false;
        J.z = i9;
        J.l = str;
        J.m = charSequence;
        return J;
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((f0) view).a(l41Var.l, l41Var.m, l41Var.z);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new f0(context, 0, b6Var);
    }
}
