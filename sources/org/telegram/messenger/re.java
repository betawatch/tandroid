package org.telegram.messenger;

import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.t40;
import org.telegram.ui.Components.u40;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                c50 c50Var = ((u40) ((t40) runnable).b).I0;
                ks.f(c50Var.e).k(ks.k2, Integer.valueOf(c50Var.V), Double.valueOf(d));
                break;
        }
    }
}
