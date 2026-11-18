package org.telegram.messenger;

import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.z40;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ re(Runnable runnable, double d, int i7) {
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
                ks.f(mediaController.i1).k(ks.k2, Integer.valueOf(mediaController.h1), Double.valueOf(d));
                break;
            default:
                z40 z40Var = ((r40) ((q40) runnable).b).I0;
                ks.f(z40Var.e).k(ks.k2, Integer.valueOf(z40Var.V), Double.valueOf(d));
                break;
        }
    }
}
