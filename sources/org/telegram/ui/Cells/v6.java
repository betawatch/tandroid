package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.j11;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v6 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new v6());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        Object obj = i51Var.G;
        if (obj instanceof j11) {
            j11 j11Var = (j11) obj;
            ((x6) view).b(i51Var.l, j11Var.d, j11Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((x6) view).a(i51Var.l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new x6(context);
    }
}
