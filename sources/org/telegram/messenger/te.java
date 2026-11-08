package org.telegram.messenger;

import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.o40;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ te(Runnable runnable, double d, int i7) {
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
                MediaController mediaController = (MediaController) ((m.f3) runnable).b;
                qs.f(mediaController.h1).k(qs.k2, Integer.valueOf(mediaController.g1), Double.valueOf(d));
                break;
            default:
                o40 o40Var = ((g40) ((f40) runnable).b).H0;
                qs.f(o40Var.e).k(qs.k2, Integer.valueOf(o40Var.U), Double.valueOf(d));
                break;
        }
    }
}
