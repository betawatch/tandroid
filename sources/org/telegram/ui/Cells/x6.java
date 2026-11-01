package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ip;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.fy0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x6 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new x6());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        Object obj = b51Var.G;
        if (obj instanceof fy0) {
            fy0 fy0Var = (fy0) obj;
            ((z6) view).b(b51Var.l, fy0Var.d, fy0Var.e, z10);
        } else if (obj instanceof ip) {
            ((z6) view).a(b51Var.l, ((ip) obj).b, true, z10);
        }
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new z6(context);
    }
}
