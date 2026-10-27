package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db implements View.OnLongClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ db(bi.t9 t9Var, int i10, Runnable runnable) {
        this.c = t9Var;
        this.b = i10;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                fb fbVar = (fb) this.c;
                eb ebVar = (eb) this.d;
                return fbVar.b(ebVar.h, this.b);
            default:
                bi.t9 t9Var = (bi.t9) this.c;
                Runnable runnable = (Runnable) this.d;
                t9Var.g(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ db(fb fbVar, eb ebVar, int i10) {
        this.c = fbVar;
        this.d = ebVar;
        this.b = i10;
    }
}
