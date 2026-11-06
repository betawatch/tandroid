package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ b2 c;
    public final /* synthetic */ z2 d;

    public /* synthetic */ z1(boolean[] zArr, b2 b2Var, z2 z2Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = b2Var;
        this.d = z2Var;
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
