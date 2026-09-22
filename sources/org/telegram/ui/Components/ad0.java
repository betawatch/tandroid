package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ad0 implements Runnable {
    public boolean a;
    public final /* synthetic */ fd0 b;

    public ad0(fd0 fd0Var) {
        this.b = fd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        fd0 fd0Var = this.b;
        fd0Var.a(z10);
        fd0Var.postDelayed(this, fd0Var.L);
    }
}
