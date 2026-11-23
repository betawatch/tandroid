package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class su implements wg0 {
    public final rx0 a;

    public su(rx0 rx0Var) {
        this.a = rx0Var;
    }

    @Override // org.telegram.ui.wg0
    public final Layout a() {
        qx0 qx0Var = this.a.b;
        if (qx0Var == null) {
            return null;
        }
        return qx0Var.a();
    }

    @Override // org.telegram.ui.wg0
    public final View e() {
        return null;
    }
}
