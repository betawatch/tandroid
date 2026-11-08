package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ kg0(qg0 qg0Var, int i7) {
        this.a = i7;
        this.b = qg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.g1(true, false);
                break;
            default:
                this.b.g1(true, false);
                break;
        }
    }
}
