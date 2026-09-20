package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class s4 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new s4());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        t4 t4Var = (t4) view;
        t4Var.a(w51Var.d, w51Var.z, (o8) w51Var.G);
        t4Var.b(w51Var.e, false);
        boolean z11 = w51Var.f;
        if (t4Var.f != z11) {
            t4Var.f = z11;
            t4Var.E.a(z11);
            t4Var.invalidate();
        }
        t4Var.setOnCheckboxClick(w51Var.D);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new t4(context, f6Var);
    }
}
