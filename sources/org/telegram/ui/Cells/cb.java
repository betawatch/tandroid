package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                zh.j5 j5Var = (zh.j5) this.c;
                Runnable runnable = (Runnable) this.d;
                j5Var.f(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ cb(zh.j5 j5Var, int i10, Runnable runnable) {
        this.c = j5Var;
        this.b = i10;
        this.d = runnable;
    }
}
