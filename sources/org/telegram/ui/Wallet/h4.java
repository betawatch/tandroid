package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
