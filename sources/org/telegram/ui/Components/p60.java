package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ p60(z60 z60Var, Runnable runnable, int i10) {
        this.a = i10;
        this.b = z60Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.u();
                Runnable runnable = this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                this.c.run();
                z60 z60Var = this.b;
                if (z60Var.J) {
                    z60Var.u();
                    break;
                }
                break;
            case 2:
                this.c.run();
                z60 z60Var2 = this.b;
                if (z60Var2.J) {
                    z60Var2.u();
                    break;
                }
                break;
            case 3:
                z60 z60Var3 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    z60Var3.getClass();
                    break;
                } else {
                    int i10 = -z60Var3.K;
                    z60Var3.K = i10;
                    org.telegram.messenger.i0.F3(i10, view, null);
                    org.telegram.messenger.t2.D.a();
                    runnable2.run();
                    break;
                }
            case 4:
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                z60 z60Var4 = this.b;
                if (z60Var4.J) {
                    z60Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                z60 z60Var5 = this.b;
                if (z60Var5.J) {
                    z60Var5.u();
                    break;
                }
                break;
        }
    }
}
