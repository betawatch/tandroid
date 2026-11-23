package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class h extends m41 {
    static {
        m41.h(new h());
    }

    public static n41 i(int i7, String str, String str2) {
        n41 K = n41.K(h.class);
        K.k = i7;
        K.m = str;
        K.n = str2;
        return K;
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((i) view).a(n41Var.k, n41Var.m, n41Var.n);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new i(context, i6Var, false);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return false;
    }
}
