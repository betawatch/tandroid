package c1;

import w0.i;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ i c;

    public /* synthetic */ a(e eVar, i iVar, int i10) {
        this.a = i10;
        this.b = eVar;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e().onError(this.c);
                break;
            case 1:
                this.b.e().onError(this.c);
                break;
            default:
                this.b.e().onError(this.c);
                break;
        }
    }
}
