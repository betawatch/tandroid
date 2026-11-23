package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ x60 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ m60(x60 x60Var, Runnable runnable, int i7) {
        this.a = i7;
        this.b = x60Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.v();
                Runnable runnable = this.c;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                this.c.run();
                x60 x60Var = this.b;
                if (x60Var.J) {
                    x60Var.v();
                    break;
                }
                break;
            case 2:
                this.c.run();
                x60 x60Var2 = this.b;
                if (x60Var2.J) {
                    x60Var2.v();
                    break;
                }
                break;
            case 3:
                x60 x60Var3 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    x60Var3.getClass();
                    break;
                } else {
                    int i7 = -x60Var3.K;
                    x60Var3.K = i7;
                    org.telegram.messenger.g0.E3(i7, view, null);
                    org.telegram.messenger.q2.E.a();
                    runnable2.run();
                    break;
                }
            case 4:
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                x60 x60Var4 = this.b;
                if (x60Var4.J) {
                    x60Var4.v();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                x60 x60Var5 = this.b;
                if (x60Var5.J) {
                    x60Var5.v();
                    break;
                }
                break;
        }
    }
}
