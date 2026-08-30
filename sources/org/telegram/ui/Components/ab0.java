package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ ab0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                qb0 qb0Var = (qb0) this.b;
                qb0Var.n.y(qb0Var.f.T((View) obj));
                break;
            default:
                g61 g61Var = (g61) this.b;
                g61Var.V2.Q(g61Var.T((View) obj), g61Var.Z2);
                break;
        }
    }
}
