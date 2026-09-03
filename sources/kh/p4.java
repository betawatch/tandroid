package kh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p4 extends h51 {
    static {
        h51.setup(new p4());
    }

    public static i51 a(String str) {
        i51 J = i51.J(p4.class);
        J.l = str;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        ((q4) view).set(i51Var.l);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new q4(context, f6Var);
    }
}
