package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                yh.n5 n5Var = (yh.n5) this.c;
                Runnable runnable = (Runnable) this.d;
                n5Var.f(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ db(yh.n5 n5Var, int i10, Runnable runnable) {
        this.c = n5Var;
        this.b = i10;
        this.d = runnable;
    }
}
