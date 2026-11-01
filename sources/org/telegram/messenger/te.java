package org.telegram.messenger;

import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.x40;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ te(Runnable runnable, double d, int i10) {
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
                at.f(mediaController.g1).k(at.k2, Integer.valueOf(mediaController.f1), Double.valueOf(d));
                break;
            default:
                e50 e50Var = ((x40) ((w40) runnable).b).H0;
                at.f(e50Var.e).k(at.k2, Integer.valueOf(e50Var.U), Double.valueOf(d));
                break;
        }
    }
}
