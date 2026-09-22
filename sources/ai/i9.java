package ai;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
