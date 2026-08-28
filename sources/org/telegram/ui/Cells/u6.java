package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.e01;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u6 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new u6());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        Object obj = l41Var.G;
        if (obj instanceof e01) {
            e01 e01Var = (e01) obj;
            ((w6) view).b(l41Var.l, e01Var.d, e01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((w6) view).a(l41Var.l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new w6(context);
    }
}
