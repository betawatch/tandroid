package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cb(eb ebVar, db dbVar, int i10) {
        this.c = ebVar;
        this.d = dbVar;
        this.b = i10;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                eb ebVar = (eb) this.c;
                db dbVar = (db) this.d;
                return ebVar.b(dbVar.h, this.b);
            default:
                yh.l5 l5Var = (yh.l5) this.c;
                Runnable runnable = (Runnable) this.d;
                l5Var.f(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ cb(yh.l5 l5Var, int i10, Runnable runnable) {
        this.c = l5Var;
        this.b = i10;
        this.d = runnable;
    }
}
