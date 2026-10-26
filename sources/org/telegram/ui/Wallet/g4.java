package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.ui.Components.r71;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class g4 extends r71 {
    @Override // org.telegram.ui.Components.mm0
    public final boolean x1(View view) {
        if (!(view instanceof f3)) {
            return true;
        }
        f3 f3Var = (f3) view;
        return f3Var.F <= 0.0f && !f3Var.I.d();
    }
}
