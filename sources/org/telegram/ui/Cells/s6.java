package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.to;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.kw0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s6 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new s6());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        Object obj = r31Var.G;
        if (obj instanceof kw0) {
            kw0 kw0Var = (kw0) obj;
            ((u6) view).b(r31Var.l, kw0Var.d, kw0Var.e, z10);
        } else if (obj instanceof to) {
            ((u6) view).a(r31Var.l, ((to) obj).b, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new u6(context);
    }
}
