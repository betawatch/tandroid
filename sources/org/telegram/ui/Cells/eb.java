package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                yh.l5 l5Var = (yh.l5) this.c;
                Runnable runnable = (Runnable) this.d;
                l5Var.f(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ eb(yh.l5 l5Var, int i10, Runnable runnable) {
        this.c = l5Var;
        this.b = i10;
        this.d = runnable;
    }
}
