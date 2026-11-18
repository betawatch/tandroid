package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class ms implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ms(xs xsVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = xsVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xs xsVar = this.b;
                xsVar.G = this.c;
                xsVar.H = this.d;
                break;
            default:
                this.b.o(this.c, this.d);
                break;
        }
    }
}
