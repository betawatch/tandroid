package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o21 extends v4.h0 {
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

    @Override // v4.h0
    public final int b() {
        return 2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return i7 == 0 ? new cj0(new bn(this.c, 12)) : new cj0(this.d);
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
    }
}
