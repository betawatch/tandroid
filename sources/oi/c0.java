package oi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class c0 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new c0());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        d0 d0Var = (d0) view;
        a aVar = (a) l41Var.H;
        b0 b0Var = (b0) l41Var.I;
        d0Var.a = aVar;
        d0Var.F = b0Var;
        d0Var.c(aVar);
        d0Var.h();
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        d0 d0Var = new d0(i7, context, i6Var);
        d0Var.setBackground(new w1(n6.w0(n6.d6, i6Var)));
        return d0Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
