package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class aa1 extends s4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb1 b;

    public /* synthetic */ aa1(bb1 bb1Var, int i10) {
        this.a = i10;
        this.b = bb1Var;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        bb1 bb1Var;
        ah.h hVar2;
        bb1 bb1Var2;
        ah.h hVar3;
        switch (this.a) {
            case 0:
                bb1 bb1Var3 = this.b;
                if (bb1Var3.r0.size() != bb1Var3.s0.size() && !bb1Var3.w0 && bb1Var3.U.N0() > bb1Var3.X.c0 - 20) {
                    bb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = bb1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    bb1.W(bb1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (bb1Var = this.b).C0) != null) {
                    hVar2.f(i10, i11);
                    bb1.W(bb1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (bb1Var2 = this.b).C0) != null) {
                    hVar3.f(i10, i11);
                    bb1.W(bb1Var2);
                    break;
                }
                break;
        }
    }
}
