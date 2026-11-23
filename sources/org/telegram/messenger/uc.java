package org.telegram.messenger;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                this.b.a1(this.c, null, true, null);
                break;
            default:
                this.b.a1(this.c, null, true, null);
                break;
        }
    }
}
