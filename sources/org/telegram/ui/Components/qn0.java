package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qn0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo0 b;

    public /* synthetic */ qn0(mo0 mo0Var, int i7) {
        this.a = i7;
        this.b = mo0Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        fb fbVar;
        switch (this.a) {
            case 0:
                mo0 mo0Var = this.b;
                if (i10 != 0) {
                    mo0.I0(mo0Var);
                    mo0Var.l2 = mo0Var.k2;
                }
                bc bcVar = bc.w;
                if (bcVar != null && (fbVar = bcVar.e) != null && (fbVar.getParent() instanceof View) && ((View) bc.w.e.getParent()).getParent() == mo0Var.w1) {
                    bc.e();
                    break;
                }
                break;
            case 1:
                if (i10 != 0) {
                    mo0 mo0Var2 = this.b;
                    mo0.I0(mo0Var2);
                    mo0Var2.l2 = mo0Var2.k2;
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    mo0 mo0Var3 = this.b;
                    mo0.I0(mo0Var3);
                    mo0Var3.l2 = mo0Var3.k2;
                    break;
                }
                break;
        }
    }
}
