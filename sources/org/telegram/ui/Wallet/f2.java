package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class f2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ h2 c;
    public final /* synthetic */ d3 d;

    public /* synthetic */ f2(boolean[] zArr, h2 h2Var, d3 d3Var, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = h2Var;
        this.d = d3Var;
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
                        org.telegram.messenger.g0.h3(this, 1000L);
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
                        org.telegram.messenger.g0.h3(this, 1000L);
                        break;
                    }
                }
                break;
        }
    }
}
