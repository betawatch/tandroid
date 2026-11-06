package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.rg0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class xu implements rg0 {
    public final fx0 a;

    public xu(fx0 fx0Var) {
        this.a = fx0Var;
    }

    @Override // org.telegram.ui.rg0
    public final Layout a() {
        ex0 ex0Var = this.a.b;
        if (ex0Var == null) {
            return null;
        }
        return ex0Var.a();
    }

    @Override // org.telegram.ui.rg0
    public final View e() {
        return null;
    }
}
