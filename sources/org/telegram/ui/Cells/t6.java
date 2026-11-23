package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.yo;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.tw0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t6 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new t6());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        Object obj = n41Var.H;
        if (obj instanceof tw0) {
            tw0 tw0Var = (tw0) obj;
            ((v6) view).b(n41Var.m, tw0Var.d, tw0Var.e, z10);
        } else if (obj instanceof yo) {
            ((v6) view).a(n41Var.m, ((yo) obj).b, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new v6(context);
    }
}
