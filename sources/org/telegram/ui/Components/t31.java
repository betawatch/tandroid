package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class t31 extends s4.h0 {
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

    @Override // s4.h0
    public final int h() {
        return 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return i10 == 0 ? new vk0(new jn(this.c, 13)) : new vk0(this.d);
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
    }
}
