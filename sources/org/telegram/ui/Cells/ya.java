package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ya implements View.OnLongClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ya(ai.y9 y9Var, int i10, Runnable runnable) {
        this.c = y9Var;
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
                ai.y9 y9Var = (ai.y9) this.c;
                Runnable runnable = (Runnable) this.d;
                y9Var.g(this.b, true);
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
