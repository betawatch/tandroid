package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ db(fb fbVar, eb ebVar, int i10) {
        this.c = fbVar;
        this.d = ebVar;
        this.b = i10;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                fb fbVar = (fb) this.c;
                eb ebVar = (eb) this.d;
                return fbVar.b(ebVar.h, this.b);
            default:
                yh.m5 m5Var = (yh.m5) this.c;
                Runnable runnable = (Runnable) this.d;
                m5Var.f(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ db(yh.m5 m5Var, int i10, Runnable runnable) {
        this.c = m5Var;
        this.b = i10;
        this.d = runnable;
    }
}
