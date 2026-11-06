package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ a60(k60 k60Var, Runnable runnable, int i7) {
        this.a = i7;
        this.b = k60Var;
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
                k60 k60Var = this.b;
                if (k60Var.J) {
                    k60Var.u();
                    break;
                }
                break;
            case 2:
                this.c.run();
                k60 k60Var2 = this.b;
                if (k60Var2.J) {
                    k60Var2.u();
                    break;
                }
                break;
            case 3:
                k60 k60Var3 = this.b;
                Runnable runnable2 = this.c;
                if (runnable2 == null) {
                    k60Var3.getClass();
                    break;
                } else {
                    int i7 = -k60Var3.K;
                    k60Var3.K = i7;
                    org.telegram.messenger.g0.G3(i7, view, null);
                    org.telegram.messenger.p2.D.a();
                    runnable2.run();
                    break;
                }
            case 4:
                Runnable runnable3 = this.c;
                if (runnable3 != null) {
                    runnable3.run();
                }
                k60 k60Var4 = this.b;
                if (k60Var4.J) {
                    k60Var4.u();
                    break;
                }
                break;
            default:
                Runnable runnable4 = this.c;
                if (runnable4 != null) {
                    runnable4.run();
                }
                k60 k60Var5 = this.b;
                if (k60Var5.J) {
                    k60Var5.u();
                    break;
                }
                break;
        }
    }
}
