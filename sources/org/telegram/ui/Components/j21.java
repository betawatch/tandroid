package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class j21 extends v4.g0 {
    public Context c;
    public View d;
    public int e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.e++;
        this.d = view;
        g(1);
    }

    @Override // v4.g0
    public final int b() {
        return 2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return i7 == 0 ? new xi0(new tm(this.c, 12)) : new xi0(this.d);
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
    }
}
