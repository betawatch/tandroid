package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class e5 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new e5());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        ((f5) view).a(m61Var.l, m61Var.m, m61Var.k);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new f5(context, g6Var);
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isClickable() {
        return false;
    }

    @Override // org.telegram.ui.Components.l61
    public final boolean isShadow() {
        return true;
    }
}
