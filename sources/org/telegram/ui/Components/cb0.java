package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                i61 i61Var = (i61) this.b;
                i61Var.V2.Q(i61Var.T((View) obj), i61Var.Z2);
                break;
        }
    }
}
