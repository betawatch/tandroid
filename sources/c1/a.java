package c1;

import w0.i;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
