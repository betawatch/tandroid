package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ga1 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hb1 b;

    public /* synthetic */ ga1(hb1 hb1Var, int i10) {
        this.a = i10;
        this.b = hb1Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        hb1 hb1Var;
        bh.f fVar2;
        hb1 hb1Var2;
        bh.f fVar3;
        switch (this.a) {
            case 0:
                hb1 hb1Var3 = this.b;
                if (hb1Var3.r0.size() != hb1Var3.s0.size() && !hb1Var3.w0 && hb1Var3.U.N0() > hb1Var3.X.c0 - 20) {
                    hb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = hb1Var3.C0) != null) {
                    fVar.f(i10, i11);
                    hb1.W(hb1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (hb1Var = this.b).C0) != null) {
                    fVar2.f(i10, i11);
                    hb1.W(hb1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (hb1Var2 = this.b).C0) != null) {
                    fVar3.f(i10, i11);
                    hb1.W(hb1Var2);
                    break;
                }
                break;
        }
    }
}
