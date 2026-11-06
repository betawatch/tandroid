package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.sw0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class t6 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new t6());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        Object obj = r31Var.G;
        if (obj instanceof sw0) {
            sw0 sw0Var = (sw0) obj;
            ((v6) view).b(r31Var.l, sw0Var.d, sw0Var.e, z9);
        } else if (obj instanceof cp) {
            ((v6) view).a(r31Var.l, ((cp) obj).b, true, z9);
        }
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v6(context);
    }
}
