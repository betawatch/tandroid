package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.f01;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r6 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new r6());
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        Object obj = n41Var.G;
        if (obj instanceof f01) {
            f01 f01Var = (f01) obj;
            ((t6) view).b(n41Var.l, f01Var.d, f01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((t6) view).a(n41Var.l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t6(context);
    }
}
