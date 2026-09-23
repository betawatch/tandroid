package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class q91 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra1 b;

    public /* synthetic */ q91(ra1 ra1Var, int i10) {
        this.a = i10;
        this.b = ra1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        ra1 ra1Var;
        ah.h hVar2;
        ra1 ra1Var2;
        ah.h hVar3;
        switch (this.a) {
            case 0:
                ra1 ra1Var3 = this.b;
                if (ra1Var3.r0.size() != ra1Var3.s0.size() && !ra1Var3.w0 && ra1Var3.U.N0() > ra1Var3.X.c0 - 20) {
                    ra1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = ra1Var3.C0) != null) {
                    hVar.f(i10, i11);
                    ra1.W(ra1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (hVar2 = (ra1Var = this.b).C0) != null) {
                    hVar2.f(i10, i11);
                    ra1.W(ra1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar3 = (ra1Var2 = this.b).C0) != null) {
                    hVar3.f(i10, i11);
                    ra1.W(ra1Var2);
                    break;
                }
                break;
        }
    }
}
