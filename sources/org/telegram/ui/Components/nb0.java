package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nb0 implements Runnable {
    public boolean a;
    public final /* synthetic */ sb0 b;

    public nb0(sb0 sb0Var) {
        this.b = sb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        sb0 sb0Var = this.b;
        sb0Var.a(z10);
        sb0Var.postDelayed(this, sb0Var.N);
    }
}
