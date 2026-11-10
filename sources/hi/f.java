package hi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class f extends w31 {
    static {
        w31.h(new f());
    }

    public static x31 i(int i7, int i10, CharSequence charSequence, String str) {
        x31 K = x31.K(f.class);
        K.d = i7;
        K.z = i10;
        K.k = R.drawable.filled_earn_stars;
        K.l = charSequence;
        K.m = str;
        return K;
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        ((g) view).a(x31Var.z, x31Var.k, x31Var.l, x31Var.m);
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new g(context, h6Var);
    }
}
