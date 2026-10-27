package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g4 extends s71 {
    @Override // org.telegram.ui.Components.nm0
    public final boolean x1(View view) {
        if (!(view instanceof f3)) {
            return true;
        }
        f3 f3Var = (f3) view;
        return f3Var.F <= 0.0f && !f3Var.I.d();
    }
}
