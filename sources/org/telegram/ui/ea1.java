package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ea1 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fb1 b;

    public /* synthetic */ ea1(fb1 fb1Var, int i10) {
        this.a = i10;
        this.b = fb1Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zg.e eVar;
        fb1 fb1Var;
        zg.e eVar2;
        fb1 fb1Var2;
        zg.e eVar3;
        switch (this.a) {
            case 0:
                fb1 fb1Var3 = this.b;
                if (fb1Var3.r0.size() != fb1Var3.s0.size() && !fb1Var3.w0 && fb1Var3.U.N0() > fb1Var3.X.c0 - 20) {
                    fb1Var3.h0();
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = fb1Var3.C0) != null) {
                    eVar.f(i10, i11);
                    fb1.W(fb1Var3);
                    break;
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 31 && (eVar2 = (fb1Var = this.b).C0) != null) {
                    eVar2.f(i10, i11);
                    fb1.W(fb1Var);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar3 = (fb1Var2 = this.b).C0) != null) {
                    eVar3.f(i10, i11);
                    fb1.W(fb1Var2);
                    break;
                }
                break;
        }
    }
}
