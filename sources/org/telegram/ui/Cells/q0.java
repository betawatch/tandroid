package org.telegram.ui.Cells;

import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kj0 b;

    public /* synthetic */ q0(kj0 kj0Var, int i10) {
        this.a = i10;
        this.b = kj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.H(false);
                break;
            default:
                this.b.start();
                break;
        }
    }
}
