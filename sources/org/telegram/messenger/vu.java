package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.rg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class vu implements rg0 {
    public final ix0 a;

    public vu(ix0 ix0Var) {
        this.a = ix0Var;
    }

    @Override // org.telegram.ui.rg0
    public final Layout a() {
        hx0 hx0Var = this.a.b;
        if (hx0Var == null) {
            return null;
        }
        return hx0Var.a();
    }

    @Override // org.telegram.ui.rg0
    public final View e() {
        return null;
    }
}
