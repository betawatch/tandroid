package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bp0 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp0 b;

    public bp0(hp0 hp0Var, int i10) {
        this.b = hp0Var;
        this.a = i10;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
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
        mh.l7 l7Var = this.a == 1 ? np0Var.c : np0Var.b;
        if (l7Var == null || !hp0Var.c()) {
            return;
        }
        l7Var.a();
    }
}
