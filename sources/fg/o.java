package fg;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new o());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        p pVar = (p) view;
        pVar.setUser((TLRPC.User) l41Var.G);
        pVar.c(l41Var.e, false);
        pVar.setDivider(z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new p(context, true, false, b6Var, false);
    }
}
