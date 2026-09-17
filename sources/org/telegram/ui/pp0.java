package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class pp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp0 b;

    public pp0(vp0 vp0Var, int i10) {
        this.b = vp0Var;
        this.a = i10;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        vp0 vp0Var = this.b;
        bq0 bq0Var = vp0Var.p0;
        if (i11 != 0) {
            bq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = bq0Var.f0) != null) {
            fVar.f(i10, i11);
        }
        vp0Var.h();
        if (vp0Var.K != null) {
            if (vp0Var.J == null || !vp0Var.c()) {
                return;
            }
            vp0Var.J.g(false);
            return;
        }
        zh.j5 j5Var = this.a == 1 ? bq0Var.c : bq0Var.b;
        if (j5Var == null || !vp0Var.c()) {
            return;
        }
        j5Var.a();
    }
}
