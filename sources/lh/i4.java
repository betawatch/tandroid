package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i4 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new i4());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        j4 j4Var = (j4) view;
        j4Var.a(n41Var.d, n41Var.z, (z7) n41Var.G);
        j4Var.b(n41Var.e, false);
        boolean z11 = n41Var.f;
        if (j4Var.f != z11) {
            j4Var.f = z11;
            j4Var.A.a(z11);
            j4Var.invalidate();
        }
        j4Var.setOnCheckboxClick(n41Var.D);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new j4(context, c6Var);
    }
}
