package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class h4 extends a71 {
    @Override // org.telegram.ui.Components.im0
    public final boolean t1(View view) {
        if (!(view instanceof e3)) {
            return true;
        }
        e3 e3Var = (e3) view;
        return e3Var.F <= 0.0f && !e3Var.I.d();
    }
}
