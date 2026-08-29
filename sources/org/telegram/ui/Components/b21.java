package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b21 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m21 b;

    public /* synthetic */ b21(m21 m21Var, int i10) {
        this.a = i10;
        this.b = m21Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                m21 m21Var = this.b;
                if (m21Var.k()) {
                    m21Var.l();
                    break;
                }
                break;
            default:
                m21 m21Var2 = this.b;
                if (m21Var2.k()) {
                    m21Var2.l();
                    break;
                }
                break;
        }
    }
}
