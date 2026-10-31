package org.telegram.ui.Cells;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements View.OnLongClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sa(ua uaVar, ta taVar, int i10) {
        this.c = uaVar;
        this.d = taVar;
        this.b = i10;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                ua uaVar = (ua) this.c;
                ta taVar = (ta) this.d;
                return uaVar.b(taVar.h, this.b);
            default:
                rh.v5 v5Var = (rh.v5) this.c;
                Runnable runnable = (Runnable) this.d;
                v5Var.g(this.b, true);
                runnable.run();
                return true;
        }
    }

    public /* synthetic */ sa(rh.v5 v5Var, int i10, Runnable runnable) {
        this.c = v5Var;
        this.b = i10;
        this.d = runnable;
    }
}
