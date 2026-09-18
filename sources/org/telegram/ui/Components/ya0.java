package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya0 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ ya0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                pb0 pb0Var = (pb0) this.b;
                pb0Var.n.y(pb0Var.f.U((View) obj));
                break;
            default:
                f61 f61Var = (f61) this.b;
                f61Var.Y2.Q(f61Var.U((View) obj), f61Var.c3);
                break;
        }
    }
}
