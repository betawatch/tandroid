package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
