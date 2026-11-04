package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ pe(wm wmVar, long j10, long j11, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wm.o0(this.b, this.c, this.d);
                break;
            default:
                wm.F1(this.b, this.c, this.d);
                break;
        }
    }
}
