package di;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qa(kc kcVar, boolean z10, int i10) {
        this.a = i10;
        this.b = kcVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                kc kcVar = this.b;
                if (!this.c) {
                    kcVar.J0.b(false, false);
                    break;
                } else {
                    kcVar.getClass();
                    break;
                }
            default:
                kc kcVar2 = this.b;
                kcVar2.R = null;
                kcVar2.e = false;
                kcVar2.p(this.c);
                break;
        }
    }
}
