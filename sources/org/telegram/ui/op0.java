package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class op0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public op0(up0 up0Var, int i10) {
        this.b = up0Var;
        this.a = i10;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zg.e eVar;
        up0 up0Var = this.b;
        bq0 bq0Var = up0Var.p0;
        if (i11 != 0) {
            bq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = bq0Var.f0) != null) {
            eVar.f(i10, i11);
        }
        up0Var.h();
        if (up0Var.K != null) {
            if (up0Var.J == null || !up0Var.c()) {
                return;
            }
            up0Var.J.g(false);
            return;
        }
        xh.n5 n5Var = this.a == 1 ? bq0Var.c : bq0Var.b;
        if (n5Var == null || !up0Var.c()) {
            return;
        }
        n5Var.a();
    }
}
