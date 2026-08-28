package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y21 extends f2.r0 {
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

    @Override // f2.r0
    public final int h() {
        return 2;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return i9 == 0 ? new ik0(new an(this.c, 14)) : new ik0(this.d);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
    }
}
