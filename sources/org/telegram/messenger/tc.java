package org.telegram.messenger;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
