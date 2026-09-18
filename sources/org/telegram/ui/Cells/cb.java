package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
