package org.telegram.messenger;

import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.r40;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ se(Runnable runnable, double d, int i7) {
        this.a = i7;
        this.c = runnable;
        this.b = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        double d = this.b;
        Runnable runnable = this.c;
        switch (i7) {
            case 0:
                MediaController mediaController = (MediaController) ((j6.o) runnable).b;
                ns.f(mediaController.i1).k(ns.k2, Integer.valueOf(mediaController.h1), Double.valueOf(d));
                break;
            default:
                r40 r40Var = ((j40) ((i40) runnable).b).I0;
                ns.f(r40Var.e).k(ns.k2, Integer.valueOf(r40Var.V), Double.valueOf(d));
                break;
        }
    }
}
