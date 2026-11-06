package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
