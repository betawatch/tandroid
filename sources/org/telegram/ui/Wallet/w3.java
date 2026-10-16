package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.i71;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class w3 extends i71 {
    @Override // org.telegram.ui.Components.mm0
    public final boolean t1(View view) {
        if (!(view instanceof y2)) {
            return true;
        }
        y2 y2Var = (y2) view;
        return y2Var.F <= 0.0f && !y2Var.I.d();
    }
}
