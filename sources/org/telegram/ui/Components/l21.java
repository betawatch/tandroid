package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l21 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w21 b;

    public /* synthetic */ l21(w21 w21Var, int i10) {
        this.a = i10;
        this.b = w21Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                w21 w21Var = this.b;
                if (w21Var.k()) {
                    w21Var.l();
                    break;
                }
                break;
            default:
                w21 w21Var2 = this.b;
                if (w21Var2.k()) {
                    w21Var2.l();
                    break;
                }
                break;
        }
    }
}
