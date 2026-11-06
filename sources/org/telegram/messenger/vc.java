package org.telegram.messenger;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class vc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd b;
    public final /* synthetic */ int c;

    public /* synthetic */ vc(hd hdVar, int i7, int i10) {
        this.a = i10;
        this.b = hdVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hd hdVar = this.b;
                hdVar.P = false;
                hdVar.j(this.c);
                break;
            case 1:
                hd hdVar2 = this.b;
                hdVar2.P = false;
                hdVar2.j(this.c);
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
