package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5 b;

    public /* synthetic */ r5(s5 s5Var, int i7) {
        this.a = i7;
        this.b = s5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new r5(this.b, 1));
                break;
            default:
                this.b.a();
                break;
        }
    }
}
