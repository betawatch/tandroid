package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.yo;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.vw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t6 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new t6());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        Object obj = l41Var.H;
        if (obj instanceof vw0) {
            vw0 vw0Var = (vw0) obj;
            ((v6) view).b(l41Var.m, vw0Var.d, vw0Var.e, z10);
        } else if (obj instanceof yo) {
            ((v6) view).a(l41Var.m, ((yo) obj).b, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new v6(context);
    }
}
