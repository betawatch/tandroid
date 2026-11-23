package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class d0 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new d0());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        e0 e0Var = (e0) view;
        a aVar = (a) n41Var.H;
        c0 c0Var = (c0) n41Var.I;
        e0Var.a = aVar;
        e0Var.F = c0Var;
        e0Var.c(aVar);
        e0Var.h();
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        e0 e0Var = new e0(i7, context, i6Var);
        e0Var.setBackground(new y1(n6.w0(n6.d6, i6Var)));
        return e0Var;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
