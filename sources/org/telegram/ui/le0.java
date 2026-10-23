package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ le0(me0 me0Var, int i10) {
        this.a = i10;
        this.b = me0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                me0 me0Var = this.b;
                ne0 ne0Var = me0Var.d;
                if (me0Var.b) {
                    boolean z10 = ne0Var.K;
                    org.telegram.ui.Components.vj0 vj0Var = ne0Var.J;
                    jd jdVar = ne0Var.n;
                    if (z10 && System.currentTimeMillis() - me0Var.a >= 10000) {
                        jdVar.setAnimation(vj0Var);
                        vj0Var.N(0, false, false);
                        vj0Var.t0 = new le0(me0Var, 1);
                        jdVar.d();
                        me0Var.a = System.currentTimeMillis();
                    }
                    jdVar.postDelayed(me0Var.c, 1000L);
                    break;
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new le0(this.b, 2));
                break;
            default:
                ne0 ne0Var2 = this.b.d;
                org.telegram.ui.Components.vj0 vj0Var2 = ne0Var2.I;
                vj0Var2.N(0, false, false);
                ne0Var2.n.setAnimation(vj0Var2);
                break;
        }
    }
}
