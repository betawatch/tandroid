package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class ru implements wg0 {
    public final rx0 a;

    public ru(rx0 rx0Var) {
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
