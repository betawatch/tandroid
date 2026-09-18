package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class pc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ uc0 b;

    public pc0(uc0 uc0Var) {
        this.b = uc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        uc0 uc0Var = this.b;
        uc0Var.a(z10);
        uc0Var.postDelayed(this, uc0Var.L);
    }
}
