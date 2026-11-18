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
public final class x5 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new x5());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((z5) view).f((a) l41Var.H, (w5) l41Var.I, l41Var.s);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        z5 z5Var = new z5(context, i6Var);
        z5Var.setBackground(new w1(n6.w0(n6.d6, i6Var)));
        return z5Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
