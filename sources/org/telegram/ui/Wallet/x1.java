package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ z1 c;
    public final /* synthetic */ w2 d;

    public /* synthetic */ x1(boolean[] zArr, z1 z1Var, w2 w2Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = z1Var;
        this.d = w2Var;
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
