package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements View.OnLongClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sa(bi.v9 v9Var, int i7, Runnable runnable) {
        this.c = v9Var;
        this.b = i7;
        this.d = runnable;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                ua uaVar = (ua) this.c;
                ta taVar = (ta) this.d;
                return uaVar.b(taVar.h, this.b);
            default:
                bi.v9 v9Var = (bi.v9) this.c;
                Runnable runnable = (Runnable) this.d;
                v9Var.g(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ sa(ua uaVar, ta taVar, int i7) {
        this.c = uaVar;
        this.d = taVar;
        this.b = i7;
    }
}
