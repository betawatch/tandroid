package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eb(gb gbVar, fb fbVar, int i10) {
        this.c = gbVar;
        this.d = fbVar;
        this.b = i10;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                gb gbVar = (gb) this.c;
                fb fbVar = (fb) this.d;
                return gbVar.b(fbVar.h, this.b);
            default:
                xh.n5 n5Var = (xh.n5) this.c;
                Runnable runnable = (Runnable) this.d;
                n5Var.f(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ eb(xh.n5 n5Var, int i10, Runnable runnable) {
        this.c = n5Var;
        this.b = i10;
        this.d = runnable;
    }
}
