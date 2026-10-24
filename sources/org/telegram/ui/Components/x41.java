package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class x41 extends s4.g0 {
    public Context c;
    public View d;
    public int e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.e++;
        this.d = view;
        m(1);
    }

    @Override // s4.g0
    public final int h() {
        return 2;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return i10 == 0 ? new wl0(new un(this.c, 13)) : new wl0(this.d);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
    }
}
