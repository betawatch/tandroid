package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class l0 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new l0());
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((m0) view).set((r0) l41Var.H);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        m0 m0Var = new m0(i7, context, false);
        m0Var.setLayoutParams(new v4.q0(-2, -2));
        return m0Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean e(l41 l41Var, l41 l41Var2) {
        return l41Var.H == l41Var2.H;
    }
}
