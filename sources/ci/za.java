package ci;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class za implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;

    public /* synthetic */ za(kc kcVar, int i10) {
        this.a = i10;
        this.b = kcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kc kcVar = this.b;
                kcVar.getClass();
                kcVar.g(1.0f, true, new ga(kcVar, 6));
                kcVar.b1.b(true, true);
                break;
            default:
                kc kcVar2 = this.b;
                kcVar2.f(false);
                kcVar2.m2 = null;
                break;
        }
    }
}
