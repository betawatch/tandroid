package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.p01;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class w6 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new w6());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        Object obj = m61Var.G;
        if (obj instanceof p01) {
            p01 p01Var = (p01) obj;
            ((y6) view).b(m61Var.l, p01Var.d, p01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(m61Var.l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new y6(context);
    }
}
