package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ cb0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                sb0 sb0Var = (sb0) this.b;
                sb0Var.n.y(sb0Var.f.T((View) obj));
                break;
            default:
                h61 h61Var = (h61) this.b;
                h61Var.V2.Q(h61Var.T((View) obj), h61Var.Z2);
                break;
        }
    }
}
