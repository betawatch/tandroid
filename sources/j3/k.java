package j3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ k(m mVar, Exception exc, int i9) {
        this.a = i9;
        this.b = mVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        Exception exc = this.c;
        m mVar = this.b;
        switch (i9) {
            case 0:
                n nVar = mVar.b;
                int i10 = d5.f0.a;
                i3.f fVar = ((h3.h0) nVar).a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1029, new h9.a(k10, exc, 16));
                break;
            default:
                n nVar2 = mVar.b;
                int i11 = d5.f0.a;
                i3.f fVar2 = ((h3.h0) nVar2).a.r;
                i3.a k11 = fVar2.k();
                fVar2.l(k11, 1014, new i3.d(k11, exc, 13));
                break;
        }
    }
}
