package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.tg0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class xu implements tg0 {
    public final gx0 a;

    public xu(gx0 gx0Var) {
        this.a = gx0Var;
    }

    @Override // org.telegram.ui.tg0
    public final Layout a() {
        fx0 fx0Var = this.a.b;
        if (fx0Var == null) {
            return null;
        }
        return fx0Var.a();
    }

    @Override // org.telegram.ui.tg0
    public final View e() {
        return null;
    }
}
