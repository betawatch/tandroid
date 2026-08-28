package j3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ k3.f c;

    public /* synthetic */ l(m mVar, k3.f fVar, int i9) {
        this.a = i9;
        this.b = mVar;
        this.c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m mVar = this.b;
                k3.f fVar = this.c;
                n nVar = mVar.b;
                int i9 = d5.f0.a;
                i3.f fVar2 = ((h3.h0) nVar).a.r;
                i3.a k10 = fVar2.k();
                fVar2.l(k10, 1007, new i3.d(k10, fVar, 16));
                break;
            default:
                m mVar2 = this.b;
                k3.f fVar3 = this.c;
                synchronized (fVar3) {
                }
                n nVar2 = mVar2.b;
                int i10 = d5.f0.a;
                i3.f fVar4 = ((h3.h0) nVar2).a.r;
                i3.a i11 = fVar4.i((j4.d0) fVar4.d.e);
                fVar4.l(i11, 1013, new i3.d(i11, fVar3, 4));
                break;
        }
    }
}
