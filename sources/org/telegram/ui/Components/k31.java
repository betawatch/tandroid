package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class k31 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w31 b;

    public /* synthetic */ k31(w31 w31Var, int i10) {
        this.a = i10;
        this.b = w31Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                w31 w31Var = this.b;
                if (w31Var.l()) {
                    w31Var.m();
                    break;
                }
                break;
            default:
                w31 w31Var2 = this.b;
                if (w31Var2.l()) {
                    w31Var2.m();
                    break;
                }
                break;
        }
    }
}
