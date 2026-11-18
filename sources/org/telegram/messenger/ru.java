package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.px0;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class ru implements wg0 {
    public final px0 a;

    public ru(px0 px0Var) {
        this.a = px0Var;
    }

    @Override // org.telegram.ui.wg0
    public final Layout a() {
        ox0 ox0Var = this.a.b;
        if (ox0Var == null) {
            return null;
        }
        return ox0Var.a();
    }

    @Override // org.telegram.ui.wg0
    public final View e() {
        return null;
    }
}
