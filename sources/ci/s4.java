package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class s4 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new s4());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        t4 t4Var = (t4) view;
        t4Var.a(y51Var.d, y51Var.z, (o8) y51Var.G);
        t4Var.b(y51Var.e, false);
        boolean z11 = y51Var.f;
        if (t4Var.f != z11) {
            t4Var.f = z11;
            t4Var.E.a(z11);
            t4Var.invalidate();
        }
        t4Var.setOnCheckboxClick(y51Var.D);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t4(context, f6Var);
    }
}
