package org.telegram.ui.Components;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mp0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq0 b;

    public /* synthetic */ mp0(mq0 mq0Var, int i10) {
        this.a = i10;
        this.b = mq0Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        nb nbVar;
        switch (this.a) {
            case 0:
                if (i11 != 0) {
                    mq0 mq0Var = this.b;
                    mq0.s0(mq0Var);
                    mq0Var.n0 = mq0Var.m0;
                    break;
                }
                break;
            case 1:
                mq0 mq0Var2 = this.b;
                if (i11 != 0) {
                    mq0.s0(mq0Var2);
                    mq0Var2.n0 = mq0Var2.m0;
                }
                ic icVar = ic.w;
                if (icVar != null && (nbVar = icVar.e) != null && (nbVar.getParent() instanceof View) && ((View) ic.w.e.getParent()).getParent() == mq0Var2.w) {
                    ic.e();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = mq0Var2.L0) != null) {
                    eVar.f(i10, i11);
                    mq0.A0(mq0Var2);
                    break;
                }
                break;
            default:
                if (i11 != 0) {
                    mq0 mq0Var3 = this.b;
                    mq0.s0(mq0Var3);
                    mq0Var3.n0 = mq0Var3.m0;
                    break;
                }
                break;
        }
    }
}
