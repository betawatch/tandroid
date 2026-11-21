package org.telegram.messenger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
