package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class t0 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new t0());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        u0 u0Var = (u0) view;
        a aVar = (a) n41Var.H;
        r2 r2Var = (r2) n41Var.I;
        u0Var.a = aVar;
        u0Var.w = r2Var;
        u0Var.x = gd.a0;
        u0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new u0(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
