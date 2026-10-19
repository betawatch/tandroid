package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class j4 extends b71 {
    @Override // org.telegram.ui.Components.im0
    public final boolean t1(View view) {
        if (!(view instanceof g3)) {
            return true;
        }
        g3 g3Var = (g3) view;
        return g3Var.F <= 0.0f && !g3Var.I.d();
    }
}
