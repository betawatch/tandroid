package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v3 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new v3());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        w3 w3Var = (w3) view;
        w3Var.a(b41Var.d, b41Var.z, (d7) b41Var.G);
        w3Var.b(b41Var.e, false);
        boolean z11 = b41Var.f;
        if (w3Var.h != z11) {
            w3Var.h = z11;
            w3Var.G.a(z11);
            w3Var.invalidate();
        }
        w3Var.setOnCheckboxClick(b41Var.D);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new w3(context, e6Var);
    }
}
