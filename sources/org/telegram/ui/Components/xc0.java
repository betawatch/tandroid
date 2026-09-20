package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class xc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ cd0 b;

    public xc0(cd0 cd0Var) {
        this.b = cd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        cd0 cd0Var = this.b;
        cd0Var.a(z10);
        cd0Var.postDelayed(this, cd0Var.L);
    }
}
