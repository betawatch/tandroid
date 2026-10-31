package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.xh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class iv implements xh0 {
    public final iy0 a;

    public iv(iy0 iy0Var) {
        this.a = iy0Var;
    }

    @Override // org.telegram.ui.xh0
    public final Layout a() {
        hy0 hy0Var = this.a.b;
        if (hy0Var == null) {
            return null;
        }
        return hy0Var.a();
    }

    @Override // org.telegram.ui.xh0
    public final View e() {
        return null;
    }
}
