package of;

import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(false);
                break;
            default:
                zs.f(this.b.c).k(zs.e5, new Object[0]);
                break;
        }
    }
}
