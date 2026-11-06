package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        gb gbVar;
        switch (this.a) {
            case 0:
                mo0 mo0Var = this.b;
                if (i10 != 0) {
                    mo0.I0(mo0Var);
                    mo0Var.i2 = mo0Var.h2;
                }
                cc ccVar = cc.w;
                if (ccVar != null && (gbVar = ccVar.e) != null && (gbVar.getParent() instanceof View) && ((View) cc.w.e.getParent()).getParent() == mo0Var.t1) {
                    cc.e();
                    break;
                }
                break;
            case 1:
                if (i10 != 0) {
                    mo0 mo0Var2 = this.b;
                    mo0.I0(mo0Var2);
                    mo0Var2.i2 = mo0Var2.h2;
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    mo0 mo0Var3 = this.b;
                    mo0.I0(mo0Var3);
                    mo0Var3.i2 = mo0Var3.h2;
                    break;
                }
                break;
        }
    }
}
