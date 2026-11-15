package ki;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class g extends a41 {
    static {
        a41.h(new g());
    }

    public static b41 i(int i7, int i10, CharSequence charSequence, String str) {
        b41 K = b41.K(g.class);
        K.d = i7;
        K.z = i10;
        K.k = R.drawable.filled_earn_stars;
        K.l = charSequence;
        K.m = str;
        return K;
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((h) view).a(b41Var.z, b41Var.k, b41Var.l, b41Var.m);
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new h(context, e6Var);
    }
}
