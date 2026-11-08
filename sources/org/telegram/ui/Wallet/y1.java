package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class y1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ a2 c;
    public final /* synthetic */ y2 d;

    public /* synthetic */ y1(boolean[] zArr, a2 a2Var, y2 y2Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = a2Var;
        this.d = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (!this.b[0]) {
                    if (!this.c.m) {
                        this.d.dismiss();
                        break;
                    } else {
                        org.telegram.messenger.g0.i3(this, 1000L);
                        break;
                    }
                }
                break;
            default:
                if (!this.b[0]) {
                    if (!this.c.m) {
                        this.d.dismiss();
                        break;
                    } else {
                        org.telegram.messenger.g0.i3(this, 1000L);
                        break;
                    }
                }
                break;
        }
    }
}
