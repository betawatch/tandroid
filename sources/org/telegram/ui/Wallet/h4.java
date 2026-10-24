package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class h4 extends j71 {
    @Override // org.telegram.ui.Components.mm0
    public final boolean x1(View view) {
        if (!(view instanceof f3)) {
            return true;
        }
        f3 f3Var = (f3) view;
        return f3Var.F <= 0.0f && !f3Var.I.d();
    }
}
