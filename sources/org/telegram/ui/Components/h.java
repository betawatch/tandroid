package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ h(z60 z60Var, boolean z10, Runnable runnable, int i10) {
        this.a = i10;
        this.b = z60Var;
        this.c = z10;
        this.d = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        switch (this.a) {
            case 0:
                this.b.u();
                if (!this.c && (runnable = this.d) != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                this.b.u();
                if (!this.c && (runnable2 = this.d) != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
