package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ h2(w2 w2Var, int i7) {
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
                w2Var.j1.getLayoutContainer().addView(m2Var);
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
                ks.f(i10.t0).k(ks.V2, new Object[0]);
                org.telegram.messenger.g0.h3(new cd0(28), 220L);
                break;
        }
    }
}
