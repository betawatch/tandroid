package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wv0 b;

    public /* synthetic */ uv0(wv0 wv0Var, int i10) {
        this.a = i10;
        this.b = wv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wv0 wv0Var = this.b;
                wv0Var.V0 = false;
                if (!wv0Var.Y0 && wv0Var.W0) {
                    wv0Var.A(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                wv0 wv0Var2 = this.b;
                wv0Var2.Y0 = false;
                if (!wv0Var2.V0 && wv0Var2.W0) {
                    wv0Var2.A(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
