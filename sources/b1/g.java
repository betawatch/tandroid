package b1;

import w0.h;
import w0.i;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                this.b.T(obj);
                break;
            case 1:
                this.b.T(this.c);
                break;
            default:
                this.b.T(this.c);
                break;
        }
    }
}
