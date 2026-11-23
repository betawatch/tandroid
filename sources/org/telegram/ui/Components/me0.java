package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class me0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ oe0 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ me0(oe0 oe0Var, Runnable runnable, int i7) {
        this.a = i7;
        this.b = oe0Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                oe0 oe0Var = this.b;
                org.telegram.ui.ActionBar.k5 k5Var = oe0Var.d;
                if (k5Var.I) {
                    oe0Var.I = this.c;
                    k5Var.a(true);
                    break;
                }
                break;
            default:
                oe0 oe0Var2 = this.b;
                org.telegram.ui.ActionBar.k5 k5Var2 = oe0Var2.d;
                if (k5Var2.I) {
                    oe0Var2.I = this.c;
                    k5Var2.a(true);
                    break;
                }
                break;
        }
    }
}
