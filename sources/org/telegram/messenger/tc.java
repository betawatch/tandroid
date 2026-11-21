package org.telegram.messenger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class tc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd b;
    public final /* synthetic */ int c;

    public /* synthetic */ tc(gd gdVar, int i7, int i10) {
        this.a = i10;
        this.b = gdVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gd gdVar = this.b;
                gdVar.P = false;
                gdVar.j(this.c);
                break;
            case 1:
                gd gdVar2 = this.b;
                gdVar2.P = false;
                gdVar2.j(this.c);
                break;
            case 2:
                this.b.a1(this.c, null, true, null);
                break;
            default:
                this.b.a1(this.c, null, true, null);
                break;
        }
    }
}
