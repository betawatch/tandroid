package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.r01;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class u6 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new u6());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        Object obj = j51Var.G;
        if (obj instanceof r01) {
            r01 r01Var = (r01) obj;
            ((w6) view).b(j51Var.l, r01Var.d, r01Var.e, z4);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((w6) view).a(j51Var.l, ((MessagesController.FaqSearchResult) obj).path, true, z4);
        }
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new w6(context);
    }
}
