package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s11 extends f2.b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d21 b;

    public /* synthetic */ s11(d21 d21Var, int i10) {
        this.a = i10;
        this.b = d21Var;
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                d21 d21Var = this.b;
                if (d21Var.k()) {
                    d21Var.l();
                    break;
                }
                break;
            default:
                d21 d21Var2 = this.b;
                if (d21Var2.k()) {
                    d21Var2.l();
                    break;
                }
                break;
        }
    }
}
