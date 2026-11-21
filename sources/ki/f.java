package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class f extends n41 {
    static {
        n41.h(new f());
    }

    public static o41 i(int i7, int i10, CharSequence charSequence, String str) {
        o41 K = o41.K(f.class);
        K.d = i7;
        K.A = i10;
        K.k = R.drawable.filled_earn_stars;
        K.m = charSequence;
        K.n = str;
        return K;
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((g) view).a(o41Var.A, o41Var.k, o41Var.m, o41Var.n);
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new g(context, h6Var);
    }
}
