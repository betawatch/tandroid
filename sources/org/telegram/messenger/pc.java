package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class pc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd b;
    public final /* synthetic */ int c;

    public /* synthetic */ pc(bd bdVar, int i3, int i10) {
        this.a = i10;
        this.b = bdVar;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bd bdVar = this.b;
                bdVar.P = false;
                bdVar.j(this.c);
                break;
            case 1:
                bd bdVar2 = this.b;
                bdVar2.P = false;
                bdVar2.j(this.c);
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
