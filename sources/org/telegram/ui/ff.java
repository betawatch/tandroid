package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ff implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ff(sn snVar, long j10, long j11, int i10) {
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
