package c1;

import w0.i;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
