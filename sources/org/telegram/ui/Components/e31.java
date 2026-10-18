package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class e31 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q31 b;

    public /* synthetic */ e31(q31 q31Var, int i10) {
        this.a = i10;
        this.b = q31Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                q31 q31Var = this.b;
                if (q31Var.k()) {
                    q31Var.l();
                    break;
                }
                break;
            default:
                q31 q31Var2 = this.b;
                if (q31Var2.k()) {
                    q31Var2.l();
                    break;
                }
                break;
        }
    }
}
