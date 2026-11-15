package b1;

import w0.h;
import w0.i;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0.g b;
    public final /* synthetic */ i c;

    public /* synthetic */ g(v0.g gVar, i iVar, int i7) {
        this.a = i7;
        this.b = gVar;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Object obj = this.c;
                if (obj == null) {
                    obj = new h(2, "No provider data returned");
                }
                this.b.a(obj);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
