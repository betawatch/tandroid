package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class p0 extends q31 {
    static {
        q31.h(new p0());
    }

    public static r31 i(String str, CharSequence charSequence, int i7) {
        r31 K = r31.K(p0.class);
        K.b = false;
        K.z = i7;
        K.l = str;
        K.m = charSequence;
        return K;
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ((q0) view).a(r31Var.z, r31Var.l, r31Var.m);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q0(0, context, f6Var);
    }
}
