package c1;

import w0.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ i c;

    public /* synthetic */ a(d dVar, i iVar, int i10) {
        this.a = i10;
        this.b = dVar;
        this.c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e().g(this.c);
                break;
            case 1:
                this.b.e().g(this.c);
                break;
            default:
                this.b.e().g(this.c);
                break;
        }
    }
}
