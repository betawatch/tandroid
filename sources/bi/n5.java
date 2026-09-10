package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class n5 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new n5());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        o5 o5Var = (o5) view;
        o5Var.a(v51Var.d, v51Var.z, (r9) v51Var.G);
        o5Var.b(v51Var.e, false);
        boolean z11 = v51Var.f;
        if (o5Var.f != z11) {
            o5Var.f = z11;
            o5Var.E.a(z11);
            o5Var.invalidate();
        }
        o5Var.setOnCheckboxClick(v51Var.D);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new o5(context, f6Var);
    }
}
