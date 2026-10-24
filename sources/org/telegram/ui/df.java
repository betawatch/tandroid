package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ df(sn snVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = snVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sn.Y(this.b, this.c, this.d);
                break;
            default:
                sn.X(this.b, this.c, this.d);
                break;
        }
    }
}
