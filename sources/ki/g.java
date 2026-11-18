package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class g extends k41 {
    static {
        k41.h(new g());
    }

    public static l41 i(int i7, int i10, CharSequence charSequence, String str) {
        l41 K = l41.K(g.class);
        K.d = i7;
        K.A = i10;
        K.k = R.drawable.filled_earn_stars;
        K.m = charSequence;
        K.n = str;
        return K;
    }

    @Override // org.telegram.ui.Components.k41
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        ((h) view).a(l41Var.A, l41Var.k, l41Var.m, l41Var.n);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new h(context, i6Var);
    }
}
