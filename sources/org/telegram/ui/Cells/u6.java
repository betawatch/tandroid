package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.zo;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.vw0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class u6 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new u6());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        Object obj = o41Var.H;
        if (obj instanceof vw0) {
            vw0 vw0Var = (vw0) obj;
            ((w6) view).b(o41Var.m, vw0Var.d, vw0Var.e, z10);
        } else if (obj instanceof zo) {
            ((w6) view).a(o41Var.m, ((zo) obj).b, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new w6(context);
    }
}
