package b1;

import w0.h;
import w0.i;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
