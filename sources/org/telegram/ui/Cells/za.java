package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class za implements View.OnLongClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ za(ai.y9 y9Var, int i10, Runnable runnable) {
        this.c = y9Var;
        this.b = i10;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                bb bbVar = (bb) this.c;
                ab abVar = (ab) this.d;
                return bbVar.b(abVar.h, this.b);
            default:
                ai.y9 y9Var = (ai.y9) this.c;
                Runnable runnable = (Runnable) this.d;
                y9Var.g(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ za(bb bbVar, ab abVar, int i10) {
        this.c = bbVar;
        this.d = abVar;
        this.b = i10;
    }
}
