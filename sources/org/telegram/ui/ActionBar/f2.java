package org.telegram.ui.ActionBar;

import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.ui.ah0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u2 b;

    public /* synthetic */ f2(u2 u2Var, int i7) {
        this.a = i7;
        this.b = u2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u2 u2Var = this.b;
                k2 k2Var = u2Var.c;
                org.telegram.messenger.g0.E2(k2Var);
                u2Var.j1.getLayoutContainer().addView(k2Var);
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
                ns.f(m10.t0).k(ns.T2, new Object[0]);
                org.telegram.messenger.g0.i3(new ah0(25), 220L);
                break;
        }
    }
}
