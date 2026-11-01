package org.telegram.messenger;

import android.text.Layout;
import android.view.View;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.vh0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class jv implements vh0 {
    public final jy0 a;

    public jv(jy0 jy0Var) {
        this.a = jy0Var;
    }

    @Override // org.telegram.ui.vh0
    public final Layout a() {
        iy0 iy0Var = this.a.b;
        if (iy0Var == null) {
            return null;
        }
        return iy0Var.a();
    }

    @Override // org.telegram.ui.vh0
    public final View e() {
        return null;
    }
}
