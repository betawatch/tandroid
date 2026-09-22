package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class c4 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new c4());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        d4 d4Var = (d4) view;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        d4Var.setText(charSequence);
        d4Var.r.setText(charSequence2);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new d4(context, e6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
