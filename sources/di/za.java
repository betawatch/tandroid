package di;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                kcVar.f(1.0f, true, new ga(kcVar, 6));
                kcVar.b1.b(true, true);
                break;
            default:
                kc kcVar2 = this.b;
                kcVar2.e(false);
                kcVar2.m2 = null;
                break;
        }
    }
}
