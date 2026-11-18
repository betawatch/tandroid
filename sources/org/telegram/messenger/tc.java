package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                this.b.Z0(this.c, null, true, null);
                break;
            default:
                this.b.Z0(this.c, null, true, null);
                break;
        }
    }
}
