package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
