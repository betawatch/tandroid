package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.ui.q61;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ g2(w2 w2Var, int i7) {
        this.a = i7;
        this.b = w2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                m2 m2Var = w2Var.c;
                org.telegram.messenger.g0.E2(m2Var);
                w2Var.i1.getLayoutContainer().addView(m2Var);
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                try {
                    this.b.K();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.b.dismiss();
                qs.f(p10.s0).k(qs.T2, new Object[0]);
                org.telegram.messenger.g0.i3(new q61(21), 220L);
                break;
        }
    }
}
