package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
