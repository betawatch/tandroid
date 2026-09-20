package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kd0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qc0(kd0 kd0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = kd0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                kd0 kd0Var = this.b;
                if (!z10) {
                    kd0Var.b.setVisibility(8);
                    break;
                } else {
                    kd0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
