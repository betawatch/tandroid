package b1;

import v0.i;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ w0.i c;

    public /* synthetic */ h(i iVar, w0.i iVar2, int i10) {
        this.a = i10;
        this.b = iVar;
        this.c = iVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Object obj = this.c;
                if (obj == null) {
                    obj = new w0.h("No provider data returned", 2);
                }
                this.b.onError(obj);
                break;
            default:
                this.b.onError(this.c);
                break;
        }
    }
}
