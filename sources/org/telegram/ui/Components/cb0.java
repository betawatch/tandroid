package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
