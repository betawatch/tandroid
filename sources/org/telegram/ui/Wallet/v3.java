package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.h71;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class v3 extends h71 {
    @Override // org.telegram.ui.Components.mm0
    public final boolean t1(View view) {
        if (!(view instanceof x2)) {
            return true;
        }
        x2 x2Var = (x2) view;
        return x2Var.F <= 0.0f && !x2Var.I.d();
    }
}
