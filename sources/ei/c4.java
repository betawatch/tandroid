package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class c4 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new c4());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = x51Var.l;
        CharSequence charSequence2 = x51Var.m;
        d4Var.setText(charSequence);
        d4Var.r.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, d6 d6Var) {
        return new d4(context, d6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isClickable() {
        return false;
    }
}
