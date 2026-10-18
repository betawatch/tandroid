package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class q81 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r91 b;

    public /* synthetic */ q81(r91 r91Var, int i10) {
        this.a = i10;
        this.b = r91Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        r91 r91Var;
        bh.f fVar2;
        r91 r91Var2;
        bh.f fVar3;
        switch (this.a) {
            case 0:
                r91 r91Var3 = this.b;
                if (r91Var3.r0.size() != r91Var3.s0.size() && !r91Var3.w0 && r91Var3.U.N0() > r91Var3.X.c0 - 20) {
                    r91Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = r91Var3.C0) != null) {
                    fVar.f(i10, i11);
                    r91.W(r91Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (fVar2 = (r91Var = this.b).C0) != null) {
                    fVar2.f(i10, i11);
                    r91.W(r91Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar3 = (r91Var2 = this.b).C0) != null) {
                    fVar3.f(i10, i11);
                    r91.W(r91Var2);
                    break;
                }
                break;
        }
    }
}
