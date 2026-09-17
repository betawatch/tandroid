package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class za0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ za0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                qb0 qb0Var = (qb0) this.b;
                qb0Var.n.y(qb0Var.f.T((View) obj));
                break;
            default:
                d61 d61Var = (d61) this.b;
                d61Var.Y2.Q(d61Var.T((View) obj), d61Var.c3);
                break;
        }
    }
}
