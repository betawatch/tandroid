package org.telegram.messenger;

import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x40;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ se(Runnable runnable, double d, int i10) {
        this.a = i10;
        this.c = runnable;
        this.b = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        double d = this.b;
        Runnable runnable = this.c;
        switch (i10) {
            case 0:
                MediaController mediaController = (MediaController) ((mg.c2) runnable).b;
                zs.f(mediaController.g1).k(zs.k2, Integer.valueOf(mediaController.f1), Double.valueOf(d));
                break;
            default:
                e50 e50Var = ((x40) ((w40) runnable).b).H0;
                zs.f(e50Var.e).k(zs.k2, Integer.valueOf(e50Var.U), Double.valueOf(d));
                break;
        }
    }
}
