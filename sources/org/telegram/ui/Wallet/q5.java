package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ q5(r5 r5Var, int i3) {
        this.a = i3;
        this.b = r5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new q5(this.b, 1));
                break;
            default:
                this.b.a();
                break;
        }
    }
}
