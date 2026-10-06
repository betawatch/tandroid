package ai;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
