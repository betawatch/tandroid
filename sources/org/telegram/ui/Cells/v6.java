package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.k11;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v6 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new v6());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        Object obj = j51Var.G;
        if (obj instanceof k11) {
            k11 k11Var = (k11) obj;
            ((x6) view).b(j51Var.l, k11Var.d, k11Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((x6) view).a(j51Var.l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new x6(context);
    }
}
