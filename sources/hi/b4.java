package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b4 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new b4());
    }

    @Override // org.telegram.ui.Components.s61
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        c4 c4Var = (c4) view;
        CharSequence charSequence = t61Var.l;
        CharSequence charSequence2 = t61Var.m;
        c4Var.setText(charSequence);
        c4Var.r.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new c4(context, u6Var);
    }

    @Override // org.telegram.ui.Components.s61
    public final boolean isClickable() {
        return false;
    }
}
