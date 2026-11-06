package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.rg0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class xu implements rg0 {
    public final ex0 a;

    public xu(ex0 ex0Var) {
        this.a = ex0Var;
    }

    @Override // org.telegram.ui.rg0
    public final Layout a() {
        dx0 dx0Var = this.a.b;
        if (dx0Var == null) {
            return null;
        }
        return dx0Var.a();
    }

    @Override // org.telegram.ui.rg0
    public final View e() {
        return null;
    }
}
