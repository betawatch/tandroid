package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ cf(wn wnVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn.G0(this.b, this.c, this.d);
                break;
            default:
                wn.Y0(this.b, this.c, this.d);
                break;
        }
    }
}
