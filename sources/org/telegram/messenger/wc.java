package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd b;
    public final /* synthetic */ int c;

    public /* synthetic */ wc(dd ddVar, int i10, int i11) {
        this.a = i11;
        this.b = ddVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dd ddVar = this.b;
                ddVar.P = false;
                ddVar.j(this.c);
                break;
            case 1:
                dd ddVar2 = this.b;
                ddVar2.P = false;
                ddVar2.j(this.c);
                break;
            case 2:
                this.b.W0(this.c, null, true, null);
                break;
            default:
                this.b.W0(this.c, null, true, null);
                break;
        }
    }
}
