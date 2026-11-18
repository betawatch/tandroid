package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ i2(x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                n2 n2Var = x2Var.c;
                org.telegram.messenger.g0.E2(n2Var);
                x2Var.j1.getLayoutContainer().addView(n2Var);
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                try {
                    this.b.L();
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                this.b.dismiss();
                ks.f(j10.t0).k(ks.V2, new Object[0]);
                org.telegram.messenger.g0.h3(new cd0(28), 220L);
                break;
        }
    }
}
