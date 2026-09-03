package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bp0 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp0 b;

    public bp0(hp0 hp0Var, int i10) {
        this.b = hp0Var;
        this.a = i10;
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ng.e eVar;
        hp0 hp0Var = this.b;
        np0 np0Var = hp0Var.m0;
        if (i11 != 0) {
            np0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = np0Var.c0) != null) {
            eVar.f(i10, i11);
        }
        hp0Var.h();
        if (hp0Var.H != null) {
            if (hp0Var.G == null || !hp0Var.c()) {
                return;
            }
            hp0Var.G.g(false);
            return;
        }
        lh.l7 l7Var = this.a == 1 ? np0Var.c : np0Var.b;
        if (l7Var == null || !hp0Var.c()) {
            return;
        }
        l7Var.a();
    }
}
