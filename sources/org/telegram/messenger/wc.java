package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;
    public final /* synthetic */ int c;

    public /* synthetic */ wc(id idVar, int i7, int i10) {
        this.a = i10;
        this.b = idVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                id idVar = this.b;
                idVar.P = false;
                idVar.j(this.c);
                break;
            case 1:
                id idVar2 = this.b;
                idVar2.P = false;
                idVar2.j(this.c);
                break;
            case 2:
                this.b.Z0(this.c, null, true, null);
                break;
            default:
                this.b.Z0(this.c, null, true, null);
                break;
        }
    }
}
