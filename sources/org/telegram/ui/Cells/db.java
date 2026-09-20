package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                yh.l5 l5Var = (yh.l5) this.c;
                Runnable runnable = (Runnable) this.d;
                l5Var.f(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ db(yh.l5 l5Var, int i10, Runnable runnable) {
        this.c = l5Var;
        this.b = i10;
        this.d = runnable;
    }
}
