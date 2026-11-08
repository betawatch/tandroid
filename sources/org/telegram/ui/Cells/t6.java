package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.cp;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.sw0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t6 extends w31 {
    public static final /* synthetic */ int b = 0;

    static {
        w31.h(new t6());
    }

    @Override // org.telegram.ui.Components.w31
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        Object obj = x31Var.G;
        if (obj instanceof sw0) {
            sw0 sw0Var = (sw0) obj;
            ((v6) view).b(x31Var.l, sw0Var.d, sw0Var.e, z9);
        } else if (obj instanceof cp) {
            ((v6) view).a(x31Var.l, ((cp) obj).b, true, z9);
        }
    }

    @Override // org.telegram.ui.Components.w31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v6(context);
    }
}
