package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
