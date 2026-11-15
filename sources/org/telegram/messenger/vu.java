package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.rg0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
