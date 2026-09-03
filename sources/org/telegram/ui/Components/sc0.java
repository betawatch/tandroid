package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ xc0 b;

    public sc0(xc0 xc0Var) {
        this.b = xc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.a;
        xc0 xc0Var = this.b;
        xc0Var.a(z4);
        xc0Var.postDelayed(this, xc0Var.I);
    }
}
