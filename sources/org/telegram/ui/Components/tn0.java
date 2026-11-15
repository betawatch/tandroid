package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class tn0 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;

    public /* synthetic */ tn0(po0 po0Var, int i7) {
        this.a = i7;
        this.b = po0Var;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        cb cbVar;
        switch (this.a) {
            case 0:
                po0 po0Var = this.b;
                if (i10 != 0) {
                    po0.I0(po0Var);
                    po0Var.m2 = po0Var.l2;
                }
                xb xbVar = xb.w;
                if (xbVar != null && (cbVar = xbVar.e) != null && (cbVar.getParent() instanceof View) && ((View) xb.w.e.getParent()).getParent() == po0Var.x1) {
                    xb.e();
                    break;
                }
                break;
            case 1:
                if (i10 != 0) {
                    po0 po0Var2 = this.b;
                    po0.I0(po0Var2);
                    po0Var2.m2 = po0Var2.l2;
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    po0 po0Var3 = this.b;
                    po0.I0(po0Var3);
                    po0Var3.m2 = po0Var3.l2;
                    break;
                }
                break;
        }
    }
}
