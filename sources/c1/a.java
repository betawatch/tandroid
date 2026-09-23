package c1;

import w0.i;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
