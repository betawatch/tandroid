package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class la0 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ la0(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ab0 ab0Var = (ab0) this.b;
                ab0Var.n.y(ab0Var.f.T((View) obj));
                break;
            default:
                k51 k51Var = (k51) this.b;
                k51Var.U2.Q(k51Var.T((View) obj), k51Var.Y2);
                break;
        }
    }
}
