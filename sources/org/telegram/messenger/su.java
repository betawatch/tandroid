package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
