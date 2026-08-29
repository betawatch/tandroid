package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class va0 implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ va0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                lb0 lb0Var = (lb0) this.b;
                lb0Var.n.y(lb0Var.f.T((View) obj));
                break;
            default:
                u51 u51Var = (u51) this.b;
                u51Var.U2.Q(u51Var.T((View) obj), u51Var.Y2);
                break;
        }
    }
}
