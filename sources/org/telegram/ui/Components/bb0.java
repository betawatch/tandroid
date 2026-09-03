package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ bb0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                rb0 rb0Var = (rb0) this.b;
                rb0Var.n.y(rb0Var.f.T((View) obj));
                break;
            default:
                g61 g61Var = (g61) this.b;
                g61Var.V2.Q(g61Var.T((View) obj), g61Var.Z2);
                break;
        }
    }
}
