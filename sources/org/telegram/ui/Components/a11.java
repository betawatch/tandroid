package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class a11 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m11 b;

    public /* synthetic */ a11(m11 m11Var, int i7) {
        this.a = i7;
        this.b = m11Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                m11 m11Var = this.b;
                if (m11Var.l()) {
                    m11Var.m();
                    break;
                }
                break;
            default:
                m11 m11Var2 = this.b;
                if (m11Var2.l()) {
                    m11Var2.m();
                    break;
                }
                break;
        }
    }
}
