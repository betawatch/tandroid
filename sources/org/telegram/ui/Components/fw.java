package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fw extends f2.x {
    public final /* synthetic */ yy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(yy yyVar) {
        super(5);
        this.Q = yyVar;
    }

    @Override // f2.x, f2.k0, f2.x0
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        int o02 = super.o0(i10, e1Var, l1Var);
        yy yyVar = this.Q;
        if (o02 != 0 && yyVar.z0.getScrollState() == 1) {
            yyVar.T1 = false;
            yyVar.a0();
        }
        if (yyVar.P0 == null) {
            ow owVar = new ow(yyVar, yyVar.Y0, yyVar.p1.a(), yyVar.p1.f(), 0);
            yyVar.P0 = owVar;
            owVar.a();
        }
        yyVar.P0.b();
        return o02;
    }

    @Override // f2.k0, f2.x0
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        try {
            sh.n nVar = new sh.n(recyclerView.getContext(), 2);
            nVar.a = i10;
            w0(nVar);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
