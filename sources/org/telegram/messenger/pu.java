package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.lg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class pu implements lg0 {
    public final ex0 a;

    public pu(ex0 ex0Var) {
        this.a = ex0Var;
    }

    @Override // org.telegram.ui.lg0
    public final Layout a() {
        dx0 dx0Var = this.a.b;
        if (dx0Var == null) {
            return null;
        }
        return dx0Var.a();
    }

    @Override // org.telegram.ui.lg0
    public final View e() {
        return null;
    }
}
