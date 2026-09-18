package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ hb0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                yb0 yb0Var = (yb0) this.b;
                yb0Var.n.y(yb0Var.f.U((View) obj));
                break;
            default:
                t61 t61Var = (t61) this.b;
                t61Var.Y2.Q(t61Var.U((View) obj), t61Var.c3);
                break;
        }
    }
}
