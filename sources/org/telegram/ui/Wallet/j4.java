package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.c71;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class j4 extends c71 {
    @Override // org.telegram.ui.Components.jm0
    public final boolean t1(View view) {
        if (!(view instanceof g3)) {
            return true;
        }
        g3 g3Var = (g3) view;
        return g3Var.F <= 0.0f && !g3Var.I.d();
    }
}
