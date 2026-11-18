package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.vg0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class ru implements vg0 {
    public final px0 a;

    public ru(px0 px0Var) {
        this.a = px0Var;
    }

    @Override // org.telegram.ui.vg0
    public final Layout a() {
        ox0 ox0Var = this.a.b;
        if (ox0Var == null) {
            return null;
        }
        return ox0Var.a();
    }

    @Override // org.telegram.ui.vg0
    public final View e() {
        return null;
    }
}
