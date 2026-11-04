package org.telegram.ui.Components.voip;

import ci.t4;
import org.telegram.ui.Components.fh0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4 b;
    public final /* synthetic */ fh0 c;

    public /* synthetic */ t0(t4 t4Var, fh0 fh0Var, int i3) {
        this.a = i3;
        this.b = t4Var;
        this.c = fh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new t0(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
