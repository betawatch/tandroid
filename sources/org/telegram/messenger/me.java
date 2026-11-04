package org.telegram.messenger;

import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.k40;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ me(Runnable runnable, double d, int i3) {
        this.a = i3;
        this.c = runnable;
        this.b = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        double d = this.b;
        Runnable runnable = this.c;
        switch (i3) {
            case 0:
                MediaController mediaController = (MediaController) ((mi.b0) runnable).b;
                hs.f(mediaController.i1).k(hs.k2, Integer.valueOf(mediaController.h1), Double.valueOf(d));
                break;
            default:
                k40 k40Var = ((c40) ((b40) runnable).b).I0;
                hs.f(k40Var.e).k(hs.k2, Integer.valueOf(k40Var.V), Double.valueOf(d));
                break;
        }
    }
}
