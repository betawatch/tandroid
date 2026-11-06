package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.rg0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
