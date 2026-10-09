package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.k71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v3 extends k71 {
    @Override // org.telegram.ui.Components.qm0
    public final boolean t1(View view) {
        if (!(view instanceof x2)) {
            return true;
        }
        x2 x2Var = (x2) view;
        return x2Var.F <= 0.0f && !x2Var.I.d();
    }
}
