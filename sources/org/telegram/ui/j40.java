package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l40 b;

    public /* synthetic */ j40(l40 l40Var, int i10) {
        this.a = i10;
        this.b = l40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l40 l40Var = this.b;
                bi.t0 t0Var = l40Var.b;
                if (t0Var != null) {
                    t0Var.setVisibility(0);
                }
                org.telegram.messenger.i0.h3(new j40(l40Var, 2), 16L);
                break;
            case 1:
                bi.t0 t0Var2 = this.b.b;
                if (t0Var2 != null) {
                    t0Var2.setVisibility(4);
                    break;
                }
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
