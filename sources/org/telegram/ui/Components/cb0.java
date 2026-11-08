package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class cb0 implements Runnable {
    public boolean a;
    public final /* synthetic */ hb0 b;

    public cb0(hb0 hb0Var) {
        this.b = hb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9 = this.a;
        hb0 hb0Var = this.b;
        hb0Var.a(z9);
        hb0Var.postDelayed(this, hb0Var.M);
    }
}
