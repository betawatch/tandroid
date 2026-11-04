package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ w50(f60 f60Var, Runnable runnable, int i3) {
        this.a = i3;
        this.b = f60Var;
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
                f60 f60Var = this.b;
                if (f60Var.J) {
                    f60Var.u();
                    break;
                }
                break;
            case 2:
                this.c.run();
                f60 f60Var2 = this.b;
                if (f60Var2.J) {
                    f60Var2.u();
                    break;
                }
                break;
            case 3:
                f60 f60Var3 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    f60Var3.getClass();
                    break;
                } else {
                    int i3 = -f60Var3.K;
                    f60Var3.K = i3;
                    org.telegram.messenger.g0.G3(i3, view, null);
                    org.telegram.messenger.p2.E.a();
                    runnable2.run();
                    break;
                }
            case 4:
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                f60 f60Var4 = this.b;
                if (f60Var4.J) {
                    f60Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                f60 f60Var5 = this.b;
                if (f60Var5.J) {
                    f60Var5.u();
                    break;
                }
                break;
        }
    }
}
