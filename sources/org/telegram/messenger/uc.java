package org.telegram.messenger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class uc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd b;
    public final /* synthetic */ int c;

    public /* synthetic */ uc(hd hdVar, int i7, int i10) {
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
