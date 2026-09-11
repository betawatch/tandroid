package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class aa1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ aa1(bb1 bb1Var, int i10) {
        this.a = i10;
        this.b = bb1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        bb1 bb1Var;
        bh.f fVar2;
        bb1 bb1Var2;
        bh.f fVar3;
        switch (this.a) {
            case 0:
                bb1 bb1Var3 = this.b;
                if (bb1Var3.r0.size() != bb1Var3.s0.size() && !bb1Var3.w0 && bb1Var3.U.N0() > bb1Var3.X.c0 - 20) {
                    bb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = bb1Var3.C0) != null) {
                    fVar.f(i10, i11);
                    bb1.W(bb1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (bb1Var = this.b).C0) != null) {
                    fVar2.f(i10, i11);
                    bb1.W(bb1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (bb1Var2 = this.b).C0) != null) {
                    fVar3.f(i10, i11);
                    bb1.W(bb1Var2);
                    break;
                }
                break;
        }
    }
}
