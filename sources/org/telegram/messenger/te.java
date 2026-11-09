package org.telegram.messenger;

import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.p40;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                p40 p40Var = ((h40) ((g40) runnable).b).H0;
                qs.f(p40Var.e).k(qs.k2, Integer.valueOf(p40Var.U), Double.valueOf(d));
                break;
        }
    }
}
