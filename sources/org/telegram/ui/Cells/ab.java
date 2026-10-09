package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                yh.e5 e5Var = (yh.e5) this.c;
                Runnable runnable = (Runnable) this.d;
                e5Var.f(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ ab(yh.e5 e5Var, int i10, Runnable runnable) {
        this.c = e5Var;
        this.b = i10;
        this.d = runnable;
    }
}
