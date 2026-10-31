package b1;

import w0.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0.h b;
    public final /* synthetic */ i c;

    public /* synthetic */ h(v0.h hVar, i iVar, int i10) {
        this.a = i10;
        this.b = hVar;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Object obj = this.c;
                if (obj == null) {
                    obj = new w0.h(2, "No provider data returned");
                }
                this.b.g(obj);
                break;
            default:
                this.b.g(this.c);
                break;
        }
    }
}
