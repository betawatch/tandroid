package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements View.OnLongClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ya(ai.x9 x9Var, int i10, Runnable runnable) {
        this.c = x9Var;
        this.b = i10;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                ab abVar = (ab) this.c;
                za zaVar = (za) this.d;
                return abVar.b(zaVar.h, this.b);
            default:
                ai.x9 x9Var = (ai.x9) this.c;
                Runnable runnable = (Runnable) this.d;
                x9Var.g(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ ya(ab abVar, za zaVar, int i10) {
        this.c = abVar;
        this.d = zaVar;
        this.b = i10;
    }
}
