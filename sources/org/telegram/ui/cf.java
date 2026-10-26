package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ cf(un unVar, long j10, long j11, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un.E0(this.b, this.c, this.d);
                break;
            default:
                un.A1(this.b, this.c, this.d);
                break;
        }
    }
}
