package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.ug0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class xu implements ug0 {
    public final fx0 a;

    public xu(fx0 fx0Var) {
        this.a = fx0Var;
    }

    @Override // org.telegram.ui.ug0
    public final Layout a() {
        ex0 ex0Var = this.a.b;
        if (ex0Var == null) {
            return null;
        }
        return ex0Var.a();
    }

    @Override // org.telegram.ui.ug0
    public final View e() {
        return null;
    }
}
