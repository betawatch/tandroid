package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u31 extends f2.o0 {
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

    @Override // f2.o0
    public final int h() {
        return 2;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return i10 == 0 ? new dl0(new gn(this.c, 10)) : new dl0(this.d);
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
    }
}
