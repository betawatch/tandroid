package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.v01;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a7 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new a7());
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        Object obj = u61Var.G;
        if (obj instanceof v01) {
            v01 v01Var = (v01) obj;
            ((c7) view).b(u61Var.l, v01Var.d, v01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((c7) view).a(u61Var.l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new c7(context);
    }
}
