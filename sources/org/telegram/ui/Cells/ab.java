package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ab(cb cbVar, bb bbVar, int i10) {
        this.c = cbVar;
        this.d = bbVar;
        this.b = i10;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                cb cbVar = (cb) this.c;
                bb bbVar = (bb) this.d;
                return cbVar.b(bbVar.h, this.b);
            default:
                zh.f5 f5Var = (zh.f5) this.c;
                Runnable runnable = (Runnable) this.d;
                f5Var.f(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ ab(zh.f5 f5Var, int i10, Runnable runnable) {
        this.c = f5Var;
        this.b = i10;
        this.d = runnable;
    }
}
