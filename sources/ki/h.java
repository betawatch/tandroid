package ki;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class h extends n41 {
    static {
        n41.h(new h());
    }

    public static o41 i(int i7, String str, String str2) {
        o41 K = o41.K(h.class);
        K.k = i7;
        K.m = str;
        K.n = str2;
        return K;
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((i) view).a(o41Var.k, o41Var.m, o41Var.n);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new i(context, h6Var, false);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return false;
    }
}
