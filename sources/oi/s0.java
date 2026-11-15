package oi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class s0 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new s0());
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        t0 t0Var = (t0) view;
        a aVar = (a) b41Var.G;
        o2 o2Var = (o2) b41Var.H;
        t0Var.a = aVar;
        t0Var.w = o2Var;
        t0Var.x = hd.a0;
        t0Var.c(aVar);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new t0(context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return false;
    }
}
