package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
