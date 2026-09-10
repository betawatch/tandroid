package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ ib0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                yb0 yb0Var = (yb0) this.b;
                yb0Var.n.y(yb0Var.f.T((View) obj));
                break;
            default:
                r61 r61Var = (r61) this.b;
                r61Var.Y2.Q(r61Var.T((View) obj), r61Var.c3);
                break;
        }
    }
}
