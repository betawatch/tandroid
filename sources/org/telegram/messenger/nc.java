package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class nc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg b;
    public final /* synthetic */ xc c;

    public /* synthetic */ nc(fg fgVar, xc xcVar, int i3) {
        this.a = i3;
        this.b = fgVar;
        this.c = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                this.c.a();
                break;
            default:
                this.b.run();
                this.c.a();
                break;
        }
    }
}
