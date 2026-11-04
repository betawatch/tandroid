package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.u10 b;
    public final /* synthetic */ long c;

    public /* synthetic */ c6(int i3, long j10, org.telegram.messenger.u10 u10Var) {
        this.a = i3;
        this.b = u10Var;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Long.valueOf(this.c));
                break;
            default:
                this.b.a(Long.valueOf(this.c));
                break;
        }
    }
}
