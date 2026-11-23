package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.ug0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class ru implements ug0 {
    public final qx0 a;

    public ru(qx0 qx0Var) {
        this.a = qx0Var;
    }

    @Override // org.telegram.ui.ug0
    public final Layout a() {
        px0 px0Var = this.a.b;
        if (px0Var == null) {
            return null;
        }
        return px0Var.a();
    }

    @Override // org.telegram.ui.ug0
    public final View e() {
        return null;
    }
}
