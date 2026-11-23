package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class t0 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new t0());
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) o41Var.H;
        r2 r2Var = (r2) o41Var.I;
        u0Var.a = aVar;
        u0Var.w = r2Var;
        u0Var.x = hd.a0;
        u0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new u0(context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return false;
    }
}
