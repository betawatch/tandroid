package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g0 extends k41 {
    static {
        k41.h(new g0());
    }

    public static l41 i(String str, CharSequence charSequence, int i7) {
        l41 K = l41.K(g0.class);
        K.b = false;
        K.A = i7;
        K.m = str;
        K.n = charSequence;
        return K;
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((h0) view).a(l41Var.A, l41Var.m, l41Var.n);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new h0(0, context, i6Var);
    }
}
