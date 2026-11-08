package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ s6(v6 v6Var, int i7) {
        this.a = i7;
        this.b = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v6.a(this.b);
                break;
            default:
                v6 v6Var = this.b;
                Runnable runnable = v6Var.c0;
                v6Var.c0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
