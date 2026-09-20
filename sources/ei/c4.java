package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class c4 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new c4());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = w51Var.l;
        CharSequence charSequence2 = w51Var.m;
        d4Var.setText(charSequence);
        d4Var.r.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new d4(context, f6Var);
    }

    @Override // org.telegram.ui.Components.v51
    public final boolean isClickable() {
        return false;
    }
}
