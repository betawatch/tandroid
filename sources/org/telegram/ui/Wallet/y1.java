package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
