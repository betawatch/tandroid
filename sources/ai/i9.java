package ai;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;

    public /* synthetic */ i9(k9 k9Var, int i10) {
        this.a = i10;
        this.b = k9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
