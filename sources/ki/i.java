package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i extends k41 {
    static {
        k41.h(new i());
    }

    public static l41 i(int i7, String str, String str2) {
        l41 K = l41.K(i.class);
        K.k = i7;
        K.m = str;
        K.n = str2;
        return K;
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((j) view).a(l41Var.k, l41Var.m, l41Var.n);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new j(context, i6Var, false);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean f() {
        return false;
    }
}
