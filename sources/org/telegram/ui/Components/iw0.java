package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class iw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw0 b;

    public /* synthetic */ iw0(kw0 kw0Var, int i10) {
        this.a = i10;
        this.b = kw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kw0 kw0Var = this.b;
                kw0Var.V0 = false;
                if (!kw0Var.Y0 && kw0Var.W0) {
                    kw0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                kw0 kw0Var2 = this.b;
                kw0Var2.Y0 = false;
                if (!kw0Var2.V0 && kw0Var2.W0) {
                    kw0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
