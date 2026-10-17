package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class g4 extends a71 {
    @Override // org.telegram.ui.Components.im0
    public final boolean t1(View view) {
        if (!(view instanceof d3)) {
            return true;
        }
        d3 d3Var = (d3) view;
        return d3Var.F <= 0.0f && !d3Var.I.d();
    }
}
