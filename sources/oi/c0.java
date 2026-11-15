package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class c0 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new c0());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        d0 d0Var = (d0) view;
        a aVar = (a) b41Var.G;
        b0 b0Var = (b0) b41Var.H;
        d0Var.a = aVar;
        d0Var.F = b0Var;
        d0Var.c(aVar);
        d0Var.h();
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        d0 d0Var = new d0(i7, context, e6Var);
        d0Var.setBackground(new w1(j6.w0(j6.d6, e6Var)));
        return d0Var;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return false;
    }
}
