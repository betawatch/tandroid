package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.a71;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class i4 extends a71 {
    @Override // org.telegram.ui.Components.im0
    public final boolean t1(View view) {
        if (!(view instanceof f3)) {
            return true;
        }
        f3 f3Var = (f3) view;
        return f3Var.F <= 0.0f && !f3Var.I.d();
    }
}
